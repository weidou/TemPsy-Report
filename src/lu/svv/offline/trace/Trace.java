/**
 */
package lu.svv.offline.trace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.trace.Trace#getTraceElements <em>Trace Elements</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.trace.TracePackage#getTrace()
 * @model
 * @generated
 */
public interface Trace extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace Elements</b></em>' containment reference list.
	 * The list contents are of type {@link lu.svv.offline.trace.TraceElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Elements</em>' containment reference list.
	 * @see lu.svv.offline.trace.TracePackage#getTrace_TraceElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceElement> getTraceElements();

} // Trace
