// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g 2017-03-03 17:26:07

	package Languages.scheme;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class SchemeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASS_DECL", "NEGATION", "CONST_ASSIGN", "TYPE_ASSIGN", "VAR_SECTION", "TVAR_SECTION", "FIELD_DECL", "QUAL_ACCESS", "PARAM_VAR", "PARAM_CONST", "PARAM_OUT", "ARRAY_ACCESS", "PROC_CALL", "PROCEDURE_BODY", "PROGRAM_BODY", "VAR_DECL_ASSIGN", "PROG_IMPORT", "RECORD_HELPER", "LAB_STAT", "CLASS_HELPER", "CLASS_OF", "CLASS_ABSTRACT", "CLASS_SEALED", "BEGIN_EXPR", "PACKAGE_DECL", "CONCRETE_UNIT_DECL", "ACCESS_DECL", "INTERFACE_UNIT_DECL", "FUNCTION_DECL", "FORMAL_PARAM_LIST", "PARAMETER_DECL", "BLOCK_SCOPE", "IMPORT_DECL", "ATTRIBUTE_DECL", "VAR_DECL", "STATIC_ARRAY_CREATOR", "FUNCTION_CALL", "ARGUMENT_LIST", "ARGUMENT", "TYPE_", "NAME", "EXTENDS", "CLASS_FIELDS", "EXPRESSION", "COMPILATION_UNIT", "MAIN_BLOCK", "CONDITION", "BRANCH_STATEMENT", "BRANCH", "JUMP_STATEMENT", "LOOP_STATEMENT", "INIT", "STEP", "ASSIGNMENT_STATEMENT", "LOGICAL_OPERATOR", "KEYWORD", "OPERATOR", "COMPARISON_OPERATOR", "ASSIGN_OPERATOR", "SEPARATOR", "INBUILT_TYPE", "CONST", "VALUE", "ELLIPSIS", "BEGIN", "LIBRARY", "EXPORT", "IMPORT", "DEFINE_SYNTAX", "DEFINE", "SYNTAX_RULES", "VARIABLE", "STRING", "CHARACTER", "ELSE", "ARROW", "UNQUOTE", "UNQUOTE_SPLICING", "QUOTE", "LAMBDA", "IF", "SET", "COND", "AND", "OR", "CASE", "LET", "LETSTAR", "LETREC", "DO", "DELAY", "QUASIQUOTE", "CALL_WITH_CC", "CALL_CC", "WHEN", "UNLESS", "NOT", "APPLY", "LET_SYNTAX", "LETREC_SYNTAX", "NUM_2", "NUM_8", "NUM_10", "NUM_16", "TRUE", "FALSE", "PREFIX_2", "COMPLEX_2", "PREFIX_8", "COMPLEX_8", "PREFIX_10", "COMPLEX_10", "PREFIX_16", "COMPLEX_16", "INITIAL", "SUBSEQUENT", "PECULIAR_IDENTIFIER", "STRING_ELEMENT", "CHARACTER_NAME", "SPACE", "COMMENT", "LETTER", "SPECIAL_INITIAL", "DIGIT", "SPECIAL_SUBSEQUENT", "REAL_2", "SIGN", "UREAL_2", "REAL_8", "UREAL_8", "REAL_10", "UREAL_10", "REAL_16", "UREAL_16", "UINTEGER_2", "UINTEGER_8", "UINTEGER_10", "DECIMAL_10", "UINTEGER_16", "SUFFIX", "DIGIT_2", "DIGIT_8", "DIGIT_16", "RADIX_2", "EXACTNESS", "RADIX_8", "RADIX_10", "RADIX_16", "EXPONENT_MARKER", "'('", "')'", "'#('", "'\\''", "'\\'()'", "'.'", "'\\'('", "'`'", "',@'", "','"
    };
    public static final int SIGN=130;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int LETTER=125;
    public static final int CONST=65;
    public static final int TVAR_SECTION=9;
    public static final int CASE=89;
    public static final int ASSIGNMENT_STATEMENT=57;
    public static final int CONCRETE_UNIT_DECL=29;
    public static final int REAL_2=129;
    public static final int CLASS_SEALED=26;
    public static final int T__160=160;
    public static final int DO=93;
    public static final int VAR_DECL=38;
    public static final int CONDITION=50;
    public static final int LOOP_STATEMENT=54;
    public static final int SEPARATOR=63;
    public static final int NOT=100;
    public static final int REAL_8=132;
    public static final int EOF=-1;
    public static final int SPECIAL_INITIAL=126;
    public static final int STRING_ELEMENT=121;
    public static final int CHARACTER=77;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int QUOTE=82;
    public static final int VAR_DECL_ASSIGN=19;
    public static final int LETREC=92;
    public static final int LAB_STAT=22;
    public static final int NAME=44;
    public static final int IMPORT=71;
    public static final int COMPLEX_8=113;
    public static final int LOGICAL_OPERATOR=58;
    public static final int UREAL_10=135;
    public static final int PROG_IMPORT=20;
    public static final int COMPILATION_UNIT=48;
    public static final int TYPE_=43;
    public static final int BEGIN=68;
    public static final int COMPLEX_2=111;
    public static final int CLASS_OF=24;
    public static final int EXPORT=70;
    public static final int UREAL_2=131;
    public static final int COMMENT=124;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int UREAL_8=133;
    public static final int UREAL_16=137;
    public static final int UNQUOTE_SPLICING=81;
    public static final int T__153=153;
    public static final int RECORD_HELPER=21;
    public static final int KEYWORD=59;
    public static final int COMPLEX_10=115;
    public static final int CALL_CC=97;
    public static final int BLOCK_SCOPE=35;
    public static final int INITIAL=118;
    public static final int ELSE=78;
    public static final int DECIMAL_10=141;
    public static final int ELLIPSIS=67;
    public static final int INTERFACE_UNIT_DECL=31;
    public static final int LETSTAR=91;
    public static final int BRANCH_STATEMENT=51;
    public static final int RADIX_10=150;
    public static final int PROGRAM_BODY=18;
    public static final int VALUE=66;
    public static final int EXACTNESS=148;
    public static final int COMPLEX_16=117;
    public static final int NUM_16=107;
    public static final int NUM_2=104;
    public static final int ATTRIBUTE_DECL=37;
    public static final int NUM_8=105;
    public static final int NUM_10=106;
    public static final int VARIABLE=75;
    public static final int UINTEGER_10=140;
    public static final int EXPONENT_MARKER=152;
    public static final int UINTEGER_16=142;
    public static final int LETREC_SYNTAX=103;
    public static final int RADIX_16=151;
    public static final int OR=88;
    public static final int FUNCTION_DECL=32;
    public static final int DIGIT_16=146;
    public static final int FALSE=109;
    public static final int FUNCTION_CALL=40;
    public static final int INIT=55;
    public static final int ACCESS_DECL=30;
    public static final int PARAM_OUT=14;
    public static final int DELAY=94;
    public static final int APPLY=101;
    public static final int PROC_CALL=16;
    public static final int CLASS_DECL=4;
    public static final int STEP=56;
    public static final int RADIX_2=147;
    public static final int LIBRARY=69;
    public static final int INBUILT_TYPE=64;
    public static final int AND=87;
    public static final int CLASS_FIELDS=46;
    public static final int RADIX_8=149;
    public static final int SPACE=123;
    public static final int DEFINE=73;
    public static final int STATIC_ARRAY_CREATOR=39;
    public static final int IF=84;
    public static final int PARAM_VAR=12;
    public static final int SUFFIX=143;
    public static final int PARAMETER_DECL=34;
    public static final int SPECIAL_SUBSEQUENT=128;
    public static final int ARGUMENT=42;
    public static final int CLASS_HELPER=23;
    public static final int ARGUMENT_LIST=41;
    public static final int PROCEDURE_BODY=17;
    public static final int PREFIX_2=110;
    public static final int DIGIT=127;
    public static final int LAMBDA=83;
    public static final int QUASIQUOTE=95;
    public static final int UNLESS=99;
    public static final int PREFIX_8=112;
    public static final int BEGIN_EXPR=27;
    public static final int FORMAL_PARAM_LIST=33;
    public static final int EXPRESSION=47;
    public static final int SUBSEQUENT=119;
    public static final int UINTEGER_8=139;
    public static final int COMPARISON_OPERATOR=61;
    public static final int JUMP_STATEMENT=53;
    public static final int ASSIGN_OPERATOR=62;
    public static final int OPERATOR=60;
    public static final int QUAL_ACCESS=11;
    public static final int IMPORT_DECL=36;
    public static final int LET_SYNTAX=102;
    public static final int FIELD_DECL=10;
    public static final int SET=85;
    public static final int ARRAY_ACCESS=15;
    public static final int DIGIT_2=144;
    public static final int PACKAGE_DECL=28;
    public static final int CONST_ASSIGN=6;
    public static final int TRUE=108;
    public static final int CALL_WITH_CC=96;
    public static final int DIGIT_8=145;
    public static final int PECULIAR_IDENTIFIER=120;
    public static final int NEGATION=5;
    public static final int CLASS_ABSTRACT=25;
    public static final int REAL_16=136;
    public static final int WHEN=98;
    public static final int UNQUOTE=80;
    public static final int PREFIX_16=116;
    public static final int VAR_SECTION=8;
    public static final int REAL_10=134;
    public static final int DEFINE_SYNTAX=72;
    public static final int BRANCH=52;
    public static final int PARAM_CONST=13;
    public static final int SYNTAX_RULES=74;
    public static final int ARROW=79;
    public static final int PREFIX_10=114;
    public static final int MAIN_BLOCK=49;
    public static final int TYPE_ASSIGN=7;
    public static final int COND=86;
    public static final int EXTENDS=45;
    public static final int CHARACTER_NAME=122;
    public static final int LET=90;
    public static final int UINTEGER_2=138;
    public static final int STRING=76;

    // delegates
    // delegators


        public SchemeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SchemeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SchemeParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g"; }


    	SymbolTable symtab = new SymbolTable();
    	public static boolean isJumpStatement;


    public static class compilation_unit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compilation_unit"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:99:1: compilation_unit : ( library EOF -> ^( COMPILATION_UNIT library ) | ( expressionOrDefinition )* EOF -> ^( COMPILATION_UNIT ( expressionOrDefinition )* ) );
    public final SchemeParser.compilation_unit_return compilation_unit() throws RecognitionException {
        SchemeParser.compilation_unit_return retval = new SchemeParser.compilation_unit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        Token EOF4=null;
        SchemeParser.library_return library1 = null;

        SchemeParser.expressionOrDefinition_return expressionOrDefinition3 = null;


        CommonTree EOF2_tree=null;
        CommonTree EOF4_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_library=new RewriteRuleSubtreeStream(adaptor,"rule library");
        RewriteRuleSubtreeStream stream_expressionOrDefinition=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrDefinition");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:100:2: ( library EOF -> ^( COMPILATION_UNIT library ) | ( expressionOrDefinition )* EOF -> ^( COMPILATION_UNIT ( expressionOrDefinition )* ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==153) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=ELLIPSIS && LA2_1<=BEGIN)||(LA2_1>=EXPORT && LA2_1<=DEFINE)||(LA2_1>=VARIABLE && LA2_1<=FALSE)||LA2_1==153||(LA2_1>=156 && LA2_1<=157)||LA2_1==160) ) {
                    alt2=2;
                }
                else if ( (LA2_1==LIBRARY) ) {
                    alt2=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==EOF||LA2_0==ELLIPSIS||(LA2_0>=VARIABLE && LA2_0<=CHARACTER)||(LA2_0>=NUM_2 && LA2_0<=FALSE)||(LA2_0>=156 && LA2_0<=157)||LA2_0==160) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:100:4: library EOF
                    {
                    pushFollow(FOLLOW_library_in_compilation_unit337);
                    library1=library();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_library.add(library1.getTree());
                    EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_compilation_unit339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOF.add(EOF2);



                    // AST REWRITE
                    // elements: library
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 101:3: -> ^( COMPILATION_UNIT library )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:101:6: ^( COMPILATION_UNIT library )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                        adaptor.addChild(root_1, stream_library.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:102:4: ( expressionOrDefinition )* EOF
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:102:4: ( expressionOrDefinition )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==ELLIPSIS||(LA1_0>=VARIABLE && LA1_0<=CHARACTER)||(LA1_0>=NUM_2 && LA1_0<=FALSE)||LA1_0==153||(LA1_0>=156 && LA1_0<=157)||LA1_0==160) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:102:4: expressionOrDefinition
                    	    {
                    	    pushFollow(FOLLOW_expressionOrDefinition_in_compilation_unit356);
                    	    expressionOrDefinition3=expressionOrDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expressionOrDefinition.add(expressionOrDefinition3.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_compilation_unit359); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EOF.add(EOF4);



                    // AST REWRITE
                    // elements: expressionOrDefinition
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 103:3: -> ^( COMPILATION_UNIT ( expressionOrDefinition )* )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:103:6: ^( COMPILATION_UNIT ( expressionOrDefinition )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:103:26: ( expressionOrDefinition )*
                        while ( stream_expressionOrDefinition.hasNext() ) {
                            adaptor.addChild(root_1, stream_expressionOrDefinition.nextTree());

                        }
                        stream_expressionOrDefinition.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compilation_unit"

    public static class expressionOrDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionOrDefinition"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:106:1: expressionOrDefinition : ( ( lpar ( EXPORT | IMPORT ) )=> exportOrImportVariable | ( lpar DEFINE_SYNTAX )=> syntaxDefinition | ( lpar DEFINE )=> definition | ( lpar BEGIN DEFINE )=> beginDefinition | ( '(' BEGIN expressionOrDefinition )=> beginExpressionOrDefinition | fullExpression );
    public final SchemeParser.expressionOrDefinition_return expressionOrDefinition() throws RecognitionException {
        SchemeParser.expressionOrDefinition_return retval = new SchemeParser.expressionOrDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.exportOrImportVariable_return exportOrImportVariable5 = null;

        SchemeParser.syntaxDefinition_return syntaxDefinition6 = null;

        SchemeParser.definition_return definition7 = null;

        SchemeParser.beginDefinition_return beginDefinition8 = null;

        SchemeParser.beginExpressionOrDefinition_return beginExpressionOrDefinition9 = null;

        SchemeParser.fullExpression_return fullExpression10 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:107:2: ( ( lpar ( EXPORT | IMPORT ) )=> exportOrImportVariable | ( lpar DEFINE_SYNTAX )=> syntaxDefinition | ( lpar DEFINE )=> definition | ( lpar BEGIN DEFINE )=> beginDefinition | ( '(' BEGIN expressionOrDefinition )=> beginExpressionOrDefinition | fullExpression )
            int alt3=6;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:107:4: ( lpar ( EXPORT | IMPORT ) )=> exportOrImportVariable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_exportOrImportVariable_in_expressionOrDefinition406);
                    exportOrImportVariable5=exportOrImportVariable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, exportOrImportVariable5.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:108:4: ( lpar DEFINE_SYNTAX )=> syntaxDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_syntaxDefinition_in_expressionOrDefinition433);
                    syntaxDefinition6=syntaxDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, syntaxDefinition6.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:109:4: ( lpar DEFINE )=> definition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_definition_in_expressionOrDefinition465);
                    definition7=definition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, definition7.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:110:4: ( lpar BEGIN DEFINE )=> beginDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_beginDefinition_in_expressionOrDefinition482);
                    beginDefinition8=beginDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, beginDefinition8.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:111:4: ( '(' BEGIN expressionOrDefinition )=> beginExpressionOrDefinition
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_beginExpressionOrDefinition_in_expressionOrDefinition498);
                    beginExpressionOrDefinition9=beginExpressionOrDefinition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, beginExpressionOrDefinition9.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:112:4: fullExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fullExpression_in_expressionOrDefinition503);
                    fullExpression10=fullExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fullExpression10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionOrDefinition"

    public static class lpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lpar"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:115:1: lpar : '(' -> ^( SEPARATOR '(' ) ;
    public final SchemeParser.lpar_return lpar() throws RecognitionException {
        SchemeParser.lpar_return retval = new SchemeParser.lpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal11=null;

        CommonTree char_literal11_tree=null;
        RewriteRuleTokenStream stream_153=new RewriteRuleTokenStream(adaptor,"token 153");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:115:11: ( '(' -> ^( SEPARATOR '(' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:115:13: '('
            {
            char_literal11=(Token)match(input,153,FOLLOW_153_in_lpar518); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_153.add(char_literal11);



            // AST REWRITE
            // elements: 153
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 115:22: -> ^( SEPARATOR '(' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:115:25: ^( SEPARATOR '(' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_153.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lpar"

    public static class rpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "rpar"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:116:1: rpar : ')' -> ^( SEPARATOR ')' ) ;
    public final SchemeParser.rpar_return rpar() throws RecognitionException {
        SchemeParser.rpar_return retval = new SchemeParser.rpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal12=null;

        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_154=new RewriteRuleTokenStream(adaptor,"token 154");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:116:11: ( ')' -> ^( SEPARATOR ')' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:116:13: ')'
            {
            char_literal12=(Token)match(input,154,FOLLOW_154_in_rpar546); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_154.add(char_literal12);



            // AST REWRITE
            // elements: 154
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 116:22: -> ^( SEPARATOR ')' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:116:25: ^( SEPARATOR ')' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_154.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "rpar"

    public static class sharpLpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sharpLpar"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:117:1: sharpLpar : '#(' -> ^( SEPARATOR '#(' ) ;
    public final SchemeParser.sharpLpar_return sharpLpar() throws RecognitionException {
        SchemeParser.sharpLpar_return retval = new SchemeParser.sharpLpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal13=null;

        CommonTree string_literal13_tree=null;
        RewriteRuleTokenStream stream_155=new RewriteRuleTokenStream(adaptor,"token 155");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:117:11: ( '#(' -> ^( SEPARATOR '#(' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:117:13: '#('
            {
            string_literal13=(Token)match(input,155,FOLLOW_155_in_sharpLpar569); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_155.add(string_literal13);



            // AST REWRITE
            // elements: 155
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 117:22: -> ^( SEPARATOR '#(' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:117:25: ^( SEPARATOR '#(' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_155.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sharpLpar"

    public static class elipsis_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elipsis"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:118:1: elipsis : ELLIPSIS -> ^( SEPARATOR ELLIPSIS ) ;
    public final SchemeParser.elipsis_return elipsis() throws RecognitionException {
        SchemeParser.elipsis_return retval = new SchemeParser.elipsis_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELLIPSIS14=null;

        CommonTree ELLIPSIS14_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:118:11: ( ELLIPSIS -> ^( SEPARATOR ELLIPSIS ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:118:13: ELLIPSIS
            {
            ELLIPSIS14=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_elipsis593); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS14);



            // AST REWRITE
            // elements: ELLIPSIS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 118:22: -> ^( SEPARATOR ELLIPSIS )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:118:25: ^( SEPARATOR ELLIPSIS )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_ELLIPSIS.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elipsis"

    public static class beginExpressionOrDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "beginExpressionOrDefinition"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:120:1: beginExpressionOrDefinition : lpar BEGIN ( expressionOrDefinition )+ rpar -> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( expressionOrDefinition )+ rpar ) ;
    public final SchemeParser.beginExpressionOrDefinition_return beginExpressionOrDefinition() throws RecognitionException {
        SchemeParser.beginExpressionOrDefinition_return retval = new SchemeParser.beginExpressionOrDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN16=null;
        SchemeParser.lpar_return lpar15 = null;

        SchemeParser.expressionOrDefinition_return expressionOrDefinition17 = null;

        SchemeParser.rpar_return rpar18 = null;


        CommonTree BEGIN16_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_expressionOrDefinition=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrDefinition");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:121:2: ( lpar BEGIN ( expressionOrDefinition )+ rpar -> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( expressionOrDefinition )+ rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:121:4: lpar BEGIN ( expressionOrDefinition )+ rpar
            {
            pushFollow(FOLLOW_lpar_in_beginExpressionOrDefinition613);
            lpar15=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar15.getTree());
            BEGIN16=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_beginExpressionOrDefinition615); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN16);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:121:15: ( expressionOrDefinition )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ELLIPSIS||(LA4_0>=VARIABLE && LA4_0<=CHARACTER)||(LA4_0>=NUM_2 && LA4_0<=FALSE)||LA4_0==153||(LA4_0>=156 && LA4_0<=157)||LA4_0==160) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:121:15: expressionOrDefinition
            	    {
            	    pushFollow(FOLLOW_expressionOrDefinition_in_beginExpressionOrDefinition617);
            	    expressionOrDefinition17=expressionOrDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressionOrDefinition.add(expressionOrDefinition17.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            pushFollow(FOLLOW_rpar_in_beginExpressionOrDefinition620);
            rpar18=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar18.getTree());


            // AST REWRITE
            // elements: expressionOrDefinition, lpar, BEGIN, rpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 122:3: -> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( expressionOrDefinition )+ rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:122:6: ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( expressionOrDefinition )+ rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:122:26: ^( KEYWORD BEGIN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_BEGIN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                if ( !(stream_expressionOrDefinition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expressionOrDefinition.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionOrDefinition.nextTree());

                }
                stream_expressionOrDefinition.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "beginExpressionOrDefinition"

    public static class library_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "library"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:125:1: library : lpar LIBRARY lpar variable rpar ( expressionOrDefinition )+ rpar -> ^( PACKAGE_DECL lpar ^( KEYWORD LIBRARY ) lpar variable rpar ( expressionOrDefinition )+ rpar ) ;
    public final SchemeParser.library_return library() throws RecognitionException {
        SchemeParser.library_return retval = new SchemeParser.library_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LIBRARY20=null;
        SchemeParser.lpar_return lpar19 = null;

        SchemeParser.lpar_return lpar21 = null;

        SchemeParser.variable_return variable22 = null;

        SchemeParser.rpar_return rpar23 = null;

        SchemeParser.expressionOrDefinition_return expressionOrDefinition24 = null;

        SchemeParser.rpar_return rpar25 = null;


        CommonTree LIBRARY20_tree=null;
        RewriteRuleTokenStream stream_LIBRARY=new RewriteRuleTokenStream(adaptor,"token LIBRARY");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_expressionOrDefinition=new RewriteRuleSubtreeStream(adaptor,"rule expressionOrDefinition");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:126:2: ( lpar LIBRARY lpar variable rpar ( expressionOrDefinition )+ rpar -> ^( PACKAGE_DECL lpar ^( KEYWORD LIBRARY ) lpar variable rpar ( expressionOrDefinition )+ rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:126:4: lpar LIBRARY lpar variable rpar ( expressionOrDefinition )+ rpar
            {
            pushFollow(FOLLOW_lpar_in_library656);
            lpar19=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar19.getTree());
            LIBRARY20=(Token)match(input,LIBRARY,FOLLOW_LIBRARY_in_library658); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LIBRARY.add(LIBRARY20);

            pushFollow(FOLLOW_lpar_in_library660);
            lpar21=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar21.getTree());
            pushFollow(FOLLOW_variable_in_library662);
            variable22=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable22.getTree());
            pushFollow(FOLLOW_rpar_in_library664);
            rpar23=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar23.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:126:36: ( expressionOrDefinition )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ELLIPSIS||(LA5_0>=VARIABLE && LA5_0<=CHARACTER)||(LA5_0>=NUM_2 && LA5_0<=FALSE)||LA5_0==153||(LA5_0>=156 && LA5_0<=157)||LA5_0==160) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:126:36: expressionOrDefinition
            	    {
            	    pushFollow(FOLLOW_expressionOrDefinition_in_library666);
            	    expressionOrDefinition24=expressionOrDefinition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expressionOrDefinition.add(expressionOrDefinition24.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            pushFollow(FOLLOW_rpar_in_library669);
            rpar25=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar25.getTree());


            // AST REWRITE
            // elements: lpar, LIBRARY, rpar, variable, rpar, lpar, expressionOrDefinition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 127:3: -> ^( PACKAGE_DECL lpar ^( KEYWORD LIBRARY ) lpar variable rpar ( expressionOrDefinition )+ rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:127:6: ^( PACKAGE_DECL lpar ^( KEYWORD LIBRARY ) lpar variable rpar ( expressionOrDefinition )+ rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PACKAGE_DECL, "PACKAGE_DECL"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:128:14: ^( KEYWORD LIBRARY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_LIBRARY.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_lpar.nextTree());
                adaptor.addChild(root_1, stream_variable.nextTree());
                adaptor.addChild(root_1, stream_rpar.nextTree());
                if ( !(stream_expressionOrDefinition.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expressionOrDefinition.hasNext() ) {
                    adaptor.addChild(root_1, stream_expressionOrDefinition.nextTree());

                }
                stream_expressionOrDefinition.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "library"

    public static class exportOrImportVariable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exportOrImportVariable"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:131:1: exportOrImportVariable : ( lpar EXPORT variable rpar -> lpar ^( KEYWORD EXPORT ) variable rpar | lpar IMPORT ( lpar variable rpar )+ rpar -> ^( IMPORT_DECL lpar ^( KEYWORD IMPORT ) variable rpar ) );
    public final SchemeParser.exportOrImportVariable_return exportOrImportVariable() throws RecognitionException {
        SchemeParser.exportOrImportVariable_return retval = new SchemeParser.exportOrImportVariable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EXPORT27=null;
        Token IMPORT31=null;
        SchemeParser.lpar_return lpar26 = null;

        SchemeParser.variable_return variable28 = null;

        SchemeParser.rpar_return rpar29 = null;

        SchemeParser.lpar_return lpar30 = null;

        SchemeParser.lpar_return lpar32 = null;

        SchemeParser.variable_return variable33 = null;

        SchemeParser.rpar_return rpar34 = null;

        SchemeParser.rpar_return rpar35 = null;


        CommonTree EXPORT27_tree=null;
        CommonTree IMPORT31_tree=null;
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleTokenStream stream_EXPORT=new RewriteRuleTokenStream(adaptor,"token EXPORT");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:132:2: ( lpar EXPORT variable rpar -> lpar ^( KEYWORD EXPORT ) variable rpar | lpar IMPORT ( lpar variable rpar )+ rpar -> ^( IMPORT_DECL lpar ^( KEYWORD IMPORT ) variable rpar ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==153) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EXPORT) ) {
                    alt7=1;
                }
                else if ( (LA7_1==IMPORT) ) {
                    alt7=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:132:4: lpar EXPORT variable rpar
                    {
                    pushFollow(FOLLOW_lpar_in_exportOrImportVariable719);
                    lpar26=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar26.getTree());
                    EXPORT27=(Token)match(input,EXPORT,FOLLOW_EXPORT_in_exportOrImportVariable721); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EXPORT.add(EXPORT27);

                    pushFollow(FOLLOW_variable_in_exportOrImportVariable723);
                    variable28=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable28.getTree());
                    pushFollow(FOLLOW_rpar_in_exportOrImportVariable725);
                    rpar29=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar29.getTree());


                    // AST REWRITE
                    // elements: rpar, EXPORT, lpar, variable
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 133:3: -> lpar ^( KEYWORD EXPORT ) variable rpar
                    {
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:133:11: ^( KEYWORD EXPORT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                        adaptor.addChild(root_1, stream_EXPORT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_variable.nextTree());
                        adaptor.addChild(root_0, stream_rpar.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:134:4: lpar IMPORT ( lpar variable rpar )+ rpar
                    {
                    pushFollow(FOLLOW_lpar_in_exportOrImportVariable748);
                    lpar30=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar30.getTree());
                    IMPORT31=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_exportOrImportVariable750); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPORT.add(IMPORT31);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:134:16: ( lpar variable rpar )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==153) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:134:18: lpar variable rpar
                    	    {
                    	    pushFollow(FOLLOW_lpar_in_exportOrImportVariable754);
                    	    lpar32=lpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_lpar.add(lpar32.getTree());
                    	    pushFollow(FOLLOW_variable_in_exportOrImportVariable756);
                    	    variable33=variable();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variable.add(variable33.getTree());
                    	    pushFollow(FOLLOW_rpar_in_exportOrImportVariable758);
                    	    rpar34=rpar();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_rpar.add(rpar34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    pushFollow(FOLLOW_rpar_in_exportOrImportVariable763);
                    rpar35=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar35.getTree());


                    // AST REWRITE
                    // elements: rpar, lpar, variable, IMPORT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 135:3: -> ^( IMPORT_DECL lpar ^( KEYWORD IMPORT ) variable rpar )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:135:6: ^( IMPORT_DECL lpar ^( KEYWORD IMPORT ) variable rpar )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_DECL, "IMPORT_DECL"), root_1);

                        adaptor.addChild(root_1, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:135:26: ^( KEYWORD IMPORT )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                        adaptor.addChild(root_2, stream_IMPORT.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_variable.nextTree());
                        adaptor.addChild(root_1, stream_rpar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exportOrImportVariable"

    public static class syntaxDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "syntaxDefinition"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:138:1: syntaxDefinition : lpar DEFINE_SYNTAX keyword transformerSpec rpar ;
    public final SchemeParser.syntaxDefinition_return syntaxDefinition() throws RecognitionException {
        SchemeParser.syntaxDefinition_return retval = new SchemeParser.syntaxDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINE_SYNTAX37=null;
        SchemeParser.lpar_return lpar36 = null;

        SchemeParser.keyword_return keyword38 = null;

        SchemeParser.transformerSpec_return transformerSpec39 = null;

        SchemeParser.rpar_return rpar40 = null;


        CommonTree DEFINE_SYNTAX37_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:139:2: ( lpar DEFINE_SYNTAX keyword transformerSpec rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:139:4: lpar DEFINE_SYNTAX keyword transformerSpec rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_syntaxDefinition798);
            lpar36=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar36.getTree());
            DEFINE_SYNTAX37=(Token)match(input,DEFINE_SYNTAX,FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition800); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFINE_SYNTAX37_tree = (CommonTree)adaptor.create(DEFINE_SYNTAX37);
            adaptor.addChild(root_0, DEFINE_SYNTAX37_tree);
            }
            pushFollow(FOLLOW_keyword_in_syntaxDefinition802);
            keyword38=keyword();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword38.getTree());
            pushFollow(FOLLOW_transformerSpec_in_syntaxDefinition804);
            transformerSpec39=transformerSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec39.getTree());
            pushFollow(FOLLOW_rpar_in_syntaxDefinition806);
            rpar40=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar40.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "syntaxDefinition"

    public static class definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:142:1: definition : lpar DEFINE ( variable definitionExpression rpar -> ^( VAR_DECL lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR DEFINE ) variable ^( VALUE definitionExpression ) ) rpar ) | lpar variable ( defFormals )? rpar body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD DEFINE ) lpar variable ^( FORMAL_PARAM_LIST ( defFormals )? ) rpar ^( BLOCK_SCOPE body ) rpar ) ) ;
    public final SchemeParser.definition_return definition() throws RecognitionException {
        SchemeParser.definition_return retval = new SchemeParser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFINE42=null;
        SchemeParser.lpar_return lpar41 = null;

        SchemeParser.variable_return variable43 = null;

        SchemeParser.definitionExpression_return definitionExpression44 = null;

        SchemeParser.rpar_return rpar45 = null;

        SchemeParser.lpar_return lpar46 = null;

        SchemeParser.variable_return variable47 = null;

        SchemeParser.defFormals_return defFormals48 = null;

        SchemeParser.rpar_return rpar49 = null;

        SchemeParser.body_return body50 = null;

        SchemeParser.rpar_return rpar51 = null;


        CommonTree DEFINE42_tree=null;
        RewriteRuleTokenStream stream_DEFINE=new RewriteRuleTokenStream(adaptor,"token DEFINE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_defFormals=new RewriteRuleSubtreeStream(adaptor,"rule defFormals");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_definitionExpression=new RewriteRuleSubtreeStream(adaptor,"rule definitionExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:143:2: ( lpar DEFINE ( variable definitionExpression rpar -> ^( VAR_DECL lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR DEFINE ) variable ^( VALUE definitionExpression ) ) rpar ) | lpar variable ( defFormals )? rpar body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD DEFINE ) lpar variable ^( FORMAL_PARAM_LIST ( defFormals )? ) rpar ^( BLOCK_SCOPE body ) rpar ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:143:4: lpar DEFINE ( variable definitionExpression rpar -> ^( VAR_DECL lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR DEFINE ) variable ^( VALUE definitionExpression ) ) rpar ) | lpar variable ( defFormals )? rpar body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD DEFINE ) lpar variable ^( FORMAL_PARAM_LIST ( defFormals )? ) rpar ^( BLOCK_SCOPE body ) rpar ) )
            {
            pushFollow(FOLLOW_lpar_in_definition817);
            lpar41=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar41.getTree());
            DEFINE42=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_definition819); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DEFINE.add(DEFINE42);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:143:16: ( variable definitionExpression rpar -> ^( VAR_DECL lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR DEFINE ) variable ^( VALUE definitionExpression ) ) rpar ) | lpar variable ( defFormals )? rpar body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD DEFINE ) lpar variable ^( FORMAL_PARAM_LIST ( defFormals )? ) rpar ^( BLOCK_SCOPE body ) rpar ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ELLIPSIS||LA9_0==VARIABLE) ) {
                alt9=1;
            }
            else if ( (LA9_0==153) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:144:4: variable definitionExpression rpar
                    {
                    pushFollow(FOLLOW_variable_in_definition826);
                    variable43=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable43.getTree());
                    pushFollow(FOLLOW_definitionExpression_in_definition828);
                    definitionExpression44=definitionExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definitionExpression.add(definitionExpression44.getTree());
                    pushFollow(FOLLOW_rpar_in_definition830);
                    rpar45=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar45.getTree());


                    // AST REWRITE
                    // elements: lpar, variable, DEFINE, rpar, definitionExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 145:3: -> ^( VAR_DECL lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR DEFINE ) variable ^( VALUE definitionExpression ) ) rpar )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:145:6: ^( VAR_DECL lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR DEFINE ) variable ^( VALUE definitionExpression ) ) rpar )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        adaptor.addChild(root_1, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:145:23: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR DEFINE ) variable ^( VALUE definitionExpression ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:145:46: ^( ASSIGN_OPERATOR DEFINE )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_3);

                        adaptor.addChild(root_3, stream_DEFINE.nextNode());

                        adaptor.addChild(root_2, root_3);
                        }
                        adaptor.addChild(root_2, stream_variable.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:145:82: ^( VALUE definitionExpression )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_3);

                        adaptor.addChild(root_3, stream_definitionExpression.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_rpar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:147:7: lpar variable ( defFormals )? rpar body rpar
                    {
                    pushFollow(FOLLOW_lpar_in_definition872);
                    lpar46=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar46.getTree());
                    pushFollow(FOLLOW_variable_in_definition874);
                    variable47=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variable.add(variable47.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:147:21: ( defFormals )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ELLIPSIS||LA8_0==VARIABLE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:147:21: defFormals
                            {
                            pushFollow(FOLLOW_defFormals_in_definition876);
                            defFormals48=defFormals();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_defFormals.add(defFormals48.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_rpar_in_definition879);
                    rpar49=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar49.getTree());
                    pushFollow(FOLLOW_body_in_definition881);
                    body50=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body50.getTree());
                    pushFollow(FOLLOW_rpar_in_definition883);
                    rpar51=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar51.getTree());


                    // AST REWRITE
                    // elements: lpar, rpar, variable, DEFINE, lpar, rpar, defFormals, body
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 148:3: -> ^( FUNCTION_DECL lpar ^( KEYWORD DEFINE ) lpar variable ^( FORMAL_PARAM_LIST ( defFormals )? ) rpar ^( BLOCK_SCOPE body ) rpar )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:148:6: ^( FUNCTION_DECL lpar ^( KEYWORD DEFINE ) lpar variable ^( FORMAL_PARAM_LIST ( defFormals )? ) rpar ^( BLOCK_SCOPE body ) rpar )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                        adaptor.addChild(root_1, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:149:13: ^( KEYWORD DEFINE )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                        adaptor.addChild(root_2, stream_DEFINE.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_lpar.nextTree());
                        adaptor.addChild(root_1, stream_variable.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:149:47: ^( FORMAL_PARAM_LIST ( defFormals )? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:149:68: ( defFormals )?
                        if ( stream_defFormals.hasNext() ) {
                            adaptor.addChild(root_2, stream_defFormals.nextTree());

                        }
                        stream_defFormals.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_rpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:149:87: ^( BLOCK_SCOPE body )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                        adaptor.addChild(root_2, stream_body.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_rpar.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "definition"

    public static class beginDefinition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "beginDefinition"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:154:1: beginDefinition : lpar BEGIN ( definition )* rpar -> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( definition )* rpar ) ;
    public final SchemeParser.beginDefinition_return beginDefinition() throws RecognitionException {
        SchemeParser.beginDefinition_return retval = new SchemeParser.beginDefinition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN53=null;
        SchemeParser.lpar_return lpar52 = null;

        SchemeParser.definition_return definition54 = null;

        SchemeParser.rpar_return rpar55 = null;


        CommonTree BEGIN53_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:155:3: ( lpar BEGIN ( definition )* rpar -> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( definition )* rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:155:5: lpar BEGIN ( definition )* rpar
            {
            pushFollow(FOLLOW_lpar_in_beginDefinition957);
            lpar52=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar52.getTree());
            BEGIN53=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_beginDefinition959); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN53);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:155:16: ( definition )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==153) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:155:16: definition
            	    {
            	    pushFollow(FOLLOW_definition_in_beginDefinition961);
            	    definition54=definition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition.add(definition54.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_beginDefinition964);
            rpar55=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar55.getTree());


            // AST REWRITE
            // elements: rpar, definition, BEGIN, lpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:5: -> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( definition )* rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:156:8: ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) ( definition )* rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:156:28: ^( KEYWORD BEGIN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_BEGIN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:156:47: ( definition )*
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "beginDefinition"

    public static class definitionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definitionExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:159:1: definitionExpression : ( ( variable )=> variable | ( literal )=> literal | ( callCCExpr )=> callCCExpr | ( lambdaExpression )=> lambdaExpression -> ^( TYPE_ lambdaExpression ) | ( condExpression )=> condExpression | ( conditional )=> conditional | ( unlessExpression )=> unlessExpression | ( whenExpression )=> whenExpression | ( lpar SET )=> assignment | ( derivedExpression )=> derivedExpression | ( lpar operator )=> procedureCall | ( applyExpression )=> applyExpression | ( macroUse )=> macroUse | ( letExpression )=> letExpression | oprtr | contCall | macroBlock );
    public final SchemeParser.definitionExpression_return definitionExpression() throws RecognitionException {
        SchemeParser.definitionExpression_return retval = new SchemeParser.definitionExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.variable_return variable56 = null;

        SchemeParser.literal_return literal57 = null;

        SchemeParser.callCCExpr_return callCCExpr58 = null;

        SchemeParser.lambdaExpression_return lambdaExpression59 = null;

        SchemeParser.condExpression_return condExpression60 = null;

        SchemeParser.conditional_return conditional61 = null;

        SchemeParser.unlessExpression_return unlessExpression62 = null;

        SchemeParser.whenExpression_return whenExpression63 = null;

        SchemeParser.assignment_return assignment64 = null;

        SchemeParser.derivedExpression_return derivedExpression65 = null;

        SchemeParser.procedureCall_return procedureCall66 = null;

        SchemeParser.applyExpression_return applyExpression67 = null;

        SchemeParser.macroUse_return macroUse68 = null;

        SchemeParser.letExpression_return letExpression69 = null;

        SchemeParser.oprtr_return oprtr70 = null;

        SchemeParser.contCall_return contCall71 = null;

        SchemeParser.macroBlock_return macroBlock72 = null;


        RewriteRuleSubtreeStream stream_lambdaExpression=new RewriteRuleSubtreeStream(adaptor,"rule lambdaExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:160:2: ( ( variable )=> variable | ( literal )=> literal | ( callCCExpr )=> callCCExpr | ( lambdaExpression )=> lambdaExpression -> ^( TYPE_ lambdaExpression ) | ( condExpression )=> condExpression | ( conditional )=> conditional | ( unlessExpression )=> unlessExpression | ( whenExpression )=> whenExpression | ( lpar SET )=> assignment | ( derivedExpression )=> derivedExpression | ( lpar operator )=> procedureCall | ( applyExpression )=> applyExpression | ( macroUse )=> macroUse | ( letExpression )=> letExpression | oprtr | contCall | macroBlock )
            int alt11=17;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:160:4: ( variable )=> variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_definitionExpression1019);
                    variable56=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable56.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:161:4: ( literal )=> literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_definitionExpression1041);
                    literal57=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal57.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:162:4: ( callCCExpr )=> callCCExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_callCCExpr_in_definitionExpression1061);
                    callCCExpr58=callCCExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callCCExpr58.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:163:4: ( lambdaExpression )=> lambdaExpression
                    {
                    pushFollow(FOLLOW_lambdaExpression_in_definitionExpression1074);
                    lambdaExpression59=lambdaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lambdaExpression.add(lambdaExpression59.getTree());


                    // AST REWRITE
                    // elements: lambdaExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 163:45: -> ^( TYPE_ lambdaExpression )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:163:48: ^( TYPE_ lambdaExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_, "TYPE_"), root_1);

                        adaptor.addChild(root_1, stream_lambdaExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:164:4: ( condExpression )=> condExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condExpression_in_definitionExpression1097);
                    condExpression60=condExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpression60.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:165:4: ( conditional )=> conditional
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditional_in_definitionExpression1115);
                    conditional61=conditional();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional61.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:166:4: ( unlessExpression )=> unlessExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unlessExpression_in_definitionExpression1127);
                    unlessExpression62=unlessExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unlessExpression62.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:167:4: ( whenExpression )=> whenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whenExpression_in_definitionExpression1139);
                    whenExpression63=whenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenExpression63.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:168:4: ( lpar SET )=> assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_definitionExpression1159);
                    assignment64=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment64.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:169:4: ( derivedExpression )=> derivedExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_derivedExpression_in_definitionExpression1171);
                    derivedExpression65=derivedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedExpression65.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:170:4: ( lpar operator )=> procedureCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureCall_in_definitionExpression1189);
                    procedureCall66=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall66.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:171:4: ( applyExpression )=> applyExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_applyExpression_in_definitionExpression1202);
                    applyExpression67=applyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, applyExpression67.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:172:4: ( macroUse )=> macroUse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_macroUse_in_definitionExpression1223);
                    macroUse68=macroUse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, macroUse68.getTree());

                    }
                    break;
                case 14 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:173:4: ( letExpression )=> letExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_letExpression_in_definitionExpression1239);
                    letExpression69=letExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, letExpression69.getTree());

                    }
                    break;
                case 15 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:174:5: oprtr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_oprtr_in_definitionExpression1245);
                    oprtr70=oprtr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oprtr70.getTree());

                    }
                    break;
                case 16 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:175:5: contCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_contCall_in_definitionExpression1251);
                    contCall71=contCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, contCall71.getTree());

                    }
                    break;
                case 17 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:176:30: macroBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_macroBlock_in_definitionExpression1282);
                    macroBlock72=macroBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, macroBlock72.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "definitionExpression"

    public static class defFormals_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defFormals"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:179:1: defFormals : ( variable )+ -> ( ^( PARAMETER_DECL variable ) )+ ;
    public final SchemeParser.defFormals_return defFormals() throws RecognitionException {
        SchemeParser.defFormals_return retval = new SchemeParser.defFormals_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.variable_return variable73 = null;


        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:180:2: ( ( variable )+ -> ( ^( PARAMETER_DECL variable ) )+ )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:180:4: ( variable )+
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:180:4: ( variable )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==ELLIPSIS||LA12_0==VARIABLE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:180:4: variable
            	    {
            	    pushFollow(FOLLOW_variable_in_defFormals1293);
            	    variable73=variable();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_variable.add(variable73.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);



            // AST REWRITE
            // elements: variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 181:3: -> ( ^( PARAMETER_DECL variable ) )+
            {
                if ( !(stream_variable.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variable.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:181:6: ^( PARAMETER_DECL variable )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_1);

                    adaptor.addChild(root_1, stream_variable.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_variable.reset();

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "defFormals"

    public static class keyword_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:184:1: keyword : identifier ;
    public final SchemeParser.keyword_return keyword() throws RecognitionException {
        SchemeParser.keyword_return retval = new SchemeParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.identifier_return identifier74 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:185:2: ( identifier )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:185:4: identifier
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_identifier_in_keyword1318);
            identifier74=identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier74.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword"

    public static class transformerSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "transformerSpec"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:188:1: transformerSpec : lpar SYNTAX_RULES lpar ( identifier )* rpar ( syntaxRule )* rpar -> lpar ^( KEYWORD SYNTAX_RULES ) lpar ( identifier )* rpar ( syntaxRule )* rpar ;
    public final SchemeParser.transformerSpec_return transformerSpec() throws RecognitionException {
        SchemeParser.transformerSpec_return retval = new SchemeParser.transformerSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SYNTAX_RULES76=null;
        SchemeParser.lpar_return lpar75 = null;

        SchemeParser.lpar_return lpar77 = null;

        SchemeParser.identifier_return identifier78 = null;

        SchemeParser.rpar_return rpar79 = null;

        SchemeParser.syntaxRule_return syntaxRule80 = null;

        SchemeParser.rpar_return rpar81 = null;


        CommonTree SYNTAX_RULES76_tree=null;
        RewriteRuleTokenStream stream_SYNTAX_RULES=new RewriteRuleTokenStream(adaptor,"token SYNTAX_RULES");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_syntaxRule=new RewriteRuleSubtreeStream(adaptor,"rule syntaxRule");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:189:2: ( lpar SYNTAX_RULES lpar ( identifier )* rpar ( syntaxRule )* rpar -> lpar ^( KEYWORD SYNTAX_RULES ) lpar ( identifier )* rpar ( syntaxRule )* rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:189:4: lpar SYNTAX_RULES lpar ( identifier )* rpar ( syntaxRule )* rpar
            {
            pushFollow(FOLLOW_lpar_in_transformerSpec1329);
            lpar75=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar75.getTree());
            SYNTAX_RULES76=(Token)match(input,SYNTAX_RULES,FOLLOW_SYNTAX_RULES_in_transformerSpec1331); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SYNTAX_RULES.add(SYNTAX_RULES76);

            pushFollow(FOLLOW_lpar_in_transformerSpec1333);
            lpar77=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar77.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:189:27: ( identifier )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=ELLIPSIS && LA13_0<=BEGIN)||LA13_0==DEFINE||LA13_0==VARIABLE||(LA13_0>=ELSE && LA13_0<=QUASIQUOTE)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:189:27: identifier
            	    {
            	    pushFollow(FOLLOW_identifier_in_transformerSpec1335);
            	    identifier78=identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier78.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_transformerSpec1338);
            rpar79=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar79.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:189:44: ( syntaxRule )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==153) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:189:44: syntaxRule
            	    {
            	    pushFollow(FOLLOW_syntaxRule_in_transformerSpec1340);
            	    syntaxRule80=syntaxRule();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_syntaxRule.add(syntaxRule80.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_transformerSpec1343);
            rpar81=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar81.getTree());


            // AST REWRITE
            // elements: rpar, lpar, lpar, rpar, identifier, SYNTAX_RULES, syntaxRule
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 190:3: -> lpar ^( KEYWORD SYNTAX_RULES ) lpar ( identifier )* rpar ( syntaxRule )* rpar
            {
                adaptor.addChild(root_0, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:190:11: ^( KEYWORD SYNTAX_RULES )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_SYNTAX_RULES.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:190:42: ( identifier )*
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_0, stream_identifier.nextTree());

                }
                stream_identifier.reset();
                adaptor.addChild(root_0, stream_rpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:190:59: ( syntaxRule )*
                while ( stream_syntaxRule.hasNext() ) {
                    adaptor.addChild(root_0, stream_syntaxRule.nextTree());

                }
                stream_syntaxRule.reset();
                adaptor.addChild(root_0, stream_rpar.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "transformerSpec"

    public static class syntaxRule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "syntaxRule"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:193:1: syntaxRule : lpar pattern template rpar ;
    public final SchemeParser.syntaxRule_return syntaxRule() throws RecognitionException {
        SchemeParser.syntaxRule_return retval = new SchemeParser.syntaxRule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar82 = null;

        SchemeParser.pattern_return pattern83 = null;

        SchemeParser.template_return template84 = null;

        SchemeParser.rpar_return rpar85 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:194:2: ( lpar pattern template rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:194:4: lpar pattern template rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_syntaxRule1380);
            lpar82=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar82.getTree());
            pushFollow(FOLLOW_pattern_in_syntaxRule1382);
            pattern83=pattern();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern83.getTree());
            pushFollow(FOLLOW_template_in_syntaxRule1384);
            template84=template();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, template84.getTree());
            pushFollow(FOLLOW_rpar_in_syntaxRule1386);
            rpar85=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar85.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "syntaxRule"

    public static class pattern_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pattern"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:197:1: pattern : ( patternIdentifier | lpar ( ( pattern )+ ( dot pattern | elipsis )? )? rpar | sharpLpar ( ( pattern )+ ( elipsis )? )? rpar | patternDatum );
    public final SchemeParser.pattern_return pattern() throws RecognitionException {
        SchemeParser.pattern_return retval = new SchemeParser.pattern_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.patternIdentifier_return patternIdentifier86 = null;

        SchemeParser.lpar_return lpar87 = null;

        SchemeParser.pattern_return pattern88 = null;

        SchemeParser.dot_return dot89 = null;

        SchemeParser.pattern_return pattern90 = null;

        SchemeParser.elipsis_return elipsis91 = null;

        SchemeParser.rpar_return rpar92 = null;

        SchemeParser.sharpLpar_return sharpLpar93 = null;

        SchemeParser.pattern_return pattern94 = null;

        SchemeParser.elipsis_return elipsis95 = null;

        SchemeParser.rpar_return rpar96 = null;

        SchemeParser.patternDatum_return patternDatum97 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:198:2: ( patternIdentifier | lpar ( ( pattern )+ ( dot pattern | elipsis )? )? rpar | sharpLpar ( ( pattern )+ ( elipsis )? )? rpar | patternDatum )
            int alt21=4;
            switch ( input.LA(1) ) {
            case BEGIN:
            case DEFINE:
            case VARIABLE:
            case ELSE:
            case ARROW:
            case UNQUOTE:
            case UNQUOTE_SPLICING:
            case QUOTE:
            case LAMBDA:
            case IF:
            case SET:
            case COND:
            case AND:
            case OR:
            case CASE:
            case LET:
            case LETSTAR:
            case LETREC:
            case DO:
            case DELAY:
            case QUASIQUOTE:
                {
                alt21=1;
                }
                break;
            case 153:
                {
                alt21=2;
                }
                break;
            case 155:
                {
                alt21=3;
                }
                break;
            case STRING:
            case CHARACTER:
            case NUM_2:
            case NUM_8:
            case NUM_10:
            case NUM_16:
            case TRUE:
            case FALSE:
                {
                alt21=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:198:4: patternIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_patternIdentifier_in_pattern1397);
                    patternIdentifier86=patternIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier86.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:4: lpar ( ( pattern )+ ( dot pattern | elipsis )? )? rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_pattern1402);
                    lpar87=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar87.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:9: ( ( pattern )+ ( dot pattern | elipsis )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==BEGIN||LA17_0==DEFINE||(LA17_0>=VARIABLE && LA17_0<=QUASIQUOTE)||(LA17_0>=NUM_2 && LA17_0<=FALSE)||LA17_0==153||LA17_0==155) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:11: ( pattern )+ ( dot pattern | elipsis )?
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:11: ( pattern )+
                            int cnt15=0;
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==BEGIN||LA15_0==DEFINE||(LA15_0>=VARIABLE && LA15_0<=QUASIQUOTE)||(LA15_0>=NUM_2 && LA15_0<=FALSE)||LA15_0==153||LA15_0==155) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:11: pattern
                            	    {
                            	    pushFollow(FOLLOW_pattern_in_pattern1406);
                            	    pattern88=pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern88.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt15 >= 1 ) break loop15;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(15, input);
                                        throw eee;
                                }
                                cnt15++;
                            } while (true);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:20: ( dot pattern | elipsis )?
                            int alt16=3;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==158) ) {
                                alt16=1;
                            }
                            else if ( (LA16_0==ELLIPSIS) ) {
                                alt16=2;
                            }
                            switch (alt16) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:22: dot pattern
                                    {
                                    pushFollow(FOLLOW_dot_in_pattern1411);
                                    dot89=dot();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dot89.getTree());
                                    pushFollow(FOLLOW_pattern_in_pattern1413);
                                    pattern90=pattern();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern90.getTree());

                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:199:36: elipsis
                                    {
                                    pushFollow(FOLLOW_elipsis_in_pattern1417);
                                    elipsis91=elipsis();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elipsis91.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_rpar_in_pattern1424);
                    rpar92=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar92.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:200:4: sharpLpar ( ( pattern )+ ( elipsis )? )? rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sharpLpar_in_pattern1429);
                    sharpLpar93=sharpLpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sharpLpar93.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:200:14: ( ( pattern )+ ( elipsis )? )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==BEGIN||LA20_0==DEFINE||(LA20_0>=VARIABLE && LA20_0<=QUASIQUOTE)||(LA20_0>=NUM_2 && LA20_0<=FALSE)||LA20_0==153||LA20_0==155) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:200:16: ( pattern )+ ( elipsis )?
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:200:16: ( pattern )+
                            int cnt18=0;
                            loop18:
                            do {
                                int alt18=2;
                                int LA18_0 = input.LA(1);

                                if ( (LA18_0==BEGIN||LA18_0==DEFINE||(LA18_0>=VARIABLE && LA18_0<=QUASIQUOTE)||(LA18_0>=NUM_2 && LA18_0<=FALSE)||LA18_0==153||LA18_0==155) ) {
                                    alt18=1;
                                }


                                switch (alt18) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:200:16: pattern
                            	    {
                            	    pushFollow(FOLLOW_pattern_in_pattern1433);
                            	    pattern94=pattern();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, pattern94.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt18 >= 1 ) break loop18;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(18, input);
                                        throw eee;
                                }
                                cnt18++;
                            } while (true);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:200:25: ( elipsis )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==ELLIPSIS) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:200:25: elipsis
                                    {
                                    pushFollow(FOLLOW_elipsis_in_pattern1436);
                                    elipsis95=elipsis();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elipsis95.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_rpar_in_pattern1442);
                    rpar96=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar96.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:201:4: patternDatum
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_patternDatum_in_pattern1447);
                    patternDatum97=patternDatum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, patternDatum97.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pattern"

    public static class patternIdentifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "patternIdentifier"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:204:1: patternIdentifier : ( syntacticKeyword -> ^( KEYWORD syntacticKeyword ) | VARIABLE -> ^( NAME VARIABLE ) );
    public final SchemeParser.patternIdentifier_return patternIdentifier() throws RecognitionException {
        SchemeParser.patternIdentifier_return retval = new SchemeParser.patternIdentifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE99=null;
        SchemeParser.syntacticKeyword_return syntacticKeyword98 = null;


        CommonTree VARIABLE99_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleSubtreeStream stream_syntacticKeyword=new RewriteRuleSubtreeStream(adaptor,"rule syntacticKeyword");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:205:2: ( syntacticKeyword -> ^( KEYWORD syntacticKeyword ) | VARIABLE -> ^( NAME VARIABLE ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==BEGIN||LA22_0==DEFINE||(LA22_0>=ELSE && LA22_0<=QUASIQUOTE)) ) {
                alt22=1;
            }
            else if ( (LA22_0==VARIABLE) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:205:4: syntacticKeyword
                    {
                    pushFollow(FOLLOW_syntacticKeyword_in_patternIdentifier1458);
                    syntacticKeyword98=syntacticKeyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_syntacticKeyword.add(syntacticKeyword98.getTree());


                    // AST REWRITE
                    // elements: syntacticKeyword
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 205:21: -> ^( KEYWORD syntacticKeyword )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:205:24: ^( KEYWORD syntacticKeyword )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                        adaptor.addChild(root_1, stream_syntacticKeyword.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:206:4: VARIABLE
                    {
                    VARIABLE99=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_patternIdentifier1473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE99);



                    // AST REWRITE
                    // elements: VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 206:15: -> ^( NAME VARIABLE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:206:18: ^( NAME VARIABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "patternIdentifier"

    public static class patternDatum_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "patternDatum"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:209:1: patternDatum : ( STRING -> ^( CONST STRING ) | CHARACTER -> ^( CONST CHARACTER ) | bool | number );
    public final SchemeParser.patternDatum_return patternDatum() throws RecognitionException {
        SchemeParser.patternDatum_return retval = new SchemeParser.patternDatum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING100=null;
        Token CHARACTER101=null;
        SchemeParser.bool_return bool102 = null;

        SchemeParser.number_return number103 = null;


        CommonTree STRING100_tree=null;
        CommonTree CHARACTER101_tree=null;
        RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:210:2: ( STRING -> ^( CONST STRING ) | CHARACTER -> ^( CONST CHARACTER ) | bool | number )
            int alt23=4;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt23=1;
                }
                break;
            case CHARACTER:
                {
                alt23=2;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt23=3;
                }
                break;
            case NUM_2:
            case NUM_8:
            case NUM_10:
            case NUM_16:
                {
                alt23=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:210:4: STRING
                    {
                    STRING100=(Token)match(input,STRING,FOLLOW_STRING_in_patternDatum1496); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING100);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 210:12: -> ^( CONST STRING )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:210:15: ^( CONST STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:211:4: CHARACTER
                    {
                    CHARACTER101=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_patternDatum1512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER101);



                    // AST REWRITE
                    // elements: CHARACTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 211:14: -> ^( CONST CHARACTER )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:211:17: ^( CONST CHARACTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_CHARACTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:212:4: bool
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_in_patternDatum1527);
                    bool102=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool102.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:213:4: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_patternDatum1532);
                    number103=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number103.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "patternDatum"

    public static class template_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "template"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:216:1: template : ( patternIdentifier | lpar ( ( templateElement )+ ( dot templateElement )? )? rpar | sharpLpar ( templateElement )* rpar | templateDatum );
    public final SchemeParser.template_return template() throws RecognitionException {
        SchemeParser.template_return retval = new SchemeParser.template_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.patternIdentifier_return patternIdentifier104 = null;

        SchemeParser.lpar_return lpar105 = null;

        SchemeParser.templateElement_return templateElement106 = null;

        SchemeParser.dot_return dot107 = null;

        SchemeParser.templateElement_return templateElement108 = null;

        SchemeParser.rpar_return rpar109 = null;

        SchemeParser.sharpLpar_return sharpLpar110 = null;

        SchemeParser.templateElement_return templateElement111 = null;

        SchemeParser.rpar_return rpar112 = null;

        SchemeParser.templateDatum_return templateDatum113 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:217:2: ( patternIdentifier | lpar ( ( templateElement )+ ( dot templateElement )? )? rpar | sharpLpar ( templateElement )* rpar | templateDatum )
            int alt28=4;
            switch ( input.LA(1) ) {
            case BEGIN:
            case DEFINE:
            case VARIABLE:
            case ELSE:
            case ARROW:
            case UNQUOTE:
            case UNQUOTE_SPLICING:
            case QUOTE:
            case LAMBDA:
            case IF:
            case SET:
            case COND:
            case AND:
            case OR:
            case CASE:
            case LET:
            case LETSTAR:
            case LETREC:
            case DO:
            case DELAY:
            case QUASIQUOTE:
                {
                alt28=1;
                }
                break;
            case 153:
                {
                alt28=2;
                }
                break;
            case 155:
                {
                alt28=3;
                }
                break;
            case STRING:
            case CHARACTER:
            case NUM_2:
            case NUM_8:
            case NUM_10:
            case NUM_16:
            case TRUE:
            case FALSE:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:217:4: patternIdentifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_patternIdentifier_in_template1543);
                    patternIdentifier104=patternIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, patternIdentifier104.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:218:4: lpar ( ( templateElement )+ ( dot templateElement )? )? rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_template1548);
                    lpar105=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar105.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:218:9: ( ( templateElement )+ ( dot templateElement )? )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BEGIN||LA26_0==DEFINE||(LA26_0>=VARIABLE && LA26_0<=QUASIQUOTE)||(LA26_0>=NUM_2 && LA26_0<=FALSE)||LA26_0==153||LA26_0==155) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:218:11: ( templateElement )+ ( dot templateElement )?
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:218:11: ( templateElement )+
                            int cnt24=0;
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==BEGIN||LA24_0==DEFINE||(LA24_0>=VARIABLE && LA24_0<=QUASIQUOTE)||(LA24_0>=NUM_2 && LA24_0<=FALSE)||LA24_0==153||LA24_0==155) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:218:11: templateElement
                            	    {
                            	    pushFollow(FOLLOW_templateElement_in_template1552);
                            	    templateElement106=templateElement();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement106.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt24 >= 1 ) break loop24;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(24, input);
                                        throw eee;
                                }
                                cnt24++;
                            } while (true);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:218:28: ( dot templateElement )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==158) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:218:30: dot templateElement
                                    {
                                    pushFollow(FOLLOW_dot_in_template1557);
                                    dot107=dot();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dot107.getTree());
                                    pushFollow(FOLLOW_templateElement_in_template1559);
                                    templateElement108=templateElement();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement108.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_rpar_in_template1566);
                    rpar109=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar109.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:219:4: sharpLpar ( templateElement )* rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sharpLpar_in_template1571);
                    sharpLpar110=sharpLpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sharpLpar110.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:219:14: ( templateElement )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==BEGIN||LA27_0==DEFINE||(LA27_0>=VARIABLE && LA27_0<=QUASIQUOTE)||(LA27_0>=NUM_2 && LA27_0<=FALSE)||LA27_0==153||LA27_0==155) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:219:14: templateElement
                    	    {
                    	    pushFollow(FOLLOW_templateElement_in_template1573);
                    	    templateElement111=templateElement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, templateElement111.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    pushFollow(FOLLOW_rpar_in_template1576);
                    rpar112=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar112.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:220:4: templateDatum
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_templateDatum_in_template1581);
                    templateDatum113=templateDatum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, templateDatum113.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "template"

    public static class templateElement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "templateElement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:223:1: templateElement : template ( elipsis )? ;
    public final SchemeParser.templateElement_return templateElement() throws RecognitionException {
        SchemeParser.templateElement_return retval = new SchemeParser.templateElement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.template_return template114 = null;

        SchemeParser.elipsis_return elipsis115 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:224:2: ( template ( elipsis )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:224:4: template ( elipsis )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_template_in_templateElement1592);
            template114=template();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, template114.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:224:13: ( elipsis )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==ELLIPSIS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:224:13: elipsis
                    {
                    pushFollow(FOLLOW_elipsis_in_templateElement1594);
                    elipsis115=elipsis();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elipsis115.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "templateElement"

    public static class templateDatum_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "templateDatum"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:227:1: templateDatum : patternDatum ;
    public final SchemeParser.templateDatum_return templateDatum() throws RecognitionException {
        SchemeParser.templateDatum_return retval = new SchemeParser.templateDatum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.patternDatum_return patternDatum116 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:228:2: ( patternDatum )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:228:4: patternDatum
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_patternDatum_in_templateDatum1606);
            patternDatum116=patternDatum();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, patternDatum116.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "templateDatum"

    public static class identifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:231:1: identifier : ( syntacticKeyword -> ^( KEYWORD syntacticKeyword ) | variable );
    public final SchemeParser.identifier_return identifier() throws RecognitionException {
        SchemeParser.identifier_return retval = new SchemeParser.identifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.syntacticKeyword_return syntacticKeyword117 = null;

        SchemeParser.variable_return variable118 = null;


        RewriteRuleSubtreeStream stream_syntacticKeyword=new RewriteRuleSubtreeStream(adaptor,"rule syntacticKeyword");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:232:2: ( syntacticKeyword -> ^( KEYWORD syntacticKeyword ) | variable )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==BEGIN||LA30_0==DEFINE||(LA30_0>=ELSE && LA30_0<=QUASIQUOTE)) ) {
                alt30=1;
            }
            else if ( (LA30_0==ELLIPSIS||LA30_0==VARIABLE) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:232:4: syntacticKeyword
                    {
                    pushFollow(FOLLOW_syntacticKeyword_in_identifier1617);
                    syntacticKeyword117=syntacticKeyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_syntacticKeyword.add(syntacticKeyword117.getTree());


                    // AST REWRITE
                    // elements: syntacticKeyword
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 232:21: -> ^( KEYWORD syntacticKeyword )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:232:24: ^( KEYWORD syntacticKeyword )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                        adaptor.addChild(root_1, stream_syntacticKeyword.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:233:4: variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_identifier1632);
                    variable118=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable118.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "identifier"

    public static class syntacticKeyword_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "syntacticKeyword"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:236:1: syntacticKeyword : ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING );
    public final SchemeParser.syntacticKeyword_return syntacticKeyword() throws RecognitionException {
        SchemeParser.syntacticKeyword_return retval = new SchemeParser.syntacticKeyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSE120=null;
        Token ARROW121=null;
        Token DEFINE122=null;
        Token UNQUOTE123=null;
        Token UNQUOTE_SPLICING124=null;
        SchemeParser.expressionKeyword_return expressionKeyword119 = null;


        CommonTree ELSE120_tree=null;
        CommonTree ARROW121_tree=null;
        CommonTree DEFINE122_tree=null;
        CommonTree UNQUOTE123_tree=null;
        CommonTree UNQUOTE_SPLICING124_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:237:2: ( expressionKeyword | ELSE | ARROW | DEFINE | UNQUOTE | UNQUOTE_SPLICING )
            int alt31=6;
            switch ( input.LA(1) ) {
            case BEGIN:
            case QUOTE:
            case LAMBDA:
            case IF:
            case SET:
            case COND:
            case AND:
            case OR:
            case CASE:
            case LET:
            case LETSTAR:
            case LETREC:
            case DO:
            case DELAY:
            case QUASIQUOTE:
                {
                alt31=1;
                }
                break;
            case ELSE:
                {
                alt31=2;
                }
                break;
            case ARROW:
                {
                alt31=3;
                }
                break;
            case DEFINE:
                {
                alt31=4;
                }
                break;
            case UNQUOTE:
                {
                alt31=5;
                }
                break;
            case UNQUOTE_SPLICING:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:237:4: expressionKeyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionKeyword_in_syntacticKeyword1643);
                    expressionKeyword119=expressionKeyword();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionKeyword119.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:238:4: ELSE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ELSE120=(Token)match(input,ELSE,FOLLOW_ELSE_in_syntacticKeyword1648); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ELSE120_tree = (CommonTree)adaptor.create(ELSE120);
                    adaptor.addChild(root_0, ELSE120_tree);
                    }

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:239:4: ARROW
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    ARROW121=(Token)match(input,ARROW,FOLLOW_ARROW_in_syntacticKeyword1653); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ARROW121_tree = (CommonTree)adaptor.create(ARROW121);
                    adaptor.addChild(root_0, ARROW121_tree);
                    }

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:240:4: DEFINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    DEFINE122=(Token)match(input,DEFINE,FOLLOW_DEFINE_in_syntacticKeyword1658); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DEFINE122_tree = (CommonTree)adaptor.create(DEFINE122);
                    adaptor.addChild(root_0, DEFINE122_tree);
                    }

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:241:4: UNQUOTE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNQUOTE123=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_syntacticKeyword1663); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNQUOTE123_tree = (CommonTree)adaptor.create(UNQUOTE123);
                    adaptor.addChild(root_0, UNQUOTE123_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:242:4: UNQUOTE_SPLICING
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    UNQUOTE_SPLICING124=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword1668); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNQUOTE_SPLICING124_tree = (CommonTree)adaptor.create(UNQUOTE_SPLICING124);
                    adaptor.addChild(root_0, UNQUOTE_SPLICING124_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "syntacticKeyword"

    public static class expressionKeyword_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionKeyword"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:245:1: expressionKeyword : ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE );
    public final SchemeParser.expressionKeyword_return expressionKeyword() throws RecognitionException {
        SchemeParser.expressionKeyword_return retval = new SchemeParser.expressionKeyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set125=null;

        CommonTree set125_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:246:2: ( QUOTE | LAMBDA | IF | SET | BEGIN | COND | AND | OR | CASE | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set125=(Token)input.LT(1);
            if ( input.LA(1)==BEGIN||(input.LA(1)>=QUOTE && input.LA(1)<=QUASIQUOTE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set125));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expressionKeyword"

    public static class branchExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "branchExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:263:1: branchExpression : ( ( lpar COND )=> condExpression | ( lpar IF )=> conditional | ( unlessExpression )=> unlessExpression | ( whenExpression )=> whenExpression | derivedBranchExpression );
    public final SchemeParser.branchExpression_return branchExpression() throws RecognitionException {
        SchemeParser.branchExpression_return retval = new SchemeParser.branchExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.condExpression_return condExpression126 = null;

        SchemeParser.conditional_return conditional127 = null;

        SchemeParser.unlessExpression_return unlessExpression128 = null;

        SchemeParser.whenExpression_return whenExpression129 = null;

        SchemeParser.derivedBranchExpression_return derivedBranchExpression130 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:264:3: ( ( lpar COND )=> condExpression | ( lpar IF )=> conditional | ( unlessExpression )=> unlessExpression | ( whenExpression )=> whenExpression | derivedBranchExpression )
            int alt32=5;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==153) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==UNLESS) && (synpred22_Scheme())) {
                    alt32=3;
                }
                else if ( (LA32_1==IF) && (synpred21_Scheme())) {
                    alt32=2;
                }
                else if ( (LA32_1==WHEN) && (synpred23_Scheme())) {
                    alt32=4;
                }
                else if ( (LA32_1==COND) && (synpred20_Scheme())) {
                    alt32=1;
                }
                else if ( (LA32_1==CASE) ) {
                    alt32=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:264:5: ( lpar COND )=> condExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_condExpression_in_branchExpression1774);
                    condExpression126=condExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, condExpression126.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:265:5: ( lpar IF )=> conditional
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_conditional_in_branchExpression1795);
                    conditional127=conditional();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditional127.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:266:5: ( unlessExpression )=> unlessExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unlessExpression_in_branchExpression1809);
                    unlessExpression128=unlessExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unlessExpression128.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:267:5: ( whenExpression )=> whenExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whenExpression_in_branchExpression1823);
                    whenExpression129=whenExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, whenExpression129.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:268:5: derivedBranchExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_derivedBranchExpression_in_branchExpression1831);
                    derivedBranchExpression130=derivedBranchExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedBranchExpression130.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "branchExpression"

    public static class nonJumpExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonJumpExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:271:1: nonJumpExpression : ( ( lpar ( COND | IF | UNLESS | WHEN | CASE ) )=> branchExpression | ( lpar DO )=> derivedLoopExpression );
    public final SchemeParser.nonJumpExpression_return nonJumpExpression() throws RecognitionException {
        SchemeParser.nonJumpExpression_return retval = new SchemeParser.nonJumpExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.branchExpression_return branchExpression131 = null;

        SchemeParser.derivedLoopExpression_return derivedLoopExpression132 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:272:3: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE ) )=> branchExpression | ( lpar DO )=> derivedLoopExpression )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==153) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==WHEN) && (synpred24_Scheme())) {
                    alt33=1;
                }
                else if ( (LA33_1==DO) && (synpred25_Scheme())) {
                    alt33=2;
                }
                else if ( (LA33_1==CASE) && (synpred24_Scheme())) {
                    alt33=1;
                }
                else if ( (LA33_1==UNLESS) && (synpred24_Scheme())) {
                    alt33=1;
                }
                else if ( (LA33_1==COND) && (synpred24_Scheme())) {
                    alt33=1;
                }
                else if ( (LA33_1==IF) && (synpred24_Scheme())) {
                    alt33=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:272:5: ( lpar ( COND | IF | UNLESS | WHEN | CASE ) )=> branchExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_branchExpression_in_nonJumpExpression1873);
                    branchExpression131=branchExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, branchExpression131.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:273:5: ( lpar DO )=> derivedLoopExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_derivedLoopExpression_in_nonJumpExpression1887);
                    derivedLoopExpression132=derivedLoopExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedLoopExpression132.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "nonJumpExpression"

    public static class jumpableExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jumpableExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:276:1: jumpableExpression : ( ( lpar SET )=> assignment | ( variable )=> variable | ( literal )=> literal | ( lpar VARIABLE )=> oprtr | ( lpar operator )=> procedureCall | ( lpar callCC )=> callCCExpr | ( lpar LAMBDA )=> lambdaExpression | ( derivedExpression )=> derivedExpression | ( lpar APPLY )=> applyExpression | ( macroUse )=> macroUse | macroBlock | contCall );
    public final SchemeParser.jumpableExpression_return jumpableExpression() throws RecognitionException {
        SchemeParser.jumpableExpression_return retval = new SchemeParser.jumpableExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.assignment_return assignment133 = null;

        SchemeParser.variable_return variable134 = null;

        SchemeParser.literal_return literal135 = null;

        SchemeParser.oprtr_return oprtr136 = null;

        SchemeParser.procedureCall_return procedureCall137 = null;

        SchemeParser.callCCExpr_return callCCExpr138 = null;

        SchemeParser.lambdaExpression_return lambdaExpression139 = null;

        SchemeParser.derivedExpression_return derivedExpression140 = null;

        SchemeParser.applyExpression_return applyExpression141 = null;

        SchemeParser.macroUse_return macroUse142 = null;

        SchemeParser.macroBlock_return macroBlock143 = null;

        SchemeParser.contCall_return contCall144 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:277:2: ( ( lpar SET )=> assignment | ( variable )=> variable | ( literal )=> literal | ( lpar VARIABLE )=> oprtr | ( lpar operator )=> procedureCall | ( lpar callCC )=> callCCExpr | ( lpar LAMBDA )=> lambdaExpression | ( derivedExpression )=> derivedExpression | ( lpar APPLY )=> applyExpression | ( macroUse )=> macroUse | macroBlock | contCall )
            int alt34=12;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:277:4: ( lpar SET )=> assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_jumpableExpression1918);
                    assignment133=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment133.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:278:5: ( variable )=> variable
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variable_in_jumpableExpression1941);
                    variable134=variable();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variable134.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:279:4: ( literal )=> literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_jumpableExpression1963);
                    literal135=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal135.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:280:5: ( lpar VARIABLE )=> oprtr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_oprtr_in_jumpableExpression1981);
                    oprtr136=oprtr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, oprtr136.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:281:4: ( lpar operator )=> procedureCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureCall_in_jumpableExpression1999);
                    procedureCall137=procedureCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureCall137.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:282:4: ( lpar callCC )=> callCCExpr
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_callCCExpr_in_jumpableExpression2019);
                    callCCExpr138=callCCExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, callCCExpr138.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:283:4: ( lpar LAMBDA )=> lambdaExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lambdaExpression_in_jumpableExpression2034);
                    lambdaExpression139=lambdaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lambdaExpression139.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:284:4: ( derivedExpression )=> derivedExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_derivedExpression_in_jumpableExpression2046);
                    derivedExpression140=derivedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, derivedExpression140.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:285:4: ( lpar APPLY )=> applyExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_applyExpression_in_jumpableExpression2061);
                    applyExpression141=applyExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, applyExpression141.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:286:4: ( macroUse )=> macroUse
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_macroUse_in_jumpableExpression2082);
                    macroUse142=macroUse();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, macroUse142.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:287:5: macroBlock
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_macroBlock_in_jumpableExpression2088);
                    macroBlock143=macroBlock();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, macroBlock143.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:288:5: contCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_contCall_in_jumpableExpression2095);
                    contCall144=contCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, contCall144.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "jumpableExpression"

    public static class fullExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fullExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:291:1: fullExpression : ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression );
    public final SchemeParser.fullExpression_return fullExpression() throws RecognitionException {
        SchemeParser.fullExpression_return retval = new SchemeParser.fullExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.nonJumpExpression_return nonJumpExpression145 = null;

        SchemeParser.jumpableExpression_return jumpableExpression146 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:292:2: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression )
            int alt35=2;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:292:4: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nonJumpExpression_in_fullExpression2136);
                    nonJumpExpression145=nonJumpExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonJumpExpression145.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:294:4: jumpableExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_jumpableExpression_in_fullExpression2143);
                    jumpableExpression146=jumpableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, jumpableExpression146.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fullExpression"

    public static class assign_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:296:1: assign : ( lpar SET )=> assignment ;
    public final SchemeParser.assign_return assign() throws RecognitionException {
        SchemeParser.assign_return retval = new SchemeParser.assign_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.assignment_return assignment147 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:297:3: ( ( lpar SET )=> assignment )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:297:5: ( lpar SET )=> assignment
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_assignment_in_assign2171);
            assignment147=assignment();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment147.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign"

    public static class oprtr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "oprtr"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:300:1: oprtr : ({...}? lpar VARIABLE ( fullExpression )* rpar -> lpar ^( OPERATOR VARIABLE ( fullExpression )* ) rpar | {...}? lpar VARIABLE ( fullExpression )* rpar -> lpar ^( COMPARISON_OPERATOR VARIABLE ( fullExpression )* ) rpar );
    public final SchemeParser.oprtr_return oprtr() throws RecognitionException {
        SchemeParser.oprtr_return retval = new SchemeParser.oprtr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE149=null;
        Token VARIABLE153=null;
        SchemeParser.lpar_return lpar148 = null;

        SchemeParser.fullExpression_return fullExpression150 = null;

        SchemeParser.rpar_return rpar151 = null;

        SchemeParser.lpar_return lpar152 = null;

        SchemeParser.fullExpression_return fullExpression154 = null;

        SchemeParser.rpar_return rpar155 = null;


        CommonTree VARIABLE149_tree=null;
        CommonTree VARIABLE153_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:301:2: ({...}? lpar VARIABLE ( fullExpression )* rpar -> lpar ^( OPERATOR VARIABLE ( fullExpression )* ) rpar | {...}? lpar VARIABLE ( fullExpression )* rpar -> lpar ^( COMPARISON_OPERATOR VARIABLE ( fullExpression )* ) rpar )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==153) ) {
                int LA38_1 = input.LA(2);

                if ( (( symtab.isOperator(input.LT(2).getText()))) ) {
                    alt38=1;
                }
                else if ( (( symtab.isComparisonOperator(input.LT(2).getText()))) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:301:4: {...}? lpar VARIABLE ( fullExpression )* rpar
                    {
                    if ( !(( symtab.isOperator(input.LT(2).getText()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "oprtr", " symtab.isOperator(input.LT(2).getText())");
                    }
                    pushFollow(FOLLOW_lpar_in_oprtr2186);
                    lpar148=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar148.getTree());
                    VARIABLE149=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_oprtr2188); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE149);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:301:63: ( fullExpression )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==ELLIPSIS||(LA36_0>=VARIABLE && LA36_0<=CHARACTER)||(LA36_0>=NUM_2 && LA36_0<=FALSE)||LA36_0==153||(LA36_0>=156 && LA36_0<=157)||LA36_0==160) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:301:63: fullExpression
                    	    {
                    	    pushFollow(FOLLOW_fullExpression_in_oprtr2190);
                    	    fullExpression150=fullExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression150.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    pushFollow(FOLLOW_rpar_in_oprtr2193);
                    rpar151=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar151.getTree());


                    // AST REWRITE
                    // elements: rpar, fullExpression, lpar, VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 302:3: -> lpar ^( OPERATOR VARIABLE ( fullExpression )* ) rpar
                    {
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:302:11: ^( OPERATOR VARIABLE ( fullExpression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:302:33: ( fullExpression )*
                        while ( stream_fullExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_fullExpression.nextTree());

                        }
                        stream_fullExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_rpar.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:304:3: {...}? lpar VARIABLE ( fullExpression )* rpar
                    {
                    if ( !(( symtab.isComparisonOperator(input.LT(2).getText()))) ) {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        throw new FailedPredicateException(input, "oprtr", " symtab.isComparisonOperator(input.LT(2).getText())");
                    }
                    pushFollow(FOLLOW_lpar_in_oprtr2222);
                    lpar152=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar152.getTree());
                    VARIABLE153=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_oprtr2224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE153);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:304:72: ( fullExpression )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==ELLIPSIS||(LA37_0>=VARIABLE && LA37_0<=CHARACTER)||(LA37_0>=NUM_2 && LA37_0<=FALSE)||LA37_0==153||(LA37_0>=156 && LA37_0<=157)||LA37_0==160) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:304:72: fullExpression
                    	    {
                    	    pushFollow(FOLLOW_fullExpression_in_oprtr2226);
                    	    fullExpression154=fullExpression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression154.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    pushFollow(FOLLOW_rpar_in_oprtr2229);
                    rpar155=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar155.getTree());


                    // AST REWRITE
                    // elements: rpar, lpar, VARIABLE, fullExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 305:5: -> lpar ^( COMPARISON_OPERATOR VARIABLE ( fullExpression )* ) rpar
                    {
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:305:13: ^( COMPARISON_OPERATOR VARIABLE ( fullExpression )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:305:46: ( fullExpression )*
                        while ( stream_fullExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_fullExpression.nextTree());

                        }
                        stream_fullExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_rpar.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "oprtr"

    public static class contCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "contCall"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:309:1: contCall : {...}? lpar VARIABLE ( fullExpression )* rpar -> ^( JUMP_STATEMENT lpar ^( NAME VARIABLE ) ( fullExpression )* rpar ) ;
    public final SchemeParser.contCall_return contCall() throws RecognitionException {
        SchemeParser.contCall_return retval = new SchemeParser.contCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE157=null;
        SchemeParser.lpar_return lpar156 = null;

        SchemeParser.fullExpression_return fullExpression158 = null;

        SchemeParser.rpar_return rpar159 = null;


        CommonTree VARIABLE157_tree=null;
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:310:2: ({...}? lpar VARIABLE ( fullExpression )* rpar -> ^( JUMP_STATEMENT lpar ^( NAME VARIABLE ) ( fullExpression )* rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:310:4: {...}? lpar VARIABLE ( fullExpression )* rpar
            {
            if ( !(( symtab.contains(input.LT(2).getText()) )) ) {
                if (state.backtracking>0) {state.failed=true; return retval;}
                throw new FailedPredicateException(input, "contCall", " symtab.contains(input.LT(2).getText()) ");
            }
            pushFollow(FOLLOW_lpar_in_contCall2266);
            lpar156=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar156.getTree());
            VARIABLE157=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_contCall2268); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE157);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:310:62: ( fullExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ELLIPSIS||(LA39_0>=VARIABLE && LA39_0<=CHARACTER)||(LA39_0>=NUM_2 && LA39_0<=FALSE)||LA39_0==153||(LA39_0>=156 && LA39_0<=157)||LA39_0==160) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:310:62: fullExpression
            	    {
            	    pushFollow(FOLLOW_fullExpression_in_contCall2270);
            	    fullExpression158=fullExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression158.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_contCall2273);
            rpar159=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar159.getTree());


            // AST REWRITE
            // elements: VARIABLE, lpar, rpar, fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 311:3: -> ^( JUMP_STATEMENT lpar ^( NAME VARIABLE ) ( fullExpression )* rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:311:6: ^( JUMP_STATEMENT lpar ^( NAME VARIABLE ) ( fullExpression )* rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:311:29: ^( NAME VARIABLE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_VARIABLE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:311:48: ( fullExpression )*
                while ( stream_fullExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_fullExpression.nextTree());

                }
                stream_fullExpression.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "contCall"

    public static class variable_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variable"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:314:1: variable : ( VARIABLE -> ^( NAME VARIABLE ) | ELLIPSIS -> ^( SEPARATOR ELLIPSIS ) );
    public final SchemeParser.variable_return variable() throws RecognitionException {
        SchemeParser.variable_return retval = new SchemeParser.variable_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VARIABLE160=null;
        Token ELLIPSIS161=null;

        CommonTree VARIABLE160_tree=null;
        CommonTree ELLIPSIS161_tree=null;
        RewriteRuleTokenStream stream_ELLIPSIS=new RewriteRuleTokenStream(adaptor,"token ELLIPSIS");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:315:2: ( VARIABLE -> ^( NAME VARIABLE ) | ELLIPSIS -> ^( SEPARATOR ELLIPSIS ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==VARIABLE) ) {
                alt40=1;
            }
            else if ( (LA40_0==ELLIPSIS) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:315:4: VARIABLE
                    {
                    VARIABLE160=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_variable2309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE160);



                    // AST REWRITE
                    // elements: VARIABLE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 315:16: -> ^( NAME VARIABLE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:315:19: ^( NAME VARIABLE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

                        adaptor.addChild(root_1, stream_VARIABLE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:316:4: ELLIPSIS
                    {
                    ELLIPSIS161=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_variable2327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELLIPSIS.add(ELLIPSIS161);



                    // AST REWRITE
                    // elements: ELLIPSIS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 316:16: -> ^( SEPARATOR ELLIPSIS )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:316:19: ^( SEPARATOR ELLIPSIS )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_ELLIPSIS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variable"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:319:1: literal : ( quotation | selfEvaluating );
    public final SchemeParser.literal_return literal() throws RecognitionException {
        SchemeParser.literal_return retval = new SchemeParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.quotation_return quotation162 = null;

        SchemeParser.selfEvaluating_return selfEvaluating163 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:320:2: ( quotation | selfEvaluating )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==153||(LA41_0>=156 && LA41_0<=157)) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=STRING && LA41_0<=CHARACTER)||(LA41_0>=NUM_2 && LA41_0<=FALSE)) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:320:4: quotation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_quotation_in_literal2351);
                    quotation162=quotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, quotation162.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:321:4: selfEvaluating
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_selfEvaluating_in_literal2356);
                    selfEvaluating163=selfEvaluating();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, selfEvaluating163.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class quot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quot"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:324:1: quot : '\\'' -> ^( SEPARATOR '\\'' ) ;
    public final SchemeParser.quot_return quot() throws RecognitionException {
        SchemeParser.quot_return retval = new SchemeParser.quot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal164=null;

        CommonTree char_literal164_tree=null;
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:324:6: ( '\\'' -> ^( SEPARATOR '\\'' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:324:8: '\\''
            {
            char_literal164=(Token)match(input,156,FOLLOW_156_in_quot2366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_156.add(char_literal164);



            // AST REWRITE
            // elements: 156
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 324:13: -> ^( SEPARATOR '\\'' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:324:16: ^( SEPARATOR '\\'' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_156.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quot"

    public static class quotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quotation"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:326:1: quotation : ( quot datum | '\\'()' -> ^( CONST '\\'()' ) | lpar QUOTE datum rpar -> lpar ^( SEPARATOR QUOTE ) datum rpar );
    public final SchemeParser.quotation_return quotation() throws RecognitionException {
        SchemeParser.quotation_return retval = new SchemeParser.quotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal167=null;
        Token QUOTE169=null;
        SchemeParser.quot_return quot165 = null;

        SchemeParser.datum_return datum166 = null;

        SchemeParser.lpar_return lpar168 = null;

        SchemeParser.datum_return datum170 = null;

        SchemeParser.rpar_return rpar171 = null;


        CommonTree string_literal167_tree=null;
        CommonTree QUOTE169_tree=null;
        RewriteRuleTokenStream stream_QUOTE=new RewriteRuleTokenStream(adaptor,"token QUOTE");
        RewriteRuleTokenStream stream_157=new RewriteRuleTokenStream(adaptor,"token 157");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_datum=new RewriteRuleSubtreeStream(adaptor,"rule datum");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:327:2: ( quot datum | '\\'()' -> ^( CONST '\\'()' ) | lpar QUOTE datum rpar -> lpar ^( SEPARATOR QUOTE ) datum rpar )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 156:
                {
                alt42=1;
                }
                break;
            case 157:
                {
                alt42=2;
                }
                break;
            case 153:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:327:4: quot datum
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_quot_in_quotation2386);
                    quot165=quot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, quot165.getTree());
                    pushFollow(FOLLOW_datum_in_quotation2388);
                    datum166=datum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datum166.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:328:4: '\\'()'
                    {
                    string_literal167=(Token)match(input,157,FOLLOW_157_in_quotation2393); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_157.add(string_literal167);



                    // AST REWRITE
                    // elements: 157
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:15: -> ^( CONST '\\'()' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:328:18: ^( CONST '\\'()' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_157.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:329:4: lpar QUOTE datum rpar
                    {
                    pushFollow(FOLLOW_lpar_in_quotation2412);
                    lpar168=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar168.getTree());
                    QUOTE169=(Token)match(input,QUOTE,FOLLOW_QUOTE_in_quotation2414); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_QUOTE.add(QUOTE169);

                    pushFollow(FOLLOW_datum_in_quotation2416);
                    datum170=datum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_datum.add(datum170.getTree());
                    pushFollow(FOLLOW_rpar_in_quotation2418);
                    rpar171=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar171.getTree());


                    // AST REWRITE
                    // elements: datum, QUOTE, lpar, rpar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 329:27: -> lpar ^( SEPARATOR QUOTE ) datum rpar
                    {
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:329:35: ^( SEPARATOR QUOTE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_QUOTE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_datum.nextTree());
                        adaptor.addChild(root_0, stream_rpar.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quotation"

    public static class selfEvaluating_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selfEvaluating"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:332:1: selfEvaluating : ( bool | number | CHARACTER -> ^( CONST CHARACTER ) | STRING -> ^( CONST STRING ) );
    public final SchemeParser.selfEvaluating_return selfEvaluating() throws RecognitionException {
        SchemeParser.selfEvaluating_return retval = new SchemeParser.selfEvaluating_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHARACTER174=null;
        Token STRING175=null;
        SchemeParser.bool_return bool172 = null;

        SchemeParser.number_return number173 = null;


        CommonTree CHARACTER174_tree=null;
        CommonTree STRING175_tree=null;
        RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:333:2: ( bool | number | CHARACTER -> ^( CONST CHARACTER ) | STRING -> ^( CONST STRING ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
                {
                alt43=1;
                }
                break;
            case NUM_2:
            case NUM_8:
            case NUM_10:
            case NUM_16:
                {
                alt43=2;
                }
                break;
            case CHARACTER:
                {
                alt43=3;
                }
                break;
            case STRING:
                {
                alt43=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:333:4: bool
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_in_selfEvaluating2446);
                    bool172=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool172.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:334:4: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_selfEvaluating2451);
                    number173=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number173.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:335:4: CHARACTER
                    {
                    CHARACTER174=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_selfEvaluating2456); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER174);



                    // AST REWRITE
                    // elements: CHARACTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 335:14: -> ^( CONST CHARACTER )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:335:17: ^( CONST CHARACTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_CHARACTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:336:4: STRING
                    {
                    STRING175=(Token)match(input,STRING,FOLLOW_STRING_in_selfEvaluating2471); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING175);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 336:12: -> ^( CONST STRING )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:336:15: ^( CONST STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "selfEvaluating"

    public static class lambdaExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lambdaExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:339:1: lambdaExpression : lpar LAMBDA formals body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST formals ) ^( PROCEDURE_BODY body ) rpar ) ;
    public final SchemeParser.lambdaExpression_return lambdaExpression() throws RecognitionException {
        SchemeParser.lambdaExpression_return retval = new SchemeParser.lambdaExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAMBDA177=null;
        SchemeParser.lpar_return lpar176 = null;

        SchemeParser.formals_return formals178 = null;

        SchemeParser.body_return body179 = null;

        SchemeParser.rpar_return rpar180 = null;


        CommonTree LAMBDA177_tree=null;
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_formals=new RewriteRuleSubtreeStream(adaptor,"rule formals");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:340:2: ( lpar LAMBDA formals body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST formals ) ^( PROCEDURE_BODY body ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:340:4: lpar LAMBDA formals body rpar
            {
            pushFollow(FOLLOW_lpar_in_lambdaExpression2493);
            lpar176=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar176.getTree());
            LAMBDA177=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_lambdaExpression2495); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LAMBDA.add(LAMBDA177);

            pushFollow(FOLLOW_formals_in_lambdaExpression2497);
            formals178=formals();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formals.add(formals178.getTree());
            pushFollow(FOLLOW_body_in_lambdaExpression2499);
            body179=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body179.getTree());
            pushFollow(FOLLOW_rpar_in_lambdaExpression2501);
            rpar180=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar180.getTree());


            // AST REWRITE
            // elements: rpar, body, lpar, formals, LAMBDA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 342:3: -> ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST formals ) ^( PROCEDURE_BODY body ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:342:6: ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST formals ) ^( PROCEDURE_BODY body ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:343:10: ^( KEYWORD LAMBDA )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_LAMBDA.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:344:6: ^( FORMAL_PARAM_LIST formals )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                adaptor.addChild(root_2, stream_formals.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:345:6: ^( PROCEDURE_BODY body )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lambdaExpression"

    public static class callCCLambdaExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callCCLambdaExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:348:1: callCCLambdaExpression : lpar LAMBDA lpar VARIABLE rpar body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST lpar ^( NAME VARIABLE ) rpar ) ^( PROCEDURE_BODY body ) rpar ) ;
    public final SchemeParser.callCCLambdaExpression_return callCCLambdaExpression() throws RecognitionException {
        SchemeParser.callCCLambdaExpression_return retval = new SchemeParser.callCCLambdaExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAMBDA182=null;
        Token VARIABLE184=null;
        SchemeParser.lpar_return lpar181 = null;

        SchemeParser.lpar_return lpar183 = null;

        SchemeParser.rpar_return rpar185 = null;

        SchemeParser.body_return body186 = null;

        SchemeParser.rpar_return rpar187 = null;


        CommonTree LAMBDA182_tree=null;
        CommonTree VARIABLE184_tree=null;
        RewriteRuleTokenStream stream_LAMBDA=new RewriteRuleTokenStream(adaptor,"token LAMBDA");
        RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:349:2: ( lpar LAMBDA lpar VARIABLE rpar body rpar -> ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST lpar ^( NAME VARIABLE ) rpar ) ^( PROCEDURE_BODY body ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:349:4: lpar LAMBDA lpar VARIABLE rpar body rpar
            {
            pushFollow(FOLLOW_lpar_in_callCCLambdaExpression2565);
            lpar181=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar181.getTree());
            LAMBDA182=(Token)match(input,LAMBDA,FOLLOW_LAMBDA_in_callCCLambdaExpression2567); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LAMBDA.add(LAMBDA182);

            pushFollow(FOLLOW_lpar_in_callCCLambdaExpression2571);
            lpar183=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar183.getTree());
            if ( state.backtracking==0 ) {
               symtab.openScope(); 
            }
            VARIABLE184=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_callCCLambdaExpression2577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_VARIABLE.add(VARIABLE184);

            if ( state.backtracking==0 ) {
               symtab.insert((VARIABLE184!=null?VARIABLE184.getText():null)); 
            }
            pushFollow(FOLLOW_rpar_in_callCCLambdaExpression2583);
            rpar185=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar185.getTree());
            pushFollow(FOLLOW_body_in_callCCLambdaExpression2585);
            body186=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body186.getTree());
            pushFollow(FOLLOW_rpar_in_callCCLambdaExpression2589);
            rpar187=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar187.getTree());
            if ( state.backtracking==0 ) {
               symtab.closeScope(); 
            }


            // AST REWRITE
            // elements: LAMBDA, rpar, rpar, lpar, body, lpar, VARIABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 355:3: -> ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST lpar ^( NAME VARIABLE ) rpar ) ^( PROCEDURE_BODY body ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:355:6: ^( FUNCTION_DECL lpar ^( KEYWORD LAMBDA ) ^( FORMAL_PARAM_LIST lpar ^( NAME VARIABLE ) rpar ) ^( PROCEDURE_BODY body ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:356:10: ^( KEYWORD LAMBDA )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_LAMBDA.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:357:6: ^( FORMAL_PARAM_LIST lpar ^( NAME VARIABLE ) rpar )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                adaptor.addChild(root_2, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:357:32: ^( NAME VARIABLE )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);

                adaptor.addChild(root_3, stream_VARIABLE.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_rpar.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:358:6: ^( PROCEDURE_BODY body )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "callCCLambdaExpression"

    public static class callCC_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callCC"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:361:1: callCC : ( CALL_WITH_CC -> ^( OPERATOR CALL_WITH_CC ) | CALL_CC -> ^( OPERATOR CALL_CC ) );
    public final SchemeParser.callCC_return callCC() throws RecognitionException {
        SchemeParser.callCC_return retval = new SchemeParser.callCC_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CALL_WITH_CC188=null;
        Token CALL_CC189=null;

        CommonTree CALL_WITH_CC188_tree=null;
        CommonTree CALL_CC189_tree=null;
        RewriteRuleTokenStream stream_CALL_CC=new RewriteRuleTokenStream(adaptor,"token CALL_CC");
        RewriteRuleTokenStream stream_CALL_WITH_CC=new RewriteRuleTokenStream(adaptor,"token CALL_WITH_CC");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:362:2: ( CALL_WITH_CC -> ^( OPERATOR CALL_WITH_CC ) | CALL_CC -> ^( OPERATOR CALL_CC ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==CALL_WITH_CC) ) {
                alt44=1;
            }
            else if ( (LA44_0==CALL_CC) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:362:4: CALL_WITH_CC
                    {
                    CALL_WITH_CC188=(Token)match(input,CALL_WITH_CC,FOLLOW_CALL_WITH_CC_in_callCC2665); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CALL_WITH_CC.add(CALL_WITH_CC188);



                    // AST REWRITE
                    // elements: CALL_WITH_CC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 362:17: -> ^( OPERATOR CALL_WITH_CC )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:362:20: ^( OPERATOR CALL_WITH_CC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_CALL_WITH_CC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:363:4: CALL_CC
                    {
                    CALL_CC189=(Token)match(input,CALL_CC,FOLLOW_CALL_CC_in_callCC2680); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CALL_CC.add(CALL_CC189);



                    // AST REWRITE
                    // elements: CALL_CC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 363:17: -> ^( OPERATOR CALL_CC )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:363:20: ^( OPERATOR CALL_CC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_CALL_CC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "callCC"

    public static class callCCExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "callCCExpr"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:367:1: callCCExpr : lpar callCC callCCLambdaExpression rpar ;
    public final SchemeParser.callCCExpr_return callCCExpr() throws RecognitionException {
        SchemeParser.callCCExpr_return retval = new SchemeParser.callCCExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar190 = null;

        SchemeParser.callCC_return callCC191 = null;

        SchemeParser.callCCLambdaExpression_return callCCLambdaExpression192 = null;

        SchemeParser.rpar_return rpar193 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:368:2: ( lpar callCC callCCLambdaExpression rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:368:4: lpar callCC callCCLambdaExpression rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_callCCExpr2707);
            lpar190=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar190.getTree());
            pushFollow(FOLLOW_callCC_in_callCCExpr2709);
            callCC191=callCC();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, callCC191.getTree());
            pushFollow(FOLLOW_callCCLambdaExpression_in_callCCExpr2711);
            callCCLambdaExpression192=callCCLambdaExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, callCCLambdaExpression192.getTree());
            pushFollow(FOLLOW_rpar_in_callCCExpr2713);
            rpar193=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar193.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "callCCExpr"

    public static class dot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "dot"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:371:1: dot : '.' -> ^( SEPARATOR '.' ) ;
    public final SchemeParser.dot_return dot() throws RecognitionException {
        SchemeParser.dot_return retval = new SchemeParser.dot_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal194=null;

        CommonTree char_literal194_tree=null;
        RewriteRuleTokenStream stream_158=new RewriteRuleTokenStream(adaptor,"token 158");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:372:2: ( '.' -> ^( SEPARATOR '.' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:372:4: '.'
            {
            char_literal194=(Token)match(input,158,FOLLOW_158_in_dot2724); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_158.add(char_literal194);



            // AST REWRITE
            // elements: 158
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 372:9: -> ^( SEPARATOR '.' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:372:12: ^( SEPARATOR '.' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_158.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "dot"

    public static class formals_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formals"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:375:1: formals : ( lpar ( ( paramDecl )+ ( dot paramDecl )? )? rpar | paramDecl );
    public final SchemeParser.formals_return formals() throws RecognitionException {
        SchemeParser.formals_return retval = new SchemeParser.formals_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar195 = null;

        SchemeParser.paramDecl_return paramDecl196 = null;

        SchemeParser.dot_return dot197 = null;

        SchemeParser.paramDecl_return paramDecl198 = null;

        SchemeParser.rpar_return rpar199 = null;

        SchemeParser.paramDecl_return paramDecl200 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:2: ( lpar ( ( paramDecl )+ ( dot paramDecl )? )? rpar | paramDecl )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==153) ) {
                alt48=1;
            }
            else if ( (LA48_0==ELLIPSIS||LA48_0==VARIABLE) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:4: lpar ( ( paramDecl )+ ( dot paramDecl )? )? rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_formals2746);
                    lpar195=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar195.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:9: ( ( paramDecl )+ ( dot paramDecl )? )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==ELLIPSIS||LA47_0==VARIABLE) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:11: ( paramDecl )+ ( dot paramDecl )?
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:11: ( paramDecl )+
                            int cnt45=0;
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==ELLIPSIS||LA45_0==VARIABLE) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:11: paramDecl
                            	    {
                            	    pushFollow(FOLLOW_paramDecl_in_formals2750);
                            	    paramDecl196=paramDecl();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDecl196.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt45 >= 1 ) break loop45;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(45, input);
                                        throw eee;
                                }
                                cnt45++;
                            } while (true);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:22: ( dot paramDecl )?
                            int alt46=2;
                            int LA46_0 = input.LA(1);

                            if ( (LA46_0==158) ) {
                                alt46=1;
                            }
                            switch (alt46) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:376:24: dot paramDecl
                                    {
                                    pushFollow(FOLLOW_dot_in_formals2755);
                                    dot197=dot();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dot197.getTree());
                                    pushFollow(FOLLOW_paramDecl_in_formals2757);
                                    paramDecl198=paramDecl();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDecl198.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_rpar_in_formals2765);
                    rpar199=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar199.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:377:4: paramDecl
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_paramDecl_in_formals2770);
                    paramDecl200=paramDecl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, paramDecl200.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formals"

    public static class paramDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "paramDecl"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:380:1: paramDecl : variable -> ^( PARAMETER_DECL variable ) ;
    public final SchemeParser.paramDecl_return paramDecl() throws RecognitionException {
        SchemeParser.paramDecl_return retval = new SchemeParser.paramDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.variable_return variable201 = null;


        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:381:2: ( variable -> ^( PARAMETER_DECL variable ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:381:4: variable
            {
            pushFollow(FOLLOW_variable_in_paramDecl2781);
            variable201=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable201.getTree());


            // AST REWRITE
            // elements: variable
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 381:13: -> ^( PARAMETER_DECL variable )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:381:16: ^( PARAMETER_DECL variable )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "paramDecl"

    public static class conditional_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditional"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:384:1: conditional : lpar IF test consequence ( alternative )? rpar -> ^( BRANCH_STATEMENT ^( SEPARATOR lpar ) ^( BRANCH ^( KEYWORD IF ) test ^( BLOCK_SCOPE consequence ) ) ( ^( BRANCH ^( BLOCK_SCOPE alternative ) ) )? ^( SEPARATOR rpar ) ) ;
    public final SchemeParser.conditional_return conditional() throws RecognitionException {
        SchemeParser.conditional_return retval = new SchemeParser.conditional_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF203=null;
        SchemeParser.lpar_return lpar202 = null;

        SchemeParser.test_return test204 = null;

        SchemeParser.consequence_return consequence205 = null;

        SchemeParser.alternative_return alternative206 = null;

        SchemeParser.rpar_return rpar207 = null;


        CommonTree IF203_tree=null;
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_alternative=new RewriteRuleSubtreeStream(adaptor,"rule alternative");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_consequence=new RewriteRuleSubtreeStream(adaptor,"rule consequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:385:2: ( lpar IF test consequence ( alternative )? rpar -> ^( BRANCH_STATEMENT ^( SEPARATOR lpar ) ^( BRANCH ^( KEYWORD IF ) test ^( BLOCK_SCOPE consequence ) ) ( ^( BRANCH ^( BLOCK_SCOPE alternative ) ) )? ^( SEPARATOR rpar ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:385:4: lpar IF test consequence ( alternative )? rpar
            {
            pushFollow(FOLLOW_lpar_in_conditional2802);
            lpar202=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar202.getTree());
            IF203=(Token)match(input,IF,FOLLOW_IF_in_conditional2804); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(IF203);

            pushFollow(FOLLOW_test_in_conditional2806);
            test204=test();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_test.add(test204.getTree());
            pushFollow(FOLLOW_consequence_in_conditional2808);
            consequence205=consequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_consequence.add(consequence205.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:385:29: ( alternative )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==ELLIPSIS||(LA49_0>=VARIABLE && LA49_0<=CHARACTER)||(LA49_0>=NUM_2 && LA49_0<=FALSE)||LA49_0==153||(LA49_0>=156 && LA49_0<=157)||LA49_0==160) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:385:29: alternative
                    {
                    pushFollow(FOLLOW_alternative_in_conditional2810);
                    alternative206=alternative();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alternative.add(alternative206.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_rpar_in_conditional2813);
            rpar207=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar207.getTree());


            // AST REWRITE
            // elements: test, alternative, IF, lpar, consequence, rpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 387:3: -> ^( BRANCH_STATEMENT ^( SEPARATOR lpar ) ^( BRANCH ^( KEYWORD IF ) test ^( BLOCK_SCOPE consequence ) ) ( ^( BRANCH ^( BLOCK_SCOPE alternative ) ) )? ^( SEPARATOR rpar ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:387:7: ^( BRANCH_STATEMENT ^( SEPARATOR lpar ) ^( BRANCH ^( KEYWORD IF ) test ^( BLOCK_SCOPE consequence ) ) ( ^( BRANCH ^( BLOCK_SCOPE alternative ) ) )? ^( SEPARATOR rpar ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:388:5: ^( SEPARATOR lpar )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_lpar.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:389:5: ^( BRANCH ^( KEYWORD IF ) test ^( BLOCK_SCOPE consequence ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:389:15: ^( KEYWORD IF )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                adaptor.addChild(root_3, stream_IF.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_test.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:389:36: ^( BLOCK_SCOPE consequence )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_3);

                adaptor.addChild(root_3, stream_consequence.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:390:5: ( ^( BRANCH ^( BLOCK_SCOPE alternative ) ) )?
                if ( stream_alternative.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:390:5: ^( BRANCH ^( BLOCK_SCOPE alternative ) )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:390:15: ^( BLOCK_SCOPE alternative )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_3);

                    adaptor.addChild(root_3, stream_alternative.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_alternative.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:390:45: ^( SEPARATOR rpar )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_rpar.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "conditional"

    public static class test_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "test"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:393:1: test : fullExpression -> ^( CONDITION fullExpression ) ;
    public final SchemeParser.test_return test() throws RecognitionException {
        SchemeParser.test_return retval = new SchemeParser.test_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression208 = null;


        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:394:2: ( fullExpression -> ^( CONDITION fullExpression ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:394:4: fullExpression
            {
            pushFollow(FOLLOW_fullExpression_in_test2899);
            fullExpression208=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression208.getTree());


            // AST REWRITE
            // elements: fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 394:19: -> ^( CONDITION fullExpression )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:394:22: ^( CONDITION fullExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                adaptor.addChild(root_1, stream_fullExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "test"

    public static class loop_test_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loop_test"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:396:1: loop_test : fullExpression -> fullExpression ;
    public final SchemeParser.loop_test_return loop_test() throws RecognitionException {
        SchemeParser.loop_test_return retval = new SchemeParser.loop_test_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression209 = null;


        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:397:3: ( fullExpression -> fullExpression )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:397:5: fullExpression
            {
            pushFollow(FOLLOW_fullExpression_in_loop_test2920);
            fullExpression209=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression209.getTree());


            // AST REWRITE
            // elements: fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 397:20: -> fullExpression
            {
                adaptor.addChild(root_0, stream_fullExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "loop_test"

    public static class consequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "consequence"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:400:1: consequence : ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression -> ^( JUMP_STATEMENT jumpableExpression ) );
    public final SchemeParser.consequence_return consequence() throws RecognitionException {
        SchemeParser.consequence_return retval = new SchemeParser.consequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.nonJumpExpression_return nonJumpExpression210 = null;

        SchemeParser.jumpableExpression_return jumpableExpression211 = null;


        RewriteRuleSubtreeStream stream_jumpableExpression=new RewriteRuleSubtreeStream(adaptor,"rule jumpableExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:401:2: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression -> ^( JUMP_STATEMENT jumpableExpression ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:403:5: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nonJumpExpression_in_consequence2978);
                    nonJumpExpression210=nonJumpExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonJumpExpression210.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:404:7: jumpableExpression
                    {
                    pushFollow(FOLLOW_jumpableExpression_in_consequence2987);
                    jumpableExpression211=jumpableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jumpableExpression.add(jumpableExpression211.getTree());


                    // AST REWRITE
                    // elements: jumpableExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 404:26: -> ^( JUMP_STATEMENT jumpableExpression )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:404:29: ^( JUMP_STATEMENT jumpableExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                        adaptor.addChild(root_1, stream_jumpableExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "consequence"

    public static class alternative_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "alternative"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:407:1: alternative : ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression -> ^( JUMP_STATEMENT jumpableExpression ) );
    public final SchemeParser.alternative_return alternative() throws RecognitionException {
        SchemeParser.alternative_return retval = new SchemeParser.alternative_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.nonJumpExpression_return nonJumpExpression212 = null;

        SchemeParser.jumpableExpression_return jumpableExpression213 = null;


        RewriteRuleSubtreeStream stream_jumpableExpression=new RewriteRuleSubtreeStream(adaptor,"rule jumpableExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:408:2: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression -> ^( JUMP_STATEMENT jumpableExpression ) )
            int alt51=2;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:410:4: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_nonJumpExpression_in_alternative3044);
                    nonJumpExpression212=nonJumpExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonJumpExpression212.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:411:7: jumpableExpression
                    {
                    pushFollow(FOLLOW_jumpableExpression_in_alternative3053);
                    jumpableExpression213=jumpableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jumpableExpression.add(jumpableExpression213.getTree());


                    // AST REWRITE
                    // elements: jumpableExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 411:26: -> ^( JUMP_STATEMENT jumpableExpression )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:411:29: ^( JUMP_STATEMENT jumpableExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                        adaptor.addChild(root_1, stream_jumpableExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "alternative"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:414:1: assignment : lpar SET variable fullExpression rpar -> lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR SET variable ^( VALUE fullExpression ) ) ) rpar ;
    public final SchemeParser.assignment_return assignment() throws RecognitionException {
        SchemeParser.assignment_return retval = new SchemeParser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SET215=null;
        SchemeParser.lpar_return lpar214 = null;

        SchemeParser.variable_return variable216 = null;

        SchemeParser.fullExpression_return fullExpression217 = null;

        SchemeParser.rpar_return rpar218 = null;


        CommonTree SET215_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:415:2: ( lpar SET variable fullExpression rpar -> lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR SET variable ^( VALUE fullExpression ) ) ) rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:415:4: lpar SET variable fullExpression rpar
            {
            pushFollow(FOLLOW_lpar_in_assignment3072);
            lpar214=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar214.getTree());
            SET215=(Token)match(input,SET,FOLLOW_SET_in_assignment3074); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(SET215);

            pushFollow(FOLLOW_variable_in_assignment3076);
            variable216=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable216.getTree());
            pushFollow(FOLLOW_fullExpression_in_assignment3078);
            fullExpression217=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression217.getTree());
            pushFollow(FOLLOW_rpar_in_assignment3080);
            rpar218=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar218.getTree());


            // AST REWRITE
            // elements: fullExpression, lpar, SET, variable, rpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 416:3: -> lpar ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR SET variable ^( VALUE fullExpression ) ) ) rpar
            {
                adaptor.addChild(root_0, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:416:11: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR SET variable ^( VALUE fullExpression ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:416:34: ^( ASSIGN_OPERATOR SET variable ^( VALUE fullExpression ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_2);

                adaptor.addChild(root_2, stream_SET.nextNode());
                adaptor.addChild(root_2, stream_variable.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:416:66: ^( VALUE fullExpression )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_3);

                adaptor.addChild(root_3, stream_fullExpression.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_rpar.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class derivedExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "derivedExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:419:1: derivedExpression : ( quasiquotation | lpar ( notExpression | andExpression | orExpression | letExpression | letNamedExpression | letStarExpression | letrecExpression | beginExpression | delayExpression ) rpar );
    public final SchemeParser.derivedExpression_return derivedExpression() throws RecognitionException {
        SchemeParser.derivedExpression_return retval = new SchemeParser.derivedExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.quasiquotation_return quasiquotation219 = null;

        SchemeParser.lpar_return lpar220 = null;

        SchemeParser.notExpression_return notExpression221 = null;

        SchemeParser.andExpression_return andExpression222 = null;

        SchemeParser.orExpression_return orExpression223 = null;

        SchemeParser.letExpression_return letExpression224 = null;

        SchemeParser.letNamedExpression_return letNamedExpression225 = null;

        SchemeParser.letStarExpression_return letStarExpression226 = null;

        SchemeParser.letrecExpression_return letrecExpression227 = null;

        SchemeParser.beginExpression_return beginExpression228 = null;

        SchemeParser.delayExpression_return delayExpression229 = null;

        SchemeParser.rpar_return rpar230 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:420:2: ( quasiquotation | lpar ( notExpression | andExpression | orExpression | letExpression | letNamedExpression | letStarExpression | letrecExpression | beginExpression | delayExpression ) rpar )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==160) ) {
                alt53=1;
            }
            else if ( (LA53_0==153) ) {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==BEGIN||(LA53_2>=AND && LA53_2<=OR)||(LA53_2>=LET && LA53_2<=LETREC)||LA53_2==DELAY||LA53_2==NOT) ) {
                    alt53=2;
                }
                else if ( (LA53_2==QUASIQUOTE) ) {
                    alt53=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:420:4: quasiquotation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_quasiquotation_in_derivedExpression3119);
                    quasiquotation219=quasiquotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotation219.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:421:6: lpar ( notExpression | andExpression | orExpression | letExpression | letNamedExpression | letStarExpression | letrecExpression | beginExpression | delayExpression ) rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_derivedExpression3126);
                    lpar220=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar220.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:421:11: ( notExpression | andExpression | orExpression | letExpression | letNamedExpression | letStarExpression | letrecExpression | beginExpression | delayExpression )
                    int alt52=9;
                    alt52 = dfa52.predict(input);
                    switch (alt52) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:422:7: notExpression
                            {
                            pushFollow(FOLLOW_notExpression_in_derivedExpression3137);
                            notExpression221=notExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, notExpression221.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:423:7: andExpression
                            {
                            pushFollow(FOLLOW_andExpression_in_derivedExpression3145);
                            andExpression222=andExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression222.getTree());

                            }
                            break;
                        case 3 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:424:7: orExpression
                            {
                            pushFollow(FOLLOW_orExpression_in_derivedExpression3153);
                            orExpression223=orExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, orExpression223.getTree());

                            }
                            break;
                        case 4 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:425:7: letExpression
                            {
                            pushFollow(FOLLOW_letExpression_in_derivedExpression3161);
                            letExpression224=letExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, letExpression224.getTree());

                            }
                            break;
                        case 5 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:426:7: letNamedExpression
                            {
                            pushFollow(FOLLOW_letNamedExpression_in_derivedExpression3169);
                            letNamedExpression225=letNamedExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, letNamedExpression225.getTree());

                            }
                            break;
                        case 6 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:427:7: letStarExpression
                            {
                            pushFollow(FOLLOW_letStarExpression_in_derivedExpression3177);
                            letStarExpression226=letStarExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, letStarExpression226.getTree());

                            }
                            break;
                        case 7 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:428:7: letrecExpression
                            {
                            pushFollow(FOLLOW_letrecExpression_in_derivedExpression3185);
                            letrecExpression227=letrecExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, letrecExpression227.getTree());

                            }
                            break;
                        case 8 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:429:7: beginExpression
                            {
                            pushFollow(FOLLOW_beginExpression_in_derivedExpression3193);
                            beginExpression228=beginExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, beginExpression228.getTree());

                            }
                            break;
                        case 9 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:431:7: delayExpression
                            {
                            pushFollow(FOLLOW_delayExpression_in_derivedExpression3206);
                            delayExpression229=delayExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, delayExpression229.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_rpar_in_derivedExpression3217);
                    rpar230=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar230.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "derivedExpression"

    public static class derivedBranchExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "derivedBranchExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:436:1: derivedBranchExpression : lpar caseExpression rpar ;
    public final SchemeParser.derivedBranchExpression_return derivedBranchExpression() throws RecognitionException {
        SchemeParser.derivedBranchExpression_return retval = new SchemeParser.derivedBranchExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar231 = null;

        SchemeParser.caseExpression_return caseExpression232 = null;

        SchemeParser.rpar_return rpar233 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:437:3: ( lpar caseExpression rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:437:5: lpar caseExpression rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_derivedBranchExpression3230);
            lpar231=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar231.getTree());
            pushFollow(FOLLOW_caseExpression_in_derivedBranchExpression3232);
            caseExpression232=caseExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, caseExpression232.getTree());
            pushFollow(FOLLOW_rpar_in_derivedBranchExpression3234);
            rpar233=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar233.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "derivedBranchExpression"

    public static class derivedLoopExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "derivedLoopExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:440:1: derivedLoopExpression : lpar doExpression rpar ;
    public final SchemeParser.derivedLoopExpression_return derivedLoopExpression() throws RecognitionException {
        SchemeParser.derivedLoopExpression_return retval = new SchemeParser.derivedLoopExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar234 = null;

        SchemeParser.doExpression_return doExpression235 = null;

        SchemeParser.rpar_return rpar236 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:441:3: ( lpar doExpression rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:441:5: lpar doExpression rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_derivedLoopExpression3249);
            lpar234=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar234.getTree());
            pushFollow(FOLLOW_doExpression_in_derivedLoopExpression3251);
            doExpression235=doExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, doExpression235.getTree());
            pushFollow(FOLLOW_rpar_in_derivedLoopExpression3253);
            rpar236=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar236.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "derivedLoopExpression"

    public static class condExpressionDer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpressionDer"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:444:1: condExpressionDer : COND ( condBody )+ -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD COND ) ( condBody )+ ) ) ;
    public final SchemeParser.condExpressionDer_return condExpressionDer() throws RecognitionException {
        SchemeParser.condExpressionDer_return retval = new SchemeParser.condExpressionDer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COND237=null;
        SchemeParser.condBody_return condBody238 = null;


        CommonTree COND237_tree=null;
        RewriteRuleTokenStream stream_COND=new RewriteRuleTokenStream(adaptor,"token COND");
        RewriteRuleSubtreeStream stream_condBody=new RewriteRuleSubtreeStream(adaptor,"rule condBody");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:445:2: ( COND ( condBody )+ -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD COND ) ( condBody )+ ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:445:4: COND ( condBody )+
            {
            COND237=(Token)match(input,COND,FOLLOW_COND_in_condExpressionDer3265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COND.add(COND237);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:445:9: ( condBody )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==153) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:445:9: condBody
            	    {
            	    pushFollow(FOLLOW_condBody_in_condExpressionDer3267);
            	    condBody238=condBody();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_condBody.add(condBody238.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);



            // AST REWRITE
            // elements: condBody, COND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 447:3: -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD COND ) ( condBody )+ ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:447:6: ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD COND ) ( condBody )+ ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:447:26: ^( BRANCH ^( KEYWORD COND ) ( condBody )+ )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:447:35: ^( KEYWORD COND )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                adaptor.addChild(root_3, stream_COND.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                if ( !(stream_condBody.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_condBody.hasNext() ) {
                    adaptor.addChild(root_2, stream_condBody.nextTree());

                }
                stream_condBody.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpressionDer"

    public static class condExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:450:1: condExpression : lpar COND ( condClause )+ ( elseBranch )? rpar -> ^( BRANCH_STATEMENT lpar ^( BRANCH ^( KEYWORD COND ) ( condClause )+ ( elseBranch )? rpar ) ) ;
    public final SchemeParser.condExpression_return condExpression() throws RecognitionException {
        SchemeParser.condExpression_return retval = new SchemeParser.condExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COND240=null;
        SchemeParser.lpar_return lpar239 = null;

        SchemeParser.condClause_return condClause241 = null;

        SchemeParser.elseBranch_return elseBranch242 = null;

        SchemeParser.rpar_return rpar243 = null;


        CommonTree COND240_tree=null;
        RewriteRuleTokenStream stream_COND=new RewriteRuleTokenStream(adaptor,"token COND");
        RewriteRuleSubtreeStream stream_elseBranch=new RewriteRuleSubtreeStream(adaptor,"rule elseBranch");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_condClause=new RewriteRuleSubtreeStream(adaptor,"rule condClause");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:451:2: ( lpar COND ( condClause )+ ( elseBranch )? rpar -> ^( BRANCH_STATEMENT lpar ^( BRANCH ^( KEYWORD COND ) ( condClause )+ ( elseBranch )? rpar ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:451:4: lpar COND ( condClause )+ ( elseBranch )? rpar
            {
            pushFollow(FOLLOW_lpar_in_condExpression3305);
            lpar239=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar239.getTree());
            COND240=(Token)match(input,COND,FOLLOW_COND_in_condExpression3307); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_COND.add(COND240);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:451:14: ( condClause )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==153) ) {
                    int LA55_1 = input.LA(2);

                    if ( (LA55_1==ELLIPSIS||(LA55_1>=VARIABLE && LA55_1<=CHARACTER)||(LA55_1>=NUM_2 && LA55_1<=FALSE)||LA55_1==153||(LA55_1>=156 && LA55_1<=157)||LA55_1==160) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:451:14: condClause
            	    {
            	    pushFollow(FOLLOW_condClause_in_condExpression3309);
            	    condClause241=condClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_condClause.add(condClause241.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:451:26: ( elseBranch )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==153) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:451:26: elseBranch
                    {
                    pushFollow(FOLLOW_elseBranch_in_condExpression3312);
                    elseBranch242=elseBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseBranch.add(elseBranch242.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_rpar_in_condExpression3315);
            rpar243=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar243.getTree());


            // AST REWRITE
            // elements: condClause, COND, rpar, elseBranch, lpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 452:3: -> ^( BRANCH_STATEMENT lpar ^( BRANCH ^( KEYWORD COND ) ( condClause )+ ( elseBranch )? rpar ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:452:6: ^( BRANCH_STATEMENT lpar ^( BRANCH ^( KEYWORD COND ) ( condClause )+ ( elseBranch )? rpar ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:452:30: ^( BRANCH ^( KEYWORD COND ) ( condClause )+ ( elseBranch )? rpar )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:452:39: ^( KEYWORD COND )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                adaptor.addChild(root_3, stream_COND.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                if ( !(stream_condClause.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_condClause.hasNext() ) {
                    adaptor.addChild(root_2, stream_condClause.nextTree());

                }
                stream_condClause.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:452:67: ( elseBranch )?
                if ( stream_elseBranch.hasNext() ) {
                    adaptor.addChild(root_2, stream_elseBranch.nextTree());

                }
                stream_elseBranch.reset();
                adaptor.addChild(root_2, stream_rpar.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpression"

    public static class condBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condBody"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:455:1: condBody : lpar ( condClause )+ ( elseBranch )? rpar ;
    public final SchemeParser.condBody_return condBody() throws RecognitionException {
        SchemeParser.condBody_return retval = new SchemeParser.condBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar244 = null;

        SchemeParser.condClause_return condClause245 = null;

        SchemeParser.elseBranch_return elseBranch246 = null;

        SchemeParser.rpar_return rpar247 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:456:2: ( lpar ( condClause )+ ( elseBranch )? rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:456:4: lpar ( condClause )+ ( elseBranch )? rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_condBody3354);
            lpar244=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar244.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:456:9: ( condClause )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==153) ) {
                    int LA57_1 = input.LA(2);

                    if ( (LA57_1==ELLIPSIS||(LA57_1>=VARIABLE && LA57_1<=CHARACTER)||(LA57_1>=NUM_2 && LA57_1<=FALSE)||LA57_1==153||(LA57_1>=156 && LA57_1<=157)||LA57_1==160) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:456:9: condClause
            	    {
            	    pushFollow(FOLLOW_condClause_in_condBody3356);
            	    condClause245=condClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, condClause245.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:456:21: ( elseBranch )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==153) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:456:21: elseBranch
                    {
                    pushFollow(FOLLOW_elseBranch_in_condBody3359);
                    elseBranch246=elseBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elseBranch246.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_rpar_in_condBody3362);
            rpar247=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar247.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condBody"

    public static class elseBranch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseBranch"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:459:1: elseBranch : lpar ELSE sub_sequence rpar -> ^( BRANCH ^( SEPARATOR lpar ) ^( KEYWORD ELSE ) ^( BLOCK_SCOPE sub_sequence ) rpar ) ;
    public final SchemeParser.elseBranch_return elseBranch() throws RecognitionException {
        SchemeParser.elseBranch_return retval = new SchemeParser.elseBranch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ELSE249=null;
        SchemeParser.lpar_return lpar248 = null;

        SchemeParser.sub_sequence_return sub_sequence250 = null;

        SchemeParser.rpar_return rpar251 = null;


        CommonTree ELSE249_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_sub_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sub_sequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:460:2: ( lpar ELSE sub_sequence rpar -> ^( BRANCH ^( SEPARATOR lpar ) ^( KEYWORD ELSE ) ^( BLOCK_SCOPE sub_sequence ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:460:4: lpar ELSE sub_sequence rpar
            {
            pushFollow(FOLLOW_lpar_in_elseBranch3373);
            lpar248=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar248.getTree());
            ELSE249=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseBranch3375); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ELSE.add(ELSE249);

            pushFollow(FOLLOW_sub_sequence_in_elseBranch3377);
            sub_sequence250=sub_sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sub_sequence.add(sub_sequence250.getTree());
            pushFollow(FOLLOW_rpar_in_elseBranch3379);
            rpar251=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar251.getTree());


            // AST REWRITE
            // elements: lpar, rpar, sub_sequence, ELSE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 462:3: -> ^( BRANCH ^( SEPARATOR lpar ) ^( KEYWORD ELSE ) ^( BLOCK_SCOPE sub_sequence ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:462:6: ^( BRANCH ^( SEPARATOR lpar ) ^( KEYWORD ELSE ) ^( BLOCK_SCOPE sub_sequence ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:462:16: ^( SEPARATOR lpar )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_lpar.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:462:34: ^( KEYWORD ELSE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_ELSE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:462:52: ^( BLOCK_SCOPE sub_sequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_sub_sequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseBranch"

    public static class condClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condClause"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:466:1: condClause : lpar test ( condClauseBody )? rpar -> lpar test ( ^( BLOCK_SCOPE condClauseBody ) )? rpar ;
    public final SchemeParser.condClause_return condClause() throws RecognitionException {
        SchemeParser.condClause_return retval = new SchemeParser.condClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar252 = null;

        SchemeParser.test_return test253 = null;

        SchemeParser.condClauseBody_return condClauseBody254 = null;

        SchemeParser.rpar_return rpar255 = null;


        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_condClauseBody=new RewriteRuleSubtreeStream(adaptor,"rule condClauseBody");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:467:2: ( lpar test ( condClauseBody )? rpar -> lpar test ( ^( BLOCK_SCOPE condClauseBody ) )? rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:467:4: lpar test ( condClauseBody )? rpar
            {
            pushFollow(FOLLOW_lpar_in_condClause3427);
            lpar252=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar252.getTree());
            pushFollow(FOLLOW_test_in_condClause3429);
            test253=test();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_test.add(test253.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:467:14: ( condClauseBody )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==ELLIPSIS||(LA59_0>=VARIABLE && LA59_0<=CHARACTER)||LA59_0==ARROW||(LA59_0>=NUM_2 && LA59_0<=FALSE)||LA59_0==153||(LA59_0>=156 && LA59_0<=157)||LA59_0==160) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:467:14: condClauseBody
                    {
                    pushFollow(FOLLOW_condClauseBody_in_condClause3431);
                    condClauseBody254=condClauseBody();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_condClauseBody.add(condClauseBody254.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_rpar_in_condClause3434);
            rpar255=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar255.getTree());


            // AST REWRITE
            // elements: lpar, rpar, condClauseBody, test
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 468:3: -> lpar test ( ^( BLOCK_SCOPE condClauseBody ) )? rpar
            {
                adaptor.addChild(root_0, stream_lpar.nextTree());
                adaptor.addChild(root_0, stream_test.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:468:16: ( ^( BLOCK_SCOPE condClauseBody ) )?
                if ( stream_condClauseBody.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:468:16: ^( BLOCK_SCOPE condClauseBody )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                    adaptor.addChild(root_1, stream_condClauseBody.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_condClauseBody.reset();
                adaptor.addChild(root_0, stream_rpar.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condClause"

    public static class condClauseBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condClauseBody"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:471:1: condClauseBody : ( sequence | ARROW recipient -> ^( SEPARATOR ARROW ) recipient );
    public final SchemeParser.condClauseBody_return condClauseBody() throws RecognitionException {
        SchemeParser.condClauseBody_return retval = new SchemeParser.condClauseBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ARROW257=null;
        SchemeParser.sequence_return sequence256 = null;

        SchemeParser.recipient_return recipient258 = null;


        CommonTree ARROW257_tree=null;
        RewriteRuleTokenStream stream_ARROW=new RewriteRuleTokenStream(adaptor,"token ARROW");
        RewriteRuleSubtreeStream stream_recipient=new RewriteRuleSubtreeStream(adaptor,"rule recipient");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:472:2: ( sequence | ARROW recipient -> ^( SEPARATOR ARROW ) recipient )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==ELLIPSIS||(LA60_0>=VARIABLE && LA60_0<=CHARACTER)||(LA60_0>=NUM_2 && LA60_0<=FALSE)||LA60_0==153||(LA60_0>=156 && LA60_0<=157)||LA60_0==160) ) {
                alt60=1;
            }
            else if ( (LA60_0==ARROW) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:472:4: sequence
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_sequence_in_condClauseBody3463);
                    sequence256=sequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence256.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:473:4: ARROW recipient
                    {
                    ARROW257=(Token)match(input,ARROW,FOLLOW_ARROW_in_condClauseBody3468); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARROW.add(ARROW257);

                    pushFollow(FOLLOW_recipient_in_condClauseBody3470);
                    recipient258=recipient();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_recipient.add(recipient258.getTree());


                    // AST REWRITE
                    // elements: ARROW, recipient
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 473:21: -> ^( SEPARATOR ARROW ) recipient
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:473:24: ^( SEPARATOR ARROW )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_ARROW.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_recipient.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condClauseBody"

    public static class recipient_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recipient"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:476:1: recipient : fullExpression ;
    public final SchemeParser.recipient_return recipient() throws RecognitionException {
        SchemeParser.recipient_return retval = new SchemeParser.recipient_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression259 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:477:2: ( fullExpression )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:477:4: fullExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fullExpression_in_recipient3494);
            fullExpression259=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fullExpression259.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "recipient"

    public static class caseExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:480:1: caseExpression : CASE fullExpression caseBody -> ^( BRANCH_STATEMENT ^( KEYWORD CASE ) fullExpression caseBody ) ;
    public final SchemeParser.caseExpression_return caseExpression() throws RecognitionException {
        SchemeParser.caseExpression_return retval = new SchemeParser.caseExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CASE260=null;
        SchemeParser.fullExpression_return fullExpression261 = null;

        SchemeParser.caseBody_return caseBody262 = null;


        CommonTree CASE260_tree=null;
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_caseBody=new RewriteRuleSubtreeStream(adaptor,"rule caseBody");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:481:2: ( CASE fullExpression caseBody -> ^( BRANCH_STATEMENT ^( KEYWORD CASE ) fullExpression caseBody ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:481:4: CASE fullExpression caseBody
            {
            CASE260=(Token)match(input,CASE,FOLLOW_CASE_in_caseExpression3505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CASE.add(CASE260);

            pushFollow(FOLLOW_fullExpression_in_caseExpression3507);
            fullExpression261=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression261.getTree());
            pushFollow(FOLLOW_caseBody_in_caseExpression3509);
            caseBody262=caseBody();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_caseBody.add(caseBody262.getTree());


            // AST REWRITE
            // elements: fullExpression, CASE, caseBody
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 483:3: -> ^( BRANCH_STATEMENT ^( KEYWORD CASE ) fullExpression caseBody )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:483:6: ^( BRANCH_STATEMENT ^( KEYWORD CASE ) fullExpression caseBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:483:26: ^( KEYWORD CASE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_CASE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_fullExpression.nextTree());
                adaptor.addChild(root_1, stream_caseBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "caseExpression"

    public static class caseBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseBody"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:486:1: caseBody : ( elseBranch | ( caseClause )+ ( elseBranch )? );
    public final SchemeParser.caseBody_return caseBody() throws RecognitionException {
        SchemeParser.caseBody_return retval = new SchemeParser.caseBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.elseBranch_return elseBranch263 = null;

        SchemeParser.caseClause_return caseClause264 = null;

        SchemeParser.elseBranch_return elseBranch265 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:487:2: ( elseBranch | ( caseClause )+ ( elseBranch )? )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==153) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==ELSE) ) {
                    alt63=1;
                }
                else if ( (LA63_1==153) ) {
                    alt63=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:487:4: elseBranch
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_elseBranch_in_caseBody3543);
                    elseBranch263=elseBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, elseBranch263.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:487:17: ( caseClause )+ ( elseBranch )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:487:17: ( caseClause )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==153) ) {
                            int LA61_1 = input.LA(2);

                            if ( (LA61_1==153) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:487:17: caseClause
                    	    {
                    	    pushFollow(FOLLOW_caseClause_in_caseBody3547);
                    	    caseClause264=caseClause();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseClause264.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:487:29: ( elseBranch )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==153) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:487:29: elseBranch
                            {
                            pushFollow(FOLLOW_elseBranch_in_caseBody3550);
                            elseBranch265=elseBranch();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, elseBranch265.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "caseBody"

    public static class caseClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseClause"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:490:1: caseClause : lpar lpar ( datum )* rpar sub_sequence rpar -> ^( BRANCH lpar lpar ( ^( CONDITION datum ) )* rpar sub_sequence rpar ) ;
    public final SchemeParser.caseClause_return caseClause() throws RecognitionException {
        SchemeParser.caseClause_return retval = new SchemeParser.caseClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar266 = null;

        SchemeParser.lpar_return lpar267 = null;

        SchemeParser.datum_return datum268 = null;

        SchemeParser.rpar_return rpar269 = null;

        SchemeParser.sub_sequence_return sub_sequence270 = null;

        SchemeParser.rpar_return rpar271 = null;


        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_datum=new RewriteRuleSubtreeStream(adaptor,"rule datum");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_sub_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sub_sequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:491:2: ( lpar lpar ( datum )* rpar sub_sequence rpar -> ^( BRANCH lpar lpar ( ^( CONDITION datum ) )* rpar sub_sequence rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:491:4: lpar lpar ( datum )* rpar sub_sequence rpar
            {
            pushFollow(FOLLOW_lpar_in_caseClause3562);
            lpar266=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar266.getTree());
            pushFollow(FOLLOW_lpar_in_caseClause3564);
            lpar267=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar267.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:491:14: ( datum )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=ELLIPSIS && LA64_0<=BEGIN)||LA64_0==DEFINE||(LA64_0>=VARIABLE && LA64_0<=QUASIQUOTE)||(LA64_0>=NUM_2 && LA64_0<=FALSE)||LA64_0==153||(LA64_0>=155 && LA64_0<=156)||(LA64_0>=160 && LA64_0<=162)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:491:14: datum
            	    {
            	    pushFollow(FOLLOW_datum_in_caseClause3566);
            	    datum268=datum();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_datum.add(datum268.getTree());

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_caseClause3569);
            rpar269=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar269.getTree());
            pushFollow(FOLLOW_sub_sequence_in_caseClause3571);
            sub_sequence270=sub_sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sub_sequence.add(sub_sequence270.getTree());
            pushFollow(FOLLOW_rpar_in_caseClause3573);
            rpar271=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar271.getTree());


            // AST REWRITE
            // elements: sub_sequence, rpar, datum, rpar, lpar, lpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 493:3: -> ^( BRANCH lpar lpar ( ^( CONDITION datum ) )* rpar sub_sequence rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:493:6: ^( BRANCH lpar lpar ( ^( CONDITION datum ) )* rpar sub_sequence rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:493:26: ( ^( CONDITION datum ) )*
                while ( stream_datum.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:493:26: ^( CONDITION datum )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                    adaptor.addChild(root_2, stream_datum.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_datum.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());
                adaptor.addChild(root_1, stream_sub_sequence.nextTree());
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "caseClause"

    public static class whenExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whenExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:496:1: whenExpression : lpar WHEN test sequence rpar -> ^( BRANCH_STATEMENT lpar ^( KEYWORD WHEN ) test ^( BRANCH sequence ) rpar ) ;
    public final SchemeParser.whenExpression_return whenExpression() throws RecognitionException {
        SchemeParser.whenExpression_return retval = new SchemeParser.whenExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHEN273=null;
        SchemeParser.lpar_return lpar272 = null;

        SchemeParser.test_return test274 = null;

        SchemeParser.sequence_return sequence275 = null;

        SchemeParser.rpar_return rpar276 = null;


        CommonTree WHEN273_tree=null;
        RewriteRuleTokenStream stream_WHEN=new RewriteRuleTokenStream(adaptor,"token WHEN");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:497:2: ( lpar WHEN test sequence rpar -> ^( BRANCH_STATEMENT lpar ^( KEYWORD WHEN ) test ^( BRANCH sequence ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:497:4: lpar WHEN test sequence rpar
            {
            pushFollow(FOLLOW_lpar_in_whenExpression3614);
            lpar272=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar272.getTree());
            WHEN273=(Token)match(input,WHEN,FOLLOW_WHEN_in_whenExpression3616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHEN.add(WHEN273);

            pushFollow(FOLLOW_test_in_whenExpression3618);
            test274=test();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_test.add(test274.getTree());
            pushFollow(FOLLOW_sequence_in_whenExpression3620);
            sequence275=sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequence.add(sequence275.getTree());
            pushFollow(FOLLOW_rpar_in_whenExpression3622);
            rpar276=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar276.getTree());


            // AST REWRITE
            // elements: test, WHEN, rpar, sequence, lpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 498:2: -> ^( BRANCH_STATEMENT lpar ^( KEYWORD WHEN ) test ^( BRANCH sequence ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:498:5: ^( BRANCH_STATEMENT lpar ^( KEYWORD WHEN ) test ^( BRANCH sequence ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:499:10: ^( KEYWORD WHEN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_WHEN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_test.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:500:6: ^( BRANCH sequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                adaptor.addChild(root_2, stream_sequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whenExpression"

    public static class unlessExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unlessExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:503:1: unlessExpression : lpar UNLESS test sequence rpar -> ^( BRANCH_STATEMENT lpar ^( KEYWORD UNLESS ) test ^( BRANCH sequence ) rpar ) ;
    public final SchemeParser.unlessExpression_return unlessExpression() throws RecognitionException {
        SchemeParser.unlessExpression_return retval = new SchemeParser.unlessExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token UNLESS278=null;
        SchemeParser.lpar_return lpar277 = null;

        SchemeParser.test_return test279 = null;

        SchemeParser.sequence_return sequence280 = null;

        SchemeParser.rpar_return rpar281 = null;


        CommonTree UNLESS278_tree=null;
        RewriteRuleTokenStream stream_UNLESS=new RewriteRuleTokenStream(adaptor,"token UNLESS");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_test=new RewriteRuleSubtreeStream(adaptor,"rule test");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:504:2: ( lpar UNLESS test sequence rpar -> ^( BRANCH_STATEMENT lpar ^( KEYWORD UNLESS ) test ^( BRANCH sequence ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:504:4: lpar UNLESS test sequence rpar
            {
            pushFollow(FOLLOW_lpar_in_unlessExpression3673);
            lpar277=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar277.getTree());
            UNLESS278=(Token)match(input,UNLESS,FOLLOW_UNLESS_in_unlessExpression3675); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNLESS.add(UNLESS278);

            pushFollow(FOLLOW_test_in_unlessExpression3677);
            test279=test();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_test.add(test279.getTree());
            pushFollow(FOLLOW_sequence_in_unlessExpression3679);
            sequence280=sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequence.add(sequence280.getTree());
            pushFollow(FOLLOW_rpar_in_unlessExpression3681);
            rpar281=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar281.getTree());


            // AST REWRITE
            // elements: lpar, rpar, sequence, UNLESS, test
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 506:3: -> ^( BRANCH_STATEMENT lpar ^( KEYWORD UNLESS ) test ^( BRANCH sequence ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:506:6: ^( BRANCH_STATEMENT lpar ^( KEYWORD UNLESS ) test ^( BRANCH sequence ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:507:10: ^( KEYWORD UNLESS )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_UNLESS.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_test.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:508:6: ^( BRANCH sequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                adaptor.addChild(root_2, stream_sequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unlessExpression"

    public static class notExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:511:1: notExpression : NOT fullExpression -> ^( LOGICAL_OPERATOR NOT fullExpression ) ;
    public final SchemeParser.notExpression_return notExpression() throws RecognitionException {
        SchemeParser.notExpression_return retval = new SchemeParser.notExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NOT282=null;
        SchemeParser.fullExpression_return fullExpression283 = null;


        CommonTree NOT282_tree=null;
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:512:2: ( NOT fullExpression -> ^( LOGICAL_OPERATOR NOT fullExpression ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:512:4: NOT fullExpression
            {
            NOT282=(Token)match(input,NOT,FOLLOW_NOT_in_notExpression3734); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_NOT.add(NOT282);

            pushFollow(FOLLOW_fullExpression_in_notExpression3736);
            fullExpression283=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression283.getTree());


            // AST REWRITE
            // elements: NOT, fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 514:3: -> ^( LOGICAL_OPERATOR NOT fullExpression )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:514:6: ^( LOGICAL_OPERATOR NOT fullExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_NOT.nextNode());
                adaptor.addChild(root_1, stream_fullExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:517:1: andExpression : AND ( fullExpression )+ -> ^( LOGICAL_OPERATOR AND ( fullExpression )+ ) ;
    public final SchemeParser.andExpression_return andExpression() throws RecognitionException {
        SchemeParser.andExpression_return retval = new SchemeParser.andExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND284=null;
        SchemeParser.fullExpression_return fullExpression285 = null;


        CommonTree AND284_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:518:2: ( AND ( fullExpression )+ -> ^( LOGICAL_OPERATOR AND ( fullExpression )+ ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:518:4: AND ( fullExpression )+
            {
            AND284=(Token)match(input,AND,FOLLOW_AND_in_andExpression3764); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_AND.add(AND284);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:518:8: ( fullExpression )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==ELLIPSIS||(LA65_0>=VARIABLE && LA65_0<=CHARACTER)||(LA65_0>=NUM_2 && LA65_0<=FALSE)||LA65_0==153||(LA65_0>=156 && LA65_0<=157)||LA65_0==160) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:518:8: fullExpression
            	    {
            	    pushFollow(FOLLOW_fullExpression_in_andExpression3766);
            	    fullExpression285=fullExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression285.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);



            // AST REWRITE
            // elements: fullExpression, AND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 520:3: -> ^( LOGICAL_OPERATOR AND ( fullExpression )+ )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:520:6: ^( LOGICAL_OPERATOR AND ( fullExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_AND.nextNode());
                if ( !(stream_fullExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fullExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_fullExpression.nextTree());

                }
                stream_fullExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class orExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:523:1: orExpression : OR ( fullExpression )+ -> ^( LOGICAL_OPERATOR OR ( fullExpression )+ ) ;
    public final SchemeParser.orExpression_return orExpression() throws RecognitionException {
        SchemeParser.orExpression_return retval = new SchemeParser.orExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR286=null;
        SchemeParser.fullExpression_return fullExpression287 = null;


        CommonTree OR286_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:524:2: ( OR ( fullExpression )+ -> ^( LOGICAL_OPERATOR OR ( fullExpression )+ ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:524:4: OR ( fullExpression )+
            {
            OR286=(Token)match(input,OR,FOLLOW_OR_in_orExpression3795); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OR.add(OR286);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:524:7: ( fullExpression )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==ELLIPSIS||(LA66_0>=VARIABLE && LA66_0<=CHARACTER)||(LA66_0>=NUM_2 && LA66_0<=FALSE)||LA66_0==153||(LA66_0>=156 && LA66_0<=157)||LA66_0==160) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:524:7: fullExpression
            	    {
            	    pushFollow(FOLLOW_fullExpression_in_orExpression3797);
            	    fullExpression287=fullExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression287.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
            } while (true);



            // AST REWRITE
            // elements: OR, fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 526:3: -> ^( LOGICAL_OPERATOR OR ( fullExpression )+ )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:526:6: ^( LOGICAL_OPERATOR OR ( fullExpression )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_OR.nextNode());
                if ( !(stream_fullExpression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fullExpression.hasNext() ) {
                    adaptor.addChild(root_1, stream_fullExpression.nextTree());

                }
                stream_fullExpression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpression"

    public static class letExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "letExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:534:1: letExpression : LET lpar ( bindingSpecVars )* rpar body -> ^( BLOCK_SCOPE ^( KEYWORD LET ) lpar ( bindingSpecVars )* rpar body ) ;
    public final SchemeParser.letExpression_return letExpression() throws RecognitionException {
        SchemeParser.letExpression_return retval = new SchemeParser.letExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LET288=null;
        SchemeParser.lpar_return lpar289 = null;

        SchemeParser.bindingSpecVars_return bindingSpecVars290 = null;

        SchemeParser.rpar_return rpar291 = null;

        SchemeParser.body_return body292 = null;


        CommonTree LET288_tree=null;
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_bindingSpecVars=new RewriteRuleSubtreeStream(adaptor,"rule bindingSpecVars");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:535:2: ( LET lpar ( bindingSpecVars )* rpar body -> ^( BLOCK_SCOPE ^( KEYWORD LET ) lpar ( bindingSpecVars )* rpar body ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:535:4: LET lpar ( bindingSpecVars )* rpar body
            {
            LET288=(Token)match(input,LET,FOLLOW_LET_in_letExpression3831); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LET.add(LET288);

            pushFollow(FOLLOW_lpar_in_letExpression3833);
            lpar289=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar289.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:535:13: ( bindingSpecVars )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==153) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:535:13: bindingSpecVars
            	    {
            	    pushFollow(FOLLOW_bindingSpecVars_in_letExpression3835);
            	    bindingSpecVars290=bindingSpecVars();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bindingSpecVars.add(bindingSpecVars290.getTree());

            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_letExpression3838);
            rpar291=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar291.getTree());
            pushFollow(FOLLOW_body_in_letExpression3840);
            body292=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body292.getTree());


            // AST REWRITE
            // elements: lpar, bindingSpecVars, rpar, body, LET
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 537:3: -> ^( BLOCK_SCOPE ^( KEYWORD LET ) lpar ( bindingSpecVars )* rpar body )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:537:6: ^( BLOCK_SCOPE ^( KEYWORD LET ) lpar ( bindingSpecVars )* rpar body )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:538:5: ^( KEYWORD LET )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_LET.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:538:27: ( bindingSpecVars )*
                while ( stream_bindingSpecVars.hasNext() ) {
                    adaptor.addChild(root_1, stream_bindingSpecVars.nextTree());

                }
                stream_bindingSpecVars.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());
                adaptor.addChild(root_1, stream_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "letExpression"

    public static class letStarExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "letStarExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:541:1: letStarExpression : LETSTAR lpar ( bindingSpecVars )* rpar body -> ^( BLOCK_SCOPE ^( KEYWORD LETSTAR ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) ) ;
    public final SchemeParser.letStarExpression_return letStarExpression() throws RecognitionException {
        SchemeParser.letStarExpression_return retval = new SchemeParser.letStarExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETSTAR293=null;
        SchemeParser.lpar_return lpar294 = null;

        SchemeParser.bindingSpecVars_return bindingSpecVars295 = null;

        SchemeParser.rpar_return rpar296 = null;

        SchemeParser.body_return body297 = null;


        CommonTree LETSTAR293_tree=null;
        RewriteRuleTokenStream stream_LETSTAR=new RewriteRuleTokenStream(adaptor,"token LETSTAR");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_bindingSpecVars=new RewriteRuleSubtreeStream(adaptor,"rule bindingSpecVars");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:542:2: ( LETSTAR lpar ( bindingSpecVars )* rpar body -> ^( BLOCK_SCOPE ^( KEYWORD LETSTAR ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:542:4: LETSTAR lpar ( bindingSpecVars )* rpar body
            {
            LETSTAR293=(Token)match(input,LETSTAR,FOLLOW_LETSTAR_in_letStarExpression3883); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LETSTAR.add(LETSTAR293);

            pushFollow(FOLLOW_lpar_in_letStarExpression3885);
            lpar294=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar294.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:542:17: ( bindingSpecVars )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==153) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:542:17: bindingSpecVars
            	    {
            	    pushFollow(FOLLOW_bindingSpecVars_in_letStarExpression3887);
            	    bindingSpecVars295=bindingSpecVars();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bindingSpecVars.add(bindingSpecVars295.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_letStarExpression3890);
            rpar296=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar296.getTree());
            pushFollow(FOLLOW_body_in_letStarExpression3892);
            body297=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body297.getTree());


            // AST REWRITE
            // elements: lpar, body, rpar, bindingSpecVars, LETSTAR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 544:3: -> ^( BLOCK_SCOPE ^( KEYWORD LETSTAR ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:544:6: ^( BLOCK_SCOPE ^( KEYWORD LETSTAR ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:545:7: ^( KEYWORD LETSTAR )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_LETSTAR.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:545:33: ( bindingSpecVars )*
                while ( stream_bindingSpecVars.hasNext() ) {
                    adaptor.addChild(root_1, stream_bindingSpecVars.nextTree());

                }
                stream_bindingSpecVars.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:546:7: ^( PROCEDURE_BODY body )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "letStarExpression"

    public static class letrecExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "letrecExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:549:1: letrecExpression : LETREC lpar ( bindingSpecVars )* rpar body -> ^( BLOCK_SCOPE ^( KEYWORD LETREC ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) ) ;
    public final SchemeParser.letrecExpression_return letrecExpression() throws RecognitionException {
        SchemeParser.letrecExpression_return retval = new SchemeParser.letrecExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LETREC298=null;
        SchemeParser.lpar_return lpar299 = null;

        SchemeParser.bindingSpecVars_return bindingSpecVars300 = null;

        SchemeParser.rpar_return rpar301 = null;

        SchemeParser.body_return body302 = null;


        CommonTree LETREC298_tree=null;
        RewriteRuleTokenStream stream_LETREC=new RewriteRuleTokenStream(adaptor,"token LETREC");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_bindingSpecVars=new RewriteRuleSubtreeStream(adaptor,"rule bindingSpecVars");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:550:2: ( LETREC lpar ( bindingSpecVars )* rpar body -> ^( BLOCK_SCOPE ^( KEYWORD LETREC ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:550:4: LETREC lpar ( bindingSpecVars )* rpar body
            {
            LETREC298=(Token)match(input,LETREC,FOLLOW_LETREC_in_letrecExpression3949); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LETREC.add(LETREC298);

            pushFollow(FOLLOW_lpar_in_letrecExpression3951);
            lpar299=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar299.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:550:16: ( bindingSpecVars )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==153) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:550:16: bindingSpecVars
            	    {
            	    pushFollow(FOLLOW_bindingSpecVars_in_letrecExpression3953);
            	    bindingSpecVars300=bindingSpecVars();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bindingSpecVars.add(bindingSpecVars300.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_letrecExpression3956);
            rpar301=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar301.getTree());
            pushFollow(FOLLOW_body_in_letrecExpression3958);
            body302=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body302.getTree());


            // AST REWRITE
            // elements: rpar, body, lpar, bindingSpecVars, LETREC
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 552:3: -> ^( BLOCK_SCOPE ^( KEYWORD LETREC ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:552:6: ^( BLOCK_SCOPE ^( KEYWORD LETREC ) lpar ( bindingSpecVars )* rpar ^( PROCEDURE_BODY body ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:553:7: ^( KEYWORD LETREC )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_LETREC.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:553:32: ( bindingSpecVars )*
                while ( stream_bindingSpecVars.hasNext() ) {
                    adaptor.addChild(root_1, stream_bindingSpecVars.nextTree());

                }
                stream_bindingSpecVars.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:554:7: ^( PROCEDURE_BODY body )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "letrecExpression"

    public static class bindingSpecVars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingSpecVars"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:557:1: bindingSpecVars : lpar variable fullExpression rpar -> ^( VAR_DECL lpar variable ^( EXPRESSION fullExpression ) rpar ) ;
    public final SchemeParser.bindingSpecVars_return bindingSpecVars() throws RecognitionException {
        SchemeParser.bindingSpecVars_return retval = new SchemeParser.bindingSpecVars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar303 = null;

        SchemeParser.variable_return variable304 = null;

        SchemeParser.fullExpression_return fullExpression305 = null;

        SchemeParser.rpar_return rpar306 = null;


        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:558:2: ( lpar variable fullExpression rpar -> ^( VAR_DECL lpar variable ^( EXPRESSION fullExpression ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:558:4: lpar variable fullExpression rpar
            {
            pushFollow(FOLLOW_lpar_in_bindingSpecVars4015);
            lpar303=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar303.getTree());
            pushFollow(FOLLOW_variable_in_bindingSpecVars4017);
            variable304=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable304.getTree());
            pushFollow(FOLLOW_fullExpression_in_bindingSpecVars4019);
            fullExpression305=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression305.getTree());
            pushFollow(FOLLOW_rpar_in_bindingSpecVars4021);
            rpar306=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar306.getTree());


            // AST REWRITE
            // elements: variable, fullExpression, lpar, rpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 559:3: -> ^( VAR_DECL lpar variable ^( EXPRESSION fullExpression ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:559:6: ^( VAR_DECL lpar variable ^( EXPRESSION fullExpression ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                adaptor.addChild(root_1, stream_variable.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:559:32: ^( EXPRESSION fullExpression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_fullExpression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingSpecVars"

    public static class letNamedExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "letNamedExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:565:1: letNamedExpression : LET variable lpar ( bindingSpecPars )* rpar body -> ^( KEYWORD LET ) ^( FUNCTION_DECL ( variable )? lpar ^( FORMAL_PARAM_LIST ( bindingSpecPars )* ) rpar ^( PROCEDURE_BODY body ) ) ;
    public final SchemeParser.letNamedExpression_return letNamedExpression() throws RecognitionException {
        SchemeParser.letNamedExpression_return retval = new SchemeParser.letNamedExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LET307=null;
        SchemeParser.variable_return variable308 = null;

        SchemeParser.lpar_return lpar309 = null;

        SchemeParser.bindingSpecPars_return bindingSpecPars310 = null;

        SchemeParser.rpar_return rpar311 = null;

        SchemeParser.body_return body312 = null;


        CommonTree LET307_tree=null;
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_bindingSpecPars=new RewriteRuleSubtreeStream(adaptor,"rule bindingSpecPars");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:566:2: ( LET variable lpar ( bindingSpecPars )* rpar body -> ^( KEYWORD LET ) ^( FUNCTION_DECL ( variable )? lpar ^( FORMAL_PARAM_LIST ( bindingSpecPars )* ) rpar ^( PROCEDURE_BODY body ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:566:4: LET variable lpar ( bindingSpecPars )* rpar body
            {
            LET307=(Token)match(input,LET,FOLLOW_LET_in_letNamedExpression4060); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LET.add(LET307);

            pushFollow(FOLLOW_variable_in_letNamedExpression4062);
            variable308=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable308.getTree());
            pushFollow(FOLLOW_lpar_in_letNamedExpression4064);
            lpar309=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar309.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:566:22: ( bindingSpecPars )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==153) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:566:22: bindingSpecPars
            	    {
            	    pushFollow(FOLLOW_bindingSpecPars_in_letNamedExpression4066);
            	    bindingSpecPars310=bindingSpecPars();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_bindingSpecPars.add(bindingSpecPars310.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_letNamedExpression4069);
            rpar311=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar311.getTree());
            pushFollow(FOLLOW_body_in_letNamedExpression4071);
            body312=body();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_body.add(body312.getTree());


            // AST REWRITE
            // elements: body, LET, bindingSpecPars, variable, lpar, rpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 567:3: -> ^( KEYWORD LET ) ^( FUNCTION_DECL ( variable )? lpar ^( FORMAL_PARAM_LIST ( bindingSpecPars )* ) rpar ^( PROCEDURE_BODY body ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:567:7: ^( KEYWORD LET )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_LET.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:568:4: ^( FUNCTION_DECL ( variable )? lpar ^( FORMAL_PARAM_LIST ( bindingSpecPars )* ) rpar ^( PROCEDURE_BODY body ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:568:21: ( variable )?
                if ( stream_variable.hasNext() ) {
                    adaptor.addChild(root_1, stream_variable.nextTree());

                }
                stream_variable.reset();
                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:569:10: ^( FORMAL_PARAM_LIST ( bindingSpecPars )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:569:31: ( bindingSpecPars )*
                while ( stream_bindingSpecPars.hasNext() ) {
                    adaptor.addChild(root_2, stream_bindingSpecPars.nextTree());

                }
                stream_bindingSpecPars.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:570:5: ^( PROCEDURE_BODY body )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PROCEDURE_BODY, "PROCEDURE_BODY"), root_2);

                adaptor.addChild(root_2, stream_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "letNamedExpression"

    public static class bindingSpecPars_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bindingSpecPars"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:573:1: bindingSpecPars : lpar variable fullExpression rpar -> ^( PARAMETER_DECL variable ^( EXPRESSION fullExpression ) ) ;
    public final SchemeParser.bindingSpecPars_return bindingSpecPars() throws RecognitionException {
        SchemeParser.bindingSpecPars_return retval = new SchemeParser.bindingSpecPars_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar313 = null;

        SchemeParser.variable_return variable314 = null;

        SchemeParser.fullExpression_return fullExpression315 = null;

        SchemeParser.rpar_return rpar316 = null;


        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:574:2: ( lpar variable fullExpression rpar -> ^( PARAMETER_DECL variable ^( EXPRESSION fullExpression ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:574:4: lpar variable fullExpression rpar
            {
            pushFollow(FOLLOW_lpar_in_bindingSpecPars4136);
            lpar313=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar313.getTree());
            pushFollow(FOLLOW_variable_in_bindingSpecPars4138);
            variable314=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_variable.add(variable314.getTree());
            pushFollow(FOLLOW_fullExpression_in_bindingSpecPars4140);
            fullExpression315=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression315.getTree());
            pushFollow(FOLLOW_rpar_in_bindingSpecPars4142);
            rpar316=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar316.getTree());


            // AST REWRITE
            // elements: variable, fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 575:3: -> ^( PARAMETER_DECL variable ^( EXPRESSION fullExpression ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:575:6: ^( PARAMETER_DECL variable ^( EXPRESSION fullExpression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_1);

                adaptor.addChild(root_1, stream_variable.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:575:33: ^( EXPRESSION fullExpression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPRESSION, "EXPRESSION"), root_2);

                adaptor.addChild(root_2, stream_fullExpression.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bindingSpecPars"

    public static class beginExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "beginExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:579:1: beginExpression : BEGIN sequence -> ^( BLOCK_SCOPE BEGIN sequence ) ;
    public final SchemeParser.beginExpression_return beginExpression() throws RecognitionException {
        SchemeParser.beginExpression_return retval = new SchemeParser.beginExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN317=null;
        SchemeParser.sequence_return sequence318 = null;


        CommonTree BEGIN317_tree=null;
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:580:2: ( BEGIN sequence -> ^( BLOCK_SCOPE BEGIN sequence ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:580:4: BEGIN sequence
            {
            BEGIN317=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_beginExpression4174); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_BEGIN.add(BEGIN317);

            pushFollow(FOLLOW_sequence_in_beginExpression4176);
            sequence318=sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequence.add(sequence318.getTree());


            // AST REWRITE
            // elements: BEGIN, sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 581:3: -> ^( BLOCK_SCOPE BEGIN sequence )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:581:6: ^( BLOCK_SCOPE BEGIN sequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_BEGIN.nextNode());
                adaptor.addChild(root_1, stream_sequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "beginExpression"

    public static class doExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:584:1: doExpression : DO lpar ( iterationSpec )* rpar lpar loop_test ( doResult )? rpar ( fullExpression )* -> ^( LOOP_STATEMENT ^( KEYWORD DO ) lpar ( iterationSpec )* rpar lpar ^( CONDITION loop_test ) ( ^( JUMP_STATEMENT doResult ) )? rpar ^( BLOCK_SCOPE ( fullExpression )* ) ) ;
    public final SchemeParser.doExpression_return doExpression() throws RecognitionException {
        SchemeParser.doExpression_return retval = new SchemeParser.doExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DO319=null;
        SchemeParser.lpar_return lpar320 = null;

        SchemeParser.iterationSpec_return iterationSpec321 = null;

        SchemeParser.rpar_return rpar322 = null;

        SchemeParser.lpar_return lpar323 = null;

        SchemeParser.loop_test_return loop_test324 = null;

        SchemeParser.doResult_return doResult325 = null;

        SchemeParser.rpar_return rpar326 = null;

        SchemeParser.fullExpression_return fullExpression327 = null;


        CommonTree DO319_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleSubtreeStream stream_doResult=new RewriteRuleSubtreeStream(adaptor,"rule doResult");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_loop_test=new RewriteRuleSubtreeStream(adaptor,"rule loop_test");
        RewriteRuleSubtreeStream stream_iterationSpec=new RewriteRuleSubtreeStream(adaptor,"rule iterationSpec");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:2: ( DO lpar ( iterationSpec )* rpar lpar loop_test ( doResult )? rpar ( fullExpression )* -> ^( LOOP_STATEMENT ^( KEYWORD DO ) lpar ( iterationSpec )* rpar lpar ^( CONDITION loop_test ) ( ^( JUMP_STATEMENT doResult ) )? rpar ^( BLOCK_SCOPE ( fullExpression )* ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:4: DO lpar ( iterationSpec )* rpar lpar loop_test ( doResult )? rpar ( fullExpression )*
            {
            DO319=(Token)match(input,DO,FOLLOW_DO_in_doExpression4201); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(DO319);

            pushFollow(FOLLOW_lpar_in_doExpression4203);
            lpar320=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar320.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:12: ( iterationSpec )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==153) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:12: iterationSpec
            	    {
            	    pushFollow(FOLLOW_iterationSpec_in_doExpression4205);
            	    iterationSpec321=iterationSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_iterationSpec.add(iterationSpec321.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_doExpression4208);
            rpar322=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar322.getTree());
            pushFollow(FOLLOW_lpar_in_doExpression4210);
            lpar323=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar323.getTree());
            pushFollow(FOLLOW_loop_test_in_doExpression4212);
            loop_test324=loop_test();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_loop_test.add(loop_test324.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:47: ( doResult )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ELLIPSIS||(LA72_0>=VARIABLE && LA72_0<=CHARACTER)||(LA72_0>=NUM_2 && LA72_0<=FALSE)||LA72_0==153||(LA72_0>=156 && LA72_0<=157)||LA72_0==160) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:47: doResult
                    {
                    pushFollow(FOLLOW_doResult_in_doExpression4214);
                    doResult325=doResult();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_doResult.add(doResult325.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_rpar_in_doExpression4217);
            rpar326=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar326.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:62: ( fullExpression )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==ELLIPSIS||(LA73_0>=VARIABLE && LA73_0<=CHARACTER)||(LA73_0>=NUM_2 && LA73_0<=FALSE)||LA73_0==153||(LA73_0>=156 && LA73_0<=157)||LA73_0==160) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:585:62: fullExpression
            	    {
            	    pushFollow(FOLLOW_fullExpression_in_doExpression4219);
            	    fullExpression327=fullExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression327.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);



            // AST REWRITE
            // elements: loop_test, fullExpression, lpar, rpar, doResult, lpar, DO, rpar, iterationSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 586:3: -> ^( LOOP_STATEMENT ^( KEYWORD DO ) lpar ( iterationSpec )* rpar lpar ^( CONDITION loop_test ) ( ^( JUMP_STATEMENT doResult ) )? rpar ^( BLOCK_SCOPE ( fullExpression )* ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:586:6: ^( LOOP_STATEMENT ^( KEYWORD DO ) lpar ( iterationSpec )* rpar lpar ^( CONDITION loop_test ) ( ^( JUMP_STATEMENT doResult ) )? rpar ^( BLOCK_SCOPE ( fullExpression )* ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:587:5: ^( KEYWORD DO )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_DO.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:588:12: ( iterationSpec )*
                while ( stream_iterationSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_iterationSpec.nextTree());

                }
                stream_iterationSpec.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());
                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:589:10: ^( CONDITION loop_test )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_loop_test.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:589:33: ( ^( JUMP_STATEMENT doResult ) )?
                if ( stream_doResult.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:589:33: ^( JUMP_STATEMENT doResult )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_2);

                    adaptor.addChild(root_2, stream_doResult.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_doResult.reset();
                adaptor.addChild(root_1, stream_rpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:589:66: ^( BLOCK_SCOPE ( fullExpression )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:589:80: ( fullExpression )*
                while ( stream_fullExpression.hasNext() ) {
                    adaptor.addChild(root_2, stream_fullExpression.nextTree());

                }
                stream_fullExpression.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doExpression"

    public static class delayExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "delayExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:592:1: delayExpression : DELAY fullExpression -> ^( KEYWORD DELAY ) fullExpression ;
    public final SchemeParser.delayExpression_return delayExpression() throws RecognitionException {
        SchemeParser.delayExpression_return retval = new SchemeParser.delayExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DELAY328=null;
        SchemeParser.fullExpression_return fullExpression329 = null;


        CommonTree DELAY328_tree=null;
        RewriteRuleTokenStream stream_DELAY=new RewriteRuleTokenStream(adaptor,"token DELAY");
        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:593:2: ( DELAY fullExpression -> ^( KEYWORD DELAY ) fullExpression )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:593:4: DELAY fullExpression
            {
            DELAY328=(Token)match(input,DELAY,FOLLOW_DELAY_in_delayExpression4294); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DELAY.add(DELAY328);

            pushFollow(FOLLOW_fullExpression_in_delayExpression4296);
            fullExpression329=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression329.getTree());


            // AST REWRITE
            // elements: DELAY, fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 594:3: -> ^( KEYWORD DELAY ) fullExpression
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:594:6: ^( KEYWORD DELAY )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_DELAY.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_fullExpression.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "delayExpression"

    public static class iterationSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterationSpec"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:597:1: iterationSpec : lpar varDecl init ( step )? rpar -> lpar ^( INIT ^( VAR_DECL ^( ASSIGNMENT_STATEMENT varDecl ^( VALUE init ) ) ) ) ^( STEP ^( ASSIGNMENT_STATEMENT ( step )? ) ) rpar ;
    public final SchemeParser.iterationSpec_return iterationSpec() throws RecognitionException {
        SchemeParser.iterationSpec_return retval = new SchemeParser.iterationSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar330 = null;

        SchemeParser.varDecl_return varDecl331 = null;

        SchemeParser.init_return init332 = null;

        SchemeParser.step_return step333 = null;

        SchemeParser.rpar_return rpar334 = null;


        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_varDecl=new RewriteRuleSubtreeStream(adaptor,"rule varDecl");
        RewriteRuleSubtreeStream stream_init=new RewriteRuleSubtreeStream(adaptor,"rule init");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_step=new RewriteRuleSubtreeStream(adaptor,"rule step");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:598:2: ( lpar varDecl init ( step )? rpar -> lpar ^( INIT ^( VAR_DECL ^( ASSIGNMENT_STATEMENT varDecl ^( VALUE init ) ) ) ) ^( STEP ^( ASSIGNMENT_STATEMENT ( step )? ) ) rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:598:4: lpar varDecl init ( step )? rpar
            {
            pushFollow(FOLLOW_lpar_in_iterationSpec4321);
            lpar330=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar330.getTree());
            pushFollow(FOLLOW_varDecl_in_iterationSpec4323);
            varDecl331=varDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_varDecl.add(varDecl331.getTree());
            pushFollow(FOLLOW_init_in_iterationSpec4325);
            init332=init();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_init.add(init332.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:598:22: ( step )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==ELLIPSIS||(LA74_0>=VARIABLE && LA74_0<=CHARACTER)||(LA74_0>=NUM_2 && LA74_0<=FALSE)||LA74_0==153||(LA74_0>=156 && LA74_0<=157)||LA74_0==160) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:598:22: step
                    {
                    pushFollow(FOLLOW_step_in_iterationSpec4327);
                    step333=step();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_step.add(step333.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_rpar_in_iterationSpec4330);
            rpar334=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar334.getTree());


            // AST REWRITE
            // elements: step, init, lpar, rpar, varDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 599:2: -> lpar ^( INIT ^( VAR_DECL ^( ASSIGNMENT_STATEMENT varDecl ^( VALUE init ) ) ) ) ^( STEP ^( ASSIGNMENT_STATEMENT ( step )? ) ) rpar
            {
                adaptor.addChild(root_0, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:599:10: ^( INIT ^( VAR_DECL ^( ASSIGNMENT_STATEMENT varDecl ^( VALUE init ) ) ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT, "INIT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:599:17: ^( VAR_DECL ^( ASSIGNMENT_STATEMENT varDecl ^( VALUE init ) ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:599:28: ^( ASSIGNMENT_STATEMENT varDecl ^( VALUE init ) )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_3);

                adaptor.addChild(root_3, stream_varDecl.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:599:59: ^( VALUE init )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_4);

                adaptor.addChild(root_4, stream_init.nextTree());

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:599:77: ^( STEP ^( ASSIGNMENT_STATEMENT ( step )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STEP, "STEP"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:599:84: ^( ASSIGNMENT_STATEMENT ( step )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:599:107: ( step )?
                if ( stream_step.hasNext() ) {
                    adaptor.addChild(root_2, stream_step.nextTree());

                }
                stream_step.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_rpar.nextTree());

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "iterationSpec"

    public static class varDecl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:602:1: varDecl : variable ;
    public final SchemeParser.varDecl_return varDecl() throws RecognitionException {
        SchemeParser.varDecl_return retval = new SchemeParser.varDecl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.variable_return variable335 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:603:2: ( variable )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:603:4: variable
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_variable_in_varDecl4381);
            variable335=variable();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, variable335.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class init_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "init"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:607:1: init : fullExpression ;
    public final SchemeParser.init_return init() throws RecognitionException {
        SchemeParser.init_return retval = new SchemeParser.init_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression336 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:608:2: ( fullExpression )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:608:4: fullExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fullExpression_in_init4395);
            fullExpression336=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fullExpression336.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "init"

    public static class step_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "step"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:611:1: step : fullExpression ;
    public final SchemeParser.step_return step() throws RecognitionException {
        SchemeParser.step_return retval = new SchemeParser.step_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression337 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:612:2: ( fullExpression )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:612:4: fullExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fullExpression_in_step4406);
            fullExpression337=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fullExpression337.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "step"

    public static class doResult_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doResult"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:615:1: doResult : sequence ;
    public final SchemeParser.doResult_return doResult() throws RecognitionException {
        SchemeParser.doResult_return retval = new SchemeParser.doResult_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.sequence_return sequence338 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:616:2: ( sequence )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:616:4: sequence
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sequence_in_doResult4417);
            sequence338=sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence338.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doResult"

    public static class procedureCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureCall"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:619:1: procedureCall : lpar operator ( operand )* rpar -> ^( FUNCTION_CALL lpar operator ^( ARGUMENT_LIST ( operand )* ) rpar ) ;
    public final SchemeParser.procedureCall_return procedureCall() throws RecognitionException {
        SchemeParser.procedureCall_return retval = new SchemeParser.procedureCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar339 = null;

        SchemeParser.operator_return operator340 = null;

        SchemeParser.operand_return operand341 = null;

        SchemeParser.rpar_return rpar342 = null;


        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:620:2: ( lpar operator ( operand )* rpar -> ^( FUNCTION_CALL lpar operator ^( ARGUMENT_LIST ( operand )* ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:620:4: lpar operator ( operand )* rpar
            {
            pushFollow(FOLLOW_lpar_in_procedureCall4428);
            lpar339=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar339.getTree());
            pushFollow(FOLLOW_operator_in_procedureCall4430);
            operator340=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator340.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:620:18: ( operand )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==ELLIPSIS||(LA75_0>=VARIABLE && LA75_0<=CHARACTER)||(LA75_0>=NUM_2 && LA75_0<=FALSE)||LA75_0==153||(LA75_0>=156 && LA75_0<=157)||LA75_0==160) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:620:18: operand
            	    {
            	    pushFollow(FOLLOW_operand_in_procedureCall4432);
            	    operand341=operand();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_operand.add(operand341.getTree());

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_procedureCall4435);
            rpar342=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar342.getTree());


            // AST REWRITE
            // elements: rpar, operator, operand, lpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 621:3: -> ^( FUNCTION_CALL lpar operator ^( ARGUMENT_LIST ( operand )* ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:621:6: ^( FUNCTION_CALL lpar operator ^( ARGUMENT_LIST ( operand )* ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                adaptor.addChild(root_1, stream_operator.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:622:19: ^( ARGUMENT_LIST ( operand )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:622:36: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_2, stream_operand.nextTree());

                }
                stream_operand.reset();

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "procedureCall"

    public static class quoteLpar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quoteLpar"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:625:1: quoteLpar : '\\'(' -> ^( SEPARATOR '\\'(' ) ;
    public final SchemeParser.quoteLpar_return quoteLpar() throws RecognitionException {
        SchemeParser.quoteLpar_return retval = new SchemeParser.quoteLpar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal343=null;

        CommonTree string_literal343_tree=null;
        RewriteRuleTokenStream stream_159=new RewriteRuleTokenStream(adaptor,"token 159");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:625:11: ( '\\'(' -> ^( SEPARATOR '\\'(' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:625:13: '\\'('
            {
            string_literal343=(Token)match(input,159,FOLLOW_159_in_quoteLpar4474); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_159.add(string_literal343);



            // AST REWRITE
            // elements: 159
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 625:19: -> ^( SEPARATOR '\\'(' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:625:22: ^( SEPARATOR '\\'(' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_159.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quoteLpar"

    public static class applyExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "applyExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:627:1: applyExpression : lpar APPLY operator ( operand )* quoteLpar ( operand1 )* rpar rpar -> ^( FUNCTION_CALL lpar ^( KEYWORD APPLY ) operator ^( ARGUMENT_LIST ( operand )* quoteLpar ( operand1 )* rpar ) rpar ) ;
    public final SchemeParser.applyExpression_return applyExpression() throws RecognitionException {
        SchemeParser.applyExpression_return retval = new SchemeParser.applyExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token APPLY345=null;
        SchemeParser.lpar_return lpar344 = null;

        SchemeParser.operator_return operator346 = null;

        SchemeParser.operand_return operand347 = null;

        SchemeParser.quoteLpar_return quoteLpar348 = null;

        SchemeParser.operand1_return operand1349 = null;

        SchemeParser.rpar_return rpar350 = null;

        SchemeParser.rpar_return rpar351 = null;


        CommonTree APPLY345_tree=null;
        RewriteRuleTokenStream stream_APPLY=new RewriteRuleTokenStream(adaptor,"token APPLY");
        RewriteRuleSubtreeStream stream_operand1=new RewriteRuleSubtreeStream(adaptor,"rule operand1");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_operand=new RewriteRuleSubtreeStream(adaptor,"rule operand");
        RewriteRuleSubtreeStream stream_quoteLpar=new RewriteRuleSubtreeStream(adaptor,"rule quoteLpar");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        RewriteRuleSubtreeStream stream_operator=new RewriteRuleSubtreeStream(adaptor,"rule operator");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:628:2: ( lpar APPLY operator ( operand )* quoteLpar ( operand1 )* rpar rpar -> ^( FUNCTION_CALL lpar ^( KEYWORD APPLY ) operator ^( ARGUMENT_LIST ( operand )* quoteLpar ( operand1 )* rpar ) rpar ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:628:4: lpar APPLY operator ( operand )* quoteLpar ( operand1 )* rpar rpar
            {
            pushFollow(FOLLOW_lpar_in_applyExpression4494);
            lpar344=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_lpar.add(lpar344.getTree());
            APPLY345=(Token)match(input,APPLY,FOLLOW_APPLY_in_applyExpression4496); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_APPLY.add(APPLY345);

            pushFollow(FOLLOW_operator_in_applyExpression4498);
            operator346=operator();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_operator.add(operator346.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:628:24: ( operand )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==ELLIPSIS||(LA76_0>=VARIABLE && LA76_0<=CHARACTER)||(LA76_0>=NUM_2 && LA76_0<=FALSE)||LA76_0==153||(LA76_0>=156 && LA76_0<=157)||LA76_0==160) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:628:24: operand
            	    {
            	    pushFollow(FOLLOW_operand_in_applyExpression4500);
            	    operand347=operand();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_operand.add(operand347.getTree());

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            pushFollow(FOLLOW_quoteLpar_in_applyExpression4503);
            quoteLpar348=quoteLpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_quoteLpar.add(quoteLpar348.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:628:43: ( operand1 )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==ELLIPSIS||(LA77_0>=VARIABLE && LA77_0<=CHARACTER)||(LA77_0>=NUM_2 && LA77_0<=FALSE)||LA77_0==153||(LA77_0>=156 && LA77_0<=157)||LA77_0==160) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:628:43: operand1
            	    {
            	    pushFollow(FOLLOW_operand1_in_applyExpression4505);
            	    operand1349=operand1();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_operand1.add(operand1349.getTree());

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_applyExpression4508);
            rpar350=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar350.getTree());
            pushFollow(FOLLOW_rpar_in_applyExpression4510);
            rpar351=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_rpar.add(rpar351.getTree());


            // AST REWRITE
            // elements: APPLY, rpar, quoteLpar, rpar, operand, operator, operand1, lpar
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 630:3: -> ^( FUNCTION_CALL lpar ^( KEYWORD APPLY ) operator ^( ARGUMENT_LIST ( operand )* quoteLpar ( operand1 )* rpar ) rpar )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:630:6: ^( FUNCTION_CALL lpar ^( KEYWORD APPLY ) operator ^( ARGUMENT_LIST ( operand )* quoteLpar ( operand1 )* rpar ) rpar )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_lpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:632:5: ^( KEYWORD APPLY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_APPLY.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_operator.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:633:14: ^( ARGUMENT_LIST ( operand )* quoteLpar ( operand1 )* rpar )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:634:22: ( operand )*
                while ( stream_operand.hasNext() ) {
                    adaptor.addChild(root_2, stream_operand.nextTree());

                }
                stream_operand.reset();
                adaptor.addChild(root_2, stream_quoteLpar.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:635:32: ( operand1 )*
                while ( stream_operand1.hasNext() ) {
                    adaptor.addChild(root_2, stream_operand1.nextTree());

                }
                stream_operand1.reset();
                adaptor.addChild(root_2, stream_rpar.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_rpar.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "applyExpression"

    public static class operator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:638:1: operator : fullExpression ;
    public final SchemeParser.operator_return operator() throws RecognitionException {
        SchemeParser.operator_return retval = new SchemeParser.operator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression352 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:639:2: ( fullExpression )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:639:4: fullExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_fullExpression_in_operator4616);
            fullExpression352=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, fullExpression352.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operator"

    public static class operand_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operand"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:642:1: operand : fullExpression -> ^( ARGUMENT fullExpression ) ;
    public final SchemeParser.operand_return operand() throws RecognitionException {
        SchemeParser.operand_return retval = new SchemeParser.operand_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression353 = null;


        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:643:2: ( fullExpression -> ^( ARGUMENT fullExpression ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:643:4: fullExpression
            {
            pushFollow(FOLLOW_fullExpression_in_operand4627);
            fullExpression353=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression353.getTree());


            // AST REWRITE
            // elements: fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 643:19: -> ^( ARGUMENT fullExpression )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:643:22: ^( ARGUMENT fullExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_fullExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operand"

    public static class operand1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "operand1"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:646:1: operand1 : fullExpression -> ^( ARGUMENT fullExpression ) ;
    public final SchemeParser.operand1_return operand1() throws RecognitionException {
        SchemeParser.operand1_return retval = new SchemeParser.operand1_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression354 = null;


        RewriteRuleSubtreeStream stream_fullExpression=new RewriteRuleSubtreeStream(adaptor,"rule fullExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:647:2: ( fullExpression -> ^( ARGUMENT fullExpression ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:647:4: fullExpression
            {
            pushFollow(FOLLOW_fullExpression_in_operand14648);
            fullExpression354=fullExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fullExpression.add(fullExpression354.getTree());


            // AST REWRITE
            // elements: fullExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 647:19: -> ^( ARGUMENT fullExpression )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:647:22: ^( ARGUMENT fullExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                adaptor.addChild(root_1, stream_fullExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "operand1"

    public static class macroUse_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "macroUse"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:650:1: macroUse : lpar keyword ( datum )* rpar ;
    public final SchemeParser.macroUse_return macroUse() throws RecognitionException {
        SchemeParser.macroUse_return retval = new SchemeParser.macroUse_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar355 = null;

        SchemeParser.keyword_return keyword356 = null;

        SchemeParser.datum_return datum357 = null;

        SchemeParser.rpar_return rpar358 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:651:2: ( lpar keyword ( datum )* rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:651:4: lpar keyword ( datum )* rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_macroUse4669);
            lpar355=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar355.getTree());
            pushFollow(FOLLOW_keyword_in_macroUse4671);
            keyword356=keyword();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword356.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:651:17: ( datum )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( ((LA78_0>=ELLIPSIS && LA78_0<=BEGIN)||LA78_0==DEFINE||(LA78_0>=VARIABLE && LA78_0<=QUASIQUOTE)||(LA78_0>=NUM_2 && LA78_0<=FALSE)||LA78_0==153||(LA78_0>=155 && LA78_0<=156)||(LA78_0>=160 && LA78_0<=162)) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:651:17: datum
            	    {
            	    pushFollow(FOLLOW_datum_in_macroUse4673);
            	    datum357=datum();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, datum357.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_macroUse4676);
            rpar358=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar358.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "macroUse"

    public static class macroBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "macroBlock"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:654:1: macroBlock : ( lpar LET_SYNTAX lpar ( syntaxSpec )* rpar body rpar -> lpar ^( KEYWORD LET_SYNTAX ) lpar ( syntaxSpec )* rpar body rpar | lpar LETREC_SYNTAX lpar ( syntaxSpec )* rpar body rpar -> lpar ^( KEYWORD LETREC_SYNTAX ) lpar ( syntaxSpec )* rpar body rpar );
    public final SchemeParser.macroBlock_return macroBlock() throws RecognitionException {
        SchemeParser.macroBlock_return retval = new SchemeParser.macroBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LET_SYNTAX360=null;
        Token LETREC_SYNTAX367=null;
        SchemeParser.lpar_return lpar359 = null;

        SchemeParser.lpar_return lpar361 = null;

        SchemeParser.syntaxSpec_return syntaxSpec362 = null;

        SchemeParser.rpar_return rpar363 = null;

        SchemeParser.body_return body364 = null;

        SchemeParser.rpar_return rpar365 = null;

        SchemeParser.lpar_return lpar366 = null;

        SchemeParser.lpar_return lpar368 = null;

        SchemeParser.syntaxSpec_return syntaxSpec369 = null;

        SchemeParser.rpar_return rpar370 = null;

        SchemeParser.body_return body371 = null;

        SchemeParser.rpar_return rpar372 = null;


        CommonTree LET_SYNTAX360_tree=null;
        CommonTree LETREC_SYNTAX367_tree=null;
        RewriteRuleTokenStream stream_LET_SYNTAX=new RewriteRuleTokenStream(adaptor,"token LET_SYNTAX");
        RewriteRuleTokenStream stream_LETREC_SYNTAX=new RewriteRuleTokenStream(adaptor,"token LETREC_SYNTAX");
        RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"rule body");
        RewriteRuleSubtreeStream stream_lpar=new RewriteRuleSubtreeStream(adaptor,"rule lpar");
        RewriteRuleSubtreeStream stream_syntaxSpec=new RewriteRuleSubtreeStream(adaptor,"rule syntaxSpec");
        RewriteRuleSubtreeStream stream_rpar=new RewriteRuleSubtreeStream(adaptor,"rule rpar");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:655:2: ( lpar LET_SYNTAX lpar ( syntaxSpec )* rpar body rpar -> lpar ^( KEYWORD LET_SYNTAX ) lpar ( syntaxSpec )* rpar body rpar | lpar LETREC_SYNTAX lpar ( syntaxSpec )* rpar body rpar -> lpar ^( KEYWORD LETREC_SYNTAX ) lpar ( syntaxSpec )* rpar body rpar )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==153) ) {
                int LA81_1 = input.LA(2);

                if ( (LA81_1==LETREC_SYNTAX) ) {
                    alt81=2;
                }
                else if ( (LA81_1==LET_SYNTAX) ) {
                    alt81=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:655:4: lpar LET_SYNTAX lpar ( syntaxSpec )* rpar body rpar
                    {
                    pushFollow(FOLLOW_lpar_in_macroBlock4687);
                    lpar359=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar359.getTree());
                    LET_SYNTAX360=(Token)match(input,LET_SYNTAX,FOLLOW_LET_SYNTAX_in_macroBlock4689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LET_SYNTAX.add(LET_SYNTAX360);

                    pushFollow(FOLLOW_lpar_in_macroBlock4691);
                    lpar361=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar361.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:655:25: ( syntaxSpec )*
                    loop79:
                    do {
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==153) ) {
                            alt79=1;
                        }


                        switch (alt79) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:655:25: syntaxSpec
                    	    {
                    	    pushFollow(FOLLOW_syntaxSpec_in_macroBlock4693);
                    	    syntaxSpec362=syntaxSpec();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_syntaxSpec.add(syntaxSpec362.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop79;
                        }
                    } while (true);

                    pushFollow(FOLLOW_rpar_in_macroBlock4696);
                    rpar363=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar363.getTree());
                    pushFollow(FOLLOW_body_in_macroBlock4698);
                    body364=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body364.getTree());
                    pushFollow(FOLLOW_rpar_in_macroBlock4700);
                    rpar365=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar365.getTree());


                    // AST REWRITE
                    // elements: rpar, LET_SYNTAX, lpar, lpar, syntaxSpec, body, rpar
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 656:3: -> lpar ^( KEYWORD LET_SYNTAX ) lpar ( syntaxSpec )* rpar body rpar
                    {
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:656:11: ^( KEYWORD LET_SYNTAX )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                        adaptor.addChild(root_1, stream_LET_SYNTAX.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:656:40: ( syntaxSpec )*
                        while ( stream_syntaxSpec.hasNext() ) {
                            adaptor.addChild(root_0, stream_syntaxSpec.nextTree());

                        }
                        stream_syntaxSpec.reset();
                        adaptor.addChild(root_0, stream_rpar.nextTree());
                        adaptor.addChild(root_0, stream_body.nextTree());
                        adaptor.addChild(root_0, stream_rpar.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:658:4: lpar LETREC_SYNTAX lpar ( syntaxSpec )* rpar body rpar
                    {
                    pushFollow(FOLLOW_lpar_in_macroBlock4731);
                    lpar366=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar366.getTree());
                    LETREC_SYNTAX367=(Token)match(input,LETREC_SYNTAX,FOLLOW_LETREC_SYNTAX_in_macroBlock4733); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LETREC_SYNTAX.add(LETREC_SYNTAX367);

                    pushFollow(FOLLOW_lpar_in_macroBlock4735);
                    lpar368=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_lpar.add(lpar368.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:658:28: ( syntaxSpec )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==153) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:658:28: syntaxSpec
                    	    {
                    	    pushFollow(FOLLOW_syntaxSpec_in_macroBlock4737);
                    	    syntaxSpec369=syntaxSpec();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_syntaxSpec.add(syntaxSpec369.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    pushFollow(FOLLOW_rpar_in_macroBlock4740);
                    rpar370=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar370.getTree());
                    pushFollow(FOLLOW_body_in_macroBlock4742);
                    body371=body();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_body.add(body371.getTree());
                    pushFollow(FOLLOW_rpar_in_macroBlock4744);
                    rpar372=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rpar.add(rpar372.getTree());


                    // AST REWRITE
                    // elements: lpar, syntaxSpec, rpar, lpar, rpar, LETREC_SYNTAX, body
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 659:3: -> lpar ^( KEYWORD LETREC_SYNTAX ) lpar ( syntaxSpec )* rpar body rpar
                    {
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:659:11: ^( KEYWORD LETREC_SYNTAX )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                        adaptor.addChild(root_1, stream_LETREC_SYNTAX.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_lpar.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:659:43: ( syntaxSpec )*
                        while ( stream_syntaxSpec.hasNext() ) {
                            adaptor.addChild(root_0, stream_syntaxSpec.nextTree());

                        }
                        stream_syntaxSpec.reset();
                        adaptor.addChild(root_0, stream_rpar.nextTree());
                        adaptor.addChild(root_0, stream_body.nextTree());
                        adaptor.addChild(root_0, stream_rpar.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "macroBlock"

    public static class syntaxSpec_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "syntaxSpec"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:662:1: syntaxSpec : lpar keyword transformerSpec rpar ;
    public final SchemeParser.syntaxSpec_return syntaxSpec() throws RecognitionException {
        SchemeParser.syntaxSpec_return retval = new SchemeParser.syntaxSpec_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar373 = null;

        SchemeParser.keyword_return keyword374 = null;

        SchemeParser.transformerSpec_return transformerSpec375 = null;

        SchemeParser.rpar_return rpar376 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:663:2: ( lpar keyword transformerSpec rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:663:4: lpar keyword transformerSpec rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_lpar_in_syntaxSpec4780);
            lpar373=lpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar373.getTree());
            pushFollow(FOLLOW_keyword_in_syntaxSpec4782);
            keyword374=keyword();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, keyword374.getTree());
            pushFollow(FOLLOW_transformerSpec_in_syntaxSpec4784);
            transformerSpec375=transformerSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, transformerSpec375.getTree());
            pushFollow(FOLLOW_rpar_in_syntaxSpec4786);
            rpar376=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar376.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "syntaxSpec"

    public static class body_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "body"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:666:1: body : ( ( lpar DEFINE )=> definition )* sequence ;
    public final SchemeParser.body_return body() throws RecognitionException {
        SchemeParser.body_return retval = new SchemeParser.body_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.definition_return definition377 = null;

        SchemeParser.sequence_return sequence378 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:667:2: ( ( ( lpar DEFINE )=> definition )* sequence )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:667:4: ( ( lpar DEFINE )=> definition )* sequence
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:667:4: ( ( lpar DEFINE )=> definition )*
            loop82:
            do {
                int alt82=2;
                alt82 = dfa82.predict(input);
                switch (alt82) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:667:6: ( lpar DEFINE )=> definition
            	    {
            	    pushFollow(FOLLOW_definition_in_body4808);
            	    definition377=definition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, definition377.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            pushFollow(FOLLOW_sequence_in_body4813);
            sequence378=sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence378.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "body"

    public static class blockScope_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockScope"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:670:1: blockScope : sequence -> ^( BLOCK_SCOPE sequence ) ;
    public final SchemeParser.blockScope_return blockScope() throws RecognitionException {
        SchemeParser.blockScope_return retval = new SchemeParser.blockScope_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.sequence_return sequence379 = null;


        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:671:2: ( sequence -> ^( BLOCK_SCOPE sequence ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:671:4: sequence
            {
            pushFollow(FOLLOW_sequence_in_blockScope4824);
            sequence379=sequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_sequence.add(sequence379.getTree());


            // AST REWRITE
            // elements: sequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 672:3: -> ^( BLOCK_SCOPE sequence )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:672:6: ^( BLOCK_SCOPE sequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_sequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "blockScope"

    public static class sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sequence"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:675:1: sequence : ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sequence )? | jumpableExpression ( sequence -> jumpableExpression sequence | -> ^( JUMP_STATEMENT jumpableExpression ) ) );
    public final SchemeParser.sequence_return sequence() throws RecognitionException {
        SchemeParser.sequence_return retval = new SchemeParser.sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.nonJumpExpression_return nonJumpExpression380 = null;

        SchemeParser.sequence_return sequence381 = null;

        SchemeParser.jumpableExpression_return jumpableExpression382 = null;

        SchemeParser.sequence_return sequence383 = null;


        RewriteRuleSubtreeStream stream_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sequence");
        RewriteRuleSubtreeStream stream_jumpableExpression=new RewriteRuleSubtreeStream(adaptor,"rule jumpableExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:676:3: ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sequence )? | jumpableExpression ( sequence -> jumpableExpression sequence | -> ^( JUMP_STATEMENT jumpableExpression ) ) )
            int alt85=2;
            alt85 = dfa85.predict(input);
            switch (alt85) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:677:4: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sequence )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:677:4: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:677:5: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression
                    {
                    pushFollow(FOLLOW_nonJumpExpression_in_sequence4883);
                    nonJumpExpression380=nonJumpExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonJumpExpression380.getTree());

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:677:74: ( sequence )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==ELLIPSIS||(LA83_0>=VARIABLE && LA83_0<=CHARACTER)||(LA83_0>=NUM_2 && LA83_0<=FALSE)||LA83_0==153||(LA83_0>=156 && LA83_0<=157)||LA83_0==160) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:677:74: sequence
                            {
                            pushFollow(FOLLOW_sequence_in_sequence4886);
                            sequence381=sequence();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sequence381.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:678:6: jumpableExpression ( sequence -> jumpableExpression sequence | -> ^( JUMP_STATEMENT jumpableExpression ) )
                    {
                    pushFollow(FOLLOW_jumpableExpression_in_sequence4894);
                    jumpableExpression382=jumpableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jumpableExpression.add(jumpableExpression382.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:679:5: ( sequence -> jumpableExpression sequence | -> ^( JUMP_STATEMENT jumpableExpression ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==ELLIPSIS||(LA84_0>=VARIABLE && LA84_0<=CHARACTER)||(LA84_0>=NUM_2 && LA84_0<=FALSE)||LA84_0==153||(LA84_0>=156 && LA84_0<=157)||LA84_0==160) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==EOF||LA84_0==154) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:679:8: sequence
                            {
                            pushFollow(FOLLOW_sequence_in_sequence4904);
                            sequence383=sequence();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sequence.add(sequence383.getTree());


                            // AST REWRITE
                            // elements: sequence, jumpableExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 679:17: -> jumpableExpression sequence
                            {
                                adaptor.addChild(root_0, stream_jumpableExpression.nextTree());
                                adaptor.addChild(root_0, stream_sequence.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:680:8: 
                            {

                            // AST REWRITE
                            // elements: jumpableExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 680:8: -> ^( JUMP_STATEMENT jumpableExpression )
                            {
                                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:680:11: ^( JUMP_STATEMENT jumpableExpression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                                adaptor.addChild(root_1, stream_jumpableExpression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sequence"

    public static class sub_sequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sub_sequence"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:684:1: sub_sequence : ( ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sub_sequence )? ) | ( jumpableExpression ( ( -> ^( JUMP_STATEMENT jumpableExpression ) ) | sub_sequence -> jumpableExpression sub_sequence ) ) );
    public final SchemeParser.sub_sequence_return sub_sequence() throws RecognitionException {
        SchemeParser.sub_sequence_return retval = new SchemeParser.sub_sequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.nonJumpExpression_return nonJumpExpression384 = null;

        SchemeParser.sub_sequence_return sub_sequence385 = null;

        SchemeParser.jumpableExpression_return jumpableExpression386 = null;

        SchemeParser.sub_sequence_return sub_sequence387 = null;


        RewriteRuleSubtreeStream stream_jumpableExpression=new RewriteRuleSubtreeStream(adaptor,"rule jumpableExpression");
        RewriteRuleSubtreeStream stream_sub_sequence=new RewriteRuleSubtreeStream(adaptor,"rule sub_sequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:685:2: ( ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sub_sequence )? ) | ( jumpableExpression ( ( -> ^( JUMP_STATEMENT jumpableExpression ) ) | sub_sequence -> jumpableExpression sub_sequence ) ) )
            int alt88=2;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:2: ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sub_sequence )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:2: ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sub_sequence )? )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:3: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sub_sequence )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:3: ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:4: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression
                    {
                    pushFollow(FOLLOW_nonJumpExpression_in_sub_sequence4978);
                    nonJumpExpression384=nonJumpExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonJumpExpression384.getTree());

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:73: ( sub_sequence )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==ELLIPSIS||(LA86_0>=VARIABLE && LA86_0<=CHARACTER)||(LA86_0>=NUM_2 && LA86_0<=FALSE)||LA86_0==153||(LA86_0>=156 && LA86_0<=157)||LA86_0==160) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:73: sub_sequence
                            {
                            pushFollow(FOLLOW_sub_sequence_in_sub_sequence4981);
                            sub_sequence385=sub_sequence();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, sub_sequence385.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:687:6: ( jumpableExpression ( ( -> ^( JUMP_STATEMENT jumpableExpression ) ) | sub_sequence -> jumpableExpression sub_sequence ) )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:687:6: ( jumpableExpression ( ( -> ^( JUMP_STATEMENT jumpableExpression ) ) | sub_sequence -> jumpableExpression sub_sequence ) )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:687:7: jumpableExpression ( ( -> ^( JUMP_STATEMENT jumpableExpression ) ) | sub_sequence -> jumpableExpression sub_sequence )
                    {
                    pushFollow(FOLLOW_jumpableExpression_in_sub_sequence4991);
                    jumpableExpression386=jumpableExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_jumpableExpression.add(jumpableExpression386.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:688:7: ( ( -> ^( JUMP_STATEMENT jumpableExpression ) ) | sub_sequence -> jumpableExpression sub_sequence )
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==154) ) {
                        alt87=1;
                    }
                    else if ( (LA87_0==ELLIPSIS||(LA87_0>=VARIABLE && LA87_0<=CHARACTER)||(LA87_0>=NUM_2 && LA87_0<=FALSE)||LA87_0==153||(LA87_0>=156 && LA87_0<=157)||LA87_0==160) ) {
                        alt87=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 87, 0, input);

                        throw nvae;
                    }
                    switch (alt87) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:688:10: ( -> ^( JUMP_STATEMENT jumpableExpression ) )
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:688:10: ( -> ^( JUMP_STATEMENT jumpableExpression ) )
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:688:11: 
                            {

                            // AST REWRITE
                            // elements: jumpableExpression
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 688:11: -> ^( JUMP_STATEMENT jumpableExpression )
                            {
                                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:688:14: ^( JUMP_STATEMENT jumpableExpression )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                                adaptor.addChild(root_1, stream_jumpableExpression.nextTree());

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:689:10: sub_sequence
                            {
                            pushFollow(FOLLOW_sub_sequence_in_sub_sequence5024);
                            sub_sequence387=sub_sequence();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sub_sequence.add(sub_sequence387.getTree());


                            // AST REWRITE
                            // elements: jumpableExpression, sub_sequence
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 689:23: -> jumpableExpression sub_sequence
                            {
                                adaptor.addChild(root_0, stream_jumpableExpression.nextTree());
                                adaptor.addChild(root_0, stream_sub_sequence.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;

                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "sub_sequence"

    public static class datum_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "datum"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:692:1: datum : ( simpleDatum | compoundDatum );
    public final SchemeParser.datum_return datum() throws RecognitionException {
        SchemeParser.datum_return retval = new SchemeParser.datum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.simpleDatum_return simpleDatum388 = null;

        SchemeParser.compoundDatum_return compoundDatum389 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:693:2: ( simpleDatum | compoundDatum )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=ELLIPSIS && LA89_0<=BEGIN)||LA89_0==DEFINE||(LA89_0>=VARIABLE && LA89_0<=QUASIQUOTE)||(LA89_0>=NUM_2 && LA89_0<=FALSE)) ) {
                alt89=1;
            }
            else if ( (LA89_0==153||(LA89_0>=155 && LA89_0<=156)||(LA89_0>=160 && LA89_0<=162)) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:693:4: simpleDatum
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simpleDatum_in_datum5045);
                    simpleDatum388=simpleDatum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum388.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:694:4: compoundDatum
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_compoundDatum_in_datum5050);
                    compoundDatum389=compoundDatum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, compoundDatum389.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "datum"

    public static class simpleDatum_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleDatum"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:697:1: simpleDatum : ( bool | number | CHARACTER -> ^( CONST CHARACTER ) | STRING -> ^( CONST STRING ) | identifier );
    public final SchemeParser.simpleDatum_return simpleDatum() throws RecognitionException {
        SchemeParser.simpleDatum_return retval = new SchemeParser.simpleDatum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CHARACTER392=null;
        Token STRING393=null;
        SchemeParser.bool_return bool390 = null;

        SchemeParser.number_return number391 = null;

        SchemeParser.identifier_return identifier394 = null;


        CommonTree CHARACTER392_tree=null;
        CommonTree STRING393_tree=null;
        RewriteRuleTokenStream stream_CHARACTER=new RewriteRuleTokenStream(adaptor,"token CHARACTER");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:698:2: ( bool | number | CHARACTER -> ^( CONST CHARACTER ) | STRING -> ^( CONST STRING ) | identifier )
            int alt90=5;
            switch ( input.LA(1) ) {
            case TRUE:
            case FALSE:
                {
                alt90=1;
                }
                break;
            case NUM_2:
            case NUM_8:
            case NUM_10:
            case NUM_16:
                {
                alt90=2;
                }
                break;
            case CHARACTER:
                {
                alt90=3;
                }
                break;
            case STRING:
                {
                alt90=4;
                }
                break;
            case ELLIPSIS:
            case BEGIN:
            case DEFINE:
            case VARIABLE:
            case ELSE:
            case ARROW:
            case UNQUOTE:
            case UNQUOTE_SPLICING:
            case QUOTE:
            case LAMBDA:
            case IF:
            case SET:
            case COND:
            case AND:
            case OR:
            case CASE:
            case LET:
            case LETSTAR:
            case LETREC:
            case DO:
            case DELAY:
            case QUASIQUOTE:
                {
                alt90=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:698:4: bool
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_bool_in_simpleDatum5061);
                    bool390=bool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, bool390.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:699:4: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_simpleDatum5066);
                    number391=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number391.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:700:4: CHARACTER
                    {
                    CHARACTER392=(Token)match(input,CHARACTER,FOLLOW_CHARACTER_in_simpleDatum5071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CHARACTER.add(CHARACTER392);



                    // AST REWRITE
                    // elements: CHARACTER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 700:14: -> ^( CONST CHARACTER )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:700:17: ^( CONST CHARACTER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_CHARACTER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:701:4: STRING
                    {
                    STRING393=(Token)match(input,STRING,FOLLOW_STRING_in_simpleDatum5086); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING393);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 701:12: -> ^( CONST STRING )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:701:15: ^( CONST STRING )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:702:4: identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_identifier_in_simpleDatum5102);
                    identifier394=identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier394.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simpleDatum"

    public static class compoundDatum_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "compoundDatum"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:705:1: compoundDatum : ( list | vector );
    public final SchemeParser.compoundDatum_return compoundDatum() throws RecognitionException {
        SchemeParser.compoundDatum_return retval = new SchemeParser.compoundDatum_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.list_return list395 = null;

        SchemeParser.vector_return vector396 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:706:2: ( list | vector )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==153||LA91_0==156||(LA91_0>=160 && LA91_0<=162)) ) {
                alt91=1;
            }
            else if ( (LA91_0==155) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:706:4: list
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_list_in_compoundDatum5113);
                    list395=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, list395.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:707:4: vector
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_vector_in_compoundDatum5118);
                    vector396=vector();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vector396.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "compoundDatum"

    public static class list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:710:1: list : ( lpar ( ( datum )+ ( dot datum )? )? rpar | abbreviation );
    public final SchemeParser.list_return list() throws RecognitionException {
        SchemeParser.list_return retval = new SchemeParser.list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.lpar_return lpar397 = null;

        SchemeParser.datum_return datum398 = null;

        SchemeParser.dot_return dot399 = null;

        SchemeParser.datum_return datum400 = null;

        SchemeParser.rpar_return rpar401 = null;

        SchemeParser.abbreviation_return abbreviation402 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:2: ( lpar ( ( datum )+ ( dot datum )? )? rpar | abbreviation )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==153) ) {
                alt95=1;
            }
            else if ( (LA95_0==156||(LA95_0>=160 && LA95_0<=162)) ) {
                alt95=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:4: lpar ( ( datum )+ ( dot datum )? )? rpar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_list5129);
                    lpar397=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar397.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:9: ( ( datum )+ ( dot datum )? )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( ((LA94_0>=ELLIPSIS && LA94_0<=BEGIN)||LA94_0==DEFINE||(LA94_0>=VARIABLE && LA94_0<=QUASIQUOTE)||(LA94_0>=NUM_2 && LA94_0<=FALSE)||LA94_0==153||(LA94_0>=155 && LA94_0<=156)||(LA94_0>=160 && LA94_0<=162)) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:11: ( datum )+ ( dot datum )?
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:11: ( datum )+
                            int cnt92=0;
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( ((LA92_0>=ELLIPSIS && LA92_0<=BEGIN)||LA92_0==DEFINE||(LA92_0>=VARIABLE && LA92_0<=QUASIQUOTE)||(LA92_0>=NUM_2 && LA92_0<=FALSE)||LA92_0==153||(LA92_0>=155 && LA92_0<=156)||(LA92_0>=160 && LA92_0<=162)) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:11: datum
                            	    {
                            	    pushFollow(FOLLOW_datum_in_list5133);
                            	    datum398=datum();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, datum398.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt92 >= 1 ) break loop92;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(92, input);
                                        throw eee;
                                }
                                cnt92++;
                            } while (true);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:18: ( dot datum )?
                            int alt93=2;
                            int LA93_0 = input.LA(1);

                            if ( (LA93_0==158) ) {
                                alt93=1;
                            }
                            switch (alt93) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:711:20: dot datum
                                    {
                                    pushFollow(FOLLOW_dot_in_list5138);
                                    dot399=dot();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dot399.getTree());
                                    pushFollow(FOLLOW_datum_in_list5140);
                                    datum400=datum();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, datum400.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    pushFollow(FOLLOW_rpar_in_list5148);
                    rpar401=rpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar401.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:712:4: abbreviation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_abbreviation_in_list5153);
                    abbreviation402=abbreviation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, abbreviation402.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class abbreviation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "abbreviation"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:715:1: abbreviation : abbrevPrefix datum ;
    public final SchemeParser.abbreviation_return abbreviation() throws RecognitionException {
        SchemeParser.abbreviation_return retval = new SchemeParser.abbreviation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.abbrevPrefix_return abbrevPrefix403 = null;

        SchemeParser.datum_return datum404 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:716:2: ( abbrevPrefix datum )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:716:4: abbrevPrefix datum
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_abbrevPrefix_in_abbreviation5164);
            abbrevPrefix403=abbrevPrefix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, abbrevPrefix403.getTree());
            pushFollow(FOLLOW_datum_in_abbreviation5166);
            datum404=datum();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, datum404.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "abbreviation"

    public static class abbrevPrefix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "abbrevPrefix"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:719:1: abbrevPrefix : ( '\\'' -> ^( SEPARATOR '\\'' ) | '`' -> ^( SEPARATOR '`' ) | ',@' -> ^( SEPARATOR ',@' ) | ',' -> ^( SEPARATOR ',' ) );
    public final SchemeParser.abbrevPrefix_return abbrevPrefix() throws RecognitionException {
        SchemeParser.abbrevPrefix_return retval = new SchemeParser.abbrevPrefix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal405=null;
        Token char_literal406=null;
        Token string_literal407=null;
        Token char_literal408=null;

        CommonTree char_literal405_tree=null;
        CommonTree char_literal406_tree=null;
        CommonTree string_literal407_tree=null;
        CommonTree char_literal408_tree=null;
        RewriteRuleTokenStream stream_161=new RewriteRuleTokenStream(adaptor,"token 161");
        RewriteRuleTokenStream stream_162=new RewriteRuleTokenStream(adaptor,"token 162");
        RewriteRuleTokenStream stream_160=new RewriteRuleTokenStream(adaptor,"token 160");
        RewriteRuleTokenStream stream_156=new RewriteRuleTokenStream(adaptor,"token 156");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:720:2: ( '\\'' -> ^( SEPARATOR '\\'' ) | '`' -> ^( SEPARATOR '`' ) | ',@' -> ^( SEPARATOR ',@' ) | ',' -> ^( SEPARATOR ',' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 156:
                {
                alt96=1;
                }
                break;
            case 160:
                {
                alt96=2;
                }
                break;
            case 161:
                {
                alt96=3;
                }
                break;
            case 162:
                {
                alt96=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:720:4: '\\''
                    {
                    char_literal405=(Token)match(input,156,FOLLOW_156_in_abbrevPrefix5177); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_156.add(char_literal405);



                    // AST REWRITE
                    // elements: 156
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 720:9: -> ^( SEPARATOR '\\'' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:720:12: ^( SEPARATOR '\\'' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_156.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:721:4: '`'
                    {
                    char_literal406=(Token)match(input,160,FOLLOW_160_in_abbrevPrefix5192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_160.add(char_literal406);



                    // AST REWRITE
                    // elements: 160
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 721:9: -> ^( SEPARATOR '`' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:721:12: ^( SEPARATOR '`' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_160.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:722:4: ',@'
                    {
                    string_literal407=(Token)match(input,161,FOLLOW_161_in_abbrevPrefix5209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_161.add(string_literal407);



                    // AST REWRITE
                    // elements: 161
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 722:9: -> ^( SEPARATOR ',@' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:722:12: ^( SEPARATOR ',@' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_161.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:723:4: ','
                    {
                    char_literal408=(Token)match(input,162,FOLLOW_162_in_abbrevPrefix5224); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_162.add(char_literal408);



                    // AST REWRITE
                    // elements: 162
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 723:9: -> ^( SEPARATOR ',' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:723:12: ^( SEPARATOR ',' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_162.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "abbrevPrefix"

    public static class vector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vector"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:726:1: vector : sharpLpar ( datum )* rpar ;
    public final SchemeParser.vector_return vector() throws RecognitionException {
        SchemeParser.vector_return retval = new SchemeParser.vector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.sharpLpar_return sharpLpar409 = null;

        SchemeParser.datum_return datum410 = null;

        SchemeParser.rpar_return rpar411 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:727:2: ( sharpLpar ( datum )* rpar )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:727:4: sharpLpar ( datum )* rpar
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_sharpLpar_in_vector5246);
            sharpLpar409=sharpLpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, sharpLpar409.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:727:14: ( datum )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=ELLIPSIS && LA97_0<=BEGIN)||LA97_0==DEFINE||(LA97_0>=VARIABLE && LA97_0<=QUASIQUOTE)||(LA97_0>=NUM_2 && LA97_0<=FALSE)||LA97_0==153||(LA97_0>=155 && LA97_0<=156)||(LA97_0>=160 && LA97_0<=162)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:727:14: datum
            	    {
            	    pushFollow(FOLLOW_datum_in_vector5248);
            	    datum410=datum();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, datum410.getTree());

            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            pushFollow(FOLLOW_rpar_in_vector5251);
            rpar411=rpar();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, rpar411.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vector"

    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:730:1: number : ( NUM_2 -> ^( CONST NUM_2 ) | NUM_8 -> ^( CONST NUM_8 ) | NUM_10 -> ^( CONST NUM_10 ) | NUM_16 -> ^( CONST NUM_16 ) );
    public final SchemeParser.number_return number() throws RecognitionException {
        SchemeParser.number_return retval = new SchemeParser.number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NUM_2412=null;
        Token NUM_8413=null;
        Token NUM_10414=null;
        Token NUM_16415=null;

        CommonTree NUM_2412_tree=null;
        CommonTree NUM_8413_tree=null;
        CommonTree NUM_10414_tree=null;
        CommonTree NUM_16415_tree=null;
        RewriteRuleTokenStream stream_NUM_16=new RewriteRuleTokenStream(adaptor,"token NUM_16");
        RewriteRuleTokenStream stream_NUM_2=new RewriteRuleTokenStream(adaptor,"token NUM_2");
        RewriteRuleTokenStream stream_NUM_8=new RewriteRuleTokenStream(adaptor,"token NUM_8");
        RewriteRuleTokenStream stream_NUM_10=new RewriteRuleTokenStream(adaptor,"token NUM_10");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:731:2: ( NUM_2 -> ^( CONST NUM_2 ) | NUM_8 -> ^( CONST NUM_8 ) | NUM_10 -> ^( CONST NUM_10 ) | NUM_16 -> ^( CONST NUM_16 ) )
            int alt98=4;
            switch ( input.LA(1) ) {
            case NUM_2:
                {
                alt98=1;
                }
                break;
            case NUM_8:
                {
                alt98=2;
                }
                break;
            case NUM_10:
                {
                alt98=3;
                }
                break;
            case NUM_16:
                {
                alt98=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:731:4: NUM_2
                    {
                    NUM_2412=(Token)match(input,NUM_2,FOLLOW_NUM_2_in_number5262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUM_2.add(NUM_2412);



                    // AST REWRITE
                    // elements: NUM_2
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 731:10: -> ^( CONST NUM_2 )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:731:13: ^( CONST NUM_2 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_NUM_2.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:732:4: NUM_8
                    {
                    NUM_8413=(Token)match(input,NUM_8,FOLLOW_NUM_8_in_number5277); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUM_8.add(NUM_8413);



                    // AST REWRITE
                    // elements: NUM_8
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 732:10: -> ^( CONST NUM_8 )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:732:13: ^( CONST NUM_8 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_NUM_8.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:733:4: NUM_10
                    {
                    NUM_10414=(Token)match(input,NUM_10,FOLLOW_NUM_10_in_number5292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUM_10.add(NUM_10414);



                    // AST REWRITE
                    // elements: NUM_10
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 733:11: -> ^( CONST NUM_10 )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:733:14: ^( CONST NUM_10 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_NUM_10.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:734:4: NUM_16
                    {
                    NUM_16415=(Token)match(input,NUM_16,FOLLOW_NUM_16_in_number5307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NUM_16.add(NUM_16415);



                    // AST REWRITE
                    // elements: NUM_16
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 734:11: -> ^( CONST NUM_16 )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:734:14: ^( CONST NUM_16 )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_NUM_16.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "number"

    public static class bool_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bool"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:737:1: bool : ( TRUE -> ^( CONST TRUE ) | FALSE -> ^( CONST FALSE ) );
    public final SchemeParser.bool_return bool() throws RecognitionException {
        SchemeParser.bool_return retval = new SchemeParser.bool_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRUE416=null;
        Token FALSE417=null;

        CommonTree TRUE416_tree=null;
        CommonTree FALSE417_tree=null;
        RewriteRuleTokenStream stream_FALSE=new RewriteRuleTokenStream(adaptor,"token FALSE");
        RewriteRuleTokenStream stream_TRUE=new RewriteRuleTokenStream(adaptor,"token TRUE");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:738:2: ( TRUE -> ^( CONST TRUE ) | FALSE -> ^( CONST FALSE ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==TRUE) ) {
                alt99=1;
            }
            else if ( (LA99_0==FALSE) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:738:4: TRUE
                    {
                    TRUE416=(Token)match(input,TRUE,FOLLOW_TRUE_in_bool5328); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TRUE.add(TRUE416);



                    // AST REWRITE
                    // elements: TRUE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 738:9: -> ^( CONST TRUE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:738:12: ^( CONST TRUE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_TRUE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:739:4: FALSE
                    {
                    FALSE417=(Token)match(input,FALSE,FOLLOW_FALSE_in_bool5343); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FALSE.add(FALSE417);



                    // AST REWRITE
                    // elements: FALSE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 739:10: -> ^( CONST FALSE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:739:13: ^( CONST FALSE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_FALSE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bool"

    public static class quasiquotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quasiquotation"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:742:1: quasiquotation : quasiquotationD[1] ;
    public final SchemeParser.quasiquotation_return quasiquotation() throws RecognitionException {
        SchemeParser.quasiquotation_return retval = new SchemeParser.quasiquotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.quasiquotationD_return quasiquotationD418 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:743:2: ( quasiquotationD[1] )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:743:4: quasiquotationD[1]
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_quasiquotationD_in_quasiquotation5364);
            quasiquotationD418=quasiquotationD(1);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD418.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quasiquotation"

    public static class quasiquotationD_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quasiquotationD"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:746:1: quasiquotationD[int d] : ( '`' qqTemplate[d] | lpar QUASIQUOTE qqTemplate[d] ')' );
    public final SchemeParser.quasiquotationD_return quasiquotationD(int d) throws RecognitionException {
        SchemeParser.quasiquotationD_return retval = new SchemeParser.quasiquotationD_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal419=null;
        Token QUASIQUOTE422=null;
        Token char_literal424=null;
        SchemeParser.qqTemplate_return qqTemplate420 = null;

        SchemeParser.lpar_return lpar421 = null;

        SchemeParser.qqTemplate_return qqTemplate423 = null;


        CommonTree char_literal419_tree=null;
        CommonTree QUASIQUOTE422_tree=null;
        CommonTree char_literal424_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:747:2: ( '`' qqTemplate[d] | lpar QUASIQUOTE qqTemplate[d] ')' )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==160) ) {
                alt100=1;
            }
            else if ( (LA100_0==153) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:747:4: '`' qqTemplate[d]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal419=(Token)match(input,160,FOLLOW_160_in_quasiquotationD5377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal419_tree = (CommonTree)adaptor.create(char_literal419);
                    adaptor.addChild(root_0, char_literal419_tree);
                    }
                    pushFollow(FOLLOW_qqTemplate_in_quasiquotationD5379);
                    qqTemplate420=qqTemplate(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate420.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:748:4: lpar QUASIQUOTE qqTemplate[d] ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_lpar_in_quasiquotationD5385);
                    lpar421=lpar();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, lpar421.getTree());
                    QUASIQUOTE422=(Token)match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_quasiquotationD5387); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUASIQUOTE422_tree = (CommonTree)adaptor.create(QUASIQUOTE422);
                    adaptor.addChild(root_0, QUASIQUOTE422_tree);
                    }
                    pushFollow(FOLLOW_qqTemplate_in_quasiquotationD5389);
                    qqTemplate423=qqTemplate(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate423.getTree());
                    char_literal424=(Token)match(input,154,FOLLOW_154_in_quasiquotationD5392); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal424_tree = (CommonTree)adaptor.create(char_literal424);
                    adaptor.addChild(root_0, char_literal424_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quasiquotationD"

    public static class qqTemplate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qqTemplate"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:751:1: qqTemplate[int d] : ( ( fullExpression )=> fullExpression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] );
    public final SchemeParser.qqTemplate_return qqTemplate(int d) throws RecognitionException {
        SchemeParser.qqTemplate_return retval = new SchemeParser.qqTemplate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.fullExpression_return fullExpression425 = null;

        SchemeParser.unquotation_return unquotation426 = null;

        SchemeParser.simpleDatum_return simpleDatum427 = null;

        SchemeParser.vectorQQTemplate_return vectorQQTemplate428 = null;

        SchemeParser.listQQTemplate_return listQQTemplate429 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:752:3: ( ( fullExpression )=> fullExpression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] )
            int alt101=5;
            alt101 = dfa101.predict(input);
            switch (alt101) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:752:6: ( fullExpression )=> fullExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_fullExpression_in_qqTemplate5414);
                    fullExpression425=fullExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fullExpression425.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:753:6: ( '(' UNQUOTE )=> unquotation[d]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unquotation_in_qqTemplate5430);
                    unquotation426=unquotation(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unquotation426.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:754:22: simpleDatum
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simpleDatum_in_qqTemplate5454);
                    simpleDatum427=simpleDatum();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleDatum427.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:755:22: vectorQQTemplate[d]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_vectorQQTemplate_in_qqTemplate5477);
                    vectorQQTemplate428=vectorQQTemplate(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, vectorQQTemplate428.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:756:22: listQQTemplate[d]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_listQQTemplate_in_qqTemplate5501);
                    listQQTemplate429=listQQTemplate(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, listQQTemplate429.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qqTemplate"

    public static class vectorQQTemplate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "vectorQQTemplate"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:759:1: vectorQQTemplate[int d] : '#(' ( qqTemplateOrSplice[d] )* ')' ;
    public final SchemeParser.vectorQQTemplate_return vectorQQTemplate(int d) throws RecognitionException {
        SchemeParser.vectorQQTemplate_return retval = new SchemeParser.vectorQQTemplate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal430=null;
        Token char_literal432=null;
        SchemeParser.qqTemplateOrSplice_return qqTemplateOrSplice431 = null;


        CommonTree string_literal430_tree=null;
        CommonTree char_literal432_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:760:3: ( '#(' ( qqTemplateOrSplice[d] )* ')' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:760:6: '#(' ( qqTemplateOrSplice[d] )* ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal430=(Token)match(input,155,FOLLOW_155_in_vectorQQTemplate5517); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal430_tree = (CommonTree)adaptor.create(string_literal430);
            adaptor.addChild(root_0, string_literal430_tree);
            }
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:760:11: ( qqTemplateOrSplice[d] )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=ELLIPSIS && LA102_0<=BEGIN)||LA102_0==DEFINE||(LA102_0>=VARIABLE && LA102_0<=QUASIQUOTE)||(LA102_0>=NUM_2 && LA102_0<=FALSE)||LA102_0==153||(LA102_0>=155 && LA102_0<=157)||(LA102_0>=160 && LA102_0<=162)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:760:11: qqTemplateOrSplice[d]
            	    {
            	    pushFollow(FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate5519);
            	    qqTemplateOrSplice431=qqTemplateOrSplice(d);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice431.getTree());

            	    }
            	    break;

            	default :
            	    break loop102;
                }
            } while (true);

            char_literal432=(Token)match(input,154,FOLLOW_154_in_vectorQQTemplate5523); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal432_tree = (CommonTree)adaptor.create(char_literal432);
            adaptor.addChild(root_0, char_literal432_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "vectorQQTemplate"

    public static class listQQTemplate_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "listQQTemplate"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:763:1: listQQTemplate[int d] : ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' );
    public final SchemeParser.listQQTemplate_return listQQTemplate(int d) throws RecognitionException {
        SchemeParser.listQQTemplate_return retval = new SchemeParser.listQQTemplate_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal433=null;
        Token char_literal436=null;
        Token char_literal438=null;
        Token char_literal440=null;
        SchemeParser.qqTemplate_return qqTemplate434 = null;

        SchemeParser.quasiquotationD_return quasiquotationD435 = null;

        SchemeParser.qqTemplateOrSplice_return qqTemplateOrSplice437 = null;

        SchemeParser.qqTemplate_return qqTemplate439 = null;


        CommonTree char_literal433_tree=null;
        CommonTree char_literal436_tree=null;
        CommonTree char_literal438_tree=null;
        CommonTree char_literal440_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:764:3: ( '\\'' qqTemplate[d] | ( '(' QUASIQUOTE )=> quasiquotationD[d+1] | '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')' )
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==156) ) {
                alt106=1;
            }
            else if ( (LA106_0==160) && (synpred45_Scheme())) {
                alt106=2;
            }
            else if ( (LA106_0==153) ) {
                int LA106_3 = input.LA(2);

                if ( (synpred45_Scheme()) ) {
                    alt106=2;
                }
                else if ( (true) ) {
                    alt106=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 106, 3, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:764:25: '\\'' qqTemplate[d]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal433=(Token)match(input,156,FOLLOW_156_in_listQQTemplate5557); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal433_tree = (CommonTree)adaptor.create(char_literal433);
                    adaptor.addChild(root_0, char_literal433_tree);
                    }
                    pushFollow(FOLLOW_qqTemplate_in_listQQTemplate5559);
                    qqTemplate434=qqTemplate(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate434.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:765:6: ( '(' QUASIQUOTE )=> quasiquotationD[d+1]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_quasiquotationD_in_listQQTemplate5574);
                    quasiquotationD435=quasiquotationD(d+1);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, quasiquotationD435.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:766:25: '(' ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )? ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal436=(Token)match(input,153,FOLLOW_153_in_listQQTemplate5601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal436_tree = (CommonTree)adaptor.create(char_literal436);
                    adaptor.addChild(root_0, char_literal436_tree);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:766:29: ( ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )? )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( ((LA105_0>=ELLIPSIS && LA105_0<=BEGIN)||LA105_0==DEFINE||(LA105_0>=VARIABLE && LA105_0<=QUASIQUOTE)||(LA105_0>=NUM_2 && LA105_0<=FALSE)||LA105_0==153||(LA105_0>=155 && LA105_0<=157)||(LA105_0>=160 && LA105_0<=162)) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:766:30: ( qqTemplateOrSplice[d] )+ ( '.' qqTemplate[d] )?
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:766:30: ( qqTemplateOrSplice[d] )+
                            int cnt103=0;
                            loop103:
                            do {
                                int alt103=2;
                                int LA103_0 = input.LA(1);

                                if ( ((LA103_0>=ELLIPSIS && LA103_0<=BEGIN)||LA103_0==DEFINE||(LA103_0>=VARIABLE && LA103_0<=QUASIQUOTE)||(LA103_0>=NUM_2 && LA103_0<=FALSE)||LA103_0==153||(LA103_0>=155 && LA103_0<=157)||(LA103_0>=160 && LA103_0<=162)) ) {
                                    alt103=1;
                                }


                                switch (alt103) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:766:30: qqTemplateOrSplice[d]
                            	    {
                            	    pushFollow(FOLLOW_qqTemplateOrSplice_in_listQQTemplate5604);
                            	    qqTemplateOrSplice437=qqTemplateOrSplice(d);

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplateOrSplice437.getTree());

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt103 >= 1 ) break loop103;
                            	    if (state.backtracking>0) {state.failed=true; return retval;}
                                        EarlyExitException eee =
                                            new EarlyExitException(103, input);
                                        throw eee;
                                }
                                cnt103++;
                            } while (true);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:766:53: ( '.' qqTemplate[d] )?
                            int alt104=2;
                            int LA104_0 = input.LA(1);

                            if ( (LA104_0==158) ) {
                                alt104=1;
                            }
                            switch (alt104) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:766:54: '.' qqTemplate[d]
                                    {
                                    char_literal438=(Token)match(input,158,FOLLOW_158_in_listQQTemplate5609); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    char_literal438_tree = (CommonTree)adaptor.create(char_literal438);
                                    adaptor.addChild(root_0, char_literal438_tree);
                                    }
                                    pushFollow(FOLLOW_qqTemplate_in_listQQTemplate5611);
                                    qqTemplate439=qqTemplate(d);

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate439.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    char_literal440=(Token)match(input,154,FOLLOW_154_in_listQQTemplate5618); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal440_tree = (CommonTree)adaptor.create(char_literal440);
                    adaptor.addChild(root_0, char_literal440_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "listQQTemplate"

    public static class unquotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unquotation"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:769:1: unquotation[int d] : ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' );
    public final SchemeParser.unquotation_return unquotation(int d) throws RecognitionException {
        SchemeParser.unquotation_return retval = new SchemeParser.unquotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal441=null;
        Token char_literal443=null;
        Token UNQUOTE444=null;
        Token char_literal446=null;
        SchemeParser.qqTemplate_return qqTemplate442 = null;

        SchemeParser.qqTemplate_return qqTemplate445 = null;


        CommonTree char_literal441_tree=null;
        CommonTree char_literal443_tree=null;
        CommonTree UNQUOTE444_tree=null;
        CommonTree char_literal446_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:770:3: ( ',' qqTemplate[d-1] | '(' UNQUOTE qqTemplate[d-1] ')' )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==162) ) {
                alt107=1;
            }
            else if ( (LA107_0==153) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:770:6: ',' qqTemplate[d-1]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal441=(Token)match(input,162,FOLLOW_162_in_unquotation5633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal441_tree = (CommonTree)adaptor.create(char_literal441);
                    adaptor.addChild(root_0, char_literal441_tree);
                    }
                    pushFollow(FOLLOW_qqTemplate_in_unquotation5635);
                    qqTemplate442=qqTemplate(d-1);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate442.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:771:6: '(' UNQUOTE qqTemplate[d-1] ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal443=(Token)match(input,153,FOLLOW_153_in_unquotation5643); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal443_tree = (CommonTree)adaptor.create(char_literal443);
                    adaptor.addChild(root_0, char_literal443_tree);
                    }
                    UNQUOTE444=(Token)match(input,UNQUOTE,FOLLOW_UNQUOTE_in_unquotation5645); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNQUOTE444_tree = (CommonTree)adaptor.create(UNQUOTE444);
                    adaptor.addChild(root_0, UNQUOTE444_tree);
                    }
                    pushFollow(FOLLOW_qqTemplate_in_unquotation5647);
                    qqTemplate445=qqTemplate(d-1);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate445.getTree());
                    char_literal446=(Token)match(input,154,FOLLOW_154_in_unquotation5650); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal446_tree = (CommonTree)adaptor.create(char_literal446);
                    adaptor.addChild(root_0, char_literal446_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unquotation"

    public static class qqTemplateOrSplice_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qqTemplateOrSplice"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:774:1: qqTemplateOrSplice[int d] : ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] );
    public final SchemeParser.qqTemplateOrSplice_return qqTemplateOrSplice(int d) throws RecognitionException {
        SchemeParser.qqTemplateOrSplice_return retval = new SchemeParser.qqTemplateOrSplice_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SchemeParser.splicingUnquotation_return splicingUnquotation447 = null;

        SchemeParser.qqTemplate_return qqTemplate448 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:775:3: ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] )
            int alt108=2;
            alt108 = dfa108.predict(input);
            switch (alt108) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:775:6: ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_splicingUnquotation_in_qqTemplateOrSplice5672);
                    splicingUnquotation447=splicingUnquotation(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, splicingUnquotation447.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:776:31: qqTemplate[d]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_qqTemplate_in_qqTemplateOrSplice5705);
                    qqTemplate448=qqTemplate(d);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate448.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "qqTemplateOrSplice"

    public static class splicingUnquotation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "splicingUnquotation"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:779:1: splicingUnquotation[int d] : ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' );
    public final SchemeParser.splicingUnquotation_return splicingUnquotation(int d) throws RecognitionException {
        SchemeParser.splicingUnquotation_return retval = new SchemeParser.splicingUnquotation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal449=null;
        Token char_literal451=null;
        Token UNQUOTE_SPLICING452=null;
        Token char_literal454=null;
        SchemeParser.qqTemplate_return qqTemplate450 = null;

        SchemeParser.qqTemplate_return qqTemplate453 = null;


        CommonTree string_literal449_tree=null;
        CommonTree char_literal451_tree=null;
        CommonTree UNQUOTE_SPLICING452_tree=null;
        CommonTree char_literal454_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:780:3: ( ',@' qqTemplate[d-1] | '(' UNQUOTE_SPLICING qqTemplate[d-1] ')' )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==161) ) {
                alt109=1;
            }
            else if ( (LA109_0==153) ) {
                alt109=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:780:6: ',@' qqTemplate[d-1]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal449=(Token)match(input,161,FOLLOW_161_in_splicingUnquotation5721); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal449_tree = (CommonTree)adaptor.create(string_literal449);
                    adaptor.addChild(root_0, string_literal449_tree);
                    }
                    pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation5723);
                    qqTemplate450=qqTemplate(d-1);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate450.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:781:6: '(' UNQUOTE_SPLICING qqTemplate[d-1] ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal451=(Token)match(input,153,FOLLOW_153_in_splicingUnquotation5731); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal451_tree = (CommonTree)adaptor.create(char_literal451);
                    adaptor.addChild(root_0, char_literal451_tree);
                    }
                    UNQUOTE_SPLICING452=(Token)match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation5733); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNQUOTE_SPLICING452_tree = (CommonTree)adaptor.create(UNQUOTE_SPLICING452);
                    adaptor.addChild(root_0, UNQUOTE_SPLICING452_tree);
                    }
                    pushFollow(FOLLOW_qqTemplate_in_splicingUnquotation5735);
                    qqTemplate453=qqTemplate(d-1);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qqTemplate453.getTree());
                    char_literal454=(Token)match(input,154,FOLLOW_154_in_splicingUnquotation5738); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal454_tree = (CommonTree)adaptor.create(char_literal454);
                    adaptor.addChild(root_0, char_literal454_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "splicingUnquotation"

    // $ANTLR start synpred1_Scheme
    public final void synpred1_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:107:4: ( lpar ( EXPORT | IMPORT ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:107:6: lpar ( EXPORT | IMPORT )
        {
        pushFollow(FOLLOW_lpar_in_synpred1_Scheme385);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        if ( (input.LA(1)>=EXPORT && input.LA(1)<=IMPORT) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred1_Scheme

    // $ANTLR start synpred2_Scheme
    public final void synpred2_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:108:4: ( lpar DEFINE_SYNTAX )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:108:6: lpar DEFINE_SYNTAX
        {
        pushFollow(FOLLOW_lpar_in_synpred2_Scheme413);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,DEFINE_SYNTAX,FOLLOW_DEFINE_SYNTAX_in_synpred2_Scheme415); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Scheme

    // $ANTLR start synpred3_Scheme
    public final void synpred3_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:109:4: ( lpar DEFINE )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:109:6: lpar DEFINE
        {
        pushFollow(FOLLOW_lpar_in_synpred3_Scheme440);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,DEFINE,FOLLOW_DEFINE_in_synpred3_Scheme442); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_Scheme

    // $ANTLR start synpred4_Scheme
    public final void synpred4_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:110:4: ( lpar BEGIN DEFINE )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:110:6: lpar BEGIN DEFINE
        {
        pushFollow(FOLLOW_lpar_in_synpred4_Scheme472);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,BEGIN,FOLLOW_BEGIN_in_synpred4_Scheme474); if (state.failed) return ;
        match(input,DEFINE,FOLLOW_DEFINE_in_synpred4_Scheme476); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_Scheme

    // $ANTLR start synpred5_Scheme
    public final void synpred5_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:111:4: ( '(' BEGIN expressionOrDefinition )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:111:6: '(' BEGIN expressionOrDefinition
        {
        match(input,153,FOLLOW_153_in_synpred5_Scheme489); if (state.failed) return ;
        match(input,BEGIN,FOLLOW_BEGIN_in_synpred5_Scheme491); if (state.failed) return ;
        pushFollow(FOLLOW_expressionOrDefinition_in_synpred5_Scheme493);
        expressionOrDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_Scheme

    // $ANTLR start synpred6_Scheme
    public final void synpred6_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:160:4: ( variable )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:160:6: variable
        {
        pushFollow(FOLLOW_variable_in_synpred6_Scheme1005);
        variable();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_Scheme

    // $ANTLR start synpred7_Scheme
    public final void synpred7_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:161:4: ( literal )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:161:6: literal
        {
        pushFollow(FOLLOW_literal_in_synpred7_Scheme1026);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_Scheme

    // $ANTLR start synpred8_Scheme
    public final void synpred8_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:162:4: ( callCCExpr )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:162:6: callCCExpr
        {
        pushFollow(FOLLOW_callCCExpr_in_synpred8_Scheme1049);
        callCCExpr();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_Scheme

    // $ANTLR start synpred9_Scheme
    public final void synpred9_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:163:4: ( lambdaExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:163:6: lambdaExpression
        {
        pushFollow(FOLLOW_lambdaExpression_in_synpred9_Scheme1068);
        lambdaExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_Scheme

    // $ANTLR start synpred10_Scheme
    public final void synpred10_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:164:4: ( condExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:164:6: condExpression
        {
        pushFollow(FOLLOW_condExpression_in_synpred10_Scheme1091);
        condExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_Scheme

    // $ANTLR start synpred11_Scheme
    public final void synpred11_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:165:4: ( conditional )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:165:6: conditional
        {
        pushFollow(FOLLOW_conditional_in_synpred11_Scheme1104);
        conditional();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_Scheme

    // $ANTLR start synpred12_Scheme
    public final void synpred12_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:166:4: ( unlessExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:166:6: unlessExpression
        {
        pushFollow(FOLLOW_unlessExpression_in_synpred12_Scheme1122);
        unlessExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_Scheme

    // $ANTLR start synpred13_Scheme
    public final void synpred13_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:167:4: ( whenExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:167:6: whenExpression
        {
        pushFollow(FOLLOW_whenExpression_in_synpred13_Scheme1134);
        whenExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_Scheme

    // $ANTLR start synpred14_Scheme
    public final void synpred14_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:168:4: ( lpar SET )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:168:6: lpar SET
        {
        pushFollow(FOLLOW_lpar_in_synpred14_Scheme1146);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,SET,FOLLOW_SET_in_synpred14_Scheme1148); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_Scheme

    // $ANTLR start synpred15_Scheme
    public final void synpred15_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:169:4: ( derivedExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:169:6: derivedExpression
        {
        pushFollow(FOLLOW_derivedExpression_in_synpred15_Scheme1166);
        derivedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_Scheme

    // $ANTLR start synpred16_Scheme
    public final void synpred16_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:170:4: ( lpar operator )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:170:6: lpar operator
        {
        pushFollow(FOLLOW_lpar_in_synpred16_Scheme1178);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_operator_in_synpred16_Scheme1180);
        operator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_Scheme

    // $ANTLR start synpred17_Scheme
    public final void synpred17_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:171:4: ( applyExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:171:6: applyExpression
        {
        pushFollow(FOLLOW_applyExpression_in_synpred17_Scheme1196);
        applyExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_Scheme

    // $ANTLR start synpred18_Scheme
    public final void synpred18_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:172:4: ( macroUse )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:172:6: macroUse
        {
        pushFollow(FOLLOW_macroUse_in_synpred18_Scheme1209);
        macroUse();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_Scheme

    // $ANTLR start synpred19_Scheme
    public final void synpred19_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:173:4: ( letExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:173:6: letExpression
        {
        pushFollow(FOLLOW_letExpression_in_synpred19_Scheme1230);
        letExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_Scheme

    // $ANTLR start synpred20_Scheme
    public final void synpred20_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:264:5: ( lpar COND )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:264:7: lpar COND
        {
        pushFollow(FOLLOW_lpar_in_synpred20_Scheme1765);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,COND,FOLLOW_COND_in_synpred20_Scheme1767); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_Scheme

    // $ANTLR start synpred21_Scheme
    public final void synpred21_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:265:5: ( lpar IF )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:265:7: lpar IF
        {
        pushFollow(FOLLOW_lpar_in_synpred21_Scheme1782);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,IF,FOLLOW_IF_in_synpred21_Scheme1784); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_Scheme

    // $ANTLR start synpred22_Scheme
    public final void synpred22_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:266:5: ( unlessExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:266:7: unlessExpression
        {
        pushFollow(FOLLOW_unlessExpression_in_synpred22_Scheme1803);
        unlessExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_Scheme

    // $ANTLR start synpred23_Scheme
    public final void synpred23_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:267:5: ( whenExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:267:7: whenExpression
        {
        pushFollow(FOLLOW_whenExpression_in_synpred23_Scheme1817);
        whenExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_Scheme

    // $ANTLR start synpred24_Scheme
    public final void synpred24_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:272:5: ( lpar ( COND | IF | UNLESS | WHEN | CASE ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:272:6: lpar ( COND | IF | UNLESS | WHEN | CASE )
        {
        pushFollow(FOLLOW_lpar_in_synpred24_Scheme1847);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==IF||input.LA(1)==COND||input.LA(1)==CASE||(input.LA(1)>=WHEN && input.LA(1)<=UNLESS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred24_Scheme

    // $ANTLR start synpred25_Scheme
    public final void synpred25_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:273:5: ( lpar DO )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:273:6: lpar DO
        {
        pushFollow(FOLLOW_lpar_in_synpred25_Scheme1880);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,DO,FOLLOW_DO_in_synpred25_Scheme1882); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_Scheme

    // $ANTLR start synpred26_Scheme
    public final void synpred26_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:277:4: ( lpar SET )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:277:6: lpar SET
        {
        pushFollow(FOLLOW_lpar_in_synpred26_Scheme1904);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,SET,FOLLOW_SET_in_synpred26_Scheme1906); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_Scheme

    // $ANTLR start synpred27_Scheme
    public final void synpred27_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:278:5: ( variable )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:278:7: variable
        {
        pushFollow(FOLLOW_variable_in_synpred27_Scheme1927);
        variable();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_Scheme

    // $ANTLR start synpred28_Scheme
    public final void synpred28_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:279:4: ( literal )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:279:6: literal
        {
        pushFollow(FOLLOW_literal_in_synpred28_Scheme1948);
        literal();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_Scheme

    // $ANTLR start synpred29_Scheme
    public final void synpred29_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:280:5: ( lpar VARIABLE )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:280:7: lpar VARIABLE
        {
        pushFollow(FOLLOW_lpar_in_synpred29_Scheme1972);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,VARIABLE,FOLLOW_VARIABLE_in_synpred29_Scheme1974); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_Scheme

    // $ANTLR start synpred30_Scheme
    public final void synpred30_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:281:4: ( lpar operator )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:281:6: lpar operator
        {
        pushFollow(FOLLOW_lpar_in_synpred30_Scheme1988);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_operator_in_synpred30_Scheme1990);
        operator();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_Scheme

    // $ANTLR start synpred31_Scheme
    public final void synpred31_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:282:4: ( lpar callCC )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:282:6: lpar callCC
        {
        pushFollow(FOLLOW_lpar_in_synpred31_Scheme2006);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_callCC_in_synpred31_Scheme2008);
        callCC();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_Scheme

    // $ANTLR start synpred32_Scheme
    public final void synpred32_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:283:4: ( lpar LAMBDA )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:283:6: lpar LAMBDA
        {
        pushFollow(FOLLOW_lpar_in_synpred32_Scheme2026);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,LAMBDA,FOLLOW_LAMBDA_in_synpred32_Scheme2028); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_Scheme

    // $ANTLR start synpred33_Scheme
    public final void synpred33_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:284:4: ( derivedExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:284:6: derivedExpression
        {
        pushFollow(FOLLOW_derivedExpression_in_synpred33_Scheme2041);
        derivedExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_Scheme

    // $ANTLR start synpred34_Scheme
    public final void synpred34_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:285:4: ( lpar APPLY )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:285:6: lpar APPLY
        {
        pushFollow(FOLLOW_lpar_in_synpred34_Scheme2053);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,APPLY,FOLLOW_APPLY_in_synpred34_Scheme2055); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_Scheme

    // $ANTLR start synpred35_Scheme
    public final void synpred35_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:286:4: ( macroUse )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:286:6: macroUse
        {
        pushFollow(FOLLOW_macroUse_in_synpred35_Scheme2068);
        macroUse();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_Scheme

    // $ANTLR start synpred36_Scheme
    public final void synpred36_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:292:4: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:292:5: lpar ( COND | IF | UNLESS | WHEN | CASE | DO )
        {
        pushFollow(FOLLOW_lpar_in_synpred36_Scheme2107);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==IF||input.LA(1)==COND||input.LA(1)==CASE||input.LA(1)==DO||(input.LA(1)>=WHEN && input.LA(1)<=UNLESS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred36_Scheme

    // $ANTLR start synpred38_Scheme
    public final void synpred38_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:403:5: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:403:6: lpar ( COND | IF | UNLESS | WHEN | CASE | DO )
        {
        pushFollow(FOLLOW_lpar_in_synpred38_Scheme2949);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==IF||input.LA(1)==COND||input.LA(1)==CASE||input.LA(1)==DO||(input.LA(1)>=WHEN && input.LA(1)<=UNLESS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred38_Scheme

    // $ANTLR start synpred39_Scheme
    public final void synpred39_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:410:4: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:410:5: lpar ( COND | IF | UNLESS | WHEN | CASE | DO )
        {
        pushFollow(FOLLOW_lpar_in_synpred39_Scheme3015);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==IF||input.LA(1)==COND||input.LA(1)==CASE||input.LA(1)==DO||(input.LA(1)>=WHEN && input.LA(1)<=UNLESS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred39_Scheme

    // $ANTLR start synpred40_Scheme
    public final void synpred40_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:667:6: ( lpar DEFINE )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:667:8: lpar DEFINE
        {
        pushFollow(FOLLOW_lpar_in_synpred40_Scheme4801);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        match(input,DEFINE,FOLLOW_DEFINE_in_synpred40_Scheme4803); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_Scheme

    // $ANTLR start synpred41_Scheme
    public final void synpred41_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:677:5: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:677:6: lpar ( COND | IF | UNLESS | WHEN | CASE | DO )
        {
        pushFollow(FOLLOW_lpar_in_synpred41_Scheme4854);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==IF||input.LA(1)==COND||input.LA(1)==CASE||input.LA(1)==DO||(input.LA(1)>=WHEN && input.LA(1)<=UNLESS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred41_Scheme

    // $ANTLR start synpred42_Scheme
    public final void synpred42_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:4: ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:686:5: lpar ( COND | IF | UNLESS | WHEN | CASE | DO )
        {
        pushFollow(FOLLOW_lpar_in_synpred42_Scheme4949);
        lpar();

        state._fsp--;
        if (state.failed) return ;
        if ( input.LA(1)==IF||input.LA(1)==COND||input.LA(1)==CASE||input.LA(1)==DO||(input.LA(1)>=WHEN && input.LA(1)<=UNLESS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred42_Scheme

    // $ANTLR start synpred43_Scheme
    public final void synpred43_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:752:6: ( fullExpression )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:752:8: fullExpression
        {
        pushFollow(FOLLOW_fullExpression_in_synpred43_Scheme5408);
        fullExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_Scheme

    // $ANTLR start synpred44_Scheme
    public final void synpred44_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:753:6: ( '(' UNQUOTE )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:753:8: '(' UNQUOTE
        {
        match(input,153,FOLLOW_153_in_synpred44_Scheme5423); if (state.failed) return ;
        match(input,UNQUOTE,FOLLOW_UNQUOTE_in_synpred44_Scheme5425); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_Scheme

    // $ANTLR start synpred45_Scheme
    public final void synpred45_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:765:6: ( '(' QUASIQUOTE )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:765:7: '(' QUASIQUOTE
        {
        match(input,153,FOLLOW_153_in_synpred45_Scheme5568); if (state.failed) return ;
        match(input,QUASIQUOTE,FOLLOW_QUASIQUOTE_in_synpred45_Scheme5570); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_Scheme

    // $ANTLR start synpred46_Scheme
    public final void synpred46_Scheme_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:775:6: ( '(' UNQUOTE_SPLICING )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:775:7: '(' UNQUOTE_SPLICING
        {
        match(input,153,FOLLOW_153_in_synpred46_Scheme5666); if (state.failed) return ;
        match(input,UNQUOTE_SPLICING,FOLLOW_UNQUOTE_SPLICING_in_synpred46_Scheme5668); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_Scheme

    // Delegated rules

    public final boolean synpred16_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_Scheme() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Scheme_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA85 dfa85 = new DFA85(this);
    protected DFA88 dfa88 = new DFA88(this);
    protected DFA101 dfa101 = new DFA101(this);
    protected DFA108 dfa108 = new DFA108(this);
    static final String DFA3_eotS =
        "\24\uffff";
    static final String DFA3_eofS =
        "\24\uffff";
    static final String DFA3_minS =
        "\1\103\1\0\22\uffff";
    static final String DFA3_maxS =
        "\1\u00a0\1\0\22\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\6\14\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String DFA3_specialS =
        "\1\uffff\1\0\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\7\uffff\3\2\32\uffff\6\2\53\uffff\1\1\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "106:1: expressionOrDefinition : ( ( lpar ( EXPORT | IMPORT ) )=> exportOrImportVariable | ( lpar DEFINE_SYNTAX )=> syntaxDefinition | ( lpar DEFINE )=> definition | ( lpar BEGIN DEFINE )=> beginDefinition | ( '(' BEGIN expressionOrDefinition )=> beginExpressionOrDefinition | fullExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA3_1 = input.LA(1);

                         
                        int index3_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Scheme()) ) {s = 15;}

                        else if ( (synpred2_Scheme()) ) {s = 16;}

                        else if ( (synpred3_Scheme()) ) {s = 17;}

                        else if ( (synpred4_Scheme()) ) {s = 18;}

                        else if ( (synpred5_Scheme()) ) {s = 19;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index3_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 3, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\35\uffff";
    static final String DFA11_eofS =
        "\35\uffff";
    static final String DFA11_minS =
        "\1\103\4\uffff\1\0\27\uffff";
    static final String DFA11_maxS =
        "\1\u00a0\4\uffff\1\0\27\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\2\1\2\2\1\uffff\10\2\1\12\1\16\1\3\1\4\1\5\1\6\1\7\1\10"+
        "\1\11\1\13\1\14\1\15\1\17\1\20\1\21";
    static final String DFA11_specialS =
        "\1\0\4\uffff\1\1\27\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\7\uffff\1\1\1\15\1\14\14\uffff\1\17\15\uffff\1\10\1\11"+
            "\1\12\1\13\1\6\1\7\53\uffff\1\5\2\uffff\1\3\1\4\2\uffff\1\16",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "159:1: definitionExpression : ( ( variable )=> variable | ( literal )=> literal | ( callCCExpr )=> callCCExpr | ( lambdaExpression )=> lambdaExpression -> ^( TYPE_ lambdaExpression ) | ( condExpression )=> condExpression | ( conditional )=> conditional | ( unlessExpression )=> unlessExpression | ( whenExpression )=> whenExpression | ( lpar SET )=> assignment | ( derivedExpression )=> derivedExpression | ( lpar operator )=> procedureCall | ( applyExpression )=> applyExpression | ( macroUse )=> macroUse | ( letExpression )=> letExpression | oprtr | contCall | macroBlock );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==VARIABLE) && (synpred6_Scheme())) {s = 1;}

                        else if ( (LA11_0==ELLIPSIS) && (synpred6_Scheme())) {s = 2;}

                        else if ( (LA11_0==156) && (synpred7_Scheme())) {s = 3;}

                        else if ( (LA11_0==157) && (synpred7_Scheme())) {s = 4;}

                        else if ( (LA11_0==153) ) {s = 5;}

                        else if ( (LA11_0==TRUE) && (synpred7_Scheme())) {s = 6;}

                        else if ( (LA11_0==FALSE) && (synpred7_Scheme())) {s = 7;}

                        else if ( (LA11_0==NUM_2) && (synpred7_Scheme())) {s = 8;}

                        else if ( (LA11_0==NUM_8) && (synpred7_Scheme())) {s = 9;}

                        else if ( (LA11_0==NUM_10) && (synpred7_Scheme())) {s = 10;}

                        else if ( (LA11_0==NUM_16) && (synpred7_Scheme())) {s = 11;}

                        else if ( (LA11_0==CHARACTER) && (synpred7_Scheme())) {s = 12;}

                        else if ( (LA11_0==STRING) && (synpred7_Scheme())) {s = 13;}

                        else if ( (LA11_0==160) && (synpred15_Scheme())) {s = 14;}

                        else if ( (LA11_0==LET) && (synpred19_Scheme())) {s = 15;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_Scheme()) ) {s = 13;}

                        else if ( (synpred8_Scheme()) ) {s = 16;}

                        else if ( (synpred9_Scheme()) ) {s = 17;}

                        else if ( (synpred10_Scheme()) ) {s = 18;}

                        else if ( (synpred11_Scheme()) ) {s = 19;}

                        else if ( (synpred12_Scheme()) ) {s = 20;}

                        else if ( (synpred13_Scheme()) ) {s = 21;}

                        else if ( (synpred14_Scheme()) ) {s = 22;}

                        else if ( (synpred15_Scheme()) ) {s = 14;}

                        else if ( (synpred16_Scheme()) ) {s = 23;}

                        else if ( (synpred17_Scheme()) ) {s = 24;}

                        else if ( (synpred18_Scheme()) ) {s = 25;}

                        else if ( ((( symtab.isOperator(input.LT(2).getText()))||( symtab.isComparisonOperator(input.LT(2).getText())))) ) {s = 26;}

                        else if ( (( symtab.contains(input.LT(2).getText()) )) ) {s = 27;}

                        else if ( (true) ) {s = 28;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA34_eotS =
        "\30\uffff";
    static final String DFA34_eofS =
        "\30\uffff";
    static final String DFA34_minS =
        "\1\103\1\0\26\uffff";
    static final String DFA34_maxS =
        "\1\u00a0\1\0\26\uffff";
    static final String DFA34_acceptS =
        "\2\uffff\2\2\12\3\1\10\1\1\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14";
    static final String DFA34_specialS =
        "\1\0\1\1\26\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\7\uffff\1\2\1\15\1\14\32\uffff\1\10\1\11\1\12\1\13\1\6"+
            "\1\7\53\uffff\1\1\2\uffff\1\4\1\5\2\uffff\1\16",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "276:1: jumpableExpression : ( ( lpar SET )=> assignment | ( variable )=> variable | ( literal )=> literal | ( lpar VARIABLE )=> oprtr | ( lpar operator )=> procedureCall | ( lpar callCC )=> callCCExpr | ( lpar LAMBDA )=> lambdaExpression | ( derivedExpression )=> derivedExpression | ( lpar APPLY )=> applyExpression | ( macroUse )=> macroUse | macroBlock | contCall );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_0 = input.LA(1);

                         
                        int index34_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA34_0==153) ) {s = 1;}

                        else if ( (LA34_0==VARIABLE) && (synpred27_Scheme())) {s = 2;}

                        else if ( (LA34_0==ELLIPSIS) && (synpred27_Scheme())) {s = 3;}

                        else if ( (LA34_0==156) && (synpred28_Scheme())) {s = 4;}

                        else if ( (LA34_0==157) && (synpred28_Scheme())) {s = 5;}

                        else if ( (LA34_0==TRUE) && (synpred28_Scheme())) {s = 6;}

                        else if ( (LA34_0==FALSE) && (synpred28_Scheme())) {s = 7;}

                        else if ( (LA34_0==NUM_2) && (synpred28_Scheme())) {s = 8;}

                        else if ( (LA34_0==NUM_8) && (synpred28_Scheme())) {s = 9;}

                        else if ( (LA34_0==NUM_10) && (synpred28_Scheme())) {s = 10;}

                        else if ( (LA34_0==NUM_16) && (synpred28_Scheme())) {s = 11;}

                        else if ( (LA34_0==CHARACTER) && (synpred28_Scheme())) {s = 12;}

                        else if ( (LA34_0==STRING) && (synpred28_Scheme())) {s = 13;}

                        else if ( (LA34_0==160) && (synpred33_Scheme())) {s = 14;}

                         
                        input.seek(index34_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_Scheme()) ) {s = 15;}

                        else if ( (synpred28_Scheme()) ) {s = 13;}

                        else if ( (((synpred29_Scheme()&&( symtab.isOperator(input.LT(2).getText())))||(synpred29_Scheme()&&( symtab.isComparisonOperator(input.LT(2).getText()))))) ) {s = 16;}

                        else if ( (synpred30_Scheme()) ) {s = 17;}

                        else if ( (synpred31_Scheme()) ) {s = 18;}

                        else if ( (synpred32_Scheme()) ) {s = 19;}

                        else if ( (synpred33_Scheme()) ) {s = 14;}

                        else if ( (synpred34_Scheme()) ) {s = 20;}

                        else if ( (synpred35_Scheme()) ) {s = 21;}

                        else if ( (true) ) {s = 22;}

                        else if ( (( symtab.contains(input.LT(2).getText()) )) ) {s = 23;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA35_eotS =
        "\20\uffff";
    static final String DFA35_eofS =
        "\20\uffff";
    static final String DFA35_minS =
        "\1\103\1\0\16\uffff";
    static final String DFA35_maxS =
        "\1\u00a0\1\0\16\uffff";
    static final String DFA35_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA35_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA35_transitionS = {
            "\1\2\7\uffff\3\2\32\uffff\6\2\53\uffff\1\1\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "291:1: fullExpression : ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA35_1 = input.LA(1);

                         
                        int index35_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred36_Scheme()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index35_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 35, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\20\uffff";
    static final String DFA50_eofS =
        "\20\uffff";
    static final String DFA50_minS =
        "\1\103\1\0\16\uffff";
    static final String DFA50_maxS =
        "\1\u00a0\1\0\16\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA50_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\2\7\uffff\3\2\32\uffff\6\2\53\uffff\1\1\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA50_eot = DFA.unpackEncodedString(DFA50_eotS);
    static final short[] DFA50_eof = DFA.unpackEncodedString(DFA50_eofS);
    static final char[] DFA50_min = DFA.unpackEncodedStringToUnsignedChars(DFA50_minS);
    static final char[] DFA50_max = DFA.unpackEncodedStringToUnsignedChars(DFA50_maxS);
    static final short[] DFA50_accept = DFA.unpackEncodedString(DFA50_acceptS);
    static final short[] DFA50_special = DFA.unpackEncodedString(DFA50_specialS);
    static final short[][] DFA50_transition;

    static {
        int numStates = DFA50_transitionS.length;
        DFA50_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA50_transition[i] = DFA.unpackEncodedString(DFA50_transitionS[i]);
        }
    }

    class DFA50 extends DFA {

        public DFA50(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 50;
            this.eot = DFA50_eot;
            this.eof = DFA50_eof;
            this.min = DFA50_min;
            this.max = DFA50_max;
            this.accept = DFA50_accept;
            this.special = DFA50_special;
            this.transition = DFA50_transition;
        }
        public String getDescription() {
            return "400:1: consequence : ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression -> ^( JUMP_STATEMENT jumpableExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_1 = input.LA(1);

                         
                        int index50_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_Scheme()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\20\uffff";
    static final String DFA51_eofS =
        "\20\uffff";
    static final String DFA51_minS =
        "\1\103\1\0\16\uffff";
    static final String DFA51_maxS =
        "\1\u00a0\1\0\16\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA51_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\7\uffff\3\2\32\uffff\6\2\53\uffff\1\1\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "407:1: alternative : ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression | jumpableExpression -> ^( JUMP_STATEMENT jumpableExpression ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_1 = input.LA(1);

                         
                        int index51_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_Scheme()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index51_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\13\uffff";
    static final String DFA52_eofS =
        "\13\uffff";
    static final String DFA52_minS =
        "\1\104\3\uffff\1\103\6\uffff";
    static final String DFA52_maxS =
        "\1\144\3\uffff\1\u0099\6\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\4\1\5";
    static final String DFA52_specialS =
        "\13\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\7\22\uffff\1\2\1\3\1\uffff\1\4\1\5\1\6\1\uffff\1\10\5\uffff"+
            "\1\1",
            "",
            "",
            "",
            "\1\12\7\uffff\1\12\115\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "421:11: ( notExpression | andExpression | orExpression | letExpression | letNamedExpression | letStarExpression | letrecExpression | beginExpression | delayExpression )";
        }
    }
    static final String DFA82_eotS =
        "\20\uffff";
    static final String DFA82_eofS =
        "\20\uffff";
    static final String DFA82_minS =
        "\1\103\1\0\16\uffff";
    static final String DFA82_maxS =
        "\1\u00a0\1\0\16\uffff";
    static final String DFA82_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA82_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA82_transitionS = {
            "\1\2\7\uffff\3\2\32\uffff\6\2\53\uffff\1\1\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
    static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
    static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
    static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
    static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
    static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
    static final short[][] DFA82_transition;

    static {
        int numStates = DFA82_transitionS.length;
        DFA82_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
        }
    }

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = DFA82_eot;
            this.eof = DFA82_eof;
            this.min = DFA82_min;
            this.max = DFA82_max;
            this.accept = DFA82_accept;
            this.special = DFA82_special;
            this.transition = DFA82_transition;
        }
        public String getDescription() {
            return "()* loopback of 667:4: ( ( lpar DEFINE )=> definition )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_1 = input.LA(1);

                         
                        int index82_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred40_Scheme()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index82_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA85_eotS =
        "\20\uffff";
    static final String DFA85_eofS =
        "\20\uffff";
    static final String DFA85_minS =
        "\1\103\1\0\16\uffff";
    static final String DFA85_maxS =
        "\1\u00a0\1\0\16\uffff";
    static final String DFA85_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA85_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA85_transitionS = {
            "\1\2\7\uffff\3\2\32\uffff\6\2\53\uffff\1\1\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA85_eot = DFA.unpackEncodedString(DFA85_eotS);
    static final short[] DFA85_eof = DFA.unpackEncodedString(DFA85_eofS);
    static final char[] DFA85_min = DFA.unpackEncodedStringToUnsignedChars(DFA85_minS);
    static final char[] DFA85_max = DFA.unpackEncodedStringToUnsignedChars(DFA85_maxS);
    static final short[] DFA85_accept = DFA.unpackEncodedString(DFA85_acceptS);
    static final short[] DFA85_special = DFA.unpackEncodedString(DFA85_specialS);
    static final short[][] DFA85_transition;

    static {
        int numStates = DFA85_transitionS.length;
        DFA85_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA85_transition[i] = DFA.unpackEncodedString(DFA85_transitionS[i]);
        }
    }

    class DFA85 extends DFA {

        public DFA85(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 85;
            this.eot = DFA85_eot;
            this.eof = DFA85_eof;
            this.min = DFA85_min;
            this.max = DFA85_max;
            this.accept = DFA85_accept;
            this.special = DFA85_special;
            this.transition = DFA85_transition;
        }
        public String getDescription() {
            return "675:1: sequence : ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sequence )? | jumpableExpression ( sequence -> jumpableExpression sequence | -> ^( JUMP_STATEMENT jumpableExpression ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA85_1 = input.LA(1);

                         
                        int index85_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_Scheme()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index85_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 85, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA88_eotS =
        "\20\uffff";
    static final String DFA88_eofS =
        "\20\uffff";
    static final String DFA88_minS =
        "\1\103\1\0\16\uffff";
    static final String DFA88_maxS =
        "\1\u00a0\1\0\16\uffff";
    static final String DFA88_acceptS =
        "\2\uffff\1\2\14\uffff\1\1";
    static final String DFA88_specialS =
        "\1\uffff\1\0\16\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\2\7\uffff\3\2\32\uffff\6\2\53\uffff\1\1\2\uffff\2\2\2\uffff"+
            "\1\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "684:1: sub_sequence : ( ( ( ( lpar ( COND | IF | UNLESS | WHEN | CASE | DO ) )=> nonJumpExpression ) ( sub_sequence )? ) | ( jumpableExpression ( ( -> ^( JUMP_STATEMENT jumpableExpression ) ) | sub_sequence -> jumpableExpression sub_sequence ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA88_1 = input.LA(1);

                         
                        int index88_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_Scheme()) ) {s = 15;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index88_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 88, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA101_eotS =
        "\30\uffff";
    static final String DFA101_eofS =
        "\30\uffff";
    static final String DFA101_minS =
        "\1\103\4\0\1\uffff\11\0\11\uffff";
    static final String DFA101_maxS =
        "\1\u00a2\4\0\1\uffff\11\0\11\uffff";
    static final String DFA101_acceptS =
        "\5\uffff\1\1\11\uffff\1\2\1\3\5\uffff\1\4\1\5";
    static final String DFA101_specialS =
        "\1\0\1\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\11\uffff}>";
    static final String[] DFA101_transitionS = {
            "\1\3\1\20\4\uffff\1\20\1\uffff\1\2\1\15\1\14\22\20\10\uffff"+
            "\1\10\1\11\1\12\1\13\1\6\1\7\53\uffff\1\1\1\uffff\1\26\1\4\1"+
            "\5\2\uffff\1\16\1\uffff\1\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA101_eot = DFA.unpackEncodedString(DFA101_eotS);
    static final short[] DFA101_eof = DFA.unpackEncodedString(DFA101_eofS);
    static final char[] DFA101_min = DFA.unpackEncodedStringToUnsignedChars(DFA101_minS);
    static final char[] DFA101_max = DFA.unpackEncodedStringToUnsignedChars(DFA101_maxS);
    static final short[] DFA101_accept = DFA.unpackEncodedString(DFA101_acceptS);
    static final short[] DFA101_special = DFA.unpackEncodedString(DFA101_specialS);
    static final short[][] DFA101_transition;

    static {
        int numStates = DFA101_transitionS.length;
        DFA101_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA101_transition[i] = DFA.unpackEncodedString(DFA101_transitionS[i]);
        }
    }

    class DFA101 extends DFA {

        public DFA101(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 101;
            this.eot = DFA101_eot;
            this.eof = DFA101_eof;
            this.min = DFA101_min;
            this.max = DFA101_max;
            this.accept = DFA101_accept;
            this.special = DFA101_special;
            this.transition = DFA101_transition;
        }
        public String getDescription() {
            return "751:1: qqTemplate[int d] : ( ( fullExpression )=> fullExpression | ( '(' UNQUOTE )=> unquotation[d] | simpleDatum | vectorQQTemplate[d] | listQQTemplate[d] );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA101_0 = input.LA(1);

                         
                        int index101_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA101_0==153) ) {s = 1;}

                        else if ( (LA101_0==VARIABLE) ) {s = 2;}

                        else if ( (LA101_0==ELLIPSIS) ) {s = 3;}

                        else if ( (LA101_0==156) ) {s = 4;}

                        else if ( (LA101_0==157) && (synpred43_Scheme())) {s = 5;}

                        else if ( (LA101_0==TRUE) ) {s = 6;}

                        else if ( (LA101_0==FALSE) ) {s = 7;}

                        else if ( (LA101_0==NUM_2) ) {s = 8;}

                        else if ( (LA101_0==NUM_8) ) {s = 9;}

                        else if ( (LA101_0==NUM_10) ) {s = 10;}

                        else if ( (LA101_0==NUM_16) ) {s = 11;}

                        else if ( (LA101_0==CHARACTER) ) {s = 12;}

                        else if ( (LA101_0==STRING) ) {s = 13;}

                        else if ( (LA101_0==160) ) {s = 14;}

                        else if ( (LA101_0==162) && (synpred44_Scheme())) {s = 15;}

                        else if ( (LA101_0==BEGIN||LA101_0==DEFINE||(LA101_0>=ELSE && LA101_0<=QUASIQUOTE)) ) {s = 16;}

                        else if ( (LA101_0==155) ) {s = 22;}

                         
                        input.seek(index101_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA101_1 = input.LA(1);

                         
                        int index101_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((synpred43_Scheme()||(synpred43_Scheme()&&( symtab.isOperator(input.LT(2).getText())))||(synpred43_Scheme()&&( symtab.contains(input.LT(2).getText()) ))||(synpred43_Scheme()&&( symtab.isComparisonOperator(input.LT(2).getText()))))) ) {s = 5;}

                        else if ( (synpred44_Scheme()) ) {s = 15;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index101_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA101_2 = input.LA(1);

                         
                        int index101_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA101_3 = input.LA(1);

                         
                        int index101_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA101_4 = input.LA(1);

                         
                        int index101_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index101_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA101_6 = input.LA(1);

                         
                        int index101_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA101_7 = input.LA(1);

                         
                        int index101_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA101_8 = input.LA(1);

                         
                        int index101_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA101_9 = input.LA(1);

                         
                        int index101_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA101_10 = input.LA(1);

                         
                        int index101_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA101_11 = input.LA(1);

                         
                        int index101_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA101_12 = input.LA(1);

                         
                        int index101_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA101_13 = input.LA(1);

                         
                        int index101_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index101_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA101_14 = input.LA(1);

                         
                        int index101_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_Scheme()) ) {s = 5;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index101_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 101, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA108_eotS =
        "\30\uffff";
    static final String DFA108_eofS =
        "\30\uffff";
    static final String DFA108_minS =
        "\1\103\1\uffff\1\0\25\uffff";
    static final String DFA108_maxS =
        "\1\u00a2\1\uffff\1\0\25\uffff";
    static final String DFA108_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\24\uffff";
    static final String DFA108_specialS =
        "\1\0\1\uffff\1\1\25\uffff}>";
    static final String[] DFA108_transitionS = {
            "\2\3\4\uffff\1\3\1\uffff\25\3\10\uffff\6\3\53\uffff\1\2\1\uffff"+
            "\3\3\2\uffff\1\3\1\1\1\3",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA108_eot = DFA.unpackEncodedString(DFA108_eotS);
    static final short[] DFA108_eof = DFA.unpackEncodedString(DFA108_eofS);
    static final char[] DFA108_min = DFA.unpackEncodedStringToUnsignedChars(DFA108_minS);
    static final char[] DFA108_max = DFA.unpackEncodedStringToUnsignedChars(DFA108_maxS);
    static final short[] DFA108_accept = DFA.unpackEncodedString(DFA108_acceptS);
    static final short[] DFA108_special = DFA.unpackEncodedString(DFA108_specialS);
    static final short[][] DFA108_transition;

    static {
        int numStates = DFA108_transitionS.length;
        DFA108_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA108_transition[i] = DFA.unpackEncodedString(DFA108_transitionS[i]);
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = DFA108_eot;
            this.eof = DFA108_eof;
            this.min = DFA108_min;
            this.max = DFA108_max;
            this.accept = DFA108_accept;
            this.special = DFA108_special;
            this.transition = DFA108_transition;
        }
        public String getDescription() {
            return "774:1: qqTemplateOrSplice[int d] : ( ( '(' UNQUOTE_SPLICING )=> splicingUnquotation[d] | qqTemplate[d] );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_0 = input.LA(1);

                         
                        int index108_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA108_0==161) && (synpred46_Scheme())) {s = 1;}

                        else if ( (LA108_0==153) ) {s = 2;}

                        else if ( ((LA108_0>=ELLIPSIS && LA108_0<=BEGIN)||LA108_0==DEFINE||(LA108_0>=VARIABLE && LA108_0<=QUASIQUOTE)||(LA108_0>=NUM_2 && LA108_0<=FALSE)||(LA108_0>=155 && LA108_0<=157)||LA108_0==160||LA108_0==162) ) {s = 3;}

                         
                        input.seek(index108_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA108_2 = input.LA(1);

                         
                        int index108_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred46_Scheme()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index108_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_library_in_compilation_unit337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_compilation_unit339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionOrDefinition_in_compilation_unit356 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_EOF_in_compilation_unit359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exportOrImportVariable_in_expressionOrDefinition406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_syntaxDefinition_in_expressionOrDefinition433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_expressionOrDefinition465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beginDefinition_in_expressionOrDefinition482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_beginExpressionOrDefinition_in_expressionOrDefinition498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_expressionOrDefinition503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_lpar518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_rpar546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_sharpLpar569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_elipsis593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_beginExpressionOrDefinition613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BEGIN_in_beginExpressionOrDefinition615 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_expressionOrDefinition_in_beginExpressionOrDefinition617 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_rpar_in_beginExpressionOrDefinition620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_library656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LIBRARY_in_library658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_library660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_library662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_library664 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_expressionOrDefinition_in_library666 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_rpar_in_library669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_exportOrImportVariable719 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_EXPORT_in_exportOrImportVariable721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_exportOrImportVariable723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_exportOrImportVariable725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_exportOrImportVariable748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_IMPORT_in_exportOrImportVariable750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_exportOrImportVariable754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_exportOrImportVariable756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_exportOrImportVariable758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_exportOrImportVariable763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_syntaxDefinition798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DEFINE_SYNTAX_in_syntaxDefinition800 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFFFCA18L});
    public static final BitSet FOLLOW_keyword_in_syntaxDefinition802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_transformerSpec_in_syntaxDefinition804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_syntaxDefinition806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_definition817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DEFINE_in_definition819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L,0x0000000002000000L});
    public static final BitSet FOLLOW_variable_in_definition826 = new BitSet(new long[]{0x0000000000000000L,0x00003F0004003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_definitionExpression_in_definition828 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_definition830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_definition872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_definition874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L,0x0000000004000000L});
    public static final BitSet FOLLOW_defFormals_in_definition876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_definition879 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_definition881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_definition883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_beginDefinition957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BEGIN_in_beginDefinition959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_definition_in_beginDefinition961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_beginDefinition964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_definitionExpression1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_definitionExpression1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callCCExpr_in_definitionExpression1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaExpression_in_definitionExpression1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpression_in_definitionExpression1097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_definitionExpression1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlessExpression_in_definitionExpression1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_definitionExpression1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_definitionExpression1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedExpression_in_definitionExpression1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_definitionExpression1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_applyExpression_in_definitionExpression1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroUse_in_definitionExpression1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letExpression_in_definitionExpression1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oprtr_in_definitionExpression1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contCall_in_definitionExpression1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroBlock_in_definitionExpression1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_defFormals1293 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000808L});
    public static final BitSet FOLLOW_identifier_in_keyword1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_transformerSpec1329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_SYNTAX_RULES_in_transformerSpec1331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_transformerSpec1333 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFFFCA18L,0x0000000004000000L});
    public static final BitSet FOLLOW_identifier_in_transformerSpec1335 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFFFCA18L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_transformerSpec1338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_syntaxRule_in_transformerSpec1340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_transformerSpec1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_syntaxRule1380 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000A000000L});
    public static final BitSet FOLLOW_pattern_in_syntaxRule1382 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000A000000L});
    public static final BitSet FOLLOW_template_in_syntaxRule1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_syntaxRule1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternIdentifier_in_pattern1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_pattern1402 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000E000000L});
    public static final BitSet FOLLOW_pattern_in_pattern1406 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000004E000000L});
    public static final BitSet FOLLOW_dot_in_pattern1411 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000A000000L});
    public static final BitSet FOLLOW_pattern_in_pattern1413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_elipsis_in_pattern1417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_pattern1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sharpLpar_in_pattern1429 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000E000000L});
    public static final BitSet FOLLOW_pattern_in_pattern1433 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000000E000000L});
    public static final BitSet FOLLOW_elipsis_in_pattern1436 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_pattern1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternDatum_in_pattern1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_syntacticKeyword_in_patternIdentifier1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_patternIdentifier1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_patternDatum1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_patternDatum1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_patternDatum1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_patternDatum1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternIdentifier_in_template1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_template1548 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000E000000L});
    public static final BitSet FOLLOW_templateElement_in_template1552 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000004E000000L});
    public static final BitSet FOLLOW_dot_in_template1557 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000A000000L});
    public static final BitSet FOLLOW_templateElement_in_template1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_template1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sharpLpar_in_template1571 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000E000000L});
    public static final BitSet FOLLOW_templateElement_in_template1573 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA10L,0x000000000E000000L});
    public static final BitSet FOLLOW_rpar_in_template1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_templateDatum_in_template1581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_template_in_templateElement1592 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_elipsis_in_templateElement1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternDatum_in_templateDatum1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_syntacticKeyword_in_identifier1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_identifier1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionKeyword_in_syntacticKeyword1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSE_in_syntacticKeyword1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_syntacticKeyword1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINE_in_syntacticKeyword1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNQUOTE_in_syntacticKeyword1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_syntacticKeyword1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_expressionKeyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpression_in_branchExpression1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_branchExpression1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlessExpression_in_branchExpression1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_branchExpression1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedBranchExpression_in_branchExpression1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_branchExpression_in_nonJumpExpression1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedLoopExpression_in_nonJumpExpression1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_jumpableExpression1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_jumpableExpression1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_jumpableExpression1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_oprtr_in_jumpableExpression1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCall_in_jumpableExpression1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callCCExpr_in_jumpableExpression2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaExpression_in_jumpableExpression2034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedExpression_in_jumpableExpression2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_applyExpression_in_jumpableExpression2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroUse_in_jumpableExpression2082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroBlock_in_jumpableExpression2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contCall_in_jumpableExpression2095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonJumpExpression_in_fullExpression2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpableExpression_in_fullExpression2143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assign2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_oprtr2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_VARIABLE_in_oprtr2188 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_fullExpression_in_oprtr2190 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_rpar_in_oprtr2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_oprtr2222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_VARIABLE_in_oprtr2224 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_fullExpression_in_oprtr2226 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_rpar_in_oprtr2229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_contCall2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_VARIABLE_in_contCall2268 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_fullExpression_in_contCall2270 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_rpar_in_contCall2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VARIABLE_in_variable2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELLIPSIS_in_variable2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quotation_in_literal2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selfEvaluating_in_literal2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_quot2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quot_in_quotation2386 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071A000000L});
    public static final BitSet FOLLOW_datum_in_quotation2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_quotation2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_quotation2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_QUOTE_in_quotation2414 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071A000000L});
    public static final BitSet FOLLOW_datum_in_quotation2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_quotation2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_selfEvaluating2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_selfEvaluating2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_selfEvaluating2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_selfEvaluating2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_lambdaExpression2493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LAMBDA_in_lambdaExpression2495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L,0x0000000002000000L});
    public static final BitSet FOLLOW_formals_in_lambdaExpression2497 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_lambdaExpression2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_lambdaExpression2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_callCCLambdaExpression2565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LAMBDA_in_callCCLambdaExpression2567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_callCCLambdaExpression2571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_VARIABLE_in_callCCLambdaExpression2577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_callCCLambdaExpression2583 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_callCCLambdaExpression2585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_callCCLambdaExpression2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_WITH_CC_in_callCC2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_CC_in_callCC2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_callCCExpr2707 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_callCC_in_callCCExpr2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_callCCLambdaExpression_in_callCCExpr2711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_callCCExpr2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_dot2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_formals2746 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L,0x0000000006000000L});
    public static final BitSet FOLLOW_paramDecl_in_formals2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L,0x0000000046000000L});
    public static final BitSet FOLLOW_dot_in_formals2755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L,0x0000000002000000L});
    public static final BitSet FOLLOW_paramDecl_in_formals2757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_formals2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_paramDecl_in_formals2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_paramDecl2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_conditional2802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_IF_in_conditional2804 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_test_in_conditional2806 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_consequence_in_conditional2808 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_alternative_in_conditional2810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_conditional2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_test2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_loop_test2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonJumpExpression_in_consequence2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpableExpression_in_consequence2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonJumpExpression_in_alternative3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpableExpression_in_alternative3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_assignment3072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SET_in_assignment3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_assignment3076 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_assignment3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_assignment3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quasiquotation_in_derivedExpression3119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_derivedExpression3126 = new BitSet(new long[]{0x0000000000000000L,0x000000105D800010L});
    public static final BitSet FOLLOW_notExpression_in_derivedExpression3137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_andExpression_in_derivedExpression3145 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_orExpression_in_derivedExpression3153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_letExpression_in_derivedExpression3161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_letNamedExpression_in_derivedExpression3169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_letStarExpression_in_derivedExpression3177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_letrecExpression_in_derivedExpression3185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_beginExpression_in_derivedExpression3193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_delayExpression_in_derivedExpression3206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_derivedExpression3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_derivedBranchExpression3230 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_caseExpression_in_derivedBranchExpression3232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_derivedBranchExpression3234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_derivedLoopExpression3249 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_doExpression_in_derivedLoopExpression3251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_derivedLoopExpression3253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COND_in_condExpressionDer3265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_condBody_in_condExpressionDer3267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_condExpression3305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COND_in_condExpression3307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_condClause_in_condExpression3309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_elseBranch_in_condExpression3312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_condExpression3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_condBody3354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_condClause_in_condBody3356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_elseBranch_in_condBody3359 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_condBody3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_elseBranch3373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ELSE_in_elseBranch3375 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sub_sequence_in_elseBranch3377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_elseBranch3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_condClause3427 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_test_in_condClause3429 = new BitSet(new long[]{0x0000000000000000L,0x00003F000000B808L,0x0000000136000000L});
    public static final BitSet FOLLOW_condClauseBody_in_condClause3431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_condClause3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_in_condClauseBody3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARROW_in_condClauseBody3468 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_recipient_in_condClauseBody3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_recipient3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseExpression3505 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_caseExpression3507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_caseBody_in_caseExpression3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseBranch_in_caseBody3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseClause_in_caseBody3547 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_elseBranch_in_caseBody3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_caseClause3562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_caseClause3564 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071E000000L});
    public static final BitSet FOLLOW_datum_in_caseClause3566 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071E000000L});
    public static final BitSet FOLLOW_rpar_in_caseClause3569 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sub_sequence_in_caseClause3571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_caseClause3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_whenExpression3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_WHEN_in_whenExpression3616 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_test_in_whenExpression3618 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sequence_in_whenExpression3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_whenExpression3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_unlessExpression3673 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_UNLESS_in_unlessExpression3675 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_test_in_unlessExpression3677 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sequence_in_unlessExpression3679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_unlessExpression3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_notExpression3734 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_notExpression3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AND_in_andExpression3764 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_andExpression3766 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_OR_in_orExpression3795 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_orExpression3797 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_LET_in_letExpression3831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_letExpression3833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_bindingSpecVars_in_letExpression3835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_letExpression3838 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_letExpression3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETSTAR_in_letStarExpression3883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_letStarExpression3885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_bindingSpecVars_in_letStarExpression3887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_letStarExpression3890 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_letStarExpression3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LETREC_in_letrecExpression3949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_letrecExpression3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_bindingSpecVars_in_letrecExpression3953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_letrecExpression3956 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_letrecExpression3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_bindingSpecVars4015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_bindingSpecVars4017 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_bindingSpecVars4019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_bindingSpecVars4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letNamedExpression4060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_letNamedExpression4062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_letNamedExpression4064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_bindingSpecPars_in_letNamedExpression4066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_letNamedExpression4069 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_letNamedExpression4071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_bindingSpecPars4136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_variable_in_bindingSpecPars4138 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_bindingSpecPars4140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_bindingSpecPars4142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_beginExpression4174 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sequence_in_beginExpression4176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doExpression4201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_doExpression4203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_iterationSpec_in_doExpression4205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_doExpression4208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_doExpression4210 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_loop_test_in_doExpression4212 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_doResult_in_doExpression4214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_doExpression4217 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_doExpression4219 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_DELAY_in_delayExpression4294 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_fullExpression_in_delayExpression4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_iterationSpec4321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000808L});
    public static final BitSet FOLLOW_varDecl_in_iterationSpec4323 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_init_in_iterationSpec4325 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_step_in_iterationSpec4327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_iterationSpec4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_varDecl4381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_init4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_step4406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_in_doResult4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_procedureCall4428 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_operator_in_procedureCall4430 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_operand_in_procedureCall4432 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_rpar_in_procedureCall4435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_quoteLpar4474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_applyExpression4494 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_APPLY_in_applyExpression4496 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_operator_in_applyExpression4498 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x00000001B2000000L});
    public static final BitSet FOLLOW_operand_in_applyExpression4500 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x00000001B2000000L});
    public static final BitSet FOLLOW_quoteLpar_in_applyExpression4503 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_operand1_in_applyExpression4505 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000136000000L});
    public static final BitSet FOLLOW_rpar_in_applyExpression4508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_applyExpression4510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_operator4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_operand4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_operand14648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_macroUse4669 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFFFCA18L});
    public static final BitSet FOLLOW_keyword_in_macroUse4671 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071E000000L});
    public static final BitSet FOLLOW_datum_in_macroUse4673 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071E000000L});
    public static final BitSet FOLLOW_rpar_in_macroUse4676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_macroBlock4687 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_LET_SYNTAX_in_macroBlock4689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_macroBlock4691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_syntaxSpec_in_macroBlock4693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_macroBlock4696 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_macroBlock4698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_macroBlock4700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_macroBlock4731 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_LETREC_SYNTAX_in_macroBlock4733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_lpar_in_macroBlock4735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_syntaxSpec_in_macroBlock4737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000006000000L});
    public static final BitSet FOLLOW_rpar_in_macroBlock4740 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_body_in_macroBlock4742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_macroBlock4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_syntaxSpec4780 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFFFCA18L});
    public static final BitSet FOLLOW_keyword_in_syntaxSpec4782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_transformerSpec_in_syntaxSpec4784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_syntaxSpec4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definition_in_body4808 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sequence_in_body4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sequence_in_blockScope4824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonJumpExpression_in_sequence4883 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sequence_in_sequence4886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpableExpression_in_sequence4894 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sequence_in_sequence4904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonJumpExpression_in_sub_sequence4978 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sub_sequence_in_sub_sequence4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jumpableExpression_in_sub_sequence4991 = new BitSet(new long[]{0x0000000000000002L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_sub_sequence_in_sub_sequence5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDatum_in_datum5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundDatum_in_datum5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_simpleDatum5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_simpleDatum5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_in_simpleDatum5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_simpleDatum5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_simpleDatum5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_compoundDatum5113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vector_in_compoundDatum5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_list5129 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071E000000L});
    public static final BitSet FOLLOW_datum_in_list5133 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000075E000000L});
    public static final BitSet FOLLOW_dot_in_list5138 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071A000000L});
    public static final BitSet FOLLOW_datum_in_list5140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_rpar_in_list5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbreviation_in_list5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevPrefix_in_abbreviation5164 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071A000000L});
    public static final BitSet FOLLOW_datum_in_abbreviation5166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_abbrevPrefix5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_abbrevPrefix5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_abbrevPrefix5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_abbrevPrefix5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sharpLpar_in_vector5246 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071E000000L});
    public static final BitSet FOLLOW_datum_in_vector5248 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000071E000000L});
    public static final BitSet FOLLOW_rpar_in_vector5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_2_in_number5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_8_in_number5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_10_in_number5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_16_in_number5307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_bool5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_bool5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quasiquotationD_in_quasiquotation5364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_quasiquotationD5377 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_quasiquotationD5385 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_QUASIQUOTE_in_quasiquotationD5387 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_quasiquotationD5389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_quasiquotationD5392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_qqTemplate5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unquotation_in_qqTemplate5430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDatum_in_qqTemplate5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_vectorQQTemplate_in_qqTemplate5477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listQQTemplate_in_qqTemplate5501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_vectorQQTemplate5517 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000073E000000L});
    public static final BitSet FOLLOW_qqTemplateOrSplice_in_vectorQQTemplate5519 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000073E000000L});
    public static final BitSet FOLLOW_154_in_vectorQQTemplate5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_listQQTemplate5557 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate5559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quasiquotationD_in_listQQTemplate5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_listQQTemplate5601 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000073E000000L});
    public static final BitSet FOLLOW_qqTemplateOrSplice_in_listQQTemplate5604 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000077E000000L});
    public static final BitSet FOLLOW_158_in_listQQTemplate5609 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_listQQTemplate5611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_listQQTemplate5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_unquotation5633 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_unquotation5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_unquotation5643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_UNQUOTE_in_unquotation5645 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_unquotation5647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_unquotation5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_splicingUnquotation_in_qqTemplateOrSplice5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qqTemplate_in_qqTemplateOrSplice5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_splicingUnquotation5721 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_splicingUnquotation5731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_splicingUnquotation5733 = new BitSet(new long[]{0x0000000000000000L,0x00003F00FFFFFA18L,0x000000053A000000L});
    public static final BitSet FOLLOW_qqTemplate_in_splicingUnquotation5735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_154_in_splicingUnquotation5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred1_Scheme385 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_set_in_synpred1_Scheme387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred2_Scheme413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DEFINE_SYNTAX_in_synpred2_Scheme415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred3_Scheme440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DEFINE_in_synpred3_Scheme442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred4_Scheme472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BEGIN_in_synpred4_Scheme474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DEFINE_in_synpred4_Scheme476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_synpred5_Scheme489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_BEGIN_in_synpred5_Scheme491 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_expressionOrDefinition_in_synpred5_Scheme493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred6_Scheme1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred7_Scheme1026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_callCCExpr_in_synpred8_Scheme1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lambdaExpression_in_synpred9_Scheme1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_condExpression_in_synpred10_Scheme1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditional_in_synpred11_Scheme1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlessExpression_in_synpred12_Scheme1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_synpred13_Scheme1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred14_Scheme1146 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SET_in_synpred14_Scheme1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedExpression_in_synpred15_Scheme1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred16_Scheme1178 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_operator_in_synpred16_Scheme1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_applyExpression_in_synpred17_Scheme1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroUse_in_synpred18_Scheme1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_letExpression_in_synpred19_Scheme1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred20_Scheme1765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_COND_in_synpred20_Scheme1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred21_Scheme1782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_IF_in_synpred21_Scheme1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unlessExpression_in_synpred22_Scheme1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whenExpression_in_synpred23_Scheme1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred24_Scheme1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000C02500000L});
    public static final BitSet FOLLOW_set_in_synpred24_Scheme1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred25_Scheme1880 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_DO_in_synpred25_Scheme1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred26_Scheme1904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_SET_in_synpred26_Scheme1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variable_in_synpred27_Scheme1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred28_Scheme1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred29_Scheme1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_VARIABLE_in_synpred29_Scheme1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred30_Scheme1988 = new BitSet(new long[]{0x0000000000000000L,0x00003F0000003808L,0x0000000132000000L});
    public static final BitSet FOLLOW_operator_in_synpred30_Scheme1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred31_Scheme2006 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_callCC_in_synpred31_Scheme2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred32_Scheme2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_LAMBDA_in_synpred32_Scheme2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_derivedExpression_in_synpred33_Scheme2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred34_Scheme2053 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_APPLY_in_synpred34_Scheme2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_macroUse_in_synpred35_Scheme2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred36_Scheme2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000C22500000L});
    public static final BitSet FOLLOW_set_in_synpred36_Scheme2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred38_Scheme2949 = new BitSet(new long[]{0x0000000000000000L,0x0000000C22500000L});
    public static final BitSet FOLLOW_set_in_synpred38_Scheme2951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred39_Scheme3015 = new BitSet(new long[]{0x0000000000000000L,0x0000000C22500000L});
    public static final BitSet FOLLOW_set_in_synpred39_Scheme3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred40_Scheme4801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DEFINE_in_synpred40_Scheme4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred41_Scheme4854 = new BitSet(new long[]{0x0000000000000000L,0x0000000C22500000L});
    public static final BitSet FOLLOW_set_in_synpred41_Scheme4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lpar_in_synpred42_Scheme4949 = new BitSet(new long[]{0x0000000000000000L,0x0000000C22500000L});
    public static final BitSet FOLLOW_set_in_synpred42_Scheme4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fullExpression_in_synpred43_Scheme5408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_synpred44_Scheme5423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_UNQUOTE_in_synpred44_Scheme5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_synpred45_Scheme5568 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_QUASIQUOTE_in_synpred45_Scheme5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_synpred46_Scheme5666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_UNQUOTE_SPLICING_in_synpred46_Scheme5668 = new BitSet(new long[]{0x0000000000000002L});

}