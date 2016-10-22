/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.BiScope;
import lu.svv.offline.tempsy.Boundary;
import lu.svv.offline.tempsy.TemPsyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bi Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.BiScopeImpl#getBoundaryBegin <em>Boundary Begin</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.impl.BiScopeImpl#getBoundaryEnd <em>Boundary End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BiScopeImpl extends ScopeImpl implements BiScope {
	/**
	 * The cached value of the '{@link #getBoundaryBegin() <em>Boundary Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryBegin()
	 * @generated
	 * @ordered
	 */
	protected Boundary boundaryBegin;

	/**
	 * The cached value of the '{@link #getBoundaryEnd() <em>Boundary End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaryEnd()
	 * @generated
	 * @ordered
	 */
	protected Boundary boundaryEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.BI_SCOPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary getBoundaryBegin() {
		return boundaryBegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryBegin(Boundary newBoundaryBegin, NotificationChain msgs) {
		Boundary oldBoundaryBegin = boundaryBegin;
		boundaryBegin = newBoundaryBegin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN, oldBoundaryBegin, newBoundaryBegin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundaryBegin(Boundary newBoundaryBegin) {
		if (newBoundaryBegin != boundaryBegin) {
			NotificationChain msgs = null;
			if (boundaryBegin != null)
				msgs = ((InternalEObject)boundaryBegin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN, null, msgs);
			if (newBoundaryBegin != null)
				msgs = ((InternalEObject)newBoundaryBegin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN, null, msgs);
			msgs = basicSetBoundaryBegin(newBoundaryBegin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN, newBoundaryBegin, newBoundaryBegin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boundary getBoundaryEnd() {
		return boundaryEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoundaryEnd(Boundary newBoundaryEnd, NotificationChain msgs) {
		Boundary oldBoundaryEnd = boundaryEnd;
		boundaryEnd = newBoundaryEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemPsyPackage.BI_SCOPE__BOUNDARY_END, oldBoundaryEnd, newBoundaryEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundaryEnd(Boundary newBoundaryEnd) {
		if (newBoundaryEnd != boundaryEnd) {
			NotificationChain msgs = null;
			if (boundaryEnd != null)
				msgs = ((InternalEObject)boundaryEnd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.BI_SCOPE__BOUNDARY_END, null, msgs);
			if (newBoundaryEnd != null)
				msgs = ((InternalEObject)newBoundaryEnd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.BI_SCOPE__BOUNDARY_END, null, msgs);
			msgs = basicSetBoundaryEnd(newBoundaryEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.BI_SCOPE__BOUNDARY_END, newBoundaryEnd, newBoundaryEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN:
				return basicSetBoundaryBegin(null, msgs);
			case TemPsyPackage.BI_SCOPE__BOUNDARY_END:
				return basicSetBoundaryEnd(null, msgs);
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
			case TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN:
				return getBoundaryBegin();
			case TemPsyPackage.BI_SCOPE__BOUNDARY_END:
				return getBoundaryEnd();
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
			case TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN:
				setBoundaryBegin((Boundary)newValue);
				return;
			case TemPsyPackage.BI_SCOPE__BOUNDARY_END:
				setBoundaryEnd((Boundary)newValue);
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
			case TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN:
				setBoundaryBegin((Boundary)null);
				return;
			case TemPsyPackage.BI_SCOPE__BOUNDARY_END:
				setBoundaryEnd((Boundary)null);
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
			case TemPsyPackage.BI_SCOPE__BOUNDARY_BEGIN:
				return boundaryBegin != null;
			case TemPsyPackage.BI_SCOPE__BOUNDARY_END:
				return boundaryEnd != null;
		}
		return super.eIsSet(featureID);
	}

} //BiScopeImpl
