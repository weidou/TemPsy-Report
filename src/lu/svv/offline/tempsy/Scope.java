/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.Scope#getScopeType <em>Scope Type</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lu.svv.offline.tempsy.ScopeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Type</em>' attribute.
	 * @see lu.svv.offline.tempsy.ScopeType
	 * @see #setScopeType(ScopeType)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getScope_ScopeType()
	 * @model
	 * @generated
	 */
	ScopeType getScopeType();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.Scope#getScopeType <em>Scope Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Type</em>' attribute.
	 * @see lu.svv.offline.tempsy.ScopeType
	 * @see #getScopeType()
	 * @generated
	 */
	void setScopeType(ScopeType value);

} // Scope
