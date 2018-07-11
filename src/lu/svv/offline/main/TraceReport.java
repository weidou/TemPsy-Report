package lu.svv.offline.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import lu.svv.offline.check.CheckPackage;
import lu.svv.offline.check.Monitor;
import lu.svv.offline.check.impl.CheckFactoryImpl;
import lu.svv.offline.tempsy.TemPsyBlock;
import lu.svv.offline.tempsy.TemPsyPackage;
import lu.svv.offline.trace.Trace;
import lu.svv.offline.trace.TracePackage;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageRegistryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.OCLInput;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.helper.OCLHelper;

public class TraceReport {
	private Monitor monitor;
	public static final String reportFunctionsFile = "lib/tempsy-report.ocl";
	private OCL<EPackage, EClassifier, ?, ?, ?, ?, ?, ?, ?, Constraint, ?, ?> ocl;
	private OCLHelper<EClassifier, ?, ?, Constraint> oclHelper;
	private ResourceLoader temPsyLoader;
	private ResourceLoader traceLoader;

	// load XMI instances of TemPsy properties and trace instances
	public void loadMonitor(String tempsyFilePath, String traceFilePath) {
		temPsyLoader = XmiTemPsyLoader.init();
		TemPsyBlock properties = (TemPsyBlock) temPsyLoader.load(tempsyFilePath);

		traceLoader = CsvTraceLoader.init();
		Trace trace = (Trace) traceLoader.load(traceFilePath);
		
		if (properties != null && trace != null) {
			Monitor monitor = new CheckFactoryImpl().createMonitor();
			monitor.setProperties(properties);
			monitor.setTrace(trace);
			this.monitor = monitor;
		}
	}
	
	public void resetMonitor() {
		this.monitor = null;
	}
	
	public void parseReportOCL() {
		// Copied from org.eclipse.ocl.ecore.tests.DocumentationExamples.java
		EPackage.Registry registry = new EPackageRegistryImpl();
		registry.put(CheckPackage.eNS_URI, CheckPackage.eINSTANCE);
		registry.put(TemPsyPackage.eNS_URI, TemPsyPackage.eINSTANCE);
		registry.put(TracePackage.eNS_URI, TracePackage.eINSTANCE);
		EcoreEnvironmentFactory environmentFactory = new EcoreEnvironmentFactory(registry);
		ocl = OCL.newInstance(environmentFactory);

		// get an OCL text file via some hypothetical API
		InputStream in = null;
		try {
			// parse the contents as an OCL document
			in = new FileInputStream(reportFunctionsFile);
			in.skip(191);
			ocl.parse(new OCLInput(in));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ParserException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		    try {
		    	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		oclHelper = ocl.createOCLHelper();
		oclHelper.setContext(CheckPackage.Literals.MONITOR);
	}

	public void reportSingle() throws Exception {
		ocl.evaluate(this.monitor, oclHelper.createQuery(ConstraintFactory.init().createQuery(this.monitor.getProperties().getTemPsyExpressions().get(0))));
	}
}
