/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.ClassDecl#getName <em>Name</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.ClassDecl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.ClassDecl#getImplementz <em>Implementz</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.ClassDecl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getClassDecl()
 * @model
 * @generated
 */
public interface ClassDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getClassDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.ClassDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Class</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Class</em>' reference.
   * @see #setSuperClass(ClassDecl)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getClassDecl_SuperClass()
   * @model
   * @generated
   */
  ClassDecl getSuperClass();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.ClassDecl#getSuperClass <em>Super Class</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Class</em>' reference.
   * @see #getSuperClass()
   * @generated
   */
  void setSuperClass(ClassDecl value);

  /**
   * Returns the value of the '<em><b>Implementz</b></em>' reference list.
   * The list contents are of type {@link edu.ustb.cmp.miniJava.ClassDecl}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Implementz</em>' reference list.
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getClassDecl_Implementz()
   * @model
   * @generated
   */
  EList<ClassDecl> getImplementz();

  /**
   * Returns the value of the '<em><b>Members</b></em>' containment reference list.
   * The list contents are of type {@link edu.ustb.cmp.miniJava.Member}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Members</em>' containment reference list.
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getClassDecl_Members()
   * @model containment="true"
   * @generated
   */
  EList<Member> getMembers();

} // ClassDecl
