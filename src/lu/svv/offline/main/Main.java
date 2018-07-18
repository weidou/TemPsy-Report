package lu.svv.offline.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	private static long startTime, stopTime, elapsedTime;
	private static TraceReport tc = new TraceReport();
	private static double parseTime = 1379.52;// Average parsing time (in ms).
	private static int[] variousLengths = {100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000};
	private static int fixedLength = 1000000;
	private static int[] variousViolationNumbers = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
	private static int fixedViolationNumber = 1000;
	private static int[] indices = {1,2,3,4,5,6,7,8,9,10,11,12};

	public static void main(String[] args) throws Exception {
		tc.parseReportOCL();
		
		Map<Integer, List<String>> violationTypeMap = new HashMap<>();        
		List<String> _violationTypes = Arrays.asList("nsor", "wto");
		for(int i = 5; i <= 11; i++) {
			violationTypeMap.put(i, _violationTypes);
		}
		violationTypeMap.put(12, Arrays.asList("nsor"));
					 
		System.out.println("The time unit of all the numbers below is millisecond.");

		// Corresponds to Figure 3 in our MODELS 2018 paper.
		System.out.println("RQ1(fixed violation number : 1K, various lengths: 100K, 200K, ..., 1M):");
		for (int pIndex : indices) {
			List<String> violationTypes = violationTypeMap.get(pIndex);
			if (violationTypes != null) {
				for (String violationType : violationTypes) {
					answerRq1(pIndex, violationType);
				}
			} else {
				answerRq1(pIndex, null);
			}
		}
		
		System.out.println();
	
		// Corresponds to Figure 4 in our MODELS 2018 paper.
		System.out.println("\nRQ2(fixed trace length : 1M, various violation numbers: 1K, 2K, ..., 10K):");
		for (int pIndex : indices) {
			List<String> violationTypes = violationTypeMap.get(pIndex);
			if (violationTypes != null) {
				for (String violationType : violationTypes) {
					answerRq2(pIndex, violationType);
				}
			} else {
				answerRq2(pIndex, null);
			}
		}
	}
	
	public static void answerRq1(int pIndex, String violationType)
			throws Exception {
		String name = "p" + pIndex;
		System.out.println();
		if (violationType != null) {
				System.out.print(name + "." + violationType);
		} else {
			System.out.print(name);
		}
		for (int length : variousLengths) {
			experiment("rq1", name, length, fixedViolationNumber, violationType);
		}
	}

	public static void answerRq2(int pIndex, String violationType)
			throws Exception {
		String name = "p" + pIndex;
		System.out.println();
		if (violationType != null) {
				System.out.print(name + "." + violationType);
		} else {
			System.out.print(name);
		}
		for (int vn : variousViolationNumbers) {
			experiment("rq2", name, fixedLength, vn, violationType);
		}
	}
	
	public static void experiment(String rq, String name, int length, int vn, String vt) throws Exception {
		String traceName = rq + "_" + name + "_" + length + "_" + vn;
		if (vt != null) {
			traceName += "_" + vt;
		}
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			tc.loadMonitor("./inputs/properties/" + name + ".xmi", "./inputs/traces/" + traceName+ ".csv");
			tc.reportSingle();
		}
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.printf("\t%.2f", elapsedTime/100.0 + parseTime);
		tc.resetMonitor();
		System.gc();
	}

}
