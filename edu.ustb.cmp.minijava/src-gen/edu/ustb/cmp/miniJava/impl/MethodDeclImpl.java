/**
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.miniJava.impl;

import edu.ustb.cmp.miniJava.Domain;
import edu.ustb.cmp.miniJava.ExtraAttr;
import edu.ustb.cmp.miniJava.MethodDecl;
import edu.ustb.cmp.miniJava.MiniJavaPackage;
import edu.ustb.cmp.miniJava.Parameter;
import edu.ustb.cmp.miniJava.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.MethodDeclImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.MethodDeclImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.MethodDeclImpl#getRetType <em>Ret Type</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.MethodDeclImpl#getParams <em>Params</em>}</li>
 *   <li>{@link edu.ustb.cmp.miniJava.impl.MethodDeclImpl#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclImpl extends MemberImpl implements MethodDecl
{
  /**
   * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected static final Domain DOMAIN_EDEFAULT = Domain.PUBLIC;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected Domain domain = DOMAIN_EDEFAULT;

  /**
   * The default value of the '{@link #getExtra() <em>Extra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
  protected static final ExtraAttr EXTRA_EDEFAULT = ExtraAttr.STATIC;

  /**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
  protected ExtraAttr extra = EXTRA_EDEFAULT;

  /**
   * The default value of the '{@link #getRetType() <em>Ret Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetType()
   * @generated
   * @ordered
   */
  protected static final String RET_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRetType() <em>Ret Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetType()
   * @generated
   * @ordered
   */
  protected String retType = RET_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodDeclImpl()
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
    return MiniJavaPackage.Literals.METHOD_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Domain getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDomain(Domain newDomain)
  {
    Domain oldDomain = domain;
    domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_DECL__DOMAIN, oldDomain, domain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtraAttr getExtra()
  {
    return extra;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExtra(ExtraAttr newExtra)
  {
    ExtraAttr oldExtra = extra;
    extra = newExtra == null ? EXTRA_EDEFAULT : newExtra;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_DECL__EXTRA, oldExtra, extra));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRetType()
  {
    return retType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRetType(String newRetType)
  {
    String oldRetType = retType;
    retType = newRetType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MiniJavaPackage.METHOD_DECL__RET_TYPE, oldRetType, retType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, MiniJavaPackage.METHOD_DECL__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<Statement>(Statement.class, this, MiniJavaPackage.METHOD_DECL__STATEMENTS);
    }
    return statements;
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
      case MiniJavaPackage.METHOD_DECL__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case MiniJavaPackage.METHOD_DECL__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
      case MiniJavaPackage.METHOD_DECL__DOMAIN:
        return getDomain();
      case MiniJavaPackage.METHOD_DECL__EXTRA:
        return getExtra();
      case MiniJavaPackage.METHOD_DECL__RET_TYPE:
        return getRetType();
      case MiniJavaPackage.METHOD_DECL__PARAMS:
        return getParams();
      case MiniJavaPackage.METHOD_DECL__STATEMENTS:
        return getStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MiniJavaPackage.METHOD_DECL__DOMAIN:
        setDomain((Domain)newValue);
        return;
      case MiniJavaPackage.METHOD_DECL__EXTRA:
        setExtra((ExtraAttr)newValue);
        return;
      case MiniJavaPackage.METHOD_DECL__RET_TYPE:
        setRetType((String)newValue);
        return;
      case MiniJavaPackage.METHOD_DECL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case MiniJavaPackage.METHOD_DECL__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
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
      case MiniJavaPackage.METHOD_DECL__DOMAIN:
        setDomain(DOMAIN_EDEFAULT);
        return;
      case MiniJavaPackage.METHOD_DECL__EXTRA:
        setExtra(EXTRA_EDEFAULT);
        return;
      case MiniJavaPackage.METHOD_DECL__RET_TYPE:
        setRetType(RET_TYPE_EDEFAULT);
        return;
      case MiniJavaPackage.METHOD_DECL__PARAMS:
        getParams().clear();
        return;
      case MiniJavaPackage.METHOD_DECL__STATEMENTS:
        getStatements().clear();
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
      case MiniJavaPackage.METHOD_DECL__DOMAIN:
        return domain != DOMAIN_EDEFAULT;
      case MiniJavaPackage.METHOD_DECL__EXTRA:
        return extra != EXTRA_EDEFAULT;
      case MiniJavaPackage.METHOD_DECL__RET_TYPE:
        return RET_TYPE_EDEFAULT == null ? retType != null : !RET_TYPE_EDEFAULT.equals(retType);
      case MiniJavaPackage.METHOD_DECL__PARAMS:
        return params != null && !params.isEmpty();
      case MiniJavaPackage.METHOD_DECL__STATEMENTS:
        return statements != null && !statements.isEmpty();
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
    result.append(" (domain: ");
    result.append(domain);
    result.append(", extra: ");
    result.append(extra);
    result.append(", retType: ");
    result.append(retType);
    result.append(')');
    return result.toString();
  }

} //MethodDeclImpl
