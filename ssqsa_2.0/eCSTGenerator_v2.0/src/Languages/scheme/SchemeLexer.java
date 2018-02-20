// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g 2017-03-03 17:26:08

	package Languages.scheme;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class SchemeLexer extends Lexer {
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
    public static final int STRING_ELEMENT=121;
    public static final int SPECIAL_INITIAL=126;
    public static final int CHARACTER=77;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int VAR_DECL_ASSIGN=19;
    public static final int QUOTE=82;
    public static final int IMPORT=71;
    public static final int NAME=44;
    public static final int LAB_STAT=22;
    public static final int LETREC=92;
    public static final int LOGICAL_OPERATOR=58;
    public static final int COMPLEX_8=113;
    public static final int UREAL_10=135;
    public static final int PROG_IMPORT=20;
    public static final int COMPILATION_UNIT=48;
    public static final int BEGIN=68;
    public static final int TYPE_=43;
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
    public static final int CLASS_FIELDS=46;
    public static final int AND=87;
    public static final int DEFINE=73;
    public static final int SPACE=123;
    public static final int RADIX_8=149;
    public static final int STATIC_ARRAY_CREATOR=39;
    public static final int IF=84;
    public static final int PARAM_VAR=12;
    public static final int PARAMETER_DECL=34;
    public static final int SUFFIX=143;
    public static final int SPECIAL_SUBSEQUENT=128;
    public static final int ARGUMENT=42;
    public static final int CLASS_HELPER=23;
    public static final int ARGUMENT_LIST=41;
    public static final int PROCEDURE_BODY=17;
    public static final int PREFIX_2=110;
    public static final int LAMBDA=83;
    public static final int DIGIT=127;
    public static final int QUASIQUOTE=95;
    public static final int UNLESS=99;
    public static final int FORMAL_PARAM_LIST=33;
    public static final int BEGIN_EXPR=27;
    public static final int PREFIX_8=112;
    public static final int EXPRESSION=47;
    public static final int SUBSEQUENT=119;
    public static final int UINTEGER_8=139;
    public static final int COMPARISON_OPERATOR=61;
    public static final int JUMP_STATEMENT=53;
    public static final int ASSIGN_OPERATOR=62;
    public static final int OPERATOR=60;
    public static final int IMPORT_DECL=36;
    public static final int QUAL_ACCESS=11;
    public static final int LET_SYNTAX=102;
    public static final int FIELD_DECL=10;
    public static final int SET=85;
    public static final int ARRAY_ACCESS=15;
    public static final int PACKAGE_DECL=28;
    public static final int DIGIT_2=144;
    public static final int CONST_ASSIGN=6;
    public static final int TRUE=108;
    public static final int CALL_WITH_CC=96;
    public static final int DIGIT_8=145;
    public static final int PECULIAR_IDENTIFIER=120;
    public static final int NEGATION=5;
    public static final int CLASS_ABSTRACT=25;
    public static final int UNQUOTE=80;
    public static final int WHEN=98;
    public static final int REAL_16=136;
    public static final int VAR_SECTION=8;
    public static final int PREFIX_16=116;
    public static final int REAL_10=134;
    public static final int DEFINE_SYNTAX=72;
    public static final int BRANCH=52;
    public static final int PARAM_CONST=13;
    public static final int ARROW=79;
    public static final int SYNTAX_RULES=74;
    public static final int MAIN_BLOCK=49;
    public static final int PREFIX_10=114;
    public static final int TYPE_ASSIGN=7;
    public static final int COND=86;
    public static final int EXTENDS=45;
    public static final int CHARACTER_NAME=122;
    public static final int LET=90;
    public static final int STRING=76;
    public static final int UINTEGER_2=138;

    // delegates
    // delegators

    public SchemeLexer() {;} 
    public SchemeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SchemeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g"; }

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:11:8: ( '(' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:11:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__153"

    // $ANTLR start "T__154"
    public final void mT__154() throws RecognitionException {
        try {
            int _type = T__154;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:12:8: ( ')' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:12:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__154"

    // $ANTLR start "T__155"
    public final void mT__155() throws RecognitionException {
        try {
            int _type = T__155;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:13:8: ( '#(' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:13:10: '#('
            {
            match("#("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__155"

    // $ANTLR start "T__156"
    public final void mT__156() throws RecognitionException {
        try {
            int _type = T__156;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:14:8: ( '\\'' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:14:10: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__156"

    // $ANTLR start "T__157"
    public final void mT__157() throws RecognitionException {
        try {
            int _type = T__157;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:15:8: ( '\\'()' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:15:10: '\\'()'
            {
            match("'()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__157"

    // $ANTLR start "T__158"
    public final void mT__158() throws RecognitionException {
        try {
            int _type = T__158;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:16:8: ( '.' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:16:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__158"

    // $ANTLR start "T__159"
    public final void mT__159() throws RecognitionException {
        try {
            int _type = T__159;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:17:8: ( '\\'(' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:17:10: '\\'('
            {
            match("'("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__159"

    // $ANTLR start "T__160"
    public final void mT__160() throws RecognitionException {
        try {
            int _type = T__160;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:18:8: ( '`' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:18:10: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__160"

    // $ANTLR start "T__161"
    public final void mT__161() throws RecognitionException {
        try {
            int _type = T__161;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:19:8: ( ',@' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:19:10: ',@'
            {
            match(",@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__161"

    // $ANTLR start "T__162"
    public final void mT__162() throws RecognitionException {
        try {
            int _type = T__162;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:20:8: ( ',' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:20:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "LET_SYNTAX"
    public final void mLET_SYNTAX() throws RecognitionException {
        try {
            int _type = LET_SYNTAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:789:18: ( 'let-syntax' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:789:20: 'let-syntax'
            {
            match("let-syntax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET_SYNTAX"

    // $ANTLR start "LETREC_SYNTAX"
    public final void mLETREC_SYNTAX() throws RecognitionException {
        try {
            int _type = LETREC_SYNTAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:790:18: ( 'letrec-syntax' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:790:20: 'letrec-syntax'
            {
            match("letrec-syntax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETREC_SYNTAX"

    // $ANTLR start "SYNTAX_RULES"
    public final void mSYNTAX_RULES() throws RecognitionException {
        try {
            int _type = SYNTAX_RULES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:791:18: ( 'syntax-rules' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:791:20: 'syntax-rules'
            {
            match("syntax-rules"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SYNTAX_RULES"

    // $ANTLR start "DEFINE_SYNTAX"
    public final void mDEFINE_SYNTAX() throws RecognitionException {
        try {
            int _type = DEFINE_SYNTAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:792:18: ( 'define-syntax' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:792:20: 'define-syntax'
            {
            match("define-syntax"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE_SYNTAX"

    // $ANTLR start "LIBRARY"
    public final void mLIBRARY() throws RecognitionException {
        try {
            int _type = LIBRARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:794:18: ( 'library' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:794:20: 'library'
            {
            match("library"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIBRARY"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:795:18: ( 'import' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:795:20: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "EXPORT"
    public final void mEXPORT() throws RecognitionException {
        try {
            int _type = EXPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:796:18: ( 'export' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:796:20: 'export'
            {
            match("export"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPORT"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:799:18: ( 'else' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:799:20: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:800:18: ( '=>' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:800:20: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "DEFINE"
    public final void mDEFINE() throws RecognitionException {
        try {
            int _type = DEFINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:801:18: ( 'define' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:801:20: 'define'
            {
            match("define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINE"

    // $ANTLR start "UNQUOTE_SPLICING"
    public final void mUNQUOTE_SPLICING() throws RecognitionException {
        try {
            int _type = UNQUOTE_SPLICING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:802:18: ( 'unquote-splicing' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:802:20: 'unquote-splicing'
            {
            match("unquote-splicing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNQUOTE_SPLICING"

    // $ANTLR start "UNQUOTE"
    public final void mUNQUOTE() throws RecognitionException {
        try {
            int _type = UNQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:803:18: ( 'unquote' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:803:20: 'unquote'
            {
            match("unquote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNQUOTE"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:806:18: ( 'quote' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:806:20: 'quote'
            {
            match("quote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "LAMBDA"
    public final void mLAMBDA() throws RecognitionException {
        try {
            int _type = LAMBDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:807:18: ( 'lambda' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:807:20: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAMBDA"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:808:18: ( 'if' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:808:20: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:809:18: ( 'set!' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:809:20: 'set!'
            {
            match("set!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:810:18: ( 'begin' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:810:20: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "APPLY"
    public final void mAPPLY() throws RecognitionException {
        try {
            int _type = APPLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:811:18: ( 'apply' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:811:20: 'apply'
            {
            match("apply"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APPLY"

    // $ANTLR start "COND"
    public final void mCOND() throws RecognitionException {
        try {
            int _type = COND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:812:18: ( 'cond' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:812:20: 'cond'
            {
            match("cond"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COND"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:813:18: ( 'not' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:813:20: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:814:18: ( 'and' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:814:20: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:815:18: ( 'or' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:815:20: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:816:18: ( 'case' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:816:20: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "WHEN"
    public final void mWHEN() throws RecognitionException {
        try {
            int _type = WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:817:18: ( 'when' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:817:20: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHEN"

    // $ANTLR start "UNLESS"
    public final void mUNLESS() throws RecognitionException {
        try {
            int _type = UNLESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:818:18: ( 'unless' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:818:20: 'unless'
            {
            match("unless"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNLESS"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:819:18: ( 'let' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:819:20: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "LETSTAR"
    public final void mLETSTAR() throws RecognitionException {
        try {
            int _type = LETSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:820:18: ( 'let*' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:820:20: 'let*'
            {
            match("let*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETSTAR"

    // $ANTLR start "LETREC"
    public final void mLETREC() throws RecognitionException {
        try {
            int _type = LETREC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:821:18: ( 'letrec' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:821:20: 'letrec'
            {
            match("letrec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LETREC"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:822:18: ( 'do' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:822:20: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "DELAY"
    public final void mDELAY() throws RecognitionException {
        try {
            int _type = DELAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:823:18: ( 'delay' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:823:20: 'delay'
            {
            match("delay"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELAY"

    // $ANTLR start "QUASIQUOTE"
    public final void mQUASIQUOTE() throws RecognitionException {
        try {
            int _type = QUASIQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:824:18: ( 'quasiquote' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:824:20: 'quasiquote'
            {
            match("quasiquote"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUASIQUOTE"

    // $ANTLR start "CALL_WITH_CC"
    public final void mCALL_WITH_CC() throws RecognitionException {
        try {
            int _type = CALL_WITH_CC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:826:18: ( 'call-with-current-continuation' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:826:20: 'call-with-current-continuation'
            {
            match("call-with-current-continuation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL_WITH_CC"

    // $ANTLR start "CALL_CC"
    public final void mCALL_CC() throws RecognitionException {
        try {
            int _type = CALL_CC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:827:18: ( 'call/cc' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:827:20: 'call/cc'
            {
            match("call/cc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CALL_CC"

    // $ANTLR start "NUM_2"
    public final void mNUM_2() throws RecognitionException {
        try {
            int _type = NUM_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:829:8: ( PREFIX_2 COMPLEX_2 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:829:10: PREFIX_2 COMPLEX_2
            {
            mPREFIX_2(); 
            mCOMPLEX_2(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_2"

    // $ANTLR start "NUM_8"
    public final void mNUM_8() throws RecognitionException {
        try {
            int _type = NUM_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:830:8: ( PREFIX_8 COMPLEX_8 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:830:10: PREFIX_8 COMPLEX_8
            {
            mPREFIX_8(); 
            mCOMPLEX_8(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_8"

    // $ANTLR start "NUM_10"
    public final void mNUM_10() throws RecognitionException {
        try {
            int _type = NUM_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:831:8: ( ( PREFIX_10 )? COMPLEX_10 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:831:10: ( PREFIX_10 )? COMPLEX_10
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:831:10: ( PREFIX_10 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='#') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:831:10: PREFIX_10
                    {
                    mPREFIX_10(); 

                    }
                    break;

            }

            mCOMPLEX_10(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_10"

    // $ANTLR start "NUM_16"
    public final void mNUM_16() throws RecognitionException {
        try {
            int _type = NUM_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:832:8: ( PREFIX_16 COMPLEX_16 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:832:10: PREFIX_16 COMPLEX_16
            {
            mPREFIX_16(); 
            mCOMPLEX_16(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM_16"

    // $ANTLR start "ELLIPSIS"
    public final void mELLIPSIS() throws RecognitionException {
        try {
            int _type = ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:834:10: ( '...' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:834:12: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELLIPSIS"

    // $ANTLR start "VARIABLE"
    public final void mVARIABLE() throws RecognitionException {
        try {
            int _type = VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:837:2: ( INITIAL ( SUBSEQUENT )* | PECULIAR_IDENTIFIER )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='!'||(LA3_0>='$' && LA3_0<='&')||LA3_0=='*'||LA3_0=='/'||LA3_0==':'||(LA3_0>='<' && LA3_0<='?')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='^' && LA3_0<='_')||(LA3_0>='a' && LA3_0<='z')||LA3_0=='~') ) {
                alt3=1;
            }
            else if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:837:4: INITIAL ( SUBSEQUENT )*
                    {
                    mINITIAL(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:837:12: ( SUBSEQUENT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='!'||(LA2_0>='$' && LA2_0<='&')||(LA2_0>='*' && LA2_0<='+')||(LA2_0>='-' && LA2_0<=':')||(LA2_0>='<' && LA2_0<='Z')||(LA2_0>='^' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='z')||LA2_0=='~') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:837:12: SUBSEQUENT
                    	    {
                    	    mSUBSEQUENT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:838:4: PECULIAR_IDENTIFIER
                    {
                    mPECULIAR_IDENTIFIER(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VARIABLE"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:841:8: ( '\"' ( STRING_ELEMENT )* '\"' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:841:10: '\"' ( STRING_ELEMENT )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:841:14: ( STRING_ELEMENT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:841:14: STRING_ELEMENT
            	    {
            	    mSTRING_ELEMENT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            int _type = CHARACTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:843:11: ( '#\\\\' (~ ( ' ' | '\\n' ) | CHARACTER_NAME ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:843:13: '#\\\\' (~ ( ' ' | '\\n' ) | CHARACTER_NAME )
            {
            match("#\\"); 

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:843:19: (~ ( ' ' | '\\n' ) | CHARACTER_NAME )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='s') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='p') ) {
                    alt5=2;
                }
                else {
                    alt5=1;}
            }
            else if ( (LA5_0=='n') ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2=='e') ) {
                    alt5=2;
                }
                else {
                    alt5=1;}
            }
            else if ( ((LA5_0>='\u0000' && LA5_0<='\t')||(LA5_0>='\u000B' && LA5_0<='\u001F')||(LA5_0>='!' && LA5_0<='m')||(LA5_0>='o' && LA5_0<='r')||(LA5_0>='t' && LA5_0<='\uFFFF')) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:843:20: ~ ( ' ' | '\\n' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:843:36: CHARACTER_NAME
                    {
                    mCHARACTER_NAME(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:845:7: ( '#' ( 't' | 'T' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:845:9: '#' ( 't' | 'T' )
            {
            match('#'); 
            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:846:7: ( '#' ( 'f' | 'F' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:846:9: '#' ( 'f' | 'F' )
            {
            match('#'); 
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "SPACE"
    public final void mSPACE() throws RecognitionException {
        try {
            int _type = SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:849:9: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:849:11: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPACE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:850:9: ( ';' (~ ( '\\r' | '\\n' ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:850:11: ';' (~ ( '\\r' | '\\n' ) )*
            {
            match(';'); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:850:15: (~ ( '\\r' | '\\n' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:850:15: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "INITIAL"
    public final void mINITIAL() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:853:18: ( LETTER | SPECIAL_INITIAL )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='$' && input.LA(1)<='&')||input.LA(1)=='*'||input.LA(1)=='/'||input.LA(1)==':'||(input.LA(1)>='<' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "INITIAL"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:854:17: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "SPECIAL_INITIAL"
    public final void mSPECIAL_INITIAL() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:855:26: ( '!' | '$' | '%' | '&' | '*' | '/' | ':' | '<' | '=' | '>' | '?' | '^' | '_' | '~' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='$' && input.LA(1)<='&')||input.LA(1)=='*'||input.LA(1)=='/'||input.LA(1)==':'||(input.LA(1)>='<' && input.LA(1)<='?')||(input.LA(1)>='^' && input.LA(1)<='_')||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPECIAL_INITIAL"

    // $ANTLR start "SUBSEQUENT"
    public final void mSUBSEQUENT() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:856:21: ( INITIAL | DIGIT | SPECIAL_SUBSEQUENT )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1)>='$' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<=':')||(input.LA(1)>='<' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SUBSEQUENT"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:857:16: ( '0' .. '9' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:857:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "SPECIAL_SUBSEQUENT"
    public final void mSPECIAL_SUBSEQUENT() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:858:29: ( '.' | '+' | '-' | '@' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( input.LA(1)=='+'||(input.LA(1)>='-' && input.LA(1)<='.')||input.LA(1)=='@' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SPECIAL_SUBSEQUENT"

    // $ANTLR start "PECULIAR_IDENTIFIER"
    public final void mPECULIAR_IDENTIFIER() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:859:30: ( '+' | '-' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "PECULIAR_IDENTIFIER"

    // $ANTLR start "STRING_ELEMENT"
    public final void mSTRING_ELEMENT() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:860:25: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\"' | '\\\\' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='\\') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:860:27: ~ ( '\"' | '\\\\' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:860:43: '\\\\' ( '\"' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "STRING_ELEMENT"

    // $ANTLR start "CHARACTER_NAME"
    public final void mCHARACTER_NAME() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:861:25: ( 'space' | 'newline' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='s') ) {
                alt8=1;
            }
            else if ( (LA8_0=='n') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:861:27: 'space'
                    {
                    match("space"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:861:37: 'newline'
                    {
                    match("newline"); 


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER_NAME"

    // $ANTLR start "COMPLEX_2"
    public final void mCOMPLEX_2() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:864:3: ( REAL_2 ( '@' REAL_2 )? | ( REAL_2 )? SIGN ( UREAL_2 )? ( 'i' | 'I' ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:864:6: REAL_2 ( '@' REAL_2 )?
                    {
                    mREAL_2(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:864:13: ( '@' REAL_2 )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='@') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:864:14: '@' REAL_2
                            {
                            match('@'); 
                            mREAL_2(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:865:6: ( REAL_2 )? SIGN ( UREAL_2 )? ( 'i' | 'I' )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:865:6: ( REAL_2 )?
                    int alt10=2;
                    alt10 = dfa10.predict(input);
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:865:6: REAL_2
                            {
                            mREAL_2(); 

                            }
                            break;

                    }

                    mSIGN(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:865:19: ( UREAL_2 )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>='0' && LA11_0<='1')) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:865:19: UREAL_2
                            {
                            mUREAL_2(); 

                            }
                            break;

                    }

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "COMPLEX_2"

    // $ANTLR start "COMPLEX_8"
    public final void mCOMPLEX_8() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:869:3: ( REAL_8 ( '@' REAL_8 )? | ( REAL_8 )? SIGN ( UREAL_8 )? ( 'i' | 'I' ) )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:869:6: REAL_8 ( '@' REAL_8 )?
                    {
                    mREAL_8(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:869:13: ( '@' REAL_8 )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='@') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:869:14: '@' REAL_8
                            {
                            match('@'); 
                            mREAL_8(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:870:6: ( REAL_8 )? SIGN ( UREAL_8 )? ( 'i' | 'I' )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:870:6: ( REAL_8 )?
                    int alt14=2;
                    alt14 = dfa14.predict(input);
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:870:6: REAL_8
                            {
                            mREAL_8(); 

                            }
                            break;

                    }

                    mSIGN(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:870:19: ( UREAL_8 )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>='0' && LA15_0<='7')) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:870:19: UREAL_8
                            {
                            mUREAL_8(); 

                            }
                            break;

                    }

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "COMPLEX_8"

    // $ANTLR start "COMPLEX_10"
    public final void mCOMPLEX_10() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:874:3: ( REAL_10 ( '@' REAL_10 )? | ( REAL_10 )? SIGN ( UREAL_10 )? ( 'i' | 'I' ) )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:874:6: REAL_10 ( '@' REAL_10 )?
                    {
                    mREAL_10(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:874:14: ( '@' REAL_10 )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='@') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:874:15: '@' REAL_10
                            {
                            match('@'); 
                            mREAL_10(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:875:6: ( REAL_10 )? SIGN ( UREAL_10 )? ( 'i' | 'I' )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:875:6: ( REAL_10 )?
                    int alt18=2;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:875:6: REAL_10
                            {
                            mREAL_10(); 

                            }
                            break;

                    }

                    mSIGN(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:875:20: ( UREAL_10 )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='.'||(LA19_0>='0' && LA19_0<='9')) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:875:20: UREAL_10
                            {
                            mUREAL_10(); 

                            }
                            break;

                    }

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "COMPLEX_10"

    // $ANTLR start "COMPLEX_16"
    public final void mCOMPLEX_16() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:879:3: ( REAL_16 ( '@' REAL_16 )? | ( REAL_16 )? SIGN ( UREAL_16 )? ( 'i' | 'I' ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:879:6: REAL_16 ( '@' REAL_16 )?
                    {
                    mREAL_16(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:879:14: ( '@' REAL_16 )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='@') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:879:15: '@' REAL_16
                            {
                            match('@'); 
                            mREAL_16(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:880:6: ( REAL_16 )? SIGN ( UREAL_16 )? ( 'i' | 'I' )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:880:6: ( REAL_16 )?
                    int alt22=2;
                    alt22 = dfa22.predict(input);
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:880:6: REAL_16
                            {
                            mREAL_16(); 

                            }
                            break;

                    }

                    mSIGN(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:880:20: ( UREAL_16 )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>='0' && LA23_0<='9')||(LA23_0>='A' && LA23_0<='F')||(LA23_0>='a' && LA23_0<='f')) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:880:20: UREAL_16
                            {
                            mUREAL_16(); 

                            }
                            break;

                    }

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "COMPLEX_16"

    // $ANTLR start "REAL_2"
    public final void mREAL_2() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:883:17: ( ( SIGN )? UREAL_2 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:883:19: ( SIGN )? UREAL_2
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:883:19: ( SIGN )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='+'||LA25_0=='-') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:883:19: SIGN
                    {
                    mSIGN(); 

                    }
                    break;

            }

            mUREAL_2(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "REAL_2"

    // $ANTLR start "REAL_8"
    public final void mREAL_8() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:884:17: ( ( SIGN )? UREAL_8 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:884:19: ( SIGN )? UREAL_8
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:884:19: ( SIGN )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='+'||LA26_0=='-') ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:884:19: SIGN
                    {
                    mSIGN(); 

                    }
                    break;

            }

            mUREAL_8(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "REAL_8"

    // $ANTLR start "REAL_10"
    public final void mREAL_10() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:885:18: ( ( SIGN )? UREAL_10 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:885:20: ( SIGN )? UREAL_10
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:885:20: ( SIGN )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='+'||LA27_0=='-') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:885:20: SIGN
                    {
                    mSIGN(); 

                    }
                    break;

            }

            mUREAL_10(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "REAL_10"

    // $ANTLR start "REAL_16"
    public final void mREAL_16() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:886:18: ( ( SIGN )? UREAL_16 )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:886:20: ( SIGN )? UREAL_16
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:886:20: ( SIGN )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='+'||LA28_0=='-') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:886:20: SIGN
                    {
                    mSIGN(); 

                    }
                    break;

            }

            mUREAL_16(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "REAL_16"

    // $ANTLR start "UREAL_2"
    public final void mUREAL_2() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:887:18: ( UINTEGER_2 ( '/' UINTEGER_2 )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:887:20: UINTEGER_2 ( '/' UINTEGER_2 )?
            {
            mUINTEGER_2(); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:887:31: ( '/' UINTEGER_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='/') ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:887:32: '/' UINTEGER_2
                    {
                    match('/'); 
                    mUINTEGER_2(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "UREAL_2"

    // $ANTLR start "UREAL_8"
    public final void mUREAL_8() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:888:18: ( UINTEGER_8 ( '/' UINTEGER_8 )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:888:20: UINTEGER_8 ( '/' UINTEGER_8 )?
            {
            mUINTEGER_8(); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:888:31: ( '/' UINTEGER_8 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='/') ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:888:32: '/' UINTEGER_8
                    {
                    match('/'); 
                    mUINTEGER_8(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "UREAL_8"

    // $ANTLR start "UREAL_10"
    public final void mUREAL_10() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:889:19: ( UINTEGER_10 ( '/' UINTEGER_10 )? | DECIMAL_10 )
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:889:21: UINTEGER_10 ( '/' UINTEGER_10 )?
                    {
                    mUINTEGER_10(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:889:33: ( '/' UINTEGER_10 )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0=='/') ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:889:34: '/' UINTEGER_10
                            {
                            match('/'); 
                            mUINTEGER_10(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:889:54: DECIMAL_10
                    {
                    mDECIMAL_10(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "UREAL_10"

    // $ANTLR start "UREAL_16"
    public final void mUREAL_16() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:890:19: ( UINTEGER_16 ( '/' UINTEGER_16 )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:890:21: UINTEGER_16 ( '/' UINTEGER_16 )?
            {
            mUINTEGER_16(); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:890:33: ( '/' UINTEGER_16 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='/') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:890:34: '/' UINTEGER_16
                    {
                    match('/'); 
                    mUINTEGER_16(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "UREAL_16"

    // $ANTLR start "DECIMAL_10"
    public final void mDECIMAL_10() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:893:3: ( UINTEGER_10 SUFFIX | '.' ( DIGIT )+ ( '#' )* ( SUFFIX )? | ( DIGIT )+ '.' ( DIGIT )* ( '#' )* ( SUFFIX )? | ( DIGIT )+ ( '#' )+ '.' ( '#' )* ( SUFFIX )? )
            int alt45=4;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:893:6: UINTEGER_10 SUFFIX
                    {
                    mUINTEGER_10(); 
                    mSUFFIX(); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:894:6: '.' ( DIGIT )+ ( '#' )* ( SUFFIX )?
                    {
                    match('.'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:894:10: ( DIGIT )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>='0' && LA34_0<='9')) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:894:10: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:894:17: ( '#' )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0=='#') ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:894:17: '#'
                    	    {
                    	    match('#'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:894:22: ( SUFFIX )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>='D' && LA36_0<='F')||LA36_0=='L'||LA36_0=='S'||(LA36_0>='d' && LA36_0<='f')||LA36_0=='l'||LA36_0=='s') ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:894:22: SUFFIX
                            {
                            mSUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:6: ( DIGIT )+ '.' ( DIGIT )* ( '#' )* ( SUFFIX )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:6: ( DIGIT )+
                    int cnt37=0;
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>='0' && LA37_0<='9')) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:6: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt37 >= 1 ) break loop37;
                                EarlyExitException eee =
                                    new EarlyExitException(37, input);
                                throw eee;
                        }
                        cnt37++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:17: ( DIGIT )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>='0' && LA38_0<='9')) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:17: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:24: ( '#' )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0=='#') ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:24: '#'
                    	    {
                    	    match('#'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:29: ( SUFFIX )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>='D' && LA40_0<='F')||LA40_0=='L'||LA40_0=='S'||(LA40_0>='d' && LA40_0<='f')||LA40_0=='l'||LA40_0=='s') ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:895:29: SUFFIX
                            {
                            mSUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:6: ( DIGIT )+ ( '#' )+ '.' ( '#' )* ( SUFFIX )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:6: ( DIGIT )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>='0' && LA41_0<='9')) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:6: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt41 >= 1 ) break loop41;
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:13: ( '#' )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0=='#') ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:13: '#'
                    	    {
                    	    match('#'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:22: ( '#' )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0=='#') ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:22: '#'
                    	    {
                    	    match('#'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:27: ( SUFFIX )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( ((LA44_0>='D' && LA44_0<='F')||LA44_0=='L'||LA44_0=='S'||(LA44_0>='d' && LA44_0<='f')||LA44_0=='l'||LA44_0=='s') ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:896:27: SUFFIX
                            {
                            mSUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_10"

    // $ANTLR start "UINTEGER_2"
    public final void mUINTEGER_2() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:899:21: ( ( DIGIT_2 )+ ( '#' )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:899:23: ( DIGIT_2 )+ ( '#' )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:899:23: ( DIGIT_2 )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>='0' && LA46_0<='1')) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:899:23: DIGIT_2
            	    {
            	    mDIGIT_2(); 

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:899:32: ( '#' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0=='#') ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:899:32: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "UINTEGER_2"

    // $ANTLR start "UINTEGER_8"
    public final void mUINTEGER_8() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:900:21: ( ( DIGIT_8 )+ ( '#' )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:900:23: ( DIGIT_8 )+ ( '#' )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:900:23: ( DIGIT_8 )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>='0' && LA48_0<='7')) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:900:23: DIGIT_8
            	    {
            	    mDIGIT_8(); 

            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:900:32: ( '#' )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0=='#') ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:900:32: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "UINTEGER_8"

    // $ANTLR start "UINTEGER_10"
    public final void mUINTEGER_10() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:901:22: ( ( DIGIT )+ ( '#' )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:901:24: ( DIGIT )+ ( '#' )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:901:24: ( DIGIT )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>='0' && LA50_0<='9')) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:901:24: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:901:31: ( '#' )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0=='#') ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:901:31: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "UINTEGER_10"

    // $ANTLR start "UINTEGER_16"
    public final void mUINTEGER_16() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:902:22: ( ( DIGIT_16 )+ ( '#' )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:902:24: ( DIGIT_16 )+ ( '#' )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:902:24: ( DIGIT_16 )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>='0' && LA52_0<='9')||(LA52_0>='A' && LA52_0<='F')||(LA52_0>='a' && LA52_0<='f')) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:902:24: DIGIT_16
            	    {
            	    mDIGIT_16(); 

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:902:34: ( '#' )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0=='#') ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:902:34: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "UINTEGER_16"

    // $ANTLR start "PREFIX_2"
    public final void mPREFIX_2() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:903:19: ( RADIX_2 ( EXACTNESS )? | EXACTNESS RADIX_2 )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0=='#') ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1=='B'||LA55_1=='b') ) {
                    alt55=1;
                }
                else if ( (LA55_1=='E'||LA55_1=='I'||LA55_1=='e'||LA55_1=='i') ) {
                    alt55=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:903:21: RADIX_2 ( EXACTNESS )?
                    {
                    mRADIX_2(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:903:29: ( EXACTNESS )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0=='#') ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:903:29: EXACTNESS
                            {
                            mEXACTNESS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:903:42: EXACTNESS RADIX_2
                    {
                    mEXACTNESS(); 
                    mRADIX_2(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "PREFIX_2"

    // $ANTLR start "PREFIX_8"
    public final void mPREFIX_8() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:904:19: ( RADIX_8 ( EXACTNESS )? | EXACTNESS RADIX_8 )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0=='#') ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1=='O'||LA57_1=='o') ) {
                    alt57=1;
                }
                else if ( (LA57_1=='E'||LA57_1=='I'||LA57_1=='e'||LA57_1=='i') ) {
                    alt57=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:904:21: RADIX_8 ( EXACTNESS )?
                    {
                    mRADIX_8(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:904:29: ( EXACTNESS )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0=='#') ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:904:29: EXACTNESS
                            {
                            mEXACTNESS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:904:42: EXACTNESS RADIX_8
                    {
                    mEXACTNESS(); 
                    mRADIX_8(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "PREFIX_8"

    // $ANTLR start "PREFIX_10"
    public final void mPREFIX_10() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:905:20: ( RADIX_10 ( EXACTNESS )? | EXACTNESS RADIX_10 )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0=='#') ) {
                int LA59_1 = input.LA(2);

                if ( (LA59_1=='D'||LA59_1=='d') ) {
                    alt59=1;
                }
                else if ( (LA59_1=='E'||LA59_1=='I'||LA59_1=='e'||LA59_1=='i') ) {
                    alt59=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:905:22: RADIX_10 ( EXACTNESS )?
                    {
                    mRADIX_10(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:905:31: ( EXACTNESS )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0=='#') ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:905:31: EXACTNESS
                            {
                            mEXACTNESS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:905:44: EXACTNESS RADIX_10
                    {
                    mEXACTNESS(); 
                    mRADIX_10(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "PREFIX_10"

    // $ANTLR start "PREFIX_16"
    public final void mPREFIX_16() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:906:20: ( RADIX_16 ( EXACTNESS )? | EXACTNESS RADIX_16 )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0=='#') ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1=='X'||LA61_1=='x') ) {
                    alt61=1;
                }
                else if ( (LA61_1=='E'||LA61_1=='I'||LA61_1=='e'||LA61_1=='i') ) {
                    alt61=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 61, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:906:22: RADIX_16 ( EXACTNESS )?
                    {
                    mRADIX_16(); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:906:31: ( EXACTNESS )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0=='#') ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:906:31: EXACTNESS
                            {
                            mEXACTNESS(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:906:44: EXACTNESS RADIX_16
                    {
                    mEXACTNESS(); 
                    mRADIX_16(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "PREFIX_16"

    // $ANTLR start "SUFFIX"
    public final void mSUFFIX() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:907:17: ( EXPONENT_MARKER ( SIGN )? ( DIGIT )+ )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:907:19: EXPONENT_MARKER ( SIGN )? ( DIGIT )+
            {
            mEXPONENT_MARKER(); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:907:35: ( SIGN )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0=='+'||LA62_0=='-') ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:907:35: SIGN
                    {
                    mSIGN(); 

                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:907:41: ( DIGIT )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>='0' && LA63_0<='9')) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:907:41: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "SUFFIX"

    // $ANTLR start "EXPONENT_MARKER"
    public final void mEXPONENT_MARKER() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:908:26: ( 'e' | 's' | 'f' | 'd' | 'l' | 'E' | 'S' | 'F' | 'D' | 'L' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( (input.LA(1)>='D' && input.LA(1)<='F')||input.LA(1)=='L'||input.LA(1)=='S'||(input.LA(1)>='d' && input.LA(1)<='f')||input.LA(1)=='l'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXPONENT_MARKER"

    // $ANTLR start "SIGN"
    public final void mSIGN() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:909:15: ( '+' | '-' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIGN"

    // $ANTLR start "EXACTNESS"
    public final void mEXACTNESS() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:910:20: ( '#' ( 'i' | 'e' | 'I' | 'E' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:910:22: '#' ( 'i' | 'e' | 'I' | 'E' )
            {
            match('#'); 
            if ( input.LA(1)=='E'||input.LA(1)=='I'||input.LA(1)=='e'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "EXACTNESS"

    // $ANTLR start "RADIX_2"
    public final void mRADIX_2() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:911:18: ( '#' ( 'b' | 'B' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:911:20: '#' ( 'b' | 'B' )
            {
            match('#'); 
            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RADIX_2"

    // $ANTLR start "RADIX_8"
    public final void mRADIX_8() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:912:18: ( '#' ( 'o' | 'O' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:912:20: '#' ( 'o' | 'O' )
            {
            match('#'); 
            if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RADIX_8"

    // $ANTLR start "RADIX_10"
    public final void mRADIX_10() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:913:19: ( '#' ( 'd' | 'D' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:913:21: '#' ( 'd' | 'D' )
            {
            match('#'); 
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RADIX_10"

    // $ANTLR start "RADIX_16"
    public final void mRADIX_16() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:914:19: ( '#' ( 'x' | 'X' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:914:21: '#' ( 'x' | 'X' )
            {
            match('#'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RADIX_16"

    // $ANTLR start "DIGIT_2"
    public final void mDIGIT_2() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:915:18: ( '0' | '1' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT_2"

    // $ANTLR start "DIGIT_8"
    public final void mDIGIT_8() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:916:18: ( '0' .. '7' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:916:20: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT_8"

    // $ANTLR start "DIGIT_16"
    public final void mDIGIT_16() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:917:19: ( DIGIT | 'a' .. 'f' | 'A' .. 'F' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT_16"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:8: ( T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | LET_SYNTAX | LETREC_SYNTAX | SYNTAX_RULES | DEFINE_SYNTAX | LIBRARY | IMPORT | EXPORT | ELSE | ARROW | DEFINE | UNQUOTE_SPLICING | UNQUOTE | QUOTE | LAMBDA | IF | SET | BEGIN | APPLY | COND | NOT | AND | OR | CASE | WHEN | UNLESS | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE | CALL_WITH_CC | CALL_CC | NUM_2 | NUM_8 | NUM_10 | NUM_16 | ELLIPSIS | VARIABLE | STRING | CHARACTER | TRUE | FALSE | SPACE | COMMENT )
        int alt64=55;
        alt64 = dfa64.predict(input);
        switch (alt64) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:10: T__153
                {
                mT__153(); 

                }
                break;
            case 2 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:17: T__154
                {
                mT__154(); 

                }
                break;
            case 3 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:24: T__155
                {
                mT__155(); 

                }
                break;
            case 4 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:31: T__156
                {
                mT__156(); 

                }
                break;
            case 5 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:38: T__157
                {
                mT__157(); 

                }
                break;
            case 6 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:45: T__158
                {
                mT__158(); 

                }
                break;
            case 7 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:52: T__159
                {
                mT__159(); 

                }
                break;
            case 8 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:59: T__160
                {
                mT__160(); 

                }
                break;
            case 9 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:66: T__161
                {
                mT__161(); 

                }
                break;
            case 10 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:73: T__162
                {
                mT__162(); 

                }
                break;
            case 11 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:80: LET_SYNTAX
                {
                mLET_SYNTAX(); 

                }
                break;
            case 12 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:91: LETREC_SYNTAX
                {
                mLETREC_SYNTAX(); 

                }
                break;
            case 13 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:105: SYNTAX_RULES
                {
                mSYNTAX_RULES(); 

                }
                break;
            case 14 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:118: DEFINE_SYNTAX
                {
                mDEFINE_SYNTAX(); 

                }
                break;
            case 15 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:132: LIBRARY
                {
                mLIBRARY(); 

                }
                break;
            case 16 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:140: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 17 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:147: EXPORT
                {
                mEXPORT(); 

                }
                break;
            case 18 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:154: ELSE
                {
                mELSE(); 

                }
                break;
            case 19 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:159: ARROW
                {
                mARROW(); 

                }
                break;
            case 20 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:165: DEFINE
                {
                mDEFINE(); 

                }
                break;
            case 21 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:172: UNQUOTE_SPLICING
                {
                mUNQUOTE_SPLICING(); 

                }
                break;
            case 22 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:189: UNQUOTE
                {
                mUNQUOTE(); 

                }
                break;
            case 23 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:197: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 24 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:203: LAMBDA
                {
                mLAMBDA(); 

                }
                break;
            case 25 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:210: IF
                {
                mIF(); 

                }
                break;
            case 26 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:213: SET
                {
                mSET(); 

                }
                break;
            case 27 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:217: BEGIN
                {
                mBEGIN(); 

                }
                break;
            case 28 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:223: APPLY
                {
                mAPPLY(); 

                }
                break;
            case 29 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:229: COND
                {
                mCOND(); 

                }
                break;
            case 30 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:234: NOT
                {
                mNOT(); 

                }
                break;
            case 31 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:238: AND
                {
                mAND(); 

                }
                break;
            case 32 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:242: OR
                {
                mOR(); 

                }
                break;
            case 33 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:245: CASE
                {
                mCASE(); 

                }
                break;
            case 34 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:250: WHEN
                {
                mWHEN(); 

                }
                break;
            case 35 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:255: UNLESS
                {
                mUNLESS(); 

                }
                break;
            case 36 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:262: LET
                {
                mLET(); 

                }
                break;
            case 37 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:266: LETSTAR
                {
                mLETSTAR(); 

                }
                break;
            case 38 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:274: LETREC
                {
                mLETREC(); 

                }
                break;
            case 39 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:281: DO
                {
                mDO(); 

                }
                break;
            case 40 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:284: DELAY
                {
                mDELAY(); 

                }
                break;
            case 41 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:290: QUASIQUOTE
                {
                mQUASIQUOTE(); 

                }
                break;
            case 42 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:301: CALL_WITH_CC
                {
                mCALL_WITH_CC(); 

                }
                break;
            case 43 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:314: CALL_CC
                {
                mCALL_CC(); 

                }
                break;
            case 44 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:322: NUM_2
                {
                mNUM_2(); 

                }
                break;
            case 45 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:328: NUM_8
                {
                mNUM_8(); 

                }
                break;
            case 46 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:334: NUM_10
                {
                mNUM_10(); 

                }
                break;
            case 47 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:341: NUM_16
                {
                mNUM_16(); 

                }
                break;
            case 48 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:348: ELLIPSIS
                {
                mELLIPSIS(); 

                }
                break;
            case 49 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:357: VARIABLE
                {
                mVARIABLE(); 

                }
                break;
            case 50 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:366: STRING
                {
                mSTRING(); 

                }
                break;
            case 51 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:373: CHARACTER
                {
                mCHARACTER(); 

                }
                break;
            case 52 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:383: TRUE
                {
                mTRUE(); 

                }
                break;
            case 53 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:388: FALSE
                {
                mFALSE(); 

                }
                break;
            case 54 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:394: SPACE
                {
                mSPACE(); 

                }
                break;
            case 55 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\scheme\\Scheme.g:1:400: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA12_eotS =
        "\2\uffff\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\4\5";
    static final String DFA12_eofS =
        "\16\uffff";
    static final String DFA12_minS =
        "\1\53\1\60\2\43\2\uffff\1\43\1\60\1\43\1\60\4\43";
    static final String DFA12_maxS =
        "\1\61\1\151\1\61\1\151\2\uffff\1\57\1\61\1\151\2\61\1\151\1\55"+
        "\1\151";
    static final String DFA12_acceptS =
        "\4\uffff\1\2\1\1\10\uffff";
    static final String DFA12_specialS =
        "\16\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\2\2",
            "\2\3\27\uffff\1\4\37\uffff\1\4",
            "\1\6\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7\2\2",
            "\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\2\3\27\uffff\1"+
            "\4\37\uffff\1\4",
            "",
            "",
            "\1\6\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7",
            "\2\12",
            "\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\31\uffff\1\4\37"+
            "\uffff\1\4",
            "\2\13",
            "\1\14\7\uffff\1\4\1\uffff\1\4\2\uffff\2\12",
            "\1\15\7\uffff\1\4\1\uffff\1\4\2\uffff\2\13\27\uffff\1\4\37"+
            "\uffff\1\4",
            "\1\14\7\uffff\1\4\1\uffff\1\4",
            "\1\15\7\uffff\1\4\1\uffff\1\4\33\uffff\1\4\37\uffff\1\4"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "863:10: fragment COMPLEX_2 : ( REAL_2 ( '@' REAL_2 )? | ( REAL_2 )? SIGN ( UREAL_2 )? ( 'i' | 'I' ) );";
        }
    }
    static final String DFA10_eotS =
        "\11\uffff";
    static final String DFA10_eofS =
        "\11\uffff";
    static final String DFA10_minS =
        "\1\53\1\60\1\uffff\1\43\1\uffff\1\43\1\60\2\43";
    static final String DFA10_maxS =
        "\1\61\1\151\1\uffff\1\151\1\uffff\1\151\1\61\2\151";
    static final String DFA10_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String DFA10_specialS =
        "\11\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\2\2",
            "\2\3\27\uffff\1\4\37\uffff\1\4",
            "",
            "\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\2\3\27\uffff\1\4"+
            "\37\uffff\1\4",
            "",
            "\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\31\uffff\1\4\37\uffff"+
            "\1\4",
            "\2\7",
            "\1\10\7\uffff\1\2\1\uffff\1\2\2\uffff\2\7\27\uffff\1\4\37"+
            "\uffff\1\4",
            "\1\10\7\uffff\1\2\1\uffff\1\2\33\uffff\1\4\37\uffff\1\4"
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
            return "865:6: ( REAL_2 )?";
        }
    }
    static final String DFA16_eotS =
        "\2\uffff\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\4\5";
    static final String DFA16_eofS =
        "\16\uffff";
    static final String DFA16_minS =
        "\1\53\1\60\2\43\2\uffff\1\43\1\60\1\43\1\60\4\43";
    static final String DFA16_maxS =
        "\1\67\1\151\1\67\1\151\2\uffff\1\57\1\67\1\151\2\67\1\151\1\55"+
        "\1\151";
    static final String DFA16_acceptS =
        "\4\uffff\1\2\1\1\10\uffff";
    static final String DFA16_specialS =
        "\16\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\10\2",
            "\10\3\21\uffff\1\4\37\uffff\1\4",
            "\1\6\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7\10\2",
            "\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\10\3\21\uffff\1"+
            "\4\37\uffff\1\4",
            "",
            "",
            "\1\6\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7",
            "\10\12",
            "\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\31\uffff\1\4\37"+
            "\uffff\1\4",
            "\10\13",
            "\1\14\7\uffff\1\4\1\uffff\1\4\2\uffff\10\12",
            "\1\15\7\uffff\1\4\1\uffff\1\4\2\uffff\10\13\21\uffff\1\4\37"+
            "\uffff\1\4",
            "\1\14\7\uffff\1\4\1\uffff\1\4",
            "\1\15\7\uffff\1\4\1\uffff\1\4\33\uffff\1\4\37\uffff\1\4"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "868:10: fragment COMPLEX_8 : ( REAL_8 ( '@' REAL_8 )? | ( REAL_8 )? SIGN ( UREAL_8 )? ( 'i' | 'I' ) );";
        }
    }
    static final String DFA14_eotS =
        "\11\uffff";
    static final String DFA14_eofS =
        "\11\uffff";
    static final String DFA14_minS =
        "\1\53\1\60\1\uffff\1\43\1\uffff\1\43\1\60\2\43";
    static final String DFA14_maxS =
        "\1\67\1\151\1\uffff\1\151\1\uffff\1\151\1\67\2\151";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String DFA14_specialS =
        "\11\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\10\2",
            "\10\3\21\uffff\1\4\37\uffff\1\4",
            "",
            "\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\10\3\21\uffff\1\4"+
            "\37\uffff\1\4",
            "",
            "\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\31\uffff\1\4\37\uffff"+
            "\1\4",
            "\10\7",
            "\1\10\7\uffff\1\2\1\uffff\1\2\2\uffff\10\7\21\uffff\1\4\37"+
            "\uffff\1\4",
            "\1\10\7\uffff\1\2\1\uffff\1\2\33\uffff\1\4\37\uffff\1\4"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "870:6: ( REAL_8 )?";
        }
    }
    static final String DFA20_eotS =
        "\2\uffff\1\7\1\uffff\1\7\3\uffff\1\7\1\uffff\1\7\1\uffff\2\7\1"+
        "\uffff\1\7\1\uffff\5\7\2\uffff\2\7\1\uffff\4\7\2\uffff\2\7\1\uffff"+
        "\1\7\1\uffff\1\7\1\uffff\1\7\1\uffff\2\7\1\uffff\1\7\1\uffff\1\7"+
        "\1\uffff\1\7\1\uffff\1\7\1\uffff\1\7";
    static final String DFA20_eofS =
        "\66\uffff";
    static final String DFA20_minS =
        "\1\53\1\56\1\43\1\60\1\43\1\60\2\uffff\1\43\1\60\1\43\1\53\2\43"+
        "\1\60\1\43\1\53\5\43\1\53\1\60\1\53\1\43\1\53\4\43\1\53\1\60\1\53"+
        "\1\43\1\53\1\43\1\53\1\43\1\60\1\53\1\60\1\53\1\43\1\53\1\43\1\60"+
        "\1\53\1\60\1\53\1\60\1\53\1\60\1\53";
    static final String DFA20_maxS =
        "\1\71\1\151\1\163\1\71\1\163\1\71\2\uffff\1\163\1\71\1\163\1\71"+
        "\2\163\1\71\1\163\1\71\2\163\1\71\2\163\3\71\1\163\1\71\1\163\1"+
        "\151\2\163\2\71\1\151\1\163\1\71\1\163\1\71\1\55\4\71\1\163\1\71"+
        "\1\151\1\71\1\151\1\71\1\151\3\71\1\151";
    static final String DFA20_acceptS =
        "\6\uffff\1\2\1\1\56\uffff";
    static final String DFA20_specialS =
        "\66\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\1\5\1\uffff\12\4\17\uffff\1\6\37\uffff\1\6",
            "\1\10\7\uffff\1\6\1\uffff\1\6\1\12\1\11\12\2\12\uffff\3\13"+
            "\5\uffff\1\13\6\uffff\1\13\20\uffff\3\13\5\uffff\1\13\6\uffff"+
            "\1\13",
            "\12\14",
            "\1\15\7\uffff\1\6\1\uffff\1\6\1\17\1\16\12\4\12\uffff\3\20"+
            "\2\uffff\1\6\2\uffff\1\20\6\uffff\1\20\20\uffff\3\20\2\uffff"+
            "\1\6\2\uffff\1\20\6\uffff\1\20",
            "\12\21",
            "",
            "",
            "\1\10\7\uffff\1\6\1\uffff\1\6\1\22\1\11\24\uffff\3\13\5\uffff"+
            "\1\13\6\uffff\1\13\20\uffff\3\13\5\uffff\1\13\6\uffff\1\13",
            "\12\23",
            "\1\25\7\uffff\1\6\1\uffff\1\6\2\uffff\12\24\12\uffff\3\26"+
            "\5\uffff\1\26\6\uffff\1\26\20\uffff\3\26\5\uffff\1\26\6\uffff"+
            "\1\26",
            "\1\27\1\uffff\1\27\2\uffff\12\30",
            "\1\31\7\uffff\1\6\1\uffff\1\6\2\uffff\12\14\12\uffff\3\32"+
            "\5\uffff\1\32\6\uffff\1\32\20\uffff\3\32\5\uffff\1\32\6\uffff"+
            "\1\32",
            "\1\15\7\uffff\1\6\1\uffff\1\6\1\33\1\16\24\uffff\3\20\2\uffff"+
            "\1\6\2\uffff\1\20\6\uffff\1\20\20\uffff\3\20\2\uffff\1\6\2\uffff"+
            "\1\20\6\uffff\1\20",
            "\12\34",
            "\1\36\7\uffff\1\6\1\uffff\1\6\2\uffff\12\35\12\uffff\3\37"+
            "\2\uffff\1\6\2\uffff\1\37\6\uffff\1\37\20\uffff\3\37\2\uffff"+
            "\1\6\2\uffff\1\37\6\uffff\1\37",
            "\1\40\1\uffff\1\40\2\uffff\12\41",
            "\1\42\7\uffff\1\6\1\uffff\1\6\2\uffff\12\21\12\uffff\3\43"+
            "\2\uffff\1\6\2\uffff\1\43\6\uffff\1\43\20\uffff\3\43\2\uffff"+
            "\1\6\2\uffff\1\43\6\uffff\1\43",
            "\1\44\7\uffff\1\6\1\uffff\1\6\26\uffff\3\45\5\uffff\1\45\6"+
            "\uffff\1\45\20\uffff\3\45\5\uffff\1\45\6\uffff\1\45",
            "\1\46\7\uffff\1\6\1\uffff\1\6\2\uffff\12\23",
            "\1\25\7\uffff\1\6\1\uffff\1\6\2\uffff\12\24\12\uffff\3\26"+
            "\5\uffff\1\26\6\uffff\1\26\20\uffff\3\26\5\uffff\1\26\6\uffff"+
            "\1\26",
            "\1\25\7\uffff\1\6\1\uffff\1\6\26\uffff\3\26\5\uffff\1\26\6"+
            "\uffff\1\26\20\uffff\3\26\5\uffff\1\26\6\uffff\1\26",
            "\1\47\1\uffff\1\47\2\uffff\12\50",
            "\12\30",
            "\1\6\1\uffff\1\6\2\uffff\12\30",
            "\1\31\7\uffff\1\6\1\uffff\1\6\26\uffff\3\32\5\uffff\1\32\6"+
            "\uffff\1\32\20\uffff\3\32\5\uffff\1\32\6\uffff\1\32",
            "\1\51\1\uffff\1\51\2\uffff\12\52",
            "\1\53\7\uffff\1\6\1\uffff\1\6\26\uffff\3\54\2\uffff\1\6\2"+
            "\uffff\1\54\6\uffff\1\54\20\uffff\3\54\2\uffff\1\6\2\uffff\1"+
            "\54\6\uffff\1\54",
            "\1\55\7\uffff\1\6\1\uffff\1\6\2\uffff\12\34\17\uffff\1\6\37"+
            "\uffff\1\6",
            "\1\36\7\uffff\1\6\1\uffff\1\6\2\uffff\12\35\12\uffff\3\37"+
            "\2\uffff\1\6\2\uffff\1\37\6\uffff\1\37\20\uffff\3\37\2\uffff"+
            "\1\6\2\uffff\1\37\6\uffff\1\37",
            "\1\36\7\uffff\1\6\1\uffff\1\6\26\uffff\3\37\2\uffff\1\6\2"+
            "\uffff\1\37\6\uffff\1\37\20\uffff\3\37\2\uffff\1\6\2\uffff\1"+
            "\37\6\uffff\1\37",
            "\1\56\1\uffff\1\56\2\uffff\12\57",
            "\12\41",
            "\1\6\1\uffff\1\6\2\uffff\12\41\17\uffff\1\6\37\uffff\1\6",
            "\1\42\7\uffff\1\6\1\uffff\1\6\26\uffff\3\43\2\uffff\1\6\2"+
            "\uffff\1\43\6\uffff\1\43\20\uffff\3\43\2\uffff\1\6\2\uffff\1"+
            "\43\6\uffff\1\43",
            "\1\60\1\uffff\1\60\2\uffff\12\61",
            "\1\44\7\uffff\1\6\1\uffff\1\6\26\uffff\3\45\5\uffff\1\45\6"+
            "\uffff\1\45\20\uffff\3\45\5\uffff\1\45\6\uffff\1\45",
            "\1\62\1\uffff\1\62\2\uffff\12\63",
            "\1\46\7\uffff\1\6\1\uffff\1\6",
            "\12\50",
            "\1\6\1\uffff\1\6\2\uffff\12\50",
            "\12\52",
            "\1\6\1\uffff\1\6\2\uffff\12\52",
            "\1\53\7\uffff\1\6\1\uffff\1\6\26\uffff\3\54\2\uffff\1\6\2"+
            "\uffff\1\54\6\uffff\1\54\20\uffff\3\54\2\uffff\1\6\2\uffff\1"+
            "\54\6\uffff\1\54",
            "\1\64\1\uffff\1\64\2\uffff\12\65",
            "\1\55\7\uffff\1\6\1\uffff\1\6\33\uffff\1\6\37\uffff\1\6",
            "\12\57",
            "\1\6\1\uffff\1\6\2\uffff\12\57\17\uffff\1\6\37\uffff\1\6",
            "\12\61",
            "\1\6\1\uffff\1\6\2\uffff\12\61\17\uffff\1\6\37\uffff\1\6",
            "\12\63",
            "\1\6\1\uffff\1\6\2\uffff\12\63",
            "\12\65",
            "\1\6\1\uffff\1\6\2\uffff\12\65\17\uffff\1\6\37\uffff\1\6"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "873:10: fragment COMPLEX_10 : ( REAL_10 ( '@' REAL_10 )? | ( REAL_10 )? SIGN ( UREAL_10 )? ( 'i' | 'I' ) );";
        }
    }
    static final String DFA18_eotS =
        "\35\uffff";
    static final String DFA18_eofS =
        "\35\uffff";
    static final String DFA18_minS =
        "\1\53\1\56\1\uffff\1\43\1\60\1\uffff\1\43\1\53\1\43\1\60\2\43\1"+
        "\60\1\53\2\43\1\53\2\43\1\53\1\43\1\53\1\60\1\53\1\43\1\60\1\53"+
        "\1\60\1\53";
    static final String DFA18_maxS =
        "\1\71\1\151\1\uffff\1\163\1\71\1\uffff\1\163\1\71\1\163\1\71\2"+
        "\163\1\71\1\151\2\163\1\71\1\151\1\163\1\71\1\163\2\71\2\151\1\71"+
        "\1\151\1\71\1\151";
    static final String DFA18_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\27\uffff";
    static final String DFA18_specialS =
        "\35\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\uffff\1\1\1\2\1\uffff\12\2",
            "\1\4\1\uffff\12\3\17\uffff\1\5\37\uffff\1\5",
            "",
            "\1\6\7\uffff\1\2\1\uffff\1\2\1\10\1\11\12\3\12\uffff\3\7\2"+
            "\uffff\1\5\2\uffff\1\7\6\uffff\1\7\20\uffff\3\7\2\uffff\1\5"+
            "\2\uffff\1\7\6\uffff\1\7",
            "\12\12",
            "",
            "\1\6\7\uffff\1\2\1\uffff\1\2\1\13\1\11\24\uffff\3\7\2\uffff"+
            "\1\5\2\uffff\1\7\6\uffff\1\7\20\uffff\3\7\2\uffff\1\5\2\uffff"+
            "\1\7\6\uffff\1\7",
            "\1\14\1\uffff\1\14\2\uffff\12\15",
            "\1\17\7\uffff\1\2\1\uffff\1\2\2\uffff\12\16\12\uffff\3\20"+
            "\2\uffff\1\5\2\uffff\1\20\6\uffff\1\20\20\uffff\3\20\2\uffff"+
            "\1\5\2\uffff\1\20\6\uffff\1\20",
            "\12\21",
            "\1\22\7\uffff\1\2\1\uffff\1\2\2\uffff\12\12\12\uffff\3\23"+
            "\2\uffff\1\5\2\uffff\1\23\6\uffff\1\23\20\uffff\3\23\2\uffff"+
            "\1\5\2\uffff\1\23\6\uffff\1\23",
            "\1\24\7\uffff\1\2\1\uffff\1\2\26\uffff\3\25\2\uffff\1\5\2"+
            "\uffff\1\25\6\uffff\1\25\20\uffff\3\25\2\uffff\1\5\2\uffff\1"+
            "\25\6\uffff\1\25",
            "\12\15",
            "\1\2\1\uffff\1\2\2\uffff\12\15\17\uffff\1\5\37\uffff\1\5",
            "\1\17\7\uffff\1\2\1\uffff\1\2\2\uffff\12\16\12\uffff\3\20"+
            "\2\uffff\1\5\2\uffff\1\20\6\uffff\1\20\20\uffff\3\20\2\uffff"+
            "\1\5\2\uffff\1\20\6\uffff\1\20",
            "\1\17\7\uffff\1\2\1\uffff\1\2\26\uffff\3\20\2\uffff\1\5\2"+
            "\uffff\1\20\6\uffff\1\20\20\uffff\3\20\2\uffff\1\5\2\uffff\1"+
            "\20\6\uffff\1\20",
            "\1\26\1\uffff\1\26\2\uffff\12\27",
            "\1\30\7\uffff\1\2\1\uffff\1\2\2\uffff\12\21\17\uffff\1\5\37"+
            "\uffff\1\5",
            "\1\22\7\uffff\1\2\1\uffff\1\2\26\uffff\3\23\2\uffff\1\5\2"+
            "\uffff\1\23\6\uffff\1\23\20\uffff\3\23\2\uffff\1\5\2\uffff\1"+
            "\23\6\uffff\1\23",
            "\1\31\1\uffff\1\31\2\uffff\12\32",
            "\1\24\7\uffff\1\2\1\uffff\1\2\26\uffff\3\25\2\uffff\1\5\2"+
            "\uffff\1\25\6\uffff\1\25\20\uffff\3\25\2\uffff\1\5\2\uffff\1"+
            "\25\6\uffff\1\25",
            "\1\33\1\uffff\1\33\2\uffff\12\34",
            "\12\27",
            "\1\2\1\uffff\1\2\2\uffff\12\27\17\uffff\1\5\37\uffff\1\5",
            "\1\30\7\uffff\1\2\1\uffff\1\2\33\uffff\1\5\37\uffff\1\5",
            "\12\32",
            "\1\2\1\uffff\1\2\2\uffff\12\32\17\uffff\1\5\37\uffff\1\5",
            "\12\34",
            "\1\2\1\uffff\1\2\2\uffff\12\34\17\uffff\1\5\37\uffff\1\5"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "875:6: ( REAL_10 )?";
        }
    }
    static final String DFA24_eotS =
        "\2\uffff\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\4\5";
    static final String DFA24_eofS =
        "\16\uffff";
    static final String DFA24_minS =
        "\1\53\1\60\2\43\2\uffff\1\43\1\60\1\43\1\60\4\43";
    static final String DFA24_maxS =
        "\1\146\1\151\1\146\1\151\2\uffff\1\57\1\146\1\151\2\146\1\151\1"+
        "\55\1\151";
    static final String DFA24_acceptS =
        "\4\uffff\1\2\1\1\10\uffff";
    static final String DFA24_specialS =
        "\16\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\12\2\7\uffff\6\2\32\uffff\6\2",
            "\12\3\7\uffff\6\3\2\uffff\1\4\27\uffff\6\3\2\uffff\1\4",
            "\1\6\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7\12\2\7\uffff\6\2"+
            "\32\uffff\6\2",
            "\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\12\3\7\uffff\6"+
            "\3\2\uffff\1\4\27\uffff\6\3\2\uffff\1\4",
            "",
            "",
            "\1\6\7\uffff\1\4\1\uffff\1\4\1\uffff\1\7",
            "\12\12\7\uffff\6\12\32\uffff\6\12",
            "\1\10\7\uffff\1\4\1\uffff\1\4\1\uffff\1\11\31\uffff\1\4\37"+
            "\uffff\1\4",
            "\12\13\7\uffff\6\13\32\uffff\6\13",
            "\1\14\7\uffff\1\4\1\uffff\1\4\2\uffff\12\12\7\uffff\6\12\32"+
            "\uffff\6\12",
            "\1\15\7\uffff\1\4\1\uffff\1\4\2\uffff\12\13\7\uffff\6\13\2"+
            "\uffff\1\4\27\uffff\6\13\2\uffff\1\4",
            "\1\14\7\uffff\1\4\1\uffff\1\4",
            "\1\15\7\uffff\1\4\1\uffff\1\4\33\uffff\1\4\37\uffff\1\4"
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "878:10: fragment COMPLEX_16 : ( REAL_16 ( '@' REAL_16 )? | ( REAL_16 )? SIGN ( UREAL_16 )? ( 'i' | 'I' ) );";
        }
    }
    static final String DFA22_eotS =
        "\11\uffff";
    static final String DFA22_eofS =
        "\11\uffff";
    static final String DFA22_minS =
        "\1\53\1\60\1\uffff\1\43\1\uffff\1\43\1\60\2\43";
    static final String DFA22_maxS =
        "\1\146\1\151\1\uffff\1\151\1\uffff\1\151\1\146\2\151";
    static final String DFA22_acceptS =
        "\2\uffff\1\1\1\uffff\1\2\4\uffff";
    static final String DFA22_specialS =
        "\11\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\12\2\7\uffff\6\2\32\uffff\6\2",
            "\12\3\7\uffff\6\3\2\uffff\1\4\27\uffff\6\3\2\uffff\1\4",
            "",
            "\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\12\3\7\uffff\6\3"+
            "\2\uffff\1\4\27\uffff\6\3\2\uffff\1\4",
            "",
            "\1\5\7\uffff\1\2\1\uffff\1\2\1\uffff\1\6\31\uffff\1\4\37\uffff"+
            "\1\4",
            "\12\7\7\uffff\6\7\32\uffff\6\7",
            "\1\10\7\uffff\1\2\1\uffff\1\2\2\uffff\12\7\7\uffff\6\7\2\uffff"+
            "\1\4\27\uffff\6\7\2\uffff\1\4",
            "\1\10\7\uffff\1\2\1\uffff\1\2\33\uffff\1\4\37\uffff\1\4"
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
            return "880:6: ( REAL_16 )?";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\1\3\2\uffff\1\3";
    static final String DFA32_eofS =
        "\5\uffff";
    static final String DFA32_minS =
        "\1\56\1\43\2\uffff\1\43";
    static final String DFA32_maxS =
        "\1\71\1\163\2\uffff\1\163";
    static final String DFA32_acceptS =
        "\2\uffff\1\2\1\1\1\uffff";
    static final String DFA32_specialS =
        "\5\uffff}>";
    static final String[] DFA32_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\12\uffff\1\2\1\uffff\12\1\12\uffff\3\2\5\uffff\1\2\6"+
            "\uffff\1\2\20\uffff\3\2\5\uffff\1\2\6\uffff\1\2",
            "",
            "",
            "\1\4\12\uffff\1\2\25\uffff\3\2\5\uffff\1\2\6\uffff\1\2\20"+
            "\uffff\3\2\5\uffff\1\2\6\uffff\1\2"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "889:10: fragment UREAL_10 : ( UINTEGER_10 ( '/' UINTEGER_10 )? | DECIMAL_10 );";
        }
    }
    static final String DFA45_eotS =
        "\7\uffff";
    static final String DFA45_eofS =
        "\7\uffff";
    static final String DFA45_minS =
        "\1\56\1\43\1\uffff\1\43\3\uffff";
    static final String DFA45_maxS =
        "\1\71\1\163\1\uffff\1\163\3\uffff";
    static final String DFA45_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\1\3\1\4";
    static final String DFA45_specialS =
        "\7\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\12\uffff\1\5\1\uffff\12\1\12\uffff\3\4\5\uffff\1\4\6"+
            "\uffff\1\4\20\uffff\3\4\5\uffff\1\4\6\uffff\1\4",
            "",
            "\1\3\12\uffff\1\6\25\uffff\3\4\5\uffff\1\4\6\uffff\1\4\20"+
            "\uffff\3\4\5\uffff\1\4\6\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "892:10: fragment DECIMAL_10 : ( UINTEGER_10 SUFFIX | '.' ( DIGIT )+ ( '#' )* ( SUFFIX )? | ( DIGIT )+ '.' ( DIGIT )* ( '#' )* ( SUFFIX )? | ( DIGIT )+ ( '#' )+ '.' ( '#' )* ( SUFFIX )? );";
        }
    }
    static final String DFA64_eotS =
        "\4\uffff\1\45\1\47\1\uffff\1\51\17\30\15\uffff\1\102\5\uffff\6"+
        "\30\1\112\1\30\1\114\2\30\1\117\10\30\1\133\1\30\3\uffff\1\140\6"+
        "\30\1\uffff\1\30\1\uffff\2\30\1\uffff\6\30\1\160\3\30\1\164\1\uffff"+
        "\3\30\1\170\1\uffff\3\30\1\174\4\30\1\u0081\6\30\1\uffff\1\u0088"+
        "\1\u0089\1\30\1\uffff\1\u008c\2\30\1\uffff\3\30\1\uffff\1\30\1\u0093"+
        "\2\30\1\uffff\2\30\1\u0098\1\30\1\u009a\1\u009b\2\uffff\2\30\1\uffff"+
        "\1\30\1\u00a0\1\30\1\u00a2\1\30\1\u00a5\1\uffff\1\u00a6\1\u00a7"+
        "\1\30\1\u00a9\1\uffff\1\30\2\uffff\4\30\1\uffff\1\u00af\1\uffff"+
        "\2\30\3\uffff\1\u00b3\1\uffff\2\30\1\u00b6\2\30\1\uffff\3\30\1\uffff"+
        "\2\30\1\uffff\7\30\1\u00c5\4\30\1\u00ca\1\30\1\uffff\4\30\1\uffff"+
        "\2\30\1\u00d2\3\30\1\u00d6\1\uffff\1\u00d7\2\30\2\uffff\4\30\1\u00de"+
        "\1\30\1\uffff\15\30\1\u00ed\1\uffff";
    static final String DFA64_eofS =
        "\u00ee\uffff";
    static final String DFA64_minS =
        "\1\11\2\uffff\2\50\1\56\1\uffff\1\100\1\141\2\145\1\146\1\154\1"+
        "\76\1\156\1\165\1\145\1\156\1\141\1\157\1\162\1\150\1\56\7\uffff"+
        "\1\43\5\uffff\1\51\5\uffff\1\164\1\142\1\155\1\156\1\164\1\146\1"+
        "\41\1\160\1\41\1\160\1\163\1\41\1\154\1\141\1\147\1\160\1\144\1"+
        "\156\1\154\1\164\1\41\1\145\1\102\2\uffff\1\41\1\162\1\142\1\164"+
        "\1\41\1\151\1\141\1\uffff\1\157\1\uffff\1\157\1\145\1\uffff\1\165"+
        "\1\145\1\164\1\163\1\151\1\154\1\41\1\144\1\145\1\154\1\41\1\uffff"+
        "\1\156\1\163\1\145\1\41\1\uffff\1\141\1\144\1\141\1\41\1\156\1\171"+
        "\2\162\1\41\1\157\1\163\1\145\1\151\1\156\1\171\1\uffff\2\41\1\55"+
        "\1\uffff\1\41\1\171\1\143\1\uffff\1\162\1\141\1\170\1\uffff\1\145"+
        "\1\41\2\164\1\uffff\1\164\1\163\1\41\1\161\2\41\2\uffff\1\167\1"+
        "\143\1\uffff\1\156\1\41\1\171\1\41\1\55\1\41\1\uffff\2\41\1\145"+
        "\1\41\1\uffff\1\165\2\uffff\1\151\1\143\1\164\1\163\1\uffff\1\41"+
        "\1\uffff\1\162\1\163\3\uffff\1\41\1\uffff\1\157\1\164\1\41\1\141"+
        "\1\171\1\uffff\1\165\1\171\1\163\1\uffff\1\164\1\150\1\uffff\1\170"+
        "\1\156\1\154\1\156\1\160\1\145\1\55\1\41\1\164\1\145\1\164\1\154"+
        "\1\41\1\143\1\uffff\1\141\1\163\1\141\1\151\1\uffff\1\165\1\170"+
        "\1\41\1\170\1\143\1\162\1\41\1\uffff\1\41\1\151\1\162\2\uffff\1"+
        "\156\1\145\1\147\1\156\1\41\1\164\1\uffff\1\55\1\143\1\157\1\156"+
        "\1\164\1\151\1\156\1\165\1\141\1\164\1\151\1\157\1\156\1\41\1\uffff";
    static final String DFA64_maxS =
        "\1\176\2\uffff\1\170\1\50\1\71\1\uffff\1\100\1\151\1\171\1\157"+
        "\1\155\1\170\1\76\1\156\1\165\1\145\1\160\2\157\1\162\1\150\1\151"+
        "\7\uffff\1\43\5\uffff\1\51\5\uffff\1\164\1\142\1\155\1\156\1\164"+
        "\1\154\1\176\1\160\1\176\1\160\1\163\1\176\1\161\1\157\1\147\1\160"+
        "\1\144\1\156\1\163\1\164\1\176\1\145\1\170\2\uffff\1\176\1\162\1"+
        "\142\1\164\1\41\1\151\1\141\1\uffff\1\157\1\uffff\1\157\1\145\1"+
        "\uffff\1\165\1\145\1\164\1\163\1\151\1\154\1\176\1\144\1\145\1\154"+
        "\1\176\1\uffff\1\156\1\163\1\145\1\176\1\uffff\1\141\1\144\1\141"+
        "\1\176\1\156\1\171\2\162\1\176\1\157\1\163\1\145\1\151\1\156\1\171"+
        "\1\uffff\2\176\1\57\1\uffff\1\176\1\171\1\143\1\uffff\1\162\1\141"+
        "\1\170\1\uffff\1\145\1\176\2\164\1\uffff\1\164\1\163\1\176\1\161"+
        "\2\176\2\uffff\1\167\1\143\1\uffff\1\156\1\176\1\171\1\176\1\55"+
        "\1\176\1\uffff\2\176\1\145\1\176\1\uffff\1\165\2\uffff\1\151\1\143"+
        "\1\164\1\163\1\uffff\1\176\1\uffff\1\162\1\163\3\uffff\1\176\1\uffff"+
        "\1\157\1\164\1\176\1\141\1\171\1\uffff\1\165\1\171\1\163\1\uffff"+
        "\1\164\1\150\1\uffff\1\170\1\156\1\154\1\156\1\160\1\145\1\55\1"+
        "\176\1\164\1\145\1\164\1\154\1\176\1\143\1\uffff\1\141\1\163\1\141"+
        "\1\151\1\uffff\1\165\1\170\1\176\1\170\1\143\1\162\1\176\1\uffff"+
        "\1\176\1\151\1\162\2\uffff\1\156\1\145\1\147\1\156\1\176\1\164\1"+
        "\uffff\1\55\1\143\1\157\1\156\1\164\1\151\1\156\1\165\1\141\1\164"+
        "\1\151\1\157\1\156\1\176\1\uffff";
    static final String DFA64_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\10\20\uffff\1\56\1\61\1\62\1\66\1\67"+
        "\1\3\1\54\1\uffff\1\55\1\57\1\63\1\64\1\65\1\uffff\1\4\1\60\1\6"+
        "\1\11\1\12\27\uffff\1\5\1\7\7\uffff\1\47\1\uffff\1\31\2\uffff\1"+
        "\23\13\uffff\1\40\4\uffff\1\44\17\uffff\1\37\3\uffff\1\36\3\uffff"+
        "\1\45\3\uffff\1\32\4\uffff\1\22\6\uffff\1\35\1\41\2\uffff\1\42\6"+
        "\uffff\1\50\4\uffff\1\27\1\uffff\1\33\1\34\4\uffff\1\46\1\uffff"+
        "\1\30\2\uffff\1\24\1\20\1\21\1\uffff\1\43\5\uffff\1\17\3\uffff\1"+
        "\26\2\uffff\1\53\16\uffff\1\13\4\uffff\1\51\7\uffff\1\15\3\uffff"+
        "\1\14\1\16\6\uffff\1\25\16\uffff\1\52";
    static final String DFA64_specialS =
        "\u00ee\uffff}>";
    static final String[] DFA64_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\1\30\1\31\1\3\3\30\1\4\1\1"+
            "\1\2\1\30\1\26\1\7\1\26\1\5\1\30\12\27\1\30\1\33\1\30\1\15\2"+
            "\30\1\uffff\32\30\3\uffff\2\30\1\6\1\21\1\20\1\22\1\12\1\14"+
            "\3\30\1\13\2\30\1\10\1\30\1\23\1\24\1\30\1\17\1\30\1\11\1\30"+
            "\1\16\1\30\1\25\3\30\3\uffff\1\30",
            "",
            "",
            "\1\34\31\uffff\1\35\1\uffff\1\27\1\36\1\43\2\uffff\1\36\5"+
            "\uffff\1\37\4\uffff\1\42\3\uffff\1\40\3\uffff\1\41\5\uffff\1"+
            "\35\1\uffff\1\27\1\36\1\43\2\uffff\1\36\5\uffff\1\37\4\uffff"+
            "\1\42\3\uffff\1\40",
            "\1\44",
            "\1\46\1\uffff\12\27",
            "",
            "\1\50",
            "\1\54\3\uffff\1\52\3\uffff\1\53",
            "\1\56\23\uffff\1\55",
            "\1\57\11\uffff\1\60",
            "\1\62\6\uffff\1\61",
            "\1\64\13\uffff\1\63",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\72\1\uffff\1\71",
            "\1\74\15\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\27\1\uffff\12\27\17\uffff\1\27\37\uffff\1\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110\5\uffff\1\111",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\113",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\115",
            "\1\116",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\121\4\uffff\1\120",
            "\1\123\15\uffff\1\122",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\131\6\uffff\1\130",
            "\1\132",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\134",
            "\1\35\1\uffff\1\27\12\uffff\1\37\10\uffff\1\40\11\uffff\1"+
            "\35\1\uffff\1\27\12\uffff\1\37\10\uffff\1\40",
            "",
            "",
            "\1\30\2\uffff\3\30\3\uffff\1\137\1\30\1\uffff\1\135\15\30"+
            "\1\uffff\37\30\3\uffff\2\30\1\uffff\21\30\1\136\10\30\3\uffff"+
            "\1\30",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "\1\147",
            "",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u008a\1\uffff\1\u008b",
            "",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u008d",
            "\1\u008e",
            "",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "\1\u0092",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u0094",
            "\1\u0095",
            "",
            "\1\u0096",
            "\1\u0097",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u0099",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "",
            "\1\u009c",
            "\1\u009d",
            "",
            "\1\u009e",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\1\u009f\15\30\1\uffff"+
            "\37\30\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00a1",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00a3",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\1\u00a4\15\30\1\uffff"+
            "\37\30\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00a8",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "\1\u00aa",
            "",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\1\u00b2\15\30\1\uffff"+
            "\37\30\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "",
            "\1\u00bc",
            "\1\u00bd",
            "",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00cb",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\30\2\uffff\3\30\3\uffff\2\30\1\uffff\16\30\1\uffff\37\30"+
            "\3\uffff\2\30\1\uffff\32\30\3\uffff\1\30",
            ""
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | LET_SYNTAX | LETREC_SYNTAX | SYNTAX_RULES | DEFINE_SYNTAX | LIBRARY | IMPORT | EXPORT | ELSE | ARROW | DEFINE | UNQUOTE_SPLICING | UNQUOTE | QUOTE | LAMBDA | IF | SET | BEGIN | APPLY | COND | NOT | AND | OR | CASE | WHEN | UNLESS | LET | LETSTAR | LETREC | DO | DELAY | QUASIQUOTE | CALL_WITH_CC | CALL_CC | NUM_2 | NUM_8 | NUM_10 | NUM_16 | ELLIPSIS | VARIABLE | STRING | CHARACTER | TRUE | FALSE | SPACE | COMMENT );";
        }
    }
 

}