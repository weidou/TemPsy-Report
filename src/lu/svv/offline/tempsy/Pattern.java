/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.svv.offline.tempsy.Pattern#getPatternType <em>Pattern Type</em>}</li>
 * </ul>
 *
 * @see lu.svv.offline.tempsy.TemPsyPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern Type</b></em>' attribute.
	 * The literals are from the enumeration {@link lu.svv.offline.tempsy.PatternType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Type</em>' attribute.
	 * @see lu.svv.offline.tempsy.PatternType
	 * @see #setPatternType(PatternType)
	 * @see lu.svv.offline.tempsy.TemPsyPackage#getPattern_PatternType()
	 * @model
	 * @generated
	 */
	PatternType getPatternType();

	/**
	 * Sets the value of the '{@link lu.svv.offline.tempsy.Pattern#getPatternType <em>Pattern Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Type</em>' attribute.
	 * @see lu.svv.offline.tempsy.PatternType
	 * @see #getPatternType()
	 * @generated
	 */
	void setPatternType(PatternType value);

} // Pattern
