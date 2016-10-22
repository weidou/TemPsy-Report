/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Chain Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.EventChainElement#getTimeDistance <em>Time Distance</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.EventChainElement#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getEventChainElement()
 * @model
 * @generated
 */
public interface EventChainElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Time Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Distance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Distance</em>' containment reference.
	 * @see #setTimeDistance(TimeDistance)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getEventChainElement_TimeDistance()
	 * @model containment="true"
	 * @generated
	 */
	TimeDistance getTimeDistance();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.EventChainElement#getTimeDistance <em>Time Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Distance</em>' containment reference.
	 * @see #getTimeDistance()
	 * @generated
	 */
	void setTimeDistance(TimeDistance value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(EventRepresentation)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getEventChainElement_Event()
	 * @model containment="true"
	 * @generated
	 */
	EventRepresentation getEvent();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.EventChainElement#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventRepresentation value);

} // EventChainElement
