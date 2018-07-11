#!/bin/bash
./trace_generator.py -p 'always A' -i p1
./trace_generator.py -p 'never B' -i p2
./trace_generator.py -p 'eventually at least 2 A' -i p3
./trace_generator.py -p 'eventually at most 3 A' -i p4
./trace_generator.py -p 'A responding at most 1000 tu B' -i p5
./trace_generator.py -p 'A responding exactly 1000 tu B' -i p6
./trace_generator.py -p 'A preceding at most 6000 tu B' -i p7
./trace_generator.py -p 'A preceding at least 100 tu B' -i p8
./trace_generator.py -p 'A preceding exactly 100 tu B' -i p9
./trace_generator.py -p 'A, B preceding at least 1000 tu C, D' -i p10
./trace_generator.py -p 'A responding at least 1000 tu B, C' -i p11
./trace_generator.py -p 'A responding B' -i p12
