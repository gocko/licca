/** ANSI C ANTLR v3 grammar

Translated from Jutta Degener's 1995 ANSI C yacc grammar by Terence Parr
July 2006.  The lexical rules were taken from the Java grammar.

Jutta says: "In 1985, Jeff Lee published his Yacc grammar (which
is accompanied by a matching Lex specification) for the April 30, 1985 draft
version of the ANSI C standard.  Tom Stockfisch reposted it to net.sources in
1987; that original, as mentioned in the answer to question 17.25 of the
comp.lang.c FAQ, can be ftp'ed from ftp.uu.net,
   file usenet/net.sources/ansi.c.grammar.Z.
I intend to keep this version as close to the current C Standard grammar as
possible; please let me know if you discover discrepancies. Jutta Degener, 1995"

Generally speaking, you need symbol table info to parse C; typedefs
define types and then IDENTIFIERS are either types or plain IDs.  I'm doing
the min necessary here tracking only type names.  This is a good example
of the global scope (called Symbols).  Every rule that declares its usage
of Symbols pushes a new copy on the stack effectively creating a new
symbol scope.  Also note rule declaration declares a rule scope that
lets any invoked rule see isTypedef boolean.  It's much easier than
passing that info down as parameters.  Very clean.  Rule
direct_declarator can then easily determine whether the IDENTIFIER
should be declared as a type name.

I have only tested this on a single file, though it is 3500 lines.

This grammar requires ANTLR v3.0.1 or higher.

Terence Parr
July 2006
*/

/*
TODO:
	- ASM statement.
	- Ugnjezdene funkcije.
	- Ukloniti cvor MAIN_BLOCK_SCOPE.

NOTE:
U C-u je moguc nacin deklaracije parametara (K&R style):

  void f(a, b)
    int a;
    int b;
  {
    ...
  }
Lista ovakvih deklaracija je oznacena sa FORMAL_PARAM_LIST a pojedini
parametri unutar liste sa PARAMETER_DECL. 
*/

grammar CLang;
options {
    backtrack=true;
    memoize=true;
    k=2;
    output = AST;
	ASTLabelType = CommonTree;
}

tokens {
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
	TYPE;
	NAME;

	EXTENDS;
	CLASS_FIELDS;
  ASSIGNMENT_STATEMENT;
  ASSIGN_OPERATOR;
	COMPILATION_UNIT;
	MAIN_BLOCK;
	CONDITION;
	BRANCH_STATEMENT;
	BRANCH;
	JUMP_STATEMENT;
	LOOP_STATEMENT;
	INIT;
	STEP;
	LOGICAL_OPERATOR;

	CONST;
	KEYWORD;
	SEPARATOR;
	OPERATOR;
	COMPARISON_OPERATOR;
	BUILTIN_TYPE;
	VALUE;
}

scope Symbols {
	Set types; // only track types in order to get parser working
}

@header {
	package Languages.c;
	import java.util.Set;
	import java.util.HashSet;
}

@members {
	String currentFunctionName = "";
	boolean isTypeName(String name) {
		for (int i = Symbols_stack.size()-1; i>=0; i--) {
			Symbols_scope scope = (Symbols_scope)Symbols_stack.get(i);
			if ( scope.types.contains(name) ) {
				return true;
			}
		}
		return false;
	}
}

@lexer::header {
	package Languages.c;
}

translation_unit
scope Symbols; // entire file is a scope
@init {
  $Symbols::types = new HashSet();
}
	: external_declaration+
	-> ^( COMPILATION_UNIT ^( PACKAGE_DECL external_declaration+ ) )
	;
 
/** Either a function definition or any other kind of C decl/def.
 *  The LL(*) analysis algorithm fails to deal with this due to
 *  recursion in the declarator rules.  I'm putting in a
 *  manual predicate here so that we don't backtrack over
 *  the entire function.  Further, you get a better error
 *  as errors within the function itself don't make it fail
 *  to predict that it's a function.  Weird errors previously.
 *  Remember: the goal is to avoid backtrack like the plague
 *  because it makes debugging, actions, and errors harder.
 *
 *  Note that k=1 results in a much smaller predictor for the 
 *  fixed lookahead; k=2 made a few extra thousand lines. ;)
 *  I'll have to optimize that in the future.
 */
external_declaration
options {k=1;}
	:	( declaration_specifiers? declarator declaration* '{' )=> function_definition
	|	declaration
	;

function_definition
scope {
	boolean isFuncDef;
}
scope Symbols; // put parameters and locals into same scope for now
@init {
	$Symbols::types = new HashSet();
	$function_definition::isFuncDef = true;
}
	:	declaration_specifiers? declarator funcBody
		-> ^( FUNCTION_DECL declaration_specifiers? declarator funcBody )
	;

funcBody
	:	parameter_declaration_KAndR+ compound_statement	// K&R style
		-> ^( FORMAL_PARAM_LIST parameter_declaration_KAndR+ ) ^(BLOCK_SCOPE compound_statement)
	|	compound_statement		-> ^(BLOCK_SCOPE compound_statement)	// ANSI style
	;

/*funcBody
	:	parameter_declaration_KAndR+ main_or_compound	// K&R style
		-> ^( FORMAL_PARAM_LIST parameter_declaration_KAndR+ ) main_or_compound
	|	main_or_compound				// ANSI style
	;

main_or_compound
	:   {currentFunctionName.equals("main")}? main_block
	|	compound_statement
	;

main_block
scope Symbols; // blocks have a scope of symbols
@init {
  $Symbols::types = new HashSet();
}
	:	lbrace external_declaration* statement* rbrace
		-> ^( MAIN_BLOCK lbrace external_declaration* statement* rbrace )
	;*/


parameter_declaration_KAndR
	:	declaration_specifiers init_declarator_list? semi
		-> ^( PARAMETER_DECL declaration_specifiers init_declarator_list? semi )
	;

declaration
scope {
  boolean isTypedef;
}
@init {
  $declaration::isTypedef = false;
}
	:	'typedef' ( storage_class_specifier_h | type_specifier_s | type_qualifier_h )+ {$declaration::isTypedef=true;}
		init_declarator_list semi // special case, looking for typedef
	|	attribute_spec* declaration_specifiers init_declarator_list? semi
		-> attribute_spec* ^( VAR_DECL declaration_specifiers init_declarator_list? semi )
	;

declaration_specifiers
	:	(   storage_class_specifier_h
		|   type_specifier_s
		|   type_qualifier_h
		|	function_specifier_h
		)+
	;

assignOp	: '=' ;//-> ^( ASSIGN_OPERATOR '=' ) ;
comma		: ',' -> ^( SEPARATOR ',' ) ;
colon		: ':' -> ^( SEPARATOR ':' ) ;
semi		: ';' -> ^( SEPARATOR ';' ) ;
lpar		: '(' -> ^( SEPARATOR '(' ) ;
rpar		: ')' -> ^( SEPARATOR ')' ) ;
lbrack		: '[' -> ^( SEPARATOR '[' ) ;
rbrack		: ']' -> ^( SEPARATOR ']' ) ;
lbrace		: '{' -> ^( SEPARATOR '{' ) ;
rbrace		: '}' -> ^( SEPARATOR '}' ) ;

init_declarator_list
	:	init_declarator ( comma init_declarator )*
	;

init_declarator
	:	declarator ( 
	attributes_or_asm* -> declarator attributes_or_asm*
	|	assignOp initializer attributes_or_asm* -> ^(ASSIGNMENT_STATEMENT   ^( ASSIGN_OPERATOR assignOp declarator ^(VALUE initializer) attributes_or_asm*) )
	)	;

storage_class_specifier_h
	:	storage_class_specifier -> ^( KEYWORD storage_class_specifier )
	;

storage_class_specifier
	:	'extern'
	|	'static'
	|	'auto'
	|	'register'
	;

type_specifier_s
	:	type_specifier_h -> ^( TYPE type_specifier_h )
	;
	

type_specifier_h
	:	type_specifier -> ^( TYPE type_specifier )
	|	struct_or_union_specifier
	|	enum_specifier
	|	type_id
	;

type_specifier
	:	'void'
	|	'char'
	|	'short'
	|	'int'
	|	'long'
	|	'float'
	|	'double'
	|	'signed'
	|	'unsigned'
	|	'uint8_t'
	|	'int8_t'
	|	'uint16_t'
	|	'int16_t'
	|	'uint32_t'
	|	'int32_t'
	|	'uint64_t'
	|	'int64_t'
//	|	'va_list'
	|	'__builtin_va_list'
	;

type_id
//	:	IDENTIFIER
//		-> ^( NAME IDENTIFIER )
	:	{isTypeName(input.LT(1).getText())}? IDENTIFIER
//    	{System.out.println($IDENTIFIER.text+" is a type");}
	;

struct_or_union_specifier
options {k=3;}
scope Symbols; // structs are scopes
@init {
	$Symbols::types = new HashSet();
}
	: struct_or_union_h identifier? lbrace struct_declaration* rbrace
	| struct_or_union_h identifier
	;

struct_or_union_h
	:	struct_or_union -> ^( KEYWORD struct_or_union )
	;

struct_or_union
	:	'struct'
	|	'union'
	;

/*struct_declaration_list
	:	struct_declaration+
	;*/

struct_declaration
	:	specifier_qualifier_list struct_declarator_list semi
	;

specifier_qualifier_list
	:	( type_qualifier_h | type_specifier_s )+
	;

struct_declarator_list
	:	struct_declarator ( comma struct_declarator )*
	;

struct_declarator
	:	declarator ( colon constant_expression)?
	|	colon constant_expression
	;

enumKw : 'enum' -> ^( KEYWORD 'enum' ) ;

enum_specifier
options {k=3;}
	:	enumKw lbrace enumerator_list rbrace
	|	enumKw identifier lbrace enumerator_list rbrace
	|	enumKw identifier
	;

enumerator_list
	:	enumerator ( comma enumerator )*
	;

enumerator
	:	identifier ( assignOp constant_expression )? -> ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR assignOp identifier ^(VALUE constant_expression)))
	;

type_qualifier_h
	:	type_qualifier -> ^( KEYWORD type_qualifier )
	;

type_qualifier
	:	'const'
	|	'volatile'
	;

function_specifier_h
	:	function_specifier -> ^( KEYWORD function_specifier )
	;

function_specifier
	:	'noreturn'
	|	'inline'
	;

declarator
	:	attribute_spec* pointer? direct_declarator attribute_spec*
	|	attribute_spec* pointer attribute_spec*
	;

direct_declarator_ident
	:	IDENTIFIER
			{
				if ($declaration.size() > 0 && $declaration::isTypedef) {
					$Symbols::types.add($IDENTIFIER.text);
					//System.out.println("define type " + $IDENTIFIER.text);
				} else if ($function_definition.size() > 0 && $function_definition::isFuncDef) {
					currentFunctionName = $IDENTIFIER.text;
					//System.out.println("current function name is " + $IDENTIFIER.text);
				}
			}
		-> ^( NAME IDENTIFIER )
	;

direct_declarator
	:   ( direct_declarator_ident | lpar declarator rpar ) declarator_suffix*
	;

declarator_suffix
	:   lbrack constant_expression rbrack
    |   lbrack rbrack
    |   lpar parameter_type_list rpar
    |   lpar identifier_list rpar
    |   lpar rpar
	;

timesOp : '*' -> ^( OPERATOR '*' ) ;

pointer
	: timesOp type_qualifier_h+ pointer?
	| timesOp pointer
	| timesOp
	;

dotsOp : '...' -> ^( OPERATOR '...' ) ;

parameter_type_list
	:	parameter_list ( comma dotsOp )?
	;

parameter_list
	:	attribute_spec* parameter_declaration ( comma parameter_declaration )*
		-> attribute_spec* ^( FORMAL_PARAM_LIST ^( PARAMETER_DECL parameter_declaration )
		   ( comma ^( PARAMETER_DECL parameter_declaration ) )* )
	;

parameter_declaration
	:	declaration_specifiers (declarator | abstract_declarator )*
	;

identifier_list
	:	identifier ( comma identifier )*
	;

type_name
	:	specifier_qualifier_list abstract_declarator?
	;

abstract_declarator
	:	pointer direct_abstract_declarator?
	|	direct_abstract_declarator
	;

direct_abstract_declarator
	:	( lpar abstract_declarator rpar | abstract_declarator_suffix ) abstract_declarator_suffix*
	;

abstract_declarator_suffix
	:	lbrack rbrack
	|	lbrack constant_expression rbrack
	|	lpar rpar
	|	lpar parameter_type_list rpar
	;

initializer
	:	assignment_expression
	|	lbrace initializer_list comma? rbrace
	;

initializer_list
	:	initializer ( comma initializer )*
	;

// E x p r e s s i o n s

argument_expression_list
	:	assignment_expression ( comma assignment_expression )*
		-> ^( ARGUMENT assignment_expression ) ( comma ^( ARGUMENT assignment_expression ) )*
	;

plusOp	: '+' -> ^( OPERATOR '+' ) ;
minusOp : '-' -> ^( OPERATOR '-' ) ;
multOp	: '*' -> ^( OPERATOR '*' ) ;
divOp	: '/' -> ^( OPERATOR '/' ) ;
modOp	: '%' -> ^( OPERATOR '%' ) ;

multiplicative_op
  : multOp | divOp | modOp
  ;
  
additive_op
  : plusOp | minusOp
  ;
  
additive_expression
	:	 multiplicative_expression (additive_op^  multiplicative_expression )*
//		-> (plusOp? minusOp? multiplicative_expression)*
	;

multiplicative_expression
	:	(cast_expression) (multiplicative_op^  cast_expression )*
	//->  modOp? cast_expression (multOp? divOp?  modOp? cast_expression)*
	;

cast_expression
	:	lpar type_name rpar cast_expression
	|	unary_expression
	;

incOp		: '++' 		-> ^( OPERATOR '++' ) ;
decOp		: '--' 		-> ^( OPERATOR '--' ) ;
sizeofOp	: 'sizeof' 	-> ^( OPERATOR 'sizeof' ) ;

unary_expression
	:	postfix_expression
	|	primary_expression ( lpar rpar )*
		-> ^( FUNCTION_CALL primary_expression ^( ARGUMENT_LIST ( lpar rpar )* ) )
    |   primary_expression ( lpar argument_expression_list rpar )*
    	-> ^( FUNCTION_CALL primary_expression ^( ARGUMENT_LIST ( lpar argument_expression_list rpar )* ) )
	|	incOp unary_expression -> ^(ASSIGNMENT_STATEMENT incOp unary_expression)
	|	decOp unary_expression -> ^(ASSIGNMENT_STATEMENT decOp unary_expression)
	|	unary_operator_h cast_expression
	|	sizeofOp unary_expression
	|	sizeofOp lpar type_name rpar
	//|	attribute_spec // Is this right place ???
	;

dotOp : '.' -> ^( OPERATOR '.' ) ;
ptrOp : '->' -> ^( OPERATOR '->' ) ;

postfix_expression
	:   primary_expression ( -> primary_expression 
	|  postfix_expression_opts[$primary_expression.tree]? -> postfix_expression_opts
	)
;    

postfix_expression_opts[CommonTree primary_expression]
  : incOp postfix_expression_sufix* -> ^( ASSIGNMENT_STATEMENT {$primary_expression} incOp postfix_expression_sufix*)
        |  decOp postfix_expression_sufix* -> ^(ASSIGNMENT_STATEMENT {$primary_expression} decOp postfix_expression_sufix*) 
        |  (lpar rpar) postfix_expression_sufix* -> {$primary_expression} lpar rpar postfix_expression_sufix*
        |  (lpar argument_expression_list rpar) postfix_expression_sufix* -> ^( FUNCTION_CALL {$primary_expression} ^( ARGUMENT_LIST ( lpar argument_expression_list rpar )* ) postfix_expression_sufix* )
         //-> {$primary_expression} lpar argument_expression_list rpar postfix_expression_sufix*
        |  (dotOp identifier) postfix_expression_sufix* ->  {$primary_expression} ^(dotOp identifier) postfix_expression_sufix*
        |  (ptrOp identifier) postfix_expression_sufix* -> {$primary_expression} ^(ptrOp identifier) postfix_expression_sufix*     
        |  (lbrack expression rbrack) postfix_expression_sufix* -> {$primary_expression} lbrack expression rbrack postfix_expression_sufix*
 ;
    

postfix_expression_sufix        
  :    lbrack expression rbrack
        |   lpar rpar
        |   lpar argument_expression_list rpar
        |   dotOp identifier
        |   ptrOp identifier
        |   incOp 
        |   decOp 
  ;

unary_operator_h
	:	unary_operator -> ^( OPERATOR unary_operator )
	;

unary_operator
	:	'&'
	|	'*'
	|	'+'
	|	'-'
	|	'~'
	|	'!'
	;

primary_expression
	:	identifier
	|	constant_h
	|	type_specifier_h
	|	lpar expression rpar
	;

constant_h
	:	constant -> ^( CONST constant )
	;

/*
NOTE: gnu_long_int and gnu_long_int_string are merged into CHARACTER_LITERAL
and STRING_LITERAL respectively.
*/
constant
    :   HEX_LITERAL
    |   OCTAL_LITERAL
    |   DECIMAL_LITERAL
    |	CHARACTER_LITERAL
	|	STRING_LITERAL
    |   FLOATING_POINT_LITERAL
//    |	gnu_long_int
//    |	gnu_long_int_string
    ;

/*gnu_long_int
	:	GNU_LONG_INT_LIT
	;

gnu_long_int_string
	:	GNU_LONG_INT_STRING_LIT
	;*/

decimal_lit
	:	DECIMAL_LITERAL
		-> ^( CONST DECIMAL_LITERAL )
	;

/////

expression
	:	assignment_expression ( comma assignment_expression)*
	;

constant_expression
	:	conditional_expression
	;

assignment_expression
	:	lvalue assignment_operator assignment_expression -> ^(ASSIGNMENT_STATEMENT  ^( ASSIGN_OPERATOR  assignment_operator  lvalue ^(VALUE assignment_expression) ))
	|	conditional_expression
	;

lvalue
	:	unary_expression
	;

assignment_operator_h
	:	assignment_operator -> ^( ASSIGN_OPERATOR  assignment_operator )
	;

assignment_operator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'&='
	|	'^='
	|	'|='
	;

conditional_expression
	:	logical_or_expression ( qMarkSep expression colon conditional_expression)?
	;

qMarkSep	: '?' -> ^( OPERATOR '?' ) ;
logOpOr		: '||' -> ^( LOGICAL_OPERATOR /*^( OPERATOR */'||' )  ;
logOpAnd	: '&&' -> ^( LOGICAL_OPERATOR /*^( OPERATOR */'&&' )  ;
orOp		: '|' -> ^( OPERATOR '|' ) ;
andOp		: '&' -> ^( OPERATOR '&' ) ;
xorOp		: '^' -> ^( OPERATOR '^' ) ;
eqOp		: '==' -> ^( COMPARISON_OPERATOR '==' ) ;
neOp		: '!=' -> ^( COMPARISON_OPERATOR '!=' ) ;
lssOp		: '<' -> ^( COMPARISON_OPERATOR '<' ) ;
gtrOp		: '>' -> ^( COMPARISON_OPERATOR '>' ) ;
leqOp		: '<=' -> ^( COMPARISON_OPERATOR '<=' ) ;
geqOp		: '>=' -> ^( COMPARISON_OPERATOR '>=' ) ;
shlOp		: '<<' -> ^( OPERATOR '<<' ) ;
shrOp		: '>>' -> ^( OPERATOR '>>' ) ;

relational_op
  : lssOp | gtrOp | leqOp | geqOp 
  ;
  
equality_op
  : eqOp | neOp 
  ;


logical_or_expression
	:	logical_and_expression ( logOpOr^ logical_and_expression )*
	;

logical_and_expression
	:	inclusive_or_expression ( logOpAnd^ inclusive_or_expression )*
	;

inclusive_or_expression
	:	exclusive_or_expression ( orOp^ exclusive_or_expression )*
	;

exclusive_or_expression
	:	and_expression ( xorOp^ and_expression )*
	;

and_expression
	:	equality_expression ( andOp^ equality_expression )* 
	;

equality_expression
	:	relational_expression ( equality_op^ relational_expression )* 
	;

relational_expression
	:	shift_expression ( relational_op^ shift_expression )*
	;

shift_expression
	:	additive_expression ( ( shlOp | shrOp )^ additive_expression )*
	;

// S t a t e m e n t s

statement
	:	labeled_statement
	|	compound_statement
	|	expression_statement
	|	selection_statement		-> ^( BRANCH_STATEMENT selection_statement )
	|	iteration_statement		-> ^( LOOP_STATEMENT iteration_statement )
	|	jump_statement 			-> ^( JUMP_STATEMENT jump_statement )
	|	asm_statement
	;

string_lit
	:	STRING_LITERAL
		-> ^( CONST STRING_LITERAL )
	;

asm_statement
	:	asm_or_cv+ lpar string_lit asm_output_operands? asm_input_operands? asm_clobbered_registers? rpar
	;

asm_output_operands
	:	colon ( asm_operand ( comma asm_operand )* )?
	;

asm_input_operands
	:	colon ( asm_operand ( comma asm_operand )* )?
	;

asm_operand
	:	string_lit lpar expression rpar
	;

asm_clobbered_registers
	:	colon ( string_lit ( comma string_lit )* )?
	;

asm_or_cv_kw
	:	asm_or_cv
		-> ^( KEYWORD asm_or_cv )
	;

asm_or_cv
	:	'__asm__'
	|	'asm'
	|	'asm__'
	|	'__asm'
	|	cv_qualifier
	;

cv_qualifier
	:	'const'
	|	'volatile'
	|	'__const'
	|	'__const__'
	|	'const__'
	|	'__volatile__'
	|	'__volatile'
	|	'volatile__'
	;

identifier
	:	IDENTIFIER -> ^( NAME IDENTIFIER )
	;

labeled_statement
	:	identifier colon statement

	|	'case' constant_expression colon statement
		-> ^( KEYWORD 'case' ) constant_expression colon ^(BLOCK_SCOPE statement)

	|	'default' colon statement
		-> ^( KEYWORD 'default' ) colon ^(BLOCK_SCOPE statement)
	;

compound_statement
scope Symbols; // blocks have a scope of symbols
@init {
  $Symbols::types = new HashSet();
}
	:	lbrace external_declaration* statement* rbrace
		//-> ^( BLOCK_SCOPE lbrace external_declaration* statement* rbrace )
	;

//statement_list
//	:	statement+
//	;

expression_statement
	:	semi
	|	expression semi
	;

selection_statement
	:	'if' lpar expression rpar statement (options {k=1; backtrack=false;}:'else' statement )?
		->^( BRANCH  ^( KEYWORD 'if' ) lpar ^( CONDITION expression ) rpar ^(BLOCK_SCOPE statement )) 
		   ^( BRANCH ^( KEYWORD 'else' ) ^(BLOCK_SCOPE statement) )?

	|	'switch' lpar expression rpar statement
		-> ^( KEYWORD 'switch' ) lpar ^( CONDITION expression ) rpar
		   ^( BRANCH ^(BLOCK_SCOPE statement) )
	;

iteration_statement
	:	'while' lpar expression rpar statement
		-> ^( KEYWORD 'while' ) lpar ^( CONDITION expression ) rpar ^(BLOCK_SCOPE statement)

	|	'do' statement 'while' lpar expression rpar semi
		-> ^( KEYWORD 'do' ) ^(BLOCK_SCOPE statement)
		   ^( KEYWORD 'while' ) lpar ^( CONDITION expression ) rpar semi

	|	'for' lpar expression_statement expression_statement expression? rpar statement
		-> ^( KEYWORD 'for' ) lpar ^( INIT expression_statement)
		   ^( CONDITION expression_statement)  ^(STEP expression)? rpar ^(BLOCK_SCOPE statement)
	;

jump_statement
	:	'goto' identifier semi
		-> ^( KEYWORD 'goto' ) identifier semi

	|	'continue' semi
		-> ^( KEYWORD 'continue' ) semi

	|	'break' semi
		-> ^( KEYWORD 'break' ) semi

	|	'return' semi
		-> ^( KEYWORD 'return' ) semi

	|	'return' expression semi
		-> ^( KEYWORD 'return' ) expression semi
	;

attributes_or_asm
	:	attribute_spec
//	|	asm_spec
	;

attribute_name
	:	'__attribute__'
		-> ^( '__attribute__' )
	;

attribute_spec
	:	attribute_name lpar lpar attribute_extension ( comma attribute_extension )* rpar rpar
	;

/*
attribute_extension:
x       attribute_alias "(" string ")"
x       attribute_aligned
x       attribute_aligned "(" tagged_attribute_number ")"
?       attribute_aligned "(" alignof_expression ")"
x       attribute_always_inline
x       attribute_cdecl
x       attribute_cleanup "(" tagged_attribute_id ")"
x       attribute_const
x       attribute_constructor
x       attribute_deprecated
x       attribute_destructor
x       attribute_dllexport
x       attribute_dllimport
x       attribute_eightbit
        attribute_exception "(" exception_function {exception_arg ","}* ")"
        attribute_far
        attribute_funvector
x       attribute_format "(" format_archetype "," tagged_attribute_number "," tagged_attribute_number ")"
        attribute_format_arg "(" tagged_attribute_number ")"
        attribute_interrupt
        attribute_interrupt "(" string ")"
        attribute_interrupt_handler
        attribute_interrupt_handler "(" string ")"
        attribute_longcall
        attribute_long_call
x       attribute_malloc
        attribute_may_alias
x       attribute_mode "(" tagged_attribute_id ")"
        attribute_model "(" attribute_model_name ")"
        attribute_naked
        attribute_near
        attribute_no_check_mem
        attribute_no_instrument
        attribute_nocommon
x       attribute_noinline
x       attribute_nonnull
x       attribute_nonnull "(" tagged_attribute_number+ ")"
x       attribute_noreturn
x       attribute_nothrow
        attribute_packed
x       attribute_pure
        attribute_regparm "(" tagged_attribute_number ")"
        attribute_section "(" string ")"
        attribute_shared
        attribute_short_call
        attribute_signal "(" string ")"
        attribute_sp_switch "(" string ")"
        attribute_stdcall
        attribute_tiny
        attribute_tls_model "(" tls_model_type ")"
x       attribute_trans_union
        attribute_trap_exit "(" tagged_attribute_number ")"
x       attribute_used
x       attribute_unused
x       attribute_vector_size "(" tagged_attribute_number ")"
x       attribute_visibility "(" visibility_type ")"
x       attribute_weak
*/

attribute_extension
	:	attribute_alias_nm lpar string_lit rpar
//	|	attribute_aligned ( '(' decimal_lit | alignof_expression ')' )?
	|	attribute_aligned_nm ( lpar decimal_lit rpar )?
	|	attribute_always_inline_nm
	|	attribute_cdecl_nm
	|	attribute_cleanup_nm lpar identifier rpar
	|	attribute_const_nm
	|	attribute_constructor_nm
	|	attribute_deprecated_nm
	|	attribute_destructor_nm
	|	attribute_dllexport_nm
	|	attribute_dllimport_nm
	|	attribute_eightbit_nm
	|	attribute_format_nm lpar format_archetype comma decimal_lit comma decimal_lit rpar
	|	attribute_leaf_nm
	|	attribute_malloc_nm
	|	attribute_mode_nm lpar identifier rpar
	|	attribute_noinline_nm
	|	attribute_noreturn_nm
	|	attribute_used_nm
	|	attribute_unused_nm
	|	attribute_nonnull_nm ( lpar decimal_lit ( comma decimal_lit )* rpar )?
	|	attribute_nothrow_nm
	|	attribute_pure_nm
	|	attribute_trans_union_nm
	|	attribute_vector_size_nm lpar decimal_lit rpar
	|	attribute_visibility_nm
	|	attribute_weak_nm
	;

attribute_alias_nm
	:	attribute_alias
		-> ^( NAME attribute_alias )
	;

attribute_alias
	:	'alias'
	|	'__alias__'
	|	'__alias'
	|	'alias__'
	;

attribute_aligned_nm
	:	attribute_aligned
		-> ^( NAME attribute_aligned )
	;

attribute_aligned
	:	'__aligned__'
	|	'__aligned'
	|	'aligned__'
	|	'aligned'
	;

/*alignof_expression
	:	'__alignof__' '(' unary_expression ')'
	|	'__alignof' '(' unary_expression ')'
	|	'__alignof__' '(' type_name ')'
	|	'__alignof' '(' type_name ')'
	;*/

attribute_always_inline_nm
	:	attribute_always_inline
		-> ^( NAME attribute_always_inline )
	;

attribute_always_inline
	:	'__always_inline__'
	|	'__always_inline'
	|	'always_inline__'
	|	'always_inline'
	;

attribute_cdecl_nm
	:	attribute_cdecl
		-> ^( NAME attribute_cdecl )
	;

attribute_cdecl
	:	'cdecl'
	|	'__cdecl__'
	|	'__cdecl'
	|	'cdecl__'
	;

attribute_cleanup_nm
	:	attribute_cleanup
		-> ^( NAME attribute_cleanup )
	;

attribute_cleanup
	:	'__cleanup__'
	|	'__cleanup'
	|	'cleanup__'
	|	'cleanup'
	;

attribute_const_nm
	:	attribute_const
		-> ^( NAME attribute_const )
	;

attribute_const
	:	'__const__'
	|	'__const'
	|	'const__'
	|	'const'
	;

attribute_constructor_nm
	:	attribute_constructor
		-> ^( NAME attribute_constructor )
	;

attribute_constructor
	:	'__constructor__'
	|	'__constructor'
	|	'constructor__'
	|	'constructor'
	;

attribute_deprecated_nm
	:	attribute_deprecated
		-> ^( NAME attribute_deprecated )
	;

attribute_deprecated
	:	'__deprecated__'
	|	'__deprecated'
	|	'deprecated__'
	|	'deprecated'
	;

attribute_destructor_nm
	:	attribute_destructor
		-> ^( NAME attribute_destructor )
	;

attribute_destructor
	:	'__destructor__'
	|	'__destructor'
	|	'destructor__'
	|	'destructor'
	;

attribute_dllexport_nm
	:	attribute_dllexport
		-> ^( NAME attribute_dllexport )
	;

attribute_dllexport
	:	'__dllexport__'
	|	'__dllexport'
	|	'dllexport__'
	|	'dllexport'
	;

attribute_dllimport_nm
	:	attribute_dllimport
		-> ^( NAME attribute_dllimport )
	;

attribute_dllimport
	:	'__dllimport__'
	|	'__dllimport'
	|	'dllimport__'
	|	'dllimport'
	;

attribute_eightbit_nm
	:	attribute_eightbit
		-> ^( attribute_eightbit )
	;

attribute_eightbit
	:	'__eightbit__'
	|	'__eightbit'
	|	'eightbit__'
	|	'eightbit'
	;

attribute_format_nm
	:	attribute_format
		-> ^( NAME attribute_format )
	;

attribute_format
	:	'__format__'
	|	'__format'
	|	'format__'
	|	'format'
	;

format_archetype_nm
	:	format_archetype
		-> ^( NAME format_archetype )
	;

format_archetype
	:	'printf'
	|	'__printf__'
	|	'__printf'
	|	'printf__'
	|	'scanf'
	|	'__scanf__'
	|	'__scanf'
	|	'scanf__'
	|	'strftime'
	|	'__strftime__'
	|	'__strftime'
	|	'strftime__'
	|	'strfmon'
	|	'__strfmon__'
	|	'__strfmon'
	|	'strfmon__'
	;

attribute_leaf_nm
	:	attribute_leaf
		-> ^( NAME attribute_leaf )
	;

attribute_leaf
	:	'__leaf__'
	|	'__leaf'
	|	'leaf__'
	|	'leaf'
	;

attribute_malloc_nm
	:	attribute_malloc
		-> ^( NAME attribute_malloc )
	;

attribute_malloc
	:	'__malloc__'
	|	'__malloc'
	|	'malloc__'
	|	'malloc'
	;

attribute_noinline_nm
	:	attribute_noinline
		-> ^( NAME attribute_noinline )
	;

attribute_noinline
	:	'__noinline__'
	|	'__noinline'
	|	'noinline__'
	|	'noinline'
	;

attribute_noreturn_nm
	:	attribute_noreturn
		-> ^( NAME attribute_noreturn )
	;

attribute_noreturn
	:	'__noreturn__'
	|	'__noreturn'
	|	'noreturn__'
	|	'noreturn'
	;

attribute_used_nm
	:	attribute_used
		-> ^( NAME attribute_used )
	;

attribute_used
	:	'__used__'
	|	'__used'
	|	'used__'
	|	'used'
	;

attribute_unused_nm
	:	attribute_unused
		-> ^( NAME attribute_unused )
	;

attribute_unused
	:	'__unused__'
	|	'__unused'
	|	'unused__'
	|	'unused'
	;

attribute_mode_nm
	:	attribute_mode
		-> ^( NAME attribute_mode )
	;

attribute_mode
	:	'__mode__'
	|	'__mode'
	|	'mode__'
	|	'mode'
	;

attribute_nonnull_nm
	:	attribute_nonnull
		-> ^( NAME attribute_nonnull )
	;

attribute_nonnull
	:	'__nonnull__'
	|	'__nonnull'
	|	'nonnull__'
	|	'nonnull'
	;

attribute_nothrow_nm
	:	attribute_nothrow
		-> ^( NAME attribute_nothrow )
	;

attribute_nothrow
	:	'__nothrow__'
	|	'__nothrow'
	|	'nothrow__'
	|	'nothrow'
	;

attribute_pure_nm
	:	attribute_pure
		-> ^( NAME attribute_pure )
	;

attribute_pure
	:	'__pure__'
	|	'__pure'
	|	'pure__'
	|	'pure'
	;

attribute_trans_union_nm
	:	attribute_trans_union
		-> ^( NAME attribute_trans_union )
	;

attribute_trans_union
	:	'__transparent_union__'
	|	'__transparent_union'
	|	'transparent_union__'
	|	'transparent_union'
	;

attribute_vector_size_nm
	:	attribute_vector_size
		-> ^( NAME attribute_vector_size )
	;

attribute_vector_size
	:	'__vector_size__'
	|	'__vector_size'
	|	'vector_size__'
	|	'vector_size'
	;

attribute_visibility_nm
	:	attribute_visibility
		-> ^( NAME attribute_visibility )
	;

attribute_visibility
	:	'__visibility__'
	|	'__visibility'
	|	'visibility__'
	|	'visibility'
	;

attribute_weak_nm
	:	attribute_weak
		-> ^( NAME attribute_weak )
	;

attribute_weak
	:	'__weak__'
	|	'__weak'
	|	'weak__'
	|	'weak'
	;

IDENTIFIER
	:	LETTER ( LETTER | '0'..'9' )*
	;
	
fragment
LETTER
	:	'$'
	|	'A'..'Z'
	|	'a'..'z'
	|	'_'
	;

/*GNU_LONG_INT_LIT
	:	'L' '\'' ( EscapeSequence | ~('\'') )+ '\''
	;

GNU_LONG_INT_STRING_LIT
	:	'L' '"' ( EscapeSequence | ~('\\'|'"') )* '"'
	;*/

CHARACTER_LITERAL
    :   IntegerTypeSuffix? '\'' ( EscapeSequence | ~('\''|'\\') )+ '\''
    ;

STRING_LITERAL
    :	IntegerTypeSuffix? '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

HEX_LITERAL : '0' ('x'|'X') HexDigit+ IntegerTypeSuffix* ;

DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) IntegerTypeSuffix* ;

OCTAL_LITERAL : '0' ('0'..'7')+ IntegerTypeSuffix* ;

fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
IntegerTypeSuffix
	:	('u'|'U')? ('l'|'L')
//	|	('u'|'U')  ('l'|'L')?
	;

FLOATING_POINT_LITERAL
    :   ('0'..'9')+ '.' ('0'..'9')* Exponent? FloatTypeSuffix?
    |   '.' ('0'..'9')+ Exponent? FloatTypeSuffix?
    |   ('0'..'9')+ Exponent? FloatTypeSuffix?
 //   |   ('0'..'9')+ Exponent? FloatTypeSuffix
	;

fragment
Exponent : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
FloatTypeSuffix : ('f'|'F'|'d'|'D') ;

fragment
EscapeSequence
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   OctalEscape
    ;

fragment
OctalEscape
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') {$channel=HIDDEN;}
    ;

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

LINE_COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;

// ignore #line info for now
LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
