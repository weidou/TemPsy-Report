/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TemPsyFactoryImpl extends EFactoryImpl implements TemPsyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TemPsyFactory init() {
		try {
			TemPsyFactory theTempsyFactory = (TemPsyFactory)EPackage.Registry.INSTANCE.getEFactory(TemPsyPackage.eNS_URI);
			if (theTempsyFactory != null) {
				return theTempsyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TemPsyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemPsyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TemPsyPackage.TEM_PSY_BLOCK: return createTemPsyBlock();
			case TemPsyPackage.TEM_PSY_EXPRESSION: return createTemPsyExpression();
			case TemPsyPackage.SCOPE: return createScope();
			case TemPsyPackage.PATTERN: return createPattern();
			case TemPsyPackage.GLOBALLY: return createGlobally();
			case TemPsyPackage.UNI_SCOPE: return createUniScope();
			case TemPsyPackage.BI_SCOPE: return createBiScope();
			case TemPsyPackage.BOUNDARY: return createBoundary();
			case TemPsyPackage.UNIVERSALITY: return createUniversality();
			case TemPsyPackage.OCCURRENCE_PATTERN: return createOccurrencePattern();
			case TemPsyPackage.ORDER_PATTERN: return createOrderPattern();
			case TemPsyPackage.EVENT_CHAIN_ELEMENT: return createEventChainElement();
			case TemPsyPackage.EVENT_REPRESENTATION: return createEventRepresentation();
			case TemPsyPackage.TIME_DISTANCE: return createTimeDistance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TemPsyPackage.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case TemPsyPackage.PATTERN_TYPE:
				return createPatternTypeFromString(eDataType, initialValue);
			case TemPsyPackage.COMPARING_OPERATOR:
				return createComparingOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TemPsyPackage.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case TemPsyPackage.PATTERN_TYPE:
				return convertPatternTypeToString(eDataType, instanceValue);
			case TemPsyPackage.COMPARING_OPERATOR:
				return convertComparingOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemPsyBlock createTemPsyBlock() {
		TemPsyBlockImpl temPsyBlock = new TemPsyBlockImpl();
		return temPsyBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemPsyExpression createTemPsyExpression() {
		TemPsyExpressionImpl temPsyExpression = new TemPsyExpressionImpl();
		return temPsyExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Globally createGlobally() {
		GloballyImpl globally = new GloballyImpl();
		return globally;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniScope createUniScope() {
		UniScopeImpl uniScope = new UniScopeImpl();
		return uniScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiScope createBiScope() {
		BiScopeImpl biScope = new BiScopeImpl();
		return biScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary createBoundary() {
		BoundaryImpl boundary = new BoundaryImpl();
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Universality createUniversality() {
		UniversalityImpl universality = new UniversalityImpl();
		return universality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrencePattern createOccurrencePattern() {
		OccurrencePatternImpl occurrencePattern = new OccurrencePatternImpl();
		return occurrencePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderPattern createOrderPattern() {
		OrderPatternImpl orderPattern = new OrderPatternImpl();
		return orderPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventChainElement createEventChainElement() {
		EventChainElementImpl eventChainElement = new EventChainElementImpl();
		return eventChainElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRepresentation createEventRepresentation() {
		EventRepresentationImpl eventRepresentation = new EventRepresentationImpl();
		return eventRepresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDistance createTimeDistance() {
		TimeDistanceImpl timeDistance = new TimeDistanceImpl();
		return timeDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternType createPatternTypeFromString(EDataType eDataType, String initialValue) {
		PatternType result = PatternType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatternTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparingOperator createComparingOperatorFromString(EDataType eDataType, String initialValue) {
		ComparingOperator result = ComparingOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparingOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemPsyPackage getTempsyPackage() {
		return (TemPsyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TemPsyPackage getPackage() {
		return TemPsyPackage.eINSTANCE;
	}

} //TempsyFactoryImpl
