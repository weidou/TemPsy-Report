/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.EventChainElement;
import lu.svv.offline.tempsy.EventRepresentation;
import lu.svv.offline.tempsy.TemPsyPackage;
import lu.svv.offline.tempsy.TimeDistance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Chain Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.EventChainElementImpl#getTimeDistance <em>Time Distance</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.impl.EventChainElementImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventChainElementImpl extends MinimalEObjectImpl.Container implements EventChainElement {
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
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected EventRepresentation event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventChainElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.EVENT_CHAIN_ELEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE, oldTimeDistance, newTimeDistance);
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
				msgs = ((InternalEObject)timeDistance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE, null, msgs);
			if (newTimeDistance != null)
				msgs = ((InternalEObject)newTimeDistance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE, null, msgs);
			msgs = basicSetTimeDistance(newTimeDistance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE, newTimeDistance, newTimeDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventRepresentation getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(EventRepresentation newEvent, NotificationChain msgs) {
		EventRepresentation oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(EventRepresentation newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE:
				return basicSetTimeDistance(null, msgs);
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT:
				return basicSetEvent(null, msgs);
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
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE:
				return getTimeDistance();
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT:
				return getEvent();
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
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE:
				setTimeDistance((TimeDistance)newValue);
				return;
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT:
				setEvent((EventRepresentation)newValue);
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
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE:
				setTimeDistance((TimeDistance)null);
				return;
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT:
				setEvent((EventRepresentation)null);
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
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__TIME_DISTANCE:
				return timeDistance != null;
			case TemPsyPackage.EVENT_CHAIN_ELEMENT__EVENT:
				return event != null;
		}
		return super.eIsSet(featureID);
	}

} //EventChainElementImpl
