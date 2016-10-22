/**
 */
package lu.svv.offline.tempsy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Universality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.Universality#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getUniversality()
 * @model
 * @generated
 */
public interface Universality extends Pattern {
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
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getUniversality_Event()
	 * @model containment="true"
	 * @generated
	 */
	EventRepresentation getEvent();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.Universality#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventRepresentation value);

} // Universality
