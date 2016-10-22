/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.check.CheckPackage;

import lu.svv.offline.check.impl.CheckPackageImpl;

import lu.svv.offline.tempsy.BiScope;
import lu.svv.offline.tempsy.Boundary;
import lu.svv.offline.tempsy.ComparingOperator;
import lu.svv.offline.tempsy.EventChainElement;
import lu.svv.offline.tempsy.EventRepresentation;
import lu.svv.offline.tempsy.Globally;
import lu.svv.offline.tempsy.OccurrencePattern;
import lu.svv.offline.tempsy.OrderPattern;
import lu.svv.offline.tempsy.Pattern;
import lu.svv.offline.tempsy.PatternType;
import lu.svv.offline.tempsy.Scope;
import lu.svv.offline.tempsy.ScopeType;
import lu.svv.offline.tempsy.TemPsyBlock;
import lu.svv.offline.tempsy.TemPsyExpression;
import lu.svv.offline.tempsy.TemPsyFactory;
import lu.svv.offline.tempsy.TemPsyPackage;
import lu.svv.offline.tempsy.TimeDistance;
import lu.svv.offline.tempsy.UniScope;
import lu.svv.offline.tempsy.Universality;

import lu.svv.offline.trace.TracePackage;

import lu.svv.offline.trace.impl.TracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
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
public class TemPsyPackageImpl extends EPackageImpl implements TemPsyPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temPsyBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temPsyExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globallyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrencePatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventChainElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventRepresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeDistanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patternTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparingOperatorEEnum = null;

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
	 * @see lu.svv.offline.tempsy.TemPsyPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TemPsyPackageImpl() {
		super(eNS_URI, TemPsyFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TemPsyPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TemPsyPackage init() {
		if (isInited) return (TemPsyPackage)EPackage.Registry.INSTANCE.getEPackage(TemPsyPackage.eNS_URI);

		// Obtain or create and register package
		TemPsyPackageImpl theTempsyPackage = (TemPsyPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TemPsyPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TemPsyPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CheckPackageImpl theCheckPackage = (CheckPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CheckPackage.eNS_URI) instanceof CheckPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CheckPackage.eNS_URI) : CheckPackage.eINSTANCE);
		TracePackageImpl theTracePackage = (TracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) instanceof TracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI) : TracePackage.eINSTANCE);

		// Create package meta-data objects
		theTempsyPackage.createPackageContents();
		theCheckPackage.createPackageContents();
		theTracePackage.createPackageContents();

		// Initialize created meta-data
		theTempsyPackage.initializePackageContents();
		theCheckPackage.initializePackageContents();
		theTracePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTempsyPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TemPsyPackage.eNS_URI, theTempsyPackage);
		return theTempsyPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemPsyBlock() {
		return temPsyBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemPsyBlock_TemPsyExpressions() {
		return (EReference)temPsyBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemPsyExpression() {
		return temPsyExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemPsyExpression_Name() {
		return (EAttribute)temPsyExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemPsyExpression_Scope() {
		return (EReference)temPsyExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemPsyExpression_Pattern() {
		return (EReference)temPsyExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScope_ScopeType() {
		return (EAttribute)scopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPattern() {
		return patternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPattern_PatternType() {
		return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobally() {
		return globallyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniScope() {
		return uniScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniScope_Boundary() {
		return (EReference)uniScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiScope() {
		return biScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiScope_BoundaryBegin() {
		return (EReference)biScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiScope_BoundaryEnd() {
		return (EReference)biScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundary() {
		return boundaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundary_Ordinal() {
		return (EAttribute)boundaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundary_Event() {
		return (EReference)boundaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundary_TimeDistance() {
		return (EReference)boundaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniversality() {
		return universalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniversality_Event() {
		return (EReference)universalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrencePattern() {
		return occurrencePatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrencePattern_ComparingOperator() {
		return (EAttribute)occurrencePatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrencePattern_Times() {
		return (EAttribute)occurrencePatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrencePattern_Event() {
		return (EReference)occurrencePatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderPattern() {
		return orderPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderPattern_Block1() {
		return (EReference)orderPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderPattern_TimeDistance() {
		return (EReference)orderPatternEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderPattern_Block2() {
		return (EReference)orderPatternEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventChainElement() {
		return eventChainElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainElement_TimeDistance() {
		return (EReference)eventChainElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventChainElement_Event() {
		return (EReference)eventChainElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventRepresentation() {
		return eventRepresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventRepresentation_Name() {
		return (EAttribute)eventRepresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeDistance() {
		return timeDistanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDistance_ComparingOperator() {
		return (EAttribute)timeDistanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeDistance_Value() {
		return (EAttribute)timeDistanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScopeType() {
		return scopeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatternType() {
		return patternTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparingOperator() {
		return comparingOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemPsyFactory getTempsyFactory() {
		return (TemPsyFactory)getEFactoryInstance();
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
		temPsyBlockEClass = createEClass(TEM_PSY_BLOCK);
		createEReference(temPsyBlockEClass, TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS);

		temPsyExpressionEClass = createEClass(TEM_PSY_EXPRESSION);
		createEAttribute(temPsyExpressionEClass, TEM_PSY_EXPRESSION__NAME);
		createEReference(temPsyExpressionEClass, TEM_PSY_EXPRESSION__SCOPE);
		createEReference(temPsyExpressionEClass, TEM_PSY_EXPRESSION__PATTERN);

		scopeEClass = createEClass(SCOPE);
		createEAttribute(scopeEClass, SCOPE__SCOPE_TYPE);

		patternEClass = createEClass(PATTERN);
		createEAttribute(patternEClass, PATTERN__PATTERN_TYPE);

		globallyEClass = createEClass(GLOBALLY);

		uniScopeEClass = createEClass(UNI_SCOPE);
		createEReference(uniScopeEClass, UNI_SCOPE__BOUNDARY);

		biScopeEClass = createEClass(BI_SCOPE);
		createEReference(biScopeEClass, BI_SCOPE__BOUNDARY_BEGIN);
		createEReference(biScopeEClass, BI_SCOPE__BOUNDARY_END);

		boundaryEClass = createEClass(BOUNDARY);
		createEAttribute(boundaryEClass, BOUNDARY__ORDINAL);
		createEReference(boundaryEClass, BOUNDARY__EVENT);
		createEReference(boundaryEClass, BOUNDARY__TIME_DISTANCE);

		universalityEClass = createEClass(UNIVERSALITY);
		createEReference(universalityEClass, UNIVERSALITY__EVENT);

		occurrencePatternEClass = createEClass(OCCURRENCE_PATTERN);
		createEAttribute(occurrencePatternEClass, OCCURRENCE_PATTERN__COMPARING_OPERATOR);
		createEAttribute(occurrencePatternEClass, OCCURRENCE_PATTERN__TIMES);
		createEReference(occurrencePatternEClass, OCCURRENCE_PATTERN__EVENT);

		orderPatternEClass = createEClass(ORDER_PATTERN);
		createEReference(orderPatternEClass, ORDER_PATTERN__BLOCK1);
		createEReference(orderPatternEClass, ORDER_PATTERN__TIME_DISTANCE);
		createEReference(orderPatternEClass, ORDER_PATTERN__BLOCK2);

		eventChainElementEClass = createEClass(EVENT_CHAIN_ELEMENT);
		createEReference(eventChainElementEClass, EVENT_CHAIN_ELEMENT__TIME_DISTANCE);
		createEReference(eventChainElementEClass, EVENT_CHAIN_ELEMENT__EVENT);

		eventRepresentationEClass = createEClass(EVENT_REPRESENTATION);
		createEAttribute(eventRepresentationEClass, EVENT_REPRESENTATION__NAME);

		timeDistanceEClass = createEClass(TIME_DISTANCE);
		createEAttribute(timeDistanceEClass, TIME_DISTANCE__COMPARING_OPERATOR);
		createEAttribute(timeDistanceEClass, TIME_DISTANCE__VALUE);

		// Create enums
		scopeTypeEEnum = createEEnum(SCOPE_TYPE);
		patternTypeEEnum = createEEnum(PATTERN_TYPE);
		comparingOperatorEEnum = createEEnum(COMPARING_OPERATOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		globallyEClass.getESuperTypes().add(this.getScope());
		uniScopeEClass.getESuperTypes().add(this.getScope());
		biScopeEClass.getESuperTypes().add(this.getScope());
		universalityEClass.getESuperTypes().add(this.getPattern());
		occurrencePatternEClass.getESuperTypes().add(this.getPattern());
		orderPatternEClass.getESuperTypes().add(this.getPattern());

		// Initialize classes, features, and operations; add parameters
		initEClass(temPsyBlockEClass, TemPsyBlock.class, "TemPsyBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemPsyBlock_TemPsyExpressions(), this.getTemPsyExpression(), null, "temPsyExpressions", null, 0, -1, TemPsyBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temPsyExpressionEClass, TemPsyExpression.class, "TemPsyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemPsyExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemPsyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemPsyExpression_Scope(), this.getScope(), null, "scope", null, 0, 1, TemPsyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemPsyExpression_Pattern(), this.getPattern(), null, "pattern", null, 0, 1, TemPsyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScope_ScopeType(), this.getScopeType(), "scopeType", null, 0, 1, Scope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPattern_PatternType(), this.getPatternType(), "patternType", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globallyEClass, Globally.class, "Globally", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniScopeEClass, UniScope.class, "UniScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniScope_Boundary(), this.getBoundary(), null, "boundary", null, 0, 1, UniScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(biScopeEClass, BiScope.class, "BiScope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBiScope_BoundaryBegin(), this.getBoundary(), null, "boundaryBegin", null, 0, 1, BiScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBiScope_BoundaryEnd(), this.getBoundary(), null, "boundaryEnd", null, 0, 1, BiScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundaryEClass, Boundary.class, "Boundary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundary_Ordinal(), ecorePackage.getEInt(), "ordinal", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundary_Event(), this.getEventRepresentation(), null, "event", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundary_TimeDistance(), this.getTimeDistance(), null, "timeDistance", null, 0, 1, Boundary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalityEClass, Universality.class, "Universality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversality_Event(), this.getEventRepresentation(), null, "event", null, 0, 1, Universality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occurrencePatternEClass, OccurrencePattern.class, "OccurrencePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccurrencePattern_ComparingOperator(), this.getComparingOperator(), "comparingOperator", null, 0, 1, OccurrencePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOccurrencePattern_Times(), ecorePackage.getEInt(), "times", "1", 0, 1, OccurrencePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOccurrencePattern_Event(), this.getEventRepresentation(), null, "event", null, 0, 1, OccurrencePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderPatternEClass, OrderPattern.class, "OrderPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderPattern_Block1(), this.getEventChainElement(), null, "block1", null, 0, -1, OrderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPattern_TimeDistance(), this.getTimeDistance(), null, "timeDistance", null, 0, 1, OrderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderPattern_Block2(), this.getEventChainElement(), null, "block2", null, 0, -1, OrderPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventChainElementEClass, EventChainElement.class, "EventChainElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventChainElement_TimeDistance(), this.getTimeDistance(), null, "timeDistance", null, 0, 1, EventChainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventChainElement_Event(), this.getEventRepresentation(), null, "event", null, 0, 1, EventChainElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventRepresentationEClass, EventRepresentation.class, "EventRepresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventRepresentation_Name(), ecorePackage.getEString(), "name", null, 0, 1, EventRepresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeDistanceEClass, TimeDistance.class, "TimeDistance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeDistance_ComparingOperator(), this.getComparingOperator(), "comparingOperator", null, 0, 1, TimeDistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeDistance_Value(), ecorePackage.getEInt(), "value", "1", 0, 1, TimeDistance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scopeTypeEEnum, ScopeType.class, "ScopeType");
		addEEnumLiteral(scopeTypeEEnum, ScopeType.GLOBALLY);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.BEFORE);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.AFTER);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.BETWEENAND);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.AFTERUNTIL);

		initEEnum(patternTypeEEnum, PatternType.class, "PatternType");
		addEEnumLiteral(patternTypeEEnum, PatternType.UNIVERSALITY);
		addEEnumLiteral(patternTypeEEnum, PatternType.EXISTENCE);
		addEEnumLiteral(patternTypeEEnum, PatternType.ABSENCE);
		addEEnumLiteral(patternTypeEEnum, PatternType.PRECEDENCE);
		addEEnumLiteral(patternTypeEEnum, PatternType.RESPONSE);

		initEEnum(comparingOperatorEEnum, ComparingOperator.class, "ComparingOperator");
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.ATLEAST);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.ATMOST);
		addEEnumLiteral(comparingOperatorEEnum, ComparingOperator.EXACTLY);

		// Create resource
		createResource(eNS_URI);
	}

} //TempsyPackageImpl
