grammar Scheme;

options {
	language = Java;
	output = AST;
	ASTLabelType = CommonTree;
}

tokens {
	CLASS_DECL;
	NEGATION;
	CONST_ASSIGN;
	TYPE_ASSIGN;
	VAR_SECTION;
	TVAR_SECTION;
	FIELD_DECL;
	QUAL_ACCESS;	// qualified access
	PARAM_VAR;
	PARAM_CONST;
	PARAM_OUT;
	ARRAY_ACCESS;
	PROC_CALL;		// <-- potrebno je ugraditi u gramatiku da bi u AST
					// razlikovali poziv funkcije od poziva procedure
	PROCEDURE_BODY;
	PROGRAM_BODY;
	VAR_DECL_ASSIGN;
	PROG_IMPORT;
	RECORD_HELPER;
	LAB_STAT;
	CLASS_HELPER;
	CLASS_OF;
	CLASS_ABSTRACT;
	CLASS_SEALED;
	BEGIN_EXPR;

	PACKAGE_DECL;
	CONCRETE_UNIT_DECL;
	ACCESS_DECL;
	INTERFACE_UNIT_DECL;
	FUNCTION_DECL;
	FORMAL_PARAM_LIST;
	PARAMETER_DECL;
	BLOCK_SCOPE;
	IMPORT_DECL;
	ATTRIBUTE_DECL;
	VAR_DECL;
	STATIC_ARRAY_CREATOR;
	FUNCTION_CALL;
	ARGUMENT_LIST;
	ARGUMENT;
	TYPE_;
	NAME;

	EXTENDS;
	CLASS_FIELDS;

	EXPRESSION;

	COMPILATION_UNIT;
	MAIN_BLOCK;
	CONDITION;
	BRANCH_STATEMENT;
	BRANCH;
	JUMP_STATEMENT;
	LOOP_STATEMENT;
	INIT;
	STEP;
	ASSIGNMENT_STATEMENT;
	LOGICAL_OPERATOR;

	KEYWORD;
	OPERATOR;
	COMPARISON_OPERATOR;
	ASSIGN_OPERATOR;
	SEPARATOR;
	INBUILT_TYPE;
	CONST;
	VALUE;
}

@header {
	package Languages.scheme;
}

@members {
	SymbolTable symtab = new SymbolTable();
	public static boolean isJumpStatement;
}

@lexer::header {
	package Languages.scheme;
}


//===---------------------------------------------------------------------===//
//  Parser rules
//===---------------------------------------------------------------------===//

compilation_unit
	:	library EOF
		-> ^( COMPILATION_UNIT library )
	|	expressionOrDefinition* EOF
		-> ^( COMPILATION_UNIT expressionOrDefinition* )
	;

expressionOrDefinition
	:	( lpar (EXPORT | IMPORT)  )=>        exportOrImportVariable
	|	( lpar DEFINE_SYNTAX )=>              syntaxDefinition
	|	( lpar DEFINE)=>                    definition
	| ( lpar BEGIN DEFINE ) => beginDefinition
	|	( '(' BEGIN expressionOrDefinition )=> beginExpressionOrDefinition
	|	fullExpression
	;

lpar      : '('      -> ^( SEPARATOR '(' ) ;
rpar      : ')'      -> ^( SEPARATOR ')' ) ;
sharpLpar : '#('     -> ^( SEPARATOR '#(' ) ;
elipsis   : ELLIPSIS -> ^( SEPARATOR ELLIPSIS ) ;

beginExpressionOrDefinition
	:	lpar BEGIN expressionOrDefinition+ rpar
		-> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) expressionOrDefinition+ rpar )
	;

library
	:	lpar LIBRARY lpar variable rpar expressionOrDefinition+ rpar
		-> ^( PACKAGE_DECL
		      lpar ^( KEYWORD LIBRARY ) lpar variable rpar expressionOrDefinition+ rpar )
	;

exportOrImportVariable
	:	lpar EXPORT variable rpar
		-> lpar ^( KEYWORD EXPORT ) variable rpar
	|	lpar IMPORT ( lpar variable rpar )+ rpar
		-> ^( IMPORT_DECL lpar ^( KEYWORD IMPORT ) variable rpar )
	;

syntaxDefinition
	:	lpar DEFINE_SYNTAX keyword transformerSpec rpar
	;

definition
	:	lpar DEFINE (
	  variable definitionExpression rpar
		-> ^( VAR_DECL lpar ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR DEFINE ) variable ^(VALUE definitionExpression)) rpar )

		|   lpar variable defFormals? rpar body rpar
		-> ^( FUNCTION_DECL
		     lpar ^( KEYWORD DEFINE ) lpar variable ^( FORMAL_PARAM_LIST defFormals? ) rpar ^(BLOCK_SCOPE body) rpar)
		     
		)
		;

beginDefinition
  : lpar BEGIN definition* rpar
    -> ^( BLOCK_SCOPE lpar ^( KEYWORD BEGIN ) definition* rpar )
  ;

definitionExpression
	:	( variable )=>          variable
	|	( literal )=>           literal	
	|	( callCCExpr ) =>       callCCExpr
	|	( lambdaExpression )=>  lambdaExpression -> ^( TYPE_ lambdaExpression )
	|	( condExpression )=> 	condExpression
	|	( conditional )=>       conditional
	| ( unlessExpression )=>	unlessExpression
	| ( whenExpression )=>	whenExpression
	|	( lpar SET)=>        assignment
	|	( derivedExpression )=> derivedExpression
	|	( lpar operator )=>     procedureCall
	|	( applyExpression ) =>	applyExpression
	|	( macroUse )=>          macroUse
	|	( letExpression ) =>    letExpression
	|  oprtr
  | contCall
	|                           macroBlock
	;

defFormals
	:	variable+
		-> ^( PARAMETER_DECL variable )+
	;

keyword
	:	identifier
	;

transformerSpec
	:	lpar SYNTAX_RULES lpar identifier* rpar syntaxRule* rpar
		-> lpar ^( KEYWORD SYNTAX_RULES ) lpar identifier* rpar syntaxRule* rpar
	;

syntaxRule
	:	lpar pattern template rpar
	;

pattern
	:	patternIdentifier
	|	lpar ( pattern+ ( dot pattern | elipsis)? )? rpar
	|	sharpLpar ( pattern+ elipsis? )? rpar
	|	patternDatum
	;

patternIdentifier
	:	syntacticKeyword	-> ^( KEYWORD syntacticKeyword )
	|	VARIABLE			-> ^( NAME VARIABLE )
	;

patternDatum
	:	STRING		-> ^( CONST STRING )
	|	CHARACTER	-> ^( CONST CHARACTER )
	|	bool
	|	number
	;

template
	:	patternIdentifier
	|	lpar ( templateElement+ ( dot templateElement)? )? rpar
	|	sharpLpar templateElement* rpar
	|	templateDatum
	;

templateElement
	:	template elipsis?
	;

templateDatum
	:	patternDatum
	;

identifier
	:	syntacticKeyword -> ^( KEYWORD syntacticKeyword )
	|	variable
	;

syntacticKeyword
	:	expressionKeyword
	|	ELSE
	|	ARROW
	|	DEFINE
	|	UNQUOTE
	|	UNQUOTE_SPLICING
	;

expressionKeyword
	:	QUOTE
	|	LAMBDA
	|	IF
	|	SET
	|	BEGIN
	|	COND
	|	AND 
	|	OR 
	|	CASE
	|	LET
	|	LETSTAR
	|	LETREC
	|	DO
	|	DELAY
	|	QUASIQUOTE
	;

branchExpression
  : ( lpar COND )=>   condExpression
  | ( lpar IF )=>       conditional
  | ( unlessExpression )=>  unlessExpression
  | ( whenExpression )=>  whenExpression  
  | derivedBranchExpression
  ;
  
nonJumpExpression
  : (lpar (COND | IF | UNLESS | WHEN | CASE )) => branchExpression
  | (lpar DO) => derivedLoopExpression 
  ;
  
jumpableExpression
	:	( lpar SET )=>        assignment 
  | ( variable )=>          variable
	|	( literal )=>           literal	
	|  ( lpar VARIABLE ) =>  oprtr
	| ( lpar operator )=>     procedureCall
	|	( lpar callCC) =>       callCCExpr
	|	( lpar LAMBDA )=>  lambdaExpression
	|	( derivedExpression )=> derivedExpression
	|	( lpar APPLY ) =>	applyExpression
	|	( macroUse )=>          macroUse
  | macroBlock 
  | contCall
	;

fullExpression
	: (lpar (COND | IF | UNLESS | WHEN | CASE | DO)) => nonJumpExpression
	//| (lpar (SET | VARIABLE | operator | callCC | LAMBDA | APPLY ) ) => jumpableExpression
	| jumpableExpression 
	;
assign
  : ( lpar SET )=>        assignment 
  ;

oprtr
	:	{ symtab.isOperator(input.LT(2).getText())}? lpar VARIABLE fullExpression* rpar
		-> lpar ^( OPERATOR VARIABLE  fullExpression*) rpar
		|
		{ symtab.isComparisonOperator(input.LT(2).getText())}? lpar VARIABLE fullExpression* rpar
    -> lpar ^( COMPARISON_OPERATOR VARIABLE  fullExpression*) rpar
  	;

// Continuation call
contCall
	:	{ symtab.contains(input.LT(2).getText()) }? lpar VARIABLE fullExpression* rpar
		-> ^( JUMP_STATEMENT lpar ^( NAME VARIABLE ) fullExpression* rpar )
	;

variable
	:	VARIABLE    -> ^( NAME VARIABLE )
	|	ELLIPSIS    -> ^( SEPARATOR ELLIPSIS )
	;

literal
	:	quotation
	|	selfEvaluating
	;

quot : '\'' -> ^( SEPARATOR '\'' ) ;

quotation
	:	quot datum
	|	'\'()'					-> ^( CONST '\'()' )
	|	lpar QUOTE datum rpar 	-> lpar ^( SEPARATOR QUOTE ) datum rpar
	;

selfEvaluating
	:	bool
	|	number
	|	CHARACTER	-> ^( CONST CHARACTER )
	|	STRING		-> ^( CONST STRING )
	;

lambdaExpression
	:	lpar LAMBDA formals body rpar

		-> ^( FUNCTION_DECL
				lpar ^( KEYWORD LAMBDA )
					^( FORMAL_PARAM_LIST formals )
					^( PROCEDURE_BODY body ) rpar )
	;

callCCLambdaExpression
	:	lpar LAMBDA
		lpar { symtab.openScope(); }
		VARIABLE { symtab.insert($VARIABLE.text); }
		rpar body
		rpar { symtab.closeScope(); }

		-> ^( FUNCTION_DECL
				lpar ^( KEYWORD LAMBDA )
					^( FORMAL_PARAM_LIST lpar ^( NAME VARIABLE ) rpar )
					^( PROCEDURE_BODY body ) rpar )
	;

callCC
	:	CALL_WITH_CC -> ^( OPERATOR CALL_WITH_CC )
	|	CALL_CC      -> ^( OPERATOR CALL_CC )
	;

// Call with current continuation
callCCExpr
	:	lpar callCC callCCLambdaExpression rpar
	;

dot
	:	'.'		-> ^( SEPARATOR '.' )
	;

formals
	:	lpar ( paramDecl+ ( dot paramDecl )? )? rpar
	|	paramDecl
	;

paramDecl
	:	variable -> ^( PARAMETER_DECL variable )
	;

conditional
	:	lpar IF test consequence alternative? rpar

		->  ^( BRANCH_STATEMENT
				^(SEPARATOR lpar) 			
				^( BRANCH ^( KEYWORD IF ) test ^(BLOCK_SCOPE consequence) )
				^( BRANCH ^(BLOCK_SCOPE alternative) )? ^(SEPARATOR rpar) )
	;

test
	:	fullExpression -> ^( CONDITION fullExpression )
	;
loop_test
  : fullExpression ->  fullExpression 
  ;

consequence
	:	//( lpar SET )=>        assignment 
    //expression  -> ^(JUMP_STATEMENT expression)
    (lpar (COND | IF | UNLESS | WHEN | CASE | DO)) => nonJumpExpression 
    | jumpableExpression -> ^(JUMP_STATEMENT jumpableExpression)
	;

alternative
	:	//( lpar SET )=>        assignment 
   // expression  -> ^(JUMP_STATEMENT expression)
   (lpar (COND | IF | UNLESS | WHEN | CASE | DO)) => nonJumpExpression 
    | jumpableExpression -> ^(JUMP_STATEMENT jumpableExpression)
	;

assignment
	:	lpar SET variable fullExpression rpar
		-> lpar ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR SET  variable ^(VALUE fullExpression)) ) rpar
	;

derivedExpression
	:	quasiquotation
		|  lpar ( //caseExpression 
				  notExpression
				| andExpression
				| orExpression
				| letExpression
				| letNamedExpression
				| letStarExpression
				| letrecExpression
				| beginExpression
				//| doExpression
				| delayExpression
				)
			rpar
	;
	
derivedBranchExpression
  : lpar caseExpression rpar
  ;
  
derivedLoopExpression
  : lpar doExpression rpar
  ;

condExpressionDer
	:	COND condBody+

		-> ^( BRANCH_STATEMENT ^(BRANCH ^( KEYWORD COND ) condBody+ ))
	;

condExpression
	:	lpar COND condClause+ elseBranch? rpar
		-> ^(BRANCH_STATEMENT lpar ^(BRANCH ^(KEYWORD COND) condClause+ elseBranch? rpar))
	;

condBody
	:	lpar condClause+ elseBranch? rpar
	;

elseBranch
	:	lpar ELSE sub_sequence rpar

		-> ^( BRANCH ^(SEPARATOR lpar) ^( KEYWORD ELSE ) ^(BLOCK_SCOPE /*^(JUMP_STATEMENT*/ sub_sequence)  rpar )
	;
//JUMP_STATEMENT should simulate "return"
//TODO: test it!!!
condClause
	:	lpar test condClauseBody? rpar
		-> lpar test ^(BLOCK_SCOPE condClauseBody)? rpar 
	;

condClauseBody
	:	sequence
	|	ARROW recipient		-> ^( SEPARATOR ARROW ) recipient
	;

recipient
	:	fullExpression
	;

caseExpression
	:	CASE fullExpression caseBody

		-> ^( BRANCH_STATEMENT ^( KEYWORD CASE ) fullExpression caseBody )
	;

caseBody
	:	elseBranch | caseClause+ elseBranch?
	;

caseClause
	:	lpar lpar datum* rpar sub_sequence rpar

		-> ^( BRANCH lpar lpar ^( CONDITION datum )* rpar sub_sequence rpar )
	;

whenExpression
	:	lpar WHEN test sequence rpar
	-> ^( BRANCH_STATEMENT
				lpar ^( KEYWORD WHEN ) test
					^( BRANCH sequence ) rpar )
	;

unlessExpression
	:	lpar UNLESS test sequence rpar

		-> ^( BRANCH_STATEMENT
				lpar ^( KEYWORD UNLESS ) test
					^( BRANCH sequence ) rpar )
	;

notExpression
	:	NOT fullExpression

		-> ^( LOGICAL_OPERATOR  NOT   fullExpression)
	;

andExpression
	:	AND fullExpression+

		-> ^( LOGICAL_OPERATOR  AND  fullExpression+)
	;

orExpression
	:	OR fullExpression+

		-> ^( LOGICAL_OPERATOR OR  fullExpression+)
	;

/* Napomena: Neimenovane "LET" izraze posmatramo kao BLOCK_SCOPE a imenovani
posmatramo kao deklaraciju funkcije. */

/* Neimenovani LET izrazi */

letExpression
	:	LET lpar bindingSpecVars* rpar body

		-> ^( BLOCK_SCOPE
				^( KEYWORD LET ) lpar bindingSpecVars* rpar body )
	;

letStarExpression
	:	LETSTAR lpar bindingSpecVars* rpar body

		-> ^( BLOCK_SCOPE
			   ^( KEYWORD LETSTAR ) lpar bindingSpecVars* rpar
			   ^( PROCEDURE_BODY body ) )
	;

letrecExpression
	:	LETREC lpar bindingSpecVars* rpar body

		-> ^( BLOCK_SCOPE
			   ^( KEYWORD LETREC ) lpar bindingSpecVars* rpar
			   ^( PROCEDURE_BODY body ) )
	;

bindingSpecVars
	:	lpar variable fullExpression rpar
		-> ^( VAR_DECL lpar variable ^( EXPRESSION fullExpression ) rpar )
	;


/* Imenovani LET izraz */

letNamedExpression
	:	LET variable lpar bindingSpecPars* rpar body
		-> 	^( KEYWORD LET )
			^( FUNCTION_DECL variable?
				lpar ^( FORMAL_PARAM_LIST bindingSpecPars* ) rpar
				^( PROCEDURE_BODY body ) )
	;

bindingSpecPars
	:	lpar variable fullExpression rpar
		-> ^( PARAMETER_DECL variable ^( EXPRESSION fullExpression ) )
	;


beginExpression
	:	BEGIN sequence
		-> ^( BLOCK_SCOPE BEGIN sequence )
	;

doExpression
	:	DO lpar iterationSpec* rpar lpar loop_test doResult? rpar fullExpression*
		-> ^( LOOP_STATEMENT
				^( KEYWORD DO )
				lpar   iterationSpec* rpar
				lpar ^(CONDITION loop_test) ^(JUMP_STATEMENT doResult)? rpar ^(BLOCK_SCOPE fullExpression*) )
	;

delayExpression
	:	DELAY fullExpression
		-> ^( KEYWORD DELAY ) fullExpression
	;

iterationSpec
	:	lpar varDecl init step? rpar
	-> lpar ^(INIT ^(VAR_DECL ^(ASSIGNMENT_STATEMENT varDecl ^( VALUE init)))) ^(STEP ^(ASSIGNMENT_STATEMENT step?))  rpar
	;

varDecl
	:	variable
		//-> ^( VAR_DECL variable )
	;

init
	:	fullExpression
	;

step
	:	fullExpression
	;

doResult
	:	sequence
	;

procedureCall
	:	lpar operator operand* rpar
		-> ^( FUNCTION_CALL
				lpar operator ^( ARGUMENT_LIST operand* ) rpar )
	;

quoteLpar : '\'(' -> ^( SEPARATOR '\'(' ) ;

applyExpression
	:	lpar APPLY operator operand* quoteLpar operand1* rpar rpar

		-> ^( FUNCTION_CALL
				lpar
				^( KEYWORD APPLY )
				operator ^( ARGUMENT_LIST
			                  operand*
			                  quoteLpar operand1* rpar ) rpar )
	;

operator
	:	fullExpression
	;

operand
	:	fullExpression -> ^( ARGUMENT fullExpression )
	;

operand1
	:	fullExpression -> ^( ARGUMENT fullExpression )
	;

macroUse
	:	lpar keyword datum* rpar
	;

macroBlock
	:	lpar LET_SYNTAX lpar syntaxSpec* rpar body rpar
		-> lpar ^( KEYWORD LET_SYNTAX ) lpar syntaxSpec* rpar body rpar

	|	lpar LETREC_SYNTAX lpar syntaxSpec* rpar body rpar
		-> lpar ^( KEYWORD LETREC_SYNTAX ) lpar syntaxSpec* rpar body rpar
	;

syntaxSpec
	:	lpar keyword transformerSpec rpar
	;

body
	:	( ( lpar DEFINE )=> definition )* sequence
	;

blockScope
	:	sequence
		-> ^( BLOCK_SCOPE sequence )
	;

sequence
  : //fullExpression+
   ((lpar (COND | IF | UNLESS | WHEN | CASE | DO)) => nonJumpExpression) sequence?
   | jumpableExpression 
    (  sequence -> jumpableExpression sequence
    |  -> ^(JUMP_STATEMENT jumpableExpression)
    )  
;
  
sub_sequence
	:
	(((lpar (COND | IF | UNLESS | WHEN | CASE | DO)) => nonJumpExpression) sub_sequence?)
   | (jumpableExpression   
      (  (-> ^(JUMP_STATEMENT jumpableExpression))
      |  sub_sequence -> jumpableExpression sub_sequence ))
  ;

datum
	:	simpleDatum
	|	compoundDatum
	;

simpleDatum
	:	bool
	|	number
	|	CHARACTER	-> ^( CONST CHARACTER )
	|	STRING		-> ^( CONST STRING )
	|	identifier
	;

compoundDatum
	:	list
	|	vector
	;

list
	:	lpar ( datum+ ( dot datum )? )? rpar
	|	abbreviation
	;

abbreviation
	:	abbrevPrefix datum
	;

abbrevPrefix
	:	'\''	-> ^( SEPARATOR '\'' )
	|	'`'		-> ^( SEPARATOR '`'  )
	|	',@'	-> ^( SEPARATOR ',@' )
	|	','		-> ^( SEPARATOR ',' )
	;

vector
	:	sharpLpar datum* rpar
	;

number
	:	NUM_2	-> ^( CONST NUM_2 )
	|	NUM_8	-> ^( CONST NUM_8 )
	|	NUM_10	-> ^( CONST NUM_10 )
	|	NUM_16	-> ^( CONST NUM_16 )
	;

bool
	:	TRUE	-> ^( CONST TRUE )
	|	FALSE	-> ^( CONST FALSE )
	;

quasiquotation
	:	quasiquotationD[1]
	;

quasiquotationD[int d]
	:	'`' qqTemplate[d]
	|	lpar QUASIQUOTE qqTemplate[d] ')'
	;

qqTemplate[int d]
  :  ( fullExpression )=>  fullExpression
  |  ( '(' UNQUOTE )=> unquotation[d]
  |                  simpleDatum
  |                  vectorQQTemplate[d]
  |                  listQQTemplate[d]
  ;

vectorQQTemplate[int d]
  :  '#(' qqTemplateOrSplice[d]* ')'
  ;

listQQTemplate[int d]
  :                     '\'' qqTemplate[d]
  |  ('(' QUASIQUOTE)=> quasiquotationD[d+1]
  |                     '(' (qqTemplateOrSplice[d]+ ('.' qqTemplate[d])?)? ')'
  ;

unquotation[int d]
  :  ',' qqTemplate[d-1]
  |  '(' UNQUOTE qqTemplate[d-1] ')'
  ;

qqTemplateOrSplice[int d]
  :  ('(' UNQUOTE_SPLICING)=> splicingUnquotation[d]
  |                           qqTemplate[d]
  ;

splicingUnquotation[int d]
  :  ',@' qqTemplate[d-1]
  |  '(' UNQUOTE_SPLICING qqTemplate[d-1] ')'
  ;

//===---------------------------------------------------------------------===//
//  Lexer rules
//===---------------------------------------------------------------------===//

// Macro keywords
LET_SYNTAX       : 'let-syntax';
LETREC_SYNTAX    : 'letrec-syntax';
SYNTAX_RULES     : 'syntax-rules';
DEFINE_SYNTAX    : 'define-syntax';

LIBRARY          : 'library';
IMPORT           : 'import';
EXPORT           : 'export';

// Syntactic keywords
ELSE             : 'else';
ARROW            : '=>';
DEFINE           : 'define';
UNQUOTE_SPLICING : 'unquote-splicing';
UNQUOTE          : 'unquote';

// Expression keywords
QUOTE            : 'quote';
LAMBDA           : 'lambda';
IF               : 'if';
SET              : 'set!';
BEGIN            : 'begin';
APPLY            : 'apply';
COND             : 'cond';
NOT              : 'not';
AND              : 'and';
OR               : 'or';
CASE             : 'case';
WHEN             : 'when';
UNLESS           : 'unless';
LET              : 'let';
LETSTAR          : 'let*';
LETREC           : 'letrec';
DO               : 'do';
DELAY            : 'delay';
QUASIQUOTE       : 'quasiquote';

CALL_WITH_CC     : 'call-with-current-continuation' ;
CALL_CC          : 'call/cc' ;

NUM_2  : PREFIX_2 COMPLEX_2;
NUM_8  : PREFIX_8 COMPLEX_8;
NUM_10 : PREFIX_10? COMPLEX_10;
NUM_16 : PREFIX_16 COMPLEX_16;

ELLIPSIS : '...';

VARIABLE 
	:	INITIAL SUBSEQUENT* 
	|	PECULIAR_IDENTIFIER
	;

STRING : '"' STRING_ELEMENT* '"';

CHARACTER : '#\\' (~(' ' | '\n') | CHARACTER_NAME);

TRUE  : '#' ('t' | 'T');
FALSE : '#' ('f' | 'F');

// to ignore
SPACE   : (' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};
COMMENT : ';' ~('\r' | '\n')* {$channel=HIDDEN;};

// fragments  
fragment INITIAL : LETTER | SPECIAL_INITIAL;
fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment SPECIAL_INITIAL : '!' | '$' | '%' | '&' | '*' | '/' | ':' | '<' | '=' | '>' | '?' | '^' | '_' | '~';
fragment SUBSEQUENT : INITIAL | DIGIT | SPECIAL_SUBSEQUENT;
fragment DIGIT : '0'..'9';
fragment SPECIAL_SUBSEQUENT : '.' | '+' | '-' | '@';
fragment PECULIAR_IDENTIFIER : '+' | '-';
fragment STRING_ELEMENT : ~('"' | '\\') | '\\' ('"' | '\\');
fragment CHARACTER_NAME : 'space' | 'newline';

fragment COMPLEX_2 
  :  REAL_2 ('@' REAL_2)?
  |  REAL_2? SIGN UREAL_2? ('i' | 'I')
  ;

fragment COMPLEX_8 
  :  REAL_8 ('@' REAL_8)?
  |  REAL_8? SIGN UREAL_8? ('i' | 'I')
  ;

fragment COMPLEX_10 
  :  REAL_10 ('@' REAL_10)?
  |  REAL_10? SIGN UREAL_10? ('i' | 'I')
  ;

fragment COMPLEX_16 
  :  REAL_16 ('@' REAL_16)?
  |  REAL_16? SIGN UREAL_16? ('i' | 'I')
  ;

fragment REAL_2 : SIGN? UREAL_2;
fragment REAL_8 : SIGN? UREAL_8;
fragment REAL_10 : SIGN? UREAL_10;
fragment REAL_16 : SIGN? UREAL_16;
fragment UREAL_2 : UINTEGER_2 ('/' UINTEGER_2)?;
fragment UREAL_8 : UINTEGER_8 ('/' UINTEGER_8)?;
fragment UREAL_10 : UINTEGER_10 ('/' UINTEGER_10)? | DECIMAL_10;
fragment UREAL_16 : UINTEGER_16 ('/' UINTEGER_16)?;

fragment DECIMAL_10 
  :  UINTEGER_10 SUFFIX
  |  '.' DIGIT+ '#'* SUFFIX?
  |  DIGIT+ '.' DIGIT* '#'* SUFFIX?
  |  DIGIT+ '#'+ '.' '#'* SUFFIX?
  ;

fragment UINTEGER_2 : DIGIT_2+ '#'*;
fragment UINTEGER_8 : DIGIT_8+ '#'*;
fragment UINTEGER_10 : DIGIT+ '#'*;
fragment UINTEGER_16 : DIGIT_16+ '#'*;
fragment PREFIX_2 : RADIX_2 EXACTNESS? | EXACTNESS RADIX_2;
fragment PREFIX_8 : RADIX_8 EXACTNESS? | EXACTNESS RADIX_8;
fragment PREFIX_10 : RADIX_10 EXACTNESS? | EXACTNESS RADIX_10;
fragment PREFIX_16 : RADIX_16 EXACTNESS? | EXACTNESS RADIX_16;
fragment SUFFIX : EXPONENT_MARKER SIGN? DIGIT+;
fragment EXPONENT_MARKER : 'e' | 's' | 'f' | 'd' | 'l' | 'E' | 'S' | 'F' | 'D' | 'L';
fragment SIGN : '+' | '-';
fragment EXACTNESS : '#' ('i' | 'e' | 'I' | 'E');
fragment RADIX_2 : '#' ('b' | 'B'); 
fragment RADIX_8 : '#' ('o' | 'O');
fragment RADIX_10 : '#' ('d' | 'D');
fragment RADIX_16 : '#' ('x' | 'X');
fragment DIGIT_2 : '0' | '1';
fragment DIGIT_8 : '0'..'7';
fragment DIGIT_16 : DIGIT | 'a'..'f' | 'A'..'F';
