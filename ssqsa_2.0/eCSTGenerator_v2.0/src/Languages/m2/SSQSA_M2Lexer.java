// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g 2017-03-03 17:26:03
package Languages.m2;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class SSQSA_M2Lexer extends Lexer {
    public static final int WHILE=45;
    public static final int MOD=28;
    public static final int LETTER=111;
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
    public static final int LOGICAL_AND=4;
    public static final int OCTAL_DIGIT=109;
    public static final int NOT_EQUAL_OP=51;
    public static final int STATEMENT=88;
    public static final int CHARACTER=112;
    public static final int TYPE=42;
    public static final int EQUAL_OP=50;
    public static final int ASSIGN_OP=47;
    public static final int INC=25;
    public static final int NAME=75;
    public static final int DIVIDE_OP=60;
    public static final int IMPORT=24;
    public static final int LOGICAL_OPERATOR=81;
    public static final int FOR_UPDATE=97;
    public static final int LESS_OP=55;
    public static final int MULTIPLY_OP=59;
    public static final int COMPILATION_UNIT=64;
    public static final int GREATER_OP=53;
    public static final int BEGIN=6;
    public static final int LOOP=27;
    public static final int RETURN=38;
    public static final int QUALIFIED=35;
    public static final int VAR=44;
    public static final int IMPLEMENTATION=23;
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
    public static final int PARAMETER_DECL=74;
    public static final int THEN=40;
    public static final int IN=26;
    public static final int IMPLEMENTS=79;
    public static final int ARGUMENT=78;
    public static final int LOGICAL_OR=32;
    public static final int DEFINITION=11;
    public static final int ARGUMENT_LIST=77;
    public static final int IDENT=103;
    public static final int PLUS_OP=57;
    public static final int DIGIT=108;
    public static final int DOT=62;
    public static final int FORMAL_PARAM_LIST=73;
    public static final int WITH=46;
    public static final int PASCAL_NOT_EQUAL_OP=52;
    public static final int INTEGER=104;
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

    public SSQSA_M2Lexer() {;} 
    public SSQSA_M2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SSQSA_M2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g"; }

    // $ANTLR start "LOGICAL_AND"
    public final void mLOGICAL_AND() throws RecognitionException {
        try {
            int _type = LOGICAL_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:5:13: ( 'AND' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:5:15: 'AND'
            {
            match("AND"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL_AND"

    // $ANTLR start "ARRAY"
    public final void mARRAY() throws RecognitionException {
        try {
            int _type = ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:6:7: ( 'ARRAY' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:6:9: 'ARRAY'
            {
            match("ARRAY"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARRAY"

    // $ANTLR start "BEGIN"
    public final void mBEGIN() throws RecognitionException {
        try {
            int _type = BEGIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:7:7: ( 'BEGIN' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:7:9: 'BEGIN'
            {
            match("BEGIN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BEGIN"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:8:4: ( 'BY' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:8:6: 'BY'
            {
            match("BY"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "CASE"
    public final void mCASE() throws RecognitionException {
        try {
            int _type = CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:9:6: ( 'CASE' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:9:8: 'CASE'
            {
            match("CASE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASE"

    // $ANTLR start "CONST_"
    public final void mCONST_() throws RecognitionException {
        try {
            int _type = CONST_;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:10:8: ( 'CONST' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:10:10: 'CONST'
            {
            match("CONST"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST_"

    // $ANTLR start "DEC"
    public final void mDEC() throws RecognitionException {
        try {
            int _type = DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:11:5: ( 'DEC' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:11:7: 'DEC'
            {
            match("DEC"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEC"

    // $ANTLR start "DEFINITION"
    public final void mDEFINITION() throws RecognitionException {
        try {
            int _type = DEFINITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:12:12: ( 'DEFINITION' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:12:14: 'DEFINITION'
            {
            match("DEFINITION"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFINITION"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:13:5: ( 'DIV' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:13:7: 'DIV'
            {
            match("DIV"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "DO"
    public final void mDO() throws RecognitionException {
        try {
            int _type = DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:14:4: ( 'DO' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:14:6: 'DO'
            {
            match("DO"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DO"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:15:6: ( 'ELSE' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:15:8: 'ELSE'
            {
            match("ELSE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "ELSIF"
    public final void mELSIF() throws RecognitionException {
        try {
            int _type = ELSIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:16:7: ( 'ELSIF' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:16:9: 'ELSIF'
            {
            match("ELSIF"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSIF"

    // $ANTLR start "END"
    public final void mEND() throws RecognitionException {
        try {
            int _type = END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:17:5: ( 'END' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:17:7: 'END'
            {
            match("END"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END"

    // $ANTLR start "EXIT"
    public final void mEXIT() throws RecognitionException {
        try {
            int _type = EXIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:18:6: ( 'EXIT' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:18:8: 'EXIT'
            {
            match("EXIT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXIT"

    // $ANTLR start "EXPORT"
    public final void mEXPORT() throws RecognitionException {
        try {
            int _type = EXPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:19:8: ( 'EXPORT' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:19:10: 'EXPORT'
            {
            match("EXPORT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXPORT"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:20:5: ( 'FOR' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:20:7: 'FOR'
            {
            match("FOR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "FORWARD"
    public final void mFORWARD() throws RecognitionException {
        try {
            int _type = FORWARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:21:9: ( 'FORWARD' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:21:11: 'FORWARD'
            {
            match("FORWARD"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORWARD"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:22:6: ( 'FROM' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:22:8: 'FROM'
            {
            match("FROM"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:23:4: ( 'IF' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:23:6: 'IF'
            {
            match("IF"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPLEMENTATION"
    public final void mIMPLEMENTATION() throws RecognitionException {
        try {
            int _type = IMPLEMENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:24:16: ( 'IMPLEMENTATION' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:24:18: 'IMPLEMENTATION'
            {
            match("IMPLEMENTATION"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLEMENTATION"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:25:8: ( 'IMPORT' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:25:10: 'IMPORT'
            {
            match("IMPORT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "INC"
    public final void mINC() throws RecognitionException {
        try {
            int _type = INC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:26:5: ( 'INC' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:26:7: 'INC'
            {
            match("INC"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INC"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:27:4: ( 'IN' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:27:6: 'IN'
            {
            match("IN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "LOOP"
    public final void mLOOP() throws RecognitionException {
        try {
            int _type = LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:28:6: ( 'LOOP' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:28:8: 'LOOP'
            {
            match("LOOP"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOOP"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:29:5: ( 'MOD' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:29:7: 'MOD'
            {
            match("MOD"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "MODULE"
    public final void mMODULE() throws RecognitionException {
        try {
            int _type = MODULE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:30:8: ( 'MODULE' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:30:10: 'MODULE'
            {
            match("MODULE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:31:5: ( 'NOT' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:31:7: 'NOT'
            {
            match("NOT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:32:4: ( 'OF' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:32:6: 'OF'
            {
            match("OF"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "LOGICAL_OR"
    public final void mLOGICAL_OR() throws RecognitionException {
        try {
            int _type = LOGICAL_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:33:12: ( 'OR' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:33:14: 'OR'
            {
            match("OR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL_OR"

    // $ANTLR start "POINTER"
    public final void mPOINTER() throws RecognitionException {
        try {
            int _type = POINTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:34:9: ( 'POINTER' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:34:11: 'POINTER'
            {
            match("POINTER"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINTER"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:35:11: ( 'PROCEDURE' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:35:13: 'PROCEDURE'
            {
            match("PROCEDURE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "QUALIFIED"
    public final void mQUALIFIED() throws RecognitionException {
        try {
            int _type = QUALIFIED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:36:11: ( 'QUALIFIED' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:36:13: 'QUALIFIED'
            {
            match("QUALIFIED"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUALIFIED"

    // $ANTLR start "RECORD"
    public final void mRECORD() throws RecognitionException {
        try {
            int _type = RECORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:37:8: ( 'RECORD' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:37:10: 'RECORD'
            {
            match("RECORD"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RECORD"

    // $ANTLR start "REPEAT"
    public final void mREPEAT() throws RecognitionException {
        try {
            int _type = REPEAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:38:8: ( 'REPEAT' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:38:10: 'REPEAT'
            {
            match("REPEAT"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REPEAT"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:39:8: ( 'RETURN' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:39:10: 'RETURN'
            {
            match("RETURN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "SET"
    public final void mSET() throws RecognitionException {
        try {
            int _type = SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:40:5: ( 'SET' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:40:7: 'SET'
            {
            match("SET"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SET"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:41:6: ( 'THEN' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:41:8: 'THEN'
            {
            match("THEN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "TO"
    public final void mTO() throws RecognitionException {
        try {
            int _type = TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:42:4: ( 'TO' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:42:6: 'TO'
            {
            match("TO"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TO"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:43:6: ( 'TYPE' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:43:8: 'TYPE'
            {
            match("TYPE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "UNTIL"
    public final void mUNTIL() throws RecognitionException {
        try {
            int _type = UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:44:7: ( 'UNTIL' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:44:9: 'UNTIL'
            {
            match("UNTIL"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNTIL"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:45:5: ( 'VAR' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:45:7: 'VAR'
            {
            match("VAR"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:46:7: ( 'WHILE' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:46:9: 'WHILE'
            {
            match("WHILE"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:47:6: ( 'WITH' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:47:8: 'WITH'
            {
            match("WITH"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "ASSIGN_OP"
    public final void mASSIGN_OP() throws RecognitionException {
        try {
            int _type = ASSIGN_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:48:11: ( ':=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:48:13: ':='
            {
            match(":="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN_OP"

    // $ANTLR start "LOGICAL_AND_OP"
    public final void mLOGICAL_AND_OP() throws RecognitionException {
        try {
            int _type = LOGICAL_AND_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:49:16: ( '&' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:49:18: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL_AND_OP"

    // $ANTLR start "LOGICAL_NOT_OP"
    public final void mLOGICAL_NOT_OP() throws RecognitionException {
        try {
            int _type = LOGICAL_NOT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:50:16: ( '~' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:50:18: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LOGICAL_NOT_OP"

    // $ANTLR start "EQUAL_OP"
    public final void mEQUAL_OP() throws RecognitionException {
        try {
            int _type = EQUAL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:51:10: ( '=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:51:12: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL_OP"

    // $ANTLR start "NOT_EQUAL_OP"
    public final void mNOT_EQUAL_OP() throws RecognitionException {
        try {
            int _type = NOT_EQUAL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:52:14: ( '#' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:52:16: '#'
            {
            match('#'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_EQUAL_OP"

    // $ANTLR start "PASCAL_NOT_EQUAL_OP"
    public final void mPASCAL_NOT_EQUAL_OP() throws RecognitionException {
        try {
            int _type = PASCAL_NOT_EQUAL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:53:21: ( '<>' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:53:23: '<>'
            {
            match("<>"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PASCAL_NOT_EQUAL_OP"

    // $ANTLR start "GREATER_OP"
    public final void mGREATER_OP() throws RecognitionException {
        try {
            int _type = GREATER_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:54:12: ( '>' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:54:14: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_OP"

    // $ANTLR start "GREATER_OR_EQUAL_OP"
    public final void mGREATER_OR_EQUAL_OP() throws RecognitionException {
        try {
            int _type = GREATER_OR_EQUAL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:55:21: ( '>=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:55:23: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER_OR_EQUAL_OP"

    // $ANTLR start "LESS_OP"
    public final void mLESS_OP() throws RecognitionException {
        try {
            int _type = LESS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:56:9: ( '<' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:56:11: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_OP"

    // $ANTLR start "LESS_OR_EQUAL_OP"
    public final void mLESS_OR_EQUAL_OP() throws RecognitionException {
        try {
            int _type = LESS_OR_EQUAL_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:57:18: ( '<=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:57:20: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS_OR_EQUAL_OP"

    // $ANTLR start "PLUS_OP"
    public final void mPLUS_OP() throws RecognitionException {
        try {
            int _type = PLUS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:58:9: ( '+' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:58:11: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS_OP"

    // $ANTLR start "MINUS_OP"
    public final void mMINUS_OP() throws RecognitionException {
        try {
            int _type = MINUS_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:59:10: ( '-' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:59:12: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_OP"

    // $ANTLR start "MULTIPLY_OP"
    public final void mMULTIPLY_OP() throws RecognitionException {
        try {
            int _type = MULTIPLY_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:60:13: ( '*' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:60:15: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTIPLY_OP"

    // $ANTLR start "DIVIDE_OP"
    public final void mDIVIDE_OP() throws RecognitionException {
        try {
            int _type = DIVIDE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:61:11: ( '/' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:61:13: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE_OP"

    // $ANTLR start "POINTER_OP"
    public final void mPOINTER_OP() throws RecognitionException {
        try {
            int _type = POINTER_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:62:12: ( '^' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:62:14: '^'
            {
            match('^'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POINTER_OP"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:63:5: ( '.' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:63:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "DOTDOT"
    public final void mDOTDOT() throws RecognitionException {
        try {
            int _type = DOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:64:8: ( '..' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:64:10: '..'
            {
            match(".."); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOTDOT"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:65:8: ( '(' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:65:10: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:66:8: ( ')' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:66:10: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "T__117"
    public final void mT__117() throws RecognitionException {
        try {
            int _type = T__117;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:67:8: ( '{' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:67:10: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__117"

    // $ANTLR start "T__118"
    public final void mT__118() throws RecognitionException {
        try {
            int _type = T__118;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:68:8: ( ',' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:68:10: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__118"

    // $ANTLR start "T__119"
    public final void mT__119() throws RecognitionException {
        try {
            int _type = T__119;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:69:8: ( '}' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:69:10: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__119"

    // $ANTLR start "T__120"
    public final void mT__120() throws RecognitionException {
        try {
            int _type = T__120;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:70:8: ( '[' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:70:10: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__120"

    // $ANTLR start "T__121"
    public final void mT__121() throws RecognitionException {
        try {
            int _type = T__121;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:71:8: ( ']' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:71:10: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__121"

    // $ANTLR start "T__122"
    public final void mT__122() throws RecognitionException {
        try {
            int _type = T__122;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:72:8: ( ';' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:72:10: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__122"

    // $ANTLR start "T__123"
    public final void mT__123() throws RecognitionException {
        try {
            int _type = T__123;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:73:8: ( ':' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:73:10: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__123"

    // $ANTLR start "T__124"
    public final void mT__124() throws RecognitionException {
        try {
            int _type = T__124;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:74:8: ( '|' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:74:10: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__124"

    // $ANTLR start "T__125"
    public final void mT__125() throws RecognitionException {
        try {
            int _type = T__125;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:75:8: ( 'FOREIGN' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:75:10: 'FOREIGN'
            {
            match("FOREIGN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:983:7: ( LETTER ( LETTER | DIGIT | '_' )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:983:9: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); if (state.failed) return ;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:983:16: ( LETTER | DIGIT | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:987:9: ( DIGIT ( DIGIT )* | OCTAL_DIGIT ( OCTAL_DIGIT )* ( 'B' | 'C' ) | DIGIT ( HEX_DIGIT )* 'H' )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:988:2: DIGIT ( DIGIT )*
                    {
                    mDIGIT(); if (state.failed) return ;
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:988:8: ( DIGIT )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:988:10: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:989:2: OCTAL_DIGIT ( OCTAL_DIGIT )* ( 'B' | 'C' )
                    {
                    mOCTAL_DIGIT(); if (state.failed) return ;
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:989:14: ( OCTAL_DIGIT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='7')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:989:16: OCTAL_DIGIT
                    	    {
                    	    mOCTAL_DIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    if ( (input.LA(1)>='B' && input.LA(1)<='C') ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:990:2: DIGIT ( HEX_DIGIT )* 'H'
                    {
                    mDIGIT(); if (state.failed) return ;
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:990:8: ( HEX_DIGIT )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:990:10: HEX_DIGIT
                    	    {
                    	    mHEX_DIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('H'); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:996:6: ( ( INTEGER DOTDOT )=> INTEGER DOTDOT | DIGIT ( DIGIT )* '.' ( DIGIT )* ( SCALE_FACTOR )? )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:998:2: ( INTEGER DOTDOT )=> INTEGER DOTDOT
                    {
                    mINTEGER(); if (state.failed) return ;
                    mDOTDOT(); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = INTEGER;
                    }

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:999:4: DIGIT ( DIGIT )* '.' ( DIGIT )* ( SCALE_FACTOR )?
                    {
                    mDIGIT(); if (state.failed) return ;
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:999:10: ( DIGIT )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:999:12: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('.'); if (state.failed) return ;
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:999:25: ( DIGIT )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:999:27: DIGIT
                    	    {
                    	    mDIGIT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:999:36: ( SCALE_FACTOR )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='E') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:999:38: SCALE_FACTOR
                            {
                            mSCALE_FACTOR(); if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1005:8: ( '\\'' ( CHARACTER | '\"' )* '\\'' | '\"' ( CHARACTER | '\\'' )* '\"' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\'') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\"') ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1006:2: '\\'' ( CHARACTER | '\"' )* '\\''
                    {
                    match('\''); if (state.failed) return ;
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1006:7: ( CHARACTER | '\"' )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=' ' && LA10_0<='&')||(LA10_0>='(' && LA10_0<='~')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
                    	    {
                    	    if ( (input.LA(1)>=' ' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='~') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\''); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1006:35: '\"' ( CHARACTER | '\\'' )* '\"'
                    {
                    match('\"'); if (state.failed) return ;
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1006:39: ( CHARACTER | '\\'' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=' ' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='~')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
                    	    {
                    	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='~') ) {
                    	        input.consume();
                    	    state.failed=false;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return ;}
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1011:5: ( '(*' ( options {greedy=false; } : ( COMMENT | . ) )* '*)' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1011:9: '(*' ( options {greedy=false; } : ( COMMENT | . ) )* '*)'
            {
            match("(*"); if (state.failed) return ;

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1012:9: ( options {greedy=false; } : ( COMMENT | . ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==')') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='(')||(LA14_1>='*' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1012:36: ( COMMENT | . )
            	    {
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1012:36: ( COMMENT | . )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0=='(') ) {
            	        int LA13_1 = input.LA(2);

            	        if ( (LA13_1=='*') ) {
            	            alt13=1;
            	        }
            	        else if ( ((LA13_1>='\u0000' && LA13_1<=')')||(LA13_1>='+' && LA13_1<='\uFFFF')) ) {
            	            alt13=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 13, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( ((LA13_0>='\u0000' && LA13_0<='\'')||(LA13_0>=')' && LA13_0<='\uFFFF')) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1012:37: COMMENT
            	            {
            	            mCOMMENT(); if (state.failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1012:47: .
            	            {
            	            matchAny(); if (state.failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*)"); if (state.failed) return ;

            if ( state.backtracking==0 ) {

                          	skip();
                          
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1025:12: ( ( ' ' | '\\t' | '\\u000C' | '\\r' | '\\n' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1026:2: ( ' ' | '\\t' | '\\u000C' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( state.backtracking==0 ) {
               _channel = HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1033:8: ( 'A' .. 'Z' | 'a' .. 'z' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1038:7: ( OCTAL_DIGIT | '8' | '9' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "OCTAL_DIGIT"
    public final void mOCTAL_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1043:13: ( '0' .. '7' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1043:15: '0' .. '7'
            {
            matchRange('0','7'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_DIGIT"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1048:11: ( DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "SCALE_FACTOR"
    public final void mSCALE_FACTOR() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1053:14: ( 'E' ( '+' | '-' )? DIGIT ( DIGIT )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1054:2: 'E' ( '+' | '-' )? DIGIT ( DIGIT )*
            {
            match('E'); if (state.failed) return ;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1054:6: ( '+' | '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDIGIT(); if (state.failed) return ;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1054:27: ( DIGIT )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1054:29: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "SCALE_FACTOR"

    // $ANTLR start "CHARACTER"
    public final void mCHARACTER() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1059:11: ( ' ' | '!' | '#' .. '&' | '(' .. '~' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:
            {
            if ( (input.LA(1)>=' ' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='~') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:8: ( LOGICAL_AND | ARRAY | BEGIN | BY | CASE | CONST_ | DEC | DEFINITION | DIV | DO | ELSE | ELSIF | END | EXIT | EXPORT | FOR | FORWARD | FROM | IF | IMPLEMENTATION | IMPORT | INC | IN | LOOP | MOD | MODULE | NOT | OF | LOGICAL_OR | POINTER | PROCEDURE | QUALIFIED | RECORD | REPEAT | RETURN | SET | THEN | TO | TYPE | UNTIL | VAR | WHILE | WITH | ASSIGN_OP | LOGICAL_AND_OP | LOGICAL_NOT_OP | EQUAL_OP | NOT_EQUAL_OP | PASCAL_NOT_EQUAL_OP | GREATER_OP | GREATER_OR_EQUAL_OP | LESS_OP | LESS_OR_EQUAL_OP | PLUS_OP | MINUS_OP | MULTIPLY_OP | DIVIDE_OP | POINTER_OP | DOT | DOTDOT | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | IDENT | INTEGER | REAL | STRING | COMMENT | WHITESPACE )
        int alt17=77;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:10: LOGICAL_AND
                {
                mLOGICAL_AND(); if (state.failed) return ;

                }
                break;
            case 2 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:22: ARRAY
                {
                mARRAY(); if (state.failed) return ;

                }
                break;
            case 3 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:28: BEGIN
                {
                mBEGIN(); if (state.failed) return ;

                }
                break;
            case 4 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:34: BY
                {
                mBY(); if (state.failed) return ;

                }
                break;
            case 5 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:37: CASE
                {
                mCASE(); if (state.failed) return ;

                }
                break;
            case 6 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:42: CONST_
                {
                mCONST_(); if (state.failed) return ;

                }
                break;
            case 7 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:49: DEC
                {
                mDEC(); if (state.failed) return ;

                }
                break;
            case 8 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:53: DEFINITION
                {
                mDEFINITION(); if (state.failed) return ;

                }
                break;
            case 9 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:64: DIV
                {
                mDIV(); if (state.failed) return ;

                }
                break;
            case 10 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:68: DO
                {
                mDO(); if (state.failed) return ;

                }
                break;
            case 11 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:71: ELSE
                {
                mELSE(); if (state.failed) return ;

                }
                break;
            case 12 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:76: ELSIF
                {
                mELSIF(); if (state.failed) return ;

                }
                break;
            case 13 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:82: END
                {
                mEND(); if (state.failed) return ;

                }
                break;
            case 14 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:86: EXIT
                {
                mEXIT(); if (state.failed) return ;

                }
                break;
            case 15 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:91: EXPORT
                {
                mEXPORT(); if (state.failed) return ;

                }
                break;
            case 16 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:98: FOR
                {
                mFOR(); if (state.failed) return ;

                }
                break;
            case 17 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:102: FORWARD
                {
                mFORWARD(); if (state.failed) return ;

                }
                break;
            case 18 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:110: FROM
                {
                mFROM(); if (state.failed) return ;

                }
                break;
            case 19 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:115: IF
                {
                mIF(); if (state.failed) return ;

                }
                break;
            case 20 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:118: IMPLEMENTATION
                {
                mIMPLEMENTATION(); if (state.failed) return ;

                }
                break;
            case 21 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:133: IMPORT
                {
                mIMPORT(); if (state.failed) return ;

                }
                break;
            case 22 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:140: INC
                {
                mINC(); if (state.failed) return ;

                }
                break;
            case 23 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:144: IN
                {
                mIN(); if (state.failed) return ;

                }
                break;
            case 24 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:147: LOOP
                {
                mLOOP(); if (state.failed) return ;

                }
                break;
            case 25 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:152: MOD
                {
                mMOD(); if (state.failed) return ;

                }
                break;
            case 26 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:156: MODULE
                {
                mMODULE(); if (state.failed) return ;

                }
                break;
            case 27 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:163: NOT
                {
                mNOT(); if (state.failed) return ;

                }
                break;
            case 28 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:167: OF
                {
                mOF(); if (state.failed) return ;

                }
                break;
            case 29 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:170: LOGICAL_OR
                {
                mLOGICAL_OR(); if (state.failed) return ;

                }
                break;
            case 30 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:181: POINTER
                {
                mPOINTER(); if (state.failed) return ;

                }
                break;
            case 31 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:189: PROCEDURE
                {
                mPROCEDURE(); if (state.failed) return ;

                }
                break;
            case 32 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:199: QUALIFIED
                {
                mQUALIFIED(); if (state.failed) return ;

                }
                break;
            case 33 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:209: RECORD
                {
                mRECORD(); if (state.failed) return ;

                }
                break;
            case 34 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:216: REPEAT
                {
                mREPEAT(); if (state.failed) return ;

                }
                break;
            case 35 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:223: RETURN
                {
                mRETURN(); if (state.failed) return ;

                }
                break;
            case 36 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:230: SET
                {
                mSET(); if (state.failed) return ;

                }
                break;
            case 37 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:234: THEN
                {
                mTHEN(); if (state.failed) return ;

                }
                break;
            case 38 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:239: TO
                {
                mTO(); if (state.failed) return ;

                }
                break;
            case 39 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:242: TYPE
                {
                mTYPE(); if (state.failed) return ;

                }
                break;
            case 40 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:247: UNTIL
                {
                mUNTIL(); if (state.failed) return ;

                }
                break;
            case 41 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:253: VAR
                {
                mVAR(); if (state.failed) return ;

                }
                break;
            case 42 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:257: WHILE
                {
                mWHILE(); if (state.failed) return ;

                }
                break;
            case 43 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:263: WITH
                {
                mWITH(); if (state.failed) return ;

                }
                break;
            case 44 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:268: ASSIGN_OP
                {
                mASSIGN_OP(); if (state.failed) return ;

                }
                break;
            case 45 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:278: LOGICAL_AND_OP
                {
                mLOGICAL_AND_OP(); if (state.failed) return ;

                }
                break;
            case 46 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:293: LOGICAL_NOT_OP
                {
                mLOGICAL_NOT_OP(); if (state.failed) return ;

                }
                break;
            case 47 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:308: EQUAL_OP
                {
                mEQUAL_OP(); if (state.failed) return ;

                }
                break;
            case 48 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:317: NOT_EQUAL_OP
                {
                mNOT_EQUAL_OP(); if (state.failed) return ;

                }
                break;
            case 49 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:330: PASCAL_NOT_EQUAL_OP
                {
                mPASCAL_NOT_EQUAL_OP(); if (state.failed) return ;

                }
                break;
            case 50 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:350: GREATER_OP
                {
                mGREATER_OP(); if (state.failed) return ;

                }
                break;
            case 51 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:361: GREATER_OR_EQUAL_OP
                {
                mGREATER_OR_EQUAL_OP(); if (state.failed) return ;

                }
                break;
            case 52 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:381: LESS_OP
                {
                mLESS_OP(); if (state.failed) return ;

                }
                break;
            case 53 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:389: LESS_OR_EQUAL_OP
                {
                mLESS_OR_EQUAL_OP(); if (state.failed) return ;

                }
                break;
            case 54 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:406: PLUS_OP
                {
                mPLUS_OP(); if (state.failed) return ;

                }
                break;
            case 55 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:414: MINUS_OP
                {
                mMINUS_OP(); if (state.failed) return ;

                }
                break;
            case 56 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:423: MULTIPLY_OP
                {
                mMULTIPLY_OP(); if (state.failed) return ;

                }
                break;
            case 57 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:435: DIVIDE_OP
                {
                mDIVIDE_OP(); if (state.failed) return ;

                }
                break;
            case 58 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:445: POINTER_OP
                {
                mPOINTER_OP(); if (state.failed) return ;

                }
                break;
            case 59 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:456: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 60 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:460: DOTDOT
                {
                mDOTDOT(); if (state.failed) return ;

                }
                break;
            case 61 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:467: T__115
                {
                mT__115(); if (state.failed) return ;

                }
                break;
            case 62 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:474: T__116
                {
                mT__116(); if (state.failed) return ;

                }
                break;
            case 63 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:481: T__117
                {
                mT__117(); if (state.failed) return ;

                }
                break;
            case 64 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:488: T__118
                {
                mT__118(); if (state.failed) return ;

                }
                break;
            case 65 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:495: T__119
                {
                mT__119(); if (state.failed) return ;

                }
                break;
            case 66 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:502: T__120
                {
                mT__120(); if (state.failed) return ;

                }
                break;
            case 67 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:509: T__121
                {
                mT__121(); if (state.failed) return ;

                }
                break;
            case 68 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:516: T__122
                {
                mT__122(); if (state.failed) return ;

                }
                break;
            case 69 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:523: T__123
                {
                mT__123(); if (state.failed) return ;

                }
                break;
            case 70 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:530: T__124
                {
                mT__124(); if (state.failed) return ;

                }
                break;
            case 71 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:537: T__125
                {
                mT__125(); if (state.failed) return ;

                }
                break;
            case 72 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:544: IDENT
                {
                mIDENT(); if (state.failed) return ;

                }
                break;
            case 73 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:550: INTEGER
                {
                mINTEGER(); if (state.failed) return ;

                }
                break;
            case 74 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:558: REAL
                {
                mREAL(); if (state.failed) return ;

                }
                break;
            case 75 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:563: STRING
                {
                mSTRING(); if (state.failed) return ;

                }
                break;
            case 76 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:570: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 77 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:1:578: WHITESPACE
                {
                mWHITESPACE(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_SSQSA_M2
    public final void synpred1_SSQSA_M2_fragment() throws RecognitionException {   
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:998:2: ( INTEGER DOTDOT )
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\m2\\SSQSA_M2.g:998:3: INTEGER DOTDOT
        {
        mINTEGER(); if (state.failed) return ;
        mDOTDOT(); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_SSQSA_M2

    public final boolean synpred1_SSQSA_M2() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_SSQSA_M2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA5_eotS =
        "\1\uffff\2\3\1\uffff\1\3\1\uffff\1\10\1\3\1\uffff";
    static final String DFA5_eofS =
        "\11\uffff";
    static final String DFA5_minS =
        "\3\60\1\uffff\1\60\1\uffff\2\60\1\uffff";
    static final String DFA5_maxS =
        "\1\71\2\110\1\uffff\1\110\1\uffff\2\110\1\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\uffff\1\3\2\uffff\1\2";
    static final String DFA5_specialS =
        "\11\uffff}>";
    static final String[] DFA5_transitionS = {
            "\10\1\2\2",
            "\10\4\2\7\7\uffff\1\5\2\6\3\5\1\uffff\1\5",
            "\12\7\7\uffff\6\5\1\uffff\1\5",
            "",
            "\10\4\2\7\7\uffff\1\5\2\6\3\5\1\uffff\1\5",
            "",
            "\12\5\7\uffff\6\5\1\uffff\1\5",
            "\12\7\7\uffff\6\5\1\uffff\1\5",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "987:1: INTEGER : ( DIGIT ( DIGIT )* | OCTAL_DIGIT ( OCTAL_DIGIT )* ( 'B' | 'C' ) | DIGIT ( HEX_DIGIT )* 'H' );";
        }
    }
    static final String DFA9_eotS =
        "\6\uffff\1\12\4\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\60\3\56\1\uffff\2\56\4\uffff";
    static final String DFA9_maxS =
        "\1\71\3\110\1\uffff\1\110\1\56\4\uffff";
    static final String DFA9_acceptS =
        "\4\uffff\1\1\2\uffff\3\1\1\2";
    static final String DFA9_specialS =
        "\1\uffff\1\2\1\0\1\4\1\uffff\1\1\1\3\4\uffff}>";
    static final String[] DFA9_transitionS = {
            "\10\1\2\2",
            "\1\6\1\uffff\10\3\2\5\7\uffff\1\7\2\4\3\7\1\uffff\1\10",
            "\1\6\1\uffff\12\5\7\uffff\6\7\1\uffff\1\10",
            "\1\6\1\uffff\10\3\2\5\7\uffff\1\7\2\4\3\7\1\uffff\1\10",
            "",
            "\1\6\1\uffff\12\5\7\uffff\6\7\1\uffff\1\10",
            "\1\11",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "996:1: REAL : ( ( INTEGER DOTDOT )=> INTEGER DOTDOT | DIGIT ( DIGIT )* '.' ( DIGIT )* ( SCALE_FACTOR )? );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_2>='0' && LA9_2<='9')) ) {s = 5;}

                        else if ( (LA9_2=='.') ) {s = 6;}

                        else if ( ((LA9_2>='A' && LA9_2<='F')) && (synpred1_SSQSA_M2())) {s = 7;}

                        else if ( (LA9_2=='H') && (synpred1_SSQSA_M2())) {s = 8;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_5=='H') && (synpred1_SSQSA_M2())) {s = 8;}

                        else if ( ((LA9_5>='0' && LA9_5<='9')) ) {s = 5;}

                        else if ( (LA9_5=='.') ) {s = 6;}

                        else if ( ((LA9_5>='A' && LA9_5<='F')) && (synpred1_SSQSA_M2())) {s = 7;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_1 = input.LA(1);

                         
                        int index9_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_1>='0' && LA9_1<='7')) ) {s = 3;}

                        else if ( ((LA9_1>='B' && LA9_1<='C')) && (synpred1_SSQSA_M2())) {s = 4;}

                        else if ( ((LA9_1>='8' && LA9_1<='9')) ) {s = 5;}

                        else if ( (LA9_1=='.') ) {s = 6;}

                        else if ( (LA9_1=='A'||(LA9_1>='D' && LA9_1<='F')) && (synpred1_SSQSA_M2())) {s = 7;}

                        else if ( (LA9_1=='H') && (synpred1_SSQSA_M2())) {s = 8;}

                         
                        input.seek(index9_1);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA9_6=='.') && (synpred1_SSQSA_M2())) {s = 9;}

                        else s = 10;

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA9_3>='B' && LA9_3<='C')) && (synpred1_SSQSA_M2())) {s = 4;}

                        else if ( ((LA9_3>='0' && LA9_3<='7')) ) {s = 3;}

                        else if ( (LA9_3=='H') && (synpred1_SSQSA_M2())) {s = 8;}

                        else if ( ((LA9_3>='8' && LA9_3<='9')) ) {s = 5;}

                        else if ( (LA9_3=='.') ) {s = 6;}

                        else if ( (LA9_3=='A'||(LA9_3>='D' && LA9_3<='F')) && (synpred1_SSQSA_M2())) {s = 7;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\1\uffff\23\52\1\122\4\uffff\1\125\1\127\5\uffff\1\131\1\133\11"+
        "\uffff\2\134\2\uffff\3\52\1\146\4\52\1\154\5\52\1\163\1\52\1\166"+
        "\3\52\1\172\1\173\6\52\1\u0084\5\52\14\uffff\3\134\1\uffff\1\134"+
        "\1\uffff\1\u008a\2\52\1\uffff\2\52\1\u008f\1\52\1\u0091\1\uffff"+
        "\1\52\1\u0094\2\52\1\u0099\1\52\1\uffff\1\52\1\u009d\1\uffff\1\52"+
        "\1\u00a0\1\u00a1\2\uffff\6\52\1\u00a8\1\52\1\uffff\2\52\1\u00ac"+
        "\2\52\1\uffff\2\52\1\u00b1\1\52\1\uffff\1\52\1\uffff\1\u00b4\1\52"+
        "\1\uffff\1\u00b6\3\52\1\uffff\1\u00ba\2\52\1\uffff\1\u00bd\1\52"+
        "\2\uffff\6\52\1\uffff\1\u00c5\1\u00c6\1\52\1\uffff\1\52\1\u00c9"+
        "\1\u00ca\1\u00cb\1\uffff\1\u00cc\1\52\1\uffff\1\u00ce\1\uffff\3"+
        "\52\1\uffff\2\52\1\uffff\7\52\2\uffff\1\u00db\1\u00dc\4\uffff\1"+
        "\52\1\uffff\1\u00de\3\52\1\u00e2\1\u00e3\3\52\1\u00e7\1\u00e8\1"+
        "\u00e9\2\uffff\1\52\1\uffff\1\u00eb\1\u00ec\1\52\2\uffff\1\u00ee"+
        "\2\52\3\uffff\1\52\2\uffff\1\52\1\uffff\4\52\1\u00f7\1\u00f8\1\u00f9"+
        "\1\52\3\uffff\3\52\1\u00fe\1\uffff";
    static final String DFA17_eofS =
        "\u00ff\uffff";
    static final String DFA17_minS =
        "\1\11\1\116\1\105\1\101\1\105\1\114\1\117\1\106\3\117\1\106\1\117"+
        "\1\125\2\105\1\110\1\116\1\101\1\110\1\75\4\uffff\2\75\5\uffff\1"+
        "\56\1\52\11\uffff\2\56\2\uffff\1\104\1\122\1\107\1\60\1\123\1\116"+
        "\1\103\1\126\1\60\1\123\1\104\1\111\1\122\1\117\1\60\1\120\1\60"+
        "\1\117\1\104\1\124\2\60\1\111\1\117\1\101\1\103\1\124\1\105\1\60"+
        "\1\120\1\124\1\122\1\111\1\124\14\uffff\3\56\1\uffff\1\56\2\60\1"+
        "\101\1\111\1\uffff\1\105\1\123\1\60\1\111\1\60\1\uffff\1\105\1\60"+
        "\1\124\1\117\1\60\1\115\1\uffff\1\114\1\60\1\uffff\1\120\2\60\2"+
        "\uffff\1\116\1\103\1\114\1\117\1\105\1\125\1\60\1\116\1\uffff\1"+
        "\105\1\111\1\60\1\114\1\110\1\uffff\1\131\1\116\1\60\1\124\1\uffff"+
        "\1\116\1\uffff\1\60\1\106\1\uffff\1\60\1\122\1\101\1\111\1\uffff"+
        "\1\60\1\105\1\122\1\uffff\1\60\1\114\2\uffff\1\124\1\105\1\111\1"+
        "\122\1\101\1\122\1\uffff\2\60\1\114\1\uffff\1\105\3\60\1\uffff\1"+
        "\60\1\111\1\uffff\1\60\1\uffff\1\124\1\122\1\107\1\uffff\1\115\1"+
        "\124\1\uffff\2\105\1\104\1\106\1\104\1\124\1\116\2\uffff\2\60\4"+
        "\uffff\1\124\1\uffff\1\60\1\104\1\116\1\105\2\60\1\122\1\125\1\111"+
        "\3\60\2\uffff\1\111\1\uffff\2\60\1\116\2\uffff\1\60\1\122\1\105"+
        "\3\uffff\1\117\2\uffff\1\124\1\uffff\1\105\1\104\1\116\1\101\3\60"+
        "\1\124\3\uffff\1\111\1\117\1\116\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\176\1\122\1\131\2\117\1\130\1\122\1\116\3\117\2\122\1\125\2"+
        "\105\1\131\1\116\1\101\1\111\1\75\4\uffff\1\76\1\75\5\uffff\1\56"+
        "\1\52\11\uffff\2\110\2\uffff\1\104\1\122\1\107\1\172\1\123\1\116"+
        "\1\106\1\126\1\172\1\123\1\104\1\120\1\122\1\117\1\172\1\120\1\172"+
        "\1\117\1\104\1\124\2\172\1\111\1\117\1\101\2\124\1\105\1\172\1\120"+
        "\1\124\1\122\1\111\1\124\14\uffff\2\110\1\56\1\uffff\2\110\1\172"+
        "\1\101\1\111\1\uffff\1\105\1\123\1\172\1\111\1\172\1\uffff\1\111"+
        "\1\172\1\124\1\117\1\172\1\115\1\uffff\1\117\1\172\1\uffff\1\120"+
        "\2\172\2\uffff\1\116\1\103\1\114\1\117\1\105\1\125\1\172\1\116\1"+
        "\uffff\1\105\1\111\1\172\1\114\1\110\1\uffff\1\131\1\116\1\172\1"+
        "\124\1\uffff\1\116\1\uffff\1\172\1\106\1\uffff\1\172\1\122\1\101"+
        "\1\111\1\uffff\1\172\1\105\1\122\1\uffff\1\172\1\114\2\uffff\1\124"+
        "\1\105\1\111\1\122\1\101\1\122\1\uffff\2\172\1\114\1\uffff\1\105"+
        "\3\172\1\uffff\1\172\1\111\1\uffff\1\172\1\uffff\1\124\1\122\1\107"+
        "\1\uffff\1\115\1\124\1\uffff\2\105\1\104\1\106\1\104\1\124\1\116"+
        "\2\uffff\2\172\4\uffff\1\124\1\uffff\1\172\1\104\1\116\1\105\2\172"+
        "\1\122\1\125\1\111\3\172\2\uffff\1\111\1\uffff\2\172\1\116\2\uffff"+
        "\1\172\1\122\1\105\3\uffff\1\117\2\uffff\1\124\1\uffff\1\105\1\104"+
        "\1\116\1\101\3\172\1\124\3\uffff\1\111\1\117\1\116\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\25\uffff\1\55\1\56\1\57\1\60\2\uffff\1\66\1\67\1\70\1\71\1\72"+
        "\2\uffff\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\106\1\110\2\uffff"+
        "\1\113\1\115\42\uffff\1\54\1\105\1\61\1\65\1\64\1\63\1\62\1\74\1"+
        "\73\1\114\1\75\1\111\3\uffff\1\112\5\uffff\1\4\5\uffff\1\12\6\uffff"+
        "\1\23\2\uffff\1\27\3\uffff\1\34\1\35\10\uffff\1\46\5\uffff\1\1\4"+
        "\uffff\1\7\1\uffff\1\11\2\uffff\1\15\4\uffff\1\20\3\uffff\1\26\2"+
        "\uffff\1\31\1\33\6\uffff\1\44\3\uffff\1\51\4\uffff\1\5\2\uffff\1"+
        "\13\1\uffff\1\16\3\uffff\1\22\2\uffff\1\30\7\uffff\1\45\1\47\2\uffff"+
        "\1\53\1\2\1\3\1\6\1\uffff\1\14\14\uffff\1\50\1\52\1\uffff\1\17\3"+
        "\uffff\1\25\1\32\3\uffff\1\41\1\42\1\43\1\uffff\1\21\1\107\1\uffff"+
        "\1\36\10\uffff\1\37\1\40\1\10\4\uffff\1\24";
    static final String DFA17_specialS =
        "\u00ff\uffff}>";
    static final String[] DFA17_transitionS = {
            "\2\56\1\uffff\2\56\22\uffff\1\56\1\uffff\1\55\1\30\2\uffff"+
            "\1\25\1\55\1\41\1\42\1\35\1\33\1\44\1\34\1\40\1\36\10\53\2\54"+
            "\1\24\1\50\1\31\1\27\1\32\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2"+
            "\52\1\7\2\52\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1"+
            "\21\1\22\1\23\3\52\1\46\1\uffff\1\47\1\37\2\uffff\32\52\1\43"+
            "\1\51\1\45\1\26",
            "\1\57\3\uffff\1\60",
            "\1\61\23\uffff\1\62",
            "\1\63\15\uffff\1\64",
            "\1\65\3\uffff\1\66\5\uffff\1\67",
            "\1\70\1\uffff\1\71\11\uffff\1\72",
            "\1\73\2\uffff\1\74",
            "\1\75\6\uffff\1\76\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103\13\uffff\1\104",
            "\1\105\2\uffff\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\6\uffff\1\113\11\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117\1\120",
            "\1\121",
            "",
            "",
            "",
            "",
            "\1\124\1\123",
            "\1\126",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\132",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\140\1\uffff\10\135\2\141\7\uffff\1\142\2\136\3\142\1\uffff"+
            "\1\137",
            "\1\140\1\uffff\12\141\7\uffff\6\142\1\uffff\1\137",
            "",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\147",
            "\1\150",
            "\1\151\2\uffff\1\152",
            "\1\153",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\155",
            "\1\156",
            "\1\157\6\uffff\1\160",
            "\1\161",
            "\1\162",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\164",
            "\12\52\7\uffff\2\52\1\165\27\52\4\uffff\1\52\1\uffff\32\52",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\14\uffff\1\u0080\3\uffff\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
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
            "\1\140\1\uffff\10\135\2\141\7\uffff\1\142\2\136\3\142\1\uffff"+
            "\1\137",
            "\1\140\1\uffff\12\142\7\uffff\6\142\1\uffff\1\137",
            "\1\140",
            "",
            "\1\140\1\uffff\12\141\7\uffff\6\142\1\uffff\1\137",
            "\12\142\7\uffff\6\142\1\uffff\1\137",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0090",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0092\3\uffff\1\u0093",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0095",
            "\1\u0096",
            "\12\52\7\uffff\4\52\1\u0098\21\52\1\u0097\3\52\4\uffff\1\52"+
            "\1\uffff\32\52",
            "\1\u009a",
            "",
            "\1\u009b\2\uffff\1\u009c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u009e",
            "\12\52\7\uffff\24\52\1\u009f\5\52\4\uffff\1\52\1\uffff\32"+
            "\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b5",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00be",
            "",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cd",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\u00dd",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00ea",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ed",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ef",
            "\1\u00f0",
            "",
            "",
            "",
            "\1\u00f1",
            "",
            "",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fa",
            "",
            "",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( LOGICAL_AND | ARRAY | BEGIN | BY | CASE | CONST_ | DEC | DEFINITION | DIV | DO | ELSE | ELSIF | END | EXIT | EXPORT | FOR | FORWARD | FROM | IF | IMPLEMENTATION | IMPORT | INC | IN | LOOP | MOD | MODULE | NOT | OF | LOGICAL_OR | POINTER | PROCEDURE | QUALIFIED | RECORD | REPEAT | RETURN | SET | THEN | TO | TYPE | UNTIL | VAR | WHILE | WITH | ASSIGN_OP | LOGICAL_AND_OP | LOGICAL_NOT_OP | EQUAL_OP | NOT_EQUAL_OP | PASCAL_NOT_EQUAL_OP | GREATER_OP | GREATER_OR_EQUAL_OP | LESS_OP | LESS_OR_EQUAL_OP | PLUS_OP | MINUS_OP | MULTIPLY_OP | DIVIDE_OP | POINTER_OP | DOT | DOTDOT | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | IDENT | INTEGER | REAL | STRING | COMMENT | WHITESPACE );";
        }
    }
 

}