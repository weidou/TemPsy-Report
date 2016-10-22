/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.Boundary#getOrdinal <em>Ordinal</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.Boundary#getEvent <em>Event</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.Boundary#getTimeDistance <em>Time Distance</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getBoundary()
 * @model
 * @generated
 */
public interface Boundary extends EObject {
	/**
	 * Returns the value of the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordinal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordinal</em>' attribute.
	 * @see #setOrdinal(int)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getBoundary_Ordinal()
	 * @model
	 * @generated
	 */
	int getOrdinal();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.Boundary#getOrdinal <em>Ordinal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordinal</em>' attribute.
	 * @see #getOrdinal()
	 * @generated
	 */
	void setOrdinal(int value);

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
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getBoundary_Event()
	 * @model containment="true"
	 * @generated
	 */
	EventRepresentation getEvent();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.Boundary#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventRepresentation value);

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
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getBoundary_TimeDistance()
	 * @model containment="true"
	 * @generated
	 */
	TimeDistance getTimeDistance();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.Boundary#getTimeDistance <em>Time Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Distance</em>' containment reference.
	 * @see #getTimeDistance()
	 * @generated
	 */
	void setTimeDistance(TimeDistance value);

} // Boundary
