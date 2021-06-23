/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Judge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.BasicJudge#getBE <em>BE</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.BasicJudge#getCmp <em>Cmp</em>}</li>
 * </ul>
 *
 * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getBasicJudge()
 * @model
 * @generated
 */
public interface BasicJudge extends EObject
{
  /**
   * Returns the value of the '<em><b>BE</b></em>' attribute.
   * The literals are from the enumeration {@link edu.ustb.cmp.miniJava.BooleanExp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>BE</em>' attribute.
   * @see edu.ustb.cmp.miniJava.BooleanExp
   * @see #setBE(BooleanExp)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getBasicJudge_BE()
   * @model
   * @generated
   */
  BooleanExp getBE();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.BasicJudge#getBE <em>BE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>BE</em>' attribute.
   * @see edu.ustb.cmp.miniJava.BooleanExp
   * @see #getBE()
   * @generated
   */
  void setBE(BooleanExp value);

  /**
   * Returns the value of the '<em><b>Cmp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmp</em>' containment reference.
   * @see #setCmp(CompareExp)
   * @see edu.ustb.cmp.miniJava.MiniJavaPackage#getBasicJudge_Cmp()
   * @model containment="true"
   * @generated
   */
  CompareExp getCmp();

  /**
   * Sets the value of the '{@link edu.ustb.cmp.miniJava.BasicJudge#getCmp <em>Cmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmp</em>' containment reference.
   * @see #getCmp()
   * @generated
   */
  void setCmp(CompareExp value);

} // BasicJudge
