/**
 */
package lu.svv.offline.check;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lu.svv.offline.check.CheckFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/' tempsy='tempsy.ecore#/' trace='trace.ecore#/'"
 * @generated
 */
public interface CheckPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "check";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.svv.lu/offline/Check";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "check";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CheckPackage eINSTANCE = lu.svv.offline.check.impl.CheckPackageImpl.init();

	/**
	 * The meta object id for the '{@link lu.svv.offline.check.impl.MonitorImpl <em>Monitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.check.impl.MonitorImpl
	 * @see lu.svv.offline.check.impl.CheckPackageImpl#getMonitor()
	 * @generated
	 */
	int MONITOR = 0;

	/**
	 * The feature id for the '<em><b>Trace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__TRACE = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR__PROPERTIES = 1;

	/**
	 * The number of structural features of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Monitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONITOR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link lu.svv.offline.check.ViolationType <em>Violation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.svv.offline.check.ViolationType
	 * @see lu.svv.offline.check.impl.CheckPackageImpl#getViolationType()
	 * @generated
	 */
	int VIOLATION_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link lu.svv.offline.check.Monitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monitor</em>'.
	 * @see lu.svv.offline.check.Monitor
	 * @generated
	 */
	EClass getMonitor();

	/**
	 * Returns the meta object for the reference '{@link lu.svv.offline.check.Monitor#getTrace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trace</em>'.
	 * @see lu.svv.offline.check.Monitor#getTrace()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Trace();

	/**
	 * Returns the meta object for the reference '{@link lu.svv.offline.check.Monitor#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Properties</em>'.
	 * @see lu.svv.offline.check.Monitor#getProperties()
	 * @see #getMonitor()
	 * @generated
	 */
	EReference getMonitor_Properties();

	/**
	 * Returns the meta object for enum '{@link lu.svv.offline.check.ViolationType <em>Violation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Violation Type</em>'.
	 * @see lu.svv.offline.check.ViolationType
	 * @generated
	 */
	EEnum getViolationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CheckFactory getCheckFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lu.svv.offline.check.impl.MonitorImpl <em>Monitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.check.impl.MonitorImpl
		 * @see lu.svv.offline.check.impl.CheckPackageImpl#getMonitor()
		 * @generated
		 */
		EClass MONITOR = eINSTANCE.getMonitor();

		/**
		 * The meta object literal for the '<em><b>Trace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__TRACE = eINSTANCE.getMonitor_Trace();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MONITOR__PROPERTIES = eINSTANCE.getMonitor_Properties();

		/**
		 * The meta object literal for the '{@link lu.svv.offline.check.ViolationType <em>Violation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.svv.offline.check.ViolationType
		 * @see lu.svv.offline.check.impl.CheckPackageImpl#getViolationType()
		 * @generated
		 */
		EEnum VIOLATION_TYPE = eINSTANCE.getViolationType();

	}

} //CheckPackage
