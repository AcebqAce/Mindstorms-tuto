/**
 */
package fr.obeo.dsl.tuto.mindstorms;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choreography</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.Choreography#getName <em>Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.Choreography#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getChoreography()
 * @model
 * @generated
 */
public interface Choreography extends Instructions {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getChoreography_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.tuto.mindstorms.Choreography#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.obeo.dsl.tuto.mindstorms.Instructions}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getChoreography_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instructions> getInstructions();

} // Choreography
