/**
 */
package lu.svv.offline.check;

import lu.svv.offline.tempsy.TemPsyBlock;

import lu.svv.offline.trace.Trace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.check.Monitor#getTrace <em>Trace</em>}</li>
 *   <li>{@link lu.svv.offline.check.Monitor#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.check.CheckPackage#getMonitor()
 * @model
 * @generated
 */
public interface Monitor extends EObject {
	/**
	 * Returns the value of the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace</em>' reference.
	 * @see #setTrace(Trace)
	 * @see lu.svv.offline.check.CheckPackage#getMonitor_Trace()
	 * @model required="true"
	 * @generated
	 */
	Trace getTrace();

	/**
	 * Sets the value of the '{@link lu.svv.offline.check.Monitor#getTrace <em>Trace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trace</em>' reference.
	 * @see #getTrace()
	 * @generated
	 */
	void setTrace(Trace value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference.
	 * @see #setProperties(TemPsyBlock)
	 * @see lu.svv.offline.check.CheckPackage#getMonitor_Properties()
	 * @model required="true"
	 * @generated
	 */
	TemPsyBlock getProperties();

	/**
	 * Sets the value of the '{@link lu.svv.offline.check.Monitor#getProperties <em>Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(TemPsyBlock value);

} // Monitor
