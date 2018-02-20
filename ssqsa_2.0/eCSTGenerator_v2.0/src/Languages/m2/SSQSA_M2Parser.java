// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g 2017-03-03 17:26:02
package Languages.m2;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

/** --------------------------------- SSQSA Modula-2 grammar --------------------------------------
 *  Modula-2 grammar with incorporated SSQSA universal nodes 
 *  Ver 0 - Benjamin (see comment below)
 *  Ver 1 - Gordana, goca@dmi.uns.ac.rs
 *  Ver 2 - Milos, jul 2012, svc@dmi.uns.ac.rs
 * -------------------------------------------------------------------------------------------
 */
public class SSQSA_M2Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LOGICAL_AND", "ARRAY", "BEGIN", "BY", "CASE", "CONST_", "DEC", "DEFINITION", "DIV", "DO", "ELSE", "ELSIF", "END", "EXIT", "EXPORT", "FOR", "FORWARD", "FROM", "IF", "IMPLEMENTATION", "IMPORT", "INC", "IN", "LOOP", "MOD", "MODULE", "NOT", "OF", "LOGICAL_OR", "POINTER", "PROCEDURE", "QUALIFIED", "RECORD", "REPEAT", "RETURN", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "WITH", "ASSIGN_OP", "LOGICAL_AND_OP", "LOGICAL_NOT_OP", "EQUAL_OP", "NOT_EQUAL_OP", "PASCAL_NOT_EQUAL_OP", "GREATER_OP", "GREATER_OR_EQUAL_OP", "LESS_OP", "LESS_OR_EQUAL_OP", "PLUS_OP", "MINUS_OP", "MULTIPLY_OP", "DIVIDE_OP", "POINTER_OP", "DOT", "DOTDOT", "COMPILATION_UNIT", "IMPORT_DECL", "CONCRETE_UNIT_DECL", "INTERFACE_UNIT_DECL", "BLOCK_SCOPE", "ATTRIBUTE_DECL", "VAR_DECL", "TYPE_DECL", "FUNCTION_DECL", "FORMAL_PARAM_LIST", "PARAMETER_DECL", "NAME", "FUNCTION_CALL", "ARGUMENT_LIST", "ARGUMENT", "IMPLEMENTS", "JUMP_STATEMENT", "LOGICAL_OPERATOR", "LOOP_STATEMENT", "INIT", "STEP", "BRANCH_STATEMENT", "BRANCH", "CONDITION", "STATEMENT", "ASSIGNMENT_STATEMENT", "ASSIGN_OPERATOR", "OPERATOR", "COMPARISON_OPERATOR", "VALUE", "CONST", "FOR_INIT", "FOR_CONDITION", "FOR_UPDATE", "SEPARATOR", "KEYWORD", "IGNORE", "VOID", "M2IF_", "IDENT", "INTEGER", "REAL", "SCALE_FACTOR", "HEX_DIGIT", "DIGIT", "OCTAL_DIGIT", "STRING", "LETTER", "CHARACTER", "COMMENT", "WHITESPACE", "'('", "')'", "'{'", "','", "'}'", "'['", "']'", "';'", "':'", "'|'", "'FOREIGN'"
    };
    public static final int WHILE=45;
    public static final int LETTER=111;
    public static final int MOD=28;
    public static final int CONST=94;
    public static final int POINTER=33;
    public static final int ASSIGNMENT_STATEMENT=89;
    public static final int CASE=8;
    public static final int CONCRETE_UNIT_DECL=66;
    public static final int DO=13;
    public static final int VAR_DECL=70;
    public static final int CONDITION=87;
    public static final int LOOP_STATEMENT=82;
    public static final int SEPARATOR=98;
    public static final int FOR_CONDITION=96;
    public static final int NOT=30;
    public static final int EOF=-1;
    public static final int OCTAL_DIGIT=109;
    public static final int LOGICAL_AND=4;
    public static final int CHARACTER=112;
    public static final int STATEMENT=88;
    public static final int NOT_EQUAL_OP=51;
    public static final int TYPE=42;
    public static final int EQUAL_OP=50;
    public static final int ASSIGN_OP=47;
    public static final int INC=25;
    public static final int IMPORT=24;
    public static final int DIVIDE_OP=60;
    public static final int NAME=75;
    public static final int FOR_UPDATE=97;
    public static final int LOGICAL_OPERATOR=81;
    public static final int LESS_OP=55;
    public static final int MULTIPLY_OP=59;
    public static final int COMPILATION_UNIT=64;
    public static final int LOOP=27;
    public static final int BEGIN=6;
    public static final int GREATER_OP=53;
    public static final int RETURN=38;
    public static final int QUALIFIED=35;
    public static final int IMPLEMENTATION=23;
    public static final int VAR=44;
    public static final int VOID=101;
    public static final int EXPORT=18;
    public static final int LOGICAL_NOT_OP=49;
    public static final int COMMENT=113;
    public static final int SCALE_FACTOR=106;
    public static final int TYPE_DECL=71;
    public static final int ARRAY=5;
    public static final int EXIT=17;
    public static final int RECORD=36;
    public static final int KEYWORD=99;
    public static final int BLOCK_SCOPE=68;
    public static final int ELSE=14;
    public static final int M2IF_=102;
    public static final int WHITESPACE=114;
    public static final int INTERFACE_UNIT_DECL=67;
    public static final int BRANCH_STATEMENT=85;
    public static final int VALUE=93;
    public static final int OF=31;
    public static final int REAL=105;
    public static final int T__125=125;
    public static final int ATTRIBUTE_DECL=69;
    public static final int POINTER_OP=61;
    public static final int UNTIL=43;
    public static final int REPEAT=37;
    public static final int FUNCTION_DECL=72;
    public static final int ELSIF=15;
    public static final int FROM=21;
    public static final int END=16;
    public static final int FUNCTION_CALL=76;
    public static final int INIT=83;
    public static final int FOR_INIT=95;
    public static final int DEC=10;
    public static final int FORWARD=20;
    public static final int GREATER_OR_EQUAL_OP=54;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int CONST_=9;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int STEP=84;
    public static final int FOR=19;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int DOTDOT=63;
    public static final int IF=22;
    public static final int IN=26;
    public static final int THEN=40;
    public static final int PARAMETER_DECL=74;
    public static final int IMPLEMENTS=79;
    public static final int ARGUMENT=78;
    public static final int LOGICAL_OR=32;
    public static final int DEFINITION=11;
    public static final int IDENT=103;
    public static final int ARGUMENT_LIST=77;
    public static final int PLUS_OP=57;
    public static final int DIGIT=108;
    public static final int DOT=62;
    public static final int FORMAL_PARAM_LIST=73;
    public static final int WITH=46;
    public static final int INTEGER=104;
    public static final int PASCAL_NOT_EQUAL_OP=52;
    public static final int BY=7;
    public static final int COMPARISON_OPERATOR=92;
    public static final int TO=41;
    public static final int JUMP_STATEMENT=80;
    public static final int ASSIGN_OPERATOR=90;
    public static final int OPERATOR=91;
    public static final int IMPORT_DECL=65;
    public static final int HEX_DIGIT=107;
    public static final int SET=39;
    public static final int IGNORE=100;
    public static final int MODULE=29;
    public static final int PROCEDURE=34;
    public static final int LOGICAL_AND_OP=48;
    public static final int BRANCH=86;
    public static final int MINUS_OP=58;
    public static final int DIV=12;
    public static final int LESS_OR_EQUAL_OP=56;
    public static final int STRING=110;

    // delegates
    // delegators


        public SSQSA_M2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public SSQSA_M2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return SSQSA_M2Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g"; }


    public static class ident_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ident"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:223:1: ident : IDENT ;
    public final SSQSA_M2Parser.ident_return ident() throws RecognitionException {
        SSQSA_M2Parser.ident_return retval = new SSQSA_M2Parser.ident_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENT1=null;

        CommonTree IDENT1_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:223:7: ( IDENT )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:223:9: IDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENT1=(Token)match(input,IDENT,FOLLOW_IDENT_in_ident1741); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT1_tree = (CommonTree)adaptor.create(IDENT1);
            adaptor.addChild(root_0, IDENT1_tree);
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
    // $ANTLR end "ident"

    public static class number_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "number"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:227:1: number : ( INTEGER -> ^( CONST INTEGER ) | REAL -> ^( CONST REAL ) );
    public final SSQSA_M2Parser.number_return number() throws RecognitionException {
        SSQSA_M2Parser.number_return retval = new SSQSA_M2Parser.number_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER2=null;
        Token REAL3=null;

        CommonTree INTEGER2_tree=null;
        CommonTree REAL3_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_REAL=new RewriteRuleTokenStream(adaptor,"token REAL");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:227:8: ( INTEGER -> ^( CONST INTEGER ) | REAL -> ^( CONST REAL ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==INTEGER) ) {
                alt1=1;
            }
            else if ( (LA1_0==REAL) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:227:10: INTEGER
                    {
                    INTEGER2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INTEGER.add(INTEGER2);



                    // AST REWRITE
                    // elements: INTEGER
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 227:18: -> ^( CONST INTEGER )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:227:22: ^( CONST INTEGER )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_INTEGER.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:228:4: REAL
                    {
                    REAL3=(Token)match(input,REAL,FOLLOW_REAL_in_number1773); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_REAL.add(REAL3);



                    // AST REWRITE
                    // elements: REAL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 228:9: -> ^( CONST REAL )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:228:13: ^( CONST REAL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_REAL.nextNode());

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

    public static class integer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integer"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:232:1: integer : INTEGER ;
    public final SSQSA_M2Parser.integer_return integer() throws RecognitionException {
        SSQSA_M2Parser.integer_return retval = new SSQSA_M2Parser.integer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INTEGER4=null;

        CommonTree INTEGER4_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:232:9: ( INTEGER )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:232:11: INTEGER
            {
            root_0 = (CommonTree)adaptor.nil();

            INTEGER4=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer1793); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTEGER4_tree = (CommonTree)adaptor.create(INTEGER4);
            adaptor.addChild(root_0, INTEGER4_tree);
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
    // $ANTLR end "integer"

    public static class real_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "real"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:236:1: real : REAL ;
    public final SSQSA_M2Parser.real_return real() throws RecognitionException {
        SSQSA_M2Parser.real_return retval = new SSQSA_M2Parser.real_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token REAL5=null;

        CommonTree REAL5_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:236:6: ( REAL )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:236:8: REAL
            {
            root_0 = (CommonTree)adaptor.nil();

            REAL5=(Token)match(input,REAL,FOLLOW_REAL_in_real1805); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            REAL5_tree = (CommonTree)adaptor.create(REAL5);
            adaptor.addChild(root_0, REAL5_tree);
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
    // $ANTLR end "real"

    public static class scaleFactor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "scaleFactor"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:240:1: scaleFactor : SCALE_FACTOR ;
    public final SSQSA_M2Parser.scaleFactor_return scaleFactor() throws RecognitionException {
        SSQSA_M2Parser.scaleFactor_return retval = new SSQSA_M2Parser.scaleFactor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SCALE_FACTOR6=null;

        CommonTree SCALE_FACTOR6_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:240:13: ( SCALE_FACTOR )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:240:15: SCALE_FACTOR
            {
            root_0 = (CommonTree)adaptor.nil();

            SCALE_FACTOR6=(Token)match(input,SCALE_FACTOR,FOLLOW_SCALE_FACTOR_in_scaleFactor1817); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SCALE_FACTOR6_tree = (CommonTree)adaptor.create(SCALE_FACTOR6);
            adaptor.addChild(root_0, SCALE_FACTOR6_tree);
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
    // $ANTLR end "scaleFactor"

    public static class hexDigit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hexDigit"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:244:1: hexDigit : HEX_DIGIT ;
    public final SSQSA_M2Parser.hexDigit_return hexDigit() throws RecognitionException {
        SSQSA_M2Parser.hexDigit_return retval = new SSQSA_M2Parser.hexDigit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token HEX_DIGIT7=null;

        CommonTree HEX_DIGIT7_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:244:10: ( HEX_DIGIT )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:244:12: HEX_DIGIT
            {
            root_0 = (CommonTree)adaptor.nil();

            HEX_DIGIT7=(Token)match(input,HEX_DIGIT,FOLLOW_HEX_DIGIT_in_hexDigit1829); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            HEX_DIGIT7_tree = (CommonTree)adaptor.create(HEX_DIGIT7);
            adaptor.addChild(root_0, HEX_DIGIT7_tree);
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
    // $ANTLR end "hexDigit"

    public static class digit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "digit"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:248:1: digit : DIGIT ;
    public final SSQSA_M2Parser.digit_return digit() throws RecognitionException {
        SSQSA_M2Parser.digit_return retval = new SSQSA_M2Parser.digit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DIGIT8=null;

        CommonTree DIGIT8_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:248:7: ( DIGIT )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:248:9: DIGIT
            {
            root_0 = (CommonTree)adaptor.nil();

            DIGIT8=(Token)match(input,DIGIT,FOLLOW_DIGIT_in_digit1841); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DIGIT8_tree = (CommonTree)adaptor.create(DIGIT8);
            adaptor.addChild(root_0, DIGIT8_tree);
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
    // $ANTLR end "digit"

    public static class octalDigit_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "octalDigit"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:252:1: octalDigit : OCTAL_DIGIT ;
    public final SSQSA_M2Parser.octalDigit_return octalDigit() throws RecognitionException {
        SSQSA_M2Parser.octalDigit_return retval = new SSQSA_M2Parser.octalDigit_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OCTAL_DIGIT9=null;

        CommonTree OCTAL_DIGIT9_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:252:12: ( OCTAL_DIGIT )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:252:14: OCTAL_DIGIT
            {
            root_0 = (CommonTree)adaptor.nil();

            OCTAL_DIGIT9=(Token)match(input,OCTAL_DIGIT,FOLLOW_OCTAL_DIGIT_in_octalDigit1853); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            OCTAL_DIGIT9_tree = (CommonTree)adaptor.create(OCTAL_DIGIT9);
            adaptor.addChild(root_0, OCTAL_DIGIT9_tree);
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
    // $ANTLR end "octalDigit"

    public static class string_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "string"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:256:1: string : STRING ;
    public final SSQSA_M2Parser.string_return string() throws RecognitionException {
        SSQSA_M2Parser.string_return retval = new SSQSA_M2Parser.string_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token STRING10=null;

        CommonTree STRING10_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:256:8: ( STRING )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:256:10: STRING
            {
            root_0 = (CommonTree)adaptor.nil();

            STRING10=(Token)match(input,STRING,FOLLOW_STRING_in_string1865); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            STRING10_tree = (CommonTree)adaptor.create(STRING10);
            adaptor.addChild(root_0, STRING10_tree);
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
    // $ANTLR end "string"

    public static class qualident_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualident"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:267:1: qualident : ( ident -> ^( NAME ident ) ) ( '.' ident -> ^( NAME $qualident ^( SEPARATOR '.' ) ^( NAME ident ) ) )* ;
    public final SSQSA_M2Parser.qualident_return qualident() throws RecognitionException {
        SSQSA_M2Parser.qualident_return retval = new SSQSA_M2Parser.qualident_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal12=null;
        SSQSA_M2Parser.ident_return ident11 = null;

        SSQSA_M2Parser.ident_return ident13 = null;


        CommonTree char_literal12_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:267:11: ( ( ident -> ^( NAME ident ) ) ( '.' ident -> ^( NAME $qualident ^( SEPARATOR '.' ) ^( NAME ident ) ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:269:2: ( ident -> ^( NAME ident ) ) ( '.' ident -> ^( NAME $qualident ^( SEPARATOR '.' ) ^( NAME ident ) ) )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:269:2: ( ident -> ^( NAME ident ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:270:3: ident
            {
            pushFollow(FOLLOW_ident_in_qualident1891);
            ident11=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident11.getTree());


            // AST REWRITE
            // elements: ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 270:9: -> ^( NAME ident )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:270:13: ^( NAME ident )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_ident.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:272:2: ( '.' ident -> ^( NAME $qualident ^( SEPARATOR '.' ) ^( NAME ident ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==DOT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:273:3: '.' ident
            	    {
            	    char_literal12=(Token)match(input,DOT,FOLLOW_DOT_in_qualident1912); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_DOT.add(char_literal12);

            	    pushFollow(FOLLOW_ident_in_qualident1914);
            	    ident13=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident13.getTree());


            	    // AST REWRITE
            	    // elements: DOT, qualident, ident
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    if ( state.backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 273:13: -> ^( NAME $qualident ^( SEPARATOR '.' ) ^( NAME ident ) )
            	    {
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:273:16: ^( NAME $qualident ^( SEPARATOR '.' ) ^( NAME ident ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:273:34: ^( SEPARATOR '.' )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

            	        adaptor.addChild(root_2, stream_DOT.nextNode());

            	        adaptor.addChild(root_1, root_2);
            	        }
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:273:51: ^( NAME ident )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

            	        adaptor.addChild(root_2, stream_ident.nextTree());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;}
            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "qualident"

    public static class constantDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constantDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:280:1: constantDeclaration : ident '=' constExpression -> ^( ATTRIBUTE_DECL ^( NAME ident ) ^( TYPE VOID ) ) ;
    public final SSQSA_M2Parser.constantDeclaration_return constantDeclaration() throws RecognitionException {
        SSQSA_M2Parser.constantDeclaration_return retval = new SSQSA_M2Parser.constantDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal15=null;
        SSQSA_M2Parser.ident_return ident14 = null;

        SSQSA_M2Parser.constExpression_return constExpression16 = null;


        CommonTree char_literal15_tree=null;
        RewriteRuleTokenStream stream_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token EQUAL_OP");
        RewriteRuleSubtreeStream stream_constExpression=new RewriteRuleSubtreeStream(adaptor,"rule constExpression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:280:21: ( ident '=' constExpression -> ^( ATTRIBUTE_DECL ^( NAME ident ) ^( TYPE VOID ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:281:2: ident '=' constExpression
            {
            pushFollow(FOLLOW_ident_in_constantDeclaration1955);
            ident14=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident14.getTree());
            char_literal15=(Token)match(input,EQUAL_OP,FOLLOW_EQUAL_OP_in_constantDeclaration1957); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL_OP.add(char_literal15);

            pushFollow(FOLLOW_constExpression_in_constantDeclaration1959);
            constExpression16=constExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_constExpression.add(constExpression16.getTree());


            // AST REWRITE
            // elements: ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 281:28: -> ^( ATTRIBUTE_DECL ^( NAME ident ) ^( TYPE VOID ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:281:31: ^( ATTRIBUTE_DECL ^( NAME ident ) ^( TYPE VOID ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE_DECL, "ATTRIBUTE_DECL"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:281:48: ^( NAME ident )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_ident.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:281:62: ^( TYPE VOID )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(VOID, "VOID"));

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
    // $ANTLR end "constantDeclaration"

    public static class constExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:286:1: constExpression : simpleConstExpr ( relation simpleConstExpr )? ;
    public final SSQSA_M2Parser.constExpression_return constExpression() throws RecognitionException {
        SSQSA_M2Parser.constExpression_return retval = new SSQSA_M2Parser.constExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.simpleConstExpr_return simpleConstExpr17 = null;

        SSQSA_M2Parser.relation_return relation18 = null;

        SSQSA_M2Parser.simpleConstExpr_return simpleConstExpr19 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:286:17: ( simpleConstExpr ( relation simpleConstExpr )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:287:2: simpleConstExpr ( relation simpleConstExpr )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleConstExpr_in_constExpression1992);
            simpleConstExpr17=simpleConstExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleConstExpr17.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:287:18: ( relation simpleConstExpr )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==IN||(LA3_0>=EQUAL_OP && LA3_0<=LESS_OR_EQUAL_OP)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:287:20: relation simpleConstExpr
                    {
                    pushFollow(FOLLOW_relation_in_constExpression1996);
                    relation18=relation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(relation18.getTree(), root_0);
                    pushFollow(FOLLOW_simpleConstExpr_in_constExpression1999);
                    simpleConstExpr19=simpleConstExpr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleConstExpr19.getTree());

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
    // $ANTLR end "constExpression"

    public static class relation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relation"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:292:1: relation : ( '=' -> ^( COMPARISON_OPERATOR '=' ) | '#' -> ^( COMPARISON_OPERATOR '#' ) | '<>' -> ^( COMPARISON_OPERATOR '<>' ) | '<' -> ^( COMPARISON_OPERATOR '<' ) | '<=' -> ^( COMPARISON_OPERATOR '<=' ) | '>' -> ^( COMPARISON_OPERATOR '>' ) | '>=' -> ^( COMPARISON_OPERATOR '>=' ) | 'IN' -> ^( COMPARISON_OPERATOR 'IN' ) );
    public final SSQSA_M2Parser.relation_return relation() throws RecognitionException {
        SSQSA_M2Parser.relation_return retval = new SSQSA_M2Parser.relation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal20=null;
        Token char_literal21=null;
        Token string_literal22=null;
        Token char_literal23=null;
        Token string_literal24=null;
        Token char_literal25=null;
        Token string_literal26=null;
        Token string_literal27=null;

        CommonTree char_literal20_tree=null;
        CommonTree char_literal21_tree=null;
        CommonTree string_literal22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree string_literal24_tree=null;
        CommonTree char_literal25_tree=null;
        CommonTree string_literal26_tree=null;
        CommonTree string_literal27_tree=null;
        RewriteRuleTokenStream stream_PASCAL_NOT_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token PASCAL_NOT_EQUAL_OP");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_LESS_OP=new RewriteRuleTokenStream(adaptor,"token LESS_OP");
        RewriteRuleTokenStream stream_GREATER_OR_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token GREATER_OR_EQUAL_OP");
        RewriteRuleTokenStream stream_LESS_OR_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token LESS_OR_EQUAL_OP");
        RewriteRuleTokenStream stream_NOT_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token NOT_EQUAL_OP");
        RewriteRuleTokenStream stream_GREATER_OP=new RewriteRuleTokenStream(adaptor,"token GREATER_OP");
        RewriteRuleTokenStream stream_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token EQUAL_OP");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:292:10: ( '=' -> ^( COMPARISON_OPERATOR '=' ) | '#' -> ^( COMPARISON_OPERATOR '#' ) | '<>' -> ^( COMPARISON_OPERATOR '<>' ) | '<' -> ^( COMPARISON_OPERATOR '<' ) | '<=' -> ^( COMPARISON_OPERATOR '<=' ) | '>' -> ^( COMPARISON_OPERATOR '>' ) | '>=' -> ^( COMPARISON_OPERATOR '>=' ) | 'IN' -> ^( COMPARISON_OPERATOR 'IN' ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case EQUAL_OP:
                {
                alt4=1;
                }
                break;
            case NOT_EQUAL_OP:
                {
                alt4=2;
                }
                break;
            case PASCAL_NOT_EQUAL_OP:
                {
                alt4=3;
                }
                break;
            case LESS_OP:
                {
                alt4=4;
                }
                break;
            case LESS_OR_EQUAL_OP:
                {
                alt4=5;
                }
                break;
            case GREATER_OP:
                {
                alt4=6;
                }
                break;
            case GREATER_OR_EQUAL_OP:
                {
                alt4=7;
                }
                break;
            case IN:
                {
                alt4=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:293:2: '='
                    {
                    char_literal20=(Token)match(input,EQUAL_OP,FOLLOW_EQUAL_OP_in_relation2015); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL_OP.add(char_literal20);



                    // AST REWRITE
                    // elements: EQUAL_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 293:6: -> ^( COMPARISON_OPERATOR '=' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:293:9: ^( COMPARISON_OPERATOR '=' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_EQUAL_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:294:4: '#'
                    {
                    char_literal21=(Token)match(input,NOT_EQUAL_OP,FOLLOW_NOT_EQUAL_OP_in_relation2029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_NOT_EQUAL_OP.add(char_literal21);



                    // AST REWRITE
                    // elements: NOT_EQUAL_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 294:8: -> ^( COMPARISON_OPERATOR '#' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:294:11: ^( COMPARISON_OPERATOR '#' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_NOT_EQUAL_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:295:4: '<>'
                    {
                    string_literal22=(Token)match(input,PASCAL_NOT_EQUAL_OP,FOLLOW_PASCAL_NOT_EQUAL_OP_in_relation2043); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PASCAL_NOT_EQUAL_OP.add(string_literal22);



                    // AST REWRITE
                    // elements: PASCAL_NOT_EQUAL_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 295:9: -> ^( COMPARISON_OPERATOR '<>' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:295:12: ^( COMPARISON_OPERATOR '<>' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_PASCAL_NOT_EQUAL_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:296:4: '<'
                    {
                    char_literal23=(Token)match(input,LESS_OP,FOLLOW_LESS_OP_in_relation2057); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LESS_OP.add(char_literal23);



                    // AST REWRITE
                    // elements: LESS_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 296:8: -> ^( COMPARISON_OPERATOR '<' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:296:11: ^( COMPARISON_OPERATOR '<' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_LESS_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:297:4: '<='
                    {
                    string_literal24=(Token)match(input,LESS_OR_EQUAL_OP,FOLLOW_LESS_OR_EQUAL_OP_in_relation2071); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LESS_OR_EQUAL_OP.add(string_literal24);



                    // AST REWRITE
                    // elements: LESS_OR_EQUAL_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 297:9: -> ^( COMPARISON_OPERATOR '<=' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:297:12: ^( COMPARISON_OPERATOR '<=' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_LESS_OR_EQUAL_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:298:4: '>'
                    {
                    char_literal25=(Token)match(input,GREATER_OP,FOLLOW_GREATER_OP_in_relation2085); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GREATER_OP.add(char_literal25);



                    // AST REWRITE
                    // elements: GREATER_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 298:8: -> ^( COMPARISON_OPERATOR '>' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:298:11: ^( COMPARISON_OPERATOR '>' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_GREATER_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:299:4: '>='
                    {
                    string_literal26=(Token)match(input,GREATER_OR_EQUAL_OP,FOLLOW_GREATER_OR_EQUAL_OP_in_relation2099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_GREATER_OR_EQUAL_OP.add(string_literal26);



                    // AST REWRITE
                    // elements: GREATER_OR_EQUAL_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 299:9: -> ^( COMPARISON_OPERATOR '>=' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:299:12: ^( COMPARISON_OPERATOR '>=' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_GREATER_OR_EQUAL_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:300:4: 'IN'
                    {
                    string_literal27=(Token)match(input,IN,FOLLOW_IN_in_relation2113); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IN.add(string_literal27);



                    // AST REWRITE
                    // elements: IN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 300:9: -> ^( COMPARISON_OPERATOR 'IN' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:300:12: ^( COMPARISON_OPERATOR 'IN' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_IN.nextNode());

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
    // $ANTLR end "relation"

    public static class simpleConstExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleConstExpr"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:305:1: simpleConstExpr : ( '+' | '-' )? constTerm ( addOperator constTerm )* ;
    public final SSQSA_M2Parser.simpleConstExpr_return simpleConstExpr() throws RecognitionException {
        SSQSA_M2Parser.simpleConstExpr_return retval = new SSQSA_M2Parser.simpleConstExpr_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set28=null;
        SSQSA_M2Parser.constTerm_return constTerm29 = null;

        SSQSA_M2Parser.addOperator_return addOperator30 = null;

        SSQSA_M2Parser.constTerm_return constTerm31 = null;


        CommonTree set28_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:305:17: ( ( '+' | '-' )? constTerm ( addOperator constTerm )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:306:2: ( '+' | '-' )? constTerm ( addOperator constTerm )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:306:2: ( '+' | '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=PLUS_OP && LA5_0<=MINUS_OP)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
                    {
                    set28=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS_OP && input.LA(1)<=MINUS_OP) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set28));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_constTerm_in_simpleConstExpr2146);
            constTerm29=constTerm();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constTerm29.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:306:27: ( addOperator constTerm )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:306:29: addOperator constTerm
            	    {
            	    pushFollow(FOLLOW_addOperator_in_simpleConstExpr2150);
            	    addOperator30=addOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(addOperator30.getTree(), root_0);
            	    pushFollow(FOLLOW_constTerm_in_simpleConstExpr2153);
            	    constTerm31=constTerm();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constTerm31.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "simpleConstExpr"

    public static class addOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addOperator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:311:1: addOperator : ( PLUS_OP -> ^( OPERATOR PLUS_OP ) | MINUS_OP -> ^( OPERATOR MINUS_OP ) | LOGICAL_OR -> ( ^( LOGICAL_OPERATOR LOGICAL_OR ) )? );
    public final SSQSA_M2Parser.addOperator_return addOperator() throws RecognitionException {
        SSQSA_M2Parser.addOperator_return retval = new SSQSA_M2Parser.addOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PLUS_OP32=null;
        Token MINUS_OP33=null;
        Token LOGICAL_OR34=null;

        CommonTree PLUS_OP32_tree=null;
        CommonTree MINUS_OP33_tree=null;
        CommonTree LOGICAL_OR34_tree=null;
        RewriteRuleTokenStream stream_MINUS_OP=new RewriteRuleTokenStream(adaptor,"token MINUS_OP");
        RewriteRuleTokenStream stream_PLUS_OP=new RewriteRuleTokenStream(adaptor,"token PLUS_OP");
        RewriteRuleTokenStream stream_LOGICAL_OR=new RewriteRuleTokenStream(adaptor,"token LOGICAL_OR");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:311:13: ( PLUS_OP -> ^( OPERATOR PLUS_OP ) | MINUS_OP -> ^( OPERATOR MINUS_OP ) | LOGICAL_OR -> ( ^( LOGICAL_OPERATOR LOGICAL_OR ) )? )
            int alt7=3;
            switch ( input.LA(1) ) {
            case PLUS_OP:
                {
                alt7=1;
                }
                break;
            case MINUS_OP:
                {
                alt7=2;
                }
                break;
            case LOGICAL_OR:
                {
                alt7=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:312:3: PLUS_OP
                    {
                    PLUS_OP32=(Token)match(input,PLUS_OP,FOLLOW_PLUS_OP_in_addOperator2170); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PLUS_OP.add(PLUS_OP32);



                    // AST REWRITE
                    // elements: PLUS_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 312:11: -> ^( OPERATOR PLUS_OP )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:312:14: ^( OPERATOR PLUS_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_PLUS_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:313:5: MINUS_OP
                    {
                    MINUS_OP33=(Token)match(input,MINUS_OP,FOLLOW_MINUS_OP_in_addOperator2185); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_OP.add(MINUS_OP33);



                    // AST REWRITE
                    // elements: MINUS_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 313:14: -> ^( OPERATOR MINUS_OP )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:313:17: ^( OPERATOR MINUS_OP )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_MINUS_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:314:5: LOGICAL_OR
                    {
                    LOGICAL_OR34=(Token)match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_addOperator2199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOGICAL_OR.add(LOGICAL_OR34);



                    // AST REWRITE
                    // elements: LOGICAL_OR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 314:16: -> ( ^( LOGICAL_OPERATOR LOGICAL_OR ) )?
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:314:19: ( ^( LOGICAL_OPERATOR LOGICAL_OR ) )?
                        if ( stream_LOGICAL_OR.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:314:19: ^( LOGICAL_OPERATOR LOGICAL_OR )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                            adaptor.addChild(root_1, stream_LOGICAL_OR.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_LOGICAL_OR.reset();

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
    // $ANTLR end "addOperator"

    public static class constTerm_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constTerm"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:319:1: constTerm : constFactor ( mulOperator constFactor )* ;
    public final SSQSA_M2Parser.constTerm_return constTerm() throws RecognitionException {
        SSQSA_M2Parser.constTerm_return retval = new SSQSA_M2Parser.constTerm_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.constFactor_return constFactor35 = null;

        SSQSA_M2Parser.mulOperator_return mulOperator36 = null;

        SSQSA_M2Parser.constFactor_return constFactor37 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:319:11: ( constFactor ( mulOperator constFactor )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:320:2: constFactor ( mulOperator constFactor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_constFactor_in_constTerm2221);
            constFactor35=constFactor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constFactor35.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:320:14: ( mulOperator constFactor )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LOGICAL_AND||LA8_0==DIV||LA8_0==MOD||LA8_0==LOGICAL_AND_OP||(LA8_0>=MULTIPLY_OP && LA8_0<=DIVIDE_OP)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:320:16: mulOperator constFactor
            	    {
            	    pushFollow(FOLLOW_mulOperator_in_constTerm2225);
            	    mulOperator36=mulOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(mulOperator36.getTree(), root_0);
            	    pushFollow(FOLLOW_constFactor_in_constTerm2228);
            	    constFactor37=constFactor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, constFactor37.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


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
    // $ANTLR end "constTerm"

    public static class mulOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulOperator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:325:1: mulOperator : ( LOGICAL_AND -> ( ^( LOGICAL_OPERATOR LOGICAL_AND ) )? | LOGICAL_AND_OP -> ( ^( LOGICAL_OPERATOR LOGICAL_AND_OP ) )? | '*' -> ^( OPERATOR '*' ) | '/' -> ^( OPERATOR '/' ) | 'DIV' -> ^( OPERATOR 'DIV' ) | 'MOD' -> ^( OPERATOR 'MOD' ) );
    public final SSQSA_M2Parser.mulOperator_return mulOperator() throws RecognitionException {
        SSQSA_M2Parser.mulOperator_return retval = new SSQSA_M2Parser.mulOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOGICAL_AND38=null;
        Token LOGICAL_AND_OP39=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token string_literal42=null;
        Token string_literal43=null;

        CommonTree LOGICAL_AND38_tree=null;
        CommonTree LOGICAL_AND_OP39_tree=null;
        CommonTree char_literal40_tree=null;
        CommonTree char_literal41_tree=null;
        CommonTree string_literal42_tree=null;
        CommonTree string_literal43_tree=null;
        RewriteRuleTokenStream stream_DIVIDE_OP=new RewriteRuleTokenStream(adaptor,"token DIVIDE_OP");
        RewriteRuleTokenStream stream_LOGICAL_AND_OP=new RewriteRuleTokenStream(adaptor,"token LOGICAL_AND_OP");
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_MULTIPLY_OP=new RewriteRuleTokenStream(adaptor,"token MULTIPLY_OP");
        RewriteRuleTokenStream stream_MOD=new RewriteRuleTokenStream(adaptor,"token MOD");
        RewriteRuleTokenStream stream_LOGICAL_AND=new RewriteRuleTokenStream(adaptor,"token LOGICAL_AND");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:325:13: ( LOGICAL_AND -> ( ^( LOGICAL_OPERATOR LOGICAL_AND ) )? | LOGICAL_AND_OP -> ( ^( LOGICAL_OPERATOR LOGICAL_AND_OP ) )? | '*' -> ^( OPERATOR '*' ) | '/' -> ^( OPERATOR '/' ) | 'DIV' -> ^( OPERATOR 'DIV' ) | 'MOD' -> ^( OPERATOR 'MOD' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case LOGICAL_AND:
                {
                alt9=1;
                }
                break;
            case LOGICAL_AND_OP:
                {
                alt9=2;
                }
                break;
            case MULTIPLY_OP:
                {
                alt9=3;
                }
                break;
            case DIVIDE_OP:
                {
                alt9=4;
                }
                break;
            case DIV:
                {
                alt9=5;
                }
                break;
            case MOD:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:326:7: LOGICAL_AND
                    {
                    LOGICAL_AND38=(Token)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_mulOperator2250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOGICAL_AND.add(LOGICAL_AND38);



                    // AST REWRITE
                    // elements: LOGICAL_AND
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 326:19: -> ( ^( LOGICAL_OPERATOR LOGICAL_AND ) )?
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:326:22: ( ^( LOGICAL_OPERATOR LOGICAL_AND ) )?
                        if ( stream_LOGICAL_AND.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:326:22: ^( LOGICAL_OPERATOR LOGICAL_AND )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                            adaptor.addChild(root_1, stream_LOGICAL_AND.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_LOGICAL_AND.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:327:7: LOGICAL_AND_OP
                    {
                    LOGICAL_AND_OP39=(Token)match(input,LOGICAL_AND_OP,FOLLOW_LOGICAL_AND_OP_in_mulOperator2269); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LOGICAL_AND_OP.add(LOGICAL_AND_OP39);



                    // AST REWRITE
                    // elements: LOGICAL_AND_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 327:22: -> ( ^( LOGICAL_OPERATOR LOGICAL_AND_OP ) )?
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:327:25: ( ^( LOGICAL_OPERATOR LOGICAL_AND_OP ) )?
                        if ( stream_LOGICAL_AND_OP.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:327:25: ^( LOGICAL_OPERATOR LOGICAL_AND_OP )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                            adaptor.addChild(root_1, stream_LOGICAL_AND_OP.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_LOGICAL_AND_OP.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:328:7: '*'
                    {
                    char_literal40=(Token)match(input,MULTIPLY_OP,FOLLOW_MULTIPLY_OP_in_mulOperator2288); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MULTIPLY_OP.add(char_literal40);



                    // AST REWRITE
                    // elements: MULTIPLY_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 328:11: -> ^( OPERATOR '*' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:328:14: ^( OPERATOR '*' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_MULTIPLY_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:329:6: '/'
                    {
                    char_literal41=(Token)match(input,DIVIDE_OP,FOLLOW_DIVIDE_OP_in_mulOperator2304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DIVIDE_OP.add(char_literal41);



                    // AST REWRITE
                    // elements: DIVIDE_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 329:10: -> ^( OPERATOR '/' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:329:13: ^( OPERATOR '/' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DIVIDE_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:330:6: 'DIV'
                    {
                    string_literal42=(Token)match(input,DIV,FOLLOW_DIV_in_mulOperator2319); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DIV.add(string_literal42);



                    // AST REWRITE
                    // elements: DIV
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 330:12: -> ^( OPERATOR 'DIV' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:330:15: ^( OPERATOR 'DIV' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DIV.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:331:6: 'MOD'
                    {
                    string_literal43=(Token)match(input,MOD,FOLLOW_MOD_in_mulOperator2334); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MOD.add(string_literal43);



                    // AST REWRITE
                    // elements: MOD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 331:12: -> ^( OPERATOR 'MOD' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:331:15: ^( OPERATOR 'MOD' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_MOD.nextNode());

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
    // $ANTLR end "mulOperator"

    public static class constFactor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constFactor"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:337:1: constFactor : ( number | string | qualident ( constSet )? | constSet | '(' constExpression ')' | ( 'NOT' | '~' ) constFactor );
    public final SSQSA_M2Parser.constFactor_return constFactor() throws RecognitionException {
        SSQSA_M2Parser.constFactor_return retval = new SSQSA_M2Parser.constFactor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        Token char_literal51=null;
        Token string_literal52=null;
        Token char_literal53=null;
        SSQSA_M2Parser.number_return number44 = null;

        SSQSA_M2Parser.string_return string45 = null;

        SSQSA_M2Parser.qualident_return qualident46 = null;

        SSQSA_M2Parser.constSet_return constSet47 = null;

        SSQSA_M2Parser.constSet_return constSet48 = null;

        SSQSA_M2Parser.constExpression_return constExpression50 = null;

        SSQSA_M2Parser.constFactor_return constFactor54 = null;


        CommonTree char_literal49_tree=null;
        CommonTree char_literal51_tree=null;
        CommonTree string_literal52_tree=null;
        CommonTree char_literal53_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:337:13: ( number | string | qualident ( constSet )? | constSet | '(' constExpression ')' | ( 'NOT' | '~' ) constFactor )
            int alt12=6;
            switch ( input.LA(1) ) {
            case INTEGER:
            case REAL:
                {
                alt12=1;
                }
                break;
            case STRING:
                {
                alt12=2;
                }
                break;
            case IDENT:
                {
                alt12=3;
                }
                break;
            case 117:
                {
                alt12=4;
                }
                break;
            case 115:
                {
                alt12=5;
                }
                break;
            case NOT:
            case LOGICAL_NOT_OP:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:338:2: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_constFactor2356);
                    number44=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number44.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:339:2: string
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_string_in_constFactor2361);
                    string45=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string45.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:340:2: qualident ( constSet )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_qualident_in_constFactor2366);
                    qualident46=qualident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident46.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:340:12: ( constSet )?
                    int alt10=2;
                    alt10 = dfa10.predict(input);
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:340:14: constSet
                            {
                            pushFollow(FOLLOW_constSet_in_constFactor2370);
                            constSet47=constSet();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, constSet47.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:341:2: constSet
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_constSet_in_constFactor2378);
                    constSet48=constSet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constSet48.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:342:2: '(' constExpression ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal49=(Token)match(input,115,FOLLOW_115_in_constFactor2383); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
                    adaptor.addChild(root_0, char_literal49_tree);
                    }
                    pushFollow(FOLLOW_constExpression_in_constFactor2385);
                    constExpression50=constExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(constExpression50.getTree(), root_0);
                    char_literal51=(Token)match(input,116,FOLLOW_116_in_constFactor2388); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal51_tree = (CommonTree)adaptor.create(char_literal51);
                    adaptor.addChild(root_0, char_literal51_tree);
                    }

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:342:29: ( 'NOT' | '~' ) constFactor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:342:29: ( 'NOT' | '~' )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==NOT) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==LOGICAL_NOT_OP) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:342:31: 'NOT'
                            {
                            string_literal52=(Token)match(input,NOT,FOLLOW_NOT_in_constFactor2394); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal52_tree = (CommonTree)adaptor.create(string_literal52);
                            root_0 = (CommonTree)adaptor.becomeRoot(string_literal52_tree, root_0);
                            }

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:342:40: '~'
                            {
                            char_literal53=(Token)match(input,LOGICAL_NOT_OP,FOLLOW_LOGICAL_NOT_OP_in_constFactor2399); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal53_tree = (CommonTree)adaptor.create(char_literal53);
                            root_0 = (CommonTree)adaptor.becomeRoot(char_literal53_tree, root_0);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_constFactor_in_constFactor2403);
                    constFactor54=constFactor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constFactor54.getTree());

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
    // $ANTLR end "constFactor"

    public static class constSet_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constSet"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:348:1: constSet : '{' ( constElement ( ',' constElement )* )? '}' -> IGNORE ;
    public final SSQSA_M2Parser.constSet_return constSet() throws RecognitionException {
        SSQSA_M2Parser.constSet_return retval = new SSQSA_M2Parser.constSet_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        Token char_literal59=null;
        SSQSA_M2Parser.constElement_return constElement56 = null;

        SSQSA_M2Parser.constElement_return constElement58 = null;


        CommonTree char_literal55_tree=null;
        CommonTree char_literal57_tree=null;
        CommonTree char_literal59_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_constElement=new RewriteRuleSubtreeStream(adaptor,"rule constElement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:348:10: ( '{' ( constElement ( ',' constElement )* )? '}' -> IGNORE )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:350:2: '{' ( constElement ( ',' constElement )* )? '}'
            {
            char_literal55=(Token)match(input,117,FOLLOW_117_in_constSet2421); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal55);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:350:6: ( constElement ( ',' constElement )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NOT||LA14_0==LOGICAL_NOT_OP||(LA14_0>=PLUS_OP && LA14_0<=MINUS_OP)||(LA14_0>=IDENT && LA14_0<=REAL)||LA14_0==STRING||LA14_0==115||LA14_0==117) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:350:8: constElement ( ',' constElement )*
                    {
                    pushFollow(FOLLOW_constElement_in_constSet2425);
                    constElement56=constElement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constElement.add(constElement56.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:350:21: ( ',' constElement )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==118) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:350:23: ',' constElement
                    	    {
                    	    char_literal57=(Token)match(input,118,FOLLOW_118_in_constSet2429); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_118.add(char_literal57);

                    	    pushFollow(FOLLOW_constElement_in_constSet2431);
                    	    constElement58=constElement();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_constElement.add(constElement58.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal59=(Token)match(input,119,FOLLOW_119_in_constSet2439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal59);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 350:50: -> IGNORE
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(IGNORE, "IGNORE"));

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
    // $ANTLR end "constSet"

    public static class constElement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constElement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:355:1: constElement : constExpression ( '..' constExpression )? ;
    public final SSQSA_M2Parser.constElement_return constElement() throws RecognitionException {
        SSQSA_M2Parser.constElement_return retval = new SSQSA_M2Parser.constElement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal61=null;
        SSQSA_M2Parser.constExpression_return constExpression60 = null;

        SSQSA_M2Parser.constExpression_return constExpression62 = null;


        CommonTree string_literal61_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:355:14: ( constExpression ( '..' constExpression )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:356:2: constExpression ( '..' constExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_constExpression_in_constElement2459);
            constExpression60=constExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression60.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:356:18: ( '..' constExpression )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==DOTDOT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:356:20: '..' constExpression
                    {
                    string_literal61=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_constElement2463); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal61_tree = (CommonTree)adaptor.create(string_literal61);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_0);
                    }
                    pushFollow(FOLLOW_constExpression_in_constElement2466);
                    constExpression62=constExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression62.getTree());

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
    // $ANTLR end "constElement"

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:361:1: typeDeclaration : ident '=' type -> ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) ) ;
    public final SSQSA_M2Parser.typeDeclaration_return typeDeclaration() throws RecognitionException {
        SSQSA_M2Parser.typeDeclaration_return retval = new SSQSA_M2Parser.typeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal64=null;
        SSQSA_M2Parser.ident_return ident63 = null;

        SSQSA_M2Parser.type_return type65 = null;


        CommonTree char_literal64_tree=null;
        RewriteRuleTokenStream stream_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token EQUAL_OP");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:361:17: ( ident '=' type -> ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:362:2: ident '=' type
            {
            pushFollow(FOLLOW_ident_in_typeDeclaration2483);
            ident63=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident63.getTree());
            char_literal64=(Token)match(input,EQUAL_OP,FOLLOW_EQUAL_OP_in_typeDeclaration2485); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL_OP.add(char_literal64);

            pushFollow(FOLLOW_type_in_typeDeclaration2487);
            type65=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type65.getTree());


            // AST REWRITE
            // elements: EQUAL_OP, ident, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 362:17: -> ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:362:20: ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:362:32: ^( NAME ident )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_ident.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:362:46: ^( '=' type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL_OP.nextNode(), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

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
    // $ANTLR end "typeDeclaration"

    public static class defModTypeDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defModTypeDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:365:1: defModTypeDeclaration : ( ident -> ^( TYPE_DECL ^( NAME ident ) ) | ident '=' type -> ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) ) );
    public final SSQSA_M2Parser.defModTypeDeclaration_return defModTypeDeclaration() throws RecognitionException {
        SSQSA_M2Parser.defModTypeDeclaration_return retval = new SSQSA_M2Parser.defModTypeDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal68=null;
        SSQSA_M2Parser.ident_return ident66 = null;

        SSQSA_M2Parser.ident_return ident67 = null;

        SSQSA_M2Parser.type_return type69 = null;


        CommonTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_EQUAL_OP=new RewriteRuleTokenStream(adaptor,"token EQUAL_OP");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:365:23: ( ident -> ^( TYPE_DECL ^( NAME ident ) ) | ident '=' type -> ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENT) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EQUAL_OP) ) {
                    alt16=2;
                }
                else if ( (LA16_1==122) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:366:4: ident
                    {
                    pushFollow(FOLLOW_ident_in_defModTypeDeclaration2518);
                    ident66=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident66.getTree());


                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 366:10: -> ^( TYPE_DECL ^( NAME ident ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:366:13: ^( TYPE_DECL ^( NAME ident ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:366:25: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:367:4: ident '=' type
                    {
                    pushFollow(FOLLOW_ident_in_defModTypeDeclaration2535);
                    ident67=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident67.getTree());
                    char_literal68=(Token)match(input,EQUAL_OP,FOLLOW_EQUAL_OP_in_defModTypeDeclaration2537); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_EQUAL_OP.add(char_literal68);

                    pushFollow(FOLLOW_type_in_defModTypeDeclaration2539);
                    type69=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type69.getTree());


                    // AST REWRITE
                    // elements: type, ident, EQUAL_OP
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 367:19: -> ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:367:22: ^( TYPE_DECL ^( NAME ident ) ^( '=' type ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE_DECL, "TYPE_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:367:34: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:367:48: ^( '=' type )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_EQUAL_OP.nextNode(), root_2);

                        adaptor.addChild(root_2, stream_type.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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
    // $ANTLR end "defModTypeDeclaration"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:372:1: type : ( simpleType | arrayType | recordType | setType | pointerType | procedureType );
    public final SSQSA_M2Parser.type_return type() throws RecognitionException {
        SSQSA_M2Parser.type_return retval = new SSQSA_M2Parser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.simpleType_return simpleType70 = null;

        SSQSA_M2Parser.arrayType_return arrayType71 = null;

        SSQSA_M2Parser.recordType_return recordType72 = null;

        SSQSA_M2Parser.setType_return setType73 = null;

        SSQSA_M2Parser.pointerType_return pointerType74 = null;

        SSQSA_M2Parser.procedureType_return procedureType75 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:372:6: ( simpleType | arrayType | recordType | setType | pointerType | procedureType )
            int alt17=6;
            switch ( input.LA(1) ) {
            case IDENT:
            case 115:
            case 120:
                {
                alt17=1;
                }
                break;
            case ARRAY:
                {
                alt17=2;
                }
                break;
            case RECORD:
                {
                alt17=3;
                }
                break;
            case SET:
                {
                alt17=4;
                }
                break;
            case POINTER:
                {
                alt17=5;
                }
                break;
            case PROCEDURE:
                {
                alt17=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:373:2: simpleType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_simpleType_in_type2570);
                    simpleType70=simpleType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleType70.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:373:15: arrayType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayType_in_type2574);
                    arrayType71=arrayType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayType71.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:373:27: recordType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_recordType_in_type2578);
                    recordType72=recordType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, recordType72.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:373:40: setType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_setType_in_type2582);
                    setType73=setType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, setType73.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:373:50: pointerType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_pointerType_in_type2586);
                    pointerType74=pointerType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, pointerType74.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:373:64: procedureType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procedureType_in_type2590);
                    procedureType75=procedureType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procedureType75.getTree());

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
    // $ANTLR end "type"

    public static class simpleType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:379:1: simpleType : ( ident ( '.' ident )* -> ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) | subrangeType | enumeration );
    public final SSQSA_M2Parser.simpleType_return simpleType() throws RecognitionException {
        SSQSA_M2Parser.simpleType_return retval = new SSQSA_M2Parser.simpleType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal77=null;
        SSQSA_M2Parser.ident_return ident76 = null;

        SSQSA_M2Parser.ident_return ident78 = null;

        SSQSA_M2Parser.subrangeType_return subrangeType79 = null;

        SSQSA_M2Parser.enumeration_return enumeration80 = null;


        CommonTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:379:12: ( ident ( '.' ident )* -> ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) | subrangeType | enumeration )
            int alt19=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==120) ) {
                    alt19=2;
                }
                else if ( (LA19_1==EOF||LA19_1==ELSE||LA19_1==END||LA19_1==OF||LA19_1==DOT||LA19_1==118||LA19_1==122||LA19_1==124) ) {
                    alt19=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case 120:
                {
                alt19=2;
                }
                break;
            case 115:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:380:2: ident ( '.' ident )*
                    {
                    pushFollow(FOLLOW_ident_in_simpleType2604);
                    ident76=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident76.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:380:8: ( '.' ident )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==DOT) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:380:10: '.' ident
                    	    {
                    	    char_literal77=(Token)match(input,DOT,FOLLOW_DOT_in_simpleType2608); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal77);

                    	    pushFollow(FOLLOW_ident_in_simpleType2610);
                    	    ident78=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ident.add(ident78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: ident, DOT, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 380:23: -> ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:380:26: ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:380:39: ( ^( SEPARATOR '.' ident ) )*
                        while ( stream_DOT.hasNext()||stream_ident.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:380:39: ^( SEPARATOR '.' ident )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                            adaptor.addChild(root_2, stream_DOT.nextNode());
                            adaptor.addChild(root_2, stream_ident.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_DOT.reset();
                        stream_ident.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:381:2: subrangeType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_subrangeType_in_simpleType2637);
                    subrangeType79=subrangeType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subrangeType79.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:382:2: enumeration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_enumeration_in_simpleType2642);
                    enumeration80=enumeration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumeration80.getTree());

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
    // $ANTLR end "simpleType"

    public static class subrangeType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subrangeType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:387:1: subrangeType : ( ident range -> ^( TYPE ident range ) | range -> ^( TYPE range ) );
    public final SSQSA_M2Parser.subrangeType_return subrangeType() throws RecognitionException {
        SSQSA_M2Parser.subrangeType_return retval = new SSQSA_M2Parser.subrangeType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.ident_return ident81 = null;

        SSQSA_M2Parser.range_return range82 = null;

        SSQSA_M2Parser.range_return range83 = null;


        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_range=new RewriteRuleSubtreeStream(adaptor,"rule range");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:387:14: ( ident range -> ^( TYPE ident range ) | range -> ^( TYPE range ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==IDENT) ) {
                alt20=1;
            }
            else if ( (LA20_0==120) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:388:2: ident range
                    {
                    pushFollow(FOLLOW_ident_in_subrangeType2656);
                    ident81=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident81.getTree());
                    pushFollow(FOLLOW_range_in_subrangeType2658);
                    range82=range();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range.add(range82.getTree());


                    // AST REWRITE
                    // elements: ident, range
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 388:14: -> ^( TYPE ident range )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:388:17: ^( TYPE ident range )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());
                        adaptor.addChild(root_1, stream_range.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:389:2: range
                    {
                    pushFollow(FOLLOW_range_in_subrangeType2675);
                    range83=range();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_range.add(range83.getTree());


                    // AST REWRITE
                    // elements: range
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 389:8: -> ^( TYPE range )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:389:11: ^( TYPE range )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                        adaptor.addChild(root_1, stream_range.nextTree());

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
    // $ANTLR end "subrangeType"

    public static class enumeration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumeration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:394:1: enumeration : '(' identList ')' ;
    public final SSQSA_M2Parser.enumeration_return enumeration() throws RecognitionException {
        SSQSA_M2Parser.enumeration_return retval = new SSQSA_M2Parser.enumeration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal84=null;
        Token char_literal86=null;
        SSQSA_M2Parser.identList_return identList85 = null;


        CommonTree char_literal84_tree=null;
        CommonTree char_literal86_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:394:13: ( '(' identList ')' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:395:2: '(' identList ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal84=(Token)match(input,115,FOLLOW_115_in_enumeration2699); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal84_tree = (CommonTree)adaptor.create(char_literal84);
            adaptor.addChild(root_0, char_literal84_tree);
            }
            pushFollow(FOLLOW_identList_in_enumeration2701);
            identList85=identList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identList85.getTree());
            char_literal86=(Token)match(input,116,FOLLOW_116_in_enumeration2703); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal86_tree = (CommonTree)adaptor.create(char_literal86);
            adaptor.addChild(root_0, char_literal86_tree);
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
    // $ANTLR end "enumeration"

    public static class identList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:401:1: identList : ident ( ',' ident )* ;
    public final SSQSA_M2Parser.identList_return identList() throws RecognitionException {
        SSQSA_M2Parser.identList_return retval = new SSQSA_M2Parser.identList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal88=null;
        SSQSA_M2Parser.ident_return ident87 = null;

        SSQSA_M2Parser.ident_return ident89 = null;


        CommonTree char_literal88_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:401:11: ( ident ( ',' ident )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:402:2: ident ( ',' ident )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_ident_in_identList2717);
            ident87=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ident87.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:402:8: ( ',' ident )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==118) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:402:10: ',' ident
            	    {
            	    char_literal88=(Token)match(input,118,FOLLOW_118_in_identList2721); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal88_tree = (CommonTree)adaptor.create(char_literal88);
            	    adaptor.addChild(root_0, char_literal88_tree);
            	    }
            	    pushFollow(FOLLOW_ident_in_identList2723);
            	    ident89=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident89.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "identList"

    public static class range_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "range"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:409:1: range : '[' ( constExpression DOTDOT | number ) constExpression ']' ;
    public final SSQSA_M2Parser.range_return range() throws RecognitionException {
        SSQSA_M2Parser.range_return retval = new SSQSA_M2Parser.range_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal90=null;
        Token DOTDOT92=null;
        Token char_literal95=null;
        SSQSA_M2Parser.constExpression_return constExpression91 = null;

        SSQSA_M2Parser.number_return number93 = null;

        SSQSA_M2Parser.constExpression_return constExpression94 = null;


        CommonTree char_literal90_tree=null;
        CommonTree DOTDOT92_tree=null;
        CommonTree char_literal95_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:409:7: ( '[' ( constExpression DOTDOT | number ) constExpression ']' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:411:2: '[' ( constExpression DOTDOT | number ) constExpression ']'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal90=(Token)match(input,120,FOLLOW_120_in_range2744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal90_tree = (CommonTree)adaptor.create(char_literal90);
            adaptor.addChild(root_0, char_literal90_tree);
            }
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:411:6: ( constExpression DOTDOT | number )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:411:7: constExpression DOTDOT
                    {
                    pushFollow(FOLLOW_constExpression_in_range2747);
                    constExpression91=constExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression91.getTree());
                    DOTDOT92=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_range2749); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOTDOT92_tree = (CommonTree)adaptor.create(DOTDOT92);
                    adaptor.addChild(root_0, DOTDOT92_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:411:32: number
                    {
                    pushFollow(FOLLOW_number_in_range2753);
                    number93=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number93.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_constExpression_in_range2756);
            constExpression94=constExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression94.getTree());
            char_literal95=(Token)match(input,121,FOLLOW_121_in_range2758); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal95_tree = (CommonTree)adaptor.create(char_literal95);
            adaptor.addChild(root_0, char_literal95_tree);
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
    // $ANTLR end "range"

    public static class arrayType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:416:1: arrayType : 'ARRAY' simpleType ( ',' simpleType )* 'OF' type -> ^( TYPE ^( 'ARRAY' ( simpleType )* ) ^( 'OF' type ) ) ;
    public final SSQSA_M2Parser.arrayType_return arrayType() throws RecognitionException {
        SSQSA_M2Parser.arrayType_return retval = new SSQSA_M2Parser.arrayType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal96=null;
        Token char_literal98=null;
        Token string_literal100=null;
        SSQSA_M2Parser.simpleType_return simpleType97 = null;

        SSQSA_M2Parser.simpleType_return simpleType99 = null;

        SSQSA_M2Parser.type_return type101 = null;


        CommonTree string_literal96_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree string_literal100_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_simpleType=new RewriteRuleSubtreeStream(adaptor,"rule simpleType");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:416:11: ( 'ARRAY' simpleType ( ',' simpleType )* 'OF' type -> ^( TYPE ^( 'ARRAY' ( simpleType )* ) ^( 'OF' type ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:417:2: 'ARRAY' simpleType ( ',' simpleType )* 'OF' type
            {
            string_literal96=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_arrayType2772); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ARRAY.add(string_literal96);

            pushFollow(FOLLOW_simpleType_in_arrayType2774);
            simpleType97=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleType.add(simpleType97.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:417:21: ( ',' simpleType )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==118) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:417:23: ',' simpleType
            	    {
            	    char_literal98=(Token)match(input,118,FOLLOW_118_in_arrayType2778); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_118.add(char_literal98);

            	    pushFollow(FOLLOW_simpleType_in_arrayType2780);
            	    simpleType99=simpleType();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_simpleType.add(simpleType99.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            string_literal100=(Token)match(input,OF,FOLLOW_OF_in_arrayType2785); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(string_literal100);

            pushFollow(FOLLOW_type_in_arrayType2787);
            type101=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type101.getTree());


            // AST REWRITE
            // elements: ARRAY, simpleType, type, OF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 418:9: -> ^( TYPE ^( 'ARRAY' ( simpleType )* ) ^( 'OF' type ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:418:12: ^( TYPE ^( 'ARRAY' ( simpleType )* ) ^( 'OF' type ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:418:19: ^( 'ARRAY' ( simpleType )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_ARRAY.nextNode(), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:418:29: ( simpleType )*
                while ( stream_simpleType.hasNext() ) {
                    adaptor.addChild(root_2, stream_simpleType.nextTree());

                }
                stream_simpleType.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:418:42: ^( 'OF' type )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_OF.nextNode(), root_2);

                adaptor.addChild(root_2, stream_type.nextTree());

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
    // $ANTLR end "arrayType"

    public static class recordType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "recordType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:423:1: recordType : 'RECORD' fieldListSequence ( ';' )? 'END' -> ^( TYPE 'RECORD' fieldListSequence ) ;
    public final SSQSA_M2Parser.recordType_return recordType() throws RecognitionException {
        SSQSA_M2Parser.recordType_return retval = new SSQSA_M2Parser.recordType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal102=null;
        Token char_literal104=null;
        Token string_literal105=null;
        SSQSA_M2Parser.fieldListSequence_return fieldListSequence103 = null;


        CommonTree string_literal102_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree string_literal105_tree=null;
        RewriteRuleTokenStream stream_RECORD=new RewriteRuleTokenStream(adaptor,"token RECORD");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_fieldListSequence=new RewriteRuleSubtreeStream(adaptor,"rule fieldListSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:423:12: ( 'RECORD' fieldListSequence ( ';' )? 'END' -> ^( TYPE 'RECORD' fieldListSequence ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:424:2: 'RECORD' fieldListSequence ( ';' )? 'END'
            {
            string_literal102=(Token)match(input,RECORD,FOLLOW_RECORD_in_recordType2827); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RECORD.add(string_literal102);

            pushFollow(FOLLOW_fieldListSequence_in_recordType2829);
            fieldListSequence103=fieldListSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldListSequence.add(fieldListSequence103.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:424:29: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==122) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:424:30: ';'
                    {
                    char_literal104=(Token)match(input,122,FOLLOW_122_in_recordType2832); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal104);


                    }
                    break;

            }

            string_literal105=(Token)match(input,END,FOLLOW_END_in_recordType2836); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal105);



            // AST REWRITE
            // elements: fieldListSequence, RECORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 425:2: -> ^( TYPE 'RECORD' fieldListSequence )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:425:5: ^( TYPE 'RECORD' fieldListSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                adaptor.addChild(root_1, stream_RECORD.nextNode());
                adaptor.addChild(root_1, stream_fieldListSequence.nextTree());

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
    // $ANTLR end "recordType"

    public static class fieldListSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldListSequence"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:430:1: fieldListSequence : fieldList ( ';' fieldList )* -> ( fieldList )+ ;
    public final SSQSA_M2Parser.fieldListSequence_return fieldListSequence() throws RecognitionException {
        SSQSA_M2Parser.fieldListSequence_return retval = new SSQSA_M2Parser.fieldListSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal107=null;
        SSQSA_M2Parser.fieldList_return fieldList106 = null;

        SSQSA_M2Parser.fieldList_return fieldList108 = null;


        CommonTree char_literal107_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_fieldList=new RewriteRuleSubtreeStream(adaptor,"rule fieldList");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:430:19: ( fieldList ( ';' fieldList )* -> ( fieldList )+ )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:431:2: fieldList ( ';' fieldList )*
            {
            pushFollow(FOLLOW_fieldList_in_fieldListSequence2860);
            fieldList106=fieldList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fieldList.add(fieldList106.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:431:12: ( ';' fieldList )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==122) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==CASE||LA25_1==IDENT) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:431:14: ';' fieldList
            	    {
            	    char_literal107=(Token)match(input,122,FOLLOW_122_in_fieldListSequence2864); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_122.add(char_literal107);

            	    pushFollow(FOLLOW_fieldList_in_fieldListSequence2866);
            	    fieldList108=fieldList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_fieldList.add(fieldList108.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);



            // AST REWRITE
            // elements: fieldList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 431:31: -> ( fieldList )+
            {
                if ( !(stream_fieldList.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fieldList.hasNext() ) {
                    adaptor.addChild(root_0, stream_fieldList.nextTree());

                }
                stream_fieldList.reset();

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
    // $ANTLR end "fieldListSequence"

    public static class fieldList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fieldList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:438:1: fieldList : ( identList ':' type -> identList ':' type | 'CASE' ( ( ident )? ':' )? qualident 'OF' variant ( ';' )? ( '|' variant ( ';' )? )* ( 'ELSE' fieldListSequence )? ( ';' )? 'END' -> ^( BRANCH_STATEMENT ^( 'CASE' ( ( ident )? ':' )? qualident 'OF' ( ^( BRANCH variant ) )+ ( ^( BRANCH 'ELSE' fieldListSequence ) )? 'END' ) ) );
    public final SSQSA_M2Parser.fieldList_return fieldList() throws RecognitionException {
        SSQSA_M2Parser.fieldList_return retval = new SSQSA_M2Parser.fieldList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal110=null;
        Token string_literal112=null;
        Token char_literal114=null;
        Token string_literal116=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal121=null;
        Token string_literal122=null;
        Token char_literal124=null;
        Token string_literal125=null;
        SSQSA_M2Parser.identList_return identList109 = null;

        SSQSA_M2Parser.type_return type111 = null;

        SSQSA_M2Parser.ident_return ident113 = null;

        SSQSA_M2Parser.qualident_return qualident115 = null;

        SSQSA_M2Parser.variant_return variant117 = null;

        SSQSA_M2Parser.variant_return variant120 = null;

        SSQSA_M2Parser.fieldListSequence_return fieldListSequence123 = null;


        CommonTree char_literal110_tree=null;
        CommonTree string_literal112_tree=null;
        CommonTree char_literal114_tree=null;
        CommonTree string_literal116_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree char_literal121_tree=null;
        CommonTree string_literal122_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree string_literal125_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_identList=new RewriteRuleSubtreeStream(adaptor,"rule identList");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_fieldListSequence=new RewriteRuleSubtreeStream(adaptor,"rule fieldListSequence");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        RewriteRuleSubtreeStream stream_variant=new RewriteRuleSubtreeStream(adaptor,"rule variant");
        RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:438:11: ( identList ':' type -> identList ':' type | 'CASE' ( ( ident )? ':' )? qualident 'OF' variant ( ';' )? ( '|' variant ( ';' )? )* ( 'ELSE' fieldListSequence )? ( ';' )? 'END' -> ^( BRANCH_STATEMENT ^( 'CASE' ( ( ident )? ':' )? qualident 'OF' ( ^( BRANCH variant ) )+ ( ^( BRANCH 'ELSE' fieldListSequence ) )? 'END' ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==IDENT) ) {
                alt33=1;
            }
            else if ( (LA33_0==CASE) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:439:2: identList ':' type
                    {
                    pushFollow(FOLLOW_identList_in_fieldList2891);
                    identList109=identList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identList.add(identList109.getTree());
                    char_literal110=(Token)match(input,123,FOLLOW_123_in_fieldList2893); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal110);

                    pushFollow(FOLLOW_type_in_fieldList2895);
                    type111=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type111.getTree());


                    // AST REWRITE
                    // elements: identList, type, 123
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 439:22: -> identList ':' type
                    {
                        adaptor.addChild(root_0, stream_identList.nextTree());
                        adaptor.addChild(root_0, stream_123.nextNode());
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:2: 'CASE' ( ( ident )? ':' )? qualident 'OF' variant ( ';' )? ( '|' variant ( ';' )? )* ( 'ELSE' fieldListSequence )? ( ';' )? 'END'
                    {
                    string_literal112=(Token)match(input,CASE,FOLLOW_CASE_in_fieldList2909); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CASE.add(string_literal112);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:10: ( ( ident )? ':' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==IDENT) ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1==123) ) {
                            alt27=1;
                        }
                    }
                    else if ( (LA27_0==123) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:11: ( ident )? ':'
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:11: ( ident )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==IDENT) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:13: ident
                                    {
                                    pushFollow(FOLLOW_ident_in_fieldList2915);
                                    ident113=ident();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_ident.add(ident113.getTree());

                                    }
                                    break;

                            }

                            char_literal114=(Token)match(input,123,FOLLOW_123_in_fieldList2920); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_123.add(char_literal114);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualident_in_fieldList2924);
                    qualident115=qualident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualident.add(qualident115.getTree());
                    string_literal116=(Token)match(input,OF,FOLLOW_OF_in_fieldList2926); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OF.add(string_literal116);

                    pushFollow(FOLLOW_variant_in_fieldList2928);
                    variant117=variant();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_variant.add(variant117.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:51: ( ';' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==122) ) {
                        int LA28_1 = input.LA(2);

                        if ( (synpred50_SSQSA_M2()) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:52: ';'
                            {
                            char_literal118=(Token)match(input,122,FOLLOW_122_in_fieldList2931); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_122.add(char_literal118);


                            }
                            break;

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:58: ( '|' variant ( ';' )? )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==124) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:60: '|' variant ( ';' )?
                    	    {
                    	    char_literal119=(Token)match(input,124,FOLLOW_124_in_fieldList2937); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_124.add(char_literal119);

                    	    pushFollow(FOLLOW_variant_in_fieldList2939);
                    	    variant120=variant();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variant.add(variant120.getTree());
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:72: ( ';' )?
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==122) ) {
                    	        int LA29_1 = input.LA(2);

                    	        if ( (synpred51_SSQSA_M2()) ) {
                    	            alt29=1;
                    	        }
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:73: ';'
                    	            {
                    	            char_literal121=(Token)match(input,122,FOLLOW_122_in_fieldList2942); if (state.failed) return retval; 
                    	            if ( state.backtracking==0 ) stream_122.add(char_literal121);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:441:2: ( 'ELSE' fieldListSequence )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==ELSE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:441:4: 'ELSE' fieldListSequence
                            {
                            string_literal122=(Token)match(input,ELSE,FOLLOW_ELSE_in_fieldList2954); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_ELSE.add(string_literal122);

                            pushFollow(FOLLOW_fieldListSequence_in_fieldList2956);
                            fieldListSequence123=fieldListSequence();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fieldListSequence.add(fieldListSequence123.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:441:32: ( ';' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==122) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:441:33: ';'
                            {
                            char_literal124=(Token)match(input,122,FOLLOW_122_in_fieldList2962); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_122.add(char_literal124);


                            }
                            break;

                    }

                    string_literal125=(Token)match(input,END,FOLLOW_END_in_fieldList2967); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_END.add(string_literal125);



                    // AST REWRITE
                    // elements: OF, fieldListSequence, END, ELSE, variant, qualident, CASE, 123, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 443:2: -> ^( BRANCH_STATEMENT ^( 'CASE' ( ( ident )? ':' )? qualident 'OF' ( ^( BRANCH variant ) )+ ( ^( BRANCH 'ELSE' fieldListSequence ) )? 'END' ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:444:2: ^( BRANCH_STATEMENT ^( 'CASE' ( ( ident )? ':' )? qualident 'OF' ( ^( BRANCH variant ) )+ ( ^( BRANCH 'ELSE' fieldListSequence ) )? 'END' ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:445:3: ^( 'CASE' ( ( ident )? ':' )? qualident 'OF' ( ^( BRANCH variant ) )+ ( ^( BRANCH 'ELSE' fieldListSequence ) )? 'END' )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot(stream_CASE.nextNode(), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:445:12: ( ( ident )? ':' )?
                        if ( stream_123.hasNext()||stream_ident.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:445:13: ( ident )?
                            if ( stream_ident.hasNext() ) {
                                adaptor.addChild(root_2, stream_ident.nextTree());

                            }
                            stream_ident.reset();
                            adaptor.addChild(root_2, stream_123.nextNode());

                        }
                        stream_123.reset();
                        stream_ident.reset();
                        adaptor.addChild(root_2, stream_qualident.nextTree());
                        adaptor.addChild(root_2, stream_OF.nextNode());
                        if ( !(stream_variant.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variant.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:446:4: ^( BRANCH variant )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_3);

                            adaptor.addChild(root_3, stream_variant.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_variant.reset();
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:447:4: ( ^( BRANCH 'ELSE' fieldListSequence ) )?
                        if ( stream_fieldListSequence.hasNext()||stream_ELSE.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:447:4: ^( BRANCH 'ELSE' fieldListSequence )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_3);

                            adaptor.addChild(root_3, stream_ELSE.nextNode());
                            adaptor.addChild(root_3, stream_fieldListSequence.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_fieldListSequence.reset();
                        stream_ELSE.reset();
                        adaptor.addChild(root_2, stream_END.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

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
    // $ANTLR end "fieldList"

    public static class variant_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variant"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:457:1: variant : ( caseLabelList ':' fieldListSequence )? ;
    public final SSQSA_M2Parser.variant_return variant() throws RecognitionException {
        SSQSA_M2Parser.variant_return retval = new SSQSA_M2Parser.variant_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal127=null;
        SSQSA_M2Parser.caseLabelList_return caseLabelList126 = null;

        SSQSA_M2Parser.fieldListSequence_return fieldListSequence128 = null;


        CommonTree char_literal127_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:457:9: ( ( caseLabelList ':' fieldListSequence )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:458:2: ( caseLabelList ':' fieldListSequence )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:458:2: ( caseLabelList ':' fieldListSequence )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==NOT||LA34_0==LOGICAL_NOT_OP||(LA34_0>=PLUS_OP && LA34_0<=MINUS_OP)||(LA34_0>=IDENT && LA34_0<=REAL)||LA34_0==STRING||LA34_0==115||LA34_0==117) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:458:5: caseLabelList ':' fieldListSequence
                    {
                    pushFollow(FOLLOW_caseLabelList_in_variant3052);
                    caseLabelList126=caseLabelList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, caseLabelList126.getTree());
                    char_literal127=(Token)match(input,123,FOLLOW_123_in_variant3054); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal127_tree = (CommonTree)adaptor.create(char_literal127);
                    adaptor.addChild(root_0, char_literal127_tree);
                    }
                    pushFollow(FOLLOW_fieldListSequence_in_variant3056);
                    fieldListSequence128=fieldListSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, fieldListSequence128.getTree());

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
    // $ANTLR end "variant"

    public static class caseLabelList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseLabelList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:463:1: caseLabelList : caseLabels ( ',' caseLabels )* -> ( caseLabels )* ;
    public final SSQSA_M2Parser.caseLabelList_return caseLabelList() throws RecognitionException {
        SSQSA_M2Parser.caseLabelList_return retval = new SSQSA_M2Parser.caseLabelList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal130=null;
        SSQSA_M2Parser.caseLabels_return caseLabels129 = null;

        SSQSA_M2Parser.caseLabels_return caseLabels131 = null;


        CommonTree char_literal130_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_caseLabels=new RewriteRuleSubtreeStream(adaptor,"rule caseLabels");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:463:15: ( caseLabels ( ',' caseLabels )* -> ( caseLabels )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:464:2: caseLabels ( ',' caseLabels )*
            {
            pushFollow(FOLLOW_caseLabels_in_caseLabelList3073);
            caseLabels129=caseLabels();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_caseLabels.add(caseLabels129.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:464:13: ( ',' caseLabels )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==118) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:464:15: ',' caseLabels
            	    {
            	    char_literal130=(Token)match(input,118,FOLLOW_118_in_caseLabelList3077); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_118.add(char_literal130);

            	    pushFollow(FOLLOW_caseLabels_in_caseLabelList3079);
            	    caseLabels131=caseLabels();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_caseLabels.add(caseLabels131.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);



            // AST REWRITE
            // elements: caseLabels
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 464:33: -> ( caseLabels )*
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:464:36: ( caseLabels )*
                while ( stream_caseLabels.hasNext() ) {
                    adaptor.addChild(root_0, stream_caseLabels.nextTree());

                }
                stream_caseLabels.reset();

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
    // $ANTLR end "caseLabelList"

    public static class caseLabels_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseLabels"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:469:1: caseLabels : constExpression ( ( '..' )? constExpression )? ;
    public final SSQSA_M2Parser.caseLabels_return caseLabels() throws RecognitionException {
        SSQSA_M2Parser.caseLabels_return retval = new SSQSA_M2Parser.caseLabels_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal133=null;
        SSQSA_M2Parser.constExpression_return constExpression132 = null;

        SSQSA_M2Parser.constExpression_return constExpression134 = null;


        CommonTree string_literal133_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:469:12: ( constExpression ( ( '..' )? constExpression )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:470:2: constExpression ( ( '..' )? constExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_constExpression_in_caseLabels3100);
            constExpression132=constExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression132.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:470:18: ( ( '..' )? constExpression )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==NOT||LA37_0==LOGICAL_NOT_OP||(LA37_0>=PLUS_OP && LA37_0<=MINUS_OP)||LA37_0==DOTDOT||(LA37_0>=IDENT && LA37_0<=REAL)||LA37_0==STRING||LA37_0==115||LA37_0==117) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:470:20: ( '..' )? constExpression
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:470:20: ( '..' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==DOTDOT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:470:21: '..'
                            {
                            string_literal133=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_caseLabels3105); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal133_tree = (CommonTree)adaptor.create(string_literal133);
                            adaptor.addChild(root_0, string_literal133_tree);
                            }

                            }
                            break;

                    }

                    pushFollow(FOLLOW_constExpression_in_caseLabels3109);
                    constExpression134=constExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression134.getTree());

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
    // $ANTLR end "caseLabels"

    public static class setType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:475:1: setType : 'SET' 'OF' simpleType -> ^( TYPE ^( 'SET' 'OF' ) simpleType ) ;
    public final SSQSA_M2Parser.setType_return setType() throws RecognitionException {
        SSQSA_M2Parser.setType_return retval = new SSQSA_M2Parser.setType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal135=null;
        Token string_literal136=null;
        SSQSA_M2Parser.simpleType_return simpleType137 = null;


        CommonTree string_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        RewriteRuleTokenStream stream_SET=new RewriteRuleTokenStream(adaptor,"token SET");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleSubtreeStream stream_simpleType=new RewriteRuleSubtreeStream(adaptor,"rule simpleType");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:475:9: ( 'SET' 'OF' simpleType -> ^( TYPE ^( 'SET' 'OF' ) simpleType ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:476:2: 'SET' 'OF' simpleType
            {
            string_literal135=(Token)match(input,SET,FOLLOW_SET_in_setType3125); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_SET.add(string_literal135);

            string_literal136=(Token)match(input,OF,FOLLOW_OF_in_setType3127); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(string_literal136);

            pushFollow(FOLLOW_simpleType_in_setType3129);
            simpleType137=simpleType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_simpleType.add(simpleType137.getTree());


            // AST REWRITE
            // elements: OF, SET, simpleType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 477:2: -> ^( TYPE ^( 'SET' 'OF' ) simpleType )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:477:5: ^( TYPE ^( 'SET' 'OF' ) simpleType )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:477:12: ^( 'SET' 'OF' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_SET.nextNode(), root_2);

                adaptor.addChild(root_2, stream_OF.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_simpleType.nextTree());

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
    // $ANTLR end "setType"

    public static class pointerType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pointerType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:482:1: pointerType : 'POINTER' 'TO' type -> ^( TYPE ^( 'POINTER' 'TO' ) type ) ;
    public final SSQSA_M2Parser.pointerType_return pointerType() throws RecognitionException {
        SSQSA_M2Parser.pointerType_return retval = new SSQSA_M2Parser.pointerType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal138=null;
        Token string_literal139=null;
        SSQSA_M2Parser.type_return type140 = null;


        CommonTree string_literal138_tree=null;
        CommonTree string_literal139_tree=null;
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_POINTER=new RewriteRuleTokenStream(adaptor,"token POINTER");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:482:13: ( 'POINTER' 'TO' type -> ^( TYPE ^( 'POINTER' 'TO' ) type ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:483:2: 'POINTER' 'TO' type
            {
            string_literal138=(Token)match(input,POINTER,FOLLOW_POINTER_in_pointerType3157); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_POINTER.add(string_literal138);

            string_literal139=(Token)match(input,TO,FOLLOW_TO_in_pointerType3159); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TO.add(string_literal139);

            pushFollow(FOLLOW_type_in_pointerType3161);
            type140=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type140.getTree());


            // AST REWRITE
            // elements: TO, POINTER, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 484:2: -> ^( TYPE ^( 'POINTER' 'TO' ) type )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:484:5: ^( TYPE ^( 'POINTER' 'TO' ) type )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:484:12: ^( 'POINTER' 'TO' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_POINTER.nextNode(), root_2);

                adaptor.addChild(root_2, stream_TO.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_type.nextTree());

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
    // $ANTLR end "pointerType"

    public static class procedureType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:489:1: procedureType : 'PROCEDURE' ( formalTypeList )? ( ':' formalType )? -> ^( TYPE ^( 'PROCEDURE' ( formalTypeList )? ) ( formalType )? ) ;
    public final SSQSA_M2Parser.procedureType_return procedureType() throws RecognitionException {
        SSQSA_M2Parser.procedureType_return retval = new SSQSA_M2Parser.procedureType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal141=null;
        Token char_literal143=null;
        SSQSA_M2Parser.formalTypeList_return formalTypeList142 = null;

        SSQSA_M2Parser.formalType_return formalType144 = null;


        CommonTree string_literal141_tree=null;
        CommonTree char_literal143_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_formalTypeList=new RewriteRuleSubtreeStream(adaptor,"rule formalTypeList");
        RewriteRuleSubtreeStream stream_formalType=new RewriteRuleSubtreeStream(adaptor,"rule formalType");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:489:15: ( 'PROCEDURE' ( formalTypeList )? ( ':' formalType )? -> ^( TYPE ^( 'PROCEDURE' ( formalTypeList )? ) ( formalType )? ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:490:2: 'PROCEDURE' ( formalTypeList )? ( ':' formalType )?
            {
            string_literal141=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureType3189); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PROCEDURE.add(string_literal141);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:490:14: ( formalTypeList )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==115) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:490:16: formalTypeList
                    {
                    pushFollow(FOLLOW_formalTypeList_in_procedureType3193);
                    formalTypeList142=formalTypeList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalTypeList.add(formalTypeList142.getTree());

                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:490:34: ( ':' formalType )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==123) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:490:35: ':' formalType
                    {
                    char_literal143=(Token)match(input,123,FOLLOW_123_in_procedureType3199); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal143);

                    pushFollow(FOLLOW_formalType_in_procedureType3201);
                    formalType144=formalType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formalType.add(formalType144.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: formalType, formalTypeList, PROCEDURE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 491:2: -> ^( TYPE ^( 'PROCEDURE' ( formalTypeList )? ) ( formalType )? )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:491:5: ^( TYPE ^( 'PROCEDURE' ( formalTypeList )? ) ( formalType )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:491:12: ^( 'PROCEDURE' ( formalTypeList )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_PROCEDURE.nextNode(), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:491:26: ( formalTypeList )?
                if ( stream_formalTypeList.hasNext() ) {
                    adaptor.addChild(root_2, stream_formalTypeList.nextTree());

                }
                stream_formalTypeList.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:491:43: ( formalType )?
                if ( stream_formalType.hasNext() ) {
                    adaptor.addChild(root_1, stream_formalType.nextTree());

                }
                stream_formalType.reset();

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
    // $ANTLR end "procedureType"

    public static class formalTypeList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalTypeList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:510:1: formalTypeList : ( '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' -> ^( TYPE ( formalType )* ) | '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' ( ':' ident ( '.' ident )* )? -> ^( TYPE ( formalType )* ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ) );
    public final SSQSA_M2Parser.formalTypeList_return formalTypeList() throws RecognitionException {
        SSQSA_M2Parser.formalTypeList_return retval = new SSQSA_M2Parser.formalTypeList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal145=null;
        Token string_literal146=null;
        Token char_literal148=null;
        Token string_literal149=null;
        Token char_literal151=null;
        Token char_literal152=null;
        Token string_literal153=null;
        Token char_literal155=null;
        Token string_literal156=null;
        Token char_literal158=null;
        Token char_literal159=null;
        Token char_literal161=null;
        SSQSA_M2Parser.formalType_return formalType147 = null;

        SSQSA_M2Parser.formalType_return formalType150 = null;

        SSQSA_M2Parser.formalType_return formalType154 = null;

        SSQSA_M2Parser.formalType_return formalType157 = null;

        SSQSA_M2Parser.ident_return ident160 = null;

        SSQSA_M2Parser.ident_return ident162 = null;


        CommonTree char_literal145_tree=null;
        CommonTree string_literal146_tree=null;
        CommonTree char_literal148_tree=null;
        CommonTree string_literal149_tree=null;
        CommonTree char_literal151_tree=null;
        CommonTree char_literal152_tree=null;
        CommonTree string_literal153_tree=null;
        CommonTree char_literal155_tree=null;
        CommonTree string_literal156_tree=null;
        CommonTree char_literal158_tree=null;
        CommonTree char_literal159_tree=null;
        CommonTree char_literal161_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalType=new RewriteRuleSubtreeStream(adaptor,"rule formalType");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:510:16: ( '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' -> ^( TYPE ( formalType )* ) | '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' ( ':' ident ( '.' ident )* )? -> ^( TYPE ( formalType )* ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ) )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:511:2: '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')'
                    {
                    char_literal145=(Token)match(input,115,FOLLOW_115_in_formalTypeList3238); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal145);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:7: ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==ARRAY||LA43_0==VAR||LA43_0==IDENT) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:9: ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )*
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:9: ( 'VAR' )?
                            int alt40=2;
                            int LA40_0 = input.LA(1);

                            if ( (LA40_0==VAR) ) {
                                alt40=1;
                            }
                            switch (alt40) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:10: 'VAR'
                                    {
                                    string_literal146=(Token)match(input,VAR,FOLLOW_VAR_in_formalTypeList3250); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_VAR.add(string_literal146);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_formalType_in_formalTypeList3254);
                            formalType147=formalType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalType.add(formalType147.getTree());
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:9: ( ',' ( 'VAR' )? formalType )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==118) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:11: ',' ( 'VAR' )? formalType
                            	    {
                            	    char_literal148=(Token)match(input,118,FOLLOW_118_in_formalTypeList3267); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_118.add(char_literal148);

                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:15: ( 'VAR' )?
                            	    int alt41=2;
                            	    int LA41_0 = input.LA(1);

                            	    if ( (LA41_0==VAR) ) {
                            	        alt41=1;
                            	    }
                            	    switch (alt41) {
                            	        case 1 :
                            	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:17: 'VAR'
                            	            {
                            	            string_literal149=(Token)match(input,VAR,FOLLOW_VAR_in_formalTypeList3271); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_VAR.add(string_literal149);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_formalType_in_formalTypeList3276);
                            	    formalType150=formalType();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_formalType.add(formalType150.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal151=(Token)match(input,116,FOLLOW_116_in_formalTypeList3292); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(char_literal151);



                    // AST REWRITE
                    // elements: formalType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 516:2: -> ^( TYPE ( formalType )* )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:516:5: ^( TYPE ( formalType )* )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:516:12: ( formalType )*
                        while ( stream_formalType.hasNext() ) {
                            adaptor.addChild(root_1, stream_formalType.nextTree());

                        }
                        stream_formalType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:518:2: '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' ( ':' ident ( '.' ident )* )?
                    {
                    char_literal152=(Token)match(input,115,FOLLOW_115_in_formalTypeList3309); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal152);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:519:7: ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==ARRAY||LA47_0==VAR||LA47_0==IDENT) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:519:9: ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )*
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:519:9: ( 'VAR' )?
                            int alt44=2;
                            int LA44_0 = input.LA(1);

                            if ( (LA44_0==VAR) ) {
                                alt44=1;
                            }
                            switch (alt44) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:519:10: 'VAR'
                                    {
                                    string_literal153=(Token)match(input,VAR,FOLLOW_VAR_in_formalTypeList3321); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_VAR.add(string_literal153);


                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_formalType_in_formalTypeList3325);
                            formalType154=formalType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formalType.add(formalType154.getTree());
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:520:9: ( ',' ( 'VAR' )? formalType )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==118) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:520:11: ',' ( 'VAR' )? formalType
                            	    {
                            	    char_literal155=(Token)match(input,118,FOLLOW_118_in_formalTypeList3338); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_118.add(char_literal155);

                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:520:15: ( 'VAR' )?
                            	    int alt45=2;
                            	    int LA45_0 = input.LA(1);

                            	    if ( (LA45_0==VAR) ) {
                            	        alt45=1;
                            	    }
                            	    switch (alt45) {
                            	        case 1 :
                            	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:520:17: 'VAR'
                            	            {
                            	            string_literal156=(Token)match(input,VAR,FOLLOW_VAR_in_formalTypeList3342); if (state.failed) return retval; 
                            	            if ( state.backtracking==0 ) stream_VAR.add(string_literal156);


                            	            }
                            	            break;

                            	    }

                            	    pushFollow(FOLLOW_formalType_in_formalTypeList3347);
                            	    formalType157=formalType();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_formalType.add(formalType157.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal158=(Token)match(input,116,FOLLOW_116_in_formalTypeList3363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(char_literal158);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:2: ( ':' ident ( '.' ident )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==123) ) {
                        int LA49_1 = input.LA(2);

                        if ( (LA49_1==IDENT) ) {
                            int LA49_3 = input.LA(3);

                            if ( (synpred71_SSQSA_M2()) ) {
                                alt49=1;
                            }
                        }
                    }
                    switch (alt49) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:4: ':' ident ( '.' ident )*
                            {
                            char_literal159=(Token)match(input,123,FOLLOW_123_in_formalTypeList3368); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_123.add(char_literal159);

                            pushFollow(FOLLOW_ident_in_formalTypeList3370);
                            ident160=ident();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ident.add(ident160.getTree());
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:14: ( '.' ident )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==DOT) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:16: '.' ident
                            	    {
                            	    char_literal161=(Token)match(input,DOT,FOLLOW_DOT_in_formalTypeList3374); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_DOT.add(char_literal161);

                            	    pushFollow(FOLLOW_ident_in_formalTypeList3376);
                            	    ident162=ident();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_ident.add(ident162.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: DOT, ident, ident, formalType
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 524:2: -> ^( TYPE ( formalType )* ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:524:5: ^( TYPE ( formalType )* ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:524:12: ( formalType )*
                        while ( stream_formalType.hasNext() ) {
                            adaptor.addChild(root_1, stream_formalType.nextTree());

                        }
                        stream_formalType.reset();
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:524:24: ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:524:37: ( ^( SEPARATOR '.' ident ) )*
                        while ( stream_DOT.hasNext()||stream_ident.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:524:37: ^( SEPARATOR '.' ident )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                            adaptor.addChild(root_3, stream_DOT.nextNode());
                            adaptor.addChild(root_3, stream_ident.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_DOT.reset();
                        stream_ident.reset();

                        adaptor.addChild(root_1, root_2);
                        }

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
    // $ANTLR end "formalTypeList"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:531:1: variableDeclaration : ident ( machineAddress )? ( ',' ident ( machineAddress )? )* ':' type -> ( ^( ATTRIBUTE_DECL ^( NAME ident ) type ) )* ;
    public final SSQSA_M2Parser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        SSQSA_M2Parser.variableDeclaration_return retval = new SSQSA_M2Parser.variableDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal165=null;
        Token char_literal168=null;
        SSQSA_M2Parser.ident_return ident163 = null;

        SSQSA_M2Parser.machineAddress_return machineAddress164 = null;

        SSQSA_M2Parser.ident_return ident166 = null;

        SSQSA_M2Parser.machineAddress_return machineAddress167 = null;

        SSQSA_M2Parser.type_return type169 = null;


        CommonTree char_literal165_tree=null;
        CommonTree char_literal168_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_machineAddress=new RewriteRuleSubtreeStream(adaptor,"rule machineAddress");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:531:21: ( ident ( machineAddress )? ( ',' ident ( machineAddress )? )* ':' type -> ( ^( ATTRIBUTE_DECL ^( NAME ident ) type ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:532:2: ident ( machineAddress )? ( ',' ident ( machineAddress )? )* ':' type
            {
            pushFollow(FOLLOW_ident_in_variableDeclaration3423);
            ident163=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident163.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:532:8: ( machineAddress )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==120) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: machineAddress
                    {
                    pushFollow(FOLLOW_machineAddress_in_variableDeclaration3425);
                    machineAddress164=machineAddress();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_machineAddress.add(machineAddress164.getTree());

                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:532:24: ( ',' ident ( machineAddress )? )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==118) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:532:26: ',' ident ( machineAddress )?
            	    {
            	    char_literal165=(Token)match(input,118,FOLLOW_118_in_variableDeclaration3430); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_118.add(char_literal165);

            	    pushFollow(FOLLOW_ident_in_variableDeclaration3432);
            	    ident166=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident166.getTree());
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:532:36: ( machineAddress )?
            	    int alt52=2;
            	    int LA52_0 = input.LA(1);

            	    if ( (LA52_0==120) ) {
            	        alt52=1;
            	    }
            	    switch (alt52) {
            	        case 1 :
            	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: machineAddress
            	            {
            	            pushFollow(FOLLOW_machineAddress_in_variableDeclaration3434);
            	            machineAddress167=machineAddress();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_machineAddress.add(machineAddress167.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            char_literal168=(Token)match(input,123,FOLLOW_123_in_variableDeclaration3439); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal168);

            pushFollow(FOLLOW_type_in_variableDeclaration3441);
            type169=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type169.getTree());


            // AST REWRITE
            // elements: type, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 533:2: -> ( ^( ATTRIBUTE_DECL ^( NAME ident ) type ) )*
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:533:5: ( ^( ATTRIBUTE_DECL ^( NAME ident ) type ) )*
                while ( stream_type.hasNext()||stream_ident.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:533:6: ^( ATTRIBUTE_DECL ^( NAME ident ) type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ATTRIBUTE_DECL, "ATTRIBUTE_DECL"), root_1);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:533:23: ^( NAME ident )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_ident.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_ident.reset();

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
    // $ANTLR end "variableDeclaration"

    public static class designatorTails_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "designatorTails"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:548:1: designatorTails : ( designatorTail )+ ;
    public final SSQSA_M2Parser.designatorTails_return designatorTails() throws RecognitionException {
        SSQSA_M2Parser.designatorTails_return retval = new SSQSA_M2Parser.designatorTails_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.designatorTail_return designatorTail170 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:548:17: ( ( designatorTail )+ )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:549:3: ( designatorTail )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:549:3: ( designatorTail )+
            int cnt54=0;
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==POINTER_OP||LA54_0==120) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: designatorTail
            	    {
            	    pushFollow(FOLLOW_designatorTail_in_designatorTails3487);
            	    designatorTail170=designatorTail();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, designatorTail170.getTree());

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
    // $ANTLR end "designatorTails"

    public static class designatorTail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "designatorTail"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:552:1: designatorTail : ( '[' expList ']' ( '.' ident )* -> ^( SEPARATOR '[' ) expList ^( SEPARATOR ']' ) ( ^( SEPARATOR '.' ) ident )* | '^' ( '.' ident )* -> ^( SEPARATOR '^' ) ( ^( SEPARATOR '.' ) ident )* );
    public final SSQSA_M2Parser.designatorTail_return designatorTail() throws RecognitionException {
        SSQSA_M2Parser.designatorTail_return retval = new SSQSA_M2Parser.designatorTail_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal177=null;
        SSQSA_M2Parser.expList_return expList172 = null;

        SSQSA_M2Parser.ident_return ident175 = null;

        SSQSA_M2Parser.ident_return ident178 = null;


        CommonTree char_literal171_tree=null;
        CommonTree char_literal173_tree=null;
        CommonTree char_literal174_tree=null;
        CommonTree char_literal176_tree=null;
        CommonTree char_literal177_tree=null;
        RewriteRuleTokenStream stream_121=new RewriteRuleTokenStream(adaptor,"token 121");
        RewriteRuleTokenStream stream_POINTER_OP=new RewriteRuleTokenStream(adaptor,"token POINTER_OP");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_120=new RewriteRuleTokenStream(adaptor,"token 120");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_expList=new RewriteRuleSubtreeStream(adaptor,"rule expList");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:552:15: ( '[' expList ']' ( '.' ident )* -> ^( SEPARATOR '[' ) expList ^( SEPARATOR ']' ) ( ^( SEPARATOR '.' ) ident )* | '^' ( '.' ident )* -> ^( SEPARATOR '^' ) ( ^( SEPARATOR '.' ) ident )* )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==120) ) {
                alt57=1;
            }
            else if ( (LA57_0==POINTER_OP) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:553:4: '[' expList ']' ( '.' ident )*
                    {
                    char_literal171=(Token)match(input,120,FOLLOW_120_in_designatorTail3502); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_120.add(char_literal171);

                    pushFollow(FOLLOW_expList_in_designatorTail3504);
                    expList172=expList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expList.add(expList172.getTree());
                    char_literal173=(Token)match(input,121,FOLLOW_121_in_designatorTail3506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_121.add(char_literal173);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:553:20: ( '.' ident )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==DOT) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:553:22: '.' ident
                    	    {
                    	    char_literal174=(Token)match(input,DOT,FOLLOW_DOT_in_designatorTail3510); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal174);

                    	    pushFollow(FOLLOW_ident_in_designatorTail3512);
                    	    ident175=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ident.add(ident175.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: expList, ident, 121, 120, DOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 553:35: -> ^( SEPARATOR '[' ) expList ^( SEPARATOR ']' ) ( ^( SEPARATOR '.' ) ident )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:553:38: ^( SEPARATOR '[' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_120.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_expList.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:553:63: ^( SEPARATOR ']' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_121.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:553:80: ( ^( SEPARATOR '.' ) ident )*
                        while ( stream_ident.hasNext()||stream_DOT.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:553:82: ^( SEPARATOR '.' )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                            adaptor.addChild(root_1, stream_DOT.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }
                            adaptor.addChild(root_0, stream_ident.nextTree());

                        }
                        stream_ident.reset();
                        stream_DOT.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:554:4: '^' ( '.' ident )*
                    {
                    char_literal176=(Token)match(input,POINTER_OP,FOLLOW_POINTER_OP_in_designatorTail3550); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_POINTER_OP.add(char_literal176);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:554:8: ( '.' ident )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==DOT) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:554:10: '.' ident
                    	    {
                    	    char_literal177=(Token)match(input,DOT,FOLLOW_DOT_in_designatorTail3554); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal177);

                    	    pushFollow(FOLLOW_ident_in_designatorTail3556);
                    	    ident178=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ident.add(ident178.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: DOT, POINTER_OP, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 554:23: -> ^( SEPARATOR '^' ) ( ^( SEPARATOR '.' ) ident )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:554:26: ^( SEPARATOR '^' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_POINTER_OP.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:554:43: ( ^( SEPARATOR '.' ) ident )*
                        while ( stream_DOT.hasNext()||stream_ident.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:554:45: ^( SEPARATOR '.' )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                            adaptor.addChild(root_1, stream_DOT.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }
                            adaptor.addChild(root_0, stream_ident.nextTree());

                        }
                        stream_DOT.reset();
                        stream_ident.reset();

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
    // $ANTLR end "designatorTail"

    public static class expList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:569:1: expList : expression ( ',' expression )* ;
    public final SSQSA_M2Parser.expList_return expList() throws RecognitionException {
        SSQSA_M2Parser.expList_return retval = new SSQSA_M2Parser.expList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal180=null;
        SSQSA_M2Parser.expression_return expression179 = null;

        SSQSA_M2Parser.expression_return expression181 = null;


        CommonTree char_literal180_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:569:9: ( expression ( ',' expression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:570:2: expression ( ',' expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expList3606);
            expression179=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression179.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:570:13: ( ',' expression )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==118) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:570:15: ',' expression
            	    {
            	    char_literal180=(Token)match(input,118,FOLLOW_118_in_expList3610); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal180_tree = (CommonTree)adaptor.create(char_literal180);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal180_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_expression_in_expList3613);
            	    expression181=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression181.getTree());

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


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
    // $ANTLR end "expList"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:575:1: expression : simpleExpression ( relation simpleExpression )? ;
    public final SSQSA_M2Parser.expression_return expression() throws RecognitionException {
        SSQSA_M2Parser.expression_return retval = new SSQSA_M2Parser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.simpleExpression_return simpleExpression182 = null;

        SSQSA_M2Parser.relation_return relation183 = null;

        SSQSA_M2Parser.simpleExpression_return simpleExpression184 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:575:12: ( simpleExpression ( relation simpleExpression )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:576:2: simpleExpression ( relation simpleExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_simpleExpression_in_expression3629);
            simpleExpression182=simpleExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression182.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:576:19: ( relation simpleExpression )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==IN||(LA59_0>=EQUAL_OP && LA59_0<=LESS_OR_EQUAL_OP)) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:576:21: relation simpleExpression
                    {
                    pushFollow(FOLLOW_relation_in_expression3633);
                    relation183=relation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(relation183.getTree(), root_0);
                    pushFollow(FOLLOW_simpleExpression_in_expression3636);
                    simpleExpression184=simpleExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleExpression184.getTree());

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
    // $ANTLR end "expression"

    public static class simpleExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simpleExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:581:1: simpleExpression : ( '+' | '-' )? term ( addOperator term )* ;
    public final SSQSA_M2Parser.simpleExpression_return simpleExpression() throws RecognitionException {
        SSQSA_M2Parser.simpleExpression_return retval = new SSQSA_M2Parser.simpleExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set185=null;
        SSQSA_M2Parser.term_return term186 = null;

        SSQSA_M2Parser.addOperator_return addOperator187 = null;

        SSQSA_M2Parser.term_return term188 = null;


        CommonTree set185_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:581:18: ( ( '+' | '-' )? term ( addOperator term )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:582:2: ( '+' | '-' )? term ( addOperator term )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:582:2: ( '+' | '-' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=PLUS_OP && LA60_0<=MINUS_OP)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
                    {
                    set185=(Token)input.LT(1);
                    if ( (input.LA(1)>=PLUS_OP && input.LA(1)<=MINUS_OP) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set185));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_term_in_simpleExpression3664);
            term186=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, term186.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:582:22: ( addOperator term )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==LOGICAL_OR||(LA61_0>=PLUS_OP && LA61_0<=MINUS_OP)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:582:24: addOperator term
            	    {
            	    pushFollow(FOLLOW_addOperator_in_simpleExpression3668);
            	    addOperator187=addOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(addOperator187.getTree(), root_0);
            	    pushFollow(FOLLOW_term_in_simpleExpression3671);
            	    term188=term();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, term188.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


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
    // $ANTLR end "simpleExpression"

    public static class term_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:587:1: term : factor ( mulOperator factor )* ;
    public final SSQSA_M2Parser.term_return term() throws RecognitionException {
        SSQSA_M2Parser.term_return retval = new SSQSA_M2Parser.term_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.factor_return factor189 = null;

        SSQSA_M2Parser.mulOperator_return mulOperator190 = null;

        SSQSA_M2Parser.factor_return factor191 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:587:6: ( factor ( mulOperator factor )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:588:2: factor ( mulOperator factor )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term3688);
            factor189=factor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, factor189.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:588:9: ( mulOperator factor )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==LOGICAL_AND||LA62_0==DIV||LA62_0==MOD||LA62_0==LOGICAL_AND_OP||(LA62_0>=MULTIPLY_OP && LA62_0<=DIVIDE_OP)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:588:11: mulOperator factor
            	    {
            	    pushFollow(FOLLOW_mulOperator_in_term3692);
            	    mulOperator190=mulOperator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (CommonTree)adaptor.becomeRoot(mulOperator190.getTree(), root_0);
            	    pushFollow(FOLLOW_factor_in_term3695);
            	    factor191=factor();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor191.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


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
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:594:1: factor : ( qualident ( -> qualident | set -> qualident set | actualParameters -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST actualParameters ) ) | designatorTails ( -> qualident designatorTails | actualParameters -> ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) ) ) ) | number | string | set | '(' expression ')' -> ^( SEPARATOR '(' ) expression ^( SEPARATOR ')' ) | 'NOT' factor );
    public final SSQSA_M2Parser.factor_return factor() throws RecognitionException {
        SSQSA_M2Parser.factor_return retval = new SSQSA_M2Parser.factor_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal200=null;
        Token char_literal202=null;
        Token string_literal203=null;
        SSQSA_M2Parser.qualident_return qualident192 = null;

        SSQSA_M2Parser.set_return set193 = null;

        SSQSA_M2Parser.actualParameters_return actualParameters194 = null;

        SSQSA_M2Parser.designatorTails_return designatorTails195 = null;

        SSQSA_M2Parser.actualParameters_return actualParameters196 = null;

        SSQSA_M2Parser.number_return number197 = null;

        SSQSA_M2Parser.string_return string198 = null;

        SSQSA_M2Parser.set_return set199 = null;

        SSQSA_M2Parser.expression_return expression201 = null;

        SSQSA_M2Parser.factor_return factor204 = null;


        CommonTree char_literal200_tree=null;
        CommonTree char_literal202_tree=null;
        CommonTree string_literal203_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        RewriteRuleSubtreeStream stream_designatorTails=new RewriteRuleSubtreeStream(adaptor,"rule designatorTails");
        RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:594:8: ( qualident ( -> qualident | set -> qualident set | actualParameters -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST actualParameters ) ) | designatorTails ( -> qualident designatorTails | actualParameters -> ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) ) ) ) | number | string | set | '(' expression ')' -> ^( SEPARATOR '(' ) expression ^( SEPARATOR ')' ) | 'NOT' factor )
            int alt65=6;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt65=1;
                }
                break;
            case INTEGER:
            case REAL:
                {
                alt65=2;
                }
                break;
            case STRING:
                {
                alt65=3;
                }
                break;
            case 117:
                {
                alt65=4;
                }
                break;
            case 115:
                {
                alt65=5;
                }
                break;
            case NOT:
                {
                alt65=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:595:3: qualident ( -> qualident | set -> qualident set | actualParameters -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST actualParameters ) ) | designatorTails ( -> qualident designatorTails | actualParameters -> ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) ) ) )
                    {
                    pushFollow(FOLLOW_qualident_in_factor3713);
                    qualident192=qualident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_qualident.add(qualident192.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:595:13: ( -> qualident | set -> qualident set | actualParameters -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST actualParameters ) ) | designatorTails ( -> qualident designatorTails | actualParameters -> ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) ) ) )
                    int alt64=4;
                    switch ( input.LA(1) ) {
                    case EOF:
                    case LOGICAL_AND:
                    case BY:
                    case DIV:
                    case DO:
                    case ELSE:
                    case ELSIF:
                    case END:
                    case IN:
                    case MOD:
                    case OF:
                    case LOGICAL_OR:
                    case THEN:
                    case TO:
                    case UNTIL:
                    case LOGICAL_AND_OP:
                    case EQUAL_OP:
                    case NOT_EQUAL_OP:
                    case PASCAL_NOT_EQUAL_OP:
                    case GREATER_OP:
                    case GREATER_OR_EQUAL_OP:
                    case LESS_OP:
                    case LESS_OR_EQUAL_OP:
                    case PLUS_OP:
                    case MINUS_OP:
                    case MULTIPLY_OP:
                    case DIVIDE_OP:
                    case DOTDOT:
                    case 116:
                    case 118:
                    case 119:
                    case 121:
                    case 122:
                    case 124:
                        {
                        alt64=1;
                        }
                        break;
                    case 117:
                        {
                        alt64=2;
                        }
                        break;
                    case 115:
                        {
                        alt64=3;
                        }
                        break;
                    case POINTER_OP:
                    case 120:
                        {
                        alt64=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:596:3: 
                            {

                            // AST REWRITE
                            // elements: qualident
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 596:3: -> qualident
                            {
                                adaptor.addChild(root_0, stream_qualident.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:597:5: set
                            {
                            pushFollow(FOLLOW_set_in_factor3728);
                            set193=set();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_set.add(set193.getTree());


                            // AST REWRITE
                            // elements: qualident, set
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 597:9: -> qualident set
                            {
                                adaptor.addChild(root_0, stream_qualident.nextTree());
                                adaptor.addChild(root_0, stream_set.nextTree());

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 3 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:598:5: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_factor3740);
                            actualParameters194=actualParameters();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters194.getTree());


                            // AST REWRITE
                            // elements: actualParameters, qualident
                            // token labels: 
                            // rule labels: retval
                            // token list labels: 
                            // rule list labels: 
                            // wildcard labels: 
                            if ( state.backtracking==0 ) {
                            retval.tree = root_0;
                            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                            root_0 = (CommonTree)adaptor.nil();
                            // 598:22: -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST actualParameters ) )
                            {
                                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:598:25: ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST actualParameters ) )
                                {
                                CommonTree root_1 = (CommonTree)adaptor.nil();
                                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                                adaptor.addChild(root_1, stream_qualident.nextTree());
                                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:598:51: ^( ARGUMENT_LIST actualParameters )
                                {
                                CommonTree root_2 = (CommonTree)adaptor.nil();
                                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_2);

                                adaptor.addChild(root_2, stream_actualParameters.nextTree());

                                adaptor.addChild(root_1, root_2);
                                }

                                adaptor.addChild(root_0, root_1);
                                }

                            }

                            retval.tree = root_0;}
                            }
                            break;
                        case 4 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:599:5: designatorTails ( -> qualident designatorTails | actualParameters -> ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) ) )
                            {
                            pushFollow(FOLLOW_designatorTails_in_factor3760);
                            designatorTails195=designatorTails();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_designatorTails.add(designatorTails195.getTree());
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:599:21: ( -> qualident designatorTails | actualParameters -> ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) ) )
                            int alt63=2;
                            int LA63_0 = input.LA(1);

                            if ( (LA63_0==EOF||LA63_0==LOGICAL_AND||LA63_0==BY||(LA63_0>=DIV && LA63_0<=END)||LA63_0==IN||LA63_0==MOD||(LA63_0>=OF && LA63_0<=LOGICAL_OR)||(LA63_0>=THEN && LA63_0<=TO)||LA63_0==UNTIL||LA63_0==LOGICAL_AND_OP||(LA63_0>=EQUAL_OP && LA63_0<=DIVIDE_OP)||LA63_0==DOTDOT||LA63_0==116||(LA63_0>=118 && LA63_0<=119)||(LA63_0>=121 && LA63_0<=122)||LA63_0==124) ) {
                                alt63=1;
                            }
                            else if ( (LA63_0==115) ) {
                                alt63=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 63, 0, input);

                                throw nvae;
                            }
                            switch (alt63) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:600:7: 
                                    {

                                    // AST REWRITE
                                    // elements: designatorTails, qualident
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 600:7: -> qualident designatorTails
                                    {
                                        adaptor.addChild(root_0, stream_qualident.nextTree());
                                        adaptor.addChild(root_0, stream_designatorTails.nextTree());

                                    }

                                    retval.tree = root_0;}
                                    }
                                    break;
                                case 2 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:601:7: actualParameters
                                    {
                                    pushFollow(FOLLOW_actualParameters_in_factor3783);
                                    actualParameters196=actualParameters();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters196.getTree());


                                    // AST REWRITE
                                    // elements: designatorTails, qualident, actualParameters
                                    // token labels: 
                                    // rule labels: retval
                                    // token list labels: 
                                    // rule list labels: 
                                    // wildcard labels: 
                                    if ( state.backtracking==0 ) {
                                    retval.tree = root_0;
                                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                                    root_0 = (CommonTree)adaptor.nil();
                                    // 601:24: -> ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) )
                                    {
                                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:601:27: ^( FUNCTION_CALL qualident designatorTails ^( ARGUMENT_LIST actualParameters ) )
                                        {
                                        CommonTree root_1 = (CommonTree)adaptor.nil();
                                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                                        adaptor.addChild(root_1, stream_qualident.nextTree());
                                        adaptor.addChild(root_1, stream_designatorTails.nextTree());
                                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:601:69: ^( ARGUMENT_LIST actualParameters )
                                        {
                                        CommonTree root_2 = (CommonTree)adaptor.nil();
                                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_2);

                                        adaptor.addChild(root_2, stream_actualParameters.nextTree());

                                        adaptor.addChild(root_1, root_2);
                                        }

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


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:604:5: number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_number_in_factor3815);
                    number197=number();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, number197.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:605:4: string
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_string_in_factor3821);
                    string198=string();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, string198.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:606:4: set
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_set_in_factor3827);
                    set199=set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, set199.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:607:4: '(' expression ')'
                    {
                    char_literal200=(Token)match(input,115,FOLLOW_115_in_factor3833); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal200);

                    pushFollow(FOLLOW_expression_in_factor3835);
                    expression201=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression201.getTree());
                    char_literal202=(Token)match(input,116,FOLLOW_116_in_factor3837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(char_literal202);



                    // AST REWRITE
                    // elements: 115, expression, 116
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 607:23: -> ^( SEPARATOR '(' ) expression ^( SEPARATOR ')' )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:607:26: ^( SEPARATOR '(' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_115.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_expression.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:607:54: ^( SEPARATOR ')' )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_116.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:608:4: 'NOT' factor
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal203=(Token)match(input,NOT,FOLLOW_NOT_in_factor3858); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal203_tree = (CommonTree)adaptor.create(string_literal203);
                    adaptor.addChild(root_0, string_literal203_tree);
                    }
                    pushFollow(FOLLOW_factor_in_factor3860);
                    factor204=factor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, factor204.getTree());

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
    // $ANTLR end "factor"

    public static class set_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:614:1: set : '{' ( element ( ',' element )* )? '}' -> IGNORE ;
    public final SSQSA_M2Parser.set_return set() throws RecognitionException {
        SSQSA_M2Parser.set_return retval = new SSQSA_M2Parser.set_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal205=null;
        Token char_literal207=null;
        Token char_literal209=null;
        SSQSA_M2Parser.element_return element206 = null;

        SSQSA_M2Parser.element_return element208 = null;


        CommonTree char_literal205_tree=null;
        CommonTree char_literal207_tree=null;
        CommonTree char_literal209_tree=null;
        RewriteRuleTokenStream stream_117=new RewriteRuleTokenStream(adaptor,"token 117");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleTokenStream stream_119=new RewriteRuleTokenStream(adaptor,"token 119");
        RewriteRuleSubtreeStream stream_element=new RewriteRuleSubtreeStream(adaptor,"rule element");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:614:5: ( '{' ( element ( ',' element )* )? '}' -> IGNORE )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:616:2: '{' ( element ( ',' element )* )? '}'
            {
            char_literal205=(Token)match(input,117,FOLLOW_117_in_set3878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_117.add(char_literal205);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:616:6: ( element ( ',' element )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==NOT||(LA67_0>=PLUS_OP && LA67_0<=MINUS_OP)||(LA67_0>=IDENT && LA67_0<=REAL)||LA67_0==STRING||LA67_0==115||LA67_0==117) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:616:8: element ( ',' element )*
                    {
                    pushFollow(FOLLOW_element_in_set3882);
                    element206=element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_element.add(element206.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:616:16: ( ',' element )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==118) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:616:18: ',' element
                    	    {
                    	    char_literal207=(Token)match(input,118,FOLLOW_118_in_set3886); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_118.add(char_literal207);

                    	    pushFollow(FOLLOW_element_in_set3888);
                    	    element208=element();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_element.add(element208.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal209=(Token)match(input,119,FOLLOW_119_in_set3896); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_119.add(char_literal209);



            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 616:40: -> IGNORE
            {
                adaptor.addChild(root_0, (CommonTree)adaptor.create(IGNORE, "IGNORE"));

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
    // $ANTLR end "set"

    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:621:1: element : expression ( '..' expression )? ;
    public final SSQSA_M2Parser.element_return element() throws RecognitionException {
        SSQSA_M2Parser.element_return retval = new SSQSA_M2Parser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal211=null;
        SSQSA_M2Parser.expression_return expression210 = null;

        SSQSA_M2Parser.expression_return expression212 = null;


        CommonTree string_literal211_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:621:9: ( expression ( '..' expression )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:622:2: expression ( '..' expression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_element3913);
            expression210=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression210.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:622:13: ( '..' expression )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==DOTDOT) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:622:15: '..' expression
                    {
                    string_literal211=(Token)match(input,DOTDOT,FOLLOW_DOTDOT_in_element3917); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal211_tree = (CommonTree)adaptor.create(string_literal211);
                    root_0 = (CommonTree)adaptor.becomeRoot(string_literal211_tree, root_0);
                    }
                    pushFollow(FOLLOW_expression_in_element3920);
                    expression212=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression212.getTree());

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
    // $ANTLR end "element"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:634:1: statement : ( ( assignmentOrProcCall )? | ( ifStatement )? | ( caseStatement )? | ( whileStatement )? | ( repeatStatement )? | ( loopStatement )? | ( forStatement )? | ( withStatement )? | ( 'EXIT' )? -> ( ^( JUMP_STATEMENT 'EXIT' ) )? | ( 'RETURN' ( expression )? )? -> ( ^( JUMP_STATEMENT 'RETURN' ( expression )? ) )? );
    public final SSQSA_M2Parser.statement_return statement() throws RecognitionException {
        SSQSA_M2Parser.statement_return retval = new SSQSA_M2Parser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal221=null;
        Token string_literal222=null;
        SSQSA_M2Parser.assignmentOrProcCall_return assignmentOrProcCall213 = null;

        SSQSA_M2Parser.ifStatement_return ifStatement214 = null;

        SSQSA_M2Parser.caseStatement_return caseStatement215 = null;

        SSQSA_M2Parser.whileStatement_return whileStatement216 = null;

        SSQSA_M2Parser.repeatStatement_return repeatStatement217 = null;

        SSQSA_M2Parser.loopStatement_return loopStatement218 = null;

        SSQSA_M2Parser.forStatement_return forStatement219 = null;

        SSQSA_M2Parser.withStatement_return withStatement220 = null;

        SSQSA_M2Parser.expression_return expression223 = null;


        CommonTree string_literal221_tree=null;
        CommonTree string_literal222_tree=null;
        RewriteRuleTokenStream stream_EXIT=new RewriteRuleTokenStream(adaptor,"token EXIT");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:634:11: ( ( assignmentOrProcCall )? | ( ifStatement )? | ( caseStatement )? | ( whileStatement )? | ( repeatStatement )? | ( loopStatement )? | ( forStatement )? | ( withStatement )? | ( 'EXIT' )? -> ( ^( JUMP_STATEMENT 'EXIT' ) )? | ( 'RETURN' ( expression )? )? -> ( ^( JUMP_STATEMENT 'RETURN' ( expression )? ) )? )
            int alt80=10;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:635:2: ( assignmentOrProcCall )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:635:2: ( assignmentOrProcCall )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DEC||LA69_0==INC||LA69_0==IDENT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: assignmentOrProcCall
                            {
                            pushFollow(FOLLOW_assignmentOrProcCall_in_statement3943);
                            assignmentOrProcCall213=assignmentOrProcCall();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, assignmentOrProcCall213.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:636:4: ( ifStatement )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:636:4: ( ifStatement )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==IF) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: ifStatement
                            {
                            pushFollow(FOLLOW_ifStatement_in_statement3950);
                            ifStatement214=ifStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, ifStatement214.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:637:4: ( caseStatement )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:637:4: ( caseStatement )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==CASE) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: caseStatement
                            {
                            pushFollow(FOLLOW_caseStatement_in_statement3957);
                            caseStatement215=caseStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, caseStatement215.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:638:4: ( whileStatement )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:638:4: ( whileStatement )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==WHILE) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: whileStatement
                            {
                            pushFollow(FOLLOW_whileStatement_in_statement3964);
                            whileStatement216=whileStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, whileStatement216.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:639:4: ( repeatStatement )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:639:4: ( repeatStatement )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==REPEAT) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: repeatStatement
                            {
                            pushFollow(FOLLOW_repeatStatement_in_statement3971);
                            repeatStatement217=repeatStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, repeatStatement217.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:640:4: ( loopStatement )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:640:4: ( loopStatement )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==LOOP) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: loopStatement
                            {
                            pushFollow(FOLLOW_loopStatement_in_statement3978);
                            loopStatement218=loopStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, loopStatement218.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:641:4: ( forStatement )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:641:4: ( forStatement )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==FOR) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: forStatement
                            {
                            pushFollow(FOLLOW_forStatement_in_statement3985);
                            forStatement219=forStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, forStatement219.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:642:4: ( withStatement )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:642:4: ( withStatement )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==WITH) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: withStatement
                            {
                            pushFollow(FOLLOW_withStatement_in_statement3992);
                            withStatement220=withStatement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, withStatement220.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:643:4: ( 'EXIT' )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:643:4: ( 'EXIT' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==EXIT) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: 'EXIT'
                            {
                            string_literal221=(Token)match(input,EXIT,FOLLOW_EXIT_in_statement3999); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_EXIT.add(string_literal221);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: EXIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 643:12: -> ( ^( JUMP_STATEMENT 'EXIT' ) )?
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:643:15: ( ^( JUMP_STATEMENT 'EXIT' ) )?
                        if ( stream_EXIT.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:643:15: ^( JUMP_STATEMENT 'EXIT' )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                            adaptor.addChild(root_1, stream_EXIT.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_EXIT.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:644:4: ( 'RETURN' ( expression )? )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:644:4: ( 'RETURN' ( expression )? )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==RETURN) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:644:5: 'RETURN' ( expression )?
                            {
                            string_literal222=(Token)match(input,RETURN,FOLLOW_RETURN_in_statement4015); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RETURN.add(string_literal222);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:644:14: ( expression )?
                            int alt78=2;
                            int LA78_0 = input.LA(1);

                            if ( (LA78_0==NOT||(LA78_0>=PLUS_OP && LA78_0<=MINUS_OP)||(LA78_0>=IDENT && LA78_0<=REAL)||LA78_0==STRING||LA78_0==115||LA78_0==117) ) {
                                alt78=1;
                            }
                            switch (alt78) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: expression
                                    {
                                    pushFollow(FOLLOW_expression_in_statement4017);
                                    expression223=expression();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_expression.add(expression223.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expression, RETURN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 644:28: -> ( ^( JUMP_STATEMENT 'RETURN' ( expression )? ) )?
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:644:31: ( ^( JUMP_STATEMENT 'RETURN' ( expression )? ) )?
                        if ( stream_expression.hasNext()||stream_RETURN.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:644:32: ^( JUMP_STATEMENT 'RETURN' ( expression )? )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                            adaptor.addChild(root_1, stream_RETURN.nextNode());
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:644:58: ( expression )?
                            if ( stream_expression.hasNext() ) {
                                adaptor.addChild(root_1, stream_expression.nextTree());

                            }
                            stream_expression.reset();

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_expression.reset();
                        stream_RETURN.reset();

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
    // $ANTLR end "statement"

    public static class assignmentOrProcCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOrProcCall"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:651:1: assignmentOrProcCall : ( assignment | procCall | incdeccall );
    public final SSQSA_M2Parser.assignmentOrProcCall_return assignmentOrProcCall() throws RecognitionException {
        SSQSA_M2Parser.assignmentOrProcCall_return retval = new SSQSA_M2Parser.assignmentOrProcCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.assignment_return assignment224 = null;

        SSQSA_M2Parser.procCall_return procCall225 = null;

        SSQSA_M2Parser.incdeccall_return incdeccall226 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:651:22: ( assignment | procCall | incdeccall )
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IDENT) ) {
                int LA81_1 = input.LA(2);

                if ( (synpred117_SSQSA_M2()) ) {
                    alt81=1;
                }
                else if ( (synpred118_SSQSA_M2()) ) {
                    alt81=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA81_0==DEC||LA81_0==INC) ) {
                alt81=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:652:2: assignment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_assignmentOrProcCall4050);
                    assignment224=assignment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment224.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:652:15: procCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_procCall_in_assignmentOrProcCall4054);
                    procCall225=procCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, procCall225.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:652:26: incdeccall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_incdeccall_in_assignmentOrProcCall4058);
                    incdeccall226=incdeccall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, incdeccall226.getTree());

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
    // $ANTLR end "assignmentOrProcCall"

    public static class assignment_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:658:1: assignment : qualidentWithTail ':=' expression -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ) qualidentWithTail ^( VALUE expression ) ) ;
    public final SSQSA_M2Parser.assignment_return assignment() throws RecognitionException {
        SSQSA_M2Parser.assignment_return retval = new SSQSA_M2Parser.assignment_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal228=null;
        SSQSA_M2Parser.qualidentWithTail_return qualidentWithTail227 = null;

        SSQSA_M2Parser.expression_return expression229 = null;


        CommonTree string_literal228_tree=null;
        RewriteRuleTokenStream stream_ASSIGN_OP=new RewriteRuleTokenStream(adaptor,"token ASSIGN_OP");
        RewriteRuleSubtreeStream stream_qualidentWithTail=new RewriteRuleSubtreeStream(adaptor,"rule qualidentWithTail");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:659:2: ( qualidentWithTail ':=' expression -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ) qualidentWithTail ^( VALUE expression ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:659:4: qualidentWithTail ':=' expression
            {
            pushFollow(FOLLOW_qualidentWithTail_in_assignment4072);
            qualidentWithTail227=qualidentWithTail();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualidentWithTail.add(qualidentWithTail227.getTree());
            string_literal228=(Token)match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_assignment4074); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN_OP.add(string_literal228);

            pushFollow(FOLLOW_expression_in_assignment4076);
            expression229=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression229.getTree());


            // AST REWRITE
            // elements: qualidentWithTail, ASSIGN_OP, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 659:38: -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ) qualidentWithTail ^( VALUE expression ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:659:41: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ) qualidentWithTail ^( VALUE expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:659:64: ^( ASSIGN_OPERATOR ':=' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_2);

                adaptor.addChild(root_2, stream_ASSIGN_OP.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_qualidentWithTail.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:659:106: ^( VALUE expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

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
    // $ANTLR end "assignment"

    public static class qualidentWithTail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualidentWithTail"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:665:1: qualidentWithTail : ( qualident ) ( designatorTails )? ;
    public final SSQSA_M2Parser.qualidentWithTail_return qualidentWithTail() throws RecognitionException {
        SSQSA_M2Parser.qualidentWithTail_return retval = new SSQSA_M2Parser.qualidentWithTail_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.qualident_return qualident230 = null;

        SSQSA_M2Parser.designatorTails_return designatorTails231 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:666:2: ( ( qualident ) ( designatorTails )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:666:4: ( qualident ) ( designatorTails )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:666:4: ( qualident )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:666:5: qualident
            {
            pushFollow(FOLLOW_qualident_in_qualidentWithTail4113);
            qualident230=qualident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, qualident230.getTree());

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:668:4: ( designatorTails )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==POINTER_OP||LA82_0==120) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:668:5: designatorTails
                    {
                    pushFollow(FOLLOW_designatorTails_in_qualidentWithTail4125);
                    designatorTails231=designatorTails();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, designatorTails231.getTree());

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
    // $ANTLR end "qualidentWithTail"

    public static class actualParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actualParameters"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:672:1: actualParameters : ( '(' ')' | '(' ( expression ( ',' expression )* ) ')' -> ( ^( ARGUMENT expression ) )* );
    public final SSQSA_M2Parser.actualParameters_return actualParameters() throws RecognitionException {
        SSQSA_M2Parser.actualParameters_return retval = new SSQSA_M2Parser.actualParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal232=null;
        Token char_literal233=null;
        Token char_literal234=null;
        Token char_literal236=null;
        Token char_literal238=null;
        SSQSA_M2Parser.expression_return expression235 = null;

        SSQSA_M2Parser.expression_return expression237 = null;


        CommonTree char_literal232_tree=null;
        CommonTree char_literal233_tree=null;
        CommonTree char_literal234_tree=null;
        CommonTree char_literal236_tree=null;
        CommonTree char_literal238_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:672:18: ( '(' ')' | '(' ( expression ( ',' expression )* ) ')' -> ( ^( ARGUMENT expression ) )* )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==115) ) {
                int LA84_1 = input.LA(2);

                if ( (LA84_1==116) ) {
                    alt84=1;
                }
                else if ( (LA84_1==NOT||(LA84_1>=PLUS_OP && LA84_1<=MINUS_OP)||(LA84_1>=IDENT && LA84_1<=REAL)||LA84_1==STRING||LA84_1==115||LA84_1==117) ) {
                    alt84=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 84, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:673:9: '(' ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal232=(Token)match(input,115,FOLLOW_115_in_actualParameters4149); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal232_tree = (CommonTree)adaptor.create(char_literal232);
                    adaptor.addChild(root_0, char_literal232_tree);
                    }
                    char_literal233=(Token)match(input,116,FOLLOW_116_in_actualParameters4151); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal233_tree = (CommonTree)adaptor.create(char_literal233);
                    adaptor.addChild(root_0, char_literal233_tree);
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:674:3: '(' ( expression ( ',' expression )* ) ')'
                    {
                    char_literal234=(Token)match(input,115,FOLLOW_115_in_actualParameters4157); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal234);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:674:7: ( expression ( ',' expression )* )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:674:10: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_actualParameters4162);
                    expression235=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression235.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:674:21: ( ',' expression )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==118) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:674:22: ',' expression
                    	    {
                    	    char_literal236=(Token)match(input,118,FOLLOW_118_in_actualParameters4165); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_118.add(char_literal236);

                    	    pushFollow(FOLLOW_expression_in_actualParameters4167);
                    	    expression237=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression237.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }

                    char_literal238=(Token)match(input,116,FOLLOW_116_in_actualParameters4174); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(char_literal238);



                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 674:46: -> ( ^( ARGUMENT expression ) )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:674:49: ( ^( ARGUMENT expression ) )*
                        while ( stream_expression.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:674:51: ^( ARGUMENT expression )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_1);

                            adaptor.addChild(root_1, stream_expression.nextTree());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_expression.reset();

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
    // $ANTLR end "actualParameters"

    public static class incDecParameters_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incDecParameters"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:677:1: incDecParameters : '(' expression ( ',' expression )? ')' -> ^( SEPARATOR '(' ) expression ( ^( SEPARATOR ',' ) ^( VALUE ( expression )? ) )? ^( SEPARATOR ')' ) ;
    public final SSQSA_M2Parser.incDecParameters_return incDecParameters() throws RecognitionException {
        SSQSA_M2Parser.incDecParameters_return retval = new SSQSA_M2Parser.incDecParameters_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal239=null;
        Token char_literal241=null;
        Token char_literal243=null;
        SSQSA_M2Parser.expression_return expression240 = null;

        SSQSA_M2Parser.expression_return expression242 = null;


        CommonTree char_literal239_tree=null;
        CommonTree char_literal241_tree=null;
        CommonTree char_literal243_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:677:18: ( '(' expression ( ',' expression )? ')' -> ^( SEPARATOR '(' ) expression ( ^( SEPARATOR ',' ) ^( VALUE ( expression )? ) )? ^( SEPARATOR ')' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:3: '(' expression ( ',' expression )? ')'
            {
            char_literal239=(Token)match(input,115,FOLLOW_115_in_incDecParameters4202); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_115.add(char_literal239);

            pushFollow(FOLLOW_expression_in_incDecParameters4205);
            expression240=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression240.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:19: ( ',' expression )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==118) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:20: ',' expression
                    {
                    char_literal241=(Token)match(input,118,FOLLOW_118_in_incDecParameters4208); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_118.add(char_literal241);

                    pushFollow(FOLLOW_expression_in_incDecParameters4210);
                    expression242=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression242.getTree());

                    }
                    break;

            }

            char_literal243=(Token)match(input,116,FOLLOW_116_in_incDecParameters4214); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_116.add(char_literal243);



            // AST REWRITE
            // elements: expression, 116, expression, 115, 118
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 678:41: -> ^( SEPARATOR '(' ) expression ( ^( SEPARATOR ',' ) ^( VALUE ( expression )? ) )? ^( SEPARATOR ')' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:44: ^( SEPARATOR '(' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_115.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_expression.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:72: ( ^( SEPARATOR ',' ) ^( VALUE ( expression )? ) )?
                if ( stream_expression.hasNext()||stream_118.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:73: ^( SEPARATOR ',' )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                    adaptor.addChild(root_1, stream_118.nextNode());

                    adaptor.addChild(root_0, root_1);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:90: ^( VALUE ( expression )? )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_1);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:98: ( expression )?
                    if ( stream_expression.hasNext() ) {
                        adaptor.addChild(root_1, stream_expression.nextTree());

                    }
                    stream_expression.reset();

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_expression.reset();
                stream_118.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:678:113: ^( SEPARATOR ')' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_116.nextNode());

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
    // $ANTLR end "incDecParameters"

    public static class incdeccall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incdeccall"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:681:1: incdeccall : ( INC | DEC ) incDecParameters -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ( INC )? ( DEC )? incDecParameters ) ) ;
    public final SSQSA_M2Parser.incdeccall_return incdeccall() throws RecognitionException {
        SSQSA_M2Parser.incdeccall_return retval = new SSQSA_M2Parser.incdeccall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INC244=null;
        Token DEC245=null;
        SSQSA_M2Parser.incDecParameters_return incDecParameters246 = null;


        CommonTree INC244_tree=null;
        CommonTree DEC245_tree=null;
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleSubtreeStream stream_incDecParameters=new RewriteRuleSubtreeStream(adaptor,"rule incDecParameters");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:1: ( ( INC | DEC ) incDecParameters -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ( INC )? ( DEC )? incDecParameters ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:3: ( INC | DEC ) incDecParameters
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:3: ( INC | DEC )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==INC) ) {
                alt86=1;
            }
            else if ( (LA86_0==DEC) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:4: INC
                    {
                    INC244=(Token)match(input,INC,FOLLOW_INC_in_incdeccall4258); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INC.add(INC244);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:10: DEC
                    {
                    DEC245=(Token)match(input,DEC,FOLLOW_DEC_in_incdeccall4262); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DEC.add(DEC245);


                    }
                    break;

            }

            pushFollow(FOLLOW_incDecParameters_in_incdeccall4265);
            incDecParameters246=incDecParameters();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_incDecParameters.add(incDecParameters246.getTree());


            // AST REWRITE
            // elements: INC, DEC, incDecParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 682:32: -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ( INC )? ( DEC )? incDecParameters ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:36: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ( INC )? ( DEC )? incDecParameters ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:59: ^( ASSIGN_OPERATOR ( INC )? ( DEC )? incDecParameters )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:77: ( INC )?
                if ( stream_INC.hasNext() ) {
                    adaptor.addChild(root_2, stream_INC.nextNode());

                }
                stream_INC.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:682:82: ( DEC )?
                if ( stream_DEC.hasNext() ) {
                    adaptor.addChild(root_2, stream_DEC.nextNode());

                }
                stream_DEC.reset();
                adaptor.addChild(root_2, stream_incDecParameters.nextTree());

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
    // $ANTLR end "incdeccall"

    public static class procCall_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procCall"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:685:1: procCall : qualident ( designatorTails )? ( actualParameters )? -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST ( actualParameters )? ) ) ;
    public final SSQSA_M2Parser.procCall_return procCall() throws RecognitionException {
        SSQSA_M2Parser.procCall_return retval = new SSQSA_M2Parser.procCall_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        SSQSA_M2Parser.qualident_return qualident247 = null;

        SSQSA_M2Parser.designatorTails_return designatorTails248 = null;

        SSQSA_M2Parser.actualParameters_return actualParameters249 = null;


        RewriteRuleSubtreeStream stream_designatorTails=new RewriteRuleSubtreeStream(adaptor,"rule designatorTails");
        RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");
        RewriteRuleSubtreeStream stream_actualParameters=new RewriteRuleSubtreeStream(adaptor,"rule actualParameters");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:2: ( qualident ( designatorTails )? ( actualParameters )? -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST ( actualParameters )? ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:4: qualident ( designatorTails )? ( actualParameters )?
            {
            pushFollow(FOLLOW_qualident_in_procCall4296);
            qualident247=qualident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualident.add(qualident247.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:14: ( designatorTails )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==POINTER_OP||LA87_0==120) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: designatorTails
                    {
                    pushFollow(FOLLOW_designatorTails_in_procCall4298);
                    designatorTails248=designatorTails();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_designatorTails.add(designatorTails248.getTree());

                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:31: ( actualParameters )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==115) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:32: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procCall4302);
                    actualParameters249=actualParameters();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_actualParameters.add(actualParameters249.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: qualident, actualParameters
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 686:52: -> ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST ( actualParameters )? ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:55: ^( FUNCTION_CALL qualident ^( ARGUMENT_LIST ( actualParameters )? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

                adaptor.addChild(root_1, stream_qualident.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:81: ^( ARGUMENT_LIST ( actualParameters )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:686:97: ( actualParameters )?
                if ( stream_actualParameters.hasNext() ) {
                    adaptor.addChild(root_2, stream_actualParameters.nextTree());

                }
                stream_actualParameters.reset();

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
    // $ANTLR end "procCall"

    public static class statementSequence_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementSequence"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:697:1: statementSequence : statement ( ';' statement )* -> statement ( statement )* ;
    public final SSQSA_M2Parser.statementSequence_return statementSequence() throws RecognitionException {
        SSQSA_M2Parser.statementSequence_return retval = new SSQSA_M2Parser.statementSequence_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal251=null;
        SSQSA_M2Parser.statement_return statement250 = null;

        SSQSA_M2Parser.statement_return statement252 = null;


        CommonTree char_literal251_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:697:19: ( statement ( ';' statement )* -> statement ( statement )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:698:2: statement ( ';' statement )*
            {
            pushFollow(FOLLOW_statement_in_statementSequence4341);
            statement250=statement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statement.add(statement250.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:698:12: ( ';' statement )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==122) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:698:14: ';' statement
            	    {
            	    char_literal251=(Token)match(input,122,FOLLOW_122_in_statementSequence4345); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_122.add(char_literal251);

            	    pushFollow(FOLLOW_statement_in_statementSequence4347);
            	    statement252=statement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statement.add(statement252.getTree());

            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);



            // AST REWRITE
            // elements: statement, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 698:31: -> statement ( statement )*
            {
                adaptor.addChild(root_0, stream_statement.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:698:44: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_0, stream_statement.nextTree());

                }
                stream_statement.reset();

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
    // $ANTLR end "statementSequence"

    public static class ifBranch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifBranch"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:703:1: ifBranch : 'IF' expression 'THEN' statementSequence -> ^( BRANCH ^( KEYWORD 'IF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) ) ;
    public final SSQSA_M2Parser.ifBranch_return ifBranch() throws RecognitionException {
        SSQSA_M2Parser.ifBranch_return retval = new SSQSA_M2Parser.ifBranch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal253=null;
        Token string_literal255=null;
        SSQSA_M2Parser.expression_return expression254 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence256 = null;


        CommonTree string_literal253_tree=null;
        CommonTree string_literal255_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:704:2: ( 'IF' expression 'THEN' statementSequence -> ^( BRANCH ^( KEYWORD 'IF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:704:4: 'IF' expression 'THEN' statementSequence
            {
            string_literal253=(Token)match(input,IF,FOLLOW_IF_in_ifBranch4373); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_IF.add(string_literal253);

            pushFollow(FOLLOW_expression_in_ifBranch4375);
            expression254=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression254.getTree());
            string_literal255=(Token)match(input,THEN,FOLLOW_THEN_in_ifBranch4377); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_THEN.add(string_literal255);

            pushFollow(FOLLOW_statementSequence_in_ifBranch4379);
            statementSequence256=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence256.getTree());


            // AST REWRITE
            // elements: expression, IF, statementSequence, THEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 704:45: -> ^( BRANCH ^( KEYWORD 'IF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:704:48: ^( BRANCH ^( KEYWORD 'IF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:704:57: ^( KEYWORD 'IF' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_IF.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:704:73: ^( CONDITION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:704:97: ^( KEYWORD 'THEN' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_THEN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:704:115: ^( BLOCK_SCOPE statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statementSequence.nextTree());

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
    // $ANTLR end "ifBranch"

    public static class elsifBranch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elsifBranch"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:707:1: elsifBranch : ( 'ELSIF' expression 'THEN' statementSequence )* -> ( ^( BRANCH ^( KEYWORD 'ELSIF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) ) )* ;
    public final SSQSA_M2Parser.elsifBranch_return elsifBranch() throws RecognitionException {
        SSQSA_M2Parser.elsifBranch_return retval = new SSQSA_M2Parser.elsifBranch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal257=null;
        Token string_literal259=null;
        SSQSA_M2Parser.expression_return expression258 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence260 = null;


        CommonTree string_literal257_tree=null;
        CommonTree string_literal259_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_ELSIF=new RewriteRuleTokenStream(adaptor,"token ELSIF");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:2: ( ( 'ELSIF' expression 'THEN' statementSequence )* -> ( ^( BRANCH ^( KEYWORD 'ELSIF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:4: ( 'ELSIF' expression 'THEN' statementSequence )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:4: ( 'ELSIF' expression 'THEN' statementSequence )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==ELSIF) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:6: 'ELSIF' expression 'THEN' statementSequence
            	    {
            	    string_literal257=(Token)match(input,ELSIF,FOLLOW_ELSIF_in_elsifBranch4424); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_ELSIF.add(string_literal257);

            	    pushFollow(FOLLOW_expression_in_elsifBranch4426);
            	    expression258=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression258.getTree());
            	    string_literal259=(Token)match(input,THEN,FOLLOW_THEN_in_elsifBranch4428); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_THEN.add(string_literal259);

            	    pushFollow(FOLLOW_statementSequence_in_elsifBranch4430);
            	    statementSequence260=statementSequence();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence260.getTree());

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);



            // AST REWRITE
            // elements: THEN, expression, statementSequence, ELSIF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 708:53: -> ( ^( BRANCH ^( KEYWORD 'ELSIF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) ) )*
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:56: ( ^( BRANCH ^( KEYWORD 'ELSIF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) ) )*
                while ( stream_THEN.hasNext()||stream_expression.hasNext()||stream_statementSequence.hasNext()||stream_ELSIF.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:56: ^( BRANCH ^( KEYWORD 'ELSIF' ) ^( CONDITION expression ) ^( KEYWORD 'THEN' ) ^( BLOCK_SCOPE statementSequence ) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:65: ^( KEYWORD 'ELSIF' )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                    adaptor.addChild(root_2, stream_ELSIF.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:84: ^( CONDITION expression )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                    adaptor.addChild(root_2, stream_expression.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:108: ^( KEYWORD 'THEN' )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                    adaptor.addChild(root_2, stream_THEN.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:708:126: ^( BLOCK_SCOPE statementSequence )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                    adaptor.addChild(root_2, stream_statementSequence.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_THEN.reset();
                stream_expression.reset();
                stream_statementSequence.reset();
                stream_ELSIF.reset();

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
    // $ANTLR end "elsifBranch"

    public static class elseBranch_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseBranch"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:711:1: elseBranch : ( 'ELSE' statementSequence )? -> ( ^( BRANCH ^( KEYWORD 'ELSE' ) ^( BLOCK_SCOPE statementSequence ) ) )? ;
    public final SSQSA_M2Parser.elseBranch_return elseBranch() throws RecognitionException {
        SSQSA_M2Parser.elseBranch_return retval = new SSQSA_M2Parser.elseBranch_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal261=null;
        SSQSA_M2Parser.statementSequence_return statementSequence262 = null;


        CommonTree string_literal261_tree=null;
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:2: ( ( 'ELSE' statementSequence )? -> ( ^( BRANCH ^( KEYWORD 'ELSE' ) ^( BLOCK_SCOPE statementSequence ) ) )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:4: ( 'ELSE' statementSequence )?
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:4: ( 'ELSE' statementSequence )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==ELSE) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:6: 'ELSE' statementSequence
                    {
                    string_literal261=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseBranch4479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(string_literal261);

                    pushFollow(FOLLOW_statementSequence_in_elseBranch4481);
                    statementSequence262=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence262.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ELSE, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 712:34: -> ( ^( BRANCH ^( KEYWORD 'ELSE' ) ^( BLOCK_SCOPE statementSequence ) ) )?
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:37: ( ^( BRANCH ^( KEYWORD 'ELSE' ) ^( BLOCK_SCOPE statementSequence ) ) )?
                if ( stream_ELSE.hasNext()||stream_statementSequence.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:37: ^( BRANCH ^( KEYWORD 'ELSE' ) ^( BLOCK_SCOPE statementSequence ) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:46: ^( KEYWORD 'ELSE' )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                    adaptor.addChild(root_2, stream_ELSE.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:712:64: ^( BLOCK_SCOPE statementSequence )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                    adaptor.addChild(root_2, stream_statementSequence.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ELSE.reset();
                stream_statementSequence.reset();

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

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:716:1: ifStatement : ifBranch ( elsifBranch )? ( elseBranch )? 'END' -> ^( BRANCH_STATEMENT ifBranch ( elsifBranch )? ( elseBranch )? ^( KEYWORD 'END' ) ) ;
    public final SSQSA_M2Parser.ifStatement_return ifStatement() throws RecognitionException {
        SSQSA_M2Parser.ifStatement_return retval = new SSQSA_M2Parser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal266=null;
        SSQSA_M2Parser.ifBranch_return ifBranch263 = null;

        SSQSA_M2Parser.elsifBranch_return elsifBranch264 = null;

        SSQSA_M2Parser.elseBranch_return elseBranch265 = null;


        CommonTree string_literal266_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_elseBranch=new RewriteRuleSubtreeStream(adaptor,"rule elseBranch");
        RewriteRuleSubtreeStream stream_elsifBranch=new RewriteRuleSubtreeStream(adaptor,"rule elsifBranch");
        RewriteRuleSubtreeStream stream_ifBranch=new RewriteRuleSubtreeStream(adaptor,"rule ifBranch");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:716:13: ( ifBranch ( elsifBranch )? ( elseBranch )? 'END' -> ^( BRANCH_STATEMENT ifBranch ( elsifBranch )? ( elseBranch )? ^( KEYWORD 'END' ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:2: ifBranch ( elsifBranch )? ( elseBranch )? 'END'
            {
            pushFollow(FOLLOW_ifBranch_in_ifStatement4518);
            ifBranch263=ifBranch();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ifBranch.add(ifBranch263.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:11: ( elsifBranch )?
            int alt92=2;
            switch ( input.LA(1) ) {
                case ELSIF:
                    {
                    alt92=1;
                    }
                    break;
                case ELSE:
                    {
                    int LA92_2 = input.LA(2);

                    if ( (synpred129_SSQSA_M2()) ) {
                        alt92=1;
                    }
                    }
                    break;
                case END:
                    {
                    int LA92_3 = input.LA(2);

                    if ( (synpred129_SSQSA_M2()) ) {
                        alt92=1;
                    }
                    }
                    break;
            }

            switch (alt92) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: elsifBranch
                    {
                    pushFollow(FOLLOW_elsifBranch_in_ifStatement4520);
                    elsifBranch264=elsifBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elsifBranch.add(elsifBranch264.getTree());

                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:24: ( elseBranch )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==ELSE) ) {
                alt93=1;
            }
            else if ( (LA93_0==END) ) {
                int LA93_2 = input.LA(2);

                if ( (synpred130_SSQSA_M2()) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: elseBranch
                    {
                    pushFollow(FOLLOW_elseBranch_in_ifStatement4523);
                    elseBranch265=elseBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_elseBranch.add(elseBranch265.getTree());

                    }
                    break;

            }

            string_literal266=(Token)match(input,END,FOLLOW_END_in_ifStatement4526); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal266);



            // AST REWRITE
            // elements: ifBranch, END, elsifBranch, elseBranch
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 717:43: -> ^( BRANCH_STATEMENT ifBranch ( elsifBranch )? ( elseBranch )? ^( KEYWORD 'END' ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:46: ^( BRANCH_STATEMENT ifBranch ( elsifBranch )? ( elseBranch )? ^( KEYWORD 'END' ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                adaptor.addChild(root_1, stream_ifBranch.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:74: ( elsifBranch )?
                if ( stream_elsifBranch.hasNext() ) {
                    adaptor.addChild(root_1, stream_elsifBranch.nextTree());

                }
                stream_elsifBranch.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:87: ( elseBranch )?
                if ( stream_elseBranch.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseBranch.nextTree());

                }
                stream_elseBranch.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:99: ^( KEYWORD 'END' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_END.nextNode());

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
    // $ANTLR end "ifStatement"

    public static class caseStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:722:1: caseStatement : 'CASE' expression 'OF' casecase ( '|' casecase )* ( 'ELSE' statementSequence )? 'END' -> ^( BRANCH_STATEMENT ^( 'CASE' expression 'OF' ( ^( BRANCH casecase ) )+ ( ^( BRANCH 'ELSE' ^( BLOCK_SCOPE statementSequence ) ) )? 'END' ) ) ;
    public final SSQSA_M2Parser.caseStatement_return caseStatement() throws RecognitionException {
        SSQSA_M2Parser.caseStatement_return retval = new SSQSA_M2Parser.caseStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal267=null;
        Token string_literal269=null;
        Token char_literal271=null;
        Token string_literal273=null;
        Token string_literal275=null;
        SSQSA_M2Parser.expression_return expression268 = null;

        SSQSA_M2Parser.casecase_return casecase270 = null;

        SSQSA_M2Parser.casecase_return casecase272 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence274 = null;


        CommonTree string_literal267_tree=null;
        CommonTree string_literal269_tree=null;
        CommonTree char_literal271_tree=null;
        CommonTree string_literal273_tree=null;
        CommonTree string_literal275_tree=null;
        RewriteRuleTokenStream stream_124=new RewriteRuleTokenStream(adaptor,"token 124");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_casecase=new RewriteRuleSubtreeStream(adaptor,"rule casecase");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:722:15: ( 'CASE' expression 'OF' casecase ( '|' casecase )* ( 'ELSE' statementSequence )? 'END' -> ^( BRANCH_STATEMENT ^( 'CASE' expression 'OF' ( ^( BRANCH casecase ) )+ ( ^( BRANCH 'ELSE' ^( BLOCK_SCOPE statementSequence ) ) )? 'END' ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:723:2: 'CASE' expression 'OF' casecase ( '|' casecase )* ( 'ELSE' statementSequence )? 'END'
            {
            string_literal267=(Token)match(input,CASE,FOLLOW_CASE_in_caseStatement4561); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_CASE.add(string_literal267);

            pushFollow(FOLLOW_expression_in_caseStatement4563);
            expression268=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression268.getTree());
            string_literal269=(Token)match(input,OF,FOLLOW_OF_in_caseStatement4565); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_OF.add(string_literal269);

            pushFollow(FOLLOW_casecase_in_caseStatement4567);
            casecase270=casecase();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_casecase.add(casecase270.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:723:34: ( '|' casecase )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==124) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:723:36: '|' casecase
            	    {
            	    char_literal271=(Token)match(input,124,FOLLOW_124_in_caseStatement4571); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_124.add(char_literal271);

            	    pushFollow(FOLLOW_casecase_in_caseStatement4573);
            	    casecase272=casecase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_casecase.add(casecase272.getTree());

            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:724:2: ( 'ELSE' statementSequence )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==ELSE) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:724:4: 'ELSE' statementSequence
                    {
                    string_literal273=(Token)match(input,ELSE,FOLLOW_ELSE_in_caseStatement4581); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ELSE.add(string_literal273);

                    pushFollow(FOLLOW_statementSequence_in_caseStatement4583);
                    statementSequence274=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence274.getTree());

                    }
                    break;

            }

            string_literal275=(Token)match(input,END,FOLLOW_END_in_caseStatement4589); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal275);



            // AST REWRITE
            // elements: ELSE, OF, END, statementSequence, expression, casecase, CASE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 726:2: -> ^( BRANCH_STATEMENT ^( 'CASE' expression 'OF' ( ^( BRANCH casecase ) )+ ( ^( BRANCH 'ELSE' ^( BLOCK_SCOPE statementSequence ) ) )? 'END' ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:727:2: ^( BRANCH_STATEMENT ^( 'CASE' expression 'OF' ( ^( BRANCH casecase ) )+ ( ^( BRANCH 'ELSE' ^( BLOCK_SCOPE statementSequence ) ) )? 'END' ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:728:3: ^( 'CASE' expression 'OF' ( ^( BRANCH casecase ) )+ ( ^( BRANCH 'ELSE' ^( BLOCK_SCOPE statementSequence ) ) )? 'END' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_CASE.nextNode(), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());
                adaptor.addChild(root_2, stream_OF.nextNode());
                if ( !(stream_casecase.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_casecase.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:729:4: ^( BRANCH casecase )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_3);

                    adaptor.addChild(root_3, stream_casecase.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_casecase.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:730:4: ( ^( BRANCH 'ELSE' ^( BLOCK_SCOPE statementSequence ) ) )?
                if ( stream_ELSE.hasNext()||stream_statementSequence.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:730:4: ^( BRANCH 'ELSE' ^( BLOCK_SCOPE statementSequence ) )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_3);

                    adaptor.addChild(root_3, stream_ELSE.nextNode());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:730:20: ^( BLOCK_SCOPE statementSequence )
                    {
                    CommonTree root_4 = (CommonTree)adaptor.nil();
                    root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_4);

                    adaptor.addChild(root_4, stream_statementSequence.nextTree());

                    adaptor.addChild(root_3, root_4);
                    }

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_ELSE.reset();
                stream_statementSequence.reset();
                adaptor.addChild(root_2, stream_END.nextNode());

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
    // $ANTLR end "caseStatement"

    public static class casecase_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "casecase"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:738:1: casecase : ( caseLabelList ':' statementSequence )? -> caseLabelList ^( BLOCK_SCOPE statementSequence ) ;
    public final SSQSA_M2Parser.casecase_return casecase() throws RecognitionException {
        SSQSA_M2Parser.casecase_return retval = new SSQSA_M2Parser.casecase_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal277=null;
        SSQSA_M2Parser.caseLabelList_return caseLabelList276 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence278 = null;


        CommonTree char_literal277_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleSubtreeStream stream_caseLabelList=new RewriteRuleSubtreeStream(adaptor,"rule caseLabelList");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:738:10: ( ( caseLabelList ':' statementSequence )? -> caseLabelList ^( BLOCK_SCOPE statementSequence ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:739:2: ( caseLabelList ':' statementSequence )?
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:739:2: ( caseLabelList ':' statementSequence )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==NOT||LA96_0==LOGICAL_NOT_OP||(LA96_0>=PLUS_OP && LA96_0<=MINUS_OP)||(LA96_0>=IDENT && LA96_0<=REAL)||LA96_0==STRING||LA96_0==115||LA96_0==117) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:739:4: caseLabelList ':' statementSequence
                    {
                    pushFollow(FOLLOW_caseLabelList_in_casecase4660);
                    caseLabelList276=caseLabelList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_caseLabelList.add(caseLabelList276.getTree());
                    char_literal277=(Token)match(input,123,FOLLOW_123_in_casecase4662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal277);

                    pushFollow(FOLLOW_statementSequence_in_casecase4664);
                    statementSequence278=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence278.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: caseLabelList, statementSequence
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 739:43: -> caseLabelList ^( BLOCK_SCOPE statementSequence )
            {
                adaptor.addChild(root_0, stream_caseLabelList.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:739:60: ^( BLOCK_SCOPE statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_statementSequence.nextTree());

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
    // $ANTLR end "casecase"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:744:1: whileStatement : 'WHILE' expression 'DO' statementSequence 'END' -> ^( LOOP_STATEMENT ^( KEYWORD 'WHILE' ) ^( CONDITION expression ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) ) ;
    public final SSQSA_M2Parser.whileStatement_return whileStatement() throws RecognitionException {
        SSQSA_M2Parser.whileStatement_return retval = new SSQSA_M2Parser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal279=null;
        Token string_literal281=null;
        Token string_literal283=null;
        SSQSA_M2Parser.expression_return expression280 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence282 = null;


        CommonTree string_literal279_tree=null;
        CommonTree string_literal281_tree=null;
        CommonTree string_literal283_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:744:16: ( 'WHILE' expression 'DO' statementSequence 'END' -> ^( LOOP_STATEMENT ^( KEYWORD 'WHILE' ) ^( CONDITION expression ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:745:2: 'WHILE' expression 'DO' statementSequence 'END'
            {
            string_literal279=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement4690); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WHILE.add(string_literal279);

            pushFollow(FOLLOW_expression_in_whileStatement4692);
            expression280=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression280.getTree());
            string_literal281=(Token)match(input,DO,FOLLOW_DO_in_whileStatement4694); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(string_literal281);

            pushFollow(FOLLOW_statementSequence_in_whileStatement4696);
            statementSequence282=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence282.getTree());
            string_literal283=(Token)match(input,END,FOLLOW_END_in_whileStatement4698); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal283);



            // AST REWRITE
            // elements: DO, statementSequence, END, WHILE, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 746:2: -> ^( LOOP_STATEMENT ^( KEYWORD 'WHILE' ) ^( CONDITION expression ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:746:5: ^( LOOP_STATEMENT ^( KEYWORD 'WHILE' ) ^( CONDITION expression ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:746:22: ^( KEYWORD 'WHILE' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_WHILE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:746:41: ^( CONDITION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:746:65: ^( KEYWORD 'DO' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_DO.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:746:81: ^( BLOCK_SCOPE statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statementSequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:746:114: ^( KEYWORD 'END' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_END.nextNode());

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
    // $ANTLR end "whileStatement"

    public static class repeatStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "repeatStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:751:1: repeatStatement : 'REPEAT' statementSequence 'UNTIL' expression -> ^( LOOP_STATEMENT ^( KEYWORD 'REPEAT' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'UNTIL' ) ^( CONDITION expression ) ) ;
    public final SSQSA_M2Parser.repeatStatement_return repeatStatement() throws RecognitionException {
        SSQSA_M2Parser.repeatStatement_return retval = new SSQSA_M2Parser.repeatStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal284=null;
        Token string_literal286=null;
        SSQSA_M2Parser.statementSequence_return statementSequence285 = null;

        SSQSA_M2Parser.expression_return expression287 = null;


        CommonTree string_literal284_tree=null;
        CommonTree string_literal286_tree=null;
        RewriteRuleTokenStream stream_REPEAT=new RewriteRuleTokenStream(adaptor,"token REPEAT");
        RewriteRuleTokenStream stream_UNTIL=new RewriteRuleTokenStream(adaptor,"token UNTIL");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:751:17: ( 'REPEAT' statementSequence 'UNTIL' expression -> ^( LOOP_STATEMENT ^( KEYWORD 'REPEAT' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'UNTIL' ) ^( CONDITION expression ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:752:2: 'REPEAT' statementSequence 'UNTIL' expression
            {
            string_literal284=(Token)match(input,REPEAT,FOLLOW_REPEAT_in_repeatStatement4749); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_REPEAT.add(string_literal284);

            pushFollow(FOLLOW_statementSequence_in_repeatStatement4751);
            statementSequence285=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence285.getTree());
            string_literal286=(Token)match(input,UNTIL,FOLLOW_UNTIL_in_repeatStatement4753); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_UNTIL.add(string_literal286);

            pushFollow(FOLLOW_expression_in_repeatStatement4755);
            expression287=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression287.getTree());


            // AST REWRITE
            // elements: UNTIL, statementSequence, expression, REPEAT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 752:48: -> ^( LOOP_STATEMENT ^( KEYWORD 'REPEAT' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'UNTIL' ) ^( CONDITION expression ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:752:51: ^( LOOP_STATEMENT ^( KEYWORD 'REPEAT' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'UNTIL' ) ^( CONDITION expression ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:752:68: ^( KEYWORD 'REPEAT' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_REPEAT.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:752:88: ^( BLOCK_SCOPE statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statementSequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:752:121: ^( KEYWORD 'UNTIL' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_UNTIL.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:752:140: ^( CONDITION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

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
    // $ANTLR end "repeatStatement"

    public static class forStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:757:1: forStatement : 'FOR' ident ':=' expression 'TO' expression ( 'BY' constExpression )? 'DO' statementSequence 'END' -> ^( LOOP_STATEMENT ^( KEYWORD 'FOR' ) ^( INIT ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ^( NAME ident ) ^( VALUE expression ) ) ) ) ^( CONDITION ^( COMPARISON_OPERATOR 'TO' ) expression ) ^( STEP ( ^( ASSIGNMENT_STATEMENT ^( OPERATOR 'BY' ) constExpression ) )? ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) ) ;
    public final SSQSA_M2Parser.forStatement_return forStatement() throws RecognitionException {
        SSQSA_M2Parser.forStatement_return retval = new SSQSA_M2Parser.forStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal288=null;
        Token string_literal290=null;
        Token string_literal292=null;
        Token string_literal294=null;
        Token string_literal296=null;
        Token string_literal298=null;
        SSQSA_M2Parser.ident_return ident289 = null;

        SSQSA_M2Parser.expression_return expression291 = null;

        SSQSA_M2Parser.expression_return expression293 = null;

        SSQSA_M2Parser.constExpression_return constExpression295 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence297 = null;


        CommonTree string_literal288_tree=null;
        CommonTree string_literal290_tree=null;
        CommonTree string_literal292_tree=null;
        CommonTree string_literal294_tree=null;
        CommonTree string_literal296_tree=null;
        CommonTree string_literal298_tree=null;
        RewriteRuleTokenStream stream_ASSIGN_OP=new RewriteRuleTokenStream(adaptor,"token ASSIGN_OP");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_TO=new RewriteRuleTokenStream(adaptor,"token TO");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_constExpression=new RewriteRuleSubtreeStream(adaptor,"rule constExpression");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:757:14: ( 'FOR' ident ':=' expression 'TO' expression ( 'BY' constExpression )? 'DO' statementSequence 'END' -> ^( LOOP_STATEMENT ^( KEYWORD 'FOR' ) ^( INIT ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ^( NAME ident ) ^( VALUE expression ) ) ) ) ^( CONDITION ^( COMPARISON_OPERATOR 'TO' ) expression ) ^( STEP ( ^( ASSIGNMENT_STATEMENT ^( OPERATOR 'BY' ) constExpression ) )? ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:758:2: 'FOR' ident ':=' expression 'TO' expression ( 'BY' constExpression )? 'DO' statementSequence 'END'
            {
            string_literal288=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement4799); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_FOR.add(string_literal288);

            pushFollow(FOLLOW_ident_in_forStatement4801);
            ident289=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident289.getTree());
            string_literal290=(Token)match(input,ASSIGN_OP,FOLLOW_ASSIGN_OP_in_forStatement4803); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ASSIGN_OP.add(string_literal290);

            pushFollow(FOLLOW_expression_in_forStatement4805);
            expression291=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression291.getTree());
            string_literal292=(Token)match(input,TO,FOLLOW_TO_in_forStatement4807); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_TO.add(string_literal292);

            pushFollow(FOLLOW_expression_in_forStatement4809);
            expression293=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression293.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:758:46: ( 'BY' constExpression )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==BY) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:758:48: 'BY' constExpression
                    {
                    string_literal294=(Token)match(input,BY,FOLLOW_BY_in_forStatement4813); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BY.add(string_literal294);

                    pushFollow(FOLLOW_constExpression_in_forStatement4815);
                    constExpression295=constExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_constExpression.add(constExpression295.getTree());

                    }
                    break;

            }

            string_literal296=(Token)match(input,DO,FOLLOW_DO_in_forStatement4821); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(string_literal296);

            pushFollow(FOLLOW_statementSequence_in_forStatement4823);
            statementSequence297=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence297.getTree());
            string_literal298=(Token)match(input,END,FOLLOW_END_in_forStatement4825); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal298);



            // AST REWRITE
            // elements: TO, ident, DO, ASSIGN_OP, expression, END, FOR, statementSequence, BY, constExpression, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 760:2: -> ^( LOOP_STATEMENT ^( KEYWORD 'FOR' ) ^( INIT ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ^( NAME ident ) ^( VALUE expression ) ) ) ) ^( CONDITION ^( COMPARISON_OPERATOR 'TO' ) expression ) ^( STEP ( ^( ASSIGNMENT_STATEMENT ^( OPERATOR 'BY' ) constExpression ) )? ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:5: ^( LOOP_STATEMENT ^( KEYWORD 'FOR' ) ^( INIT ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ^( NAME ident ) ^( VALUE expression ) ) ) ) ^( CONDITION ^( COMPARISON_OPERATOR 'TO' ) expression ) ^( STEP ( ^( ASSIGNMENT_STATEMENT ^( OPERATOR 'BY' ) constExpression ) )? ) ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:22: ^( KEYWORD 'FOR' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_FOR.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:39: ^( INIT ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ^( NAME ident ) ^( VALUE expression ) ) ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT, "INIT"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:46: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ':=' ^( NAME ident ) ^( VALUE expression ) ) )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_3);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:69: ^( ASSIGN_OPERATOR ':=' ^( NAME ident ) ^( VALUE expression ) )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_4);

                adaptor.addChild(root_4, stream_ASSIGN_OP.nextNode());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:92: ^( NAME ident )
                {
                CommonTree root_5 = (CommonTree)adaptor.nil();
                root_5 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_5);

                adaptor.addChild(root_5, stream_ident.nextTree());

                adaptor.addChild(root_4, root_5);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:106: ^( VALUE expression )
                {
                CommonTree root_5 = (CommonTree)adaptor.nil();
                root_5 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_5);

                adaptor.addChild(root_5, stream_expression.nextTree());

                adaptor.addChild(root_4, root_5);
                }

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:130: ^( CONDITION ^( COMPARISON_OPERATOR 'TO' ) expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:143: ^( COMPARISON_OPERATOR 'TO' )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_3);

                adaptor.addChild(root_3, stream_TO.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:183: ^( STEP ( ^( ASSIGNMENT_STATEMENT ^( OPERATOR 'BY' ) constExpression ) )? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STEP, "STEP"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:190: ( ^( ASSIGNMENT_STATEMENT ^( OPERATOR 'BY' ) constExpression ) )?
                if ( stream_BY.hasNext()||stream_constExpression.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:191: ^( ASSIGNMENT_STATEMENT ^( OPERATOR 'BY' ) constExpression )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_3);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:760:214: ^( OPERATOR 'BY' )
                    {
                    CommonTree root_4 = (CommonTree)adaptor.nil();
                    root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_4);

                    adaptor.addChild(root_4, stream_BY.nextNode());

                    adaptor.addChild(root_3, root_4);
                    }
                    adaptor.addChild(root_3, stream_constExpression.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                }
                stream_BY.reset();
                stream_constExpression.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:761:2: ^( KEYWORD 'DO' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_DO.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:761:18: ^( BLOCK_SCOPE statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statementSequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:761:51: ^( KEYWORD 'END' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_END.nextNode());

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
    // $ANTLR end "forStatement"

    public static class loopStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "loopStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:766:1: loopStatement : 'LOOP' statementSequence 'END' -> ^( LOOP_STATEMENT ^( KEYWORD 'LOOP' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) ) ;
    public final SSQSA_M2Parser.loopStatement_return loopStatement() throws RecognitionException {
        SSQSA_M2Parser.loopStatement_return retval = new SSQSA_M2Parser.loopStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal299=null;
        Token string_literal301=null;
        SSQSA_M2Parser.statementSequence_return statementSequence300 = null;


        CommonTree string_literal299_tree=null;
        CommonTree string_literal301_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_LOOP=new RewriteRuleTokenStream(adaptor,"token LOOP");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:766:15: ( 'LOOP' statementSequence 'END' -> ^( LOOP_STATEMENT ^( KEYWORD 'LOOP' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:767:2: 'LOOP' statementSequence 'END'
            {
            string_literal299=(Token)match(input,LOOP,FOLLOW_LOOP_in_loopStatement4929); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LOOP.add(string_literal299);

            pushFollow(FOLLOW_statementSequence_in_loopStatement4931);
            statementSequence300=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence300.getTree());
            string_literal301=(Token)match(input,END,FOLLOW_END_in_loopStatement4933); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal301);



            // AST REWRITE
            // elements: statementSequence, LOOP, END
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 767:33: -> ^( LOOP_STATEMENT ^( KEYWORD 'LOOP' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:767:36: ^( LOOP_STATEMENT ^( KEYWORD 'LOOP' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:767:53: ^( KEYWORD 'LOOP' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_LOOP.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:767:72: ^( BLOCK_SCOPE statementSequence )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statementSequence.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:767:105: ^( KEYWORD 'END' )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_END.nextNode());

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
    // $ANTLR end "loopStatement"

    public static class withStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:772:1: withStatement : 'WITH' qualident ( designatorTails )? 'DO' statementSequence 'END' -> ^( KEYWORD 'WITH' ) qualident ( designatorTails )? ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) ;
    public final SSQSA_M2Parser.withStatement_return withStatement() throws RecognitionException {
        SSQSA_M2Parser.withStatement_return retval = new SSQSA_M2Parser.withStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal302=null;
        Token string_literal305=null;
        Token string_literal307=null;
        SSQSA_M2Parser.qualident_return qualident303 = null;

        SSQSA_M2Parser.designatorTails_return designatorTails304 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence306 = null;


        CommonTree string_literal302_tree=null;
        CommonTree string_literal305_tree=null;
        CommonTree string_literal307_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        RewriteRuleSubtreeStream stream_designatorTails=new RewriteRuleSubtreeStream(adaptor,"rule designatorTails");
        RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:772:15: ( 'WITH' qualident ( designatorTails )? 'DO' statementSequence 'END' -> ^( KEYWORD 'WITH' ) qualident ( designatorTails )? ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:773:2: 'WITH' qualident ( designatorTails )? 'DO' statementSequence 'END'
            {
            string_literal302=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement4971); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_WITH.add(string_literal302);

            pushFollow(FOLLOW_qualident_in_withStatement4973);
            qualident303=qualident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualident.add(qualident303.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:773:19: ( designatorTails )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==POINTER_OP||LA98_0==120) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: designatorTails
                    {
                    pushFollow(FOLLOW_designatorTails_in_withStatement4975);
                    designatorTails304=designatorTails();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_designatorTails.add(designatorTails304.getTree());

                    }
                    break;

            }

            string_literal305=(Token)match(input,DO,FOLLOW_DO_in_withStatement4978); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DO.add(string_literal305);

            pushFollow(FOLLOW_statementSequence_in_withStatement4980);
            statementSequence306=statementSequence();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence306.getTree());
            string_literal307=(Token)match(input,END,FOLLOW_END_in_withStatement4982); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal307);



            // AST REWRITE
            // elements: statementSequence, DO, designatorTails, qualident, END, WITH
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 773:65: -> ^( KEYWORD 'WITH' ) qualident ( designatorTails )? ^( KEYWORD 'DO' ) ^( BLOCK_SCOPE statementSequence ) ^( KEYWORD 'END' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:773:68: ^( KEYWORD 'WITH' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_WITH.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_qualident.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:773:96: ( designatorTails )?
                if ( stream_designatorTails.hasNext() ) {
                    adaptor.addChild(root_0, stream_designatorTails.nextTree());

                }
                stream_designatorTails.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:773:113: ^( KEYWORD 'DO' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_DO.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:773:129: ^( BLOCK_SCOPE statementSequence )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                adaptor.addChild(root_1, stream_statementSequence.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:773:162: ^( KEYWORD 'END' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_END.nextNode());

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
    // $ANTLR end "withStatement"

    public static class procedureDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:781:1: procedureDeclaration : ( 'PROCEDURE' ident ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' )? ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) ) );
    public final SSQSA_M2Parser.procedureDeclaration_return procedureDeclaration() throws RecognitionException {
        SSQSA_M2Parser.procedureDeclaration_return retval = new SSQSA_M2Parser.procedureDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal308=null;
        Token char_literal310=null;
        Token FORWARD314=null;
        Token string_literal315=null;
        Token char_literal317=null;
        Token char_literal319=null;
        Token char_literal321=null;
        Token char_literal322=null;
        Token char_literal324=null;
        Token char_literal326=null;
        Token FORWARD330=null;
        Token string_literal331=null;
        Token char_literal333=null;
        Token char_literal335=null;
        Token char_literal337=null;
        Token char_literal338=null;
        Token FORWARD342=null;
        SSQSA_M2Parser.ident_return ident309 = null;

        SSQSA_M2Parser.procDeclaration_return procDeclaration311 = null;

        SSQSA_M2Parser.procBlock_return procBlock312 = null;

        SSQSA_M2Parser.ident_return ident313 = null;

        SSQSA_M2Parser.ident_return ident316 = null;

        SSQSA_M2Parser.procParams_return procParams318 = null;

        SSQSA_M2Parser.procParams_return procParams320 = null;

        SSQSA_M2Parser.ident_return ident323 = null;

        SSQSA_M2Parser.ident_return ident325 = null;

        SSQSA_M2Parser.procDeclaration_return procDeclaration327 = null;

        SSQSA_M2Parser.procBlock_return procBlock328 = null;

        SSQSA_M2Parser.ident_return ident329 = null;

        SSQSA_M2Parser.ident_return ident332 = null;

        SSQSA_M2Parser.procParams_return procParams334 = null;

        SSQSA_M2Parser.procParams_return procParams336 = null;

        SSQSA_M2Parser.procDeclaration_return procDeclaration339 = null;

        SSQSA_M2Parser.procBlock_return procBlock340 = null;

        SSQSA_M2Parser.ident_return ident341 = null;


        CommonTree string_literal308_tree=null;
        CommonTree char_literal310_tree=null;
        CommonTree FORWARD314_tree=null;
        CommonTree string_literal315_tree=null;
        CommonTree char_literal317_tree=null;
        CommonTree char_literal319_tree=null;
        CommonTree char_literal321_tree=null;
        CommonTree char_literal322_tree=null;
        CommonTree char_literal324_tree=null;
        CommonTree char_literal326_tree=null;
        CommonTree FORWARD330_tree=null;
        CommonTree string_literal331_tree=null;
        CommonTree char_literal333_tree=null;
        CommonTree char_literal335_tree=null;
        CommonTree char_literal337_tree=null;
        CommonTree char_literal338_tree=null;
        CommonTree FORWARD342_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_FORWARD=new RewriteRuleTokenStream(adaptor,"token FORWARD");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_procDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procDeclaration");
        RewriteRuleSubtreeStream stream_procBlock=new RewriteRuleSubtreeStream(adaptor,"rule procBlock");
        RewriteRuleSubtreeStream stream_procParams=new RewriteRuleSubtreeStream(adaptor,"rule procParams");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:781:22: ( 'PROCEDURE' ident ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' )? ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) ) )
            int alt111=3;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==PROCEDURE) ) {
                int LA111_1 = input.LA(2);

                if ( (synpred138_SSQSA_M2()) ) {
                    alt111=1;
                }
                else if ( (synpred144_SSQSA_M2()) ) {
                    alt111=2;
                }
                else if ( (true) ) {
                    alt111=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 111, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:2: 'PROCEDURE' ident ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
                    {
                    string_literal308=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration5029); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROCEDURE.add(string_literal308);

                    pushFollow(FOLLOW_ident_in_procedureDeclaration5031);
                    ident309=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident309.getTree());
                    char_literal310=(Token)match(input,122,FOLLOW_122_in_procedureDeclaration5034); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal310);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:25: ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==BEGIN||LA100_0==CONST_||LA100_0==END||LA100_0==MODULE||LA100_0==PROCEDURE||LA100_0==TYPE||LA100_0==VAR) ) {
                        alt100=1;
                    }
                    else if ( (LA100_0==FORWARD) ) {
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
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:26: ( ( procDeclaration )* procBlock ident )
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:26: ( ( procDeclaration )* procBlock ident )
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:28: ( procDeclaration )* procBlock ident
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:28: ( procDeclaration )*
                            loop99:
                            do {
                                int alt99=2;
                                int LA99_0 = input.LA(1);

                                if ( (LA99_0==CONST_||LA99_0==MODULE||LA99_0==PROCEDURE||LA99_0==TYPE||LA99_0==VAR) ) {
                                    alt99=1;
                                }


                                switch (alt99) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: procDeclaration
                            	    {
                            	    pushFollow(FOLLOW_procDeclaration_in_procedureDeclaration5039);
                            	    procDeclaration311=procDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_procDeclaration.add(procDeclaration311.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop99;
                                }
                            } while (true);

                            pushFollow(FOLLOW_procBlock_in_procedureDeclaration5042);
                            procBlock312=procBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_procBlock.add(procBlock312.getTree());
                            pushFollow(FOLLOW_ident_in_procedureDeclaration5044);
                            ident313=ident();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ident.add(ident313.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:64: FORWARD
                            {
                            FORWARD314=(Token)match(input,FORWARD,FOLLOW_FORWARD_in_procedureDeclaration5049); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FORWARD.add(FORWARD314);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ident, procBlock, procDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 783:2: -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:783:5: ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:783:21: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:783:35: ^( TYPE VOID )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(VOID, "VOID"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:783:48: ^( FORMAL_PARAM_LIST )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:783:69: ^( BLOCK_SCOPE ( procDeclaration )* procBlock )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:783:83: ( procDeclaration )*
                        while ( stream_procDeclaration.hasNext() ) {
                            adaptor.addChild(root_2, stream_procDeclaration.nextTree());

                        }
                        stream_procDeclaration.reset();
                        adaptor.addChild(root_2, stream_procBlock.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:785:2: 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
                    {
                    string_literal315=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration5090); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROCEDURE.add(string_literal315);

                    pushFollow(FOLLOW_ident_in_procedureDeclaration5094);
                    ident316=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident316.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:787:2: ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:787:8: '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* )
                    {
                    char_literal317=(Token)match(input,115,FOLLOW_115_in_procedureDeclaration5104); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal317);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:14: ( procParams ( ';' procParams )* )?
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==VAR||LA102_0==IDENT) ) {
                        alt102=1;
                    }
                    switch (alt102) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:16: procParams ( ';' procParams )*
                            {
                            pushFollow(FOLLOW_procParams_in_procedureDeclaration5122);
                            procParams318=procParams();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_procParams.add(procParams318.getTree());
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:27: ( ';' procParams )*
                            loop101:
                            do {
                                int alt101=2;
                                int LA101_0 = input.LA(1);

                                if ( (LA101_0==122) ) {
                                    alt101=1;
                                }


                                switch (alt101) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:29: ';' procParams
                            	    {
                            	    char_literal319=(Token)match(input,122,FOLLOW_122_in_procedureDeclaration5126); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_122.add(char_literal319);

                            	    pushFollow(FOLLOW_procParams_in_procedureDeclaration5128);
                            	    procParams320=procParams();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_procParams.add(procParams320.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop101;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal321=(Token)match(input,116,FOLLOW_116_in_procedureDeclaration5143); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(char_literal321);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:8: ( ':' ident ( '.' ident )* )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:10: ':' ident ( '.' ident )*
                    {
                    char_literal322=(Token)match(input,123,FOLLOW_123_in_procedureDeclaration5155); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal322);

                    pushFollow(FOLLOW_ident_in_procedureDeclaration5157);
                    ident323=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident323.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:20: ( '.' ident )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==DOT) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:22: '.' ident
                    	    {
                    	    char_literal324=(Token)match(input,DOT,FOLLOW_DOT_in_procedureDeclaration5161); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal324);

                    	    pushFollow(FOLLOW_ident_in_procedureDeclaration5163);
                    	    ident325=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ident.add(ident325.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }


                    }

                    char_literal326=(Token)match(input,122,FOLLOW_122_in_procedureDeclaration5176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal326);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:2: ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==BEGIN||LA105_0==CONST_||LA105_0==END||LA105_0==MODULE||LA105_0==PROCEDURE||LA105_0==TYPE||LA105_0==VAR) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==FORWARD) ) {
                        alt105=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:3: ( ( procDeclaration )* procBlock ident )
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:3: ( ( procDeclaration )* procBlock ident )
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:5: ( procDeclaration )* procBlock ident
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:5: ( procDeclaration )*
                            loop104:
                            do {
                                int alt104=2;
                                int LA104_0 = input.LA(1);

                                if ( (LA104_0==CONST_||LA104_0==MODULE||LA104_0==PROCEDURE||LA104_0==TYPE||LA104_0==VAR) ) {
                                    alt104=1;
                                }


                                switch (alt104) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: procDeclaration
                            	    {
                            	    pushFollow(FOLLOW_procDeclaration_in_procedureDeclaration5183);
                            	    procDeclaration327=procDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_procDeclaration.add(procDeclaration327.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop104;
                                }
                            } while (true);

                            pushFollow(FOLLOW_procBlock_in_procedureDeclaration5186);
                            procBlock328=procBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_procBlock.add(procBlock328.getTree());
                            pushFollow(FOLLOW_ident_in_procedureDeclaration5188);
                            ident329=ident();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ident.add(ident329.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:41: FORWARD
                            {
                            FORWARD330=(Token)match(input,FORWARD,FOLLOW_FORWARD_in_procedureDeclaration5193); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FORWARD.add(FORWARD330);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: DOT, procDeclaration, procBlock, ident, ident, ident, procParams
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 794:2: -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:5: ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:21: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:35: ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:48: ( ^( SEPARATOR '.' ident ) )*
                        while ( stream_DOT.hasNext()||stream_ident.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:48: ^( SEPARATOR '.' ident )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                            adaptor.addChild(root_3, stream_DOT.nextNode());
                            adaptor.addChild(root_3, stream_ident.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_DOT.reset();
                        stream_ident.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:74: ^( FORMAL_PARAM_LIST ( procParams )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:94: ( procParams )*
                        while ( stream_procParams.hasNext() ) {
                            adaptor.addChild(root_2, stream_procParams.nextTree());

                        }
                        stream_procParams.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:107: ^( BLOCK_SCOPE ( procDeclaration )* procBlock )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:794:121: ( procDeclaration )*
                        while ( stream_procDeclaration.hasNext() ) {
                            adaptor.addChild(root_2, stream_procDeclaration.nextTree());

                        }
                        stream_procDeclaration.reset();
                        adaptor.addChild(root_2, stream_procBlock.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:796:2: 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' )? ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
                    {
                    string_literal331=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureDeclaration5246); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROCEDURE.add(string_literal331);

                    pushFollow(FOLLOW_ident_in_procedureDeclaration5250);
                    ident332=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident332.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:798:2: ( '(' ( procParams ( ';' procParams )* )? ')' )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==115) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:798:8: '(' ( procParams ( ';' procParams )* )? ')'
                            {
                            char_literal333=(Token)match(input,115,FOLLOW_115_in_procedureDeclaration5260); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_115.add(char_literal333);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:799:14: ( procParams ( ';' procParams )* )?
                            int alt107=2;
                            int LA107_0 = input.LA(1);

                            if ( (LA107_0==VAR||LA107_0==IDENT) ) {
                                alt107=1;
                            }
                            switch (alt107) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:799:16: procParams ( ';' procParams )*
                                    {
                                    pushFollow(FOLLOW_procParams_in_procedureDeclaration5278);
                                    procParams334=procParams();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_procParams.add(procParams334.getTree());
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:799:27: ( ';' procParams )*
                                    loop106:
                                    do {
                                        int alt106=2;
                                        int LA106_0 = input.LA(1);

                                        if ( (LA106_0==122) ) {
                                            alt106=1;
                                        }


                                        switch (alt106) {
                                    	case 1 :
                                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:799:29: ';' procParams
                                    	    {
                                    	    char_literal335=(Token)match(input,122,FOLLOW_122_in_procedureDeclaration5282); if (state.failed) return retval; 
                                    	    if ( state.backtracking==0 ) stream_122.add(char_literal335);

                                    	    pushFollow(FOLLOW_procParams_in_procedureDeclaration5284);
                                    	    procParams336=procParams();

                                    	    state._fsp--;
                                    	    if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) stream_procParams.add(procParams336.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop106;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            char_literal337=(Token)match(input,116,FOLLOW_116_in_procedureDeclaration5299); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_116.add(char_literal337);


                            }
                            break;

                    }

                    char_literal338=(Token)match(input,122,FOLLOW_122_in_procedureDeclaration5308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal338);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:803:2: ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==BEGIN||LA110_0==CONST_||LA110_0==END||LA110_0==MODULE||LA110_0==PROCEDURE||LA110_0==TYPE||LA110_0==VAR) ) {
                        alt110=1;
                    }
                    else if ( (LA110_0==FORWARD) ) {
                        alt110=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 110, 0, input);

                        throw nvae;
                    }
                    switch (alt110) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:803:3: ( ( procDeclaration )* procBlock ident )
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:803:3: ( ( procDeclaration )* procBlock ident )
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:803:5: ( procDeclaration )* procBlock ident
                            {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:803:5: ( procDeclaration )*
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( (LA109_0==CONST_||LA109_0==MODULE||LA109_0==PROCEDURE||LA109_0==TYPE||LA109_0==VAR) ) {
                                    alt109=1;
                                }


                                switch (alt109) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: procDeclaration
                            	    {
                            	    pushFollow(FOLLOW_procDeclaration_in_procedureDeclaration5315);
                            	    procDeclaration339=procDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_procDeclaration.add(procDeclaration339.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop109;
                                }
                            } while (true);

                            pushFollow(FOLLOW_procBlock_in_procedureDeclaration5318);
                            procBlock340=procBlock();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_procBlock.add(procBlock340.getTree());
                            pushFollow(FOLLOW_ident_in_procedureDeclaration5320);
                            ident341=ident();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ident.add(ident341.getTree());

                            }


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:803:41: FORWARD
                            {
                            FORWARD342=(Token)match(input,FORWARD,FOLLOW_FORWARD_in_procedureDeclaration5325); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_FORWARD.add(FORWARD342);


                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: procDeclaration, procParams, ident, procBlock
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 804:2: -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:804:5: ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) ^( BLOCK_SCOPE ( procDeclaration )* procBlock ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:804:21: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:804:35: ^( TYPE VOID )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(VOID, "VOID"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:804:48: ^( FORMAL_PARAM_LIST ( procParams )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:804:68: ( procParams )*
                        while ( stream_procParams.hasNext() ) {
                            adaptor.addChild(root_2, stream_procParams.nextTree());

                        }
                        stream_procParams.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:804:81: ^( BLOCK_SCOPE ( procDeclaration )* procBlock )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:804:95: ( procDeclaration )*
                        while ( stream_procDeclaration.hasNext() ) {
                            adaptor.addChild(root_2, stream_procDeclaration.nextTree());

                        }
                        stream_procDeclaration.reset();
                        adaptor.addChild(root_2, stream_procBlock.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

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
    // $ANTLR end "procedureDeclaration"

    public static class procParams_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procParams"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:807:1: procParams : ( 'VAR' )? ident ( ',' ident )* ':' formalType -> ( ^( PARAMETER_DECL ^( NAME ident ) formalType ) )* ;
    public final SSQSA_M2Parser.procParams_return procParams() throws RecognitionException {
        SSQSA_M2Parser.procParams_return retval = new SSQSA_M2Parser.procParams_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal343=null;
        Token char_literal345=null;
        Token char_literal347=null;
        SSQSA_M2Parser.ident_return ident344 = null;

        SSQSA_M2Parser.ident_return ident346 = null;

        SSQSA_M2Parser.formalType_return formalType348 = null;


        CommonTree string_literal343_tree=null;
        CommonTree char_literal345_tree=null;
        CommonTree char_literal347_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_formalType=new RewriteRuleSubtreeStream(adaptor,"rule formalType");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:808:2: ( ( 'VAR' )? ident ( ',' ident )* ':' formalType -> ( ^( PARAMETER_DECL ^( NAME ident ) formalType ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:808:4: ( 'VAR' )? ident ( ',' ident )* ':' formalType
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:808:4: ( 'VAR' )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==VAR) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:808:6: 'VAR'
                    {
                    string_literal343=(Token)match(input,VAR,FOLLOW_VAR_in_procParams5376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal343);


                    }
                    break;

            }

            pushFollow(FOLLOW_ident_in_procParams5381);
            ident344=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident344.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:808:21: ( ',' ident )*
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( (LA113_0==118) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:808:23: ',' ident
            	    {
            	    char_literal345=(Token)match(input,118,FOLLOW_118_in_procParams5385); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_118.add(char_literal345);

            	    pushFollow(FOLLOW_ident_in_procParams5387);
            	    ident346=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident346.getTree());

            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);

            char_literal347=(Token)match(input,123,FOLLOW_123_in_procParams5392); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal347);

            pushFollow(FOLLOW_formalType_in_procParams5394);
            formalType348=formalType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formalType.add(formalType348.getTree());


            // AST REWRITE
            // elements: ident, formalType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 809:2: -> ( ^( PARAMETER_DECL ^( NAME ident ) formalType ) )*
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:809:5: ( ^( PARAMETER_DECL ^( NAME ident ) formalType ) )*
                while ( stream_ident.hasNext()||stream_formalType.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:809:6: ^( PARAMETER_DECL ^( NAME ident ) formalType )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_1);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:809:24: ^( NAME ident )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_ident.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }
                    adaptor.addChild(root_1, stream_formalType.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ident.reset();
                stream_formalType.reset();

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
    // $ANTLR end "procParams"

    public static class procDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:814:1: procDeclaration : ( CONST_ ( constantDeclaration ';' )* -> IGNORE | 'TYPE' ( typeDeclaration ';' )* -> IGNORE | 'VAR' ( localVariableDeclaration ';' )* -> ( localVariableDeclaration )* | procedureDeclaration ';' -> IGNORE | moduleDeclaration ';' -> IGNORE );
    public final SSQSA_M2Parser.procDeclaration_return procDeclaration() throws RecognitionException {
        SSQSA_M2Parser.procDeclaration_return retval = new SSQSA_M2Parser.procDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST_349=null;
        Token char_literal351=null;
        Token string_literal352=null;
        Token char_literal354=null;
        Token string_literal355=null;
        Token char_literal357=null;
        Token char_literal359=null;
        Token char_literal361=null;
        SSQSA_M2Parser.constantDeclaration_return constantDeclaration350 = null;

        SSQSA_M2Parser.typeDeclaration_return typeDeclaration353 = null;

        SSQSA_M2Parser.localVariableDeclaration_return localVariableDeclaration356 = null;

        SSQSA_M2Parser.procedureDeclaration_return procedureDeclaration358 = null;

        SSQSA_M2Parser.moduleDeclaration_return moduleDeclaration360 = null;


        CommonTree CONST_349_tree=null;
        CommonTree char_literal351_tree=null;
        CommonTree string_literal352_tree=null;
        CommonTree char_literal354_tree=null;
        CommonTree string_literal355_tree=null;
        CommonTree char_literal357_tree=null;
        CommonTree char_literal359_tree=null;
        CommonTree char_literal361_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_CONST_=new RewriteRuleTokenStream(adaptor,"token CONST_");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_constantDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclaration");
        RewriteRuleSubtreeStream stream_localVariableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule localVariableDeclaration");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_moduleDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule moduleDeclaration");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:814:17: ( CONST_ ( constantDeclaration ';' )* -> IGNORE | 'TYPE' ( typeDeclaration ';' )* -> IGNORE | 'VAR' ( localVariableDeclaration ';' )* -> ( localVariableDeclaration )* | procedureDeclaration ';' -> IGNORE | moduleDeclaration ';' -> IGNORE )
            int alt117=5;
            switch ( input.LA(1) ) {
            case CONST_:
                {
                alt117=1;
                }
                break;
            case TYPE:
                {
                alt117=2;
                }
                break;
            case VAR:
                {
                alt117=3;
                }
                break;
            case PROCEDURE:
                {
                alt117=4;
                }
                break;
            case MODULE:
                {
                alt117=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:815:2: CONST_ ( constantDeclaration ';' )*
                    {
                    CONST_349=(Token)match(input,CONST_,FOLLOW_CONST__in_procDeclaration5428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST_.add(CONST_349);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:815:9: ( constantDeclaration ';' )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==IDENT) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:815:11: constantDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_constantDeclaration_in_procDeclaration5432);
                    	    constantDeclaration350=constantDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_constantDeclaration.add(constantDeclaration350.getTree());
                    	    char_literal351=(Token)match(input,122,FOLLOW_122_in_procDeclaration5434); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal351);


                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 815:39: -> IGNORE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IGNORE, "IGNORE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:816:9: 'TYPE' ( typeDeclaration ';' )*
                    {
                    string_literal352=(Token)match(input,TYPE,FOLLOW_TYPE_in_procDeclaration5454); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(string_literal352);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:816:16: ( typeDeclaration ';' )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==IDENT) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:816:18: typeDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_typeDeclaration_in_procDeclaration5458);
                    	    typeDeclaration353=typeDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration353.getTree());
                    	    char_literal354=(Token)match(input,122,FOLLOW_122_in_procDeclaration5460); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal354);


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 816:42: -> IGNORE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IGNORE, "IGNORE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:817:2: 'VAR' ( localVariableDeclaration ';' )*
                    {
                    string_literal355=(Token)match(input,VAR,FOLLOW_VAR_in_procDeclaration5473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal355);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:817:8: ( localVariableDeclaration ';' )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==IDENT) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:817:10: localVariableDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_localVariableDeclaration_in_procDeclaration5477);
                    	    localVariableDeclaration356=localVariableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_localVariableDeclaration.add(localVariableDeclaration356.getTree());
                    	    char_literal357=(Token)match(input,122,FOLLOW_122_in_procDeclaration5479); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal357);


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: localVariableDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 817:43: -> ( localVariableDeclaration )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:817:46: ( localVariableDeclaration )*
                        while ( stream_localVariableDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_localVariableDeclaration.nextTree());

                        }
                        stream_localVariableDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:818:2: procedureDeclaration ';'
                    {
                    pushFollow(FOLLOW_procedureDeclaration_in_procDeclaration5492);
                    procedureDeclaration358=procedureDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration358.getTree());
                    char_literal359=(Token)match(input,122,FOLLOW_122_in_procDeclaration5494); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal359);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 818:27: -> IGNORE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IGNORE, "IGNORE"));

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:819:2: moduleDeclaration ';'
                    {
                    pushFollow(FOLLOW_moduleDeclaration_in_procDeclaration5504);
                    moduleDeclaration360=moduleDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_moduleDeclaration.add(moduleDeclaration360.getTree());
                    char_literal361=(Token)match(input,122,FOLLOW_122_in_procDeclaration5506); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal361);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 819:24: -> IGNORE
                    {
                        adaptor.addChild(root_0, (CommonTree)adaptor.create(IGNORE, "IGNORE"));

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
    // $ANTLR end "procDeclaration"

    public static class procBlock_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procBlock"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:823:1: procBlock : ( 'BEGIN' statementSequence )? 'END' -> ( 'BEGIN' statementSequence )? 'END' ;
    public final SSQSA_M2Parser.procBlock_return procBlock() throws RecognitionException {
        SSQSA_M2Parser.procBlock_return retval = new SSQSA_M2Parser.procBlock_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal362=null;
        Token string_literal364=null;
        SSQSA_M2Parser.statementSequence_return statementSequence363 = null;


        CommonTree string_literal362_tree=null;
        CommonTree string_literal364_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:824:2: ( ( 'BEGIN' statementSequence )? 'END' -> ( 'BEGIN' statementSequence )? 'END' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:824:4: ( 'BEGIN' statementSequence )? 'END'
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:824:4: ( 'BEGIN' statementSequence )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==BEGIN) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:824:6: 'BEGIN' statementSequence
                    {
                    string_literal362=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_procBlock5527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(string_literal362);

                    pushFollow(FOLLOW_statementSequence_in_procBlock5529);
                    statementSequence363=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence363.getTree());

                    }
                    break;

            }

            string_literal364=(Token)match(input,END,FOLLOW_END_in_procBlock5534); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal364);



            // AST REWRITE
            // elements: statementSequence, END, BEGIN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 824:41: -> ( 'BEGIN' statementSequence )? 'END'
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:824:44: ( 'BEGIN' statementSequence )?
                if ( stream_statementSequence.hasNext()||stream_BEGIN.hasNext() ) {
                    adaptor.addChild(root_0, stream_BEGIN.nextNode());
                    adaptor.addChild(root_0, stream_statementSequence.nextTree());

                }
                stream_statementSequence.reset();
                stream_BEGIN.reset();
                adaptor.addChild(root_0, stream_END.nextNode());

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
    // $ANTLR end "procBlock"

    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:828:1: localVariableDeclaration : ident ( machineAddress )? ( ',' ident ( machineAddress )? )* ':' type -> ( ^( VAR_DECL ^( NAME ident ) type ) )* ;
    public final SSQSA_M2Parser.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        SSQSA_M2Parser.localVariableDeclaration_return retval = new SSQSA_M2Parser.localVariableDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal367=null;
        Token char_literal370=null;
        SSQSA_M2Parser.ident_return ident365 = null;

        SSQSA_M2Parser.machineAddress_return machineAddress366 = null;

        SSQSA_M2Parser.ident_return ident368 = null;

        SSQSA_M2Parser.machineAddress_return machineAddress369 = null;

        SSQSA_M2Parser.type_return type371 = null;


        CommonTree char_literal367_tree=null;
        CommonTree char_literal370_tree=null;
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_machineAddress=new RewriteRuleSubtreeStream(adaptor,"rule machineAddress");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:829:2: ( ident ( machineAddress )? ( ',' ident ( machineAddress )? )* ':' type -> ( ^( VAR_DECL ^( NAME ident ) type ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:829:4: ident ( machineAddress )? ( ',' ident ( machineAddress )? )* ':' type
            {
            pushFollow(FOLLOW_ident_in_localVariableDeclaration5561);
            ident365=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident365.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:829:10: ( machineAddress )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==120) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: machineAddress
                    {
                    pushFollow(FOLLOW_machineAddress_in_localVariableDeclaration5563);
                    machineAddress366=machineAddress();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_machineAddress.add(machineAddress366.getTree());

                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:829:26: ( ',' ident ( machineAddress )? )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==118) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:829:28: ',' ident ( machineAddress )?
            	    {
            	    char_literal367=(Token)match(input,118,FOLLOW_118_in_localVariableDeclaration5568); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_118.add(char_literal367);

            	    pushFollow(FOLLOW_ident_in_localVariableDeclaration5570);
            	    ident368=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident368.getTree());
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:829:38: ( machineAddress )?
            	    int alt120=2;
            	    int LA120_0 = input.LA(1);

            	    if ( (LA120_0==120) ) {
            	        alt120=1;
            	    }
            	    switch (alt120) {
            	        case 1 :
            	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: machineAddress
            	            {
            	            pushFollow(FOLLOW_machineAddress_in_localVariableDeclaration5572);
            	            machineAddress369=machineAddress();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) stream_machineAddress.add(machineAddress369.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);

            char_literal370=(Token)match(input,123,FOLLOW_123_in_localVariableDeclaration5577); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_123.add(char_literal370);

            pushFollow(FOLLOW_type_in_localVariableDeclaration5579);
            type371=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_type.add(type371.getTree());


            // AST REWRITE
            // elements: type, ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 830:4: -> ( ^( VAR_DECL ^( NAME ident ) type ) )*
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:830:7: ( ^( VAR_DECL ^( NAME ident ) type ) )*
                while ( stream_type.hasNext()||stream_ident.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:830:8: ^( VAR_DECL ^( NAME ident ) type )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:830:19: ^( NAME ident )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_ident.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }
                    adaptor.addChild(root_1, stream_type.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_type.reset();
                stream_ident.reset();

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
    // $ANTLR end "localVariableDeclaration"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:834:1: block : ( declaration )* ( 'BEGIN' statementSequence )? 'END' -> ( declaration )* ^( BLOCK_SCOPE ( 'BEGIN' statementSequence )? 'END' ) ;
    public final SSQSA_M2Parser.block_return block() throws RecognitionException {
        SSQSA_M2Parser.block_return retval = new SSQSA_M2Parser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal373=null;
        Token string_literal375=null;
        SSQSA_M2Parser.declaration_return declaration372 = null;

        SSQSA_M2Parser.statementSequence_return statementSequence374 = null;


        CommonTree string_literal373_tree=null;
        CommonTree string_literal375_tree=null;
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleTokenStream stream_BEGIN=new RewriteRuleTokenStream(adaptor,"token BEGIN");
        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        RewriteRuleSubtreeStream stream_statementSequence=new RewriteRuleSubtreeStream(adaptor,"rule statementSequence");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:834:7: ( ( declaration )* ( 'BEGIN' statementSequence )? 'END' -> ( declaration )* ^( BLOCK_SCOPE ( 'BEGIN' statementSequence )? 'END' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:835:2: ( declaration )* ( 'BEGIN' statementSequence )? 'END'
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:835:2: ( declaration )*
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( (LA122_0==CONST_||LA122_0==MODULE||LA122_0==PROCEDURE||LA122_0==TYPE||LA122_0==VAR) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:835:4: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_block5615);
            	    declaration372=declaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_declaration.add(declaration372.getTree());

            	    }
            	    break;

            	default :
            	    break loop122;
                }
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:836:2: ( 'BEGIN' statementSequence )?
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==BEGIN) ) {
                alt123=1;
            }
            switch (alt123) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:836:4: 'BEGIN' statementSequence
                    {
                    string_literal373=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_block5623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_BEGIN.add(string_literal373);

                    pushFollow(FOLLOW_statementSequence_in_block5625);
                    statementSequence374=statementSequence();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_statementSequence.add(statementSequence374.getTree());

                    }
                    break;

            }

            string_literal375=(Token)match(input,END,FOLLOW_END_in_block5630); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal375);



            // AST REWRITE
            // elements: BEGIN, statementSequence, declaration, END
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 836:39: -> ( declaration )* ^( BLOCK_SCOPE ( 'BEGIN' statementSequence )? 'END' )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:836:42: ( declaration )*
                while ( stream_declaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_declaration.nextTree());

                }
                stream_declaration.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:836:59: ^( BLOCK_SCOPE ( 'BEGIN' statementSequence )? 'END' )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:836:74: ( 'BEGIN' statementSequence )?
                if ( stream_BEGIN.hasNext()||stream_statementSequence.hasNext() ) {
                    adaptor.addChild(root_1, stream_BEGIN.nextNode());
                    adaptor.addChild(root_1, stream_statementSequence.nextTree());

                }
                stream_BEGIN.reset();
                stream_statementSequence.reset();
                adaptor.addChild(root_1, stream_END.nextNode());

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
    // $ANTLR end "block"

    public static class declaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:843:1: declaration : ( CONST_ ( constantDeclaration ';' )* -> ( constantDeclaration )* | 'TYPE' ( typeDeclaration ';' )* -> ( typeDeclaration )* | 'VAR' ( variableDeclaration ';' )* -> ( variableDeclaration )* | procedureDeclaration ';' -> procedureDeclaration | moduleDeclaration ';' -> moduleDeclaration );
    public final SSQSA_M2Parser.declaration_return declaration() throws RecognitionException {
        SSQSA_M2Parser.declaration_return retval = new SSQSA_M2Parser.declaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST_376=null;
        Token char_literal378=null;
        Token string_literal379=null;
        Token char_literal381=null;
        Token string_literal382=null;
        Token char_literal384=null;
        Token char_literal386=null;
        Token char_literal388=null;
        SSQSA_M2Parser.constantDeclaration_return constantDeclaration377 = null;

        SSQSA_M2Parser.typeDeclaration_return typeDeclaration380 = null;

        SSQSA_M2Parser.variableDeclaration_return variableDeclaration383 = null;

        SSQSA_M2Parser.procedureDeclaration_return procedureDeclaration385 = null;

        SSQSA_M2Parser.moduleDeclaration_return moduleDeclaration387 = null;


        CommonTree CONST_376_tree=null;
        CommonTree char_literal378_tree=null;
        CommonTree string_literal379_tree=null;
        CommonTree char_literal381_tree=null;
        CommonTree string_literal382_tree=null;
        CommonTree char_literal384_tree=null;
        CommonTree char_literal386_tree=null;
        CommonTree char_literal388_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_CONST_=new RewriteRuleTokenStream(adaptor,"token CONST_");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_procedureDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule procedureDeclaration");
        RewriteRuleSubtreeStream stream_constantDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclaration");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        RewriteRuleSubtreeStream stream_moduleDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule moduleDeclaration");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:843:13: ( CONST_ ( constantDeclaration ';' )* -> ( constantDeclaration )* | 'TYPE' ( typeDeclaration ';' )* -> ( typeDeclaration )* | 'VAR' ( variableDeclaration ';' )* -> ( variableDeclaration )* | procedureDeclaration ';' -> procedureDeclaration | moduleDeclaration ';' -> moduleDeclaration )
            int alt127=5;
            switch ( input.LA(1) ) {
            case CONST_:
                {
                alt127=1;
                }
                break;
            case TYPE:
                {
                alt127=2;
                }
                break;
            case VAR:
                {
                alt127=3;
                }
                break;
            case PROCEDURE:
                {
                alt127=4;
                }
                break;
            case MODULE:
                {
                alt127=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:844:2: CONST_ ( constantDeclaration ';' )*
                    {
                    CONST_376=(Token)match(input,CONST_,FOLLOW_CONST__in_declaration5670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST_.add(CONST_376);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:844:9: ( constantDeclaration ';' )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==IDENT) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:844:11: constantDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_constantDeclaration_in_declaration5674);
                    	    constantDeclaration377=constantDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_constantDeclaration.add(constantDeclaration377.getTree());
                    	    char_literal378=(Token)match(input,122,FOLLOW_122_in_declaration5676); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal378);


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: constantDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 844:38: -> ( constantDeclaration )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:844:41: ( constantDeclaration )*
                        while ( stream_constantDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_constantDeclaration.nextTree());

                        }
                        stream_constantDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:845:2: 'TYPE' ( typeDeclaration ';' )*
                    {
                    string_literal379=(Token)match(input,TYPE,FOLLOW_TYPE_in_declaration5692); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(string_literal379);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:845:9: ( typeDeclaration ';' )*
                    loop125:
                    do {
                        int alt125=2;
                        int LA125_0 = input.LA(1);

                        if ( (LA125_0==IDENT) ) {
                            alt125=1;
                        }


                        switch (alt125) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:845:11: typeDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_typeDeclaration_in_declaration5696);
                    	    typeDeclaration380=typeDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_typeDeclaration.add(typeDeclaration380.getTree());
                    	    char_literal381=(Token)match(input,122,FOLLOW_122_in_declaration5698); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal381);


                    	    }
                    	    break;

                    	default :
                    	    break loop125;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: typeDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 845:35: -> ( typeDeclaration )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:845:38: ( typeDeclaration )*
                        while ( stream_typeDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_typeDeclaration.nextTree());

                        }
                        stream_typeDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:846:2: 'VAR' ( variableDeclaration ';' )*
                    {
                    string_literal382=(Token)match(input,VAR,FOLLOW_VAR_in_declaration5717); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal382);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:846:8: ( variableDeclaration ';' )*
                    loop126:
                    do {
                        int alt126=2;
                        int LA126_0 = input.LA(1);

                        if ( (LA126_0==IDENT) ) {
                            alt126=1;
                        }


                        switch (alt126) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:846:10: variableDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_variableDeclaration_in_declaration5721);
                    	    variableDeclaration383=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration383.getTree());
                    	    char_literal384=(Token)match(input,122,FOLLOW_122_in_declaration5723); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal384);


                    	    }
                    	    break;

                    	default :
                    	    break loop126;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: variableDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 846:37: -> ( variableDeclaration )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:846:40: ( variableDeclaration )*
                        while ( stream_variableDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_variableDeclaration.nextTree());

                        }
                        stream_variableDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:847:2: procedureDeclaration ';'
                    {
                    pushFollow(FOLLOW_procedureDeclaration_in_declaration5740);
                    procedureDeclaration385=procedureDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureDeclaration.add(procedureDeclaration385.getTree());
                    char_literal386=(Token)match(input,122,FOLLOW_122_in_declaration5742); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal386);



                    // AST REWRITE
                    // elements: procedureDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 847:27: -> procedureDeclaration
                    {
                        adaptor.addChild(root_0, stream_procedureDeclaration.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:848:2: moduleDeclaration ';'
                    {
                    pushFollow(FOLLOW_moduleDeclaration_in_declaration5751);
                    moduleDeclaration387=moduleDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_moduleDeclaration.add(moduleDeclaration387.getTree());
                    char_literal388=(Token)match(input,122,FOLLOW_122_in_declaration5753); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal388);



                    // AST REWRITE
                    // elements: moduleDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 848:24: -> moduleDeclaration
                    {
                        adaptor.addChild(root_0, stream_moduleDeclaration.nextTree());

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
    // $ANTLR end "declaration"

    public static class moduleDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "moduleDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:853:1: moduleDeclaration : 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block ) ;
    public final SSQSA_M2Parser.moduleDeclaration_return moduleDeclaration() throws RecognitionException {
        SSQSA_M2Parser.moduleDeclaration_return retval = new SSQSA_M2Parser.moduleDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal389=null;
        Token char_literal392=null;
        SSQSA_M2Parser.ident_return ident390 = null;

        SSQSA_M2Parser.priority_return priority391 = null;

        SSQSA_M2Parser.importList_return importList393 = null;

        SSQSA_M2Parser.export_return export394 = null;

        SSQSA_M2Parser.block_return block395 = null;

        SSQSA_M2Parser.ident_return ident396 = null;


        CommonTree string_literal389_tree=null;
        CommonTree char_literal392_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleSubtreeStream stream_importList=new RewriteRuleSubtreeStream(adaptor,"rule importList");
        RewriteRuleSubtreeStream stream_export=new RewriteRuleSubtreeStream(adaptor,"rule export");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_priority=new RewriteRuleSubtreeStream(adaptor,"rule priority");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:853:19: ( 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:854:2: 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident
            {
            string_literal389=(Token)match(input,MODULE,FOLLOW_MODULE_in_moduleDeclaration5771); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(string_literal389);

            pushFollow(FOLLOW_ident_in_moduleDeclaration5773);
            ident390=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident390.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:854:17: ( priority )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==120) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:854:19: priority
                    {
                    pushFollow(FOLLOW_priority_in_moduleDeclaration5777);
                    priority391=priority();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_priority.add(priority391.getTree());

                    }
                    break;

            }

            char_literal392=(Token)match(input,122,FOLLOW_122_in_moduleDeclaration5782); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal392);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:854:35: ( importList )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==FROM||LA129_0==IMPORT) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:854:37: importList
            	    {
            	    pushFollow(FOLLOW_importList_in_moduleDeclaration5786);
            	    importList393=importList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_importList.add(importList393.getTree());

            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:854:51: ( export )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==EXPORT) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:854:53: export
            	    {
            	    pushFollow(FOLLOW_export_in_moduleDeclaration5793);
            	    export394=export();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_export.add(export394.getTree());

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            pushFollow(FOLLOW_block_in_moduleDeclaration5798);
            block395=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_block.add(block395.getTree());
            pushFollow(FOLLOW_ident_in_moduleDeclaration5800);
            ident396=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident396.getTree());


            // AST REWRITE
            // elements: ident, importList, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 855:2: -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:855:5: ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONCRETE_UNIT_DECL, "CONCRETE_UNIT_DECL"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:855:26: ^( NAME ident )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_ident.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:855:40: ( importList )*
                while ( stream_importList.hasNext() ) {
                    adaptor.addChild(root_1, stream_importList.nextTree());

                }
                stream_importList.reset();
                adaptor.addChild(root_1, stream_block.nextTree());

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
    // $ANTLR end "moduleDeclaration"

    public static class priority_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "priority"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:860:1: priority : '[' constExpression ']' ;
    public final SSQSA_M2Parser.priority_return priority() throws RecognitionException {
        SSQSA_M2Parser.priority_return retval = new SSQSA_M2Parser.priority_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal397=null;
        Token char_literal399=null;
        SSQSA_M2Parser.constExpression_return constExpression398 = null;


        CommonTree char_literal397_tree=null;
        CommonTree char_literal399_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:860:10: ( '[' constExpression ']' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:861:2: '[' constExpression ']'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal397=(Token)match(input,120,FOLLOW_120_in_priority5831); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal397_tree = (CommonTree)adaptor.create(char_literal397);
            adaptor.addChild(root_0, char_literal397_tree);
            }
            pushFollow(FOLLOW_constExpression_in_priority5833);
            constExpression398=constExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression398.getTree());
            char_literal399=(Token)match(input,121,FOLLOW_121_in_priority5835); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal399_tree = (CommonTree)adaptor.create(char_literal399);
            adaptor.addChild(root_0, char_literal399_tree);
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
    // $ANTLR end "priority"

    public static class importList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:865:1: importList : ( 'FROM' mn= ident 'IMPORT' importIdentList[$mn.tree] ';' -> importIdentList | 'IMPORT' ident ( ',' ident )* ';' -> ( ^( IMPORT_DECL ^( NAME ident ) ) )* );
    public final SSQSA_M2Parser.importList_return importList() throws RecognitionException {
        SSQSA_M2Parser.importList_return retval = new SSQSA_M2Parser.importList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal400=null;
        Token string_literal401=null;
        Token char_literal403=null;
        Token string_literal404=null;
        Token char_literal406=null;
        Token char_literal408=null;
        SSQSA_M2Parser.ident_return mn = null;

        SSQSA_M2Parser.importIdentList_return importIdentList402 = null;

        SSQSA_M2Parser.ident_return ident405 = null;

        SSQSA_M2Parser.ident_return ident407 = null;


        CommonTree string_literal400_tree=null;
        CommonTree string_literal401_tree=null;
        CommonTree char_literal403_tree=null;
        CommonTree string_literal404_tree=null;
        CommonTree char_literal406_tree=null;
        CommonTree char_literal408_tree=null;
        RewriteRuleTokenStream stream_IMPORT=new RewriteRuleTokenStream(adaptor,"token IMPORT");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_FROM=new RewriteRuleTokenStream(adaptor,"token FROM");
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_importIdentList=new RewriteRuleSubtreeStream(adaptor,"rule importIdentList");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:865:12: ( 'FROM' mn= ident 'IMPORT' importIdentList[$mn.tree] ';' -> importIdentList | 'IMPORT' ident ( ',' ident )* ';' -> ( ^( IMPORT_DECL ^( NAME ident ) ) )* )
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==FROM) ) {
                alt132=1;
            }
            else if ( (LA132_0==IMPORT) ) {
                alt132=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }
            switch (alt132) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:866:11: 'FROM' mn= ident 'IMPORT' importIdentList[$mn.tree] ';'
                    {
                    string_literal400=(Token)match(input,FROM,FOLLOW_FROM_in_importList5857); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FROM.add(string_literal400);

                    pushFollow(FOLLOW_ident_in_importList5861);
                    mn=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(mn.getTree());
                    string_literal401=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importList5863); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPORT.add(string_literal401);

                    pushFollow(FOLLOW_importIdentList_in_importList5865);
                    importIdentList402=importIdentList((mn!=null?((CommonTree)mn.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_importIdentList.add(importIdentList402.getTree());
                    char_literal403=(Token)match(input,122,FOLLOW_122_in_importList5868); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal403);



                    // AST REWRITE
                    // elements: importIdentList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 866:66: -> importIdentList
                    {
                        adaptor.addChild(root_0, stream_importIdentList.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:867:11: 'IMPORT' ident ( ',' ident )* ';'
                    {
                    string_literal404=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importList5887); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPORT.add(string_literal404);

                    pushFollow(FOLLOW_ident_in_importList5889);
                    ident405=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident405.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:867:26: ( ',' ident )*
                    loop131:
                    do {
                        int alt131=2;
                        int LA131_0 = input.LA(1);

                        if ( (LA131_0==118) ) {
                            alt131=1;
                        }


                        switch (alt131) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:867:28: ',' ident
                    	    {
                    	    char_literal406=(Token)match(input,118,FOLLOW_118_in_importList5893); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_118.add(char_literal406);

                    	    pushFollow(FOLLOW_ident_in_importList5895);
                    	    ident407=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ident.add(ident407.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop131;
                        }
                    } while (true);

                    char_literal408=(Token)match(input,122,FOLLOW_122_in_importList5900); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal408);



                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 867:45: -> ( ^( IMPORT_DECL ^( NAME ident ) ) )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:867:48: ( ^( IMPORT_DECL ^( NAME ident ) ) )*
                        while ( stream_ident.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:867:49: ^( IMPORT_DECL ^( NAME ident ) )
                            {
                            CommonTree root_1 = (CommonTree)adaptor.nil();
                            root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_DECL, "IMPORT_DECL"), root_1);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:867:63: ^( NAME ident )
                            {
                            CommonTree root_2 = (CommonTree)adaptor.nil();
                            root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                            adaptor.addChild(root_2, stream_ident.nextTree());

                            adaptor.addChild(root_1, root_2);
                            }

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_ident.reset();

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
    // $ANTLR end "importList"

    public static class importIdentList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importIdentList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:870:1: importIdentList[CommonTree mn] : ident ( ',' ident )* -> ( ^( IMPORT_DECL ^( NAME DOT ident ) ) )* ;
    public final SSQSA_M2Parser.importIdentList_return importIdentList(CommonTree mn) throws RecognitionException {
        SSQSA_M2Parser.importIdentList_return retval = new SSQSA_M2Parser.importIdentList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal410=null;
        SSQSA_M2Parser.ident_return ident409 = null;

        SSQSA_M2Parser.ident_return ident411 = null;


        CommonTree char_literal410_tree=null;
        RewriteRuleTokenStream stream_118=new RewriteRuleTokenStream(adaptor,"token 118");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:871:2: ( ident ( ',' ident )* -> ( ^( IMPORT_DECL ^( NAME DOT ident ) ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:871:4: ident ( ',' ident )*
            {
            pushFollow(FOLLOW_ident_in_importIdentList5928);
            ident409=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident409.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:871:10: ( ',' ident )*
            loop133:
            do {
                int alt133=2;
                int LA133_0 = input.LA(1);

                if ( (LA133_0==118) ) {
                    alt133=1;
                }


                switch (alt133) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:871:11: ',' ident
            	    {
            	    char_literal410=(Token)match(input,118,FOLLOW_118_in_importIdentList5931); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_118.add(char_literal410);

            	    pushFollow(FOLLOW_ident_in_importIdentList5933);
            	    ident411=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_ident.add(ident411.getTree());

            	    }
            	    break;

            	default :
            	    break loop133;
                }
            } while (true);



            // AST REWRITE
            // elements: ident
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 871:23: -> ( ^( IMPORT_DECL ^( NAME DOT ident ) ) )*
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:871:26: ( ^( IMPORT_DECL ^( NAME DOT ident ) ) )*
                while ( stream_ident.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:871:27: ^( IMPORT_DECL ^( NAME DOT ident ) )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPORT_DECL, "IMPORT_DECL"), root_1);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:871:41: ^( NAME DOT ident )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, mn);
                    adaptor.addChild(root_2, (CommonTree)adaptor.create(DOT, "DOT"));
                    adaptor.addChild(root_2, stream_ident.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_ident.reset();

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
    // $ANTLR end "importIdentList"

    public static class definitionModule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definitionModule"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:875:1: definitionModule : 'MODULE' ident ( priority )? ';' ( importList )* ( export )* ( definition )* 'END' ident '.' -> ^( INTERFACE_UNIT_DECL ^( NAME M2IF_ ident ) ( importList )* ( definition )* ) ;
    public final SSQSA_M2Parser.definitionModule_return definitionModule() throws RecognitionException {
        SSQSA_M2Parser.definitionModule_return retval = new SSQSA_M2Parser.definitionModule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal412=null;
        Token char_literal415=null;
        Token string_literal419=null;
        Token char_literal421=null;
        SSQSA_M2Parser.ident_return ident413 = null;

        SSQSA_M2Parser.priority_return priority414 = null;

        SSQSA_M2Parser.importList_return importList416 = null;

        SSQSA_M2Parser.export_return export417 = null;

        SSQSA_M2Parser.definition_return definition418 = null;

        SSQSA_M2Parser.ident_return ident420 = null;


        CommonTree string_literal412_tree=null;
        CommonTree char_literal415_tree=null;
        CommonTree string_literal419_tree=null;
        CommonTree char_literal421_tree=null;
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_END=new RewriteRuleTokenStream(adaptor,"token END");
        RewriteRuleSubtreeStream stream_importList=new RewriteRuleSubtreeStream(adaptor,"rule importList");
        RewriteRuleSubtreeStream stream_export=new RewriteRuleSubtreeStream(adaptor,"rule export");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        RewriteRuleSubtreeStream stream_priority=new RewriteRuleSubtreeStream(adaptor,"rule priority");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:875:18: ( 'MODULE' ident ( priority )? ';' ( importList )* ( export )* ( definition )* 'END' ident '.' -> ^( INTERFACE_UNIT_DECL ^( NAME M2IF_ ident ) ( importList )* ( definition )* ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:22: 'MODULE' ident ( priority )? ';' ( importList )* ( export )* ( definition )* 'END' ident '.'
            {
            string_literal412=(Token)match(input,MODULE,FOLLOW_MODULE_in_definitionModule5987); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_MODULE.add(string_literal412);

            pushFollow(FOLLOW_ident_in_definitionModule5989);
            ident413=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident413.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:37: ( priority )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==120) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:39: priority
                    {
                    pushFollow(FOLLOW_priority_in_definitionModule5993);
                    priority414=priority();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_priority.add(priority414.getTree());

                    }
                    break;

            }

            char_literal415=(Token)match(input,122,FOLLOW_122_in_definitionModule5998); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_122.add(char_literal415);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:55: ( importList )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==FROM||LA135_0==IMPORT) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:57: importList
            	    {
            	    pushFollow(FOLLOW_importList_in_definitionModule6002);
            	    importList416=importList();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_importList.add(importList416.getTree());

            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:71: ( export )*
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==EXPORT) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:72: export
            	    {
            	    pushFollow(FOLLOW_export_in_definitionModule6008);
            	    export417=export();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_export.add(export417.getTree());

            	    }
            	    break;

            	default :
            	    break loop136;
                }
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:81: ( definition )*
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==CONST_||LA137_0==PROCEDURE||LA137_0==TYPE||LA137_0==VAR) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:876:83: definition
            	    {
            	    pushFollow(FOLLOW_definition_in_definitionModule6014);
            	    definition418=definition();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_definition.add(definition418.getTree());

            	    }
            	    break;

            	default :
            	    break loop137;
                }
            } while (true);

            string_literal419=(Token)match(input,END,FOLLOW_END_in_definitionModule6019); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_END.add(string_literal419);

            pushFollow(FOLLOW_ident_in_definitionModule6021);
            ident420=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_ident.add(ident420.getTree());
            char_literal421=(Token)match(input,DOT,FOLLOW_DOT_in_definitionModule6023); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_DOT.add(char_literal421);



            // AST REWRITE
            // elements: definition, ident, importList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 877:22: -> ^( INTERFACE_UNIT_DECL ^( NAME M2IF_ ident ) ( importList )* ( definition )* )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:877:25: ^( INTERFACE_UNIT_DECL ^( NAME M2IF_ ident ) ( importList )* ( definition )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INTERFACE_UNIT_DECL, "INTERFACE_UNIT_DECL"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:877:47: ^( NAME M2IF_ ident )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, (CommonTree)adaptor.create(M2IF_, "M2IF_"));
                adaptor.addChild(root_2, stream_ident.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:877:69: ( importList )*
                while ( stream_importList.hasNext() ) {
                    adaptor.addChild(root_1, stream_importList.nextTree());

                }
                stream_importList.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:877:86: ( definition )*
                while ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();

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
    // $ANTLR end "definitionModule"

    public static class definition_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definition"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:884:1: definition : ( CONST_ ( constantDeclaration ';' )* -> ( constantDeclaration )* | 'TYPE' ( defModTypeDeclaration ';' )* -> ( defModTypeDeclaration )* | 'VAR' ( variableDeclaration ';' )* -> ( variableDeclaration )* | procedureHeading -> procedureHeading );
    public final SSQSA_M2Parser.definition_return definition() throws RecognitionException {
        SSQSA_M2Parser.definition_return retval = new SSQSA_M2Parser.definition_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONST_422=null;
        Token char_literal424=null;
        Token string_literal425=null;
        Token char_literal427=null;
        Token string_literal428=null;
        Token char_literal430=null;
        SSQSA_M2Parser.constantDeclaration_return constantDeclaration423 = null;

        SSQSA_M2Parser.defModTypeDeclaration_return defModTypeDeclaration426 = null;

        SSQSA_M2Parser.variableDeclaration_return variableDeclaration429 = null;

        SSQSA_M2Parser.procedureHeading_return procedureHeading431 = null;


        CommonTree CONST_422_tree=null;
        CommonTree char_literal424_tree=null;
        CommonTree string_literal425_tree=null;
        CommonTree char_literal427_tree=null;
        CommonTree string_literal428_tree=null;
        CommonTree char_literal430_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_CONST_=new RewriteRuleTokenStream(adaptor,"token CONST_");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_constantDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule constantDeclaration");
        RewriteRuleSubtreeStream stream_defModTypeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule defModTypeDeclaration");
        RewriteRuleSubtreeStream stream_procedureHeading=new RewriteRuleSubtreeStream(adaptor,"rule procedureHeading");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:884:12: ( CONST_ ( constantDeclaration ';' )* -> ( constantDeclaration )* | 'TYPE' ( defModTypeDeclaration ';' )* -> ( defModTypeDeclaration )* | 'VAR' ( variableDeclaration ';' )* -> ( variableDeclaration )* | procedureHeading -> procedureHeading )
            int alt141=4;
            switch ( input.LA(1) ) {
            case CONST_:
                {
                alt141=1;
                }
                break;
            case TYPE:
                {
                alt141=2;
                }
                break;
            case VAR:
                {
                alt141=3;
                }
                break;
            case PROCEDURE:
                {
                alt141=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }

            switch (alt141) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:885:2: CONST_ ( constantDeclaration ';' )*
                    {
                    CONST_422=(Token)match(input,CONST_,FOLLOW_CONST__in_definition6112); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_CONST_.add(CONST_422);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:885:9: ( constantDeclaration ';' )*
                    loop138:
                    do {
                        int alt138=2;
                        int LA138_0 = input.LA(1);

                        if ( (LA138_0==IDENT) ) {
                            alt138=1;
                        }


                        switch (alt138) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:885:11: constantDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_constantDeclaration_in_definition6116);
                    	    constantDeclaration423=constantDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_constantDeclaration.add(constantDeclaration423.getTree());
                    	    char_literal424=(Token)match(input,122,FOLLOW_122_in_definition6118); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal424);


                    	    }
                    	    break;

                    	default :
                    	    break loop138;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: constantDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 885:38: -> ( constantDeclaration )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:885:41: ( constantDeclaration )*
                        while ( stream_constantDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_constantDeclaration.nextTree());

                        }
                        stream_constantDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:886:2: 'TYPE' ( defModTypeDeclaration ';' )*
                    {
                    string_literal425=(Token)match(input,TYPE,FOLLOW_TYPE_in_definition6132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(string_literal425);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:886:9: ( defModTypeDeclaration ';' )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==IDENT) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:886:11: defModTypeDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_defModTypeDeclaration_in_definition6136);
                    	    defModTypeDeclaration426=defModTypeDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_defModTypeDeclaration.add(defModTypeDeclaration426.getTree());
                    	    char_literal427=(Token)match(input,122,FOLLOW_122_in_definition6138); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal427);


                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: defModTypeDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 886:40: -> ( defModTypeDeclaration )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:886:43: ( defModTypeDeclaration )*
                        while ( stream_defModTypeDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_defModTypeDeclaration.nextTree());

                        }
                        stream_defModTypeDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:887:2: 'VAR' ( variableDeclaration ';' )*
                    {
                    string_literal428=(Token)match(input,VAR,FOLLOW_VAR_in_definition6151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_VAR.add(string_literal428);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:887:8: ( variableDeclaration ';' )*
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==IDENT) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:887:10: variableDeclaration ';'
                    	    {
                    	    pushFollow(FOLLOW_variableDeclaration_in_definition6155);
                    	    variableDeclaration429=variableDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_variableDeclaration.add(variableDeclaration429.getTree());
                    	    char_literal430=(Token)match(input,122,FOLLOW_122_in_definition6157); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_122.add(char_literal430);


                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);



                    // AST REWRITE
                    // elements: variableDeclaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 887:36: -> ( variableDeclaration )*
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:887:39: ( variableDeclaration )*
                        while ( stream_variableDeclaration.hasNext() ) {
                            adaptor.addChild(root_0, stream_variableDeclaration.nextTree());

                        }
                        stream_variableDeclaration.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:888:2: procedureHeading
                    {
                    pushFollow(FOLLOW_procedureHeading_in_definition6169);
                    procedureHeading431=procedureHeading();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_procedureHeading.add(procedureHeading431.getTree());


                    // AST REWRITE
                    // elements: procedureHeading
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 888:19: -> procedureHeading
                    {
                        adaptor.addChild(root_0, stream_procedureHeading.nextTree());

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
    // $ANTLR end "definition"

    public static class procedureHeading_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "procedureHeading"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:912:1: procedureHeading : ( 'PROCEDURE' ident ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' )? ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) ) );
    public final SSQSA_M2Parser.procedureHeading_return procedureHeading() throws RecognitionException {
        SSQSA_M2Parser.procedureHeading_return retval = new SSQSA_M2Parser.procedureHeading_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal432=null;
        Token char_literal434=null;
        Token string_literal435=null;
        Token char_literal437=null;
        Token char_literal439=null;
        Token char_literal441=null;
        Token char_literal442=null;
        Token char_literal444=null;
        Token char_literal446=null;
        Token string_literal447=null;
        Token char_literal449=null;
        Token char_literal451=null;
        Token char_literal453=null;
        Token char_literal454=null;
        SSQSA_M2Parser.ident_return ident433 = null;

        SSQSA_M2Parser.ident_return ident436 = null;

        SSQSA_M2Parser.procParams_return procParams438 = null;

        SSQSA_M2Parser.procParams_return procParams440 = null;

        SSQSA_M2Parser.ident_return ident443 = null;

        SSQSA_M2Parser.ident_return ident445 = null;

        SSQSA_M2Parser.ident_return ident448 = null;

        SSQSA_M2Parser.procParams_return procParams450 = null;

        SSQSA_M2Parser.procParams_return procParams452 = null;


        CommonTree string_literal432_tree=null;
        CommonTree char_literal434_tree=null;
        CommonTree string_literal435_tree=null;
        CommonTree char_literal437_tree=null;
        CommonTree char_literal439_tree=null;
        CommonTree char_literal441_tree=null;
        CommonTree char_literal442_tree=null;
        CommonTree char_literal444_tree=null;
        CommonTree char_literal446_tree=null;
        CommonTree string_literal447_tree=null;
        CommonTree char_literal449_tree=null;
        CommonTree char_literal451_tree=null;
        CommonTree char_literal453_tree=null;
        CommonTree char_literal454_tree=null;
        RewriteRuleTokenStream stream_116=new RewriteRuleTokenStream(adaptor,"token 116");
        RewriteRuleTokenStream stream_115=new RewriteRuleTokenStream(adaptor,"token 115");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_123=new RewriteRuleTokenStream(adaptor,"token 123");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_PROCEDURE=new RewriteRuleTokenStream(adaptor,"token PROCEDURE");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_procParams=new RewriteRuleSubtreeStream(adaptor,"rule procParams");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:912:18: ( 'PROCEDURE' ident ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' )? ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) ) )
            int alt148=3;
            alt148 = dfa148.predict(input);
            switch (alt148) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:913:2: 'PROCEDURE' ident ';'
                    {
                    string_literal432=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading6192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROCEDURE.add(string_literal432);

                    pushFollow(FOLLOW_ident_in_procedureHeading6194);
                    ident433=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident433.getTree());
                    char_literal434=(Token)match(input,122,FOLLOW_122_in_procedureHeading6196); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal434);



                    // AST REWRITE
                    // elements: ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 914:2: -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:914:5: ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:914:21: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:914:35: ^( TYPE VOID )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(VOID, "VOID"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:914:48: ^( FORMAL_PARAM_LIST )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:916:2: 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';'
                    {
                    string_literal435=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading6226); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROCEDURE.add(string_literal435);

                    pushFollow(FOLLOW_ident_in_procedureHeading6230);
                    ident436=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident436.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:918:2: ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:918:8: '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* )
                    {
                    char_literal437=(Token)match(input,115,FOLLOW_115_in_procedureHeading6240); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_115.add(char_literal437);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:919:14: ( procParams ( ';' procParams )* )?
                    int alt143=2;
                    int LA143_0 = input.LA(1);

                    if ( (LA143_0==VAR||LA143_0==IDENT) ) {
                        alt143=1;
                    }
                    switch (alt143) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:919:16: procParams ( ';' procParams )*
                            {
                            pushFollow(FOLLOW_procParams_in_procedureHeading6258);
                            procParams438=procParams();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_procParams.add(procParams438.getTree());
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:919:27: ( ';' procParams )*
                            loop142:
                            do {
                                int alt142=2;
                                int LA142_0 = input.LA(1);

                                if ( (LA142_0==122) ) {
                                    alt142=1;
                                }


                                switch (alt142) {
                            	case 1 :
                            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:919:29: ';' procParams
                            	    {
                            	    char_literal439=(Token)match(input,122,FOLLOW_122_in_procedureHeading6262); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_122.add(char_literal439);

                            	    pushFollow(FOLLOW_procParams_in_procedureHeading6264);
                            	    procParams440=procParams();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_procParams.add(procParams440.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop142;
                                }
                            } while (true);


                            }
                            break;

                    }

                    char_literal441=(Token)match(input,116,FOLLOW_116_in_procedureHeading6279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_116.add(char_literal441);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:921:8: ( ':' ident ( '.' ident )* )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:921:10: ':' ident ( '.' ident )*
                    {
                    char_literal442=(Token)match(input,123,FOLLOW_123_in_procedureHeading6291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_123.add(char_literal442);

                    pushFollow(FOLLOW_ident_in_procedureHeading6293);
                    ident443=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident443.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:921:20: ( '.' ident )*
                    loop144:
                    do {
                        int alt144=2;
                        int LA144_0 = input.LA(1);

                        if ( (LA144_0==DOT) ) {
                            alt144=1;
                        }


                        switch (alt144) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:921:22: '.' ident
                    	    {
                    	    char_literal444=(Token)match(input,DOT,FOLLOW_DOT_in_procedureHeading6297); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_DOT.add(char_literal444);

                    	    pushFollow(FOLLOW_ident_in_procedureHeading6299);
                    	    ident445=ident();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_ident.add(ident445.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop144;
                        }
                    } while (true);


                    }


                    }

                    char_literal446=(Token)match(input,122,FOLLOW_122_in_procedureHeading6312); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal446);



                    // AST REWRITE
                    // elements: procParams, ident, ident, DOT, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 924:2: -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:924:5: ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:924:21: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:924:35: ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:924:48: ( ^( SEPARATOR '.' ident ) )*
                        while ( stream_ident.hasNext()||stream_DOT.hasNext() ) {
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:924:48: ^( SEPARATOR '.' ident )
                            {
                            CommonTree root_3 = (CommonTree)adaptor.nil();
                            root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_3);

                            adaptor.addChild(root_3, stream_DOT.nextNode());
                            adaptor.addChild(root_3, stream_ident.nextTree());

                            adaptor.addChild(root_2, root_3);
                            }

                        }
                        stream_ident.reset();
                        stream_DOT.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:924:74: ^( FORMAL_PARAM_LIST ( procParams )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:924:94: ( procParams )*
                        while ( stream_procParams.hasNext() ) {
                            adaptor.addChild(root_2, stream_procParams.nextTree());

                        }
                        stream_procParams.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:926:2: 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' )? ';'
                    {
                    string_literal447=(Token)match(input,PROCEDURE,FOLLOW_PROCEDURE_in_procedureHeading6354); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_PROCEDURE.add(string_literal447);

                    pushFollow(FOLLOW_ident_in_procedureHeading6358);
                    ident448=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident448.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:928:2: ( '(' ( procParams ( ';' procParams )* )? ')' )?
                    int alt147=2;
                    int LA147_0 = input.LA(1);

                    if ( (LA147_0==115) ) {
                        alt147=1;
                    }
                    switch (alt147) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:928:8: '(' ( procParams ( ';' procParams )* )? ')'
                            {
                            char_literal449=(Token)match(input,115,FOLLOW_115_in_procedureHeading6368); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_115.add(char_literal449);

                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:929:14: ( procParams ( ';' procParams )* )?
                            int alt146=2;
                            int LA146_0 = input.LA(1);

                            if ( (LA146_0==VAR||LA146_0==IDENT) ) {
                                alt146=1;
                            }
                            switch (alt146) {
                                case 1 :
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:929:16: procParams ( ';' procParams )*
                                    {
                                    pushFollow(FOLLOW_procParams_in_procedureHeading6386);
                                    procParams450=procParams();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_procParams.add(procParams450.getTree());
                                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:929:27: ( ';' procParams )*
                                    loop145:
                                    do {
                                        int alt145=2;
                                        int LA145_0 = input.LA(1);

                                        if ( (LA145_0==122) ) {
                                            alt145=1;
                                        }


                                        switch (alt145) {
                                    	case 1 :
                                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:929:29: ';' procParams
                                    	    {
                                    	    char_literal451=(Token)match(input,122,FOLLOW_122_in_procedureHeading6390); if (state.failed) return retval; 
                                    	    if ( state.backtracking==0 ) stream_122.add(char_literal451);

                                    	    pushFollow(FOLLOW_procParams_in_procedureHeading6392);
                                    	    procParams452=procParams();

                                    	    state._fsp--;
                                    	    if (state.failed) return retval;
                                    	    if ( state.backtracking==0 ) stream_procParams.add(procParams452.getTree());

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop145;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            char_literal453=(Token)match(input,116,FOLLOW_116_in_procedureHeading6407); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_116.add(char_literal453);


                            }
                            break;

                    }

                    char_literal454=(Token)match(input,122,FOLLOW_122_in_procedureHeading6416); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal454);



                    // AST REWRITE
                    // elements: procParams, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 933:2: -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:933:5: ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:933:21: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:933:35: ^( TYPE VOID )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_2);

                        adaptor.addChild(root_2, (CommonTree)adaptor.create(VOID, "VOID"));

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:933:48: ^( FORMAL_PARAM_LIST ( procParams )* )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:933:68: ( procParams )*
                        while ( stream_procParams.hasNext() ) {
                            adaptor.addChild(root_2, stream_procParams.nextTree());

                        }
                        stream_procParams.reset();

                        adaptor.addChild(root_1, root_2);
                        }

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
    // $ANTLR end "procedureHeading"

    public static class formalType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalType"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:936:1: formalType : ( 'ARRAY' 'OF' )? qualident -> ^( TYPE ( 'ARRAY' 'OF' )? qualident ) ;
    public final SSQSA_M2Parser.formalType_return formalType() throws RecognitionException {
        SSQSA_M2Parser.formalType_return retval = new SSQSA_M2Parser.formalType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal455=null;
        Token string_literal456=null;
        SSQSA_M2Parser.qualident_return qualident457 = null;


        CommonTree string_literal455_tree=null;
        CommonTree string_literal456_tree=null;
        RewriteRuleTokenStream stream_OF=new RewriteRuleTokenStream(adaptor,"token OF");
        RewriteRuleTokenStream stream_ARRAY=new RewriteRuleTokenStream(adaptor,"token ARRAY");
        RewriteRuleSubtreeStream stream_qualident=new RewriteRuleSubtreeStream(adaptor,"rule qualident");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:936:12: ( ( 'ARRAY' 'OF' )? qualident -> ^( TYPE ( 'ARRAY' 'OF' )? qualident ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:937:2: ( 'ARRAY' 'OF' )? qualident
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:937:2: ( 'ARRAY' 'OF' )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==ARRAY) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:937:4: 'ARRAY' 'OF'
                    {
                    string_literal455=(Token)match(input,ARRAY,FOLLOW_ARRAY_in_formalType6455); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ARRAY.add(string_literal455);

                    string_literal456=(Token)match(input,OF,FOLLOW_OF_in_formalType6457); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_OF.add(string_literal456);


                    }
                    break;

            }

            pushFollow(FOLLOW_qualident_in_formalType6462);
            qualident457=qualident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_qualident.add(qualident457.getTree());


            // AST REWRITE
            // elements: OF, qualident, ARRAY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 938:23: -> ^( TYPE ( 'ARRAY' 'OF' )? qualident )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:938:26: ^( TYPE ( 'ARRAY' 'OF' )? qualident )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:938:33: ( 'ARRAY' 'OF' )?
                if ( stream_OF.hasNext()||stream_ARRAY.hasNext() ) {
                    adaptor.addChild(root_1, stream_ARRAY.nextNode());
                    adaptor.addChild(root_1, stream_OF.nextNode());

                }
                stream_OF.reset();
                stream_ARRAY.reset();
                adaptor.addChild(root_1, stream_qualident.nextTree());

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
    // $ANTLR end "formalType"

    public static class programModule_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "programModule"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:945:1: programModule : ( 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident '.' -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block ) | 'IMPLEMENTATION' 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident '.' -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ^( IMPLEMENTS ^( TYPE ^( NAME M2IF_ ident ) ) ) ( importList )* block ) );
    public final SSQSA_M2Parser.programModule_return programModule() throws RecognitionException {
        SSQSA_M2Parser.programModule_return retval = new SSQSA_M2Parser.programModule_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal458=null;
        Token char_literal461=null;
        Token char_literal466=null;
        Token string_literal467=null;
        Token string_literal468=null;
        Token char_literal471=null;
        Token char_literal476=null;
        SSQSA_M2Parser.ident_return ident459 = null;

        SSQSA_M2Parser.priority_return priority460 = null;

        SSQSA_M2Parser.importList_return importList462 = null;

        SSQSA_M2Parser.export_return export463 = null;

        SSQSA_M2Parser.block_return block464 = null;

        SSQSA_M2Parser.ident_return ident465 = null;

        SSQSA_M2Parser.ident_return ident469 = null;

        SSQSA_M2Parser.priority_return priority470 = null;

        SSQSA_M2Parser.importList_return importList472 = null;

        SSQSA_M2Parser.export_return export473 = null;

        SSQSA_M2Parser.block_return block474 = null;

        SSQSA_M2Parser.ident_return ident475 = null;


        CommonTree string_literal458_tree=null;
        CommonTree char_literal461_tree=null;
        CommonTree char_literal466_tree=null;
        CommonTree string_literal467_tree=null;
        CommonTree string_literal468_tree=null;
        CommonTree char_literal471_tree=null;
        CommonTree char_literal476_tree=null;
        RewriteRuleTokenStream stream_IMPLEMENTATION=new RewriteRuleTokenStream(adaptor,"token IMPLEMENTATION");
        RewriteRuleTokenStream stream_122=new RewriteRuleTokenStream(adaptor,"token 122");
        RewriteRuleTokenStream stream_MODULE=new RewriteRuleTokenStream(adaptor,"token MODULE");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_importList=new RewriteRuleSubtreeStream(adaptor,"rule importList");
        RewriteRuleSubtreeStream stream_export=new RewriteRuleSubtreeStream(adaptor,"rule export");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        RewriteRuleSubtreeStream stream_priority=new RewriteRuleSubtreeStream(adaptor,"rule priority");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:945:15: ( 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident '.' -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block ) | 'IMPLEMENTATION' 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident '.' -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ^( IMPLEMENTS ^( TYPE ^( NAME M2IF_ ident ) ) ) ( importList )* block ) )
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==MODULE) ) {
                alt156=1;
            }
            else if ( (LA156_0==IMPLEMENTATION) ) {
                alt156=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;
            }
            switch (alt156) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:946:2: 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident '.'
                    {
                    string_literal458=(Token)match(input,MODULE,FOLLOW_MODULE_in_programModule6516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(string_literal458);

                    pushFollow(FOLLOW_ident_in_programModule6518);
                    ident459=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident459.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:946:17: ( priority )?
                    int alt150=2;
                    int LA150_0 = input.LA(1);

                    if ( (LA150_0==120) ) {
                        alt150=1;
                    }
                    switch (alt150) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:946:19: priority
                            {
                            pushFollow(FOLLOW_priority_in_programModule6522);
                            priority460=priority();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_priority.add(priority460.getTree());

                            }
                            break;

                    }

                    char_literal461=(Token)match(input,122,FOLLOW_122_in_programModule6527); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal461);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:946:34: ( importList )*
                    loop151:
                    do {
                        int alt151=2;
                        int LA151_0 = input.LA(1);

                        if ( (LA151_0==FROM||LA151_0==IMPORT) ) {
                            alt151=1;
                        }


                        switch (alt151) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:946:36: importList
                    	    {
                    	    pushFollow(FOLLOW_importList_in_programModule6530);
                    	    importList462=importList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_importList.add(importList462.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop151;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:946:50: ( export )*
                    loop152:
                    do {
                        int alt152=2;
                        int LA152_0 = input.LA(1);

                        if ( (LA152_0==EXPORT) ) {
                            alt152=1;
                        }


                        switch (alt152) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:946:51: export
                    	    {
                    	    pushFollow(FOLLOW_export_in_programModule6536);
                    	    export463=export();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_export.add(export463.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop152;
                        }
                    } while (true);

                    pushFollow(FOLLOW_block_in_programModule6541);
                    block464=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block464.getTree());
                    pushFollow(FOLLOW_ident_in_programModule6543);
                    ident465=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident465.getTree());
                    char_literal466=(Token)match(input,DOT,FOLLOW_DOT_in_programModule6545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal466);



                    // AST REWRITE
                    // elements: ident, block, importList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 947:2: -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:947:5: ^( CONCRETE_UNIT_DECL ^( NAME ident ) ( importList )* block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONCRETE_UNIT_DECL, "CONCRETE_UNIT_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:947:26: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:947:40: ( importList )*
                        while ( stream_importList.hasNext() ) {
                            adaptor.addChild(root_1, stream_importList.nextTree());

                        }
                        stream_importList.reset();
                        adaptor.addChild(root_1, stream_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:948:4: 'IMPLEMENTATION' 'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident '.'
                    {
                    string_literal467=(Token)match(input,IMPLEMENTATION,FOLLOW_IMPLEMENTATION_in_programModule6572); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_IMPLEMENTATION.add(string_literal467);

                    string_literal468=(Token)match(input,MODULE,FOLLOW_MODULE_in_programModule6574); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MODULE.add(string_literal468);

                    pushFollow(FOLLOW_ident_in_programModule6576);
                    ident469=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident469.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:948:36: ( priority )?
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==120) ) {
                        alt153=1;
                    }
                    switch (alt153) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:948:38: priority
                            {
                            pushFollow(FOLLOW_priority_in_programModule6580);
                            priority470=priority();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_priority.add(priority470.getTree());

                            }
                            break;

                    }

                    char_literal471=(Token)match(input,122,FOLLOW_122_in_programModule6585); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_122.add(char_literal471);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:948:53: ( importList )*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==FROM||LA154_0==IMPORT) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:948:55: importList
                    	    {
                    	    pushFollow(FOLLOW_importList_in_programModule6588);
                    	    importList472=importList();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_importList.add(importList472.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop154;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:948:69: ( export )*
                    loop155:
                    do {
                        int alt155=2;
                        int LA155_0 = input.LA(1);

                        if ( (LA155_0==EXPORT) ) {
                            alt155=1;
                        }


                        switch (alt155) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:948:70: export
                    	    {
                    	    pushFollow(FOLLOW_export_in_programModule6594);
                    	    export473=export();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_export.add(export473.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop155;
                        }
                    } while (true);

                    pushFollow(FOLLOW_block_in_programModule6599);
                    block474=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_block.add(block474.getTree());
                    pushFollow(FOLLOW_ident_in_programModule6601);
                    ident475=ident();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ident.add(ident475.getTree());
                    char_literal476=(Token)match(input,DOT,FOLLOW_DOT_in_programModule6603); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(char_literal476);



                    // AST REWRITE
                    // elements: importList, ident, ident, block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 949:2: -> ^( CONCRETE_UNIT_DECL ^( NAME ident ) ^( IMPLEMENTS ^( TYPE ^( NAME M2IF_ ident ) ) ) ( importList )* block )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:949:5: ^( CONCRETE_UNIT_DECL ^( NAME ident ) ^( IMPLEMENTS ^( TYPE ^( NAME M2IF_ ident ) ) ) ( importList )* block )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONCRETE_UNIT_DECL, "CONCRETE_UNIT_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:949:26: ^( NAME ident )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:949:40: ^( IMPLEMENTS ^( TYPE ^( NAME M2IF_ ident ) ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(IMPLEMENTS, "IMPLEMENTS"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:949:53: ^( TYPE ^( NAME M2IF_ ident ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(TYPE, "TYPE"), root_3);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:949:60: ^( NAME M2IF_ ident )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_4);

                        adaptor.addChild(root_4, (CommonTree)adaptor.create(M2IF_, "M2IF_"));
                        adaptor.addChild(root_4, stream_ident.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:949:82: ( importList )*
                        while ( stream_importList.hasNext() ) {
                            adaptor.addChild(root_1, stream_importList.nextTree());

                        }
                        stream_importList.reset();
                        adaptor.addChild(root_1, stream_block.nextTree());

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
    // $ANTLR end "programModule"

    public static class startNonterminal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "startNonterminal"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:955:1: startNonterminal : ( ( 'DEFINITION' | 'FOREIGN' ) definitionModule -> ^( COMPILATION_UNIT definitionModule ) | programModule -> ^( COMPILATION_UNIT programModule ) );
    public final SSQSA_M2Parser.startNonterminal_return startNonterminal() throws RecognitionException {
        SSQSA_M2Parser.startNonterminal_return retval = new SSQSA_M2Parser.startNonterminal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal477=null;
        Token string_literal478=null;
        SSQSA_M2Parser.definitionModule_return definitionModule479 = null;

        SSQSA_M2Parser.programModule_return programModule480 = null;


        CommonTree string_literal477_tree=null;
        CommonTree string_literal478_tree=null;
        RewriteRuleTokenStream stream_125=new RewriteRuleTokenStream(adaptor,"token 125");
        RewriteRuleTokenStream stream_DEFINITION=new RewriteRuleTokenStream(adaptor,"token DEFINITION");
        RewriteRuleSubtreeStream stream_definitionModule=new RewriteRuleSubtreeStream(adaptor,"rule definitionModule");
        RewriteRuleSubtreeStream stream_programModule=new RewriteRuleSubtreeStream(adaptor,"rule programModule");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:955:18: ( ( 'DEFINITION' | 'FOREIGN' ) definitionModule -> ^( COMPILATION_UNIT definitionModule ) | programModule -> ^( COMPILATION_UNIT programModule ) )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==DEFINITION||LA158_0==125) ) {
                alt158=1;
            }
            else if ( (LA158_0==IMPLEMENTATION||LA158_0==MODULE) ) {
                alt158=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;
            }
            switch (alt158) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:956:3: ( 'DEFINITION' | 'FOREIGN' ) definitionModule
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:956:3: ( 'DEFINITION' | 'FOREIGN' )
                    int alt157=2;
                    int LA157_0 = input.LA(1);

                    if ( (LA157_0==DEFINITION) ) {
                        alt157=1;
                    }
                    else if ( (LA157_0==125) ) {
                        alt157=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 157, 0, input);

                        throw nvae;
                    }
                    switch (alt157) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:956:5: 'DEFINITION'
                            {
                            string_literal477=(Token)match(input,DEFINITION,FOLLOW_DEFINITION_in_startNonterminal6659); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DEFINITION.add(string_literal477);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:956:20: 'FOREIGN'
                            {
                            string_literal478=(Token)match(input,125,FOLLOW_125_in_startNonterminal6663); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_125.add(string_literal478);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_definitionModule_in_startNonterminal6668);
                    definitionModule479=definitionModule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_definitionModule.add(definitionModule479.getTree());


                    // AST REWRITE
                    // elements: definitionModule
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 956:88: -> ^( COMPILATION_UNIT definitionModule )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:956:91: ^( COMPILATION_UNIT definitionModule )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                        adaptor.addChild(root_1, stream_definitionModule.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:957:4: programModule
                    {
                    pushFollow(FOLLOW_programModule_in_startNonterminal6682);
                    programModule480=programModule();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_programModule.add(programModule480.getTree());


                    // AST REWRITE
                    // elements: programModule
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 957:59: -> ^( COMPILATION_UNIT programModule )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:957:62: ^( COMPILATION_UNIT programModule )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                        adaptor.addChild(root_1, stream_programModule.nextTree());

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
    // $ANTLR end "startNonterminal"

    public static class machineAddress_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "machineAddress"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:961:1: machineAddress : '[' constExpression ']' ;
    public final SSQSA_M2Parser.machineAddress_return machineAddress() throws RecognitionException {
        SSQSA_M2Parser.machineAddress_return retval = new SSQSA_M2Parser.machineAddress_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal481=null;
        Token char_literal483=null;
        SSQSA_M2Parser.constExpression_return constExpression482 = null;


        CommonTree char_literal481_tree=null;
        CommonTree char_literal483_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:962:2: ( '[' constExpression ']' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:962:4: '[' constExpression ']'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal481=(Token)match(input,120,FOLLOW_120_in_machineAddress6744); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal481_tree = (CommonTree)adaptor.create(char_literal481);
            adaptor.addChild(root_0, char_literal481_tree);
            }
            pushFollow(FOLLOW_constExpression_in_machineAddress6746);
            constExpression482=constExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, constExpression482.getTree());
            char_literal483=(Token)match(input,121,FOLLOW_121_in_machineAddress6748); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal483_tree = (CommonTree)adaptor.create(char_literal483);
            adaptor.addChild(root_0, char_literal483_tree);
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
    // $ANTLR end "machineAddress"

    public static class export_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "export"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:967:1: export : 'EXPORT' ( 'QUALIFIED' )? identifier_list ';' ;
    public final SSQSA_M2Parser.export_return export() throws RecognitionException {
        SSQSA_M2Parser.export_return retval = new SSQSA_M2Parser.export_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal484=null;
        Token string_literal485=null;
        Token char_literal487=null;
        SSQSA_M2Parser.identifier_list_return identifier_list486 = null;


        CommonTree string_literal484_tree=null;
        CommonTree string_literal485_tree=null;
        CommonTree char_literal487_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:967:7: ( 'EXPORT' ( 'QUALIFIED' )? identifier_list ';' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:968:2: 'EXPORT' ( 'QUALIFIED' )? identifier_list ';'
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal484=(Token)match(input,EXPORT,FOLLOW_EXPORT_in_export6760); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal484_tree = (CommonTree)adaptor.create(string_literal484);
            adaptor.addChild(root_0, string_literal484_tree);
            }
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:968:11: ( 'QUALIFIED' )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==QUALIFIED) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:968:12: 'QUALIFIED'
                    {
                    string_literal485=(Token)match(input,QUALIFIED,FOLLOW_QUALIFIED_in_export6763); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal485_tree = (CommonTree)adaptor.create(string_literal485);
                    adaptor.addChild(root_0, string_literal485_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_identifier_list_in_export6767);
            identifier_list486=identifier_list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifier_list486.getTree());
            char_literal487=(Token)match(input,122,FOLLOW_122_in_export6769); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal487_tree = (CommonTree)adaptor.create(char_literal487);
            adaptor.addChild(root_0, char_literal487_tree);
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
    // $ANTLR end "export"

    public static class identifier_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifier_list"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:971:1: identifier_list : ident ( ',' ident )* ;
    public final SSQSA_M2Parser.identifier_list_return identifier_list() throws RecognitionException {
        SSQSA_M2Parser.identifier_list_return retval = new SSQSA_M2Parser.identifier_list_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal489=null;
        SSQSA_M2Parser.ident_return ident488 = null;

        SSQSA_M2Parser.ident_return ident490 = null;


        CommonTree char_literal489_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:971:17: ( ident ( ',' ident )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:972:2: ident ( ',' ident )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_ident_in_identifier_list6780);
            ident488=ident();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, ident488.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:972:8: ( ',' ident )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==118) ) {
                    alt160=1;
                }


                switch (alt160) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:972:10: ',' ident
            	    {
            	    char_literal489=(Token)match(input,118,FOLLOW_118_in_identifier_list6784); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal489_tree = (CommonTree)adaptor.create(char_literal489);
            	    adaptor.addChild(root_0, char_literal489_tree);
            	    }
            	    pushFollow(FOLLOW_ident_in_identifier_list6786);
            	    ident490=ident();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, ident490.getTree());

            	    }
            	    break;

            	default :
            	    break loop160;
                }
            } while (true);


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
    // $ANTLR end "identifier_list"

    // $ANTLR start synpred13_SSQSA_M2
    public final void synpred13_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:306:29: ( addOperator constTerm )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:306:29: addOperator constTerm
        {
        pushFollow(FOLLOW_addOperator_in_synpred13_SSQSA_M22150);
        addOperator();

        state._fsp--;
        if (state.failed) return ;
        pushFollow(FOLLOW_constTerm_in_synpred13_SSQSA_M22153);
        constTerm();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_SSQSA_M2

    // $ANTLR start synpred24_SSQSA_M2
    public final void synpred24_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:340:14: ( constSet )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:340:14: constSet
        {
        pushFollow(FOLLOW_constSet_in_synpred24_SSQSA_M22370);
        constSet();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_SSQSA_M2

    // $ANTLR start synpred43_SSQSA_M2
    public final void synpred43_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:411:7: ( constExpression DOTDOT )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:411:7: constExpression DOTDOT
        {
        pushFollow(FOLLOW_constExpression_in_synpred43_SSQSA_M22747);
        constExpression();

        state._fsp--;
        if (state.failed) return ;
        match(input,DOTDOT,FOLLOW_DOTDOT_in_synpred43_SSQSA_M22749); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_SSQSA_M2

    // $ANTLR start synpred50_SSQSA_M2
    public final void synpred50_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:52: ( ';' )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:52: ';'
        {
        match(input,122,FOLLOW_122_in_synpred50_SSQSA_M22931); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_SSQSA_M2

    // $ANTLR start synpred51_SSQSA_M2
    public final void synpred51_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:73: ( ';' )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:440:73: ';'
        {
        match(input,122,FOLLOW_122_in_synpred51_SSQSA_M22942); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_SSQSA_M2

    // $ANTLR start synpred65_SSQSA_M2
    public final void synpred65_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:511:2: ( '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:511:2: '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')'
        {
        match(input,115,FOLLOW_115_in_synpred65_SSQSA_M23238); if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:7: ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )?
        int alt174=2;
        int LA174_0 = input.LA(1);

        if ( (LA174_0==ARRAY||LA174_0==VAR||LA174_0==IDENT) ) {
            alt174=1;
        }
        switch (alt174) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:9: ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )*
                {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:9: ( 'VAR' )?
                int alt171=2;
                int LA171_0 = input.LA(1);

                if ( (LA171_0==VAR) ) {
                    alt171=1;
                }
                switch (alt171) {
                    case 1 :
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:512:10: 'VAR'
                        {
                        match(input,VAR,FOLLOW_VAR_in_synpred65_SSQSA_M23250); if (state.failed) return ;

                        }
                        break;

                }

                pushFollow(FOLLOW_formalType_in_synpred65_SSQSA_M23254);
                formalType();

                state._fsp--;
                if (state.failed) return ;
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:9: ( ',' ( 'VAR' )? formalType )*
                loop173:
                do {
                    int alt173=2;
                    int LA173_0 = input.LA(1);

                    if ( (LA173_0==118) ) {
                        alt173=1;
                    }


                    switch (alt173) {
                	case 1 :
                	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:11: ',' ( 'VAR' )? formalType
                	    {
                	    match(input,118,FOLLOW_118_in_synpred65_SSQSA_M23267); if (state.failed) return ;
                	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:15: ( 'VAR' )?
                	    int alt172=2;
                	    int LA172_0 = input.LA(1);

                	    if ( (LA172_0==VAR) ) {
                	        alt172=1;
                	    }
                	    switch (alt172) {
                	        case 1 :
                	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:513:17: 'VAR'
                	            {
                	            match(input,VAR,FOLLOW_VAR_in_synpred65_SSQSA_M23271); if (state.failed) return ;

                	            }
                	            break;

                	    }

                	    pushFollow(FOLLOW_formalType_in_synpred65_SSQSA_M23276);
                	    formalType();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop173;
                    }
                } while (true);


                }
                break;

        }

        match(input,116,FOLLOW_116_in_synpred65_SSQSA_M23292); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_SSQSA_M2

    // $ANTLR start synpred71_SSQSA_M2
    public final void synpred71_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:4: ( ':' ident ( '.' ident )* )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:4: ':' ident ( '.' ident )*
        {
        match(input,123,FOLLOW_123_in_synpred71_SSQSA_M23368); if (state.failed) return ;
        pushFollow(FOLLOW_ident_in_synpred71_SSQSA_M23370);
        ident();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:14: ( '.' ident )*
        loop179:
        do {
            int alt179=2;
            int LA179_0 = input.LA(1);

            if ( (LA179_0==DOT) ) {
                alt179=1;
            }


            switch (alt179) {
        	case 1 :
        	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:523:16: '.' ident
        	    {
        	    match(input,DOT,FOLLOW_DOT_in_synpred71_SSQSA_M23374); if (state.failed) return ;
        	    pushFollow(FOLLOW_ident_in_synpred71_SSQSA_M23376);
        	    ident();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop179;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred71_SSQSA_M2

    // $ANTLR start synpred98_SSQSA_M2
    public final void synpred98_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:635:2: ( ( assignmentOrProcCall )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:635:2: ( assignmentOrProcCall )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:635:2: ( assignmentOrProcCall )?
        int alt185=2;
        int LA185_0 = input.LA(1);

        if ( (LA185_0==DEC||LA185_0==INC||LA185_0==IDENT) ) {
            alt185=1;
        }
        switch (alt185) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: assignmentOrProcCall
                {
                pushFollow(FOLLOW_assignmentOrProcCall_in_synpred98_SSQSA_M23943);
                assignmentOrProcCall();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred98_SSQSA_M2

    // $ANTLR start synpred100_SSQSA_M2
    public final void synpred100_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:636:4: ( ( ifStatement )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:636:4: ( ifStatement )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:636:4: ( ifStatement )?
        int alt186=2;
        int LA186_0 = input.LA(1);

        if ( (LA186_0==IF) ) {
            alt186=1;
        }
        switch (alt186) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: ifStatement
                {
                pushFollow(FOLLOW_ifStatement_in_synpred100_SSQSA_M23950);
                ifStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred100_SSQSA_M2

    // $ANTLR start synpred102_SSQSA_M2
    public final void synpred102_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:637:4: ( ( caseStatement )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:637:4: ( caseStatement )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:637:4: ( caseStatement )?
        int alt187=2;
        int LA187_0 = input.LA(1);

        if ( (LA187_0==CASE) ) {
            alt187=1;
        }
        switch (alt187) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: caseStatement
                {
                pushFollow(FOLLOW_caseStatement_in_synpred102_SSQSA_M23957);
                caseStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred102_SSQSA_M2

    // $ANTLR start synpred104_SSQSA_M2
    public final void synpred104_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:638:4: ( ( whileStatement )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:638:4: ( whileStatement )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:638:4: ( whileStatement )?
        int alt188=2;
        int LA188_0 = input.LA(1);

        if ( (LA188_0==WHILE) ) {
            alt188=1;
        }
        switch (alt188) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: whileStatement
                {
                pushFollow(FOLLOW_whileStatement_in_synpred104_SSQSA_M23964);
                whileStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred104_SSQSA_M2

    // $ANTLR start synpred106_SSQSA_M2
    public final void synpred106_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:639:4: ( ( repeatStatement )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:639:4: ( repeatStatement )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:639:4: ( repeatStatement )?
        int alt189=2;
        int LA189_0 = input.LA(1);

        if ( (LA189_0==REPEAT) ) {
            alt189=1;
        }
        switch (alt189) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: repeatStatement
                {
                pushFollow(FOLLOW_repeatStatement_in_synpred106_SSQSA_M23971);
                repeatStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred106_SSQSA_M2

    // $ANTLR start synpred108_SSQSA_M2
    public final void synpred108_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:640:4: ( ( loopStatement )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:640:4: ( loopStatement )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:640:4: ( loopStatement )?
        int alt190=2;
        int LA190_0 = input.LA(1);

        if ( (LA190_0==LOOP) ) {
            alt190=1;
        }
        switch (alt190) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: loopStatement
                {
                pushFollow(FOLLOW_loopStatement_in_synpred108_SSQSA_M23978);
                loopStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred108_SSQSA_M2

    // $ANTLR start synpred110_SSQSA_M2
    public final void synpred110_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:641:4: ( ( forStatement )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:641:4: ( forStatement )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:641:4: ( forStatement )?
        int alt191=2;
        int LA191_0 = input.LA(1);

        if ( (LA191_0==FOR) ) {
            alt191=1;
        }
        switch (alt191) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: forStatement
                {
                pushFollow(FOLLOW_forStatement_in_synpred110_SSQSA_M23985);
                forStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred110_SSQSA_M2

    // $ANTLR start synpred112_SSQSA_M2
    public final void synpred112_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:642:4: ( ( withStatement )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:642:4: ( withStatement )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:642:4: ( withStatement )?
        int alt192=2;
        int LA192_0 = input.LA(1);

        if ( (LA192_0==WITH) ) {
            alt192=1;
        }
        switch (alt192) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: withStatement
                {
                pushFollow(FOLLOW_withStatement_in_synpred112_SSQSA_M23992);
                withStatement();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred112_SSQSA_M2

    // $ANTLR start synpred114_SSQSA_M2
    public final void synpred114_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:643:4: ( ( 'EXIT' )? )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:643:4: ( 'EXIT' )?
        {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:643:4: ( 'EXIT' )?
        int alt193=2;
        int LA193_0 = input.LA(1);

        if ( (LA193_0==EXIT) ) {
            alt193=1;
        }
        switch (alt193) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: 'EXIT'
                {
                match(input,EXIT,FOLLOW_EXIT_in_synpred114_SSQSA_M23999); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred114_SSQSA_M2

    // $ANTLR start synpred117_SSQSA_M2
    public final void synpred117_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:652:2: ( assignment )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:652:2: assignment
        {
        pushFollow(FOLLOW_assignment_in_synpred117_SSQSA_M24050);
        assignment();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred117_SSQSA_M2

    // $ANTLR start synpred118_SSQSA_M2
    public final void synpred118_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:652:15: ( procCall )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:652:15: procCall
        {
        pushFollow(FOLLOW_procCall_in_synpred118_SSQSA_M24054);
        procCall();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred118_SSQSA_M2

    // $ANTLR start synpred129_SSQSA_M2
    public final void synpred129_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:11: ( elsifBranch )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:11: elsifBranch
        {
        pushFollow(FOLLOW_elsifBranch_in_synpred129_SSQSA_M24520);
        elsifBranch();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred129_SSQSA_M2

    // $ANTLR start synpred130_SSQSA_M2
    public final void synpred130_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:24: ( elseBranch )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:717:24: elseBranch
        {
        pushFollow(FOLLOW_elseBranch_in_synpred130_SSQSA_M24523);
        elseBranch();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred130_SSQSA_M2

    // $ANTLR start synpred138_SSQSA_M2
    public final void synpred138_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:2: ( 'PROCEDURE' ident ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:2: 'PROCEDURE' ident ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
        {
        match(input,PROCEDURE,FOLLOW_PROCEDURE_in_synpred138_SSQSA_M25029); if (state.failed) return ;
        pushFollow(FOLLOW_ident_in_synpred138_SSQSA_M25031);
        ident();

        state._fsp--;
        if (state.failed) return ;
        match(input,122,FOLLOW_122_in_synpred138_SSQSA_M25034); if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:25: ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
        int alt197=2;
        int LA197_0 = input.LA(1);

        if ( (LA197_0==BEGIN||LA197_0==CONST_||LA197_0==END||LA197_0==MODULE||LA197_0==PROCEDURE||LA197_0==TYPE||LA197_0==VAR) ) {
            alt197=1;
        }
        else if ( (LA197_0==FORWARD) ) {
            alt197=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 197, 0, input);

            throw nvae;
        }
        switch (alt197) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:26: ( ( procDeclaration )* procBlock ident )
                {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:26: ( ( procDeclaration )* procBlock ident )
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:28: ( procDeclaration )* procBlock ident
                {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:28: ( procDeclaration )*
                loop196:
                do {
                    int alt196=2;
                    int LA196_0 = input.LA(1);

                    if ( (LA196_0==CONST_||LA196_0==MODULE||LA196_0==PROCEDURE||LA196_0==TYPE||LA196_0==VAR) ) {
                        alt196=1;
                    }


                    switch (alt196) {
                	case 1 :
                	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: procDeclaration
                	    {
                	    pushFollow(FOLLOW_procDeclaration_in_synpred138_SSQSA_M25039);
                	    procDeclaration();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop196;
                    }
                } while (true);

                pushFollow(FOLLOW_procBlock_in_synpred138_SSQSA_M25042);
                procBlock();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_ident_in_synpred138_SSQSA_M25044);
                ident();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:782:64: FORWARD
                {
                match(input,FORWARD,FOLLOW_FORWARD_in_synpred138_SSQSA_M25049); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred138_SSQSA_M2

    // $ANTLR start synpred144_SSQSA_M2
    public final void synpred144_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:785:2: ( 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:785:2: 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
        {
        match(input,PROCEDURE,FOLLOW_PROCEDURE_in_synpred144_SSQSA_M25090); if (state.failed) return ;
        pushFollow(FOLLOW_ident_in_synpred144_SSQSA_M25094);
        ident();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:787:2: ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:787:8: '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* )
        {
        match(input,115,FOLLOW_115_in_synpred144_SSQSA_M25104); if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:14: ( procParams ( ';' procParams )* )?
        int alt201=2;
        int LA201_0 = input.LA(1);

        if ( (LA201_0==VAR||LA201_0==IDENT) ) {
            alt201=1;
        }
        switch (alt201) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:16: procParams ( ';' procParams )*
                {
                pushFollow(FOLLOW_procParams_in_synpred144_SSQSA_M25122);
                procParams();

                state._fsp--;
                if (state.failed) return ;
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:27: ( ';' procParams )*
                loop200:
                do {
                    int alt200=2;
                    int LA200_0 = input.LA(1);

                    if ( (LA200_0==122) ) {
                        alt200=1;
                    }


                    switch (alt200) {
                	case 1 :
                	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:788:29: ';' procParams
                	    {
                	    match(input,122,FOLLOW_122_in_synpred144_SSQSA_M25126); if (state.failed) return ;
                	    pushFollow(FOLLOW_procParams_in_synpred144_SSQSA_M25128);
                	    procParams();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop200;
                    }
                } while (true);


                }
                break;

        }

        match(input,116,FOLLOW_116_in_synpred144_SSQSA_M25143); if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:8: ( ':' ident ( '.' ident )* )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:10: ':' ident ( '.' ident )*
        {
        match(input,123,FOLLOW_123_in_synpred144_SSQSA_M25155); if (state.failed) return ;
        pushFollow(FOLLOW_ident_in_synpred144_SSQSA_M25157);
        ident();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:20: ( '.' ident )*
        loop202:
        do {
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( (LA202_0==DOT) ) {
                alt202=1;
            }


            switch (alt202) {
        	case 1 :
        	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:790:22: '.' ident
        	    {
        	    match(input,DOT,FOLLOW_DOT_in_synpred144_SSQSA_M25161); if (state.failed) return ;
        	    pushFollow(FOLLOW_ident_in_synpred144_SSQSA_M25163);
        	    ident();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop202;
            }
        } while (true);


        }


        }

        match(input,122,FOLLOW_122_in_synpred144_SSQSA_M25176); if (state.failed) return ;
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:2: ( ( ( procDeclaration )* procBlock ident ) | FORWARD )
        int alt204=2;
        int LA204_0 = input.LA(1);

        if ( (LA204_0==BEGIN||LA204_0==CONST_||LA204_0==END||LA204_0==MODULE||LA204_0==PROCEDURE||LA204_0==TYPE||LA204_0==VAR) ) {
            alt204=1;
        }
        else if ( (LA204_0==FORWARD) ) {
            alt204=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 204, 0, input);

            throw nvae;
        }
        switch (alt204) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:3: ( ( procDeclaration )* procBlock ident )
                {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:3: ( ( procDeclaration )* procBlock ident )
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:5: ( procDeclaration )* procBlock ident
                {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:5: ( procDeclaration )*
                loop203:
                do {
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==CONST_||LA203_0==MODULE||LA203_0==PROCEDURE||LA203_0==TYPE||LA203_0==VAR) ) {
                        alt203=1;
                    }


                    switch (alt203) {
                	case 1 :
                	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:0:0: procDeclaration
                	    {
                	    pushFollow(FOLLOW_procDeclaration_in_synpred144_SSQSA_M25183);
                	    procDeclaration();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop203;
                    }
                } while (true);

                pushFollow(FOLLOW_procBlock_in_synpred144_SSQSA_M25186);
                procBlock();

                state._fsp--;
                if (state.failed) return ;
                pushFollow(FOLLOW_ident_in_synpred144_SSQSA_M25188);
                ident();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;
            case 2 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:793:41: FORWARD
                {
                match(input,FORWARD,FOLLOW_FORWARD_in_synpred144_SSQSA_M25193); if (state.failed) return ;

                }
                break;

        }


        }
    }
    // $ANTLR end synpred144_SSQSA_M2

    // $ANTLR start synpred188_SSQSA_M2
    public final void synpred188_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:913:2: ( 'PROCEDURE' ident ';' )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:913:2: 'PROCEDURE' ident ';'
        {
        match(input,PROCEDURE,FOLLOW_PROCEDURE_in_synpred188_SSQSA_M26192); if (state.failed) return ;
        pushFollow(FOLLOW_ident_in_synpred188_SSQSA_M26194);
        ident();

        state._fsp--;
        if (state.failed) return ;
        match(input,122,FOLLOW_122_in_synpred188_SSQSA_M26196); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_SSQSA_M2

    // Delegated rules

    public final boolean synpred100_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred188_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred188_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred114_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred98_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred98_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred130_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred130_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred144_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred144_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred118_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred118_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred129_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred129_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred104_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred104_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred117_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred117_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred102_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred106_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred106_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA50 dfa50 = new DFA50(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA148 dfa148 = new DFA148(this);
    static final String DFA6_eotS =
        "\35\uffff";
    static final String DFA6_eofS =
        "\1\1\34\uffff";
    static final String DFA6_minS =
        "\1\15\17\uffff\1\0\12\uffff\1\0\1\uffff";
    static final String DFA6_maxS =
        "\1\173\17\uffff\1\0\12\uffff\1\0\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\2\32\uffff\1\1";
    static final String DFA6_specialS =
        "\20\uffff\1\0\12\uffff\1\1\1\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\14\uffff\1\1\3\uffff\1\1\1\uffff\1\34\20\uffff\10\1\1"+
            "\20\1\33\4\uffff\1\1\47\uffff\3\1\4\uffff\1\1\4\uffff\5\1\1"+
            "\uffff\3\1",
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
            "\1\uffff",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 306:27: ( addOperator constTerm )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_16 = input.LA(1);

                         
                        int index6_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_SSQSA_M2()) ) {s = 28;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_16);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_27 = input.LA(1);

                         
                        int index6_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred13_SSQSA_M2()) ) {s = 28;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_27);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\44\uffff";
    static final String DFA10_eofS =
        "\1\2\43\uffff";
    static final String DFA10_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA10_maxS =
        "\1\173\1\0\42\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA10_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\7\uffff\2\2\14\uffff\1\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\17\uffff\15\2\2\uffff\1\2\47\uffff\3\2\4\uffff\1\2\4\uffff"+
            "\2\2\1\1\2\2\1\uffff\3\2",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "340:12: ( constSet )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_1 = input.LA(1);

                         
                        int index10_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred24_SSQSA_M2()) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index10_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA22_eotS =
        "\13\uffff";
    static final String DFA22_eofS =
        "\13\uffff";
    static final String DFA22_minS =
        "\1\36\1\uffff\2\0\7\uffff";
    static final String DFA22_maxS =
        "\1\165\1\uffff\2\0\7\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\10\uffff\1\2";
    static final String DFA22_specialS =
        "\2\uffff\1\0\1\1\7\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\22\uffff\1\1\7\uffff\2\1\54\uffff\1\1\1\2\1\3\4\uffff"+
            "\1\1\4\uffff\1\1\1\uffff\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "411:6: ( constExpression DOTDOT | number )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_2 = input.LA(1);

                         
                        int index22_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_SSQSA_M2()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index22_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_3 = input.LA(1);

                         
                        int index22_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_SSQSA_M2()) ) {s = 1;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index22_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA50_eotS =
        "\22\uffff";
    static final String DFA50_eofS =
        "\22\uffff";
    static final String DFA50_minS =
        "\1\163\2\5\1\37\1\76\1\0\2\147\1\5\2\uffff\1\76\1\5\1\37\1\76\2"+
        "\147\1\76";
    static final String DFA50_maxS =
        "\1\163\1\164\1\147\1\37\1\166\1\0\3\147\2\uffff\1\166\1\147\1\37"+
        "\1\166\2\147\1\166";
    static final String DFA50_acceptS =
        "\11\uffff\1\1\1\2\7\uffff";
    static final String DFA50_specialS =
        "\5\uffff\1\0\14\uffff}>";
    static final String[] DFA50_transitionS = {
            "\1\1",
            "\1\3\46\uffff\1\2\72\uffff\1\4\14\uffff\1\5",
            "\1\3\141\uffff\1\4",
            "\1\6",
            "\1\7\65\uffff\1\5\1\uffff\1\10",
            "\1\uffff",
            "\1\4",
            "\1\13",
            "\1\15\46\uffff\1\14\72\uffff\1\16",
            "",
            "",
            "\1\7\65\uffff\1\5\1\uffff\1\10",
            "\1\15\141\uffff\1\16",
            "\1\17",
            "\1\20\65\uffff\1\5\1\uffff\1\10",
            "\1\16",
            "\1\21",
            "\1\20\65\uffff\1\5\1\uffff\1\10"
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
            return "510:1: formalTypeList : ( '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' -> ^( TYPE ( formalType )* ) | '(' ( ( 'VAR' )? formalType ( ',' ( 'VAR' )? formalType )* )? ')' ( ':' ident ( '.' ident )* )? -> ^( TYPE ( formalType )* ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA50_5 = input.LA(1);

                         
                        int index50_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_SSQSA_M2()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index50_5);
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
    static final String DFA80_eotS =
        "\22\uffff";
    static final String DFA80_eofS =
        "\1\6\21\uffff";
    static final String DFA80_minS =
        "\1\10\1\uffff\7\0\11\uffff";
    static final String DFA80_maxS =
        "\1\174\1\uffff\7\0\11\uffff";
    static final String DFA80_acceptS =
        "\1\uffff\1\1\7\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA80_specialS =
        "\2\uffff\1\3\1\0\1\6\1\4\1\2\1\1\1\5\11\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\12\1\uffff\1\1\3\uffff\1\4\1\3\1\5\1\20\1\uffff\1\16\2\uffff"+
            "\1\11\2\uffff\1\1\1\uffff\1\15\11\uffff\1\14\1\21\4\uffff\1"+
            "\10\1\uffff\1\13\1\17\70\uffff\1\1\22\uffff\1\2\1\uffff\1\7",
            "",
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

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "634:1: statement : ( ( assignmentOrProcCall )? | ( ifStatement )? | ( caseStatement )? | ( whileStatement )? | ( repeatStatement )? | ( loopStatement )? | ( forStatement )? | ( withStatement )? | ( 'EXIT' )? -> ( ^( JUMP_STATEMENT 'EXIT' ) )? | ( 'RETURN' ( expression )? )? -> ( ^( JUMP_STATEMENT 'RETURN' ( expression )? ) )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA80_3 = input.LA(1);

                         
                        int index80_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_SSQSA_M2()) ) {s = 1;}

                        else if ( (synpred100_SSQSA_M2()) ) {s = 9;}

                        else if ( (synpred102_SSQSA_M2()) ) {s = 10;}

                        else if ( (synpred104_SSQSA_M2()) ) {s = 11;}

                        else if ( (synpred106_SSQSA_M2()) ) {s = 12;}

                        else if ( (synpred108_SSQSA_M2()) ) {s = 13;}

                        else if ( (synpred110_SSQSA_M2()) ) {s = 14;}

                        else if ( (synpred112_SSQSA_M2()) ) {s = 15;}

                        else if ( (synpred114_SSQSA_M2()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA80_7 = input.LA(1);

                         
                        int index80_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_SSQSA_M2()) ) {s = 1;}

                        else if ( (synpred100_SSQSA_M2()) ) {s = 9;}

                        else if ( (synpred102_SSQSA_M2()) ) {s = 10;}

                        else if ( (synpred104_SSQSA_M2()) ) {s = 11;}

                        else if ( (synpred106_SSQSA_M2()) ) {s = 12;}

                        else if ( (synpred108_SSQSA_M2()) ) {s = 13;}

                        else if ( (synpred110_SSQSA_M2()) ) {s = 14;}

                        else if ( (synpred112_SSQSA_M2()) ) {s = 15;}

                        else if ( (synpred114_SSQSA_M2()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA80_6 = input.LA(1);

                         
                        int index80_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_SSQSA_M2()) ) {s = 1;}

                        else if ( (synpred100_SSQSA_M2()) ) {s = 9;}

                        else if ( (synpred102_SSQSA_M2()) ) {s = 10;}

                        else if ( (synpred104_SSQSA_M2()) ) {s = 11;}

                        else if ( (synpred106_SSQSA_M2()) ) {s = 12;}

                        else if ( (synpred108_SSQSA_M2()) ) {s = 13;}

                        else if ( (synpred110_SSQSA_M2()) ) {s = 14;}

                        else if ( (synpred112_SSQSA_M2()) ) {s = 15;}

                        else if ( (synpred114_SSQSA_M2()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA80_2 = input.LA(1);

                         
                        int index80_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_SSQSA_M2()) ) {s = 1;}

                        else if ( (synpred100_SSQSA_M2()) ) {s = 9;}

                        else if ( (synpred102_SSQSA_M2()) ) {s = 10;}

                        else if ( (synpred104_SSQSA_M2()) ) {s = 11;}

                        else if ( (synpred106_SSQSA_M2()) ) {s = 12;}

                        else if ( (synpred108_SSQSA_M2()) ) {s = 13;}

                        else if ( (synpred110_SSQSA_M2()) ) {s = 14;}

                        else if ( (synpred112_SSQSA_M2()) ) {s = 15;}

                        else if ( (synpred114_SSQSA_M2()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_2);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA80_5 = input.LA(1);

                         
                        int index80_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_SSQSA_M2()) ) {s = 1;}

                        else if ( (synpred100_SSQSA_M2()) ) {s = 9;}

                        else if ( (synpred102_SSQSA_M2()) ) {s = 10;}

                        else if ( (synpred104_SSQSA_M2()) ) {s = 11;}

                        else if ( (synpred106_SSQSA_M2()) ) {s = 12;}

                        else if ( (synpred108_SSQSA_M2()) ) {s = 13;}

                        else if ( (synpred110_SSQSA_M2()) ) {s = 14;}

                        else if ( (synpred112_SSQSA_M2()) ) {s = 15;}

                        else if ( (synpred114_SSQSA_M2()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA80_8 = input.LA(1);

                         
                        int index80_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_SSQSA_M2()) ) {s = 1;}

                        else if ( (synpred100_SSQSA_M2()) ) {s = 9;}

                        else if ( (synpred102_SSQSA_M2()) ) {s = 10;}

                        else if ( (synpred104_SSQSA_M2()) ) {s = 11;}

                        else if ( (synpred106_SSQSA_M2()) ) {s = 12;}

                        else if ( (synpred108_SSQSA_M2()) ) {s = 13;}

                        else if ( (synpred110_SSQSA_M2()) ) {s = 14;}

                        else if ( (synpred112_SSQSA_M2()) ) {s = 15;}

                        else if ( (synpred114_SSQSA_M2()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA80_4 = input.LA(1);

                         
                        int index80_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred98_SSQSA_M2()) ) {s = 1;}

                        else if ( (synpred100_SSQSA_M2()) ) {s = 9;}

                        else if ( (synpred102_SSQSA_M2()) ) {s = 10;}

                        else if ( (synpred104_SSQSA_M2()) ) {s = 11;}

                        else if ( (synpred106_SSQSA_M2()) ) {s = 12;}

                        else if ( (synpred108_SSQSA_M2()) ) {s = 13;}

                        else if ( (synpred110_SSQSA_M2()) ) {s = 14;}

                        else if ( (synpred112_SSQSA_M2()) ) {s = 15;}

                        else if ( (synpred114_SSQSA_M2()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index80_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 80, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA148_eotS =
        "\36\uffff";
    static final String DFA148_eofS =
        "\36\uffff";
    static final String DFA148_minS =
        "\1\42\1\147\1\163\1\54\1\0\1\147\1\166\1\172\2\uffff\1\147\1\5"+
        "\1\uffff\1\166\1\37\1\76\2\147\1\54\1\76\1\147\1\166\1\147\1\5\1"+
        "\166\1\37\1\76\2\147\1\76";
    static final String DFA148_maxS =
        "\1\42\1\147\1\172\1\164\1\0\1\147\2\173\2\uffff\2\147\1\uffff\1"+
        "\173\1\37\1\172\3\147\1\172\1\147\1\173\2\147\1\173\1\37\1\172\2"+
        "\147\1\172";
    static final String DFA148_acceptS =
        "\10\uffff\1\1\1\3\2\uffff\1\2\21\uffff";
    static final String DFA148_specialS =
        "\4\uffff\1\0\31\uffff}>";
    static final String[] DFA148_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\6\uffff\1\4",
            "\1\5\72\uffff\1\6\14\uffff\1\7",
            "\1\uffff",
            "\1\6",
            "\1\12\4\uffff\1\13",
            "\1\11\1\14",
            "",
            "",
            "\1\15",
            "\1\16\141\uffff\1\17",
            "",
            "\1\12\4\uffff\1\13",
            "\1\20",
            "\1\21\65\uffff\1\7\5\uffff\1\22",
            "\1\17",
            "\1\23",
            "\1\24\72\uffff\1\25",
            "\1\21\65\uffff\1\7\5\uffff\1\22",
            "\1\25",
            "\1\26\4\uffff\1\27",
            "\1\30",
            "\1\31\141\uffff\1\32",
            "\1\26\4\uffff\1\27",
            "\1\33",
            "\1\34\65\uffff\1\7\5\uffff\1\22",
            "\1\32",
            "\1\35",
            "\1\34\65\uffff\1\7\5\uffff\1\22"
    };

    static final short[] DFA148_eot = DFA.unpackEncodedString(DFA148_eotS);
    static final short[] DFA148_eof = DFA.unpackEncodedString(DFA148_eofS);
    static final char[] DFA148_min = DFA.unpackEncodedStringToUnsignedChars(DFA148_minS);
    static final char[] DFA148_max = DFA.unpackEncodedStringToUnsignedChars(DFA148_maxS);
    static final short[] DFA148_accept = DFA.unpackEncodedString(DFA148_acceptS);
    static final short[] DFA148_special = DFA.unpackEncodedString(DFA148_specialS);
    static final short[][] DFA148_transition;

    static {
        int numStates = DFA148_transitionS.length;
        DFA148_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA148_transition[i] = DFA.unpackEncodedString(DFA148_transitionS[i]);
        }
    }

    class DFA148 extends DFA {

        public DFA148(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 148;
            this.eot = DFA148_eot;
            this.eof = DFA148_eof;
            this.min = DFA148_min;
            this.max = DFA148_max;
            this.accept = DFA148_accept;
            this.special = DFA148_special;
            this.transition = DFA148_transition;
        }
        public String getDescription() {
            return "912:1: procedureHeading : ( 'PROCEDURE' ident ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' ( ':' ident ( '.' ident )* ) ) ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE ident ( ^( SEPARATOR '.' ident ) )* ) ^( FORMAL_PARAM_LIST ( procParams )* ) ) | 'PROCEDURE' ident ( '(' ( procParams ( ';' procParams )* )? ')' )? ';' -> ^( FUNCTION_DECL ^( NAME ident ) ^( TYPE VOID ) ^( FORMAL_PARAM_LIST ( procParams )* ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA148_4 = input.LA(1);

                         
                        int index148_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred188_SSQSA_M2()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index148_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 148, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_IDENT_in_ident1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_number1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_real1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCALE_FACTOR_in_scaleFactor1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEX_DIGIT_in_hexDigit1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIGIT_in_digit1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTAL_DIGIT_in_octalDigit1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_string1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_qualident1891 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualident1912 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_qualident1914 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ident_in_constantDeclaration1955 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EQUAL_OP_in_constantDeclaration1957 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_constantDeclaration1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleConstExpr_in_constExpression1992 = new BitSet(new long[]{0x01FC000004000002L});
    public static final BitSet FOLLOW_relation_in_constExpression1996 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_simpleConstExpr_in_constExpression1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_OP_in_relation2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_EQUAL_OP_in_relation2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PASCAL_NOT_EQUAL_OP_in_relation2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_OP_in_relation2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_OP_in_relation2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_OP_in_relation2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_OP_in_relation2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relation2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simpleConstExpr2135 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constTerm_in_simpleConstExpr2146 = new BitSet(new long[]{0x0600000100000002L});
    public static final BitSet FOLLOW_addOperator_in_simpleConstExpr2150 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constTerm_in_simpleConstExpr2153 = new BitSet(new long[]{0x0600000100000002L});
    public static final BitSet FOLLOW_PLUS_OP_in_addOperator2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_OP_in_addOperator2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_addOperator2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constFactor_in_constTerm2221 = new BitSet(new long[]{0x1801000010001012L});
    public static final BitSet FOLLOW_mulOperator_in_constTerm2225 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constFactor_in_constTerm2228 = new BitSet(new long[]{0x1801000010001012L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_mulOperator2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGICAL_AND_OP_in_mulOperator2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULTIPLY_OP_in_mulOperator2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_OP_in_mulOperator2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_mulOperator2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_mulOperator2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_constFactor2356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_constFactor2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualident_in_constFactor2366 = new BitSet(new long[]{0x0000000000000002L,0x0020000000000000L});
    public static final BitSet FOLLOW_constSet_in_constFactor2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constSet_in_constFactor2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_constFactor2383 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_constFactor2385 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_constFactor2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_constFactor2394 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_LOGICAL_NOT_OP_in_constFactor2399 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constFactor_in_constFactor2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_constSet2421 = new BitSet(new long[]{0x0602000040000000L,0x00A8438000000000L});
    public static final BitSet FOLLOW_constElement_in_constSet2425 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_constSet2429 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constElement_in_constSet2431 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_119_in_constSet2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constExpression_in_constElement2459 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_DOTDOT_in_constElement2463 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_constElement2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_typeDeclaration2483 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EQUAL_OP_in_typeDeclaration2485 = new BitSet(new long[]{0x0000009600000020L,0x0108008000000000L});
    public static final BitSet FOLLOW_type_in_typeDeclaration2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_defModTypeDeclaration2518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_defModTypeDeclaration2535 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_EQUAL_OP_in_defModTypeDeclaration2537 = new BitSet(new long[]{0x0000009600000020L,0x0108008000000000L});
    public static final BitSet FOLLOW_type_in_defModTypeDeclaration2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleType_in_type2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayType_in_type2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_recordType_in_type2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setType_in_type2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pointerType_in_type2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureType_in_type2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_simpleType2604 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_DOT_in_simpleType2608 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_simpleType2610 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_subrangeType_in_simpleType2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_simpleType2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_subrangeType2656 = new BitSet(new long[]{0x0000000000000000L,0x0100008000000000L});
    public static final BitSet FOLLOW_range_in_subrangeType2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_range_in_subrangeType2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_enumeration2699 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_identList_in_enumeration2701 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_enumeration2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_identList2717 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_identList2721 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_identList2723 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_120_in_range2744 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_range2747 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_DOTDOT_in_range2749 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_number_in_range2753 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_range2756 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_range2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_arrayType2772 = new BitSet(new long[]{0x0000000000000000L,0x0108008000000000L});
    public static final BitSet FOLLOW_simpleType_in_arrayType2774 = new BitSet(new long[]{0x0000000080000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_arrayType2778 = new BitSet(new long[]{0x0000000000000000L,0x0108008000000000L});
    public static final BitSet FOLLOW_simpleType_in_arrayType2780 = new BitSet(new long[]{0x0000000080000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_OF_in_arrayType2785 = new BitSet(new long[]{0x0000009600000020L,0x0108008000000000L});
    public static final BitSet FOLLOW_type_in_arrayType2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RECORD_in_recordType2827 = new BitSet(new long[]{0x0000000000000100L,0x0000008000000000L});
    public static final BitSet FOLLOW_fieldListSequence_in_recordType2829 = new BitSet(new long[]{0x0000000000010000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_recordType2832 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_recordType2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldList_in_fieldListSequence2860 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_fieldListSequence2864 = new BitSet(new long[]{0x0000000000000100L,0x0000008000000000L});
    public static final BitSet FOLLOW_fieldList_in_fieldListSequence2866 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_identList_in_fieldList2891 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_fieldList2893 = new BitSet(new long[]{0x0000009600000020L,0x0108008000000000L});
    public static final BitSet FOLLOW_type_in_fieldList2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_fieldList2909 = new BitSet(new long[]{0x0000000000000000L,0x0800008000000000L});
    public static final BitSet FOLLOW_ident_in_fieldList2915 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_fieldList2920 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_qualident_in_fieldList2924 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OF_in_fieldList2926 = new BitSet(new long[]{0x0602000040014000L,0x1428438000000000L});
    public static final BitSet FOLLOW_variant_in_fieldList2928 = new BitSet(new long[]{0x0000000000014000L,0x1400000000000000L});
    public static final BitSet FOLLOW_122_in_fieldList2931 = new BitSet(new long[]{0x0000000000014000L,0x1400000000000000L});
    public static final BitSet FOLLOW_124_in_fieldList2937 = new BitSet(new long[]{0x0602000040014000L,0x1428438000000000L});
    public static final BitSet FOLLOW_variant_in_fieldList2939 = new BitSet(new long[]{0x0000000000014000L,0x1400000000000000L});
    public static final BitSet FOLLOW_122_in_fieldList2942 = new BitSet(new long[]{0x0000000000014000L,0x1400000000000000L});
    public static final BitSet FOLLOW_ELSE_in_fieldList2954 = new BitSet(new long[]{0x0000000000000100L,0x0000008000000000L});
    public static final BitSet FOLLOW_fieldListSequence_in_fieldList2956 = new BitSet(new long[]{0x0000000000010000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_fieldList2962 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_fieldList2967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseLabelList_in_variant3052 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_variant3054 = new BitSet(new long[]{0x0000000000000100L,0x0000008000000000L});
    public static final BitSet FOLLOW_fieldListSequence_in_variant3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseLabels_in_caseLabelList3073 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_caseLabelList3077 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_caseLabels_in_caseLabelList3079 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_constExpression_in_caseLabels3100 = new BitSet(new long[]{0x8602000040000002L,0x0028438000000000L});
    public static final BitSet FOLLOW_DOTDOT_in_caseLabels3105 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_caseLabels3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SET_in_setType3125 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OF_in_setType3127 = new BitSet(new long[]{0x0000000000000000L,0x0108008000000000L});
    public static final BitSet FOLLOW_simpleType_in_setType3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POINTER_in_pointerType3157 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TO_in_pointerType3159 = new BitSet(new long[]{0x0000009600000020L,0x0108008000000000L});
    public static final BitSet FOLLOW_type_in_pointerType3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureType3189 = new BitSet(new long[]{0x0000000000000002L,0x0808000000000000L});
    public static final BitSet FOLLOW_formalTypeList_in_procedureType3193 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_procedureType3199 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_procedureType3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_formalTypeList3238 = new BitSet(new long[]{0x0000100000000020L,0x0010008000000000L});
    public static final BitSet FOLLOW_VAR_in_formalTypeList3250 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_formalTypeList3254 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_118_in_formalTypeList3267 = new BitSet(new long[]{0x0000100000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_VAR_in_formalTypeList3271 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_formalTypeList3276 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_116_in_formalTypeList3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_formalTypeList3309 = new BitSet(new long[]{0x0000100000000020L,0x0010008000000000L});
    public static final BitSet FOLLOW_VAR_in_formalTypeList3321 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_formalTypeList3325 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_118_in_formalTypeList3338 = new BitSet(new long[]{0x0000100000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_VAR_in_formalTypeList3342 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_formalTypeList3347 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_116_in_formalTypeList3363 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_formalTypeList3368 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_formalTypeList3370 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_DOT_in_formalTypeList3374 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_formalTypeList3376 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ident_in_variableDeclaration3423 = new BitSet(new long[]{0x0000000000000000L,0x0940000000000000L});
    public static final BitSet FOLLOW_machineAddress_in_variableDeclaration3425 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_118_in_variableDeclaration3430 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_variableDeclaration3432 = new BitSet(new long[]{0x0000000000000000L,0x0940000000000000L});
    public static final BitSet FOLLOW_machineAddress_in_variableDeclaration3434 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_123_in_variableDeclaration3439 = new BitSet(new long[]{0x0000009600000020L,0x0108008000000000L});
    public static final BitSet FOLLOW_type_in_variableDeclaration3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_designatorTail_in_designatorTails3487 = new BitSet(new long[]{0x2000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_designatorTail3502 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expList_in_designatorTail3504 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_designatorTail3506 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_DOT_in_designatorTail3510 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_designatorTail3512 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_POINTER_OP_in_designatorTail3550 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_DOT_in_designatorTail3554 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_designatorTail3556 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_expression_in_expList3606 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_expList3610 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_expList3613 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_simpleExpression_in_expression3629 = new BitSet(new long[]{0x01FC000004000002L});
    public static final BitSet FOLLOW_relation_in_expression3633 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_simpleExpression_in_expression3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_simpleExpression3653 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression3664 = new BitSet(new long[]{0x0600000100000002L});
    public static final BitSet FOLLOW_addOperator_in_simpleExpression3668 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_term_in_simpleExpression3671 = new BitSet(new long[]{0x0600000100000002L});
    public static final BitSet FOLLOW_factor_in_term3688 = new BitSet(new long[]{0x1801000010001012L});
    public static final BitSet FOLLOW_mulOperator_in_term3692 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_factor_in_term3695 = new BitSet(new long[]{0x1801000010001012L});
    public static final BitSet FOLLOW_qualident_in_factor3713 = new BitSet(new long[]{0x2000000000000002L,0x0128000000000000L});
    public static final BitSet FOLLOW_set_in_factor3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actualParameters_in_factor3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_designatorTails_in_factor3760 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_actualParameters_in_factor3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_factor3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_factor3821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_factor3827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_factor3833 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_factor3835 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_factor3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_factor3858 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_factor_in_factor3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_set3878 = new BitSet(new long[]{0x0600000040000000L,0x00A8438000000000L});
    public static final BitSet FOLLOW_element_in_set3882 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_118_in_set3886 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_element_in_set3888 = new BitSet(new long[]{0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_119_in_set3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_element3913 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_DOTDOT_in_element3917 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_element3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOrProcCall_in_statement3943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseStatement_in_statement3957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement3964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatStatement_in_statement3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_statement3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statement3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_statement3999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_statement4015 = new BitSet(new long[]{0x0600000040000002L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_statement4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignmentOrProcCall4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procCall_in_assignmentOrProcCall4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incdeccall_in_assignmentOrProcCall4058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualidentWithTail_in_assignment4072 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ASSIGN_OP_in_assignment4074 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_assignment4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualident_in_qualidentWithTail4113 = new BitSet(new long[]{0x2000000000000000L,0x0128000000000000L});
    public static final BitSet FOLLOW_designatorTails_in_qualidentWithTail4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_actualParameters4149 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_actualParameters4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_actualParameters4157 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters4162 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_118_in_actualParameters4165 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_actualParameters4167 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_116_in_actualParameters4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_incDecParameters4202 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_incDecParameters4205 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_118_in_incDecParameters4208 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_incDecParameters4210 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_116_in_incDecParameters4214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_incdeccall4258 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_DEC_in_incdeccall4262 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_incDecParameters_in_incdeccall4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qualident_in_procCall4296 = new BitSet(new long[]{0x2000000000000000L,0x0128000000000000L});
    public static final BitSet FOLLOW_designatorTails_in_procCall4298 = new BitSet(new long[]{0x0000000000000002L,0x0008000000000000L});
    public static final BitSet FOLLOW_actualParameters_in_procCall4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_statementSequence4341 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_statementSequence4345 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statement_in_statementSequence4347 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_IF_in_ifBranch4373 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_ifBranch4375 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_THEN_in_ifBranch4377 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_ifBranch4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELSIF_in_elsifBranch4424 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_elsifBranch4426 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_THEN_in_elsifBranch4428 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_elsifBranch4430 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ELSE_in_elseBranch4479 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_elseBranch4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifBranch_in_ifStatement4518 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_elsifBranch_in_ifStatement4520 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_elseBranch_in_ifStatement4523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_ifStatement4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseStatement4561 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_caseStatement4563 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OF_in_caseStatement4565 = new BitSet(new long[]{0x0602000040014000L,0x1028438000000000L});
    public static final BitSet FOLLOW_casecase_in_caseStatement4567 = new BitSet(new long[]{0x0000000000014000L,0x1000000000000000L});
    public static final BitSet FOLLOW_124_in_caseStatement4571 = new BitSet(new long[]{0x0602000040014000L,0x1028438000000000L});
    public static final BitSet FOLLOW_casecase_in_caseStatement4573 = new BitSet(new long[]{0x0000000000014000L,0x1000000000000000L});
    public static final BitSet FOLLOW_ELSE_in_caseStatement4581 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_caseStatement4583 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_caseStatement4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseLabelList_in_casecase4660 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_casecase4662 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_casecase4664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement4690 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement4692 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DO_in_whileStatement4694 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_whileStatement4696 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_whileStatement4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REPEAT_in_repeatStatement4749 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_repeatStatement4751 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_UNTIL_in_repeatStatement4753 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_repeatStatement4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement4799 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_forStatement4801 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_ASSIGN_OP_in_forStatement4803 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_forStatement4805 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_TO_in_forStatement4807 = new BitSet(new long[]{0x0600000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_expression_in_forStatement4809 = new BitSet(new long[]{0x0000000000002080L});
    public static final BitSet FOLLOW_BY_in_forStatement4813 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_forStatement4815 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DO_in_forStatement4821 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_forStatement4823 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_forStatement4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOOP_in_loopStatement4929 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_loopStatement4931 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_loopStatement4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement4971 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_qualident_in_withStatement4973 = new BitSet(new long[]{0x2000000000002000L,0x0128000000000000L});
    public static final BitSet FOLLOW_designatorTails_in_withStatement4975 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_DO_in_withStatement4978 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_withStatement4980 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_withStatement4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration5029 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5031 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procedureDeclaration5034 = new BitSet(new long[]{0x0000140420110240L});
    public static final BitSet FOLLOW_procDeclaration_in_procedureDeclaration5039 = new BitSet(new long[]{0x0000140420010240L});
    public static final BitSet FOLLOW_procBlock_in_procedureDeclaration5042 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_in_procedureDeclaration5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration5090 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5094 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_procedureDeclaration5104 = new BitSet(new long[]{0x0000100000000000L,0x0010008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureDeclaration5122 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_122_in_procedureDeclaration5126 = new BitSet(new long[]{0x0000100000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureDeclaration5128 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_116_in_procedureDeclaration5143 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_procedureDeclaration5155 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5157 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DOT_in_procedureDeclaration5161 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5163 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procedureDeclaration5176 = new BitSet(new long[]{0x0000140420110240L});
    public static final BitSet FOLLOW_procDeclaration_in_procedureDeclaration5183 = new BitSet(new long[]{0x0000140420010240L});
    public static final BitSet FOLLOW_procBlock_in_procedureDeclaration5186 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_in_procedureDeclaration5193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureDeclaration5246 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5250 = new BitSet(new long[]{0x0000000000000000L,0x0408000000000000L});
    public static final BitSet FOLLOW_115_in_procedureDeclaration5260 = new BitSet(new long[]{0x0000100000000000L,0x0010008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureDeclaration5278 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_122_in_procedureDeclaration5282 = new BitSet(new long[]{0x0000100000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureDeclaration5284 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_116_in_procedureDeclaration5299 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procedureDeclaration5308 = new BitSet(new long[]{0x0000140420110240L});
    public static final BitSet FOLLOW_procDeclaration_in_procedureDeclaration5315 = new BitSet(new long[]{0x0000140420010240L});
    public static final BitSet FOLLOW_procBlock_in_procedureDeclaration5318 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureDeclaration5320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_in_procedureDeclaration5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_procParams5376 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procParams5381 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_118_in_procParams5385 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procParams5387 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_123_in_procParams5392 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_procParams5394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST__in_procDeclaration5428 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_constantDeclaration_in_procDeclaration5432 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procDeclaration5434 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_TYPE_in_procDeclaration5454 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_procDeclaration5458 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procDeclaration5460 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_VAR_in_procDeclaration5473 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_procDeclaration5477 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procDeclaration5479 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_procedureDeclaration_in_procDeclaration5492 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procDeclaration5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDeclaration_in_procDeclaration5504 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procDeclaration5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_procBlock5527 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_procBlock5529 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_procBlock5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_localVariableDeclaration5561 = new BitSet(new long[]{0x0000000000000000L,0x0940000000000000L});
    public static final BitSet FOLLOW_machineAddress_in_localVariableDeclaration5563 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_118_in_localVariableDeclaration5568 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_localVariableDeclaration5570 = new BitSet(new long[]{0x0000000000000000L,0x0940000000000000L});
    public static final BitSet FOLLOW_machineAddress_in_localVariableDeclaration5572 = new BitSet(new long[]{0x0000000000000000L,0x0840000000000000L});
    public static final BitSet FOLLOW_123_in_localVariableDeclaration5577 = new BitSet(new long[]{0x0000009600000020L,0x0108008000000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_block5615 = new BitSet(new long[]{0x0000140420010240L});
    public static final BitSet FOLLOW_BEGIN_in_block5623 = new BitSet(new long[]{0x000060600A4A0500L,0x0400008000000000L});
    public static final BitSet FOLLOW_statementSequence_in_block5625 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_block5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST__in_declaration5670 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_constantDeclaration_in_declaration5674 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_declaration5676 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_TYPE_in_declaration5692 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_declaration5696 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_declaration5698 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_VAR_in_declaration5717 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_declaration5721 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_declaration5723 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_procedureDeclaration_in_declaration5740 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_declaration5742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDeclaration_in_declaration5751 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_declaration5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDeclaration5771 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_moduleDeclaration5773 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L});
    public static final BitSet FOLLOW_priority_in_moduleDeclaration5777 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_moduleDeclaration5782 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_importList_in_moduleDeclaration5786 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_export_in_moduleDeclaration5793 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_block_in_moduleDeclaration5798 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_moduleDeclaration5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_priority5831 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_priority5833 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_priority5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_importList5857 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_importList5861 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_IMPORT_in_importList5863 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_importIdentList_in_importList5865 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_importList5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importList5887 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_importList5889 = new BitSet(new long[]{0x0000000000000000L,0x0440000000000000L});
    public static final BitSet FOLLOW_118_in_importList5893 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_importList5895 = new BitSet(new long[]{0x0000000000000000L,0x0440000000000000L});
    public static final BitSet FOLLOW_122_in_importList5900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_importIdentList5928 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_importIdentList5931 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_importIdentList5933 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_MODULE_in_definitionModule5987 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_definitionModule5989 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L});
    public static final BitSet FOLLOW_priority_in_definitionModule5993 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_definitionModule5998 = new BitSet(new long[]{0x0000140401250200L});
    public static final BitSet FOLLOW_importList_in_definitionModule6002 = new BitSet(new long[]{0x0000140401250200L});
    public static final BitSet FOLLOW_export_in_definitionModule6008 = new BitSet(new long[]{0x0000140400050200L});
    public static final BitSet FOLLOW_definition_in_definitionModule6014 = new BitSet(new long[]{0x0000140400010200L});
    public static final BitSet FOLLOW_END_in_definitionModule6019 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_definitionModule6021 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DOT_in_definitionModule6023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONST__in_definition6112 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_constantDeclaration_in_definition6116 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_definition6118 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_TYPE_in_definition6132 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_defModTypeDeclaration_in_definition6136 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_definition6138 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_VAR_in_definition6151 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_definition6155 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_definition6157 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_procedureHeading_in_definition6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading6192 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureHeading6194 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procedureHeading6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading6226 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureHeading6230 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_procedureHeading6240 = new BitSet(new long[]{0x0000100000000000L,0x0010008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureHeading6258 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_122_in_procedureHeading6262 = new BitSet(new long[]{0x0000100000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureHeading6264 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_116_in_procedureHeading6279 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_procedureHeading6291 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureHeading6293 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DOT_in_procedureHeading6297 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureHeading6299 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procedureHeading6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_procedureHeading6354 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_procedureHeading6358 = new BitSet(new long[]{0x0000000000000000L,0x0408000000000000L});
    public static final BitSet FOLLOW_115_in_procedureHeading6368 = new BitSet(new long[]{0x0000100000000000L,0x0010008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureHeading6386 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_122_in_procedureHeading6390 = new BitSet(new long[]{0x0000100000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_procParams_in_procedureHeading6392 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_116_in_procedureHeading6407 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_procedureHeading6416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_in_formalType6455 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_OF_in_formalType6457 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_qualident_in_formalType6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_programModule6516 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_programModule6518 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L});
    public static final BitSet FOLLOW_priority_in_programModule6522 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_programModule6527 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_importList_in_programModule6530 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_export_in_programModule6536 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_block_in_programModule6541 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_programModule6543 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DOT_in_programModule6545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPLEMENTATION_in_programModule6572 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_MODULE_in_programModule6574 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_programModule6576 = new BitSet(new long[]{0x0000000000000000L,0x0500000000000000L});
    public static final BitSet FOLLOW_priority_in_programModule6580 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_programModule6585 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_importList_in_programModule6588 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_export_in_programModule6594 = new BitSet(new long[]{0x0000140421250240L});
    public static final BitSet FOLLOW_block_in_programModule6599 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_programModule6601 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DOT_in_programModule6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITION_in_startNonterminal6659 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_125_in_startNonterminal6663 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_definitionModule_in_startNonterminal6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_programModule_in_startNonterminal6682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_machineAddress6744 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constExpression_in_machineAddress6746 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_121_in_machineAddress6748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXPORT_in_export6760 = new BitSet(new long[]{0x0000000800000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_QUALIFIED_in_export6763 = new BitSet(new long[]{0x0000000800000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_identifier_list_in_export6767 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_export6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_identifier_list6780 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_identifier_list6784 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_identifier_list6786 = new BitSet(new long[]{0x0000000000000002L,0x0040000000000000L});
    public static final BitSet FOLLOW_addOperator_in_synpred13_SSQSA_M22150 = new BitSet(new long[]{0x0602000040000000L,0x0028438000000000L});
    public static final BitSet FOLLOW_constTerm_in_synpred13_SSQSA_M22153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constSet_in_synpred24_SSQSA_M22370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constExpression_in_synpred43_SSQSA_M22747 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_DOTDOT_in_synpred43_SSQSA_M22749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_synpred50_SSQSA_M22931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_synpred51_SSQSA_M22942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_synpred65_SSQSA_M23238 = new BitSet(new long[]{0x0000100000000020L,0x0010008000000000L});
    public static final BitSet FOLLOW_VAR_in_synpred65_SSQSA_M23250 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_synpred65_SSQSA_M23254 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_118_in_synpred65_SSQSA_M23267 = new BitSet(new long[]{0x0000100000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_VAR_in_synpred65_SSQSA_M23271 = new BitSet(new long[]{0x0000000000000020L,0x0000008000000000L});
    public static final BitSet FOLLOW_formalType_in_synpred65_SSQSA_M23276 = new BitSet(new long[]{0x0000000000000000L,0x0050000000000000L});
    public static final BitSet FOLLOW_116_in_synpred65_SSQSA_M23292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_synpred71_SSQSA_M23368 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred71_SSQSA_M23370 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_DOT_in_synpred71_SSQSA_M23374 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred71_SSQSA_M23376 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_assignmentOrProcCall_in_synpred98_SSQSA_M23943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_synpred100_SSQSA_M23950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_caseStatement_in_synpred102_SSQSA_M23957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_synpred104_SSQSA_M23964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_repeatStatement_in_synpred106_SSQSA_M23971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loopStatement_in_synpred108_SSQSA_M23978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_synpred110_SSQSA_M23985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_synpred112_SSQSA_M23992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXIT_in_synpred114_SSQSA_M23999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_synpred117_SSQSA_M24050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procCall_in_synpred118_SSQSA_M24054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elsifBranch_in_synpred129_SSQSA_M24520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elseBranch_in_synpred130_SSQSA_M24523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_synpred138_SSQSA_M25029 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred138_SSQSA_M25031 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_synpred138_SSQSA_M25034 = new BitSet(new long[]{0x0000140420110240L});
    public static final BitSet FOLLOW_procDeclaration_in_synpred138_SSQSA_M25039 = new BitSet(new long[]{0x0000140420010240L});
    public static final BitSet FOLLOW_procBlock_in_synpred138_SSQSA_M25042 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred138_SSQSA_M25044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_in_synpred138_SSQSA_M25049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_synpred144_SSQSA_M25090 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred144_SSQSA_M25094 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_synpred144_SSQSA_M25104 = new BitSet(new long[]{0x0000100000000000L,0x0010008000000000L});
    public static final BitSet FOLLOW_procParams_in_synpred144_SSQSA_M25122 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_122_in_synpred144_SSQSA_M25126 = new BitSet(new long[]{0x0000100000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_procParams_in_synpred144_SSQSA_M25128 = new BitSet(new long[]{0x0000000000000000L,0x0410000000000000L});
    public static final BitSet FOLLOW_116_in_synpred144_SSQSA_M25143 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_synpred144_SSQSA_M25155 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred144_SSQSA_M25157 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_DOT_in_synpred144_SSQSA_M25161 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred144_SSQSA_M25163 = new BitSet(new long[]{0x4000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_synpred144_SSQSA_M25176 = new BitSet(new long[]{0x0000140420110240L});
    public static final BitSet FOLLOW_procDeclaration_in_synpred144_SSQSA_M25183 = new BitSet(new long[]{0x0000140420010240L});
    public static final BitSet FOLLOW_procBlock_in_synpred144_SSQSA_M25186 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred144_SSQSA_M25188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_in_synpred144_SSQSA_M25193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCEDURE_in_synpred188_SSQSA_M26192 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_ident_in_synpred188_SSQSA_M26194 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_synpred188_SSQSA_M26196 = new BitSet(new long[]{0x0000000000000002L});

}