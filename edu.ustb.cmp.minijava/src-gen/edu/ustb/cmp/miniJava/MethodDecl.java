/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.MethodDecl#getDomain <em>Domain</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.MethodDecl#getExtra <em>Extra</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.MethodDecl#getRetType <em>Ret Type</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.MethodDecl#getParams <em>Params</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.MethodDecl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getMethodDecl()
 * @model
 * @generated
 */
public interface MethodDecl extends Member
{
  /**
   * Returns the value of the '<em><b>Domain</b></em>' attribute.
   * The literals are from the enumeration {@link edu.ustb.cmp.miniJava.Domain}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' attribute.
   * @see edu.ustb.cmp.miniJava.Domain
   * @see #setDomain(Domain)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getMethodDecl_Domain()
   * @model
   * @generated
   */
  Domain getDomain();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.MethodDecl#getDomain <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' attribute.
   * @see edu.ustb.cmp.miniJava.Domain
   * @see #getDomain()
   * @generated
   */
  void setDomain(Domain value);

  /**
   * Returns the value of the '<em><b>Extra</b></em>' attribute.
   * The literals are from the enumeration {@link edu.ustb.cmp.miniJava.ExtraAttr}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra</em>' attribute.
   * @see edu.ustb.cmp.miniJava.ExtraAttr
   * @see #setExtra(ExtraAttr)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getMethodDecl_Extra()
   * @model
   * @generated
   */
  ExtraAttr getExtra();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.MethodDecl#getExtra <em>Extra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extra</em>' attribute.
   * @see edu.ustb.cmp.miniJava.ExtraAttr
   * @see #getExtra()
   * @generated
   */
  void setExtra(ExtraAttr value);

  /**
   * Returns the value of the '<em><b>Ret Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ret Type</em>' attribute.
   * @see #setRetType(String)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getMethodDecl_RetType()
   * @model
   * @generated
   */
  String getRetType();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.MethodDecl#getRetType <em>Ret Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ret Type</em>' attribute.
   * @see #getRetType()
   * @generated
   */
  void setRetType(String value);

  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link edu.ustb.cmp.miniJava.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getMethodDecl_Params()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParams();

  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link edu.ustb.cmp.miniJava.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getMethodDecl_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

} // MethodDecl
