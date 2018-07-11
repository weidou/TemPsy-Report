#!/usr/bin/python
"""A trace generator producing a group of faulty traces comprised of
synthesized events

@author: Wei Dou
@date created: 17 August 2016
@date modified: 7 September 2016
@version: 1.0
@input: a TemPsy pattern
@output: a group of faulty traces

"""

from random import choice
from random import randrange
from random import sample
from bisect import insort
import sys, os, argparse, traceback


class PropertyFactory(object):

  # create pattern instances

  @staticmethod
  def create_pattern(pattern):
    pattern_items = pattern.split()
    pattern_type = pattern_items[0]
    if PatternKeywords.universality == pattern_type:
      # always 'event'
      return PropertyFactory.create_universality(pattern)
    elif PatternKeywords.existence == pattern_type:
      # eventually ['comparison_operator' n] 'event'
      return PropertyFactory.create_occurrences(PatternKeywords.existence,
                                                pattern)
    elif PatternKeywords.absence == pattern_type:
      # never [exactly n] 'event'
      return PropertyFactory.create_occurrences(PatternKeywords.absence,
                                                pattern)
    # 'block1' responding ['comparison_operator' n tu] 'block2'
    elif PatternKeywords.response in pattern_items:
      effect_cause = pattern.split(PatternKeywords.response)
      effects = effect_cause[0]
      causes = effect_cause[1]
      return PropertyFactory.create_sequence(PatternKeywords.response, causes,
                                             effects)
    # 'block1' preceding ['comparison_operator' n tu] 'block2'
    elif PatternKeywords.precedence in pattern_items:
      cause_effect = pattern.split(PatternKeywords.precedence)
      causes = cause_effect[0]
      effects = cause_effect[1]
      return PropertyFactory.create_sequence(PatternKeywords.precedence, causes,
                                             effects)
    else:
      print 'wrong pattern!!'
      traceback.print_exc()

  @staticmethod
  def create_universality(pattern):
    event = pattern.split().pop().lower()
    RandomTraceGenerator.register_event(event)
    return Universality(event)

  @staticmethod
  def create_occurrences(pt, pattern):
    pattern_items = pattern.split()
    event = pattern_items.pop().lower()
    RandomTraceGenerator.register_event(event)
    s = pattern_items.pop()
    if PropertyFactory.is_integer(s):
      times = int(s)
      comop = pattern_items.pop()
      if pt == PatternKeywords.existence:
        return Existence(event, comop, times)
      else:
        return Absence(event, comop, times)
    else:
      if pt == PatternKeywords.existence:
        return Existence(event)
      else:
        return Absence(event)

  @staticmethod
  def create_sequence(pt, causes, effects):
    effect_list = effects.split(',')
    cause_list = causes.split(',')
    events = []
    distances = []
    cause_size = 0
    for cause in cause_list:
      cause_size = cause_size + 1
      raw_event = cause.split()
      event = raw_event.pop().lower()
      RandomTraceGenerator.register_event(event)
      events.append(event)
      if raw_event:
        # pop tu
        raw_event.pop()
        # pop the value
        value = int(raw_event.pop())
        # pop 'least|most|exactly'
        comop = raw_event.pop()
        distances.append(Distance(comop.strip('#'), value))
      else:
        distances.append(None)
    if pt == PatternKeywords.response:
      distances.append(distances.pop(0))
    else:
      distances.pop(0)
    effectDistances = []
    for effect in effect_list:
      raw_event = effect.split()
      event = raw_event.pop().lower()
      RandomTraceGenerator.register_event(event)
      events.append(event)
      if raw_event:
        # pop tu
        raw_event.pop()
        # pop the value
        value = int(raw_event.pop())
        # pop 'least|most|exactly'
        comop = raw_event.pop()
        effectDistances.append(Distance(comop.strip('#'), value))
      else:
        effectDistances.append(None)
    if pt == PatternKeywords.response:
      effectDistances.pop(0)
    distances += effectDistances
    if pt == PatternKeywords.response:
      return Response(events, distances, cause_size)
    else:
      return Precedence(events, distances, cause_size)

  @staticmethod
  def is_integer(s):  # test whether string s is an integer
    try:
      int(s)
      return True
    except ValueError:
      return False


# trace generator
class RandomTraceGenerator(object):
  # various trace lengths : 100K -- 1M
  various_lengths = [100000, 200000, 300000, 400000, 500000, 600000, 700000,
                     800000, 900000, 1000000]
  # fixed trace length : 1M
  fixed_length = 1000000
  # various violation numbers
  various_vn = [1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000]
  # fixed violation numbers
  fixed_vn = 1000

  # mask event
  mask = 'c'
  # candidate events [a..z]
  candidate_events = list(map(chr, range(97, 123)))
  # the events register for each TemPsy property
  events_register = [mask]

  @staticmethod
  def register_event(event):
    if event != RandomTraceGenerator.mask:
      insort(RandomTraceGenerator.events_register, event)
    else:
      RandomTraceGenerator.mask = (
          set(RandomTraceGenerator.candidate_events) -
          set(RandomTraceGenerator.events_register)).pop()
      insort(RandomTraceGenerator.events_register, RandomTraceGenerator.mask)

  def __init__(self, property_id, pattern):
    self.property_id = property_id
    self.pattern = pattern
    self.timestamp = 0

  def generate_traces(self):
    # RQ1 : using a fixed number of violations
    for length in self.various_lengths:
      self.generate_trace(length, self.fixed_vn, 'rq1')
    # RQ2 : using a fixed trace length
    for vn in self.various_vn:
      self.generate_trace(self.fixed_length, vn, 'rq2')

  def generate_trace(self, length, vn, rq):
    try:
      # generate an event trace accorrding to the temporal pattern
      if self.pattern is not None:
        file_name = '%s_%s_%d_%d' % (rq, self.property_id, length, vn)
        # write the pattern in a global range
        self.generate_pattern(file_name, 1, length, vn)
        print 'Done!'
      else:
        print 'Please provide a correct pattern!!'
    except Exception:
      traceback.print_exc()
      self.f.close()
      self.bf.close()
      os.remove(self.output_file)
      os.remove(self.locations_file)
      sys.exit(1)

# generating events for patterns

  def generate_pattern(self, file_name, start, end, vn):
    try:
      if type(self.pattern) == Universality:
        self.write_occurrences(file_name, start, end, vn,
                               RandomTraceGenerator.mask, self.pattern.event)
      elif type(self.pattern) == Absence or type(self.pattern) == Existence:
        self.write_occurrences(file_name, start, end, vn, self.pattern.event,
                               RandomTraceGenerator.mask)
      else:
        segments = range(
            start, end + 2, (end - start + 1) /
            vn)  # use end+2 to add end+1 to segments. note that it is used
        self.write_sequence(file_name, segments, end - start + 1)
    except Exception:
      traceback.print_exc()

  def write_file_header(self, file_name, length, violation_type=None):
    if violation_type is not None:
      file_name += '_' + violation_type
    # trace output file
    self.output_file = os.path.join(os.getcwd(), file_name + '.csv')
    # trace events locations recording file
    self.locations_file = os.path.join(os.getcwd(),
                                       file_name + '.locations.txt')
    try:
      # open two output files
      self.f = open(self.output_file, 'w')
      self.bf = open(self.locations_file, 'w')
      print 'writing into file: "%s"\n...' % self.output_file
      # write trace file header
      self.f.writelines("event,timestamp\n")
      # write trace locations file header
      self.bf.writelines("length: %d\n" % length)
    except Exception as e:
      print 'Unable to write into file %s' % self.output_file
      traceback.print_exc()

  # fill *event* at each trace element
  def fill_event(self, start, end, event):
    i = start
    try:
      while i <= end:
        self.timestamp = self.timestamp + int(Distance.unit)
        self.f.writelines("%s,%d\n" % (event, self.timestamp))
        i += 1
      if start <= end:
        self.bf.writelines("%d-%d\t\t\t\t%s\n" % (start, end, event))
    except Exception:
      traceback.print_exc()

  def write_occurrences(self, file_name, start, end, vn, event, mask):
    try:
      self.write_file_header(file_name, end - start + 1)
      self.pattern.generate_locations(start, end, vn)
      i = start
      mark = i
      location_iter = iter(self.pattern.locations)
      try:
        j = next(location_iter)
      except StopIteration:
        j = end + 1
      while i <= end:
        self.timestamp = self.timestamp + int(Distance.unit)
        if i < j:
          self.f.writelines("%s,%d\n" % (mask, self.timestamp))
        else:
          self.f.writelines("%s,%d\n" % (event, self.timestamp))
          if mark <= i - 1:
            self.bf.writelines("%d-%d\t\t\t\t%s\n" % (mark, i - 1, mask))
          self.bf.writelines("%d\t\t\t\t\t%s\n" % (i, event))
          mark = i + 1
          try:
            j = next(location_iter)
          except StopIteration:
            j = end + 1
        i += 1
      if mark <= end:
        self.bf.writelines("%d-%d\t\t\t\t%s\n" % (mark, end, mask))
    except Exception:
      print 'Errors when writing into file %s' % self.output_file
      traceback.print_exc()

  def write_sequence(self, file_name, segments, length):
    violation_types = self.pattern.get_violation_types()
    try:
      for violation_type in violation_types:
        self.write_file_header(file_name, length, violation_type.lower())
        for i in range(0, len(segments) - 1):
          j = segments[i]
          k = segments[i + 1]
          self.pattern.generate_locations(j, k - 1, violation_type)
          self.write_sequence_segment(j, k - 1)
    except Exception:
      print 'Errors when writing into file %s' % self.output_file
      traceback.print_exc()

  def write_sequence_segment(self, start, end):
    try:
      i = start
      mark = i
      location_iter = iter(self.pattern.locations)
      distance_iter = iter(self.pattern.timestamp_distances)
      try:
        j = next(location_iter)
        d = next(distance_iter)
      except StopIteration:
        j = end + 1
      while i <= end:
        if i < j:
          self.timestamp = self.timestamp + int(Distance.unit)
          self.f.writelines("%s,%d\n" %
                            (RandomTraceGenerator.mask, self.timestamp))
        else:
          self.timestamp = self.timestamp + d
          self.f.writelines("%s,%d\n" %
                            (self.pattern.events_dict[i], self.timestamp))
          if mark <= i - 1:
            self.bf.writelines("%d-%d\t\t\t\t%s\n" %
                               (mark, i - 1, RandomTraceGenerator.mask))
          self.bf.writelines("%d(%d)\t\t\t\t\t%s\n" %
                             (i, self.timestamp, self.pattern.events_dict[i]))
          mark = i + 1
          try:
            j = next(location_iter)
            d = next(distance_iter)
          except StopIteration:
            j = end + 1
        i += 1
      if mark <= end:
        self.bf.writelines("%d-%d\t\t\t\t%s\n" %
                           (mark, end, RandomTraceGenerator.mask))
    except Exception:
      traceback.print_exc()


# enumeration
class SequenceViolationType(object):
  NSOR = 'NSOR'
  WTC = 'WTC'
  WTO = 'WTO'
  WTOC = 'WTOC'
  LVRI = 'LVRI'
  LIRV = 'LIRV'


# enumeration
class ComparisonOperator(object):
  at_least = 'least'
  at_most = 'most'
  exactly = 'exactly'


# auxiliary class for identifying patterns
class PatternKeywords(object):

  universality = 'always'
  existence = 'eventually'
  absence = 'never'
  response = 'responding'
  precedence = 'preceding'


# classes of patterns
class Universality(object):

  def __init__(self, event):
    self.event = event
    self.size = 0

  def generate_locations(self, start, end, vn):
    self.size = min(end - start + 1, vn)
    self.locations = sorted(sample(xrange(start, end + 1), self.size))


class Existence(object):

  def __init__(self, event, comop=None, times=1):
    self.comparison_operator = comop
    self.times = times
    self.event = event
    self.size = 0

  def generate_locations(self, start, end, vn):
    self.size = {
        ComparisonOperator.at_least: min(self.times - 1, vn),
        ComparisonOperator.at_most: max(self.times + 1, vn),
        ComparisonOperator.exactly: max(self.times + 1, vn),
    }.get(self.comparison_operator, 0)
    self.locations = sorted(sample(xrange(start, end + 1), self.size))


class Absence(object):

  def __init__(self, event, comop=None, times=0):
    self.comparison_operator = comop
    self.times = times
    self.event = event
    self.size = 0

  def generate_locations(self, start, end, vn):
    if self.comparison_operator is None:
      self.size = min(end - start + 1, vn)
    else:
      self.size = self.times
    if self.size:
      self.locations = sorted(sample(xrange(start, end + 1), self.size))


# precedence & response
class Sequence(object):

  def __init__(self, events, distances, cause_size):
    self.size = len(events)
    self.cause_size = cause_size
    self.effect_size = self.size - self.cause_size

    self.events = events
    self.cause_events = events[0:cause_size]
    self.effect_events = events[cause_size:self.size]

    self.distances = distances

    self.cause_distances = []
    self.effect_distances = []

    self.mid_distance = distances[cause_size - 1]
    if self.cause_size > 1:
      self.cause_distances = distances[0:self.cause_size - 1]
    if self.effect_size > 1:
      self.effect_distances = distances[self.cause_size:self.size - 1]

  def get_length(self):
    return self.size

  def check_WTC(self, block):
    return len(block) > 0 and len(
        filter(lambda x: x is not None and not x.is_at_least_one(), block)) > 0

  def has_WTO(self):
    return self.mid_distance is not None and not self.mid_distance.is_at_most_one(
    )

  def is_at_least(self):
    return self.mid_distance is not None and self.mid_distance.is_at_least()

  def is_at_most(self):
    return self.mid_distance is not None and self.mid_distance.is_at_most()

  def is_exactly(self):
    return self.mid_distance is not None and self.mid_distance.is_exactly()

  def generate_locations(self, start, end, violation_type):
    function_name = 'generate_' + violation_type + '_locations'
    function = getattr(self, function_name)
    return function(start, end)

  def generate_NSOR_locations(self, start, end, events, distances):
    self.locations = []
    self.timestamp_distances = []
    self.events_dict = {}

    length = len(events)
    location = randrange(start, end - length + 2)
    distance = randrange(0,
                         Distance.none_distance_extent + 1) * int(Distance.unit)
    self.generate_block(location, distance, events, distances, 'correct')

  def generate_WTO_locations(self, start, end):
    self.locations = []
    self.timestamp_distances = []
    self.events_dict = {}

    location1 = randrange(start, end - self.size + 2)
    distance1 = randrange(
        0, Distance.none_distance_extent + 1) * int(Distance.unit)
    previous_location = self.generate_block(location1, distance1,
                                            self.cause_events,
                                            self.cause_distances, 'correct')

    faulty_mid_distance = self.mid_distance.get_faulty_distance()

    gap = randrange(1, min(
        int(faulty_mid_distance / Distance.unit) + 1,
        end - previous_location - self.effect_size + 2))
    location2 = previous_location + gap
    distance2 = faulty_mid_distance - int((gap - 1) * Distance.unit)
    self.generate_block(location2, distance2, self.effect_events,
                        self.effect_distances, 'correct')

  def generate_block(self, first_location, first_distance, events, distances,
                     correctness):
    if first_location == 1:
      first_distance = 1
    self.locations.append(first_location)
    self.events_dict[first_location] = events[0]
    self.timestamp_distances.append(first_distance)

    i = 1
    location = first_location + 1
    length = len(events)
    while i < length:
      self.locations.append(location)
      self.events_dict[location] = events[i]
      d = distances[i - 1]
      if d is None:
        self.timestamp_distances.append(
            randrange(1, Distance.none_distance_extent + 1) *
            int(Distance.unit))
      else:
        self.timestamp_distances.append(d.get_distance(correctness))
      i += 1
      location += 1
    return self.locations[-1]

  def get_block_min_bound(self, distances, correctness):
    n = 0
    min_distances = map(lambda x: x.get_min_distance(correctness), distances)
    return reduce(lambda x, y: x + y, min_distances)


class Precedence(Sequence):

  def __init__(self, events, distances, cause_size):
    super(Precedence, self).__init__(events, distances, cause_size)

  def get_min_bound(self):
    n = 0
    if self.cause_size > 1:
      n += self.get_block_min_bound(cause_distances, 'faulty')
      n += self.mid_distance.get_faulty_min_distance()
    if self.effect_size > 1:
      n += self.get_block_min_bound(effect_distances, 'correct')
    return n

  def has_WTC(self):
    return self.check_WTC(self.cause_distances)

  def get_violation_types(self):
    if self.has_WTC():
      if self.has_WTO():
        if self.is_at_least():
          return [SequenceViolationType.NSOR, SequenceViolationType.WTO,
                  SequenceViolationType.WTC, SequenceViolationType.WTOC,
                  SequenceViolationType.LIRV]
        elif self.is_at_most():
          return [SequenceViolationType.NSOR, SequenceViolationType.WTO,
                  SequenceViolationType.WTC, SequenceViolationType.WTOC,
                  SequenceViolationType.LVRI]
        else:
          return [SequenceViolationType.NSOR, SequenceViolationType.WTO,
                  SequenceViolationType.WTC, SequenceViolationType.WTOC,
                  SequenceViolationType.LVRI, SequenceViolationType.LIRV]
      else:
        return [SequenceViolationType.NSOR, SequenceViolationType.WTC]
    else:
      if self.has_WTO():
        return [SequenceViolationType.NSOR, SequenceViolationType.WTO]
      else:
        return [SequenceViolationType.NSOR]

  def generate_NSOR_locations(self, start, end):
    super(Precedence, self).generate_NSOR_locations(start, end,
                                                    self.effect_events,
                                                    self.effect_distances)

  def generate_WTC_locations(self, start, end):
    pass


class Response(Sequence):

  def __init__(self, events, distances, cause_size):
    super(Response, self).__init__(events, distances, cause_size)

  def get_min_bound(self):
    n = 0
    if self.cause_size > 1:
      n += self.get_block_min_bound(cause_distances, 'correct')
    n += self.mid_distance.get_faulty_min_distance()
    if self.effect_size > 1:
      n += self.get_block_min_bound(effect_distances, 'faulty')
    return n

  def has_WTC(self):
    return self.check_WTC(self.effect_distances)

  def get_violation_types(self):
    if self.has_WTC():
      if self.has_WTO():
        if self.is_at_least():
          return [SequenceViolationType.NSOR, SequenceViolationType.WTO,
                  SequenceViolationType.WTC, SequenceViolationType.WTOC,
                  SequenceViolationType.LVRI]
        elif self.is_at_most():
          return [SequenceViolationType.NSOR, SequenceViolationType.WTO,
                  SequenceViolationType.WTC, SequenceViolationType.WTOC,
                  SequenceViolationType.LIRV]
        else:
          return [SequenceViolationType.NSOR, SequenceViolationType.WTO,
                  SequenceViolationType.WTC, SequenceViolationType.WTOC,
                  SequenceViolationType.LVRI, SequenceViolationType.LIRV]
      else:
        return [SequenceViolationType.NSOR, SequenceViolationType.WTC]
    else:
      if self.has_WTO():
        return [SequenceViolationType.NSOR, SequenceViolationType.WTO]
      else:
        return [SequenceViolationType.NSOR]

  def generate_NSOR_locations(self, start, end):
    super(Response, self).generate_NSOR_locations(start, end, self.cause_events,
                                                  self.cause_distances)


# class of time distance
class Distance(object):

  unit = 1.0  # one unit equals the distance between two consecutive events
  upper_extent = 0.1
  none_distance_extent = 10

  def __init__(self, comop, value):
    self.comparison_operator = comop
    self.value = value
    self.upper_bound = int(
        (1 + Distance.upper_extent) * value) + int(Distance.unit)

  def get_operator(self):
    return self.comparison_operator

  def get_distance_value(self):
    return self.value

  def is_at_least(self):
    return self.comparison_operator == ComparisonOperator.at_least

  def is_at_most(self):
    return self.comparison_operator == ComparisonOperator.at_most

  def is_exactly(self):
    return self.comparison_operator == ComparisonOperator.exactly

  def is_at_least_one(self):
    return self.comparison_operator == ComparisonOperator.at_least and self.value == int(
        Distance.unit)

  def is_at_most_one(self):
    return self.comparison_operator == ComparisonOperator.at_most and self.value == int(
        Distance.unit)

  def get_distance(self, correctness):
    function_name = 'get_' + correctness + '_distance'
    function = getattr(self, function_name)
    return function()

  def get_correct_distance(self):
    return {
        ComparisonOperator.at_least: randrange(self.value, self.upper_bound),
        ComparisonOperator.at_most: randrange(
            int(Distance.unit), self.value + 1),
        ComparisonOperator.exactly: self.value
    }[self.comparison_operator]

  def get_faulty_distance(self):
    return {
        ComparisonOperator.at_least: randrange(int(Distance.unit), self.value),
        ComparisonOperator.at_most: randrange(self.value + 1, self.upper_bound),
        ComparisonOperator.exactly: choice(
            range(int(Distance.unit), self.value) + range(self.value + 1,
                                                          self.upper_bound))
    }[self.comparison_operator]

  def get_min_distance(self, correctness):
    function_name = 'get_' + correctness + '_min_distance'
    function = getattr(self, function_name)
    return function()

  def get_correct_min_distance(self):
    return {
        ComparisonOperator.at_least: self.value,
        ComparisonOperator.at_most: int(Distance.unit),
        ComparisonOperator.exactly: self.value
    }[self.comparison_operator]

  def get_faulty_min_distance(self):
    min_value = int(Distance.unit)
    if self.comparison_operator == ComparisonOperator.exactly and self.value == int(
        Distance.unit):
      min_value = self.value + int(Distance.unit)
    return {
        ComparisonOperator.at_least: min(int(Distance.unit), self.value),
        ComparisonOperator.at_most: self.value + int(Distance.unit),
        ComparisonOperator.exactly: min_value
    }[self.comparison_operator]

# program entry
if __name__ == '__main__':
  cmdline = argparse.ArgumentParser(
      usage='trace_generator.py -i id -p pattern',
      description='Generate a set of faulty traces for the evaluation of scalability of our violation reporting approach.')
  cmdline.add_argument(
      '--id',
      '-i',
      action='store',
      help=r'Property id',
      dest='id',
      required=True)
  cmdline.add_argument(
      '--pattern',
      '-p',
      action='store',
      help=r'Pattern of the TemPsy property',
      dest='pattern',
      required=True)

  args = cmdline.parse_args()
  pattern = PropertyFactory.create_pattern(args.pattern)
  generator = RandomTraceGenerator(args.id, pattern)
  generator.generate_traces()
