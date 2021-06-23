package edu.ustb.cmp.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.ustb.cmp.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'}'", "'extends'", "'implements'", "'.'", "'int'", "'boolean'", "'double'", "'char'", "'long'", "'='", "','", "'if'", "'else'", "'while'", "'return'", "'!'", "'&'", "'|'", "'+'", "'-'", "'*'", "'%'", "'<<'", "'>>'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'null'", "'new'", "'private'", "'protected'", "'abstract'", "'true'", "'false'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMiniJavaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMiniJavaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMiniJavaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMiniJava.g"; }



     	private MiniJavaGrammarAccess grammarAccess;

        public InternalMiniJavaParser(TokenStream input, MiniJavaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MiniJava";
       	}

       	@Override
       	protected MiniJavaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMiniJava"
    // InternalMiniJava.g:65:1: entryRuleMiniJava returns [EObject current=null] : iv_ruleMiniJava= ruleMiniJava EOF ;
    public final EObject entryRuleMiniJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMiniJava = null;


        try {
            // InternalMiniJava.g:65:49: (iv_ruleMiniJava= ruleMiniJava EOF )
            // InternalMiniJava.g:66:2: iv_ruleMiniJava= ruleMiniJava EOF
            {
             newCompositeNode(grammarAccess.getMiniJavaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMiniJava=ruleMiniJava();

            state._fsp--;

             current =iv_ruleMiniJava; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMiniJava"


    // $ANTLR start "ruleMiniJava"
    // InternalMiniJava.g:72:1: ruleMiniJava returns [EObject current=null] : ( ( (lv_package_0_0= rulePackageDecl ) ) ( (lv_imports_1_0= ruleImportDecl ) )* ( (lv_mainclass_2_0= ruleMainClassDecl ) ) ( (lv_classes_3_0= ruleClassDecl ) )* ) ;
    public final EObject ruleMiniJava() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_mainclass_2_0 = null;

        EObject lv_classes_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:78:2: ( ( ( (lv_package_0_0= rulePackageDecl ) ) ( (lv_imports_1_0= ruleImportDecl ) )* ( (lv_mainclass_2_0= ruleMainClassDecl ) ) ( (lv_classes_3_0= ruleClassDecl ) )* ) )
            // InternalMiniJava.g:79:2: ( ( (lv_package_0_0= rulePackageDecl ) ) ( (lv_imports_1_0= ruleImportDecl ) )* ( (lv_mainclass_2_0= ruleMainClassDecl ) ) ( (lv_classes_3_0= ruleClassDecl ) )* )
            {
            // InternalMiniJava.g:79:2: ( ( (lv_package_0_0= rulePackageDecl ) ) ( (lv_imports_1_0= ruleImportDecl ) )* ( (lv_mainclass_2_0= ruleMainClassDecl ) ) ( (lv_classes_3_0= ruleClassDecl ) )* )
            // InternalMiniJava.g:80:3: ( (lv_package_0_0= rulePackageDecl ) ) ( (lv_imports_1_0= ruleImportDecl ) )* ( (lv_mainclass_2_0= ruleMainClassDecl ) ) ( (lv_classes_3_0= ruleClassDecl ) )*
            {
            // InternalMiniJava.g:80:3: ( (lv_package_0_0= rulePackageDecl ) )
            // InternalMiniJava.g:81:4: (lv_package_0_0= rulePackageDecl )
            {
            // InternalMiniJava.g:81:4: (lv_package_0_0= rulePackageDecl )
            // InternalMiniJava.g:82:5: lv_package_0_0= rulePackageDecl
            {

            					newCompositeNode(grammarAccess.getMiniJavaAccess().getPackagePackageDeclParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_package_0_0=rulePackageDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMiniJavaRule());
            					}
            					set(
            						current,
            						"package",
            						lv_package_0_0,
            						"edu.ustb.cmp.MiniJava.PackageDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:99:3: ( (lv_imports_1_0= ruleImportDecl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMiniJava.g:100:4: (lv_imports_1_0= ruleImportDecl )
            	    {
            	    // InternalMiniJava.g:100:4: (lv_imports_1_0= ruleImportDecl )
            	    // InternalMiniJava.g:101:5: lv_imports_1_0= ruleImportDecl
            	    {

            	    					newCompositeNode(grammarAccess.getMiniJavaAccess().getImportsImportDeclParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImportDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMiniJavaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"edu.ustb.cmp.MiniJava.ImportDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMiniJava.g:118:3: ( (lv_mainclass_2_0= ruleMainClassDecl ) )
            // InternalMiniJava.g:119:4: (lv_mainclass_2_0= ruleMainClassDecl )
            {
            // InternalMiniJava.g:119:4: (lv_mainclass_2_0= ruleMainClassDecl )
            // InternalMiniJava.g:120:5: lv_mainclass_2_0= ruleMainClassDecl
            {

            					newCompositeNode(grammarAccess.getMiniJavaAccess().getMainclassMainClassDeclParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_mainclass_2_0=ruleMainClassDecl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMiniJavaRule());
            					}
            					set(
            						current,
            						"mainclass",
            						lv_mainclass_2_0,
            						"edu.ustb.cmp.MiniJava.MainClassDecl");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:137:3: ( (lv_classes_3_0= ruleClassDecl ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMiniJava.g:138:4: (lv_classes_3_0= ruleClassDecl )
            	    {
            	    // InternalMiniJava.g:138:4: (lv_classes_3_0= ruleClassDecl )
            	    // InternalMiniJava.g:139:5: lv_classes_3_0= ruleClassDecl
            	    {

            	    					newCompositeNode(grammarAccess.getMiniJavaAccess().getClassesClassDeclParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_classes_3_0=ruleClassDecl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMiniJavaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"classes",
            	    						lv_classes_3_0,
            	    						"edu.ustb.cmp.MiniJava.ClassDecl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMiniJava"


    // $ANTLR start "entryRulePackageDecl"
    // InternalMiniJava.g:160:1: entryRulePackageDecl returns [EObject current=null] : iv_rulePackageDecl= rulePackageDecl EOF ;
    public final EObject entryRulePackageDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDecl = null;


        try {
            // InternalMiniJava.g:160:52: (iv_rulePackageDecl= rulePackageDecl EOF )
            // InternalMiniJava.g:161:2: iv_rulePackageDecl= rulePackageDecl EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDecl=rulePackageDecl();

            state._fsp--;

             current =iv_rulePackageDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDecl"


    // $ANTLR start "rulePackageDecl"
    // InternalMiniJava.g:167:1: rulePackageDecl returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject rulePackageDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:173:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:174:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:174:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // InternalMiniJava.g:175:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclAccess().getPackageKeyword_0());
            		
            // InternalMiniJava.g:179:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalMiniJava.g:180:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalMiniJava.g:180:4: (lv_name_1_0= ruleQualifiedName )
            // InternalMiniJava.g:181:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"edu.ustb.cmp.MiniJava.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDecl"


    // $ANTLR start "entryRuleImportDecl"
    // InternalMiniJava.g:206:1: entryRuleImportDecl returns [EObject current=null] : iv_ruleImportDecl= ruleImportDecl EOF ;
    public final EObject entryRuleImportDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDecl = null;


        try {
            // InternalMiniJava.g:206:51: (iv_ruleImportDecl= ruleImportDecl EOF )
            // InternalMiniJava.g:207:2: iv_ruleImportDecl= ruleImportDecl EOF
            {
             newCompositeNode(grammarAccess.getImportDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImportDecl=ruleImportDecl();

            state._fsp--;

             current =iv_ruleImportDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDecl"


    // $ANTLR start "ruleImportDecl"
    // InternalMiniJava.g:213:1: ruleImportDecl returns [EObject current=null] : (otherlv_0= 'import' ( (lv_anchor_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject ruleImportDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_anchor_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:219:2: ( (otherlv_0= 'import' ( (lv_anchor_1_0= ruleQualifiedName ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:220:2: (otherlv_0= 'import' ( (lv_anchor_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:220:2: (otherlv_0= 'import' ( (lv_anchor_1_0= ruleQualifiedName ) ) otherlv_2= ';' )
            // InternalMiniJava.g:221:3: otherlv_0= 'import' ( (lv_anchor_1_0= ruleQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportDeclAccess().getImportKeyword_0());
            		
            // InternalMiniJava.g:225:3: ( (lv_anchor_1_0= ruleQualifiedName ) )
            // InternalMiniJava.g:226:4: (lv_anchor_1_0= ruleQualifiedName )
            {
            // InternalMiniJava.g:226:4: (lv_anchor_1_0= ruleQualifiedName )
            // InternalMiniJava.g:227:5: lv_anchor_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getImportDeclAccess().getAnchorQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_anchor_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportDeclRule());
            					}
            					set(
            						current,
            						"anchor",
            						lv_anchor_1_0,
            						"edu.ustb.cmp.MiniJava.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportDeclAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDecl"


    // $ANTLR start "entryRuleMainClassDecl"
    // InternalMiniJava.g:252:1: entryRuleMainClassDecl returns [EObject current=null] : iv_ruleMainClassDecl= ruleMainClassDecl EOF ;
    public final EObject entryRuleMainClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainClassDecl = null;


        try {
            // InternalMiniJava.g:252:54: (iv_ruleMainClassDecl= ruleMainClassDecl EOF )
            // InternalMiniJava.g:253:2: iv_ruleMainClassDecl= ruleMainClassDecl EOF
            {
             newCompositeNode(grammarAccess.getMainClassDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMainClassDecl=ruleMainClassDecl();

            state._fsp--;

             current =iv_ruleMainClassDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMainClassDecl"


    // $ANTLR start "ruleMainClassDecl"
    // InternalMiniJava.g:259:1: ruleMainClassDecl returns [EObject current=null] : ( () otherlv_1= 'class' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'public' otherlv_5= 'static' otherlv_6= 'void' otherlv_7= 'main' otherlv_8= '(' otherlv_9= 'String' otherlv_10= '[' otherlv_11= ']' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_statements_15_0= ruleStatement ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleMainClassDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_statements_15_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:265:2: ( ( () otherlv_1= 'class' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'public' otherlv_5= 'static' otherlv_6= 'void' otherlv_7= 'main' otherlv_8= '(' otherlv_9= 'String' otherlv_10= '[' otherlv_11= ']' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_statements_15_0= ruleStatement ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // InternalMiniJava.g:266:2: ( () otherlv_1= 'class' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'public' otherlv_5= 'static' otherlv_6= 'void' otherlv_7= 'main' otherlv_8= '(' otherlv_9= 'String' otherlv_10= '[' otherlv_11= ']' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_statements_15_0= ruleStatement ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalMiniJava.g:266:2: ( () otherlv_1= 'class' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'public' otherlv_5= 'static' otherlv_6= 'void' otherlv_7= 'main' otherlv_8= '(' otherlv_9= 'String' otherlv_10= '[' otherlv_11= ']' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_statements_15_0= ruleStatement ) )* otherlv_16= '}' otherlv_17= '}' )
            // InternalMiniJava.g:267:3: () otherlv_1= 'class' this_ID_2= RULE_ID otherlv_3= '{' otherlv_4= 'public' otherlv_5= 'static' otherlv_6= 'void' otherlv_7= 'main' otherlv_8= '(' otherlv_9= 'String' otherlv_10= '[' otherlv_11= ']' ( (lv_name_12_0= RULE_ID ) ) otherlv_13= ')' otherlv_14= '{' ( (lv_statements_15_0= ruleStatement ) )* otherlv_16= '}' otherlv_17= '}'
            {
            // InternalMiniJava.g:267:3: ()
            // InternalMiniJava.g:268:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMainClassDeclAccess().getMainClassDeclAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getMainClassDeclAccess().getClassKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            			newLeafNode(this_ID_2, grammarAccess.getMainClassDeclAccess().getIDTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMainClassDeclAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getMainClassDeclAccess().getPublicKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getMainClassDeclAccess().getStaticKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getMainClassDeclAccess().getVoidKeyword_6());
            		
            otherlv_7=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getMainClassDeclAccess().getMainKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getMainClassDeclAccess().getLeftParenthesisKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getMainClassDeclAccess().getStringKeyword_9());
            		
            otherlv_10=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_10, grammarAccess.getMainClassDeclAccess().getLeftSquareBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_11, grammarAccess.getMainClassDeclAccess().getRightSquareBracketKeyword_11());
            		
            // InternalMiniJava.g:318:3: ( (lv_name_12_0= RULE_ID ) )
            // InternalMiniJava.g:319:4: (lv_name_12_0= RULE_ID )
            {
            // InternalMiniJava.g:319:4: (lv_name_12_0= RULE_ID )
            // InternalMiniJava.g:320:5: lv_name_12_0= RULE_ID
            {
            lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_12_0, grammarAccess.getMainClassDeclAccess().getNameIDTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMainClassDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_12_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_13=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getMainClassDeclAccess().getRightParenthesisKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_14, grammarAccess.getMainClassDeclAccess().getLeftCurlyBracketKeyword_14());
            		
            // InternalMiniJava.g:344:3: ( (lv_statements_15_0= ruleStatement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==20||(LA3_0>=29 && LA3_0<=33)||LA3_0==36||(LA3_0>=38 && LA3_0<=40)||LA3_0==56||(LA3_0>=60 && LA3_0<=61)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMiniJava.g:345:4: (lv_statements_15_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:345:4: (lv_statements_15_0= ruleStatement )
            	    // InternalMiniJava.g:346:5: lv_statements_15_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMainClassDeclAccess().getStatementsStatementParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_statements_15_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMainClassDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_15_0,
            	    						"edu.ustb.cmp.MiniJava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_16=(Token)match(input,25,FOLLOW_18); 

            			newLeafNode(otherlv_16, grammarAccess.getMainClassDeclAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_17=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getMainClassDeclAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainClassDecl"


    // $ANTLR start "entryRuleClassDecl"
    // InternalMiniJava.g:375:1: entryRuleClassDecl returns [EObject current=null] : iv_ruleClassDecl= ruleClassDecl EOF ;
    public final EObject entryRuleClassDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDecl = null;


        try {
            // InternalMiniJava.g:375:50: (iv_ruleClassDecl= ruleClassDecl EOF )
            // InternalMiniJava.g:376:2: iv_ruleClassDecl= ruleClassDecl EOF
            {
             newCompositeNode(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDecl=ruleClassDecl();

            state._fsp--;

             current =iv_ruleClassDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // InternalMiniJava.g:382:1: ruleClassDecl returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' ) ;
    public final EObject ruleClassDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_members_7_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:388:2: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' ) )
            // InternalMiniJava.g:389:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )
            {
            // InternalMiniJava.g:389:2: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}' )
            // InternalMiniJava.g:390:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? (otherlv_4= 'implements' ( ( ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_members_7_0= ruleMember ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getClassDeclAccess().getClassKeyword_0());
            		
            // InternalMiniJava.g:394:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:395:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:395:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:396:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(lv_name_1_0, grammarAccess.getClassDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMiniJava.g:412:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:413:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getClassDeclAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMiniJava.g:417:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava.g:418:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:418:5: ( ruleQualifiedName )
                    // InternalMiniJava.g:419:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDeclRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassDeclAccess().getSuperClassClassDeclCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMiniJava.g:434:3: (otherlv_4= 'implements' ( ( ruleQualifiedName ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:435:4: otherlv_4= 'implements' ( ( ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getClassDeclAccess().getImplementsKeyword_3_0());
                    			
                    // InternalMiniJava.g:439:4: ( ( ruleQualifiedName ) )
                    // InternalMiniJava.g:440:5: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:440:5: ( ruleQualifiedName )
                    // InternalMiniJava.g:441:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getClassDeclRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getClassDeclAccess().getImplementzClassDeclCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getClassDeclAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMiniJava.g:460:3: ( (lv_members_7_0= ruleMember ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==16||(LA6_0>=29 && LA6_0<=33)||(LA6_0>=57 && LA6_0<=58)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMiniJava.g:461:4: (lv_members_7_0= ruleMember )
            	    {
            	    // InternalMiniJava.g:461:4: (lv_members_7_0= ruleMember )
            	    // InternalMiniJava.g:462:5: lv_members_7_0= ruleMember
            	    {

            	    					newCompositeNode(grammarAccess.getClassDeclAccess().getMembersMemberParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_members_7_0=ruleMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getClassDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"members",
            	    						lv_members_7_0,
            	    						"edu.ustb.cmp.MiniJava.Member");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getClassDeclAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava.g:487:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMiniJava.g:487:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMiniJava.g:488:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava.g:494:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:500:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMiniJava.g:501:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMiniJava.g:501:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMiniJava.g:502:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMiniJava.g:509:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMiniJava.g:510:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_22); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalMiniJava.g:527:1: entryRuleDoubleLiteral returns [String current=null] : iv_ruleDoubleLiteral= ruleDoubleLiteral EOF ;
    public final String entryRuleDoubleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDoubleLiteral = null;


        try {
            // InternalMiniJava.g:527:53: (iv_ruleDoubleLiteral= ruleDoubleLiteral EOF )
            // InternalMiniJava.g:528:2: iv_ruleDoubleLiteral= ruleDoubleLiteral EOF
            {
             newCompositeNode(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleLiteral=ruleDoubleLiteral();

            state._fsp--;

             current =iv_ruleDoubleLiteral.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalMiniJava.g:534:1: ruleDoubleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDoubleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:540:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMiniJava.g:541:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMiniJava.g:541:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMiniJava.g:542:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_23); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,28,FOLLOW_24); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // InternalMiniJava.g:565:1: entryRuleConstantValue returns [String current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final String entryRuleConstantValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantValue = null;


        try {
            // InternalMiniJava.g:565:53: (iv_ruleConstantValue= ruleConstantValue EOF )
            // InternalMiniJava.g:566:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
             newCompositeNode(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;

             current =iv_ruleConstantValue.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalMiniJava.g:572:1: ruleConstantValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_DoubleLiteral_2= ruleDoubleLiteral ) ;
    public final AntlrDatatypeRuleToken ruleConstantValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_INT_1=null;
        AntlrDatatypeRuleToken this_DoubleLiteral_2 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:578:2: ( (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_DoubleLiteral_2= ruleDoubleLiteral ) )
            // InternalMiniJava.g:579:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_DoubleLiteral_2= ruleDoubleLiteral )
            {
            // InternalMiniJava.g:579:2: (this_STRING_0= RULE_STRING | this_INT_1= RULE_INT | this_DoubleLiteral_2= ruleDoubleLiteral )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==EOF||LA8_2==12||(LA8_2>=22 && LA8_2<=24)) ) {
                    alt8=2;
                }
                else if ( (LA8_2==28) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==RULE_ID) ) {
                        alt8=2;
                    }
                    else if ( (LA8_4==RULE_INT) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:580:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getConstantValueAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:588:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getConstantValueAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:596:3: this_DoubleLiteral_2= ruleDoubleLiteral
                    {

                    			newCompositeNode(grammarAccess.getConstantValueAccess().getDoubleLiteralParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleLiteral_2=ruleDoubleLiteral();

                    state._fsp--;


                    			current.merge(this_DoubleLiteral_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleBasicDataType"
    // InternalMiniJava.g:610:1: entryRuleBasicDataType returns [String current=null] : iv_ruleBasicDataType= ruleBasicDataType EOF ;
    public final String entryRuleBasicDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicDataType = null;


        try {
            // InternalMiniJava.g:610:53: (iv_ruleBasicDataType= ruleBasicDataType EOF )
            // InternalMiniJava.g:611:2: iv_ruleBasicDataType= ruleBasicDataType EOF
            {
             newCompositeNode(grammarAccess.getBasicDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicDataType=ruleBasicDataType();

            state._fsp--;

             current =iv_ruleBasicDataType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicDataType"


    // $ANTLR start "ruleBasicDataType"
    // InternalMiniJava.g:617:1: ruleBasicDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'boolean' | kw= 'double' | kw= 'char' | kw= 'long' ) ;
    public final AntlrDatatypeRuleToken ruleBasicDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMiniJava.g:623:2: ( (kw= 'int' | kw= 'boolean' | kw= 'double' | kw= 'char' | kw= 'long' ) )
            // InternalMiniJava.g:624:2: (kw= 'int' | kw= 'boolean' | kw= 'double' | kw= 'char' | kw= 'long' )
            {
            // InternalMiniJava.g:624:2: (kw= 'int' | kw= 'boolean' | kw= 'double' | kw= 'char' | kw= 'long' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case 31:
                {
                alt9=3;
                }
                break;
            case 32:
                {
                alt9=4;
                }
                break;
            case 33:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:625:3: kw= 'int'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicDataTypeAccess().getIntKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:631:3: kw= 'boolean'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicDataTypeAccess().getBooleanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:637:3: kw= 'double'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicDataTypeAccess().getDoubleKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:643:3: kw= 'char'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicDataTypeAccess().getCharKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:649:3: kw= 'long'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBasicDataTypeAccess().getLongKeyword_4());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicDataType"


    // $ANTLR start "entryRuleDataType"
    // InternalMiniJava.g:658:1: entryRuleDataType returns [String current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final String entryRuleDataType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataType = null;


        try {
            // InternalMiniJava.g:658:48: (iv_ruleDataType= ruleDataType EOF )
            // InternalMiniJava.g:659:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMiniJava.g:665:1: ruleDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicDataType_0= ruleBasicDataType | this_QualifiedName_1= ruleQualifiedName | (this_BasicDataType_2= ruleBasicDataType kw= '[' kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleDataType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BasicDataType_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_1 = null;

        AntlrDatatypeRuleToken this_BasicDataType_2 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:671:2: ( (this_BasicDataType_0= ruleBasicDataType | this_QualifiedName_1= ruleQualifiedName | (this_BasicDataType_2= ruleBasicDataType kw= '[' kw= ']' ) ) )
            // InternalMiniJava.g:672:2: (this_BasicDataType_0= ruleBasicDataType | this_QualifiedName_1= ruleQualifiedName | (this_BasicDataType_2= ruleBasicDataType kw= '[' kw= ']' ) )
            {
            // InternalMiniJava.g:672:2: (this_BasicDataType_0= ruleBasicDataType | this_QualifiedName_1= ruleQualifiedName | (this_BasicDataType_2= ruleBasicDataType kw= '[' kw= ']' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==22) ) {
                    alt10=3;
                }
                else if ( (LA10_1==EOF||LA10_1==RULE_ID) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==EOF||LA10_2==RULE_ID) ) {
                    alt10=1;
                }
                else if ( (LA10_2==22) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==EOF||LA10_3==RULE_ID) ) {
                    alt10=1;
                }
                else if ( (LA10_3==22) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA10_4 = input.LA(2);

                if ( (LA10_4==EOF||LA10_4==RULE_ID) ) {
                    alt10=1;
                }
                else if ( (LA10_4==22) ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA10_5 = input.LA(2);

                if ( (LA10_5==22) ) {
                    alt10=3;
                }
                else if ( (LA10_5==EOF||LA10_5==RULE_ID) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMiniJava.g:673:3: this_BasicDataType_0= ruleBasicDataType
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getBasicDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BasicDataType_0=ruleBasicDataType();

                    state._fsp--;


                    			current.merge(this_BasicDataType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:684:3: this_QualifiedName_1= ruleQualifiedName
                    {

                    			newCompositeNode(grammarAccess.getDataTypeAccess().getQualifiedNameParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedName_1=ruleQualifiedName();

                    state._fsp--;


                    			current.merge(this_QualifiedName_1);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:695:3: (this_BasicDataType_2= ruleBasicDataType kw= '[' kw= ']' )
                    {
                    // InternalMiniJava.g:695:3: (this_BasicDataType_2= ruleBasicDataType kw= '[' kw= ']' )
                    // InternalMiniJava.g:696:4: this_BasicDataType_2= ruleBasicDataType kw= '[' kw= ']'
                    {

                    				newCompositeNode(grammarAccess.getDataTypeAccess().getBasicDataTypeParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_14);
                    this_BasicDataType_2=ruleBasicDataType();

                    state._fsp--;


                    				current.merge(this_BasicDataType_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,22,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    kw=(Token)match(input,23,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalMiniJava.g:721:1: entryRuleVariableDecl returns [EObject current=null] : iv_ruleVariableDecl= ruleVariableDecl EOF ;
    public final EObject entryRuleVariableDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDecl = null;


        try {
            // InternalMiniJava.g:721:53: (iv_ruleVariableDecl= ruleVariableDecl EOF )
            // InternalMiniJava.g:722:2: iv_ruleVariableDecl= ruleVariableDecl EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDecl=ruleVariableDecl();

            state._fsp--;

             current =iv_ruleVariableDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // InternalMiniJava.g:728:1: ruleVariableDecl returns [EObject current=null] : ( ( (lv_varType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleConstantValue ) )? otherlv_4= ';' ) ;
    public final EObject ruleVariableDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_varType_0_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:734:2: ( ( ( (lv_varType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleConstantValue ) )? otherlv_4= ';' ) )
            // InternalMiniJava.g:735:2: ( ( (lv_varType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleConstantValue ) )? otherlv_4= ';' )
            {
            // InternalMiniJava.g:735:2: ( ( (lv_varType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleConstantValue ) )? otherlv_4= ';' )
            // InternalMiniJava.g:736:3: ( (lv_varType_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' )? ( (lv_value_3_0= ruleConstantValue ) )? otherlv_4= ';'
            {
            // InternalMiniJava.g:736:3: ( (lv_varType_0_0= ruleDataType ) )
            // InternalMiniJava.g:737:4: (lv_varType_0_0= ruleDataType )
            {
            // InternalMiniJava.g:737:4: (lv_varType_0_0= ruleDataType )
            // InternalMiniJava.g:738:5: lv_varType_0_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getVariableDeclAccess().getVarTypeDataTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_varType_0_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclRule());
            					}
            					set(
            						current,
            						"varType",
            						lv_varType_0_0,
            						"edu.ustb.cmp.MiniJava.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:755:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:756:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:756:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:757:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMiniJava.g:773:3: (otherlv_2= '=' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMiniJava.g:774:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_26); 

                    				newLeafNode(otherlv_2, grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_2());
                    			

                    }
                    break;

            }

            // InternalMiniJava.g:779:3: ( (lv_value_3_0= ruleConstantValue ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_INT && LA12_0<=RULE_STRING)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:780:4: (lv_value_3_0= ruleConstantValue )
                    {
                    // InternalMiniJava.g:780:4: (lv_value_3_0= ruleConstantValue )
                    // InternalMiniJava.g:781:5: lv_value_3_0= ruleConstantValue
                    {

                    					newCompositeNode(grammarAccess.getVariableDeclAccess().getValueConstantValueParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_value_3_0=ruleConstantValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVariableDeclRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"edu.ustb.cmp.MiniJava.ConstantValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableDeclAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleReturnType"
    // InternalMiniJava.g:806:1: entryRuleReturnType returns [String current=null] : iv_ruleReturnType= ruleReturnType EOF ;
    public final String entryRuleReturnType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnType = null;


        try {
            // InternalMiniJava.g:806:50: (iv_ruleReturnType= ruleReturnType EOF )
            // InternalMiniJava.g:807:2: iv_ruleReturnType= ruleReturnType EOF
            {
             newCompositeNode(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnType=ruleReturnType();

            state._fsp--;

             current =iv_ruleReturnType.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalMiniJava.g:813:1: ruleReturnType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DataType_0= ruleDataType | kw= 'void' ) ;
    public final AntlrDatatypeRuleToken ruleReturnType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_DataType_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:819:2: ( (this_DataType_0= ruleDataType | kw= 'void' ) )
            // InternalMiniJava.g:820:2: (this_DataType_0= ruleDataType | kw= 'void' )
            {
            // InternalMiniJava.g:820:2: (this_DataType_0= ruleDataType | kw= 'void' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=29 && LA13_0<=33)) ) {
                alt13=1;
            }
            else if ( (LA13_0==18) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:821:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getReturnTypeAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current.merge(this_DataType_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:832:3: kw= 'void'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReturnTypeAccess().getVoidKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:841:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMiniJava.g:841:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMiniJava.g:842:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMiniJava.g:848:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:854:2: ( ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? ) )
            // InternalMiniJava.g:855:2: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )
            {
            // InternalMiniJava.g:855:2: ( ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )? )
            // InternalMiniJava.g:856:3: ( (lv_type_0_0= ruleDataType ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ',' )?
            {
            // InternalMiniJava.g:856:3: ( (lv_type_0_0= ruleDataType ) )
            // InternalMiniJava.g:857:4: (lv_type_0_0= ruleDataType )
            {
            // InternalMiniJava.g:857:4: (lv_type_0_0= ruleDataType )
            // InternalMiniJava.g:858:5: lv_type_0_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeDataTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_type_0_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"edu.ustb.cmp.MiniJava.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:875:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:876:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:876:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:877:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMiniJava.g:893:3: (otherlv_2= ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniJava.g:894:4: otherlv_2= ','
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getCommaKeyword_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMethodDecl"
    // InternalMiniJava.g:903:1: entryRuleMethodDecl returns [EObject current=null] : iv_ruleMethodDecl= ruleMethodDecl EOF ;
    public final EObject entryRuleMethodDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDecl = null;


        try {
            // InternalMiniJava.g:903:51: (iv_ruleMethodDecl= ruleMethodDecl EOF )
            // InternalMiniJava.g:904:2: iv_ruleMethodDecl= ruleMethodDecl EOF
            {
             newCompositeNode(grammarAccess.getMethodDeclRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethodDecl=ruleMethodDecl();

            state._fsp--;

             current =iv_ruleMethodDecl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // InternalMiniJava.g:910:1: ruleMethodDecl returns [EObject current=null] : ( ( (lv_domain_0_0= ruleDomain ) ) ( (lv_extra_1_0= ruleExtraAttr ) )? ( (lv_retType_2_0= ruleReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_params_5_0= ruleParameter ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' ) ;
    public final EObject ruleMethodDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_domain_0_0 = null;

        Enumerator lv_extra_1_0 = null;

        AntlrDatatypeRuleToken lv_retType_2_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_statements_8_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:916:2: ( ( ( (lv_domain_0_0= ruleDomain ) ) ( (lv_extra_1_0= ruleExtraAttr ) )? ( (lv_retType_2_0= ruleReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_params_5_0= ruleParameter ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' ) )
            // InternalMiniJava.g:917:2: ( ( (lv_domain_0_0= ruleDomain ) ) ( (lv_extra_1_0= ruleExtraAttr ) )? ( (lv_retType_2_0= ruleReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_params_5_0= ruleParameter ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' )
            {
            // InternalMiniJava.g:917:2: ( ( (lv_domain_0_0= ruleDomain ) ) ( (lv_extra_1_0= ruleExtraAttr ) )? ( (lv_retType_2_0= ruleReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_params_5_0= ruleParameter ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}' )
            // InternalMiniJava.g:918:3: ( (lv_domain_0_0= ruleDomain ) ) ( (lv_extra_1_0= ruleExtraAttr ) )? ( (lv_retType_2_0= ruleReturnType ) ) ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_params_5_0= ruleParameter ) )* otherlv_6= ')' otherlv_7= '{' ( (lv_statements_8_0= ruleStatement ) )* otherlv_9= '}'
            {
            // InternalMiniJava.g:918:3: ( (lv_domain_0_0= ruleDomain ) )
            // InternalMiniJava.g:919:4: (lv_domain_0_0= ruleDomain )
            {
            // InternalMiniJava.g:919:4: (lv_domain_0_0= ruleDomain )
            // InternalMiniJava.g:920:5: lv_domain_0_0= ruleDomain
            {

            					newCompositeNode(grammarAccess.getMethodDeclAccess().getDomainDomainEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_domain_0_0=ruleDomain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            					}
            					set(
            						current,
            						"domain",
            						lv_domain_0_0,
            						"edu.ustb.cmp.MiniJava.Domain");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:937:3: ( (lv_extra_1_0= ruleExtraAttr ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17||LA15_0==59) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMiniJava.g:938:4: (lv_extra_1_0= ruleExtraAttr )
                    {
                    // InternalMiniJava.g:938:4: (lv_extra_1_0= ruleExtraAttr )
                    // InternalMiniJava.g:939:5: lv_extra_1_0= ruleExtraAttr
                    {

                    					newCompositeNode(grammarAccess.getMethodDeclAccess().getExtraExtraAttrEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_28);
                    lv_extra_1_0=ruleExtraAttr();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
                    					}
                    					set(
                    						current,
                    						"extra",
                    						lv_extra_1_0,
                    						"edu.ustb.cmp.MiniJava.ExtraAttr");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMiniJava.g:956:3: ( (lv_retType_2_0= ruleReturnType ) )
            // InternalMiniJava.g:957:4: (lv_retType_2_0= ruleReturnType )
            {
            // InternalMiniJava.g:957:4: (lv_retType_2_0= ruleReturnType )
            // InternalMiniJava.g:958:5: lv_retType_2_0= ruleReturnType
            {

            					newCompositeNode(grammarAccess.getMethodDeclAccess().getRetTypeReturnTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_retType_2_0=ruleReturnType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            					}
            					set(
            						current,
            						"retType",
            						lv_retType_2_0,
            						"edu.ustb.cmp.MiniJava.ReturnType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:975:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMiniJava.g:976:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMiniJava.g:976:4: (lv_name_3_0= RULE_ID )
            // InternalMiniJava.g:977:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodDeclRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMiniJava.g:997:3: ( (lv_params_5_0= ruleParameter ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=29 && LA16_0<=33)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniJava.g:998:4: (lv_params_5_0= ruleParameter )
            	    {
            	    // InternalMiniJava.g:998:4: (lv_params_5_0= ruleParameter )
            	    // InternalMiniJava.g:999:5: lv_params_5_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDeclAccess().getParamsParameterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_params_5_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_5_0,
            	    						"edu.ustb.cmp.MiniJava.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMiniJava.g:1024:3: ( (lv_statements_8_0= ruleStatement ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==20||(LA17_0>=29 && LA17_0<=33)||LA17_0==36||(LA17_0>=38 && LA17_0<=40)||LA17_0==56||(LA17_0>=60 && LA17_0<=61)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniJava.g:1025:4: (lv_statements_8_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:1025:4: (lv_statements_8_0= ruleStatement )
            	    // InternalMiniJava.g:1026:5: lv_statements_8_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_statements_8_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMethodDeclRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_8_0,
            	    						"edu.ustb.cmp.MiniJava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava.g:1051:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalMiniJava.g:1051:47: (iv_ruleMember= ruleMember EOF )
            // InternalMiniJava.g:1052:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava.g:1058:1: ruleMember returns [EObject current=null] : (this_VariableDecl_0= ruleVariableDecl | this_MethodDecl_1= ruleMethodDecl ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDecl_0 = null;

        EObject this_MethodDecl_1 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1064:2: ( (this_VariableDecl_0= ruleVariableDecl | this_MethodDecl_1= ruleMethodDecl ) )
            // InternalMiniJava.g:1065:2: (this_VariableDecl_0= ruleVariableDecl | this_MethodDecl_1= ruleMethodDecl )
            {
            // InternalMiniJava.g:1065:2: (this_VariableDecl_0= ruleVariableDecl | this_MethodDecl_1= ruleMethodDecl )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||(LA18_0>=29 && LA18_0<=33)) ) {
                alt18=1;
            }
            else if ( (LA18_0==16||(LA18_0>=57 && LA18_0<=58)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:1066:3: this_VariableDecl_0= ruleVariableDecl
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getVariableDeclParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDecl_0=ruleVariableDecl();

                    state._fsp--;


                    			current = this_VariableDecl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1075:3: this_MethodDecl_1= ruleMethodDecl
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MethodDecl_1=ruleMethodDecl();

                    state._fsp--;


                    			current = this_MethodDecl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:1087:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalMiniJava.g:1087:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalMiniJava.g:1088:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:1094:1: ruleStatement returns [EObject current=null] : ( ( (lv_varDef_0_0= ruleVariableDecl ) ) | ( (lv_assign_1_0= ruleAssignments ) ) | ( (lv_ifStat_2_0= ruleIfStatements ) ) | ( (lv_whileStat_3_0= ruleWhileStatements ) ) | ( (lv_retStat_4_0= ruleReturnStatements ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject lv_varDef_0_0 = null;

        EObject lv_assign_1_0 = null;

        EObject lv_ifStat_2_0 = null;

        EObject lv_whileStat_3_0 = null;

        EObject lv_retStat_4_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1100:2: ( ( ( (lv_varDef_0_0= ruleVariableDecl ) ) | ( (lv_assign_1_0= ruleAssignments ) ) | ( (lv_ifStat_2_0= ruleIfStatements ) ) | ( (lv_whileStat_3_0= ruleWhileStatements ) ) | ( (lv_retStat_4_0= ruleReturnStatements ) ) ) )
            // InternalMiniJava.g:1101:2: ( ( (lv_varDef_0_0= ruleVariableDecl ) ) | ( (lv_assign_1_0= ruleAssignments ) ) | ( (lv_ifStat_2_0= ruleIfStatements ) ) | ( (lv_whileStat_3_0= ruleWhileStatements ) ) | ( (lv_retStat_4_0= ruleReturnStatements ) ) )
            {
            // InternalMiniJava.g:1101:2: ( ( (lv_varDef_0_0= ruleVariableDecl ) ) | ( (lv_assign_1_0= ruleAssignments ) ) | ( (lv_ifStat_2_0= ruleIfStatements ) ) | ( (lv_whileStat_3_0= ruleWhileStatements ) ) | ( (lv_retStat_4_0= ruleReturnStatements ) ) )
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalMiniJava.g:1102:3: ( (lv_varDef_0_0= ruleVariableDecl ) )
                    {
                    // InternalMiniJava.g:1102:3: ( (lv_varDef_0_0= ruleVariableDecl ) )
                    // InternalMiniJava.g:1103:4: (lv_varDef_0_0= ruleVariableDecl )
                    {
                    // InternalMiniJava.g:1103:4: (lv_varDef_0_0= ruleVariableDecl )
                    // InternalMiniJava.g:1104:5: lv_varDef_0_0= ruleVariableDecl
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getVarDefVariableDeclParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_varDef_0_0=ruleVariableDecl();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"varDef",
                    						lv_varDef_0_0,
                    						"edu.ustb.cmp.MiniJava.VariableDecl");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1122:3: ( (lv_assign_1_0= ruleAssignments ) )
                    {
                    // InternalMiniJava.g:1122:3: ( (lv_assign_1_0= ruleAssignments ) )
                    // InternalMiniJava.g:1123:4: (lv_assign_1_0= ruleAssignments )
                    {
                    // InternalMiniJava.g:1123:4: (lv_assign_1_0= ruleAssignments )
                    // InternalMiniJava.g:1124:5: lv_assign_1_0= ruleAssignments
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getAssignAssignmentsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_assign_1_0=ruleAssignments();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"assign",
                    						lv_assign_1_0,
                    						"edu.ustb.cmp.MiniJava.Assignments");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1142:3: ( (lv_ifStat_2_0= ruleIfStatements ) )
                    {
                    // InternalMiniJava.g:1142:3: ( (lv_ifStat_2_0= ruleIfStatements ) )
                    // InternalMiniJava.g:1143:4: (lv_ifStat_2_0= ruleIfStatements )
                    {
                    // InternalMiniJava.g:1143:4: (lv_ifStat_2_0= ruleIfStatements )
                    // InternalMiniJava.g:1144:5: lv_ifStat_2_0= ruleIfStatements
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getIfStatIfStatementsParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ifStat_2_0=ruleIfStatements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"ifStat",
                    						lv_ifStat_2_0,
                    						"edu.ustb.cmp.MiniJava.IfStatements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1162:3: ( (lv_whileStat_3_0= ruleWhileStatements ) )
                    {
                    // InternalMiniJava.g:1162:3: ( (lv_whileStat_3_0= ruleWhileStatements ) )
                    // InternalMiniJava.g:1163:4: (lv_whileStat_3_0= ruleWhileStatements )
                    {
                    // InternalMiniJava.g:1163:4: (lv_whileStat_3_0= ruleWhileStatements )
                    // InternalMiniJava.g:1164:5: lv_whileStat_3_0= ruleWhileStatements
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getWhileStatWhileStatementsParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_whileStat_3_0=ruleWhileStatements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"whileStat",
                    						lv_whileStat_3_0,
                    						"edu.ustb.cmp.MiniJava.WhileStatements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1182:3: ( (lv_retStat_4_0= ruleReturnStatements ) )
                    {
                    // InternalMiniJava.g:1182:3: ( (lv_retStat_4_0= ruleReturnStatements ) )
                    // InternalMiniJava.g:1183:4: (lv_retStat_4_0= ruleReturnStatements )
                    {
                    // InternalMiniJava.g:1183:4: (lv_retStat_4_0= ruleReturnStatements )
                    // InternalMiniJava.g:1184:5: lv_retStat_4_0= ruleReturnStatements
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getRetStatReturnStatementsParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_retStat_4_0=ruleReturnStatements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStatementRule());
                    					}
                    					set(
                    						current,
                    						"retStat",
                    						lv_retStat_4_0,
                    						"edu.ustb.cmp.MiniJava.ReturnStatements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLValueExp"
    // InternalMiniJava.g:1205:1: entryRuleLValueExp returns [EObject current=null] : iv_ruleLValueExp= ruleLValueExp EOF ;
    public final EObject entryRuleLValueExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLValueExp = null;


        try {
            // InternalMiniJava.g:1205:50: (iv_ruleLValueExp= ruleLValueExp EOF )
            // InternalMiniJava.g:1206:2: iv_ruleLValueExp= ruleLValueExp EOF
            {
             newCompositeNode(grammarAccess.getLValueExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLValueExp=ruleLValueExp();

            state._fsp--;

             current =iv_ruleLValueExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLValueExp"


    // $ANTLR start "ruleLValueExp"
    // InternalMiniJava.g:1212:1: ruleLValueExp returns [EObject current=null] : ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']' ) ) ;
    public final EObject ruleLValueExp() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_exp_1_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_exp_4_0 = null;

        EObject lv_index_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1218:2: ( ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']' ) ) )
            // InternalMiniJava.g:1219:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']' ) )
            {
            // InternalMiniJava.g:1219:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']' ) )
            int alt20=3;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalMiniJava.g:1220:3: ( (lv_id_0_0= RULE_ID ) )
                    {
                    // InternalMiniJava.g:1220:3: ( (lv_id_0_0= RULE_ID ) )
                    // InternalMiniJava.g:1221:4: (lv_id_0_0= RULE_ID )
                    {
                    // InternalMiniJava.g:1221:4: (lv_id_0_0= RULE_ID )
                    // InternalMiniJava.g:1222:5: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_id_0_0, grammarAccess.getLValueExpAccess().getIdIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLValueExpRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"id",
                    						lv_id_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1239:3: ( ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) ) )
                    {
                    // InternalMiniJava.g:1239:3: ( ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) ) )
                    // InternalMiniJava.g:1240:4: ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) )
                    {
                    // InternalMiniJava.g:1240:4: ( (lv_exp_1_0= ruleExpression ) )
                    // InternalMiniJava.g:1241:5: (lv_exp_1_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1241:5: (lv_exp_1_0= ruleExpression )
                    // InternalMiniJava.g:1242:6: lv_exp_1_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLValueExpAccess().getExpExpressionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_exp_1_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLValueExpRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_1_0,
                    							"edu.ustb.cmp.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getLValueExpAccess().getFullStopKeyword_1_1());
                    			
                    // InternalMiniJava.g:1263:4: ( (lv_id_3_0= ruleQualifiedName ) )
                    // InternalMiniJava.g:1264:5: (lv_id_3_0= ruleQualifiedName )
                    {
                    // InternalMiniJava.g:1264:5: (lv_id_3_0= ruleQualifiedName )
                    // InternalMiniJava.g:1265:6: lv_id_3_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getLValueExpAccess().getIdQualifiedNameParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_id_3_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLValueExpRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"edu.ustb.cmp.MiniJava.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1284:3: ( ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']' )
                    {
                    // InternalMiniJava.g:1284:3: ( ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']' )
                    // InternalMiniJava.g:1285:4: ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']'
                    {
                    // InternalMiniJava.g:1285:4: ( (lv_exp_4_0= ruleExpression ) )
                    // InternalMiniJava.g:1286:5: (lv_exp_4_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1286:5: (lv_exp_4_0= ruleExpression )
                    // InternalMiniJava.g:1287:6: lv_exp_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLValueExpAccess().getExpExpressionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_exp_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLValueExpRule());
                    						}
                    						set(
                    							current,
                    							"exp",
                    							lv_exp_4_0,
                    							"edu.ustb.cmp.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getLValueExpAccess().getLeftSquareBracketKeyword_2_1());
                    			
                    // InternalMiniJava.g:1308:4: ( (lv_index_6_0= ruleExpression ) )
                    // InternalMiniJava.g:1309:5: (lv_index_6_0= ruleExpression )
                    {
                    // InternalMiniJava.g:1309:5: (lv_index_6_0= ruleExpression )
                    // InternalMiniJava.g:1310:6: lv_index_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLValueExpAccess().getIndexExpressionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_index_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLValueExpRule());
                    						}
                    						set(
                    							current,
                    							"index",
                    							lv_index_6_0,
                    							"edu.ustb.cmp.MiniJava.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLValueExpAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLValueExp"


    // $ANTLR start "entryRuleAssignments"
    // InternalMiniJava.g:1336:1: entryRuleAssignments returns [EObject current=null] : iv_ruleAssignments= ruleAssignments EOF ;
    public final EObject entryRuleAssignments() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignments = null;


        try {
            // InternalMiniJava.g:1336:52: (iv_ruleAssignments= ruleAssignments EOF )
            // InternalMiniJava.g:1337:2: iv_ruleAssignments= ruleAssignments EOF
            {
             newCompositeNode(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignments=ruleAssignments();

            state._fsp--;

             current =iv_ruleAssignments; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignments"


    // $ANTLR start "ruleAssignments"
    // InternalMiniJava.g:1343:1: ruleAssignments returns [EObject current=null] : ( ( (lv_leftValue_0_0= ruleLValueExp ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleAssignments() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_leftValue_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1349:2: ( ( ( (lv_leftValue_0_0= ruleLValueExp ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' ) )
            // InternalMiniJava.g:1350:2: ( ( (lv_leftValue_0_0= ruleLValueExp ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            {
            // InternalMiniJava.g:1350:2: ( ( (lv_leftValue_0_0= ruleLValueExp ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';' )
            // InternalMiniJava.g:1351:3: ( (lv_leftValue_0_0= ruleLValueExp ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ';'
            {
            // InternalMiniJava.g:1351:3: ( (lv_leftValue_0_0= ruleLValueExp ) )
            // InternalMiniJava.g:1352:4: (lv_leftValue_0_0= ruleLValueExp )
            {
            // InternalMiniJava.g:1352:4: (lv_leftValue_0_0= ruleLValueExp )
            // InternalMiniJava.g:1353:5: lv_leftValue_0_0= ruleLValueExp
            {

            					newCompositeNode(grammarAccess.getAssignmentsAccess().getLeftValueLValueExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_leftValue_0_0=ruleLValueExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentsRule());
            					}
            					set(
            						current,
            						"leftValue",
            						lv_leftValue_0_0,
            						"edu.ustb.cmp.MiniJava.LValueExp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentsAccess().getEqualsSignKeyword_1());
            		
            // InternalMiniJava.g:1374:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalMiniJava.g:1375:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalMiniJava.g:1375:4: (lv_expression_2_0= ruleExpression )
            // InternalMiniJava.g:1376:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentsAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentsRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"edu.ustb.cmp.MiniJava.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAssignmentsAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignments"


    // $ANTLR start "entryRuleIfStatements"
    // InternalMiniJava.g:1401:1: entryRuleIfStatements returns [EObject current=null] : iv_ruleIfStatements= ruleIfStatements EOF ;
    public final EObject entryRuleIfStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatements = null;


        try {
            // InternalMiniJava.g:1401:53: (iv_ruleIfStatements= ruleIfStatements EOF )
            // InternalMiniJava.g:1402:2: iv_ruleIfStatements= ruleIfStatements EOF
            {
             newCompositeNode(grammarAccess.getIfStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatements=ruleIfStatements();

            state._fsp--;

             current =iv_ruleIfStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStatements"


    // $ANTLR start "ruleIfStatements"
    // InternalMiniJava.g:1408:1: ruleIfStatements returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ( (lv_elseIf_7_0= ruleElseIfStatements ) )* ( (lv_else_8_0= ruleElseStatement ) )* ) ;
    public final EObject ruleIfStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Expression_2 = null;

        EObject lv_statements_5_0 = null;

        EObject lv_elseIf_7_0 = null;

        EObject lv_else_8_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1414:2: ( (otherlv_0= 'if' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ( (lv_elseIf_7_0= ruleElseIfStatements ) )* ( (lv_else_8_0= ruleElseStatement ) )* ) )
            // InternalMiniJava.g:1415:2: (otherlv_0= 'if' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ( (lv_elseIf_7_0= ruleElseIfStatements ) )* ( (lv_else_8_0= ruleElseStatement ) )* )
            {
            // InternalMiniJava.g:1415:2: (otherlv_0= 'if' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ( (lv_elseIf_7_0= ruleElseIfStatements ) )* ( (lv_else_8_0= ruleElseStatement ) )* )
            // InternalMiniJava.g:1416:3: otherlv_0= 'if' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ( (lv_elseIf_7_0= ruleElseIfStatements ) )* ( (lv_else_8_0= ruleElseStatement ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementsAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getIfStatementsAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getIfStatementsAccess().getExpressionParserRuleCall_2());
            		
            pushFollow(FOLLOW_16);
            this_Expression_2=ruleExpression();

            state._fsp--;


            			current = this_Expression_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getIfStatementsAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getIfStatementsAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMiniJava.g:1440:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||LA21_0==20||(LA21_0>=29 && LA21_0<=33)||LA21_0==36||(LA21_0>=38 && LA21_0<=40)||LA21_0==56||(LA21_0>=60 && LA21_0<=61)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMiniJava.g:1441:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:1441:4: (lv_statements_5_0= ruleStatement )
            	    // InternalMiniJava.g:1442:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementsAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"edu.ustb.cmp.MiniJava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getIfStatementsAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalMiniJava.g:1463:3: ( (lv_elseIf_7_0= ruleElseIfStatements ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==36) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalMiniJava.g:1464:4: (lv_elseIf_7_0= ruleElseIfStatements )
            	    {
            	    // InternalMiniJava.g:1464:4: (lv_elseIf_7_0= ruleElseIfStatements )
            	    // InternalMiniJava.g:1465:5: lv_elseIf_7_0= ruleElseIfStatements
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementsAccess().getElseIfElseIfStatementsParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_elseIf_7_0=ruleElseIfStatements();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elseIf",
            	    						lv_elseIf_7_0,
            	    						"edu.ustb.cmp.MiniJava.ElseIfStatements");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalMiniJava.g:1482:3: ( (lv_else_8_0= ruleElseStatement ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==37) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMiniJava.g:1483:4: (lv_else_8_0= ruleElseStatement )
            	    {
            	    // InternalMiniJava.g:1483:4: (lv_else_8_0= ruleElseStatement )
            	    // InternalMiniJava.g:1484:5: lv_else_8_0= ruleElseStatement
            	    {

            	    					newCompositeNode(grammarAccess.getIfStatementsAccess().getElseElseStatementParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_else_8_0=ruleElseStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfStatementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"else",
            	    						lv_else_8_0,
            	    						"edu.ustb.cmp.MiniJava.ElseStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStatements"


    // $ANTLR start "entryRuleElseIfStatements"
    // InternalMiniJava.g:1505:1: entryRuleElseIfStatements returns [EObject current=null] : iv_ruleElseIfStatements= ruleElseIfStatements EOF ;
    public final EObject entryRuleElseIfStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseIfStatements = null;


        try {
            // InternalMiniJava.g:1505:57: (iv_ruleElseIfStatements= ruleElseIfStatements EOF )
            // InternalMiniJava.g:1506:2: iv_ruleElseIfStatements= ruleElseIfStatements EOF
            {
             newCompositeNode(grammarAccess.getElseIfStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseIfStatements=ruleElseIfStatements();

            state._fsp--;

             current =iv_ruleElseIfStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseIfStatements"


    // $ANTLR start "ruleElseIfStatements"
    // InternalMiniJava.g:1512:1: ruleElseIfStatements returns [EObject current=null] : (otherlv_0= 'else' otherlv_1= 'if' otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) ;
    public final EObject ruleElseIfStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_Expression_3 = null;

        EObject lv_statements_6_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1518:2: ( (otherlv_0= 'else' otherlv_1= 'if' otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' ) )
            // InternalMiniJava.g:1519:2: (otherlv_0= 'else' otherlv_1= 'if' otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            {
            // InternalMiniJava.g:1519:2: (otherlv_0= 'else' otherlv_1= 'if' otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}' )
            // InternalMiniJava.g:1520:3: otherlv_0= 'else' otherlv_1= 'if' otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' otherlv_5= '{' ( (lv_statements_6_0= ruleStatement ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getElseIfStatementsAccess().getElseKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getElseIfStatementsAccess().getIfKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getElseIfStatementsAccess().getLeftParenthesisKeyword_2());
            		

            			newCompositeNode(grammarAccess.getElseIfStatementsAccess().getExpressionParserRuleCall_3());
            		
            pushFollow(FOLLOW_16);
            this_Expression_3=ruleExpression();

            state._fsp--;


            			current = this_Expression_3;
            			afterParserOrEnumRuleCall();
            		
            otherlv_4=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getElseIfStatementsAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getElseIfStatementsAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMiniJava.g:1548:3: ( (lv_statements_6_0= ruleStatement ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||LA24_0==20||(LA24_0>=29 && LA24_0<=33)||LA24_0==36||(LA24_0>=38 && LA24_0<=40)||LA24_0==56||(LA24_0>=60 && LA24_0<=61)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMiniJava.g:1549:4: (lv_statements_6_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:1549:4: (lv_statements_6_0= ruleStatement )
            	    // InternalMiniJava.g:1550:5: lv_statements_6_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getElseIfStatementsAccess().getStatementsStatementParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_statements_6_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseIfStatementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_6_0,
            	    						"edu.ustb.cmp.MiniJava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getElseIfStatementsAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseIfStatements"


    // $ANTLR start "entryRuleElseStatement"
    // InternalMiniJava.g:1575:1: entryRuleElseStatement returns [EObject current=null] : iv_ruleElseStatement= ruleElseStatement EOF ;
    public final EObject entryRuleElseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElseStatement = null;


        try {
            // InternalMiniJava.g:1575:54: (iv_ruleElseStatement= ruleElseStatement EOF )
            // InternalMiniJava.g:1576:2: iv_ruleElseStatement= ruleElseStatement EOF
            {
             newCompositeNode(grammarAccess.getElseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElseStatement=ruleElseStatement();

            state._fsp--;

             current =iv_ruleElseStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElseStatement"


    // $ANTLR start "ruleElseStatement"
    // InternalMiniJava.g:1582:1: ruleElseStatement returns [EObject current=null] : ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) ;
    public final EObject ruleElseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statements_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1588:2: ( ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' ) )
            // InternalMiniJava.g:1589:2: ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            {
            // InternalMiniJava.g:1589:2: ( () otherlv_1= 'else' otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}' )
            // InternalMiniJava.g:1590:3: () otherlv_1= 'else' otherlv_2= '{' ( (lv_statements_3_0= ruleStatement ) )* otherlv_4= '}'
            {
            // InternalMiniJava.g:1590:3: ()
            // InternalMiniJava.g:1591:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseStatementAccess().getElseStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getElseStatementAccess().getElseKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getElseStatementAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMiniJava.g:1605:3: ( (lv_statements_3_0= ruleStatement ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_STRING)||LA25_0==20||(LA25_0>=29 && LA25_0<=33)||LA25_0==36||(LA25_0>=38 && LA25_0<=40)||LA25_0==56||(LA25_0>=60 && LA25_0<=61)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMiniJava.g:1606:4: (lv_statements_3_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:1606:4: (lv_statements_3_0= ruleStatement )
            	    // InternalMiniJava.g:1607:5: lv_statements_3_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getElseStatementAccess().getStatementsStatementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_statements_3_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElseStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_3_0,
            	    						"edu.ustb.cmp.MiniJava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getElseStatementAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElseStatement"


    // $ANTLR start "entryRuleWhileStatements"
    // InternalMiniJava.g:1632:1: entryRuleWhileStatements returns [EObject current=null] : iv_ruleWhileStatements= ruleWhileStatements EOF ;
    public final EObject entryRuleWhileStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatements = null;


        try {
            // InternalMiniJava.g:1632:56: (iv_ruleWhileStatements= ruleWhileStatements EOF )
            // InternalMiniJava.g:1633:2: iv_ruleWhileStatements= ruleWhileStatements EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatements=ruleWhileStatements();

            state._fsp--;

             current =iv_ruleWhileStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileStatements"


    // $ANTLR start "ruleWhileStatements"
    // InternalMiniJava.g:1639:1: ruleWhileStatements returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleWhileStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Expression_2 = null;

        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1645:2: ( (otherlv_0= 'while' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' ) )
            // InternalMiniJava.g:1646:2: (otherlv_0= 'while' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
            {
            // InternalMiniJava.g:1646:2: (otherlv_0= 'while' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}' )
            // InternalMiniJava.g:1647:3: otherlv_0= 'while' otherlv_1= '(' this_Expression_2= ruleExpression otherlv_3= ')' otherlv_4= '{' ( (lv_statements_5_0= ruleStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementsAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileStatementsAccess().getLeftParenthesisKeyword_1());
            		

            			newCompositeNode(grammarAccess.getWhileStatementsAccess().getExpressionParserRuleCall_2());
            		
            pushFollow(FOLLOW_16);
            this_Expression_2=ruleExpression();

            state._fsp--;


            			current = this_Expression_2;
            			afterParserOrEnumRuleCall();
            		
            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getWhileStatementsAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileStatementsAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMiniJava.g:1671:3: ( (lv_statements_5_0= ruleStatement ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_STRING)||LA26_0==20||(LA26_0>=29 && LA26_0<=33)||LA26_0==36||(LA26_0>=38 && LA26_0<=40)||LA26_0==56||(LA26_0>=60 && LA26_0<=61)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMiniJava.g:1672:4: (lv_statements_5_0= ruleStatement )
            	    {
            	    // InternalMiniJava.g:1672:4: (lv_statements_5_0= ruleStatement )
            	    // InternalMiniJava.g:1673:5: lv_statements_5_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getWhileStatementsAccess().getStatementsStatementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_statements_5_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileStatementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"edu.ustb.cmp.MiniJava.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getWhileStatementsAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileStatements"


    // $ANTLR start "entryRuleReturnStatements"
    // InternalMiniJava.g:1698:1: entryRuleReturnStatements returns [EObject current=null] : iv_ruleReturnStatements= ruleReturnStatements EOF ;
    public final EObject entryRuleReturnStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStatements = null;


        try {
            // InternalMiniJava.g:1698:57: (iv_ruleReturnStatements= ruleReturnStatements EOF )
            // InternalMiniJava.g:1699:2: iv_ruleReturnStatements= ruleReturnStatements EOF
            {
             newCompositeNode(grammarAccess.getReturnStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturnStatements=ruleReturnStatements();

            state._fsp--;

             current =iv_ruleReturnStatements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStatements"


    // $ANTLR start "ruleReturnStatements"
    // InternalMiniJava.g:1705:1: ruleReturnStatements returns [EObject current=null] : (otherlv_0= 'return' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleReturnStatements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1711:2: ( (otherlv_0= 'return' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ';' ) )
            // InternalMiniJava.g:1712:2: (otherlv_0= 'return' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ';' )
            {
            // InternalMiniJava.g:1712:2: (otherlv_0= 'return' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ';' )
            // InternalMiniJava.g:1713:3: otherlv_0= 'return' ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnStatementsAccess().getReturnKeyword_0());
            		
            // InternalMiniJava.g:1717:3: ( (lv_exp_1_0= ruleExpression ) )
            // InternalMiniJava.g:1718:4: (lv_exp_1_0= ruleExpression )
            {
            // InternalMiniJava.g:1718:4: (lv_exp_1_0= ruleExpression )
            // InternalMiniJava.g:1719:5: lv_exp_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getReturnStatementsAccess().getExpExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_exp_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnStatementsRule());
            					}
            					set(
            						current,
            						"exp",
            						lv_exp_1_0,
            						"edu.ustb.cmp.MiniJava.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getReturnStatementsAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStatements"


    // $ANTLR start "entryRuleOperator"
    // InternalMiniJava.g:1744:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalMiniJava.g:1744:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalMiniJava.g:1745:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMiniJava.g:1751:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '&' | kw= '|' | kw= '+' | kw= '-' | kw= '*' | kw= '%' | kw= '<<' | kw= '>>' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMiniJava.g:1757:2: ( (kw= '!' | kw= '&' | kw= '|' | kw= '+' | kw= '-' | kw= '*' | kw= '%' | kw= '<<' | kw= '>>' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // InternalMiniJava.g:1758:2: (kw= '!' | kw= '&' | kw= '|' | kw= '+' | kw= '-' | kw= '*' | kw= '%' | kw= '<<' | kw= '>>' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // InternalMiniJava.g:1758:2: (kw= '!' | kw= '&' | kw= '|' | kw= '+' | kw= '-' | kw= '*' | kw= '%' | kw= '<<' | kw= '>>' | kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt27=15;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt27=1;
                }
                break;
            case 41:
                {
                alt27=2;
                }
                break;
            case 42:
                {
                alt27=3;
                }
                break;
            case 43:
                {
                alt27=4;
                }
                break;
            case 44:
                {
                alt27=5;
                }
                break;
            case 45:
                {
                alt27=6;
                }
                break;
            case 46:
                {
                alt27=7;
                }
                break;
            case 47:
                {
                alt27=8;
                }
                break;
            case 48:
                {
                alt27=9;
                }
                break;
            case 49:
                {
                alt27=10;
                }
                break;
            case 50:
                {
                alt27=11;
                }
                break;
            case 51:
                {
                alt27=12;
                }
                break;
            case 52:
                {
                alt27=13;
                }
                break;
            case 53:
                {
                alt27=14;
                }
                break;
            case 54:
                {
                alt27=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMiniJava.g:1759:3: kw= '!'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getExclamationMarkKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1765:3: kw= '&'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAmpersandKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1771:3: kw= '|'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getVerticalLineKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1777:3: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPlusSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1783:3: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getHyphenMinusKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1789:3: kw= '*'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getAsteriskKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1795:3: kw= '%'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getPercentSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1801:3: kw= '<<'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignLessThanSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:1807:3: kw= '>>'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMiniJava.g:1813:3: kw= '=='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMiniJava.g:1819:3: kw= '!='
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMiniJava.g:1825:3: kw= '>='
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMiniJava.g:1831:3: kw= '<='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMiniJava.g:1837:3: kw= '>'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalMiniJava.g:1843:3: kw= '<'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_14());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleCalcExp"
    // InternalMiniJava.g:1852:1: entryRuleCalcExp returns [EObject current=null] : iv_ruleCalcExp= ruleCalcExp EOF ;
    public final EObject entryRuleCalcExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalcExp = null;


        try {
            // InternalMiniJava.g:1852:48: (iv_ruleCalcExp= ruleCalcExp EOF )
            // InternalMiniJava.g:1853:2: iv_ruleCalcExp= ruleCalcExp EOF
            {
             newCompositeNode(grammarAccess.getCalcExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalcExp=ruleCalcExp();

            state._fsp--;

             current =iv_ruleCalcExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCalcExp"


    // $ANTLR start "ruleCalcExp"
    // InternalMiniJava.g:1859:1: ruleCalcExp returns [EObject current=null] : ( ( (lv_leftName_0_0= RULE_ID ) ) | ( ( (lv_leftNum_1_0= RULE_INT ) ) ( (lv_op_2_0= ruleOperator ) ) ( (lv_rightName_3_0= RULE_ID ) ) ) | ( (lv_rightNum_4_0= RULE_INT ) ) ) ;
    public final EObject ruleCalcExp() throws RecognitionException {
        EObject current = null;

        Token lv_leftName_0_0=null;
        Token lv_leftNum_1_0=null;
        Token lv_rightName_3_0=null;
        Token lv_rightNum_4_0=null;
        AntlrDatatypeRuleToken lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1865:2: ( ( ( (lv_leftName_0_0= RULE_ID ) ) | ( ( (lv_leftNum_1_0= RULE_INT ) ) ( (lv_op_2_0= ruleOperator ) ) ( (lv_rightName_3_0= RULE_ID ) ) ) | ( (lv_rightNum_4_0= RULE_INT ) ) ) )
            // InternalMiniJava.g:1866:2: ( ( (lv_leftName_0_0= RULE_ID ) ) | ( ( (lv_leftNum_1_0= RULE_INT ) ) ( (lv_op_2_0= ruleOperator ) ) ( (lv_rightName_3_0= RULE_ID ) ) ) | ( (lv_rightNum_4_0= RULE_INT ) ) )
            {
            // InternalMiniJava.g:1866:2: ( ( (lv_leftName_0_0= RULE_ID ) ) | ( ( (lv_leftNum_1_0= RULE_INT ) ) ( (lv_op_2_0= ruleOperator ) ) ( (lv_rightName_3_0= RULE_ID ) ) ) | ( (lv_rightNum_4_0= RULE_INT ) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            else if ( (LA28_0==RULE_INT) ) {
                int LA28_2 = input.LA(2);

                if ( ((LA28_2>=40 && LA28_2<=54)) ) {
                    alt28=2;
                }
                else if ( (LA28_2==EOF||LA28_2==12||(LA28_2>=22 && LA28_2<=24)||LA28_2==28) ) {
                    alt28=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalMiniJava.g:1867:3: ( (lv_leftName_0_0= RULE_ID ) )
                    {
                    // InternalMiniJava.g:1867:3: ( (lv_leftName_0_0= RULE_ID ) )
                    // InternalMiniJava.g:1868:4: (lv_leftName_0_0= RULE_ID )
                    {
                    // InternalMiniJava.g:1868:4: (lv_leftName_0_0= RULE_ID )
                    // InternalMiniJava.g:1869:5: lv_leftName_0_0= RULE_ID
                    {
                    lv_leftName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_leftName_0_0, grammarAccess.getCalcExpAccess().getLeftNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCalcExpRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"leftName",
                    						lv_leftName_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1886:3: ( ( (lv_leftNum_1_0= RULE_INT ) ) ( (lv_op_2_0= ruleOperator ) ) ( (lv_rightName_3_0= RULE_ID ) ) )
                    {
                    // InternalMiniJava.g:1886:3: ( ( (lv_leftNum_1_0= RULE_INT ) ) ( (lv_op_2_0= ruleOperator ) ) ( (lv_rightName_3_0= RULE_ID ) ) )
                    // InternalMiniJava.g:1887:4: ( (lv_leftNum_1_0= RULE_INT ) ) ( (lv_op_2_0= ruleOperator ) ) ( (lv_rightName_3_0= RULE_ID ) )
                    {
                    // InternalMiniJava.g:1887:4: ( (lv_leftNum_1_0= RULE_INT ) )
                    // InternalMiniJava.g:1888:5: (lv_leftNum_1_0= RULE_INT )
                    {
                    // InternalMiniJava.g:1888:5: (lv_leftNum_1_0= RULE_INT )
                    // InternalMiniJava.g:1889:6: lv_leftNum_1_0= RULE_INT
                    {
                    lv_leftNum_1_0=(Token)match(input,RULE_INT,FOLLOW_34); 

                    						newLeafNode(lv_leftNum_1_0, grammarAccess.getCalcExpAccess().getLeftNumINTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCalcExpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"leftNum",
                    							lv_leftNum_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalMiniJava.g:1905:4: ( (lv_op_2_0= ruleOperator ) )
                    // InternalMiniJava.g:1906:5: (lv_op_2_0= ruleOperator )
                    {
                    // InternalMiniJava.g:1906:5: (lv_op_2_0= ruleOperator )
                    // InternalMiniJava.g:1907:6: lv_op_2_0= ruleOperator
                    {

                    						newCompositeNode(grammarAccess.getCalcExpAccess().getOpOperatorParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_op_2_0=ruleOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCalcExpRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"edu.ustb.cmp.MiniJava.Operator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMiniJava.g:1924:4: ( (lv_rightName_3_0= RULE_ID ) )
                    // InternalMiniJava.g:1925:5: (lv_rightName_3_0= RULE_ID )
                    {
                    // InternalMiniJava.g:1925:5: (lv_rightName_3_0= RULE_ID )
                    // InternalMiniJava.g:1926:6: lv_rightName_3_0= RULE_ID
                    {
                    lv_rightName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_rightName_3_0, grammarAccess.getCalcExpAccess().getRightNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCalcExpRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"rightName",
                    							lv_rightName_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1944:3: ( (lv_rightNum_4_0= RULE_INT ) )
                    {
                    // InternalMiniJava.g:1944:3: ( (lv_rightNum_4_0= RULE_INT ) )
                    // InternalMiniJava.g:1945:4: (lv_rightNum_4_0= RULE_INT )
                    {
                    // InternalMiniJava.g:1945:4: (lv_rightNum_4_0= RULE_INT )
                    // InternalMiniJava.g:1946:5: lv_rightNum_4_0= RULE_INT
                    {
                    lv_rightNum_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_rightNum_4_0, grammarAccess.getCalcExpAccess().getRightNumINTTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCalcExpRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"rightNum",
                    						lv_rightNum_4_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCalcExp"


    // $ANTLR start "entryRuleCompareExp"
    // InternalMiniJava.g:1966:1: entryRuleCompareExp returns [EObject current=null] : iv_ruleCompareExp= ruleCompareExp EOF ;
    public final EObject entryRuleCompareExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareExp = null;


        try {
            // InternalMiniJava.g:1966:51: (iv_ruleCompareExp= ruleCompareExp EOF )
            // InternalMiniJava.g:1967:2: iv_ruleCompareExp= ruleCompareExp EOF
            {
             newCompositeNode(grammarAccess.getCompareExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompareExp=ruleCompareExp();

            state._fsp--;

             current =iv_ruleCompareExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareExp"


    // $ANTLR start "ruleCompareExp"
    // InternalMiniJava.g:1973:1: ruleCompareExp returns [EObject current=null] : ( ( (lv_id_0_0= ruleQualifiedName ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_other1_2_0= RULE_ID ) )* ( (lv_other2_3_0= 'null' ) )* ) ;
    public final EObject ruleCompareExp() throws RecognitionException {
        EObject current = null;

        Token lv_other1_2_0=null;
        Token lv_other2_3_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:1979:2: ( ( ( (lv_id_0_0= ruleQualifiedName ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_other1_2_0= RULE_ID ) )* ( (lv_other2_3_0= 'null' ) )* ) )
            // InternalMiniJava.g:1980:2: ( ( (lv_id_0_0= ruleQualifiedName ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_other1_2_0= RULE_ID ) )* ( (lv_other2_3_0= 'null' ) )* )
            {
            // InternalMiniJava.g:1980:2: ( ( (lv_id_0_0= ruleQualifiedName ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_other1_2_0= RULE_ID ) )* ( (lv_other2_3_0= 'null' ) )* )
            // InternalMiniJava.g:1981:3: ( (lv_id_0_0= ruleQualifiedName ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_other1_2_0= RULE_ID ) )* ( (lv_other2_3_0= 'null' ) )*
            {
            // InternalMiniJava.g:1981:3: ( (lv_id_0_0= ruleQualifiedName ) )
            // InternalMiniJava.g:1982:4: (lv_id_0_0= ruleQualifiedName )
            {
            // InternalMiniJava.g:1982:4: (lv_id_0_0= ruleQualifiedName )
            // InternalMiniJava.g:1983:5: lv_id_0_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getCompareExpAccess().getIdQualifiedNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_34);
            lv_id_0_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareExpRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"edu.ustb.cmp.MiniJava.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:2000:3: ( (lv_op_1_0= ruleOperator ) )
            // InternalMiniJava.g:2001:4: (lv_op_1_0= ruleOperator )
            {
            // InternalMiniJava.g:2001:4: (lv_op_1_0= ruleOperator )
            // InternalMiniJava.g:2002:5: lv_op_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getCompareExpAccess().getOpOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_35);
            lv_op_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompareExpRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"edu.ustb.cmp.MiniJava.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:2019:3: ( (lv_other1_2_0= RULE_ID ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMiniJava.g:2020:4: (lv_other1_2_0= RULE_ID )
            	    {
            	    // InternalMiniJava.g:2020:4: (lv_other1_2_0= RULE_ID )
            	    // InternalMiniJava.g:2021:5: lv_other1_2_0= RULE_ID
            	    {
            	    lv_other1_2_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            	    					newLeafNode(lv_other1_2_0, grammarAccess.getCompareExpAccess().getOther1IDTerminalRuleCall_2_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCompareExpRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"other1",
            	    						lv_other1_2_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // InternalMiniJava.g:2037:3: ( (lv_other2_3_0= 'null' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==55) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMiniJava.g:2038:4: (lv_other2_3_0= 'null' )
            	    {
            	    // InternalMiniJava.g:2038:4: (lv_other2_3_0= 'null' )
            	    // InternalMiniJava.g:2039:5: lv_other2_3_0= 'null'
            	    {
            	    lv_other2_3_0=(Token)match(input,55,FOLLOW_36); 

            	    					newLeafNode(lv_other2_3_0, grammarAccess.getCompareExpAccess().getOther2NullKeyword_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCompareExpRule());
            	    					}
            	    					addWithLastConsumed(current, "other2", lv_other2_3_0, "null");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareExp"


    // $ANTLR start "entryRuleBasicJudge"
    // InternalMiniJava.g:2055:1: entryRuleBasicJudge returns [EObject current=null] : iv_ruleBasicJudge= ruleBasicJudge EOF ;
    public final EObject entryRuleBasicJudge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicJudge = null;


        try {
            // InternalMiniJava.g:2055:51: (iv_ruleBasicJudge= ruleBasicJudge EOF )
            // InternalMiniJava.g:2056:2: iv_ruleBasicJudge= ruleBasicJudge EOF
            {
             newCompositeNode(grammarAccess.getBasicJudgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBasicJudge=ruleBasicJudge();

            state._fsp--;

             current =iv_ruleBasicJudge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicJudge"


    // $ANTLR start "ruleBasicJudge"
    // InternalMiniJava.g:2062:1: ruleBasicJudge returns [EObject current=null] : ( ( (lv_bE_0_0= ruleBooleanExp ) ) | ( (lv_cmp_1_0= ruleCompareExp ) ) ) ;
    public final EObject ruleBasicJudge() throws RecognitionException {
        EObject current = null;

        Enumerator lv_bE_0_0 = null;

        EObject lv_cmp_1_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2068:2: ( ( ( (lv_bE_0_0= ruleBooleanExp ) ) | ( (lv_cmp_1_0= ruleCompareExp ) ) ) )
            // InternalMiniJava.g:2069:2: ( ( (lv_bE_0_0= ruleBooleanExp ) ) | ( (lv_cmp_1_0= ruleCompareExp ) ) )
            {
            // InternalMiniJava.g:2069:2: ( ( (lv_bE_0_0= ruleBooleanExp ) ) | ( (lv_cmp_1_0= ruleCompareExp ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=60 && LA31_0<=61)) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMiniJava.g:2070:3: ( (lv_bE_0_0= ruleBooleanExp ) )
                    {
                    // InternalMiniJava.g:2070:3: ( (lv_bE_0_0= ruleBooleanExp ) )
                    // InternalMiniJava.g:2071:4: (lv_bE_0_0= ruleBooleanExp )
                    {
                    // InternalMiniJava.g:2071:4: (lv_bE_0_0= ruleBooleanExp )
                    // InternalMiniJava.g:2072:5: lv_bE_0_0= ruleBooleanExp
                    {

                    					newCompositeNode(grammarAccess.getBasicJudgeAccess().getBEBooleanExpEnumRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_bE_0_0=ruleBooleanExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBasicJudgeRule());
                    					}
                    					set(
                    						current,
                    						"bE",
                    						lv_bE_0_0,
                    						"edu.ustb.cmp.MiniJava.BooleanExp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:2090:3: ( (lv_cmp_1_0= ruleCompareExp ) )
                    {
                    // InternalMiniJava.g:2090:3: ( (lv_cmp_1_0= ruleCompareExp ) )
                    // InternalMiniJava.g:2091:4: (lv_cmp_1_0= ruleCompareExp )
                    {
                    // InternalMiniJava.g:2091:4: (lv_cmp_1_0= ruleCompareExp )
                    // InternalMiniJava.g:2092:5: lv_cmp_1_0= ruleCompareExp
                    {

                    					newCompositeNode(grammarAccess.getBasicJudgeAccess().getCmpCompareExpParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cmp_1_0=ruleCompareExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBasicJudgeRule());
                    					}
                    					set(
                    						current,
                    						"cmp",
                    						lv_cmp_1_0,
                    						"edu.ustb.cmp.MiniJava.CompareExp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicJudge"


    // $ANTLR start "entryRuleJudgeExp"
    // InternalMiniJava.g:2113:1: entryRuleJudgeExp returns [EObject current=null] : iv_ruleJudgeExp= ruleJudgeExp EOF ;
    public final EObject entryRuleJudgeExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJudgeExp = null;


        try {
            // InternalMiniJava.g:2113:49: (iv_ruleJudgeExp= ruleJudgeExp EOF )
            // InternalMiniJava.g:2114:2: iv_ruleJudgeExp= ruleJudgeExp EOF
            {
             newCompositeNode(grammarAccess.getJudgeExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJudgeExp=ruleJudgeExp();

            state._fsp--;

             current =iv_ruleJudgeExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJudgeExp"


    // $ANTLR start "ruleJudgeExp"
    // InternalMiniJava.g:2120:1: ruleJudgeExp returns [EObject current=null] : ( (otherlv_0= '!' )* (otherlv_1= '(' )* ( (lv_bj_2_0= ruleBasicJudge ) ) (otherlv_3= ')' )* ) ;
    public final EObject ruleJudgeExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_bj_2_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2126:2: ( ( (otherlv_0= '!' )* (otherlv_1= '(' )* ( (lv_bj_2_0= ruleBasicJudge ) ) (otherlv_3= ')' )* ) )
            // InternalMiniJava.g:2127:2: ( (otherlv_0= '!' )* (otherlv_1= '(' )* ( (lv_bj_2_0= ruleBasicJudge ) ) (otherlv_3= ')' )* )
            {
            // InternalMiniJava.g:2127:2: ( (otherlv_0= '!' )* (otherlv_1= '(' )* ( (lv_bj_2_0= ruleBasicJudge ) ) (otherlv_3= ')' )* )
            // InternalMiniJava.g:2128:3: (otherlv_0= '!' )* (otherlv_1= '(' )* ( (lv_bj_2_0= ruleBasicJudge ) ) (otherlv_3= ')' )*
            {
            // InternalMiniJava.g:2128:3: (otherlv_0= '!' )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==40) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMiniJava.g:2129:4: otherlv_0= '!'
            	    {
            	    otherlv_0=(Token)match(input,40,FOLLOW_37); 

            	    				newLeafNode(otherlv_0, grammarAccess.getJudgeExpAccess().getExclamationMarkKeyword_0());
            	    			

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalMiniJava.g:2134:3: (otherlv_1= '(' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==20) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMiniJava.g:2135:4: otherlv_1= '('
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_37); 

            	    				newLeafNode(otherlv_1, grammarAccess.getJudgeExpAccess().getLeftParenthesisKeyword_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalMiniJava.g:2140:3: ( (lv_bj_2_0= ruleBasicJudge ) )
            // InternalMiniJava.g:2141:4: (lv_bj_2_0= ruleBasicJudge )
            {
            // InternalMiniJava.g:2141:4: (lv_bj_2_0= ruleBasicJudge )
            // InternalMiniJava.g:2142:5: lv_bj_2_0= ruleBasicJudge
            {

            					newCompositeNode(grammarAccess.getJudgeExpAccess().getBjBasicJudgeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_38);
            lv_bj_2_0=ruleBasicJudge();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJudgeExpRule());
            					}
            					set(
            						current,
            						"bj",
            						lv_bj_2_0,
            						"edu.ustb.cmp.MiniJava.BasicJudge");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMiniJava.g:2159:3: (otherlv_3= ')' )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==24) ) {
                    int LA34_2 = input.LA(2);

                    if ( (LA34_2==EOF||LA34_2==12||(LA34_2>=22 && LA34_2<=24)||LA34_2==28) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // InternalMiniJava.g:2160:4: otherlv_3= ')'
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_38); 

            	    				newLeafNode(otherlv_3, grammarAccess.getJudgeExpAccess().getRightParenthesisKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJudgeExp"


    // $ANTLR start "entryRuleNewExp"
    // InternalMiniJava.g:2169:1: entryRuleNewExp returns [EObject current=null] : iv_ruleNewExp= ruleNewExp EOF ;
    public final EObject entryRuleNewExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNewExp = null;


        try {
            // InternalMiniJava.g:2169:47: (iv_ruleNewExp= ruleNewExp EOF )
            // InternalMiniJava.g:2170:2: iv_ruleNewExp= ruleNewExp EOF
            {
             newCompositeNode(grammarAccess.getNewExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNewExp=ruleNewExp();

            state._fsp--;

             current =iv_ruleNewExp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNewExp"


    // $ANTLR start "ruleNewExp"
    // InternalMiniJava.g:2176:1: ruleNewExp returns [EObject current=null] : (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' ) ;
    public final EObject ruleNewExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_params_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2182:2: ( (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' ) )
            // InternalMiniJava.g:2183:2: (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' )
            {
            // InternalMiniJava.g:2183:2: (otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')' )
            // InternalMiniJava.g:2184:3: otherlv_0= 'new' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_params_3_0= ruleParameter ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getNewExpAccess().getNewKeyword_0());
            		
            // InternalMiniJava.g:2188:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMiniJava.g:2189:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMiniJava.g:2189:4: (lv_name_1_0= RULE_ID )
            // InternalMiniJava.g:2190:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNewExpAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNewExpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getNewExpAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMiniJava.g:2210:3: ( (lv_params_3_0= ruleParameter ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||(LA35_0>=29 && LA35_0<=33)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMiniJava.g:2211:4: (lv_params_3_0= ruleParameter )
            	    {
            	    // InternalMiniJava.g:2211:4: (lv_params_3_0= ruleParameter )
            	    // InternalMiniJava.g:2212:5: lv_params_3_0= ruleParameter
            	    {

            	    					newCompositeNode(grammarAccess.getNewExpAccess().getParamsParameterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_params_3_0=ruleParameter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNewExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"params",
            	    						lv_params_3_0,
            	    						"edu.ustb.cmp.MiniJava.Parameter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNewExpAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNewExp"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:2237:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMiniJava.g:2237:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMiniJava.g:2238:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:2244:1: ruleExpression returns [EObject current=null] : ( ( (lv_const_0_0= ruleConstantValue ) ) | ( (lv_ce_1_0= ruleCalcExp ) ) | ( (lv_je_2_0= ruleJudgeExp ) ) | ( (lv_ne_3_0= ruleNewExp ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_const_0_0 = null;

        EObject lv_ce_1_0 = null;

        EObject lv_je_2_0 = null;

        EObject lv_ne_3_0 = null;



        	enterRule();

        try {
            // InternalMiniJava.g:2250:2: ( ( ( (lv_const_0_0= ruleConstantValue ) ) | ( (lv_ce_1_0= ruleCalcExp ) ) | ( (lv_je_2_0= ruleJudgeExp ) ) | ( (lv_ne_3_0= ruleNewExp ) ) ) )
            // InternalMiniJava.g:2251:2: ( ( (lv_const_0_0= ruleConstantValue ) ) | ( (lv_ce_1_0= ruleCalcExp ) ) | ( (lv_je_2_0= ruleJudgeExp ) ) | ( (lv_ne_3_0= ruleNewExp ) ) )
            {
            // InternalMiniJava.g:2251:2: ( ( (lv_const_0_0= ruleConstantValue ) ) | ( (lv_ce_1_0= ruleCalcExp ) ) | ( (lv_je_2_0= ruleJudgeExp ) ) | ( (lv_ne_3_0= ruleNewExp ) ) )
            int alt36=4;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // InternalMiniJava.g:2252:3: ( (lv_const_0_0= ruleConstantValue ) )
                    {
                    // InternalMiniJava.g:2252:3: ( (lv_const_0_0= ruleConstantValue ) )
                    // InternalMiniJava.g:2253:4: (lv_const_0_0= ruleConstantValue )
                    {
                    // InternalMiniJava.g:2253:4: (lv_const_0_0= ruleConstantValue )
                    // InternalMiniJava.g:2254:5: lv_const_0_0= ruleConstantValue
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getConstConstantValueParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_const_0_0=ruleConstantValue();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"const",
                    						lv_const_0_0,
                    						"edu.ustb.cmp.MiniJava.ConstantValue");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:2272:3: ( (lv_ce_1_0= ruleCalcExp ) )
                    {
                    // InternalMiniJava.g:2272:3: ( (lv_ce_1_0= ruleCalcExp ) )
                    // InternalMiniJava.g:2273:4: (lv_ce_1_0= ruleCalcExp )
                    {
                    // InternalMiniJava.g:2273:4: (lv_ce_1_0= ruleCalcExp )
                    // InternalMiniJava.g:2274:5: lv_ce_1_0= ruleCalcExp
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getCeCalcExpParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ce_1_0=ruleCalcExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"ce",
                    						lv_ce_1_0,
                    						"edu.ustb.cmp.MiniJava.CalcExp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:2292:3: ( (lv_je_2_0= ruleJudgeExp ) )
                    {
                    // InternalMiniJava.g:2292:3: ( (lv_je_2_0= ruleJudgeExp ) )
                    // InternalMiniJava.g:2293:4: (lv_je_2_0= ruleJudgeExp )
                    {
                    // InternalMiniJava.g:2293:4: (lv_je_2_0= ruleJudgeExp )
                    // InternalMiniJava.g:2294:5: lv_je_2_0= ruleJudgeExp
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getJeJudgeExpParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_je_2_0=ruleJudgeExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"je",
                    						lv_je_2_0,
                    						"edu.ustb.cmp.MiniJava.JudgeExp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:2312:3: ( (lv_ne_3_0= ruleNewExp ) )
                    {
                    // InternalMiniJava.g:2312:3: ( (lv_ne_3_0= ruleNewExp ) )
                    // InternalMiniJava.g:2313:4: (lv_ne_3_0= ruleNewExp )
                    {
                    // InternalMiniJava.g:2313:4: (lv_ne_3_0= ruleNewExp )
                    // InternalMiniJava.g:2314:5: lv_ne_3_0= ruleNewExp
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getNeNewExpParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ne_3_0=ruleNewExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"ne",
                    						lv_ne_3_0,
                    						"edu.ustb.cmp.MiniJava.NewExp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleDomain"
    // InternalMiniJava.g:2335:1: ruleDomain returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) ;
    public final Enumerator ruleDomain() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMiniJava.g:2341:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) ) )
            // InternalMiniJava.g:2342:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            {
            // InternalMiniJava.g:2342:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'private' ) | (enumLiteral_2= 'protected' ) )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt37=1;
                }
                break;
            case 57:
                {
                alt37=2;
                }
                break;
            case 58:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMiniJava.g:2343:3: (enumLiteral_0= 'public' )
                    {
                    // InternalMiniJava.g:2343:3: (enumLiteral_0= 'public' )
                    // InternalMiniJava.g:2344:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,16,FOLLOW_2); 

                    				current = grammarAccess.getDomainAccess().getPUBLICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDomainAccess().getPUBLICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:2351:3: (enumLiteral_1= 'private' )
                    {
                    // InternalMiniJava.g:2351:3: (enumLiteral_1= 'private' )
                    // InternalMiniJava.g:2352:4: enumLiteral_1= 'private'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDomainAccess().getPRIVATEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDomainAccess().getPRIVATEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:2359:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalMiniJava.g:2359:3: (enumLiteral_2= 'protected' )
                    // InternalMiniJava.g:2360:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDomainAccess().getPROTECTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDomainAccess().getPROTECTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "ruleExtraAttr"
    // InternalMiniJava.g:2370:1: ruleExtraAttr returns [Enumerator current=null] : ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'abstract' ) ) ;
    public final Enumerator ruleExtraAttr() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMiniJava.g:2376:2: ( ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'abstract' ) ) )
            // InternalMiniJava.g:2377:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'abstract' ) )
            {
            // InternalMiniJava.g:2377:2: ( (enumLiteral_0= 'static' ) | (enumLiteral_1= 'abstract' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            else if ( (LA38_0==59) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMiniJava.g:2378:3: (enumLiteral_0= 'static' )
                    {
                    // InternalMiniJava.g:2378:3: (enumLiteral_0= 'static' )
                    // InternalMiniJava.g:2379:4: enumLiteral_0= 'static'
                    {
                    enumLiteral_0=(Token)match(input,17,FOLLOW_2); 

                    				current = grammarAccess.getExtraAttrAccess().getSTATICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExtraAttrAccess().getSTATICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:2386:3: (enumLiteral_1= 'abstract' )
                    {
                    // InternalMiniJava.g:2386:3: (enumLiteral_1= 'abstract' )
                    // InternalMiniJava.g:2387:4: enumLiteral_1= 'abstract'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getExtraAttrAccess().getABSTRACTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExtraAttrAccess().getABSTRACTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtraAttr"


    // $ANTLR start "ruleBooleanExp"
    // InternalMiniJava.g:2397:1: ruleBooleanExp returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanExp() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMiniJava.g:2403:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalMiniJava.g:2404:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalMiniJava.g:2404:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            else if ( (LA39_0==61) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalMiniJava.g:2405:3: (enumLiteral_0= 'true' )
                    {
                    // InternalMiniJava.g:2405:3: (enumLiteral_0= 'true' )
                    // InternalMiniJava.g:2406:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getBooleanExpAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanExpAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:2413:3: (enumLiteral_1= 'false' )
                    {
                    // InternalMiniJava.g:2413:3: (enumLiteral_1= 'false' )
                    // InternalMiniJava.g:2414:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getBooleanExpAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanExpAccess().getFALSEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanExp"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA36 dfa36 = new DFA36(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\4\4\uffff\4\4";
    static final String dfa_3s = "\1\75\1\uffff\1\66\4\uffff\1\4\1\66\1\4\1\66";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\4\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\3\15\uffff\1\3\10\uffff\5\1\2\uffff\1\4\1\uffff\1\5\1\6\1\3\17\uffff\1\3\3\uffff\2\3",
            "",
            "\1\1\21\uffff\1\3\5\uffff\1\7\5\uffff\1\3\5\uffff\17\3",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\1\27\uffff\1\11\5\uffff\1\3\5\uffff\17\3",
            "\1\12",
            "\1\1\27\uffff\1\11\5\uffff\1\3\5\uffff\17\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1101:2: ( ( (lv_varDef_0_0= ruleVariableDecl ) ) | ( (lv_assign_1_0= ruleAssignments ) ) | ( (lv_ifStat_2_0= ruleIfStatements ) ) | ( (lv_whileStat_3_0= ruleWhileStatements ) ) | ( (lv_retStat_4_0= ruleReturnStatements ) ) )";
        }
    }
    static final String dfa_7s = "\106\uffff";
    static final String dfa_8s = "\1\uffff\1\32\55\uffff\1\33\17\uffff\1\33\6\uffff";
    static final String dfa_9s = "\1\4\3\26\2\4\2\26\21\4\3\uffff\20\4\1\34\1\26\1\24\1\34\1\4\3\26\3\4\1\34\6\4\1\26\1\34\1\4\1\27\4\4";
    static final String dfa_10s = "\1\75\1\66\1\34\1\66\2\75\2\34\2\4\17\67\3\uffff\1\5\17\4\1\66\1\34\1\24\1\66\2\67\2\34\1\4\1\41\1\4\1\66\5\26\2\34\1\66\1\43\1\27\1\4\1\41\1\4\1\34";
    static final String dfa_11s = "\31\uffff\1\3\1\1\1\2\52\uffff";
    static final String dfa_12s = "\106\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\3\1\2\15\uffff\1\5\23\uffff\1\4\17\uffff\1\10\3\uffff\1\6\1\7",
            "\1\31\5\uffff\1\11\5\uffff\1\32\5\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\31\5\uffff\1\33",
            "\1\31\5\uffff\1\34\13\uffff\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53",
            "\1\54\17\uffff\1\5\23\uffff\1\4\23\uffff\1\6\1\7",
            "\1\54\17\uffff\1\5\47\uffff\1\6\1\7",
            "\1\31\1\uffff\1\55\3\uffff\1\33",
            "\1\31\1\uffff\1\55\3\uffff\1\33",
            "\1\56",
            "\1\57",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "",
            "",
            "",
            "\1\33\1\62",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\63",
            "\1\64\13\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\31\1\uffff\1\55\3\uffff\1\33",
            "\1\65",
            "\1\66\5\uffff\1\33\5\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\60\21\uffff\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\31\1\uffff\1\55\3\uffff\1\33\32\uffff\1\61",
            "\1\31\5\uffff\1\33",
            "\1\31\5\uffff\1\33",
            "\1\67",
            "\1\75\23\uffff\1\76\4\uffff\1\70\1\71\1\72\1\73\1\74",
            "\1\77",
            "\1\64\13\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\100\21\uffff\1\101",
            "\1\100\21\uffff\1\101",
            "\1\100\21\uffff\1\101",
            "\1\100\21\uffff\1\101",
            "\1\100\21\uffff\1\101",
            "\1\100\27\uffff\1\102",
            "\1\31\5\uffff\1\33",
            "\1\66\5\uffff\1\33\5\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30",
            "\1\75\23\uffff\1\76\4\uffff\1\70\1\71\1\72\1\73\1\74\1\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\75\23\uffff\1\76\4\uffff\1\70\1\71\1\72\1\73\1\74",
            "\1\100",
            "\1\100\27\uffff\1\102"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1219:2: ( ( (lv_id_0_0= RULE_ID ) ) | ( ( (lv_exp_1_0= ruleExpression ) ) otherlv_2= '.' ( (lv_id_3_0= ruleQualifiedName ) ) ) | ( ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= '[' ( (lv_index_6_0= ruleExpression ) ) otherlv_7= ']' ) )";
        }
    }
    static final String dfa_14s = "\3\uffff\1\7\4\uffff\1\7\1\uffff\1\7";
    static final String dfa_15s = "\1\4\2\uffff\1\14\2\uffff\1\4\1\uffff\1\34\1\4\1\34";
    static final String dfa_16s = "\1\75\2\uffff\1\66\2\uffff\1\4\1\uffff\1\66\1\4\1\66";
    static final String dfa_17s = "\1\uffff\2\1\1\uffff\1\3\1\4\1\uffff\1\2\3\uffff";
    static final String[] dfa_18s = {
            "\1\3\1\2\1\1\15\uffff\1\4\23\uffff\1\4\17\uffff\1\5\3\uffff\2\4",
            "",
            "",
            "\1\7\11\uffff\3\7\3\uffff\1\6\13\uffff\17\4",
            "",
            "",
            "\1\10",
            "",
            "\1\11\5\uffff\1\7\5\uffff\17\4",
            "\1\12",
            "\1\11\5\uffff\1\7\5\uffff\17\4"
    };
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = dfa_1;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_5;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2251:2: ( ( (lv_const_0_0= ruleConstantValue ) ) | ( (lv_ce_1_0= ruleCalcExp ) ) | ( (lv_je_2_0= ruleJudgeExp ) ) | ( (lv_ne_3_0= ruleNewExp ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x310001D3E2100070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x06000003E2010010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400001060L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x08000003E0060010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000003E1000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3100010000100070L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x007FFF0000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000012L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x3000010000100010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001000002L});

}