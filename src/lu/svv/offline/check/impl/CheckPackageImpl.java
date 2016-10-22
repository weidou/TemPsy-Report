/**
 */
package lu.svv.offline.check.impl;

import lu.svv.offline.check.CheckFactory;
import lu.svv.offline.check.CheckPackage;
import lu.svv.offline.check.Monitor;

import lu.svv.offline.check.ViolationType;
import lu.svv.offline.tempsy.TemPsyPackage;

import lu.svv.offline.tempsy.impl.TemPsyPackageImpl;

import lu.svv.offline.trace.TracePackage;

import lu.svv.offline.trace.impl.TracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckPackageImpl extends EPackageImpl implements CheckPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum violationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lu.svv.offline.check.CheckPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CheckPackageImpl() {
		super(eNS_URI, CheckFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CheckPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CheckPackage init() {
		if (isInited) return (CheckPackage)EPackage.Registry.INSTANCE.getEPackage(CheckPackage.eNS_URI);

		// Obtain or create and register package
		CheckPackageImpl theCheckPackage = (CheckPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CheckPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CheckPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) : TracePackage.eINSTANCE);
		TemPsyPackageImpl theTempsyPackage = (TemPsyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemPsyPackage.eNS_URI) instanceof TemPsyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemPsyPackage.eNS_URI) : TemPsyPackage.eINSTANCE);

		// Create package meta-data objects
		theCheckPackage.createPackageContents();
		theTracePackage.createPackageContents();
		theTempsyPackage.createPackageContents();

		// Initialize created meta-data
		theCheckPackage.initializePackageContents();
		theTracePackage.initializePackageContents();
		theTempsyPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCheckPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CheckPackage.eNS_URI, theCheckPackage);
		return theCheckPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitor() {
		return monitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Trace() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitor_Properties() {
		return (EReference)monitorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getViolationType() {
		return violationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckFactory getCheckFactory() {
		return (CheckFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		monitorEClass = createEClass(MONITOR);
		createEReference(monitorEClass, MONITOR__TRACE);
		createEReference(monitorEClass, MONITOR__PROPERTIES);

		// Create enums
		violationTypeEEnum = createEEnum(VIOLATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		TemPsyPackage theTempsyPackage = (TemPsyPackage)EPackage.Registry.INSTANCE.getEPackage(TemPsyPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(monitorEClass, Monitor.class, "Monitor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonitor_Trace(), theTracePackage.getTrace(), null, "trace", null, 1, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonitor_Properties(), theTempsyPackage.getTemPsyBlock(), null, "properties", null, 1, 1, Monitor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(violationTypeEEnum, ViolationType.class, "ViolationType");
		addEEnumLiteral(violationTypeEEnum, ViolationType.NSOC);
		addEEnumLiteral(violationTypeEEnum, ViolationType.UNOC);
		addEEnumLiteral(violationTypeEEnum, ViolationType.NSOR);
		addEEnumLiteral(violationTypeEEnum, ViolationType.WTC);
		addEEnumLiteral(violationTypeEEnum, ViolationType.WTO);
		addEEnumLiteral(violationTypeEEnum, ViolationType.WTOC);
		addEEnumLiteral(violationTypeEEnum, ViolationType.LVRI);
		addEEnumLiteral(violationTypeEEnum, ViolationType.LIRV);
		addEEnumLiteral(violationTypeEEnum, ViolationType.LIRI);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore#/",
			 "tempsy", "tempsy.ecore#/",
			 "trace", "trace.ecore#/"
		   });
	}

} //CheckPackageImpl
