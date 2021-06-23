/*
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.serializer;

import com.google.inject.Inject;
import edu.ustb.cmp.miniJava.Assignments;
import edu.ustb.cmp.miniJava.BasicJudge;
import edu.ustb.cmp.miniJava.CalcExp;
import edu.ustb.cmp.miniJava.ClassDecl;
import edu.ustb.cmp.miniJava.CompareExp;
import edu.ustb.cmp.miniJava.ElseStatement;
import edu.ustb.cmp.miniJava.Expression;
import edu.ustb.cmp.miniJava.ImportDecl;
import edu.ustb.cmp.miniJava.JudgeExp;
import edu.ustb.cmp.miniJava.LValueExp;
import edu.ustb.cmp.miniJava.MainClassDecl;
import edu.ustb.cmp.miniJava.MethodDecl;
import edu.ustb.cmp.miniJava.MiniJava;
import edu.ustb.cmp.miniJava.MiniJavaPackage;
import edu.ustb.cmp.miniJava.NewExp;
import edu.ustb.cmp.miniJava.PackageDecl;
import edu.ustb.cmp.miniJava.ReturnStatements;
import edu.ustb.cmp.miniJava.Statement;
import edu.ustb.cmp.miniJava.VariableDecl;
import edu.ustb.cmp.services.MiniJavaGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MiniJavaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MiniJavaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MiniJavaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MiniJavaPackage.ASSIGNMENTS:
				sequence_Assignments(context, (Assignments) semanticObject); 
				return; 
			case MiniJavaPackage.BASIC_JUDGE:
				sequence_BasicJudge(context, (BasicJudge) semanticObject); 
				return; 
			case MiniJavaPackage.CALC_EXP:
				sequence_CalcExp(context, (CalcExp) semanticObject); 
				return; 
			case MiniJavaPackage.CLASS_DECL:
				sequence_ClassDecl(context, (ClassDecl) semanticObject); 
				return; 
			case MiniJavaPackage.COMPARE_EXP:
				sequence_CompareExp(context, (CompareExp) semanticObject); 
				return; 
			case MiniJavaPackage.ELSE_STATEMENT:
				sequence_ElseStatement(context, (ElseStatement) semanticObject); 
				return; 
			case MiniJavaPackage.EXPRESSION:
				if (rule == grammarAccess.getElseIfStatementsRule()) {
					sequence_ElseIfStatements_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExpressionRule()) {
					sequence_Expression(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getIfStatementsRule()) {
					sequence_Expression_IfStatements(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWhileStatementsRule()) {
					sequence_Expression_WhileStatements(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case MiniJavaPackage.IMPORT_DECL:
				sequence_ImportDecl(context, (ImportDecl) semanticObject); 
				return; 
			case MiniJavaPackage.JUDGE_EXP:
				sequence_JudgeExp(context, (JudgeExp) semanticObject); 
				return; 
			case MiniJavaPackage.LVALUE_EXP:
				sequence_LValueExp(context, (LValueExp) semanticObject); 
				return; 
			case MiniJavaPackage.MAIN_CLASS_DECL:
				sequence_MainClassDecl(context, (MainClassDecl) semanticObject); 
				return; 
			case MiniJavaPackage.METHOD_DECL:
				sequence_MethodDecl(context, (MethodDecl) semanticObject); 
				return; 
			case MiniJavaPackage.MINI_JAVA:
				sequence_MiniJava(context, (MiniJava) semanticObject); 
				return; 
			case MiniJavaPackage.NEW_EXP:
				sequence_NewExp(context, (NewExp) semanticObject); 
				return; 
			case MiniJavaPackage.PACKAGE_DECL:
				sequence_PackageDecl(context, (PackageDecl) semanticObject); 
				return; 
			case MiniJavaPackage.PARAMETER:
				sequence_Parameter(context, (edu.ustb.cmp.miniJava.Parameter) semanticObject); 
				return; 
			case MiniJavaPackage.RETURN_STATEMENTS:
				sequence_ReturnStatements(context, (ReturnStatements) semanticObject); 
				return; 
			case MiniJavaPackage.STATEMENT:
				sequence_Statement(context, (Statement) semanticObject); 
				return; 
			case MiniJavaPackage.VARIABLE_DECL:
				sequence_VariableDecl(context, (VariableDecl) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Assignments returns Assignments
	 *
	 * Constraint:
	 *     (leftValue=LValueExp expression=Expression)
	 */
	protected void sequence_Assignments(ISerializationContext context, Assignments semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.ASSIGNMENTS__LEFT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.ASSIGNMENTS__LEFT_VALUE));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.ASSIGNMENTS__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.ASSIGNMENTS__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAssignmentsAccess().getLeftValueLValueExpParserRuleCall_0_0(), semanticObject.getLeftValue());
		feeder.accept(grammarAccess.getAssignmentsAccess().getExpressionExpressionParserRuleCall_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BasicJudge returns BasicJudge
	 *
	 * Constraint:
	 *     (bE=BooleanExp | cmp=CompareExp)
	 */
	protected void sequence_BasicJudge(ISerializationContext context, BasicJudge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CalcExp returns CalcExp
	 *
	 * Constraint:
	 *     (leftName=ID | (leftNum=INT op=Operator rightName=ID) | rightNum=INT)
	 */
	protected void sequence_CalcExp(ISerializationContext context, CalcExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDecl returns ClassDecl
	 *
	 * Constraint:
	 *     (name=ID superClass=[ClassDecl|QualifiedName]? implementz+=[ClassDecl|QualifiedName]? members+=Member*)
	 */
	protected void sequence_ClassDecl(ISerializationContext context, ClassDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompareExp returns CompareExp
	 *
	 * Constraint:
	 *     (id=QualifiedName op=Operator other1+=ID* other2+='null'*)
	 */
	protected void sequence_CompareExp(ISerializationContext context, CompareExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElseIfStatements returns Expression
	 *
	 * Constraint:
	 *     ((const=ConstantValue | ce=CalcExp | je=JudgeExp | ne=NewExp) statements+=Statement*)
	 */
	protected void sequence_ElseIfStatements_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ElseStatement returns ElseStatement
	 *
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_ElseStatement(ISerializationContext context, ElseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Expression
	 *
	 * Constraint:
	 *     (const=ConstantValue | ce=CalcExp | je=JudgeExp | ne=NewExp)
	 */
	protected void sequence_Expression(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IfStatements returns Expression
	 *
	 * Constraint:
	 *     ((const=ConstantValue | ce=CalcExp | je=JudgeExp | ne=NewExp) statements+=Statement* elseIf+=ElseIfStatements* else+=ElseStatement*)
	 */
	protected void sequence_Expression_IfStatements(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WhileStatements returns Expression
	 *
	 * Constraint:
	 *     ((const=ConstantValue | ce=CalcExp | je=JudgeExp | ne=NewExp) statements+=Statement*)
	 */
	protected void sequence_Expression_WhileStatements(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ImportDecl returns ImportDecl
	 *
	 * Constraint:
	 *     anchor=QualifiedName
	 */
	protected void sequence_ImportDecl(ISerializationContext context, ImportDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.IMPORT_DECL__ANCHOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.IMPORT_DECL__ANCHOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportDeclAccess().getAnchorQualifiedNameParserRuleCall_1_0(), semanticObject.getAnchor());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     JudgeExp returns JudgeExp
	 *
	 * Constraint:
	 *     bj=BasicJudge
	 */
	protected void sequence_JudgeExp(ISerializationContext context, JudgeExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.JUDGE_EXP__BJ) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.JUDGE_EXP__BJ));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getJudgeExpAccess().getBjBasicJudgeParserRuleCall_2_0(), semanticObject.getBj());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LValueExp returns LValueExp
	 *
	 * Constraint:
	 *     (id=ID | (exp=Expression id=QualifiedName) | (exp=Expression index=Expression))
	 */
	protected void sequence_LValueExp(ISerializationContext context, LValueExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MainClassDecl returns MainClassDecl
	 *
	 * Constraint:
	 *     (name=ID statements+=Statement*)
	 */
	protected void sequence_MainClassDecl(ISerializationContext context, MainClassDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MethodDecl returns MethodDecl
	 *     Member returns MethodDecl
	 *
	 * Constraint:
	 *     (
	 *         domain=Domain 
	 *         extra=ExtraAttr? 
	 *         retType=ReturnType 
	 *         name=ID 
	 *         params+=Parameter* 
	 *         statements+=Statement*
	 *     )
	 */
	protected void sequence_MethodDecl(ISerializationContext context, MethodDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MiniJava returns MiniJava
	 *
	 * Constraint:
	 *     (package=PackageDecl imports+=ImportDecl* mainclass=MainClassDecl classes+=ClassDecl*)
	 */
	protected void sequence_MiniJava(ISerializationContext context, MiniJava semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NewExp returns NewExp
	 *
	 * Constraint:
	 *     (name=ID params+=Parameter*)
	 */
	protected void sequence_NewExp(ISerializationContext context, NewExp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PackageDecl returns PackageDecl
	 *
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_PackageDecl(ISerializationContext context, PackageDecl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.PACKAGE_DECL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.PACKAGE_DECL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPackageDeclAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (type=DataType name=ID)
	 */
	protected void sequence_Parameter(ISerializationContext context, edu.ustb.cmp.miniJava.Parameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.PARAMETER__TYPE));
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.PARAMETER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParameterAccess().getTypeDataTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReturnStatements returns ReturnStatements
	 *
	 * Constraint:
	 *     exp=Expression
	 */
	protected void sequence_ReturnStatements(ISerializationContext context, ReturnStatements semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MiniJavaPackage.Literals.RETURN_STATEMENTS__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MiniJavaPackage.Literals.RETURN_STATEMENTS__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReturnStatementsAccess().getExpExpressionParserRuleCall_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns Statement
	 *
	 * Constraint:
	 *     (varDef=VariableDecl | assign=Assignments | ifStat=IfStatements | whileStat=WhileStatements | retStat=ReturnStatements)
	 */
	protected void sequence_Statement(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VariableDecl returns VariableDecl
	 *     Member returns VariableDecl
	 *
	 * Constraint:
	 *     (varType=DataType name=ID value=ConstantValue?)
	 */
	protected void sequence_VariableDecl(ISerializationContext context, VariableDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
