/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.OrderPattern#getBlock1 <em>Block1</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.OrderPattern#getTimeDistance <em>Time Distance</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.OrderPattern#getBlock2 <em>Block2</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getOrderPattern()
 * @model
 * @generated
 */
public interface OrderPattern extends Pattern {
	/**
	 * Returns the value of the '<em><b>Block1</b></em>' containment reference list.
	 * The list contents are of type {@link lu.svv.offline.tempsy.EventChainElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block1</em>' containment reference list.
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getOrderPattern_Block1()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventChainElement> getBlock1();

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
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getOrderPattern_TimeDistance()
	 * @model containment="true"
	 * @generated
	 */
	TimeDistance getTimeDistance();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.OrderPattern#getTimeDistance <em>Time Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Distance</em>' containment reference.
	 * @see #getTimeDistance()
	 * @generated
	 */
	void setTimeDistance(TimeDistance value);

	/**
	 * Returns the value of the '<em><b>Block2</b></em>' containment reference list.
	 * The list contents are of type {@link lu.svv.offline.tempsy.EventChainElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block2</em>' containment reference list.
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getOrderPattern_Block2()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventChainElement> getBlock2();

} // OrderPattern
