/**
 */
package lu.svv.offline.tempsy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pattern Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lu.svv.offline.tempsy.TemPsyPackage#getPatternType()
 * @model
 * @generated
 */
public enum PatternType implements Enumerator {
	/**
	 * The '<em><b>UNIVERSALITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERSALITY_VALUE
	 * @generated
	 * @ordered
	 */
	UNIVERSALITY(0, "UNIVERSALITY", "always"),

	/**
	 * The '<em><b>EXISTENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTENCE_VALUE
	 * @generated
	 * @ordered
	 */
	EXISTENCE(1, "EXISTENCE", "eventually"),

	/**
	 * The '<em><b>ABSENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSENCE_VALUE
	 * @generated
	 * @ordered
	 */
	ABSENCE(2, "ABSENCE", "never"),

	/**
	 * The '<em><b>PRECEDENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRECEDENCE_VALUE
	 * @generated
	 * @ordered
	 */
	PRECEDENCE(3, "PRECEDENCE", "preceding"),

	/**
	 * The '<em><b>RESPONSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSE_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSE(4, "RESPONSE", "responding");

	/**
	 * The '<em><b>UNIVERSALITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIVERSALITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIVERSALITY
	 * @model literal="always"
	 * @generated
	 * @ordered
	 */
	public static final int UNIVERSALITY_VALUE = 0;

	/**
	 * The '<em><b>EXISTENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXISTENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXISTENCE
	 * @model literal="eventually"
	 * @generated
	 * @ordered
	 */
	public static final int EXISTENCE_VALUE = 1;

	/**
	 * The '<em><b>ABSENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABSENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABSENCE
	 * @model literal="never"
	 * @generated
	 * @ordered
	 */
	public static final int ABSENCE_VALUE = 2;

	/**
	 * The '<em><b>PRECEDENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRECEDENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRECEDENCE
	 * @model literal="preceding"
	 * @generated
	 * @ordered
	 */
	public static final int PRECEDENCE_VALUE = 3;

	/**
	 * The '<em><b>RESPONSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RESPONSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSE
	 * @model literal="responding"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PatternType[] VALUES_ARRAY =
		new PatternType[] {
			UNIVERSALITY,
			EXISTENCE,
			ABSENCE,
			PRECEDENCE,
			RESPONSE,
		};

	/**
	 * A public read-only list of all the '<em><b>Pattern Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PatternType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pattern Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatternType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pattern Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PatternType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pattern Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PatternType get(int value) {
		switch (value) {
			case UNIVERSALITY_VALUE: return UNIVERSALITY;
			case EXISTENCE_VALUE: return EXISTENCE;
			case ABSENCE_VALUE: return ABSENCE;
			case PRECEDENCE_VALUE: return PRECEDENCE;
			case RESPONSE_VALUE: return RESPONSE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PatternType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
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
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PatternType
