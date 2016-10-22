/**
 */
package lu.svv.offline.tempsy.impl;

import java.util.Collection;

import lu.svv.offline.tempsy.TemPsyBlock;
import lu.svv.offline.tempsy.TemPsyExpression;
import lu.svv.offline.tempsy.TemPsyPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tem Psy Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.impl.TemPsyBlockImpl#getTemPsyExpressions <em>Tem Psy Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemPsyBlockImpl extends MinimalEObjectImpl.Container implements TemPsyBlock {
	/**
	 * The cached value of the '{@link #getTemPsyExpressions() <em>Tem Psy Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemPsyExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList<TemPsyExpression> temPsyExpressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemPsyBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TemPsyPackage.Literals.TEM_PSY_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemPsyExpression> getTemPsyExpressions() {
		if (temPsyExpressions == null) {
			temPsyExpressions = new EObjectContainmentEList<TemPsyExpression>(TemPsyExpression.class, this, TemPsyPackage.TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS);
		}
		return temPsyExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TemPsyPackage.TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS:
				return ((InternalEList<?>)getTemPsyExpressions()).basicRemove(otherEnd, msgs);
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
			case TemPsyPackage.TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS:
				return getTemPsyExpressions();
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
			case TemPsyPackage.TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS:
				getTemPsyExpressions().clear();
				getTemPsyExpressions().addAll((Collection<? extends TemPsyExpression>)newValue);
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
			case TemPsyPackage.TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS:
				getTemPsyExpressions().clear();
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
			case TemPsyPackage.TEM_PSY_BLOCK__TEM_PSY_EXPRESSIONS:
				return temPsyExpressions != null && !temPsyExpressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TemPsyBlockImpl
