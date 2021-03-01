/**
 */
package org.panorama.research.waters2019.tracemetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived From Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Links Safety Goals to Hazards
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.DerivedFromHazard#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.DerivedFromHazard#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getDerivedFromHazard()
 * @model
 * @generated
 */
public interface DerivedFromHazard extends DirectedTraceLink {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getDerivedFromHazard_Source()
	 * @model required="true"
	 *        annotation="http://panorama-research.org/waters2019/UseWrapperType className='CapraOfficeObject'"
	 * @generated
	 */
	EObject getSource();

	/**
	 * Sets the value of the '{@link org.panorama.research.waters2019.tracemetamodel.DerivedFromHazard#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage#getDerivedFromHazard_Target()
	 * @model required="true"
	 *        annotation="http://panorama-research.org/waters2019/UseWrapperType className='CapraOfficeObject'"
	 * @generated
	 */
	EList<EObject> getTarget();

} // DerivedFromHazard