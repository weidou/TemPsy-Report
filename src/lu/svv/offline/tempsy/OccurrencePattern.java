/**
 */
package lu.svv.offline.tempsy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.OccurrencePattern#getComparingOperator <em>Comparing Operator</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.OccurrencePattern#getTimes <em>Times</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.OccurrencePattern#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getOccurrencePattern()
 * @model
 * @generated
 */
public interface OccurrencePattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Comparing Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link lu.svv.offline.tempsy.ComparingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparing Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparing Operator</em>' attribute.
	 * @see lu.svv.offline.tempsy.ComparingOperator
	 * @see #setComparingOperator(ComparingOperator)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getOccurrencePattern_ComparingOperator()
	 * @model
	 * @generated
	 */
	ComparingOperator getComparingOperator();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.OccurrencePattern#getComparingOperator <em>Comparing Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparing Operator</em>' attribute.
	 * @see lu.svv.offline.tempsy.ComparingOperator
	 * @see #getComparingOperator()
	 * @generated
	 */
	void setComparingOperator(ComparingOperator value);

	/**
	 * Returns the value of the '<em><b>Times</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Times</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Times</em>' attribute.
	 * @see #setTimes(int)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getOccurrencePattern_Times()
	 * @model default="1"
	 * @generated
	 */
	int getTimes();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.OccurrencePattern#getTimes <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Times</em>' attribute.
	 * @see #getTimes()
	 * @generated
	 */
	void setTimes(int value);

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
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getOccurrencePattern_Event()
	 * @model containment="true"
	 * @generated
	 */
	EventRepresentation getEvent();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.OccurrencePattern#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(EventRepresentation value);

} // OccurrencePattern
