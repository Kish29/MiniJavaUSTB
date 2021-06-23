/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava.impl;

import edu.ustb.cmp.miniJava.BasicJudge;
import edu.ustb.cmp.miniJava.BooleanExp;
import edu.ustb.cmp.miniJava.CompareExp;
import edu.ustb.cmp.miniJava.MiniJavaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Judge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.BasicJudgeImpl#getBE <em>BE</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.BasicJudgeImpl#getCmp <em>Cmp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicJudgeImpl extends MinimalEObjectImpl.Container implements BasicJudge
{
  /**
   * The default value of the '{@link #getBE() <em>BE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBE()
   * @generated
   * @ordered
   */
  protected static final BooleanExp BE_EDEFAULT = BooleanExp.TRUE;

  /**
   * The cached value of the '{@link #getBE() <em>BE</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBE()
   * @generated
   * @ordered
   */
  protected BooleanExp bE = BE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCmp() <em>Cmp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmp()
   * @generated
   * @ordered
   */
  protected CompareExp cmp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BasicJudgeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MiniJavaPackage.Literals.BASIC_JUDGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanExp getBE()
  {
    return bE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBE(BooleanExp newBE)
  {
    BooleanExp oldBE = bE;
    bE = newBE == null ? BE_EDEFAULT : newBE;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.BASIC_JUDGE__BE, oldBE, bE));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompareExp getCmp()
  {
    return cmp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmp(CompareExp newCmp, NotificationChain msgs)
  {
    CompareExp oldCmp = cmp;
    cmp = newCmp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MiniJavaPackage.BASIC_JUDGE__CMP, oldCmp, newCmp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCmp(CompareExp newCmp)
  {
    if (newCmp != cmp)
    {
      NotificationChain msgs = null;
      if (cmp != null)
        msgs = ((InternalEObject)cmp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.BASIC_JUDGE__CMP, null, msgs);
      if (newCmp != null)
        msgs = ((InternalEObject)newCmp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MiniJavaPackage.BASIC_JUDGE__CMP, null, msgs);
      msgs = basicSetCmp(newCmp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.BASIC_JUDGE__CMP, newCmp, newCmp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MiniJavaPackage.BASIC_JUDGE__CMP:
        return basicSetCmp(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MiniJavaPackage.BASIC_JUDGE__BE:
        return getBE();
      case MiniJavaPackage.BASIC_JUDGE__CMP:
        return getCmp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniJavaPackage.BASIC_JUDGE__BE:
        setBE((BooleanExp)newValue);
        return;
      case MiniJavaPackage.BASIC_JUDGE__CMP:
        setCmp((CompareExp)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MiniJavaPackage.BASIC_JUDGE__BE:
        setBE(BE_EDEFAULT);
        return;
      case MiniJavaPackage.BASIC_JUDGE__CMP:
        setCmp((CompareExp)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MiniJavaPackage.BASIC_JUDGE__BE:
        return bE != BE_EDEFAULT;
      case MiniJavaPackage.BASIC_JUDGE__CMP:
        return cmp != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (bE: ");
    result.append(bE);
    result.append(')');
    return result.toString();
  }

} //BasicJudgeImpl
