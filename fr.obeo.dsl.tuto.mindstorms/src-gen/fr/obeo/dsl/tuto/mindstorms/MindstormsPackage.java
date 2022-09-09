/**
 */
package fr.obeo.dsl.tuto.mindstorms;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see fr.obeo.dsl.tuto.mindstorms.MindstormsFactory
 * @model kind="package"
 * @generated
 */
public interface MindstormsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mindstorms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/mindstorms/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mindstorms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MindstormsPackage eINSTANCE = fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.InstructionsImpl <em>Instructions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.InstructionsImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getInstructions()
	 * @generated
	 */
	int INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instructions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ChoreographyImpl <em>Choreography</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ChoreographyImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getChoreography()
	 * @generated
	 */
	int CHOREOGRAPHY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__NAME = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY__INSTRUCTIONS = INSTRUCTIONS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Choreography</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOREOGRAPHY_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = INSTRUCTIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = INSTRUCTIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 3;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl <em>Grab</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGrab()
	 * @generated
	 */
	int GRAB = 4;

	/**
	 * The number of structural features of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grab</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAB_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl <em>Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoForward()
	 * @generated
	 */
	int GO_FORWARD = 5;

	/**
	 * The feature id for the '<em><b>Cm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__CM = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl <em>Rotate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl
	 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRotate()
	 * @generated
	 */
	int ROTATE = 6;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__DEGREES = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE__RANDOM = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Rotate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTATE_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Instructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Instructions
	 * @generated
	 */
	EClass getInstructions();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Choreography <em>Choreography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choreography</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Choreography
	 * @generated
	 */
	EClass getChoreography();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.Choreography#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Choreography#getName()
	 * @see #getChoreography()
	 * @generated
	 */
	EAttribute getChoreography_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.obeo.dsl.tuto.mindstorms.Choreography#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Choreography#getInstructions()
	 * @see #getChoreography()
	 * @generated
	 */
	EReference getChoreography_Instructions();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Grab <em>Grab</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grab</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Grab
	 * @generated
	 */
	EClass getGrab();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Forward</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoForward
	 * @generated
	 */
	EClass getGoForward();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.GoForward#getCm <em>Cm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cm</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.GoForward#getCm()
	 * @see #getGoForward()
	 * @generated
	 */
	EAttribute getGoForward_Cm();

	/**
	 * Returns the meta object for class '{@link fr.obeo.dsl.tuto.mindstorms.Rotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotate</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Rotate
	 * @generated
	 */
	EClass getRotate();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.Rotate#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Rotate#getDegrees()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Degrees();

	/**
	 * Returns the meta object for the attribute '{@link fr.obeo.dsl.tuto.mindstorms.Rotate#isRandom <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random</em>'.
	 * @see fr.obeo.dsl.tuto.mindstorms.Rotate#isRandom()
	 * @see #getRotate()
	 * @generated
	 */
	EAttribute getRotate_Random();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MindstormsFactory getMindstormsFactory();

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
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.InstructionsImpl <em>Instructions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.InstructionsImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getInstructions()
		 * @generated
		 */
		EClass INSTRUCTIONS = eINSTANCE.getInstructions();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ChoreographyImpl <em>Choreography</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ChoreographyImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getChoreography()
		 * @generated
		 */
		EClass CHOREOGRAPHY = eINSTANCE.getChoreography();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOREOGRAPHY__NAME = eINSTANCE.getChoreography_Name();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOREOGRAPHY__INSTRUCTIONS = eINSTANCE.getChoreography_Instructions();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ActionImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.ReleaseImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl <em>Grab</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.GrabImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGrab()
		 * @generated
		 */
		EClass GRAB = eINSTANCE.getGrab();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl <em>Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.GoForwardImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getGoForward()
		 * @generated
		 */
		EClass GO_FORWARD = eINSTANCE.getGoForward();

		/**
		 * The meta object literal for the '<em><b>Cm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_FORWARD__CM = eINSTANCE.getGoForward_Cm();

		/**
		 * The meta object literal for the '{@link fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl <em>Rotate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.RotateImpl
		 * @see fr.obeo.dsl.tuto.mindstorms.impl.MindstormsPackageImpl#getRotate()
		 * @generated
		 */
		EClass ROTATE = eINSTANCE.getRotate();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__DEGREES = eINSTANCE.getRotate_Degrees();

		/**
		 * The meta object literal for the '<em><b>Random</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROTATE__RANDOM = eINSTANCE.getRotate_Random();

	}

} //MindstormsPackage
