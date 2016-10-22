/**
 */
package lu.svv.offline.tempsy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uni Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.UniScope#getBoundary <em>Boundary</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getUniScope()
 * @model
 * @generated
 */
public interface UniScope extends Scope {
	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary</em>' containment reference.
	 * @see #setBoundary(Boundary)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getUniScope_Boundary()
	 * @model containment="true"
	 * @generated
	 */
	Boundary getBoundary();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.UniScope#getBoundary <em>Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' containment reference.
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(Boundary value);

} // UniScope
