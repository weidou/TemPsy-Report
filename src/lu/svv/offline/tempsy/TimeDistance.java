/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.TimeDistance#getComparingOperator <em>Comparing Operator</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.TimeDistance#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getTimeDistance()
 * @model
 * @generated
 */
public interface TimeDistance extends EObject {
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
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getTimeDistance_ComparingOperator()
	 * @model
	 * @generated
	 */
	ComparingOperator getComparingOperator();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.TimeDistance#getComparingOperator <em>Comparing Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparing Operator</em>' attribute.
	 * @see lu.svv.offline.tempsy.ComparingOperator
	 * @see #getComparingOperator()
	 * @generated
	 */
	void setComparingOperator(ComparingOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getTimeDistance_Value()
	 * @model default="1"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.TimeDistance#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // TimeDistance
