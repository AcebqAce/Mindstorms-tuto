/**
 */
package fr.obeo.dsl.tuto.mindstorms;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.Rotate#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link fr.obeo.dsl.tuto.mindstorms.Rotate#isRandom <em>Random</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getRotate()
 * @model
 * @generated
 */
public interface Rotate extends Action {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' attribute.
	 * @see #setDegrees(int)
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getRotate_Degrees()
	 * @model
	 * @generated
	 */
	int getDegrees();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.tuto.mindstorms.Rotate#getDegrees <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' attribute.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(int value);

	/**
	 * Returns the value of the '<em><b>Random</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random</em>' attribute.
	 * @see #setRandom(boolean)
	 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsPackage#getRotate_Random()
	 * @model default="false"
	 * @generated
	 */
	boolean isRandom();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.tuto.mindstorms.Rotate#isRandom <em>Random</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random</em>' attribute.
	 * @see #isRandom()
	 * @generated
	 */
	void setRandom(boolean value);

} // Rotate
