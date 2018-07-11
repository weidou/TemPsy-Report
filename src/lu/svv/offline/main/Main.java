package lu.svv.offline.main;

public class Main {

	private static long startTime, stopTime, elapsedTime;
	private static TraceReport tc = new TraceReport();
	private static double parseTime = 1379.52;

	public static void main(String[] args) throws Exception {
		tc.parseReportOCL();
		int[] pGloballyIndexes = {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] variousLengths = {100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 1000000};
        int fixedLength = 1000000;
        int[] variousViolationNumbers = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        int fixedViolationNumber = 1000;
        String name;

        System.out.println("rq1(fixed violation number : 1K)");
        for (int pIndex : pGloballyIndexes) {
        	name = "p" + pIndex;
        	System.out.println();
        	System.out.print(name);
			for (int length : variousLengths) {
				experiment("rq1", name, length, fixedViolationNumber);
			}
        }

    	System.out.println();
        System.out.println("\nrq2(fixed trace length : 1M)");
        for (int pIndex : pGloballyIndexes) {
        	name = "p" + pIndex;
        	System.out.println();
        	System.out.print(name);
        	for (int vn : variousViolationNumbers) {
        		experiment("rq2", name, fixedLength, vn);
        	}
        }
	}

	public static void experiment(String rq, String name, int length, int vn) throws Exception {
		String traceName = rq + "_" + name + "_" + length + "_" + vn;
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 100; i++) {
			tc.loadMonitor("../lu.svv.offline/inputs/properties/" + name + ".xmi", "../lu.svv.offline/inputs/traces/" + traceName+ ".csv");
			tc.reportSingle();
		}
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.printf("\t%.2f", elapsedTime/100.0 + parseTime);
		tc.resetMonitor();
		System.gc();
	}

}
