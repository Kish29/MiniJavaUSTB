/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava.impl;

import edu.ustb.cmp.miniJava.CalcExp;
import edu.ustb.cmp.miniJava.MiniJavaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calc Exp</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.CalcExpImpl#getLeftName <em>Left Name</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.CalcExpImpl#getLeftNum <em>Left Num</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.CalcExpImpl#getOp <em>Op</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.CalcExpImpl#getRightName <em>Right Name</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.CalcExpImpl#getRightNum <em>Right Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalcExpImpl extends MinimalEObjectImpl.Container implements CalcExp
{
  /**
   * The default value of the '{@link #getLeftName() <em>Left Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftName()
   * @generated
   * @ordered
   */
  protected static final String LEFT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLeftName() <em>Left Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftName()
   * @generated
   * @ordered
   */
  protected String leftName = LEFT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLeftNum() <em>Left Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftNum()
   * @generated
   * @ordered
   */
  protected static final int LEFT_NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLeftNum() <em>Left Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftNum()
   * @generated
   * @ordered
   */
  protected int leftNum = LEFT_NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The default value of the '{@link #getRightName() <em>Right Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightName()
   * @generated
   * @ordered
   */
  protected static final String RIGHT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRightName() <em>Right Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightName()
   * @generated
   * @ordered
   */
  protected String rightName = RIGHT_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getRightNum() <em>Right Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightNum()
   * @generated
   * @ordered
   */
  protected static final int RIGHT_NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRightNum() <em>Right Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightNum()
   * @generated
   * @ordered
   */
  protected int rightNum = RIGHT_NUM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalcExpImpl()
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
    return MiniJavaPackage.Literals.CALC_EXP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLeftName()
  {
    return leftName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeftName(String newLeftName)
  {
    String oldLeftName = leftName;
    leftName = newLeftName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CALC_EXP__LEFT_NAME, oldLeftName, leftName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getLeftNum()
  {
    return leftNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeftNum(int newLeftNum)
  {
    int oldLeftNum = leftNum;
    leftNum = newLeftNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CALC_EXP__LEFT_NUM, oldLeftNum, leftNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CALC_EXP__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRightName()
  {
    return rightName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRightName(String newRightName)
  {
    String oldRightName = rightName;
    rightName = newRightName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CALC_EXP__RIGHT_NAME, oldRightName, rightName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getRightNum()
  {
    return rightNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRightNum(int newRightNum)
  {
    int oldRightNum = rightNum;
    rightNum = newRightNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.CALC_EXP__RIGHT_NUM, oldRightNum, rightNum));
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
      case MiniJavaPackage.CALC_EXP__LEFT_NAME:
        return getLeftName();
      case MiniJavaPackage.CALC_EXP__LEFT_NUM:
        return getLeftNum();
      case MiniJavaPackage.CALC_EXP__OP:
        return getOp();
      case MiniJavaPackage.CALC_EXP__RIGHT_NAME:
        return getRightName();
      case MiniJavaPackage.CALC_EXP__RIGHT_NUM:
        return getRightNum();
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
      case MiniJavaPackage.CALC_EXP__LEFT_NAME:
        setLeftName((String)newValue);
        return;
      case MiniJavaPackage.CALC_EXP__LEFT_NUM:
        setLeftNum((Integer)newValue);
        return;
      case MiniJavaPackage.CALC_EXP__OP:
        setOp((String)newValue);
        return;
      case MiniJavaPackage.CALC_EXP__RIGHT_NAME:
        setRightName((String)newValue);
        return;
      case MiniJavaPackage.CALC_EXP__RIGHT_NUM:
        setRightNum((Integer)newValue);
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
      case MiniJavaPackage.CALC_EXP__LEFT_NAME:
        setLeftName(LEFT_NAME_EDEFAULT);
        return;
      case MiniJavaPackage.CALC_EXP__LEFT_NUM:
        setLeftNum(LEFT_NUM_EDEFAULT);
        return;
      case MiniJavaPackage.CALC_EXP__OP:
        setOp(OP_EDEFAULT);
        return;
      case MiniJavaPackage.CALC_EXP__RIGHT_NAME:
        setRightName(RIGHT_NAME_EDEFAULT);
        return;
      case MiniJavaPackage.CALC_EXP__RIGHT_NUM:
        setRightNum(RIGHT_NUM_EDEFAULT);
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
      case MiniJavaPackage.CALC_EXP__LEFT_NAME:
        return LEFT_NAME_EDEFAULT == null ? leftName != null : !LEFT_NAME_EDEFAULT.equals(leftName);
      case MiniJavaPackage.CALC_EXP__LEFT_NUM:
        return leftNum != LEFT_NUM_EDEFAULT;
      case MiniJavaPackage.CALC_EXP__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case MiniJavaPackage.CALC_EXP__RIGHT_NAME:
        return RIGHT_NAME_EDEFAULT == null ? rightName != null : !RIGHT_NAME_EDEFAULT.equals(rightName);
      case MiniJavaPackage.CALC_EXP__RIGHT_NUM:
        return rightNum != RIGHT_NUM_EDEFAULT;
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
    result.append(" (leftName: ");
    result.append(leftName);
    result.append(", leftNum: ");
    result.append(leftNum);
    result.append(", op: ");
    result.append(op);
    result.append(", rightName: ");
    result.append(rightName);
    result.append(", rightNum: ");
    result.append(rightNum);
    result.append(')');
    return result.toString();
  }

} //CalcExpImpl
