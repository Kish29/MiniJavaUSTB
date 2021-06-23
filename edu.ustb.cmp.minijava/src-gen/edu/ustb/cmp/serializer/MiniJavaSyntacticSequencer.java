/*
 * generated by Xtext 2.25.0
 */
package edu.ustb.cmp.serializer;

import com.google.inject.Inject;
import edu.ustb.cmp.services.MiniJavaGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MiniJavaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MiniJavaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_JudgeExp_ExclamationMarkKeyword_0_a;
	protected AbstractElementAlias match_JudgeExp_LeftParenthesisKeyword_1_a;
	protected AbstractElementAlias match_JudgeExp_RightParenthesisKeyword_3_a;
	protected AbstractElementAlias match_Parameter_CommaKeyword_2_q;
	protected AbstractElementAlias match_VariableDecl_EqualsSignKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MiniJavaGrammarAccess) access;
		match_JudgeExp_ExclamationMarkKeyword_0_a = new TokenAlias(true, true, grammarAccess.getJudgeExpAccess().getExclamationMarkKeyword_0());
		match_JudgeExp_LeftParenthesisKeyword_1_a = new TokenAlias(true, true, grammarAccess.getJudgeExpAccess().getLeftParenthesisKeyword_1());
		match_JudgeExp_RightParenthesisKeyword_3_a = new TokenAlias(true, true, grammarAccess.getJudgeExpAccess().getRightParenthesisKeyword_3());
		match_Parameter_CommaKeyword_2_q = new TokenAlias(false, true, grammarAccess.getParameterAccess().getCommaKeyword_2());
		match_VariableDecl_EqualsSignKeyword_2_q = new TokenAlias(false, true, grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_JudgeExp_ExclamationMarkKeyword_0_a.equals(syntax))
				emit_JudgeExp_ExclamationMarkKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_JudgeExp_LeftParenthesisKeyword_1_a.equals(syntax))
				emit_JudgeExp_LeftParenthesisKeyword_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_JudgeExp_RightParenthesisKeyword_3_a.equals(syntax))
				emit_JudgeExp_RightParenthesisKeyword_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parameter_CommaKeyword_2_q.equals(syntax))
				emit_Parameter_CommaKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_VariableDecl_EqualsSignKeyword_2_q.equals(syntax))
				emit_VariableDecl_EqualsSignKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '!'*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '('* bj=BasicJudge
	 */
	protected void emit_JudgeExp_ExclamationMarkKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '!'* (ambiguity) bj=BasicJudge
	 */
	protected void emit_JudgeExp_LeftParenthesisKeyword_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ')'*
	 *
	 * This ambiguous syntax occurs at:
	 *     bj=BasicJudge (ambiguity) (rule end)
	 */
	protected void emit_JudgeExp_RightParenthesisKeyword_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Parameter_CommaKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '='?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ';' (rule end)
	 *     name=ID (ambiguity) value=ConstantValue
	 */
	protected void emit_VariableDecl_EqualsSignKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}