/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.PackageDecl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getPackageDecl()
 * @model
 * @generated
 */
public interface PackageDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getPackageDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.PackageDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PackageDecl