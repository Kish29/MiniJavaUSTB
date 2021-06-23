package edu.ustb.cmp.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import edu.ustb.cmp.services.MiniJavaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMiniJavaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'int'", "'boolean'", "'double'", "'char'", "'long'", "'void'", "'!'", "'&'", "'|'", "'+'", "'-'", "'*'", "'%'", "'<<'", "'>>'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'public'", "'private'", "'protected'", "'static'", "'abstract'", "'true'", "'false'", "'package'", "';'", "'import'", "'class'", "'{'", "'main'", "'('", "'String'", "'['", "']'", "')'", "'}'", "'extends'", "'implements'", "'.'", "'='", "','", "'if'", "'else'", "'while'", "'return'", "'new'", "'null'"
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
    public static final int RULE_ID=6;
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
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(MiniJavaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMiniJava"
    // InternalMiniJava.g:53:1: entryRuleMiniJava : ruleMiniJava EOF ;
    public final void entryRuleMiniJava() throws RecognitionException {
        try {
            // InternalMiniJava.g:54:1: ( ruleMiniJava EOF )
            // InternalMiniJava.g:55:1: ruleMiniJava EOF
            {
             before(grammarAccess.getMiniJavaRule()); 
            pushFollow(FOLLOW_1);
            ruleMiniJava();

            state._fsp--;

             after(grammarAccess.getMiniJavaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMiniJava"


    // $ANTLR start "ruleMiniJava"
    // InternalMiniJava.g:62:1: ruleMiniJava : ( ( rule__MiniJava__Group__0 ) ) ;
    public final void ruleMiniJava() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:66:2: ( ( ( rule__MiniJava__Group__0 ) ) )
            // InternalMiniJava.g:67:2: ( ( rule__MiniJava__Group__0 ) )
            {
            // InternalMiniJava.g:67:2: ( ( rule__MiniJava__Group__0 ) )
            // InternalMiniJava.g:68:3: ( rule__MiniJava__Group__0 )
            {
             before(grammarAccess.getMiniJavaAccess().getGroup()); 
            // InternalMiniJava.g:69:3: ( rule__MiniJava__Group__0 )
            // InternalMiniJava.g:69:4: rule__MiniJava__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MiniJava__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMiniJavaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMiniJava"


    // $ANTLR start "entryRulePackageDecl"
    // InternalMiniJava.g:78:1: entryRulePackageDecl : rulePackageDecl EOF ;
    public final void entryRulePackageDecl() throws RecognitionException {
        try {
            // InternalMiniJava.g:79:1: ( rulePackageDecl EOF )
            // InternalMiniJava.g:80:1: rulePackageDecl EOF
            {
             before(grammarAccess.getPackageDeclRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDecl();

            state._fsp--;

             after(grammarAccess.getPackageDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDecl"


    // $ANTLR start "rulePackageDecl"
    // InternalMiniJava.g:87:1: rulePackageDecl : ( ( rule__PackageDecl__Group__0 ) ) ;
    public final void rulePackageDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:91:2: ( ( ( rule__PackageDecl__Group__0 ) ) )
            // InternalMiniJava.g:92:2: ( ( rule__PackageDecl__Group__0 ) )
            {
            // InternalMiniJava.g:92:2: ( ( rule__PackageDecl__Group__0 ) )
            // InternalMiniJava.g:93:3: ( rule__PackageDecl__Group__0 )
            {
             before(grammarAccess.getPackageDeclAccess().getGroup()); 
            // InternalMiniJava.g:94:3: ( rule__PackageDecl__Group__0 )
            // InternalMiniJava.g:94:4: rule__PackageDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDecl"


    // $ANTLR start "entryRuleImportDecl"
    // InternalMiniJava.g:103:1: entryRuleImportDecl : ruleImportDecl EOF ;
    public final void entryRuleImportDecl() throws RecognitionException {
        try {
            // InternalMiniJava.g:104:1: ( ruleImportDecl EOF )
            // InternalMiniJava.g:105:1: ruleImportDecl EOF
            {
             before(grammarAccess.getImportDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleImportDecl();

            state._fsp--;

             after(grammarAccess.getImportDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportDecl"


    // $ANTLR start "ruleImportDecl"
    // InternalMiniJava.g:112:1: ruleImportDecl : ( ( rule__ImportDecl__Group__0 ) ) ;
    public final void ruleImportDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:116:2: ( ( ( rule__ImportDecl__Group__0 ) ) )
            // InternalMiniJava.g:117:2: ( ( rule__ImportDecl__Group__0 ) )
            {
            // InternalMiniJava.g:117:2: ( ( rule__ImportDecl__Group__0 ) )
            // InternalMiniJava.g:118:3: ( rule__ImportDecl__Group__0 )
            {
             before(grammarAccess.getImportDeclAccess().getGroup()); 
            // InternalMiniJava.g:119:3: ( rule__ImportDecl__Group__0 )
            // InternalMiniJava.g:119:4: rule__ImportDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportDecl"


    // $ANTLR start "entryRuleMainClassDecl"
    // InternalMiniJava.g:128:1: entryRuleMainClassDecl : ruleMainClassDecl EOF ;
    public final void entryRuleMainClassDecl() throws RecognitionException {
        try {
            // InternalMiniJava.g:129:1: ( ruleMainClassDecl EOF )
            // InternalMiniJava.g:130:1: ruleMainClassDecl EOF
            {
             before(grammarAccess.getMainClassDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleMainClassDecl();

            state._fsp--;

             after(grammarAccess.getMainClassDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMainClassDecl"


    // $ANTLR start "ruleMainClassDecl"
    // InternalMiniJava.g:137:1: ruleMainClassDecl : ( ( rule__MainClassDecl__Group__0 ) ) ;
    public final void ruleMainClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:141:2: ( ( ( rule__MainClassDecl__Group__0 ) ) )
            // InternalMiniJava.g:142:2: ( ( rule__MainClassDecl__Group__0 ) )
            {
            // InternalMiniJava.g:142:2: ( ( rule__MainClassDecl__Group__0 ) )
            // InternalMiniJava.g:143:3: ( rule__MainClassDecl__Group__0 )
            {
             before(grammarAccess.getMainClassDeclAccess().getGroup()); 
            // InternalMiniJava.g:144:3: ( rule__MainClassDecl__Group__0 )
            // InternalMiniJava.g:144:4: rule__MainClassDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainClassDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMainClassDecl"


    // $ANTLR start "entryRuleClassDecl"
    // InternalMiniJava.g:153:1: entryRuleClassDecl : ruleClassDecl EOF ;
    public final void entryRuleClassDecl() throws RecognitionException {
        try {
            // InternalMiniJava.g:154:1: ( ruleClassDecl EOF )
            // InternalMiniJava.g:155:1: ruleClassDecl EOF
            {
             before(grammarAccess.getClassDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getClassDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassDecl"


    // $ANTLR start "ruleClassDecl"
    // InternalMiniJava.g:162:1: ruleClassDecl : ( ( rule__ClassDecl__Group__0 ) ) ;
    public final void ruleClassDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:166:2: ( ( ( rule__ClassDecl__Group__0 ) ) )
            // InternalMiniJava.g:167:2: ( ( rule__ClassDecl__Group__0 ) )
            {
            // InternalMiniJava.g:167:2: ( ( rule__ClassDecl__Group__0 ) )
            // InternalMiniJava.g:168:3: ( rule__ClassDecl__Group__0 )
            {
             before(grammarAccess.getClassDeclAccess().getGroup()); 
            // InternalMiniJava.g:169:3: ( rule__ClassDecl__Group__0 )
            // InternalMiniJava.g:169:4: rule__ClassDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassDecl"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMiniJava.g:178:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMiniJava.g:179:1: ( ruleQualifiedName EOF )
            // InternalMiniJava.g:180:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMiniJava.g:187:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:191:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMiniJava.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMiniJava.g:192:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMiniJava.g:193:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMiniJava.g:194:3: ( rule__QualifiedName__Group__0 )
            // InternalMiniJava.g:194:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDoubleLiteral"
    // InternalMiniJava.g:203:1: entryRuleDoubleLiteral : ruleDoubleLiteral EOF ;
    public final void entryRuleDoubleLiteral() throws RecognitionException {
        try {
            // InternalMiniJava.g:204:1: ( ruleDoubleLiteral EOF )
            // InternalMiniJava.g:205:1: ruleDoubleLiteral EOF
            {
             before(grammarAccess.getDoubleLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleLiteral();

            state._fsp--;

             after(grammarAccess.getDoubleLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleLiteral"


    // $ANTLR start "ruleDoubleLiteral"
    // InternalMiniJava.g:212:1: ruleDoubleLiteral : ( ( rule__DoubleLiteral__Group__0 ) ) ;
    public final void ruleDoubleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:216:2: ( ( ( rule__DoubleLiteral__Group__0 ) ) )
            // InternalMiniJava.g:217:2: ( ( rule__DoubleLiteral__Group__0 ) )
            {
            // InternalMiniJava.g:217:2: ( ( rule__DoubleLiteral__Group__0 ) )
            // InternalMiniJava.g:218:3: ( rule__DoubleLiteral__Group__0 )
            {
             before(grammarAccess.getDoubleLiteralAccess().getGroup()); 
            // InternalMiniJava.g:219:3: ( rule__DoubleLiteral__Group__0 )
            // InternalMiniJava.g:219:4: rule__DoubleLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleLiteral"


    // $ANTLR start "entryRuleConstantValue"
    // InternalMiniJava.g:228:1: entryRuleConstantValue : ruleConstantValue EOF ;
    public final void entryRuleConstantValue() throws RecognitionException {
        try {
            // InternalMiniJava.g:229:1: ( ruleConstantValue EOF )
            // InternalMiniJava.g:230:1: ruleConstantValue EOF
            {
             before(grammarAccess.getConstantValueRule()); 
            pushFollow(FOLLOW_1);
            ruleConstantValue();

            state._fsp--;

             after(grammarAccess.getConstantValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // InternalMiniJava.g:237:1: ruleConstantValue : ( ( rule__ConstantValue__Alternatives ) ) ;
    public final void ruleConstantValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:241:2: ( ( ( rule__ConstantValue__Alternatives ) ) )
            // InternalMiniJava.g:242:2: ( ( rule__ConstantValue__Alternatives ) )
            {
            // InternalMiniJava.g:242:2: ( ( rule__ConstantValue__Alternatives ) )
            // InternalMiniJava.g:243:3: ( rule__ConstantValue__Alternatives )
            {
             before(grammarAccess.getConstantValueAccess().getAlternatives()); 
            // InternalMiniJava.g:244:3: ( rule__ConstantValue__Alternatives )
            // InternalMiniJava.g:244:4: rule__ConstantValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstantValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleBasicDataType"
    // InternalMiniJava.g:253:1: entryRuleBasicDataType : ruleBasicDataType EOF ;
    public final void entryRuleBasicDataType() throws RecognitionException {
        try {
            // InternalMiniJava.g:254:1: ( ruleBasicDataType EOF )
            // InternalMiniJava.g:255:1: ruleBasicDataType EOF
            {
             before(grammarAccess.getBasicDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicDataType();

            state._fsp--;

             after(grammarAccess.getBasicDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicDataType"


    // $ANTLR start "ruleBasicDataType"
    // InternalMiniJava.g:262:1: ruleBasicDataType : ( ( rule__BasicDataType__Alternatives ) ) ;
    public final void ruleBasicDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:266:2: ( ( ( rule__BasicDataType__Alternatives ) ) )
            // InternalMiniJava.g:267:2: ( ( rule__BasicDataType__Alternatives ) )
            {
            // InternalMiniJava.g:267:2: ( ( rule__BasicDataType__Alternatives ) )
            // InternalMiniJava.g:268:3: ( rule__BasicDataType__Alternatives )
            {
             before(grammarAccess.getBasicDataTypeAccess().getAlternatives()); 
            // InternalMiniJava.g:269:3: ( rule__BasicDataType__Alternatives )
            // InternalMiniJava.g:269:4: rule__BasicDataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicDataType"


    // $ANTLR start "entryRuleDataType"
    // InternalMiniJava.g:278:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalMiniJava.g:279:1: ( ruleDataType EOF )
            // InternalMiniJava.g:280:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalMiniJava.g:287:1: ruleDataType : ( ( rule__DataType__Alternatives ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:291:2: ( ( ( rule__DataType__Alternatives ) ) )
            // InternalMiniJava.g:292:2: ( ( rule__DataType__Alternatives ) )
            {
            // InternalMiniJava.g:292:2: ( ( rule__DataType__Alternatives ) )
            // InternalMiniJava.g:293:3: ( rule__DataType__Alternatives )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives()); 
            // InternalMiniJava.g:294:3: ( rule__DataType__Alternatives )
            // InternalMiniJava.g:294:4: rule__DataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleVariableDecl"
    // InternalMiniJava.g:303:1: entryRuleVariableDecl : ruleVariableDecl EOF ;
    public final void entryRuleVariableDecl() throws RecognitionException {
        try {
            // InternalMiniJava.g:304:1: ( ruleVariableDecl EOF )
            // InternalMiniJava.g:305:1: ruleVariableDecl EOF
            {
             before(grammarAccess.getVariableDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDecl();

            state._fsp--;

             after(grammarAccess.getVariableDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableDecl"


    // $ANTLR start "ruleVariableDecl"
    // InternalMiniJava.g:312:1: ruleVariableDecl : ( ( rule__VariableDecl__Group__0 ) ) ;
    public final void ruleVariableDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:316:2: ( ( ( rule__VariableDecl__Group__0 ) ) )
            // InternalMiniJava.g:317:2: ( ( rule__VariableDecl__Group__0 ) )
            {
            // InternalMiniJava.g:317:2: ( ( rule__VariableDecl__Group__0 ) )
            // InternalMiniJava.g:318:3: ( rule__VariableDecl__Group__0 )
            {
             before(grammarAccess.getVariableDeclAccess().getGroup()); 
            // InternalMiniJava.g:319:3: ( rule__VariableDecl__Group__0 )
            // InternalMiniJava.g:319:4: rule__VariableDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDecl"


    // $ANTLR start "entryRuleReturnType"
    // InternalMiniJava.g:328:1: entryRuleReturnType : ruleReturnType EOF ;
    public final void entryRuleReturnType() throws RecognitionException {
        try {
            // InternalMiniJava.g:329:1: ( ruleReturnType EOF )
            // InternalMiniJava.g:330:1: ruleReturnType EOF
            {
             before(grammarAccess.getReturnTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getReturnTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnType"


    // $ANTLR start "ruleReturnType"
    // InternalMiniJava.g:337:1: ruleReturnType : ( ( rule__ReturnType__Alternatives ) ) ;
    public final void ruleReturnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:341:2: ( ( ( rule__ReturnType__Alternatives ) ) )
            // InternalMiniJava.g:342:2: ( ( rule__ReturnType__Alternatives ) )
            {
            // InternalMiniJava.g:342:2: ( ( rule__ReturnType__Alternatives ) )
            // InternalMiniJava.g:343:3: ( rule__ReturnType__Alternatives )
            {
             before(grammarAccess.getReturnTypeAccess().getAlternatives()); 
            // InternalMiniJava.g:344:3: ( rule__ReturnType__Alternatives )
            // InternalMiniJava.g:344:4: rule__ReturnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ReturnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReturnTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnType"


    // $ANTLR start "entryRuleParameter"
    // InternalMiniJava.g:353:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMiniJava.g:354:1: ( ruleParameter EOF )
            // InternalMiniJava.g:355:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMiniJava.g:362:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:366:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalMiniJava.g:367:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalMiniJava.g:367:2: ( ( rule__Parameter__Group__0 ) )
            // InternalMiniJava.g:368:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalMiniJava.g:369:3: ( rule__Parameter__Group__0 )
            // InternalMiniJava.g:369:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMethodDecl"
    // InternalMiniJava.g:378:1: entryRuleMethodDecl : ruleMethodDecl EOF ;
    public final void entryRuleMethodDecl() throws RecognitionException {
        try {
            // InternalMiniJava.g:379:1: ( ruleMethodDecl EOF )
            // InternalMiniJava.g:380:1: ruleMethodDecl EOF
            {
             before(grammarAccess.getMethodDeclRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodDecl();

            state._fsp--;

             after(grammarAccess.getMethodDeclRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethodDecl"


    // $ANTLR start "ruleMethodDecl"
    // InternalMiniJava.g:387:1: ruleMethodDecl : ( ( rule__MethodDecl__Group__0 ) ) ;
    public final void ruleMethodDecl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:391:2: ( ( ( rule__MethodDecl__Group__0 ) ) )
            // InternalMiniJava.g:392:2: ( ( rule__MethodDecl__Group__0 ) )
            {
            // InternalMiniJava.g:392:2: ( ( rule__MethodDecl__Group__0 ) )
            // InternalMiniJava.g:393:3: ( rule__MethodDecl__Group__0 )
            {
             before(grammarAccess.getMethodDeclAccess().getGroup()); 
            // InternalMiniJava.g:394:3: ( rule__MethodDecl__Group__0 )
            // InternalMiniJava.g:394:4: rule__MethodDecl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodDecl"


    // $ANTLR start "entryRuleMember"
    // InternalMiniJava.g:403:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalMiniJava.g:404:1: ( ruleMember EOF )
            // InternalMiniJava.g:405:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalMiniJava.g:412:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:416:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalMiniJava.g:417:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalMiniJava.g:417:2: ( ( rule__Member__Alternatives ) )
            // InternalMiniJava.g:418:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalMiniJava.g:419:3: ( rule__Member__Alternatives )
            // InternalMiniJava.g:419:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleStatement"
    // InternalMiniJava.g:428:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:429:1: ( ruleStatement EOF )
            // InternalMiniJava.g:430:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalMiniJava.g:437:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:441:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalMiniJava.g:442:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalMiniJava.g:442:2: ( ( rule__Statement__Alternatives ) )
            // InternalMiniJava.g:443:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalMiniJava.g:444:3: ( rule__Statement__Alternatives )
            // InternalMiniJava.g:444:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLValueExp"
    // InternalMiniJava.g:453:1: entryRuleLValueExp : ruleLValueExp EOF ;
    public final void entryRuleLValueExp() throws RecognitionException {
        try {
            // InternalMiniJava.g:454:1: ( ruleLValueExp EOF )
            // InternalMiniJava.g:455:1: ruleLValueExp EOF
            {
             before(grammarAccess.getLValueExpRule()); 
            pushFollow(FOLLOW_1);
            ruleLValueExp();

            state._fsp--;

             after(grammarAccess.getLValueExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLValueExp"


    // $ANTLR start "ruleLValueExp"
    // InternalMiniJava.g:462:1: ruleLValueExp : ( ( rule__LValueExp__Alternatives ) ) ;
    public final void ruleLValueExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:466:2: ( ( ( rule__LValueExp__Alternatives ) ) )
            // InternalMiniJava.g:467:2: ( ( rule__LValueExp__Alternatives ) )
            {
            // InternalMiniJava.g:467:2: ( ( rule__LValueExp__Alternatives ) )
            // InternalMiniJava.g:468:3: ( rule__LValueExp__Alternatives )
            {
             before(grammarAccess.getLValueExpAccess().getAlternatives()); 
            // InternalMiniJava.g:469:3: ( rule__LValueExp__Alternatives )
            // InternalMiniJava.g:469:4: rule__LValueExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LValueExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLValueExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLValueExp"


    // $ANTLR start "entryRuleAssignments"
    // InternalMiniJava.g:478:1: entryRuleAssignments : ruleAssignments EOF ;
    public final void entryRuleAssignments() throws RecognitionException {
        try {
            // InternalMiniJava.g:479:1: ( ruleAssignments EOF )
            // InternalMiniJava.g:480:1: ruleAssignments EOF
            {
             before(grammarAccess.getAssignmentsRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignments();

            state._fsp--;

             after(grammarAccess.getAssignmentsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignments"


    // $ANTLR start "ruleAssignments"
    // InternalMiniJava.g:487:1: ruleAssignments : ( ( rule__Assignments__Group__0 ) ) ;
    public final void ruleAssignments() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:491:2: ( ( ( rule__Assignments__Group__0 ) ) )
            // InternalMiniJava.g:492:2: ( ( rule__Assignments__Group__0 ) )
            {
            // InternalMiniJava.g:492:2: ( ( rule__Assignments__Group__0 ) )
            // InternalMiniJava.g:493:3: ( rule__Assignments__Group__0 )
            {
             before(grammarAccess.getAssignmentsAccess().getGroup()); 
            // InternalMiniJava.g:494:3: ( rule__Assignments__Group__0 )
            // InternalMiniJava.g:494:4: rule__Assignments__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignments__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignments"


    // $ANTLR start "entryRuleIfStatements"
    // InternalMiniJava.g:503:1: entryRuleIfStatements : ruleIfStatements EOF ;
    public final void entryRuleIfStatements() throws RecognitionException {
        try {
            // InternalMiniJava.g:504:1: ( ruleIfStatements EOF )
            // InternalMiniJava.g:505:1: ruleIfStatements EOF
            {
             before(grammarAccess.getIfStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleIfStatements();

            state._fsp--;

             after(grammarAccess.getIfStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStatements"


    // $ANTLR start "ruleIfStatements"
    // InternalMiniJava.g:512:1: ruleIfStatements : ( ( rule__IfStatements__Group__0 ) ) ;
    public final void ruleIfStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:516:2: ( ( ( rule__IfStatements__Group__0 ) ) )
            // InternalMiniJava.g:517:2: ( ( rule__IfStatements__Group__0 ) )
            {
            // InternalMiniJava.g:517:2: ( ( rule__IfStatements__Group__0 ) )
            // InternalMiniJava.g:518:3: ( rule__IfStatements__Group__0 )
            {
             before(grammarAccess.getIfStatementsAccess().getGroup()); 
            // InternalMiniJava.g:519:3: ( rule__IfStatements__Group__0 )
            // InternalMiniJava.g:519:4: rule__IfStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatements"


    // $ANTLR start "entryRuleElseIfStatements"
    // InternalMiniJava.g:528:1: entryRuleElseIfStatements : ruleElseIfStatements EOF ;
    public final void entryRuleElseIfStatements() throws RecognitionException {
        try {
            // InternalMiniJava.g:529:1: ( ruleElseIfStatements EOF )
            // InternalMiniJava.g:530:1: ruleElseIfStatements EOF
            {
             before(grammarAccess.getElseIfStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleElseIfStatements();

            state._fsp--;

             after(grammarAccess.getElseIfStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElseIfStatements"


    // $ANTLR start "ruleElseIfStatements"
    // InternalMiniJava.g:537:1: ruleElseIfStatements : ( ( rule__ElseIfStatements__Group__0 ) ) ;
    public final void ruleElseIfStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:541:2: ( ( ( rule__ElseIfStatements__Group__0 ) ) )
            // InternalMiniJava.g:542:2: ( ( rule__ElseIfStatements__Group__0 ) )
            {
            // InternalMiniJava.g:542:2: ( ( rule__ElseIfStatements__Group__0 ) )
            // InternalMiniJava.g:543:3: ( rule__ElseIfStatements__Group__0 )
            {
             before(grammarAccess.getElseIfStatementsAccess().getGroup()); 
            // InternalMiniJava.g:544:3: ( rule__ElseIfStatements__Group__0 )
            // InternalMiniJava.g:544:4: rule__ElseIfStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseIfStatements"


    // $ANTLR start "entryRuleElseStatement"
    // InternalMiniJava.g:553:1: entryRuleElseStatement : ruleElseStatement EOF ;
    public final void entryRuleElseStatement() throws RecognitionException {
        try {
            // InternalMiniJava.g:554:1: ( ruleElseStatement EOF )
            // InternalMiniJava.g:555:1: ruleElseStatement EOF
            {
             before(grammarAccess.getElseStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleElseStatement();

            state._fsp--;

             after(grammarAccess.getElseStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElseStatement"


    // $ANTLR start "ruleElseStatement"
    // InternalMiniJava.g:562:1: ruleElseStatement : ( ( rule__ElseStatement__Group__0 ) ) ;
    public final void ruleElseStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:566:2: ( ( ( rule__ElseStatement__Group__0 ) ) )
            // InternalMiniJava.g:567:2: ( ( rule__ElseStatement__Group__0 ) )
            {
            // InternalMiniJava.g:567:2: ( ( rule__ElseStatement__Group__0 ) )
            // InternalMiniJava.g:568:3: ( rule__ElseStatement__Group__0 )
            {
             before(grammarAccess.getElseStatementAccess().getGroup()); 
            // InternalMiniJava.g:569:3: ( rule__ElseStatement__Group__0 )
            // InternalMiniJava.g:569:4: rule__ElseStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseStatement"


    // $ANTLR start "entryRuleWhileStatements"
    // InternalMiniJava.g:578:1: entryRuleWhileStatements : ruleWhileStatements EOF ;
    public final void entryRuleWhileStatements() throws RecognitionException {
        try {
            // InternalMiniJava.g:579:1: ( ruleWhileStatements EOF )
            // InternalMiniJava.g:580:1: ruleWhileStatements EOF
            {
             before(grammarAccess.getWhileStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleWhileStatements();

            state._fsp--;

             after(grammarAccess.getWhileStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileStatements"


    // $ANTLR start "ruleWhileStatements"
    // InternalMiniJava.g:587:1: ruleWhileStatements : ( ( rule__WhileStatements__Group__0 ) ) ;
    public final void ruleWhileStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:591:2: ( ( ( rule__WhileStatements__Group__0 ) ) )
            // InternalMiniJava.g:592:2: ( ( rule__WhileStatements__Group__0 ) )
            {
            // InternalMiniJava.g:592:2: ( ( rule__WhileStatements__Group__0 ) )
            // InternalMiniJava.g:593:3: ( rule__WhileStatements__Group__0 )
            {
             before(grammarAccess.getWhileStatementsAccess().getGroup()); 
            // InternalMiniJava.g:594:3: ( rule__WhileStatements__Group__0 )
            // InternalMiniJava.g:594:4: rule__WhileStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileStatements"


    // $ANTLR start "entryRuleReturnStatements"
    // InternalMiniJava.g:603:1: entryRuleReturnStatements : ruleReturnStatements EOF ;
    public final void entryRuleReturnStatements() throws RecognitionException {
        try {
            // InternalMiniJava.g:604:1: ( ruleReturnStatements EOF )
            // InternalMiniJava.g:605:1: ruleReturnStatements EOF
            {
             before(grammarAccess.getReturnStatementsRule()); 
            pushFollow(FOLLOW_1);
            ruleReturnStatements();

            state._fsp--;

             after(grammarAccess.getReturnStatementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnStatements"


    // $ANTLR start "ruleReturnStatements"
    // InternalMiniJava.g:612:1: ruleReturnStatements : ( ( rule__ReturnStatements__Group__0 ) ) ;
    public final void ruleReturnStatements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:616:2: ( ( ( rule__ReturnStatements__Group__0 ) ) )
            // InternalMiniJava.g:617:2: ( ( rule__ReturnStatements__Group__0 ) )
            {
            // InternalMiniJava.g:617:2: ( ( rule__ReturnStatements__Group__0 ) )
            // InternalMiniJava.g:618:3: ( rule__ReturnStatements__Group__0 )
            {
             before(grammarAccess.getReturnStatementsAccess().getGroup()); 
            // InternalMiniJava.g:619:3: ( rule__ReturnStatements__Group__0 )
            // InternalMiniJava.g:619:4: rule__ReturnStatements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnStatementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnStatements"


    // $ANTLR start "entryRuleOperator"
    // InternalMiniJava.g:628:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalMiniJava.g:629:1: ( ruleOperator EOF )
            // InternalMiniJava.g:630:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalMiniJava.g:637:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:641:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalMiniJava.g:642:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalMiniJava.g:642:2: ( ( rule__Operator__Alternatives ) )
            // InternalMiniJava.g:643:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalMiniJava.g:644:3: ( rule__Operator__Alternatives )
            // InternalMiniJava.g:644:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleCalcExp"
    // InternalMiniJava.g:653:1: entryRuleCalcExp : ruleCalcExp EOF ;
    public final void entryRuleCalcExp() throws RecognitionException {
        try {
            // InternalMiniJava.g:654:1: ( ruleCalcExp EOF )
            // InternalMiniJava.g:655:1: ruleCalcExp EOF
            {
             before(grammarAccess.getCalcExpRule()); 
            pushFollow(FOLLOW_1);
            ruleCalcExp();

            state._fsp--;

             after(grammarAccess.getCalcExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalcExp"


    // $ANTLR start "ruleCalcExp"
    // InternalMiniJava.g:662:1: ruleCalcExp : ( ( rule__CalcExp__Alternatives ) ) ;
    public final void ruleCalcExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:666:2: ( ( ( rule__CalcExp__Alternatives ) ) )
            // InternalMiniJava.g:667:2: ( ( rule__CalcExp__Alternatives ) )
            {
            // InternalMiniJava.g:667:2: ( ( rule__CalcExp__Alternatives ) )
            // InternalMiniJava.g:668:3: ( rule__CalcExp__Alternatives )
            {
             before(grammarAccess.getCalcExpAccess().getAlternatives()); 
            // InternalMiniJava.g:669:3: ( rule__CalcExp__Alternatives )
            // InternalMiniJava.g:669:4: rule__CalcExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CalcExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCalcExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalcExp"


    // $ANTLR start "entryRuleCompareExp"
    // InternalMiniJava.g:678:1: entryRuleCompareExp : ruleCompareExp EOF ;
    public final void entryRuleCompareExp() throws RecognitionException {
        try {
            // InternalMiniJava.g:679:1: ( ruleCompareExp EOF )
            // InternalMiniJava.g:680:1: ruleCompareExp EOF
            {
             before(grammarAccess.getCompareExpRule()); 
            pushFollow(FOLLOW_1);
            ruleCompareExp();

            state._fsp--;

             after(grammarAccess.getCompareExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompareExp"


    // $ANTLR start "ruleCompareExp"
    // InternalMiniJava.g:687:1: ruleCompareExp : ( ( rule__CompareExp__Group__0 ) ) ;
    public final void ruleCompareExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:691:2: ( ( ( rule__CompareExp__Group__0 ) ) )
            // InternalMiniJava.g:692:2: ( ( rule__CompareExp__Group__0 ) )
            {
            // InternalMiniJava.g:692:2: ( ( rule__CompareExp__Group__0 ) )
            // InternalMiniJava.g:693:3: ( rule__CompareExp__Group__0 )
            {
             before(grammarAccess.getCompareExpAccess().getGroup()); 
            // InternalMiniJava.g:694:3: ( rule__CompareExp__Group__0 )
            // InternalMiniJava.g:694:4: rule__CompareExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompareExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompareExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareExp"


    // $ANTLR start "entryRuleBasicJudge"
    // InternalMiniJava.g:703:1: entryRuleBasicJudge : ruleBasicJudge EOF ;
    public final void entryRuleBasicJudge() throws RecognitionException {
        try {
            // InternalMiniJava.g:704:1: ( ruleBasicJudge EOF )
            // InternalMiniJava.g:705:1: ruleBasicJudge EOF
            {
             before(grammarAccess.getBasicJudgeRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicJudge();

            state._fsp--;

             after(grammarAccess.getBasicJudgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBasicJudge"


    // $ANTLR start "ruleBasicJudge"
    // InternalMiniJava.g:712:1: ruleBasicJudge : ( ( rule__BasicJudge__Alternatives ) ) ;
    public final void ruleBasicJudge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:716:2: ( ( ( rule__BasicJudge__Alternatives ) ) )
            // InternalMiniJava.g:717:2: ( ( rule__BasicJudge__Alternatives ) )
            {
            // InternalMiniJava.g:717:2: ( ( rule__BasicJudge__Alternatives ) )
            // InternalMiniJava.g:718:3: ( rule__BasicJudge__Alternatives )
            {
             before(grammarAccess.getBasicJudgeAccess().getAlternatives()); 
            // InternalMiniJava.g:719:3: ( rule__BasicJudge__Alternatives )
            // InternalMiniJava.g:719:4: rule__BasicJudge__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicJudge__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicJudgeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicJudge"


    // $ANTLR start "entryRuleJudgeExp"
    // InternalMiniJava.g:728:1: entryRuleJudgeExp : ruleJudgeExp EOF ;
    public final void entryRuleJudgeExp() throws RecognitionException {
        try {
            // InternalMiniJava.g:729:1: ( ruleJudgeExp EOF )
            // InternalMiniJava.g:730:1: ruleJudgeExp EOF
            {
             before(grammarAccess.getJudgeExpRule()); 
            pushFollow(FOLLOW_1);
            ruleJudgeExp();

            state._fsp--;

             after(grammarAccess.getJudgeExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJudgeExp"


    // $ANTLR start "ruleJudgeExp"
    // InternalMiniJava.g:737:1: ruleJudgeExp : ( ( rule__JudgeExp__Group__0 ) ) ;
    public final void ruleJudgeExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:741:2: ( ( ( rule__JudgeExp__Group__0 ) ) )
            // InternalMiniJava.g:742:2: ( ( rule__JudgeExp__Group__0 ) )
            {
            // InternalMiniJava.g:742:2: ( ( rule__JudgeExp__Group__0 ) )
            // InternalMiniJava.g:743:3: ( rule__JudgeExp__Group__0 )
            {
             before(grammarAccess.getJudgeExpAccess().getGroup()); 
            // InternalMiniJava.g:744:3: ( rule__JudgeExp__Group__0 )
            // InternalMiniJava.g:744:4: rule__JudgeExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JudgeExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJudgeExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJudgeExp"


    // $ANTLR start "entryRuleNewExp"
    // InternalMiniJava.g:753:1: entryRuleNewExp : ruleNewExp EOF ;
    public final void entryRuleNewExp() throws RecognitionException {
        try {
            // InternalMiniJava.g:754:1: ( ruleNewExp EOF )
            // InternalMiniJava.g:755:1: ruleNewExp EOF
            {
             before(grammarAccess.getNewExpRule()); 
            pushFollow(FOLLOW_1);
            ruleNewExp();

            state._fsp--;

             after(grammarAccess.getNewExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNewExp"


    // $ANTLR start "ruleNewExp"
    // InternalMiniJava.g:762:1: ruleNewExp : ( ( rule__NewExp__Group__0 ) ) ;
    public final void ruleNewExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:766:2: ( ( ( rule__NewExp__Group__0 ) ) )
            // InternalMiniJava.g:767:2: ( ( rule__NewExp__Group__0 ) )
            {
            // InternalMiniJava.g:767:2: ( ( rule__NewExp__Group__0 ) )
            // InternalMiniJava.g:768:3: ( rule__NewExp__Group__0 )
            {
             before(grammarAccess.getNewExpAccess().getGroup()); 
            // InternalMiniJava.g:769:3: ( rule__NewExp__Group__0 )
            // InternalMiniJava.g:769:4: rule__NewExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NewExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNewExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNewExp"


    // $ANTLR start "entryRuleExpression"
    // InternalMiniJava.g:778:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMiniJava.g:779:1: ( ruleExpression EOF )
            // InternalMiniJava.g:780:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMiniJava.g:787:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:791:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMiniJava.g:792:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMiniJava.g:792:2: ( ( rule__Expression__Alternatives ) )
            // InternalMiniJava.g:793:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMiniJava.g:794:3: ( rule__Expression__Alternatives )
            // InternalMiniJava.g:794:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "ruleDomain"
    // InternalMiniJava.g:803:1: ruleDomain : ( ( rule__Domain__Alternatives ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:807:1: ( ( ( rule__Domain__Alternatives ) ) )
            // InternalMiniJava.g:808:2: ( ( rule__Domain__Alternatives ) )
            {
            // InternalMiniJava.g:808:2: ( ( rule__Domain__Alternatives ) )
            // InternalMiniJava.g:809:3: ( rule__Domain__Alternatives )
            {
             before(grammarAccess.getDomainAccess().getAlternatives()); 
            // InternalMiniJava.g:810:3: ( rule__Domain__Alternatives )
            // InternalMiniJava.g:810:4: rule__Domain__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Domain__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "ruleExtraAttr"
    // InternalMiniJava.g:819:1: ruleExtraAttr : ( ( rule__ExtraAttr__Alternatives ) ) ;
    public final void ruleExtraAttr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:823:1: ( ( ( rule__ExtraAttr__Alternatives ) ) )
            // InternalMiniJava.g:824:2: ( ( rule__ExtraAttr__Alternatives ) )
            {
            // InternalMiniJava.g:824:2: ( ( rule__ExtraAttr__Alternatives ) )
            // InternalMiniJava.g:825:3: ( rule__ExtraAttr__Alternatives )
            {
             before(grammarAccess.getExtraAttrAccess().getAlternatives()); 
            // InternalMiniJava.g:826:3: ( rule__ExtraAttr__Alternatives )
            // InternalMiniJava.g:826:4: rule__ExtraAttr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExtraAttr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExtraAttrAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtraAttr"


    // $ANTLR start "ruleBooleanExp"
    // InternalMiniJava.g:835:1: ruleBooleanExp : ( ( rule__BooleanExp__Alternatives ) ) ;
    public final void ruleBooleanExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:839:1: ( ( ( rule__BooleanExp__Alternatives ) ) )
            // InternalMiniJava.g:840:2: ( ( rule__BooleanExp__Alternatives ) )
            {
            // InternalMiniJava.g:840:2: ( ( rule__BooleanExp__Alternatives ) )
            // InternalMiniJava.g:841:3: ( rule__BooleanExp__Alternatives )
            {
             before(grammarAccess.getBooleanExpAccess().getAlternatives()); 
            // InternalMiniJava.g:842:3: ( rule__BooleanExp__Alternatives )
            // InternalMiniJava.g:842:4: rule__BooleanExp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExp"


    // $ANTLR start "rule__ConstantValue__Alternatives"
    // InternalMiniJava.g:850:1: rule__ConstantValue__Alternatives : ( ( RULE_STRING ) | ( RULE_INT ) | ( ruleDoubleLiteral ) );
    public final void rule__ConstantValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:854:1: ( ( RULE_STRING ) | ( RULE_INT ) | ( ruleDoubleLiteral ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INT) ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==53) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==RULE_INT) ) {
                        alt1=3;
                    }
                    else if ( (LA1_3==RULE_ID) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_2==EOF||LA1_2==40||(LA1_2>=47 && LA1_2<=49)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMiniJava.g:855:2: ( RULE_STRING )
                    {
                    // InternalMiniJava.g:855:2: ( RULE_STRING )
                    // InternalMiniJava.g:856:3: RULE_STRING
                    {
                     before(grammarAccess.getConstantValueAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:861:2: ( RULE_INT )
                    {
                    // InternalMiniJava.g:861:2: ( RULE_INT )
                    // InternalMiniJava.g:862:3: RULE_INT
                    {
                     before(grammarAccess.getConstantValueAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getConstantValueAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:867:2: ( ruleDoubleLiteral )
                    {
                    // InternalMiniJava.g:867:2: ( ruleDoubleLiteral )
                    // InternalMiniJava.g:868:3: ruleDoubleLiteral
                    {
                     before(grammarAccess.getConstantValueAccess().getDoubleLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleLiteral();

                    state._fsp--;

                     after(grammarAccess.getConstantValueAccess().getDoubleLiteralParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConstantValue__Alternatives"


    // $ANTLR start "rule__BasicDataType__Alternatives"
    // InternalMiniJava.g:877:1: rule__BasicDataType__Alternatives : ( ( 'int' ) | ( 'boolean' ) | ( 'double' ) | ( 'char' ) | ( 'long' ) );
    public final void rule__BasicDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:881:1: ( ( 'int' ) | ( 'boolean' ) | ( 'double' ) | ( 'char' ) | ( 'long' ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMiniJava.g:882:2: ( 'int' )
                    {
                    // InternalMiniJava.g:882:2: ( 'int' )
                    // InternalMiniJava.g:883:3: 'int'
                    {
                     before(grammarAccess.getBasicDataTypeAccess().getIntKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getBasicDataTypeAccess().getIntKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:888:2: ( 'boolean' )
                    {
                    // InternalMiniJava.g:888:2: ( 'boolean' )
                    // InternalMiniJava.g:889:3: 'boolean'
                    {
                     before(grammarAccess.getBasicDataTypeAccess().getBooleanKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getBasicDataTypeAccess().getBooleanKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:894:2: ( 'double' )
                    {
                    // InternalMiniJava.g:894:2: ( 'double' )
                    // InternalMiniJava.g:895:3: 'double'
                    {
                     before(grammarAccess.getBasicDataTypeAccess().getDoubleKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getBasicDataTypeAccess().getDoubleKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:900:2: ( 'char' )
                    {
                    // InternalMiniJava.g:900:2: ( 'char' )
                    // InternalMiniJava.g:901:3: 'char'
                    {
                     before(grammarAccess.getBasicDataTypeAccess().getCharKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getBasicDataTypeAccess().getCharKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:906:2: ( 'long' )
                    {
                    // InternalMiniJava.g:906:2: ( 'long' )
                    // InternalMiniJava.g:907:3: 'long'
                    {
                     before(grammarAccess.getBasicDataTypeAccess().getLongKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getBasicDataTypeAccess().getLongKeyword_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicDataType__Alternatives"


    // $ANTLR start "rule__DataType__Alternatives"
    // InternalMiniJava.g:916:1: rule__DataType__Alternatives : ( ( ruleBasicDataType ) | ( ruleQualifiedName ) | ( ( rule__DataType__Group_2__0 ) ) );
    public final void rule__DataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:920:1: ( ( ruleBasicDataType ) | ( ruleQualifiedName ) | ( ( rule__DataType__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==47) ) {
                    alt3=3;
                }
                else if ( (LA3_1==EOF||LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==47) ) {
                    alt3=3;
                }
                else if ( (LA3_2==EOF||LA3_2==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 13:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==47) ) {
                    alt3=3;
                }
                else if ( (LA3_3==EOF||LA3_3==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==47) ) {
                    alt3=3;
                }
                else if ( (LA3_4==EOF||LA3_4==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_5 = input.LA(2);

                if ( (LA3_5==47) ) {
                    alt3=3;
                }
                else if ( (LA3_5==EOF||LA3_5==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMiniJava.g:921:2: ( ruleBasicDataType )
                    {
                    // InternalMiniJava.g:921:2: ( ruleBasicDataType )
                    // InternalMiniJava.g:922:3: ruleBasicDataType
                    {
                     before(grammarAccess.getDataTypeAccess().getBasicDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBasicDataType();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getBasicDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:927:2: ( ruleQualifiedName )
                    {
                    // InternalMiniJava.g:927:2: ( ruleQualifiedName )
                    // InternalMiniJava.g:928:3: ruleQualifiedName
                    {
                     before(grammarAccess.getDataTypeAccess().getQualifiedNameParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;

                     after(grammarAccess.getDataTypeAccess().getQualifiedNameParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:933:2: ( ( rule__DataType__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:933:2: ( ( rule__DataType__Group_2__0 ) )
                    // InternalMiniJava.g:934:3: ( rule__DataType__Group_2__0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getGroup_2()); 
                    // InternalMiniJava.g:935:3: ( rule__DataType__Group_2__0 )
                    // InternalMiniJava.g:935:4: rule__DataType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Alternatives"


    // $ANTLR start "rule__ReturnType__Alternatives"
    // InternalMiniJava.g:943:1: rule__ReturnType__Alternatives : ( ( ruleDataType ) | ( 'void' ) );
    public final void rule__ReturnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:947:1: ( ( ruleDataType ) | ( 'void' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=11 && LA4_0<=15)) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMiniJava.g:948:2: ( ruleDataType )
                    {
                    // InternalMiniJava.g:948:2: ( ruleDataType )
                    // InternalMiniJava.g:949:3: ruleDataType
                    {
                     before(grammarAccess.getReturnTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getReturnTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:954:2: ( 'void' )
                    {
                    // InternalMiniJava.g:954:2: ( 'void' )
                    // InternalMiniJava.g:955:3: 'void'
                    {
                     before(grammarAccess.getReturnTypeAccess().getVoidKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getReturnTypeAccess().getVoidKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnType__Alternatives"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalMiniJava.g:964:1: rule__Member__Alternatives : ( ( ruleVariableDecl ) | ( ruleMethodDecl ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:968:1: ( ( ruleVariableDecl ) | ( ruleMethodDecl ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=11 && LA5_0<=15)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=32 && LA5_0<=34)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMiniJava.g:969:2: ( ruleVariableDecl )
                    {
                    // InternalMiniJava.g:969:2: ( ruleVariableDecl )
                    // InternalMiniJava.g:970:3: ruleVariableDecl
                    {
                     before(grammarAccess.getMemberAccess().getVariableDeclParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDecl();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getVariableDeclParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:975:2: ( ruleMethodDecl )
                    {
                    // InternalMiniJava.g:975:2: ( ruleMethodDecl )
                    // InternalMiniJava.g:976:3: ruleMethodDecl
                    {
                     before(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMethodDecl();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getMethodDeclParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalMiniJava.g:985:1: rule__Statement__Alternatives : ( ( ( rule__Statement__VarDefAssignment_0 ) ) | ( ( rule__Statement__AssignAssignment_1 ) ) | ( ( rule__Statement__IfStatAssignment_2 ) ) | ( ( rule__Statement__WhileStatAssignment_3 ) ) | ( ( rule__Statement__RetStatAssignment_4 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:989:1: ( ( ( rule__Statement__VarDefAssignment_0 ) ) | ( ( rule__Statement__AssignAssignment_1 ) ) | ( ( rule__Statement__IfStatAssignment_2 ) ) | ( ( rule__Statement__WhileStatAssignment_3 ) ) | ( ( rule__Statement__RetStatAssignment_4 ) ) )
            int alt6=5;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMiniJava.g:990:2: ( ( rule__Statement__VarDefAssignment_0 ) )
                    {
                    // InternalMiniJava.g:990:2: ( ( rule__Statement__VarDefAssignment_0 ) )
                    // InternalMiniJava.g:991:3: ( rule__Statement__VarDefAssignment_0 )
                    {
                     before(grammarAccess.getStatementAccess().getVarDefAssignment_0()); 
                    // InternalMiniJava.g:992:3: ( rule__Statement__VarDefAssignment_0 )
                    // InternalMiniJava.g:992:4: rule__Statement__VarDefAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__VarDefAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getVarDefAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:996:2: ( ( rule__Statement__AssignAssignment_1 ) )
                    {
                    // InternalMiniJava.g:996:2: ( ( rule__Statement__AssignAssignment_1 ) )
                    // InternalMiniJava.g:997:3: ( rule__Statement__AssignAssignment_1 )
                    {
                     before(grammarAccess.getStatementAccess().getAssignAssignment_1()); 
                    // InternalMiniJava.g:998:3: ( rule__Statement__AssignAssignment_1 )
                    // InternalMiniJava.g:998:4: rule__Statement__AssignAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__AssignAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getAssignAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1002:2: ( ( rule__Statement__IfStatAssignment_2 ) )
                    {
                    // InternalMiniJava.g:1002:2: ( ( rule__Statement__IfStatAssignment_2 ) )
                    // InternalMiniJava.g:1003:3: ( rule__Statement__IfStatAssignment_2 )
                    {
                     before(grammarAccess.getStatementAccess().getIfStatAssignment_2()); 
                    // InternalMiniJava.g:1004:3: ( rule__Statement__IfStatAssignment_2 )
                    // InternalMiniJava.g:1004:4: rule__Statement__IfStatAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__IfStatAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getIfStatAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1008:2: ( ( rule__Statement__WhileStatAssignment_3 ) )
                    {
                    // InternalMiniJava.g:1008:2: ( ( rule__Statement__WhileStatAssignment_3 ) )
                    // InternalMiniJava.g:1009:3: ( rule__Statement__WhileStatAssignment_3 )
                    {
                     before(grammarAccess.getStatementAccess().getWhileStatAssignment_3()); 
                    // InternalMiniJava.g:1010:3: ( rule__Statement__WhileStatAssignment_3 )
                    // InternalMiniJava.g:1010:4: rule__Statement__WhileStatAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__WhileStatAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getWhileStatAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1014:2: ( ( rule__Statement__RetStatAssignment_4 ) )
                    {
                    // InternalMiniJava.g:1014:2: ( ( rule__Statement__RetStatAssignment_4 ) )
                    // InternalMiniJava.g:1015:3: ( rule__Statement__RetStatAssignment_4 )
                    {
                     before(grammarAccess.getStatementAccess().getRetStatAssignment_4()); 
                    // InternalMiniJava.g:1016:3: ( rule__Statement__RetStatAssignment_4 )
                    // InternalMiniJava.g:1016:4: rule__Statement__RetStatAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statement__RetStatAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getRetStatAssignment_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__LValueExp__Alternatives"
    // InternalMiniJava.g:1024:1: rule__LValueExp__Alternatives : ( ( ( rule__LValueExp__IdAssignment_0 ) ) | ( ( rule__LValueExp__Group_1__0 ) ) | ( ( rule__LValueExp__Group_2__0 ) ) );
    public final void rule__LValueExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1028:1: ( ( ( rule__LValueExp__IdAssignment_0 ) ) | ( ( rule__LValueExp__Group_1__0 ) ) | ( ( rule__LValueExp__Group_2__0 ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMiniJava.g:1029:2: ( ( rule__LValueExp__IdAssignment_0 ) )
                    {
                    // InternalMiniJava.g:1029:2: ( ( rule__LValueExp__IdAssignment_0 ) )
                    // InternalMiniJava.g:1030:3: ( rule__LValueExp__IdAssignment_0 )
                    {
                     before(grammarAccess.getLValueExpAccess().getIdAssignment_0()); 
                    // InternalMiniJava.g:1031:3: ( rule__LValueExp__IdAssignment_0 )
                    // InternalMiniJava.g:1031:4: rule__LValueExp__IdAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LValueExp__IdAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLValueExpAccess().getIdAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1035:2: ( ( rule__LValueExp__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1035:2: ( ( rule__LValueExp__Group_1__0 ) )
                    // InternalMiniJava.g:1036:3: ( rule__LValueExp__Group_1__0 )
                    {
                     before(grammarAccess.getLValueExpAccess().getGroup_1()); 
                    // InternalMiniJava.g:1037:3: ( rule__LValueExp__Group_1__0 )
                    // InternalMiniJava.g:1037:4: rule__LValueExp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LValueExp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLValueExpAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1041:2: ( ( rule__LValueExp__Group_2__0 ) )
                    {
                    // InternalMiniJava.g:1041:2: ( ( rule__LValueExp__Group_2__0 ) )
                    // InternalMiniJava.g:1042:3: ( rule__LValueExp__Group_2__0 )
                    {
                     before(grammarAccess.getLValueExpAccess().getGroup_2()); 
                    // InternalMiniJava.g:1043:3: ( rule__LValueExp__Group_2__0 )
                    // InternalMiniJava.g:1043:4: rule__LValueExp__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LValueExp__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLValueExpAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalMiniJava.g:1051:1: rule__Operator__Alternatives : ( ( '!' ) | ( '&' ) | ( '|' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '%' ) | ( '<<' ) | ( '>>' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1055:1: ( ( '!' ) | ( '&' ) | ( '|' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '%' ) | ( '<<' ) | ( '>>' ) | ( '==' ) | ( '!=' ) | ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt8=15;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 19:
                {
                alt8=3;
                }
                break;
            case 20:
                {
                alt8=4;
                }
                break;
            case 21:
                {
                alt8=5;
                }
                break;
            case 22:
                {
                alt8=6;
                }
                break;
            case 23:
                {
                alt8=7;
                }
                break;
            case 24:
                {
                alt8=8;
                }
                break;
            case 25:
                {
                alt8=9;
                }
                break;
            case 26:
                {
                alt8=10;
                }
                break;
            case 27:
                {
                alt8=11;
                }
                break;
            case 28:
                {
                alt8=12;
                }
                break;
            case 29:
                {
                alt8=13;
                }
                break;
            case 30:
                {
                alt8=14;
                }
                break;
            case 31:
                {
                alt8=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMiniJava.g:1056:2: ( '!' )
                    {
                    // InternalMiniJava.g:1056:2: ( '!' )
                    // InternalMiniJava.g:1057:3: '!'
                    {
                     before(grammarAccess.getOperatorAccess().getExclamationMarkKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getExclamationMarkKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1062:2: ( '&' )
                    {
                    // InternalMiniJava.g:1062:2: ( '&' )
                    // InternalMiniJava.g:1063:3: '&'
                    {
                     before(grammarAccess.getOperatorAccess().getAmpersandKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getAmpersandKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1068:2: ( '|' )
                    {
                    // InternalMiniJava.g:1068:2: ( '|' )
                    // InternalMiniJava.g:1069:3: '|'
                    {
                     before(grammarAccess.getOperatorAccess().getVerticalLineKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getVerticalLineKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1074:2: ( '+' )
                    {
                    // InternalMiniJava.g:1074:2: ( '+' )
                    // InternalMiniJava.g:1075:3: '+'
                    {
                     before(grammarAccess.getOperatorAccess().getPlusSignKeyword_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getPlusSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMiniJava.g:1080:2: ( '-' )
                    {
                    // InternalMiniJava.g:1080:2: ( '-' )
                    // InternalMiniJava.g:1081:3: '-'
                    {
                     before(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_4()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getHyphenMinusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMiniJava.g:1086:2: ( '*' )
                    {
                    // InternalMiniJava.g:1086:2: ( '*' )
                    // InternalMiniJava.g:1087:3: '*'
                    {
                     before(grammarAccess.getOperatorAccess().getAsteriskKeyword_5()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getAsteriskKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMiniJava.g:1092:2: ( '%' )
                    {
                    // InternalMiniJava.g:1092:2: ( '%' )
                    // InternalMiniJava.g:1093:3: '%'
                    {
                     before(grammarAccess.getOperatorAccess().getPercentSignKeyword_6()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getPercentSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMiniJava.g:1098:2: ( '<<' )
                    {
                    // InternalMiniJava.g:1098:2: ( '<<' )
                    // InternalMiniJava.g:1099:3: '<<'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignLessThanSignKeyword_7()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignLessThanSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMiniJava.g:1104:2: ( '>>' )
                    {
                    // InternalMiniJava.g:1104:2: ( '>>' )
                    // InternalMiniJava.g:1105:3: '>>'
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_8()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignGreaterThanSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMiniJava.g:1110:2: ( '==' )
                    {
                    // InternalMiniJava.g:1110:2: ( '==' )
                    // InternalMiniJava.g:1111:3: '=='
                    {
                     before(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_9()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMiniJava.g:1116:2: ( '!=' )
                    {
                    // InternalMiniJava.g:1116:2: ( '!=' )
                    // InternalMiniJava.g:1117:3: '!='
                    {
                     before(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_10()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMiniJava.g:1122:2: ( '>=' )
                    {
                    // InternalMiniJava.g:1122:2: ( '>=' )
                    // InternalMiniJava.g:1123:3: '>='
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_11()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMiniJava.g:1128:2: ( '<=' )
                    {
                    // InternalMiniJava.g:1128:2: ( '<=' )
                    // InternalMiniJava.g:1129:3: '<='
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_12()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMiniJava.g:1134:2: ( '>' )
                    {
                    // InternalMiniJava.g:1134:2: ( '>' )
                    // InternalMiniJava.g:1135:3: '>'
                    {
                     before(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_13()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMiniJava.g:1140:2: ( '<' )
                    {
                    // InternalMiniJava.g:1140:2: ( '<' )
                    // InternalMiniJava.g:1141:3: '<'
                    {
                     before(grammarAccess.getOperatorAccess().getLessThanSignKeyword_14()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getOperatorAccess().getLessThanSignKeyword_14()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__CalcExp__Alternatives"
    // InternalMiniJava.g:1150:1: rule__CalcExp__Alternatives : ( ( ( rule__CalcExp__LeftNameAssignment_0 ) ) | ( ( rule__CalcExp__Group_1__0 ) ) | ( ( rule__CalcExp__RightNumAssignment_2 ) ) );
    public final void rule__CalcExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1154:1: ( ( ( rule__CalcExp__LeftNameAssignment_0 ) ) | ( ( rule__CalcExp__Group_1__0 ) ) | ( ( rule__CalcExp__RightNumAssignment_2 ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=17 && LA9_2<=31)) ) {
                    alt9=2;
                }
                else if ( (LA9_2==EOF||LA9_2==40||(LA9_2>=47 && LA9_2<=49)||LA9_2==53) ) {
                    alt9=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMiniJava.g:1155:2: ( ( rule__CalcExp__LeftNameAssignment_0 ) )
                    {
                    // InternalMiniJava.g:1155:2: ( ( rule__CalcExp__LeftNameAssignment_0 ) )
                    // InternalMiniJava.g:1156:3: ( rule__CalcExp__LeftNameAssignment_0 )
                    {
                     before(grammarAccess.getCalcExpAccess().getLeftNameAssignment_0()); 
                    // InternalMiniJava.g:1157:3: ( rule__CalcExp__LeftNameAssignment_0 )
                    // InternalMiniJava.g:1157:4: rule__CalcExp__LeftNameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalcExp__LeftNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalcExpAccess().getLeftNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1161:2: ( ( rule__CalcExp__Group_1__0 ) )
                    {
                    // InternalMiniJava.g:1161:2: ( ( rule__CalcExp__Group_1__0 ) )
                    // InternalMiniJava.g:1162:3: ( rule__CalcExp__Group_1__0 )
                    {
                     before(grammarAccess.getCalcExpAccess().getGroup_1()); 
                    // InternalMiniJava.g:1163:3: ( rule__CalcExp__Group_1__0 )
                    // InternalMiniJava.g:1163:4: rule__CalcExp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalcExp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalcExpAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1167:2: ( ( rule__CalcExp__RightNumAssignment_2 ) )
                    {
                    // InternalMiniJava.g:1167:2: ( ( rule__CalcExp__RightNumAssignment_2 ) )
                    // InternalMiniJava.g:1168:3: ( rule__CalcExp__RightNumAssignment_2 )
                    {
                     before(grammarAccess.getCalcExpAccess().getRightNumAssignment_2()); 
                    // InternalMiniJava.g:1169:3: ( rule__CalcExp__RightNumAssignment_2 )
                    // InternalMiniJava.g:1169:4: rule__CalcExp__RightNumAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CalcExp__RightNumAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCalcExpAccess().getRightNumAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__Alternatives"


    // $ANTLR start "rule__BasicJudge__Alternatives"
    // InternalMiniJava.g:1177:1: rule__BasicJudge__Alternatives : ( ( ( rule__BasicJudge__BEAssignment_0 ) ) | ( ( rule__BasicJudge__CmpAssignment_1 ) ) );
    public final void rule__BasicJudge__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1181:1: ( ( ( rule__BasicJudge__BEAssignment_0 ) ) | ( ( rule__BasicJudge__CmpAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=37 && LA10_0<=38)) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMiniJava.g:1182:2: ( ( rule__BasicJudge__BEAssignment_0 ) )
                    {
                    // InternalMiniJava.g:1182:2: ( ( rule__BasicJudge__BEAssignment_0 ) )
                    // InternalMiniJava.g:1183:3: ( rule__BasicJudge__BEAssignment_0 )
                    {
                     before(grammarAccess.getBasicJudgeAccess().getBEAssignment_0()); 
                    // InternalMiniJava.g:1184:3: ( rule__BasicJudge__BEAssignment_0 )
                    // InternalMiniJava.g:1184:4: rule__BasicJudge__BEAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicJudge__BEAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicJudgeAccess().getBEAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1188:2: ( ( rule__BasicJudge__CmpAssignment_1 ) )
                    {
                    // InternalMiniJava.g:1188:2: ( ( rule__BasicJudge__CmpAssignment_1 ) )
                    // InternalMiniJava.g:1189:3: ( rule__BasicJudge__CmpAssignment_1 )
                    {
                     before(grammarAccess.getBasicJudgeAccess().getCmpAssignment_1()); 
                    // InternalMiniJava.g:1190:3: ( rule__BasicJudge__CmpAssignment_1 )
                    // InternalMiniJava.g:1190:4: rule__BasicJudge__CmpAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BasicJudge__CmpAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBasicJudgeAccess().getCmpAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJudge__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMiniJava.g:1198:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ConstAssignment_0 ) ) | ( ( rule__Expression__CeAssignment_1 ) ) | ( ( rule__Expression__JeAssignment_2 ) ) | ( ( rule__Expression__NeAssignment_3 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1202:1: ( ( ( rule__Expression__ConstAssignment_0 ) ) | ( ( rule__Expression__CeAssignment_1 ) ) | ( ( rule__Expression__JeAssignment_2 ) ) | ( ( rule__Expression__NeAssignment_3 ) ) )
            int alt11=4;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalMiniJava.g:1203:2: ( ( rule__Expression__ConstAssignment_0 ) )
                    {
                    // InternalMiniJava.g:1203:2: ( ( rule__Expression__ConstAssignment_0 ) )
                    // InternalMiniJava.g:1204:3: ( rule__Expression__ConstAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getConstAssignment_0()); 
                    // InternalMiniJava.g:1205:3: ( rule__Expression__ConstAssignment_0 )
                    // InternalMiniJava.g:1205:4: rule__Expression__ConstAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ConstAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getConstAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1209:2: ( ( rule__Expression__CeAssignment_1 ) )
                    {
                    // InternalMiniJava.g:1209:2: ( ( rule__Expression__CeAssignment_1 ) )
                    // InternalMiniJava.g:1210:3: ( rule__Expression__CeAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getCeAssignment_1()); 
                    // InternalMiniJava.g:1211:3: ( rule__Expression__CeAssignment_1 )
                    // InternalMiniJava.g:1211:4: rule__Expression__CeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getCeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1215:2: ( ( rule__Expression__JeAssignment_2 ) )
                    {
                    // InternalMiniJava.g:1215:2: ( ( rule__Expression__JeAssignment_2 ) )
                    // InternalMiniJava.g:1216:3: ( rule__Expression__JeAssignment_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getJeAssignment_2()); 
                    // InternalMiniJava.g:1217:3: ( rule__Expression__JeAssignment_2 )
                    // InternalMiniJava.g:1217:4: rule__Expression__JeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__JeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getJeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMiniJava.g:1221:2: ( ( rule__Expression__NeAssignment_3 ) )
                    {
                    // InternalMiniJava.g:1221:2: ( ( rule__Expression__NeAssignment_3 ) )
                    // InternalMiniJava.g:1222:3: ( rule__Expression__NeAssignment_3 )
                    {
                     before(grammarAccess.getExpressionAccess().getNeAssignment_3()); 
                    // InternalMiniJava.g:1223:3: ( rule__Expression__NeAssignment_3 )
                    // InternalMiniJava.g:1223:4: rule__Expression__NeAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__NeAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getNeAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Domain__Alternatives"
    // InternalMiniJava.g:1231:1: rule__Domain__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) );
    public final void rule__Domain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1235:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) | ( ( 'protected' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMiniJava.g:1236:2: ( ( 'public' ) )
                    {
                    // InternalMiniJava.g:1236:2: ( ( 'public' ) )
                    // InternalMiniJava.g:1237:3: ( 'public' )
                    {
                     before(grammarAccess.getDomainAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalMiniJava.g:1238:3: ( 'public' )
                    // InternalMiniJava.g:1238:4: 'public'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getDomainAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1242:2: ( ( 'private' ) )
                    {
                    // InternalMiniJava.g:1242:2: ( ( 'private' ) )
                    // InternalMiniJava.g:1243:3: ( 'private' )
                    {
                     before(grammarAccess.getDomainAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalMiniJava.g:1244:3: ( 'private' )
                    // InternalMiniJava.g:1244:4: 'private'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getDomainAccess().getPRIVATEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMiniJava.g:1248:2: ( ( 'protected' ) )
                    {
                    // InternalMiniJava.g:1248:2: ( ( 'protected' ) )
                    // InternalMiniJava.g:1249:3: ( 'protected' )
                    {
                     before(grammarAccess.getDomainAccess().getPROTECTEDEnumLiteralDeclaration_2()); 
                    // InternalMiniJava.g:1250:3: ( 'protected' )
                    // InternalMiniJava.g:1250:4: 'protected'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getDomainAccess().getPROTECTEDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Alternatives"


    // $ANTLR start "rule__ExtraAttr__Alternatives"
    // InternalMiniJava.g:1258:1: rule__ExtraAttr__Alternatives : ( ( ( 'static' ) ) | ( ( 'abstract' ) ) );
    public final void rule__ExtraAttr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1262:1: ( ( ( 'static' ) ) | ( ( 'abstract' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            else if ( (LA13_0==36) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMiniJava.g:1263:2: ( ( 'static' ) )
                    {
                    // InternalMiniJava.g:1263:2: ( ( 'static' ) )
                    // InternalMiniJava.g:1264:3: ( 'static' )
                    {
                     before(grammarAccess.getExtraAttrAccess().getSTATICEnumLiteralDeclaration_0()); 
                    // InternalMiniJava.g:1265:3: ( 'static' )
                    // InternalMiniJava.g:1265:4: 'static'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getExtraAttrAccess().getSTATICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1269:2: ( ( 'abstract' ) )
                    {
                    // InternalMiniJava.g:1269:2: ( ( 'abstract' ) )
                    // InternalMiniJava.g:1270:3: ( 'abstract' )
                    {
                     before(grammarAccess.getExtraAttrAccess().getABSTRACTEnumLiteralDeclaration_1()); 
                    // InternalMiniJava.g:1271:3: ( 'abstract' )
                    // InternalMiniJava.g:1271:4: 'abstract'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getExtraAttrAccess().getABSTRACTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtraAttr__Alternatives"


    // $ANTLR start "rule__BooleanExp__Alternatives"
    // InternalMiniJava.g:1279:1: rule__BooleanExp__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanExp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1283:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==37) ) {
                alt14=1;
            }
            else if ( (LA14_0==38) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMiniJava.g:1284:2: ( ( 'true' ) )
                    {
                    // InternalMiniJava.g:1284:2: ( ( 'true' ) )
                    // InternalMiniJava.g:1285:3: ( 'true' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalMiniJava.g:1286:3: ( 'true' )
                    // InternalMiniJava.g:1286:4: 'true'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMiniJava.g:1290:2: ( ( 'false' ) )
                    {
                    // InternalMiniJava.g:1290:2: ( ( 'false' ) )
                    // InternalMiniJava.g:1291:3: ( 'false' )
                    {
                     before(grammarAccess.getBooleanExpAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalMiniJava.g:1292:3: ( 'false' )
                    // InternalMiniJava.g:1292:4: 'false'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanExpAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExp__Alternatives"


    // $ANTLR start "rule__MiniJava__Group__0"
    // InternalMiniJava.g:1300:1: rule__MiniJava__Group__0 : rule__MiniJava__Group__0__Impl rule__MiniJava__Group__1 ;
    public final void rule__MiniJava__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1304:1: ( rule__MiniJava__Group__0__Impl rule__MiniJava__Group__1 )
            // InternalMiniJava.g:1305:2: rule__MiniJava__Group__0__Impl rule__MiniJava__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MiniJava__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiniJava__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__0"


    // $ANTLR start "rule__MiniJava__Group__0__Impl"
    // InternalMiniJava.g:1312:1: rule__MiniJava__Group__0__Impl : ( ( rule__MiniJava__PackageAssignment_0 ) ) ;
    public final void rule__MiniJava__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1316:1: ( ( ( rule__MiniJava__PackageAssignment_0 ) ) )
            // InternalMiniJava.g:1317:1: ( ( rule__MiniJava__PackageAssignment_0 ) )
            {
            // InternalMiniJava.g:1317:1: ( ( rule__MiniJava__PackageAssignment_0 ) )
            // InternalMiniJava.g:1318:2: ( rule__MiniJava__PackageAssignment_0 )
            {
             before(grammarAccess.getMiniJavaAccess().getPackageAssignment_0()); 
            // InternalMiniJava.g:1319:2: ( rule__MiniJava__PackageAssignment_0 )
            // InternalMiniJava.g:1319:3: rule__MiniJava__PackageAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MiniJava__PackageAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMiniJavaAccess().getPackageAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__0__Impl"


    // $ANTLR start "rule__MiniJava__Group__1"
    // InternalMiniJava.g:1327:1: rule__MiniJava__Group__1 : rule__MiniJava__Group__1__Impl rule__MiniJava__Group__2 ;
    public final void rule__MiniJava__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1331:1: ( rule__MiniJava__Group__1__Impl rule__MiniJava__Group__2 )
            // InternalMiniJava.g:1332:2: rule__MiniJava__Group__1__Impl rule__MiniJava__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MiniJava__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiniJava__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__1"


    // $ANTLR start "rule__MiniJava__Group__1__Impl"
    // InternalMiniJava.g:1339:1: rule__MiniJava__Group__1__Impl : ( ( rule__MiniJava__ImportsAssignment_1 )* ) ;
    public final void rule__MiniJava__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1343:1: ( ( ( rule__MiniJava__ImportsAssignment_1 )* ) )
            // InternalMiniJava.g:1344:1: ( ( rule__MiniJava__ImportsAssignment_1 )* )
            {
            // InternalMiniJava.g:1344:1: ( ( rule__MiniJava__ImportsAssignment_1 )* )
            // InternalMiniJava.g:1345:2: ( rule__MiniJava__ImportsAssignment_1 )*
            {
             before(grammarAccess.getMiniJavaAccess().getImportsAssignment_1()); 
            // InternalMiniJava.g:1346:2: ( rule__MiniJava__ImportsAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==41) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMiniJava.g:1346:3: rule__MiniJava__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MiniJava__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getMiniJavaAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__1__Impl"


    // $ANTLR start "rule__MiniJava__Group__2"
    // InternalMiniJava.g:1354:1: rule__MiniJava__Group__2 : rule__MiniJava__Group__2__Impl rule__MiniJava__Group__3 ;
    public final void rule__MiniJava__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1358:1: ( rule__MiniJava__Group__2__Impl rule__MiniJava__Group__3 )
            // InternalMiniJava.g:1359:2: rule__MiniJava__Group__2__Impl rule__MiniJava__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MiniJava__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MiniJava__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__2"


    // $ANTLR start "rule__MiniJava__Group__2__Impl"
    // InternalMiniJava.g:1366:1: rule__MiniJava__Group__2__Impl : ( ( rule__MiniJava__MainclassAssignment_2 ) ) ;
    public final void rule__MiniJava__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1370:1: ( ( ( rule__MiniJava__MainclassAssignment_2 ) ) )
            // InternalMiniJava.g:1371:1: ( ( rule__MiniJava__MainclassAssignment_2 ) )
            {
            // InternalMiniJava.g:1371:1: ( ( rule__MiniJava__MainclassAssignment_2 ) )
            // InternalMiniJava.g:1372:2: ( rule__MiniJava__MainclassAssignment_2 )
            {
             before(grammarAccess.getMiniJavaAccess().getMainclassAssignment_2()); 
            // InternalMiniJava.g:1373:2: ( rule__MiniJava__MainclassAssignment_2 )
            // InternalMiniJava.g:1373:3: rule__MiniJava__MainclassAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MiniJava__MainclassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMiniJavaAccess().getMainclassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__2__Impl"


    // $ANTLR start "rule__MiniJava__Group__3"
    // InternalMiniJava.g:1381:1: rule__MiniJava__Group__3 : rule__MiniJava__Group__3__Impl ;
    public final void rule__MiniJava__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1385:1: ( rule__MiniJava__Group__3__Impl )
            // InternalMiniJava.g:1386:2: rule__MiniJava__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MiniJava__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__3"


    // $ANTLR start "rule__MiniJava__Group__3__Impl"
    // InternalMiniJava.g:1392:1: rule__MiniJava__Group__3__Impl : ( ( rule__MiniJava__ClassesAssignment_3 )* ) ;
    public final void rule__MiniJava__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1396:1: ( ( ( rule__MiniJava__ClassesAssignment_3 )* ) )
            // InternalMiniJava.g:1397:1: ( ( rule__MiniJava__ClassesAssignment_3 )* )
            {
            // InternalMiniJava.g:1397:1: ( ( rule__MiniJava__ClassesAssignment_3 )* )
            // InternalMiniJava.g:1398:2: ( rule__MiniJava__ClassesAssignment_3 )*
            {
             before(grammarAccess.getMiniJavaAccess().getClassesAssignment_3()); 
            // InternalMiniJava.g:1399:2: ( rule__MiniJava__ClassesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMiniJava.g:1399:3: rule__MiniJava__ClassesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MiniJava__ClassesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMiniJavaAccess().getClassesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__Group__3__Impl"


    // $ANTLR start "rule__PackageDecl__Group__0"
    // InternalMiniJava.g:1408:1: rule__PackageDecl__Group__0 : rule__PackageDecl__Group__0__Impl rule__PackageDecl__Group__1 ;
    public final void rule__PackageDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1412:1: ( rule__PackageDecl__Group__0__Impl rule__PackageDecl__Group__1 )
            // InternalMiniJava.g:1413:2: rule__PackageDecl__Group__0__Impl rule__PackageDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__PackageDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__0"


    // $ANTLR start "rule__PackageDecl__Group__0__Impl"
    // InternalMiniJava.g:1420:1: rule__PackageDecl__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1424:1: ( ( 'package' ) )
            // InternalMiniJava.g:1425:1: ( 'package' )
            {
            // InternalMiniJava.g:1425:1: ( 'package' )
            // InternalMiniJava.g:1426:2: 'package'
            {
             before(grammarAccess.getPackageDeclAccess().getPackageKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPackageDeclAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__0__Impl"


    // $ANTLR start "rule__PackageDecl__Group__1"
    // InternalMiniJava.g:1435:1: rule__PackageDecl__Group__1 : rule__PackageDecl__Group__1__Impl rule__PackageDecl__Group__2 ;
    public final void rule__PackageDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1439:1: ( rule__PackageDecl__Group__1__Impl rule__PackageDecl__Group__2 )
            // InternalMiniJava.g:1440:2: rule__PackageDecl__Group__1__Impl rule__PackageDecl__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__PackageDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__1"


    // $ANTLR start "rule__PackageDecl__Group__1__Impl"
    // InternalMiniJava.g:1447:1: rule__PackageDecl__Group__1__Impl : ( ( rule__PackageDecl__NameAssignment_1 ) ) ;
    public final void rule__PackageDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1451:1: ( ( ( rule__PackageDecl__NameAssignment_1 ) ) )
            // InternalMiniJava.g:1452:1: ( ( rule__PackageDecl__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:1452:1: ( ( rule__PackageDecl__NameAssignment_1 ) )
            // InternalMiniJava.g:1453:2: ( rule__PackageDecl__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:1454:2: ( rule__PackageDecl__NameAssignment_1 )
            // InternalMiniJava.g:1454:3: rule__PackageDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__1__Impl"


    // $ANTLR start "rule__PackageDecl__Group__2"
    // InternalMiniJava.g:1462:1: rule__PackageDecl__Group__2 : rule__PackageDecl__Group__2__Impl ;
    public final void rule__PackageDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1466:1: ( rule__PackageDecl__Group__2__Impl )
            // InternalMiniJava.g:1467:2: rule__PackageDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__2"


    // $ANTLR start "rule__PackageDecl__Group__2__Impl"
    // InternalMiniJava.g:1473:1: rule__PackageDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__PackageDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1477:1: ( ( ';' ) )
            // InternalMiniJava.g:1478:1: ( ';' )
            {
            // InternalMiniJava.g:1478:1: ( ';' )
            // InternalMiniJava.g:1479:2: ';'
            {
             before(grammarAccess.getPackageDeclAccess().getSemicolonKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPackageDeclAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__Group__2__Impl"


    // $ANTLR start "rule__ImportDecl__Group__0"
    // InternalMiniJava.g:1489:1: rule__ImportDecl__Group__0 : rule__ImportDecl__Group__0__Impl rule__ImportDecl__Group__1 ;
    public final void rule__ImportDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1493:1: ( rule__ImportDecl__Group__0__Impl rule__ImportDecl__Group__1 )
            // InternalMiniJava.g:1494:2: rule__ImportDecl__Group__0__Impl rule__ImportDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ImportDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__0"


    // $ANTLR start "rule__ImportDecl__Group__0__Impl"
    // InternalMiniJava.g:1501:1: rule__ImportDecl__Group__0__Impl : ( 'import' ) ;
    public final void rule__ImportDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1505:1: ( ( 'import' ) )
            // InternalMiniJava.g:1506:1: ( 'import' )
            {
            // InternalMiniJava.g:1506:1: ( 'import' )
            // InternalMiniJava.g:1507:2: 'import'
            {
             before(grammarAccess.getImportDeclAccess().getImportKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getImportDeclAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__0__Impl"


    // $ANTLR start "rule__ImportDecl__Group__1"
    // InternalMiniJava.g:1516:1: rule__ImportDecl__Group__1 : rule__ImportDecl__Group__1__Impl rule__ImportDecl__Group__2 ;
    public final void rule__ImportDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1520:1: ( rule__ImportDecl__Group__1__Impl rule__ImportDecl__Group__2 )
            // InternalMiniJava.g:1521:2: rule__ImportDecl__Group__1__Impl rule__ImportDecl__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ImportDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__1"


    // $ANTLR start "rule__ImportDecl__Group__1__Impl"
    // InternalMiniJava.g:1528:1: rule__ImportDecl__Group__1__Impl : ( ( rule__ImportDecl__AnchorAssignment_1 ) ) ;
    public final void rule__ImportDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1532:1: ( ( ( rule__ImportDecl__AnchorAssignment_1 ) ) )
            // InternalMiniJava.g:1533:1: ( ( rule__ImportDecl__AnchorAssignment_1 ) )
            {
            // InternalMiniJava.g:1533:1: ( ( rule__ImportDecl__AnchorAssignment_1 ) )
            // InternalMiniJava.g:1534:2: ( rule__ImportDecl__AnchorAssignment_1 )
            {
             before(grammarAccess.getImportDeclAccess().getAnchorAssignment_1()); 
            // InternalMiniJava.g:1535:2: ( rule__ImportDecl__AnchorAssignment_1 )
            // InternalMiniJava.g:1535:3: rule__ImportDecl__AnchorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ImportDecl__AnchorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportDeclAccess().getAnchorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__1__Impl"


    // $ANTLR start "rule__ImportDecl__Group__2"
    // InternalMiniJava.g:1543:1: rule__ImportDecl__Group__2 : rule__ImportDecl__Group__2__Impl ;
    public final void rule__ImportDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1547:1: ( rule__ImportDecl__Group__2__Impl )
            // InternalMiniJava.g:1548:2: rule__ImportDecl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImportDecl__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__2"


    // $ANTLR start "rule__ImportDecl__Group__2__Impl"
    // InternalMiniJava.g:1554:1: rule__ImportDecl__Group__2__Impl : ( ';' ) ;
    public final void rule__ImportDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1558:1: ( ( ';' ) )
            // InternalMiniJava.g:1559:1: ( ';' )
            {
            // InternalMiniJava.g:1559:1: ( ';' )
            // InternalMiniJava.g:1560:2: ';'
            {
             before(grammarAccess.getImportDeclAccess().getSemicolonKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getImportDeclAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__Group__2__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__0"
    // InternalMiniJava.g:1570:1: rule__MainClassDecl__Group__0 : rule__MainClassDecl__Group__0__Impl rule__MainClassDecl__Group__1 ;
    public final void rule__MainClassDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1574:1: ( rule__MainClassDecl__Group__0__Impl rule__MainClassDecl__Group__1 )
            // InternalMiniJava.g:1575:2: rule__MainClassDecl__Group__0__Impl rule__MainClassDecl__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MainClassDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__0"


    // $ANTLR start "rule__MainClassDecl__Group__0__Impl"
    // InternalMiniJava.g:1582:1: rule__MainClassDecl__Group__0__Impl : ( () ) ;
    public final void rule__MainClassDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1586:1: ( ( () ) )
            // InternalMiniJava.g:1587:1: ( () )
            {
            // InternalMiniJava.g:1587:1: ( () )
            // InternalMiniJava.g:1588:2: ()
            {
             before(grammarAccess.getMainClassDeclAccess().getMainClassDeclAction_0()); 
            // InternalMiniJava.g:1589:2: ()
            // InternalMiniJava.g:1589:3: 
            {
            }

             after(grammarAccess.getMainClassDeclAccess().getMainClassDeclAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__0__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__1"
    // InternalMiniJava.g:1597:1: rule__MainClassDecl__Group__1 : rule__MainClassDecl__Group__1__Impl rule__MainClassDecl__Group__2 ;
    public final void rule__MainClassDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1601:1: ( rule__MainClassDecl__Group__1__Impl rule__MainClassDecl__Group__2 )
            // InternalMiniJava.g:1602:2: rule__MainClassDecl__Group__1__Impl rule__MainClassDecl__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MainClassDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__1"


    // $ANTLR start "rule__MainClassDecl__Group__1__Impl"
    // InternalMiniJava.g:1609:1: rule__MainClassDecl__Group__1__Impl : ( 'class' ) ;
    public final void rule__MainClassDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1613:1: ( ( 'class' ) )
            // InternalMiniJava.g:1614:1: ( 'class' )
            {
            // InternalMiniJava.g:1614:1: ( 'class' )
            // InternalMiniJava.g:1615:2: 'class'
            {
             before(grammarAccess.getMainClassDeclAccess().getClassKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getClassKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__1__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__2"
    // InternalMiniJava.g:1624:1: rule__MainClassDecl__Group__2 : rule__MainClassDecl__Group__2__Impl rule__MainClassDecl__Group__3 ;
    public final void rule__MainClassDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1628:1: ( rule__MainClassDecl__Group__2__Impl rule__MainClassDecl__Group__3 )
            // InternalMiniJava.g:1629:2: rule__MainClassDecl__Group__2__Impl rule__MainClassDecl__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MainClassDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__2"


    // $ANTLR start "rule__MainClassDecl__Group__2__Impl"
    // InternalMiniJava.g:1636:1: rule__MainClassDecl__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__MainClassDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1640:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:1641:1: ( RULE_ID )
            {
            // InternalMiniJava.g:1641:1: ( RULE_ID )
            // InternalMiniJava.g:1642:2: RULE_ID
            {
             before(grammarAccess.getMainClassDeclAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__2__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__3"
    // InternalMiniJava.g:1651:1: rule__MainClassDecl__Group__3 : rule__MainClassDecl__Group__3__Impl rule__MainClassDecl__Group__4 ;
    public final void rule__MainClassDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1655:1: ( rule__MainClassDecl__Group__3__Impl rule__MainClassDecl__Group__4 )
            // InternalMiniJava.g:1656:2: rule__MainClassDecl__Group__3__Impl rule__MainClassDecl__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__MainClassDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__3"


    // $ANTLR start "rule__MainClassDecl__Group__3__Impl"
    // InternalMiniJava.g:1663:1: rule__MainClassDecl__Group__3__Impl : ( '{' ) ;
    public final void rule__MainClassDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1667:1: ( ( '{' ) )
            // InternalMiniJava.g:1668:1: ( '{' )
            {
            // InternalMiniJava.g:1668:1: ( '{' )
            // InternalMiniJava.g:1669:2: '{'
            {
             before(grammarAccess.getMainClassDeclAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__3__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__4"
    // InternalMiniJava.g:1678:1: rule__MainClassDecl__Group__4 : rule__MainClassDecl__Group__4__Impl rule__MainClassDecl__Group__5 ;
    public final void rule__MainClassDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1682:1: ( rule__MainClassDecl__Group__4__Impl rule__MainClassDecl__Group__5 )
            // InternalMiniJava.g:1683:2: rule__MainClassDecl__Group__4__Impl rule__MainClassDecl__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__MainClassDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__4"


    // $ANTLR start "rule__MainClassDecl__Group__4__Impl"
    // InternalMiniJava.g:1690:1: rule__MainClassDecl__Group__4__Impl : ( 'public' ) ;
    public final void rule__MainClassDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1694:1: ( ( 'public' ) )
            // InternalMiniJava.g:1695:1: ( 'public' )
            {
            // InternalMiniJava.g:1695:1: ( 'public' )
            // InternalMiniJava.g:1696:2: 'public'
            {
             before(grammarAccess.getMainClassDeclAccess().getPublicKeyword_4()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getPublicKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__4__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__5"
    // InternalMiniJava.g:1705:1: rule__MainClassDecl__Group__5 : rule__MainClassDecl__Group__5__Impl rule__MainClassDecl__Group__6 ;
    public final void rule__MainClassDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1709:1: ( rule__MainClassDecl__Group__5__Impl rule__MainClassDecl__Group__6 )
            // InternalMiniJava.g:1710:2: rule__MainClassDecl__Group__5__Impl rule__MainClassDecl__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__MainClassDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__5"


    // $ANTLR start "rule__MainClassDecl__Group__5__Impl"
    // InternalMiniJava.g:1717:1: rule__MainClassDecl__Group__5__Impl : ( 'static' ) ;
    public final void rule__MainClassDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1721:1: ( ( 'static' ) )
            // InternalMiniJava.g:1722:1: ( 'static' )
            {
            // InternalMiniJava.g:1722:1: ( 'static' )
            // InternalMiniJava.g:1723:2: 'static'
            {
             before(grammarAccess.getMainClassDeclAccess().getStaticKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getStaticKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__5__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__6"
    // InternalMiniJava.g:1732:1: rule__MainClassDecl__Group__6 : rule__MainClassDecl__Group__6__Impl rule__MainClassDecl__Group__7 ;
    public final void rule__MainClassDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1736:1: ( rule__MainClassDecl__Group__6__Impl rule__MainClassDecl__Group__7 )
            // InternalMiniJava.g:1737:2: rule__MainClassDecl__Group__6__Impl rule__MainClassDecl__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__MainClassDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__6"


    // $ANTLR start "rule__MainClassDecl__Group__6__Impl"
    // InternalMiniJava.g:1744:1: rule__MainClassDecl__Group__6__Impl : ( 'void' ) ;
    public final void rule__MainClassDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1748:1: ( ( 'void' ) )
            // InternalMiniJava.g:1749:1: ( 'void' )
            {
            // InternalMiniJava.g:1749:1: ( 'void' )
            // InternalMiniJava.g:1750:2: 'void'
            {
             before(grammarAccess.getMainClassDeclAccess().getVoidKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getVoidKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__6__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__7"
    // InternalMiniJava.g:1759:1: rule__MainClassDecl__Group__7 : rule__MainClassDecl__Group__7__Impl rule__MainClassDecl__Group__8 ;
    public final void rule__MainClassDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1763:1: ( rule__MainClassDecl__Group__7__Impl rule__MainClassDecl__Group__8 )
            // InternalMiniJava.g:1764:2: rule__MainClassDecl__Group__7__Impl rule__MainClassDecl__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__MainClassDecl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__7"


    // $ANTLR start "rule__MainClassDecl__Group__7__Impl"
    // InternalMiniJava.g:1771:1: rule__MainClassDecl__Group__7__Impl : ( 'main' ) ;
    public final void rule__MainClassDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1775:1: ( ( 'main' ) )
            // InternalMiniJava.g:1776:1: ( 'main' )
            {
            // InternalMiniJava.g:1776:1: ( 'main' )
            // InternalMiniJava.g:1777:2: 'main'
            {
             before(grammarAccess.getMainClassDeclAccess().getMainKeyword_7()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getMainKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__7__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__8"
    // InternalMiniJava.g:1786:1: rule__MainClassDecl__Group__8 : rule__MainClassDecl__Group__8__Impl rule__MainClassDecl__Group__9 ;
    public final void rule__MainClassDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1790:1: ( rule__MainClassDecl__Group__8__Impl rule__MainClassDecl__Group__9 )
            // InternalMiniJava.g:1791:2: rule__MainClassDecl__Group__8__Impl rule__MainClassDecl__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__MainClassDecl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__8"


    // $ANTLR start "rule__MainClassDecl__Group__8__Impl"
    // InternalMiniJava.g:1798:1: rule__MainClassDecl__Group__8__Impl : ( '(' ) ;
    public final void rule__MainClassDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1802:1: ( ( '(' ) )
            // InternalMiniJava.g:1803:1: ( '(' )
            {
            // InternalMiniJava.g:1803:1: ( '(' )
            // InternalMiniJava.g:1804:2: '('
            {
             before(grammarAccess.getMainClassDeclAccess().getLeftParenthesisKeyword_8()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getLeftParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__8__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__9"
    // InternalMiniJava.g:1813:1: rule__MainClassDecl__Group__9 : rule__MainClassDecl__Group__9__Impl rule__MainClassDecl__Group__10 ;
    public final void rule__MainClassDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1817:1: ( rule__MainClassDecl__Group__9__Impl rule__MainClassDecl__Group__10 )
            // InternalMiniJava.g:1818:2: rule__MainClassDecl__Group__9__Impl rule__MainClassDecl__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__MainClassDecl__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__9"


    // $ANTLR start "rule__MainClassDecl__Group__9__Impl"
    // InternalMiniJava.g:1825:1: rule__MainClassDecl__Group__9__Impl : ( 'String' ) ;
    public final void rule__MainClassDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1829:1: ( ( 'String' ) )
            // InternalMiniJava.g:1830:1: ( 'String' )
            {
            // InternalMiniJava.g:1830:1: ( 'String' )
            // InternalMiniJava.g:1831:2: 'String'
            {
             before(grammarAccess.getMainClassDeclAccess().getStringKeyword_9()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getStringKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__9__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__10"
    // InternalMiniJava.g:1840:1: rule__MainClassDecl__Group__10 : rule__MainClassDecl__Group__10__Impl rule__MainClassDecl__Group__11 ;
    public final void rule__MainClassDecl__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1844:1: ( rule__MainClassDecl__Group__10__Impl rule__MainClassDecl__Group__11 )
            // InternalMiniJava.g:1845:2: rule__MainClassDecl__Group__10__Impl rule__MainClassDecl__Group__11
            {
            pushFollow(FOLLOW_17);
            rule__MainClassDecl__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__10"


    // $ANTLR start "rule__MainClassDecl__Group__10__Impl"
    // InternalMiniJava.g:1852:1: rule__MainClassDecl__Group__10__Impl : ( '[' ) ;
    public final void rule__MainClassDecl__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1856:1: ( ( '[' ) )
            // InternalMiniJava.g:1857:1: ( '[' )
            {
            // InternalMiniJava.g:1857:1: ( '[' )
            // InternalMiniJava.g:1858:2: '['
            {
             before(grammarAccess.getMainClassDeclAccess().getLeftSquareBracketKeyword_10()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getLeftSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__10__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__11"
    // InternalMiniJava.g:1867:1: rule__MainClassDecl__Group__11 : rule__MainClassDecl__Group__11__Impl rule__MainClassDecl__Group__12 ;
    public final void rule__MainClassDecl__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1871:1: ( rule__MainClassDecl__Group__11__Impl rule__MainClassDecl__Group__12 )
            // InternalMiniJava.g:1872:2: rule__MainClassDecl__Group__11__Impl rule__MainClassDecl__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__MainClassDecl__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__11"


    // $ANTLR start "rule__MainClassDecl__Group__11__Impl"
    // InternalMiniJava.g:1879:1: rule__MainClassDecl__Group__11__Impl : ( ']' ) ;
    public final void rule__MainClassDecl__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1883:1: ( ( ']' ) )
            // InternalMiniJava.g:1884:1: ( ']' )
            {
            // InternalMiniJava.g:1884:1: ( ']' )
            // InternalMiniJava.g:1885:2: ']'
            {
             before(grammarAccess.getMainClassDeclAccess().getRightSquareBracketKeyword_11()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getRightSquareBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__11__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__12"
    // InternalMiniJava.g:1894:1: rule__MainClassDecl__Group__12 : rule__MainClassDecl__Group__12__Impl rule__MainClassDecl__Group__13 ;
    public final void rule__MainClassDecl__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1898:1: ( rule__MainClassDecl__Group__12__Impl rule__MainClassDecl__Group__13 )
            // InternalMiniJava.g:1899:2: rule__MainClassDecl__Group__12__Impl rule__MainClassDecl__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__MainClassDecl__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__12"


    // $ANTLR start "rule__MainClassDecl__Group__12__Impl"
    // InternalMiniJava.g:1906:1: rule__MainClassDecl__Group__12__Impl : ( ( rule__MainClassDecl__NameAssignment_12 ) ) ;
    public final void rule__MainClassDecl__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1910:1: ( ( ( rule__MainClassDecl__NameAssignment_12 ) ) )
            // InternalMiniJava.g:1911:1: ( ( rule__MainClassDecl__NameAssignment_12 ) )
            {
            // InternalMiniJava.g:1911:1: ( ( rule__MainClassDecl__NameAssignment_12 ) )
            // InternalMiniJava.g:1912:2: ( rule__MainClassDecl__NameAssignment_12 )
            {
             before(grammarAccess.getMainClassDeclAccess().getNameAssignment_12()); 
            // InternalMiniJava.g:1913:2: ( rule__MainClassDecl__NameAssignment_12 )
            // InternalMiniJava.g:1913:3: rule__MainClassDecl__NameAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__MainClassDecl__NameAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getMainClassDeclAccess().getNameAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__12__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__13"
    // InternalMiniJava.g:1921:1: rule__MainClassDecl__Group__13 : rule__MainClassDecl__Group__13__Impl rule__MainClassDecl__Group__14 ;
    public final void rule__MainClassDecl__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1925:1: ( rule__MainClassDecl__Group__13__Impl rule__MainClassDecl__Group__14 )
            // InternalMiniJava.g:1926:2: rule__MainClassDecl__Group__13__Impl rule__MainClassDecl__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__MainClassDecl__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__13"


    // $ANTLR start "rule__MainClassDecl__Group__13__Impl"
    // InternalMiniJava.g:1933:1: rule__MainClassDecl__Group__13__Impl : ( ')' ) ;
    public final void rule__MainClassDecl__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1937:1: ( ( ')' ) )
            // InternalMiniJava.g:1938:1: ( ')' )
            {
            // InternalMiniJava.g:1938:1: ( ')' )
            // InternalMiniJava.g:1939:2: ')'
            {
             before(grammarAccess.getMainClassDeclAccess().getRightParenthesisKeyword_13()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getRightParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__13__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__14"
    // InternalMiniJava.g:1948:1: rule__MainClassDecl__Group__14 : rule__MainClassDecl__Group__14__Impl rule__MainClassDecl__Group__15 ;
    public final void rule__MainClassDecl__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1952:1: ( rule__MainClassDecl__Group__14__Impl rule__MainClassDecl__Group__15 )
            // InternalMiniJava.g:1953:2: rule__MainClassDecl__Group__14__Impl rule__MainClassDecl__Group__15
            {
            pushFollow(FOLLOW_19);
            rule__MainClassDecl__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__14"


    // $ANTLR start "rule__MainClassDecl__Group__14__Impl"
    // InternalMiniJava.g:1960:1: rule__MainClassDecl__Group__14__Impl : ( '{' ) ;
    public final void rule__MainClassDecl__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1964:1: ( ( '{' ) )
            // InternalMiniJava.g:1965:1: ( '{' )
            {
            // InternalMiniJava.g:1965:1: ( '{' )
            // InternalMiniJava.g:1966:2: '{'
            {
             before(grammarAccess.getMainClassDeclAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getLeftCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__14__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__15"
    // InternalMiniJava.g:1975:1: rule__MainClassDecl__Group__15 : rule__MainClassDecl__Group__15__Impl rule__MainClassDecl__Group__16 ;
    public final void rule__MainClassDecl__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1979:1: ( rule__MainClassDecl__Group__15__Impl rule__MainClassDecl__Group__16 )
            // InternalMiniJava.g:1980:2: rule__MainClassDecl__Group__15__Impl rule__MainClassDecl__Group__16
            {
            pushFollow(FOLLOW_19);
            rule__MainClassDecl__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__15"


    // $ANTLR start "rule__MainClassDecl__Group__15__Impl"
    // InternalMiniJava.g:1987:1: rule__MainClassDecl__Group__15__Impl : ( ( rule__MainClassDecl__StatementsAssignment_15 )* ) ;
    public final void rule__MainClassDecl__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:1991:1: ( ( ( rule__MainClassDecl__StatementsAssignment_15 )* ) )
            // InternalMiniJava.g:1992:1: ( ( rule__MainClassDecl__StatementsAssignment_15 )* )
            {
            // InternalMiniJava.g:1992:1: ( ( rule__MainClassDecl__StatementsAssignment_15 )* )
            // InternalMiniJava.g:1993:2: ( rule__MainClassDecl__StatementsAssignment_15 )*
            {
             before(grammarAccess.getMainClassDeclAccess().getStatementsAssignment_15()); 
            // InternalMiniJava.g:1994:2: ( rule__MainClassDecl__StatementsAssignment_15 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)||(LA17_0>=11 && LA17_0<=15)||LA17_0==17||(LA17_0>=37 && LA17_0<=38)||LA17_0==45||LA17_0==56||(LA17_0>=58 && LA17_0<=60)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMiniJava.g:1994:3: rule__MainClassDecl__StatementsAssignment_15
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MainClassDecl__StatementsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMainClassDeclAccess().getStatementsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__15__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__16"
    // InternalMiniJava.g:2002:1: rule__MainClassDecl__Group__16 : rule__MainClassDecl__Group__16__Impl rule__MainClassDecl__Group__17 ;
    public final void rule__MainClassDecl__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2006:1: ( rule__MainClassDecl__Group__16__Impl rule__MainClassDecl__Group__17 )
            // InternalMiniJava.g:2007:2: rule__MainClassDecl__Group__16__Impl rule__MainClassDecl__Group__17
            {
            pushFollow(FOLLOW_21);
            rule__MainClassDecl__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__16"


    // $ANTLR start "rule__MainClassDecl__Group__16__Impl"
    // InternalMiniJava.g:2014:1: rule__MainClassDecl__Group__16__Impl : ( '}' ) ;
    public final void rule__MainClassDecl__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2018:1: ( ( '}' ) )
            // InternalMiniJava.g:2019:1: ( '}' )
            {
            // InternalMiniJava.g:2019:1: ( '}' )
            // InternalMiniJava.g:2020:2: '}'
            {
             before(grammarAccess.getMainClassDeclAccess().getRightCurlyBracketKeyword_16()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__16__Impl"


    // $ANTLR start "rule__MainClassDecl__Group__17"
    // InternalMiniJava.g:2029:1: rule__MainClassDecl__Group__17 : rule__MainClassDecl__Group__17__Impl ;
    public final void rule__MainClassDecl__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2033:1: ( rule__MainClassDecl__Group__17__Impl )
            // InternalMiniJava.g:2034:2: rule__MainClassDecl__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MainClassDecl__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__17"


    // $ANTLR start "rule__MainClassDecl__Group__17__Impl"
    // InternalMiniJava.g:2040:1: rule__MainClassDecl__Group__17__Impl : ( '}' ) ;
    public final void rule__MainClassDecl__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2044:1: ( ( '}' ) )
            // InternalMiniJava.g:2045:1: ( '}' )
            {
            // InternalMiniJava.g:2045:1: ( '}' )
            // InternalMiniJava.g:2046:2: '}'
            {
             before(grammarAccess.getMainClassDeclAccess().getRightCurlyBracketKeyword_17()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__Group__17__Impl"


    // $ANTLR start "rule__ClassDecl__Group__0"
    // InternalMiniJava.g:2056:1: rule__ClassDecl__Group__0 : rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1 ;
    public final void rule__ClassDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2060:1: ( rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1 )
            // InternalMiniJava.g:2061:2: rule__ClassDecl__Group__0__Impl rule__ClassDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__0"


    // $ANTLR start "rule__ClassDecl__Group__0__Impl"
    // InternalMiniJava.g:2068:1: rule__ClassDecl__Group__0__Impl : ( 'class' ) ;
    public final void rule__ClassDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2072:1: ( ( 'class' ) )
            // InternalMiniJava.g:2073:1: ( 'class' )
            {
            // InternalMiniJava.g:2073:1: ( 'class' )
            // InternalMiniJava.g:2074:2: 'class'
            {
             before(grammarAccess.getClassDeclAccess().getClassKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getClassDeclAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__0__Impl"


    // $ANTLR start "rule__ClassDecl__Group__1"
    // InternalMiniJava.g:2083:1: rule__ClassDecl__Group__1 : rule__ClassDecl__Group__1__Impl rule__ClassDecl__Group__2 ;
    public final void rule__ClassDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2087:1: ( rule__ClassDecl__Group__1__Impl rule__ClassDecl__Group__2 )
            // InternalMiniJava.g:2088:2: rule__ClassDecl__Group__1__Impl rule__ClassDecl__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ClassDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__1"


    // $ANTLR start "rule__ClassDecl__Group__1__Impl"
    // InternalMiniJava.g:2095:1: rule__ClassDecl__Group__1__Impl : ( ( rule__ClassDecl__NameAssignment_1 ) ) ;
    public final void rule__ClassDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2099:1: ( ( ( rule__ClassDecl__NameAssignment_1 ) ) )
            // InternalMiniJava.g:2100:1: ( ( rule__ClassDecl__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:2100:1: ( ( rule__ClassDecl__NameAssignment_1 ) )
            // InternalMiniJava.g:2101:2: ( rule__ClassDecl__NameAssignment_1 )
            {
             before(grammarAccess.getClassDeclAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:2102:2: ( rule__ClassDecl__NameAssignment_1 )
            // InternalMiniJava.g:2102:3: rule__ClassDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__1__Impl"


    // $ANTLR start "rule__ClassDecl__Group__2"
    // InternalMiniJava.g:2110:1: rule__ClassDecl__Group__2 : rule__ClassDecl__Group__2__Impl rule__ClassDecl__Group__3 ;
    public final void rule__ClassDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2114:1: ( rule__ClassDecl__Group__2__Impl rule__ClassDecl__Group__3 )
            // InternalMiniJava.g:2115:2: rule__ClassDecl__Group__2__Impl rule__ClassDecl__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ClassDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__2"


    // $ANTLR start "rule__ClassDecl__Group__2__Impl"
    // InternalMiniJava.g:2122:1: rule__ClassDecl__Group__2__Impl : ( ( rule__ClassDecl__Group_2__0 )? ) ;
    public final void rule__ClassDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2126:1: ( ( ( rule__ClassDecl__Group_2__0 )? ) )
            // InternalMiniJava.g:2127:1: ( ( rule__ClassDecl__Group_2__0 )? )
            {
            // InternalMiniJava.g:2127:1: ( ( rule__ClassDecl__Group_2__0 )? )
            // InternalMiniJava.g:2128:2: ( rule__ClassDecl__Group_2__0 )?
            {
             before(grammarAccess.getClassDeclAccess().getGroup_2()); 
            // InternalMiniJava.g:2129:2: ( rule__ClassDecl__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==51) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMiniJava.g:2129:3: rule__ClassDecl__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDecl__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__2__Impl"


    // $ANTLR start "rule__ClassDecl__Group__3"
    // InternalMiniJava.g:2137:1: rule__ClassDecl__Group__3 : rule__ClassDecl__Group__3__Impl rule__ClassDecl__Group__4 ;
    public final void rule__ClassDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2141:1: ( rule__ClassDecl__Group__3__Impl rule__ClassDecl__Group__4 )
            // InternalMiniJava.g:2142:2: rule__ClassDecl__Group__3__Impl rule__ClassDecl__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ClassDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__3"


    // $ANTLR start "rule__ClassDecl__Group__3__Impl"
    // InternalMiniJava.g:2149:1: rule__ClassDecl__Group__3__Impl : ( ( rule__ClassDecl__Group_3__0 )? ) ;
    public final void rule__ClassDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2153:1: ( ( ( rule__ClassDecl__Group_3__0 )? ) )
            // InternalMiniJava.g:2154:1: ( ( rule__ClassDecl__Group_3__0 )? )
            {
            // InternalMiniJava.g:2154:1: ( ( rule__ClassDecl__Group_3__0 )? )
            // InternalMiniJava.g:2155:2: ( rule__ClassDecl__Group_3__0 )?
            {
             before(grammarAccess.getClassDeclAccess().getGroup_3()); 
            // InternalMiniJava.g:2156:2: ( rule__ClassDecl__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==52) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMiniJava.g:2156:3: rule__ClassDecl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ClassDecl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassDeclAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__3__Impl"


    // $ANTLR start "rule__ClassDecl__Group__4"
    // InternalMiniJava.g:2164:1: rule__ClassDecl__Group__4 : rule__ClassDecl__Group__4__Impl rule__ClassDecl__Group__5 ;
    public final void rule__ClassDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2168:1: ( rule__ClassDecl__Group__4__Impl rule__ClassDecl__Group__5 )
            // InternalMiniJava.g:2169:2: rule__ClassDecl__Group__4__Impl rule__ClassDecl__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ClassDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__4"


    // $ANTLR start "rule__ClassDecl__Group__4__Impl"
    // InternalMiniJava.g:2176:1: rule__ClassDecl__Group__4__Impl : ( '{' ) ;
    public final void rule__ClassDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2180:1: ( ( '{' ) )
            // InternalMiniJava.g:2181:1: ( '{' )
            {
            // InternalMiniJava.g:2181:1: ( '{' )
            // InternalMiniJava.g:2182:2: '{'
            {
             before(grammarAccess.getClassDeclAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getClassDeclAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__4__Impl"


    // $ANTLR start "rule__ClassDecl__Group__5"
    // InternalMiniJava.g:2191:1: rule__ClassDecl__Group__5 : rule__ClassDecl__Group__5__Impl rule__ClassDecl__Group__6 ;
    public final void rule__ClassDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2195:1: ( rule__ClassDecl__Group__5__Impl rule__ClassDecl__Group__6 )
            // InternalMiniJava.g:2196:2: rule__ClassDecl__Group__5__Impl rule__ClassDecl__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__ClassDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__5"


    // $ANTLR start "rule__ClassDecl__Group__5__Impl"
    // InternalMiniJava.g:2203:1: rule__ClassDecl__Group__5__Impl : ( ( rule__ClassDecl__MembersAssignment_5 )* ) ;
    public final void rule__ClassDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2207:1: ( ( ( rule__ClassDecl__MembersAssignment_5 )* ) )
            // InternalMiniJava.g:2208:1: ( ( rule__ClassDecl__MembersAssignment_5 )* )
            {
            // InternalMiniJava.g:2208:1: ( ( rule__ClassDecl__MembersAssignment_5 )* )
            // InternalMiniJava.g:2209:2: ( rule__ClassDecl__MembersAssignment_5 )*
            {
             before(grammarAccess.getClassDeclAccess().getMembersAssignment_5()); 
            // InternalMiniJava.g:2210:2: ( rule__ClassDecl__MembersAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID||(LA20_0>=11 && LA20_0<=15)||(LA20_0>=32 && LA20_0<=34)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMiniJava.g:2210:3: rule__ClassDecl__MembersAssignment_5
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ClassDecl__MembersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getClassDeclAccess().getMembersAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__5__Impl"


    // $ANTLR start "rule__ClassDecl__Group__6"
    // InternalMiniJava.g:2218:1: rule__ClassDecl__Group__6 : rule__ClassDecl__Group__6__Impl ;
    public final void rule__ClassDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2222:1: ( rule__ClassDecl__Group__6__Impl )
            // InternalMiniJava.g:2223:2: rule__ClassDecl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__6"


    // $ANTLR start "rule__ClassDecl__Group__6__Impl"
    // InternalMiniJava.g:2229:1: rule__ClassDecl__Group__6__Impl : ( '}' ) ;
    public final void rule__ClassDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2233:1: ( ( '}' ) )
            // InternalMiniJava.g:2234:1: ( '}' )
            {
            // InternalMiniJava.g:2234:1: ( '}' )
            // InternalMiniJava.g:2235:2: '}'
            {
             before(grammarAccess.getClassDeclAccess().getRightCurlyBracketKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getClassDeclAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group__6__Impl"


    // $ANTLR start "rule__ClassDecl__Group_2__0"
    // InternalMiniJava.g:2245:1: rule__ClassDecl__Group_2__0 : rule__ClassDecl__Group_2__0__Impl rule__ClassDecl__Group_2__1 ;
    public final void rule__ClassDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2249:1: ( rule__ClassDecl__Group_2__0__Impl rule__ClassDecl__Group_2__1 )
            // InternalMiniJava.g:2250:2: rule__ClassDecl__Group_2__0__Impl rule__ClassDecl__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassDecl__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__0"


    // $ANTLR start "rule__ClassDecl__Group_2__0__Impl"
    // InternalMiniJava.g:2257:1: rule__ClassDecl__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ClassDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2261:1: ( ( 'extends' ) )
            // InternalMiniJava.g:2262:1: ( 'extends' )
            {
            // InternalMiniJava.g:2262:1: ( 'extends' )
            // InternalMiniJava.g:2263:2: 'extends'
            {
             before(grammarAccess.getClassDeclAccess().getExtendsKeyword_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getClassDeclAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__0__Impl"


    // $ANTLR start "rule__ClassDecl__Group_2__1"
    // InternalMiniJava.g:2272:1: rule__ClassDecl__Group_2__1 : rule__ClassDecl__Group_2__1__Impl ;
    public final void rule__ClassDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2276:1: ( rule__ClassDecl__Group_2__1__Impl )
            // InternalMiniJava.g:2277:2: rule__ClassDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__1"


    // $ANTLR start "rule__ClassDecl__Group_2__1__Impl"
    // InternalMiniJava.g:2283:1: rule__ClassDecl__Group_2__1__Impl : ( ( rule__ClassDecl__SuperClassAssignment_2_1 ) ) ;
    public final void rule__ClassDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2287:1: ( ( ( rule__ClassDecl__SuperClassAssignment_2_1 ) ) )
            // InternalMiniJava.g:2288:1: ( ( rule__ClassDecl__SuperClassAssignment_2_1 ) )
            {
            // InternalMiniJava.g:2288:1: ( ( rule__ClassDecl__SuperClassAssignment_2_1 ) )
            // InternalMiniJava.g:2289:2: ( rule__ClassDecl__SuperClassAssignment_2_1 )
            {
             before(grammarAccess.getClassDeclAccess().getSuperClassAssignment_2_1()); 
            // InternalMiniJava.g:2290:2: ( rule__ClassDecl__SuperClassAssignment_2_1 )
            // InternalMiniJava.g:2290:3: rule__ClassDecl__SuperClassAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__SuperClassAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getSuperClassAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_2__1__Impl"


    // $ANTLR start "rule__ClassDecl__Group_3__0"
    // InternalMiniJava.g:2299:1: rule__ClassDecl__Group_3__0 : rule__ClassDecl__Group_3__0__Impl rule__ClassDecl__Group_3__1 ;
    public final void rule__ClassDecl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2303:1: ( rule__ClassDecl__Group_3__0__Impl rule__ClassDecl__Group_3__1 )
            // InternalMiniJava.g:2304:2: rule__ClassDecl__Group_3__0__Impl rule__ClassDecl__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__ClassDecl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_3__0"


    // $ANTLR start "rule__ClassDecl__Group_3__0__Impl"
    // InternalMiniJava.g:2311:1: rule__ClassDecl__Group_3__0__Impl : ( 'implements' ) ;
    public final void rule__ClassDecl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2315:1: ( ( 'implements' ) )
            // InternalMiniJava.g:2316:1: ( 'implements' )
            {
            // InternalMiniJava.g:2316:1: ( 'implements' )
            // InternalMiniJava.g:2317:2: 'implements'
            {
             before(grammarAccess.getClassDeclAccess().getImplementsKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getClassDeclAccess().getImplementsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_3__0__Impl"


    // $ANTLR start "rule__ClassDecl__Group_3__1"
    // InternalMiniJava.g:2326:1: rule__ClassDecl__Group_3__1 : rule__ClassDecl__Group_3__1__Impl ;
    public final void rule__ClassDecl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2330:1: ( rule__ClassDecl__Group_3__1__Impl )
            // InternalMiniJava.g:2331:2: rule__ClassDecl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_3__1"


    // $ANTLR start "rule__ClassDecl__Group_3__1__Impl"
    // InternalMiniJava.g:2337:1: rule__ClassDecl__Group_3__1__Impl : ( ( rule__ClassDecl__ImplementzAssignment_3_1 ) ) ;
    public final void rule__ClassDecl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2341:1: ( ( ( rule__ClassDecl__ImplementzAssignment_3_1 ) ) )
            // InternalMiniJava.g:2342:1: ( ( rule__ClassDecl__ImplementzAssignment_3_1 ) )
            {
            // InternalMiniJava.g:2342:1: ( ( rule__ClassDecl__ImplementzAssignment_3_1 ) )
            // InternalMiniJava.g:2343:2: ( rule__ClassDecl__ImplementzAssignment_3_1 )
            {
             before(grammarAccess.getClassDeclAccess().getImplementzAssignment_3_1()); 
            // InternalMiniJava.g:2344:2: ( rule__ClassDecl__ImplementzAssignment_3_1 )
            // InternalMiniJava.g:2344:3: rule__ClassDecl__ImplementzAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassDecl__ImplementzAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getClassDeclAccess().getImplementzAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMiniJava.g:2353:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2357:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMiniJava.g:2358:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMiniJava.g:2365:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2369:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2370:1: ( RULE_ID )
            {
            // InternalMiniJava.g:2370:1: ( RULE_ID )
            // InternalMiniJava.g:2371:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMiniJava.g:2380:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2384:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMiniJava.g:2385:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMiniJava.g:2391:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2395:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMiniJava.g:2396:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMiniJava.g:2396:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMiniJava.g:2397:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMiniJava.g:2398:2: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==53) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMiniJava.g:2398:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMiniJava.g:2407:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2411:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMiniJava.g:2412:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMiniJava.g:2419:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2423:1: ( ( '.' ) )
            // InternalMiniJava.g:2424:1: ( '.' )
            {
            // InternalMiniJava.g:2424:1: ( '.' )
            // InternalMiniJava.g:2425:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMiniJava.g:2434:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2438:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMiniJava.g:2439:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMiniJava.g:2445:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2449:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:2450:1: ( RULE_ID )
            {
            // InternalMiniJava.g:2450:1: ( RULE_ID )
            // InternalMiniJava.g:2451:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__0"
    // InternalMiniJava.g:2461:1: rule__DoubleLiteral__Group__0 : rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 ;
    public final void rule__DoubleLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2465:1: ( rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1 )
            // InternalMiniJava.g:2466:2: rule__DoubleLiteral__Group__0__Impl rule__DoubleLiteral__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__DoubleLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__0"


    // $ANTLR start "rule__DoubleLiteral__Group__0__Impl"
    // InternalMiniJava.g:2473:1: rule__DoubleLiteral__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2477:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:2478:1: ( RULE_INT )
            {
            // InternalMiniJava.g:2478:1: ( RULE_INT )
            // InternalMiniJava.g:2479:2: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__0__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__1"
    // InternalMiniJava.g:2488:1: rule__DoubleLiteral__Group__1 : rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 ;
    public final void rule__DoubleLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2492:1: ( rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2 )
            // InternalMiniJava.g:2493:2: rule__DoubleLiteral__Group__1__Impl rule__DoubleLiteral__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__DoubleLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__1"


    // $ANTLR start "rule__DoubleLiteral__Group__1__Impl"
    // InternalMiniJava.g:2500:1: rule__DoubleLiteral__Group__1__Impl : ( '.' ) ;
    public final void rule__DoubleLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2504:1: ( ( '.' ) )
            // InternalMiniJava.g:2505:1: ( '.' )
            {
            // InternalMiniJava.g:2505:1: ( '.' )
            // InternalMiniJava.g:2506:2: '.'
            {
             before(grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getDoubleLiteralAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__1__Impl"


    // $ANTLR start "rule__DoubleLiteral__Group__2"
    // InternalMiniJava.g:2515:1: rule__DoubleLiteral__Group__2 : rule__DoubleLiteral__Group__2__Impl ;
    public final void rule__DoubleLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2519:1: ( rule__DoubleLiteral__Group__2__Impl )
            // InternalMiniJava.g:2520:2: rule__DoubleLiteral__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleLiteral__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__2"


    // $ANTLR start "rule__DoubleLiteral__Group__2__Impl"
    // InternalMiniJava.g:2526:1: rule__DoubleLiteral__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__DoubleLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2530:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:2531:1: ( RULE_INT )
            {
            // InternalMiniJava.g:2531:1: ( RULE_INT )
            // InternalMiniJava.g:2532:2: RULE_INT
            {
             before(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleLiteralAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleLiteral__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group_2__0"
    // InternalMiniJava.g:2542:1: rule__DataType__Group_2__0 : rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 ;
    public final void rule__DataType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2546:1: ( rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 )
            // InternalMiniJava.g:2547:2: rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__DataType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0"


    // $ANTLR start "rule__DataType__Group_2__0__Impl"
    // InternalMiniJava.g:2554:1: rule__DataType__Group_2__0__Impl : ( ruleBasicDataType ) ;
    public final void rule__DataType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2558:1: ( ( ruleBasicDataType ) )
            // InternalMiniJava.g:2559:1: ( ruleBasicDataType )
            {
            // InternalMiniJava.g:2559:1: ( ruleBasicDataType )
            // InternalMiniJava.g:2560:2: ruleBasicDataType
            {
             before(grammarAccess.getDataTypeAccess().getBasicDataTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getBasicDataTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_2__1"
    // InternalMiniJava.g:2569:1: rule__DataType__Group_2__1 : rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2 ;
    public final void rule__DataType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2573:1: ( rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2 )
            // InternalMiniJava.g:2574:2: rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__DataType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__1"


    // $ANTLR start "rule__DataType__Group_2__1__Impl"
    // InternalMiniJava.g:2581:1: rule__DataType__Group_2__1__Impl : ( '[' ) ;
    public final void rule__DataType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2585:1: ( ( '[' ) )
            // InternalMiniJava.g:2586:1: ( '[' )
            {
            // InternalMiniJava.g:2586:1: ( '[' )
            // InternalMiniJava.g:2587:2: '['
            {
             before(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__1__Impl"


    // $ANTLR start "rule__DataType__Group_2__2"
    // InternalMiniJava.g:2596:1: rule__DataType__Group_2__2 : rule__DataType__Group_2__2__Impl ;
    public final void rule__DataType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2600:1: ( rule__DataType__Group_2__2__Impl )
            // InternalMiniJava.g:2601:2: rule__DataType__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__2"


    // $ANTLR start "rule__DataType__Group_2__2__Impl"
    // InternalMiniJava.g:2607:1: rule__DataType__Group_2__2__Impl : ( ']' ) ;
    public final void rule__DataType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2611:1: ( ( ']' ) )
            // InternalMiniJava.g:2612:1: ( ']' )
            {
            // InternalMiniJava.g:2612:1: ( ']' )
            // InternalMiniJava.g:2613:2: ']'
            {
             before(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__2__Impl"


    // $ANTLR start "rule__VariableDecl__Group__0"
    // InternalMiniJava.g:2623:1: rule__VariableDecl__Group__0 : rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 ;
    public final void rule__VariableDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2627:1: ( rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1 )
            // InternalMiniJava.g:2628:2: rule__VariableDecl__Group__0__Impl rule__VariableDecl__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__VariableDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__0"


    // $ANTLR start "rule__VariableDecl__Group__0__Impl"
    // InternalMiniJava.g:2635:1: rule__VariableDecl__Group__0__Impl : ( ( rule__VariableDecl__VarTypeAssignment_0 ) ) ;
    public final void rule__VariableDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2639:1: ( ( ( rule__VariableDecl__VarTypeAssignment_0 ) ) )
            // InternalMiniJava.g:2640:1: ( ( rule__VariableDecl__VarTypeAssignment_0 ) )
            {
            // InternalMiniJava.g:2640:1: ( ( rule__VariableDecl__VarTypeAssignment_0 ) )
            // InternalMiniJava.g:2641:2: ( rule__VariableDecl__VarTypeAssignment_0 )
            {
             before(grammarAccess.getVariableDeclAccess().getVarTypeAssignment_0()); 
            // InternalMiniJava.g:2642:2: ( rule__VariableDecl__VarTypeAssignment_0 )
            // InternalMiniJava.g:2642:3: rule__VariableDecl__VarTypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__VarTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclAccess().getVarTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__0__Impl"


    // $ANTLR start "rule__VariableDecl__Group__1"
    // InternalMiniJava.g:2650:1: rule__VariableDecl__Group__1 : rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 ;
    public final void rule__VariableDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2654:1: ( rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2 )
            // InternalMiniJava.g:2655:2: rule__VariableDecl__Group__1__Impl rule__VariableDecl__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__VariableDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__1"


    // $ANTLR start "rule__VariableDecl__Group__1__Impl"
    // InternalMiniJava.g:2662:1: rule__VariableDecl__Group__1__Impl : ( ( rule__VariableDecl__NameAssignment_1 ) ) ;
    public final void rule__VariableDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2666:1: ( ( ( rule__VariableDecl__NameAssignment_1 ) ) )
            // InternalMiniJava.g:2667:1: ( ( rule__VariableDecl__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:2667:1: ( ( rule__VariableDecl__NameAssignment_1 ) )
            // InternalMiniJava.g:2668:2: ( rule__VariableDecl__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:2669:2: ( rule__VariableDecl__NameAssignment_1 )
            // InternalMiniJava.g:2669:3: rule__VariableDecl__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__1__Impl"


    // $ANTLR start "rule__VariableDecl__Group__2"
    // InternalMiniJava.g:2677:1: rule__VariableDecl__Group__2 : rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 ;
    public final void rule__VariableDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2681:1: ( rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3 )
            // InternalMiniJava.g:2682:2: rule__VariableDecl__Group__2__Impl rule__VariableDecl__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__VariableDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__2"


    // $ANTLR start "rule__VariableDecl__Group__2__Impl"
    // InternalMiniJava.g:2689:1: rule__VariableDecl__Group__2__Impl : ( ( '=' )? ) ;
    public final void rule__VariableDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2693:1: ( ( ( '=' )? ) )
            // InternalMiniJava.g:2694:1: ( ( '=' )? )
            {
            // InternalMiniJava.g:2694:1: ( ( '=' )? )
            // InternalMiniJava.g:2695:2: ( '=' )?
            {
             before(grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_2()); 
            // InternalMiniJava.g:2696:2: ( '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==54) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMiniJava.g:2696:3: '='
                    {
                    match(input,54,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getVariableDeclAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__2__Impl"


    // $ANTLR start "rule__VariableDecl__Group__3"
    // InternalMiniJava.g:2704:1: rule__VariableDecl__Group__3 : rule__VariableDecl__Group__3__Impl rule__VariableDecl__Group__4 ;
    public final void rule__VariableDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2708:1: ( rule__VariableDecl__Group__3__Impl rule__VariableDecl__Group__4 )
            // InternalMiniJava.g:2709:2: rule__VariableDecl__Group__3__Impl rule__VariableDecl__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__VariableDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__3"


    // $ANTLR start "rule__VariableDecl__Group__3__Impl"
    // InternalMiniJava.g:2716:1: rule__VariableDecl__Group__3__Impl : ( ( rule__VariableDecl__ValueAssignment_3 )? ) ;
    public final void rule__VariableDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2720:1: ( ( ( rule__VariableDecl__ValueAssignment_3 )? ) )
            // InternalMiniJava.g:2721:1: ( ( rule__VariableDecl__ValueAssignment_3 )? )
            {
            // InternalMiniJava.g:2721:1: ( ( rule__VariableDecl__ValueAssignment_3 )? )
            // InternalMiniJava.g:2722:2: ( rule__VariableDecl__ValueAssignment_3 )?
            {
             before(grammarAccess.getVariableDeclAccess().getValueAssignment_3()); 
            // InternalMiniJava.g:2723:2: ( rule__VariableDecl__ValueAssignment_3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_INT)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMiniJava.g:2723:3: rule__VariableDecl__ValueAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDecl__ValueAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableDeclAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__3__Impl"


    // $ANTLR start "rule__VariableDecl__Group__4"
    // InternalMiniJava.g:2731:1: rule__VariableDecl__Group__4 : rule__VariableDecl__Group__4__Impl ;
    public final void rule__VariableDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2735:1: ( rule__VariableDecl__Group__4__Impl )
            // InternalMiniJava.g:2736:2: rule__VariableDecl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDecl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__4"


    // $ANTLR start "rule__VariableDecl__Group__4__Impl"
    // InternalMiniJava.g:2742:1: rule__VariableDecl__Group__4__Impl : ( ';' ) ;
    public final void rule__VariableDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2746:1: ( ( ';' ) )
            // InternalMiniJava.g:2747:1: ( ';' )
            {
            // InternalMiniJava.g:2747:1: ( ';' )
            // InternalMiniJava.g:2748:2: ';'
            {
             before(grammarAccess.getVariableDeclAccess().getSemicolonKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVariableDeclAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalMiniJava.g:2758:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2762:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalMiniJava.g:2763:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalMiniJava.g:2770:1: rule__Parameter__Group__0__Impl : ( ( rule__Parameter__TypeAssignment_0 ) ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2774:1: ( ( ( rule__Parameter__TypeAssignment_0 ) ) )
            // InternalMiniJava.g:2775:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            {
            // InternalMiniJava.g:2775:1: ( ( rule__Parameter__TypeAssignment_0 ) )
            // InternalMiniJava.g:2776:2: ( rule__Parameter__TypeAssignment_0 )
            {
             before(grammarAccess.getParameterAccess().getTypeAssignment_0()); 
            // InternalMiniJava.g:2777:2: ( rule__Parameter__TypeAssignment_0 )
            // InternalMiniJava.g:2777:3: rule__Parameter__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalMiniJava.g:2785:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2789:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalMiniJava.g:2790:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalMiniJava.g:2797:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2801:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalMiniJava.g:2802:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:2802:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalMiniJava.g:2803:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:2804:2: ( rule__Parameter__NameAssignment_1 )
            // InternalMiniJava.g:2804:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalMiniJava.g:2812:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2816:1: ( rule__Parameter__Group__2__Impl )
            // InternalMiniJava.g:2817:2: rule__Parameter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalMiniJava.g:2823:1: rule__Parameter__Group__2__Impl : ( ( ',' )? ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2827:1: ( ( ( ',' )? ) )
            // InternalMiniJava.g:2828:1: ( ( ',' )? )
            {
            // InternalMiniJava.g:2828:1: ( ( ',' )? )
            // InternalMiniJava.g:2829:2: ( ',' )?
            {
             before(grammarAccess.getParameterAccess().getCommaKeyword_2()); 
            // InternalMiniJava.g:2830:2: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==55) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMiniJava.g:2830:3: ','
                    {
                    match(input,55,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParameterAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__MethodDecl__Group__0"
    // InternalMiniJava.g:2839:1: rule__MethodDecl__Group__0 : rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1 ;
    public final void rule__MethodDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2843:1: ( rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1 )
            // InternalMiniJava.g:2844:2: rule__MethodDecl__Group__0__Impl rule__MethodDecl__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__MethodDecl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__0"


    // $ANTLR start "rule__MethodDecl__Group__0__Impl"
    // InternalMiniJava.g:2851:1: rule__MethodDecl__Group__0__Impl : ( ( rule__MethodDecl__DomainAssignment_0 ) ) ;
    public final void rule__MethodDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2855:1: ( ( ( rule__MethodDecl__DomainAssignment_0 ) ) )
            // InternalMiniJava.g:2856:1: ( ( rule__MethodDecl__DomainAssignment_0 ) )
            {
            // InternalMiniJava.g:2856:1: ( ( rule__MethodDecl__DomainAssignment_0 ) )
            // InternalMiniJava.g:2857:2: ( rule__MethodDecl__DomainAssignment_0 )
            {
             before(grammarAccess.getMethodDeclAccess().getDomainAssignment_0()); 
            // InternalMiniJava.g:2858:2: ( rule__MethodDecl__DomainAssignment_0 )
            // InternalMiniJava.g:2858:3: rule__MethodDecl__DomainAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__DomainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclAccess().getDomainAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__0__Impl"


    // $ANTLR start "rule__MethodDecl__Group__1"
    // InternalMiniJava.g:2866:1: rule__MethodDecl__Group__1 : rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2 ;
    public final void rule__MethodDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2870:1: ( rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2 )
            // InternalMiniJava.g:2871:2: rule__MethodDecl__Group__1__Impl rule__MethodDecl__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__MethodDecl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__1"


    // $ANTLR start "rule__MethodDecl__Group__1__Impl"
    // InternalMiniJava.g:2878:1: rule__MethodDecl__Group__1__Impl : ( ( rule__MethodDecl__ExtraAssignment_1 )? ) ;
    public final void rule__MethodDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2882:1: ( ( ( rule__MethodDecl__ExtraAssignment_1 )? ) )
            // InternalMiniJava.g:2883:1: ( ( rule__MethodDecl__ExtraAssignment_1 )? )
            {
            // InternalMiniJava.g:2883:1: ( ( rule__MethodDecl__ExtraAssignment_1 )? )
            // InternalMiniJava.g:2884:2: ( rule__MethodDecl__ExtraAssignment_1 )?
            {
             before(grammarAccess.getMethodDeclAccess().getExtraAssignment_1()); 
            // InternalMiniJava.g:2885:2: ( rule__MethodDecl__ExtraAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=35 && LA25_0<=36)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMiniJava.g:2885:3: rule__MethodDecl__ExtraAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodDecl__ExtraAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMethodDeclAccess().getExtraAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__1__Impl"


    // $ANTLR start "rule__MethodDecl__Group__2"
    // InternalMiniJava.g:2893:1: rule__MethodDecl__Group__2 : rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3 ;
    public final void rule__MethodDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2897:1: ( rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3 )
            // InternalMiniJava.g:2898:2: rule__MethodDecl__Group__2__Impl rule__MethodDecl__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__MethodDecl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__2"


    // $ANTLR start "rule__MethodDecl__Group__2__Impl"
    // InternalMiniJava.g:2905:1: rule__MethodDecl__Group__2__Impl : ( ( rule__MethodDecl__RetTypeAssignment_2 ) ) ;
    public final void rule__MethodDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2909:1: ( ( ( rule__MethodDecl__RetTypeAssignment_2 ) ) )
            // InternalMiniJava.g:2910:1: ( ( rule__MethodDecl__RetTypeAssignment_2 ) )
            {
            // InternalMiniJava.g:2910:1: ( ( rule__MethodDecl__RetTypeAssignment_2 ) )
            // InternalMiniJava.g:2911:2: ( rule__MethodDecl__RetTypeAssignment_2 )
            {
             before(grammarAccess.getMethodDeclAccess().getRetTypeAssignment_2()); 
            // InternalMiniJava.g:2912:2: ( rule__MethodDecl__RetTypeAssignment_2 )
            // InternalMiniJava.g:2912:3: rule__MethodDecl__RetTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__RetTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclAccess().getRetTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__2__Impl"


    // $ANTLR start "rule__MethodDecl__Group__3"
    // InternalMiniJava.g:2920:1: rule__MethodDecl__Group__3 : rule__MethodDecl__Group__3__Impl rule__MethodDecl__Group__4 ;
    public final void rule__MethodDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2924:1: ( rule__MethodDecl__Group__3__Impl rule__MethodDecl__Group__4 )
            // InternalMiniJava.g:2925:2: rule__MethodDecl__Group__3__Impl rule__MethodDecl__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__MethodDecl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__3"


    // $ANTLR start "rule__MethodDecl__Group__3__Impl"
    // InternalMiniJava.g:2932:1: rule__MethodDecl__Group__3__Impl : ( ( rule__MethodDecl__NameAssignment_3 ) ) ;
    public final void rule__MethodDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2936:1: ( ( ( rule__MethodDecl__NameAssignment_3 ) ) )
            // InternalMiniJava.g:2937:1: ( ( rule__MethodDecl__NameAssignment_3 ) )
            {
            // InternalMiniJava.g:2937:1: ( ( rule__MethodDecl__NameAssignment_3 ) )
            // InternalMiniJava.g:2938:2: ( rule__MethodDecl__NameAssignment_3 )
            {
             before(grammarAccess.getMethodDeclAccess().getNameAssignment_3()); 
            // InternalMiniJava.g:2939:2: ( rule__MethodDecl__NameAssignment_3 )
            // InternalMiniJava.g:2939:3: rule__MethodDecl__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodDeclAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__3__Impl"


    // $ANTLR start "rule__MethodDecl__Group__4"
    // InternalMiniJava.g:2947:1: rule__MethodDecl__Group__4 : rule__MethodDecl__Group__4__Impl rule__MethodDecl__Group__5 ;
    public final void rule__MethodDecl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2951:1: ( rule__MethodDecl__Group__4__Impl rule__MethodDecl__Group__5 )
            // InternalMiniJava.g:2952:2: rule__MethodDecl__Group__4__Impl rule__MethodDecl__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__MethodDecl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__4"


    // $ANTLR start "rule__MethodDecl__Group__4__Impl"
    // InternalMiniJava.g:2959:1: rule__MethodDecl__Group__4__Impl : ( '(' ) ;
    public final void rule__MethodDecl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2963:1: ( ( '(' ) )
            // InternalMiniJava.g:2964:1: ( '(' )
            {
            // InternalMiniJava.g:2964:1: ( '(' )
            // InternalMiniJava.g:2965:2: '('
            {
             before(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMethodDeclAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__4__Impl"


    // $ANTLR start "rule__MethodDecl__Group__5"
    // InternalMiniJava.g:2974:1: rule__MethodDecl__Group__5 : rule__MethodDecl__Group__5__Impl rule__MethodDecl__Group__6 ;
    public final void rule__MethodDecl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2978:1: ( rule__MethodDecl__Group__5__Impl rule__MethodDecl__Group__6 )
            // InternalMiniJava.g:2979:2: rule__MethodDecl__Group__5__Impl rule__MethodDecl__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__MethodDecl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__5"


    // $ANTLR start "rule__MethodDecl__Group__5__Impl"
    // InternalMiniJava.g:2986:1: rule__MethodDecl__Group__5__Impl : ( ( rule__MethodDecl__ParamsAssignment_5 )* ) ;
    public final void rule__MethodDecl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:2990:1: ( ( ( rule__MethodDecl__ParamsAssignment_5 )* ) )
            // InternalMiniJava.g:2991:1: ( ( rule__MethodDecl__ParamsAssignment_5 )* )
            {
            // InternalMiniJava.g:2991:1: ( ( rule__MethodDecl__ParamsAssignment_5 )* )
            // InternalMiniJava.g:2992:2: ( rule__MethodDecl__ParamsAssignment_5 )*
            {
             before(grammarAccess.getMethodDeclAccess().getParamsAssignment_5()); 
            // InternalMiniJava.g:2993:2: ( rule__MethodDecl__ParamsAssignment_5 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_ID||(LA26_0>=11 && LA26_0<=15)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMiniJava.g:2993:3: rule__MethodDecl__ParamsAssignment_5
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__MethodDecl__ParamsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMethodDeclAccess().getParamsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__5__Impl"


    // $ANTLR start "rule__MethodDecl__Group__6"
    // InternalMiniJava.g:3001:1: rule__MethodDecl__Group__6 : rule__MethodDecl__Group__6__Impl rule__MethodDecl__Group__7 ;
    public final void rule__MethodDecl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3005:1: ( rule__MethodDecl__Group__6__Impl rule__MethodDecl__Group__7 )
            // InternalMiniJava.g:3006:2: rule__MethodDecl__Group__6__Impl rule__MethodDecl__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__MethodDecl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__6"


    // $ANTLR start "rule__MethodDecl__Group__6__Impl"
    // InternalMiniJava.g:3013:1: rule__MethodDecl__Group__6__Impl : ( ')' ) ;
    public final void rule__MethodDecl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3017:1: ( ( ')' ) )
            // InternalMiniJava.g:3018:1: ( ')' )
            {
            // InternalMiniJava.g:3018:1: ( ')' )
            // InternalMiniJava.g:3019:2: ')'
            {
             before(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_6()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMethodDeclAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__6__Impl"


    // $ANTLR start "rule__MethodDecl__Group__7"
    // InternalMiniJava.g:3028:1: rule__MethodDecl__Group__7 : rule__MethodDecl__Group__7__Impl rule__MethodDecl__Group__8 ;
    public final void rule__MethodDecl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3032:1: ( rule__MethodDecl__Group__7__Impl rule__MethodDecl__Group__8 )
            // InternalMiniJava.g:3033:2: rule__MethodDecl__Group__7__Impl rule__MethodDecl__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__MethodDecl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__7"


    // $ANTLR start "rule__MethodDecl__Group__7__Impl"
    // InternalMiniJava.g:3040:1: rule__MethodDecl__Group__7__Impl : ( '{' ) ;
    public final void rule__MethodDecl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3044:1: ( ( '{' ) )
            // InternalMiniJava.g:3045:1: ( '{' )
            {
            // InternalMiniJava.g:3045:1: ( '{' )
            // InternalMiniJava.g:3046:2: '{'
            {
             before(grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMethodDeclAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__7__Impl"


    // $ANTLR start "rule__MethodDecl__Group__8"
    // InternalMiniJava.g:3055:1: rule__MethodDecl__Group__8 : rule__MethodDecl__Group__8__Impl rule__MethodDecl__Group__9 ;
    public final void rule__MethodDecl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3059:1: ( rule__MethodDecl__Group__8__Impl rule__MethodDecl__Group__9 )
            // InternalMiniJava.g:3060:2: rule__MethodDecl__Group__8__Impl rule__MethodDecl__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__MethodDecl__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__8"


    // $ANTLR start "rule__MethodDecl__Group__8__Impl"
    // InternalMiniJava.g:3067:1: rule__MethodDecl__Group__8__Impl : ( ( rule__MethodDecl__StatementsAssignment_8 )* ) ;
    public final void rule__MethodDecl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3071:1: ( ( ( rule__MethodDecl__StatementsAssignment_8 )* ) )
            // InternalMiniJava.g:3072:1: ( ( rule__MethodDecl__StatementsAssignment_8 )* )
            {
            // InternalMiniJava.g:3072:1: ( ( rule__MethodDecl__StatementsAssignment_8 )* )
            // InternalMiniJava.g:3073:2: ( rule__MethodDecl__StatementsAssignment_8 )*
            {
             before(grammarAccess.getMethodDeclAccess().getStatementsAssignment_8()); 
            // InternalMiniJava.g:3074:2: ( rule__MethodDecl__StatementsAssignment_8 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=11 && LA27_0<=15)||LA27_0==17||(LA27_0>=37 && LA27_0<=38)||LA27_0==45||LA27_0==56||(LA27_0>=58 && LA27_0<=60)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMiniJava.g:3074:3: rule__MethodDecl__StatementsAssignment_8
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__MethodDecl__StatementsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMethodDeclAccess().getStatementsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__8__Impl"


    // $ANTLR start "rule__MethodDecl__Group__9"
    // InternalMiniJava.g:3082:1: rule__MethodDecl__Group__9 : rule__MethodDecl__Group__9__Impl ;
    public final void rule__MethodDecl__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3086:1: ( rule__MethodDecl__Group__9__Impl )
            // InternalMiniJava.g:3087:2: rule__MethodDecl__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodDecl__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__9"


    // $ANTLR start "rule__MethodDecl__Group__9__Impl"
    // InternalMiniJava.g:3093:1: rule__MethodDecl__Group__9__Impl : ( '}' ) ;
    public final void rule__MethodDecl__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3097:1: ( ( '}' ) )
            // InternalMiniJava.g:3098:1: ( '}' )
            {
            // InternalMiniJava.g:3098:1: ( '}' )
            // InternalMiniJava.g:3099:2: '}'
            {
             before(grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMethodDeclAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__Group__9__Impl"


    // $ANTLR start "rule__LValueExp__Group_1__0"
    // InternalMiniJava.g:3109:1: rule__LValueExp__Group_1__0 : rule__LValueExp__Group_1__0__Impl rule__LValueExp__Group_1__1 ;
    public final void rule__LValueExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3113:1: ( rule__LValueExp__Group_1__0__Impl rule__LValueExp__Group_1__1 )
            // InternalMiniJava.g:3114:2: rule__LValueExp__Group_1__0__Impl rule__LValueExp__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__LValueExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LValueExp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_1__0"


    // $ANTLR start "rule__LValueExp__Group_1__0__Impl"
    // InternalMiniJava.g:3121:1: rule__LValueExp__Group_1__0__Impl : ( ( rule__LValueExp__ExpAssignment_1_0 ) ) ;
    public final void rule__LValueExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3125:1: ( ( ( rule__LValueExp__ExpAssignment_1_0 ) ) )
            // InternalMiniJava.g:3126:1: ( ( rule__LValueExp__ExpAssignment_1_0 ) )
            {
            // InternalMiniJava.g:3126:1: ( ( rule__LValueExp__ExpAssignment_1_0 ) )
            // InternalMiniJava.g:3127:2: ( rule__LValueExp__ExpAssignment_1_0 )
            {
             before(grammarAccess.getLValueExpAccess().getExpAssignment_1_0()); 
            // InternalMiniJava.g:3128:2: ( rule__LValueExp__ExpAssignment_1_0 )
            // InternalMiniJava.g:3128:3: rule__LValueExp__ExpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LValueExp__ExpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLValueExpAccess().getExpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_1__0__Impl"


    // $ANTLR start "rule__LValueExp__Group_1__1"
    // InternalMiniJava.g:3136:1: rule__LValueExp__Group_1__1 : rule__LValueExp__Group_1__1__Impl rule__LValueExp__Group_1__2 ;
    public final void rule__LValueExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3140:1: ( rule__LValueExp__Group_1__1__Impl rule__LValueExp__Group_1__2 )
            // InternalMiniJava.g:3141:2: rule__LValueExp__Group_1__1__Impl rule__LValueExp__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__LValueExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LValueExp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_1__1"


    // $ANTLR start "rule__LValueExp__Group_1__1__Impl"
    // InternalMiniJava.g:3148:1: rule__LValueExp__Group_1__1__Impl : ( '.' ) ;
    public final void rule__LValueExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3152:1: ( ( '.' ) )
            // InternalMiniJava.g:3153:1: ( '.' )
            {
            // InternalMiniJava.g:3153:1: ( '.' )
            // InternalMiniJava.g:3154:2: '.'
            {
             before(grammarAccess.getLValueExpAccess().getFullStopKeyword_1_1()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLValueExpAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_1__1__Impl"


    // $ANTLR start "rule__LValueExp__Group_1__2"
    // InternalMiniJava.g:3163:1: rule__LValueExp__Group_1__2 : rule__LValueExp__Group_1__2__Impl ;
    public final void rule__LValueExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3167:1: ( rule__LValueExp__Group_1__2__Impl )
            // InternalMiniJava.g:3168:2: rule__LValueExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LValueExp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_1__2"


    // $ANTLR start "rule__LValueExp__Group_1__2__Impl"
    // InternalMiniJava.g:3174:1: rule__LValueExp__Group_1__2__Impl : ( ( rule__LValueExp__IdAssignment_1_2 ) ) ;
    public final void rule__LValueExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3178:1: ( ( ( rule__LValueExp__IdAssignment_1_2 ) ) )
            // InternalMiniJava.g:3179:1: ( ( rule__LValueExp__IdAssignment_1_2 ) )
            {
            // InternalMiniJava.g:3179:1: ( ( rule__LValueExp__IdAssignment_1_2 ) )
            // InternalMiniJava.g:3180:2: ( rule__LValueExp__IdAssignment_1_2 )
            {
             before(grammarAccess.getLValueExpAccess().getIdAssignment_1_2()); 
            // InternalMiniJava.g:3181:2: ( rule__LValueExp__IdAssignment_1_2 )
            // InternalMiniJava.g:3181:3: rule__LValueExp__IdAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__LValueExp__IdAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLValueExpAccess().getIdAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_1__2__Impl"


    // $ANTLR start "rule__LValueExp__Group_2__0"
    // InternalMiniJava.g:3190:1: rule__LValueExp__Group_2__0 : rule__LValueExp__Group_2__0__Impl rule__LValueExp__Group_2__1 ;
    public final void rule__LValueExp__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3194:1: ( rule__LValueExp__Group_2__0__Impl rule__LValueExp__Group_2__1 )
            // InternalMiniJava.g:3195:2: rule__LValueExp__Group_2__0__Impl rule__LValueExp__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__LValueExp__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LValueExp__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__0"


    // $ANTLR start "rule__LValueExp__Group_2__0__Impl"
    // InternalMiniJava.g:3202:1: rule__LValueExp__Group_2__0__Impl : ( ( rule__LValueExp__ExpAssignment_2_0 ) ) ;
    public final void rule__LValueExp__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3206:1: ( ( ( rule__LValueExp__ExpAssignment_2_0 ) ) )
            // InternalMiniJava.g:3207:1: ( ( rule__LValueExp__ExpAssignment_2_0 ) )
            {
            // InternalMiniJava.g:3207:1: ( ( rule__LValueExp__ExpAssignment_2_0 ) )
            // InternalMiniJava.g:3208:2: ( rule__LValueExp__ExpAssignment_2_0 )
            {
             before(grammarAccess.getLValueExpAccess().getExpAssignment_2_0()); 
            // InternalMiniJava.g:3209:2: ( rule__LValueExp__ExpAssignment_2_0 )
            // InternalMiniJava.g:3209:3: rule__LValueExp__ExpAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LValueExp__ExpAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLValueExpAccess().getExpAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__0__Impl"


    // $ANTLR start "rule__LValueExp__Group_2__1"
    // InternalMiniJava.g:3217:1: rule__LValueExp__Group_2__1 : rule__LValueExp__Group_2__1__Impl rule__LValueExp__Group_2__2 ;
    public final void rule__LValueExp__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3221:1: ( rule__LValueExp__Group_2__1__Impl rule__LValueExp__Group_2__2 )
            // InternalMiniJava.g:3222:2: rule__LValueExp__Group_2__1__Impl rule__LValueExp__Group_2__2
            {
            pushFollow(FOLLOW_33);
            rule__LValueExp__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LValueExp__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__1"


    // $ANTLR start "rule__LValueExp__Group_2__1__Impl"
    // InternalMiniJava.g:3229:1: rule__LValueExp__Group_2__1__Impl : ( '[' ) ;
    public final void rule__LValueExp__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3233:1: ( ( '[' ) )
            // InternalMiniJava.g:3234:1: ( '[' )
            {
            // InternalMiniJava.g:3234:1: ( '[' )
            // InternalMiniJava.g:3235:2: '['
            {
             before(grammarAccess.getLValueExpAccess().getLeftSquareBracketKeyword_2_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getLValueExpAccess().getLeftSquareBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__1__Impl"


    // $ANTLR start "rule__LValueExp__Group_2__2"
    // InternalMiniJava.g:3244:1: rule__LValueExp__Group_2__2 : rule__LValueExp__Group_2__2__Impl rule__LValueExp__Group_2__3 ;
    public final void rule__LValueExp__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3248:1: ( rule__LValueExp__Group_2__2__Impl rule__LValueExp__Group_2__3 )
            // InternalMiniJava.g:3249:2: rule__LValueExp__Group_2__2__Impl rule__LValueExp__Group_2__3
            {
            pushFollow(FOLLOW_17);
            rule__LValueExp__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LValueExp__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__2"


    // $ANTLR start "rule__LValueExp__Group_2__2__Impl"
    // InternalMiniJava.g:3256:1: rule__LValueExp__Group_2__2__Impl : ( ( rule__LValueExp__IndexAssignment_2_2 ) ) ;
    public final void rule__LValueExp__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3260:1: ( ( ( rule__LValueExp__IndexAssignment_2_2 ) ) )
            // InternalMiniJava.g:3261:1: ( ( rule__LValueExp__IndexAssignment_2_2 ) )
            {
            // InternalMiniJava.g:3261:1: ( ( rule__LValueExp__IndexAssignment_2_2 ) )
            // InternalMiniJava.g:3262:2: ( rule__LValueExp__IndexAssignment_2_2 )
            {
             before(grammarAccess.getLValueExpAccess().getIndexAssignment_2_2()); 
            // InternalMiniJava.g:3263:2: ( rule__LValueExp__IndexAssignment_2_2 )
            // InternalMiniJava.g:3263:3: rule__LValueExp__IndexAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__LValueExp__IndexAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLValueExpAccess().getIndexAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__2__Impl"


    // $ANTLR start "rule__LValueExp__Group_2__3"
    // InternalMiniJava.g:3271:1: rule__LValueExp__Group_2__3 : rule__LValueExp__Group_2__3__Impl ;
    public final void rule__LValueExp__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3275:1: ( rule__LValueExp__Group_2__3__Impl )
            // InternalMiniJava.g:3276:2: rule__LValueExp__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LValueExp__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__3"


    // $ANTLR start "rule__LValueExp__Group_2__3__Impl"
    // InternalMiniJava.g:3282:1: rule__LValueExp__Group_2__3__Impl : ( ']' ) ;
    public final void rule__LValueExp__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3286:1: ( ( ']' ) )
            // InternalMiniJava.g:3287:1: ( ']' )
            {
            // InternalMiniJava.g:3287:1: ( ']' )
            // InternalMiniJava.g:3288:2: ']'
            {
             before(grammarAccess.getLValueExpAccess().getRightSquareBracketKeyword_2_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLValueExpAccess().getRightSquareBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__Group_2__3__Impl"


    // $ANTLR start "rule__Assignments__Group__0"
    // InternalMiniJava.g:3298:1: rule__Assignments__Group__0 : rule__Assignments__Group__0__Impl rule__Assignments__Group__1 ;
    public final void rule__Assignments__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3302:1: ( rule__Assignments__Group__0__Impl rule__Assignments__Group__1 )
            // InternalMiniJava.g:3303:2: rule__Assignments__Group__0__Impl rule__Assignments__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Assignments__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignments__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__0"


    // $ANTLR start "rule__Assignments__Group__0__Impl"
    // InternalMiniJava.g:3310:1: rule__Assignments__Group__0__Impl : ( ( rule__Assignments__LeftValueAssignment_0 ) ) ;
    public final void rule__Assignments__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3314:1: ( ( ( rule__Assignments__LeftValueAssignment_0 ) ) )
            // InternalMiniJava.g:3315:1: ( ( rule__Assignments__LeftValueAssignment_0 ) )
            {
            // InternalMiniJava.g:3315:1: ( ( rule__Assignments__LeftValueAssignment_0 ) )
            // InternalMiniJava.g:3316:2: ( rule__Assignments__LeftValueAssignment_0 )
            {
             before(grammarAccess.getAssignmentsAccess().getLeftValueAssignment_0()); 
            // InternalMiniJava.g:3317:2: ( rule__Assignments__LeftValueAssignment_0 )
            // InternalMiniJava.g:3317:3: rule__Assignments__LeftValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignments__LeftValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentsAccess().getLeftValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__0__Impl"


    // $ANTLR start "rule__Assignments__Group__1"
    // InternalMiniJava.g:3325:1: rule__Assignments__Group__1 : rule__Assignments__Group__1__Impl rule__Assignments__Group__2 ;
    public final void rule__Assignments__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3329:1: ( rule__Assignments__Group__1__Impl rule__Assignments__Group__2 )
            // InternalMiniJava.g:3330:2: rule__Assignments__Group__1__Impl rule__Assignments__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__Assignments__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignments__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__1"


    // $ANTLR start "rule__Assignments__Group__1__Impl"
    // InternalMiniJava.g:3337:1: rule__Assignments__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignments__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3341:1: ( ( '=' ) )
            // InternalMiniJava.g:3342:1: ( '=' )
            {
            // InternalMiniJava.g:3342:1: ( '=' )
            // InternalMiniJava.g:3343:2: '='
            {
             before(grammarAccess.getAssignmentsAccess().getEqualsSignKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAssignmentsAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__1__Impl"


    // $ANTLR start "rule__Assignments__Group__2"
    // InternalMiniJava.g:3352:1: rule__Assignments__Group__2 : rule__Assignments__Group__2__Impl rule__Assignments__Group__3 ;
    public final void rule__Assignments__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3356:1: ( rule__Assignments__Group__2__Impl rule__Assignments__Group__3 )
            // InternalMiniJava.g:3357:2: rule__Assignments__Group__2__Impl rule__Assignments__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Assignments__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignments__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__2"


    // $ANTLR start "rule__Assignments__Group__2__Impl"
    // InternalMiniJava.g:3364:1: rule__Assignments__Group__2__Impl : ( ( rule__Assignments__ExpressionAssignment_2 ) ) ;
    public final void rule__Assignments__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3368:1: ( ( ( rule__Assignments__ExpressionAssignment_2 ) ) )
            // InternalMiniJava.g:3369:1: ( ( rule__Assignments__ExpressionAssignment_2 ) )
            {
            // InternalMiniJava.g:3369:1: ( ( rule__Assignments__ExpressionAssignment_2 ) )
            // InternalMiniJava.g:3370:2: ( rule__Assignments__ExpressionAssignment_2 )
            {
             before(grammarAccess.getAssignmentsAccess().getExpressionAssignment_2()); 
            // InternalMiniJava.g:3371:2: ( rule__Assignments__ExpressionAssignment_2 )
            // InternalMiniJava.g:3371:3: rule__Assignments__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignments__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentsAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__2__Impl"


    // $ANTLR start "rule__Assignments__Group__3"
    // InternalMiniJava.g:3379:1: rule__Assignments__Group__3 : rule__Assignments__Group__3__Impl ;
    public final void rule__Assignments__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3383:1: ( rule__Assignments__Group__3__Impl )
            // InternalMiniJava.g:3384:2: rule__Assignments__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignments__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__3"


    // $ANTLR start "rule__Assignments__Group__3__Impl"
    // InternalMiniJava.g:3390:1: rule__Assignments__Group__3__Impl : ( ';' ) ;
    public final void rule__Assignments__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3394:1: ( ( ';' ) )
            // InternalMiniJava.g:3395:1: ( ';' )
            {
            // InternalMiniJava.g:3395:1: ( ';' )
            // InternalMiniJava.g:3396:2: ';'
            {
             before(grammarAccess.getAssignmentsAccess().getSemicolonKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAssignmentsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__Group__3__Impl"


    // $ANTLR start "rule__IfStatements__Group__0"
    // InternalMiniJava.g:3406:1: rule__IfStatements__Group__0 : rule__IfStatements__Group__0__Impl rule__IfStatements__Group__1 ;
    public final void rule__IfStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3410:1: ( rule__IfStatements__Group__0__Impl rule__IfStatements__Group__1 )
            // InternalMiniJava.g:3411:2: rule__IfStatements__Group__0__Impl rule__IfStatements__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__IfStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__0"


    // $ANTLR start "rule__IfStatements__Group__0__Impl"
    // InternalMiniJava.g:3418:1: rule__IfStatements__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3422:1: ( ( 'if' ) )
            // InternalMiniJava.g:3423:1: ( 'if' )
            {
            // InternalMiniJava.g:3423:1: ( 'if' )
            // InternalMiniJava.g:3424:2: 'if'
            {
             before(grammarAccess.getIfStatementsAccess().getIfKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getIfStatementsAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__0__Impl"


    // $ANTLR start "rule__IfStatements__Group__1"
    // InternalMiniJava.g:3433:1: rule__IfStatements__Group__1 : rule__IfStatements__Group__1__Impl rule__IfStatements__Group__2 ;
    public final void rule__IfStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3437:1: ( rule__IfStatements__Group__1__Impl rule__IfStatements__Group__2 )
            // InternalMiniJava.g:3438:2: rule__IfStatements__Group__1__Impl rule__IfStatements__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__IfStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__1"


    // $ANTLR start "rule__IfStatements__Group__1__Impl"
    // InternalMiniJava.g:3445:1: rule__IfStatements__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3449:1: ( ( '(' ) )
            // InternalMiniJava.g:3450:1: ( '(' )
            {
            // InternalMiniJava.g:3450:1: ( '(' )
            // InternalMiniJava.g:3451:2: '('
            {
             before(grammarAccess.getIfStatementsAccess().getLeftParenthesisKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getIfStatementsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__1__Impl"


    // $ANTLR start "rule__IfStatements__Group__2"
    // InternalMiniJava.g:3460:1: rule__IfStatements__Group__2 : rule__IfStatements__Group__2__Impl rule__IfStatements__Group__3 ;
    public final void rule__IfStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3464:1: ( rule__IfStatements__Group__2__Impl rule__IfStatements__Group__3 )
            // InternalMiniJava.g:3465:2: rule__IfStatements__Group__2__Impl rule__IfStatements__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__IfStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__2"


    // $ANTLR start "rule__IfStatements__Group__2__Impl"
    // InternalMiniJava.g:3472:1: rule__IfStatements__Group__2__Impl : ( ruleExpression ) ;
    public final void rule__IfStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3476:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3477:1: ( ruleExpression )
            {
            // InternalMiniJava.g:3477:1: ( ruleExpression )
            // InternalMiniJava.g:3478:2: ruleExpression
            {
             before(grammarAccess.getIfStatementsAccess().getExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfStatementsAccess().getExpressionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__2__Impl"


    // $ANTLR start "rule__IfStatements__Group__3"
    // InternalMiniJava.g:3487:1: rule__IfStatements__Group__3 : rule__IfStatements__Group__3__Impl rule__IfStatements__Group__4 ;
    public final void rule__IfStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3491:1: ( rule__IfStatements__Group__3__Impl rule__IfStatements__Group__4 )
            // InternalMiniJava.g:3492:2: rule__IfStatements__Group__3__Impl rule__IfStatements__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__IfStatements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__3"


    // $ANTLR start "rule__IfStatements__Group__3__Impl"
    // InternalMiniJava.g:3499:1: rule__IfStatements__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3503:1: ( ( ')' ) )
            // InternalMiniJava.g:3504:1: ( ')' )
            {
            // InternalMiniJava.g:3504:1: ( ')' )
            // InternalMiniJava.g:3505:2: ')'
            {
             before(grammarAccess.getIfStatementsAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getIfStatementsAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__3__Impl"


    // $ANTLR start "rule__IfStatements__Group__4"
    // InternalMiniJava.g:3514:1: rule__IfStatements__Group__4 : rule__IfStatements__Group__4__Impl rule__IfStatements__Group__5 ;
    public final void rule__IfStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3518:1: ( rule__IfStatements__Group__4__Impl rule__IfStatements__Group__5 )
            // InternalMiniJava.g:3519:2: rule__IfStatements__Group__4__Impl rule__IfStatements__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__IfStatements__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__4"


    // $ANTLR start "rule__IfStatements__Group__4__Impl"
    // InternalMiniJava.g:3526:1: rule__IfStatements__Group__4__Impl : ( '{' ) ;
    public final void rule__IfStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3530:1: ( ( '{' ) )
            // InternalMiniJava.g:3531:1: ( '{' )
            {
            // InternalMiniJava.g:3531:1: ( '{' )
            // InternalMiniJava.g:3532:2: '{'
            {
             before(grammarAccess.getIfStatementsAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getIfStatementsAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__4__Impl"


    // $ANTLR start "rule__IfStatements__Group__5"
    // InternalMiniJava.g:3541:1: rule__IfStatements__Group__5 : rule__IfStatements__Group__5__Impl rule__IfStatements__Group__6 ;
    public final void rule__IfStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3545:1: ( rule__IfStatements__Group__5__Impl rule__IfStatements__Group__6 )
            // InternalMiniJava.g:3546:2: rule__IfStatements__Group__5__Impl rule__IfStatements__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__IfStatements__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__5"


    // $ANTLR start "rule__IfStatements__Group__5__Impl"
    // InternalMiniJava.g:3553:1: rule__IfStatements__Group__5__Impl : ( ( rule__IfStatements__StatementsAssignment_5 )* ) ;
    public final void rule__IfStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3557:1: ( ( ( rule__IfStatements__StatementsAssignment_5 )* ) )
            // InternalMiniJava.g:3558:1: ( ( rule__IfStatements__StatementsAssignment_5 )* )
            {
            // InternalMiniJava.g:3558:1: ( ( rule__IfStatements__StatementsAssignment_5 )* )
            // InternalMiniJava.g:3559:2: ( rule__IfStatements__StatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementsAccess().getStatementsAssignment_5()); 
            // InternalMiniJava.g:3560:2: ( rule__IfStatements__StatementsAssignment_5 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||(LA28_0>=11 && LA28_0<=15)||LA28_0==17||(LA28_0>=37 && LA28_0<=38)||LA28_0==45||LA28_0==56||(LA28_0>=58 && LA28_0<=60)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMiniJava.g:3560:3: rule__IfStatements__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__IfStatements__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getIfStatementsAccess().getStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__5__Impl"


    // $ANTLR start "rule__IfStatements__Group__6"
    // InternalMiniJava.g:3568:1: rule__IfStatements__Group__6 : rule__IfStatements__Group__6__Impl rule__IfStatements__Group__7 ;
    public final void rule__IfStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3572:1: ( rule__IfStatements__Group__6__Impl rule__IfStatements__Group__7 )
            // InternalMiniJava.g:3573:2: rule__IfStatements__Group__6__Impl rule__IfStatements__Group__7
            {
            pushFollow(FOLLOW_35);
            rule__IfStatements__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__6"


    // $ANTLR start "rule__IfStatements__Group__6__Impl"
    // InternalMiniJava.g:3580:1: rule__IfStatements__Group__6__Impl : ( '}' ) ;
    public final void rule__IfStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3584:1: ( ( '}' ) )
            // InternalMiniJava.g:3585:1: ( '}' )
            {
            // InternalMiniJava.g:3585:1: ( '}' )
            // InternalMiniJava.g:3586:2: '}'
            {
             before(grammarAccess.getIfStatementsAccess().getRightCurlyBracketKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getIfStatementsAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__6__Impl"


    // $ANTLR start "rule__IfStatements__Group__7"
    // InternalMiniJava.g:3595:1: rule__IfStatements__Group__7 : rule__IfStatements__Group__7__Impl rule__IfStatements__Group__8 ;
    public final void rule__IfStatements__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3599:1: ( rule__IfStatements__Group__7__Impl rule__IfStatements__Group__8 )
            // InternalMiniJava.g:3600:2: rule__IfStatements__Group__7__Impl rule__IfStatements__Group__8
            {
            pushFollow(FOLLOW_35);
            rule__IfStatements__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__7"


    // $ANTLR start "rule__IfStatements__Group__7__Impl"
    // InternalMiniJava.g:3607:1: rule__IfStatements__Group__7__Impl : ( ( rule__IfStatements__ElseIfAssignment_7 )* ) ;
    public final void rule__IfStatements__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3611:1: ( ( ( rule__IfStatements__ElseIfAssignment_7 )* ) )
            // InternalMiniJava.g:3612:1: ( ( rule__IfStatements__ElseIfAssignment_7 )* )
            {
            // InternalMiniJava.g:3612:1: ( ( rule__IfStatements__ElseIfAssignment_7 )* )
            // InternalMiniJava.g:3613:2: ( rule__IfStatements__ElseIfAssignment_7 )*
            {
             before(grammarAccess.getIfStatementsAccess().getElseIfAssignment_7()); 
            // InternalMiniJava.g:3614:2: ( rule__IfStatements__ElseIfAssignment_7 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==57) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==56) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalMiniJava.g:3614:3: rule__IfStatements__ElseIfAssignment_7
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__IfStatements__ElseIfAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getIfStatementsAccess().getElseIfAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__7__Impl"


    // $ANTLR start "rule__IfStatements__Group__8"
    // InternalMiniJava.g:3622:1: rule__IfStatements__Group__8 : rule__IfStatements__Group__8__Impl ;
    public final void rule__IfStatements__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3626:1: ( rule__IfStatements__Group__8__Impl )
            // InternalMiniJava.g:3627:2: rule__IfStatements__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IfStatements__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__8"


    // $ANTLR start "rule__IfStatements__Group__8__Impl"
    // InternalMiniJava.g:3633:1: rule__IfStatements__Group__8__Impl : ( ( rule__IfStatements__ElseAssignment_8 )* ) ;
    public final void rule__IfStatements__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3637:1: ( ( ( rule__IfStatements__ElseAssignment_8 )* ) )
            // InternalMiniJava.g:3638:1: ( ( rule__IfStatements__ElseAssignment_8 )* )
            {
            // InternalMiniJava.g:3638:1: ( ( rule__IfStatements__ElseAssignment_8 )* )
            // InternalMiniJava.g:3639:2: ( rule__IfStatements__ElseAssignment_8 )*
            {
             before(grammarAccess.getIfStatementsAccess().getElseAssignment_8()); 
            // InternalMiniJava.g:3640:2: ( rule__IfStatements__ElseAssignment_8 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==57) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMiniJava.g:3640:3: rule__IfStatements__ElseAssignment_8
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__IfStatements__ElseAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getIfStatementsAccess().getElseAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__Group__8__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__0"
    // InternalMiniJava.g:3649:1: rule__ElseIfStatements__Group__0 : rule__ElseIfStatements__Group__0__Impl rule__ElseIfStatements__Group__1 ;
    public final void rule__ElseIfStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3653:1: ( rule__ElseIfStatements__Group__0__Impl rule__ElseIfStatements__Group__1 )
            // InternalMiniJava.g:3654:2: rule__ElseIfStatements__Group__0__Impl rule__ElseIfStatements__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ElseIfStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__0"


    // $ANTLR start "rule__ElseIfStatements__Group__0__Impl"
    // InternalMiniJava.g:3661:1: rule__ElseIfStatements__Group__0__Impl : ( 'else' ) ;
    public final void rule__ElseIfStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3665:1: ( ( 'else' ) )
            // InternalMiniJava.g:3666:1: ( 'else' )
            {
            // InternalMiniJava.g:3666:1: ( 'else' )
            // InternalMiniJava.g:3667:2: 'else'
            {
             before(grammarAccess.getElseIfStatementsAccess().getElseKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getElseIfStatementsAccess().getElseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__0__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__1"
    // InternalMiniJava.g:3676:1: rule__ElseIfStatements__Group__1 : rule__ElseIfStatements__Group__1__Impl rule__ElseIfStatements__Group__2 ;
    public final void rule__ElseIfStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3680:1: ( rule__ElseIfStatements__Group__1__Impl rule__ElseIfStatements__Group__2 )
            // InternalMiniJava.g:3681:2: rule__ElseIfStatements__Group__1__Impl rule__ElseIfStatements__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ElseIfStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__1"


    // $ANTLR start "rule__ElseIfStatements__Group__1__Impl"
    // InternalMiniJava.g:3688:1: rule__ElseIfStatements__Group__1__Impl : ( 'if' ) ;
    public final void rule__ElseIfStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3692:1: ( ( 'if' ) )
            // InternalMiniJava.g:3693:1: ( 'if' )
            {
            // InternalMiniJava.g:3693:1: ( 'if' )
            // InternalMiniJava.g:3694:2: 'if'
            {
             before(grammarAccess.getElseIfStatementsAccess().getIfKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getElseIfStatementsAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__1__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__2"
    // InternalMiniJava.g:3703:1: rule__ElseIfStatements__Group__2 : rule__ElseIfStatements__Group__2__Impl rule__ElseIfStatements__Group__3 ;
    public final void rule__ElseIfStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3707:1: ( rule__ElseIfStatements__Group__2__Impl rule__ElseIfStatements__Group__3 )
            // InternalMiniJava.g:3708:2: rule__ElseIfStatements__Group__2__Impl rule__ElseIfStatements__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ElseIfStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__2"


    // $ANTLR start "rule__ElseIfStatements__Group__2__Impl"
    // InternalMiniJava.g:3715:1: rule__ElseIfStatements__Group__2__Impl : ( '(' ) ;
    public final void rule__ElseIfStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3719:1: ( ( '(' ) )
            // InternalMiniJava.g:3720:1: ( '(' )
            {
            // InternalMiniJava.g:3720:1: ( '(' )
            // InternalMiniJava.g:3721:2: '('
            {
             before(grammarAccess.getElseIfStatementsAccess().getLeftParenthesisKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getElseIfStatementsAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__2__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__3"
    // InternalMiniJava.g:3730:1: rule__ElseIfStatements__Group__3 : rule__ElseIfStatements__Group__3__Impl rule__ElseIfStatements__Group__4 ;
    public final void rule__ElseIfStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3734:1: ( rule__ElseIfStatements__Group__3__Impl rule__ElseIfStatements__Group__4 )
            // InternalMiniJava.g:3735:2: rule__ElseIfStatements__Group__3__Impl rule__ElseIfStatements__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ElseIfStatements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__3"


    // $ANTLR start "rule__ElseIfStatements__Group__3__Impl"
    // InternalMiniJava.g:3742:1: rule__ElseIfStatements__Group__3__Impl : ( ruleExpression ) ;
    public final void rule__ElseIfStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3746:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:3747:1: ( ruleExpression )
            {
            // InternalMiniJava.g:3747:1: ( ruleExpression )
            // InternalMiniJava.g:3748:2: ruleExpression
            {
             before(grammarAccess.getElseIfStatementsAccess().getExpressionParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getElseIfStatementsAccess().getExpressionParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__3__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__4"
    // InternalMiniJava.g:3757:1: rule__ElseIfStatements__Group__4 : rule__ElseIfStatements__Group__4__Impl rule__ElseIfStatements__Group__5 ;
    public final void rule__ElseIfStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3761:1: ( rule__ElseIfStatements__Group__4__Impl rule__ElseIfStatements__Group__5 )
            // InternalMiniJava.g:3762:2: rule__ElseIfStatements__Group__4__Impl rule__ElseIfStatements__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__ElseIfStatements__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__4"


    // $ANTLR start "rule__ElseIfStatements__Group__4__Impl"
    // InternalMiniJava.g:3769:1: rule__ElseIfStatements__Group__4__Impl : ( ')' ) ;
    public final void rule__ElseIfStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3773:1: ( ( ')' ) )
            // InternalMiniJava.g:3774:1: ( ')' )
            {
            // InternalMiniJava.g:3774:1: ( ')' )
            // InternalMiniJava.g:3775:2: ')'
            {
             before(grammarAccess.getElseIfStatementsAccess().getRightParenthesisKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getElseIfStatementsAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__4__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__5"
    // InternalMiniJava.g:3784:1: rule__ElseIfStatements__Group__5 : rule__ElseIfStatements__Group__5__Impl rule__ElseIfStatements__Group__6 ;
    public final void rule__ElseIfStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3788:1: ( rule__ElseIfStatements__Group__5__Impl rule__ElseIfStatements__Group__6 )
            // InternalMiniJava.g:3789:2: rule__ElseIfStatements__Group__5__Impl rule__ElseIfStatements__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__ElseIfStatements__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__5"


    // $ANTLR start "rule__ElseIfStatements__Group__5__Impl"
    // InternalMiniJava.g:3796:1: rule__ElseIfStatements__Group__5__Impl : ( '{' ) ;
    public final void rule__ElseIfStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3800:1: ( ( '{' ) )
            // InternalMiniJava.g:3801:1: ( '{' )
            {
            // InternalMiniJava.g:3801:1: ( '{' )
            // InternalMiniJava.g:3802:2: '{'
            {
             before(grammarAccess.getElseIfStatementsAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getElseIfStatementsAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__5__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__6"
    // InternalMiniJava.g:3811:1: rule__ElseIfStatements__Group__6 : rule__ElseIfStatements__Group__6__Impl rule__ElseIfStatements__Group__7 ;
    public final void rule__ElseIfStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3815:1: ( rule__ElseIfStatements__Group__6__Impl rule__ElseIfStatements__Group__7 )
            // InternalMiniJava.g:3816:2: rule__ElseIfStatements__Group__6__Impl rule__ElseIfStatements__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__ElseIfStatements__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__6"


    // $ANTLR start "rule__ElseIfStatements__Group__6__Impl"
    // InternalMiniJava.g:3823:1: rule__ElseIfStatements__Group__6__Impl : ( ( rule__ElseIfStatements__StatementsAssignment_6 )* ) ;
    public final void rule__ElseIfStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3827:1: ( ( ( rule__ElseIfStatements__StatementsAssignment_6 )* ) )
            // InternalMiniJava.g:3828:1: ( ( rule__ElseIfStatements__StatementsAssignment_6 )* )
            {
            // InternalMiniJava.g:3828:1: ( ( rule__ElseIfStatements__StatementsAssignment_6 )* )
            // InternalMiniJava.g:3829:2: ( rule__ElseIfStatements__StatementsAssignment_6 )*
            {
             before(grammarAccess.getElseIfStatementsAccess().getStatementsAssignment_6()); 
            // InternalMiniJava.g:3830:2: ( rule__ElseIfStatements__StatementsAssignment_6 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_STRING && LA31_0<=RULE_ID)||(LA31_0>=11 && LA31_0<=15)||LA31_0==17||(LA31_0>=37 && LA31_0<=38)||LA31_0==45||LA31_0==56||(LA31_0>=58 && LA31_0<=60)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMiniJava.g:3830:3: rule__ElseIfStatements__StatementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ElseIfStatements__StatementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getElseIfStatementsAccess().getStatementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__6__Impl"


    // $ANTLR start "rule__ElseIfStatements__Group__7"
    // InternalMiniJava.g:3838:1: rule__ElseIfStatements__Group__7 : rule__ElseIfStatements__Group__7__Impl ;
    public final void rule__ElseIfStatements__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3842:1: ( rule__ElseIfStatements__Group__7__Impl )
            // InternalMiniJava.g:3843:2: rule__ElseIfStatements__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseIfStatements__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__7"


    // $ANTLR start "rule__ElseIfStatements__Group__7__Impl"
    // InternalMiniJava.g:3849:1: rule__ElseIfStatements__Group__7__Impl : ( '}' ) ;
    public final void rule__ElseIfStatements__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3853:1: ( ( '}' ) )
            // InternalMiniJava.g:3854:1: ( '}' )
            {
            // InternalMiniJava.g:3854:1: ( '}' )
            // InternalMiniJava.g:3855:2: '}'
            {
             before(grammarAccess.getElseIfStatementsAccess().getRightCurlyBracketKeyword_7()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getElseIfStatementsAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__Group__7__Impl"


    // $ANTLR start "rule__ElseStatement__Group__0"
    // InternalMiniJava.g:3865:1: rule__ElseStatement__Group__0 : rule__ElseStatement__Group__0__Impl rule__ElseStatement__Group__1 ;
    public final void rule__ElseStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3869:1: ( rule__ElseStatement__Group__0__Impl rule__ElseStatement__Group__1 )
            // InternalMiniJava.g:3870:2: rule__ElseStatement__Group__0__Impl rule__ElseStatement__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__ElseStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__0"


    // $ANTLR start "rule__ElseStatement__Group__0__Impl"
    // InternalMiniJava.g:3877:1: rule__ElseStatement__Group__0__Impl : ( () ) ;
    public final void rule__ElseStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3881:1: ( ( () ) )
            // InternalMiniJava.g:3882:1: ( () )
            {
            // InternalMiniJava.g:3882:1: ( () )
            // InternalMiniJava.g:3883:2: ()
            {
             before(grammarAccess.getElseStatementAccess().getElseStatementAction_0()); 
            // InternalMiniJava.g:3884:2: ()
            // InternalMiniJava.g:3884:3: 
            {
            }

             after(grammarAccess.getElseStatementAccess().getElseStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__0__Impl"


    // $ANTLR start "rule__ElseStatement__Group__1"
    // InternalMiniJava.g:3892:1: rule__ElseStatement__Group__1 : rule__ElseStatement__Group__1__Impl rule__ElseStatement__Group__2 ;
    public final void rule__ElseStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3896:1: ( rule__ElseStatement__Group__1__Impl rule__ElseStatement__Group__2 )
            // InternalMiniJava.g:3897:2: rule__ElseStatement__Group__1__Impl rule__ElseStatement__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ElseStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__1"


    // $ANTLR start "rule__ElseStatement__Group__1__Impl"
    // InternalMiniJava.g:3904:1: rule__ElseStatement__Group__1__Impl : ( 'else' ) ;
    public final void rule__ElseStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3908:1: ( ( 'else' ) )
            // InternalMiniJava.g:3909:1: ( 'else' )
            {
            // InternalMiniJava.g:3909:1: ( 'else' )
            // InternalMiniJava.g:3910:2: 'else'
            {
             before(grammarAccess.getElseStatementAccess().getElseKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getElseStatementAccess().getElseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__1__Impl"


    // $ANTLR start "rule__ElseStatement__Group__2"
    // InternalMiniJava.g:3919:1: rule__ElseStatement__Group__2 : rule__ElseStatement__Group__2__Impl rule__ElseStatement__Group__3 ;
    public final void rule__ElseStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3923:1: ( rule__ElseStatement__Group__2__Impl rule__ElseStatement__Group__3 )
            // InternalMiniJava.g:3924:2: rule__ElseStatement__Group__2__Impl rule__ElseStatement__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__ElseStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__2"


    // $ANTLR start "rule__ElseStatement__Group__2__Impl"
    // InternalMiniJava.g:3931:1: rule__ElseStatement__Group__2__Impl : ( '{' ) ;
    public final void rule__ElseStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3935:1: ( ( '{' ) )
            // InternalMiniJava.g:3936:1: ( '{' )
            {
            // InternalMiniJava.g:3936:1: ( '{' )
            // InternalMiniJava.g:3937:2: '{'
            {
             before(grammarAccess.getElseStatementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getElseStatementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__2__Impl"


    // $ANTLR start "rule__ElseStatement__Group__3"
    // InternalMiniJava.g:3946:1: rule__ElseStatement__Group__3 : rule__ElseStatement__Group__3__Impl rule__ElseStatement__Group__4 ;
    public final void rule__ElseStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3950:1: ( rule__ElseStatement__Group__3__Impl rule__ElseStatement__Group__4 )
            // InternalMiniJava.g:3951:2: rule__ElseStatement__Group__3__Impl rule__ElseStatement__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__ElseStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__3"


    // $ANTLR start "rule__ElseStatement__Group__3__Impl"
    // InternalMiniJava.g:3958:1: rule__ElseStatement__Group__3__Impl : ( ( rule__ElseStatement__StatementsAssignment_3 )* ) ;
    public final void rule__ElseStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3962:1: ( ( ( rule__ElseStatement__StatementsAssignment_3 )* ) )
            // InternalMiniJava.g:3963:1: ( ( rule__ElseStatement__StatementsAssignment_3 )* )
            {
            // InternalMiniJava.g:3963:1: ( ( rule__ElseStatement__StatementsAssignment_3 )* )
            // InternalMiniJava.g:3964:2: ( rule__ElseStatement__StatementsAssignment_3 )*
            {
             before(grammarAccess.getElseStatementAccess().getStatementsAssignment_3()); 
            // InternalMiniJava.g:3965:2: ( rule__ElseStatement__StatementsAssignment_3 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)||(LA32_0>=11 && LA32_0<=15)||LA32_0==17||(LA32_0>=37 && LA32_0<=38)||LA32_0==45||LA32_0==56||(LA32_0>=58 && LA32_0<=60)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMiniJava.g:3965:3: rule__ElseStatement__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ElseStatement__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getElseStatementAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__3__Impl"


    // $ANTLR start "rule__ElseStatement__Group__4"
    // InternalMiniJava.g:3973:1: rule__ElseStatement__Group__4 : rule__ElseStatement__Group__4__Impl ;
    public final void rule__ElseStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3977:1: ( rule__ElseStatement__Group__4__Impl )
            // InternalMiniJava.g:3978:2: rule__ElseStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ElseStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__4"


    // $ANTLR start "rule__ElseStatement__Group__4__Impl"
    // InternalMiniJava.g:3984:1: rule__ElseStatement__Group__4__Impl : ( '}' ) ;
    public final void rule__ElseStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:3988:1: ( ( '}' ) )
            // InternalMiniJava.g:3989:1: ( '}' )
            {
            // InternalMiniJava.g:3989:1: ( '}' )
            // InternalMiniJava.g:3990:2: '}'
            {
             before(grammarAccess.getElseStatementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getElseStatementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__Group__4__Impl"


    // $ANTLR start "rule__WhileStatements__Group__0"
    // InternalMiniJava.g:4000:1: rule__WhileStatements__Group__0 : rule__WhileStatements__Group__0__Impl rule__WhileStatements__Group__1 ;
    public final void rule__WhileStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4004:1: ( rule__WhileStatements__Group__0__Impl rule__WhileStatements__Group__1 )
            // InternalMiniJava.g:4005:2: rule__WhileStatements__Group__0__Impl rule__WhileStatements__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__WhileStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__0"


    // $ANTLR start "rule__WhileStatements__Group__0__Impl"
    // InternalMiniJava.g:4012:1: rule__WhileStatements__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4016:1: ( ( 'while' ) )
            // InternalMiniJava.g:4017:1: ( 'while' )
            {
            // InternalMiniJava.g:4017:1: ( 'while' )
            // InternalMiniJava.g:4018:2: 'while'
            {
             before(grammarAccess.getWhileStatementsAccess().getWhileKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getWhileStatementsAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__0__Impl"


    // $ANTLR start "rule__WhileStatements__Group__1"
    // InternalMiniJava.g:4027:1: rule__WhileStatements__Group__1 : rule__WhileStatements__Group__1__Impl rule__WhileStatements__Group__2 ;
    public final void rule__WhileStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4031:1: ( rule__WhileStatements__Group__1__Impl rule__WhileStatements__Group__2 )
            // InternalMiniJava.g:4032:2: rule__WhileStatements__Group__1__Impl rule__WhileStatements__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__WhileStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__1"


    // $ANTLR start "rule__WhileStatements__Group__1__Impl"
    // InternalMiniJava.g:4039:1: rule__WhileStatements__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4043:1: ( ( '(' ) )
            // InternalMiniJava.g:4044:1: ( '(' )
            {
            // InternalMiniJava.g:4044:1: ( '(' )
            // InternalMiniJava.g:4045:2: '('
            {
             before(grammarAccess.getWhileStatementsAccess().getLeftParenthesisKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getWhileStatementsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__1__Impl"


    // $ANTLR start "rule__WhileStatements__Group__2"
    // InternalMiniJava.g:4054:1: rule__WhileStatements__Group__2 : rule__WhileStatements__Group__2__Impl rule__WhileStatements__Group__3 ;
    public final void rule__WhileStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4058:1: ( rule__WhileStatements__Group__2__Impl rule__WhileStatements__Group__3 )
            // InternalMiniJava.g:4059:2: rule__WhileStatements__Group__2__Impl rule__WhileStatements__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__WhileStatements__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__2"


    // $ANTLR start "rule__WhileStatements__Group__2__Impl"
    // InternalMiniJava.g:4066:1: rule__WhileStatements__Group__2__Impl : ( ruleExpression ) ;
    public final void rule__WhileStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4070:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:4071:1: ( ruleExpression )
            {
            // InternalMiniJava.g:4071:1: ( ruleExpression )
            // InternalMiniJava.g:4072:2: ruleExpression
            {
             before(grammarAccess.getWhileStatementsAccess().getExpressionParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileStatementsAccess().getExpressionParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__2__Impl"


    // $ANTLR start "rule__WhileStatements__Group__3"
    // InternalMiniJava.g:4081:1: rule__WhileStatements__Group__3 : rule__WhileStatements__Group__3__Impl rule__WhileStatements__Group__4 ;
    public final void rule__WhileStatements__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4085:1: ( rule__WhileStatements__Group__3__Impl rule__WhileStatements__Group__4 )
            // InternalMiniJava.g:4086:2: rule__WhileStatements__Group__3__Impl rule__WhileStatements__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__WhileStatements__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__3"


    // $ANTLR start "rule__WhileStatements__Group__3__Impl"
    // InternalMiniJava.g:4093:1: rule__WhileStatements__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileStatements__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4097:1: ( ( ')' ) )
            // InternalMiniJava.g:4098:1: ( ')' )
            {
            // InternalMiniJava.g:4098:1: ( ')' )
            // InternalMiniJava.g:4099:2: ')'
            {
             before(grammarAccess.getWhileStatementsAccess().getRightParenthesisKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getWhileStatementsAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__3__Impl"


    // $ANTLR start "rule__WhileStatements__Group__4"
    // InternalMiniJava.g:4108:1: rule__WhileStatements__Group__4 : rule__WhileStatements__Group__4__Impl rule__WhileStatements__Group__5 ;
    public final void rule__WhileStatements__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4112:1: ( rule__WhileStatements__Group__4__Impl rule__WhileStatements__Group__5 )
            // InternalMiniJava.g:4113:2: rule__WhileStatements__Group__4__Impl rule__WhileStatements__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__WhileStatements__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__4"


    // $ANTLR start "rule__WhileStatements__Group__4__Impl"
    // InternalMiniJava.g:4120:1: rule__WhileStatements__Group__4__Impl : ( '{' ) ;
    public final void rule__WhileStatements__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4124:1: ( ( '{' ) )
            // InternalMiniJava.g:4125:1: ( '{' )
            {
            // InternalMiniJava.g:4125:1: ( '{' )
            // InternalMiniJava.g:4126:2: '{'
            {
             before(grammarAccess.getWhileStatementsAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getWhileStatementsAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__4__Impl"


    // $ANTLR start "rule__WhileStatements__Group__5"
    // InternalMiniJava.g:4135:1: rule__WhileStatements__Group__5 : rule__WhileStatements__Group__5__Impl rule__WhileStatements__Group__6 ;
    public final void rule__WhileStatements__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4139:1: ( rule__WhileStatements__Group__5__Impl rule__WhileStatements__Group__6 )
            // InternalMiniJava.g:4140:2: rule__WhileStatements__Group__5__Impl rule__WhileStatements__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__WhileStatements__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__5"


    // $ANTLR start "rule__WhileStatements__Group__5__Impl"
    // InternalMiniJava.g:4147:1: rule__WhileStatements__Group__5__Impl : ( ( rule__WhileStatements__StatementsAssignment_5 )* ) ;
    public final void rule__WhileStatements__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4151:1: ( ( ( rule__WhileStatements__StatementsAssignment_5 )* ) )
            // InternalMiniJava.g:4152:1: ( ( rule__WhileStatements__StatementsAssignment_5 )* )
            {
            // InternalMiniJava.g:4152:1: ( ( rule__WhileStatements__StatementsAssignment_5 )* )
            // InternalMiniJava.g:4153:2: ( rule__WhileStatements__StatementsAssignment_5 )*
            {
             before(grammarAccess.getWhileStatementsAccess().getStatementsAssignment_5()); 
            // InternalMiniJava.g:4154:2: ( rule__WhileStatements__StatementsAssignment_5 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||(LA33_0>=11 && LA33_0<=15)||LA33_0==17||(LA33_0>=37 && LA33_0<=38)||LA33_0==45||LA33_0==56||(LA33_0>=58 && LA33_0<=60)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMiniJava.g:4154:3: rule__WhileStatements__StatementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__WhileStatements__StatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getWhileStatementsAccess().getStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__5__Impl"


    // $ANTLR start "rule__WhileStatements__Group__6"
    // InternalMiniJava.g:4162:1: rule__WhileStatements__Group__6 : rule__WhileStatements__Group__6__Impl ;
    public final void rule__WhileStatements__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4166:1: ( rule__WhileStatements__Group__6__Impl )
            // InternalMiniJava.g:4167:2: rule__WhileStatements__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileStatements__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__6"


    // $ANTLR start "rule__WhileStatements__Group__6__Impl"
    // InternalMiniJava.g:4173:1: rule__WhileStatements__Group__6__Impl : ( '}' ) ;
    public final void rule__WhileStatements__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4177:1: ( ( '}' ) )
            // InternalMiniJava.g:4178:1: ( '}' )
            {
            // InternalMiniJava.g:4178:1: ( '}' )
            // InternalMiniJava.g:4179:2: '}'
            {
             before(grammarAccess.getWhileStatementsAccess().getRightCurlyBracketKeyword_6()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getWhileStatementsAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__Group__6__Impl"


    // $ANTLR start "rule__ReturnStatements__Group__0"
    // InternalMiniJava.g:4189:1: rule__ReturnStatements__Group__0 : rule__ReturnStatements__Group__0__Impl rule__ReturnStatements__Group__1 ;
    public final void rule__ReturnStatements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4193:1: ( rule__ReturnStatements__Group__0__Impl rule__ReturnStatements__Group__1 )
            // InternalMiniJava.g:4194:2: rule__ReturnStatements__Group__0__Impl rule__ReturnStatements__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__ReturnStatements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnStatements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatements__Group__0"


    // $ANTLR start "rule__ReturnStatements__Group__0__Impl"
    // InternalMiniJava.g:4201:1: rule__ReturnStatements__Group__0__Impl : ( 'return' ) ;
    public final void rule__ReturnStatements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4205:1: ( ( 'return' ) )
            // InternalMiniJava.g:4206:1: ( 'return' )
            {
            // InternalMiniJava.g:4206:1: ( 'return' )
            // InternalMiniJava.g:4207:2: 'return'
            {
             before(grammarAccess.getReturnStatementsAccess().getReturnKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getReturnStatementsAccess().getReturnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatements__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatements__Group__1"
    // InternalMiniJava.g:4216:1: rule__ReturnStatements__Group__1 : rule__ReturnStatements__Group__1__Impl rule__ReturnStatements__Group__2 ;
    public final void rule__ReturnStatements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4220:1: ( rule__ReturnStatements__Group__1__Impl rule__ReturnStatements__Group__2 )
            // InternalMiniJava.g:4221:2: rule__ReturnStatements__Group__1__Impl rule__ReturnStatements__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ReturnStatements__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReturnStatements__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatements__Group__1"


    // $ANTLR start "rule__ReturnStatements__Group__1__Impl"
    // InternalMiniJava.g:4228:1: rule__ReturnStatements__Group__1__Impl : ( ( rule__ReturnStatements__ExpAssignment_1 ) ) ;
    public final void rule__ReturnStatements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4232:1: ( ( ( rule__ReturnStatements__ExpAssignment_1 ) ) )
            // InternalMiniJava.g:4233:1: ( ( rule__ReturnStatements__ExpAssignment_1 ) )
            {
            // InternalMiniJava.g:4233:1: ( ( rule__ReturnStatements__ExpAssignment_1 ) )
            // InternalMiniJava.g:4234:2: ( rule__ReturnStatements__ExpAssignment_1 )
            {
             before(grammarAccess.getReturnStatementsAccess().getExpAssignment_1()); 
            // InternalMiniJava.g:4235:2: ( rule__ReturnStatements__ExpAssignment_1 )
            // InternalMiniJava.g:4235:3: rule__ReturnStatements__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatements__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReturnStatementsAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatements__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatements__Group__2"
    // InternalMiniJava.g:4243:1: rule__ReturnStatements__Group__2 : rule__ReturnStatements__Group__2__Impl ;
    public final void rule__ReturnStatements__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4247:1: ( rule__ReturnStatements__Group__2__Impl )
            // InternalMiniJava.g:4248:2: rule__ReturnStatements__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReturnStatements__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatements__Group__2"


    // $ANTLR start "rule__ReturnStatements__Group__2__Impl"
    // InternalMiniJava.g:4254:1: rule__ReturnStatements__Group__2__Impl : ( ';' ) ;
    public final void rule__ReturnStatements__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4258:1: ( ( ';' ) )
            // InternalMiniJava.g:4259:1: ( ';' )
            {
            // InternalMiniJava.g:4259:1: ( ';' )
            // InternalMiniJava.g:4260:2: ';'
            {
             before(grammarAccess.getReturnStatementsAccess().getSemicolonKeyword_2()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReturnStatementsAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatements__Group__2__Impl"


    // $ANTLR start "rule__CalcExp__Group_1__0"
    // InternalMiniJava.g:4270:1: rule__CalcExp__Group_1__0 : rule__CalcExp__Group_1__0__Impl rule__CalcExp__Group_1__1 ;
    public final void rule__CalcExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4274:1: ( rule__CalcExp__Group_1__0__Impl rule__CalcExp__Group_1__1 )
            // InternalMiniJava.g:4275:2: rule__CalcExp__Group_1__0__Impl rule__CalcExp__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__CalcExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalcExp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__Group_1__0"


    // $ANTLR start "rule__CalcExp__Group_1__0__Impl"
    // InternalMiniJava.g:4282:1: rule__CalcExp__Group_1__0__Impl : ( ( rule__CalcExp__LeftNumAssignment_1_0 ) ) ;
    public final void rule__CalcExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4286:1: ( ( ( rule__CalcExp__LeftNumAssignment_1_0 ) ) )
            // InternalMiniJava.g:4287:1: ( ( rule__CalcExp__LeftNumAssignment_1_0 ) )
            {
            // InternalMiniJava.g:4287:1: ( ( rule__CalcExp__LeftNumAssignment_1_0 ) )
            // InternalMiniJava.g:4288:2: ( rule__CalcExp__LeftNumAssignment_1_0 )
            {
             before(grammarAccess.getCalcExpAccess().getLeftNumAssignment_1_0()); 
            // InternalMiniJava.g:4289:2: ( rule__CalcExp__LeftNumAssignment_1_0 )
            // InternalMiniJava.g:4289:3: rule__CalcExp__LeftNumAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CalcExp__LeftNumAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCalcExpAccess().getLeftNumAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__Group_1__0__Impl"


    // $ANTLR start "rule__CalcExp__Group_1__1"
    // InternalMiniJava.g:4297:1: rule__CalcExp__Group_1__1 : rule__CalcExp__Group_1__1__Impl rule__CalcExp__Group_1__2 ;
    public final void rule__CalcExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4301:1: ( rule__CalcExp__Group_1__1__Impl rule__CalcExp__Group_1__2 )
            // InternalMiniJava.g:4302:2: rule__CalcExp__Group_1__1__Impl rule__CalcExp__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__CalcExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CalcExp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__Group_1__1"


    // $ANTLR start "rule__CalcExp__Group_1__1__Impl"
    // InternalMiniJava.g:4309:1: rule__CalcExp__Group_1__1__Impl : ( ( rule__CalcExp__OpAssignment_1_1 ) ) ;
    public final void rule__CalcExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4313:1: ( ( ( rule__CalcExp__OpAssignment_1_1 ) ) )
            // InternalMiniJava.g:4314:1: ( ( rule__CalcExp__OpAssignment_1_1 ) )
            {
            // InternalMiniJava.g:4314:1: ( ( rule__CalcExp__OpAssignment_1_1 ) )
            // InternalMiniJava.g:4315:2: ( rule__CalcExp__OpAssignment_1_1 )
            {
             before(grammarAccess.getCalcExpAccess().getOpAssignment_1_1()); 
            // InternalMiniJava.g:4316:2: ( rule__CalcExp__OpAssignment_1_1 )
            // InternalMiniJava.g:4316:3: rule__CalcExp__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CalcExp__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCalcExpAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__Group_1__1__Impl"


    // $ANTLR start "rule__CalcExp__Group_1__2"
    // InternalMiniJava.g:4324:1: rule__CalcExp__Group_1__2 : rule__CalcExp__Group_1__2__Impl ;
    public final void rule__CalcExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4328:1: ( rule__CalcExp__Group_1__2__Impl )
            // InternalMiniJava.g:4329:2: rule__CalcExp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CalcExp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__Group_1__2"


    // $ANTLR start "rule__CalcExp__Group_1__2__Impl"
    // InternalMiniJava.g:4335:1: rule__CalcExp__Group_1__2__Impl : ( ( rule__CalcExp__RightNameAssignment_1_2 ) ) ;
    public final void rule__CalcExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4339:1: ( ( ( rule__CalcExp__RightNameAssignment_1_2 ) ) )
            // InternalMiniJava.g:4340:1: ( ( rule__CalcExp__RightNameAssignment_1_2 ) )
            {
            // InternalMiniJava.g:4340:1: ( ( rule__CalcExp__RightNameAssignment_1_2 ) )
            // InternalMiniJava.g:4341:2: ( rule__CalcExp__RightNameAssignment_1_2 )
            {
             before(grammarAccess.getCalcExpAccess().getRightNameAssignment_1_2()); 
            // InternalMiniJava.g:4342:2: ( rule__CalcExp__RightNameAssignment_1_2 )
            // InternalMiniJava.g:4342:3: rule__CalcExp__RightNameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CalcExp__RightNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCalcExpAccess().getRightNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__Group_1__2__Impl"


    // $ANTLR start "rule__CompareExp__Group__0"
    // InternalMiniJava.g:4351:1: rule__CompareExp__Group__0 : rule__CompareExp__Group__0__Impl rule__CompareExp__Group__1 ;
    public final void rule__CompareExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4355:1: ( rule__CompareExp__Group__0__Impl rule__CompareExp__Group__1 )
            // InternalMiniJava.g:4356:2: rule__CompareExp__Group__0__Impl rule__CompareExp__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__CompareExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__0"


    // $ANTLR start "rule__CompareExp__Group__0__Impl"
    // InternalMiniJava.g:4363:1: rule__CompareExp__Group__0__Impl : ( ( rule__CompareExp__IdAssignment_0 ) ) ;
    public final void rule__CompareExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4367:1: ( ( ( rule__CompareExp__IdAssignment_0 ) ) )
            // InternalMiniJava.g:4368:1: ( ( rule__CompareExp__IdAssignment_0 ) )
            {
            // InternalMiniJava.g:4368:1: ( ( rule__CompareExp__IdAssignment_0 ) )
            // InternalMiniJava.g:4369:2: ( rule__CompareExp__IdAssignment_0 )
            {
             before(grammarAccess.getCompareExpAccess().getIdAssignment_0()); 
            // InternalMiniJava.g:4370:2: ( rule__CompareExp__IdAssignment_0 )
            // InternalMiniJava.g:4370:3: rule__CompareExp__IdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CompareExp__IdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompareExpAccess().getIdAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__0__Impl"


    // $ANTLR start "rule__CompareExp__Group__1"
    // InternalMiniJava.g:4378:1: rule__CompareExp__Group__1 : rule__CompareExp__Group__1__Impl rule__CompareExp__Group__2 ;
    public final void rule__CompareExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4382:1: ( rule__CompareExp__Group__1__Impl rule__CompareExp__Group__2 )
            // InternalMiniJava.g:4383:2: rule__CompareExp__Group__1__Impl rule__CompareExp__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__CompareExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__1"


    // $ANTLR start "rule__CompareExp__Group__1__Impl"
    // InternalMiniJava.g:4390:1: rule__CompareExp__Group__1__Impl : ( ( rule__CompareExp__OpAssignment_1 ) ) ;
    public final void rule__CompareExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4394:1: ( ( ( rule__CompareExp__OpAssignment_1 ) ) )
            // InternalMiniJava.g:4395:1: ( ( rule__CompareExp__OpAssignment_1 ) )
            {
            // InternalMiniJava.g:4395:1: ( ( rule__CompareExp__OpAssignment_1 ) )
            // InternalMiniJava.g:4396:2: ( rule__CompareExp__OpAssignment_1 )
            {
             before(grammarAccess.getCompareExpAccess().getOpAssignment_1()); 
            // InternalMiniJava.g:4397:2: ( rule__CompareExp__OpAssignment_1 )
            // InternalMiniJava.g:4397:3: rule__CompareExp__OpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompareExp__OpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompareExpAccess().getOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__1__Impl"


    // $ANTLR start "rule__CompareExp__Group__2"
    // InternalMiniJava.g:4405:1: rule__CompareExp__Group__2 : rule__CompareExp__Group__2__Impl rule__CompareExp__Group__3 ;
    public final void rule__CompareExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4409:1: ( rule__CompareExp__Group__2__Impl rule__CompareExp__Group__3 )
            // InternalMiniJava.g:4410:2: rule__CompareExp__Group__2__Impl rule__CompareExp__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__CompareExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompareExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__2"


    // $ANTLR start "rule__CompareExp__Group__2__Impl"
    // InternalMiniJava.g:4417:1: rule__CompareExp__Group__2__Impl : ( ( rule__CompareExp__Other1Assignment_2 )* ) ;
    public final void rule__CompareExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4421:1: ( ( ( rule__CompareExp__Other1Assignment_2 )* ) )
            // InternalMiniJava.g:4422:1: ( ( rule__CompareExp__Other1Assignment_2 )* )
            {
            // InternalMiniJava.g:4422:1: ( ( rule__CompareExp__Other1Assignment_2 )* )
            // InternalMiniJava.g:4423:2: ( rule__CompareExp__Other1Assignment_2 )*
            {
             before(grammarAccess.getCompareExpAccess().getOther1Assignment_2()); 
            // InternalMiniJava.g:4424:2: ( rule__CompareExp__Other1Assignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMiniJava.g:4424:3: rule__CompareExp__Other1Assignment_2
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__CompareExp__Other1Assignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getCompareExpAccess().getOther1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__2__Impl"


    // $ANTLR start "rule__CompareExp__Group__3"
    // InternalMiniJava.g:4432:1: rule__CompareExp__Group__3 : rule__CompareExp__Group__3__Impl ;
    public final void rule__CompareExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4436:1: ( rule__CompareExp__Group__3__Impl )
            // InternalMiniJava.g:4437:2: rule__CompareExp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompareExp__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__3"


    // $ANTLR start "rule__CompareExp__Group__3__Impl"
    // InternalMiniJava.g:4443:1: rule__CompareExp__Group__3__Impl : ( ( rule__CompareExp__Other2Assignment_3 )* ) ;
    public final void rule__CompareExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4447:1: ( ( ( rule__CompareExp__Other2Assignment_3 )* ) )
            // InternalMiniJava.g:4448:1: ( ( rule__CompareExp__Other2Assignment_3 )* )
            {
            // InternalMiniJava.g:4448:1: ( ( rule__CompareExp__Other2Assignment_3 )* )
            // InternalMiniJava.g:4449:2: ( rule__CompareExp__Other2Assignment_3 )*
            {
             before(grammarAccess.getCompareExpAccess().getOther2Assignment_3()); 
            // InternalMiniJava.g:4450:2: ( rule__CompareExp__Other2Assignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==61) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMiniJava.g:4450:3: rule__CompareExp__Other2Assignment_3
            	    {
            	    pushFollow(FOLLOW_41);
            	    rule__CompareExp__Other2Assignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getCompareExpAccess().getOther2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Group__3__Impl"


    // $ANTLR start "rule__JudgeExp__Group__0"
    // InternalMiniJava.g:4459:1: rule__JudgeExp__Group__0 : rule__JudgeExp__Group__0__Impl rule__JudgeExp__Group__1 ;
    public final void rule__JudgeExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4463:1: ( rule__JudgeExp__Group__0__Impl rule__JudgeExp__Group__1 )
            // InternalMiniJava.g:4464:2: rule__JudgeExp__Group__0__Impl rule__JudgeExp__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__JudgeExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JudgeExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__0"


    // $ANTLR start "rule__JudgeExp__Group__0__Impl"
    // InternalMiniJava.g:4471:1: rule__JudgeExp__Group__0__Impl : ( ( '!' )* ) ;
    public final void rule__JudgeExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4475:1: ( ( ( '!' )* ) )
            // InternalMiniJava.g:4476:1: ( ( '!' )* )
            {
            // InternalMiniJava.g:4476:1: ( ( '!' )* )
            // InternalMiniJava.g:4477:2: ( '!' )*
            {
             before(grammarAccess.getJudgeExpAccess().getExclamationMarkKeyword_0()); 
            // InternalMiniJava.g:4478:2: ( '!' )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==17) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMiniJava.g:4478:3: '!'
            	    {
            	    match(input,17,FOLLOW_43); 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getJudgeExpAccess().getExclamationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__0__Impl"


    // $ANTLR start "rule__JudgeExp__Group__1"
    // InternalMiniJava.g:4486:1: rule__JudgeExp__Group__1 : rule__JudgeExp__Group__1__Impl rule__JudgeExp__Group__2 ;
    public final void rule__JudgeExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4490:1: ( rule__JudgeExp__Group__1__Impl rule__JudgeExp__Group__2 )
            // InternalMiniJava.g:4491:2: rule__JudgeExp__Group__1__Impl rule__JudgeExp__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__JudgeExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JudgeExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__1"


    // $ANTLR start "rule__JudgeExp__Group__1__Impl"
    // InternalMiniJava.g:4498:1: rule__JudgeExp__Group__1__Impl : ( ( '(' )* ) ;
    public final void rule__JudgeExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4502:1: ( ( ( '(' )* ) )
            // InternalMiniJava.g:4503:1: ( ( '(' )* )
            {
            // InternalMiniJava.g:4503:1: ( ( '(' )* )
            // InternalMiniJava.g:4504:2: ( '(' )*
            {
             before(grammarAccess.getJudgeExpAccess().getLeftParenthesisKeyword_1()); 
            // InternalMiniJava.g:4505:2: ( '(' )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==45) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMiniJava.g:4505:3: '('
            	    {
            	    match(input,45,FOLLOW_44); 

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getJudgeExpAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__1__Impl"


    // $ANTLR start "rule__JudgeExp__Group__2"
    // InternalMiniJava.g:4513:1: rule__JudgeExp__Group__2 : rule__JudgeExp__Group__2__Impl rule__JudgeExp__Group__3 ;
    public final void rule__JudgeExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4517:1: ( rule__JudgeExp__Group__2__Impl rule__JudgeExp__Group__3 )
            // InternalMiniJava.g:4518:2: rule__JudgeExp__Group__2__Impl rule__JudgeExp__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__JudgeExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JudgeExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__2"


    // $ANTLR start "rule__JudgeExp__Group__2__Impl"
    // InternalMiniJava.g:4525:1: rule__JudgeExp__Group__2__Impl : ( ( rule__JudgeExp__BjAssignment_2 ) ) ;
    public final void rule__JudgeExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4529:1: ( ( ( rule__JudgeExp__BjAssignment_2 ) ) )
            // InternalMiniJava.g:4530:1: ( ( rule__JudgeExp__BjAssignment_2 ) )
            {
            // InternalMiniJava.g:4530:1: ( ( rule__JudgeExp__BjAssignment_2 ) )
            // InternalMiniJava.g:4531:2: ( rule__JudgeExp__BjAssignment_2 )
            {
             before(grammarAccess.getJudgeExpAccess().getBjAssignment_2()); 
            // InternalMiniJava.g:4532:2: ( rule__JudgeExp__BjAssignment_2 )
            // InternalMiniJava.g:4532:3: rule__JudgeExp__BjAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JudgeExp__BjAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJudgeExpAccess().getBjAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__2__Impl"


    // $ANTLR start "rule__JudgeExp__Group__3"
    // InternalMiniJava.g:4540:1: rule__JudgeExp__Group__3 : rule__JudgeExp__Group__3__Impl ;
    public final void rule__JudgeExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4544:1: ( rule__JudgeExp__Group__3__Impl )
            // InternalMiniJava.g:4545:2: rule__JudgeExp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JudgeExp__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__3"


    // $ANTLR start "rule__JudgeExp__Group__3__Impl"
    // InternalMiniJava.g:4551:1: rule__JudgeExp__Group__3__Impl : ( ( ')' )* ) ;
    public final void rule__JudgeExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4555:1: ( ( ( ')' )* ) )
            // InternalMiniJava.g:4556:1: ( ( ')' )* )
            {
            // InternalMiniJava.g:4556:1: ( ( ')' )* )
            // InternalMiniJava.g:4557:2: ( ')' )*
            {
             before(grammarAccess.getJudgeExpAccess().getRightParenthesisKeyword_3()); 
            // InternalMiniJava.g:4558:2: ( ')' )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==49) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==EOF||LA38_2==40||(LA38_2>=47 && LA38_2<=49)||LA38_2==53) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalMiniJava.g:4558:3: ')'
            	    {
            	    match(input,49,FOLLOW_45); 

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getJudgeExpAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__Group__3__Impl"


    // $ANTLR start "rule__NewExp__Group__0"
    // InternalMiniJava.g:4567:1: rule__NewExp__Group__0 : rule__NewExp__Group__0__Impl rule__NewExp__Group__1 ;
    public final void rule__NewExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4571:1: ( rule__NewExp__Group__0__Impl rule__NewExp__Group__1 )
            // InternalMiniJava.g:4572:2: rule__NewExp__Group__0__Impl rule__NewExp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__NewExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__0"


    // $ANTLR start "rule__NewExp__Group__0__Impl"
    // InternalMiniJava.g:4579:1: rule__NewExp__Group__0__Impl : ( 'new' ) ;
    public final void rule__NewExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4583:1: ( ( 'new' ) )
            // InternalMiniJava.g:4584:1: ( 'new' )
            {
            // InternalMiniJava.g:4584:1: ( 'new' )
            // InternalMiniJava.g:4585:2: 'new'
            {
             before(grammarAccess.getNewExpAccess().getNewKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getNewExpAccess().getNewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__0__Impl"


    // $ANTLR start "rule__NewExp__Group__1"
    // InternalMiniJava.g:4594:1: rule__NewExp__Group__1 : rule__NewExp__Group__1__Impl rule__NewExp__Group__2 ;
    public final void rule__NewExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4598:1: ( rule__NewExp__Group__1__Impl rule__NewExp__Group__2 )
            // InternalMiniJava.g:4599:2: rule__NewExp__Group__1__Impl rule__NewExp__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__NewExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__1"


    // $ANTLR start "rule__NewExp__Group__1__Impl"
    // InternalMiniJava.g:4606:1: rule__NewExp__Group__1__Impl : ( ( rule__NewExp__NameAssignment_1 ) ) ;
    public final void rule__NewExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4610:1: ( ( ( rule__NewExp__NameAssignment_1 ) ) )
            // InternalMiniJava.g:4611:1: ( ( rule__NewExp__NameAssignment_1 ) )
            {
            // InternalMiniJava.g:4611:1: ( ( rule__NewExp__NameAssignment_1 ) )
            // InternalMiniJava.g:4612:2: ( rule__NewExp__NameAssignment_1 )
            {
             before(grammarAccess.getNewExpAccess().getNameAssignment_1()); 
            // InternalMiniJava.g:4613:2: ( rule__NewExp__NameAssignment_1 )
            // InternalMiniJava.g:4613:3: rule__NewExp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NewExp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNewExpAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__1__Impl"


    // $ANTLR start "rule__NewExp__Group__2"
    // InternalMiniJava.g:4621:1: rule__NewExp__Group__2 : rule__NewExp__Group__2__Impl rule__NewExp__Group__3 ;
    public final void rule__NewExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4625:1: ( rule__NewExp__Group__2__Impl rule__NewExp__Group__3 )
            // InternalMiniJava.g:4626:2: rule__NewExp__Group__2__Impl rule__NewExp__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__NewExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__2"


    // $ANTLR start "rule__NewExp__Group__2__Impl"
    // InternalMiniJava.g:4633:1: rule__NewExp__Group__2__Impl : ( '(' ) ;
    public final void rule__NewExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4637:1: ( ( '(' ) )
            // InternalMiniJava.g:4638:1: ( '(' )
            {
            // InternalMiniJava.g:4638:1: ( '(' )
            // InternalMiniJava.g:4639:2: '('
            {
             before(grammarAccess.getNewExpAccess().getLeftParenthesisKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getNewExpAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__2__Impl"


    // $ANTLR start "rule__NewExp__Group__3"
    // InternalMiniJava.g:4648:1: rule__NewExp__Group__3 : rule__NewExp__Group__3__Impl rule__NewExp__Group__4 ;
    public final void rule__NewExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4652:1: ( rule__NewExp__Group__3__Impl rule__NewExp__Group__4 )
            // InternalMiniJava.g:4653:2: rule__NewExp__Group__3__Impl rule__NewExp__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__NewExp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NewExp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__3"


    // $ANTLR start "rule__NewExp__Group__3__Impl"
    // InternalMiniJava.g:4660:1: rule__NewExp__Group__3__Impl : ( ( rule__NewExp__ParamsAssignment_3 )* ) ;
    public final void rule__NewExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4664:1: ( ( ( rule__NewExp__ParamsAssignment_3 )* ) )
            // InternalMiniJava.g:4665:1: ( ( rule__NewExp__ParamsAssignment_3 )* )
            {
            // InternalMiniJava.g:4665:1: ( ( rule__NewExp__ParamsAssignment_3 )* )
            // InternalMiniJava.g:4666:2: ( rule__NewExp__ParamsAssignment_3 )*
            {
             before(grammarAccess.getNewExpAccess().getParamsAssignment_3()); 
            // InternalMiniJava.g:4667:2: ( rule__NewExp__ParamsAssignment_3 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_ID||(LA39_0>=11 && LA39_0<=15)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMiniJava.g:4667:3: rule__NewExp__ParamsAssignment_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__NewExp__ParamsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getNewExpAccess().getParamsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__3__Impl"


    // $ANTLR start "rule__NewExp__Group__4"
    // InternalMiniJava.g:4675:1: rule__NewExp__Group__4 : rule__NewExp__Group__4__Impl ;
    public final void rule__NewExp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4679:1: ( rule__NewExp__Group__4__Impl )
            // InternalMiniJava.g:4680:2: rule__NewExp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NewExp__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__4"


    // $ANTLR start "rule__NewExp__Group__4__Impl"
    // InternalMiniJava.g:4686:1: rule__NewExp__Group__4__Impl : ( ')' ) ;
    public final void rule__NewExp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4690:1: ( ( ')' ) )
            // InternalMiniJava.g:4691:1: ( ')' )
            {
            // InternalMiniJava.g:4691:1: ( ')' )
            // InternalMiniJava.g:4692:2: ')'
            {
             before(grammarAccess.getNewExpAccess().getRightParenthesisKeyword_4()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNewExpAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__Group__4__Impl"


    // $ANTLR start "rule__MiniJava__PackageAssignment_0"
    // InternalMiniJava.g:4702:1: rule__MiniJava__PackageAssignment_0 : ( rulePackageDecl ) ;
    public final void rule__MiniJava__PackageAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4706:1: ( ( rulePackageDecl ) )
            // InternalMiniJava.g:4707:2: ( rulePackageDecl )
            {
            // InternalMiniJava.g:4707:2: ( rulePackageDecl )
            // InternalMiniJava.g:4708:3: rulePackageDecl
            {
             before(grammarAccess.getMiniJavaAccess().getPackagePackageDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePackageDecl();

            state._fsp--;

             after(grammarAccess.getMiniJavaAccess().getPackagePackageDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__PackageAssignment_0"


    // $ANTLR start "rule__MiniJava__ImportsAssignment_1"
    // InternalMiniJava.g:4717:1: rule__MiniJava__ImportsAssignment_1 : ( ruleImportDecl ) ;
    public final void rule__MiniJava__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4721:1: ( ( ruleImportDecl ) )
            // InternalMiniJava.g:4722:2: ( ruleImportDecl )
            {
            // InternalMiniJava.g:4722:2: ( ruleImportDecl )
            // InternalMiniJava.g:4723:3: ruleImportDecl
            {
             before(grammarAccess.getMiniJavaAccess().getImportsImportDeclParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImportDecl();

            state._fsp--;

             after(grammarAccess.getMiniJavaAccess().getImportsImportDeclParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__ImportsAssignment_1"


    // $ANTLR start "rule__MiniJava__MainclassAssignment_2"
    // InternalMiniJava.g:4732:1: rule__MiniJava__MainclassAssignment_2 : ( ruleMainClassDecl ) ;
    public final void rule__MiniJava__MainclassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4736:1: ( ( ruleMainClassDecl ) )
            // InternalMiniJava.g:4737:2: ( ruleMainClassDecl )
            {
            // InternalMiniJava.g:4737:2: ( ruleMainClassDecl )
            // InternalMiniJava.g:4738:3: ruleMainClassDecl
            {
             before(grammarAccess.getMiniJavaAccess().getMainclassMainClassDeclParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMainClassDecl();

            state._fsp--;

             after(grammarAccess.getMiniJavaAccess().getMainclassMainClassDeclParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__MainclassAssignment_2"


    // $ANTLR start "rule__MiniJava__ClassesAssignment_3"
    // InternalMiniJava.g:4747:1: rule__MiniJava__ClassesAssignment_3 : ( ruleClassDecl ) ;
    public final void rule__MiniJava__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4751:1: ( ( ruleClassDecl ) )
            // InternalMiniJava.g:4752:2: ( ruleClassDecl )
            {
            // InternalMiniJava.g:4752:2: ( ruleClassDecl )
            // InternalMiniJava.g:4753:3: ruleClassDecl
            {
             before(grammarAccess.getMiniJavaAccess().getClassesClassDeclParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleClassDecl();

            state._fsp--;

             after(grammarAccess.getMiniJavaAccess().getClassesClassDeclParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MiniJava__ClassesAssignment_3"


    // $ANTLR start "rule__PackageDecl__NameAssignment_1"
    // InternalMiniJava.g:4762:1: rule__PackageDecl__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4766:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:4767:2: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:4767:2: ( ruleQualifiedName )
            // InternalMiniJava.g:4768:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDecl__NameAssignment_1"


    // $ANTLR start "rule__ImportDecl__AnchorAssignment_1"
    // InternalMiniJava.g:4777:1: rule__ImportDecl__AnchorAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ImportDecl__AnchorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4781:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:4782:2: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:4782:2: ( ruleQualifiedName )
            // InternalMiniJava.g:4783:3: ruleQualifiedName
            {
             before(grammarAccess.getImportDeclAccess().getAnchorQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getImportDeclAccess().getAnchorQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportDecl__AnchorAssignment_1"


    // $ANTLR start "rule__MainClassDecl__NameAssignment_12"
    // InternalMiniJava.g:4792:1: rule__MainClassDecl__NameAssignment_12 : ( RULE_ID ) ;
    public final void rule__MainClassDecl__NameAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4796:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4797:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4797:2: ( RULE_ID )
            // InternalMiniJava.g:4798:3: RULE_ID
            {
             before(grammarAccess.getMainClassDeclAccess().getNameIDTerminalRuleCall_12_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMainClassDeclAccess().getNameIDTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__NameAssignment_12"


    // $ANTLR start "rule__MainClassDecl__StatementsAssignment_15"
    // InternalMiniJava.g:4807:1: rule__MainClassDecl__StatementsAssignment_15 : ( ruleStatement ) ;
    public final void rule__MainClassDecl__StatementsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4811:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:4812:2: ( ruleStatement )
            {
            // InternalMiniJava.g:4812:2: ( ruleStatement )
            // InternalMiniJava.g:4813:3: ruleStatement
            {
             before(grammarAccess.getMainClassDeclAccess().getStatementsStatementParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMainClassDeclAccess().getStatementsStatementParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MainClassDecl__StatementsAssignment_15"


    // $ANTLR start "rule__ClassDecl__NameAssignment_1"
    // InternalMiniJava.g:4822:1: rule__ClassDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ClassDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4826:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4827:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4827:2: ( RULE_ID )
            // InternalMiniJava.g:4828:3: RULE_ID
            {
             before(grammarAccess.getClassDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getClassDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__NameAssignment_1"


    // $ANTLR start "rule__ClassDecl__SuperClassAssignment_2_1"
    // InternalMiniJava.g:4837:1: rule__ClassDecl__SuperClassAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDecl__SuperClassAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4841:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:4842:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:4842:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:4843:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclAccess().getSuperClassClassDeclCrossReference_2_1_0()); 
            // InternalMiniJava.g:4844:3: ( ruleQualifiedName )
            // InternalMiniJava.g:4845:4: ruleQualifiedName
            {
             before(grammarAccess.getClassDeclAccess().getSuperClassClassDeclQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassDeclAccess().getSuperClassClassDeclQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getClassDeclAccess().getSuperClassClassDeclCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__SuperClassAssignment_2_1"


    // $ANTLR start "rule__ClassDecl__ImplementzAssignment_3_1"
    // InternalMiniJava.g:4856:1: rule__ClassDecl__ImplementzAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassDecl__ImplementzAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4860:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMiniJava.g:4861:2: ( ( ruleQualifiedName ) )
            {
            // InternalMiniJava.g:4861:2: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:4862:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassDeclAccess().getImplementzClassDeclCrossReference_3_1_0()); 
            // InternalMiniJava.g:4863:3: ( ruleQualifiedName )
            // InternalMiniJava.g:4864:4: ruleQualifiedName
            {
             before(grammarAccess.getClassDeclAccess().getImplementzClassDeclQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassDeclAccess().getImplementzClassDeclQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getClassDeclAccess().getImplementzClassDeclCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__ImplementzAssignment_3_1"


    // $ANTLR start "rule__ClassDecl__MembersAssignment_5"
    // InternalMiniJava.g:4875:1: rule__ClassDecl__MembersAssignment_5 : ( ruleMember ) ;
    public final void rule__ClassDecl__MembersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4879:1: ( ( ruleMember ) )
            // InternalMiniJava.g:4880:2: ( ruleMember )
            {
            // InternalMiniJava.g:4880:2: ( ruleMember )
            // InternalMiniJava.g:4881:3: ruleMember
            {
             before(grammarAccess.getClassDeclAccess().getMembersMemberParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getClassDeclAccess().getMembersMemberParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassDecl__MembersAssignment_5"


    // $ANTLR start "rule__VariableDecl__VarTypeAssignment_0"
    // InternalMiniJava.g:4890:1: rule__VariableDecl__VarTypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__VariableDecl__VarTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4894:1: ( ( ruleDataType ) )
            // InternalMiniJava.g:4895:2: ( ruleDataType )
            {
            // InternalMiniJava.g:4895:2: ( ruleDataType )
            // InternalMiniJava.g:4896:3: ruleDataType
            {
             before(grammarAccess.getVariableDeclAccess().getVarTypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getVariableDeclAccess().getVarTypeDataTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__VarTypeAssignment_0"


    // $ANTLR start "rule__VariableDecl__NameAssignment_1"
    // InternalMiniJava.g:4905:1: rule__VariableDecl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDecl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4909:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4910:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4910:2: ( RULE_ID )
            // InternalMiniJava.g:4911:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__NameAssignment_1"


    // $ANTLR start "rule__VariableDecl__ValueAssignment_3"
    // InternalMiniJava.g:4920:1: rule__VariableDecl__ValueAssignment_3 : ( ruleConstantValue ) ;
    public final void rule__VariableDecl__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4924:1: ( ( ruleConstantValue ) )
            // InternalMiniJava.g:4925:2: ( ruleConstantValue )
            {
            // InternalMiniJava.g:4925:2: ( ruleConstantValue )
            // InternalMiniJava.g:4926:3: ruleConstantValue
            {
             before(grammarAccess.getVariableDeclAccess().getValueConstantValueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstantValue();

            state._fsp--;

             after(grammarAccess.getVariableDeclAccess().getValueConstantValueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDecl__ValueAssignment_3"


    // $ANTLR start "rule__Parameter__TypeAssignment_0"
    // InternalMiniJava.g:4935:1: rule__Parameter__TypeAssignment_0 : ( ruleDataType ) ;
    public final void rule__Parameter__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4939:1: ( ( ruleDataType ) )
            // InternalMiniJava.g:4940:2: ( ruleDataType )
            {
            // InternalMiniJava.g:4940:2: ( ruleDataType )
            // InternalMiniJava.g:4941:3: ruleDataType
            {
             before(grammarAccess.getParameterAccess().getTypeDataTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getTypeDataTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__TypeAssignment_0"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalMiniJava.g:4950:1: rule__Parameter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4954:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:4955:2: ( RULE_ID )
            {
            // InternalMiniJava.g:4955:2: ( RULE_ID )
            // InternalMiniJava.g:4956:3: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__MethodDecl__DomainAssignment_0"
    // InternalMiniJava.g:4965:1: rule__MethodDecl__DomainAssignment_0 : ( ruleDomain ) ;
    public final void rule__MethodDecl__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4969:1: ( ( ruleDomain ) )
            // InternalMiniJava.g:4970:2: ( ruleDomain )
            {
            // InternalMiniJava.g:4970:2: ( ruleDomain )
            // InternalMiniJava.g:4971:3: ruleDomain
            {
             before(grammarAccess.getMethodDeclAccess().getDomainDomainEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getMethodDeclAccess().getDomainDomainEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__DomainAssignment_0"


    // $ANTLR start "rule__MethodDecl__ExtraAssignment_1"
    // InternalMiniJava.g:4980:1: rule__MethodDecl__ExtraAssignment_1 : ( ruleExtraAttr ) ;
    public final void rule__MethodDecl__ExtraAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4984:1: ( ( ruleExtraAttr ) )
            // InternalMiniJava.g:4985:2: ( ruleExtraAttr )
            {
            // InternalMiniJava.g:4985:2: ( ruleExtraAttr )
            // InternalMiniJava.g:4986:3: ruleExtraAttr
            {
             before(grammarAccess.getMethodDeclAccess().getExtraExtraAttrEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExtraAttr();

            state._fsp--;

             after(grammarAccess.getMethodDeclAccess().getExtraExtraAttrEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__ExtraAssignment_1"


    // $ANTLR start "rule__MethodDecl__RetTypeAssignment_2"
    // InternalMiniJava.g:4995:1: rule__MethodDecl__RetTypeAssignment_2 : ( ruleReturnType ) ;
    public final void rule__MethodDecl__RetTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:4999:1: ( ( ruleReturnType ) )
            // InternalMiniJava.g:5000:2: ( ruleReturnType )
            {
            // InternalMiniJava.g:5000:2: ( ruleReturnType )
            // InternalMiniJava.g:5001:3: ruleReturnType
            {
             before(grammarAccess.getMethodDeclAccess().getRetTypeReturnTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnType();

            state._fsp--;

             after(grammarAccess.getMethodDeclAccess().getRetTypeReturnTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__RetTypeAssignment_2"


    // $ANTLR start "rule__MethodDecl__NameAssignment_3"
    // InternalMiniJava.g:5010:1: rule__MethodDecl__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__MethodDecl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5014:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:5015:2: ( RULE_ID )
            {
            // InternalMiniJava.g:5015:2: ( RULE_ID )
            // InternalMiniJava.g:5016:3: RULE_ID
            {
             before(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodDeclAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__NameAssignment_3"


    // $ANTLR start "rule__MethodDecl__ParamsAssignment_5"
    // InternalMiniJava.g:5025:1: rule__MethodDecl__ParamsAssignment_5 : ( ruleParameter ) ;
    public final void rule__MethodDecl__ParamsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5029:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:5030:2: ( ruleParameter )
            {
            // InternalMiniJava.g:5030:2: ( ruleParameter )
            // InternalMiniJava.g:5031:3: ruleParameter
            {
             before(grammarAccess.getMethodDeclAccess().getParamsParameterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getMethodDeclAccess().getParamsParameterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__ParamsAssignment_5"


    // $ANTLR start "rule__MethodDecl__StatementsAssignment_8"
    // InternalMiniJava.g:5040:1: rule__MethodDecl__StatementsAssignment_8 : ( ruleStatement ) ;
    public final void rule__MethodDecl__StatementsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5044:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:5045:2: ( ruleStatement )
            {
            // InternalMiniJava.g:5045:2: ( ruleStatement )
            // InternalMiniJava.g:5046:3: ruleStatement
            {
             before(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getMethodDeclAccess().getStatementsStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodDecl__StatementsAssignment_8"


    // $ANTLR start "rule__Statement__VarDefAssignment_0"
    // InternalMiniJava.g:5055:1: rule__Statement__VarDefAssignment_0 : ( ruleVariableDecl ) ;
    public final void rule__Statement__VarDefAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5059:1: ( ( ruleVariableDecl ) )
            // InternalMiniJava.g:5060:2: ( ruleVariableDecl )
            {
            // InternalMiniJava.g:5060:2: ( ruleVariableDecl )
            // InternalMiniJava.g:5061:3: ruleVariableDecl
            {
             before(grammarAccess.getStatementAccess().getVarDefVariableDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDecl();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getVarDefVariableDeclParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__VarDefAssignment_0"


    // $ANTLR start "rule__Statement__AssignAssignment_1"
    // InternalMiniJava.g:5070:1: rule__Statement__AssignAssignment_1 : ( ruleAssignments ) ;
    public final void rule__Statement__AssignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5074:1: ( ( ruleAssignments ) )
            // InternalMiniJava.g:5075:2: ( ruleAssignments )
            {
            // InternalMiniJava.g:5075:2: ( ruleAssignments )
            // InternalMiniJava.g:5076:3: ruleAssignments
            {
             before(grammarAccess.getStatementAccess().getAssignAssignmentsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignments();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getAssignAssignmentsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__AssignAssignment_1"


    // $ANTLR start "rule__Statement__IfStatAssignment_2"
    // InternalMiniJava.g:5085:1: rule__Statement__IfStatAssignment_2 : ( ruleIfStatements ) ;
    public final void rule__Statement__IfStatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5089:1: ( ( ruleIfStatements ) )
            // InternalMiniJava.g:5090:2: ( ruleIfStatements )
            {
            // InternalMiniJava.g:5090:2: ( ruleIfStatements )
            // InternalMiniJava.g:5091:3: ruleIfStatements
            {
             before(grammarAccess.getStatementAccess().getIfStatIfStatementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleIfStatements();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getIfStatIfStatementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__IfStatAssignment_2"


    // $ANTLR start "rule__Statement__WhileStatAssignment_3"
    // InternalMiniJava.g:5100:1: rule__Statement__WhileStatAssignment_3 : ( ruleWhileStatements ) ;
    public final void rule__Statement__WhileStatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5104:1: ( ( ruleWhileStatements ) )
            // InternalMiniJava.g:5105:2: ( ruleWhileStatements )
            {
            // InternalMiniJava.g:5105:2: ( ruleWhileStatements )
            // InternalMiniJava.g:5106:3: ruleWhileStatements
            {
             before(grammarAccess.getStatementAccess().getWhileStatWhileStatementsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhileStatements();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getWhileStatWhileStatementsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__WhileStatAssignment_3"


    // $ANTLR start "rule__Statement__RetStatAssignment_4"
    // InternalMiniJava.g:5115:1: rule__Statement__RetStatAssignment_4 : ( ruleReturnStatements ) ;
    public final void rule__Statement__RetStatAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5119:1: ( ( ruleReturnStatements ) )
            // InternalMiniJava.g:5120:2: ( ruleReturnStatements )
            {
            // InternalMiniJava.g:5120:2: ( ruleReturnStatements )
            // InternalMiniJava.g:5121:3: ruleReturnStatements
            {
             before(grammarAccess.getStatementAccess().getRetStatReturnStatementsParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReturnStatements();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getRetStatReturnStatementsParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__RetStatAssignment_4"


    // $ANTLR start "rule__LValueExp__IdAssignment_0"
    // InternalMiniJava.g:5130:1: rule__LValueExp__IdAssignment_0 : ( RULE_ID ) ;
    public final void rule__LValueExp__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5134:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:5135:2: ( RULE_ID )
            {
            // InternalMiniJava.g:5135:2: ( RULE_ID )
            // InternalMiniJava.g:5136:3: RULE_ID
            {
             before(grammarAccess.getLValueExpAccess().getIdIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLValueExpAccess().getIdIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__IdAssignment_0"


    // $ANTLR start "rule__LValueExp__ExpAssignment_1_0"
    // InternalMiniJava.g:5145:1: rule__LValueExp__ExpAssignment_1_0 : ( ruleExpression ) ;
    public final void rule__LValueExp__ExpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5149:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5150:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5150:2: ( ruleExpression )
            // InternalMiniJava.g:5151:3: ruleExpression
            {
             before(grammarAccess.getLValueExpAccess().getExpExpressionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLValueExpAccess().getExpExpressionParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__ExpAssignment_1_0"


    // $ANTLR start "rule__LValueExp__IdAssignment_1_2"
    // InternalMiniJava.g:5160:1: rule__LValueExp__IdAssignment_1_2 : ( ruleQualifiedName ) ;
    public final void rule__LValueExp__IdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5164:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:5165:2: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:5165:2: ( ruleQualifiedName )
            // InternalMiniJava.g:5166:3: ruleQualifiedName
            {
             before(grammarAccess.getLValueExpAccess().getIdQualifiedNameParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLValueExpAccess().getIdQualifiedNameParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__IdAssignment_1_2"


    // $ANTLR start "rule__LValueExp__ExpAssignment_2_0"
    // InternalMiniJava.g:5175:1: rule__LValueExp__ExpAssignment_2_0 : ( ruleExpression ) ;
    public final void rule__LValueExp__ExpAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5179:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5180:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5180:2: ( ruleExpression )
            // InternalMiniJava.g:5181:3: ruleExpression
            {
             before(grammarAccess.getLValueExpAccess().getExpExpressionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLValueExpAccess().getExpExpressionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__ExpAssignment_2_0"


    // $ANTLR start "rule__LValueExp__IndexAssignment_2_2"
    // InternalMiniJava.g:5190:1: rule__LValueExp__IndexAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__LValueExp__IndexAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5194:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5195:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5195:2: ( ruleExpression )
            // InternalMiniJava.g:5196:3: ruleExpression
            {
             before(grammarAccess.getLValueExpAccess().getIndexExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLValueExpAccess().getIndexExpressionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LValueExp__IndexAssignment_2_2"


    // $ANTLR start "rule__Assignments__LeftValueAssignment_0"
    // InternalMiniJava.g:5205:1: rule__Assignments__LeftValueAssignment_0 : ( ruleLValueExp ) ;
    public final void rule__Assignments__LeftValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5209:1: ( ( ruleLValueExp ) )
            // InternalMiniJava.g:5210:2: ( ruleLValueExp )
            {
            // InternalMiniJava.g:5210:2: ( ruleLValueExp )
            // InternalMiniJava.g:5211:3: ruleLValueExp
            {
             before(grammarAccess.getAssignmentsAccess().getLeftValueLValueExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLValueExp();

            state._fsp--;

             after(grammarAccess.getAssignmentsAccess().getLeftValueLValueExpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__LeftValueAssignment_0"


    // $ANTLR start "rule__Assignments__ExpressionAssignment_2"
    // InternalMiniJava.g:5220:1: rule__Assignments__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignments__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5224:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5225:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5225:2: ( ruleExpression )
            // InternalMiniJava.g:5226:3: ruleExpression
            {
             before(grammarAccess.getAssignmentsAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentsAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignments__ExpressionAssignment_2"


    // $ANTLR start "rule__IfStatements__StatementsAssignment_5"
    // InternalMiniJava.g:5235:1: rule__IfStatements__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__IfStatements__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5239:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:5240:2: ( ruleStatement )
            {
            // InternalMiniJava.g:5240:2: ( ruleStatement )
            // InternalMiniJava.g:5241:3: ruleStatement
            {
             before(grammarAccess.getIfStatementsAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementsAccess().getStatementsStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__StatementsAssignment_5"


    // $ANTLR start "rule__IfStatements__ElseIfAssignment_7"
    // InternalMiniJava.g:5250:1: rule__IfStatements__ElseIfAssignment_7 : ( ruleElseIfStatements ) ;
    public final void rule__IfStatements__ElseIfAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5254:1: ( ( ruleElseIfStatements ) )
            // InternalMiniJava.g:5255:2: ( ruleElseIfStatements )
            {
            // InternalMiniJava.g:5255:2: ( ruleElseIfStatements )
            // InternalMiniJava.g:5256:3: ruleElseIfStatements
            {
             before(grammarAccess.getIfStatementsAccess().getElseIfElseIfStatementsParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleElseIfStatements();

            state._fsp--;

             after(grammarAccess.getIfStatementsAccess().getElseIfElseIfStatementsParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__ElseIfAssignment_7"


    // $ANTLR start "rule__IfStatements__ElseAssignment_8"
    // InternalMiniJava.g:5265:1: rule__IfStatements__ElseAssignment_8 : ( ruleElseStatement ) ;
    public final void rule__IfStatements__ElseAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5269:1: ( ( ruleElseStatement ) )
            // InternalMiniJava.g:5270:2: ( ruleElseStatement )
            {
            // InternalMiniJava.g:5270:2: ( ruleElseStatement )
            // InternalMiniJava.g:5271:3: ruleElseStatement
            {
             before(grammarAccess.getIfStatementsAccess().getElseElseStatementParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleElseStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementsAccess().getElseElseStatementParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatements__ElseAssignment_8"


    // $ANTLR start "rule__ElseIfStatements__StatementsAssignment_6"
    // InternalMiniJava.g:5280:1: rule__ElseIfStatements__StatementsAssignment_6 : ( ruleStatement ) ;
    public final void rule__ElseIfStatements__StatementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5284:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:5285:2: ( ruleStatement )
            {
            // InternalMiniJava.g:5285:2: ( ruleStatement )
            // InternalMiniJava.g:5286:3: ruleStatement
            {
             before(grammarAccess.getElseIfStatementsAccess().getStatementsStatementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getElseIfStatementsAccess().getStatementsStatementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatements__StatementsAssignment_6"


    // $ANTLR start "rule__ElseStatement__StatementsAssignment_3"
    // InternalMiniJava.g:5295:1: rule__ElseStatement__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__ElseStatement__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5299:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:5300:2: ( ruleStatement )
            {
            // InternalMiniJava.g:5300:2: ( ruleStatement )
            // InternalMiniJava.g:5301:3: ruleStatement
            {
             before(grammarAccess.getElseStatementAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getElseStatementAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseStatement__StatementsAssignment_3"


    // $ANTLR start "rule__WhileStatements__StatementsAssignment_5"
    // InternalMiniJava.g:5310:1: rule__WhileStatements__StatementsAssignment_5 : ( ruleStatement ) ;
    public final void rule__WhileStatements__StatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5314:1: ( ( ruleStatement ) )
            // InternalMiniJava.g:5315:2: ( ruleStatement )
            {
            // InternalMiniJava.g:5315:2: ( ruleStatement )
            // InternalMiniJava.g:5316:3: ruleStatement
            {
             before(grammarAccess.getWhileStatementsAccess().getStatementsStatementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getWhileStatementsAccess().getStatementsStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileStatements__StatementsAssignment_5"


    // $ANTLR start "rule__ReturnStatements__ExpAssignment_1"
    // InternalMiniJava.g:5325:1: rule__ReturnStatements__ExpAssignment_1 : ( ruleExpression ) ;
    public final void rule__ReturnStatements__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5329:1: ( ( ruleExpression ) )
            // InternalMiniJava.g:5330:2: ( ruleExpression )
            {
            // InternalMiniJava.g:5330:2: ( ruleExpression )
            // InternalMiniJava.g:5331:3: ruleExpression
            {
             before(grammarAccess.getReturnStatementsAccess().getExpExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getReturnStatementsAccess().getExpExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatements__ExpAssignment_1"


    // $ANTLR start "rule__CalcExp__LeftNameAssignment_0"
    // InternalMiniJava.g:5340:1: rule__CalcExp__LeftNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__CalcExp__LeftNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5344:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:5345:2: ( RULE_ID )
            {
            // InternalMiniJava.g:5345:2: ( RULE_ID )
            // InternalMiniJava.g:5346:3: RULE_ID
            {
             before(grammarAccess.getCalcExpAccess().getLeftNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalcExpAccess().getLeftNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__LeftNameAssignment_0"


    // $ANTLR start "rule__CalcExp__LeftNumAssignment_1_0"
    // InternalMiniJava.g:5355:1: rule__CalcExp__LeftNumAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__CalcExp__LeftNumAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5359:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:5360:2: ( RULE_INT )
            {
            // InternalMiniJava.g:5360:2: ( RULE_INT )
            // InternalMiniJava.g:5361:3: RULE_INT
            {
             before(grammarAccess.getCalcExpAccess().getLeftNumINTTerminalRuleCall_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCalcExpAccess().getLeftNumINTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__LeftNumAssignment_1_0"


    // $ANTLR start "rule__CalcExp__OpAssignment_1_1"
    // InternalMiniJava.g:5370:1: rule__CalcExp__OpAssignment_1_1 : ( ruleOperator ) ;
    public final void rule__CalcExp__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5374:1: ( ( ruleOperator ) )
            // InternalMiniJava.g:5375:2: ( ruleOperator )
            {
            // InternalMiniJava.g:5375:2: ( ruleOperator )
            // InternalMiniJava.g:5376:3: ruleOperator
            {
             before(grammarAccess.getCalcExpAccess().getOpOperatorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getCalcExpAccess().getOpOperatorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__OpAssignment_1_1"


    // $ANTLR start "rule__CalcExp__RightNameAssignment_1_2"
    // InternalMiniJava.g:5385:1: rule__CalcExp__RightNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__CalcExp__RightNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5389:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:5390:2: ( RULE_ID )
            {
            // InternalMiniJava.g:5390:2: ( RULE_ID )
            // InternalMiniJava.g:5391:3: RULE_ID
            {
             before(grammarAccess.getCalcExpAccess().getRightNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCalcExpAccess().getRightNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__RightNameAssignment_1_2"


    // $ANTLR start "rule__CalcExp__RightNumAssignment_2"
    // InternalMiniJava.g:5400:1: rule__CalcExp__RightNumAssignment_2 : ( RULE_INT ) ;
    public final void rule__CalcExp__RightNumAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5404:1: ( ( RULE_INT ) )
            // InternalMiniJava.g:5405:2: ( RULE_INT )
            {
            // InternalMiniJava.g:5405:2: ( RULE_INT )
            // InternalMiniJava.g:5406:3: RULE_INT
            {
             before(grammarAccess.getCalcExpAccess().getRightNumINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCalcExpAccess().getRightNumINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CalcExp__RightNumAssignment_2"


    // $ANTLR start "rule__CompareExp__IdAssignment_0"
    // InternalMiniJava.g:5415:1: rule__CompareExp__IdAssignment_0 : ( ruleQualifiedName ) ;
    public final void rule__CompareExp__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5419:1: ( ( ruleQualifiedName ) )
            // InternalMiniJava.g:5420:2: ( ruleQualifiedName )
            {
            // InternalMiniJava.g:5420:2: ( ruleQualifiedName )
            // InternalMiniJava.g:5421:3: ruleQualifiedName
            {
             before(grammarAccess.getCompareExpAccess().getIdQualifiedNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompareExpAccess().getIdQualifiedNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__IdAssignment_0"


    // $ANTLR start "rule__CompareExp__OpAssignment_1"
    // InternalMiniJava.g:5430:1: rule__CompareExp__OpAssignment_1 : ( ruleOperator ) ;
    public final void rule__CompareExp__OpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5434:1: ( ( ruleOperator ) )
            // InternalMiniJava.g:5435:2: ( ruleOperator )
            {
            // InternalMiniJava.g:5435:2: ( ruleOperator )
            // InternalMiniJava.g:5436:3: ruleOperator
            {
             before(grammarAccess.getCompareExpAccess().getOpOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getCompareExpAccess().getOpOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__OpAssignment_1"


    // $ANTLR start "rule__CompareExp__Other1Assignment_2"
    // InternalMiniJava.g:5445:1: rule__CompareExp__Other1Assignment_2 : ( RULE_ID ) ;
    public final void rule__CompareExp__Other1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5449:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:5450:2: ( RULE_ID )
            {
            // InternalMiniJava.g:5450:2: ( RULE_ID )
            // InternalMiniJava.g:5451:3: RULE_ID
            {
             before(grammarAccess.getCompareExpAccess().getOther1IDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompareExpAccess().getOther1IDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Other1Assignment_2"


    // $ANTLR start "rule__CompareExp__Other2Assignment_3"
    // InternalMiniJava.g:5460:1: rule__CompareExp__Other2Assignment_3 : ( ( 'null' ) ) ;
    public final void rule__CompareExp__Other2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5464:1: ( ( ( 'null' ) ) )
            // InternalMiniJava.g:5465:2: ( ( 'null' ) )
            {
            // InternalMiniJava.g:5465:2: ( ( 'null' ) )
            // InternalMiniJava.g:5466:3: ( 'null' )
            {
             before(grammarAccess.getCompareExpAccess().getOther2NullKeyword_3_0()); 
            // InternalMiniJava.g:5467:3: ( 'null' )
            // InternalMiniJava.g:5468:4: 'null'
            {
             before(grammarAccess.getCompareExpAccess().getOther2NullKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCompareExpAccess().getOther2NullKeyword_3_0()); 

            }

             after(grammarAccess.getCompareExpAccess().getOther2NullKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompareExp__Other2Assignment_3"


    // $ANTLR start "rule__BasicJudge__BEAssignment_0"
    // InternalMiniJava.g:5479:1: rule__BasicJudge__BEAssignment_0 : ( ruleBooleanExp ) ;
    public final void rule__BasicJudge__BEAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5483:1: ( ( ruleBooleanExp ) )
            // InternalMiniJava.g:5484:2: ( ruleBooleanExp )
            {
            // InternalMiniJava.g:5484:2: ( ruleBooleanExp )
            // InternalMiniJava.g:5485:3: ruleBooleanExp
            {
             before(grammarAccess.getBasicJudgeAccess().getBEBooleanExpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanExp();

            state._fsp--;

             after(grammarAccess.getBasicJudgeAccess().getBEBooleanExpEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJudge__BEAssignment_0"


    // $ANTLR start "rule__BasicJudge__CmpAssignment_1"
    // InternalMiniJava.g:5494:1: rule__BasicJudge__CmpAssignment_1 : ( ruleCompareExp ) ;
    public final void rule__BasicJudge__CmpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5498:1: ( ( ruleCompareExp ) )
            // InternalMiniJava.g:5499:2: ( ruleCompareExp )
            {
            // InternalMiniJava.g:5499:2: ( ruleCompareExp )
            // InternalMiniJava.g:5500:3: ruleCompareExp
            {
             before(grammarAccess.getBasicJudgeAccess().getCmpCompareExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompareExp();

            state._fsp--;

             after(grammarAccess.getBasicJudgeAccess().getCmpCompareExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicJudge__CmpAssignment_1"


    // $ANTLR start "rule__JudgeExp__BjAssignment_2"
    // InternalMiniJava.g:5509:1: rule__JudgeExp__BjAssignment_2 : ( ruleBasicJudge ) ;
    public final void rule__JudgeExp__BjAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5513:1: ( ( ruleBasicJudge ) )
            // InternalMiniJava.g:5514:2: ( ruleBasicJudge )
            {
            // InternalMiniJava.g:5514:2: ( ruleBasicJudge )
            // InternalMiniJava.g:5515:3: ruleBasicJudge
            {
             before(grammarAccess.getJudgeExpAccess().getBjBasicJudgeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicJudge();

            state._fsp--;

             after(grammarAccess.getJudgeExpAccess().getBjBasicJudgeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JudgeExp__BjAssignment_2"


    // $ANTLR start "rule__NewExp__NameAssignment_1"
    // InternalMiniJava.g:5524:1: rule__NewExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NewExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5528:1: ( ( RULE_ID ) )
            // InternalMiniJava.g:5529:2: ( RULE_ID )
            {
            // InternalMiniJava.g:5529:2: ( RULE_ID )
            // InternalMiniJava.g:5530:3: RULE_ID
            {
             before(grammarAccess.getNewExpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNewExpAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__NameAssignment_1"


    // $ANTLR start "rule__NewExp__ParamsAssignment_3"
    // InternalMiniJava.g:5539:1: rule__NewExp__ParamsAssignment_3 : ( ruleParameter ) ;
    public final void rule__NewExp__ParamsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5543:1: ( ( ruleParameter ) )
            // InternalMiniJava.g:5544:2: ( ruleParameter )
            {
            // InternalMiniJava.g:5544:2: ( ruleParameter )
            // InternalMiniJava.g:5545:3: ruleParameter
            {
             before(grammarAccess.getNewExpAccess().getParamsParameterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getNewExpAccess().getParamsParameterParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NewExp__ParamsAssignment_3"


    // $ANTLR start "rule__Expression__ConstAssignment_0"
    // InternalMiniJava.g:5554:1: rule__Expression__ConstAssignment_0 : ( ruleConstantValue ) ;
    public final void rule__Expression__ConstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5558:1: ( ( ruleConstantValue ) )
            // InternalMiniJava.g:5559:2: ( ruleConstantValue )
            {
            // InternalMiniJava.g:5559:2: ( ruleConstantValue )
            // InternalMiniJava.g:5560:3: ruleConstantValue
            {
             before(grammarAccess.getExpressionAccess().getConstConstantValueParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstantValue();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getConstConstantValueParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ConstAssignment_0"


    // $ANTLR start "rule__Expression__CeAssignment_1"
    // InternalMiniJava.g:5569:1: rule__Expression__CeAssignment_1 : ( ruleCalcExp ) ;
    public final void rule__Expression__CeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5573:1: ( ( ruleCalcExp ) )
            // InternalMiniJava.g:5574:2: ( ruleCalcExp )
            {
            // InternalMiniJava.g:5574:2: ( ruleCalcExp )
            // InternalMiniJava.g:5575:3: ruleCalcExp
            {
             before(grammarAccess.getExpressionAccess().getCeCalcExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalcExp();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getCeCalcExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CeAssignment_1"


    // $ANTLR start "rule__Expression__JeAssignment_2"
    // InternalMiniJava.g:5584:1: rule__Expression__JeAssignment_2 : ( ruleJudgeExp ) ;
    public final void rule__Expression__JeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5588:1: ( ( ruleJudgeExp ) )
            // InternalMiniJava.g:5589:2: ( ruleJudgeExp )
            {
            // InternalMiniJava.g:5589:2: ( ruleJudgeExp )
            // InternalMiniJava.g:5590:3: ruleJudgeExp
            {
             before(grammarAccess.getExpressionAccess().getJeJudgeExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJudgeExp();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getJeJudgeExpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__JeAssignment_2"


    // $ANTLR start "rule__Expression__NeAssignment_3"
    // InternalMiniJava.g:5599:1: rule__Expression__NeAssignment_3 : ( ruleNewExp ) ;
    public final void rule__Expression__NeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMiniJava.g:5603:1: ( ( ruleNewExp ) )
            // InternalMiniJava.g:5604:2: ( ruleNewExp )
            {
            // InternalMiniJava.g:5604:2: ( ruleNewExp )
            // InternalMiniJava.g:5605:3: ruleNewExp
            {
             before(grammarAccess.getExpressionAccess().getNeNewExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNewExp();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getNeNewExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__NeAssignment_3"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\6\4\uffff\4\6";
    static final String dfa_3s = "\1\74\1\uffff\1\66\4\uffff\1\6\1\66\1\6\1\66";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\4\uffff";
    static final String dfa_5s = "\13\uffff}>";
    static final String[] dfa_6s = {
            "\2\3\1\2\4\uffff\5\1\1\uffff\1\3\23\uffff\2\3\6\uffff\1\3\12\uffff\1\4\1\uffff\1\5\1\6\1\3",
            "",
            "\1\1\12\uffff\17\3\17\uffff\1\3\5\uffff\1\7\1\3",
            "",
            "",
            "",
            "",
            "\1\10",
            "\1\1\12\uffff\17\3\25\uffff\1\11\1\3",
            "\1\12",
            "\1\1\12\uffff\17\3\25\uffff\1\11\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "985:1: rule__Statement__Alternatives : ( ( ( rule__Statement__VarDefAssignment_0 ) ) | ( ( rule__Statement__AssignAssignment_1 ) ) | ( ( rule__Statement__IfStatAssignment_2 ) ) | ( ( rule__Statement__WhileStatAssignment_3 ) ) | ( ( rule__Statement__RetStatAssignment_4 ) ) );";
        }
    }
    static final String dfa_7s = "\106\uffff";
    static final String dfa_8s = "\1\uffff\1\32\55\uffff\1\33\17\uffff\1\33\6\uffff";
    static final String dfa_9s = "\1\4\1\21\1\57\1\21\2\6\2\57\21\6\3\uffff\1\5\17\6\1\21\1\57\1\55\1\21\1\6\3\57\3\6\1\21\6\6\1\57\1\21\1\60\5\6";
    static final String dfa_10s = "\1\74\1\66\2\65\2\55\2\65\2\6\17\75\3\uffff\20\6\2\65\1\55\1\66\2\75\2\65\1\6\1\61\1\6\1\65\5\57\2\65\1\66\1\60\1\67\2\6\1\61\1\65";
    static final String dfa_11s = "\31\uffff\1\3\1\1\1\2\52\uffff";
    static final String dfa_12s = "\106\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\1\3\1\1\12\uffff\1\4\23\uffff\1\6\1\7\6\uffff\1\5\16\uffff\1\10",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\17\uffff\1\31\5\uffff\1\11\1\32",
            "\1\31\5\uffff\1\33",
            "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\17\uffff\1\31\5\uffff\1\34",
            "\1\54\12\uffff\1\4\23\uffff\1\6\1\7\6\uffff\1\5",
            "\1\54\36\uffff\1\6\1\7\6\uffff\1\5",
            "\1\31\1\uffff\1\55\3\uffff\1\33",
            "\1\31\1\uffff\1\55\3\uffff\1\33",
            "\1\56",
            "\1\57",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "",
            "",
            "",
            "\1\62\1\33",
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
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\25\uffff\1\64",
            "\1\31\1\uffff\1\55\3\uffff\1\33",
            "\1\65",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\25\uffff\1\66\1\33",
            "\1\60\50\uffff\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\31\1\uffff\1\55\3\uffff\1\33\7\uffff\1\61",
            "\1\31\5\uffff\1\33",
            "\1\31\5\uffff\1\33",
            "\1\67",
            "\1\75\4\uffff\1\70\1\71\1\72\1\73\1\74\41\uffff\1\76",
            "\1\77",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\25\uffff\1\64",
            "\1\101\50\uffff\1\100",
            "\1\101\50\uffff\1\100",
            "\1\101\50\uffff\1\100",
            "\1\101\50\uffff\1\100",
            "\1\101\50\uffff\1\100",
            "\1\101\56\uffff\1\102",
            "\1\31\5\uffff\1\33",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\25\uffff\1\66\1\33",
            "\1\103",
            "\1\75\4\uffff\1\70\1\71\1\72\1\73\1\74\41\uffff\1\76\5\uffff\1\104",
            "\1\105",
            "\1\101",
            "\1\75\4\uffff\1\70\1\71\1\72\1\73\1\74\41\uffff\1\76",
            "\1\101\56\uffff\1\102"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1024:1: rule__LValueExp__Alternatives : ( ( ( rule__LValueExp__IdAssignment_0 ) ) | ( ( rule__LValueExp__Group_1__0 ) ) | ( ( rule__LValueExp__Group_2__0 ) ) );";
        }
    }
    static final String dfa_14s = "\3\uffff\1\7\4\uffff\1\7\1\uffff\1\7";
    static final String dfa_15s = "\1\4\2\uffff\1\21\2\uffff\1\6\1\uffff\1\21\1\6\1\21";
    static final String dfa_16s = "\1\74\2\uffff\1\65\2\uffff\1\6\1\uffff\1\66\1\6\1\66";
    static final String dfa_17s = "\1\uffff\2\1\1\uffff\1\3\1\4\1\uffff\1\2\3\uffff";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\3\12\uffff\1\4\23\uffff\2\4\6\uffff\1\4\16\uffff\1\5",
            "",
            "",
            "\17\4\10\uffff\1\7\6\uffff\3\7\3\uffff\1\6",
            "",
            "",
            "\1\10",
            "",
            "\17\4\25\uffff\1\11\1\7",
            "\1\12",
            "\17\4\25\uffff\1\11\1\7"
    };
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_5;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1198:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ConstAssignment_0 ) ) | ( ( rule__Expression__CeAssignment_1 ) ) | ( ( rule__Expression__JeAssignment_2 ) ) | ( ( rule__Expression__NeAssignment_3 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1D0420600002F870L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1D0020600002F872L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0018080000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000400070000F840L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000070000F842L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0040010000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000180001F840L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000200000000F840L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000000F842L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000206000020070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000FFFE0000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000206000020040L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000002L});

}