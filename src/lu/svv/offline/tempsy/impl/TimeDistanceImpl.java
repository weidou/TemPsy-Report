/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.ComparingOperator;
import lu.svv.offline.tempsy.TemPsyPackage;
import lu.svv.offline.tempsy.TimeDistance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.TimeDistanceImpl#getComparingOperator <em>Comparing Operator</em>}</li>
 *   <li>{@link lu.svv.offline.tempsy.impl.TimeDistanceImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeDistanceImpl extends MinimalEObjectImpl.Container implements TimeDistance {
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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeDistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.TIME_DISTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.TIME_DISTANCE__COMPARING_OPERATOR, oldComparingOperator, comparingOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.TIME_DISTANCE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemPsyPackage.TIME_DISTANCE__COMPARING_OPERATOR:
				return getComparingOperator();
			case TemPsyPackage.TIME_DISTANCE__VALUE:
				return getValue();
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
			case TemPsyPackage.TIME_DISTANCE__COMPARING_OPERATOR:
				setComparingOperator((ComparingOperator)newValue);
				return;
			case TemPsyPackage.TIME_DISTANCE__VALUE:
				setValue((Integer)newValue);
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
			case TemPsyPackage.TIME_DISTANCE__COMPARING_OPERATOR:
				setComparingOperator(COMPARING_OPERATOR_EDEFAULT);
				return;
			case TemPsyPackage.TIME_DISTANCE__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case TemPsyPackage.TIME_DISTANCE__COMPARING_OPERATOR:
				return comparingOperator != COMPARING_OPERATOR_EDEFAULT;
			case TemPsyPackage.TIME_DISTANCE__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //TimeDistanceImpl
