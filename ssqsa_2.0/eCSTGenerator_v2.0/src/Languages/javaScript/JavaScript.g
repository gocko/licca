grammar JavaScript; 

options
{
	output=AST;
	language = Java;
	ASTLabelType = CommonTree;
}

tokens 
{
// Reserved words
	NULL		= 'null' ;
	TRUE		= 'true' ;
	FALSE		= 'false' ;

// Keywords
	BREAK		= 'break' ;
	CASE		= 'case' ;
	CATCH 		= 'catch' ;
	CONTINUE 	= 'continue' ;
	DEFAULT		= 'default' ;
	DELETE		= 'delete' ;
	DO 		= 'do' ;
	ELSE 		= 'else' ;
	FINALLY 	= 'finally' ;
	FOR 		= 'for' ;
	FUNCTION 	= 'function' ;
	IF 		= 'if' ;
	IN 		= 'in' ;
	INSTANCEOF 	= 'instanceof' ;
	NEW 		= 'new' ;
	RETURN 		= 'return' ;
	SWITCH 		= 'switch' ;
	THIS 		= 'this' ;
	THROW 		= 'throw' ;
	TRY 		= 'try' ;
	TYPEOF 		= 'typeof' ;
	VAR 		= 'var' ;
	VOID 		= 'void' ;
	WHILE 		= 'while' ;
	WITH 		= 'with' ;

// Future reserved words
	ABSTRACT	= 'abstract' ;
	BOOLEAN 	= 'boolean' ;
	BYTE 		= 'byte' ;
	CHAR 		= 'char' ;
	CLASS 		= 'class' ;
	CONST_ 		= 'const' ;
	DEBUGGER 	= 'debugger' ;
	DOUBLE		= 'double' ;
	ENUM 		= 'enum' ;
	EXPORT 		= 'export' ;
	EXTENDS		= 'extends' ;
	FINAL 		= 'final' ;
	FLOAT 		= 'float' ;
	GOTO 		= 'goto' ;
	IMPLEMENTS 	= 'implements' ;
	IMPORT		= 'import' ;
	INT 		= 'int' ;
	INTERFACE 	= 'interface' ;
	LONG 		= 'long' ;
	NATIVE 		= 'native' ;
	PACKAGE 	= 'package' ;
	PRIVATE 	= 'private' ;
	PROTECTED 	= 'protected' ;
	PUBLIC		= 'public' ;
	SHORT 		= 'short' ;
	STATIC 		= 'static' ;
	SUPER 		= 'super' ;
	SYNCHRONIZED 	= 'synchronized' ;
	THROWS 		= 'throws' ;
	TRANSIENT 	= 'transient' ;
	VOLATILE 	= 'volatile' ;

// Punctuators
	LBRACE		= '{' ;
	RBRACE		= '}' ;
	LPAREN		= '(' ;
	RPAREN		= ')' ;
	LBRACK		= '[' ;
	RBRACK		= ']' ;
	DOT		= '.' ;
	SEMIC		= ';' ;
	COMMA		= ',' ;
	LT		= '<' ;
	GT		= '>' ;
	LTE		= '<=' ;
	GTE		= '>=' ;
	EQ		= '==' ;
	NEQ		= '!=' ;
	SAME		= '===' ;
	NSAME		= '!==' ;
	ADD		= '+' ;
	SUB		= '-' ;
	MUL		= '*' ;
	MOD		= '%' ;
	INC		= '++' ;
	DEC		= '--' ;
	SHL		= '<<' ;
	SHR		= '>>' ;
	SHU		= '>>>' ;
	AND		= '&' ;
	OR		= '|' ;
	XOR		= '^' ;
	NOT		= '!' ;
	INV		= '~' ;
	LAND		= '&&' ;
	LOR		= '||' ;
	QUE		= '?' ;
	COLON		= ':' ;
	ASSIGN		= '=' ;
	ADDASS		= '+=' ;
	SUBASS		= '-=' ;
	MULASS		= '*=' ;
	MODASS		= '%=' ;
	SHLASS		= '<<=' ;
	SHRASS		= '>>=' ;
	SHUASS		= '>>>=' ;
	ANDASS		= '&=' ;
	ORASS		= '|=' ;
	XORASS		= '^=' ;
	DIV		= '/' ;
	DIVASS		= '/=' ;
	
// Imaginary
	ARGS ;
	ARRAY ;
	BLOCK ;
	BYFIELD ;
	BYINDEX ;
	CALL ;
	CEXPR ;
	EXPR ;
	FORITER ;
	FORSTEP ;
	ITEM ;
	LABELLED ;
	NAMEDVALUE ;
	NEG ;
	OBJECT ;
	PAREXPR ;
	PDEC ;
	PINC ;
	POS ;
	
// univerzalni cvorovi
       COMPILATION_UNIT;
       PACKAGE_DECL;
       CONCRETE_UNIT_DECL;
       INTERFACE_UNIT_DECL;
       FUNCTION_DECL;
       TYPE_DECL;
       ATTRIBUTE_DECL;
       VAR_DECL;
       BLOCK_SCOPE;
       MAIN_BLOCK_SCOPE;
       IMPORT_DECL;
       EXTENDS;
       IMPLEMENTS;
       INSTANTIATES;
       FORMAL_PARAM_LIST;
       PARAMETER_DECL;
       FUNCTION_CALL;
       ARGUMENT_LIST;
       ARGUMENT;
       TYPE;
       NAME;
       BRANCH;
       BRANCH_STATEMENT;
       CONDITION;
       JUMP_STATEMENT;
       LOOP_STATEMENT;
       INIT;
       STEP;
       LOGICAL_OPERATOR;
       KEYWORD;
       OPERATOR;
       SEPARATOR;
       DIRECTIVE;
       CONST;
       VAR_DECL_PARENT;
       
       // Tijana Vislavski jun 2016.
       ASSIGNMENT_STATEMENT;
       ASSIGN_OPERATOR;
       VALUE;
       COMPARISON_OPERATOR;
}

@header {
  package Languages.javaScript;
}

@lexer::header {
  package Languages.javaScript;
}

@lexer::members
{
private Token last;

private final boolean areRegularExpressionsEnabled()
{
	if (last == null)
	{
		return true;
	}
	switch (last.getType())
	{
	// identifier
		case Identifier:
	// literals
		case NULL:
		case TRUE:
		case FALSE:
		case THIS:
		case OctalIntegerLiteral:
		case DecimalLiteral:
		case HexIntegerLiteral:
		case StringLiteral:
	// member access ending 
		case RBRACK:
	// function call or nested expression ending
		case RPAREN:
			return false;
	// otherwise OK
		default:
			return true;
	}
}
	
private final void consumeIdentifierUnicodeStart() throws RecognitionException, NoViableAltException
{
	int ch = input.LA(1);
	if (isIdentifierStartUnicode(ch))
	{
		matchAny();
		do
		{
			ch = input.LA(1);
			if (ch == '$' || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z') || ch == '\\' || ch == '_' || (ch >= 'a' && ch <= 'z') || isIdentifierPartUnicode(ch))
			{
				mIdentifierPart();
			}
			else
			{
				return;
			}
		}
		while (true);
	}
	else
	{
		throw new NoViableAltException();
	}
}
	
private final boolean isIdentifierPartUnicode(int ch)
{
	return Character.isJavaIdentifierPart(ch);
}
	
private final boolean isIdentifierStartUnicode(int ch)
{
	return Character.isJavaIdentifierStart(ch);
}

public Token nextToken()
{
	Token result = super.nextToken();
	if (result.getChannel() == Token.DEFAULT_CHANNEL)
	{
		last = result;
	}
	return result;		
}
}

@parser::members
{
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
}

//
// $<	A.1 Lexical Grammar (7)
//
// Added for lexing purposes
fragment BSLASH
	: '\\'
	;
	
fragment DQUOTE
	: '"'
	;
	
fragment SQUOTE
	: '\''
	;

// $<	Whitespace (7.2)

fragment TAB
	: '\u0009'
	;

fragment VT // Vertical TAB
	: '\u000b'
	;

fragment FF // Form Feed
	: '\u000c'
	;

fragment SP // Space
	: '\u0020'
	;

fragment NBSP // Non-Breaking Space
	: '\u00a0'
	;

fragment USP // Unicode Space Separator (rest of Unicode category Zs)
	: '\u1680'  // OGHAM SPACE MARK
	| '\u180E'  // MONGOLIAN VOWEL SEPARATOR
	| '\u2000'  // EN QUAD
	| '\u2001'  // EM QUAD
	| '\u2002'  // EN SPACE
	| '\u2003'  // EM SPACE
	| '\u2004'  // THREE-PER-EM SPACE
	| '\u2005'  // FOUR-PER-EM SPACE
	| '\u2006'  // SIX-PER-EM SPACE
	| '\u2007'  // FIGURE SPACE
	| '\u2008'  // PUNCTUATION SPACE
	| '\u2009'  // THIN SPACE
	| '\u200A'  // HAIR SPACE
	| '\u202F'  // NARROW NO-BREAK SPACE
	| '\u205F'  // MEDIUM MATHEMATICAL SPACE
	| '\u3000'  // IDEOGRAPHIC SPACE
	;

WhiteSpace
	: ( TAB | VT | FF | SP | NBSP | USP )+ { $channel = HIDDEN; }
	;

// $>

// $<	Line terminators (7.3)

fragment LF // Line Feed
	: '\n'
	;

fragment CR // Carriage Return
	: '\r'
	;

fragment LS // Line Separator
	: '\u2028'
	;

fragment PS // Paragraph Separator
	: '\u2029'
	;

fragment LineTerminator
	: CR | LF | LS | PS
	;
		
EOL
	: ( ( CR LF? ) | LF | LS | PS ) { $channel = HIDDEN; }
	;
// $>

// $<	Comments (7.4)

MultiLineComment
	: '/*' ( options { greedy = false; } : . )* '*/' { $channel = HIDDEN; }
	;

SingleLineComment
	: '//' ( ~( LineTerminator ) )* { $channel = HIDDEN; }
	;

// $>

// $<	Tokens (7.5)

token
	: reservedWord
	| Identifier
	| punctuator
	| numericLiteral
	| StringLiteral
	;

// $<	Reserved words (7.5.1)

reservedWord
	: keyword
	| futureReservedWord
	| NULL
	| booleanLiteral
	;

// $>
	
// $<	Keywords (7.5.2)

keyword
	: BREAK
	| CASE
	| CATCH
	| CONTINUE
	| DEFAULT
	| DELETE
	| DO
	| ELSE
	| FINALLY
	| FOR
	| FUNCTION
	| IF
	| IN
	| INSTANCEOF
	| NEW
	| RETURN
	| SWITCH
	| THIS
	| THROW
	| TRY
	| TYPEOF
	| VAR
	| VOID
	| WHILE
	| WITH
	;

// $>

// $<	Future reserved words (7.5.3)

futureReservedWord
	: ABSTRACT
	| BOOLEAN
	| BYTE
	| CHAR
	| CLASS
	| CONST_
	| DEBUGGER
	| DOUBLE
	| ENUM
	| EXPORT
	| EXTENDS
	| FINAL
	| FLOAT
	| GOTO
	| IMPLEMENTS
	| IMPORT
	| INT
	| INTERFACE
	| LONG
	| NATIVE
	| PACKAGE
	| PRIVATE
	| PROTECTED
	| PUBLIC
	| SHORT
	| STATIC
	| SUPER
	| SYNCHRONIZED
	| THROWS
	| TRANSIENT
	| VOLATILE
	;

// $>

// $>
	
// $<	Identifiers (7.6)

fragment IdentifierStartASCII
	: 'a'..'z' | 'A'..'Z'
	| '$'
	| '_'
	| BSLASH 'u' HexDigit HexDigit HexDigit HexDigit // UnicodeEscapeSequence
	;

/*
The first two alternatives define how ANTLR can match ASCII characters which can be considered as part of an identifier.
The last alternative matches other characters in the unicode range that can be sonsidered as part of an identifier.
*/
fragment IdentifierPart
	: DecimalDigit
	| IdentifierStartASCII
	| { isIdentifierPartUnicode(input.LA(1)) }? { matchAny(); }
	;

fragment IdentifierNameASCIIStart
	: IdentifierStartASCII IdentifierPart*
	;

/*
The second alternative acts as an action driven fallback to evaluate other characters in the unicode range than the ones in the ASCII subset.
Due to the first alternative this grammar defines enough so that ANTLR can generate a lexer that correctly predicts identifiers with characters in the ASCII range.
In that way keywords, other reserved words and ASCII identifiers are recognized with standard ANTLR driven logic. When the first character for an identifier fails to 
match this ASCII definition, the lexer calls consumeIdentifierUnicodeStart because of the action in the alternative. This method checks whether the character matches 
as first character in ranges other than ASCII and consumes further characters belonging to the identifier with help of mIdentifierPart generated out of the 
IdentifierPart rule above.
*/
Identifier
	: IdentifierNameASCIIStart
	| { consumeIdentifierUnicodeStart(); } 
	;

// $>

// $<	Punctuators (7.7)

punctuator
	: LBRACE
	| RBRACE
	| LPAREN
	| RPAREN
	| LBRACK
	| RBRACK
	| DOT
	| SEMIC
	| COMMA
	| LT
	| GT
	| LTE
	| GTE
	| EQ
	| NEQ
	| SAME
	| NSAME
	| ADD
	| SUB
	| MUL
	| MOD
	| INC
	| DEC
	| SHL
	| SHR
	| SHU
	| AND
	| OR
	| XOR
	| NOT
	| INV
	| LAND
	| LOR
	| QUE
	| COLON
	| ASSIGN
	| ADDASS
	| SUBASS
	| MULASS
	| MODASS
	| SHLASS
	| SHRASS
	| SHUASS
	| ANDASS
	| ORASS
	| XORASS
	| DIV
	| DIVASS
	;

// $>

// $<	Literals (7.8)

literal
	: NULL -> NULL
	| booleanLiteral -> booleanLiteral
	| numericLiteral -> numericLiteral
	| StringLiteral -> StringLiteral
	| RegularExpressionLiteral -> RegularExpressionLiteral
	;

booleanLiteral
	: TRUE
	| FALSE
	;

// $<	Numeric literals (7.8.3)

/*
Note: octal literals are described in the B Compatibility section.
These are removed from the standards but are here for backwards compatibility with earlier ECMAScript definitions.
*/

fragment DecimalDigit
	: '0'..'9'
	;

fragment HexDigit
	: DecimalDigit | 'a'..'f' | 'A'..'F'
	;

fragment OctalDigit
	: '0'..'7'
	;

fragment ExponentPart
	: ( 'e' | 'E' ) ( '+' | '-' )? DecimalDigit+
	;

fragment DecimalIntegerLiteral
	: '0'
	| '1'..'9' DecimalDigit*
	;

DecimalLiteral
	: DecimalIntegerLiteral '.' DecimalDigit* ExponentPart?
	| '.' DecimalDigit+ ExponentPart?
	| DecimalIntegerLiteral ExponentPart?
	;

OctalIntegerLiteral
	: '0' OctalDigit+
	;

HexIntegerLiteral
	: ( '0x' | '0X' ) HexDigit+
	;

numericLiteral
	: DecimalLiteral
	| OctalIntegerLiteral
	| HexIntegerLiteral
	;

// $>

// $<	String literals (7.8.4)

/*
Note: octal escape sequences are described in the B Compatibility section.
These are removed from the standards but are here for backwards compatibility with earlier ECMAScript definitions.
*/
	
fragment CharacterEscapeSequence
	: ~( DecimalDigit | 'x' | 'u' | LineTerminator ) // Concatenation of SingleEscapeCharacter and NonEscapeCharacter
	;

fragment ZeroToThree
	: '0'..'3'
	;
	
fragment OctalEscapeSequence
	: OctalDigit
	| ZeroToThree OctalDigit
	| '4'..'7' OctalDigit
	| ZeroToThree OctalDigit OctalDigit
	;
	
fragment HexEscapeSequence
	: 'x' HexDigit HexDigit
	;
	
fragment UnicodeEscapeSequence
	: 'u' HexDigit HexDigit HexDigit HexDigit
	;

fragment EscapeSequence
	:
	BSLASH 
	(
		CharacterEscapeSequence 
		| OctalEscapeSequence
		| HexEscapeSequence
		| UnicodeEscapeSequence
	)
	;

StringLiteral
	: SQUOTE ( ~( SQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* SQUOTE
	| DQUOTE ( ~( DQUOTE | BSLASH | LineTerminator ) | EscapeSequence )* DQUOTE
	;

// $>

// $<	Regular expression literals (7.8.5)

fragment BackslashSequence
	: BSLASH ~( LineTerminator )
	;

fragment RegularExpressionFirstChar
	: ~ ( LineTerminator | MUL | BSLASH | DIV )
	| BackslashSequence
	;

fragment RegularExpressionChar
	: ~ ( LineTerminator | BSLASH | DIV )
	| BackslashSequence
	;

RegularExpressionLiteral
	: { areRegularExpressionsEnabled() }?=> DIV RegularExpressionFirstChar RegularExpressionChar* DIV IdentifierPart*
	;

// $>

// $>

// $>

//
// $<	A.3 Expressions (11)
//

// $<Primary expressions (11.1)

primaryExpression
	: THIS -> ^(NAME THIS)
	| Identifier  -> ^(NAME Identifier)
	| literal ->  ^(CONST literal)
	| arrayLiteral
	| objectLiteral
	| lpar=LPAREN expression RPAREN -> ^(SEPARATOR LPAREN) expression ^(SEPARATOR RPAREN)
	;
arrayLiteral
	: lb=LBRACK ( arrayItem ( COMMA arrayItem )* )? RBRACK
	-> ^( ARRAY[$lb, "ARRAY"] arrayItem* )
	;

arrayItem
	: ( expr=assignmentExpression | { input.LA(1) == COMMA }? )
	-> ^( ITEM $expr? )
	;

objectLiteral
	: lb=LBRACE ( nameValuePair ( COMMA nameValuePair )* )? RBRACE
	-> ^( OBJECT[$lb, "OBJECT"] nameValuePair* )
	;
	
nameValuePair
	: propertyName COLON assignmentExpression
	-> ^( NAMEDVALUE propertyName assignmentExpression )
	;

propertyName
	: Identifier
	| StringLiteral
	| numericLiteral
	;

// $>

// $<Left-hand-side expressions (11.2)

/*
Refactored some rules to make them LL(*) compliant:
all the expressions surrounding member selection and calls have been moved to leftHandSideExpression to make them right recursive
*/

memberExpression
	: primaryExpression
	| functionExpression
	| newExpression
	;

newExpression
	: NEW memberExpression
	-> ^(INSTANTIATES ^(KEYWORD NEW) memberExpression)
	;

	
arguments
	: LPAREN ( assignmentExpression ( COMMA assignmentExpression )* )? RPAREN
	-> ^(ARGUMENT_LIST ^(SEPARATOR LPAREN) ( ^(ARGUMENT assignmentExpression) ( ^(SEPARATOR COMMA) ^(ARGUMENT assignmentExpression) )* )? ^(SEPARATOR RPAREN))
	;
	
leftHandSideExpression
	:
	(
		memberExpression 		-> memberExpression
	)
	(
		arguments			-> ^( FUNCTION_CALL  $leftHandSideExpression arguments )
		| LBRACK expression RBRACK	-> /*^( NAME*/ $leftHandSideExpression ^(SEPARATOR LBRACK) expression ^(SEPARATOR RBRACK) /* )*/
		| DOT Identifier		-> ^( NAME $leftHandSideExpression DOT ^(NAME Identifier) )
	)*
	;

// $>

// $<Postfix expressions (11.3)

/*
The specification states that there are no line terminators allowed before the postfix operators.
This is enforced by the call to promoteEOL in the action before ( INC | DEC ).
We only must promote EOLs when the la is INC or DEC because this production is chained as all expression rules.
In other words: only promote EOL when we are really in a postfix expression. A check on the la will ensure this.
*/
postfixExpression
  : leftHandSideExpression { if (input.LA(1) == INC || input.LA(1) == DEC) promoteEOL(null); }  (
  -> leftHandSideExpression
  | postfixOperator 	-> 	^(ASSIGNMENT_STATEMENT leftHandSideExpression postfixOperator))
	;
	
postfixOperator
	: op=INC { $op.setType(PINC); } -> ^(OPERATOR INC)
	| op=DEC { $op.setType(PDEC); } -> ^(OPERATOR DEC)
	;

// $>

// $<Unary operators (11.4)

unaryExpression
	: 
	  postfixExpression 
	| unaryOperator unaryExpression
	| incDecOperator unaryExpression -> ^(ASSIGNMENT_STATEMENT incDecOperator unaryExpression)
	;
	
incDecOperator 
	: INC -> ^(OPERATOR INC)
	| DEC -> ^(OPERATOR DEC)
	| op=ADD { $op.setType(POS); } -> ^(OPERATOR ADD)
	| op=SUB { $op.setType(NEG); } -> ^(OPERATOR SUB);
	
unaryOperator
	: DELETE -> ^(OPERATOR DELETE)
	| VOID -> ^(OPERATOR VOID)
	| TYPEOF -> ^(OPERATOR TYPEOF)
	| INV -> ^(OPERATOR INV)
	| NOT -> ^(OPERATOR NOT)
	;

// $>

// $<Multiplicative operators (11.5)

multiplicativeExpression
	: unaryExpression ( mulOp^ unaryExpression )*
	;

// $>

// $<Additive operators (11.6)

mulOp	: MUL -> ^(OPERATOR MUL)
	| DIV -> ^(OPERATOR DIV)
	| MOD -> ^(OPERATOR MOD)
	;

additiveExpression
	: multiplicativeExpression ( addOp^ multiplicativeExpression )*
	;

// $>
	
// $<Bitwise shift operators (11.7)

addOp	:	ADD -> ^(OPERATOR ADD) 
		| SUB -> ^(OPERATOR SUB)
	;

shiftExpression
	: additiveExpression ( shiftOp^ additiveExpression )*
	;

// $>
	
// $<Relational operators (11.8)

shiftOp	:	SHL -> ^(OPERATOR SHL) 
		| SHR -> ^(OPERATOR SHR) 
		| SHU -> ^(OPERATOR SHU)
	;

relationalExpression
	: shiftExpression ( relationalOperators^ shiftExpression )*
	;

relationalExpressionNoIn
	: shiftExpression ( relationalOperatorsNoIn^ shiftExpression )*
	;
	
relationalOperators
	: LT -> ^(COMPARISON_OPERATOR LT) 
	| GT -> ^(COMPARISON_OPERATOR GT) 
	| LTE -> ^(COMPARISON_OPERATOR LTE) 
	| GTE -> ^(COMPARISON_OPERATOR GTE) 
	| INSTANCEOF -> ^(COMPARISON_OPERATOR INSTANCEOF) 
	| IN -> ^(COMPARISON_OPERATOR IN) ;

relationalOperatorsNoIn
	: LT -> ^(COMPARISON_OPERATOR LT) 
	| GT -> ^(COMPARISON_OPERATOR GT) 
	| LTE -> ^(COMPARISON_OPERATOR LTE) 
	| GTE -> ^(COMPARISON_OPERATOR GTE) 
	| INSTANCEOF -> ^(COMPARISON_OPERATOR INSTANCEOF) ;

// $>
	
// $<Equality operators (11.9)

equalityExpression
	: relationalExpression ( equalityOperator^ relationalExpression )*
	;

equalityExpressionNoIn
	: relationalExpressionNoIn ( equalityOperator^ relationalExpressionNoIn )*
	;
	
equalityOperator
	:  EQ -> ^(COMPARISON_OPERATOR EQ)
	| NEQ -> ^(COMPARISON_OPERATOR NEQ)
	| SAME -> ^(COMPARISON_OPERATOR SAME)
	| NSAME -> ^(COMPARISON_OPERATOR NSAME); 

// $>
		
// $<Binary bitwise operators (11.10)

bitwiseANDExpression
	: equalityExpression ( bitwiseAndOp^ equalityExpression )*
	;

bitwiseANDExpressionNoIn
	: equalityExpressionNoIn ( bitwiseAndOp^ equalityExpressionNoIn )*
	;
bitwiseAndOp 
	:	AND -> ^(LOGICAL_OPERATOR AND);
		
bitwiseXORExpression
	: bitwiseANDExpression ( bitwiseXorOp^ bitwiseANDExpression )*
	;
		
bitwiseXORExpressionNoIn
	: bitwiseANDExpressionNoIn ( bitwiseXorOp^ bitwiseANDExpressionNoIn )*
	;
bitwiseXorOp 
	:	XOR -> ^(LOGICAL_OPERATOR XOR);
	
bitwiseORExpression
	: bitwiseXORExpression ( bitwiseOrOp^ bitwiseXORExpression )*
	;
	
bitwiseORExpressionNoIn
	: bitwiseXORExpressionNoIn ( bitwiseOrOp^ bitwiseXORExpressionNoIn )*
	;
bitwiseOrOp 
	:	OR -> ^(LOGICAL_OPERATOR OR);
// $>
	
// $<Binary logical operators (11.11)

logicalANDExpression
	: bitwiseORExpression ( andOp^ bitwiseORExpression )*
	;
andOp 	:	LAND -> ^(LOGICAL_OPERATOR LAND);

logicalANDExpressionNoIn
	: bitwiseORExpressionNoIn ( andOp^ bitwiseORExpressionNoIn )*
	;
	
logicalORExpression
	: logicalANDExpression ( orOp^ logicalANDExpression )*
	;
	
logicalORExpressionNoIn
	: logicalANDExpressionNoIn ( orOp^ logicalANDExpressionNoIn )*
	;

orOp 	:	LOR -> ^(LOGICAL_OPERATOR LOR);

// $>
	
// $<Conditional operator (11.12)

conditionalExpression
	: logicalORExpression ( QUE assignmentExpression COLON assignmentExpression )?
	;

conditionalExpressionNoIn
	: logicalORExpressionNoIn ( QUE assignmentExpressionNoIn COLON assignmentExpressionNoIn )?
	;
	
// $>

// $<Assignment operators (11.13)

/*
The specification defines the AssignmentExpression rule as follows:
AssignmentExpression :
	ConditionalExpression 
	LeftHandSideExpression AssignmentOperator AssignmentExpression
This rule has a LL(*) conflict. Resolving this with a syntactical predicate will yield something like this:

assignmentExpression
	: ( leftHandSideExpression assignmentOperator )=> leftHandSideExpression assignmentOperator^ assignmentExpression
	| conditionalExpression
	;
assignmentOperator
	: ASSIGN | MULASS | DIVASS | MODASS | ADDASS | SUBASS | SHLASS | SHRASS | SHUASS | ANDASS | XORASS | ORASS
	;
	
But that didn't seem to work. Terence Par writes in his book that LL(*) conflicts in general can best be solved with auto backtracking. But that would be 
a performance killer for such a heavy used rule.
The solution I came up with is to always invoke the conditionalExpression first and than decide what to do based on the result of that rule.
When the rule results in a Tree that can't be coming from a left hand side expression, then we're done.
When it results in a Tree that is coming from a left hand side expression and the LA(1) is an assignment operator then parse the assignment operator
followed by the right recursive call.
*/
assignmentExpression
	//: conditionalExpression ( assignmentStat^ assignmentExpression )?
	: conditionalExpression 
	( assignmentOperator assignmentExpression -> ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR assignmentOperator conditionalExpression ^(VALUE assignmentExpression) ))
   | ->  conditionalExpression)
	;

assignmentStat 
	: assignmentOperator -> ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR assignmentOperator))	
	;

assignmentOperator
	: 
	  MULASS 
	| DIVASS 
	| MODASS 
	| ADDASS 
	| SUBASS 
	| SHLASS 
	| SHRASS 
	| SHUASS 
	| ANDASS 
	| XORASS 
	| ORASS 
	| ASSIGN
	;


assignmentExpressionNoIn
@init
{
	Object[] isLhs = new Object[1];
}
	: lhs=conditionalExpressionNoIn
	( { isLeftHandSideAssign(lhs, isLhs) }? assignmentOperator assignmentExpressionNoIn )?
	;
	
// $>
	
// $<Comma operator (11.14)

expression
	: exprs+=assignmentExpression ( COMMA exprs+=assignmentExpression )*
	-> { $exprs.size() > 1 }? ^( CEXPR $exprs+ )
	-> $exprs
	;

expressionNoIn
	: exprs+=assignmentExpressionNoIn ( COMMA exprs+=assignmentExpressionNoIn )*
	-> { $exprs.size() > 1 }? ^( CEXPR $exprs+ )
	-> $exprs
	;

// $>

// $>
	
//
// $<	A.4 Statements (12)
//

/*
This rule handles semicolons reported by the lexer and situations where the ECMA 3 specification states there should be semicolons automaticly inserted.
The auto semicolons are not actually inserted but this rule behaves as if they were.

In the following situations an ECMA 3 parser should auto insert absent but grammaticly required semicolons:
- the current token is a right brace
- the current token is the end of file (EOF) token
- there is at least one end of line (EOL) token between the current token and the previous token.

The RBRACE is handled by matching it but not consuming it.
The EOF needs no further handling because it is not consumed by default.
The EOL situation is handled by promoting the EOL or MultiLineComment with an EOL present from off channel to on channel
and thus making it parseable instead of handling it as white space. This promoting is done in the action promoteEOL.
*/
semic
@init
{
    // Promote EOL if appropriate   
    promoteEOL(retval);
}
    : SEMIC
    | EOF
    | { int pos = input.index(); } RBRACE { input.seek(pos); }
    | EOL | MultiLineComment // (with EOL in it)
    ;

/*
To solve the ambiguity between block and objectLiteral via expressionStatement all but the block alternatives have been moved to statementTail.
Now when k = 1 and a semantical predicate is defined ANTLR generates code that always will prefer block when the LA(1) is a LBRACE.
This will result in the same behaviour that is described in the specification under 12.4 on the expressionStatement rule.
*/
statement
options
{
	k = 1 ;
}
	: { input.LA(1) == LBRACE }? block
	| statementTail
	;
	
statementTail
	: variableStatement
	| emptyStatement
	| expressionStatement
	| ifStatement
	| iterationStatement
	| continueStatement
	| breakStatement
	| returnStatement
	| withStatement
	| labelledStatement
	| switchStatement
	| throwStatement 
	| tryStatement
	; 

// $<Block (12.1)

block
	: lb=LBRACE statement* RBRACE
	-> ^(BLOCK_SCOPE ^(SEPARATOR LBRACE) statement* ^(SEPARATOR RBRACE))
	;

// $>
	
// $<Variable statement 12.2)

variableStatement
	: VAR variableDeclaration ( COMMA variableDeclaration )* semic
	->  (variableDeclaration)+ semic
	;

variableDeclaration
	: Identifier (
	 -> ^(VAR_DECL ^(NAME Identifier))
	|	ASSIGN assignmentExpression  	-> ^(VAR_DECL  ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR ASSIGN ^(NAME Identifier) ^(VALUE assignmentExpression) )))
	)
	;
	
variableDeclarationNoIn
//	: Identifier ( ASSIGN assignmentExpressionNoIn )?
//	-> ^(VAR_DECL ^(NAME Identifier) (^(ASSIGN_OPERATOR ASSIGN) assignmentExpressionNoIn )?)
: Identifier (
   -> ^(VAR_DECL ^(NAME Identifier))
  | ASSIGN assignmentExpressionNoIn   -> ^(VAR_DECL  ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR ASSIGN ^(NAME Identifier) ^(VALUE assignmentExpressionNoIn) )))
  )
  ;

// $>
	
// $<Empty statement (12.3)

emptyStatement
	: SEMIC!
	;

// $>
	
// $<Expression statement (12.4)

/*
The look ahead check on LBRACE and FUNCTION the specification mentions has been left out and its function, resolving the ambiguity between:
- functionExpression and functionDeclaration
- block and objectLiteral
are moved to the statement and sourceElement rules.
*/
expressionStatement
	: expression semic
	;

// $>
	
// $<The if statement (12.5)

ifStatement
// The predicate is there just to get rid of the warning. ANTLR will handle the dangling else just fine.
	: IF LPAREN expression RPAREN statement ( { input.LA(1) == ELSE }? ELSE statement )?
	-> ^( BRANCH_STATEMENT ^( BRANCH ^( KEYWORD IF ) ^( CONDITION ^(SEPARATOR LPAREN) expression ^(SEPARATOR RPAREN)  ) ^(BLOCK_SCOPE statement) ) ^( BRANCH ^( KEYWORD ELSE ) ^(BLOCK_SCOPE statement) )? )
	;

// $>
	
// $<Iteration statements (12.6)

iterationStatement
	: doStatement
	| whileStatement
	| forStatement
	;
	
doStatement
	: DO statement WHILE LPAREN expression RPAREN semic
	-> ^( LOOP_STATEMENT ^(KEYWORD DO) ^(BLOCK_SCOPE statement) ^( KEYWORD WHILE ) ^(SEPARATOR LPAREN) ^(CONDITION expression) ^(SEPARATOR RPAREN)  ^(SEPARATOR semic))
	;
	
whileStatement
	: WHILE LPAREN expression RPAREN statement
	-> ^( LOOP_STATEMENT ^(KEYWORD WHILE) ^( CONDITION expression) ^(BLOCK_SCOPE statement) )
	;

/*
The forStatement production is refactored considerably as the specification contains a very none LL(*) compliant definition.
The initial version was like this:	

forStatement
	: FOR^ LPAREN! forControl RPAREN! statement
	;
forControl
options
{
	backtrack = true ;
	//k = 3 ;
}
	: stepClause
	| iterationClause
	;
stepClause
options
{
	memoize = true ;
}
	: ( ex1=expressionNoIn | var=VAR variableDeclarationNoIn ( COMMA variableDeclarationNoIn )* )? SEMIC ex2=expression? SEMIC ex3=expression?
	-> { $var != null }? ^( FORSTEP ^( VAR[$var] variableDeclarationNoIn+ ) ^( EXPR $ex2? ) ^( EXPR $ex3? ) )
	-> ^( FORSTEP ^( EXPR $ex1? ) ^( EXPR $ex2? ) ^( EXPR $ex3? ) )
	;
iterationClause
options
{
	memoize = true ;
}
	: ( leftHandSideExpression | var=VAR variableDeclarationNoIn ) IN expression
	-> { $var != null }? ^( FORITER ^( VAR[$var] variableDeclarationNoIn ) ^( EXPR expression ) )
	-> ^( FORITER ^( EXPR leftHandSideExpression ) ^( EXPR expression ) )
	;
	
But this completely relies on the backtrack feature and capabilities of ANTLR. 
Furthermore backtracking seemed to have 3 major drawbacks:
- the performance cost of backtracking is considerably
- didn't seem to work well with ANTLRWorks
- when introducing a k value to optimize the backtracking away, ANTLR runs out of heap space
*/
forStatement
	: FOR LPAREN forControl RPAREN statement
	//-> ^(FOR LPAREN forControl RPAREN statement)
	-> ^( LOOP_STATEMENT ^(KEYWORD FOR)  ^(SEPARATOR LPAREN) forControl ^(SEPARATOR RPAREN) ^(BLOCK_SCOPE statement))
	;

forControl
	: forControlVar
	| forControlExpression -> ^( CONDITION forControlExpression)  
	| forControlSemic -> ^( CONDITION forControlSemic) 
	;

forControlVar
	: VAR variableDeclarationNoIn
	(
		(
			IN expression
			//-> VAR variableDeclarationNoIn IN expression
			->  ^(INIT ^(KEYWORD VAR)variableDeclarationNoIn+ ) ^(CONDITION ^(KEYWORD IN) expression)
		)
		|
		(
			( COMMA variableDeclarationNoIn )* SEMIC ex1=expression? SEMIC ex2=expression?
			//-> variableDeclarationNoIn+ SEMIC $ex1? SEMIC $ex2?
			-> ^(INIT ^(KEYWORD VAR) variableDeclarationNoIn+ ) ^(SEPARATOR SEMIC) ^(CONDITION $ex1?) ^(SEPARATOR SEMIC) ^(STEP $ex2?)
		)
	)
	;

forControlExpression
@init
{
	Object[] isLhs = new Object[1];
}
	: ex1=expressionNoIn
	( 
		{ isLeftHandSideIn(ex1, isLhs) }? (
			IN ex2=expression
			-> ^( FORITER ^( EXPR $ex1 ) ^( EXPR $ex2 ) )
		)
		|
		(
			SEMIC ex2=expression? SEMIC ex3=expression?
			-> ^( FORSTEP ^( EXPR $ex1 ) ^( EXPR $ex2? ) ^( EXPR $ex3? ) )
		)
	)
	;

forControlSemic
	: SEMIC ex1=expression? SEMIC ex2=expression?
	-> ^( FORSTEP ^( EXPR ) ^( EXPR $ex1? ) ^( EXPR $ex2? ) )
	;

// $>
	
// $<The continue statement (12.7)

/*
The action with the call to promoteEOL after CONTINUE is to enforce the semicolon insertion rule of the specification that there are
no line terminators allowed beween CONTINUE and the optional identifier.
As an optimization we check the la first to decide whether there is an identier following.
*/
continueStatement
	: CONTINUE { if (input.LA(1) == Identifier) promoteEOL(null); } Identifier? semic
	-> ^(JUMP_STATEMENT ^(KEYWORD CONTINUE) ^(NAME Identifier)? ^(SEPARATOR semic))
	;

// $>
	
// $<The break statement (12.8)

/*
The action with the call to promoteEOL after BREAK is to enforce the semicolon insertion rule of the specification that there are
no line terminators allowed beween BREAK and the optional identifier.
As an optimization we check the la first to decide whether there is an identier following.
*/
breakStatement
	: BREAK { if (input.LA(1) == Identifier) promoteEOL(null); } Identifier? semic
	->  ^(JUMP_STATEMENT ^(KEYWORD BREAK) ^(NAME Identifier)? ^(SEPARATOR semic))
	;

// $>
	
// $<The return statement (12.9)

/*
The action calling promoteEOL after RETURN ensures that there are no line terminators between RETURN and the optional expression as the specification states.
When there are these get promoted to on channel and thus virtual semicolon wannabees.
So the folowing code:

return
1

will be parsed as:

return;
1;
*/
returnStatement
	: RETURN { promoteEOL(null); } expression? semic
	-> ^(JUMP_STATEMENT ^(KEYWORD RETURN) expression? ^(SEPARATOR semic))
	;

// $>
	
// $<The with statement (12.10)

withStatement
	: WITH LPAREN expression RPAREN statement
	-> ^(KEYWORD WITH) ^(SEPARATOR LPAREN) expression ^(SEPARATOR RPAREN) statement
	;

// $>
	
// $<The switch statement (12.11)

switchStatement
@init
{
	int defaultClauseCount = 0;
}
	: SWITCH LPAREN expression RPAREN LBRACE ( { defaultClauseCount == 0 }?=> defaultClause { defaultClauseCount++; } | caseClause )* RBRACE
	-> ^( SWITCH expression defaultClause? caseClause* )
	;

caseClause
	: CASE^ expression COLON statement*
	;
	
defaultClause
	: DEFAULT^ COLON statement*
	;

// $>
	
// $<Labelled statements (12.12)

labelledStatement
	: Identifier COLON statement
	->  ^(NAME Identifier) ^(SEPARATOR COLON) statement
	;

// $>
	
// $<The throw statement (12.13)

/*
The action calling promoteEOL after THROW ensures that there are no line terminators between THROW and the expression as the specification states.
When there are line terminators these get promoted to on channel and thus to virtual semicolon wannabees.
So the folowing code:

throw
new Error()

will be parsed as:

throw;
new Error();

which will yield a recognition exception!
*/
throwStatement
	: THROW { promoteEOL(null); } expression semic
	-> ^(JUMP_STATEMENT ^(KEYWORD THROW) expression ^(SEPARATOR semic))
	;

// $>
	
// $<The try statement (12.14)

tryStatement
	: TRY block catchOrFinally
	-> ^(BRANCH_STATEMENT ^(KEYWORD TRY) block catchOrFinally)
	;
	
catchOrFinally
	: catchClause finallyClause? | finallyClause;
	
catchClause
	: CATCH LPAREN Identifier RPAREN block
	-> ^(BRANCH ^(KEYWORD CATCH) ^(SEPARATOR LPAREN) Identifier ^(SEPARATOR RPAREN) block)
	;
	
finallyClause
	: FINALLY block
	-> ^(BRANCH ^(KEYWORD FINALLY) block)
	;

// $>

// $>

//
// $<	A.5 Functions and Programs (13, 14)
//

// $<	Function Definition (13)

functionDeclaration
	: FUNCTION name=Identifier formalParameterList functionBody
	-> ^( FUNCTION_DECL ^(NAME $name) formalParameterList functionBody )
	;

functionExpression
	: FUNCTION name=Identifier? formalParameterList functionBody
	-> ^( FUNCTION $name? formalParameterList functionBody )
	;

formalParameterList
	: LPAREN ( Identifier ( COMMA Identifier )* )? RPAREN
	-> ^(FORMAL_PARAM_LIST ^(SEPARATOR LPAREN) ( ^(PARAMETER_DECL ^(NAME Identifier)) ( ^(SEPARATOR COMMA) ^(PARAMETER_DECL ^(NAME Identifier)) )* )? ^(SEPARATOR RPAREN))
	;

functionBody
	: lb=LBRACE sourceElement* RBRACE
	-> ^( BLOCK_SCOPE[$lb, "BLOCK_SCOPE"] sourceElement* )
	;

// $>
	
// $<	Program (14)
 
 
program
	: sourceElement*
	-> ^(COMPILATION_UNIT sourceElement*)
	;

/*
By setting k  to 1 for this rule and adding the semantical predicate ANTRL will generate code that will always prefer functionDeclararion over functionExpression
here and therefor remove the ambiguity between these to production.
This will result in the same behaviour that is described in the specification under 12.4 on the expressionStatement rule.
*/
sourceElement
options{  k = 1 ;} : 
{ input.LA(1) == FUNCTION }? 
    functionDeclaration
	| statement
	;
