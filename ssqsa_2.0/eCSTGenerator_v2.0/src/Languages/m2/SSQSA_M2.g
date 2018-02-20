/** --------------------------------- SSQSA Modula-2 grammar --------------------------------------
 *  Modula-2 grammar with incorporated SSQSA universal nodes 
 *  Ver 0 - Benjamin (see comment below)
 *  Ver 1 - Gordana, goca@dmi.uns.ac.rs
 *  Ver 2 - Milos, jul 2012, svc@dmi.uns.ac.rs
 * -------------------------------------------------------------------------------------------
 */ 
 
/* ANTLR v3 Grammar for Modula-2 (PIM3)
 *
 * LL(1) version, derived from 3rd Edition of Programming in Modula-2
 *
 * This grammar is an  LL(1) version  of the  Modula-2 syntax  provided in the
 * third  edition  of  "Programming in Modula-2"  by N. Wirth.  It follows the
 * naming conventions and structure of Wirth's syntax  but has been refactored
 * to satisfy LL(1) constraints.  The original, unmodified grammar by Wirth is
 * also available in ANTLR v3 format as a separate file.
 *
 *
 * Copyright (C) 2009, Benjamin Kowarsch. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * (1) Hosting of  this  file, or any parts thereof, on websites which contain
 *     advertising is expressly forbidden and requires specific prior written
 *     permission. However, the ANTLR project website and university websites
 *     are exempt from this restriction. Exemption may be withdrawn if abused.
 *
 * (2) Redistributions of source code must retain the above copyright notice,
 *     this list of conditions and the following disclaimer.
 *
 * (3) Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and other materials provided with the distribution.
 *
 * (4) Neither the author's name nor the names of any contributors may be used
 *     to endorse or promote products derived from this software without
 *     specific prior written permission.
 *
 * (5) Where this list of conditions or the following disclaimer, in part or
 *     as a whole is overruled or nullified by applicable law, no permission
 *     is granted to use the software.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,  BUT NOT LIMITED TO,  THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY  AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT  SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE  FOR  ANY  DIRECT,  INDIRECT,  INCIDENTAL,  SPECIAL,  EXEMPLARY,  OR
 * CONSEQUENTIAL  DAMAGES  (INCLUDING,  BUT  NOT  LIMITED  TO,  PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES;  LOSS OF USE,  DATA,  OR PROFITS; OR BUSINESS
 * INTERRUPTION)  HOWEVER  CAUSED  AND ON ANY THEORY OF LIABILITY,  WHETHER IN
 * CONTRACT,  STRICT LIABILITY,  OR TORT  (INCLUDING NEGLIGENCE  OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,  EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 */

grammar SSQSA_M2; // Modula-2 PIM3 standard

// file version 1.00, May 19, 2009

// Milos, 16 jul 2012, backtrack set to true, k=1 removed
options {
  backtrack = true;
  //k=1;  /* LL(1) */
  output = AST;
  ASTLabelType = CommonTree;
}



tokens {
	
	// Reserved Words

	LOGICAL_AND    = 'AND';
	ARRAY          = 'ARRAY';
	BEGIN          = 'BEGIN';
	BY             = 'BY';
	CASE           = 'CASE';
	CONST_          = 'CONST';
	DEC            = 'DEC';
	DEFINITION     = 'DEFINITION';
	DIV            = 'DIV';
	DO             = 'DO';
	ELSE           = 'ELSE';
	ELSIF          = 'ELSIF';
	END            = 'END';
	EXIT           = 'EXIT';
	EXPORT         = 'EXPORT';
	FOR            = 'FOR';
	FORWARD		= 'FORWARD';
	FROM           = 'FROM';
	IF             = 'IF';
	IMPLEMENTATION = 'IMPLEMENTATION';
	IMPORT         = 'IMPORT';
	INC            = 'INC';
	IN             = 'IN';
	LOOP           = 'LOOP';
	MOD            = 'MOD';
	MODULE         = 'MODULE';
	NOT            = 'NOT';
	OF             = 'OF';
	LOGICAL_OR     = 'OR';
	POINTER        = 'POINTER';
	PROCEDURE      = 'PROCEDURE';
	QUALIFIED      = 'QUALIFIED';
	RECORD         = 'RECORD';
	REPEAT         = 'REPEAT';
	RETURN         = 'RETURN';
	SET            = 'SET';
	THEN           = 'THEN';
	TO             = 'TO';
	TYPE           = 'TYPE';
	UNTIL          = 'UNTIL';
	VAR            = 'VAR';
	WHILE          = 'WHILE';
	WITH           = 'WITH';

	// Operators
	
	ASSIGN_OP           = ':=';
	LOGICAL_AND_OP      = '&';
	LOGICAL_NOT_OP      = '~';
	EQUAL_OP            = '=';
	NOT_EQUAL_OP        = '#';
	PASCAL_NOT_EQUAL_OP = '<>';
	GREATER_OP          = '>';
	GREATER_OR_EQUAL_OP = '>=';
	LESS_OP             = '<';
	LESS_OR_EQUAL_OP    = '<=';
	PLUS_OP             = '+';
	MINUS_OP            = '-';
	MULTIPLY_OP         = '*';
	DIVIDE_OP           = '/';
	POINTER_OP          = '^';
	
	
	// Punctuation
	DOT = '.';
	DOTDOT = '..';
	
        // universal nodes
        
        COMPILATION_UNIT;
        
        // universal nodes used by sneipl
        IMPORT_DECL;
        CONCRETE_UNIT_DECL;
        INTERFACE_UNIT_DECL;
        BLOCK_SCOPE;
        ATTRIBUTE_DECL;
        VAR_DECL;
        TYPE_DECL;
        FUNCTION_DECL;
        FORMAL_PARAM_LIST;
        PARAMETER_DECL;
        NAME;
        
        FUNCTION_CALL;
        ARGUMENT_LIST;
        ARGUMENT;
        IMPLEMENTS;
        
        
        // universal nodes used by smille
        JUMP_STATEMENT;
        LOGICAL_OPERATOR;
        LOOP_STATEMENT; //we ar eusing this for all loops: for, while, repeat, loop...
        INIT;
        STEP;
        BRANCH_STATEMENT;   //we are using this for all branches: if, case...
        BRANCH;
        CONDITION;
        
        // other nodes with universal potential
        STATEMENT;
        
        // Tijana Vislavski, jun 2016.
        ASSIGNMENT_STATEMENT;
        ASSIGN_OPERATOR;
        OPERATOR;
        COMPARISON_OPERATOR;
        VALUE;
        CONST;
        FOR_INIT;
        FOR_CONDITION;
        FOR_UPDATE;
        SEPARATOR;
        KEYWORD;
        
        // Milos, 16 jul, 2012, removed or not used universal nodes
        // VARIANT;
        // WHITESPACE_SEGMENT;
        // SIMPLE_EXPRESSION;
        // MUL_OPERATOR;
        // RELATION;
        // ABSTRACT_UNIT_DECL;
        // ADD_OPERATOR;
        // BLOCK;
        // EXPRESSION;
        // FACTOR;
        // COMMENT_SEGMENT; 
        // TYPE_DECLARATOR;
        // MAIN_BLOCK;
        // CONST_DECL;

	IGNORE;
	VOID;
	M2IF_;
}

@header {package Languages.m2;}

@lexer::header {package Languages.m2;}
// ---------------------------------------------------------------------------
// P A R S E R   G R A M M A R
// ---------------------------------------------------------------------------

// PIM 3 Appendix 1 line 1

ident :	IDENT ; // see lexer
      
// PIM 3 Appendix 1 line 2

number : INTEGER ->  ^(CONST INTEGER)
	| REAL ->  ^(CONST REAL); // see lexer

// PIM 3 Appendix 1 lines 3-4

integer : INTEGER ; // see lexer

// PIM 3 Appendix 1 line 5

real : REAL ; // see lexer

// PIM 3 Appendix 1 line 6

scaleFactor : SCALE_FACTOR ; // see lexer

// PIM 3 Appendix 1 line 7

hexDigit : HEX_DIGIT ; // see lexer

// PIM 3 Appendix 1 line 8

digit : DIGIT ; // see lexer

// PIM 3 Appendix 1 line 9

octalDigit : OCTAL_DIGIT ; // see lexer

// PIM 3 Appendix 1 line 10

string : STRING ; // see lexer

// PIM 3 Appendix 1 line 11

//comment : COMMENT -> ^(COMMENT_SEGMENT COMMENT);

//white_space 
//	:	WHITESPACE -> ^(WHITESPACE_SEGMENT WHITESPACE);

// Milos, 16 jul 2012, removed ^
// Milos, 16 jul 2012, integrated NAME universal node
qualident :
	//ident ( '.'^ ident )*
	(
		ident ->  ^(NAME ident)
	) 
	(	
		'.' ident -> ^(NAME $qualident ^(SEPARATOR '.') ^(NAME ident))
	)*
	
	;

// PIM 3 Appendix 1 line 12

constantDeclaration :	
	ident '=' constExpression -> ^(ATTRIBUTE_DECL ^(NAME ident) ^(TYPE /*^(NAME*/ VOID))//)
	;

// PIM 3 Appendix 1 line 13

constExpression :
	simpleConstExpr ( relation^ simpleConstExpr )?
	;

// PIM 3 Appendix 1 line 14

relation :
	'=' -> ^(COMPARISON_OPERATOR '=') 
	| '#' -> ^(COMPARISON_OPERATOR '#') 
	| '<>' -> ^(COMPARISON_OPERATOR '<>') 
	| '<' -> ^(COMPARISON_OPERATOR '<') 
	| '<=' -> ^(COMPARISON_OPERATOR '<=') 
	| '>' -> ^(COMPARISON_OPERATOR '>') 
	| '>=' -> ^(COMPARISON_OPERATOR '>=') 
	| 'IN' -> ^(COMPARISON_OPERATOR 'IN') 
	;

// PIM 3 Appendix 1 line 15

simpleConstExpr :
	( '+' | '-' )? constTerm ( addOperator^ constTerm )*
	;

// PIM 3 Appendix 1 line 16

addOperator :
		PLUS_OP -> ^(OPERATOR PLUS_OP)	
		| MINUS_OP -> ^(OPERATOR MINUS_OP)
		| LOGICAL_OR -> ^(LOGICAL_OPERATOR LOGICAL_OR)?
	;

// PIM 3 Appendix 1 line 17

constTerm :
	constFactor ( mulOperator^ constFactor )*
	; 

// PIM 3 Appendix 1 line 18

mulOperator :
		    LOGICAL_AND -> ^( LOGICAL_OPERATOR  LOGICAL_AND)?
		 |  LOGICAL_AND_OP -> ^( LOGICAL_OPERATOR  LOGICAL_AND_OP)?
		 |  '*' -> ^(OPERATOR '*') 
		 | '/' -> ^(OPERATOR '/')
		 | 'DIV' -> ^(OPERATOR 'DIV')
		 | 'MOD' -> ^(OPERATOR 'MOD')
	;

// PIM 3 Appendix 1 lines 19-20

// refactored for LL(1)
constFactor :
	number |
	string |
	qualident ( constSet )? |
	constSet |
	'(' constExpression^ ')' | ( 'NOT'^ | '~'^) constFactor
	;

// PIM 3 Appendix 1 line 21

// refactored for LL(1)
constSet :
	/* ( qualident )? : has been factored out */ 
	'{' ( constElement ( ',' constElement )* )? '}' -> IGNORE /* -> '{' ( constElement)+ '}' */ 
	;

// PIM 3 Appendix 1 line 22

constElement :
	constExpression ( '..'^ constExpression  )?
	;

// PIM 3 Appendix 1 line 23

typeDeclaration :
	ident '=' type -> ^(TYPE_DECL ^(NAME ident) ^('=' type))
	;

defModTypeDeclaration :
	  ident -> ^(TYPE_DECL ^(NAME ident))
	| ident '=' type -> ^(TYPE_DECL ^(NAME ident) ^('=' type))
	;

// PIM 3 Appendix 1 lines 24-25

type :
	simpleType | arrayType | recordType | setType | pointerType | procedureType
	;

// PIM 3 Appendix 1 line 26

// refactored for LL(1)
simpleType :
	ident ( '.' ident )* -> ^(TYPE ident ^(SEPARATOR '.' ident )*) | 
	subrangeType |
	enumeration
	;

// combined from qualident and subrangeType for LL(1)

subrangeType :	
	ident range -> ^(TYPE /*^(NAME*/ ident/*)*/ range)|
	range -> ^(TYPE /*^(NAME*/range /*)*/)
	;

// PIM 3 Appendix 1 line 27

enumeration :
	'(' identList ')'
	;

// PIM 3 Appendix 1 line 28

// Milos, 16 jul 2012, transformation ->^(ident)+ removed [can cause serious bugs]
identList :
	ident ( ',' ident )* //-> ^(ident)+
	;

// PIM 3 Appendix 1 line 29

// new for LL1(1)
// Milos, 20 jul 2012, seljacki fix
range :
	//'[' constExpression '..' constExpression ']'
	'[' (constExpression DOTDOT | number) constExpression ']' 
	;

// PIM 3 Appendix 1 line 30

arrayType :
	'ARRAY' simpleType ( ',' simpleType )* 'OF' type
        -> ^(TYPE ^('ARRAY' simpleType*) ^('OF' type))
	;

// PIM 3 Appendix 1 line 31

recordType :
	'RECORD' fieldListSequence (';')? 'END'
	-> ^(TYPE 'RECORD' fieldListSequence)
	;

// PIM 3 Appendix 1 line 32

fieldListSequence :
	fieldList ( ';' fieldList )* -> (fieldList)+
	;

// PIM 3 Appendix 1 lines 33-35

// Milos, 17 jul, ovo moze prouzrokovati problem za SMIILE jer se field list pojavljuje
// indirektno u definiciji sloga gde se takodje uglavljuju BRANCH_STATEMENTS
fieldList :
	identList ':' type  -> identList ':' type |
	'CASE'  (( ident )? ':')? qualident 'OF' variant (';')? ( '|' variant (';')? )* /* (';')? */
	( 'ELSE' fieldListSequence )? (';')?
	'END'
	->
	^(BRANCH_STATEMENT 
		^('CASE' (( ident )? ':')? qualident  'OF' 
			^(BRANCH variant)+
			^(BRANCH 'ELSE' fieldListSequence )?
		'END'
		)
	)
	;
	
	

// PIM 3 Appendix 1 line 36

variant :
	(  caseLabelList ':' fieldListSequence )? //-> ^(VARIANT caseLabelList fieldListSequence)
	;

// PIM 3 Appendix 1 line 37

caseLabelList :
	caseLabels ( ',' caseLabels )* -> caseLabels*
	;

// PIM 3 Appendix 1 line 38

caseLabels :
	constExpression ( ('..')? constExpression )?
	;

// PIM 3 Appendix 1 line 39

setType :
	'SET' 'OF' simpleType
	-> ^(TYPE ^('SET' 'OF') simpleType)
	;

// PIM 3 Appendix 1 line 40

pointerType :
	'POINTER' 'TO' type
	-> ^(TYPE ^('POINTER' 'TO') type)
	;

// PIM 3 Appendix 1 line 41

procedureType :
	'PROCEDURE' ( formalTypeList )? (':' formalType)?
	-> ^(TYPE ^('PROCEDURE' formalTypeList?) formalType?)
	;

// PIM 3 Appendix 1 lines 42-43

// Milos, 20 jul, 2012
// can't look backwards more than one token in this stream bug fixed
/*
formalTypeList :
	'(' 
	     ( ('VAR')? formalType 
	       ( ',' ( 'VAR' )? formalType)* 
	     )? 
	')'
	( ':' qualident )?
	-> ^(TYPE formalType* (^(TYPE qualident?)?))
	;
*/

formalTypeList :
	'(' 
	     ( ('VAR')? formalType 
	       ( ',' ( 'VAR' )? formalType)* 
	     )? 
	')' 
	-> ^(TYPE formalType*)
	|
	'(' 
	     ( ('VAR')? formalType 
	       ( ',' ( 'VAR' )? formalType)* 
	     )? 
	')'
	( ':' ident ( '.' ident )* )?
	-> ^(TYPE formalType* ^(TYPE ident ^(SEPARATOR '.' ident )*))
	;


// PIM 3 Appendix 1 line 44

// Milos, 16 jul 2012, ATTRIBUTE_DECL integration
variableDeclaration :
	ident machineAddress? ( ',' ident machineAddress?)* ':' type //-> ^(VAR_DECL (^(':' ^(NAME ident)  type)) +)
	-> (^(ATTRIBUTE_DECL ^(NAME ident)  type ))*
	;

// PIM 3 Appendix 1 line 45

// refactored for LL(1)
//designator :
//	qualident ( designatorTails )? 
//	-> ^(NAME qualident (designatorTails)?)
//	;

// new for LL(1)

//Goca 1.1.2016. Treerewrite rule mofdified

designatorTails : 
  designatorTail+ 
  ;

designatorTail:
	  '[' expList ']' ( '.' ident )* -> ^(SEPARATOR '[') expList ^(SEPARATOR ']') ( ^(SEPARATOR '.') ident )* 
	| '^' ( '.' ident )* -> ^(SEPARATOR '^') ( ^(SEPARATOR '.') ident )* 
	
	;
	


// Milos, 26 jul 2012, NOT USED rule
// combined from set and designator for LL(1)
//setOrDesignator :
//	qualident /* factored out */
//	( set | designatorTail )?
//	;

// PIM 3 Appendix 1 line 46

expList :
	expression ( ','^ expression )*
	;

// PIM 3 Appendix 1 line 47

expression :
	simpleExpression ( relation^ simpleExpression )? 
	;

// PIM 3 Appendix 1 line 48

simpleExpression :
	( '+' | '-' )? term ( addOperator^ term )* 
	;

// PIM 3 Appendix 1 line 49

term :
	factor ( mulOperator^ factor )*// -> ^( mulOperator ^(VALUE factor)  ^(VALUE factor) )*
	;

// PIM 3 Appendix 1 lines 50-51

// Milos, 20 jul 2012, FUNCTION_CALL integration
factor :
  qualident (
  -> qualident 
  | set -> qualident set
  | actualParameters -> ^(FUNCTION_CALL qualident ^(ARGUMENT_LIST actualParameters))
  | designatorTails (
      ->  qualident designatorTails
    | actualParameters -> ^(FUNCTION_CALL qualident designatorTails ^(ARGUMENT_LIST actualParameters))
    )
  )
  |	number //-> ^(VALUE number)
	| string //-> ^(VALUE string)
	| set //-> ^(VALUE set)
	| '(' expression ')' -> ^(SEPARATOR '(') expression ^(SEPARATOR ')')
	| 'NOT' factor 
	;

// PIM 3 Appendix 1 line 52

// refactored for LL(1)
set :
	/* qualident has been factored out */
	'{' ( element ( ',' element )* )? '}' -> IGNORE
	;

// PIM 3 Appendix 1 line 53

element :
	expression ( '..'^ expression )?
	;

// PIM 3 Appendix 1 line 54

//actualParameters :
//	'(' ( expList )? ')' -> '(' ( expList )? ')'
//	;

// PIM 3 Appendix 1 lines 55-58

// refactored for LL(1)
statement :
	assignmentOrProcCall ?
	| ifStatement ?
	| caseStatement ?
	| whileStatement ?
	| repeatStatement? 
	| loopStatement ?
	| forStatement ?
	| withStatement ?
	| 'EXIT'? -> ^(JUMP_STATEMENT 'EXIT')?
	| ('RETURN' expression?)? -> (^(JUMP_STATEMENT 'RETURN' expression?))?
	
	;
// PIM 3 Appendix 1 line 59

// combined from assignment and procedure call for LL(1)

assignmentOrProcCall :
	assignment | procCall | incdeccall
//	designator^ /* has been factored out */
//	( ':='^ expression | (actualParameters)? )
	;


assignment
	: qualidentWithTail ':=' expression -> ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR ':=') qualidentWithTail ^(VALUE expression) )	
	;


// designator or qualident?

qualidentWithTail
	:	(qualident //-> qualident
	  )
	  (designatorTails //-> ^(NAME $qualidentWithTail designatorTails)
		)?
	;

actualParameters :
        '(' ')' |
  '(' (  expression (',' expression)*  ) ')' -> ( ^(ARGUMENT expression) )*
  ;
  
incDecParameters :
  '('  expression (',' expression)? ')' -> ^(SEPARATOR '(') expression (^(SEPARATOR ',') ^(VALUE expression?))? ^(SEPARATOR ')')
  ;

incdeccall
: (INC | DEC) incDecParameters ->  ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR INC? DEC? incDecParameters))
; 

procCall 
	: qualident designatorTails? (actualParameters)? 	-> ^(FUNCTION_CALL qualident ^(ARGUMENT_LIST actualParameters?) )	
	;



//expList :
//	expression ( ','^ expression )*
//	;

// PIM 3 Appendix 1 line 61

statementSequence :
	statement ( ';' statement )* -> statement (statement)*
	;

// PIM 3 Appendix 1 lines 62-64

ifBranch 
	:	'IF' expression 'THEN' statementSequence -> ^(BRANCH ^(KEYWORD 'IF') ^(CONDITION expression) ^(KEYWORD 'THEN') ^(BLOCK_SCOPE statementSequence))
	;
	
elsifBranch 
	:	( 'ELSIF' expression 'THEN' statementSequence )* -> ^(BRANCH ^(KEYWORD 'ELSIF') ^(CONDITION expression) ^(KEYWORD 'THEN') ^(BLOCK_SCOPE statementSequence))*
	;
	
elseBranch 
	:	( 'ELSE' statementSequence )? -> ^(BRANCH ^(KEYWORD 'ELSE') ^(BLOCK_SCOPE statementSequence) )?
	;
	

ifStatement : 
	ifBranch elsifBranch? elseBranch? 'END' 	->	^(BRANCH_STATEMENT ifBranch elsifBranch? elseBranch? ^(KEYWORD 'END'))	
	;

// PIM 3 Appendix 1 lines 65-66

caseStatement :
	'CASE' expression 'OF' casecase ( '|' casecase )*
	( 'ELSE' statementSequence )?
	'END'
	->
	^(BRANCH_STATEMENT 
		^('CASE' expression 'OF' 
			^(BRANCH casecase)+
			^(BRANCH 'ELSE' ^(BLOCK_SCOPE statementSequence) )?
		'END'
		)
	)
	;

// PIM 3 Appendix 1 line 67

casecase :
	( caseLabelList ':' statementSequence )? -> caseLabelList ^(BLOCK_SCOPE statementSequence)
	;

// PIM 3 Appendix 1 line 68

whileStatement :
	'WHILE' expression 'DO' statementSequence 'END' 
	-> ^(LOOP_STATEMENT ^(KEYWORD 'WHILE') ^(CONDITION expression) ^(KEYWORD 'DO') ^(BLOCK_SCOPE statementSequence) ^(KEYWORD 'END'))
	;

// PIM 3 Appendix 1 line 69

repeatStatement :
	'REPEAT' statementSequence 'UNTIL' expression -> ^(LOOP_STATEMENT ^(KEYWORD 'REPEAT') ^(BLOCK_SCOPE statementSequence) ^(KEYWORD 'UNTIL') ^( CONDITION expression))
	;

// PIM 3 Appendix 1 lines 70-71

forStatement :
	'FOR' ident ':=' expression 'TO' expression ( 'BY' constExpression )?
	'DO' statementSequence 'END'
	-> ^(LOOP_STATEMENT ^(KEYWORD 'FOR') ^(INIT ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR ':=' ^(NAME ident) ^(VALUE expression) ))) ^(CONDITION  ^(COMPARISON_OPERATOR 'TO') expression) ^(STEP (^(ASSIGNMENT_STATEMENT ^(OPERATOR 'BY') constExpression))?)
	^(KEYWORD 'DO') ^(BLOCK_SCOPE statementSequence) ^(KEYWORD 'END'))
	;

// PIM 3 Appendix 1 line 72

loopStatement :
	'LOOP' statementSequence 'END' -> ^(LOOP_STATEMENT ^(KEYWORD  'LOOP') ^(BLOCK_SCOPE statementSequence) ^(KEYWORD 'END'))
	;

// PIM 3 Appendix 1 line 73

withStatement :
	'WITH' qualident designatorTails? 'DO' statementSequence 'END' -> ^(KEYWORD 'WITH') qualident designatorTails? ^(KEYWORD 'DO') ^(BLOCK_SCOPE statementSequence) ^(KEYWORD 'END')
	;

// PIM 3 Appendix 1 line 74

// Milos, 16 jul 2012, removed ^
// Milos, 16 jul 2012, procDeclaration and procBlock introduced, to distinguish between local and global variables
// Milos, 25 jul 2012, TYPE VOID for PROCEDURES, empty FORMAL_PARAM_LIST for procedures wo parameters
procedureDeclaration :
	'PROCEDURE' ident  ';' (( procDeclaration* procBlock ident) | FORWARD) 
	-> ^(FUNCTION_DECL ^(NAME ident) ^(TYPE VOID) ^(FORMAL_PARAM_LIST) ^(BLOCK_SCOPE procDeclaration* procBlock))
	|	
	'PROCEDURE' 
	ident 
	(     '(' 
	            ( procParams ( ';' procParams)* )? 
	      ')' 
	      ( ':' ident ( '.' ident )* ) 
	) 
	';' 
	(( procDeclaration* procBlock ident) | FORWARD) 
	-> ^(FUNCTION_DECL ^(NAME ident) ^(TYPE ident ^(SEPARATOR '.' ident )*) ^(FORMAL_PARAM_LIST procParams*) ^(BLOCK_SCOPE procDeclaration* procBlock))
	|
	'PROCEDURE' 
	ident 
	(     '(' 
	            ( procParams ( ';' procParams)* )? 
	      ')' 
	)? 
	';' 
	(( procDeclaration* procBlock ident) | FORWARD) 
	-> ^(FUNCTION_DECL ^(NAME ident) ^(TYPE VOID) ^(FORMAL_PARAM_LIST procParams*) ^(BLOCK_SCOPE procDeclaration* procBlock))
	;
	
procParams
	: ( 'VAR' )? ident ( ',' ident )* ':' formalType
	-> (^(PARAMETER_DECL  ^(NAME ident) formalType))* 	
	;

// Milos, 16 jul 2012, special declaration section for procedures
// IMPORTANT: ignore procedures, modules, type declarations and const declarations inside procedure	
procDeclaration :
	CONST_ ( constantDeclaration ';' )*  -> IGNORE |
       	'TYPE' ( typeDeclaration ';' )*  -> IGNORE |
	'VAR' ( localVariableDeclaration ';' )*  -> localVariableDeclaration*|
	procedureDeclaration ';' -> IGNORE | 
	moduleDeclaration ';' -> IGNORE	
	;
	
// Milos, 16 jul 2012, new production procedure block
procBlock 
	: ( 'BEGIN' statementSequence )? 'END' -> ( 'BEGIN' statementSequence )? 'END'	
	;
	
// Milos, 16 jul 2012, new production localVariableDeclaration
localVariableDeclaration
	: ident machineAddress? ( ',' ident machineAddress?)* ':' type 
	  -> (^(VAR_DECL ^(NAME ident) type))*	
	;

// Milos, 16 jul 2012, (declaration)* out of BLOCK_SCOPE tree
block :
	( declaration )*
	( 'BEGIN' statementSequence )? 'END' -> ( declaration )* ^(BLOCK_SCOPE  ( 'BEGIN' statementSequence )? 'END')
	;


// GLOBALNO
// Milos, 16 jul 2012, TYPE_DECL moved to typeDeclaration production
// Milos, 16 jul 2012, VAR_DECL moved to variableDeclaration
declaration :
	CONST_ ( constantDeclaration ';' )* -> (constantDeclaration)*  |
	'TYPE' ( typeDeclaration ';' )*  -> ( typeDeclaration )*  |
	'VAR' ( variableDeclaration ';' )* -> ( variableDeclaration )* |
	procedureDeclaration ';' -> procedureDeclaration |
	moduleDeclaration ';' -> moduleDeclaration //-> ^( CONCRETE_UNIT_DECL moduleDeclaration) 
	;


// TODO: local module
moduleDeclaration :
	'MODULE' ident ( priority )? ';' ( importList )* ( export )* block ident
	-> ^(CONCRETE_UNIT_DECL ^(NAME ident) importList* block)
	;

// PIM 3 Appendix 1 line87

priority :
	'[' constExpression ']' 
	;

// Milos, 16 jun 2012, new importList production
importList :
          'FROM' mn=ident 'IMPORT' importIdentList[$mn.tree] ';' -> importIdentList   
        | 'IMPORT' ident ( ',' ident )* ';' -> (^(IMPORT_DECL ^(NAME ident)))*
	;

importIdentList[CommonTree mn] 
	:	ident (',' ident)* -> (^(IMPORT_DECL ^(NAME {$mn} DOT ident)))* 
	;
// PIM 3 Appendix 1 lines 90-91

definitionModule :
                     'MODULE' ident ( priority )? ';' ( importList )* (export)* ( definition )* 'END' ident '.' 
                     -> ^(INTERFACE_UNIT_DECL ^(NAME M2IF_ ident)   ( importList )*  ( definition )* )
                     ;

// PIM 3 Appendix 1 lines 92-95

// Milos, 16 jul 2012, declarations moved to appropriate productions
// THIS PRODUCTION I SUSED ONLY IN DEFINITION MODULE
definition :
	CONST_ ( constantDeclaration ';' )* -> constantDeclaration*  |
	'TYPE' ( defModTypeDeclaration ';' )* -> defModTypeDeclaration* |
	'VAR' ( variableDeclaration ';')* -> variableDeclaration* |
	procedureHeading -> procedureHeading
	;


// Milos, 30 jul 2012, old procedureHeading
/*	
procedureHeading :
	'PROCEDURE' ident ( formalParameters )? 
	;

formalParameters :
	'(' ( fpSection ( ';'^ fpSection )* )? ')' ( ':'^ qualident )?
	;

// PIM 3 Appendix 1 line 83

fpSection :
	( 'VAR' )? identList ':' formalType
	;
*/
// PIM 3 Appendix 1 line 84


// Milos, 30 jul 2012, new procedureHeading
procedureHeading :
	'PROCEDURE' ident ';'
	-> ^(FUNCTION_DECL ^(NAME ident) ^(TYPE VOID) ^(FORMAL_PARAM_LIST))
	|	
	'PROCEDURE' 
	ident 
	(     '(' 
	            ( procParams ( ';' procParams)* )? 
	      ')' 
	      ( ':' ident ( '.' ident )* ) 
	) 
	';'
	-> ^(FUNCTION_DECL ^(NAME ident) ^(TYPE ident ^(SEPARATOR '.' ident )*) ^(FORMAL_PARAM_LIST procParams*))
	|
	'PROCEDURE' 
	ident 
	(     '(' 
	            ( procParams ( ';' procParams)* )? 
	      ')' 
	)? 
	';'
	-> ^(FUNCTION_DECL ^(NAME ident) ^(TYPE VOID) ^(FORMAL_PARAM_LIST procParams*))
	;

formalType :
	( 'ARRAY' 'OF' )? qualident
                      -> ^(TYPE ( 'ARRAY' 'OF' )? qualident)
	;


// PIM 3 Appendix 1 lines 96-97

// Milos, 16 jul 2012, CONCRETE_UNIT_DECL integration
programModule :
	'MODULE' ident ( priority )? ';'( importList )* (export)*  block ident '.' 
	-> ^(CONCRETE_UNIT_DECL ^(NAME ident) (importList)* block )
	| 'IMPLEMENTATION' 'MODULE' ident ( priority )? ';'( importList )* (export)*  block ident '.' 
	-> ^(CONCRETE_UNIT_DECL ^(NAME ident) ^(IMPLEMENTS ^(TYPE ^(NAME M2IF_ ident))) (importList)* block)
	;

// Milos, 16 jul 2012, resolved bug with DEFINITION module
// Milos, 16 jul 2012, CONCRETE_UNIT_DECL moved to programModule production
// Milos, 30 jul 2012, definition module name moved to definitionModule production
startNonterminal : 	
	 ( 'DEFINITION' | 'FOREIGN') /* 'MODULE' ident ( priority )? ';' */ definitionModule  -> ^(COMPILATION_UNIT definitionModule)
	| programModule                                          -> ^(COMPILATION_UNIT programModule)
	;

// Milos, 20 jul 2012, machine address production
machineAddress 
	: '[' constExpression ']'
	;

// Milos, 30 jul 2012, export list syntax added
// 1.6 Export 
export:
	'EXPORT' ('QUALIFIED')? identifier_list ';'
	;

identifier_list :
	ident ( ',' ident )*
	;
// ---------------------------------------------------------------------------
// L E X E R   G R A M M A R
// ---------------------------------------------------------------------------

// PIM 3 Appendix 1 line 1

 

// Milos, 20 jul 2012, added underscore
IDENT :	LETTER ( LETTER | DIGIT | '_')* ;

// PIM 3 Appendix 1 lines 3-4

INTEGER :
	DIGIT ( DIGIT )* |
	OCTAL_DIGIT ( OCTAL_DIGIT )* ( 'B' | 'C' ) |
	DIGIT ( HEX_DIGIT )* 'H'
	;

// PIM 3 Appendix 1 line 5

// Milos, 21 jul, bug ARRAY[1..100] fixed 
REAL :
	//DIGIT ( DIGIT )* '.' ( DIGIT )* ( SCALE_FACTOR )?
	(INTEGER DOTDOT) => INTEGER DOTDOT {$type = INTEGER;}
	| DIGIT ( DIGIT )* '.' ( DIGIT )* ( SCALE_FACTOR )?
	;

// PIM 3 Appendix 1 line 10

// Milos, 22 jul 2012, bug '"' fixed
STRING :
	'\'' ( CHARACTER | '"' )* '\'' | '"' ( CHARACTER | '\'')* '"'
	;

// Milos, 20 jul, 2012, nested comments support
COMMENT
    :   '(*' 
        (options {greedy=false;} : (COMMENT | .))* 
        '*)'
            {
            	skip();
            }
    ;

// old comment
//COMMENT :	
//	'(*' ( options { greedy = false; } : . )* COMMENT  '*)'
//	{ $channel = HIDDEN; }
//	;

WHITESPACE :
	( ' ' | '\t' | '\u000C' | '\r' | '\n') 
	{ $channel = HIDDEN; }
	;

// letter remains undefined in PIM 3

fragment
LETTER : 'A' .. 'Z' | 'a' .. 'z' ;

// PIM 3 Appendix 1 line 11

fragment
DIGIT :	OCTAL_DIGIT | '8' | '9' ;

// PIM 3 Appendix 1 line 9

fragment
OCTAL_DIGIT : '0' .. '7' ;

// PIM 3 Appendix 1 line 7

fragment
HEX_DIGIT : DIGIT | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' ;

// PIM 3 Appendix 1 line 6

fragment
SCALE_FACTOR :
	'E' ( '+' | '-' )? DIGIT ( DIGIT )*
	;

// character remains undefined in PIM 3
fragment
CHARACTER :
	// any printable characters other than single and double quote
	' ' | '!' | '#' .. '&' | '(' .. '~'
	;

// END OF FILE
