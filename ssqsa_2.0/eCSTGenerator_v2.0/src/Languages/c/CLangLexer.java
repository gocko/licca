// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g 2017-03-03 17:26:15

	package Languages.c;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CLangLexer extends Lexer {
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int T__259=259;
    public static final int T__258=258;
    public static final int LETTER=49;
    public static final int T__257=257;
    public static final int CONST=35;
    public static final int T__262=262;
    public static final int T__160=160;
    public static final int T__263=263;
    public static final int T__260=260;
    public static final int T__261=261;
    public static final int CONDITION=27;
    public static final int T__266=266;
    public static final int SEPARATOR=37;
    public static final int T__267=267;
    public static final int T__264=264;
    public static final int T__265=265;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int TYPE=19;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int STRING_LITERAL=47;
    public static final int T__148=148;
    public static final int LOGICAL_OPERATOR=34;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int T__247=247;
    public static final int T__246=246;
    public static final int T__249=249;
    public static final int T__248=248;
    public static final int COMPILATION_UNIT=25;
    public static final int T__250=250;
    public static final int T__251=251;
    public static final int T__252=252;
    public static final int T__253=253;
    public static final int T__254=254;
    public static final int T__255=255;
    public static final int T__256=256;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int KEYWORD=36;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int BUILTIN_TYPE=40;
    public static final int IntegerTypeSuffix=50;
    public static final int T__279=279;
    public static final int CHARACTER_LITERAL=46;
    public static final int VALUE=41;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int ATTRIBUTE_DECL=13;
    public static final int T__127=127;
    public static final int WS=57;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__269=269;
    public static final int T__268=268;
    public static final int T__275=275;
    public static final int T__276=276;
    public static final int T__277=277;
    public static final int T__278=278;
    public static final int FUNCTION_DECL=8;
    public static final int T__271=271;
    public static final int T__272=272;
    public static final int T__273=273;
    public static final int T__274=274;
    public static final int T__76=76;
    public static final int FUNCTION_CALL=16;
    public static final int T__75=75;
    public static final int INIT=32;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int DECIMAL_LITERAL=45;
    public static final int T__270=270;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int ACCESS_DECL=6;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
    public static final int T__219=219;
    public static final int T__217=217;
    public static final int T__218=218;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int STEP=33;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int CLASS_FIELDS=22;
    public static final int HexDigit=52;
    public static final int STATIC_ARRAY_CREATOR=15;
    public static final int T__223=223;
    public static final int T__222=222;
    public static final int T__221=221;
    public static final int T__220=220;
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int PARAMETER_DECL=10;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int ARGUMENT=18;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
    public static final int T__239=239;
    public static final int T__237=237;
    public static final int T__238=238;
    public static final int COMPARISON_OPERATOR=39;
    public static final int T__235=235;
    public static final int T__236=236;
    public static final int JUMP_STATEMENT=30;
    public static final int ASSIGN_OPERATOR=24;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int T__245=245;
    public static final int PACKAGE_DECL=4;
    public static final int T__244=244;
    public static final int T__243=243;
    public static final int T__242=242;
    public static final int T__241=241;
    public static final int T__240=240;
    public static final int T__228=228;
    public static final int T__229=229;
    public static final int T__224=224;
    public static final int T__225=225;
    public static final int T__226=226;
    public static final int T__227=227;
    public static final int BRANCH=29;
    public static final int MAIN_BLOCK=26;
    public static final int T__232=232;
    public static final int T__231=231;
    public static final int T__234=234;
    public static final int T__233=233;
    public static final int OctalEscape=55;
    public static final int T__230=230;
    public static final int FloatTypeSuffix=54;
    public static final int ASSIGNMENT_STATEMENT=23;
    public static final int CONCRETE_UNIT_DECL=5;
    public static final int VAR_DECL=14;
    public static final int LOOP_STATEMENT=31;
    public static final int NAME=20;
    public static final int FLOATING_POINT_LITERAL=48;
    public static final int COMMENT=58;
    public static final int LINE_COMMENT=59;
    public static final int BLOCK_SCOPE=11;
    public static final int INTERFACE_UNIT_DECL=7;
    public static final int BRANCH_STATEMENT=28;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int LINE_COMMAND=60;
    public static final int EscapeSequence=51;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int Exponent=53;
    public static final int T__61=61;
    public static final int T__199=199;
    public static final int T__198=198;
    public static final int T__197=197;
    public static final int T__196=196;
    public static final int T__195=195;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int IDENTIFIER=42;
    public static final int ARGUMENT_LIST=17;
    public static final int HEX_LITERAL=43;
    public static final int FORMAL_PARAM_LIST=9;
    public static final int T__184=184;
    public static final int T__183=183;
    public static final int T__186=186;
    public static final int T__185=185;
    public static final int T__188=188;
    public static final int T__187=187;
    public static final int T__189=189;
    public static final int OPERATOR=38;
    public static final int T__180=180;
    public static final int IMPORT_DECL=12;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int OCTAL_LITERAL=44;
    public static final int T__175=175;
    public static final int T__174=174;
    public static final int T__173=173;
    public static final int T__172=172;
    public static final int T__179=179;
    public static final int T__178=178;
    public static final int T__177=177;
    public static final int T__176=176;
    public static final int UnicodeEscape=56;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int T__169=169;
    public static final int EXTENDS=21;

    // delegates
    // delegators

    public CLangLexer() {;} 
    public CLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g"; }

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:7:7: ( 'typedef' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:7:9: 'typedef'
            {
            match("typedef"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:8:7: ( '=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:8:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:9:7: ( ',' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:10:7: ( ':' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:10:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:11:7: ( ';' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:11:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:12:7: ( '(' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:13:7: ( ')' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:14:7: ( '[' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:14:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:15:7: ( ']' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:15:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:16:7: ( '{' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:17:7: ( '}' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:18:7: ( 'extern' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:18:9: 'extern'
            {
            match("extern"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:19:7: ( 'static' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:19:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:20:7: ( 'auto' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:20:9: 'auto'
            {
            match("auto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:21:7: ( 'register' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:21:9: 'register'
            {
            match("register"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:22:7: ( 'void' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:22:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:23:7: ( 'char' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:23:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:24:7: ( 'short' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:24:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:25:7: ( 'int' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:25:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:26:7: ( 'long' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:26:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:27:7: ( 'float' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:27:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:28:7: ( 'double' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:28:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:29:7: ( 'signed' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:29:9: 'signed'
            {
            match("signed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:30:7: ( 'unsigned' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:30:9: 'unsigned'
            {
            match("unsigned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:31:7: ( 'uint8_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:31:9: 'uint8_t'
            {
            match("uint8_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:32:7: ( 'int8_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:32:9: 'int8_t'
            {
            match("int8_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:33:7: ( 'uint16_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:33:9: 'uint16_t'
            {
            match("uint16_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:34:7: ( 'int16_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:34:9: 'int16_t'
            {
            match("int16_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:35:7: ( 'uint32_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:35:9: 'uint32_t'
            {
            match("uint32_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:36:7: ( 'int32_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:36:9: 'int32_t'
            {
            match("int32_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:37:7: ( 'uint64_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:37:9: 'uint64_t'
            {
            match("uint64_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:38:7: ( 'int64_t' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:38:9: 'int64_t'
            {
            match("int64_t"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:39:7: ( '__builtin_va_list' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:39:9: '__builtin_va_list'
            {
            match("__builtin_va_list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:40:7: ( 'struct' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:40:9: 'struct'
            {
            match("struct"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:41:7: ( 'union' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:41:9: 'union'
            {
            match("union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:42:7: ( 'enum' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:42:9: 'enum'
            {
            match("enum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:43:7: ( 'const' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:43:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:44:7: ( 'volatile' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:44:9: 'volatile'
            {
            match("volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:45:7: ( 'noreturn' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:45:9: 'noreturn'
            {
            match("noreturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:46:8: ( 'inline' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:46:10: 'inline'
            {
            match("inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:47:8: ( '*' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:47:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:48:8: ( '...' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:48:10: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:49:8: ( '+' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:49:10: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:50:8: ( '-' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:50:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:51:8: ( '/' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:51:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:52:8: ( '%' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:52:10: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:53:8: ( '++' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:53:10: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:54:8: ( '--' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:54:10: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:55:8: ( 'sizeof' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:55:10: 'sizeof'
            {
            match("sizeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:56:8: ( '.' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:56:10: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:57:8: ( '->' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:57:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:58:8: ( '&' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:58:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:59:8: ( '~' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:59:10: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:60:8: ( '!' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:60:10: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:61:8: ( '*=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:61:10: '*='
            {
            match("*="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:62:8: ( '/=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:62:10: '/='
            {
            match("/="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:63:8: ( '%=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:63:10: '%='
            {
            match("%="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:64:8: ( '+=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:64:10: '+='
            {
            match("+="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:65:8: ( '-=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:65:10: '-='
            {
            match("-="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:66:8: ( '<<=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:66:10: '<<='
            {
            match("<<="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:67:8: ( '>>=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:67:10: '>>='
            {
            match(">>="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:68:8: ( '&=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:68:10: '&='
            {
            match("&="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:69:8: ( '^=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:69:10: '^='
            {
            match("^="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:70:8: ( '|=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:70:10: '|='
            {
            match("|="); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:71:8: ( '?' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:71:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__125"

    // $ANTLR start "T__126"
    public final void mT__126() throws RecognitionException {
        try {
            int _type = T__126;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:72:8: ( '||' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:72:10: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__126"

    // $ANTLR start "T__127"
    public final void mT__127() throws RecognitionException {
        try {
            int _type = T__127;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:73:8: ( '&&' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:73:10: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__127"

    // $ANTLR start "T__128"
    public final void mT__128() throws RecognitionException {
        try {
            int _type = T__128;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:74:8: ( '|' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:74:10: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__128"

    // $ANTLR start "T__129"
    public final void mT__129() throws RecognitionException {
        try {
            int _type = T__129;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:75:8: ( '^' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:75:10: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__129"

    // $ANTLR start "T__130"
    public final void mT__130() throws RecognitionException {
        try {
            int _type = T__130;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:76:8: ( '==' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:76:10: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__130"

    // $ANTLR start "T__131"
    public final void mT__131() throws RecognitionException {
        try {
            int _type = T__131;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:77:8: ( '!=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:77:10: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__131"

    // $ANTLR start "T__132"
    public final void mT__132() throws RecognitionException {
        try {
            int _type = T__132;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:78:8: ( '<' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:78:10: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__132"

    // $ANTLR start "T__133"
    public final void mT__133() throws RecognitionException {
        try {
            int _type = T__133;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:79:8: ( '>' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:79:10: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__133"

    // $ANTLR start "T__134"
    public final void mT__134() throws RecognitionException {
        try {
            int _type = T__134;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:80:8: ( '<=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:80:10: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__134"

    // $ANTLR start "T__135"
    public final void mT__135() throws RecognitionException {
        try {
            int _type = T__135;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:81:8: ( '>=' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:81:10: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__135"

    // $ANTLR start "T__136"
    public final void mT__136() throws RecognitionException {
        try {
            int _type = T__136;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:82:8: ( '<<' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:82:10: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__136"

    // $ANTLR start "T__137"
    public final void mT__137() throws RecognitionException {
        try {
            int _type = T__137;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:83:8: ( '>>' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:83:10: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__137"

    // $ANTLR start "T__138"
    public final void mT__138() throws RecognitionException {
        try {
            int _type = T__138;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:84:8: ( '__asm__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:84:10: '__asm__'
            {
            match("__asm__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__138"

    // $ANTLR start "T__139"
    public final void mT__139() throws RecognitionException {
        try {
            int _type = T__139;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:85:8: ( 'asm' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:85:10: 'asm'
            {
            match("asm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__139"

    // $ANTLR start "T__140"
    public final void mT__140() throws RecognitionException {
        try {
            int _type = T__140;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:86:8: ( 'asm__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:86:10: 'asm__'
            {
            match("asm__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__140"

    // $ANTLR start "T__141"
    public final void mT__141() throws RecognitionException {
        try {
            int _type = T__141;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:87:8: ( '__asm' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:87:10: '__asm'
            {
            match("__asm"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__141"

    // $ANTLR start "T__142"
    public final void mT__142() throws RecognitionException {
        try {
            int _type = T__142;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:88:8: ( '__const' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:88:10: '__const'
            {
            match("__const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__142"

    // $ANTLR start "T__143"
    public final void mT__143() throws RecognitionException {
        try {
            int _type = T__143;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:89:8: ( '__const__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:89:10: '__const__'
            {
            match("__const__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__143"

    // $ANTLR start "T__144"
    public final void mT__144() throws RecognitionException {
        try {
            int _type = T__144;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:90:8: ( 'const__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:90:10: 'const__'
            {
            match("const__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__144"

    // $ANTLR start "T__145"
    public final void mT__145() throws RecognitionException {
        try {
            int _type = T__145;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:91:8: ( '__volatile__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:91:10: '__volatile__'
            {
            match("__volatile__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__145"

    // $ANTLR start "T__146"
    public final void mT__146() throws RecognitionException {
        try {
            int _type = T__146;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:92:8: ( '__volatile' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:92:10: '__volatile'
            {
            match("__volatile"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__146"

    // $ANTLR start "T__147"
    public final void mT__147() throws RecognitionException {
        try {
            int _type = T__147;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:93:8: ( 'volatile__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:93:10: 'volatile__'
            {
            match("volatile__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__147"

    // $ANTLR start "T__148"
    public final void mT__148() throws RecognitionException {
        try {
            int _type = T__148;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:94:8: ( 'case' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:94:10: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__148"

    // $ANTLR start "T__149"
    public final void mT__149() throws RecognitionException {
        try {
            int _type = T__149;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:95:8: ( 'default' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:95:10: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__149"

    // $ANTLR start "T__150"
    public final void mT__150() throws RecognitionException {
        try {
            int _type = T__150;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:96:8: ( 'if' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:96:10: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__150"

    // $ANTLR start "T__151"
    public final void mT__151() throws RecognitionException {
        try {
            int _type = T__151;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:97:8: ( 'else' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:97:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__151"

    // $ANTLR start "T__152"
    public final void mT__152() throws RecognitionException {
        try {
            int _type = T__152;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:98:8: ( 'switch' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:98:10: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__152"

    // $ANTLR start "T__153"
    public final void mT__153() throws RecognitionException {
        try {
            int _type = T__153;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:99:8: ( 'while' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:99:10: 'while'
            {
            match("while"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:100:8: ( 'do' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:100:10: 'do'
            {
            match("do"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:101:8: ( 'for' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:101:10: 'for'
            {
            match("for"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:102:8: ( 'goto' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:102:10: 'goto'
            {
            match("goto"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:103:8: ( 'continue' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:103:10: 'continue'
            {
            match("continue"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:104:8: ( 'break' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:104:10: 'break'
            {
            match("break"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:105:8: ( 'return' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:105:10: 'return'
            {
            match("return"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:106:8: ( '__attribute__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:106:10: '__attribute__'
            {
            match("__attribute__"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:107:8: ( 'alias' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:107:10: 'alias'
            {
            match("alias"); 


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
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:108:8: ( '__alias__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:108:10: '__alias__'
            {
            match("__alias__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__162"

    // $ANTLR start "T__163"
    public final void mT__163() throws RecognitionException {
        try {
            int _type = T__163;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:109:8: ( '__alias' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:109:10: '__alias'
            {
            match("__alias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__163"

    // $ANTLR start "T__164"
    public final void mT__164() throws RecognitionException {
        try {
            int _type = T__164;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:110:8: ( 'alias__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:110:10: 'alias__'
            {
            match("alias__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__164"

    // $ANTLR start "T__165"
    public final void mT__165() throws RecognitionException {
        try {
            int _type = T__165;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:111:8: ( '__aligned__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:111:10: '__aligned__'
            {
            match("__aligned__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__165"

    // $ANTLR start "T__166"
    public final void mT__166() throws RecognitionException {
        try {
            int _type = T__166;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:112:8: ( '__aligned' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:112:10: '__aligned'
            {
            match("__aligned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__166"

    // $ANTLR start "T__167"
    public final void mT__167() throws RecognitionException {
        try {
            int _type = T__167;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:113:8: ( 'aligned__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:113:10: 'aligned__'
            {
            match("aligned__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__167"

    // $ANTLR start "T__168"
    public final void mT__168() throws RecognitionException {
        try {
            int _type = T__168;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:114:8: ( 'aligned' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:114:10: 'aligned'
            {
            match("aligned"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__168"

    // $ANTLR start "T__169"
    public final void mT__169() throws RecognitionException {
        try {
            int _type = T__169;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:115:8: ( '__always_inline__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:115:10: '__always_inline__'
            {
            match("__always_inline__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__169"

    // $ANTLR start "T__170"
    public final void mT__170() throws RecognitionException {
        try {
            int _type = T__170;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:116:8: ( '__always_inline' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:116:10: '__always_inline'
            {
            match("__always_inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__170"

    // $ANTLR start "T__171"
    public final void mT__171() throws RecognitionException {
        try {
            int _type = T__171;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:117:8: ( 'always_inline__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:117:10: 'always_inline__'
            {
            match("always_inline__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__171"

    // $ANTLR start "T__172"
    public final void mT__172() throws RecognitionException {
        try {
            int _type = T__172;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:118:8: ( 'always_inline' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:118:10: 'always_inline'
            {
            match("always_inline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__172"

    // $ANTLR start "T__173"
    public final void mT__173() throws RecognitionException {
        try {
            int _type = T__173;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:119:8: ( 'cdecl' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:119:10: 'cdecl'
            {
            match("cdecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__173"

    // $ANTLR start "T__174"
    public final void mT__174() throws RecognitionException {
        try {
            int _type = T__174;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:120:8: ( '__cdecl__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:120:10: '__cdecl__'
            {
            match("__cdecl__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__174"

    // $ANTLR start "T__175"
    public final void mT__175() throws RecognitionException {
        try {
            int _type = T__175;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:121:8: ( '__cdecl' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:121:10: '__cdecl'
            {
            match("__cdecl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__175"

    // $ANTLR start "T__176"
    public final void mT__176() throws RecognitionException {
        try {
            int _type = T__176;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:122:8: ( 'cdecl__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:122:10: 'cdecl__'
            {
            match("cdecl__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__176"

    // $ANTLR start "T__177"
    public final void mT__177() throws RecognitionException {
        try {
            int _type = T__177;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:123:8: ( '__cleanup__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:123:10: '__cleanup__'
            {
            match("__cleanup__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__177"

    // $ANTLR start "T__178"
    public final void mT__178() throws RecognitionException {
        try {
            int _type = T__178;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:124:8: ( '__cleanup' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:124:10: '__cleanup'
            {
            match("__cleanup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__178"

    // $ANTLR start "T__179"
    public final void mT__179() throws RecognitionException {
        try {
            int _type = T__179;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:125:8: ( 'cleanup__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:125:10: 'cleanup__'
            {
            match("cleanup__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__179"

    // $ANTLR start "T__180"
    public final void mT__180() throws RecognitionException {
        try {
            int _type = T__180;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:126:8: ( 'cleanup' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:126:10: 'cleanup'
            {
            match("cleanup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__180"

    // $ANTLR start "T__181"
    public final void mT__181() throws RecognitionException {
        try {
            int _type = T__181;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:127:8: ( '__constructor__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:127:10: '__constructor__'
            {
            match("__constructor__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__181"

    // $ANTLR start "T__182"
    public final void mT__182() throws RecognitionException {
        try {
            int _type = T__182;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:128:8: ( '__constructor' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:128:10: '__constructor'
            {
            match("__constructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__182"

    // $ANTLR start "T__183"
    public final void mT__183() throws RecognitionException {
        try {
            int _type = T__183;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:129:8: ( 'constructor__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:129:10: 'constructor__'
            {
            match("constructor__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__183"

    // $ANTLR start "T__184"
    public final void mT__184() throws RecognitionException {
        try {
            int _type = T__184;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:130:8: ( 'constructor' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:130:10: 'constructor'
            {
            match("constructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__184"

    // $ANTLR start "T__185"
    public final void mT__185() throws RecognitionException {
        try {
            int _type = T__185;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:131:8: ( '__deprecated__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:131:10: '__deprecated__'
            {
            match("__deprecated__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__185"

    // $ANTLR start "T__186"
    public final void mT__186() throws RecognitionException {
        try {
            int _type = T__186;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:132:8: ( '__deprecated' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:132:10: '__deprecated'
            {
            match("__deprecated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__186"

    // $ANTLR start "T__187"
    public final void mT__187() throws RecognitionException {
        try {
            int _type = T__187;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:133:8: ( 'deprecated__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:133:10: 'deprecated__'
            {
            match("deprecated__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__187"

    // $ANTLR start "T__188"
    public final void mT__188() throws RecognitionException {
        try {
            int _type = T__188;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:134:8: ( 'deprecated' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:134:10: 'deprecated'
            {
            match("deprecated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__188"

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:135:8: ( '__destructor__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:135:10: '__destructor__'
            {
            match("__destructor__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:136:8: ( '__destructor' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:136:10: '__destructor'
            {
            match("__destructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:137:8: ( 'destructor__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:137:10: 'destructor__'
            {
            match("destructor__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:138:8: ( 'destructor' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:138:10: 'destructor'
            {
            match("destructor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "T__193"
    public final void mT__193() throws RecognitionException {
        try {
            int _type = T__193;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:139:8: ( '__dllexport__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:139:10: '__dllexport__'
            {
            match("__dllexport__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__193"

    // $ANTLR start "T__194"
    public final void mT__194() throws RecognitionException {
        try {
            int _type = T__194;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:140:8: ( '__dllexport' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:140:10: '__dllexport'
            {
            match("__dllexport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__194"

    // $ANTLR start "T__195"
    public final void mT__195() throws RecognitionException {
        try {
            int _type = T__195;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:141:8: ( 'dllexport__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:141:10: 'dllexport__'
            {
            match("dllexport__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__195"

    // $ANTLR start "T__196"
    public final void mT__196() throws RecognitionException {
        try {
            int _type = T__196;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:142:8: ( 'dllexport' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:142:10: 'dllexport'
            {
            match("dllexport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__196"

    // $ANTLR start "T__197"
    public final void mT__197() throws RecognitionException {
        try {
            int _type = T__197;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:143:8: ( '__dllimport__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:143:10: '__dllimport__'
            {
            match("__dllimport__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__197"

    // $ANTLR start "T__198"
    public final void mT__198() throws RecognitionException {
        try {
            int _type = T__198;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:144:8: ( '__dllimport' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:144:10: '__dllimport'
            {
            match("__dllimport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__198"

    // $ANTLR start "T__199"
    public final void mT__199() throws RecognitionException {
        try {
            int _type = T__199;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:145:8: ( 'dllimport__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:145:10: 'dllimport__'
            {
            match("dllimport__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__199"

    // $ANTLR start "T__200"
    public final void mT__200() throws RecognitionException {
        try {
            int _type = T__200;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:146:8: ( 'dllimport' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:146:10: 'dllimport'
            {
            match("dllimport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__200"

    // $ANTLR start "T__201"
    public final void mT__201() throws RecognitionException {
        try {
            int _type = T__201;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:147:8: ( '__eightbit__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:147:10: '__eightbit__'
            {
            match("__eightbit__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__201"

    // $ANTLR start "T__202"
    public final void mT__202() throws RecognitionException {
        try {
            int _type = T__202;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:148:8: ( '__eightbit' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:148:10: '__eightbit'
            {
            match("__eightbit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__202"

    // $ANTLR start "T__203"
    public final void mT__203() throws RecognitionException {
        try {
            int _type = T__203;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:149:8: ( 'eightbit__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:149:10: 'eightbit__'
            {
            match("eightbit__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__203"

    // $ANTLR start "T__204"
    public final void mT__204() throws RecognitionException {
        try {
            int _type = T__204;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:150:8: ( 'eightbit' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:150:10: 'eightbit'
            {
            match("eightbit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__204"

    // $ANTLR start "T__205"
    public final void mT__205() throws RecognitionException {
        try {
            int _type = T__205;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:151:8: ( '__format__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:151:10: '__format__'
            {
            match("__format__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__205"

    // $ANTLR start "T__206"
    public final void mT__206() throws RecognitionException {
        try {
            int _type = T__206;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:152:8: ( '__format' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:152:10: '__format'
            {
            match("__format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__206"

    // $ANTLR start "T__207"
    public final void mT__207() throws RecognitionException {
        try {
            int _type = T__207;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:153:8: ( 'format__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:153:10: 'format__'
            {
            match("format__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__207"

    // $ANTLR start "T__208"
    public final void mT__208() throws RecognitionException {
        try {
            int _type = T__208;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:154:8: ( 'format' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:154:10: 'format'
            {
            match("format"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__208"

    // $ANTLR start "T__209"
    public final void mT__209() throws RecognitionException {
        try {
            int _type = T__209;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:155:8: ( 'printf' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:155:10: 'printf'
            {
            match("printf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__209"

    // $ANTLR start "T__210"
    public final void mT__210() throws RecognitionException {
        try {
            int _type = T__210;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:156:8: ( '__printf__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:156:10: '__printf__'
            {
            match("__printf__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__210"

    // $ANTLR start "T__211"
    public final void mT__211() throws RecognitionException {
        try {
            int _type = T__211;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:157:8: ( '__printf' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:157:10: '__printf'
            {
            match("__printf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__211"

    // $ANTLR start "T__212"
    public final void mT__212() throws RecognitionException {
        try {
            int _type = T__212;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:158:8: ( 'printf__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:158:10: 'printf__'
            {
            match("printf__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__212"

    // $ANTLR start "T__213"
    public final void mT__213() throws RecognitionException {
        try {
            int _type = T__213;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:159:8: ( 'scanf' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:159:10: 'scanf'
            {
            match("scanf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__213"

    // $ANTLR start "T__214"
    public final void mT__214() throws RecognitionException {
        try {
            int _type = T__214;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:160:8: ( '__scanf__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:160:10: '__scanf__'
            {
            match("__scanf__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__214"

    // $ANTLR start "T__215"
    public final void mT__215() throws RecognitionException {
        try {
            int _type = T__215;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:161:8: ( '__scanf' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:161:10: '__scanf'
            {
            match("__scanf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__215"

    // $ANTLR start "T__216"
    public final void mT__216() throws RecognitionException {
        try {
            int _type = T__216;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:162:8: ( 'scanf__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:162:10: 'scanf__'
            {
            match("scanf__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__216"

    // $ANTLR start "T__217"
    public final void mT__217() throws RecognitionException {
        try {
            int _type = T__217;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:163:8: ( 'strftime' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:163:10: 'strftime'
            {
            match("strftime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__217"

    // $ANTLR start "T__218"
    public final void mT__218() throws RecognitionException {
        try {
            int _type = T__218;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:164:8: ( '__strftime__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:164:10: '__strftime__'
            {
            match("__strftime__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__218"

    // $ANTLR start "T__219"
    public final void mT__219() throws RecognitionException {
        try {
            int _type = T__219;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:165:8: ( '__strftime' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:165:10: '__strftime'
            {
            match("__strftime"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__219"

    // $ANTLR start "T__220"
    public final void mT__220() throws RecognitionException {
        try {
            int _type = T__220;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:166:8: ( 'strftime__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:166:10: 'strftime__'
            {
            match("strftime__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__220"

    // $ANTLR start "T__221"
    public final void mT__221() throws RecognitionException {
        try {
            int _type = T__221;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:167:8: ( 'strfmon' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:167:10: 'strfmon'
            {
            match("strfmon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__221"

    // $ANTLR start "T__222"
    public final void mT__222() throws RecognitionException {
        try {
            int _type = T__222;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:168:8: ( '__strfmon__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:168:10: '__strfmon__'
            {
            match("__strfmon__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__222"

    // $ANTLR start "T__223"
    public final void mT__223() throws RecognitionException {
        try {
            int _type = T__223;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:169:8: ( '__strfmon' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:169:10: '__strfmon'
            {
            match("__strfmon"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__223"

    // $ANTLR start "T__224"
    public final void mT__224() throws RecognitionException {
        try {
            int _type = T__224;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:170:8: ( 'strfmon__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:170:10: 'strfmon__'
            {
            match("strfmon__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__224"

    // $ANTLR start "T__225"
    public final void mT__225() throws RecognitionException {
        try {
            int _type = T__225;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:171:8: ( '__leaf__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:171:10: '__leaf__'
            {
            match("__leaf__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__225"

    // $ANTLR start "T__226"
    public final void mT__226() throws RecognitionException {
        try {
            int _type = T__226;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:172:8: ( '__leaf' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:172:10: '__leaf'
            {
            match("__leaf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__226"

    // $ANTLR start "T__227"
    public final void mT__227() throws RecognitionException {
        try {
            int _type = T__227;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:173:8: ( 'leaf__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:173:10: 'leaf__'
            {
            match("leaf__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__227"

    // $ANTLR start "T__228"
    public final void mT__228() throws RecognitionException {
        try {
            int _type = T__228;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:174:8: ( 'leaf' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:174:10: 'leaf'
            {
            match("leaf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__228"

    // $ANTLR start "T__229"
    public final void mT__229() throws RecognitionException {
        try {
            int _type = T__229;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:175:8: ( '__malloc__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:175:10: '__malloc__'
            {
            match("__malloc__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__229"

    // $ANTLR start "T__230"
    public final void mT__230() throws RecognitionException {
        try {
            int _type = T__230;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:176:8: ( '__malloc' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:176:10: '__malloc'
            {
            match("__malloc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__230"

    // $ANTLR start "T__231"
    public final void mT__231() throws RecognitionException {
        try {
            int _type = T__231;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:177:8: ( 'malloc__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:177:10: 'malloc__'
            {
            match("malloc__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__231"

    // $ANTLR start "T__232"
    public final void mT__232() throws RecognitionException {
        try {
            int _type = T__232;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:178:8: ( 'malloc' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:178:10: 'malloc'
            {
            match("malloc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__232"

    // $ANTLR start "T__233"
    public final void mT__233() throws RecognitionException {
        try {
            int _type = T__233;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:179:8: ( '__noinline__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:179:10: '__noinline__'
            {
            match("__noinline__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__233"

    // $ANTLR start "T__234"
    public final void mT__234() throws RecognitionException {
        try {
            int _type = T__234;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:180:8: ( '__noinline' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:180:10: '__noinline'
            {
            match("__noinline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__234"

    // $ANTLR start "T__235"
    public final void mT__235() throws RecognitionException {
        try {
            int _type = T__235;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:181:8: ( 'noinline__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:181:10: 'noinline__'
            {
            match("noinline__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__235"

    // $ANTLR start "T__236"
    public final void mT__236() throws RecognitionException {
        try {
            int _type = T__236;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:182:8: ( 'noinline' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:182:10: 'noinline'
            {
            match("noinline"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__236"

    // $ANTLR start "T__237"
    public final void mT__237() throws RecognitionException {
        try {
            int _type = T__237;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:183:8: ( '__noreturn__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:183:10: '__noreturn__'
            {
            match("__noreturn__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__237"

    // $ANTLR start "T__238"
    public final void mT__238() throws RecognitionException {
        try {
            int _type = T__238;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:184:8: ( '__noreturn' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:184:10: '__noreturn'
            {
            match("__noreturn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__238"

    // $ANTLR start "T__239"
    public final void mT__239() throws RecognitionException {
        try {
            int _type = T__239;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:185:8: ( 'noreturn__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:185:10: 'noreturn__'
            {
            match("noreturn__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__239"

    // $ANTLR start "T__240"
    public final void mT__240() throws RecognitionException {
        try {
            int _type = T__240;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:186:8: ( '__used__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:186:10: '__used__'
            {
            match("__used__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__240"

    // $ANTLR start "T__241"
    public final void mT__241() throws RecognitionException {
        try {
            int _type = T__241;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:187:8: ( '__used' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:187:10: '__used'
            {
            match("__used"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__241"

    // $ANTLR start "T__242"
    public final void mT__242() throws RecognitionException {
        try {
            int _type = T__242;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:188:8: ( 'used__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:188:10: 'used__'
            {
            match("used__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__242"

    // $ANTLR start "T__243"
    public final void mT__243() throws RecognitionException {
        try {
            int _type = T__243;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:189:8: ( 'used' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:189:10: 'used'
            {
            match("used"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__243"

    // $ANTLR start "T__244"
    public final void mT__244() throws RecognitionException {
        try {
            int _type = T__244;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:190:8: ( '__unused__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:190:10: '__unused__'
            {
            match("__unused__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__244"

    // $ANTLR start "T__245"
    public final void mT__245() throws RecognitionException {
        try {
            int _type = T__245;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:191:8: ( '__unused' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:191:10: '__unused'
            {
            match("__unused"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__245"

    // $ANTLR start "T__246"
    public final void mT__246() throws RecognitionException {
        try {
            int _type = T__246;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:192:8: ( 'unused__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:192:10: 'unused__'
            {
            match("unused__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__246"

    // $ANTLR start "T__247"
    public final void mT__247() throws RecognitionException {
        try {
            int _type = T__247;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:193:8: ( 'unused' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:193:10: 'unused'
            {
            match("unused"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__247"

    // $ANTLR start "T__248"
    public final void mT__248() throws RecognitionException {
        try {
            int _type = T__248;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:194:8: ( '__mode__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:194:10: '__mode__'
            {
            match("__mode__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__248"

    // $ANTLR start "T__249"
    public final void mT__249() throws RecognitionException {
        try {
            int _type = T__249;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:195:8: ( '__mode' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:195:10: '__mode'
            {
            match("__mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__249"

    // $ANTLR start "T__250"
    public final void mT__250() throws RecognitionException {
        try {
            int _type = T__250;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:196:8: ( 'mode__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:196:10: 'mode__'
            {
            match("mode__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__250"

    // $ANTLR start "T__251"
    public final void mT__251() throws RecognitionException {
        try {
            int _type = T__251;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:197:8: ( 'mode' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:197:10: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__251"

    // $ANTLR start "T__252"
    public final void mT__252() throws RecognitionException {
        try {
            int _type = T__252;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:198:8: ( '__nonnull__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:198:10: '__nonnull__'
            {
            match("__nonnull__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__252"

    // $ANTLR start "T__253"
    public final void mT__253() throws RecognitionException {
        try {
            int _type = T__253;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:199:8: ( '__nonnull' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:199:10: '__nonnull'
            {
            match("__nonnull"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__253"

    // $ANTLR start "T__254"
    public final void mT__254() throws RecognitionException {
        try {
            int _type = T__254;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:200:8: ( 'nonnull__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:200:10: 'nonnull__'
            {
            match("nonnull__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__254"

    // $ANTLR start "T__255"
    public final void mT__255() throws RecognitionException {
        try {
            int _type = T__255;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:201:8: ( 'nonnull' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:201:10: 'nonnull'
            {
            match("nonnull"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__255"

    // $ANTLR start "T__256"
    public final void mT__256() throws RecognitionException {
        try {
            int _type = T__256;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:202:8: ( '__nothrow__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:202:10: '__nothrow__'
            {
            match("__nothrow__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__256"

    // $ANTLR start "T__257"
    public final void mT__257() throws RecognitionException {
        try {
            int _type = T__257;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:203:8: ( '__nothrow' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:203:10: '__nothrow'
            {
            match("__nothrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__257"

    // $ANTLR start "T__258"
    public final void mT__258() throws RecognitionException {
        try {
            int _type = T__258;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:204:8: ( 'nothrow__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:204:10: 'nothrow__'
            {
            match("nothrow__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__258"

    // $ANTLR start "T__259"
    public final void mT__259() throws RecognitionException {
        try {
            int _type = T__259;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:205:8: ( 'nothrow' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:205:10: 'nothrow'
            {
            match("nothrow"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__259"

    // $ANTLR start "T__260"
    public final void mT__260() throws RecognitionException {
        try {
            int _type = T__260;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:206:8: ( '__pure__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:206:10: '__pure__'
            {
            match("__pure__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__260"

    // $ANTLR start "T__261"
    public final void mT__261() throws RecognitionException {
        try {
            int _type = T__261;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:207:8: ( '__pure' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:207:10: '__pure'
            {
            match("__pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__261"

    // $ANTLR start "T__262"
    public final void mT__262() throws RecognitionException {
        try {
            int _type = T__262;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:208:8: ( 'pure__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:208:10: 'pure__'
            {
            match("pure__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__262"

    // $ANTLR start "T__263"
    public final void mT__263() throws RecognitionException {
        try {
            int _type = T__263;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:209:8: ( 'pure' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:209:10: 'pure'
            {
            match("pure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__263"

    // $ANTLR start "T__264"
    public final void mT__264() throws RecognitionException {
        try {
            int _type = T__264;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:210:8: ( '__transparent_union__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:210:10: '__transparent_union__'
            {
            match("__transparent_union__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__264"

    // $ANTLR start "T__265"
    public final void mT__265() throws RecognitionException {
        try {
            int _type = T__265;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:211:8: ( '__transparent_union' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:211:10: '__transparent_union'
            {
            match("__transparent_union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__265"

    // $ANTLR start "T__266"
    public final void mT__266() throws RecognitionException {
        try {
            int _type = T__266;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:212:8: ( 'transparent_union__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:212:10: 'transparent_union__'
            {
            match("transparent_union__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__266"

    // $ANTLR start "T__267"
    public final void mT__267() throws RecognitionException {
        try {
            int _type = T__267;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:213:8: ( 'transparent_union' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:213:10: 'transparent_union'
            {
            match("transparent_union"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__267"

    // $ANTLR start "T__268"
    public final void mT__268() throws RecognitionException {
        try {
            int _type = T__268;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:214:8: ( '__vector_size__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:214:10: '__vector_size__'
            {
            match("__vector_size__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__268"

    // $ANTLR start "T__269"
    public final void mT__269() throws RecognitionException {
        try {
            int _type = T__269;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:215:8: ( '__vector_size' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:215:10: '__vector_size'
            {
            match("__vector_size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__269"

    // $ANTLR start "T__270"
    public final void mT__270() throws RecognitionException {
        try {
            int _type = T__270;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:216:8: ( 'vector_size__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:216:10: 'vector_size__'
            {
            match("vector_size__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__270"

    // $ANTLR start "T__271"
    public final void mT__271() throws RecognitionException {
        try {
            int _type = T__271;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:217:8: ( 'vector_size' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:217:10: 'vector_size'
            {
            match("vector_size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__271"

    // $ANTLR start "T__272"
    public final void mT__272() throws RecognitionException {
        try {
            int _type = T__272;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:218:8: ( '__visibility__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:218:10: '__visibility__'
            {
            match("__visibility__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__272"

    // $ANTLR start "T__273"
    public final void mT__273() throws RecognitionException {
        try {
            int _type = T__273;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:219:8: ( '__visibility' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:219:10: '__visibility'
            {
            match("__visibility"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__273"

    // $ANTLR start "T__274"
    public final void mT__274() throws RecognitionException {
        try {
            int _type = T__274;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:220:8: ( 'visibility__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:220:10: 'visibility__'
            {
            match("visibility__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__274"

    // $ANTLR start "T__275"
    public final void mT__275() throws RecognitionException {
        try {
            int _type = T__275;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:221:8: ( 'visibility' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:221:10: 'visibility'
            {
            match("visibility"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__275"

    // $ANTLR start "T__276"
    public final void mT__276() throws RecognitionException {
        try {
            int _type = T__276;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:222:8: ( '__weak__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:222:10: '__weak__'
            {
            match("__weak__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__276"

    // $ANTLR start "T__277"
    public final void mT__277() throws RecognitionException {
        try {
            int _type = T__277;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:223:8: ( '__weak' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:223:10: '__weak'
            {
            match("__weak"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__277"

    // $ANTLR start "T__278"
    public final void mT__278() throws RecognitionException {
        try {
            int _type = T__278;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:224:8: ( 'weak__' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:224:10: 'weak__'
            {
            match("weak__"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__278"

    // $ANTLR start "T__279"
    public final void mT__279() throws RecognitionException {
        try {
            int _type = T__279;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:225:8: ( 'weak' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:225:10: 'weak'
            {
            match("weak"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__279"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1292:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1292:4: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1292:11: ( LETTER | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='$'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1297:2: ( '$' | 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1312:5: ( ( IntegerTypeSuffix )? '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )+ '\\'' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1312:9: ( IntegerTypeSuffix )? '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )+ '\\''
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1312:9: ( IntegerTypeSuffix )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='L'||LA2_0=='U'||LA2_0=='l'||LA2_0=='u') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1312:9: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }

            match('\''); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1312:33: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    alt3=1;
                }
                else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='[')||(LA3_0>=']' && LA3_0<='\uFFFF')) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1312:35: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1312:52: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1316:5: ( ( IntegerTypeSuffix )? '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1316:7: ( IntegerTypeSuffix )? '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1316:7: ( IntegerTypeSuffix )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='L'||LA4_0=='U'||LA4_0=='l'||LA4_0=='u') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1316:7: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }

            match('\"'); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1316:30: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\\') ) {
                    alt5=1;
                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1316:32: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1316:49: ~ ( '\\\\' | '\"' )
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

            	default :
            	    break loop5;
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
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            int _type = HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1319:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1319:15: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )*
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1319:29: ( HexDigit )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1319:29: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1319:39: ( IntegerTypeSuffix )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='L'||LA7_0=='U'||LA7_0=='l'||LA7_0=='u') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1319:39: IntegerTypeSuffix
            	    {
            	    mIntegerTypeSuffix(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:19: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                alt9=1;
            }
            else if ( ((LA9_0>='1' && LA9_0<='9')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:20: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:35: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:46: ( IntegerTypeSuffix )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='L'||LA10_0=='U'||LA10_0=='l'||LA10_0=='u') ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1321:46: IntegerTypeSuffix
            	    {
            	    mIntegerTypeSuffix(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            int _type = OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1323:15: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1323:17: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )*
            {
            match('0'); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1323:21: ( '0' .. '7' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='7')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1323:22: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1323:33: ( IntegerTypeSuffix )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='L'||LA12_0=='U'||LA12_0=='l'||LA12_0=='u') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1323:33: IntegerTypeSuffix
            	    {
            	    mIntegerTypeSuffix(); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1326:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1326:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
    // $ANTLR end "HexDigit"

    // $ANTLR start "IntegerTypeSuffix"
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1330:2: ( ( 'u' | 'U' )? ( 'l' | 'L' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1330:4: ( 'u' | 'U' )? ( 'l' | 'L' )
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1330:4: ( 'u' | 'U' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='U'||LA13_0=='u') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:
                    {
                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
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
    // $ANTLR end "IntegerTypeSuffix"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:9: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    match('.'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:25: ( '0' .. '9' )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:37: ( Exponent )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:47: ( FloatTypeSuffix )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1335:47: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1336:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1336:13: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1336:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1336:25: ( Exponent )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1336:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1336:35: ( FloatTypeSuffix )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1336:35: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1337:9: ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1337:9: ( '0' .. '9' )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1337:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1337:21: ( Exponent )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='E'||LA22_0=='e') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1337:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1337:31: ( FloatTypeSuffix )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='D'||LA23_0=='F'||LA23_0=='d'||LA23_0=='f') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1337:31: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

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
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1342:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1342:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1342:22: ( '+' | '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='+'||LA25_0=='-') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1342:33: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1342:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1345:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1345:19: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
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
    // $ANTLR end "FloatTypeSuffix"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1349:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1=='\"'||LA27_1=='\''||LA27_1=='\\'||LA27_1=='b'||LA27_1=='f'||LA27_1=='n'||LA27_1=='r'||LA27_1=='t') ) {
                    alt27=1;
                }
                else if ( ((LA27_1>='0' && LA27_1<='7')) ) {
                    alt27=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1349:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1350:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>='0' && LA28_1<='3')) ) {
                    int LA28_2 = input.LA(3);

                    if ( ((LA28_2>='0' && LA28_2<='7')) ) {
                        int LA28_4 = input.LA(4);

                        if ( ((LA28_4>='0' && LA28_4<='7')) ) {
                            alt28=1;
                        }
                        else {
                            alt28=2;}
                    }
                    else {
                        alt28=3;}
                }
                else if ( ((LA28_1>='4' && LA28_1<='7')) ) {
                    int LA28_3 = input.LA(3);

                    if ( ((LA28_3>='0' && LA28_3<='7')) ) {
                        alt28=2;
                    }
                    else {
                        alt28=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

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
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:14: ( '0' .. '3' )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:25: ( '0' .. '7' )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:36: ( '0' .. '7' )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1355:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1356:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1356:14: ( '0' .. '7' )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1356:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1356:25: ( '0' .. '7' )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1356:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1357:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1357:14: ( '0' .. '7' )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1357:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1362:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1362:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1365:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1365:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
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
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1369:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1369:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1369:14: ( options {greedy=false; } : . )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='*') ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1=='/') ) {
                        alt29=2;
                    }
                    else if ( ((LA29_1>='\u0000' && LA29_1<='.')||(LA29_1>='0' && LA29_1<='\uFFFF')) ) {
                        alt29=1;
                    }


                }
                else if ( ((LA29_0>='\u0000' && LA29_0<=')')||(LA29_0>='+' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1369:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1373:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1373:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1373:12: (~ ( '\\n' | '\\r' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\f')||(LA30_0>='\u000E' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1373:12: ~ ( '\\n' | '\\r' )
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
            	    break loop30;
                }
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1373:26: ( '\\r' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\r') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1373:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "LINE_COMMAND"
    public final void mLINE_COMMAND() throws RecognitionException {
        try {
            int _type = LINE_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1378:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1378:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1378:11: (~ ( '\\n' | '\\r' ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1378:11: ~ ( '\\n' | '\\r' )
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
            	    break loop32;
                }
            } while (true);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1378:25: ( '\\r' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\r') ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1378:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMAND"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:8: ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | T__235 | T__236 | T__237 | T__238 | T__239 | T__240 | T__241 | T__242 | T__243 | T__244 | T__245 | T__246 | T__247 | T__248 | T__249 | T__250 | T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | T__265 | T__266 | T__267 | T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND )
        int alt34=230;
        alt34 = dfa34.predict(input);
        switch (alt34) {
            case 1 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:10: T__61
                {
                mT__61(); 

                }
                break;
            case 2 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:16: T__62
                {
                mT__62(); 

                }
                break;
            case 3 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:22: T__63
                {
                mT__63(); 

                }
                break;
            case 4 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:28: T__64
                {
                mT__64(); 

                }
                break;
            case 5 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:34: T__65
                {
                mT__65(); 

                }
                break;
            case 6 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:40: T__66
                {
                mT__66(); 

                }
                break;
            case 7 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:46: T__67
                {
                mT__67(); 

                }
                break;
            case 8 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:52: T__68
                {
                mT__68(); 

                }
                break;
            case 9 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:58: T__69
                {
                mT__69(); 

                }
                break;
            case 10 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:64: T__70
                {
                mT__70(); 

                }
                break;
            case 11 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:70: T__71
                {
                mT__71(); 

                }
                break;
            case 12 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:76: T__72
                {
                mT__72(); 

                }
                break;
            case 13 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:82: T__73
                {
                mT__73(); 

                }
                break;
            case 14 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:88: T__74
                {
                mT__74(); 

                }
                break;
            case 15 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:94: T__75
                {
                mT__75(); 

                }
                break;
            case 16 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:100: T__76
                {
                mT__76(); 

                }
                break;
            case 17 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:106: T__77
                {
                mT__77(); 

                }
                break;
            case 18 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:112: T__78
                {
                mT__78(); 

                }
                break;
            case 19 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:118: T__79
                {
                mT__79(); 

                }
                break;
            case 20 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:124: T__80
                {
                mT__80(); 

                }
                break;
            case 21 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:130: T__81
                {
                mT__81(); 

                }
                break;
            case 22 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:136: T__82
                {
                mT__82(); 

                }
                break;
            case 23 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:142: T__83
                {
                mT__83(); 

                }
                break;
            case 24 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:148: T__84
                {
                mT__84(); 

                }
                break;
            case 25 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:154: T__85
                {
                mT__85(); 

                }
                break;
            case 26 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:160: T__86
                {
                mT__86(); 

                }
                break;
            case 27 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:166: T__87
                {
                mT__87(); 

                }
                break;
            case 28 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:172: T__88
                {
                mT__88(); 

                }
                break;
            case 29 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:178: T__89
                {
                mT__89(); 

                }
                break;
            case 30 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:184: T__90
                {
                mT__90(); 

                }
                break;
            case 31 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:190: T__91
                {
                mT__91(); 

                }
                break;
            case 32 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:196: T__92
                {
                mT__92(); 

                }
                break;
            case 33 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:202: T__93
                {
                mT__93(); 

                }
                break;
            case 34 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:208: T__94
                {
                mT__94(); 

                }
                break;
            case 35 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:214: T__95
                {
                mT__95(); 

                }
                break;
            case 36 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:220: T__96
                {
                mT__96(); 

                }
                break;
            case 37 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:226: T__97
                {
                mT__97(); 

                }
                break;
            case 38 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:232: T__98
                {
                mT__98(); 

                }
                break;
            case 39 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:238: T__99
                {
                mT__99(); 

                }
                break;
            case 40 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:244: T__100
                {
                mT__100(); 

                }
                break;
            case 41 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:251: T__101
                {
                mT__101(); 

                }
                break;
            case 42 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:258: T__102
                {
                mT__102(); 

                }
                break;
            case 43 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:265: T__103
                {
                mT__103(); 

                }
                break;
            case 44 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:272: T__104
                {
                mT__104(); 

                }
                break;
            case 45 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:279: T__105
                {
                mT__105(); 

                }
                break;
            case 46 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:286: T__106
                {
                mT__106(); 

                }
                break;
            case 47 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:293: T__107
                {
                mT__107(); 

                }
                break;
            case 48 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:300: T__108
                {
                mT__108(); 

                }
                break;
            case 49 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:307: T__109
                {
                mT__109(); 

                }
                break;
            case 50 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:314: T__110
                {
                mT__110(); 

                }
                break;
            case 51 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:321: T__111
                {
                mT__111(); 

                }
                break;
            case 52 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:328: T__112
                {
                mT__112(); 

                }
                break;
            case 53 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:335: T__113
                {
                mT__113(); 

                }
                break;
            case 54 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:342: T__114
                {
                mT__114(); 

                }
                break;
            case 55 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:349: T__115
                {
                mT__115(); 

                }
                break;
            case 56 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:356: T__116
                {
                mT__116(); 

                }
                break;
            case 57 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:363: T__117
                {
                mT__117(); 

                }
                break;
            case 58 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:370: T__118
                {
                mT__118(); 

                }
                break;
            case 59 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:377: T__119
                {
                mT__119(); 

                }
                break;
            case 60 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:384: T__120
                {
                mT__120(); 

                }
                break;
            case 61 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:391: T__121
                {
                mT__121(); 

                }
                break;
            case 62 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:398: T__122
                {
                mT__122(); 

                }
                break;
            case 63 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:405: T__123
                {
                mT__123(); 

                }
                break;
            case 64 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:412: T__124
                {
                mT__124(); 

                }
                break;
            case 65 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:419: T__125
                {
                mT__125(); 

                }
                break;
            case 66 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:426: T__126
                {
                mT__126(); 

                }
                break;
            case 67 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:433: T__127
                {
                mT__127(); 

                }
                break;
            case 68 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:440: T__128
                {
                mT__128(); 

                }
                break;
            case 69 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:447: T__129
                {
                mT__129(); 

                }
                break;
            case 70 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:454: T__130
                {
                mT__130(); 

                }
                break;
            case 71 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:461: T__131
                {
                mT__131(); 

                }
                break;
            case 72 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:468: T__132
                {
                mT__132(); 

                }
                break;
            case 73 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:475: T__133
                {
                mT__133(); 

                }
                break;
            case 74 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:482: T__134
                {
                mT__134(); 

                }
                break;
            case 75 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:489: T__135
                {
                mT__135(); 

                }
                break;
            case 76 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:496: T__136
                {
                mT__136(); 

                }
                break;
            case 77 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:503: T__137
                {
                mT__137(); 

                }
                break;
            case 78 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:510: T__138
                {
                mT__138(); 

                }
                break;
            case 79 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:517: T__139
                {
                mT__139(); 

                }
                break;
            case 80 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:524: T__140
                {
                mT__140(); 

                }
                break;
            case 81 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:531: T__141
                {
                mT__141(); 

                }
                break;
            case 82 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:538: T__142
                {
                mT__142(); 

                }
                break;
            case 83 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:545: T__143
                {
                mT__143(); 

                }
                break;
            case 84 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:552: T__144
                {
                mT__144(); 

                }
                break;
            case 85 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:559: T__145
                {
                mT__145(); 

                }
                break;
            case 86 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:566: T__146
                {
                mT__146(); 

                }
                break;
            case 87 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:573: T__147
                {
                mT__147(); 

                }
                break;
            case 88 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:580: T__148
                {
                mT__148(); 

                }
                break;
            case 89 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:587: T__149
                {
                mT__149(); 

                }
                break;
            case 90 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:594: T__150
                {
                mT__150(); 

                }
                break;
            case 91 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:601: T__151
                {
                mT__151(); 

                }
                break;
            case 92 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:608: T__152
                {
                mT__152(); 

                }
                break;
            case 93 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:615: T__153
                {
                mT__153(); 

                }
                break;
            case 94 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:622: T__154
                {
                mT__154(); 

                }
                break;
            case 95 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:629: T__155
                {
                mT__155(); 

                }
                break;
            case 96 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:636: T__156
                {
                mT__156(); 

                }
                break;
            case 97 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:643: T__157
                {
                mT__157(); 

                }
                break;
            case 98 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:650: T__158
                {
                mT__158(); 

                }
                break;
            case 99 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:657: T__159
                {
                mT__159(); 

                }
                break;
            case 100 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:664: T__160
                {
                mT__160(); 

                }
                break;
            case 101 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:671: T__161
                {
                mT__161(); 

                }
                break;
            case 102 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:678: T__162
                {
                mT__162(); 

                }
                break;
            case 103 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:685: T__163
                {
                mT__163(); 

                }
                break;
            case 104 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:692: T__164
                {
                mT__164(); 

                }
                break;
            case 105 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:699: T__165
                {
                mT__165(); 

                }
                break;
            case 106 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:706: T__166
                {
                mT__166(); 

                }
                break;
            case 107 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:713: T__167
                {
                mT__167(); 

                }
                break;
            case 108 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:720: T__168
                {
                mT__168(); 

                }
                break;
            case 109 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:727: T__169
                {
                mT__169(); 

                }
                break;
            case 110 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:734: T__170
                {
                mT__170(); 

                }
                break;
            case 111 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:741: T__171
                {
                mT__171(); 

                }
                break;
            case 112 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:748: T__172
                {
                mT__172(); 

                }
                break;
            case 113 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:755: T__173
                {
                mT__173(); 

                }
                break;
            case 114 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:762: T__174
                {
                mT__174(); 

                }
                break;
            case 115 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:769: T__175
                {
                mT__175(); 

                }
                break;
            case 116 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:776: T__176
                {
                mT__176(); 

                }
                break;
            case 117 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:783: T__177
                {
                mT__177(); 

                }
                break;
            case 118 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:790: T__178
                {
                mT__178(); 

                }
                break;
            case 119 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:797: T__179
                {
                mT__179(); 

                }
                break;
            case 120 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:804: T__180
                {
                mT__180(); 

                }
                break;
            case 121 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:811: T__181
                {
                mT__181(); 

                }
                break;
            case 122 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:818: T__182
                {
                mT__182(); 

                }
                break;
            case 123 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:825: T__183
                {
                mT__183(); 

                }
                break;
            case 124 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:832: T__184
                {
                mT__184(); 

                }
                break;
            case 125 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:839: T__185
                {
                mT__185(); 

                }
                break;
            case 126 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:846: T__186
                {
                mT__186(); 

                }
                break;
            case 127 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:853: T__187
                {
                mT__187(); 

                }
                break;
            case 128 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:860: T__188
                {
                mT__188(); 

                }
                break;
            case 129 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:867: T__189
                {
                mT__189(); 

                }
                break;
            case 130 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:874: T__190
                {
                mT__190(); 

                }
                break;
            case 131 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:881: T__191
                {
                mT__191(); 

                }
                break;
            case 132 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:888: T__192
                {
                mT__192(); 

                }
                break;
            case 133 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:895: T__193
                {
                mT__193(); 

                }
                break;
            case 134 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:902: T__194
                {
                mT__194(); 

                }
                break;
            case 135 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:909: T__195
                {
                mT__195(); 

                }
                break;
            case 136 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:916: T__196
                {
                mT__196(); 

                }
                break;
            case 137 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:923: T__197
                {
                mT__197(); 

                }
                break;
            case 138 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:930: T__198
                {
                mT__198(); 

                }
                break;
            case 139 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:937: T__199
                {
                mT__199(); 

                }
                break;
            case 140 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:944: T__200
                {
                mT__200(); 

                }
                break;
            case 141 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:951: T__201
                {
                mT__201(); 

                }
                break;
            case 142 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:958: T__202
                {
                mT__202(); 

                }
                break;
            case 143 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:965: T__203
                {
                mT__203(); 

                }
                break;
            case 144 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:972: T__204
                {
                mT__204(); 

                }
                break;
            case 145 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:979: T__205
                {
                mT__205(); 

                }
                break;
            case 146 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:986: T__206
                {
                mT__206(); 

                }
                break;
            case 147 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:993: T__207
                {
                mT__207(); 

                }
                break;
            case 148 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1000: T__208
                {
                mT__208(); 

                }
                break;
            case 149 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1007: T__209
                {
                mT__209(); 

                }
                break;
            case 150 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1014: T__210
                {
                mT__210(); 

                }
                break;
            case 151 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1021: T__211
                {
                mT__211(); 

                }
                break;
            case 152 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1028: T__212
                {
                mT__212(); 

                }
                break;
            case 153 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1035: T__213
                {
                mT__213(); 

                }
                break;
            case 154 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1042: T__214
                {
                mT__214(); 

                }
                break;
            case 155 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1049: T__215
                {
                mT__215(); 

                }
                break;
            case 156 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1056: T__216
                {
                mT__216(); 

                }
                break;
            case 157 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1063: T__217
                {
                mT__217(); 

                }
                break;
            case 158 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1070: T__218
                {
                mT__218(); 

                }
                break;
            case 159 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1077: T__219
                {
                mT__219(); 

                }
                break;
            case 160 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1084: T__220
                {
                mT__220(); 

                }
                break;
            case 161 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1091: T__221
                {
                mT__221(); 

                }
                break;
            case 162 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1098: T__222
                {
                mT__222(); 

                }
                break;
            case 163 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1105: T__223
                {
                mT__223(); 

                }
                break;
            case 164 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1112: T__224
                {
                mT__224(); 

                }
                break;
            case 165 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1119: T__225
                {
                mT__225(); 

                }
                break;
            case 166 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1126: T__226
                {
                mT__226(); 

                }
                break;
            case 167 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1133: T__227
                {
                mT__227(); 

                }
                break;
            case 168 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1140: T__228
                {
                mT__228(); 

                }
                break;
            case 169 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1147: T__229
                {
                mT__229(); 

                }
                break;
            case 170 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1154: T__230
                {
                mT__230(); 

                }
                break;
            case 171 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1161: T__231
                {
                mT__231(); 

                }
                break;
            case 172 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1168: T__232
                {
                mT__232(); 

                }
                break;
            case 173 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1175: T__233
                {
                mT__233(); 

                }
                break;
            case 174 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1182: T__234
                {
                mT__234(); 

                }
                break;
            case 175 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1189: T__235
                {
                mT__235(); 

                }
                break;
            case 176 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1196: T__236
                {
                mT__236(); 

                }
                break;
            case 177 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1203: T__237
                {
                mT__237(); 

                }
                break;
            case 178 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1210: T__238
                {
                mT__238(); 

                }
                break;
            case 179 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1217: T__239
                {
                mT__239(); 

                }
                break;
            case 180 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1224: T__240
                {
                mT__240(); 

                }
                break;
            case 181 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1231: T__241
                {
                mT__241(); 

                }
                break;
            case 182 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1238: T__242
                {
                mT__242(); 

                }
                break;
            case 183 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1245: T__243
                {
                mT__243(); 

                }
                break;
            case 184 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1252: T__244
                {
                mT__244(); 

                }
                break;
            case 185 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1259: T__245
                {
                mT__245(); 

                }
                break;
            case 186 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1266: T__246
                {
                mT__246(); 

                }
                break;
            case 187 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1273: T__247
                {
                mT__247(); 

                }
                break;
            case 188 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1280: T__248
                {
                mT__248(); 

                }
                break;
            case 189 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1287: T__249
                {
                mT__249(); 

                }
                break;
            case 190 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1294: T__250
                {
                mT__250(); 

                }
                break;
            case 191 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1301: T__251
                {
                mT__251(); 

                }
                break;
            case 192 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1308: T__252
                {
                mT__252(); 

                }
                break;
            case 193 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1315: T__253
                {
                mT__253(); 

                }
                break;
            case 194 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1322: T__254
                {
                mT__254(); 

                }
                break;
            case 195 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1329: T__255
                {
                mT__255(); 

                }
                break;
            case 196 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1336: T__256
                {
                mT__256(); 

                }
                break;
            case 197 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1343: T__257
                {
                mT__257(); 

                }
                break;
            case 198 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1350: T__258
                {
                mT__258(); 

                }
                break;
            case 199 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1357: T__259
                {
                mT__259(); 

                }
                break;
            case 200 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1364: T__260
                {
                mT__260(); 

                }
                break;
            case 201 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1371: T__261
                {
                mT__261(); 

                }
                break;
            case 202 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1378: T__262
                {
                mT__262(); 

                }
                break;
            case 203 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1385: T__263
                {
                mT__263(); 

                }
                break;
            case 204 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1392: T__264
                {
                mT__264(); 

                }
                break;
            case 205 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1399: T__265
                {
                mT__265(); 

                }
                break;
            case 206 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1406: T__266
                {
                mT__266(); 

                }
                break;
            case 207 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1413: T__267
                {
                mT__267(); 

                }
                break;
            case 208 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1420: T__268
                {
                mT__268(); 

                }
                break;
            case 209 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1427: T__269
                {
                mT__269(); 

                }
                break;
            case 210 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1434: T__270
                {
                mT__270(); 

                }
                break;
            case 211 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1441: T__271
                {
                mT__271(); 

                }
                break;
            case 212 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1448: T__272
                {
                mT__272(); 

                }
                break;
            case 213 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1455: T__273
                {
                mT__273(); 

                }
                break;
            case 214 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1462: T__274
                {
                mT__274(); 

                }
                break;
            case 215 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1469: T__275
                {
                mT__275(); 

                }
                break;
            case 216 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1476: T__276
                {
                mT__276(); 

                }
                break;
            case 217 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1483: T__277
                {
                mT__277(); 

                }
                break;
            case 218 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1490: T__278
                {
                mT__278(); 

                }
                break;
            case 219 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1497: T__279
                {
                mT__279(); 

                }
                break;
            case 220 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1504: IDENTIFIER
                {
                mIDENTIFIER(); 

                }
                break;
            case 221 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1515: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 

                }
                break;
            case 222 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1533: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 223 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1548: HEX_LITERAL
                {
                mHEX_LITERAL(); 

                }
                break;
            case 224 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1560: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 

                }
                break;
            case 225 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1576: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); 

                }
                break;
            case 226 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1590: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 

                }
                break;
            case 227 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1613: WS
                {
                mWS(); 

                }
                break;
            case 228 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1616: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 229 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1624: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 230 :
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\c\\CLang.g:1:1637: LINE_COMMAND
                {
                mLINE_COMMAND(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String DFA24_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA24_eofS =
        "\5\uffff";
    static final String DFA24_minS =
        "\2\56\3\uffff";
    static final String DFA24_maxS =
        "\2\71\3\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\1\1";
    static final String DFA24_specialS =
        "\5\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
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
            return "1334:1: FLOATING_POINT_LITERAL : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? );";
        }
    }
    static final String DFA34_eotS =
        "\1\uffff\1\56\1\70\11\uffff\15\56\1\136\1\141\1\144\1\150\1\154"+
        "\1\156\1\161\1\uffff\1\163\1\166\1\171\1\173\1\176\1\uffff\7\56"+
        "\3\uffff\2\u0088\2\uffff\2\56\2\uffff\26\56\1\u00a9\4\56\1\u00af"+
        "\10\56\27\uffff\1\u00cd\2\uffff\1\u00cf\7\uffff\10\56\2\uffff\1"+
        "\u00d8\1\u0088\16\56\1\u00e9\15\56\1\u00fd\1\56\1\uffff\3\56\1\u0103"+
        "\1\56\1\uffff\34\56\4\uffff\10\56\1\uffff\3\56\1\u0138\1\u0139\11"+
        "\56\1\u0144\1\56\1\uffff\5\56\1\u014b\3\56\1\u014f\2\56\1\u0152"+
        "\6\56\1\uffff\1\56\1\u015a\1\u015c\2\56\1\uffff\12\56\1\u016d\37"+
        "\56\1\u0193\1\u0194\2\56\1\u0198\1\56\1\u019b\3\56\2\uffff\5\56"+
        "\1\u01a4\3\56\1\u01a9\1\uffff\1\u01aa\1\u01ac\4\56\1\uffff\3\56"+
        "\1\uffff\1\u01b6\1\56\1\uffff\1\u01b9\6\56\1\uffff\1\56\1\uffff"+
        "\1\u01c1\10\56\1\u01ca\6\56\1\uffff\1\56\1\u01d3\41\56\1\u01f7\1"+
        "\56\2\uffff\1\u01f9\2\56\1\uffff\2\56\1\uffff\2\56\1\u0200\1\56"+
        "\1\u0202\1\u0203\2\56\1\uffff\1\u0206\1\u0207\1\u0208\1\56\2\uffff"+
        "\1\56\1\uffff\3\56\1\u020e\5\56\1\uffff\2\56\1\uffff\1\56\1\u0217"+
        "\3\56\1\u021b\1\u021c\1\uffff\1\u021e\1\u021f\6\56\1\uffff\1\u0227"+
        "\4\56\1\u022c\2\56\1\uffff\21\56\1\u0241\2\56\1\u0246\1\56\1\u0249"+
        "\4\56\1\u024f\2\56\1\u0253\4\56\1\uffff\1\u0258\1\uffff\1\u025a"+
        "\1\u025b\1\u025d\1\u025e\1\u025f\1\56\1\uffff\1\56\2\uffff\1\56"+
        "\1\u0264\3\uffff\1\u0265\1\u0266\1\u0268\2\56\1\uffff\3\56\1\u026e"+
        "\2\56\1\u0271\1\u0273\1\uffff\1\u0274\1\u0275\1\u0276\2\uffff\1"+
        "\56\2\uffff\1\u0278\6\56\1\uffff\1\u027f\3\56\1\uffff\1\56\1\u0284"+
        "\1\56\1\u0287\2\56\1\u028c\1\u028e\14\56\1\uffff\1\u029c\3\56\1"+
        "\uffff\2\56\1\uffff\5\56\1\uffff\3\56\1\uffff\2\56\1\u02ad\1\u02af"+
        "\1\uffff\1\56\2\uffff\1\56\3\uffff\1\56\1\u02b4\1\u02b6\1\56\3\uffff"+
        "\1\56\1\uffff\1\56\1\u02ba\1\u02bc\2\56\1\uffff\1\56\1\u02c0\1\uffff"+
        "\1\56\4\uffff\1\u02c2\1\uffff\4\56\1\u02c7\1\u02c8\1\uffff\1\u02c9"+
        "\1\u02ca\1\u02cb\1\56\1\uffff\2\56\1\uffff\4\56\1\uffff\1\56\1\uffff"+
        "\11\56\1\u02de\1\u02e0\1\u02e1\1\56\1\uffff\2\56\1\u02e5\1\u02e7"+
        "\1\u02e8\4\56\1\u02ed\1\u02ef\1\56\1\u02f1\1\u02f3\1\u02f5\1\56"+
        "\1\uffff\1\56\1\uffff\1\u02f8\1\u02f9\2\56\1\uffff\1\56\1\uffff"+
        "\1\u02fd\1\u02fe\1\56\1\uffff\1\56\1\uffff\3\56\1\uffff\1\u0304"+
        "\1\uffff\2\56\1\u0308\1\u030a\5\uffff\2\56\1\u030d\1\u030f\1\56"+
        "\1\u0311\1\56\1\u0313\1\u0315\11\56\1\uffff\1\56\2\uffff\1\u0320"+
        "\1\56\1\u0323\1\uffff\1\56\2\uffff\2\56\1\u0328\1\u032a\1\uffff"+
        "\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\u032f\1\u0330"+
        "\2\uffff\1\56\1\u0332\1\u0333\2\uffff\1\56\1\u0335\1\56\1\u0338"+
        "\1\56\1\uffff\1\u033b\1\u033d\1\56\1\uffff\1\56\1\uffff\2\56\1\uffff"+
        "\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\56\1\uffff\1\u0347\6\56"+
        "\1\u034f\1\u0350\1\u0351\1\uffff\1\u0353\1\56\1\uffff\1\u0355\1"+
        "\u0357\1\u0359\1\56\1\uffff\1\56\1\uffff\1\u035c\1\56\1\u035e\1"+
        "\u035f\2\uffff\1\56\2\uffff\1\56\1\uffff\1\u0363\1\56\1\uffff\1"+
        "\u0366\1\56\1\uffff\1\56\1\uffff\1\u0369\1\u036a\2\56\1\u036d\2"+
        "\56\1\u0370\1\56\1\uffff\4\56\1\u0377\1\u0379\1\56\3\uffff\1\56"+
        "\1\uffff\1\u037c\1\uffff\1\56\1\uffff\1\56\1\uffff\1\u037f\1\u0380"+
        "\1\uffff\1\56\2\uffff\3\56\1\uffff\1\u0385\1\56\1\uffff\1\u0387"+
        "\1\u0388\2\uffff\2\56\1\uffff\2\56\1\uffff\1\u038d\1\56\1\u0390"+
        "\1\u0392\1\u0394\1\56\1\uffff\1\56\1\uffff\1\u0397\1\u0398\1\uffff"+
        "\1\u0399\1\u039a\2\uffff\2\56\1\u039e\1\u039f\1\uffff\1\u03a0\2"+
        "\uffff\1\56\1\u03a2\1\56\1\u03a5\1\uffff\1\u03a7\1\56\1\uffff\1"+
        "\56\1\uffff\1\56\1\uffff\1\u03ab\1\u03ac\4\uffff\3\56\3\uffff\1"+
        "\56\1\uffff\2\56\1\uffff\1\56\1\uffff\1\u03b4\1\u03b5\1\u03b6\2"+
        "\uffff\2\56\1\u03b9\1\56\1\u03bc\1\u03bd\1\u03be\3\uffff\2\56\1"+
        "\uffff\2\56\3\uffff\1\56\1\u03c5\1\u03c6\1\u03c7\2\56\3\uffff\1"+
        "\56\1\u03cb\1\u03cd\1\uffff\1\56\1\uffff\1\u03cf\1\uffff";
    static final String DFA34_eofS =
        "\u03d0\uffff";
    static final String DFA34_minS =
        "\1\11\1\162\1\75\11\uffff\1\151\1\143\1\154\2\145\1\141\1\146\1"+
        "\42\1\154\1\145\1\114\1\137\1\157\1\75\1\56\1\53\1\55\1\52\1\75"+
        "\1\46\1\uffff\1\75\1\74\3\75\1\uffff\1\145\1\157\2\162\1\141\1\114"+
        "\1\42\3\uffff\2\56\2\uffff\1\160\1\141\2\uffff\1\164\1\165\1\163"+
        "\1\147\1\141\1\157\1\147\1\151\1\141\1\164\1\155\1\151\1\147\1\151"+
        "\1\143\1\163\1\141\1\156\1\163\2\145\1\154\1\44\1\156\1\141\1\157"+
        "\1\162\1\44\1\146\1\154\1\151\1\156\1\145\1\42\1\141\1\151\27\uffff"+
        "\1\75\2\uffff\1\75\7\uffff\1\151\1\141\1\164\1\145\1\151\1\162\1"+
        "\154\1\144\2\uffff\2\56\1\145\1\156\1\145\1\155\1\145\1\150\1\164"+
        "\1\146\1\162\1\156\1\145\1\164\1\156\1\157\1\44\2\141\1\151\1\165"+
        "\1\144\1\141\1\164\1\151\1\162\1\163\1\145\1\143\1\141\1\44\1\151"+
        "\1\uffff\1\147\1\146\1\141\1\44\1\142\1\uffff\1\141\1\162\1\164"+
        "\1\145\1\151\1\157\1\163\1\164\1\144\1\165\1\154\1\144\2\145\1\151"+
        "\1\157\1\162\1\143\1\145\1\141\1\157\1\156\1\162\2\145\2\156\1\150"+
        "\4\uffff\1\154\1\153\1\157\1\141\1\156\1\145\1\154\1\145\1\uffff"+
        "\1\144\1\163\1\162\2\44\1\164\1\151\1\143\1\155\1\164\1\145\1\157"+
        "\1\143\1\146\1\44\1\137\1\uffff\1\163\1\156\1\171\1\163\1\162\1"+
        "\44\1\164\1\157\1\142\1\44\1\164\1\151\1\44\1\154\1\156\1\137\1"+
        "\66\1\62\1\64\1\uffff\1\156\2\44\1\164\1\141\1\uffff\1\154\1\165"+
        "\1\145\1\162\1\170\1\155\1\147\1\156\1\145\1\61\1\44\1\151\1\155"+
        "\1\164\1\151\1\156\2\145\1\154\1\143\1\163\1\160\1\154\1\147\1\162"+
        "\1\151\1\162\1\141\1\162\1\141\1\154\1\144\1\151\1\145\1\165\2\141"+
        "\1\164\1\154\1\165\1\162\1\145\2\44\1\153\1\164\1\44\1\157\1\44"+
        "\1\145\1\160\1\156\2\uffff\1\142\1\143\1\164\1\151\1\157\1\44\1"+
        "\144\1\146\1\150\1\44\1\uffff\2\44\1\145\1\163\1\164\1\156\1\uffff"+
        "\1\151\1\162\1\151\1\uffff\1\44\1\156\1\uffff\1\44\1\165\1\164\3"+
        "\137\1\145\1\uffff\1\137\1\uffff\1\44\1\164\1\145\1\154\1\143\1"+
        "\165\2\160\1\156\1\44\1\144\1\137\1\66\1\62\1\64\1\137\1\uffff\1"+
        "\154\1\44\1\162\2\141\1\163\1\143\2\141\1\164\1\151\1\162\1\164"+
        "\1\145\1\150\1\155\1\156\1\145\1\156\2\146\1\154\1\145\1\156\1\145"+
        "\1\156\1\150\1\144\1\163\1\156\1\153\1\165\1\151\1\154\1\157\1\44"+
        "\1\137\2\uffff\1\44\1\146\1\137\1\uffff\1\143\1\137\1\uffff\1\146"+
        "\1\141\1\44\1\151\2\44\1\155\1\156\1\uffff\3\44\1\137\2\uffff\1"+
        "\137\1\uffff\1\144\1\137\1\145\1\44\1\154\1\137\1\154\1\137\1\165"+
        "\1\uffff\1\165\1\137\1\uffff\1\160\1\44\3\164\2\44\1\uffff\2\44"+
        "\1\164\1\141\1\143\2\157\1\145\1\uffff\1\44\1\164\3\137\1\44\1\164"+
        "\1\137\1\uffff\1\151\1\163\1\156\1\171\1\164\1\154\1\156\1\164\1"+
        "\157\1\142\1\145\1\162\1\170\1\155\1\164\1\141\1\164\1\44\1\146"+
        "\1\155\1\44\1\157\1\44\1\154\1\164\1\165\1\162\1\44\1\145\1\163"+
        "\1\44\1\162\1\156\1\154\1\167\1\uffff\1\44\1\uffff\5\44\1\162\1"+
        "\uffff\1\164\2\uffff\1\145\1\44\3\uffff\3\44\1\151\1\162\1\uffff"+
        "\1\145\1\163\1\151\1\44\1\143\1\145\2\44\1\uffff\3\44\2\uffff\1"+
        "\137\2\uffff\1\44\2\164\2\162\1\144\1\137\1\uffff\1\44\3\164\1\uffff"+
        "\1\151\1\44\1\142\1\44\1\145\1\163\2\44\1\165\1\151\1\162\1\151"+
        "\1\143\1\165\2\160\1\142\1\164\1\146\1\137\1\uffff\1\44\1\151\1"+
        "\157\1\137\1\uffff\1\143\1\137\1\uffff\1\151\1\165\1\154\1\157\1"+
        "\137\1\uffff\1\144\1\160\1\137\1\uffff\1\156\1\145\2\44\1\uffff"+
        "\1\137\2\uffff\1\137\3\uffff\1\145\2\44\1\137\3\uffff\1\137\1\uffff"+
        "\1\156\2\44\1\151\1\164\1\uffff\1\164\1\44\1\uffff\1\137\4\uffff"+
        "\1\44\1\uffff\1\145\1\157\2\164\2\44\1\uffff\3\44\1\156\1\uffff"+
        "\1\165\1\137\1\uffff\1\144\2\137\1\165\1\uffff\1\137\1\uffff\1\160"+
        "\1\154\1\137\1\154\1\141\1\143\2\157\1\151\3\44\1\137\1\uffff\1"+
        "\155\1\156\3\44\1\156\1\162\1\154\1\167\2\44\1\141\3\44\1\137\1"+
        "\uffff\1\137\1\uffff\2\44\1\156\1\137\1\uffff\1\137\1\uffff\2\44"+
        "\1\154\1\uffff\1\137\1\uffff\1\172\1\171\1\157\1\uffff\1\44\1\uffff"+
        "\1\144\1\162\2\44\5\uffff\1\137\1\164\2\44\1\151\1\44\1\143\2\44"+
        "\1\145\1\163\1\151\2\164\2\162\1\164\1\137\1\uffff\1\137\2\uffff"+
        "\1\44\1\145\1\44\1\uffff\1\137\2\uffff\1\145\1\156\2\44\1\uffff"+
        "\1\137\1\uffff\1\162\1\uffff\1\137\1\uffff\1\137\1\uffff\2\44\2"+
        "\uffff\1\164\2\44\2\uffff\1\151\1\44\1\145\1\44\1\162\1\uffff\2"+
        "\44\1\137\1\uffff\1\137\1\uffff\1\166\1\145\1\uffff\1\137\1\uffff"+
        "\1\156\1\uffff\1\164\1\uffff\1\137\1\uffff\1\44\1\151\1\164\1\145"+
        "\1\157\2\164\3\44\1\uffff\1\44\1\137\1\uffff\3\44\1\137\1\uffff"+
        "\1\137\1\uffff\1\44\1\145\2\44\2\uffff\1\137\2\uffff\1\156\1\uffff"+
        "\1\44\1\137\1\uffff\1\44\1\137\1\uffff\1\137\1\uffff\2\44\1\141"+
        "\1\137\1\44\1\154\1\157\1\44\1\137\1\uffff\1\172\1\171\1\144\1\162"+
        "\2\44\1\137\3\uffff\1\137\1\uffff\1\44\1\uffff\1\137\1\uffff\1\137"+
        "\1\uffff\2\44\1\uffff\1\156\2\uffff\1\165\1\145\1\137\1\uffff\1"+
        "\44\1\137\1\uffff\2\44\2\uffff\2\137\1\uffff\1\151\1\162\1\uffff"+
        "\1\44\1\145\3\44\1\137\1\uffff\1\137\1\uffff\2\44\1\uffff\2\44\2"+
        "\uffff\1\164\1\156\2\44\1\uffff\1\44\2\uffff\1\154\1\44\1\156\1"+
        "\44\1\uffff\1\44\1\137\1\uffff\1\137\1\uffff\1\137\1\uffff\2\44"+
        "\4\uffff\1\137\1\151\1\137\3\uffff\1\151\1\uffff\1\145\1\137\1\uffff"+
        "\1\137\1\uffff\3\44\2\uffff\1\165\1\157\1\44\1\163\3\44\3\uffff"+
        "\2\156\1\uffff\1\164\1\137\3\uffff\1\151\3\44\1\157\1\137\3\uffff"+
        "\1\156\2\44\1\uffff\1\137\1\uffff\1\44\1\uffff";
    static final String DFA34_maxS =
        "\1\176\1\171\1\75\11\uffff\1\170\1\167\1\165\1\145\2\157\1\156"+
        "\3\157\1\163\1\137\1\157\1\75\1\71\1\75\1\76\3\75\1\uffff\2\75\1"+
        "\76\1\75\1\174\1\uffff\1\150\1\157\1\162\1\165\1\157\1\154\1\47"+
        "\3\uffff\1\170\1\146\2\uffff\1\160\1\141\2\uffff\1\164\1\165\1\163"+
        "\1\147\1\162\1\157\1\172\1\151\1\141\1\164\1\155\1\167\1\164\1\154"+
        "\1\143\1\163\1\141\1\156\1\163\2\145\1\164\1\172\1\156\1\141\1\157"+
        "\1\162\1\172\1\163\1\154\1\165\1\156\1\145\1\47\1\167\1\164\27\uffff"+
        "\1\75\2\uffff\1\75\7\uffff\1\151\1\141\1\164\1\145\1\151\1\162\1"+
        "\154\1\144\2\uffff\2\146\1\145\1\156\1\145\1\155\1\145\1\150\1\164"+
        "\1\165\1\162\1\156\1\145\1\164\1\156\1\157\1\172\1\147\1\141\1\151"+
        "\1\165\1\144\1\141\1\164\1\151\1\162\1\164\1\145\1\143\1\141\1\172"+
        "\1\151\1\uffff\1\147\1\146\1\141\1\172\1\142\1\uffff\1\141\1\162"+
        "\1\164\2\151\1\157\1\163\1\164\1\144\1\165\1\164\2\157\1\154\1\151"+
        "\1\157\1\165\1\164\1\145\2\157\1\163\1\162\2\145\2\156\1\150\4\uffff"+
        "\1\154\1\153\1\157\1\141\1\156\1\145\1\154\1\145\1\uffff\1\144\1"+
        "\163\1\162\2\172\1\164\1\151\1\143\2\164\1\145\1\157\1\143\1\146"+
        "\1\172\1\137\1\uffff\1\163\1\156\1\171\1\163\1\162\1\172\1\164\1"+
        "\157\1\142\1\172\1\164\1\151\1\172\1\154\1\156\1\137\1\66\1\62\1"+
        "\64\1\uffff\1\156\2\172\1\164\1\141\1\uffff\1\154\1\165\1\145\1"+
        "\162\1\170\1\155\1\147\1\156\1\145\1\70\1\172\1\151\1\155\1\164"+
        "\1\167\1\156\2\145\1\154\1\143\2\163\1\154\1\147\1\162\1\151\1\162"+
        "\1\141\1\162\1\141\1\154\1\144\1\164\1\145\1\165\2\141\1\164\1\154"+
        "\1\165\1\162\1\145\2\172\1\153\1\164\1\172\1\157\1\172\1\145\1\160"+
        "\1\156\2\uffff\1\142\1\143\1\164\1\151\1\157\1\172\1\144\1\146\1"+
        "\150\1\172\1\uffff\2\172\1\145\1\163\1\164\1\156\1\uffff\1\151\1"+
        "\162\1\151\1\uffff\1\172\1\156\1\uffff\1\172\1\165\1\164\3\137\1"+
        "\145\1\uffff\1\137\1\uffff\1\172\1\164\1\145\1\154\1\143\1\165\2"+
        "\160\1\156\1\172\1\144\1\137\1\66\1\62\1\64\1\137\1\uffff\1\154"+
        "\1\172\1\162\1\147\1\141\1\163\1\143\2\141\1\164\1\151\1\162\1\164"+
        "\1\151\1\150\1\155\1\156\1\145\1\156\2\146\1\154\1\145\1\156\1\145"+
        "\1\156\1\150\1\144\1\163\1\156\1\153\1\165\1\151\1\154\1\157\1\172"+
        "\1\137\2\uffff\1\172\1\146\1\137\1\uffff\1\143\1\137\1\uffff\1\146"+
        "\1\141\1\172\1\151\2\172\1\155\1\156\1\uffff\3\172\1\137\2\uffff"+
        "\1\137\1\uffff\1\144\1\137\1\145\1\172\1\154\1\137\1\154\1\137\1"+
        "\165\1\uffff\1\165\1\137\1\uffff\1\160\1\172\3\164\2\172\1\uffff"+
        "\2\172\1\164\1\141\1\143\2\157\1\145\1\uffff\1\172\1\164\3\137\1"+
        "\172\1\164\1\137\1\uffff\1\151\1\163\1\156\1\171\1\164\1\154\1\156"+
        "\1\164\1\157\1\142\1\145\1\162\1\170\1\155\1\164\1\141\1\164\1\172"+
        "\1\146\1\164\1\172\1\157\1\172\1\154\1\164\1\165\1\162\1\172\1\145"+
        "\1\163\1\172\1\162\1\156\1\154\1\167\1\uffff\1\172\1\uffff\5\172"+
        "\1\162\1\uffff\1\164\2\uffff\1\145\1\172\3\uffff\3\172\1\151\1\162"+
        "\1\uffff\1\145\1\163\1\151\1\172\1\143\1\145\2\172\1\uffff\3\172"+
        "\2\uffff\1\137\2\uffff\1\172\2\164\2\162\1\144\1\137\1\uffff\1\172"+
        "\3\164\1\uffff\1\151\1\172\1\142\1\172\1\145\1\163\2\172\1\165\1"+
        "\151\1\162\1\151\1\143\1\165\2\160\1\142\1\164\1\146\1\137\1\uffff"+
        "\1\172\1\151\1\157\1\137\1\uffff\1\143\1\137\1\uffff\1\151\1\165"+
        "\1\154\1\157\1\137\1\uffff\1\144\1\160\1\137\1\uffff\1\156\1\145"+
        "\2\172\1\uffff\1\137\2\uffff\1\137\3\uffff\1\145\2\172\1\137\3\uffff"+
        "\1\137\1\uffff\1\156\2\172\1\151\1\164\1\uffff\1\164\1\172\1\uffff"+
        "\1\137\4\uffff\1\172\1\uffff\1\145\1\157\2\164\2\172\1\uffff\3\172"+
        "\1\156\1\uffff\1\165\1\137\1\uffff\1\144\2\137\1\165\1\uffff\1\137"+
        "\1\uffff\1\160\1\154\1\137\1\154\1\141\1\143\2\157\1\151\3\172\1"+
        "\137\1\uffff\1\155\1\156\3\172\1\156\1\162\1\154\1\167\2\172\1\141"+
        "\3\172\1\137\1\uffff\1\137\1\uffff\2\172\1\156\1\137\1\uffff\1\137"+
        "\1\uffff\2\172\1\154\1\uffff\1\137\1\uffff\1\172\1\171\1\157\1\uffff"+
        "\1\172\1\uffff\1\144\1\162\2\172\5\uffff\1\137\1\164\2\172\1\151"+
        "\1\172\1\143\2\172\1\145\1\163\1\151\2\164\2\162\1\164\1\137\1\uffff"+
        "\1\137\2\uffff\1\172\1\145\1\172\1\uffff\1\137\2\uffff\1\145\1\156"+
        "\2\172\1\uffff\1\137\1\uffff\1\162\1\uffff\1\137\1\uffff\1\137\1"+
        "\uffff\2\172\2\uffff\1\164\2\172\2\uffff\1\151\1\172\1\145\1\172"+
        "\1\162\1\uffff\2\172\1\137\1\uffff\1\137\1\uffff\1\166\1\145\1\uffff"+
        "\1\137\1\uffff\1\156\1\uffff\1\164\1\uffff\1\137\1\uffff\1\172\1"+
        "\151\1\164\1\145\1\157\2\164\3\172\1\uffff\1\172\1\137\1\uffff\3"+
        "\172\1\137\1\uffff\1\137\1\uffff\1\172\1\145\2\172\2\uffff\1\137"+
        "\2\uffff\1\156\1\uffff\1\172\1\137\1\uffff\1\172\1\137\1\uffff\1"+
        "\137\1\uffff\2\172\1\141\1\137\1\172\1\154\1\157\1\172\1\137\1\uffff"+
        "\1\172\1\171\1\144\1\162\2\172\1\137\3\uffff\1\137\1\uffff\1\172"+
        "\1\uffff\1\137\1\uffff\1\137\1\uffff\2\172\1\uffff\1\156\2\uffff"+
        "\1\165\1\145\1\137\1\uffff\1\172\1\137\1\uffff\2\172\2\uffff\2\137"+
        "\1\uffff\1\151\1\162\1\uffff\1\172\1\145\3\172\1\137\1\uffff\1\137"+
        "\1\uffff\2\172\1\uffff\2\172\2\uffff\1\164\1\156\2\172\1\uffff\1"+
        "\172\2\uffff\1\154\1\172\1\156\1\172\1\uffff\1\172\1\137\1\uffff"+
        "\1\137\1\uffff\1\137\1\uffff\2\172\4\uffff\1\137\1\151\1\137\3\uffff"+
        "\1\151\1\uffff\1\145\1\137\1\uffff\1\137\1\uffff\3\172\2\uffff\1"+
        "\165\1\157\1\172\1\163\3\172\3\uffff\2\156\1\uffff\1\164\1\137\3"+
        "\uffff\1\151\3\172\1\157\1\137\3\uffff\1\156\2\172\1\uffff\1\137"+
        "\1\uffff\1\172\1\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\24\uffff\1\65"+
        "\5\uffff\1\101\7\uffff\1\u00dc\1\u00dd\1\u00de\2\uffff\1\u00e3\1"+
        "\u00e6\2\uffff\1\106\1\2\44\uffff\1\67\1\51\1\52\1\u00e2\1\62\1"+
        "\57\1\72\1\53\1\60\1\63\1\73\1\54\1\70\1\u00e4\1\u00e5\1\55\1\71"+
        "\1\56\1\76\1\103\1\64\1\107\1\66\1\uffff\1\112\1\110\1\uffff\1\113"+
        "\1\111\1\77\1\105\1\100\1\102\1\104\10\uffff\1\u00df\1\u00e0\40"+
        "\uffff\1\132\5\uffff\1\136\34\uffff\1\74\1\114\1\75\1\115\10\uffff"+
        "\1\u00e1\20\uffff\1\117\23\uffff\1\23\5\uffff\1\137\64\uffff\1\44"+
        "\1\133\12\uffff\1\16\6\uffff\1\20\3\uffff\1\21\2\uffff\1\130\7\uffff"+
        "\1\24\1\uffff\1\u00a8\20\uffff\1\u00b7\45\uffff\1\u00db\1\140\3"+
        "\uffff\1\u00cb\2\uffff\1\u00bf\10\uffff\1\22\4\uffff\1\u0099\1\120"+
        "\1\uffff\1\145\11\uffff\1\45\2\uffff\1\161\7\uffff\1\25\10\uffff"+
        "\1\43\10\uffff\1\121\43\uffff\1\135\1\uffff\1\142\6\uffff\1\14\1"+
        "\uffff\1\15\1\42\2\uffff\1\27\1\61\1\134\5\uffff\1\143\10\uffff"+
        "\1\32\3\uffff\1\50\1\u00a7\1\uffff\1\u0094\1\26\7\uffff\1\u00bb"+
        "\4\uffff\1\u00b6\24\uffff\1\u00c9\4\uffff\1\u00a6\2\uffff\1\u00bd"+
        "\5\uffff\1\u00b5\3\uffff\1\u00d9\4\uffff\1\u00da\1\uffff\1\u0095"+
        "\1\u00ca\1\uffff\1\u00ac\1\u00be\1\1\4\uffff\1\u00a1\1\u009c\1\150"+
        "\1\uffff\1\154\5\uffff\1\124\2\uffff\1\164\1\uffff\1\170\1\34\1"+
        "\36\1\40\1\uffff\1\131\6\uffff\1\31\4\uffff\1\116\2\uffff\1\147"+
        "\4\uffff\1\122\1\uffff\1\163\15\uffff\1\u009b\20\uffff\1\u00c3\1"+
        "\uffff\1\u00c7\4\uffff\1\u0090\1\uffff\1\u009d\3\uffff\1\17\1\uffff"+
        "\1\46\3\uffff\1\141\1\uffff\1\u0093\4\uffff\1\30\1\u00ba\1\33\1"+
        "\35\1\37\22\uffff\1\u0092\1\uffff\1\u0097\1\u00c8\3\uffff\1\u00a5"+
        "\1\uffff\1\u00aa\1\u00bc\4\uffff\1\u00b4\1\uffff\1\u00b9\1\uffff"+
        "\1\u00d8\1\uffff\1\47\1\uffff\1\u00b0\2\uffff\1\u0098\1\u00ab\3"+
        "\uffff\1\u00a4\1\153\5\uffff\1\167\3\uffff\1\u0088\1\uffff\1\u008c"+
        "\2\uffff\1\146\1\uffff\1\152\1\uffff\1\123\1\uffff\1\162\1\uffff"+
        "\1\166\12\uffff\1\u009a\2\uffff\1\u00a3\4\uffff\1\u00c1\1\uffff"+
        "\1\u00c5\4\uffff\1\u00c2\1\u00c6\1\uffff\1\u008f\1\u00a0\1\uffff"+
        "\1\127\2\uffff\1\u00d7\2\uffff\1\u0080\1\uffff\1\u0084\11\uffff"+
        "\1\126\7\uffff\1\u008e\1\u0091\1\u0096\1\uffff\1\u009f\1\uffff\1"+
        "\u00a9\1\uffff\1\u00ae\1\uffff\1\u00b2\2\uffff\1\u00b8\1\uffff\1"+
        "\u00b3\1\u00af\3\uffff\1\u00d3\2\uffff\1\174\2\uffff\1\u0087\1\u008b"+
        "\2\uffff\1\151\2\uffff\1\165\6\uffff\1\u0086\1\uffff\1\u008a\2\uffff"+
        "\1\u00a2\2\uffff\1\u00c0\1\u00c4\4\uffff\1\u00d6\1\uffff\1\177\1"+
        "\u0083\4\uffff\1\125\2\uffff\1\u00d5\1\uffff\1\176\1\uffff\1\u0082"+
        "\2\uffff\1\u008d\1\u009e\1\u00ad\1\u00b1\3\uffff\1\160\1\u00d2\1"+
        "\173\1\uffff\1\144\2\uffff\1\172\1\uffff\1\u00d1\3\uffff\1\u0085"+
        "\1\u0089\7\uffff\1\u00d4\1\175\1\u0081\2\uffff\1\157\2\uffff\1\156"+
        "\1\171\1\u00d0\6\uffff\1\u00cf\1\41\1\155\3\uffff\1\u00ce\1\uffff"+
        "\1\u00cd\1\uffff\1\u00cc";
    static final String DFA34_specialS =
        "\u03d0\uffff}>";
    static final String[] DFA34_transitionS = {
            "\2\63\1\uffff\2\63\22\uffff\1\63\1\41\1\60\1\64\1\56\1\36\1"+
            "\37\1\57\1\6\1\7\1\31\1\33\1\3\1\34\1\32\1\35\1\61\11\62\1\4"+
            "\1\5\1\42\1\2\1\43\1\46\1\uffff\13\56\1\55\10\56\1\54\5\56\1"+
            "\10\1\uffff\1\11\1\44\1\27\1\uffff\1\16\1\51\1\21\1\25\1\14"+
            "\1\24\1\50\1\56\1\22\2\56\1\23\1\53\1\30\1\56\1\52\1\56\1\17"+
            "\1\15\1\1\1\26\1\20\1\47\3\56\1\12\1\45\1\13\1\40",
            "\1\66\6\uffff\1\65",
            "\1\67",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\2\uffff\1\73\1\uffff\1\72\11\uffff\1\71",
            "\1\101\4\uffff\1\76\1\77\12\uffff\1\75\2\uffff\1\100",
            "\1\104\6\uffff\1\103\1\uffff\1\102",
            "\1\105",
            "\1\107\3\uffff\1\110\5\uffff\1\106",
            "\1\113\2\uffff\1\114\3\uffff\1\111\3\uffff\1\115\2\uffff\1"+
            "\112",
            "\1\117\7\uffff\1\116",
            "\1\60\4\uffff\1\57\75\uffff\1\121\11\uffff\1\120",
            "\1\122\2\uffff\1\123",
            "\1\125\6\uffff\1\126\2\uffff\1\124",
            "\1\132\34\uffff\1\130\2\uffff\1\132\1\uffff\1\127\4\uffff"+
            "\1\131",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\137\1\uffff\12\140",
            "\1\142\21\uffff\1\143",
            "\1\145\17\uffff\1\147\1\146",
            "\1\152\4\uffff\1\153\15\uffff\1\151",
            "\1\155",
            "\1\160\26\uffff\1\157",
            "",
            "\1\162",
            "\1\164\1\165",
            "\1\170\1\167",
            "\1\172",
            "\1\174\76\uffff\1\175",
            "",
            "\1\u0080\2\uffff\1\177",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\2\uffff\1\u0084",
            "\1\u0085\15\uffff\1\u0086",
            "\1\132\37\uffff\1\132",
            "\1\60\4\uffff\1\57",
            "",
            "",
            "",
            "\1\140\1\uffff\10\u0089\2\140\12\uffff\3\140\21\uffff\1\u0087"+
            "\13\uffff\3\140\21\uffff\1\u0087",
            "\1\140\1\uffff\12\u008a\12\uffff\3\140\35\uffff\3\140",
            "",
            "",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091\20\uffff\1\u0092",
            "\1\u0093",
            "\1\u0094\22\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a\15\uffff\1\u009b",
            "\1\u009c\14\uffff\1\u009d",
            "\1\u009e\2\uffff\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a8\7\uffff\1\u00a7",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\24"+
            "\56\1\u00ae\5\56",
            "\1\u00b0\11\uffff\1\u00b1\2\uffff\1\u00b2",
            "\1\u00b3",
            "\1\u00b5\11\uffff\1\u00b4\1\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\60\4\uffff\1\57",
            "\1\u00ba\1\u00b9\1\u00bb\1\u00bd\1\u00be\1\u00bf\5\uffff\1"+
            "\u00c2\1\u00c3\1\u00c4\1\uffff\1\u00c0\2\uffff\1\u00c1\1\u00c6"+
            "\1\u00c5\1\u00bc\1\u00c7",
            "\1\u00c9\4\uffff\1\u00ca\3\uffff\1\u00c8\1\uffff\1\u00cb",
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
            "\1\u00cc",
            "",
            "",
            "\1\u00ce",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\140\1\uffff\10\u0089\2\140\12\uffff\3\140\35\uffff\3\140",
            "\1\140\1\uffff\12\u008a\12\uffff\3\140\35\uffff\3\140",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e1\16\uffff\1\u00e0",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u00e8\1\uffff"+
            "\32\56",
            "\1\u00ea\5\uffff\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\56\13\uffff\1\56\1\u00fa\1\56\1\u00fb\2\56\1\u00fc\1\56"+
            "\1\u00f9\1\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\14"+
            "\56\1\u0102\15\56",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108\3\uffff\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0112\6\uffff\1\u0110\1\u0111",
            "\1\u0114\7\uffff\1\u0115\2\uffff\1\u0113",
            "\1\u0117\3\uffff\1\u0118\5\uffff\1\u0116",
            "\1\u0119\6\uffff\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d\2\uffff\1\u011e",
            "\1\u011f\20\uffff\1\u0120",
            "\1\u0121",
            "\1\u0122\15\uffff\1\u0123",
            "\1\u0124",
            "\1\u0126\4\uffff\1\u0125",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "",
            "",
            "",
            "",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013e\6\uffff\1\u013d",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0145",
            "",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0150",
            "\1\u0151",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "",
            "\1\u0159",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u015b\1\uffff"+
            "\32\56",
            "\1\u015d",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0169\1\uffff\1\u016a\2\uffff\1\u016b\1\uffff\1\u0168",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u016c\1\uffff"+
            "\32\56",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171\15\uffff\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179\2\uffff\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185\4\uffff\1\u0187\3\uffff\1\u0186\1\uffff\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0192\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0195",
            "\1\u0196",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0197\1\uffff"+
            "\32\56",
            "\1\u0199",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u019a\1\uffff"+
            "\32\56",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u01a8\1\uffff"+
            "\32\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u01ab\1\uffff"+
            "\32\56",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u01b4\1\uffff"+
            "\21\56\1\u01b5\10\56",
            "\1\u01b7",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u01b8\1\uffff"+
            "\32\56",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u01d2\1\uffff"+
            "\32\56",
            "\1\u01d4",
            "\1\u01d5\5\uffff\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0\3\uffff\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u01f8",
            "",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u01fa",
            "\1\u01fb",
            "",
            "\1\u01fc",
            "\1\u01fd",
            "",
            "\1\u01fe",
            "\1\u01ff",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0201",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0204",
            "\1\u0205",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0209",
            "",
            "",
            "\1\u020a",
            "",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u020f",
            "\1\u0210",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "",
            "\1\u0214",
            "\1\u0215",
            "",
            "\1\u0216",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u021d\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\1\u0225",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0226\1\uffff"+
            "\32\56",
            "\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u022d",
            "\1\u022e",
            "",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0240\1\uffff"+
            "\32\56",
            "\1\u0242",
            "\1\u0244\6\uffff\1\u0243",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0245\1\uffff"+
            "\32\56",
            "\1\u0247",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0248\1\uffff"+
            "\32\56",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u024e\1\uffff"+
            "\32\56",
            "\1\u0250",
            "\1\u0251",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0252\1\uffff"+
            "\32\56",
            "\1\u0254",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0259\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u025c\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0260",
            "",
            "\1\u0261",
            "",
            "",
            "\1\u0262",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0263\1\uffff"+
            "\32\56",
            "",
            "",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0267\1\uffff"+
            "\32\56",
            "\1\u0269",
            "\1\u026a",
            "",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u026f",
            "\1\u0270",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0272\1\uffff"+
            "\32\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u0277",
            "",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\1\u027d",
            "\1\u027e",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "",
            "\1\u0283",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0285",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0286\1\uffff"+
            "\32\56",
            "\1\u0288",
            "\1\u0289",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u028a\1\uffff"+
            "\21\56\1\u028b\10\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u028d\1\uffff"+
            "\32\56",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u029b\1\uffff"+
            "\32\56",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "",
            "\1\u02a0",
            "\1\u02a1",
            "",
            "\1\u02a2",
            "\1\u02a3",
            "\1\u02a4",
            "\1\u02a5",
            "\1\u02a6",
            "",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "",
            "\1\u02aa",
            "\1\u02ab",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02ac\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02ae\1\uffff"+
            "\32\56",
            "",
            "\1\u02b0",
            "",
            "",
            "\1\u02b1",
            "",
            "",
            "",
            "\1\u02b2",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02b3\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02b5\1\uffff"+
            "\32\56",
            "\1\u02b7",
            "",
            "",
            "",
            "\1\u02b8",
            "",
            "\1\u02b9",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02bb\1\uffff"+
            "\32\56",
            "\1\u02bd",
            "\1\u02be",
            "",
            "\1\u02bf",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\u02c1",
            "",
            "",
            "",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5",
            "\1\u02c6",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u02cc",
            "",
            "\1\u02cd",
            "\1\u02ce",
            "",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "",
            "\1\u02d3",
            "",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02dd\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02df\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u02e2",
            "",
            "\1\u02e3",
            "\1\u02e4",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02e6\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u02e9",
            "\1\u02ea",
            "\1\u02eb",
            "\1\u02ec",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02ee\1\uffff"+
            "\32\56",
            "\1\u02f0",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02f2\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u02f4\1\uffff"+
            "\32\56",
            "\1\u02f6",
            "",
            "\1\u02f7",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u02fa",
            "\1\u02fb",
            "",
            "\1\u02fc",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u02ff",
            "",
            "\1\u0300",
            "",
            "\1\u0301",
            "\1\u0302",
            "\1\u0303",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\u0305",
            "\1\u0306",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0307\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0309\1\uffff"+
            "\32\56",
            "",
            "",
            "",
            "",
            "",
            "\1\u030b",
            "\1\u030c",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u030e\1\uffff"+
            "\32\56",
            "\1\u0310",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0312",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0314\1\uffff"+
            "\32\56",
            "\1\u0316",
            "\1\u0317",
            "\1\u0318",
            "\1\u0319",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\1\u031d",
            "\1\u031e",
            "",
            "\1\u031f",
            "",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0321",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0322\1\uffff"+
            "\32\56",
            "",
            "\1\u0324",
            "",
            "",
            "\1\u0325",
            "\1\u0326",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0327\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0329\1\uffff"+
            "\32\56",
            "",
            "\1\u032b",
            "",
            "\1\u032c",
            "",
            "\1\u032d",
            "",
            "\1\u032e",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u0331",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u0334",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0336",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0337\1\uffff"+
            "\32\56",
            "\1\u0339",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u033a\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u033c\1\uffff"+
            "\32\56",
            "\1\u033e",
            "",
            "\1\u033f",
            "",
            "\1\u0340",
            "\1\u0341",
            "",
            "\1\u0342",
            "",
            "\1\u0343",
            "",
            "\1\u0344",
            "",
            "\1\u0345",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0346\1\uffff"+
            "\32\56",
            "\1\u0348",
            "\1\u0349",
            "\1\u034a",
            "\1\u034b",
            "\1\u034c",
            "\1\u034d",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u034e\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0352\1\uffff"+
            "\32\56",
            "\1\u0354",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0356\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0358\1\uffff"+
            "\32\56",
            "\1\u035a",
            "",
            "\1\u035b",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u035d",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u0360",
            "",
            "",
            "\1\u0361",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0362\1\uffff"+
            "\32\56",
            "\1\u0364",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0365\1\uffff"+
            "\32\56",
            "\1\u0367",
            "",
            "\1\u0368",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u036b",
            "\1\u036c",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u036e",
            "\1\u036f",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0371",
            "",
            "\1\u0372",
            "\1\u0373",
            "\1\u0374",
            "\1\u0375",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0376\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0378\1\uffff"+
            "\32\56",
            "\1\u037a",
            "",
            "",
            "",
            "\1\u037b",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\u037d",
            "",
            "\1\u037e",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\u0381",
            "",
            "",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u0386",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u0389",
            "\1\u038a",
            "",
            "\1\u038b",
            "\1\u038c",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u038e",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u038f\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0391\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u0393\1\uffff"+
            "\32\56",
            "\1\u0395",
            "",
            "\1\u0396",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u039b",
            "\1\u039c",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u039d\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u03a1",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u03a3",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u03a4\1\uffff"+
            "\32\56",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u03a6\1\uffff"+
            "\32\56",
            "\1\u03a8",
            "",
            "\1\u03a9",
            "",
            "\1\u03aa",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "",
            "",
            "\1\u03ad",
            "\1\u03ae",
            "\1\u03af",
            "",
            "",
            "",
            "\1\u03b0",
            "",
            "\1\u03b1",
            "\1\u03b2",
            "",
            "\1\u03b3",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "\1\u03b7",
            "\1\u03b8",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u03ba",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u03bb\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "",
            "",
            "",
            "\1\u03bf",
            "\1\u03c0",
            "",
            "\1\u03c1",
            "\1\u03c2",
            "",
            "",
            "",
            "\1\u03c3",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u03c4\1\uffff"+
            "\32\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\u03c8",
            "\1\u03c9",
            "",
            "",
            "",
            "\1\u03ca",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\u03cc\1\uffff"+
            "\32\56",
            "",
            "\1\u03ce",
            "",
            "\1\56\13\uffff\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32"+
            "\56",
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
            return "1:1: Tokens : ( T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | T__117 | T__118 | T__119 | T__120 | T__121 | T__122 | T__123 | T__124 | T__125 | T__126 | T__127 | T__128 | T__129 | T__130 | T__131 | T__132 | T__133 | T__134 | T__135 | T__136 | T__137 | T__138 | T__139 | T__140 | T__141 | T__142 | T__143 | T__144 | T__145 | T__146 | T__147 | T__148 | T__149 | T__150 | T__151 | T__152 | T__153 | T__154 | T__155 | T__156 | T__157 | T__158 | T__159 | T__160 | T__161 | T__162 | T__163 | T__164 | T__165 | T__166 | T__167 | T__168 | T__169 | T__170 | T__171 | T__172 | T__173 | T__174 | T__175 | T__176 | T__177 | T__178 | T__179 | T__180 | T__181 | T__182 | T__183 | T__184 | T__185 | T__186 | T__187 | T__188 | T__189 | T__190 | T__191 | T__192 | T__193 | T__194 | T__195 | T__196 | T__197 | T__198 | T__199 | T__200 | T__201 | T__202 | T__203 | T__204 | T__205 | T__206 | T__207 | T__208 | T__209 | T__210 | T__211 | T__212 | T__213 | T__214 | T__215 | T__216 | T__217 | T__218 | T__219 | T__220 | T__221 | T__222 | T__223 | T__224 | T__225 | T__226 | T__227 | T__228 | T__229 | T__230 | T__231 | T__232 | T__233 | T__234 | T__235 | T__236 | T__237 | T__238 | T__239 | T__240 | T__241 | T__242 | T__243 | T__244 | T__245 | T__246 | T__247 | T__248 | T__249 | T__250 | T__251 | T__252 | T__253 | T__254 | T__255 | T__256 | T__257 | T__258 | T__259 | T__260 | T__261 | T__262 | T__263 | T__264 | T__265 | T__266 | T__267 | T__268 | T__269 | T__270 | T__271 | T__272 | T__273 | T__274 | T__275 | T__276 | T__277 | T__278 | T__279 | IDENTIFIER | CHARACTER_LITERAL | STRING_LITERAL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | WS | COMMENT | LINE_COMMENT | LINE_COMMAND );";
        }
    }
 

}