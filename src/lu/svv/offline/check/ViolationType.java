/**
 */
package lu.svv.offline.check;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Violation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see lu.svv.offline.check.CheckPackage#getViolationType()
 * @model
 * @generated
 */
public enum ViolationType implements Enumerator {
	/**
	 * The '<em><b>NSOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSOC_VALUE
	 * @generated
	 * @ordered
	 */
	NSOC(0, "NSOC", "No-Show Occurrence"),

	/**
	 * The '<em><b>UNOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNOC_VALUE
	 * @generated
	 * @ordered
	 */
	UNOC(1, "UNOC", "Unexpected Occurrence"),

	/**
	 * The '<em><b>NSOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NSOR_VALUE
	 * @generated
	 * @ordered
	 */
	NSOR(2, "NSOR", "No-Show Order"),

	/**
	 * The '<em><b>WTC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTC_VALUE
	 * @generated
	 * @ordered
	 */
	WTC(3, "WTC", "Wrong Temporal Chain"),

	/**
	 * The '<em><b>WTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTO_VALUE
	 * @generated
	 * @ordered
	 */
	WTO(4, "WTO", "Wrong Temporal Order"), /**
	 * The '<em><b>WTOC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTOC_VALUE
	 * @generated
	 * @ordered
	 */
	WTOC(5, "WTOC", "Wrong Temporal Order and Wrong Temporal Chain"), /**
	 * The '<em><b>LVRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LVRI_VALUE
	 * @generated
	 * @ordered
	 */
	LVRI(6, "LVRI", "Wrong Temporal Order - Valid Chain on Left and Invalid Chain on Right"), /**
	 * The '<em><b>LIRV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIRV_VALUE
	 * @generated
	 * @ordered
	 */
	LIRV(7, "LIRV", "Wrong Temporal Order - Invalid Chain on Left and Valid Chain on Right"), /**
	 * The '<em><b>LIRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIRI_VALUE
	 * @generated
	 * @ordered
	 */
	LIRI(8, "LIRI", "Wrong Temporal Order - Invalid Chain on Left and Invalid Chain on Right");

	/**
	 * The '<em><b>NSOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NSOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NSOC
	 * @model literal="No-Show Occurrence"
	 * @generated
	 * @ordered
	 */
	public static final int NSOC_VALUE = 0;

	/**
	 * The '<em><b>UNOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNOC
	 * @model literal="Unexpected Occurrence"
	 * @generated
	 * @ordered
	 */
	public static final int UNOC_VALUE = 1;

	/**
	 * The '<em><b>NSOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NSOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NSOR
	 * @model literal="No-Show Order"
	 * @generated
	 * @ordered
	 */
	public static final int NSOR_VALUE = 2;

	/**
	 * The '<em><b>WTC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WTC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WTC
	 * @model literal="Wrong Temporal Chain"
	 * @generated
	 * @ordered
	 */
	public static final int WTC_VALUE = 3;

	/**
	 * The '<em><b>WTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WTO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WTO
	 * @model literal="Wrong Temporal Order"
	 * @generated
	 * @ordered
	 */
	public static final int WTO_VALUE = 4;

	/**
	 * The '<em><b>WTOC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WTOC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WTOC
	 * @model literal="Wrong Temporal Order and Wrong Temporal Chain"
	 * @generated
	 * @ordered
	 */
	public static final int WTOC_VALUE = 5;

	/**
	 * The '<em><b>LVRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LVRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LVRI
	 * @model literal="Wrong Temporal Order - Valid Chain on Left and Invalid Chain on Right"
	 * @generated
	 * @ordered
	 */
	public static final int LVRI_VALUE = 6;

	/**
	 * The '<em><b>LIRV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIRV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIRV
	 * @model literal="Wrong Temporal Order - Invalid Chain on Left and Valid Chain on Right"
	 * @generated
	 * @ordered
	 */
	public static final int LIRV_VALUE = 7;

	/**
	 * The '<em><b>LIRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIRI
	 * @model literal="Wrong Temporal Order - Invalid Chain on Left and Invalid Chain on Right"
	 * @generated
	 * @ordered
	 */
	public static final int LIRI_VALUE = 8;

	/**
	 * An array of all the '<em><b>Violation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ViolationType[] VALUES_ARRAY =
		new ViolationType[] {
			NSOC,
			UNOC,
			NSOR,
			WTC,
			WTO,
			WTOC,
			LVRI,
			LIRV,
			LIRI,
		};

	/**
	 * A public read-only list of all the '<em><b>Violation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ViolationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Violation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViolationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViolationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Violation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViolationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ViolationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Violation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ViolationType get(int value) {
		switch (value) {
			case NSOC_VALUE: return NSOC;
			case UNOC_VALUE: return UNOC;
			case NSOR_VALUE: return NSOR;
			case WTC_VALUE: return WTC;
			case WTO_VALUE: return WTO;
			case WTOC_VALUE: return WTOC;
			case LVRI_VALUE: return LVRI;
			case LIRV_VALUE: return LIRV;
			case LIRI_VALUE: return LIRI;
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
	private ViolationType(int value, String name, String literal) {
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
	
} //ViolationType
