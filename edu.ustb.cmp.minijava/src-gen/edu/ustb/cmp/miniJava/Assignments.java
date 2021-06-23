/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignments</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.Assignments#getLeftValue <em>Left Value</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.Assignments#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getAssignments()
 * @model
 * @generated
 */
public interface Assignments extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Value</em>' containment reference.
   * @see #setLeftValue(LValueExp)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getAssignments_LeftValue()
   * @model containment="true"
   * @generated
   */
  LValueExp getLeftValue();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.Assignments#getLeftValue <em>Left Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Value</em>' containment reference.
   * @see #getLeftValue()
   * @generated
   */
  void setLeftValue(LValueExp value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getAssignments_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.Assignments#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Assignments