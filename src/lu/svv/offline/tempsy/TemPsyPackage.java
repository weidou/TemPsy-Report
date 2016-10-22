/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lu.svv.offline.tempsy.TemPsyFactory
 * @model kind="package"
 * @generated
 */
public interface TemPsyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tempsy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.svv.lu/offline/TemPsy";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TemPsy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemPsyPackage eINSTANCE = lu.svv.offline.tempsy.impl.TemPsyPackageImpl.init();

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.TemPsyBlockImpl <em>Tem Psy Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.TemPsyBlockImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getTemPsyBlock()
	 * @generated
	 */
	int TEM_PSY_BLOCK = 0;

	/**
	 * The feature id for the '<em><b>Tem Psy Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Tem Psy Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tem Psy Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_BLOCK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.TemPsyExpressionImpl <em>Tem Psy Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.TemPsyExpressionImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getTemPsyExpression()
	 * @generated
	 */
	int TEM_PSY_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_EXPRESSION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_EXPRESSION__SCOPE = 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_EXPRESSION__PATTERN = 2;

	/**
	 * The number of structural features of the '<em>Tem Psy Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tem Psy Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEM_PSY_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.ScopeImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 2;

	/**
	 * The feature id for the '<em><b>Scope Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__SCOPE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.PatternImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Pattern Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN__PATTERN_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.GloballyImpl <em>Globally</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.GloballyImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getGlobally()
	 * @generated
	 */
	int GLOBALLY = 4;

	/**
	 * The feature id for the '<em><b>Scope Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALLY__SCOPE_TYPE = SCOPE__SCOPE_TYPE;

	/**
	 * The number of structural features of the '<em>Globally</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALLY_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Globally</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBALLY_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.UniScopeImpl <em>Uni Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.UniScopeImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getUniScope()
	 * @generated
	 */
	int UNI_SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Scope Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_SCOPE__SCOPE_TYPE = SCOPE__SCOPE_TYPE;

	/**
	 * The feature id for the '<em><b>Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_SCOPE__BOUNDARY = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Uni Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Uni Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNI_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.BiScopeImpl <em>Bi Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.BiScopeImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getBiScope()
	 * @generated
	 */
	int BI_SCOPE = 6;

	/**
	 * The feature id for the '<em><b>Scope Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_SCOPE__SCOPE_TYPE = SCOPE__SCOPE_TYPE;

	/**
	 * The feature id for the '<em><b>Boundary Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_SCOPE__BOUNDARY_BEGIN = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Boundary End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_SCOPE__BOUNDARY_END = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bi Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bi Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BI_SCOPE_OPERATION_COUNT = SCOPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.BoundaryImpl <em>Boundary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.BoundaryImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getBoundary()
	 * @generated
	 */
	int BOUNDARY = 7;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__ORDINAL = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__EVENT = 1;

	/**
	 * The feature id for the '<em><b>Time Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY__TIME_DISTANCE = 2;

	/**
	 * The number of structural features of the '<em>Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Boundary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.UniversalityImpl <em>Universality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.UniversalityImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getUniversality()
	 * @generated
	 */
	int UNIVERSALITY = 8;

	/**
	 * The feature id for the '<em><b>Pattern Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__PATTERN_TYPE = PATTERN__PATTERN_TYPE;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__EVENT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Universality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Universality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.OccurrencePatternImpl <em>Occurrence Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.OccurrencePatternImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getOccurrencePattern()
	 * @generated
	 */
	int OCCURRENCE_PATTERN = 9;

	/**
	 * The feature id for the '<em><b>Pattern Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PATTERN__PATTERN_TYPE = PATTERN__PATTERN_TYPE;

	/**
	 * The feature id for the '<em><b>Comparing Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PATTERN__COMPARING_OPERATOR = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Times</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PATTERN__TIMES = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PATTERN__EVENT = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Occurrence Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Occurrence Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.OrderPatternImpl <em>Order Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.OrderPatternImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getOrderPattern()
	 * @generated
	 */
	int ORDER_PATTERN = 10;

	/**
	 * The feature id for the '<em><b>Pattern Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PATTERN__PATTERN_TYPE = PATTERN__PATTERN_TYPE;

	/**
	 * The feature id for the '<em><b>Block1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PATTERN__BLOCK1 = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PATTERN__TIME_DISTANCE = PATTERN_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PATTERN__BLOCK2 = PATTERN_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Order Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Order Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_PATTERN_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.EventChainElementImpl <em>Event Chain Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.EventChainElementImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getEventChainElement()
	 * @generated
	 */
	int EVENT_CHAIN_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Time Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT__TIME_DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT__EVENT = 1;

	/**
	 * The number of structural features of the '<em>Event Chain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Event Chain Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CHAIN_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.EventRepresentationImpl <em>Event Representation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.EventRepresentationImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getEventRepresentation()
	 * @generated
	 */
	int EVENT_REPRESENTATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REPRESENTATION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REPRESENTATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Event Representation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_REPRESENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.impl.TimeDistanceImpl <em>Time Distance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.impl.TimeDistanceImpl
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getTimeDistance()
	 * @generated
	 */
	int TIME_DISTANCE = 13;

	/**
	 * The feature id for the '<em><b>Comparing Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DISTANCE__COMPARING_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DISTANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Time Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DISTANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Distance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_DISTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.ScopeType <em>Scope Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.ScopeType
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getScopeType()
	 * @generated
	 */
	int SCOPE_TYPE = 14;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.PatternType <em>Pattern Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.PatternType
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getPatternType()
	 * @generated
	 */
	int PATTERN_TYPE = 15;

	/**
	 * The meta object id for the '{@link lu.svv.offline.tempsy.ComparingOperator <em>Comparing Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.tempsy.ComparingOperator
	 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getComparingOperator()
	 * @generated
	 */
	int COMPARING_OPERATOR = 16;


	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.TemPsyBlock <em>Tem Psy Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tem Psy Block</em>'.
	 * @see lu.svv.offline.tempsy.TemPsyBlock
	 * @generated
	 */
	EClass getTemPsyBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.svv.offline.tempsy.TemPsyBlock#getTemPsyExpressions <em>Tem Psy Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tem Psy Expressions</em>'.
	 * @see lu.svv.offline.tempsy.TemPsyBlock#getTemPsyExpressions()
	 * @see #getTemPsyBlock()
	 * @generated
	 */
	EReference getTemPsyBlock_TemPsyExpressions();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.TemPsyExpression <em>Tem Psy Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tem Psy Expression</em>'.
	 * @see lu.svv.offline.tempsy.TemPsyExpression
	 * @generated
	 */
	EClass getTemPsyExpression();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.TemPsyExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.svv.offline.tempsy.TemPsyExpression#getName()
	 * @see #getTemPsyExpression()
	 * @generated
	 */
	EAttribute getTemPsyExpression_Name();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.TemPsyExpression#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scope</em>'.
	 * @see lu.svv.offline.tempsy.TemPsyExpression#getScope()
	 * @see #getTemPsyExpression()
	 * @generated
	 */
	EReference getTemPsyExpression_Scope();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.TemPsyExpression#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see lu.svv.offline.tempsy.TemPsyExpression#getPattern()
	 * @see #getTemPsyExpression()
	 * @generated
	 */
	EReference getTemPsyExpression_Pattern();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see lu.svv.offline.tempsy.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.Scope#getScopeType <em>Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope Type</em>'.
	 * @see lu.svv.offline.tempsy.Scope#getScopeType()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_ScopeType();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see lu.svv.offline.tempsy.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.Pattern#getPatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern Type</em>'.
	 * @see lu.svv.offline.tempsy.Pattern#getPatternType()
	 * @see #getPattern()
	 * @generated
	 */
	EAttribute getPattern_PatternType();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.Globally <em>Globally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Globally</em>'.
	 * @see lu.svv.offline.tempsy.Globally
	 * @generated
	 */
	EClass getGlobally();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.UniScope <em>Uni Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uni Scope</em>'.
	 * @see lu.svv.offline.tempsy.UniScope
	 * @generated
	 */
	EClass getUniScope();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.UniScope#getBoundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary</em>'.
	 * @see lu.svv.offline.tempsy.UniScope#getBoundary()
	 * @see #getUniScope()
	 * @generated
	 */
	EReference getUniScope_Boundary();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.BiScope <em>Bi Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bi Scope</em>'.
	 * @see lu.svv.offline.tempsy.BiScope
	 * @generated
	 */
	EClass getBiScope();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.BiScope#getBoundaryBegin <em>Boundary Begin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary Begin</em>'.
	 * @see lu.svv.offline.tempsy.BiScope#getBoundaryBegin()
	 * @see #getBiScope()
	 * @generated
	 */
	EReference getBiScope_BoundaryBegin();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.BiScope#getBoundaryEnd <em>Boundary End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Boundary End</em>'.
	 * @see lu.svv.offline.tempsy.BiScope#getBoundaryEnd()
	 * @see #getBiScope()
	 * @generated
	 */
	EReference getBiScope_BoundaryEnd();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.Boundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boundary</em>'.
	 * @see lu.svv.offline.tempsy.Boundary
	 * @generated
	 */
	EClass getBoundary();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.Boundary#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see lu.svv.offline.tempsy.Boundary#getOrdinal()
	 * @see #getBoundary()
	 * @generated
	 */
	EAttribute getBoundary_Ordinal();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.Boundary#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see lu.svv.offline.tempsy.Boundary#getEvent()
	 * @see #getBoundary()
	 * @generated
	 */
	EReference getBoundary_Event();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.Boundary#getTimeDistance <em>Time Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Distance</em>'.
	 * @see lu.svv.offline.tempsy.Boundary#getTimeDistance()
	 * @see #getBoundary()
	 * @generated
	 */
	EReference getBoundary_TimeDistance();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.Universality <em>Universality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality</em>'.
	 * @see lu.svv.offline.tempsy.Universality
	 * @generated
	 */
	EClass getUniversality();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.Universality#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see lu.svv.offline.tempsy.Universality#getEvent()
	 * @see #getUniversality()
	 * @generated
	 */
	EReference getUniversality_Event();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.OccurrencePattern <em>Occurrence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence Pattern</em>'.
	 * @see lu.svv.offline.tempsy.OccurrencePattern
	 * @generated
	 */
	EClass getOccurrencePattern();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.OccurrencePattern#getComparingOperator <em>Comparing Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparing Operator</em>'.
	 * @see lu.svv.offline.tempsy.OccurrencePattern#getComparingOperator()
	 * @see #getOccurrencePattern()
	 * @generated
	 */
	EAttribute getOccurrencePattern_ComparingOperator();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.OccurrencePattern#getTimes <em>Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Times</em>'.
	 * @see lu.svv.offline.tempsy.OccurrencePattern#getTimes()
	 * @see #getOccurrencePattern()
	 * @generated
	 */
	EAttribute getOccurrencePattern_Times();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.OccurrencePattern#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see lu.svv.offline.tempsy.OccurrencePattern#getEvent()
	 * @see #getOccurrencePattern()
	 * @generated
	 */
	EReference getOccurrencePattern_Event();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.OrderPattern <em>Order Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Pattern</em>'.
	 * @see lu.svv.offline.tempsy.OrderPattern
	 * @generated
	 */
	EClass getOrderPattern();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.svv.offline.tempsy.OrderPattern#getBlock1 <em>Block1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block1</em>'.
	 * @see lu.svv.offline.tempsy.OrderPattern#getBlock1()
	 * @see #getOrderPattern()
	 * @generated
	 */
	EReference getOrderPattern_Block1();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.OrderPattern#getTimeDistance <em>Time Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Distance</em>'.
	 * @see lu.svv.offline.tempsy.OrderPattern#getTimeDistance()
	 * @see #getOrderPattern()
	 * @generated
	 */
	EReference getOrderPattern_TimeDistance();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.svv.offline.tempsy.OrderPattern#getBlock2 <em>Block2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block2</em>'.
	 * @see lu.svv.offline.tempsy.OrderPattern#getBlock2()
	 * @see #getOrderPattern()
	 * @generated
	 */
	EReference getOrderPattern_Block2();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.EventChainElement <em>Event Chain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Chain Element</em>'.
	 * @see lu.svv.offline.tempsy.EventChainElement
	 * @generated
	 */
	EClass getEventChainElement();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.EventChainElement#getTimeDistance <em>Time Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time Distance</em>'.
	 * @see lu.svv.offline.tempsy.EventChainElement#getTimeDistance()
	 * @see #getEventChainElement()
	 * @generated
	 */
	EReference getEventChainElement_TimeDistance();

	/**
	 * Returns the meta object for the containment reference '{@link lu.svv.offline.tempsy.EventChainElement#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see lu.svv.offline.tempsy.EventChainElement#getEvent()
	 * @see #getEventChainElement()
	 * @generated
	 */
	EReference getEventChainElement_Event();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.EventRepresentation <em>Event Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Representation</em>'.
	 * @see lu.svv.offline.tempsy.EventRepresentation
	 * @generated
	 */
	EClass getEventRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.EventRepresentation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.svv.offline.tempsy.EventRepresentation#getName()
	 * @see #getEventRepresentation()
	 * @generated
	 */
	EAttribute getEventRepresentation_Name();

	/**
	 * Returns the meta object for class '{@link lu.svv.offline.tempsy.TimeDistance <em>Time Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Distance</em>'.
	 * @see lu.svv.offline.tempsy.TimeDistance
	 * @generated
	 */
	EClass getTimeDistance();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.TimeDistance#getComparingOperator <em>Comparing Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparing Operator</em>'.
	 * @see lu.svv.offline.tempsy.TimeDistance#getComparingOperator()
	 * @see #getTimeDistance()
	 * @generated
	 */
	EAttribute getTimeDistance_ComparingOperator();

	/**
	 * Returns the meta object for the attribute '{@link lu.svv.offline.tempsy.TimeDistance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see lu.svv.offline.tempsy.TimeDistance#getValue()
	 * @see #getTimeDistance()
	 * @generated
	 */
	EAttribute getTimeDistance_Value();

	/**
	 * Returns the meta object for enum '{@link lu.svv.offline.tempsy.ScopeType <em>Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Type</em>'.
	 * @see lu.svv.offline.tempsy.ScopeType
	 * @generated
	 */
	EEnum getScopeType();

	/**
	 * Returns the meta object for enum '{@link lu.svv.offline.tempsy.PatternType <em>Pattern Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pattern Type</em>'.
	 * @see lu.svv.offline.tempsy.PatternType
	 * @generated
	 */
	EEnum getPatternType();

	/**
	 * Returns the meta object for enum '{@link lu.svv.offline.tempsy.ComparingOperator <em>Comparing Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparing Operator</em>'.
	 * @see lu.svv.offline.tempsy.ComparingOperator
	 * @generated
	 */
	EEnum getComparingOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TemPsyFactory getTempsyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.TemPsyBlockImpl <em>Tem Psy Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.TemPsyBlockImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getTemPsyBlock()
		 * @generated
		 */
		EClass TEM_PSY_BLOCK = eINSTANCE.getTemPsyBlock();

		/**
		 * The meta object literal for the '<em><b>Tem Psy Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS = eINSTANCE.getTemPsyBlock_TemPsyExpressions();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.TemPsyExpressionImpl <em>Tem Psy Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.TemPsyExpressionImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getTemPsyExpression()
		 * @generated
		 */
		EClass TEM_PSY_EXPRESSION = eINSTANCE.getTemPsyExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEM_PSY_EXPRESSION__NAME = eINSTANCE.getTemPsyExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEM_PSY_EXPRESSION__SCOPE = eINSTANCE.getTemPsyExpression_Scope();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEM_PSY_EXPRESSION__PATTERN = eINSTANCE.getTemPsyExpression_Pattern();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.ScopeImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Scope Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__SCOPE_TYPE = eINSTANCE.getScope_ScopeType();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.PatternImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '<em><b>Pattern Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATTERN__PATTERN_TYPE = eINSTANCE.getPattern_PatternType();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.GloballyImpl <em>Globally</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.GloballyImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getGlobally()
		 * @generated
		 */
		EClass GLOBALLY = eINSTANCE.getGlobally();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.UniScopeImpl <em>Uni Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.UniScopeImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getUniScope()
		 * @generated
		 */
		EClass UNI_SCOPE = eINSTANCE.getUniScope();

		/**
		 * The meta object literal for the '<em><b>Boundary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNI_SCOPE__BOUNDARY = eINSTANCE.getUniScope_Boundary();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.BiScopeImpl <em>Bi Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.BiScopeImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getBiScope()
		 * @generated
		 */
		EClass BI_SCOPE = eINSTANCE.getBiScope();

		/**
		 * The meta object literal for the '<em><b>Boundary Begin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_SCOPE__BOUNDARY_BEGIN = eINSTANCE.getBiScope_BoundaryBegin();

		/**
		 * The meta object literal for the '<em><b>Boundary End</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BI_SCOPE__BOUNDARY_END = eINSTANCE.getBiScope_BoundaryEnd();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.BoundaryImpl <em>Boundary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.BoundaryImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getBoundary()
		 * @generated
		 */
		EClass BOUNDARY = eINSTANCE.getBoundary();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDARY__ORDINAL = eINSTANCE.getBoundary_Ordinal();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY__EVENT = eINSTANCE.getBoundary_Event();

		/**
		 * The meta object literal for the '<em><b>Time Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDARY__TIME_DISTANCE = eINSTANCE.getBoundary_TimeDistance();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.UniversalityImpl <em>Universality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.UniversalityImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getUniversality()
		 * @generated
		 */
		EClass UNIVERSALITY = eINSTANCE.getUniversality();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSALITY__EVENT = eINSTANCE.getUniversality_Event();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.OccurrencePatternImpl <em>Occurrence Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.OccurrencePatternImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getOccurrencePattern()
		 * @generated
		 */
		EClass OCCURRENCE_PATTERN = eINSTANCE.getOccurrencePattern();

		/**
		 * The meta object literal for the '<em><b>Comparing Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE_PATTERN__COMPARING_OPERATOR = eINSTANCE.getOccurrencePattern_ComparingOperator();

		/**
		 * The meta object literal for the '<em><b>Times</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE_PATTERN__TIMES = eINSTANCE.getOccurrencePattern_Times();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE_PATTERN__EVENT = eINSTANCE.getOccurrencePattern_Event();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.OrderPatternImpl <em>Order Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.OrderPatternImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getOrderPattern()
		 * @generated
		 */
		EClass ORDER_PATTERN = eINSTANCE.getOrderPattern();

		/**
		 * The meta object literal for the '<em><b>Block1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PATTERN__BLOCK1 = eINSTANCE.getOrderPattern_Block1();

		/**
		 * The meta object literal for the '<em><b>Time Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PATTERN__TIME_DISTANCE = eINSTANCE.getOrderPattern_TimeDistance();

		/**
		 * The meta object literal for the '<em><b>Block2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_PATTERN__BLOCK2 = eINSTANCE.getOrderPattern_Block2();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.EventChainElementImpl <em>Event Chain Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.EventChainElementImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getEventChainElement()
		 * @generated
		 */
		EClass EVENT_CHAIN_ELEMENT = eINSTANCE.getEventChainElement();

		/**
		 * The meta object literal for the '<em><b>Time Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN_ELEMENT__TIME_DISTANCE = eINSTANCE.getEventChainElement_TimeDistance();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CHAIN_ELEMENT__EVENT = eINSTANCE.getEventChainElement_Event();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.EventRepresentationImpl <em>Event Representation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.EventRepresentationImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getEventRepresentation()
		 * @generated
		 */
		EClass EVENT_REPRESENTATION = eINSTANCE.getEventRepresentation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_REPRESENTATION__NAME = eINSTANCE.getEventRepresentation_Name();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.impl.TimeDistanceImpl <em>Time Distance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.impl.TimeDistanceImpl
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getTimeDistance()
		 * @generated
		 */
		EClass TIME_DISTANCE = eINSTANCE.getTimeDistance();

		/**
		 * The meta object literal for the '<em><b>Comparing Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DISTANCE__COMPARING_OPERATOR = eINSTANCE.getTimeDistance_ComparingOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_DISTANCE__VALUE = eINSTANCE.getTimeDistance_Value();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.ScopeType <em>Scope Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.ScopeType
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getScopeType()
		 * @generated
		 */
		EEnum SCOPE_TYPE = eINSTANCE.getScopeType();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.PatternType <em>Pattern Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.PatternType
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getPatternType()
		 * @generated
		 */
		EEnum PATTERN_TYPE = eINSTANCE.getPatternType();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.tempsy.ComparingOperator <em>Comparing Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.tempsy.ComparingOperator
		 * @see lu.svv.offline.tempsy.impl.TemPsyPackageImpl#getComparingOperator()
		 * @generated
		 */
		EEnum COMPARING_OPERATOR = eINSTANCE.getComparingOperator();

	}

} //TempsyPackage
