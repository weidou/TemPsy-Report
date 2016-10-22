/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tem Psy Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.TemPsyBlock#getTemPsyExpressions <em>Tem Psy Expressions</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getTemPsyBlock()
 * @model
 * @generated
 */
public interface TemPsyBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Tem Psy Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link lu.svv.offline.tempsy.TemPsyExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tem Psy Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tem Psy Expressions</em>' containment reference list.
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getTemPsyBlock_TemPsyExpressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemPsyExpression> getTemPsyExpressions();

} // TemPsyBlock
