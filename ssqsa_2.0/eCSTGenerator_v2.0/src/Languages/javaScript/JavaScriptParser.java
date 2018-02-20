// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g 2017-03-03 17:26:10

  package Languages.javaScript;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JavaScriptParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NULL", "TRUE", "FALSE", "BREAK", "CASE", "CATCH", "CONTINUE", "DEFAULT", "DELETE", "DO", "ELSE", "FINALLY", "FOR", "FUNCTION", "IF", "IN", "INSTANCEOF", "NEW", "RETURN", "SWITCH", "THIS", "THROW", "TRY", "TYPEOF", "VAR", "VOID", "WHILE", "WITH", "ABSTRACT", "BOOLEAN", "BYTE", "CHAR", "CLASS", "CONST_", "DEBUGGER", "DOUBLE", "ENUM", "EXPORT", "EXTENDS", "FINAL", "FLOAT", "GOTO", "IMPLEMENTS", "IMPORT", "INT", "INTERFACE", "LONG", "NATIVE", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "SHORT", "STATIC", "SUPER", "SYNCHRONIZED", "THROWS", "TRANSIENT", "VOLATILE", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "DOT", "SEMIC", "COMMA", "LT", "GT", "LTE", "GTE", "EQ", "NEQ", "SAME", "NSAME", "ADD", "SUB", "MUL", "MOD", "INC", "DEC", "SHL", "SHR", "SHU", "AND", "OR", "XOR", "NOT", "INV", "LAND", "LOR", "QUE", "COLON", "ASSIGN", "ADDASS", "SUBASS", "MULASS", "MODASS", "SHLASS", "SHRASS", "SHUASS", "ANDASS", "ORASS", "XORASS", "DIV", "DIVASS", "ARGS", "ARRAY", "BLOCK", "BYFIELD", "BYINDEX", "CALL", "CEXPR", "EXPR", "FORITER", "FORSTEP", "ITEM", "LABELLED", "NAMEDVALUE", "NEG", "OBJECT", "PAREXPR", "PDEC", "PINC", "POS", "COMPILATION_UNIT", "PACKAGE_DECL", "CONCRETE_UNIT_DECL", "INTERFACE_UNIT_DECL", "FUNCTION_DECL", "TYPE_DECL", "ATTRIBUTE_DECL", "VAR_DECL", "BLOCK_SCOPE", "MAIN_BLOCK_SCOPE", "IMPORT_DECL", "INSTANTIATES", "FORMAL_PARAM_LIST", "PARAMETER_DECL", "FUNCTION_CALL", "ARGUMENT_LIST", "ARGUMENT", "TYPE", "NAME", "BRANCH", "BRANCH_STATEMENT", "CONDITION", "JUMP_STATEMENT", "LOOP_STATEMENT", "INIT", "STEP", "LOGICAL_OPERATOR", "KEYWORD", "OPERATOR", "SEPARATOR", "DIRECTIVE", "CONST", "VAR_DECL_PARENT", "ASSIGNMENT_STATEMENT", "ASSIGN_OPERATOR", "VALUE", "COMPARISON_OPERATOR", "BSLASH", "DQUOTE", "SQUOTE", "TAB", "VT", "FF", "SP", "NBSP", "USP", "WhiteSpace", "LF", "CR", "LS", "PS", "LineTerminator", "EOL", "MultiLineComment", "SingleLineComment", "Identifier", "StringLiteral", "HexDigit", "IdentifierStartASCII", "DecimalDigit", "IdentifierPart", "IdentifierNameASCIIStart", "RegularExpressionLiteral", "OctalDigit", "ExponentPart", "DecimalIntegerLiteral", "DecimalLiteral", "OctalIntegerLiteral", "HexIntegerLiteral", "CharacterEscapeSequence", "ZeroToThree", "OctalEscapeSequence", "HexEscapeSequence", "UnicodeEscapeSequence", "EscapeSequence", "BackslashSequence", "RegularExpressionFirstChar", "RegularExpressionChar"
    };
    public static final int SHR=87;
    public static final int PACKAGE=52;
    public static final int FUNCTION=17;
    public static final int VT=171;
    public static final int RegularExpressionChar=207;
    public static final int SHL=86;
    public static final int MOD=83;
    public static final int CONST=161;
    public static final int DO=13;
    public static final int DQUOTE=168;
    public static final int CONDITION=151;
    public static final int SEPARATOR=159;
    public static final int NOT=92;
    public static final int EOF=-1;
    public static final int CEXPR=117;
    public static final int DIVASS=110;
    public static final int TYPE=147;
    public static final int BYINDEX=115;
    public static final int INC=84;
    public static final int RPAREN=66;
    public static final int FINAL=43;
    public static final int FORSTEP=120;
    public static final int IMPORT=47;
    public static final int EOL=182;
    public static final int LOGICAL_OPERATOR=156;
    public static final int COMPILATION_UNIT=130;
    public static final int OctalDigit=193;
    public static final int RETURN=22;
    public static final int THIS=24;
    public static final int ARGS=111;
    public static final int WhiteSpace=176;
    public static final int EXPORT=41;
    public static final int EQ=76;
    public static final int GOTO=45;
    public static final int TYPE_DECL=135;
    public static final int XORASS=108;
    public static final int SHU=88;
    public static final int RBRACK=68;
    public static final int KEYWORD=157;
    public static final int RBRACE=64;
    public static final int STATIC=57;
    public static final int INV=93;
    public static final int ELSE=14;
    public static final int NATIVE=51;
    public static final int INT=48;
    public static final int VALUE=165;
    public static final int FF=172;
    public static final int OctalEscapeSequence=201;
    public static final int ATTRIBUTE_DECL=136;
    public static final int RegularExpressionFirstChar=206;
    public static final int TYPEOF=27;
    public static final int GT=73;
    public static final int FUNCTION_DECL=134;
    public static final int CALL=116;
    public static final int CharacterEscapeSequence=199;
    public static final int FUNCTION_CALL=144;
    public static final int INIT=154;
    public static final int LAND=94;
    public static final int PINC=128;
    public static final int PROTECTED=54;
    public static final int LBRACK=67;
    public static final int LBRACE=63;
    public static final int CONST_=37;
    public static final int MAIN_BLOCK_SCOPE=139;
    public static final int STEP=155;
    public static final int RegularExpressionLiteral=192;
    public static final int SUB=81;
    public static final int FLOAT=44;
    public static final int DecimalIntegerLiteral=195;
    public static final int HexDigit=187;
    public static final int LPAREN=65;
    public static final int PARAMETER_DECL=143;
    public static final int IMPLEMENTS=46;
    public static final int ARGUMENT=146;
    public static final int SHRASS=104;
    public static final int PS=180;
    public static final int MultiLineComment=183;
    public static final int ADD=80;
    public static final int ZeroToThree=200;
    public static final int COMPARISON_OPERATOR=166;
    public static final int ITEM=121;
    public static final int JUMP_STATEMENT=152;
    public static final int ASSIGN_OPERATOR=164;
    public static final int UnicodeEscapeSequence=203;
    public static final int SHUASS=105;
    public static final int SHORT=56;
    public static final int INSTANCEOF=20;
    public static final int INSTANTIATES=141;
    public static final int SQUOTE=169;
    public static final int PACKAGE_DECL=131;
    public static final int SAME=78;
    public static final int COLON=97;
    public static final int StringLiteral=186;
    public static final int PAREXPR=126;
    public static final int ENUM=40;
    public static final int HexIntegerLiteral=198;
    public static final int NBSP=174;
    public static final int SP=173;
    public static final int BLOCK=113;
    public static final int LineTerminator=181;
    public static final int BRANCH=149;
    public static final int INTERFACE=49;
    public static final int DIV=109;
    public static final int LONG=50;
    public static final int CR=178;
    public static final int PUBLIC=55;
    public static final int LOR=95;
    public static final int LT=72;
    public static final int WHILE=30;
    public static final int BackslashSequence=205;
    public static final int LS=179;
    public static final int CASE=8;
    public static final int ASSIGNMENT_STATEMENT=163;
    public static final int NEW=21;
    public static final int CHAR=35;
    public static final int CONCRETE_UNIT_DECL=132;
    public static final int VAR_DECL=137;
    public static final int LOOP_STATEMENT=153;
    public static final int DecimalDigit=189;
    public static final int BYFIELD=114;
    public static final int BREAK=7;
    public static final int Identifier=185;
    public static final int NAME=148;
    public static final int POS=129;
    public static final int ExponentPart=194;
    public static final int DOUBLE=39;
    public static final int VAR=28;
    public static final int VOID=29;
    public static final int SUPER=58;
    public static final int LABELLED=122;
    public static final int ADDASS=99;
    public static final int ARRAY=112;
    public static final int PRIVATE=53;
    public static final int BLOCK_SCOPE=138;
    public static final int SWITCH=23;
    public static final int NULL=4;
    public static final int THROWS=60;
    public static final int INTERFACE_UNIT_DECL=133;
    public static final int DELETE=12;
    public static final int BRANCH_STATEMENT=150;
    public static final int MUL=82;
    public static final int IdentifierStartASCII=188;
    public static final int TRY=26;
    public static final int SHLASS=103;
    public static final int USP=175;
    public static final int ANDASS=106;
    public static final int IdentifierNameASCIIStart=191;
    public static final int QUE=96;
    public static final int OR=90;
    public static final int DEBUGGER=38;
    public static final int PDEC=127;
    public static final int CATCH=9;
    public static final int FALSE=6;
    public static final int EscapeSequence=204;
    public static final int THROW=25;
    public static final int MULASS=101;
    public static final int OctalIntegerLiteral=197;
    public static final int DEC=85;
    public static final int CLASS=36;
    public static final int HexEscapeSequence=202;
    public static final int ORASS=107;
    public static final int NAMEDVALUE=123;
    public static final int SingleLineComment=184;
    public static final int GTE=75;
    public static final int FOR=16;
    public static final int ABSTRACT=32;
    public static final int AND=89;
    public static final int DIRECTIVE=160;
    public static final int LTE=74;
    public static final int IF=18;
    public static final int SUBASS=100;
    public static final int SYNCHRONIZED=59;
    public static final int BOOLEAN=33;
    public static final int EXPR=118;
    public static final int IN=19;
    public static final int CONTINUE=10;
    public static final int OBJECT=125;
    public static final int COMMA=71;
    public static final int TRANSIENT=61;
    public static final int FORITER=119;
    public static final int ARGUMENT_LIST=145;
    public static final int MODASS=102;
    public static final int DOT=69;
    public static final int FORMAL_PARAM_LIST=142;
    public static final int IdentifierPart=190;
    public static final int WITH=31;
    public static final int BYTE=34;
    public static final int XOR=91;
    public static final int VOLATILE=62;
    public static final int OPERATOR=158;
    public static final int IMPORT_DECL=140;
    public static final int NSAME=79;
    public static final int DEFAULT=11;
    public static final int VAR_DECL_PARENT=162;
    public static final int TAB=170;
    public static final int DecimalLiteral=196;
    public static final int TRUE=5;
    public static final int NEQ=77;
    public static final int FINALLY=15;
    public static final int NEG=124;
    public static final int ASSIGN=98;
    public static final int SEMIC=70;
    public static final int EXTENDS=42;
    public static final int BSLASH=167;
    public static final int LF=177;

    // delegates
    // delegators


        public JavaScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JavaScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JavaScriptParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g"; }


    private final boolean isLeftHandSideAssign(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result;
    	if (isLeftHandSideExpression(lhs))
    	{
    		switch (input.LA(1))
    		{
    			case ASSIGN:
    			case MULASS:
    			case DIVASS:
    			case MODASS:
    			case ADDASS:
    			case SUBASS:
    			case SHLASS:
    			case SHRASS:
    			case SHUASS:
    			case ANDASS:
    			case XORASS:
    			case ORASS:
    				result = true;
    				break;
    			default:
    				result = false;
    				break;
    		}
    	}
    	else
    	{
    		result = false;
    	}
    	
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final static boolean isLeftHandSideExpression(RuleReturnScope lhs)
    {
    	if (lhs.getTree() == null) // e.g. during backtracking
    	{
    		return true;
    	}
    	else
    	{
    		switch (((Tree)lhs.getTree()).getType())
    		{
    		// primaryExpression
    			case THIS:
    			case Identifier:
    			case NULL:
    			case TRUE:
    			case FALSE:
    			case DecimalLiteral:
    			case OctalIntegerLiteral:
    			case HexIntegerLiteral:
    			case StringLiteral:
    			case RegularExpressionLiteral:
    			case ARRAY:
    			case OBJECT:
    			case PAREXPR:
    		// functionExpression
    			case FUNCTION:
    		// newExpression
    			case NEW:
    		// leftHandSideExpression
    			case CALL:
    			case BYFIELD:
    			case BYINDEX:
    				return true;
    			
    			default:
    				return false;
    		}
    	}
    }
    	
    private final boolean isLeftHandSideIn(RuleReturnScope lhs, Object[] cached)
    {
    	if (cached[0] != null)
    	{
    		return ((Boolean)cached[0]).booleanValue();
    	}
    	
    	boolean result = isLeftHandSideExpression(lhs) && (input.LA(1) == IN);
    	cached[0] = new Boolean(result);
    	return result;
    }

    private final void promoteEOL(ParserRuleReturnScope rule)
    {
    	// Get current token and its type (the possibly offending token).
    	Token lt = input.LT(1);
    	int la = lt.getType();
    	
    	// We only need to promote an EOL when the current token is offending (not a SEMIC, EOF, RBRACE, EOL or MultiLineComment).
    	// EOL and MultiLineComment are not offending as they're already promoted in a previous call to this method.
    	// Promoting an EOL means switching it from off channel to on channel.
    	// A MultiLineComment gets promoted when it contains an EOL.
    	if (!(la == SEMIC || la == EOF || la == RBRACE || la == EOL || la == MultiLineComment))
    	{
    		// Start on the possition before the current token and scan backwards off channel tokens until the previous on channel token.
    		for (int ix = lt.getTokenIndex() - 1; ix > 0; ix--)
    		{
    			lt = input.get(ix);
    			if (lt.getChannel() == Token.DEFAULT_CHANNEL)
    			{
    				// On channel token found: stop scanning.
    				break;
    			}
    			else if (lt.getType() == EOL || (lt.getType() == MultiLineComment && lt.getText().matches("/.*\r\n|\r|\n")))
    			{
    				// We found our EOL: promote the token to on channel, position the input on it and reset the rule start.
    				lt.setChannel(Token.DEFAULT_CHANNEL);
    				input.seek(lt.getTokenIndex());
    				if (rule != null)
    				{
    					rule.start = lt;
    				}
    				break;
    			}
    		}
    	}
    }	


    public static class token_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "token"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:516:1: token : ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral );
    public final JavaScriptParser.token_return token() throws RecognitionException {
        JavaScriptParser.token_return retval = new JavaScriptParser.token_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier2=null;
        Token StringLiteral5=null;
        JavaScriptParser.reservedWord_return reservedWord1 = null;

        JavaScriptParser.punctuator_return punctuator3 = null;

        JavaScriptParser.numericLiteral_return numericLiteral4 = null;


        CommonTree Identifier2_tree=null;
        CommonTree StringLiteral5_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:517:2: ( reservedWord | Identifier | punctuator | numericLiteral | StringLiteral )
            int alt1=5;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST_:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt1=1;
                }
                break;
            case Identifier:
                {
                alt1=2;
                }
                break;
            case LBRACE:
            case RBRACE:
            case LPAREN:
            case RPAREN:
            case LBRACK:
            case RBRACK:
            case DOT:
            case SEMIC:
            case COMMA:
            case LT:
            case GT:
            case LTE:
            case GTE:
            case EQ:
            case NEQ:
            case SAME:
            case NSAME:
            case ADD:
            case SUB:
            case MUL:
            case MOD:
            case INC:
            case DEC:
            case SHL:
            case SHR:
            case SHU:
            case AND:
            case OR:
            case XOR:
            case NOT:
            case INV:
            case LAND:
            case LOR:
            case QUE:
            case COLON:
            case ASSIGN:
            case ADDASS:
            case SUBASS:
            case MULASS:
            case MODASS:
            case SHLASS:
            case SHRASS:
            case SHUASS:
            case ANDASS:
            case ORASS:
            case XORASS:
            case DIV:
            case DIVASS:
                {
                alt1=3;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt1=4;
                }
                break;
            case StringLiteral:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:517:4: reservedWord
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_reservedWord_in_token2158);
                    reservedWord1=reservedWord();

                    state._fsp--;

                    adaptor.addChild(root_0, reservedWord1.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:518:4: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_token2163); 
                    Identifier2_tree = (CommonTree)adaptor.create(Identifier2);
                    adaptor.addChild(root_0, Identifier2_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:519:4: punctuator
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_punctuator_in_token2168);
                    punctuator3=punctuator();

                    state._fsp--;

                    adaptor.addChild(root_0, punctuator3.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:520:4: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_token2173);
                    numericLiteral4=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral4.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:521:4: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    StringLiteral5=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_token2178); 
                    StringLiteral5_tree = (CommonTree)adaptor.create(StringLiteral5);
                    adaptor.addChild(root_0, StringLiteral5_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "token"

    public static class reservedWord_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "reservedWord"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:526:1: reservedWord : ( keyword | futureReservedWord | NULL | booleanLiteral );
    public final JavaScriptParser.reservedWord_return reservedWord() throws RecognitionException {
        JavaScriptParser.reservedWord_return retval = new JavaScriptParser.reservedWord_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NULL8=null;
        JavaScriptParser.keyword_return keyword6 = null;

        JavaScriptParser.futureReservedWord_return futureReservedWord7 = null;

        JavaScriptParser.booleanLiteral_return booleanLiteral9 = null;


        CommonTree NULL8_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:527:2: ( keyword | futureReservedWord | NULL | booleanLiteral )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BREAK:
            case CASE:
            case CATCH:
            case CONTINUE:
            case DEFAULT:
            case DELETE:
            case DO:
            case ELSE:
            case FINALLY:
            case FOR:
            case FUNCTION:
            case IF:
            case IN:
            case INSTANCEOF:
            case NEW:
            case RETURN:
            case SWITCH:
            case THIS:
            case THROW:
            case TRY:
            case TYPEOF:
            case VAR:
            case VOID:
            case WHILE:
            case WITH:
                {
                alt2=1;
                }
                break;
            case ABSTRACT:
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case CLASS:
            case CONST_:
            case DEBUGGER:
            case DOUBLE:
            case ENUM:
            case EXPORT:
            case EXTENDS:
            case FINAL:
            case FLOAT:
            case GOTO:
            case IMPLEMENTS:
            case IMPORT:
            case INT:
            case INTERFACE:
            case LONG:
            case NATIVE:
            case PACKAGE:
            case PRIVATE:
            case PROTECTED:
            case PUBLIC:
            case SHORT:
            case STATIC:
            case SUPER:
            case SYNCHRONIZED:
            case THROWS:
            case TRANSIENT:
            case VOLATILE:
                {
                alt2=2;
                }
                break;
            case NULL:
                {
                alt2=3;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:527:4: keyword
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_keyword_in_reservedWord2191);
                    keyword6=keyword();

                    state._fsp--;

                    adaptor.addChild(root_0, keyword6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:528:4: futureReservedWord
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_futureReservedWord_in_reservedWord2196);
                    futureReservedWord7=futureReservedWord();

                    state._fsp--;

                    adaptor.addChild(root_0, futureReservedWord7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:529:4: NULL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NULL8=(Token)match(input,NULL,FOLLOW_NULL_in_reservedWord2201); 
                    NULL8_tree = (CommonTree)adaptor.create(NULL8);
                    adaptor.addChild(root_0, NULL8_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:530:4: booleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_booleanLiteral_in_reservedWord2206);
                    booleanLiteral9=booleanLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, booleanLiteral9.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "reservedWord"

    public static class keyword_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:537:1: keyword : ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH );
    public final JavaScriptParser.keyword_return keyword() throws RecognitionException {
        JavaScriptParser.keyword_return retval = new JavaScriptParser.keyword_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set10=null;

        CommonTree set10_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:538:2: ( BREAK | CASE | CATCH | CONTINUE | DEFAULT | DELETE | DO | ELSE | FINALLY | FOR | FUNCTION | IF | IN | INSTANCEOF | NEW | RETURN | SWITCH | THIS | THROW | TRY | TYPEOF | VAR | VOID | WHILE | WITH )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set10=(Token)input.LT(1);
            if ( (input.LA(1)>=BREAK && input.LA(1)<=WITH) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set10));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class futureReservedWord_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "futureReservedWord"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:569:1: futureReservedWord : ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST_ | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE );
    public final JavaScriptParser.futureReservedWord_return futureReservedWord() throws RecognitionException {
        JavaScriptParser.futureReservedWord_return retval = new JavaScriptParser.futureReservedWord_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:570:2: ( ABSTRACT | BOOLEAN | BYTE | CHAR | CLASS | CONST_ | DEBUGGER | DOUBLE | ENUM | EXPORT | EXTENDS | FINAL | FLOAT | GOTO | IMPLEMENTS | IMPORT | INT | INTERFACE | LONG | NATIVE | PACKAGE | PRIVATE | PROTECTED | PUBLIC | SHORT | STATIC | SUPER | SYNCHRONIZED | THROWS | TRANSIENT | VOLATILE )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set11=(Token)input.LT(1);
            if ( (input.LA(1)>=ABSTRACT && input.LA(1)<=VOLATILE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set11));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "futureReservedWord"

    public static class punctuator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "punctuator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:647:1: punctuator : ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS );
    public final JavaScriptParser.punctuator_return punctuator() throws RecognitionException {
        JavaScriptParser.punctuator_return retval = new JavaScriptParser.punctuator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set12=null;

        CommonTree set12_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:648:2: ( LBRACE | RBRACE | LPAREN | RPAREN | LBRACK | RBRACK | DOT | SEMIC | COMMA | LT | GT | LTE | GTE | EQ | NEQ | SAME | NSAME | ADD | SUB | MUL | MOD | INC | DEC | SHL | SHR | SHU | AND | OR | XOR | NOT | INV | LAND | LOR | QUE | COLON | ASSIGN | ADDASS | SUBASS | MULASS | MODASS | SHLASS | SHRASS | SHUASS | ANDASS | ORASS | XORASS | DIV | DIVASS )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set12=(Token)input.LT(1);
            if ( (input.LA(1)>=LBRACE && input.LA(1)<=DIVASS) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set12));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "punctuator"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:702:1: literal : ( NULL -> NULL | booleanLiteral -> booleanLiteral | numericLiteral -> numericLiteral | StringLiteral -> StringLiteral | RegularExpressionLiteral -> RegularExpressionLiteral );
    public final JavaScriptParser.literal_return literal() throws RecognitionException {
        JavaScriptParser.literal_return retval = new JavaScriptParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NULL13=null;
        Token StringLiteral16=null;
        Token RegularExpressionLiteral17=null;
        JavaScriptParser.booleanLiteral_return booleanLiteral14 = null;

        JavaScriptParser.numericLiteral_return numericLiteral15 = null;


        CommonTree NULL13_tree=null;
        CommonTree StringLiteral16_tree=null;
        CommonTree RegularExpressionLiteral17_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_RegularExpressionLiteral=new RewriteRuleTokenStream(adaptor,"token RegularExpressionLiteral");
        RewriteRuleTokenStream stream_NULL=new RewriteRuleTokenStream(adaptor,"token NULL");
        RewriteRuleSubtreeStream stream_booleanLiteral=new RewriteRuleSubtreeStream(adaptor,"rule booleanLiteral");
        RewriteRuleSubtreeStream stream_numericLiteral=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteral");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:703:2: ( NULL -> NULL | booleanLiteral -> booleanLiteral | numericLiteral -> numericLiteral | StringLiteral -> StringLiteral | RegularExpressionLiteral -> RegularExpressionLiteral )
            int alt3=5;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt3=1;
                }
                break;
            case TRUE:
            case FALSE:
                {
                alt3=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt3=3;
                }
                break;
            case StringLiteral:
                {
                alt3=4;
                }
                break;
            case RegularExpressionLiteral:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:703:4: NULL
                    {
                    NULL13=(Token)match(input,NULL,FOLLOW_NULL_in_literal2888);  
                    stream_NULL.add(NULL13);



                    // AST REWRITE
                    // elements: NULL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 703:9: -> NULL
                    {
                        adaptor.addChild(root_0, stream_NULL.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:704:4: booleanLiteral
                    {
                    pushFollow(FOLLOW_booleanLiteral_in_literal2897);
                    booleanLiteral14=booleanLiteral();

                    state._fsp--;

                    stream_booleanLiteral.add(booleanLiteral14.getTree());


                    // AST REWRITE
                    // elements: booleanLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 704:19: -> booleanLiteral
                    {
                        adaptor.addChild(root_0, stream_booleanLiteral.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:705:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal2906);
                    numericLiteral15=numericLiteral();

                    state._fsp--;

                    stream_numericLiteral.add(numericLiteral15.getTree());


                    // AST REWRITE
                    // elements: numericLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 705:19: -> numericLiteral
                    {
                        adaptor.addChild(root_0, stream_numericLiteral.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:706:4: StringLiteral
                    {
                    StringLiteral16=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal2915);  
                    stream_StringLiteral.add(StringLiteral16);



                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 706:18: -> StringLiteral
                    {
                        adaptor.addChild(root_0, stream_StringLiteral.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:707:4: RegularExpressionLiteral
                    {
                    RegularExpressionLiteral17=(Token)match(input,RegularExpressionLiteral,FOLLOW_RegularExpressionLiteral_in_literal2924);  
                    stream_RegularExpressionLiteral.add(RegularExpressionLiteral17);



                    // AST REWRITE
                    // elements: RegularExpressionLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 707:29: -> RegularExpressionLiteral
                    {
                        adaptor.addChild(root_0, stream_RegularExpressionLiteral.nextNode());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class booleanLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "booleanLiteral"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:710:1: booleanLiteral : ( TRUE | FALSE );
    public final JavaScriptParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
        JavaScriptParser.booleanLiteral_return retval = new JavaScriptParser.booleanLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set18=null;

        CommonTree set18_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:711:2: ( TRUE | FALSE )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set18=(Token)input.LT(1);
            if ( (input.LA(1)>=TRUE && input.LA(1)<=FALSE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set18));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "booleanLiteral"

    public static class numericLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numericLiteral"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:757:1: numericLiteral : ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral );
    public final JavaScriptParser.numericLiteral_return numericLiteral() throws RecognitionException {
        JavaScriptParser.numericLiteral_return retval = new JavaScriptParser.numericLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set19=null;

        CommonTree set19_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:758:2: ( DecimalLiteral | OctalIntegerLiteral | HexIntegerLiteral )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set19=(Token)input.LT(1);
            if ( (input.LA(1)>=DecimalLiteral && input.LA(1)<=HexIntegerLiteral) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set19));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "numericLiteral"

    public static class primaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:845:1: primaryExpression : ( THIS -> ^( NAME THIS ) | Identifier -> ^( NAME Identifier ) | literal -> ^( CONST literal ) | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN -> ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) );
    public final JavaScriptParser.primaryExpression_return primaryExpression() throws RecognitionException {
        JavaScriptParser.primaryExpression_return retval = new JavaScriptParser.primaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lpar=null;
        Token THIS20=null;
        Token Identifier21=null;
        Token RPAREN26=null;
        JavaScriptParser.literal_return literal22 = null;

        JavaScriptParser.arrayLiteral_return arrayLiteral23 = null;

        JavaScriptParser.objectLiteral_return objectLiteral24 = null;

        JavaScriptParser.expression_return expression25 = null;


        CommonTree lpar_tree=null;
        CommonTree THIS20_tree=null;
        CommonTree Identifier21_tree=null;
        CommonTree RPAREN26_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_THIS=new RewriteRuleTokenStream(adaptor,"token THIS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:846:2: ( THIS -> ^( NAME THIS ) | Identifier -> ^( NAME Identifier ) | literal -> ^( CONST literal ) | arrayLiteral | objectLiteral | lpar= LPAREN expression RPAREN -> ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) )
            int alt4=6;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt4=1;
                }
                break;
            case Identifier:
                {
                alt4=2;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt4=3;
                }
                break;
            case LBRACK:
                {
                alt4=4;
                }
                break;
            case LBRACE:
                {
                alt4=5;
                }
                break;
            case LPAREN:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:846:4: THIS
                    {
                    THIS20=(Token)match(input,THIS,FOLLOW_THIS_in_primaryExpression3541);  
                    stream_THIS.add(THIS20);



                    // AST REWRITE
                    // elements: THIS
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 846:9: -> ^( NAME THIS )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:846:12: ^( NAME THIS )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

                        adaptor.addChild(root_1, stream_THIS.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:847:4: Identifier
                    {
                    Identifier21=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpression3554);  
                    stream_Identifier.add(Identifier21);



                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 847:16: -> ^( NAME Identifier )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:847:19: ^( NAME Identifier )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

                        adaptor.addChild(root_1, stream_Identifier.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:848:4: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression3568);
                    literal22=literal();

                    state._fsp--;

                    stream_literal.add(literal22.getTree());


                    // AST REWRITE
                    // elements: literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 848:12: -> ^( CONST literal )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:848:16: ^( CONST literal )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONST, "CONST"), root_1);

                        adaptor.addChild(root_1, stream_literal.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:849:4: arrayLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayLiteral_in_primaryExpression3582);
                    arrayLiteral23=arrayLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayLiteral23.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:850:4: objectLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_objectLiteral_in_primaryExpression3587);
                    objectLiteral24=objectLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, objectLiteral24.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:851:4: lpar= LPAREN expression RPAREN
                    {
                    lpar=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_primaryExpression3594);  
                    stream_LPAREN.add(lpar);

                    pushFollow(FOLLOW_expression_in_primaryExpression3596);
                    expression25=expression();

                    state._fsp--;

                    stream_expression.add(expression25.getTree());
                    RPAREN26=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_primaryExpression3598);  
                    stream_RPAREN.add(RPAREN26);



                    // AST REWRITE
                    // elements: RPAREN, expression, LPAREN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 851:34: -> ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:851:37: ^( SEPARATOR LPAREN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_LPAREN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        adaptor.addChild(root_0, stream_expression.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:851:68: ^( SEPARATOR RPAREN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_RPAREN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "primaryExpression"

    public static class arrayLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayLiteral"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:853:1: arrayLiteral : lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) ;
    public final JavaScriptParser.arrayLiteral_return arrayLiteral() throws RecognitionException {
        JavaScriptParser.arrayLiteral_return retval = new JavaScriptParser.arrayLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token COMMA28=null;
        Token RBRACK30=null;
        JavaScriptParser.arrayItem_return arrayItem27 = null;

        JavaScriptParser.arrayItem_return arrayItem29 = null;


        CommonTree lb_tree=null;
        CommonTree COMMA28_tree=null;
        CommonTree RBRACK30_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_arrayItem=new RewriteRuleSubtreeStream(adaptor,"rule arrayItem");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:854:2: (lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:854:4: lb= LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
            {
            lb=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_arrayLiteral3626);  
            stream_LBRACK.add(lb);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:854:14: ( arrayItem ( COMMA arrayItem )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=NULL && LA6_0<=FALSE)||LA6_0==DELETE||LA6_0==FUNCTION||LA6_0==NEW||LA6_0==THIS||LA6_0==TYPEOF||LA6_0==VOID||LA6_0==LBRACE||LA6_0==LPAREN||LA6_0==LBRACK||LA6_0==COMMA||(LA6_0>=ADD && LA6_0<=SUB)||(LA6_0>=INC && LA6_0<=DEC)||(LA6_0>=NOT && LA6_0<=INV)||(LA6_0>=Identifier && LA6_0<=StringLiteral)||LA6_0==RegularExpressionLiteral||(LA6_0>=DecimalLiteral && LA6_0<=HexIntegerLiteral)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RBRACK) ) {
                int LA6_2 = input.LA(2);

                if ( (( input.LA(1) == COMMA )) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:854:16: arrayItem ( COMMA arrayItem )*
                    {
                    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3630);
                    arrayItem27=arrayItem();

                    state._fsp--;

                    stream_arrayItem.add(arrayItem27.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:854:26: ( COMMA arrayItem )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==COMMA) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:854:28: COMMA arrayItem
                    	    {
                    	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_arrayLiteral3634);  
                    	    stream_COMMA.add(COMMA28);

                    	    pushFollow(FOLLOW_arrayItem_in_arrayLiteral3636);
                    	    arrayItem29=arrayItem();

                    	    state._fsp--;

                    	    stream_arrayItem.add(arrayItem29.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACK30=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_arrayLiteral3644);  
            stream_RBRACK.add(RBRACK30);



            // AST REWRITE
            // elements: arrayItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 855:2: -> ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:855:5: ^( ARRAY[$lb, \"ARRAY\"] ( arrayItem )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARRAY, lb, "ARRAY"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:855:28: ( arrayItem )*
                while ( stream_arrayItem.hasNext() ) {
                    adaptor.addChild(root_1, stream_arrayItem.nextTree());

                }
                stream_arrayItem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "arrayLiteral"

    public static class arrayItem_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayItem"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:858:1: arrayItem : (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) ;
    public final JavaScriptParser.arrayItem_return arrayItem() throws RecognitionException {
        JavaScriptParser.arrayItem_return retval = new JavaScriptParser.arrayItem_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.assignmentExpression_return expr = null;


        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:859:2: ( (expr= assignmentExpression | {...}?) -> ^( ITEM ( $expr)? ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:859:4: (expr= assignmentExpression | {...}?)
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:859:4: (expr= assignmentExpression | {...}?)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=NULL && LA7_0<=FALSE)||LA7_0==DELETE||LA7_0==FUNCTION||LA7_0==NEW||LA7_0==THIS||LA7_0==TYPEOF||LA7_0==VOID||LA7_0==LBRACE||LA7_0==LPAREN||LA7_0==LBRACK||(LA7_0>=ADD && LA7_0<=SUB)||(LA7_0>=INC && LA7_0<=DEC)||(LA7_0>=NOT && LA7_0<=INV)||(LA7_0>=Identifier && LA7_0<=StringLiteral)||LA7_0==RegularExpressionLiteral||(LA7_0>=DecimalLiteral && LA7_0<=HexIntegerLiteral)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RBRACK||LA7_0==COMMA) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:859:6: expr= assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arrayItem3672);
                    expr=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(expr.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:859:34: {...}?
                    {
                    if ( !(( input.LA(1) == COMMA )) ) {
                        throw new FailedPredicateException(input, "arrayItem", " input.LA(1) == COMMA ");
                    }

                    }
                    break;

            }



            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval, expr
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr",expr!=null?expr.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 860:2: -> ^( ITEM ( $expr)? )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:860:5: ^( ITEM ( $expr)? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ITEM, "ITEM"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:860:13: ( $expr)?
                if ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "arrayItem"

    public static class objectLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "objectLiteral"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:863:1: objectLiteral : lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* ) ;
    public final JavaScriptParser.objectLiteral_return objectLiteral() throws RecognitionException {
        JavaScriptParser.objectLiteral_return retval = new JavaScriptParser.objectLiteral_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token COMMA32=null;
        Token RBRACE34=null;
        JavaScriptParser.nameValuePair_return nameValuePair31 = null;

        JavaScriptParser.nameValuePair_return nameValuePair33 = null;


        CommonTree lb_tree=null;
        CommonTree COMMA32_tree=null;
        CommonTree RBRACE34_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_nameValuePair=new RewriteRuleSubtreeStream(adaptor,"rule nameValuePair");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:864:2: (lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:864:4: lb= LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_objectLiteral3704);  
            stream_LBRACE.add(lb);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:864:14: ( nameValuePair ( COMMA nameValuePair )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=Identifier && LA9_0<=StringLiteral)||(LA9_0>=DecimalLiteral && LA9_0<=HexIntegerLiteral)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:864:16: nameValuePair ( COMMA nameValuePair )*
                    {
                    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3708);
                    nameValuePair31=nameValuePair();

                    state._fsp--;

                    stream_nameValuePair.add(nameValuePair31.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:864:30: ( COMMA nameValuePair )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:864:32: COMMA nameValuePair
                    	    {
                    	    COMMA32=(Token)match(input,COMMA,FOLLOW_COMMA_in_objectLiteral3712);  
                    	    stream_COMMA.add(COMMA32);

                    	    pushFollow(FOLLOW_nameValuePair_in_objectLiteral3714);
                    	    nameValuePair33=nameValuePair();

                    	    state._fsp--;

                    	    stream_nameValuePair.add(nameValuePair33.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE34=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_objectLiteral3722);  
            stream_RBRACE.add(RBRACE34);



            // AST REWRITE
            // elements: nameValuePair
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 865:2: -> ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:865:5: ^( OBJECT[$lb, \"OBJECT\"] ( nameValuePair )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OBJECT, lb, "OBJECT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:865:30: ( nameValuePair )*
                while ( stream_nameValuePair.hasNext() ) {
                    adaptor.addChild(root_1, stream_nameValuePair.nextTree());

                }
                stream_nameValuePair.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "objectLiteral"

    public static class nameValuePair_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nameValuePair"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:868:1: nameValuePair : propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) ;
    public final JavaScriptParser.nameValuePair_return nameValuePair() throws RecognitionException {
        JavaScriptParser.nameValuePair_return retval = new JavaScriptParser.nameValuePair_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COLON36=null;
        JavaScriptParser.propertyName_return propertyName35 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression37 = null;


        CommonTree COLON36_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleSubtreeStream stream_propertyName=new RewriteRuleSubtreeStream(adaptor,"rule propertyName");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:869:2: ( propertyName COLON assignmentExpression -> ^( NAMEDVALUE propertyName assignmentExpression ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:869:4: propertyName COLON assignmentExpression
            {
            pushFollow(FOLLOW_propertyName_in_nameValuePair3747);
            propertyName35=propertyName();

            state._fsp--;

            stream_propertyName.add(propertyName35.getTree());
            COLON36=(Token)match(input,COLON,FOLLOW_COLON_in_nameValuePair3749);  
            stream_COLON.add(COLON36);

            pushFollow(FOLLOW_assignmentExpression_in_nameValuePair3751);
            assignmentExpression37=assignmentExpression();

            state._fsp--;

            stream_assignmentExpression.add(assignmentExpression37.getTree());


            // AST REWRITE
            // elements: assignmentExpression, propertyName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 870:2: -> ^( NAMEDVALUE propertyName assignmentExpression )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:870:5: ^( NAMEDVALUE propertyName assignmentExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAMEDVALUE, "NAMEDVALUE"), root_1);

                adaptor.addChild(root_1, stream_propertyName.nextTree());
                adaptor.addChild(root_1, stream_assignmentExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "nameValuePair"

    public static class propertyName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "propertyName"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:873:1: propertyName : ( Identifier | StringLiteral | numericLiteral );
    public final JavaScriptParser.propertyName_return propertyName() throws RecognitionException {
        JavaScriptParser.propertyName_return retval = new JavaScriptParser.propertyName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier38=null;
        Token StringLiteral39=null;
        JavaScriptParser.numericLiteral_return numericLiteral40 = null;


        CommonTree Identifier38_tree=null;
        CommonTree StringLiteral39_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:874:2: ( Identifier | StringLiteral | numericLiteral )
            int alt10=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt10=1;
                }
                break;
            case StringLiteral:
                {
                alt10=2;
                }
                break;
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:874:4: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_propertyName3775); 
                    Identifier38_tree = (CommonTree)adaptor.create(Identifier38);
                    adaptor.addChild(root_0, Identifier38_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:875:4: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    StringLiteral39=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_propertyName3780); 
                    StringLiteral39_tree = (CommonTree)adaptor.create(StringLiteral39);
                    adaptor.addChild(root_0, StringLiteral39_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:876:4: numericLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_propertyName3785);
                    numericLiteral40=numericLiteral();

                    state._fsp--;

                    adaptor.addChild(root_0, numericLiteral40.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "propertyName"

    public static class memberExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "memberExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:888:1: memberExpression : ( primaryExpression | functionExpression | newExpression );
    public final JavaScriptParser.memberExpression_return memberExpression() throws RecognitionException {
        JavaScriptParser.memberExpression_return retval = new JavaScriptParser.memberExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.primaryExpression_return primaryExpression41 = null;

        JavaScriptParser.functionExpression_return functionExpression42 = null;

        JavaScriptParser.newExpression_return newExpression43 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:889:2: ( primaryExpression | functionExpression | newExpression )
            int alt11=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case THIS:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt11=1;
                }
                break;
            case FUNCTION:
                {
                alt11=2;
                }
                break;
            case NEW:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:889:4: primaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primaryExpression_in_memberExpression3803);
                    primaryExpression41=primaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, primaryExpression41.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:890:4: functionExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_functionExpression_in_memberExpression3808);
                    functionExpression42=functionExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, functionExpression42.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:891:4: newExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newExpression_in_memberExpression3813);
                    newExpression43=newExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, newExpression43.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "memberExpression"

    public static class newExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:894:1: newExpression : NEW memberExpression -> ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression ) ;
    public final JavaScriptParser.newExpression_return newExpression() throws RecognitionException {
        JavaScriptParser.newExpression_return retval = new JavaScriptParser.newExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEW44=null;
        JavaScriptParser.memberExpression_return memberExpression45 = null;


        CommonTree NEW44_tree=null;
        RewriteRuleTokenStream stream_NEW=new RewriteRuleTokenStream(adaptor,"token NEW");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:895:2: ( NEW memberExpression -> ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:895:4: NEW memberExpression
            {
            NEW44=(Token)match(input,NEW,FOLLOW_NEW_in_newExpression3824);  
            stream_NEW.add(NEW44);

            pushFollow(FOLLOW_memberExpression_in_newExpression3826);
            memberExpression45=memberExpression();

            state._fsp--;

            stream_memberExpression.add(memberExpression45.getTree());


            // AST REWRITE
            // elements: memberExpression, NEW
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 896:2: -> ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:896:5: ^( INSTANTIATES ^( KEYWORD NEW ) memberExpression )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INSTANTIATES, "INSTANTIATES"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:896:20: ^( KEYWORD NEW )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_NEW.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_memberExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "newExpression"

    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:900:1: arguments : LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) ) ;
    public final JavaScriptParser.arguments_return arguments() throws RecognitionException {
        JavaScriptParser.arguments_return retval = new JavaScriptParser.arguments_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN46=null;
        Token COMMA48=null;
        Token RPAREN50=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression47 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression49 = null;


        CommonTree LPAREN46_tree=null;
        CommonTree COMMA48_tree=null;
        CommonTree RPAREN50_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:901:2: ( LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN -> ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:901:4: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
            {
            LPAREN46=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_arguments3854);  
            stream_LPAREN.add(LPAREN46);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:901:11: ( assignmentExpression ( COMMA assignmentExpression )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=NULL && LA13_0<=FALSE)||LA13_0==DELETE||LA13_0==FUNCTION||LA13_0==NEW||LA13_0==THIS||LA13_0==TYPEOF||LA13_0==VOID||LA13_0==LBRACE||LA13_0==LPAREN||LA13_0==LBRACK||(LA13_0>=ADD && LA13_0<=SUB)||(LA13_0>=INC && LA13_0<=DEC)||(LA13_0>=NOT && LA13_0<=INV)||(LA13_0>=Identifier && LA13_0<=StringLiteral)||LA13_0==RegularExpressionLiteral||(LA13_0>=DecimalLiteral && LA13_0<=HexIntegerLiteral)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:901:13: assignmentExpression ( COMMA assignmentExpression )*
                    {
                    pushFollow(FOLLOW_assignmentExpression_in_arguments3858);
                    assignmentExpression47=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(assignmentExpression47.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:901:34: ( COMMA assignmentExpression )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMA) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:901:36: COMMA assignmentExpression
                    	    {
                    	    COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_arguments3862);  
                    	    stream_COMMA.add(COMMA48);

                    	    pushFollow(FOLLOW_assignmentExpression_in_arguments3864);
                    	    assignmentExpression49=assignmentExpression();

                    	    state._fsp--;

                    	    stream_assignmentExpression.add(assignmentExpression49.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN50=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_arguments3872);  
            stream_RPAREN.add(RPAREN50);



            // AST REWRITE
            // elements: COMMA, LPAREN, assignmentExpression, assignmentExpression, RPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 902:2: -> ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:5: ^( ARGUMENT_LIST ^( SEPARATOR LPAREN ) ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )? ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:21: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:41: ( ^( ARGUMENT assignmentExpression ) ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )* )?
                if ( stream_COMMA.hasNext()||stream_assignmentExpression.hasNext()||stream_assignmentExpression.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:43: ^( ARGUMENT assignmentExpression )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_2);

                    adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:76: ( ^( SEPARATOR COMMA ) ^( ARGUMENT assignmentExpression ) )*
                    while ( stream_COMMA.hasNext()||stream_assignmentExpression.hasNext() ) {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:78: ^( SEPARATOR COMMA )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                        adaptor.addChild(root_2, stream_COMMA.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:97: ^( ARGUMENT assignmentExpression )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ARGUMENT, "ARGUMENT"), root_2);

                        adaptor.addChild(root_2, stream_assignmentExpression.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                    }
                    stream_COMMA.reset();
                    stream_assignmentExpression.reset();

                }
                stream_COMMA.reset();
                stream_assignmentExpression.reset();
                stream_assignmentExpression.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:902:136: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "arguments"

    public static class leftHandSideExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leftHandSideExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:905:1: leftHandSideExpression : ( memberExpression -> memberExpression ) ( arguments -> ^( FUNCTION_CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> $leftHandSideExpression ^( SEPARATOR LBRACK ) expression ^( SEPARATOR RBRACK ) | DOT Identifier -> ^( NAME $leftHandSideExpression DOT ^( NAME Identifier ) ) )* ;
    public final JavaScriptParser.leftHandSideExpression_return leftHandSideExpression() throws RecognitionException {
        JavaScriptParser.leftHandSideExpression_return retval = new JavaScriptParser.leftHandSideExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LBRACK53=null;
        Token RBRACK55=null;
        Token DOT56=null;
        Token Identifier57=null;
        JavaScriptParser.memberExpression_return memberExpression51 = null;

        JavaScriptParser.arguments_return arguments52 = null;

        JavaScriptParser.expression_return expression54 = null;


        CommonTree LBRACK53_tree=null;
        CommonTree RBRACK55_tree=null;
        CommonTree DOT56_tree=null;
        CommonTree Identifier57_tree=null;
        RewriteRuleTokenStream stream_RBRACK=new RewriteRuleTokenStream(adaptor,"token RBRACK");
        RewriteRuleTokenStream stream_LBRACK=new RewriteRuleTokenStream(adaptor,"token LBRACK");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_memberExpression=new RewriteRuleSubtreeStream(adaptor,"rule memberExpression");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_arguments=new RewriteRuleSubtreeStream(adaptor,"rule arguments");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:906:2: ( ( memberExpression -> memberExpression ) ( arguments -> ^( FUNCTION_CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> $leftHandSideExpression ^( SEPARATOR LBRACK ) expression ^( SEPARATOR RBRACK ) | DOT Identifier -> ^( NAME $leftHandSideExpression DOT ^( NAME Identifier ) ) )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:907:2: ( memberExpression -> memberExpression ) ( arguments -> ^( FUNCTION_CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> $leftHandSideExpression ^( SEPARATOR LBRACK ) expression ^( SEPARATOR RBRACK ) | DOT Identifier -> ^( NAME $leftHandSideExpression DOT ^( NAME Identifier ) ) )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:907:2: ( memberExpression -> memberExpression )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:908:3: memberExpression
            {
            pushFollow(FOLLOW_memberExpression_in_leftHandSideExpression3936);
            memberExpression51=memberExpression();

            state._fsp--;

            stream_memberExpression.add(memberExpression51.getTree());


            // AST REWRITE
            // elements: memberExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 908:22: -> memberExpression
            {
                adaptor.addChild(root_0, stream_memberExpression.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:910:2: ( arguments -> ^( FUNCTION_CALL $leftHandSideExpression arguments ) | LBRACK expression RBRACK -> $leftHandSideExpression ^( SEPARATOR LBRACK ) expression ^( SEPARATOR RBRACK ) | DOT Identifier -> ^( NAME $leftHandSideExpression DOT ^( NAME Identifier ) ) )*
            loop14:
            do {
                int alt14=4;
                switch ( input.LA(1) ) {
                case LPAREN:
                    {
                    alt14=1;
                    }
                    break;
                case LBRACK:
                    {
                    alt14=2;
                    }
                    break;
                case DOT:
                    {
                    alt14=3;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:911:3: arguments
            	    {
            	    pushFollow(FOLLOW_arguments_in_leftHandSideExpression3952);
            	    arguments52=arguments();

            	    state._fsp--;

            	    stream_arguments.add(arguments52.getTree());


            	    // AST REWRITE
            	    // elements: arguments, leftHandSideExpression
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 911:15: -> ^( FUNCTION_CALL $leftHandSideExpression arguments )
            	    {
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:911:18: ^( FUNCTION_CALL $leftHandSideExpression arguments )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_arguments.nextTree());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:912:5: LBRACK expression RBRACK
            	    {
            	    LBRACK53=(Token)match(input,LBRACK,FOLLOW_LBRACK_in_leftHandSideExpression3974);  
            	    stream_LBRACK.add(LBRACK53);

            	    pushFollow(FOLLOW_expression_in_leftHandSideExpression3976);
            	    expression54=expression();

            	    state._fsp--;

            	    stream_expression.add(expression54.getTree());
            	    RBRACK55=(Token)match(input,RBRACK,FOLLOW_RBRACK_in_leftHandSideExpression3978);  
            	    stream_RBRACK.add(RBRACK55);



            	    // AST REWRITE
            	    // elements: leftHandSideExpression, expression, RBRACK, LBRACK
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 912:30: -> $leftHandSideExpression ^( SEPARATOR LBRACK ) expression ^( SEPARATOR RBRACK )
            	    {
            	        adaptor.addChild(root_0, stream_retval.nextTree());
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:912:69: ^( SEPARATOR LBRACK )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

            	        adaptor.addChild(root_1, stream_LBRACK.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }
            	        adaptor.addChild(root_0, stream_expression.nextTree());
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:912:100: ^( SEPARATOR RBRACK )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

            	        adaptor.addChild(root_1, stream_RBRACK.nextNode());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:913:5: DOT Identifier
            	    {
            	    DOT56=(Token)match(input,DOT,FOLLOW_DOT_in_leftHandSideExpression4007);  
            	    stream_DOT.add(DOT56);

            	    Identifier57=(Token)match(input,Identifier,FOLLOW_Identifier_in_leftHandSideExpression4009);  
            	    stream_Identifier.add(Identifier57);



            	    // AST REWRITE
            	    // elements: Identifier, leftHandSideExpression, DOT
            	    // token labels: 
            	    // rule labels: retval
            	    // token list labels: 
            	    // rule list labels: 
            	    // wildcard labels: 
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            	    root_0 = (CommonTree)adaptor.nil();
            	    // 913:21: -> ^( NAME $leftHandSideExpression DOT ^( NAME Identifier ) )
            	    {
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:913:24: ^( NAME $leftHandSideExpression DOT ^( NAME Identifier ) )
            	        {
            	        CommonTree root_1 = (CommonTree)adaptor.nil();
            	        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

            	        adaptor.addChild(root_1, stream_retval.nextTree());
            	        adaptor.addChild(root_1, stream_DOT.nextNode());
            	        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:913:60: ^( NAME Identifier )
            	        {
            	        CommonTree root_2 = (CommonTree)adaptor.nil();
            	        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

            	        adaptor.addChild(root_2, stream_Identifier.nextNode());

            	        adaptor.addChild(root_1, root_2);
            	        }

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    retval.tree = root_0;
            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "leftHandSideExpression"

    public static class postfixExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:927:1: postfixExpression : leftHandSideExpression ( -> leftHandSideExpression | postfixOperator -> ^( ASSIGNMENT_STATEMENT leftHandSideExpression postfixOperator ) ) ;
    public final JavaScriptParser.postfixExpression_return postfixExpression() throws RecognitionException {
        JavaScriptParser.postfixExpression_return retval = new JavaScriptParser.postfixExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.leftHandSideExpression_return leftHandSideExpression58 = null;

        JavaScriptParser.postfixOperator_return postfixOperator59 = null;


        RewriteRuleSubtreeStream stream_leftHandSideExpression=new RewriteRuleSubtreeStream(adaptor,"rule leftHandSideExpression");
        RewriteRuleSubtreeStream stream_postfixOperator=new RewriteRuleSubtreeStream(adaptor,"rule postfixOperator");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:928:3: ( leftHandSideExpression ( -> leftHandSideExpression | postfixOperator -> ^( ASSIGNMENT_STATEMENT leftHandSideExpression postfixOperator ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:928:5: leftHandSideExpression ( -> leftHandSideExpression | postfixOperator -> ^( ASSIGNMENT_STATEMENT leftHandSideExpression postfixOperator ) )
            {
            pushFollow(FOLLOW_leftHandSideExpression_in_postfixExpression4051);
            leftHandSideExpression58=leftHandSideExpression();

            state._fsp--;

            stream_leftHandSideExpression.add(leftHandSideExpression58.getTree());
             if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:928:97: ( -> leftHandSideExpression | postfixOperator -> ^( ASSIGNMENT_STATEMENT leftHandSideExpression postfixOperator ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EOF||(LA15_0>=IN && LA15_0<=INSTANCEOF)||LA15_0==RBRACE||LA15_0==RPAREN||LA15_0==RBRACK||(LA15_0>=SEMIC && LA15_0<=MOD)||(LA15_0>=SHL && LA15_0<=XOR)||(LA15_0>=LAND && LA15_0<=DIVASS)||(LA15_0>=EOL && LA15_0<=MultiLineComment)) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=INC && LA15_0<=DEC)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:929:3: 
                    {

                    // AST REWRITE
                    // elements: leftHandSideExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 929:3: -> leftHandSideExpression
                    {
                        adaptor.addChild(root_0, stream_leftHandSideExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:930:5: postfixOperator
                    {
                    pushFollow(FOLLOW_postfixOperator_in_postfixExpression4068);
                    postfixOperator59=postfixOperator();

                    state._fsp--;

                    stream_postfixOperator.add(postfixOperator59.getTree());


                    // AST REWRITE
                    // elements: postfixOperator, leftHandSideExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 930:22: -> ^( ASSIGNMENT_STATEMENT leftHandSideExpression postfixOperator )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:930:26: ^( ASSIGNMENT_STATEMENT leftHandSideExpression postfixOperator )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_1);

                        adaptor.addChild(root_1, stream_leftHandSideExpression.nextTree());
                        adaptor.addChild(root_1, stream_postfixOperator.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "postfixExpression"

    public static class postfixOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "postfixOperator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:933:1: postfixOperator : (op= INC -> ^( OPERATOR INC ) | op= DEC -> ^( OPERATOR DEC ) );
    public final JavaScriptParser.postfixOperator_return postfixOperator() throws RecognitionException {
        JavaScriptParser.postfixOperator_return retval = new JavaScriptParser.postfixOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;

        CommonTree op_tree=null;
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:934:2: (op= INC -> ^( OPERATOR INC ) | op= DEC -> ^( OPERATOR DEC ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==INC) ) {
                alt16=1;
            }
            else if ( (LA16_0==DEC) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:934:4: op= INC
                    {
                    op=(Token)match(input,INC,FOLLOW_INC_in_postfixOperator4095);  
                    stream_INC.add(op);

                     op.setType(PINC); 


                    // AST REWRITE
                    // elements: INC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 934:34: -> ^( OPERATOR INC )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:934:37: ^( OPERATOR INC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:935:4: op= DEC
                    {
                    op=(Token)match(input,DEC,FOLLOW_DEC_in_postfixOperator4112);  
                    stream_DEC.add(op);

                     op.setType(PDEC); 


                    // AST REWRITE
                    // elements: DEC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 935:34: -> ^( OPERATOR DEC )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:935:37: ^( OPERATOR DEC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DEC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "postfixOperator"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:942:1: unaryExpression : ( postfixExpression | unaryOperator unaryExpression | incDecOperator unaryExpression -> ^( ASSIGNMENT_STATEMENT incDecOperator unaryExpression ) );
    public final JavaScriptParser.unaryExpression_return unaryExpression() throws RecognitionException {
        JavaScriptParser.unaryExpression_return retval = new JavaScriptParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.postfixExpression_return postfixExpression60 = null;

        JavaScriptParser.unaryOperator_return unaryOperator61 = null;

        JavaScriptParser.unaryExpression_return unaryExpression62 = null;

        JavaScriptParser.incDecOperator_return incDecOperator63 = null;

        JavaScriptParser.unaryExpression_return unaryExpression64 = null;


        RewriteRuleSubtreeStream stream_unaryExpression=new RewriteRuleSubtreeStream(adaptor,"rule unaryExpression");
        RewriteRuleSubtreeStream stream_incDecOperator=new RewriteRuleSubtreeStream(adaptor,"rule incDecOperator");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:943:2: ( postfixExpression | unaryOperator unaryExpression | incDecOperator unaryExpression -> ^( ASSIGNMENT_STATEMENT incDecOperator unaryExpression ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case NULL:
            case TRUE:
            case FALSE:
            case FUNCTION:
            case NEW:
            case THIS:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt17=1;
                }
                break;
            case DELETE:
            case TYPEOF:
            case VOID:
            case NOT:
            case INV:
                {
                alt17=2;
                }
                break;
            case ADD:
            case SUB:
            case INC:
            case DEC:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:944:4: postfixExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_postfixExpression_in_unaryExpression4141);
                    postfixExpression60=postfixExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, postfixExpression60.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:945:4: unaryOperator unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaryOperator_in_unaryExpression4147);
                    unaryOperator61=unaryOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryOperator61.getTree());
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4149);
                    unaryExpression62=unaryExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, unaryExpression62.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:946:4: incDecOperator unaryExpression
                    {
                    pushFollow(FOLLOW_incDecOperator_in_unaryExpression4154);
                    incDecOperator63=incDecOperator();

                    state._fsp--;

                    stream_incDecOperator.add(incDecOperator63.getTree());
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression4156);
                    unaryExpression64=unaryExpression();

                    state._fsp--;

                    stream_unaryExpression.add(unaryExpression64.getTree());


                    // AST REWRITE
                    // elements: incDecOperator, unaryExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 946:35: -> ^( ASSIGNMENT_STATEMENT incDecOperator unaryExpression )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:946:38: ^( ASSIGNMENT_STATEMENT incDecOperator unaryExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_1);

                        adaptor.addChild(root_1, stream_incDecOperator.nextTree());
                        adaptor.addChild(root_1, stream_unaryExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "unaryExpression"

    public static class incDecOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "incDecOperator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:949:1: incDecOperator : ( INC -> ^( OPERATOR INC ) | DEC -> ^( OPERATOR DEC ) | op= ADD -> ^( OPERATOR ADD ) | op= SUB -> ^( OPERATOR SUB ) );
    public final JavaScriptParser.incDecOperator_return incDecOperator() throws RecognitionException {
        JavaScriptParser.incDecOperator_return retval = new JavaScriptParser.incDecOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token op=null;
        Token INC65=null;
        Token DEC66=null;

        CommonTree op_tree=null;
        CommonTree INC65_tree=null;
        CommonTree DEC66_tree=null;
        RewriteRuleTokenStream stream_DEC=new RewriteRuleTokenStream(adaptor,"token DEC");
        RewriteRuleTokenStream stream_INC=new RewriteRuleTokenStream(adaptor,"token INC");
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:950:2: ( INC -> ^( OPERATOR INC ) | DEC -> ^( OPERATOR DEC ) | op= ADD -> ^( OPERATOR ADD ) | op= SUB -> ^( OPERATOR SUB ) )
            int alt18=4;
            switch ( input.LA(1) ) {
            case INC:
                {
                alt18=1;
                }
                break;
            case DEC:
                {
                alt18=2;
                }
                break;
            case ADD:
                {
                alt18=3;
                }
                break;
            case SUB:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:950:4: INC
                    {
                    INC65=(Token)match(input,INC,FOLLOW_INC_in_incDecOperator4179);  
                    stream_INC.add(INC65);



                    // AST REWRITE
                    // elements: INC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 950:8: -> ^( OPERATOR INC )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:950:11: ^( OPERATOR INC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:951:4: DEC
                    {
                    DEC66=(Token)match(input,DEC,FOLLOW_DEC_in_incDecOperator4192);  
                    stream_DEC.add(DEC66);



                    // AST REWRITE
                    // elements: DEC
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 951:8: -> ^( OPERATOR DEC )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:951:11: ^( OPERATOR DEC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DEC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:952:4: op= ADD
                    {
                    op=(Token)match(input,ADD,FOLLOW_ADD_in_incDecOperator4207);  
                    stream_ADD.add(op);

                     op.setType(POS); 


                    // AST REWRITE
                    // elements: ADD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 952:33: -> ^( OPERATOR ADD )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:952:36: ^( OPERATOR ADD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_ADD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:953:4: op= SUB
                    {
                    op=(Token)match(input,SUB,FOLLOW_SUB_in_incDecOperator4224);  
                    stream_SUB.add(op);

                     op.setType(NEG); 


                    // AST REWRITE
                    // elements: SUB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 953:33: -> ^( OPERATOR SUB )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:953:36: ^( OPERATOR SUB )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_SUB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "incDecOperator"

    public static class unaryOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryOperator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:955:1: unaryOperator : ( DELETE -> ^( OPERATOR DELETE ) | VOID -> ^( OPERATOR VOID ) | TYPEOF -> ^( OPERATOR TYPEOF ) | INV -> ^( OPERATOR INV ) | NOT -> ^( OPERATOR NOT ) );
    public final JavaScriptParser.unaryOperator_return unaryOperator() throws RecognitionException {
        JavaScriptParser.unaryOperator_return retval = new JavaScriptParser.unaryOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DELETE67=null;
        Token VOID68=null;
        Token TYPEOF69=null;
        Token INV70=null;
        Token NOT71=null;

        CommonTree DELETE67_tree=null;
        CommonTree VOID68_tree=null;
        CommonTree TYPEOF69_tree=null;
        CommonTree INV70_tree=null;
        CommonTree NOT71_tree=null;
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_DELETE=new RewriteRuleTokenStream(adaptor,"token DELETE");
        RewriteRuleTokenStream stream_NOT=new RewriteRuleTokenStream(adaptor,"token NOT");
        RewriteRuleTokenStream stream_TYPEOF=new RewriteRuleTokenStream(adaptor,"token TYPEOF");
        RewriteRuleTokenStream stream_INV=new RewriteRuleTokenStream(adaptor,"token INV");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:956:2: ( DELETE -> ^( OPERATOR DELETE ) | VOID -> ^( OPERATOR VOID ) | TYPEOF -> ^( OPERATOR TYPEOF ) | INV -> ^( OPERATOR INV ) | NOT -> ^( OPERATOR NOT ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case DELETE:
                {
                alt19=1;
                }
                break;
            case VOID:
                {
                alt19=2;
                }
                break;
            case TYPEOF:
                {
                alt19=3;
                }
                break;
            case INV:
                {
                alt19=4;
                }
                break;
            case NOT:
                {
                alt19=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:956:4: DELETE
                    {
                    DELETE67=(Token)match(input,DELETE,FOLLOW_DELETE_in_unaryOperator4244);  
                    stream_DELETE.add(DELETE67);



                    // AST REWRITE
                    // elements: DELETE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 956:11: -> ^( OPERATOR DELETE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:956:14: ^( OPERATOR DELETE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DELETE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:957:4: VOID
                    {
                    VOID68=(Token)match(input,VOID,FOLLOW_VOID_in_unaryOperator4257);  
                    stream_VOID.add(VOID68);



                    // AST REWRITE
                    // elements: VOID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 957:9: -> ^( OPERATOR VOID )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:957:12: ^( OPERATOR VOID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_VOID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:958:4: TYPEOF
                    {
                    TYPEOF69=(Token)match(input,TYPEOF,FOLLOW_TYPEOF_in_unaryOperator4270);  
                    stream_TYPEOF.add(TYPEOF69);



                    // AST REWRITE
                    // elements: TYPEOF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 958:11: -> ^( OPERATOR TYPEOF )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:958:14: ^( OPERATOR TYPEOF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_TYPEOF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:959:4: INV
                    {
                    INV70=(Token)match(input,INV,FOLLOW_INV_in_unaryOperator4283);  
                    stream_INV.add(INV70);



                    // AST REWRITE
                    // elements: INV
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 959:8: -> ^( OPERATOR INV )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:959:11: ^( OPERATOR INV )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INV.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:960:4: NOT
                    {
                    NOT71=(Token)match(input,NOT,FOLLOW_NOT_in_unaryOperator4296);  
                    stream_NOT.add(NOT71);



                    // AST REWRITE
                    // elements: NOT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 960:8: -> ^( OPERATOR NOT )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:960:11: ^( OPERATOR NOT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_NOT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "unaryOperator"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:967:1: multiplicativeExpression : unaryExpression ( mulOp unaryExpression )* ;
    public final JavaScriptParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        JavaScriptParser.multiplicativeExpression_return retval = new JavaScriptParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.unaryExpression_return unaryExpression72 = null;

        JavaScriptParser.mulOp_return mulOp73 = null;

        JavaScriptParser.unaryExpression_return unaryExpression74 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:968:2: ( unaryExpression ( mulOp unaryExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:968:4: unaryExpression ( mulOp unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4319);
            unaryExpression72=unaryExpression();

            state._fsp--;

            adaptor.addChild(root_0, unaryExpression72.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:968:20: ( mulOp unaryExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=MUL && LA20_0<=MOD)||LA20_0==DIV) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:968:22: mulOp unaryExpression
            	    {
            	    pushFollow(FOLLOW_mulOp_in_multiplicativeExpression4323);
            	    mulOp73=mulOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(mulOp73.getTree(), root_0);
            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression4326);
            	    unaryExpression74=unaryExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExpression74.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "multiplicativeExpression"

    public static class mulOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:975:1: mulOp : ( MUL -> ^( OPERATOR MUL ) | DIV -> ^( OPERATOR DIV ) | MOD -> ^( OPERATOR MOD ) );
    public final JavaScriptParser.mulOp_return mulOp() throws RecognitionException {
        JavaScriptParser.mulOp_return retval = new JavaScriptParser.mulOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MUL75=null;
        Token DIV76=null;
        Token MOD77=null;

        CommonTree MUL75_tree=null;
        CommonTree DIV76_tree=null;
        CommonTree MOD77_tree=null;
        RewriteRuleTokenStream stream_DIV=new RewriteRuleTokenStream(adaptor,"token DIV");
        RewriteRuleTokenStream stream_MOD=new RewriteRuleTokenStream(adaptor,"token MOD");
        RewriteRuleTokenStream stream_MUL=new RewriteRuleTokenStream(adaptor,"token MUL");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:975:7: ( MUL -> ^( OPERATOR MUL ) | DIV -> ^( OPERATOR DIV ) | MOD -> ^( OPERATOR MOD ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case MUL:
                {
                alt21=1;
                }
                break;
            case DIV:
                {
                alt21=2;
                }
                break;
            case MOD:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:975:9: MUL
                    {
                    MUL75=(Token)match(input,MUL,FOLLOW_MUL_in_mulOp4343);  
                    stream_MUL.add(MUL75);



                    // AST REWRITE
                    // elements: MUL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 975:13: -> ^( OPERATOR MUL )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:975:16: ^( OPERATOR MUL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_MUL.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:976:4: DIV
                    {
                    DIV76=(Token)match(input,DIV,FOLLOW_DIV_in_mulOp4356);  
                    stream_DIV.add(DIV76);



                    // AST REWRITE
                    // elements: DIV
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 976:8: -> ^( OPERATOR DIV )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:976:11: ^( OPERATOR DIV )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_DIV.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:977:4: MOD
                    {
                    MOD77=(Token)match(input,MOD,FOLLOW_MOD_in_mulOp4369);  
                    stream_MOD.add(MOD77);



                    // AST REWRITE
                    // elements: MOD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 977:8: -> ^( OPERATOR MOD )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:977:11: ^( OPERATOR MOD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_MOD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "mulOp"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:980:1: additiveExpression : multiplicativeExpression ( addOp multiplicativeExpression )* ;
    public final JavaScriptParser.additiveExpression_return additiveExpression() throws RecognitionException {
        JavaScriptParser.additiveExpression_return retval = new JavaScriptParser.additiveExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.multiplicativeExpression_return multiplicativeExpression78 = null;

        JavaScriptParser.addOp_return addOp79 = null;

        JavaScriptParser.multiplicativeExpression_return multiplicativeExpression80 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:981:2: ( multiplicativeExpression ( addOp multiplicativeExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:981:4: multiplicativeExpression ( addOp multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4388);
            multiplicativeExpression78=multiplicativeExpression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicativeExpression78.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:981:29: ( addOp multiplicativeExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=ADD && LA22_0<=SUB)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:981:31: addOp multiplicativeExpression
            	    {
            	    pushFollow(FOLLOW_addOp_in_additiveExpression4392);
            	    addOp79=addOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(addOp79.getTree(), root_0);
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression4395);
            	    multiplicativeExpression80=multiplicativeExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicativeExpression80.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "additiveExpression"

    public static class addOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:988:1: addOp : ( ADD -> ^( OPERATOR ADD ) | SUB -> ^( OPERATOR SUB ) );
    public final JavaScriptParser.addOp_return addOp() throws RecognitionException {
        JavaScriptParser.addOp_return retval = new JavaScriptParser.addOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token ADD81=null;
        Token SUB82=null;

        CommonTree ADD81_tree=null;
        CommonTree SUB82_tree=null;
        RewriteRuleTokenStream stream_SUB=new RewriteRuleTokenStream(adaptor,"token SUB");
        RewriteRuleTokenStream stream_ADD=new RewriteRuleTokenStream(adaptor,"token ADD");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:988:7: ( ADD -> ^( OPERATOR ADD ) | SUB -> ^( OPERATOR SUB ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ADD) ) {
                alt23=1;
            }
            else if ( (LA23_0==SUB) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:988:9: ADD
                    {
                    ADD81=(Token)match(input,ADD,FOLLOW_ADD_in_addOp4413);  
                    stream_ADD.add(ADD81);



                    // AST REWRITE
                    // elements: ADD
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 988:13: -> ^( OPERATOR ADD )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:988:16: ^( OPERATOR ADD )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_ADD.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:989:5: SUB
                    {
                    SUB82=(Token)match(input,SUB,FOLLOW_SUB_in_addOp4428);  
                    stream_SUB.add(SUB82);



                    // AST REWRITE
                    // elements: SUB
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 989:9: -> ^( OPERATOR SUB )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:989:12: ^( OPERATOR SUB )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_SUB.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "addOp"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:992:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
    public final JavaScriptParser.shiftExpression_return shiftExpression() throws RecognitionException {
        JavaScriptParser.shiftExpression_return retval = new JavaScriptParser.shiftExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.additiveExpression_return additiveExpression83 = null;

        JavaScriptParser.shiftOp_return shiftOp84 = null;

        JavaScriptParser.additiveExpression_return additiveExpression85 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:993:2: ( additiveExpression ( shiftOp additiveExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:993:4: additiveExpression ( shiftOp additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression4447);
            additiveExpression83=additiveExpression();

            state._fsp--;

            adaptor.addChild(root_0, additiveExpression83.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:993:23: ( shiftOp additiveExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=SHL && LA24_0<=SHU)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:993:25: shiftOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression4451);
            	    shiftOp84=shiftOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(shiftOp84.getTree(), root_0);
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression4454);
            	    additiveExpression85=additiveExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additiveExpression85.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "shiftExpression"

    public static class shiftOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1000:1: shiftOp : ( SHL -> ^( OPERATOR SHL ) | SHR -> ^( OPERATOR SHR ) | SHU -> ^( OPERATOR SHU ) );
    public final JavaScriptParser.shiftOp_return shiftOp() throws RecognitionException {
        JavaScriptParser.shiftOp_return retval = new JavaScriptParser.shiftOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SHL86=null;
        Token SHR87=null;
        Token SHU88=null;

        CommonTree SHL86_tree=null;
        CommonTree SHR87_tree=null;
        CommonTree SHU88_tree=null;
        RewriteRuleTokenStream stream_SHR=new RewriteRuleTokenStream(adaptor,"token SHR");
        RewriteRuleTokenStream stream_SHL=new RewriteRuleTokenStream(adaptor,"token SHL");
        RewriteRuleTokenStream stream_SHU=new RewriteRuleTokenStream(adaptor,"token SHU");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1000:9: ( SHL -> ^( OPERATOR SHL ) | SHR -> ^( OPERATOR SHR ) | SHU -> ^( OPERATOR SHU ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case SHL:
                {
                alt25=1;
                }
                break;
            case SHR:
                {
                alt25=2;
                }
                break;
            case SHU:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1000:11: SHL
                    {
                    SHL86=(Token)match(input,SHL,FOLLOW_SHL_in_shiftOp4472);  
                    stream_SHL.add(SHL86);



                    // AST REWRITE
                    // elements: SHL
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1000:15: -> ^( OPERATOR SHL )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1000:18: ^( OPERATOR SHL )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_SHL.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1001:5: SHR
                    {
                    SHR87=(Token)match(input,SHR,FOLLOW_SHR_in_shiftOp4487);  
                    stream_SHR.add(SHR87);



                    // AST REWRITE
                    // elements: SHR
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1001:9: -> ^( OPERATOR SHR )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1001:12: ^( OPERATOR SHR )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_SHR.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1002:5: SHU
                    {
                    SHU88=(Token)match(input,SHU,FOLLOW_SHU_in_shiftOp4502);  
                    stream_SHU.add(SHU88);



                    // AST REWRITE
                    // elements: SHU
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1002:9: -> ^( OPERATOR SHU )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1002:12: ^( OPERATOR SHU )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_SHU.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "shiftOp"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1005:1: relationalExpression : shiftExpression ( relationalOperators shiftExpression )* ;
    public final JavaScriptParser.relationalExpression_return relationalExpression() throws RecognitionException {
        JavaScriptParser.relationalExpression_return retval = new JavaScriptParser.relationalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.shiftExpression_return shiftExpression89 = null;

        JavaScriptParser.relationalOperators_return relationalOperators90 = null;

        JavaScriptParser.shiftExpression_return shiftExpression91 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1006:2: ( shiftExpression ( relationalOperators shiftExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1006:4: shiftExpression ( relationalOperators shiftExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression4521);
            shiftExpression89=shiftExpression();

            state._fsp--;

            adaptor.addChild(root_0, shiftExpression89.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1006:20: ( relationalOperators shiftExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=IN && LA26_0<=INSTANCEOF)||(LA26_0>=LT && LA26_0<=GTE)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1006:22: relationalOperators shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOperators_in_relationalExpression4525);
            	    relationalOperators90=relationalOperators();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(relationalOperators90.getTree(), root_0);
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression4528);
            	    shiftExpression91=shiftExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExpression91.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "relationalExpression"

    public static class relationalExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1009:1: relationalExpressionNoIn : shiftExpression ( relationalOperatorsNoIn shiftExpression )* ;
    public final JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn() throws RecognitionException {
        JavaScriptParser.relationalExpressionNoIn_return retval = new JavaScriptParser.relationalExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.shiftExpression_return shiftExpression92 = null;

        JavaScriptParser.relationalOperatorsNoIn_return relationalOperatorsNoIn93 = null;

        JavaScriptParser.shiftExpression_return shiftExpression94 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1010:2: ( shiftExpression ( relationalOperatorsNoIn shiftExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1010:4: shiftExpression ( relationalOperatorsNoIn shiftExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4542);
            shiftExpression92=shiftExpression();

            state._fsp--;

            adaptor.addChild(root_0, shiftExpression92.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1010:20: ( relationalOperatorsNoIn shiftExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==INSTANCEOF||(LA27_0>=LT && LA27_0<=GTE)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1010:22: relationalOperatorsNoIn shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOperatorsNoIn_in_relationalExpressionNoIn4546);
            	    relationalOperatorsNoIn93=relationalOperatorsNoIn();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(relationalOperatorsNoIn93.getTree(), root_0);
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpressionNoIn4549);
            	    shiftExpression94=shiftExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shiftExpression94.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "relationalExpressionNoIn"

    public static class relationalOperators_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOperators"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1013:1: relationalOperators : ( LT -> ^( COMPARISON_OPERATOR LT ) | GT -> ^( COMPARISON_OPERATOR GT ) | LTE -> ^( COMPARISON_OPERATOR LTE ) | GTE -> ^( COMPARISON_OPERATOR GTE ) | INSTANCEOF -> ^( COMPARISON_OPERATOR INSTANCEOF ) | IN -> ^( COMPARISON_OPERATOR IN ) );
    public final JavaScriptParser.relationalOperators_return relationalOperators() throws RecognitionException {
        JavaScriptParser.relationalOperators_return retval = new JavaScriptParser.relationalOperators_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LT95=null;
        Token GT96=null;
        Token LTE97=null;
        Token GTE98=null;
        Token INSTANCEOF99=null;
        Token IN100=null;

        CommonTree LT95_tree=null;
        CommonTree GT96_tree=null;
        CommonTree LTE97_tree=null;
        CommonTree GTE98_tree=null;
        CommonTree INSTANCEOF99_tree=null;
        CommonTree IN100_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_INSTANCEOF=new RewriteRuleTokenStream(adaptor,"token INSTANCEOF");
        RewriteRuleTokenStream stream_LTE=new RewriteRuleTokenStream(adaptor,"token LTE");
        RewriteRuleTokenStream stream_GTE=new RewriteRuleTokenStream(adaptor,"token GTE");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1014:2: ( LT -> ^( COMPARISON_OPERATOR LT ) | GT -> ^( COMPARISON_OPERATOR GT ) | LTE -> ^( COMPARISON_OPERATOR LTE ) | GTE -> ^( COMPARISON_OPERATOR GTE ) | INSTANCEOF -> ^( COMPARISON_OPERATOR INSTANCEOF ) | IN -> ^( COMPARISON_OPERATOR IN ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt28=1;
                }
                break;
            case GT:
                {
                alt28=2;
                }
                break;
            case LTE:
                {
                alt28=3;
                }
                break;
            case GTE:
                {
                alt28=4;
                }
                break;
            case INSTANCEOF:
                {
                alt28=5;
                }
                break;
            case IN:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1014:4: LT
                    {
                    LT95=(Token)match(input,LT,FOLLOW_LT_in_relationalOperators4564);  
                    stream_LT.add(LT95);



                    // AST REWRITE
                    // elements: LT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1014:7: -> ^( COMPARISON_OPERATOR LT )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1014:10: ^( COMPARISON_OPERATOR LT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_LT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1015:4: GT
                    {
                    GT96=(Token)match(input,GT,FOLLOW_GT_in_relationalOperators4578);  
                    stream_GT.add(GT96);



                    // AST REWRITE
                    // elements: GT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1015:7: -> ^( COMPARISON_OPERATOR GT )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1015:10: ^( COMPARISON_OPERATOR GT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_GT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1016:4: LTE
                    {
                    LTE97=(Token)match(input,LTE,FOLLOW_LTE_in_relationalOperators4592);  
                    stream_LTE.add(LTE97);



                    // AST REWRITE
                    // elements: LTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1016:8: -> ^( COMPARISON_OPERATOR LTE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1016:11: ^( COMPARISON_OPERATOR LTE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_LTE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1017:4: GTE
                    {
                    GTE98=(Token)match(input,GTE,FOLLOW_GTE_in_relationalOperators4606);  
                    stream_GTE.add(GTE98);



                    // AST REWRITE
                    // elements: GTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1017:8: -> ^( COMPARISON_OPERATOR GTE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1017:11: ^( COMPARISON_OPERATOR GTE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_GTE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1018:4: INSTANCEOF
                    {
                    INSTANCEOF99=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_relationalOperators4620);  
                    stream_INSTANCEOF.add(INSTANCEOF99);



                    // AST REWRITE
                    // elements: INSTANCEOF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1018:15: -> ^( COMPARISON_OPERATOR INSTANCEOF )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1018:18: ^( COMPARISON_OPERATOR INSTANCEOF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INSTANCEOF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1019:4: IN
                    {
                    IN100=(Token)match(input,IN,FOLLOW_IN_in_relationalOperators4634);  
                    stream_IN.add(IN100);



                    // AST REWRITE
                    // elements: IN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1019:7: -> ^( COMPARISON_OPERATOR IN )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1019:10: ^( COMPARISON_OPERATOR IN )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_IN.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "relationalOperators"

    public static class relationalOperatorsNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOperatorsNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1021:1: relationalOperatorsNoIn : ( LT -> ^( COMPARISON_OPERATOR LT ) | GT -> ^( COMPARISON_OPERATOR GT ) | LTE -> ^( COMPARISON_OPERATOR LTE ) | GTE -> ^( COMPARISON_OPERATOR GTE ) | INSTANCEOF -> ^( COMPARISON_OPERATOR INSTANCEOF ) );
    public final JavaScriptParser.relationalOperatorsNoIn_return relationalOperatorsNoIn() throws RecognitionException {
        JavaScriptParser.relationalOperatorsNoIn_return retval = new JavaScriptParser.relationalOperatorsNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LT101=null;
        Token GT102=null;
        Token LTE103=null;
        Token GTE104=null;
        Token INSTANCEOF105=null;

        CommonTree LT101_tree=null;
        CommonTree GT102_tree=null;
        CommonTree LTE103_tree=null;
        CommonTree GTE104_tree=null;
        CommonTree INSTANCEOF105_tree=null;
        RewriteRuleTokenStream stream_GT=new RewriteRuleTokenStream(adaptor,"token GT");
        RewriteRuleTokenStream stream_LT=new RewriteRuleTokenStream(adaptor,"token LT");
        RewriteRuleTokenStream stream_INSTANCEOF=new RewriteRuleTokenStream(adaptor,"token INSTANCEOF");
        RewriteRuleTokenStream stream_LTE=new RewriteRuleTokenStream(adaptor,"token LTE");
        RewriteRuleTokenStream stream_GTE=new RewriteRuleTokenStream(adaptor,"token GTE");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1022:2: ( LT -> ^( COMPARISON_OPERATOR LT ) | GT -> ^( COMPARISON_OPERATOR GT ) | LTE -> ^( COMPARISON_OPERATOR LTE ) | GTE -> ^( COMPARISON_OPERATOR GTE ) | INSTANCEOF -> ^( COMPARISON_OPERATOR INSTANCEOF ) )
            int alt29=5;
            switch ( input.LA(1) ) {
            case LT:
                {
                alt29=1;
                }
                break;
            case GT:
                {
                alt29=2;
                }
                break;
            case LTE:
                {
                alt29=3;
                }
                break;
            case GTE:
                {
                alt29=4;
                }
                break;
            case INSTANCEOF:
                {
                alt29=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1022:4: LT
                    {
                    LT101=(Token)match(input,LT,FOLLOW_LT_in_relationalOperatorsNoIn4652);  
                    stream_LT.add(LT101);



                    // AST REWRITE
                    // elements: LT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1022:7: -> ^( COMPARISON_OPERATOR LT )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1022:10: ^( COMPARISON_OPERATOR LT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_LT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1023:4: GT
                    {
                    GT102=(Token)match(input,GT,FOLLOW_GT_in_relationalOperatorsNoIn4666);  
                    stream_GT.add(GT102);



                    // AST REWRITE
                    // elements: GT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1023:7: -> ^( COMPARISON_OPERATOR GT )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1023:10: ^( COMPARISON_OPERATOR GT )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_GT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1024:4: LTE
                    {
                    LTE103=(Token)match(input,LTE,FOLLOW_LTE_in_relationalOperatorsNoIn4680);  
                    stream_LTE.add(LTE103);



                    // AST REWRITE
                    // elements: LTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1024:8: -> ^( COMPARISON_OPERATOR LTE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1024:11: ^( COMPARISON_OPERATOR LTE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_LTE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1025:4: GTE
                    {
                    GTE104=(Token)match(input,GTE,FOLLOW_GTE_in_relationalOperatorsNoIn4694);  
                    stream_GTE.add(GTE104);



                    // AST REWRITE
                    // elements: GTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1025:8: -> ^( COMPARISON_OPERATOR GTE )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1025:11: ^( COMPARISON_OPERATOR GTE )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_GTE.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1026:4: INSTANCEOF
                    {
                    INSTANCEOF105=(Token)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_relationalOperatorsNoIn4708);  
                    stream_INSTANCEOF.add(INSTANCEOF105);



                    // AST REWRITE
                    // elements: INSTANCEOF
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1026:15: -> ^( COMPARISON_OPERATOR INSTANCEOF )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1026:18: ^( COMPARISON_OPERATOR INSTANCEOF )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_INSTANCEOF.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "relationalOperatorsNoIn"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1032:1: equalityExpression : relationalExpression ( equalityOperator relationalExpression )* ;
    public final JavaScriptParser.equalityExpression_return equalityExpression() throws RecognitionException {
        JavaScriptParser.equalityExpression_return retval = new JavaScriptParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.relationalExpression_return relationalExpression106 = null;

        JavaScriptParser.equalityOperator_return equalityOperator107 = null;

        JavaScriptParser.relationalExpression_return relationalExpression108 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1033:2: ( relationalExpression ( equalityOperator relationalExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1033:4: relationalExpression ( equalityOperator relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression4731);
            relationalExpression106=relationalExpression();

            state._fsp--;

            adaptor.addChild(root_0, relationalExpression106.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1033:25: ( equalityOperator relationalExpression )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=EQ && LA30_0<=NSAME)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1033:27: equalityOperator relationalExpression
            	    {
            	    pushFollow(FOLLOW_equalityOperator_in_equalityExpression4735);
            	    equalityOperator107=equalityOperator();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator107.getTree(), root_0);
            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression4738);
            	    relationalExpression108=relationalExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relationalExpression108.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "equalityExpression"

    public static class equalityExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1036:1: equalityExpressionNoIn : relationalExpressionNoIn ( equalityOperator relationalExpressionNoIn )* ;
    public final JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn() throws RecognitionException {
        JavaScriptParser.equalityExpressionNoIn_return retval = new JavaScriptParser.equalityExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn109 = null;

        JavaScriptParser.equalityOperator_return equalityOperator110 = null;

        JavaScriptParser.relationalExpressionNoIn_return relationalExpressionNoIn111 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1037:2: ( relationalExpressionNoIn ( equalityOperator relationalExpressionNoIn )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1037:4: relationalExpressionNoIn ( equalityOperator relationalExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4752);
            relationalExpressionNoIn109=relationalExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, relationalExpressionNoIn109.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1037:29: ( equalityOperator relationalExpressionNoIn )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=EQ && LA31_0<=NSAME)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1037:31: equalityOperator relationalExpressionNoIn
            	    {
            	    pushFollow(FOLLOW_equalityOperator_in_equalityExpressionNoIn4756);
            	    equalityOperator110=equalityOperator();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(equalityOperator110.getTree(), root_0);
            	    pushFollow(FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4759);
            	    relationalExpressionNoIn111=relationalExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relationalExpressionNoIn111.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "equalityExpressionNoIn"

    public static class equalityOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityOperator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1040:1: equalityOperator : ( EQ -> ^( COMPARISON_OPERATOR EQ ) | NEQ -> ^( COMPARISON_OPERATOR NEQ ) | SAME -> ^( COMPARISON_OPERATOR SAME ) | NSAME -> ^( COMPARISON_OPERATOR NSAME ) );
    public final JavaScriptParser.equalityOperator_return equalityOperator() throws RecognitionException {
        JavaScriptParser.equalityOperator_return retval = new JavaScriptParser.equalityOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EQ112=null;
        Token NEQ113=null;
        Token SAME114=null;
        Token NSAME115=null;

        CommonTree EQ112_tree=null;
        CommonTree NEQ113_tree=null;
        CommonTree SAME114_tree=null;
        CommonTree NSAME115_tree=null;
        RewriteRuleTokenStream stream_NEQ=new RewriteRuleTokenStream(adaptor,"token NEQ");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleTokenStream stream_SAME=new RewriteRuleTokenStream(adaptor,"token SAME");
        RewriteRuleTokenStream stream_NSAME=new RewriteRuleTokenStream(adaptor,"token NSAME");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1041:2: ( EQ -> ^( COMPARISON_OPERATOR EQ ) | NEQ -> ^( COMPARISON_OPERATOR NEQ ) | SAME -> ^( COMPARISON_OPERATOR SAME ) | NSAME -> ^( COMPARISON_OPERATOR NSAME ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case EQ:
                {
                alt32=1;
                }
                break;
            case NEQ:
                {
                alt32=2;
                }
                break;
            case SAME:
                {
                alt32=3;
                }
                break;
            case NSAME:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1041:5: EQ
                    {
                    EQ112=(Token)match(input,EQ,FOLLOW_EQ_in_equalityOperator4775);  
                    stream_EQ.add(EQ112);



                    // AST REWRITE
                    // elements: EQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1041:8: -> ^( COMPARISON_OPERATOR EQ )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1041:11: ^( COMPARISON_OPERATOR EQ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_EQ.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1042:4: NEQ
                    {
                    NEQ113=(Token)match(input,NEQ,FOLLOW_NEQ_in_equalityOperator4788);  
                    stream_NEQ.add(NEQ113);



                    // AST REWRITE
                    // elements: NEQ
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1042:8: -> ^( COMPARISON_OPERATOR NEQ )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1042:11: ^( COMPARISON_OPERATOR NEQ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_NEQ.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1043:4: SAME
                    {
                    SAME114=(Token)match(input,SAME,FOLLOW_SAME_in_equalityOperator4801);  
                    stream_SAME.add(SAME114);



                    // AST REWRITE
                    // elements: SAME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1043:9: -> ^( COMPARISON_OPERATOR SAME )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1043:12: ^( COMPARISON_OPERATOR SAME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_SAME.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1044:4: NSAME
                    {
                    NSAME115=(Token)match(input,NSAME,FOLLOW_NSAME_in_equalityOperator4814);  
                    stream_NSAME.add(NSAME115);



                    // AST REWRITE
                    // elements: NSAME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1044:10: -> ^( COMPARISON_OPERATOR NSAME )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1044:13: ^( COMPARISON_OPERATOR NSAME )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPARISON_OPERATOR, "COMPARISON_OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_NSAME.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "equalityOperator"

    public static class bitwiseANDExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseANDExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1050:1: bitwiseANDExpression : equalityExpression ( bitwiseAndOp equalityExpression )* ;
    public final JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression() throws RecognitionException {
        JavaScriptParser.bitwiseANDExpression_return retval = new JavaScriptParser.bitwiseANDExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.equalityExpression_return equalityExpression116 = null;

        JavaScriptParser.bitwiseAndOp_return bitwiseAndOp117 = null;

        JavaScriptParser.equalityExpression_return equalityExpression118 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1051:2: ( equalityExpression ( bitwiseAndOp equalityExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1051:4: equalityExpression ( bitwiseAndOp equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4838);
            equalityExpression116=equalityExpression();

            state._fsp--;

            adaptor.addChild(root_0, equalityExpression116.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1051:23: ( bitwiseAndOp equalityExpression )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==AND) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1051:25: bitwiseAndOp equalityExpression
            	    {
            	    pushFollow(FOLLOW_bitwiseAndOp_in_bitwiseANDExpression4842);
            	    bitwiseAndOp117=bitwiseAndOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(bitwiseAndOp117.getTree(), root_0);
            	    pushFollow(FOLLOW_equalityExpression_in_bitwiseANDExpression4845);
            	    equalityExpression118=equalityExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityExpression118.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseANDExpression"

    public static class bitwiseANDExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseANDExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1054:1: bitwiseANDExpressionNoIn : equalityExpressionNoIn ( bitwiseAndOp equalityExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseANDExpressionNoIn_return retval = new JavaScriptParser.bitwiseANDExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn119 = null;

        JavaScriptParser.bitwiseAndOp_return bitwiseAndOp120 = null;

        JavaScriptParser.equalityExpressionNoIn_return equalityExpressionNoIn121 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1055:2: ( equalityExpressionNoIn ( bitwiseAndOp equalityExpressionNoIn )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1055:4: equalityExpressionNoIn ( bitwiseAndOp equalityExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4859);
            equalityExpressionNoIn119=equalityExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, equalityExpressionNoIn119.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1055:27: ( bitwiseAndOp equalityExpressionNoIn )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==AND) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1055:29: bitwiseAndOp equalityExpressionNoIn
            	    {
            	    pushFollow(FOLLOW_bitwiseAndOp_in_bitwiseANDExpressionNoIn4863);
            	    bitwiseAndOp120=bitwiseAndOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(bitwiseAndOp120.getTree(), root_0);
            	    pushFollow(FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4866);
            	    equalityExpressionNoIn121=equalityExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equalityExpressionNoIn121.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseANDExpressionNoIn"

    public static class bitwiseAndOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseAndOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1057:1: bitwiseAndOp : AND -> ^( LOGICAL_OPERATOR AND ) ;
    public final JavaScriptParser.bitwiseAndOp_return bitwiseAndOp() throws RecognitionException {
        JavaScriptParser.bitwiseAndOp_return retval = new JavaScriptParser.bitwiseAndOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token AND122=null;

        CommonTree AND122_tree=null;
        RewriteRuleTokenStream stream_AND=new RewriteRuleTokenStream(adaptor,"token AND");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1058:2: ( AND -> ^( LOGICAL_OPERATOR AND ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1058:4: AND
            {
            AND122=(Token)match(input,AND,FOLLOW_AND_in_bitwiseAndOp4880);  
            stream_AND.add(AND122);



            // AST REWRITE
            // elements: AND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1058:8: -> ^( LOGICAL_OPERATOR AND )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1058:11: ^( LOGICAL_OPERATOR AND )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_AND.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseAndOp"

    public static class bitwiseXORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXORExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1060:1: bitwiseXORExpression : bitwiseANDExpression ( bitwiseXorOp bitwiseANDExpression )* ;
    public final JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression() throws RecognitionException {
        JavaScriptParser.bitwiseXORExpression_return retval = new JavaScriptParser.bitwiseXORExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression123 = null;

        JavaScriptParser.bitwiseXorOp_return bitwiseXorOp124 = null;

        JavaScriptParser.bitwiseANDExpression_return bitwiseANDExpression125 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1061:2: ( bitwiseANDExpression ( bitwiseXorOp bitwiseANDExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1061:4: bitwiseANDExpression ( bitwiseXorOp bitwiseANDExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4899);
            bitwiseANDExpression123=bitwiseANDExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseANDExpression123.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1061:25: ( bitwiseXorOp bitwiseANDExpression )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==XOR) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1061:27: bitwiseXorOp bitwiseANDExpression
            	    {
            	    pushFollow(FOLLOW_bitwiseXorOp_in_bitwiseXORExpression4903);
            	    bitwiseXorOp124=bitwiseXorOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(bitwiseXorOp124.getTree(), root_0);
            	    pushFollow(FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4906);
            	    bitwiseANDExpression125=bitwiseANDExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpression125.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseXORExpression"

    public static class bitwiseXORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXORExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1064:1: bitwiseXORExpressionNoIn : bitwiseANDExpressionNoIn ( bitwiseXorOp bitwiseANDExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseXORExpressionNoIn_return retval = new JavaScriptParser.bitwiseXORExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn126 = null;

        JavaScriptParser.bitwiseXorOp_return bitwiseXorOp127 = null;

        JavaScriptParser.bitwiseANDExpressionNoIn_return bitwiseANDExpressionNoIn128 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1065:2: ( bitwiseANDExpressionNoIn ( bitwiseXorOp bitwiseANDExpressionNoIn )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1065:4: bitwiseANDExpressionNoIn ( bitwiseXorOp bitwiseANDExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4922);
            bitwiseANDExpressionNoIn126=bitwiseANDExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseANDExpressionNoIn126.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1065:29: ( bitwiseXorOp bitwiseANDExpressionNoIn )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==XOR) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1065:31: bitwiseXorOp bitwiseANDExpressionNoIn
            	    {
            	    pushFollow(FOLLOW_bitwiseXorOp_in_bitwiseXORExpressionNoIn4926);
            	    bitwiseXorOp127=bitwiseXorOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(bitwiseXorOp127.getTree(), root_0);
            	    pushFollow(FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4929);
            	    bitwiseANDExpressionNoIn128=bitwiseANDExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseANDExpressionNoIn128.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseXORExpressionNoIn"

    public static class bitwiseXorOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseXorOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1067:1: bitwiseXorOp : XOR -> ^( LOGICAL_OPERATOR XOR ) ;
    public final JavaScriptParser.bitwiseXorOp_return bitwiseXorOp() throws RecognitionException {
        JavaScriptParser.bitwiseXorOp_return retval = new JavaScriptParser.bitwiseXorOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token XOR129=null;

        CommonTree XOR129_tree=null;
        RewriteRuleTokenStream stream_XOR=new RewriteRuleTokenStream(adaptor,"token XOR");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1068:2: ( XOR -> ^( LOGICAL_OPERATOR XOR ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1068:4: XOR
            {
            XOR129=(Token)match(input,XOR,FOLLOW_XOR_in_bitwiseXorOp4943);  
            stream_XOR.add(XOR129);



            // AST REWRITE
            // elements: XOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1068:8: -> ^( LOGICAL_OPERATOR XOR )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1068:11: ^( LOGICAL_OPERATOR XOR )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_XOR.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseXorOp"

    public static class bitwiseORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseORExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1070:1: bitwiseORExpression : bitwiseXORExpression ( bitwiseOrOp bitwiseXORExpression )* ;
    public final JavaScriptParser.bitwiseORExpression_return bitwiseORExpression() throws RecognitionException {
        JavaScriptParser.bitwiseORExpression_return retval = new JavaScriptParser.bitwiseORExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression130 = null;

        JavaScriptParser.bitwiseOrOp_return bitwiseOrOp131 = null;

        JavaScriptParser.bitwiseXORExpression_return bitwiseXORExpression132 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1071:2: ( bitwiseXORExpression ( bitwiseOrOp bitwiseXORExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1071:4: bitwiseXORExpression ( bitwiseOrOp bitwiseXORExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4961);
            bitwiseXORExpression130=bitwiseXORExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseXORExpression130.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1071:25: ( bitwiseOrOp bitwiseXORExpression )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==OR) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1071:27: bitwiseOrOp bitwiseXORExpression
            	    {
            	    pushFollow(FOLLOW_bitwiseOrOp_in_bitwiseORExpression4965);
            	    bitwiseOrOp131=bitwiseOrOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(bitwiseOrOp131.getTree(), root_0);
            	    pushFollow(FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4968);
            	    bitwiseXORExpression132=bitwiseXORExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpression132.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseORExpression"

    public static class bitwiseORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseORExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1074:1: bitwiseORExpressionNoIn : bitwiseXORExpressionNoIn ( bitwiseOrOp bitwiseXORExpressionNoIn )* ;
    public final JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.bitwiseORExpressionNoIn_return retval = new JavaScriptParser.bitwiseORExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn133 = null;

        JavaScriptParser.bitwiseOrOp_return bitwiseOrOp134 = null;

        JavaScriptParser.bitwiseXORExpressionNoIn_return bitwiseXORExpressionNoIn135 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1075:2: ( bitwiseXORExpressionNoIn ( bitwiseOrOp bitwiseXORExpressionNoIn )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1075:4: bitwiseXORExpressionNoIn ( bitwiseOrOp bitwiseXORExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4983);
            bitwiseXORExpressionNoIn133=bitwiseXORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseXORExpressionNoIn133.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1075:29: ( bitwiseOrOp bitwiseXORExpressionNoIn )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==OR) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1075:31: bitwiseOrOp bitwiseXORExpressionNoIn
            	    {
            	    pushFollow(FOLLOW_bitwiseOrOp_in_bitwiseORExpressionNoIn4987);
            	    bitwiseOrOp134=bitwiseOrOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(bitwiseOrOp134.getTree(), root_0);
            	    pushFollow(FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4990);
            	    bitwiseXORExpressionNoIn135=bitwiseXORExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseXORExpressionNoIn135.getTree());

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseORExpressionNoIn"

    public static class bitwiseOrOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bitwiseOrOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1077:1: bitwiseOrOp : OR -> ^( LOGICAL_OPERATOR OR ) ;
    public final JavaScriptParser.bitwiseOrOp_return bitwiseOrOp() throws RecognitionException {
        JavaScriptParser.bitwiseOrOp_return retval = new JavaScriptParser.bitwiseOrOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token OR136=null;

        CommonTree OR136_tree=null;
        RewriteRuleTokenStream stream_OR=new RewriteRuleTokenStream(adaptor,"token OR");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1078:2: ( OR -> ^( LOGICAL_OPERATOR OR ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1078:4: OR
            {
            OR136=(Token)match(input,OR,FOLLOW_OR_in_bitwiseOrOp5004);  
            stream_OR.add(OR136);



            // AST REWRITE
            // elements: OR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1078:7: -> ^( LOGICAL_OPERATOR OR )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1078:10: ^( LOGICAL_OPERATOR OR )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_OR.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "bitwiseOrOp"

    public static class logicalANDExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1083:1: logicalANDExpression : bitwiseORExpression ( andOp bitwiseORExpression )* ;
    public final JavaScriptParser.logicalANDExpression_return logicalANDExpression() throws RecognitionException {
        JavaScriptParser.logicalANDExpression_return retval = new JavaScriptParser.logicalANDExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.bitwiseORExpression_return bitwiseORExpression137 = null;

        JavaScriptParser.andOp_return andOp138 = null;

        JavaScriptParser.bitwiseORExpression_return bitwiseORExpression139 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1084:2: ( bitwiseORExpression ( andOp bitwiseORExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1084:4: bitwiseORExpression ( andOp bitwiseORExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5025);
            bitwiseORExpression137=bitwiseORExpression();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseORExpression137.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1084:24: ( andOp bitwiseORExpression )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==LAND) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1084:26: andOp bitwiseORExpression
            	    {
            	    pushFollow(FOLLOW_andOp_in_logicalANDExpression5029);
            	    andOp138=andOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(andOp138.getTree(), root_0);
            	    pushFollow(FOLLOW_bitwiseORExpression_in_logicalANDExpression5032);
            	    bitwiseORExpression139=bitwiseORExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpression139.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "logicalANDExpression"

    public static class andOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1086:1: andOp : LAND -> ^( LOGICAL_OPERATOR LAND ) ;
    public final JavaScriptParser.andOp_return andOp() throws RecognitionException {
        JavaScriptParser.andOp_return retval = new JavaScriptParser.andOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LAND140=null;

        CommonTree LAND140_tree=null;
        RewriteRuleTokenStream stream_LAND=new RewriteRuleTokenStream(adaptor,"token LAND");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1086:8: ( LAND -> ^( LOGICAL_OPERATOR LAND ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1086:10: LAND
            {
            LAND140=(Token)match(input,LAND,FOLLOW_LAND_in_andOp5045);  
            stream_LAND.add(LAND140);



            // AST REWRITE
            // elements: LAND
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1086:15: -> ^( LOGICAL_OPERATOR LAND )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1086:18: ^( LOGICAL_OPERATOR LAND )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_LAND.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "andOp"

    public static class logicalANDExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalANDExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1088:1: logicalANDExpressionNoIn : bitwiseORExpressionNoIn ( andOp bitwiseORExpressionNoIn )* ;
    public final JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn() throws RecognitionException {
        JavaScriptParser.logicalANDExpressionNoIn_return retval = new JavaScriptParser.logicalANDExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn141 = null;

        JavaScriptParser.andOp_return andOp142 = null;

        JavaScriptParser.bitwiseORExpressionNoIn_return bitwiseORExpressionNoIn143 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1089:2: ( bitwiseORExpressionNoIn ( andOp bitwiseORExpressionNoIn )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1089:4: bitwiseORExpressionNoIn ( andOp bitwiseORExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5062);
            bitwiseORExpressionNoIn141=bitwiseORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, bitwiseORExpressionNoIn141.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1089:28: ( andOp bitwiseORExpressionNoIn )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==LAND) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1089:30: andOp bitwiseORExpressionNoIn
            	    {
            	    pushFollow(FOLLOW_andOp_in_logicalANDExpressionNoIn5066);
            	    andOp142=andOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(andOp142.getTree(), root_0);
            	    pushFollow(FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5069);
            	    bitwiseORExpressionNoIn143=bitwiseORExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, bitwiseORExpressionNoIn143.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "logicalANDExpressionNoIn"

    public static class logicalORExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1092:1: logicalORExpression : logicalANDExpression ( orOp logicalANDExpression )* ;
    public final JavaScriptParser.logicalORExpression_return logicalORExpression() throws RecognitionException {
        JavaScriptParser.logicalORExpression_return retval = new JavaScriptParser.logicalORExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.logicalANDExpression_return logicalANDExpression144 = null;

        JavaScriptParser.orOp_return orOp145 = null;

        JavaScriptParser.logicalANDExpression_return logicalANDExpression146 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1093:2: ( logicalANDExpression ( orOp logicalANDExpression )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1093:4: logicalANDExpression ( orOp logicalANDExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5084);
            logicalANDExpression144=logicalANDExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalANDExpression144.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1093:25: ( orOp logicalANDExpression )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==LOR) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1093:27: orOp logicalANDExpression
            	    {
            	    pushFollow(FOLLOW_orOp_in_logicalORExpression5088);
            	    orOp145=orOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(orOp145.getTree(), root_0);
            	    pushFollow(FOLLOW_logicalANDExpression_in_logicalORExpression5091);
            	    logicalANDExpression146=logicalANDExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logicalANDExpression146.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "logicalORExpression"

    public static class logicalORExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalORExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1096:1: logicalORExpressionNoIn : logicalANDExpressionNoIn ( orOp logicalANDExpressionNoIn )* ;
    public final JavaScriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn() throws RecognitionException {
        JavaScriptParser.logicalORExpressionNoIn_return retval = new JavaScriptParser.logicalORExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn147 = null;

        JavaScriptParser.orOp_return orOp148 = null;

        JavaScriptParser.logicalANDExpressionNoIn_return logicalANDExpressionNoIn149 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1097:2: ( logicalANDExpressionNoIn ( orOp logicalANDExpressionNoIn )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1097:4: logicalANDExpressionNoIn ( orOp logicalANDExpressionNoIn )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5106);
            logicalANDExpressionNoIn147=logicalANDExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, logicalANDExpressionNoIn147.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1097:29: ( orOp logicalANDExpressionNoIn )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==LOR) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1097:31: orOp logicalANDExpressionNoIn
            	    {
            	    pushFollow(FOLLOW_orOp_in_logicalORExpressionNoIn5110);
            	    orOp148=orOp();

            	    state._fsp--;

            	    root_0 = (CommonTree)adaptor.becomeRoot(orOp148.getTree(), root_0);
            	    pushFollow(FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5113);
            	    logicalANDExpressionNoIn149=logicalANDExpressionNoIn();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logicalANDExpressionNoIn149.getTree());

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "logicalORExpressionNoIn"

    public static class orOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orOp"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1100:1: orOp : LOR -> ^( LOGICAL_OPERATOR LOR ) ;
    public final JavaScriptParser.orOp_return orOp() throws RecognitionException {
        JavaScriptParser.orOp_return retval = new JavaScriptParser.orOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LOR150=null;

        CommonTree LOR150_tree=null;
        RewriteRuleTokenStream stream_LOR=new RewriteRuleTokenStream(adaptor,"token LOR");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1100:7: ( LOR -> ^( LOGICAL_OPERATOR LOR ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1100:9: LOR
            {
            LOR150=(Token)match(input,LOR,FOLLOW_LOR_in_orOp5127);  
            stream_LOR.add(LOR150);



            // AST REWRITE
            // elements: LOR
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1100:13: -> ^( LOGICAL_OPERATOR LOR )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1100:16: ^( LOGICAL_OPERATOR LOR )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOGICAL_OPERATOR, "LOGICAL_OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_LOR.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "orOp"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1106:1: conditionalExpression : logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? ;
    public final JavaScriptParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        JavaScriptParser.conditionalExpression_return retval = new JavaScriptParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUE152=null;
        Token COLON154=null;
        JavaScriptParser.logicalORExpression_return logicalORExpression151 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression153 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression155 = null;


        CommonTree QUE152_tree=null;
        CommonTree COLON154_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1107:2: ( logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1107:4: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpression_in_conditionalExpression5149);
            logicalORExpression151=logicalORExpression();

            state._fsp--;

            adaptor.addChild(root_0, logicalORExpression151.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1107:24: ( QUE assignmentExpression COLON assignmentExpression )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==QUE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1107:26: QUE assignmentExpression COLON assignmentExpression
                    {
                    QUE152=(Token)match(input,QUE,FOLLOW_QUE_in_conditionalExpression5153); 
                    QUE152_tree = (CommonTree)adaptor.create(QUE152);
                    adaptor.addChild(root_0, QUE152_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5155);
                    assignmentExpression153=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression153.getTree());
                    COLON154=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpression5157); 
                    COLON154_tree = (CommonTree)adaptor.create(COLON154);
                    adaptor.addChild(root_0, COLON154_tree);

                    pushFollow(FOLLOW_assignmentExpression_in_conditionalExpression5159);
                    assignmentExpression155=assignmentExpression();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpression155.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "conditionalExpression"

    public static class conditionalExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1110:1: conditionalExpressionNoIn : logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? ;
    public final JavaScriptParser.conditionalExpressionNoIn_return conditionalExpressionNoIn() throws RecognitionException {
        JavaScriptParser.conditionalExpressionNoIn_return retval = new JavaScriptParser.conditionalExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token QUE157=null;
        Token COLON159=null;
        JavaScriptParser.logicalORExpressionNoIn_return logicalORExpressionNoIn156 = null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn158 = null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn160 = null;


        CommonTree QUE157_tree=null;
        CommonTree COLON159_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1111:2: ( logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1111:4: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5173);
            logicalORExpressionNoIn156=logicalORExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, logicalORExpressionNoIn156.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1111:28: ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==QUE) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1111:30: QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn
                    {
                    QUE157=(Token)match(input,QUE,FOLLOW_QUE_in_conditionalExpressionNoIn5177); 
                    QUE157_tree = (CommonTree)adaptor.create(QUE157);
                    adaptor.addChild(root_0, QUE157_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5179);
                    assignmentExpressionNoIn158=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn158.getTree());
                    COLON159=(Token)match(input,COLON,FOLLOW_COLON_in_conditionalExpressionNoIn5181); 
                    COLON159_tree = (CommonTree)adaptor.create(COLON159);
                    adaptor.addChild(root_0, COLON159_tree);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5183);
                    assignmentExpressionNoIn160=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn160.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "conditionalExpressionNoIn"

    public static class assignmentExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1140:1: assignmentExpression : conditionalExpression ( assignmentOperator assignmentExpression -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator conditionalExpression ^( VALUE assignmentExpression ) ) ) | -> conditionalExpression ) ;
    public final JavaScriptParser.assignmentExpression_return assignmentExpression() throws RecognitionException {
        JavaScriptParser.assignmentExpression_return retval = new JavaScriptParser.assignmentExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.conditionalExpression_return conditionalExpression161 = null;

        JavaScriptParser.assignmentOperator_return assignmentOperator162 = null;

        JavaScriptParser.assignmentExpression_return assignmentExpression163 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        RewriteRuleSubtreeStream stream_conditionalExpression=new RewriteRuleSubtreeStream(adaptor,"rule conditionalExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1142:2: ( conditionalExpression ( assignmentOperator assignmentExpression -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator conditionalExpression ^( VALUE assignmentExpression ) ) ) | -> conditionalExpression ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1142:4: conditionalExpression ( assignmentOperator assignmentExpression -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator conditionalExpression ^( VALUE assignmentExpression ) ) ) | -> conditionalExpression )
            {
            pushFollow(FOLLOW_conditionalExpression_in_assignmentExpression5206);
            conditionalExpression161=conditionalExpression();

            state._fsp--;

            stream_conditionalExpression.add(conditionalExpression161.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1143:2: ( assignmentOperator assignmentExpression -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator conditionalExpression ^( VALUE assignmentExpression ) ) ) | -> conditionalExpression )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=ASSIGN && LA45_0<=XORASS)||LA45_0==DIVASS) ) {
                alt45=1;
            }
            else if ( (LA45_0==EOF||LA45_0==RBRACE||LA45_0==RPAREN||LA45_0==RBRACK||(LA45_0>=SEMIC && LA45_0<=COMMA)||LA45_0==COLON||(LA45_0>=EOL && LA45_0<=MultiLineComment)) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1143:4: assignmentOperator assignmentExpression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression5212);
                    assignmentOperator162=assignmentOperator();

                    state._fsp--;

                    stream_assignmentOperator.add(assignmentOperator162.getTree());
                    pushFollow(FOLLOW_assignmentExpression_in_assignmentExpression5214);
                    assignmentExpression163=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(assignmentExpression163.getTree());


                    // AST REWRITE
                    // elements: conditionalExpression, assignmentOperator, assignmentExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1143:44: -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator conditionalExpression ^( VALUE assignmentExpression ) ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1143:47: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator conditionalExpression ^( VALUE assignmentExpression ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1143:70: ^( ASSIGN_OPERATOR assignmentOperator conditionalExpression ^( VALUE assignmentExpression ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_2);

                        adaptor.addChild(root_2, stream_assignmentOperator.nextTree());
                        adaptor.addChild(root_2, stream_conditionalExpression.nextTree());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1143:129: ^( VALUE assignmentExpression )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_3);

                        adaptor.addChild(root_3, stream_assignmentExpression.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1144:6: 
                    {

                    // AST REWRITE
                    // elements: conditionalExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1144:6: -> conditionalExpression
                    {
                        adaptor.addChild(root_0, stream_conditionalExpression.nextTree());

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "assignmentExpression"

    public static class assignmentStat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentStat"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1147:1: assignmentStat : assignmentOperator -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator ) ) ;
    public final JavaScriptParser.assignmentStat_return assignmentStat() throws RecognitionException {
        JavaScriptParser.assignmentStat_return retval = new JavaScriptParser.assignmentStat_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.assignmentOperator_return assignmentOperator164 = null;


        RewriteRuleSubtreeStream stream_assignmentOperator=new RewriteRuleSubtreeStream(adaptor,"rule assignmentOperator");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1148:2: ( assignmentOperator -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1148:4: assignmentOperator
            {
            pushFollow(FOLLOW_assignmentOperator_in_assignmentStat5258);
            assignmentOperator164=assignmentOperator();

            state._fsp--;

            stream_assignmentOperator.add(assignmentOperator164.getTree());


            // AST REWRITE
            // elements: assignmentOperator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1148:23: -> ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1148:26: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR assignmentOperator ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1148:49: ^( ASSIGN_OPERATOR assignmentOperator )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_2);

                adaptor.addChild(root_2, stream_assignmentOperator.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "assignmentStat"

    public static class assignmentOperator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentOperator"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1151:1: assignmentOperator : ( MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS | ASSIGN );
    public final JavaScriptParser.assignmentOperator_return assignmentOperator() throws RecognitionException {
        JavaScriptParser.assignmentOperator_return retval = new JavaScriptParser.assignmentOperator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set165=null;

        CommonTree set165_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1152:2: ( MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS | ASSIGN )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set165=(Token)input.LT(1);
            if ( (input.LA(1)>=ASSIGN && input.LA(1)<=XORASS)||input.LA(1)==DIVASS ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set165));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "assignmentOperator"

    public static class assignmentExpressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignmentExpressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1168:1: assignmentExpressionNoIn : lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? ;
    public final JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn() throws RecognitionException {
        JavaScriptParser.assignmentExpressionNoIn_return retval = new JavaScriptParser.assignmentExpressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.conditionalExpressionNoIn_return lhs = null;

        JavaScriptParser.assignmentOperator_return assignmentOperator166 = null;

        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn167 = null;




        	Object[] isLhs = new Object[1];

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1173:2: (lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )? )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1173:4: lhs= conditionalExpressionNoIn ({...}? assignmentOperator assignmentExpressionNoIn )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5371);
            lhs=conditionalExpressionNoIn();

            state._fsp--;

            adaptor.addChild(root_0, lhs.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1174:2: ({...}? assignmentOperator assignmentExpressionNoIn )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=ASSIGN && LA46_0<=XORASS)||LA46_0==DIVASS) ) {
                int LA46_1 = input.LA(2);

                if ( (( isLeftHandSideAssign(lhs, isLhs) )) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1174:4: {...}? assignmentOperator assignmentExpressionNoIn
                    {
                    if ( !(( isLeftHandSideAssign(lhs, isLhs) )) ) {
                        throw new FailedPredicateException(input, "assignmentExpressionNoIn", " isLeftHandSideAssign(lhs, isLhs) ");
                    }
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5378);
                    assignmentOperator166=assignmentOperator();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentOperator166.getTree());
                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5380);
                    assignmentExpressionNoIn167=assignmentExpressionNoIn();

                    state._fsp--;

                    adaptor.addChild(root_0, assignmentExpressionNoIn167.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "assignmentExpressionNoIn"

    public static class expression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1181:1: expression : exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final JavaScriptParser.expression_return expression() throws RecognitionException {
        JavaScriptParser.expression_return retval = new JavaScriptParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA168=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        CommonTree COMMA168_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1182:2: (exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1182:4: exprs+= assignmentExpression ( COMMA exprs+= assignmentExpression )*
            {
            pushFollow(FOLLOW_assignmentExpression_in_expression5402);
            exprs=assignmentExpression();

            state._fsp--;

            stream_assignmentExpression.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTree());

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1182:32: ( COMMA exprs+= assignmentExpression )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMA) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1182:34: COMMA exprs+= assignmentExpression
            	    {
            	    COMMA168=(Token)match(input,COMMA,FOLLOW_COMMA_in_expression5406);  
            	    stream_COMMA.add(COMMA168);

            	    pushFollow(FOLLOW_assignmentExpression_in_expression5410);
            	    exprs=assignmentExpression();

            	    state._fsp--;

            	    stream_assignmentExpression.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTree());


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);



            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (CommonTree)adaptor.nil();
            // 1183:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1183:28: ^( CEXPR ( $exprs)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprs.nextTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1184:2: -> $exprs
            {
                adaptor.addChild(root_0, stream_exprs.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class expressionNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1187:1: expressionNoIn : exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs;
    public final JavaScriptParser.expressionNoIn_return expressionNoIn() throws RecognitionException {
        JavaScriptParser.expressionNoIn_return retval = new JavaScriptParser.expressionNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token COMMA169=null;
        List list_exprs=null;
        RuleReturnScope exprs = null;
        CommonTree COMMA169_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1188:2: (exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )* -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ ) -> $exprs)
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1188:4: exprs+= assignmentExpressionNoIn ( COMMA exprs+= assignmentExpressionNoIn )*
            {
            pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5447);
            exprs=assignmentExpressionNoIn();

            state._fsp--;

            stream_assignmentExpressionNoIn.add(exprs.getTree());
            if (list_exprs==null) list_exprs=new ArrayList();
            list_exprs.add(exprs.getTree());

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1188:36: ( COMMA exprs+= assignmentExpressionNoIn )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1188:38: COMMA exprs+= assignmentExpressionNoIn
            	    {
            	    COMMA169=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionNoIn5451);  
            	    stream_COMMA.add(COMMA169);

            	    pushFollow(FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5455);
            	    exprs=assignmentExpressionNoIn();

            	    state._fsp--;

            	    stream_assignmentExpressionNoIn.add(exprs.getTree());
            	    if (list_exprs==null) list_exprs=new ArrayList();
            	    list_exprs.add(exprs.getTree());


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);



            // AST REWRITE
            // elements: exprs, exprs
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: exprs
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"token exprs",list_exprs);
            root_0 = (CommonTree)adaptor.nil();
            // 1189:2: -> { $exprs.size() > 1 }? ^( CEXPR ( $exprs)+ )
            if ( list_exprs.size() > 1 ) {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1189:28: ^( CEXPR ( $exprs)+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CEXPR, "CEXPR"), root_1);

                if ( !(stream_exprs.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprs.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprs.nextTree());

                }
                stream_exprs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 1190:2: -> $exprs
            {
                adaptor.addChild(root_0, stream_exprs.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "expressionNoIn"

    public static class semic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "semic"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1215:1: semic : ( SEMIC | EOF | RBRACE | EOL | MultiLineComment );
    public final JavaScriptParser.semic_return semic() throws RecognitionException {
        JavaScriptParser.semic_return retval = new JavaScriptParser.semic_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMIC170=null;
        Token EOF171=null;
        Token RBRACE172=null;
        Token EOL173=null;
        Token MultiLineComment174=null;

        CommonTree SEMIC170_tree=null;
        CommonTree EOF171_tree=null;
        CommonTree RBRACE172_tree=null;
        CommonTree EOL173_tree=null;
        CommonTree MultiLineComment174_tree=null;


            // Promote EOL if appropriate   
            promoteEOL(retval);

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1221:5: ( SEMIC | EOF | RBRACE | EOL | MultiLineComment )
            int alt49=5;
            switch ( input.LA(1) ) {
            case SEMIC:
                {
                alt49=1;
                }
                break;
            case EOF:
                {
                alt49=2;
                }
                break;
            case RBRACE:
                {
                alt49=3;
                }
                break;
            case EOL:
                {
                alt49=4;
                }
                break;
            case MultiLineComment:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1221:7: SEMIC
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    SEMIC170=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_semic5509); 
                    SEMIC170_tree = (CommonTree)adaptor.create(SEMIC170);
                    adaptor.addChild(root_0, SEMIC170_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1222:7: EOF
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOF171=(Token)match(input,EOF,FOLLOW_EOF_in_semic5517); 
                    EOF171_tree = (CommonTree)adaptor.create(EOF171);
                    adaptor.addChild(root_0, EOF171_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1223:7: RBRACE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                     int pos = input.index(); 
                    RBRACE172=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_semic5527); 
                    RBRACE172_tree = (CommonTree)adaptor.create(RBRACE172);
                    adaptor.addChild(root_0, RBRACE172_tree);

                     input.seek(pos); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1224:7: EOL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    EOL173=(Token)match(input,EOL,FOLLOW_EOL_in_semic5537); 
                    EOL173_tree = (CommonTree)adaptor.create(EOL173);
                    adaptor.addChild(root_0, EOL173_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1224:13: MultiLineComment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    MultiLineComment174=(Token)match(input,MultiLineComment,FOLLOW_MultiLineComment_in_semic5541); 
                    MultiLineComment174_tree = (CommonTree)adaptor.create(MultiLineComment174);
                    adaptor.addChild(root_0, MultiLineComment174_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "semic"

    public static class statement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1232:1: statement options {k=1; } : ({...}? block | statementTail );
    public final JavaScriptParser.statement_return statement() throws RecognitionException {
        JavaScriptParser.statement_return retval = new JavaScriptParser.statement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.block_return block175 = null;

        JavaScriptParser.statementTail_return statementTail176 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1237:2: ({...}? block | statementTail )
            int alt50=2;
            alt50 = dfa50.predict(input);
            switch (alt50) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1237:4: {...}? block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    if ( !(( input.LA(1) == LBRACE )) ) {
                        throw new FailedPredicateException(input, "statement", " input.LA(1) == LBRACE ");
                    }
                    pushFollow(FOLLOW_block_in_statement5573);
                    block175=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block175.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1238:4: statementTail
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statementTail_in_statement5578);
                    statementTail176=statementTail();

                    state._fsp--;

                    adaptor.addChild(root_0, statementTail176.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class statementTail_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statementTail"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1241:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );
    public final JavaScriptParser.statementTail_return statementTail() throws RecognitionException {
        JavaScriptParser.statementTail_return retval = new JavaScriptParser.statementTail_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.variableStatement_return variableStatement177 = null;

        JavaScriptParser.emptyStatement_return emptyStatement178 = null;

        JavaScriptParser.expressionStatement_return expressionStatement179 = null;

        JavaScriptParser.ifStatement_return ifStatement180 = null;

        JavaScriptParser.iterationStatement_return iterationStatement181 = null;

        JavaScriptParser.continueStatement_return continueStatement182 = null;

        JavaScriptParser.breakStatement_return breakStatement183 = null;

        JavaScriptParser.returnStatement_return returnStatement184 = null;

        JavaScriptParser.withStatement_return withStatement185 = null;

        JavaScriptParser.labelledStatement_return labelledStatement186 = null;

        JavaScriptParser.switchStatement_return switchStatement187 = null;

        JavaScriptParser.throwStatement_return throwStatement188 = null;

        JavaScriptParser.tryStatement_return tryStatement189 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1242:2: ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement )
            int alt51=13;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1242:4: variableStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_variableStatement_in_statementTail5590);
                    variableStatement177=variableStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, variableStatement177.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1243:4: emptyStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_emptyStatement_in_statementTail5595);
                    emptyStatement178=emptyStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, emptyStatement178.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1244:4: expressionStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expressionStatement_in_statementTail5600);
                    expressionStatement179=expressionStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionStatement179.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1245:4: ifStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statementTail5605);
                    ifStatement180=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement180.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1246:4: iterationStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_iterationStatement_in_statementTail5610);
                    iterationStatement181=iterationStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, iterationStatement181.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1247:4: continueStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_continueStatement_in_statementTail5615);
                    continueStatement182=continueStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, continueStatement182.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1248:4: breakStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_breakStatement_in_statementTail5620);
                    breakStatement183=breakStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, breakStatement183.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1249:4: returnStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_returnStatement_in_statementTail5625);
                    returnStatement184=returnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, returnStatement184.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1250:4: withStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_withStatement_in_statementTail5630);
                    withStatement185=withStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, withStatement185.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1251:4: labelledStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_labelledStatement_in_statementTail5635);
                    labelledStatement186=labelledStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, labelledStatement186.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1252:4: switchStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_switchStatement_in_statementTail5640);
                    switchStatement187=switchStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, switchStatement187.getTree());

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1253:4: throwStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_throwStatement_in_statementTail5645);
                    throwStatement188=throwStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, throwStatement188.getTree());

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1254:4: tryStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_tryStatement_in_statementTail5651);
                    tryStatement189=tryStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, tryStatement189.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "statementTail"

    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1259:1: block : lb= LBRACE ( statement )* RBRACE -> ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) ) ;
    public final JavaScriptParser.block_return block() throws RecognitionException {
        JavaScriptParser.block_return retval = new JavaScriptParser.block_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token RBRACE191=null;
        JavaScriptParser.statement_return statement190 = null;


        CommonTree lb_tree=null;
        CommonTree RBRACE191_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1260:2: (lb= LBRACE ( statement )* RBRACE -> ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1260:4: lb= LBRACE ( statement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block5667);  
            stream_LBRACE.add(lb);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1260:14: ( statement )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=NULL && LA52_0<=BREAK)||LA52_0==CONTINUE||(LA52_0>=DELETE && LA52_0<=DO)||(LA52_0>=FOR && LA52_0<=IF)||(LA52_0>=NEW && LA52_0<=WITH)||LA52_0==LBRACE||LA52_0==LPAREN||LA52_0==LBRACK||LA52_0==SEMIC||(LA52_0>=ADD && LA52_0<=SUB)||(LA52_0>=INC && LA52_0<=DEC)||(LA52_0>=NOT && LA52_0<=INV)||(LA52_0>=Identifier && LA52_0<=StringLiteral)||LA52_0==RegularExpressionLiteral||(LA52_0>=DecimalLiteral && LA52_0<=HexIntegerLiteral)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1260:14: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block5669);
            	    statement190=statement();

            	    state._fsp--;

            	    stream_statement.add(statement190.getTree());

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            RBRACE191=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block5672);  
            stream_RBRACE.add(RBRACE191);



            // AST REWRITE
            // elements: statement, RBRACE, LBRACE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1261:2: -> ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1261:5: ^( BLOCK_SCOPE ^( SEPARATOR LBRACE ) ( statement )* ^( SEPARATOR RBRACE ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1261:19: ^( SEPARATOR LBRACE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LBRACE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1261:39: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1261:50: ^( SEPARATOR RBRACE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RBRACE.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class variableStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1268:1: variableStatement : VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ( variableDeclaration )+ semic ;
    public final JavaScriptParser.variableStatement_return variableStatement() throws RecognitionException {
        JavaScriptParser.variableStatement_return retval = new JavaScriptParser.variableStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR192=null;
        Token COMMA194=null;
        JavaScriptParser.variableDeclaration_return variableDeclaration193 = null;

        JavaScriptParser.variableDeclaration_return variableDeclaration195 = null;

        JavaScriptParser.semic_return semic196 = null;


        CommonTree VAR192_tree=null;
        CommonTree COMMA194_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1269:2: ( VAR variableDeclaration ( COMMA variableDeclaration )* semic -> ( variableDeclaration )+ semic )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1269:4: VAR variableDeclaration ( COMMA variableDeclaration )* semic
            {
            VAR192=(Token)match(input,VAR,FOLLOW_VAR_in_variableStatement5710);  
            stream_VAR.add(VAR192);

            pushFollow(FOLLOW_variableDeclaration_in_variableStatement5712);
            variableDeclaration193=variableDeclaration();

            state._fsp--;

            stream_variableDeclaration.add(variableDeclaration193.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1269:28: ( COMMA variableDeclaration )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==COMMA) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1269:30: COMMA variableDeclaration
            	    {
            	    COMMA194=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableStatement5716);  
            	    stream_COMMA.add(COMMA194);

            	    pushFollow(FOLLOW_variableDeclaration_in_variableStatement5718);
            	    variableDeclaration195=variableDeclaration();

            	    state._fsp--;

            	    stream_variableDeclaration.add(variableDeclaration195.getTree());

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            pushFollow(FOLLOW_semic_in_variableStatement5723);
            semic196=semic();

            state._fsp--;

            stream_semic.add(semic196.getTree());


            // AST REWRITE
            // elements: semic, variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1270:2: -> ( variableDeclaration )+ semic
            {
                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_variableDeclaration.nextTree());

                }
                stream_variableDeclaration.reset();
                adaptor.addChild(root_0, stream_semic.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "variableStatement"

    public static class variableDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1273:1: variableDeclaration : Identifier ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpression -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) ) ) ) ) ;
    public final JavaScriptParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
        JavaScriptParser.variableDeclaration_return retval = new JavaScriptParser.variableDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier197=null;
        Token ASSIGN198=null;
        JavaScriptParser.assignmentExpression_return assignmentExpression199 = null;


        CommonTree Identifier197_tree=null;
        CommonTree ASSIGN198_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignmentExpression=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1274:2: ( Identifier ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpression -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) ) ) ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1274:4: Identifier ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpression -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) ) ) ) )
            {
            Identifier197=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclaration5745);  
            stream_Identifier.add(Identifier197);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1274:15: ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpression -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) ) ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EOF||LA54_0==RBRACE||(LA54_0>=SEMIC && LA54_0<=COMMA)||(LA54_0>=EOL && LA54_0<=MultiLineComment)) ) {
                alt54=1;
            }
            else if ( (LA54_0==ASSIGN) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1275:3: 
                    {

                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1275:3: -> ^( VAR_DECL ^( NAME Identifier ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1275:6: ^( VAR_DECL ^( NAME Identifier ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1275:17: ^( NAME Identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_Identifier.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1276:4: ASSIGN assignmentExpression
                    {
                    ASSIGN198=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclaration5766);  
                    stream_ASSIGN.add(ASSIGN198);

                    pushFollow(FOLLOW_assignmentExpression_in_variableDeclaration5768);
                    assignmentExpression199=assignmentExpression();

                    state._fsp--;

                    stream_assignmentExpression.add(assignmentExpression199.getTree());


                    // AST REWRITE
                    // elements: Identifier, assignmentExpression, ASSIGN
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1276:34: -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) ) ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1276:37: ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1276:49: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1276:72: ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpression ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_3);

                        adaptor.addChild(root_3, stream_ASSIGN.nextNode());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1276:97: ^( NAME Identifier )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_4);

                        adaptor.addChild(root_4, stream_Identifier.nextNode());

                        adaptor.addChild(root_3, root_4);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1276:116: ^( VALUE assignmentExpression )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_4);

                        adaptor.addChild(root_4, stream_assignmentExpression.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class variableDeclarationNoIn_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarationNoIn"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1280:1: variableDeclarationNoIn : Identifier ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpressionNoIn -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) ) ) ) ) ;
    public final JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn() throws RecognitionException {
        JavaScriptParser.variableDeclarationNoIn_return retval = new JavaScriptParser.variableDeclarationNoIn_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier200=null;
        Token ASSIGN201=null;
        JavaScriptParser.assignmentExpressionNoIn_return assignmentExpressionNoIn202 = null;


        CommonTree Identifier200_tree=null;
        CommonTree ASSIGN201_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_ASSIGN=new RewriteRuleTokenStream(adaptor,"token ASSIGN");
        RewriteRuleSubtreeStream stream_assignmentExpressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule assignmentExpressionNoIn");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1283:1: ( Identifier ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpressionNoIn -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) ) ) ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1283:3: Identifier ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpressionNoIn -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) ) ) ) )
            {
            Identifier200=(Token)match(input,Identifier,FOLLOW_Identifier_in_variableDeclarationNoIn5816);  
            stream_Identifier.add(Identifier200);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1283:14: ( -> ^( VAR_DECL ^( NAME Identifier ) ) | ASSIGN assignmentExpressionNoIn -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) ) ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IN||(LA55_0>=SEMIC && LA55_0<=COMMA)) ) {
                alt55=1;
            }
            else if ( (LA55_0==ASSIGN) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1284:4: 
                    {

                    // AST REWRITE
                    // elements: Identifier
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1284:4: -> ^( VAR_DECL ^( NAME Identifier ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1284:7: ^( VAR_DECL ^( NAME Identifier ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1284:18: ^( NAME Identifier )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                        adaptor.addChild(root_2, stream_Identifier.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1285:5: ASSIGN assignmentExpressionNoIn
                    {
                    ASSIGN201=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_variableDeclarationNoIn5839);  
                    stream_ASSIGN.add(ASSIGN201);

                    pushFollow(FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5841);
                    assignmentExpressionNoIn202=assignmentExpressionNoIn();

                    state._fsp--;

                    stream_assignmentExpressionNoIn.add(assignmentExpressionNoIn202.getTree());


                    // AST REWRITE
                    // elements: ASSIGN, Identifier, assignmentExpressionNoIn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1285:39: -> ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) ) ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1285:42: ^( VAR_DECL ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) ) ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VAR_DECL, "VAR_DECL"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1285:54: ^( ASSIGNMENT_STATEMENT ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGNMENT_STATEMENT, "ASSIGNMENT_STATEMENT"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1285:77: ^( ASSIGN_OPERATOR ASSIGN ^( NAME Identifier ) ^( VALUE assignmentExpressionNoIn ) )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(ASSIGN_OPERATOR, "ASSIGN_OPERATOR"), root_3);

                        adaptor.addChild(root_3, stream_ASSIGN.nextNode());
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1285:102: ^( NAME Identifier )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_4);

                        adaptor.addChild(root_4, stream_Identifier.nextNode());

                        adaptor.addChild(root_3, root_4);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1285:121: ^( VALUE assignmentExpressionNoIn )
                        {
                        CommonTree root_4 = (CommonTree)adaptor.nil();
                        root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(VALUE, "VALUE"), root_4);

                        adaptor.addChild(root_4, stream_assignmentExpressionNoIn.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "variableDeclarationNoIn"

    public static class emptyStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "emptyStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1293:1: emptyStatement : SEMIC ;
    public final JavaScriptParser.emptyStatement_return emptyStatement() throws RecognitionException {
        JavaScriptParser.emptyStatement_return retval = new JavaScriptParser.emptyStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMIC203=null;

        CommonTree SEMIC203_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1294:2: ( SEMIC )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1294:4: SEMIC
            {
            root_0 = (CommonTree)adaptor.nil();

            SEMIC203=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_emptyStatement5894); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "emptyStatement"

    public static class expressionStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1307:1: expressionStatement : expression semic ;
    public final JavaScriptParser.expressionStatement_return expressionStatement() throws RecognitionException {
        JavaScriptParser.expressionStatement_return retval = new JavaScriptParser.expressionStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.expression_return expression204 = null;

        JavaScriptParser.semic_return semic205 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1308:2: ( expression semic )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1308:4: expression semic
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionStatement5913);
            expression204=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression204.getTree());
            pushFollow(FOLLOW_semic_in_expressionStatement5915);
            semic205=semic();

            state._fsp--;

            adaptor.addChild(root_0, semic205.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "expressionStatement"

    public static class ifStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1315:1: ifStatement : IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( BLOCK_SCOPE statement ) ) ( ^( BRANCH ^( KEYWORD ELSE ) ^( BLOCK_SCOPE statement ) ) )? ) ;
    public final JavaScriptParser.ifStatement_return ifStatement() throws RecognitionException {
        JavaScriptParser.ifStatement_return retval = new JavaScriptParser.ifStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IF206=null;
        Token LPAREN207=null;
        Token RPAREN209=null;
        Token ELSE211=null;
        JavaScriptParser.expression_return expression208 = null;

        JavaScriptParser.statement_return statement210 = null;

        JavaScriptParser.statement_return statement212 = null;


        CommonTree IF206_tree=null;
        CommonTree LPAREN207_tree=null;
        CommonTree RPAREN209_tree=null;
        CommonTree ELSE211_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1317:2: ( IF LPAREN expression RPAREN statement ({...}? ELSE statement )? -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( BLOCK_SCOPE statement ) ) ( ^( BRANCH ^( KEYWORD ELSE ) ^( BLOCK_SCOPE statement ) ) )? ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1317:4: IF LPAREN expression RPAREN statement ({...}? ELSE statement )?
            {
            IF206=(Token)match(input,IF,FOLLOW_IF_in_ifStatement5932);  
            stream_IF.add(IF206);

            LPAREN207=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ifStatement5934);  
            stream_LPAREN.add(LPAREN207);

            pushFollow(FOLLOW_expression_in_ifStatement5936);
            expression208=expression();

            state._fsp--;

            stream_expression.add(expression208.getTree());
            RPAREN209=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ifStatement5938);  
            stream_RPAREN.add(RPAREN209);

            pushFollow(FOLLOW_statement_in_ifStatement5940);
            statement210=statement();

            state._fsp--;

            stream_statement.add(statement210.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1317:42: ({...}? ELSE statement )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==ELSE) ) {
                int LA56_1 = input.LA(2);

                if ( (( input.LA(1) == ELSE )) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1317:44: {...}? ELSE statement
                    {
                    if ( !(( input.LA(1) == ELSE )) ) {
                        throw new FailedPredicateException(input, "ifStatement", " input.LA(1) == ELSE ");
                    }
                    ELSE211=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifStatement5946);  
                    stream_ELSE.add(ELSE211);

                    pushFollow(FOLLOW_statement_in_ifStatement5948);
                    statement212=statement();

                    state._fsp--;

                    stream_statement.add(statement212.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: statement, expression, statement, ELSE, LPAREN, RPAREN, IF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1318:2: -> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( BLOCK_SCOPE statement ) ) ( ^( BRANCH ^( KEYWORD ELSE ) ^( BLOCK_SCOPE statement ) ) )? )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:5: ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( BLOCK_SCOPE statement ) ) ( ^( BRANCH ^( KEYWORD ELSE ) ^( BLOCK_SCOPE statement ) ) )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:25: ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) ) ^( BLOCK_SCOPE statement ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:35: ^( KEYWORD IF )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                adaptor.addChild(root_3, stream_IF.nextNode());

                adaptor.addChild(root_2, root_3);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:51: ^( CONDITION ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_3);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:64: ^( SEPARATOR LPAREN )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_4);

                adaptor.addChild(root_4, stream_LPAREN.nextNode());

                adaptor.addChild(root_3, root_4);
                }
                adaptor.addChild(root_3, stream_expression.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:95: ^( SEPARATOR RPAREN )
                {
                CommonTree root_4 = (CommonTree)adaptor.nil();
                root_4 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_4);

                adaptor.addChild(root_4, stream_RPAREN.nextNode());

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:118: ^( BLOCK_SCOPE statement )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_3);

                adaptor.addChild(root_3, stream_statement.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:145: ( ^( BRANCH ^( KEYWORD ELSE ) ^( BLOCK_SCOPE statement ) ) )?
                if ( stream_statement.hasNext()||stream_ELSE.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:145: ^( BRANCH ^( KEYWORD ELSE ) ^( BLOCK_SCOPE statement ) )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_2);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:155: ^( KEYWORD ELSE )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_3);

                    adaptor.addChild(root_3, stream_ELSE.nextNode());

                    adaptor.addChild(root_2, root_3);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1318:173: ^( BLOCK_SCOPE statement )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_3);

                    adaptor.addChild(root_3, stream_statement.nextTree());

                    adaptor.addChild(root_2, root_3);
                    }

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_statement.reset();
                stream_ELSE.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class iterationStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "iterationStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1325:1: iterationStatement : ( doStatement | whileStatement | forStatement );
    public final JavaScriptParser.iterationStatement_return iterationStatement() throws RecognitionException {
        JavaScriptParser.iterationStatement_return retval = new JavaScriptParser.iterationStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.doStatement_return doStatement213 = null;

        JavaScriptParser.whileStatement_return whileStatement214 = null;

        JavaScriptParser.forStatement_return forStatement215 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1326:2: ( doStatement | whileStatement | forStatement )
            int alt57=3;
            switch ( input.LA(1) ) {
            case DO:
                {
                alt57=1;
                }
                break;
            case WHILE:
                {
                alt57=2;
                }
                break;
            case FOR:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1326:4: doStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_doStatement_in_iterationStatement6038);
                    doStatement213=doStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, doStatement213.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1327:4: whileStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_iterationStatement6043);
                    whileStatement214=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement214.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1328:4: forStatement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_iterationStatement6048);
                    forStatement215=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement215.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "iterationStatement"

    public static class doStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1331:1: doStatement : DO statement WHILE LPAREN expression RPAREN semic -> ^( LOOP_STATEMENT ^( KEYWORD DO ) ^( BLOCK_SCOPE statement ) ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) ^( CONDITION expression ) ^( SEPARATOR RPAREN ) ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.doStatement_return doStatement() throws RecognitionException {
        JavaScriptParser.doStatement_return retval = new JavaScriptParser.doStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DO216=null;
        Token WHILE218=null;
        Token LPAREN219=null;
        Token RPAREN221=null;
        JavaScriptParser.statement_return statement217 = null;

        JavaScriptParser.expression_return expression220 = null;

        JavaScriptParser.semic_return semic222 = null;


        CommonTree DO216_tree=null;
        CommonTree WHILE218_tree=null;
        CommonTree LPAREN219_tree=null;
        CommonTree RPAREN221_tree=null;
        RewriteRuleTokenStream stream_DO=new RewriteRuleTokenStream(adaptor,"token DO");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1332:2: ( DO statement WHILE LPAREN expression RPAREN semic -> ^( LOOP_STATEMENT ^( KEYWORD DO ) ^( BLOCK_SCOPE statement ) ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) ^( CONDITION expression ) ^( SEPARATOR RPAREN ) ^( SEPARATOR semic ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1332:4: DO statement WHILE LPAREN expression RPAREN semic
            {
            DO216=(Token)match(input,DO,FOLLOW_DO_in_doStatement6060);  
            stream_DO.add(DO216);

            pushFollow(FOLLOW_statement_in_doStatement6062);
            statement217=statement();

            state._fsp--;

            stream_statement.add(statement217.getTree());
            WHILE218=(Token)match(input,WHILE,FOLLOW_WHILE_in_doStatement6064);  
            stream_WHILE.add(WHILE218);

            LPAREN219=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_doStatement6066);  
            stream_LPAREN.add(LPAREN219);

            pushFollow(FOLLOW_expression_in_doStatement6068);
            expression220=expression();

            state._fsp--;

            stream_expression.add(expression220.getTree());
            RPAREN221=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_doStatement6070);  
            stream_RPAREN.add(RPAREN221);

            pushFollow(FOLLOW_semic_in_doStatement6072);
            semic222=semic();

            state._fsp--;

            stream_semic.add(semic222.getTree());


            // AST REWRITE
            // elements: RPAREN, expression, DO, semic, WHILE, statement, LPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1333:2: -> ^( LOOP_STATEMENT ^( KEYWORD DO ) ^( BLOCK_SCOPE statement ) ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) ^( CONDITION expression ) ^( SEPARATOR RPAREN ) ^( SEPARATOR semic ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:5: ^( LOOP_STATEMENT ^( KEYWORD DO ) ^( BLOCK_SCOPE statement ) ^( KEYWORD WHILE ) ^( SEPARATOR LPAREN ) ^( CONDITION expression ) ^( SEPARATOR RPAREN ) ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:23: ^( KEYWORD DO )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_DO.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:37: ^( BLOCK_SCOPE statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:62: ^( KEYWORD WHILE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_WHILE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:81: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:101: ^( CONDITION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:125: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1333:146: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "doStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1336:1: whileStatement : WHILE LPAREN expression RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION expression ) ^( BLOCK_SCOPE statement ) ) ;
    public final JavaScriptParser.whileStatement_return whileStatement() throws RecognitionException {
        JavaScriptParser.whileStatement_return retval = new JavaScriptParser.whileStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WHILE223=null;
        Token LPAREN224=null;
        Token RPAREN226=null;
        JavaScriptParser.expression_return expression225 = null;

        JavaScriptParser.statement_return statement227 = null;


        CommonTree WHILE223_tree=null;
        CommonTree LPAREN224_tree=null;
        CommonTree RPAREN226_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_WHILE=new RewriteRuleTokenStream(adaptor,"token WHILE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1337:2: ( WHILE LPAREN expression RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION expression ) ^( BLOCK_SCOPE statement ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1337:4: WHILE LPAREN expression RPAREN statement
            {
            WHILE223=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileStatement6137);  
            stream_WHILE.add(WHILE223);

            LPAREN224=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whileStatement6139);  
            stream_LPAREN.add(LPAREN224);

            pushFollow(FOLLOW_expression_in_whileStatement6141);
            expression225=expression();

            state._fsp--;

            stream_expression.add(expression225.getTree());
            RPAREN226=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whileStatement6143);  
            stream_RPAREN.add(RPAREN226);

            pushFollow(FOLLOW_statement_in_whileStatement6145);
            statement227=statement();

            state._fsp--;

            stream_statement.add(statement227.getTree());


            // AST REWRITE
            // elements: statement, expression, WHILE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1338:2: -> ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION expression ) ^( BLOCK_SCOPE statement ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1338:5: ^( LOOP_STATEMENT ^( KEYWORD WHILE ) ^( CONDITION expression ) ^( BLOCK_SCOPE statement ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1338:23: ^( KEYWORD WHILE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_WHILE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1338:40: ^( CONDITION expression )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_2);

                adaptor.addChild(root_2, stream_expression.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1338:65: ^( BLOCK_SCOPE statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class forStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1382:1: forStatement : FOR LPAREN forControl RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ^( BLOCK_SCOPE statement ) ) ;
    public final JavaScriptParser.forStatement_return forStatement() throws RecognitionException {
        JavaScriptParser.forStatement_return retval = new JavaScriptParser.forStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FOR228=null;
        Token LPAREN229=null;
        Token RPAREN231=null;
        JavaScriptParser.forControl_return forControl230 = null;

        JavaScriptParser.statement_return statement232 = null;


        CommonTree FOR228_tree=null;
        CommonTree LPAREN229_tree=null;
        CommonTree RPAREN231_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_forControl=new RewriteRuleSubtreeStream(adaptor,"rule forControl");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1383:2: ( FOR LPAREN forControl RPAREN statement -> ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ^( BLOCK_SCOPE statement ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1383:4: FOR LPAREN forControl RPAREN statement
            {
            FOR228=(Token)match(input,FOR,FOLLOW_FOR_in_forStatement6186);  
            stream_FOR.add(FOR228);

            LPAREN229=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forStatement6188);  
            stream_LPAREN.add(LPAREN229);

            pushFollow(FOLLOW_forControl_in_forStatement6190);
            forControl230=forControl();

            state._fsp--;

            stream_forControl.add(forControl230.getTree());
            RPAREN231=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forStatement6192);  
            stream_RPAREN.add(RPAREN231);

            pushFollow(FOLLOW_statement_in_forStatement6194);
            statement232=statement();

            state._fsp--;

            stream_statement.add(statement232.getTree());


            // AST REWRITE
            // elements: FOR, statement, forControl, LPAREN, RPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1385:2: -> ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ^( BLOCK_SCOPE statement ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1385:5: ^( LOOP_STATEMENT ^( KEYWORD FOR ) ^( SEPARATOR LPAREN ) forControl ^( SEPARATOR RPAREN ) ^( BLOCK_SCOPE statement ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(LOOP_STATEMENT, "LOOP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1385:23: ^( KEYWORD FOR )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_FOR.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1385:39: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_forControl.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1385:70: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1385:90: ^( BLOCK_SCOPE statement )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, "BLOCK_SCOPE"), root_2);

                adaptor.addChild(root_2, stream_statement.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class forControl_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControl"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1388:1: forControl : ( forControlVar | forControlExpression -> ^( CONDITION forControlExpression ) | forControlSemic -> ^( CONDITION forControlSemic ) );
    public final JavaScriptParser.forControl_return forControl() throws RecognitionException {
        JavaScriptParser.forControl_return retval = new JavaScriptParser.forControl_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.forControlVar_return forControlVar233 = null;

        JavaScriptParser.forControlExpression_return forControlExpression234 = null;

        JavaScriptParser.forControlSemic_return forControlSemic235 = null;


        RewriteRuleSubtreeStream stream_forControlSemic=new RewriteRuleSubtreeStream(adaptor,"rule forControlSemic");
        RewriteRuleSubtreeStream stream_forControlExpression=new RewriteRuleSubtreeStream(adaptor,"rule forControlExpression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1389:2: ( forControlVar | forControlExpression -> ^( CONDITION forControlExpression ) | forControlSemic -> ^( CONDITION forControlSemic ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case VAR:
                {
                alt58=1;
                }
                break;
            case NULL:
            case TRUE:
            case FALSE:
            case DELETE:
            case FUNCTION:
            case NEW:
            case THIS:
            case TYPEOF:
            case VOID:
            case LBRACE:
            case LPAREN:
            case LBRACK:
            case ADD:
            case SUB:
            case INC:
            case DEC:
            case NOT:
            case INV:
            case Identifier:
            case StringLiteral:
            case RegularExpressionLiteral:
            case DecimalLiteral:
            case OctalIntegerLiteral:
            case HexIntegerLiteral:
                {
                alt58=2;
                }
                break;
            case SEMIC:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1389:4: forControlVar
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_forControlVar_in_forControl6242);
                    forControlVar233=forControlVar();

                    state._fsp--;

                    adaptor.addChild(root_0, forControlVar233.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1390:4: forControlExpression
                    {
                    pushFollow(FOLLOW_forControlExpression_in_forControl6247);
                    forControlExpression234=forControlExpression();

                    state._fsp--;

                    stream_forControlExpression.add(forControlExpression234.getTree());


                    // AST REWRITE
                    // elements: forControlExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1390:25: -> ^( CONDITION forControlExpression )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1390:28: ^( CONDITION forControlExpression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                        adaptor.addChild(root_1, stream_forControlExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1391:4: forControlSemic
                    {
                    pushFollow(FOLLOW_forControlSemic_in_forControl6263);
                    forControlSemic235=forControlSemic();

                    state._fsp--;

                    stream_forControlSemic.add(forControlSemic235.getTree());


                    // AST REWRITE
                    // elements: forControlSemic
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1391:20: -> ^( CONDITION forControlSemic )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1391:23: ^( CONDITION forControlSemic )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                        adaptor.addChild(root_1, stream_forControlSemic.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "forControl"

    public static class forControlVar_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlVar"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1394:1: forControlVar : VAR variableDeclarationNoIn ( ( IN expression -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( CONDITION ^( KEYWORD IN ) expression ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ^( CONDITION ( $ex1)? ) ^( SEPARATOR SEMIC ) ^( STEP ( $ex2)? ) ) ) ;
    public final JavaScriptParser.forControlVar_return forControlVar() throws RecognitionException {
        JavaScriptParser.forControlVar_return retval = new JavaScriptParser.forControlVar_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token VAR236=null;
        Token IN238=null;
        Token COMMA240=null;
        Token SEMIC242=null;
        Token SEMIC243=null;
        JavaScriptParser.expression_return ex1 = null;

        JavaScriptParser.expression_return ex2 = null;

        JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn237 = null;

        JavaScriptParser.expression_return expression239 = null;

        JavaScriptParser.variableDeclarationNoIn_return variableDeclarationNoIn241 = null;


        CommonTree VAR236_tree=null;
        CommonTree IN238_tree=null;
        CommonTree COMMA240_tree=null;
        CommonTree SEMIC242_tree=null;
        CommonTree SEMIC243_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_variableDeclarationNoIn=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclarationNoIn");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1395:2: ( VAR variableDeclarationNoIn ( ( IN expression -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( CONDITION ^( KEYWORD IN ) expression ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ^( CONDITION ( $ex1)? ) ^( SEPARATOR SEMIC ) ^( STEP ( $ex2)? ) ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1395:4: VAR variableDeclarationNoIn ( ( IN expression -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( CONDITION ^( KEYWORD IN ) expression ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ^( CONDITION ( $ex1)? ) ^( SEPARATOR SEMIC ) ^( STEP ( $ex2)? ) ) )
            {
            VAR236=(Token)match(input,VAR,FOLLOW_VAR_in_forControlVar6284);  
            stream_VAR.add(VAR236);

            pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6286);
            variableDeclarationNoIn237=variableDeclarationNoIn();

            state._fsp--;

            stream_variableDeclarationNoIn.add(variableDeclarationNoIn237.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1396:2: ( ( IN expression -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( CONDITION ^( KEYWORD IN ) expression ) ) | ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ^( CONDITION ( $ex1)? ) ^( SEPARATOR SEMIC ) ^( STEP ( $ex2)? ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IN) ) {
                alt62=1;
            }
            else if ( ((LA62_0>=SEMIC && LA62_0<=COMMA)) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1397:3: ( IN expression -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( CONDITION ^( KEYWORD IN ) expression ) )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1397:3: ( IN expression -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( CONDITION ^( KEYWORD IN ) expression ) )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1398:4: IN expression
                    {
                    IN238=(Token)match(input,IN,FOLLOW_IN_in_forControlVar6298);  
                    stream_IN.add(IN238);

                    pushFollow(FOLLOW_expression_in_forControlVar6300);
                    expression239=expression();

                    state._fsp--;

                    stream_expression.add(expression239.getTree());


                    // AST REWRITE
                    // elements: VAR, IN, expression, variableDeclarationNoIn
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1400:4: -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( CONDITION ^( KEYWORD IN ) expression )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1400:8: ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT, "INIT"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1400:15: ^( KEYWORD VAR )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                        adaptor.addChild(root_2, stream_VAR.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_variableDeclarationNoIn.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclarationNoIn.hasNext() ) {
                            adaptor.addChild(root_1, stream_variableDeclarationNoIn.nextTree());

                        }
                        stream_variableDeclarationNoIn.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1400:56: ^( CONDITION ^( KEYWORD IN ) expression )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1400:68: ^( KEYWORD IN )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                        adaptor.addChild(root_2, stream_IN.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1403:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ^( CONDITION ( $ex1)? ) ^( SEPARATOR SEMIC ) ^( STEP ( $ex2)? ) )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1403:3: ( ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ^( CONDITION ( $ex1)? ) ^( SEPARATOR SEMIC ) ^( STEP ( $ex2)? ) )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1404:4: ( COMMA variableDeclarationNoIn )* SEMIC (ex1= expression )? SEMIC (ex2= expression )?
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1404:4: ( COMMA variableDeclarationNoIn )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==COMMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1404:6: COMMA variableDeclarationNoIn
                    	    {
                    	    COMMA240=(Token)match(input,COMMA,FOLLOW_COMMA_in_forControlVar6354);  
                    	    stream_COMMA.add(COMMA240);

                    	    pushFollow(FOLLOW_variableDeclarationNoIn_in_forControlVar6356);
                    	    variableDeclarationNoIn241=variableDeclarationNoIn();

                    	    state._fsp--;

                    	    stream_variableDeclarationNoIn.add(variableDeclarationNoIn241.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    SEMIC242=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6361);  
                    stream_SEMIC.add(SEMIC242);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1404:48: (ex1= expression )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( ((LA60_0>=NULL && LA60_0<=FALSE)||LA60_0==DELETE||LA60_0==FUNCTION||LA60_0==NEW||LA60_0==THIS||LA60_0==TYPEOF||LA60_0==VOID||LA60_0==LBRACE||LA60_0==LPAREN||LA60_0==LBRACK||(LA60_0>=ADD && LA60_0<=SUB)||(LA60_0>=INC && LA60_0<=DEC)||(LA60_0>=NOT && LA60_0<=INV)||(LA60_0>=Identifier && LA60_0<=StringLiteral)||LA60_0==RegularExpressionLiteral||(LA60_0>=DecimalLiteral && LA60_0<=HexIntegerLiteral)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1404:48: ex1= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6365);
                            ex1=expression();

                            state._fsp--;

                            stream_expression.add(ex1.getTree());

                            }
                            break;

                    }

                    SEMIC243=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlVar6368);  
                    stream_SEMIC.add(SEMIC243);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1404:70: (ex2= expression )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=NULL && LA61_0<=FALSE)||LA61_0==DELETE||LA61_0==FUNCTION||LA61_0==NEW||LA61_0==THIS||LA61_0==TYPEOF||LA61_0==VOID||LA61_0==LBRACE||LA61_0==LPAREN||LA61_0==LBRACK||(LA61_0>=ADD && LA61_0<=SUB)||(LA61_0>=INC && LA61_0<=DEC)||(LA61_0>=NOT && LA61_0<=INV)||(LA61_0>=Identifier && LA61_0<=StringLiteral)||LA61_0==RegularExpressionLiteral||(LA61_0>=DecimalLiteral && LA61_0<=HexIntegerLiteral)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1404:70: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlVar6372);
                            ex2=expression();

                            state._fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: VAR, SEMIC, ex1, variableDeclarationNoIn, SEMIC, ex2
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1406:4: -> ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ ) ^( SEPARATOR SEMIC ) ^( CONDITION ( $ex1)? ) ^( SEPARATOR SEMIC ) ^( STEP ( $ex2)? )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:7: ^( INIT ^( KEYWORD VAR ) ( variableDeclarationNoIn )+ )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(INIT, "INIT"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:14: ^( KEYWORD VAR )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                        adaptor.addChild(root_2, stream_VAR.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        if ( !(stream_variableDeclarationNoIn.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_variableDeclarationNoIn.hasNext() ) {
                            adaptor.addChild(root_1, stream_variableDeclarationNoIn.nextTree());

                        }
                        stream_variableDeclarationNoIn.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:56: ^( SEPARATOR SEMIC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_SEMIC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:75: ^( CONDITION ( $ex1)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(CONDITION, "CONDITION"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:87: ( $ex1)?
                        if ( stream_ex1.hasNext() ) {
                            adaptor.addChild(root_1, stream_ex1.nextTree());

                        }
                        stream_ex1.reset();

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:94: ^( SEPARATOR SEMIC )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                        adaptor.addChild(root_1, stream_SEMIC.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:113: ^( STEP ( $ex2)? )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(STEP, "STEP"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1406:120: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_1, stream_ex2.nextTree());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "forControlVar"

    public static class forControlExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1411:1: forControlExpression : ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) ;
    public final JavaScriptParser.forControlExpression_return forControlExpression() throws RecognitionException {
        JavaScriptParser.forControlExpression_return retval = new JavaScriptParser.forControlExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IN244=null;
        Token SEMIC245=null;
        Token SEMIC246=null;
        JavaScriptParser.expressionNoIn_return ex1 = null;

        JavaScriptParser.expression_return ex2 = null;

        JavaScriptParser.expression_return ex3 = null;


        CommonTree IN244_tree=null;
        CommonTree SEMIC245_tree=null;
        CommonTree SEMIC246_tree=null;
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_expressionNoIn=new RewriteRuleSubtreeStream(adaptor,"rule expressionNoIn");

        	Object[] isLhs = new Object[1];

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1416:2: (ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1416:4: ex1= expressionNoIn ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            {
            pushFollow(FOLLOW_expressionNoIn_in_forControlExpression6449);
            ex1=expressionNoIn();

            state._fsp--;

            stream_expressionNoIn.add(ex1.getTree());
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1417:2: ({...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) ) | ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==IN) ) {
                alt65=1;
            }
            else if ( (LA65_0==SEMIC) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1418:3: {...}? ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    {
                    if ( !(( isLeftHandSideIn(ex1, isLhs) )) ) {
                        throw new FailedPredicateException(input, "forControlExpression", " isLeftHandSideIn(ex1, isLhs) ");
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1418:37: ( IN ex2= expression -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) ) )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1419:4: IN ex2= expression
                    {
                    IN244=(Token)match(input,IN,FOLLOW_IN_in_forControlExpression6464);  
                    stream_IN.add(IN244);

                    pushFollow(FOLLOW_expression_in_forControlExpression6468);
                    ex2=expression();

                    state._fsp--;

                    stream_expression.add(ex2.getTree());


                    // AST REWRITE
                    // elements: ex2, ex1
                    // token labels: 
                    // rule labels: retval, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1420:4: -> ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1420:7: ^( FORITER ^( EXPR $ex1) ^( EXPR $ex2) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORITER, "FORITER"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1420:18: ^( EXPR $ex1)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1420:33: ^( EXPR $ex2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1423:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1423:3: ( SEMIC (ex2= expression )? SEMIC (ex3= expression )? -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) ) )
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1424:4: SEMIC (ex2= expression )? SEMIC (ex3= expression )?
                    {
                    SEMIC245=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6514);  
                    stream_SEMIC.add(SEMIC245);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1424:13: (ex2= expression )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( ((LA63_0>=NULL && LA63_0<=FALSE)||LA63_0==DELETE||LA63_0==FUNCTION||LA63_0==NEW||LA63_0==THIS||LA63_0==TYPEOF||LA63_0==VOID||LA63_0==LBRACE||LA63_0==LPAREN||LA63_0==LBRACK||(LA63_0>=ADD && LA63_0<=SUB)||(LA63_0>=INC && LA63_0<=DEC)||(LA63_0>=NOT && LA63_0<=INV)||(LA63_0>=Identifier && LA63_0<=StringLiteral)||LA63_0==RegularExpressionLiteral||(LA63_0>=DecimalLiteral && LA63_0<=HexIntegerLiteral)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1424:13: ex2= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6518);
                            ex2=expression();

                            state._fsp--;

                            stream_expression.add(ex2.getTree());

                            }
                            break;

                    }

                    SEMIC246=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlExpression6521);  
                    stream_SEMIC.add(SEMIC246);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1424:35: (ex3= expression )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( ((LA64_0>=NULL && LA64_0<=FALSE)||LA64_0==DELETE||LA64_0==FUNCTION||LA64_0==NEW||LA64_0==THIS||LA64_0==TYPEOF||LA64_0==VOID||LA64_0==LBRACE||LA64_0==LPAREN||LA64_0==LBRACK||(LA64_0>=ADD && LA64_0<=SUB)||(LA64_0>=INC && LA64_0<=DEC)||(LA64_0>=NOT && LA64_0<=INV)||(LA64_0>=Identifier && LA64_0<=StringLiteral)||LA64_0==RegularExpressionLiteral||(LA64_0>=DecimalLiteral && LA64_0<=HexIntegerLiteral)) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1424:35: ex3= expression
                            {
                            pushFollow(FOLLOW_expression_in_forControlExpression6525);
                            ex3=expression();

                            state._fsp--;

                            stream_expression.add(ex3.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ex1, ex2, ex3
                    // token labels: 
                    // rule labels: retval, ex3, ex2, ex1
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_ex3=new RewriteRuleSubtreeStream(adaptor,"rule ex3",ex3!=null?ex3.tree:null);
                    RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
                    RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 1425:4: -> ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                    {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1425:7: ^( FORSTEP ^( EXPR $ex1) ^( EXPR ( $ex2)? ) ^( EXPR ( $ex3)? ) )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORSTEP, "FORSTEP"), root_1);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1425:18: ^( EXPR $ex1)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        adaptor.addChild(root_2, stream_ex1.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1425:33: ^( EXPR ( $ex2)? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1425:41: ( $ex2)?
                        if ( stream_ex2.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex2.nextTree());

                        }
                        stream_ex2.reset();

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1425:49: ^( EXPR ( $ex3)? )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1425:57: ( $ex3)?
                        if ( stream_ex3.hasNext() ) {
                            adaptor.addChild(root_2, stream_ex3.nextTree());

                        }
                        stream_ex3.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "forControlExpression"

    public static class forControlSemic_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forControlSemic"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1430:1: forControlSemic : SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) ;
    public final JavaScriptParser.forControlSemic_return forControlSemic() throws RecognitionException {
        JavaScriptParser.forControlSemic_return retval = new JavaScriptParser.forControlSemic_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SEMIC247=null;
        Token SEMIC248=null;
        JavaScriptParser.expression_return ex1 = null;

        JavaScriptParser.expression_return ex2 = null;


        CommonTree SEMIC247_tree=null;
        CommonTree SEMIC248_tree=null;
        RewriteRuleTokenStream stream_SEMIC=new RewriteRuleTokenStream(adaptor,"token SEMIC");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1431:2: ( SEMIC (ex1= expression )? SEMIC (ex2= expression )? -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1431:4: SEMIC (ex1= expression )? SEMIC (ex2= expression )?
            {
            SEMIC247=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6584);  
            stream_SEMIC.add(SEMIC247);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1431:13: (ex1= expression )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=NULL && LA66_0<=FALSE)||LA66_0==DELETE||LA66_0==FUNCTION||LA66_0==NEW||LA66_0==THIS||LA66_0==TYPEOF||LA66_0==VOID||LA66_0==LBRACE||LA66_0==LPAREN||LA66_0==LBRACK||(LA66_0>=ADD && LA66_0<=SUB)||(LA66_0>=INC && LA66_0<=DEC)||(LA66_0>=NOT && LA66_0<=INV)||(LA66_0>=Identifier && LA66_0<=StringLiteral)||LA66_0==RegularExpressionLiteral||(LA66_0>=DecimalLiteral && LA66_0<=HexIntegerLiteral)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1431:13: ex1= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6588);
                    ex1=expression();

                    state._fsp--;

                    stream_expression.add(ex1.getTree());

                    }
                    break;

            }

            SEMIC248=(Token)match(input,SEMIC,FOLLOW_SEMIC_in_forControlSemic6591);  
            stream_SEMIC.add(SEMIC248);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1431:35: (ex2= expression )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=NULL && LA67_0<=FALSE)||LA67_0==DELETE||LA67_0==FUNCTION||LA67_0==NEW||LA67_0==THIS||LA67_0==TYPEOF||LA67_0==VOID||LA67_0==LBRACE||LA67_0==LPAREN||LA67_0==LBRACK||(LA67_0>=ADD && LA67_0<=SUB)||(LA67_0>=INC && LA67_0<=DEC)||(LA67_0>=NOT && LA67_0<=INV)||(LA67_0>=Identifier && LA67_0<=StringLiteral)||LA67_0==RegularExpressionLiteral||(LA67_0>=DecimalLiteral && LA67_0<=HexIntegerLiteral)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1431:35: ex2= expression
                    {
                    pushFollow(FOLLOW_expression_in_forControlSemic6595);
                    ex2=expression();

                    state._fsp--;

                    stream_expression.add(ex2.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ex1, ex2
            // token labels: 
            // rule labels: retval, ex2, ex1
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ex2=new RewriteRuleSubtreeStream(adaptor,"rule ex2",ex2!=null?ex2.tree:null);
            RewriteRuleSubtreeStream stream_ex1=new RewriteRuleSubtreeStream(adaptor,"rule ex1",ex1!=null?ex1.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1432:2: -> ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1432:5: ^( FORSTEP ^( EXPR ) ^( EXPR ( $ex1)? ) ^( EXPR ( $ex2)? ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORSTEP, "FORSTEP"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1432:16: ^( EXPR )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1432:26: ^( EXPR ( $ex1)? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1432:34: ( $ex1)?
                if ( stream_ex1.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex1.nextTree());

                }
                stream_ex1.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1432:42: ^( EXPR ( $ex2)? )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(EXPR, "EXPR"), root_2);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1432:50: ( $ex2)?
                if ( stream_ex2.hasNext() ) {
                    adaptor.addChild(root_2, stream_ex2.nextTree());

                }
                stream_ex2.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "forControlSemic"

    public static class continueStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "continueStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1444:1: continueStatement : CONTINUE ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.continueStatement_return continueStatement() throws RecognitionException {
        JavaScriptParser.continueStatement_return retval = new JavaScriptParser.continueStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CONTINUE249=null;
        Token Identifier250=null;
        JavaScriptParser.semic_return semic251 = null;


        CommonTree CONTINUE249_tree=null;
        CommonTree Identifier250_tree=null;
        RewriteRuleTokenStream stream_CONTINUE=new RewriteRuleTokenStream(adaptor,"token CONTINUE");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1445:2: ( CONTINUE ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1445:4: CONTINUE ( Identifier )? semic
            {
            CONTINUE249=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueStatement6649);  
            stream_CONTINUE.add(CONTINUE249);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1445:66: ( Identifier )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Identifier) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1445:66: Identifier
                    {
                    Identifier250=(Token)match(input,Identifier,FOLLOW_Identifier_in_continueStatement6653);  
                    stream_Identifier.add(Identifier250);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_continueStatement6656);
            semic251=semic();

            state._fsp--;

            stream_semic.add(semic251.getTree());


            // AST REWRITE
            // elements: Identifier, semic, CONTINUE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1446:2: -> ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1446:5: ^( JUMP_STATEMENT ^( KEYWORD CONTINUE ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1446:22: ^( KEYWORD CONTINUE )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_CONTINUE.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1446:42: ( ^( NAME Identifier ) )?
                if ( stream_Identifier.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1446:42: ^( NAME Identifier )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_Identifier.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1446:62: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "continueStatement"

    public static class breakStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "breakStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1458:1: breakStatement : BREAK ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.breakStatement_return breakStatement() throws RecognitionException {
        JavaScriptParser.breakStatement_return retval = new JavaScriptParser.breakStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BREAK252=null;
        Token Identifier253=null;
        JavaScriptParser.semic_return semic254 = null;


        CommonTree BREAK252_tree=null;
        CommonTree Identifier253_tree=null;
        RewriteRuleTokenStream stream_BREAK=new RewriteRuleTokenStream(adaptor,"token BREAK");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1459:2: ( BREAK ( Identifier )? semic -> ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1459:4: BREAK ( Identifier )? semic
            {
            BREAK252=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakStatement6700);  
            stream_BREAK.add(BREAK252);

             if (input.LA(1) == Identifier) promoteEOL(null); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1459:63: ( Identifier )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Identifier) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1459:63: Identifier
                    {
                    Identifier253=(Token)match(input,Identifier,FOLLOW_Identifier_in_breakStatement6704);  
                    stream_Identifier.add(Identifier253);


                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_breakStatement6707);
            semic254=semic();

            state._fsp--;

            stream_semic.add(semic254.getTree());


            // AST REWRITE
            // elements: Identifier, semic, BREAK
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1460:2: -> ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1460:6: ^( JUMP_STATEMENT ^( KEYWORD BREAK ) ( ^( NAME Identifier ) )? ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1460:23: ^( KEYWORD BREAK )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_BREAK.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1460:40: ( ^( NAME Identifier ) )?
                if ( stream_Identifier.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1460:40: ^( NAME Identifier )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                    adaptor.addChild(root_2, stream_Identifier.nextNode());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_Identifier.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1460:60: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "breakStatement"

    public static class returnStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "returnStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1480:1: returnStatement : RETURN ( expression )? semic -> ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.returnStatement_return returnStatement() throws RecognitionException {
        JavaScriptParser.returnStatement_return retval = new JavaScriptParser.returnStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token RETURN255=null;
        JavaScriptParser.expression_return expression256 = null;

        JavaScriptParser.semic_return semic257 = null;


        CommonTree RETURN255_tree=null;
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1481:2: ( RETURN ( expression )? semic -> ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1481:4: RETURN ( expression )? semic
            {
            RETURN255=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnStatement6752);  
            stream_RETURN.add(RETURN255);

             promoteEOL(null); 
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1481:33: ( expression )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=NULL && LA70_0<=FALSE)||LA70_0==DELETE||LA70_0==FUNCTION||LA70_0==NEW||LA70_0==THIS||LA70_0==TYPEOF||LA70_0==VOID||LA70_0==LBRACE||LA70_0==LPAREN||LA70_0==LBRACK||(LA70_0>=ADD && LA70_0<=SUB)||(LA70_0>=INC && LA70_0<=DEC)||(LA70_0>=NOT && LA70_0<=INV)||(LA70_0>=Identifier && LA70_0<=StringLiteral)||LA70_0==RegularExpressionLiteral||(LA70_0>=DecimalLiteral && LA70_0<=HexIntegerLiteral)) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1481:33: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement6756);
                    expression256=expression();

                    state._fsp--;

                    stream_expression.add(expression256.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_semic_in_returnStatement6759);
            semic257=semic();

            state._fsp--;

            stream_semic.add(semic257.getTree());


            // AST REWRITE
            // elements: semic, expression, RETURN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1482:2: -> ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1482:5: ^( JUMP_STATEMENT ^( KEYWORD RETURN ) ( expression )? ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1482:22: ^( KEYWORD RETURN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_RETURN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1482:40: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1482:52: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "returnStatement"

    public static class withStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "withStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1489:1: withStatement : WITH LPAREN expression RPAREN statement -> ^( KEYWORD WITH ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) statement ;
    public final JavaScriptParser.withStatement_return withStatement() throws RecognitionException {
        JavaScriptParser.withStatement_return retval = new JavaScriptParser.withStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token WITH258=null;
        Token LPAREN259=null;
        Token RPAREN261=null;
        JavaScriptParser.expression_return expression260 = null;

        JavaScriptParser.statement_return statement262 = null;


        CommonTree WITH258_tree=null;
        CommonTree LPAREN259_tree=null;
        CommonTree RPAREN261_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_WITH=new RewriteRuleTokenStream(adaptor,"token WITH");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1490:2: ( WITH LPAREN expression RPAREN statement -> ^( KEYWORD WITH ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) statement )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1490:4: WITH LPAREN expression RPAREN statement
            {
            WITH258=(Token)match(input,WITH,FOLLOW_WITH_in_withStatement6797);  
            stream_WITH.add(WITH258);

            LPAREN259=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_withStatement6799);  
            stream_LPAREN.add(LPAREN259);

            pushFollow(FOLLOW_expression_in_withStatement6801);
            expression260=expression();

            state._fsp--;

            stream_expression.add(expression260.getTree());
            RPAREN261=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_withStatement6803);  
            stream_RPAREN.add(RPAREN261);

            pushFollow(FOLLOW_statement_in_withStatement6805);
            statement262=statement();

            state._fsp--;

            stream_statement.add(statement262.getTree());


            // AST REWRITE
            // elements: statement, expression, WITH, RPAREN, LPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1491:2: -> ^( KEYWORD WITH ) ^( SEPARATOR LPAREN ) expression ^( SEPARATOR RPAREN ) statement
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1491:5: ^( KEYWORD WITH )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                adaptor.addChild(root_1, stream_WITH.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1491:21: ^( SEPARATOR LPAREN )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_LPAREN.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_expression.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1491:52: ^( SEPARATOR RPAREN )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_RPAREN.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class switchStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1498:1: switchStatement : SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) ;
    public final JavaScriptParser.switchStatement_return switchStatement() throws RecognitionException {
        JavaScriptParser.switchStatement_return retval = new JavaScriptParser.switchStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token SWITCH263=null;
        Token LPAREN264=null;
        Token RPAREN266=null;
        Token LBRACE267=null;
        Token RBRACE270=null;
        JavaScriptParser.expression_return expression265 = null;

        JavaScriptParser.defaultClause_return defaultClause268 = null;

        JavaScriptParser.caseClause_return caseClause269 = null;


        CommonTree SWITCH263_tree=null;
        CommonTree LPAREN264_tree=null;
        CommonTree RPAREN266_tree=null;
        CommonTree LBRACE267_tree=null;
        CommonTree RBRACE270_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_SWITCH=new RewriteRuleTokenStream(adaptor,"token SWITCH");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_defaultClause=new RewriteRuleSubtreeStream(adaptor,"rule defaultClause");

        	int defaultClauseCount = 0;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1503:2: ( SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE -> ^( SWITCH expression ( defaultClause )? ( caseClause )* ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1503:4: SWITCH LPAREN expression RPAREN LBRACE ({...}? => defaultClause | caseClause )* RBRACE
            {
            SWITCH263=(Token)match(input,SWITCH,FOLLOW_SWITCH_in_switchStatement6851);  
            stream_SWITCH.add(SWITCH263);

            LPAREN264=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_switchStatement6853);  
            stream_LPAREN.add(LPAREN264);

            pushFollow(FOLLOW_expression_in_switchStatement6855);
            expression265=expression();

            state._fsp--;

            stream_expression.add(expression265.getTree());
            RPAREN266=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_switchStatement6857);  
            stream_RPAREN.add(RPAREN266);

            LBRACE267=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_switchStatement6859);  
            stream_LBRACE.add(LBRACE267);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1503:43: ({...}? => defaultClause | caseClause )*
            loop71:
            do {
                int alt71=3;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==DEFAULT) && (( defaultClauseCount == 0 ))) {
                    alt71=1;
                }
                else if ( (LA71_0==CASE) ) {
                    alt71=2;
                }


                switch (alt71) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1503:45: {...}? => defaultClause
            	    {
            	    if ( !(( defaultClauseCount == 0 )) ) {
            	        throw new FailedPredicateException(input, "switchStatement", " defaultClauseCount == 0 ");
            	    }
            	    pushFollow(FOLLOW_defaultClause_in_switchStatement6866);
            	    defaultClause268=defaultClause();

            	    state._fsp--;

            	    stream_defaultClause.add(defaultClause268.getTree());
            	     defaultClauseCount++; 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1503:118: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_switchStatement6872);
            	    caseClause269=caseClause();

            	    state._fsp--;

            	    stream_caseClause.add(caseClause269.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            RBRACE270=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_switchStatement6877);  
            stream_RBRACE.add(RBRACE270);



            // AST REWRITE
            // elements: defaultClause, SWITCH, caseClause, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1504:2: -> ^( SWITCH expression ( defaultClause )? ( caseClause )* )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1504:5: ^( SWITCH expression ( defaultClause )? ( caseClause )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_SWITCH.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1504:26: ( defaultClause )?
                if ( stream_defaultClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_defaultClause.nextTree());

                }
                stream_defaultClause.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1504:41: ( caseClause )*
                while ( stream_caseClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseClause.nextTree());

                }
                stream_caseClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "switchStatement"

    public static class caseClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "caseClause"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1507:1: caseClause : CASE expression COLON ( statement )* ;
    public final JavaScriptParser.caseClause_return caseClause() throws RecognitionException {
        JavaScriptParser.caseClause_return retval = new JavaScriptParser.caseClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CASE271=null;
        Token COLON273=null;
        JavaScriptParser.expression_return expression272 = null;

        JavaScriptParser.statement_return statement274 = null;


        CommonTree CASE271_tree=null;
        CommonTree COLON273_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1508:2: ( CASE expression COLON ( statement )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1508:4: CASE expression COLON ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            CASE271=(Token)match(input,CASE,FOLLOW_CASE_in_caseClause6905); 
            CASE271_tree = (CommonTree)adaptor.create(CASE271);
            root_0 = (CommonTree)adaptor.becomeRoot(CASE271_tree, root_0);

            pushFollow(FOLLOW_expression_in_caseClause6908);
            expression272=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression272.getTree());
            COLON273=(Token)match(input,COLON,FOLLOW_COLON_in_caseClause6910); 
            COLON273_tree = (CommonTree)adaptor.create(COLON273);
            adaptor.addChild(root_0, COLON273_tree);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1508:27: ( statement )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=NULL && LA72_0<=BREAK)||LA72_0==CONTINUE||(LA72_0>=DELETE && LA72_0<=DO)||(LA72_0>=FOR && LA72_0<=IF)||(LA72_0>=NEW && LA72_0<=WITH)||LA72_0==LBRACE||LA72_0==LPAREN||LA72_0==LBRACK||LA72_0==SEMIC||(LA72_0>=ADD && LA72_0<=SUB)||(LA72_0>=INC && LA72_0<=DEC)||(LA72_0>=NOT && LA72_0<=INV)||(LA72_0>=Identifier && LA72_0<=StringLiteral)||LA72_0==RegularExpressionLiteral||(LA72_0>=DecimalLiteral && LA72_0<=HexIntegerLiteral)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1508:27: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseClause6912);
            	    statement274=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement274.getTree());

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class defaultClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "defaultClause"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1511:1: defaultClause : DEFAULT COLON ( statement )* ;
    public final JavaScriptParser.defaultClause_return defaultClause() throws RecognitionException {
        JavaScriptParser.defaultClause_return retval = new JavaScriptParser.defaultClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEFAULT275=null;
        Token COLON276=null;
        JavaScriptParser.statement_return statement277 = null;


        CommonTree DEFAULT275_tree=null;
        CommonTree COLON276_tree=null;

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1512:2: ( DEFAULT COLON ( statement )* )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1512:4: DEFAULT COLON ( statement )*
            {
            root_0 = (CommonTree)adaptor.nil();

            DEFAULT275=(Token)match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultClause6925); 
            DEFAULT275_tree = (CommonTree)adaptor.create(DEFAULT275);
            root_0 = (CommonTree)adaptor.becomeRoot(DEFAULT275_tree, root_0);

            COLON276=(Token)match(input,COLON,FOLLOW_COLON_in_defaultClause6928); 
            COLON276_tree = (CommonTree)adaptor.create(COLON276);
            adaptor.addChild(root_0, COLON276_tree);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1512:19: ( statement )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( ((LA73_0>=NULL && LA73_0<=BREAK)||LA73_0==CONTINUE||(LA73_0>=DELETE && LA73_0<=DO)||(LA73_0>=FOR && LA73_0<=IF)||(LA73_0>=NEW && LA73_0<=WITH)||LA73_0==LBRACE||LA73_0==LPAREN||LA73_0==LBRACK||LA73_0==SEMIC||(LA73_0>=ADD && LA73_0<=SUB)||(LA73_0>=INC && LA73_0<=DEC)||(LA73_0>=NOT && LA73_0<=INV)||(LA73_0>=Identifier && LA73_0<=StringLiteral)||LA73_0==RegularExpressionLiteral||(LA73_0>=DecimalLiteral && LA73_0<=HexIntegerLiteral)) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1512:19: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultClause6930);
            	    statement277=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement277.getTree());

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "defaultClause"

    public static class labelledStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "labelledStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1519:1: labelledStatement : Identifier COLON statement -> ^( NAME Identifier ) ^( SEPARATOR COLON ) statement ;
    public final JavaScriptParser.labelledStatement_return labelledStatement() throws RecognitionException {
        JavaScriptParser.labelledStatement_return retval = new JavaScriptParser.labelledStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Identifier278=null;
        Token COLON279=null;
        JavaScriptParser.statement_return statement280 = null;


        CommonTree Identifier278_tree=null;
        CommonTree COLON279_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1520:2: ( Identifier COLON statement -> ^( NAME Identifier ) ^( SEPARATOR COLON ) statement )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1520:4: Identifier COLON statement
            {
            Identifier278=(Token)match(input,Identifier,FOLLOW_Identifier_in_labelledStatement6947);  
            stream_Identifier.add(Identifier278);

            COLON279=(Token)match(input,COLON,FOLLOW_COLON_in_labelledStatement6949);  
            stream_COLON.add(COLON279);

            pushFollow(FOLLOW_statement_in_labelledStatement6951);
            statement280=statement();

            state._fsp--;

            stream_statement.add(statement280.getTree());


            // AST REWRITE
            // elements: statement, Identifier, COLON
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1521:2: -> ^( NAME Identifier ) ^( SEPARATOR COLON ) statement
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1521:6: ^( NAME Identifier )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_Identifier.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1521:25: ^( SEPARATOR COLON )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_1);

                adaptor.addChild(root_1, stream_COLON.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                adaptor.addChild(root_0, stream_statement.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "labelledStatement"

    public static class throwStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throwStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1543:1: throwStatement : THROW expression semic -> ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) ) ;
    public final JavaScriptParser.throwStatement_return throwStatement() throws RecognitionException {
        JavaScriptParser.throwStatement_return retval = new JavaScriptParser.throwStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token THROW281=null;
        JavaScriptParser.expression_return expression282 = null;

        JavaScriptParser.semic_return semic283 = null;


        CommonTree THROW281_tree=null;
        RewriteRuleTokenStream stream_THROW=new RewriteRuleTokenStream(adaptor,"token THROW");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_semic=new RewriteRuleSubtreeStream(adaptor,"rule semic");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1544:2: ( THROW expression semic -> ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1544:4: THROW expression semic
            {
            THROW281=(Token)match(input,THROW,FOLLOW_THROW_in_throwStatement6987);  
            stream_THROW.add(THROW281);

             promoteEOL(null); 
            pushFollow(FOLLOW_expression_in_throwStatement6991);
            expression282=expression();

            state._fsp--;

            stream_expression.add(expression282.getTree());
            pushFollow(FOLLOW_semic_in_throwStatement6993);
            semic283=semic();

            state._fsp--;

            stream_semic.add(semic283.getTree());


            // AST REWRITE
            // elements: semic, THROW, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1545:2: -> ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1545:5: ^( JUMP_STATEMENT ^( KEYWORD THROW ) expression ^( SEPARATOR semic ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(JUMP_STATEMENT, "JUMP_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1545:22: ^( KEYWORD THROW )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_THROW.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_expression.nextTree());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1545:50: ^( SEPARATOR semic )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_semic.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "throwStatement"

    public static class tryStatement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "tryStatement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1552:1: tryStatement : TRY block catchOrFinally -> ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally ) ;
    public final JavaScriptParser.tryStatement_return tryStatement() throws RecognitionException {
        JavaScriptParser.tryStatement_return retval = new JavaScriptParser.tryStatement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TRY284=null;
        JavaScriptParser.block_return block285 = null;

        JavaScriptParser.catchOrFinally_return catchOrFinally286 = null;


        CommonTree TRY284_tree=null;
        RewriteRuleTokenStream stream_TRY=new RewriteRuleTokenStream(adaptor,"token TRY");
        RewriteRuleSubtreeStream stream_catchOrFinally=new RewriteRuleSubtreeStream(adaptor,"rule catchOrFinally");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1553:2: ( TRY block catchOrFinally -> ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1553:4: TRY block catchOrFinally
            {
            TRY284=(Token)match(input,TRY,FOLLOW_TRY_in_tryStatement7030);  
            stream_TRY.add(TRY284);

            pushFollow(FOLLOW_block_in_tryStatement7032);
            block285=block();

            state._fsp--;

            stream_block.add(block285.getTree());
            pushFollow(FOLLOW_catchOrFinally_in_tryStatement7034);
            catchOrFinally286=catchOrFinally();

            state._fsp--;

            stream_catchOrFinally.add(catchOrFinally286.getTree());


            // AST REWRITE
            // elements: TRY, block, catchOrFinally
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1554:2: -> ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1554:5: ^( BRANCH_STATEMENT ^( KEYWORD TRY ) block catchOrFinally )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH_STATEMENT, "BRANCH_STATEMENT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1554:24: ^( KEYWORD TRY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_TRY.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());
                adaptor.addChild(root_1, stream_catchOrFinally.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "tryStatement"

    public static class catchOrFinally_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchOrFinally"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1557:1: catchOrFinally : ( catchClause ( finallyClause )? | finallyClause );
    public final JavaScriptParser.catchOrFinally_return catchOrFinally() throws RecognitionException {
        JavaScriptParser.catchOrFinally_return retval = new JavaScriptParser.catchOrFinally_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.catchClause_return catchClause287 = null;

        JavaScriptParser.finallyClause_return finallyClause288 = null;

        JavaScriptParser.finallyClause_return finallyClause289 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1558:2: ( catchClause ( finallyClause )? | finallyClause )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==CATCH) ) {
                alt75=1;
            }
            else if ( (LA75_0==FINALLY) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1558:4: catchClause ( finallyClause )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_catchClause_in_catchOrFinally7063);
                    catchClause287=catchClause();

                    state._fsp--;

                    adaptor.addChild(root_0, catchClause287.getTree());
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1558:16: ( finallyClause )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==FINALLY) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1558:16: finallyClause
                            {
                            pushFollow(FOLLOW_finallyClause_in_catchOrFinally7065);
                            finallyClause288=finallyClause();

                            state._fsp--;

                            adaptor.addChild(root_0, finallyClause288.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1558:33: finallyClause
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_finallyClause_in_catchOrFinally7070);
                    finallyClause289=finallyClause();

                    state._fsp--;

                    adaptor.addChild(root_0, finallyClause289.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "catchOrFinally"

    public static class catchClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchClause"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1560:1: catchClause : CATCH LPAREN Identifier RPAREN block -> ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block ) ;
    public final JavaScriptParser.catchClause_return catchClause() throws RecognitionException {
        JavaScriptParser.catchClause_return retval = new JavaScriptParser.catchClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token CATCH290=null;
        Token LPAREN291=null;
        Token Identifier292=null;
        Token RPAREN293=null;
        JavaScriptParser.block_return block294 = null;


        CommonTree CATCH290_tree=null;
        CommonTree LPAREN291_tree=null;
        CommonTree Identifier292_tree=null;
        CommonTree RPAREN293_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_CATCH=new RewriteRuleTokenStream(adaptor,"token CATCH");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1561:2: ( CATCH LPAREN Identifier RPAREN block -> ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1561:4: CATCH LPAREN Identifier RPAREN block
            {
            CATCH290=(Token)match(input,CATCH,FOLLOW_CATCH_in_catchClause7080);  
            stream_CATCH.add(CATCH290);

            LPAREN291=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchClause7082);  
            stream_LPAREN.add(LPAREN291);

            Identifier292=(Token)match(input,Identifier,FOLLOW_Identifier_in_catchClause7084);  
            stream_Identifier.add(Identifier292);

            RPAREN293=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchClause7086);  
            stream_RPAREN.add(RPAREN293);

            pushFollow(FOLLOW_block_in_catchClause7088);
            block294=block();

            state._fsp--;

            stream_block.add(block294.getTree());


            // AST REWRITE
            // elements: Identifier, CATCH, block, RPAREN, LPAREN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1562:2: -> ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1562:5: ^( BRANCH ^( KEYWORD CATCH ) ^( SEPARATOR LPAREN ) Identifier ^( SEPARATOR RPAREN ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1562:14: ^( KEYWORD CATCH )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_CATCH.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1562:31: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_Identifier.nextNode());
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1562:62: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "catchClause"

    public static class finallyClause_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "finallyClause"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1565:1: finallyClause : FINALLY block -> ^( BRANCH ^( KEYWORD FINALLY ) block ) ;
    public final JavaScriptParser.finallyClause_return finallyClause() throws RecognitionException {
        JavaScriptParser.finallyClause_return retval = new JavaScriptParser.finallyClause_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FINALLY295=null;
        JavaScriptParser.block_return block296 = null;


        CommonTree FINALLY295_tree=null;
        RewriteRuleTokenStream stream_FINALLY=new RewriteRuleTokenStream(adaptor,"token FINALLY");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1566:2: ( FINALLY block -> ^( BRANCH ^( KEYWORD FINALLY ) block ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1566:4: FINALLY block
            {
            FINALLY295=(Token)match(input,FINALLY,FOLLOW_FINALLY_in_finallyClause7129);  
            stream_FINALLY.add(FINALLY295);

            pushFollow(FOLLOW_block_in_finallyClause7131);
            block296=block();

            state._fsp--;

            stream_block.add(block296.getTree());


            // AST REWRITE
            // elements: block, FINALLY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1567:2: -> ^( BRANCH ^( KEYWORD FINALLY ) block )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1567:5: ^( BRANCH ^( KEYWORD FINALLY ) block )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BRANCH, "BRANCH"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1567:14: ^( KEYWORD FINALLY )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(KEYWORD, "KEYWORD"), root_2);

                adaptor.addChild(root_2, stream_FINALLY.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "finallyClause"

    public static class functionDeclaration_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDeclaration"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1580:1: functionDeclaration : FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody ) ;
    public final JavaScriptParser.functionDeclaration_return functionDeclaration() throws RecognitionException {
        JavaScriptParser.functionDeclaration_return retval = new JavaScriptParser.functionDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token FUNCTION297=null;
        JavaScriptParser.formalParameterList_return formalParameterList298 = null;

        JavaScriptParser.functionBody_return functionBody299 = null;


        CommonTree name_tree=null;
        CommonTree FUNCTION297_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1581:2: ( FUNCTION name= Identifier formalParameterList functionBody -> ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1581:4: FUNCTION name= Identifier formalParameterList functionBody
            {
            FUNCTION297=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDeclaration7167);  
            stream_FUNCTION.add(FUNCTION297);

            name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionDeclaration7171);  
            stream_Identifier.add(name);

            pushFollow(FOLLOW_formalParameterList_in_functionDeclaration7173);
            formalParameterList298=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList298.getTree());
            pushFollow(FOLLOW_functionBody_in_functionDeclaration7175);
            functionBody299=functionBody();

            state._fsp--;

            stream_functionBody.add(functionBody299.getTree());


            // AST REWRITE
            // elements: functionBody, name, formalParameterList
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1582:2: -> ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1582:5: ^( FUNCTION_DECL ^( NAME $name) formalParameterList functionBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FUNCTION_DECL, "FUNCTION_DECL"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1582:22: ^( NAME $name)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_2);

                adaptor.addChild(root_2, stream_name.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "functionDeclaration"

    public static class functionExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionExpression"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1585:1: functionExpression : FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) ;
    public final JavaScriptParser.functionExpression_return functionExpression() throws RecognitionException {
        JavaScriptParser.functionExpression_return retval = new JavaScriptParser.functionExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token name=null;
        Token FUNCTION300=null;
        JavaScriptParser.formalParameterList_return formalParameterList301 = null;

        JavaScriptParser.functionBody_return functionBody302 = null;


        CommonTree name_tree=null;
        CommonTree FUNCTION300_tree=null;
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleSubtreeStream stream_functionBody=new RewriteRuleSubtreeStream(adaptor,"rule functionBody");
        RewriteRuleSubtreeStream stream_formalParameterList=new RewriteRuleSubtreeStream(adaptor,"rule formalParameterList");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1586:2: ( FUNCTION (name= Identifier )? formalParameterList functionBody -> ^( FUNCTION ( $name)? formalParameterList functionBody ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1586:4: FUNCTION (name= Identifier )? formalParameterList functionBody
            {
            FUNCTION300=(Token)match(input,FUNCTION,FOLLOW_FUNCTION_in_functionExpression7206);  
            stream_FUNCTION.add(FUNCTION300);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1586:17: (name= Identifier )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==Identifier) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1586:17: name= Identifier
                    {
                    name=(Token)match(input,Identifier,FOLLOW_Identifier_in_functionExpression7210);  
                    stream_Identifier.add(name);


                    }
                    break;

            }

            pushFollow(FOLLOW_formalParameterList_in_functionExpression7213);
            formalParameterList301=formalParameterList();

            state._fsp--;

            stream_formalParameterList.add(formalParameterList301.getTree());
            pushFollow(FOLLOW_functionBody_in_functionExpression7215);
            functionBody302=functionBody();

            state._fsp--;

            stream_functionBody.add(functionBody302.getTree());


            // AST REWRITE
            // elements: FUNCTION, functionBody, formalParameterList, name
            // token labels: name
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1587:2: -> ^( FUNCTION ( $name)? formalParameterList functionBody )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1587:5: ^( FUNCTION ( $name)? formalParameterList functionBody )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_FUNCTION.nextNode(), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1587:17: ( $name)?
                if ( stream_name.hasNext() ) {
                    adaptor.addChild(root_1, stream_name.nextNode());

                }
                stream_name.reset();
                adaptor.addChild(root_1, stream_formalParameterList.nextTree());
                adaptor.addChild(root_1, stream_functionBody.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "functionExpression"

    public static class formalParameterList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterList"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1590:1: formalParameterList : LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN -> ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) ) ;
    public final JavaScriptParser.formalParameterList_return formalParameterList() throws RecognitionException {
        JavaScriptParser.formalParameterList_return retval = new JavaScriptParser.formalParameterList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LPAREN303=null;
        Token Identifier304=null;
        Token COMMA305=null;
        Token Identifier306=null;
        Token RPAREN307=null;

        CommonTree LPAREN303_tree=null;
        CommonTree Identifier304_tree=null;
        CommonTree COMMA305_tree=null;
        CommonTree Identifier306_tree=null;
        CommonTree RPAREN307_tree=null;
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");

        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1591:2: ( LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN -> ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1591:4: LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN
            {
            LPAREN303=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_formalParameterList7243);  
            stream_LPAREN.add(LPAREN303);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1591:11: ( Identifier ( COMMA Identifier )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Identifier) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1591:13: Identifier ( COMMA Identifier )*
                    {
                    Identifier304=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList7247);  
                    stream_Identifier.add(Identifier304);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1591:24: ( COMMA Identifier )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==COMMA) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1591:26: COMMA Identifier
                    	    {
                    	    COMMA305=(Token)match(input,COMMA,FOLLOW_COMMA_in_formalParameterList7251);  
                    	    stream_COMMA.add(COMMA305);

                    	    Identifier306=(Token)match(input,Identifier,FOLLOW_Identifier_in_formalParameterList7253);  
                    	    stream_Identifier.add(Identifier306);


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            RPAREN307=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_formalParameterList7261);  
            stream_RPAREN.add(RPAREN307);



            // AST REWRITE
            // elements: LPAREN, RPAREN, Identifier, Identifier, COMMA
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1592:2: -> ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:5: ^( FORMAL_PARAM_LIST ^( SEPARATOR LPAREN ) ( ^( PARAMETER_DECL ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( NAME Identifier ) ) )* )? ^( SEPARATOR RPAREN ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(FORMAL_PARAM_LIST, "FORMAL_PARAM_LIST"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:25: ^( SEPARATOR LPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_LPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:45: ( ^( PARAMETER_DECL ^( NAME Identifier ) ) ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( NAME Identifier ) ) )* )?
                if ( stream_Identifier.hasNext()||stream_Identifier.hasNext()||stream_COMMA.hasNext() ) {
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:47: ^( PARAMETER_DECL ^( NAME Identifier ) )
                    {
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_2);

                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:64: ^( NAME Identifier )
                    {
                    CommonTree root_3 = (CommonTree)adaptor.nil();
                    root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);

                    adaptor.addChild(root_3, stream_Identifier.nextNode());

                    adaptor.addChild(root_2, root_3);
                    }

                    adaptor.addChild(root_1, root_2);
                    }
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:84: ( ^( SEPARATOR COMMA ) ^( PARAMETER_DECL ^( NAME Identifier ) ) )*
                    while ( stream_Identifier.hasNext()||stream_COMMA.hasNext() ) {
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:86: ^( SEPARATOR COMMA )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                        adaptor.addChild(root_2, stream_COMMA.nextNode());

                        adaptor.addChild(root_1, root_2);
                        }
                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:105: ^( PARAMETER_DECL ^( NAME Identifier ) )
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(PARAMETER_DECL, "PARAMETER_DECL"), root_2);

                        // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:122: ^( NAME Identifier )
                        {
                        CommonTree root_3 = (CommonTree)adaptor.nil();
                        root_3 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(NAME, "NAME"), root_3);

                        adaptor.addChild(root_3, stream_Identifier.nextNode());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

                    }
                    stream_Identifier.reset();
                    stream_COMMA.reset();

                }
                stream_Identifier.reset();
                stream_Identifier.reset();
                stream_COMMA.reset();
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1592:148: ^( SEPARATOR RPAREN )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(SEPARATOR, "SEPARATOR"), root_2);

                adaptor.addChild(root_2, stream_RPAREN.nextNode());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "formalParameterList"

    public static class functionBody_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionBody"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1595:1: functionBody : lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK_SCOPE[$lb, \"BLOCK_SCOPE\"] ( sourceElement )* ) ;
    public final JavaScriptParser.functionBody_return functionBody() throws RecognitionException {
        JavaScriptParser.functionBody_return retval = new JavaScriptParser.functionBody_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lb=null;
        Token RBRACE309=null;
        JavaScriptParser.sourceElement_return sourceElement308 = null;


        CommonTree lb_tree=null;
        CommonTree RBRACE309_tree=null;
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1596:2: (lb= LBRACE ( sourceElement )* RBRACE -> ^( BLOCK_SCOPE[$lb, \"BLOCK_SCOPE\"] ( sourceElement )* ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1596:4: lb= LBRACE ( sourceElement )* RBRACE
            {
            lb=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_functionBody7329);  
            stream_LBRACE.add(lb);

            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1596:14: ( sourceElement )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=NULL && LA79_0<=BREAK)||LA79_0==CONTINUE||(LA79_0>=DELETE && LA79_0<=DO)||(LA79_0>=FOR && LA79_0<=IF)||(LA79_0>=NEW && LA79_0<=WITH)||LA79_0==LBRACE||LA79_0==LPAREN||LA79_0==LBRACK||LA79_0==SEMIC||(LA79_0>=ADD && LA79_0<=SUB)||(LA79_0>=INC && LA79_0<=DEC)||(LA79_0>=NOT && LA79_0<=INV)||(LA79_0>=Identifier && LA79_0<=StringLiteral)||LA79_0==RegularExpressionLiteral||(LA79_0>=DecimalLiteral && LA79_0<=HexIntegerLiteral)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1596:14: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_functionBody7331);
            	    sourceElement308=sourceElement();

            	    state._fsp--;

            	    stream_sourceElement.add(sourceElement308.getTree());

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            RBRACE309=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_functionBody7334);  
            stream_RBRACE.add(RBRACE309);



            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1597:2: -> ^( BLOCK_SCOPE[$lb, \"BLOCK_SCOPE\"] ( sourceElement )* )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1597:5: ^( BLOCK_SCOPE[$lb, \"BLOCK_SCOPE\"] ( sourceElement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(BLOCK_SCOPE, lb, "BLOCK_SCOPE"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1597:40: ( sourceElement )*
                while ( stream_sourceElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElement.nextTree());

                }
                stream_sourceElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "functionBody"

    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1605:1: program : ( sourceElement )* -> ^( COMPILATION_UNIT ( sourceElement )* ) ;
    public final JavaScriptParser.program_return program() throws RecognitionException {
        JavaScriptParser.program_return retval = new JavaScriptParser.program_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.sourceElement_return sourceElement310 = null;


        RewriteRuleSubtreeStream stream_sourceElement=new RewriteRuleSubtreeStream(adaptor,"rule sourceElement");
        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1606:2: ( ( sourceElement )* -> ^( COMPILATION_UNIT ( sourceElement )* ) )
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1606:4: ( sourceElement )*
            {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1606:4: ( sourceElement )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=NULL && LA80_0<=BREAK)||LA80_0==CONTINUE||(LA80_0>=DELETE && LA80_0<=DO)||(LA80_0>=FOR && LA80_0<=IF)||(LA80_0>=NEW && LA80_0<=WITH)||LA80_0==LBRACE||LA80_0==LPAREN||LA80_0==LBRACK||LA80_0==SEMIC||(LA80_0>=ADD && LA80_0<=SUB)||(LA80_0>=INC && LA80_0<=DEC)||(LA80_0>=NOT && LA80_0<=INV)||(LA80_0>=Identifier && LA80_0<=StringLiteral)||LA80_0==RegularExpressionLiteral||(LA80_0>=DecimalLiteral && LA80_0<=HexIntegerLiteral)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1606:4: sourceElement
            	    {
            	    pushFollow(FOLLOW_sourceElement_in_program7366);
            	    sourceElement310=sourceElement();

            	    state._fsp--;

            	    stream_sourceElement.add(sourceElement310.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);



            // AST REWRITE
            // elements: sourceElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 1607:2: -> ^( COMPILATION_UNIT ( sourceElement )* )
            {
                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1607:5: ^( COMPILATION_UNIT ( sourceElement )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot((CommonTree)adaptor.create(COMPILATION_UNIT, "COMPILATION_UNIT"), root_1);

                // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1607:24: ( sourceElement )*
                while ( stream_sourceElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_sourceElement.nextTree());

                }
                stream_sourceElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "program"

    public static class sourceElement_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "sourceElement"
    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1615:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );
    public final JavaScriptParser.sourceElement_return sourceElement() throws RecognitionException {
        JavaScriptParser.sourceElement_return retval = new JavaScriptParser.sourceElement_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JavaScriptParser.functionDeclaration_return functionDeclaration311 = null;

        JavaScriptParser.statement_return statement312 = null;



        try {
            // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1616:20: ({...}? functionDeclaration | statement )
            int alt81=2;
            alt81 = dfa81.predict(input);
            switch (alt81) {
                case 1 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1617:1: {...}? functionDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    if ( !(( input.LA(1) == FUNCTION )) ) {
                        throw new FailedPredicateException(input, "sourceElement", " input.LA(1) == FUNCTION ");
                    }
                    pushFollow(FOLLOW_functionDeclaration_in_sourceElement7409);
                    functionDeclaration311=functionDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, functionDeclaration311.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tijana\\dev\\clone-detection\\ssqsa_2.0\\eCSTGenerator_v2.0\\src\\Languages\\javaScript\\JavaScript.g:1619:4: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_statement_in_sourceElement7414);
                    statement312=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement312.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // $ANTLR end "sourceElement"

    // Delegated rules


    protected DFA50 dfa50 = new DFA50(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA81 dfa81 = new DFA81(this);
    static final String DFA50_eotS =
        "\44\uffff";
    static final String DFA50_eofS =
        "\44\uffff";
    static final String DFA50_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA50_maxS =
        "\1\u00c6\1\0\42\uffff";
    static final String DFA50_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA50_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA50_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\3\2\2\uffff\13\2\37\uffff"+
            "\1\1\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff\2\2\2\uffff"+
            "\2\2\6\uffff\2\2\133\uffff\2\2\5\uffff\1\2\3\uffff\3\2",
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
            return "1232:1: statement options {k=1; } : ({...}? block | statementTail );";
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
                        if ( (( input.LA(1) == LBRACE )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index50_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 50, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\17\uffff";
    static final String DFA51_eofS =
        "\4\uffff\1\3\12\uffff";
    static final String DFA51_minS =
        "\1\4\3\uffff\1\23\12\uffff";
    static final String DFA51_maxS =
        "\1\u00c6\3\uffff\1\u00b7\12\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\13\1\14"+
        "\1\15\1\12";
    static final String DFA51_specialS =
        "\17\uffff}>";
    static final String[] DFA51_transitionS = {
            "\3\3\1\10\2\uffff\1\7\1\uffff\1\3\1\6\2\uffff\1\6\1\3\1\5\2"+
            "\uffff\1\3\1\11\1\13\1\3\1\14\1\15\1\3\1\1\1\3\1\6\1\12\37\uffff"+
            "\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff\1\2\11\uffff\2\3\2\uffff"+
            "\2\3\6\uffff\2\3\133\uffff\1\4\1\3\5\uffff\1\3\3\uffff\3\3",
            "",
            "",
            "",
            "\2\3\53\uffff\2\3\1\uffff\1\3\1\uffff\27\3\2\uffff\3\3\1\16"+
            "\15\3\107\uffff\2\3",
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
            return "1241:1: statementTail : ( variableStatement | emptyStatement | expressionStatement | ifStatement | iterationStatement | continueStatement | breakStatement | returnStatement | withStatement | labelledStatement | switchStatement | throwStatement | tryStatement );";
        }
    }
    static final String DFA81_eotS =
        "\44\uffff";
    static final String DFA81_eofS =
        "\44\uffff";
    static final String DFA81_minS =
        "\1\4\1\0\42\uffff";
    static final String DFA81_maxS =
        "\1\u00c6\1\0\42\uffff";
    static final String DFA81_acceptS =
        "\2\uffff\1\2\40\uffff\1\1";
    static final String DFA81_specialS =
        "\1\uffff\1\0\42\uffff}>";
    static final String[] DFA81_transitionS = {
            "\4\2\2\uffff\1\2\1\uffff\2\2\2\uffff\1\2\1\1\1\2\2\uffff\13"+
            "\2\37\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\2\11\uffff"+
            "\2\2\2\uffff\2\2\6\uffff\2\2\133\uffff\2\2\5\uffff\1\2\3\uffff"+
            "\3\2",
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

    static final short[] DFA81_eot = DFA.unpackEncodedString(DFA81_eotS);
    static final short[] DFA81_eof = DFA.unpackEncodedString(DFA81_eofS);
    static final char[] DFA81_min = DFA.unpackEncodedStringToUnsignedChars(DFA81_minS);
    static final char[] DFA81_max = DFA.unpackEncodedStringToUnsignedChars(DFA81_maxS);
    static final short[] DFA81_accept = DFA.unpackEncodedString(DFA81_acceptS);
    static final short[] DFA81_special = DFA.unpackEncodedString(DFA81_specialS);
    static final short[][] DFA81_transition;

    static {
        int numStates = DFA81_transitionS.length;
        DFA81_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA81_transition[i] = DFA.unpackEncodedString(DFA81_transitionS[i]);
        }
    }

    class DFA81 extends DFA {

        public DFA81(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 81;
            this.eot = DFA81_eot;
            this.eof = DFA81_eof;
            this.min = DFA81_min;
            this.max = DFA81_max;
            this.accept = DFA81_accept;
            this.special = DFA81_special;
            this.transition = DFA81_transition;
        }
        public String getDescription() {
            return "1615:1: sourceElement options {k=1; } : ({...}? functionDeclaration | statement );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA81_1 = input.LA(1);

                         
                        int index81_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( input.LA(1) == FUNCTION )) ) {s = 35;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index81_1);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 81, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_reservedWord_in_token2158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_token2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_punctuator_in_token2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_token2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_token2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_reservedWord2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_futureReservedWord_in_reservedWord2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_reservedWord2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_reservedWord2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_keyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_futureReservedWord0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_punctuator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_booleanLiteral_in_literal2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RegularExpressionLiteral_in_literal2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_booleanLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primaryExpression3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpression3568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayLiteral_in_primaryExpression3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_objectLiteral_in_primaryExpression3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_primaryExpression3594 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_primaryExpression3596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_primaryExpression3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayLiteral3626 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_COMMA_in_arrayLiteral3634 = new BitSet(new long[]{0x8000000029221070L,0x000000003033009AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_arrayItem_in_arrayLiteral3636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_RBRACK_in_arrayLiteral3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_arrayItem3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_objectLiteral3704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L,0x0600000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_COMMA_in_objectLiteral3712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0600000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_nameValuePair_in_objectLiteral3714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_RBRACE_in_objectLiteral3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_propertyName_in_nameValuePair3747 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_nameValuePair3749 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_nameValuePair3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_propertyName3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_propertyName3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_propertyName3785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpression_in_memberExpression3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionExpression_in_memberExpression3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_memberExpression3813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEW_in_newExpression3824 = new BitSet(new long[]{0x8000000001220070L,0x000000000000000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_memberExpression_in_newExpression3826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_arguments3854 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000EL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_arguments3862 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_arguments3864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_arguments3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_memberExpression_in_leftHandSideExpression3936 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_arguments_in_leftHandSideExpression3952 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_LBRACK_in_leftHandSideExpression3974 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_leftHandSideExpression3976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_RBRACK_in_leftHandSideExpression3978 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_DOT_in_leftHandSideExpression4007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_Identifier_in_leftHandSideExpression4009 = new BitSet(new long[]{0x0000000000000002L,0x000000000000002AL});
    public static final BitSet FOLLOW_leftHandSideExpression_in_postfixExpression4051 = new BitSet(new long[]{0x0000000000000002L,0x0000000000300000L});
    public static final BitSet FOLLOW_postfixOperator_in_postfixExpression4068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_postfixOperator4095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_postfixOperator4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfixExpression_in_unaryExpression4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryOperator_in_unaryExpression4147 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_incDecOperator_in_unaryExpression4154 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression4156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INC_in_incDecOperator4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEC_in_incDecOperator4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ADD_in_incDecOperator4207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_incDecOperator4224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_unaryOperator4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_unaryOperator4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEOF_in_unaryOperator4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INV_in_unaryOperator4283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_unaryOperator4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4319 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_mulOp_in_multiplicativeExpression4323 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression4326 = new BitSet(new long[]{0x0000000000000002L,0x00002000000C0000L});
    public static final BitSet FOLLOW_MUL_in_mulOp4343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIV_in_mulOp4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOD_in_mulOp4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4388 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_addOp_in_additiveExpression4392 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression4395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000030000L});
    public static final BitSet FOLLOW_ADD_in_addOp4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUB_in_addOp4428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4447 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression4451 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression4454 = new BitSet(new long[]{0x0000000000000002L,0x0000000001C00000L});
    public static final BitSet FOLLOW_SHL_in_shiftOp4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHR_in_shiftOp4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHU_in_shiftOp4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4521 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_relationalOperators_in_relationalExpression4525 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression4528 = new BitSet(new long[]{0x0000000000180002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4542 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_relationalOperatorsNoIn_in_relationalExpressionNoIn4546 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpressionNoIn4549 = new BitSet(new long[]{0x0000000000100002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_LT_in_relationalOperators4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOperators4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_relationalOperators4592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_relationalOperators4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_relationalOperators4620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IN_in_relationalOperators4634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LT_in_relationalOperatorsNoIn4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_relationalOperatorsNoIn4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTE_in_relationalOperatorsNoIn4680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTE_in_relationalOperatorsNoIn4694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSTANCEOF_in_relationalOperatorsNoIn4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4731 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_equalityOperator_in_equalityExpression4735 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression4738 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4752 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_equalityOperator_in_equalityExpressionNoIn4756 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_relationalExpressionNoIn_in_equalityExpressionNoIn4759 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
    public static final BitSet FOLLOW_EQ_in_equalityOperator4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEQ_in_equalityOperator4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SAME_in_equalityOperator4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NSAME_in_equalityOperator4814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4838 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_bitwiseAndOp_in_bitwiseANDExpression4842 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_equalityExpression_in_bitwiseANDExpression4845 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4859 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_bitwiseAndOp_in_bitwiseANDExpressionNoIn4863 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_equalityExpressionNoIn_in_bitwiseANDExpressionNoIn4866 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_AND_in_bitwiseAndOp4880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4899 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseXorOp_in_bitwiseXORExpression4903 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_bitwiseANDExpression_in_bitwiseXORExpression4906 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4922 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_bitwiseXorOp_in_bitwiseXORExpressionNoIn4926 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_bitwiseANDExpressionNoIn_in_bitwiseXORExpressionNoIn4929 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_XOR_in_bitwiseXorOp4943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4961 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseOrOp_in_bitwiseORExpression4965 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_bitwiseXORExpression_in_bitwiseORExpression4968 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4983 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_bitwiseOrOp_in_bitwiseORExpressionNoIn4987 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_bitwiseXORExpressionNoIn_in_bitwiseORExpressionNoIn4990 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_OR_in_bitwiseOrOp5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5025 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_andOp_in_logicalANDExpression5029 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_bitwiseORExpression_in_logicalANDExpression5032 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_LAND_in_andOp5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5062 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_andOp_in_logicalANDExpressionNoIn5066 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_bitwiseORExpressionNoIn_in_logicalANDExpressionNoIn5069 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5084 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_orOp_in_logicalORExpression5088 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_logicalANDExpression_in_logicalORExpression5091 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5106 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_orOp_in_logicalORExpressionNoIn5110 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_logicalANDExpressionNoIn_in_logicalORExpressionNoIn5113 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_LOR_in_orOp5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpression_in_conditionalExpression5149 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpression5153 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5155 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpression5157 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_conditionalExpression5159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logicalORExpressionNoIn_in_conditionalExpressionNoIn5173 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L});
    public static final BitSet FOLLOW_QUE_in_conditionalExpressionNoIn5177 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5179 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_conditionalExpressionNoIn5181 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_conditionalExpressionNoIn5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_assignmentExpression5206 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpression5212 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_assignmentExpression5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentStat5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_assignmentOperator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpressionNoIn_in_assignmentExpressionNoIn5371 = new BitSet(new long[]{0x0000000000000002L,0x00005FFC00000000L});
    public static final BitSet FOLLOW_assignmentOperator_in_assignmentExpressionNoIn5378 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_assignmentExpressionNoIn5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expression5406 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_expression5410 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_COMMA_in_expressionNoIn5451 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_expressionNoIn5455 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_SEMIC_in_semic5509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOF_in_semic5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RBRACE_in_semic5527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EOL_in_semic5537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MultiLineComment_in_semic5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statementTail_in_statement5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableStatement_in_statementTail5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyStatement_in_statementTail5595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statementTail5600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statementTail5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iterationStatement_in_statementTail5610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_continueStatement_in_statementTail5615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_breakStatement_in_statementTail5620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statementTail5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_withStatement_in_statementTail5630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelledStatement_in_statementTail5635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statementTail5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_throwStatement_in_statementTail5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tryStatement_in_statementTail5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_block5667 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_block5669 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_RBRACE_in_block5672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_variableStatement5710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5712 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_COMMA_in_variableStatement5716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_variableDeclaration_in_variableStatement5718 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_semic_in_variableStatement5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclaration5745 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclaration5766 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpression_in_variableDeclaration5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_variableDeclarationNoIn5816 = new BitSet(new long[]{0x0000000000000002L,0x0000000400000000L});
    public static final BitSet FOLLOW_ASSIGN_in_variableDeclarationNoIn5839 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_assignmentExpressionNoIn_in_variableDeclarationNoIn5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_emptyStatement5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement5913 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_semic_in_expressionStatement5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifStatement5932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_ifStatement5934 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_ifStatement5936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_ifStatement5938 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_ifStatement5940 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ELSE_in_ifStatement5946 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_ifStatement5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doStatement_in_iterationStatement6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_iterationStatement6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_iterationStatement6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DO_in_doStatement6060 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_doStatement6062 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_WHILE_in_doStatement6064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_doStatement6066 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_doStatement6068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_doStatement6070 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_semic_in_doStatement6072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHILE_in_whileStatement6137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_whileStatement6139 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_whileStatement6141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_whileStatement6143 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_whileStatement6145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forStatement6186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_forStatement6188 = new BitSet(new long[]{0x8000000039221070L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_forControl_in_forStatement6190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_forStatement6192 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_forStatement6194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlVar_in_forControl6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlExpression_in_forControl6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forControlSemic_in_forControl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_forControlVar6284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6286 = new BitSet(new long[]{0x0000000000080000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_IN_in_forControlVar6298 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlVar6300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_forControlVar6354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_variableDeclarationNoIn_in_forControlVar6356 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6361 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlVar6365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlVar6368 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlVar6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionNoIn_in_forControlExpression6449 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000040L});
    public static final BitSet FOLLOW_IN_in_forControlExpression6464 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6514 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlExpression6521 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlExpression6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6584 = new BitSet(new long[]{0x8000000029221070L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_forControlSemic6591 = new BitSet(new long[]{0x8000000029221072L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_forControlSemic6595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_continueStatement6649 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x02C0000000000000L});
    public static final BitSet FOLLOW_Identifier_in_continueStatement6653 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_semic_in_continueStatement6656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_breakStatement6700 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x02C0000000000000L});
    public static final BitSet FOLLOW_Identifier_in_breakStatement6704 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_semic_in_breakStatement6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_returnStatement6752 = new BitSet(new long[]{0x8000000029221070L,0x00000000303300CBL,0x06C0000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_returnStatement6756 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_semic_in_returnStatement6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_withStatement6797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_withStatement6799 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_withStatement6801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_withStatement6803 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_withStatement6805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SWITCH_in_switchStatement6851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_switchStatement6853 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_switchStatement6855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_switchStatement6857 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_LBRACE_in_switchStatement6859 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_defaultClause_in_switchStatement6866 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_caseClause_in_switchStatement6872 = new BitSet(new long[]{0x0000000000000900L,0x0000000000000001L});
    public static final BitSet FOLLOW_RBRACE_in_switchStatement6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause6905 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_caseClause6908 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_caseClause6910 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_caseClause6912 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultClause6925 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_defaultClause6928 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_defaultClause6930 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_Identifier_in_labelledStatement6947 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_COLON_in_labelledStatement6949 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_statement_in_labelledStatement6951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THROW_in_throwStatement6987 = new BitSet(new long[]{0x8000000029221070L,0x000000003033000AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_expression_in_throwStatement6991 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C1L,0x00C0000000000000L});
    public static final BitSet FOLLOW_semic_in_throwStatement6993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRY_in_tryStatement7030 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_tryStatement7032 = new BitSet(new long[]{0x0000000000008200L});
    public static final BitSet FOLLOW_catchOrFinally_in_tryStatement7034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_catchClause_in_catchOrFinally7063 = new BitSet(new long[]{0x0000000000008202L});
    public static final BitSet FOLLOW_finallyClause_in_catchOrFinally7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_finallyClause_in_catchOrFinally7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_in_catchClause7080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_catchClause7082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_Identifier_in_catchClause7084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RPAREN_in_catchClause7086 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause7088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FINALLY_in_finallyClause7129 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_block_in_finallyClause7131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDeclaration7167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionDeclaration7171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionDeclaration7173 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionDeclaration7175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionExpression7206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L,0x0200000000000000L});
    public static final BitSet FOLLOW_Identifier_in_functionExpression7210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_formalParameterList_in_functionExpression7213 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_functionBody_in_functionExpression7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_formalParameterList7243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L,0x0200000000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList7247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_COMMA_in_formalParameterList7251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_Identifier_in_formalParameterList7253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static final BitSet FOLLOW_RPAREN_in_formalParameterList7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_functionBody7329 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_sourceElement_in_functionBody7331 = new BitSet(new long[]{0x80000000FFE734F0L,0x000000003033004BL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_RBRACE_in_functionBody7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sourceElement_in_program7366 = new BitSet(new long[]{0x80000000FFE734F2L,0x000000003033004AL,0x0600000000000000L,0x0000000000000071L});
    public static final BitSet FOLLOW_functionDeclaration_in_sourceElement7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_sourceElement7414 = new BitSet(new long[]{0x0000000000000002L});

}