/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.Scope;
import lu.svv.offline.tempsy.ScopeType;
import lu.svv.offline.tempsy.TemPsyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.ScopeImpl#getScopeType <em>Scope Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeImpl extends MinimalEObjectImpl.Container implements Scope {
	/**
	 * The default value of the '{@link #getScopeType() <em>Scope Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeType()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeType SCOPE_TYPE_EDEFAULT = ScopeType.GLOBALLY;

	/**
	 * The cached value of the '{@link #getScopeType() <em>Scope Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopeType()
	 * @generated
	 * @ordered
	 */
	protected ScopeType scopeType = SCOPE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType getScopeType() {
		return scopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScopeType(ScopeType newScopeType) {
		ScopeType oldScopeType = scopeType;
		scopeType = newScopeType == null ? SCOPE_TYPE_EDEFAULT : newScopeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.SCOPE__SCOPE_TYPE, oldScopeType, scopeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemPsyPackage.SCOPE__SCOPE_TYPE:
				return getScopeType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TemPsyPackage.SCOPE__SCOPE_TYPE:
				setScopeType((ScopeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TemPsyPackage.SCOPE__SCOPE_TYPE:
				setScopeType(SCOPE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TemPsyPackage.SCOPE__SCOPE_TYPE:
				return scopeType != SCOPE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scopeType: ");
		result.append(scopeType);
		result.append(')');
		return result.toString();
	}

} //ScopeImpl
