/**
 */
package lu.svv.offline.tempsy.impl;

import java.util.Collection;

import lu.svv.offline.tempsy.EventChainElement;
import lu.svv.offline.tempsy.OrderPattern;
import lu.svv.offline.tempsy.TemPsyPackage;
import lu.svv.offline.tempsy.TimeDistance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.OrderPatternImpl#getBlock1 <em>Block1</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.impl.OrderPatternImpl#getTimeDistance <em>Time Distance</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.impl.OrderPatternImpl#getBlock2 <em>Block2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderPatternImpl extends PatternImpl implements OrderPattern {
	/**
	 * The cached value of the '{@link #getBlock1() <em>Block1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock1()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChainElement> block1;

	/**
	 * The cached value of the '{@link #getTimeDistance() <em>Time Distance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDistance()
	 * @generated
	 * @ordered
	 */
	protected TimeDistance timeDistance;

	/**
	 * The cached value of the '{@link #getBlock2() <em>Block2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock2()
	 * @generated
	 * @ordered
	 */
	protected EList<EventChainElement> block2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.ORDER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChainElement> getBlock1() {
		if (block1 == null) {
			block1 = new EObjectContainmentEList<EventChainElement>(EventChainElement.class, this, TemPsyPackage.ORDER_PATTERN__BLOCK1);
		}
		return block1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDistance getTimeDistance() {
		return timeDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeDistance(TimeDistance newTimeDistance, NotificationChain msgs) {
		TimeDistance oldTimeDistance = timeDistance;
		timeDistance = newTimeDistance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE, oldTimeDistance, newTimeDistance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDistance(TimeDistance newTimeDistance) {
		if (newTimeDistance != timeDistance) {
			NotificationChain msgs = null;
			if (timeDistance != null)
				msgs = ((InternalEObject)timeDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE, null, msgs);
			if (newTimeDistance != null)
				msgs = ((InternalEObject)newTimeDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE, null, msgs);
			msgs = basicSetTimeDistance(newTimeDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE, newTimeDistance, newTimeDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventChainElement> getBlock2() {
		if (block2 == null) {
			block2 = new EObjectContainmentEList<EventChainElement>(EventChainElement.class, this, TemPsyPackage.ORDER_PATTERN__BLOCK2);
		}
		return block2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemPsyPackage.ORDER_PATTERN__BLOCK1:
				return ((InternalEList<?>)getBlock1()).basicRemove(otherEnd, msgs);
			case TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE:
				return basicSetTimeDistance(null, msgs);
			case TemPsyPackage.ORDER_PATTERN__BLOCK2:
				return ((InternalEList<?>)getBlock2()).basicRemove(otherEnd, msgs);
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
			case TemPsyPackage.ORDER_PATTERN__BLOCK1:
				return getBlock1();
			case TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE:
				return getTimeDistance();
			case TemPsyPackage.ORDER_PATTERN__BLOCK2:
				return getBlock2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TemPsyPackage.ORDER_PATTERN__BLOCK1:
				getBlock1().clear();
				getBlock1().addAll((Collection<? extends EventChainElement>)newValue);
				return;
			case TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE:
				setTimeDistance((TimeDistance)newValue);
				return;
			case TemPsyPackage.ORDER_PATTERN__BLOCK2:
				getBlock2().clear();
				getBlock2().addAll((Collection<? extends EventChainElement>)newValue);
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
			case TemPsyPackage.ORDER_PATTERN__BLOCK1:
				getBlock1().clear();
				return;
			case TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE:
				setTimeDistance((TimeDistance)null);
				return;
			case TemPsyPackage.ORDER_PATTERN__BLOCK2:
				getBlock2().clear();
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
			case TemPsyPackage.ORDER_PATTERN__BLOCK1:
				return block1 != null && !block1.isEmpty();
			case TemPsyPackage.ORDER_PATTERN__TIME_DISTANCE:
				return timeDistance != null;
			case TemPsyPackage.ORDER_PATTERN__BLOCK2:
				return block2 != null && !block2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OrderPatternImpl
