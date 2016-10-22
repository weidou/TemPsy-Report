/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.ComparingOperator;
import lu.svv.offline.tempsy.EventRepresentation;
import lu.svv.offline.tempsy.OccurrencePattern;
import lu.svv.offline.tempsy.TemPsyPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.OccurrencePatternImpl#getComparingOperator <em>Comparing Operator</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.impl.OccurrencePatternImpl#getTimes <em>Times</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.impl.OccurrencePatternImpl#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrencePatternImpl extends PatternImpl implements OccurrencePattern {
	/**
	 * The default value of the '{@link #getComparingOperator() <em>Comparing Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparingOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparingOperator COMPARING_OPERATOR_EDEFAULT = ComparingOperator.ATLEAST;

	/**
	 * The cached value of the '{@link #getComparingOperator() <em>Comparing Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparingOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparingOperator comparingOperator = COMPARING_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMES_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getTimes() <em>Times</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimes()
	 * @generated
	 * @ordered
	 */
	protected int times = TIMES_EDEFAULT;

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
	protected OccurrencePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.OCCURRENCE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparingOperator getComparingOperator() {
		return comparingOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparingOperator(ComparingOperator newComparingOperator) {
		ComparingOperator oldComparingOperator = comparingOperator;
		comparingOperator = newComparingOperator == null ? COMPARING_OPERATOR_EDEFAULT : newComparingOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.OCCURRENCE_PATTERN__COMPARING_OPERATOR, oldComparingOperator, comparingOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimes() {
		return times;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimes(int newTimes) {
		int oldTimes = times;
		times = newTimes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.OCCURRENCE_PATTERN__TIMES, oldTimes, times));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TemPsyPackage.OCCURRENCE_PATTERN__EVENT, oldEvent, newEvent);
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
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.OCCURRENCE_PATTERN__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TemPsyPackage.OCCURRENCE_PATTERN__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.OCCURRENCE_PATTERN__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemPsyPackage.OCCURRENCE_PATTERN__EVENT:
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
			case TemPsyPackage.OCCURRENCE_PATTERN__COMPARING_OPERATOR:
				return getComparingOperator();
			case TemPsyPackage.OCCURRENCE_PATTERN__TIMES:
				return getTimes();
			case TemPsyPackage.OCCURRENCE_PATTERN__EVENT:
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
			case TemPsyPackage.OCCURRENCE_PATTERN__COMPARING_OPERATOR:
				setComparingOperator((ComparingOperator)newValue);
				return;
			case TemPsyPackage.OCCURRENCE_PATTERN__TIMES:
				setTimes((Integer)newValue);
				return;
			case TemPsyPackage.OCCURRENCE_PATTERN__EVENT:
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
			case TemPsyPackage.OCCURRENCE_PATTERN__COMPARING_OPERATOR:
				setComparingOperator(COMPARING_OPERATOR_EDEFAULT);
				return;
			case TemPsyPackage.OCCURRENCE_PATTERN__TIMES:
				setTimes(TIMES_EDEFAULT);
				return;
			case TemPsyPackage.OCCURRENCE_PATTERN__EVENT:
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
			case TemPsyPackage.OCCURRENCE_PATTERN__COMPARING_OPERATOR:
				return comparingOperator != COMPARING_OPERATOR_EDEFAULT;
			case TemPsyPackage.OCCURRENCE_PATTERN__TIMES:
				return times != TIMES_EDEFAULT;
			case TemPsyPackage.OCCURRENCE_PATTERN__EVENT:
				return event != null;
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
		result.append(" (comparingOperator: ");
		result.append(comparingOperator);
		result.append(", times: ");
		result.append(times);
		result.append(')');
		return result.toString();
	}

} //OccurrencePatternImpl
