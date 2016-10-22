/**
 */
package lu.svv.offline.tempsy.util;

import lu.svv.offline.tempsy.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lu.svv.offline.tempsy.TemPsyPackage
 * @generated
 */
public class TemPsySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TemPsyPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemPsySwitch() {
		if (modelPackage == null) {
			modelPackage = TemPsyPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TemPsyPackage.TEM_PSY_BLOCK: {
				TemPsyBlock temPsyBlock = (TemPsyBlock)theEObject;
				T result = caseTemPsyBlock(temPsyBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.TEM_PSY_EXPRESSION: {
				TemPsyExpression temPsyExpression = (TemPsyExpression)theEObject;
				T result = caseTemPsyExpression(temPsyExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.PATTERN: {
				Pattern pattern = (Pattern)theEObject;
				T result = casePattern(pattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.GLOBALLY: {
				Globally globally = (Globally)theEObject;
				T result = caseGlobally(globally);
				if (result == null) result = caseScope(globally);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.UNI_SCOPE: {
				UniScope uniScope = (UniScope)theEObject;
				T result = caseUniScope(uniScope);
				if (result == null) result = caseScope(uniScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.BI_SCOPE: {
				BiScope biScope = (BiScope)theEObject;
				T result = caseBiScope(biScope);
				if (result == null) result = caseScope(biScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.BOUNDARY: {
				Boundary boundary = (Boundary)theEObject;
				T result = caseBoundary(boundary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.UNIVERSALITY: {
				Universality universality = (Universality)theEObject;
				T result = caseUniversality(universality);
				if (result == null) result = casePattern(universality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.OCCURRENCE_PATTERN: {
				OccurrencePattern occurrencePattern = (OccurrencePattern)theEObject;
				T result = caseOccurrencePattern(occurrencePattern);
				if (result == null) result = casePattern(occurrencePattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.ORDER_PATTERN: {
				OrderPattern orderPattern = (OrderPattern)theEObject;
				T result = caseOrderPattern(orderPattern);
				if (result == null) result = casePattern(orderPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.EVENT_CHAIN_ELEMENT: {
				EventChainElement eventChainElement = (EventChainElement)theEObject;
				T result = caseEventChainElement(eventChainElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.EVENT_REPRESENTATION: {
				EventRepresentation eventRepresentation = (EventRepresentation)theEObject;
				T result = caseEventRepresentation(eventRepresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TemPsyPackage.TIME_DISTANCE: {
				TimeDistance timeDistance = (TimeDistance)theEObject;
				T result = caseTimeDistance(timeDistance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tem Psy Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tem Psy Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemPsyBlock(TemPsyBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tem Psy Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tem Psy Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemPsyExpression(TemPsyExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePattern(Pattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Globally</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Globally</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobally(Globally object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uni Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uni Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniScope(UniScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bi Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bi Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiScope(BiScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boundary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundary(Boundary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversality(Universality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrencePattern(OccurrencePattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderPattern(OrderPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Chain Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Chain Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventChainElement(EventChainElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Representation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Representation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventRepresentation(EventRepresentation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Distance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Distance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeDistance(TimeDistance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TempsySwitch
