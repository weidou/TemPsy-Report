/**
 */
package lu.svv.offline.tempsy;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lu.svv.offline.tempsy.TemPsyPackage
 * @generated
 */
public interface TemPsyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TemPsyFactory eINSTANCE = lu.svv.offline.tempsy.impl.TemPsyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tem Psy Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tem Psy Block</em>'.
	 * @generated
	 */
	TemPsyBlock createTemPsyBlock();

	/**
	 * Returns a new object of class '<em>Tem Psy Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tem Psy Expression</em>'.
	 * @generated
	 */
	TemPsyExpression createTemPsyExpression();

	/**
	 * Returns a new object of class '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope</em>'.
	 * @generated
	 */
	Scope createScope();

	/**
	 * Returns a new object of class '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pattern</em>'.
	 * @generated
	 */
	Pattern createPattern();

	/**
	 * Returns a new object of class '<em>Globally</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Globally</em>'.
	 * @generated
	 */
	Globally createGlobally();

	/**
	 * Returns a new object of class '<em>Uni Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uni Scope</em>'.
	 * @generated
	 */
	UniScope createUniScope();

	/**
	 * Returns a new object of class '<em>Bi Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bi Scope</em>'.
	 * @generated
	 */
	BiScope createBiScope();

	/**
	 * Returns a new object of class '<em>Boundary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boundary</em>'.
	 * @generated
	 */
	Boundary createBoundary();

	/**
	 * Returns a new object of class '<em>Universality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universality</em>'.
	 * @generated
	 */
	Universality createUniversality();

	/**
	 * Returns a new object of class '<em>Occurrence Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrence Pattern</em>'.
	 * @generated
	 */
	OccurrencePattern createOccurrencePattern();

	/**
	 * Returns a new object of class '<em>Order Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Pattern</em>'.
	 * @generated
	 */
	OrderPattern createOrderPattern();

	/**
	 * Returns a new object of class '<em>Event Chain Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Chain Element</em>'.
	 * @generated
	 */
	EventChainElement createEventChainElement();

	/**
	 * Returns a new object of class '<em>Event Representation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Representation</em>'.
	 * @generated
	 */
	EventRepresentation createEventRepresentation();

	/**
	 * Returns a new object of class '<em>Time Distance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Distance</em>'.
	 * @generated
	 */
	TimeDistance createTimeDistance();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TemPsyPackage getTempsyPackage();

} //TempsyFactory
