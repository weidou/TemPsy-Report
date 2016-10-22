/**
 */
package lu.svv.offline.tempsy.impl;

import lu.svv.offline.tempsy.Pattern;
import lu.svv.offline.tempsy.PatternType;
import lu.svv.offline.tempsy.TemPsyPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.PatternImpl#getPatternType <em>Pattern Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends MinimalEObjectImpl.Container implements Pattern {
	/**
	 * The default value of the '{@link #getPatternType() <em>Pattern Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternType()
	 * @generated
	 * @ordered
	 */
	protected static final PatternType PATTERN_TYPE_EDEFAULT = PatternType.UNIVERSALITY;

	/**
	 * The cached value of the '{@link #getPatternType() <em>Pattern Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternType()
	 * @generated
	 * @ordered
	 */
	protected PatternType patternType = PATTERN_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternType getPatternType() {
		return patternType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatternType(PatternType newPatternType) {
		PatternType oldPatternType = patternType;
		patternType = newPatternType == null ? PATTERN_TYPE_EDEFAULT : newPatternType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TemPsyPackage.PATTERN__PATTERN_TYPE, oldPatternType, patternType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TemPsyPackage.PATTERN__PATTERN_TYPE:
				return getPatternType();
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
			case TemPsyPackage.PATTERN__PATTERN_TYPE:
				setPatternType((PatternType)newValue);
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
			case TemPsyPackage.PATTERN__PATTERN_TYPE:
				setPatternType(PATTERN_TYPE_EDEFAULT);
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
			case TemPsyPackage.PATTERN__PATTERN_TYPE:
				return patternType != PATTERN_TYPE_EDEFAULT;
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
		result.append(" (patternType: ");
		result.append(patternType);
		result.append(')');
		return result.toString();
	}

} //PatternImpl
