/**
 */
package lu.svv.offline.trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.trace.TraceElement#getEvent <em>Event</em>}</li>
 *   <li>{@link lu.svv.offline.trace.TraceElement#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.trace.TracePackage#getTraceElement()
 * @model
 * @generated
 */
public interface TraceElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' attribute.
	 * @see #setEvent(String)
	 * @see lu.svv.offline.trace.TracePackage#getTraceElement_Event()
	 * @model required="true"
	 * @generated
	 */
	String getEvent();

	/**
	 * Sets the value of the '{@link lu.svv.offline.trace.TraceElement#getEvent <em>Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' attribute.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(int)
	 * @see lu.svv.offline.trace.TracePackage#getTraceElement_Timestamp()
	 * @model required="true"
	 * @generated
	 */
	int getTimestamp();

	/**
	 * Sets the value of the '{@link lu.svv.offline.trace.TraceElement#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(int value);

} // TraceElement
