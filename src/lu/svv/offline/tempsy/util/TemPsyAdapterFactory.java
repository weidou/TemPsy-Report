/**
 */
package lu.svv.offline.tempsy.util;

import lu.svv.offline.tempsy.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lu.svv.offline.tempsy.TemPsyPackage
 * @generated
 */
public class TemPsyAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TemPsyPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemPsyAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TemPsyPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemPsySwitch<Adapter> modelSwitch =
		new TemPsySwitch<Adapter>() {
			@Override
			public Adapter caseTemPsyBlock(TemPsyBlock object) {
				return createTemPsyBlockAdapter();
			}
			@Override
			public Adapter caseTemPsyExpression(TemPsyExpression object) {
				return createTemPsyExpressionAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseGlobally(Globally object) {
				return createGloballyAdapter();
			}
			@Override
			public Adapter caseUniScope(UniScope object) {
				return createUniScopeAdapter();
			}
			@Override
			public Adapter caseBiScope(BiScope object) {
				return createBiScopeAdapter();
			}
			@Override
			public Adapter caseBoundary(Boundary object) {
				return createBoundaryAdapter();
			}
			@Override
			public Adapter caseUniversality(Universality object) {
				return createUniversalityAdapter();
			}
			@Override
			public Adapter caseOccurrencePattern(OccurrencePattern object) {
				return createOccurrencePatternAdapter();
			}
			@Override
			public Adapter caseOrderPattern(OrderPattern object) {
				return createOrderPatternAdapter();
			}
			@Override
			public Adapter caseEventChainElement(EventChainElement object) {
				return createEventChainElementAdapter();
			}
			@Override
			public Adapter caseEventRepresentation(EventRepresentation object) {
				return createEventRepresentationAdapter();
			}
			@Override
			public Adapter caseTimeDistance(TimeDistance object) {
				return createTimeDistanceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.TemPsyBlock <em>Tem Psy Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.TemPsyBlock
	 * @generated
	 */
	public Adapter createTemPsyBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.TemPsyExpression <em>Tem Psy Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.TemPsyExpression
	 * @generated
	 */
	public Adapter createTemPsyExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.Globally <em>Globally</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.Globally
	 * @generated
	 */
	public Adapter createGloballyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.UniScope <em>Uni Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.UniScope
	 * @generated
	 */
	public Adapter createUniScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.BiScope <em>Bi Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.BiScope
	 * @generated
	 */
	public Adapter createBiScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.Boundary <em>Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.Boundary
	 * @generated
	 */
	public Adapter createBoundaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.Universality <em>Universality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.Universality
	 * @generated
	 */
	public Adapter createUniversalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.OccurrencePattern <em>Occurrence Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.OccurrencePattern
	 * @generated
	 */
	public Adapter createOccurrencePatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.OrderPattern <em>Order Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.OrderPattern
	 * @generated
	 */
	public Adapter createOrderPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.EventChainElement <em>Event Chain Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.EventChainElement
	 * @generated
	 */
	public Adapter createEventChainElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.EventRepresentation <em>Event Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.EventRepresentation
	 * @generated
	 */
	public Adapter createEventRepresentationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.svv.offline.tempsy.TimeDistance <em>Time Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.svv.offline.tempsy.TimeDistance
	 * @generated
	 */
	public Adapter createTimeDistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TempsyAdapterFactory
