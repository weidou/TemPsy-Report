/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.Boundary;
import lu.svv.offline.tempsy.TemPsyPackage;
import lu.svv.offline.tempsy.UniScope;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uni Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.UniScopeImpl#getBoundary <em>Boundary</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniScopeImpl extends ScopeImpl implements UniScope {
	/**
	 * The cached value of the '{@link #getBoundary() <em>Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundary()
	 * @generated
	 * @ordered
	 */
	protected Boundary boundary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.UNI_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary getBoundary() {
		return boundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundary(Boundary newBoundary, NotificationChain msgs) {
		Boundary oldBoundary = boundary;
		boundary = newBoundary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemPsyPackage.UNI_SCOPE__BOUNDARY, oldBoundary, newBoundary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundary(Boundary newBoundary) {
		if (newBoundary != boundary) {
			NotificationChain msgs = null;
			if (boundary != null)
				msgs = ((InternalEObject)boundary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.UNI_SCOPE__BOUNDARY, null, msgs);
			if (newBoundary != null)
				msgs = ((InternalEObject)newBoundary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.UNI_SCOPE__BOUNDARY, null, msgs);
			msgs = basicSetBoundary(newBoundary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.UNI_SCOPE__BOUNDARY, newBoundary, newBoundary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemPsyPackage.UNI_SCOPE__BOUNDARY:
				return basicSetBoundary(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemPsyPackage.UNI_SCOPE__BOUNDARY:
				return getBoundary();
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
			case TemPsyPackage.UNI_SCOPE__BOUNDARY:
				setBoundary((Boundary)newValue);
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
			case TemPsyPackage.UNI_SCOPE__BOUNDARY:
				setBoundary((Boundary)null);
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
			case TemPsyPackage.UNI_SCOPE__BOUNDARY:
				return boundary != null;
		}
		return super.eIsSet(featureID);
	}

} //UniScopeImpl
