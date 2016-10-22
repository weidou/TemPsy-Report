/**
 */
package lu.svv.offline.tempsy;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bi Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.BiScope#getBoundaryBegin <em>Boundary Begin</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.BiScope#getBoundaryEnd <em>Boundary End</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getBiScope()
 * @model
 * @generated
 */
public interface BiScope extends Scope {
	/**
	 * Returns the value of the '<em><b>Boundary Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Begin</em>' containment reference.
	 * @see #setBoundaryBegin(Boundary)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getBiScope_BoundaryBegin()
	 * @model containment="true"
	 * @generated
	 */
	Boundary getBoundaryBegin();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.BiScope#getBoundaryBegin <em>Boundary Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary Begin</em>' containment reference.
	 * @see #getBoundaryBegin()
	 * @generated
	 */
	void setBoundaryBegin(Boundary value);

	/**
	 * Returns the value of the '<em><b>Boundary End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary End</em>' containment reference.
	 * @see #setBoundaryEnd(Boundary)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getBiScope_BoundaryEnd()
	 * @model containment="true"
	 * @generated
	 */
	Boundary getBoundaryEnd();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.BiScope#getBoundaryEnd <em>Boundary End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary End</em>' containment reference.
	 * @see #getBoundaryEnd()
	 * @generated
	 */
	void setBoundaryEnd(Boundary value);

} // BiScope
