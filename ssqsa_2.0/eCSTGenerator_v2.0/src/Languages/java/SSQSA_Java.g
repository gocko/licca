/** --------------------------------- SSQSA Java grammar --------------------------------------

 *  Java grammar with incorporated SSQSA universal nodes 

 *  Ver 0 - Dieter (see comment below)

 *  Ver 1 - Gordana, goca@dmi.uns.ac.rs

 *  Ver 2 - Milos, jun 2012, svc@dmi.uns.ac.rs

 * -------------------------------------------------------------------------------------------

 *

 * Dieter's comment: 
 
 * -----------------

 * An ANTLRv3 capable Java 1.5 grammar for building ASTs.

 *

 * Note that there's also the tree grammar 'JavaTreeParser.g' that can be fed

 * with this grammer's output.

 *

 *

 * Please report any detected errors or even suggestions regarding this grammar

 * to

 *

 *          dieter [D O T] habelitz [A T] habelitz [D O T] com

 *

 *      with the subject

 *

 *          jsom grammar: [your subject note]

 *

 * To generate a parser based on this grammar you'll need ANTLRv3, which you can

 * get from 'http://www.antlr.org'.

 *

 *

 * This grammar is published under the ...

 *

 * BSD licence

 * 

 * Copyright (c) 2007-2008 by HABELITZ Software Developments

 *

 * All rights reserved.

 * 

 * http://www.habelitz.com

 *

 *

 * Redistribution and use in source and binary forms, with or without

 * modification, are permitted provided that the following conditions

 * are met:

 *

 *  1. Redistributions of source code must retain the above copyright

 *     notice, this list of conditions and the following disclaimer.

 *  2. Redistributions in binary form must reproduce the above copyright

 *     notice, this list of conditions and the following disclaimer in the

 *     documentation and/or other materials provided with the distribution.

 *  3. The name of the author may not be used to endorse or promote products

 *     derived from this software without specific prior written permission.

 *

 * THIS SOFTWARE IS PROVIDED BY HABELITZ SOFTWARE DEVELOPMENTS ('HSD') ``AS IS'' 

 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 

 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 

 * ARE DISCLAIMED. IN NO EVENT SHALL 'HSD' BE LIABLE FOR ANY DIRECT, INDIRECT, 

 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 

 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, 

 * OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF 

 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING 

 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, 

 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

 *

 */

grammar SSQSA_Java;

options { 

    backtrack = true; 

    memoize = true;

    output = AST;

    ASTLabelType = CommonTree;

}



tokens {



    // operators and other special chars

    
    AND                     = '&'               ;

    AND_ASSIGN              = '&='              ;

    ASSIGN                  = '='               ;

    AT                      = '@'               ;

    BIT_SHIFT_RIGHT         = '>>>'             ;

    BIT_SHIFT_RIGHT_ASSIGN  = '>>>='            ;

    COLON                   = ':'               ;

    COMMA                   = ','               ;

    DEC                     = '--'              ;

    DIV                     = '/'               ;

    DIV_ASSIGN              = '/='              ;

    DOT                     = '.'               ;

    DOTSTAR                 = '.*'              ;

    ELLIPSIS                = '...'             ;

    EQUAL                   = '=='              ;

    GREATER_OR_EQUAL        = '>='              ;

    GREATER_THAN            = '>'               ;

    INC                     = '++'              ;

    LBRACK                  = '['               ;

    LCURLY                  = '{'               ;

    LESS_OR_EQUAL           = '<='              ;

    LESS_THAN               = '<'               ;

    LOGICAL_AND             = '&&'              ;

    LOGICAL_NOT             = '!'               ;

    LOGICAL_OR              = '||'              ;

    LPAREN                  = '('               ;

    MINUS                   = '-'               ;

    MINUS_ASSIGN            = '-='              ;

    MOD                     = '%'               ;

    MOD_ASSIGN              = '%='              ;

    NOT                     = '~'               ;

    NOT_EQUAL               = '!='              ;

    OR                      = '|'               ;

    OR_ASSIGN               = '|='              ;

    PLUS                    = '+'               ;

    PLUS_ASSIGN             = '+='              ;

    QUESTION                = '?'               ;

    RBRACK                  = ']'               ;

    RCURLY                  = '}'               ;

    RPAREN                  = ')'               ;

    SEMI                    = ';'               ;

    SHIFT_LEFT              = '<<'              ;

    SHIFT_LEFT_ASSIGN       = '<<='             ;

    SHIFT_RIGHT             = '>>'              ;

    SHIFT_RIGHT_ASSIGN      = '>>='             ;

    STAR                    = '*'               ;

    STAR_ASSIGN             = '*='              ;

    XOR                     = '^'               ;

    XOR_ASSIGN              = '^='              ;



    // keywords

    

    ABSTRACT                = 'abstract'        ;

    ASSERT                  = 'assert'          ;

    BOOLEAN                 = 'boolean'         ;

    BREAK                   = 'break'           ;

    BYTE                    = 'byte'            ;

    CASE                    = 'case'            ;

    CATCH                   = 'catch'           ;

    CHAR                    = 'char'            ;

    CLASS                   = 'class'           ;

    CONTINUE                = 'continue'        ;

    DEFAULT                 = 'default'         ;

    DO                      = 'do'              ;

    DOUBLE                  = 'double'          ;

    ELSE                    = 'else'            ;

    ENUM                    = 'enum'            ;

    EXTENDS                 = 'extends'         ;

    FALSE                   = 'false'           ;

    FINAL                   = 'final'           ;

    FINALLY                 = 'finally'         ;

    FLOAT                   = 'float'           ;

    FOR                     = 'for'             ;

    IF                      = 'if'              ;

    IMPLEMENTS              = 'implements'      ;

    INSTANCEOF              = 'instanceof'      ;

    INTERFACE               = 'interface'       ;

    IMPORT                  = 'import'          ;

    INT                     = 'int'             ;

    LONG                    = 'long'            ;

    NATIVE                  = 'native'          ;

    NEW                     = 'new'             ;

    NULL                    = 'null'            ;

    PACKAGE                 = 'package'         ;

    PRIVATE                 = 'private'         ;

    PROTECTED               = 'protected'       ;

    PUBLIC                  = 'public'          ;

    RETURN                  = 'return'          ;

    SHORT                   = 'short'           ;

    STATIC                  = 'static'          ;

    STRICTFP                = 'strictfp'        ;

    SUPER                   = 'super'           ;

    SWITCH                  = 'switch'          ;

    SYNCHRONIZED            = 'synchronized'    ;

    THIS                    = 'this'            ;

    THROW                   = 'throw'           ;

    THROWS                  = 'throws'          ;

    TRANSIENT               = 'transient'       ;

    TRUE                    = 'true'            ;

    TRY                     = 'try'             ;

    VOID                    = 'void'            ;

    VOLATILE                = 'volatile'        ;

    WHILE                   = 'while'           ;

    

   /* 

    * MILOS, 20 jun 2012, REVISED LIST OF SSQSA UNIVERSAL NODES *

    */

   COMPILATION_UNIT;

   

   // MILOS, 20 jun 2012, universal nodes used by SNEIPL

   IMPORT_DECL;                  // import statement marker

   PACKAGE_DECL;                 // package statement marker (if empty default package)

   CONCRETE_UNIT_DECL;           // class statement marker

   INTERFACE_UNIT_DECL;          // interface statement marker

   BLOCK_SCOPE;                  // { }

   

   ATTRIBUTE_DECL;               // class atribute (global variable)

   VAR_DECL;                     // local (method) variable

   

   IMPLEMENTS_CLAUSE;            // CLASS implements INTERFACE marker

   TYPE_DECL;                    // type declaration (here in Java type == enum)

   INSTANTIATES;                 // NEW statement marker bivsi STATIC_ARRAY_CREATOR

   EXTENDS;                      // CLASS extends CLASS marker

   

  

   FUNCTION_DECL;                // method declaration marker

   FORMAL_PARAM_LIST;            // list of formal parameters in method declaration

   PARAMETER_DECL;               // one parameter in FORMAL_PARAM_LIST

   

   NAME;                         // name of any entity

   TYPE;                         // type of any entity

   

   FUNCTION_CALL;                // function call marker

   ARGUMENT_LIST;                // FUNCTION_CALL arguments

   ARGUMENT;                     // one argument in ARGUMENT_LIST

   

   // MILOS, 20 jun 2012, universal nodes used by SMIILE

   BRANCH;

   BRANCH_STATEMENT;    //we are using this for all branches: if, case...

   CONDITION;

   LOOP_STATEMENT;      //we ar eusing this for all loops: for, while, repeat, loop...
   INIT;
   STEP;
   
   LOGICAL_OPERATOR;

   JUMP_STATEMENT;

   FOR_EACH;                 

   LABELED_STATEMENT;        

   CATCH_CLAUSE_LIST;        

   SWITCH_BLOCK_LABEL_LIST;  

   

   // MILOS, 20 jun 2012, other universal nodes, that have "universal potential"

   //CONSTRUCTOR_DECL;             // constructor declaration marker

   // Milos, 12.7.2013 constructor marked with FUNCTION_DECL

   // EDITABLE_TOKEN used to set return type of constructor to "void"

   EDITABLE_TOKEN;

   NAME_IGNORE;

   THROWS_CLAUSE;                // THROWS

   CONSTRUCTOR_CALL;             // CONSTRUCTOR CALL

   MODIFIER_LIST; 

   VALUE;
   CONST;

   IGNORE;



   // Jozef Kolek, 3 jun 2015

   ASSIGNMENT_STATEMENT;
   
   // Tijana Vislavski, jun 2016
   
   ASSIGN_OPERATOR;
   OPERATOR; 
   

   COMPARISON_OPERATOR;
   
   SEPARATOR;
   KEYWORD;



   //////////////////////////////////////// [MILOS] REMOVED UNIVERSAL NODES

   

   //!m JAVA_SOURCE;                     // intentionally removed 

   //!m POST_DEC;                        // intentionally removed

   //!m POST_INC;                        // intentionally removed

   //!m PRE_DEC;                         // intentionally removed

   //!m PRE_INC;                         // intentionally removed

   //!m ADD_OPERATOR;                    // not used

   //!m BASE_UNIT_DECL;                  // not used

   //!m WHITESPACE_SEGMENT;              // not used

   //!m ANNOTATION_INIT_ARRAY_ELEMENT;   // intentionally removed

   //!m ANNOTATION_INIT_BLOCK;           // intentionally removed

   //!m ANNOTATION_INIT_DEFAULT_KEY;     // intentionally removed

   //!m ANNOTATION_INIT_KEY_LIST;        // intentionally removed

   //!m ANNOTATION_LIST;                 // intentionally removed

   //!m ANNOTATION_METHOD_DECL;          // intentionally removed

   //!m ANNOTATION_SCOPE;                // intentionally removed

   //!m ANNOTATION_TOP_LEVEL_SCOPE;      // intentionally removed

   //!m COMMENT_SEGMENT;                 // not used

   //!m BLOCK;                           // not used

   //!m VAR_DECLARATOR;                  // not used

   //!m TYPE_DECLARATOR;                 // not used

   //!m ARRAY_DECLARATOR;                // intentionally removed

   //!m ARRAY_DECL;                      // intentionally removed

   //!m ARRAY_ELEMENT_ACCESS;            // intentionally removed

   //!m ARRAY_INITIALIZER;               // intentionally removed

   //!m ACCESS_DECL;                     // under MODIFY_LIST

   //FOR_CONDITION;                   // intentionally removed 

   //FOR_INIT;                        // intentionally removed

   //FOR_UPDATE;                      // intentionally removed

   //!m CLASS_TOP_LEVEL_SCOPE;           // intentionally removed 

   //!m CLASS_CONSTRUCTOR_CALL;          // intentionally removed

   //!m CLASS_INSTANCE_INITIALIZER;      // intentionally removed

   //!m CLASS_STATIC_INITIALIZER;        // intentionally removed

   //!m INTERFACE_TOP_LEVEL_SCOPE;       // intentionally removed

   //!m VAR_DECL;                        // duplicated

   //!m VAR_DECLARATOR;                  // not used

   //!m VAR_DECLARATOR_LIST;             // not used

   //!m VOID_METHOD_DECL;                // not used

   //!m LOCAL_MODIFIER_LIST;             // intentionally removed

   //!m EXTENDS_BOUND_LIST;              // intentionally removed

   //!m FORMAL_PARAM_STD_DECL;           // intentionally removed

   //!m FORMAL_PARAM_VARARG_DECL;        // intentionally removed

   //!m CONST_DECL;                      // not used

   //!m EXPRESSION;                      // not used

   //!m FACTOR;                          // not used

   //!m MUL_OPERATOR;                    // not used

   //!m RELATION;                        // not used

   //!m SIMPLE_EXPRESSION;               // not used

   //!m STATEMENT;                       // not used

   //!m ENUM_TOP_LEVEL_SCOPE;            // intentionally removed

   //!m EXPR;                            // intentionally removed

   //!m GENERIC_TYPE_ARG_LIST;           // intentionally removed

   //!m GENERIC_TYPE_PARAM_LIST;         // intentionally removed

   //!m PARENTESIZED_EXPR;               // intentionally removed

   //!m CATCH_CLAUSE_LIST;               // intentionally removed   

   //!m CONSTRUCTOR_DECL;                // constructor return type --> VOID 

   //!m QUALIFIED_TYPE_IDENT;            // not USED

} 



@header {package Languages.java;}

//@lexer::header {package svc.istok.parsers.java;}



@members {

    

    private boolean mMessageCollectionEnabled = false;

    private boolean mHasErrors = false;

    private List<String> mMessages;



    /**

     *  Switches error message collection on or of.

     *

     *  The standard destination for parser error messages is <code>System.err</code>.

     *  However, if <code>true</code> gets passed to this method this default

     *  behaviour will be switched off and all error messages will be collected

     *  instead of written to anywhere.

     *

     *  The default value is <code>false</code>.

     *

     *  @param pNewState  <code>true</code> if error messages should be collected.

     */

    public void enableErrorMessageCollection(boolean pNewState) {

        mMessageCollectionEnabled = pNewState;

        if (mMessages == null && mMessageCollectionEnabled) {

            mMessages = new ArrayList<String>();

        }

    }

    

    /**

     *  Collects an error message or passes the error message to <code>

     *  super.emitErrorMessage(...)</code>.

     *

     *  The actual behaviour depends on whether collecting error messages

     *  has been enabled or not.

     *

     *  @param pMessage  The error message.

     */

     @Override

    public void emitErrorMessage(String pMessage) {

        if (mMessageCollectionEnabled) {

            mMessages.add(pMessage);

        } else {

            super.emitErrorMessage(pMessage);

        }

    }

    

    /**

     *  Returns collected error messages.

     *

     *  @return  A list holding collected error messages or <code>null</code> if

     *           collecting error messages hasn't been enabled. Of course, this

     *           list may be empty if no error message has been emited.

     */

    public List<String> getMessages() {

        return mMessages;

    }

    

    /**

     *  Tells if parsing a Java source has caused any error messages.

     *

     *  @return  <code>true</code> if parsing a Java source has caused at least one error message.

     */

    public boolean hasErrors() {

        return mHasErrors;

    }

}



@lexer::header { package Languages.java; }



@lexer::members {

/** 

 *  Determines if whitespaces and comments should be preserved or thrown away.

 *

 *  If <code>true</code> whitespaces and comments will be preserved within the

 *  hidden channel, otherwise the appropriate tokens will be skiped. This is

 *  a 'little bit' expensive, of course. If only one of the two behaviours is

 *  needed forever the lexer part of the grammar should be changed by replacing 

 *  the 'if-else' stuff within the approprate lexer grammar actions.

 */

public boolean preserveWhitespacesAndComments = false;

}



// Starting point for parsing a Java file.

// MILOS, 20 jun 2012, removed JAVA_SOURCE

// ->  ^(JAVA_SOURCE ^(COMPILATION_UNIT compilationUnit))

startNonterminal

    :   compilationUnit

   	->  ^(COMPILATION_UNIT compilationUnit)

   ;





// MILOS, 20 jun 2012, removed AnnotationList sub-tree in produced eCST

// changed IMPORT_DECL (one IMPORT_DECL per import statement)

// -> annotationList ^(PACKAGE_DECL packageDeclaration?) ^(IMPORT_DECL importDeclaration*) typeDecls*

compilationUnit

    :   annotationList? packageDeclaration? importDeclaration* typeDecls*

        -> ^(PACKAGE_DECL packageDeclaration? importDeclaration* typeDecls*)

    ;



typeDecls

    :   typeDeclaration

    |   SEMI!

    ;



// MILOS, 25 jun, NAME integrated with qualifiedIdentifier

// -> PACKAGE ^(NAME qualifiedIdentifier) SEMI

packageDeclaration

    :   PACKAGE qualifiedIdentifier SEMI 

        -> /* PACKAGE */ qualifiedIdentifier

    ;

    

// MILOS, 20 jun 2012, changed IMPORT_DECL (one IMPORT_DECL per import statement)

// ->	^(IMPORT STATIC? ^(NAME qualifiedIdentifier DOTSTAR? SEMI))

importDeclaration

    :   IMPORT STATIC? qualifiedIdentifier DOTSTAR? SEMI

        -> ^(IMPORT_DECL qualifiedIdentifier DOTSTAR?)    

    ;

    

// MILOS, 20 jun 2012, annotationTypeDeclaration not used, so it does not need arguments

typeDeclaration

    :   modifierList!

        (   classTypeDeclaration[$modifierList.tree]

        |   interfaceTypeDeclaration[$modifierList.tree]

        |   enumTypeDeclaration[$modifierList.tree]

        |   annotationTypeDeclaration//[$modifierList.tree]

        )

    ;

    

classTypeDeclaration[CommonTree modifiers]

    :	CLASS IDENT genericTypeParameterList? classExtendsClause? implementsClause? classBody

        -> ^(CONCRETE_UNIT_DECL  /* ^(CLASS {$modifiers} */ ^(NAME IDENT) /* genericTypeParameterList? */  classExtendsClause? implementsClause? classBody) /*)*/

    ;

    

classExtendsClause

    :   EXTENDS type

        ->  ^(EXTENDS[$EXTENDS, "EXTENDS"] type)

    ;   

    

// MILOS, 24 jul 2012, one type per EXTENDS

interfaceExtendsClause

    :   /* EXTENDS typeList */

        EXTENDS type (COMMA type)*

        //->  (^(EXTENDS[$EXTENDS, "EXTENDS"] type))*

        -> (^(EDITABLE_TOKEN["EXTENDS"] type))*

    ;   

    

// MILOS, 24 jul 2012, one type per IMPLEMENTS

implementsClause

    :   /* IMPLEMENTS typeList */

        IMPLEMENTS type (COMMA type)*

        ->  (^(IMPLEMENTS_CLAUSE[$IMPLEMENTS, "IMPLEMENTS"] type))*

    ;

     

// MILOS, 20 jun 2012, removed GENERIC_TYPE_PARAM_LIST universal node   

// ->  ^(GENERIC_TYPE_PARAM_LIST[$LESS_THAN, "GENERIC_TYPE_PARAM_LIST"] genericTypeParameter+)

genericTypeParameterList

    :   LESS_THAN genericTypeParameter (COMMA genericTypeParameter)* genericTypeListClosing

        //-> ^(IGNORE genericTypeParameter*)

        -> genericTypeParameter

    ;



genericTypeListClosing  // This 'trick' is fairly dirty - if there's some time a better solution should 

                        // be found to resolve the problem with nested generic type parameter lists 

                        // (i.e. <T1 extends AnyType<T2>> for generic type parameters or <T1<T2>> for 

                        // generic type arguments etc). 

    :   GREATER_THAN

    |   SHIFT_RIGHT

    |   BIT_SHIFT_RIGHT

    |   // nothing

    ;



genericTypeParameter

    :   IDENT bound?

        //->  ^(TYPE ^(NAME IDENT) bound?)

        -> ^(TYPE /*^(NAME*/ IDENT)/*)*/ bound?

    ;

   

// MILOS, 20 jun 2012, removed EXTENDS_BOUND_LIST universal node

// ->  ^(EXTENDS_BOUND_LIST[$EXTENDS, "EXTENDS_BOUND_LIST"] type+)     

bound

    :   EXTENDS type (AND type)*

    ;



// MILOS, 24 jun 2012, ENUM -> TYPE_DECL

enumTypeDeclaration[CommonTree modifiers]

    :   ENUM IDENT implementsClause? enumBody

        ->  ^(TYPE_DECL {$modifiers} ^(NAME IDENT) implementsClause? enumBody)

    ;

    

// MILOS, 20 jun 2012, removed ENUM_TOP_LEVEL_SCOPE universal node

// ->  ^(ENUM_TOP_LEVEL_SCOPE[$LCURLY, "ENUM_TOP_LEVEL_SCOPE"] LCURLY enumScopeDeclarations RCURLY)

enumBody

    :   LCURLY enumScopeDeclarations RCURLY   

    ;



enumScopeDeclarations

    :   enumConstants (COMMA)? enumClassScopeDeclarations?

    ;



// MILOS, 20 jun 2012, removed CLASS_TOP_LEVEL_SCOPE

// -> ^(CLASS_TOP_LEVEL_SCOPE[$SEMI, "CLASS_TOP_LEVEL_SCOPE"] classScopeDeclarations*)

enumClassScopeDeclarations

    :   SEMI classScopeDeclarations*  

    ;



enumConstants

    :   enumConstant (COMMA enumConstant)*

    ;

    

enumConstant

    :   annotationList IDENT^ arguments? classBody?

    ;

  

// MILOS, 20 jun 2012, fixed redundancy in INTERFACE_UNIT_DECL 

// -> ^(INTERFACE_UNIT_DECL IDENT ^(INTERFACE {$modifiers} ^(NAME IDENT) genericTypeParameterList? interfaceExtendsClause? interfaceBody))  

interfaceTypeDeclaration[CommonTree modifiers]

    :   INTERFACE IDENT genericTypeParameterList? interfaceExtendsClause? interfaceBody

        -> ^(INTERFACE_UNIT_DECL {$modifiers} ^(NAME IDENT)  genericTypeParameterList?  interfaceExtendsClause? interfaceBody)

    ;

    

// MILOS, 20 jun 2012, COMMA^ --> COMMA

typeList

    :   type (COMMA type)*

    ;

    

// MILOS, 20 jun 2012, removed CLASS_TOP_LEVEL_SCOPE universal node

// ->  ^(CLASS_TOP_LEVEL_SCOPE[$LCURLY, "CLASS_TOP_LEVEL_SCOPE"] LCURLY classScopeDeclarations* RCURLY)    

classBody

    :   LCURLY classScopeDeclarations* RCURLY   

    ;

    

// MILOS, 20 jun 2012, removed INTERFACE_TOP_LEVEL_SCOPE universal node

// ->  ^(INTERFACE_TOP_LEVEL_SCOPE[$LCURLY, "CLASS_TOP_LEVEL_SCOPE"] LCURLY interfaceScopeDeclarations* RCURLY)

// ->  ^(INTERFACE_TOP_LEVEL_SCOPE[$LCURLY, "CLASS_TOP_LEVEL_SCOPE"] interfaceScopeDeclarations* 

interfaceBody

    :   LCURLY interfaceScopeDeclarations* RCURLY

    ;





// MILOS, 20 jun 2012

// 1] removed CLASS_INSTANCE_INITIALIZED

//    block ->  ^(CLASS_INSTANCE_INITIALIZER block)

// 2] old comments 

//      /*^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT*/ 

//      /* VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT*/ 

//      /* CONSTRUCTOR_DECL[$ident, "CONSTRUCTOR_DECL"] modifierList genericTypeParameterList?*/ 

// 3] CONSTRUCTOR_DECL changed with VOID

// 4] removed CLASS_STATIC_INITIALIZER

//

// MILOS, 25 jun 2012

// One ATTRIBUTE_DECL per one attribute in aggregated attribute list

classScopeDeclarations

    :   block           

    |   modifierList

        (   genericTypeParameterList?

            (   type IDENT formalParameterList arrayDeclaratorList? throwsClause? (block | SEMI)

                ->  ^(FUNCTION_DECL modifierList genericTypeParameterList?  type ^(NAME IDENT) formalParameterList arrayDeclaratorList? throwsClause? block?)

            

            |   VOID IDENT formalParameterList throwsClause? (block | SEMI)

                -> ^(FUNCTION_DECL modifierList genericTypeParameterList?  ^(TYPE VOID) ^(NAME IDENT) formalParameterList throwsClause? block?)

            

            |   IDENT formalParameterList throwsClause? block

                ->  ^(FUNCTION_DECL modifierList genericTypeParameterList? ^(TYPE EDITABLE_TOKEN["void"]) ^(NAME IDENT) formalParameterList throwsClause? block)

            )

        |   //type classFieldDeclaratorList SEMI

            //->  ^( ATTRIBUTE_DECL modifierList type classFieldDeclaratorList)

            type variableDeclaratorId (ASSIGN variableInitializer)? (COMMA variableDeclaratorId (ASSIGN variableInitializer)?)*  SEMI

            -> (^(ATTRIBUTE_DECL modifierList type variableDeclaratorId ^(VALUE variableInitializer?)))*



        )

    |   typeDeclaration

    |   STATIC block    //->  ^(CLASS_STATIC_INITIALIZER[$STATIC, "CLASS_STATIC_INITIALIZER"] block)

    |   SEMI

    ;

            



// MILOS, 20 jun 2012 

// 1. old comments deleted

//       /*^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT*/

//       /* VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT*/

// 2. fixed bug for VOID method declarations ^(formalParameterList throwsClause?)

//

// MILOS, 25 jun 2012

// One ATTRIBUTE_DECL per one attribute in aggregated attribute list

interfaceScopeDeclarations

    :   modifierList

        (   genericTypeParameterList?

            (   type IDENT formalParameterList arrayDeclaratorList? throwsClause? SEMI

                 ->  ^(FUNCTION_DECL modifierList genericTypeParameterList? type ^(NAME IDENT)  formalParameterList arrayDeclaratorList? throwsClause?)

            |   VOID IDENT formalParameterList throwsClause? SEMI

                -> ^(FUNCTION_DECL modifierList genericTypeParameterList? ^(TYPE VOID) ^(NAME IDENT) formalParameterList throwsClause?)

             )

        |   //type interfaceFieldDeclaratorList SEMI

            //->  ^(ATTRIBUTE_DECL modifierList type interfaceFieldDeclaratorList)

            type variableDeclaratorId (ASSIGN variableInitializer)? (COMMA variableDeclaratorId (ASSIGN variableInitializer)?)*  SEMI

            -> (^(ATTRIBUTE_DECL modifierList type variableDeclaratorId ^(VALUE variableInitializer?)))*

        )

    |   typeDeclaration

    |   SEMI

    ;



// MILOS, 20 jun 2012, ATTRIBUTE_DECLARATOR_LIST removed

// ->  ^(ATTRIBUTE_DECLARATOR_LIST classFieldDeclarator+)

classFieldDeclaratorList

    :   classFieldDeclarator (COMMA classFieldDeclarator)*     

    ;



classFieldDeclarator

    :   variableDeclaratorId (ASSIGN variableInitializer)?

        ->  variableDeclaratorId ^(VALUE variableInitializer?)

    ;

  

// MILOS, 25 jun 2012, NOT USED RULES (integrated into interfaceScopeDeclarations)

// reason: one ATTRIBUTE_DECL per one attribute in aggregated attribute list

//    

// MILOS, 20 jun 2012, ATTRIBUTE_DECLARATOR_LIST removed

// ->  ^(ATTRIBUTE_DECLARATOR_LIST interfaceFieldDeclarator+)

//interfaceFieldDeclaratorList

//    :   interfaceFieldDeclarator (COMMA interfaceFieldDeclarator)*

//    ;



//interfaceFieldDeclarator

//    :   variableDeclaratorId ASSIGN variableInitializer

//        ->  ^(variableDeclaratorId ^(VALUE variableInitializer))

//    ;

    

variableDeclaratorId

    :   IDENT arrayDeclaratorList?

   	-> ^(NAME IDENT arrayDeclaratorList?)

    ;



variableInitializer

    :   arrayInitializer

    |   expression

    ;



// MILOS, 20 jun 2012, ARRAY_DECLARATOR removed

// ->  ^(ARRAY_DECLARATOR)

arrayDeclarator

    :   LBRACK RBRACK

    ;



// MILOS, 20 jun 2012, ARRAY_DECL removed

//->  ^(ARRAY_DECL arrayDeclarator+) 

arrayDeclaratorList

    :   arrayDeclarator+  

    ;

    

// MILOS, 20 jun 2012, ARRAY_INITIALIZER removed
//GOCA, 1.1.2017. Why to ignore this?

//->  ^(ARRAY_INITIALIZER[$LCURLY, "ARRAY_INITIALIZER"] variableInitializer*)

arrayInitializer

    :   LCURLY (variableInitializer (COMMA variableInitializer)* COMMA?)? RCURLY   // -> IGNORE

    ;



throwsClause

    :   THROWS throwIdentList

        ->  ^(THROWS_CLAUSE[$THROWS, "THROWS"] throwIdentList)

    ;



// MILOS, 20 jun 2012, new production used only by throwsClause

throwIdentList

    :   qualifiedIdentifier (COMMA qualifiedIdentifier)*

        -> ^(TYPE qualifiedIdentifier)*

   ;



// MILOS, 20 jun 2012,

// 1. added annotation?

// 2. modifiers and visibility modifiers unified

// 3. old comments deleted

//     | annotation? (visibilityModifier*)   

//     -> ^(ACCESS_DECL visibilityModifier*) //ako je prazno onda default> public

//     | 

modifierList

    :   annotation? (modifier)* 

    -> ^(MODIFIER_LIST (modifier)*)

    ;



    

// MILOS, 20 jun 2012, modifiers and visibility modifiers unified

modifier

    :  	STATIC

    |	ABSTRACT

    |   NATIVE

    |   SYNCHRONIZED

    |   TRANSIENT

    |   VOLATILE

    |   STRICTFP

    |   PUBLIC

    |   PROTECTED

    |   PRIVATE 

    |   localModifier

    ;



localModifierList

    :   localModifier*

        -> ^(MODIFIER_LIST localModifier*)

    ;

    

localModifier

    :   FINAL

    |   annotation

    ;



type

    :   simpleType

    |   objectType

    ;



simpleType // including static arrays of simple type elements

    :   primitiveType  arrayDeclaratorList

        ->  ^(TYPE  primitiveType  arrayDeclaratorList)  

        | primitiveType

        -> ^(TYPE primitiveType)

    ;

    

objectType // including static arrays of object type reference elements

    :   qualifiedTypeIdent  arrayDeclaratorList 

        //->  ^(TYPE ^(NAME ^(TYPE qualifiedTypeIdent)  arrayDeclaratorList))

        -> ^(TYPE qualifiedTypeIdent)

        | qualifiedTypeIdent

        -> ^(TYPE qualifiedTypeIdent)

    ;







// MILOS, 25 jun 2012, this production is not used

//

// MILOS, 20 jun 2012, TYPE universal node moved to qualifiedTypeIdentSimplified

//->  ^(TYPE qualifiedTypeIdentSimplified arrayDeclaratorList?)

//objectTypeSimplified

//    :   qualifiedTypeIdentSimplified arrayDeclaratorList?

//    ;



// MILOS, 20 jun 2012, DOT^ --> DOT

// MILOS, 16 jul 2012, added NAME node (Halstead compatibility)

qualifiedTypeIdent

    :   typeIdent (DOT typeIdent)*

        -> ^(NAME typeIdent (DOT typeIdent)*)    

    ;



// MILOS, 16 jul 2012, added NAME node (Halstead compatibility)

qualifiedTypeIdentSimplified

    :   typeIdentSimplified (DOT typeIdentSimplified)*

        ->  ^(TYPE ^(NAME typeIdentSimplified (DOT typeIdentSimplified)* ))

    ;



typeIdent

    :   IDENT genericTypeArgumentList?

        -> IDENT 

    ;



typeIdentSimplified

    :   IDENT genericTypeArgumentListSimplified? 

        -> IDENT

    ;





primitiveType

    :   BOOLEAN //-> ^(NAME BOOLEAN)

    |   CHAR //-> ^(NAME CHAR)

    |   BYTE //-> ^(NAME BYTE)

    |   SHORT //-> ^(NAME SHORT)

    |   INT //-> ^(NAME INT)

    |   LONG //-> ^(NAME LONG)

    |   FLOAT //-> ^(NAME FLOAT)

    |   DOUBLE //-> ^(NAME DOUBLE)

    ;



genericTypeArgumentList

    :   LESS_THAN genericTypeArgument (COMMA genericTypeArgument)* genericTypeListClosing

        //->  ^(GENERIC_TYPE_ARG_LIST[$LESS_THAN, "GENERIC_TYPE_ARG_LIST"] genericTypeArgument+)

    ;



genericTypeArgument

    :   type

    |   QUESTION genericWildcardBoundType?

        -> ^(QUESTION genericWildcardBoundType?)

    ;

    

genericWildcardBoundType

    :   (EXTENDS | SUPER)^ type

    ;



genericTypeArgumentListSimplified

    :   LESS_THAN genericTypeArgumentSimplified (COMMA genericTypeArgumentSimplified)* genericTypeListClosing

        //->  ^(GENERIC_TYPE_ARG_LIST[$LESS_THAN, "GENERIC_TYPE_ARG_LIST"] genericTypeArgumentSimplified+)

    ;

    

genericTypeArgumentSimplified

    :   type

    |   QUESTION

    ;

    

    

formalParameterList

    :   LPAREN 

        (   // Contains at least one standard argument declaration and optionally a variable argument declaration.

            formalParameterStandardDecl (COMMA formalParameterStandardDecl)* (COMMA formalParameterVarArgDecl)? 

            ->  ^(FORMAL_PARAM_LIST[$LPAREN, "FORMAL_PARAM_LIST"] formalParameterStandardDecl+ formalParameterVarArgDecl?) 

            // Contains a variable argument declaration only.

        |   formalParameterVarArgDecl

            ->  ^(FORMAL_PARAM_LIST[$LPAREN, "FORMAL_PARAM_LIST"] formalParameterVarArgDecl) 

            // Contains nothing.

        |   ->  ^(FORMAL_PARAM_LIST[$LPAREN, "FORMAL_PARAM_LIST"]) 

        )

        RPAREN

    ;

    

 // MILOS, 20 jun 2012, removed FORMAL_PARAM_STD_DECL & FORMAL_PARAM_VARARG_DECL

formalParameterStandardDecl

    :   localModifierList type variableDeclaratorId

        ->  /* ^( FORMAL_PARAM_STD_DECL */ ^(PARAMETER_DECL localModifierList type variableDeclaratorId) /*) */

    ;

    

formalParameterVarArgDecl

    :   localModifierList type ELLIPSIS variableDeclaratorId

        ->  /* ^( FORMAL_PARAM_VARARG_DECL */ ^(PARAMETER_DECL localModifierList type variableDeclaratorId)

    ;

    

// MILOS, 25 jun 2012, NAME integrated with qualifiedIdentifier

qualifiedIdentifier

    :	(
    		IDENT -> ^(NAME IDENT)
    	) 
    	(
    		DOT IDENT  -> ^(NAME $qualifiedIdentifier DOT ^(NAME IDENT))
    	)*

    ;

    

// ANNOTATIONS

// Milos, 20 jun 2012, ANNOTATIONS UNIVERSAL NODES REMOVED

annotationList

    :   annotation*

        //->  ^(ANNOTATION_LIST annotation*)

    ;



annotation

    //:   AT^ qualifiedIdentifier annotationInit?

    : AT qualifiedIdentifier annotationInit?

    ;

    

annotationInit

    :   LPAREN annotationInitializers RPAREN
        -> ^(SEPARATOR LPAREN) annotationInitializers  ^(SEPARATOR RPAREN)
        //->  ^(ANNOTATION_INIT_BLOCK[$LPAREN, "ANNOTATION_INIT_BLOCK"] annotationInitializers)

    ;



annotationInitializers

    :   annotationInitializer (COMMA annotationInitializer)*

        //->  ^(ANNOTATION_INIT_KEY_LIST annotationInitializer+)

    |   annotationElementValue // implicite initialization of the annotation field 'value'

        //->  ^(ANNOTATION_INIT_DEFAULT_KEY annotationElementValue)

    ;

    

annotationInitializer

    // :   IDENT^ ASSIGN annotationElementValue

    :	   IDENT ASSIGN annotationElementValue

    ;

    

annotationElementValue

    :   annotationElementValueExpression

    |   annotation

    |   annotationElementValueArrayInitializer

    ;

    

annotationElementValueExpression

    :   conditionalExpression

        //->  ^(EXPR conditionalExpression)

    ;

    

annotationElementValueArrayInitializer

    :   LCURLY (annotationElementValue (COMMA annotationElementValue)*)? (COMMA)? RCURLY

        //->  ^(ANNOTATION_INIT_ARRAY_ELEMENT[$LCURLY, "ANNOTATION_ELEM_VALUE_ARRAY_INIT"] annotationElementValue*)

    ;

    

annotationTypeDeclaration //[CommonTree modifiers]

    :   AT INTERFACE IDENT annotationBody

        //-> ^(AT {$modifiers} ^(NAME IDENT) annotationBody)

    ;

    

annotationBody

    :   LCURLY annotationScopeDeclarations* RCURLY

        //->  ^(ANNOTATION_TOP_LEVEL_SCOPE[$LCURLY, "CLASS_TOP_LEVEL_SCOPE"] LCURLY annotationScopeDeclarations* RCURLY)

    ;

    

annotationScopeDeclarations

    :   modifierList type

        (   IDENT LPAREN RPAREN annotationDefaultValue? SEMI

            //->  ^(ANNOTATION_METHOD_DECL modifierList type ^(NAME IDENT) annotationDefaultValue?)

        |   classFieldDeclaratorList SEMI

            //->  ^(modifierList type classFieldDeclaratorList)

        )

    |   typeDeclaration

    ;

    

annotationDefaultValue

    // :   DEFAULT^ annotationElementValue

    : DEFAULT annotationElementValue

    ;



// STATEMENTS / BLOCKS



block

    :   LCURLY blockStatement* RCURLY

        ->  ^(BLOCK_SCOPE ^(SEPARATOR LCURLY) blockStatement* ^(SEPARATOR RCURLY))

    ;



blockStatement

    :   localVariableDeclaration SEMI

    |   typeDeclaration

    |   statement	   

    ;



// MILOS, 25 jun 2012, one VAR_DECL per one variable in aggregated variable list

// original old rule    

// localVariableDeclaration

//    :   localModifierList type classFieldDeclaratorList

//        ->  ^(VAR_DECL localModifierList type classFieldDeclaratorList)

//    ;

localVariableDeclaration

  : localModifierList type localVariableInitialisation (COMMA localVariableInitialisation)*
   -> ^(VAR_DECL localModifierList type localVariableInitialisation (COMMA localVariableInitialisation)*)
;

localVariableInitialisation
: variableDeclaratorId ( -> variableDeclaratorId
| (ASSIGN variableInitializer) -> ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR ASSIGN variableDeclaratorId ^(VALUE variableInitializer)))
)
;      



statement

    :   block

    |   ASSERT expr1=expression 

        (   COLON expr2=expression SEMI                                     ->  ^(ASSERT $expr1 $expr2)

        |   SEMI                                                            ->  ^(ASSERT $expr1)

        )

    |   IF parenthesizedExpression ifStat=statement 

        (   ELSE elseStat=statement                                         ->  ^(BRANCH_STATEMENT ^(BRANCH ^(KEYWORD IF) ^(CONDITION parenthesizedExpression) ^(BLOCK_SCOPE $ifStat)) ^(BRANCH ^(KEYWORD ELSE) ^(BLOCK_SCOPE $elseStat) ))

        |                                                                   ->  ^(BRANCH_STATEMENT ^(BRANCH ^(KEYWORD IF) ^(CONDITION parenthesizedExpression) ^(BLOCK_SCOPE $ifStat)))

        )   

    |   FOR LPAREN 

        (   forInit? SEMI forCondition? SEMI forUpdater? RPAREN statement   ->  ^(LOOP_STATEMENT ^(KEYWORD FOR) ^(INIT forInit)? ^(CONDITION forCondition)? ^(STEP forUpdater)? statement) 

        |   localModifierList type IDENT COLON expression RPAREN statement

                                                                            ->  ^(LOOP_STATEMENT ^(KEYWORD FOR_EACH[$FOR, "FOR_EACH"]) ^(CONDITION localModifierList type ^(NAME IDENT) expression) statement)

        ) 

    |   WHILE parenthesizedExpression statement                             ->  ^(LOOP_STATEMENT ^(KEYWORD WHILE) ^(CONDITION parenthesizedExpression) statement)

    |   DO statement WHILE parenthesizedExpression SEMI                     ->  ^(LOOP_STATEMENT ^(KEYWORD DO) statement ^(CONDITION parenthesizedExpression))

    |   TRY block (catches finallyClause? | finallyClause)                  ->  ^(BRANCH_STATEMENT TRY block catches? finallyClause?) //POZABAVITI SE PREBROJAVANJEM TRY I CATCH BLOKOVA U CC

    |   SWITCH parenthesizedExpression LCURLY switchBlockLabels RCURLY      ->  ^(BRANCH_STATEMENT ^(KEYWORD SWITCH) ^(CONDITION parenthesizedExpression) LCURLY switchBlockLabels RCURLY  )

    |   SYNCHRONIZED parenthesizedExpression block                          ->  ^(SYNCHRONIZED parenthesizedExpression block)

    |   RETURN expression? SEMI                                             ->  ^(JUMP_STATEMENT ^(KEYWORD RETURN) expression?)

    |   THROW expression SEMI                                               ->  ^(JUMP_STATEMENT ^(KEYWORD THROW) expression)

    |   BREAK IDENT? SEMI                                                   ->  ^(JUMP_STATEMENT ^(KEYWORD BREAK) ^(NAME IDENT)?)

    |   CONTINUE IDENT? SEMI                                                ->  ^(JUMP_STATEMENT ^(KEYWORD CONTINUE) ^(NAME IDENT)?)

    |   IDENT COLON statement                                               ->  ^(LABELED_STATEMENT ^(NAME IDENT) statement)

    |   expression SEMI							    

    |   SEMI 								    

    ;           

    



catches

    :   catchClause+

        ->  ^(BRANCH CATCH_CLAUSE_LIST catchClause+)

    ;

    

catchClause

    :   CATCH^ LPAREN formalParameterStandardDecl RPAREN block

    ;



finallyClause

    :   FINALLY block

        -> ^(BRANCH FINALLY block)

    ;



// MILOS, 24. jun 2012, BUG fixed, SWITCH can be without case labels and even empty

// Jozef Kolek, 4 jun 2015, BUG fixed, removed doubling of case labels.

switchBlockLabels

    :   switchCaseLabels1? switchDefaultLabel? switchCaseLabels2?

        ->  ^(SWITCH_BLOCK_LABEL_LIST switchCaseLabels1? switchDefaultLabel? switchCaseLabels2?)

    ;

    

switchCaseLabels1

    :   switchCaseLabel*

    ;



switchCaseLabels2

    :   switchCaseLabel*

    ;

        

switchCaseLabel

    :   CASE expression COLON blockStatement* -> ^(BRANCH CASE expression blockStatement*)

    ;

    

switchDefaultLabel

    :   DEFAULT COLON blockStatement* -> ^(BRANCH DEFAULT  blockStatement*)

    ;

    

forInit

    :   localVariableDeclaration   

    |   expressionList              

    |                           

    ;

    

forCondition

    :   expression

    ;

    

forUpdater

    :   expressionList

    ;



// EXPRESSIONS



// MILOS, 20 jun 2012, removed PARANTESIZED_EXPR

// ->  ^(CONDITION ^(PARENTESIZED_EXPR[$LPAREN, "PARENTESIZED_EXPR"] expression))

parenthesizedExpression

    :   LPAREN expression RPAREN     

        -> ^(SEPARATOR LPAREN) expression ^(SEPARATOR RPAREN)

    ;

    

expressionList

    :   expression (COMMA expression)*

    ;



// MILOS, 20 jun 2012, removed EXPR

//->  ^(EXPR assignmentExpression)

expression

    :   assignmentExpression

    ;



// Jozef Kolek, 3 jun 2015, Added ASSIGNMENT_STATEMENT

//assignmentExpression

//    :   conditionalExpression 

//        (   (   ASSIGN^

//            |   PLUS_ASSIGN^

//            |   MINUS_ASSIGN^

//            |   STAR_ASSIGN^

//            |   DIV_ASSIGN^

//            |   AND_ASSIGN^

//            |   OR_ASSIGN^

//            |   XOR_ASSIGN^

//            |   MOD_ASSIGN^

//            |   SHIFT_LEFT_ASSIGN^

//            |   SHIFT_RIGHT_ASSIGN^

//            |   BIT_SHIFT_RIGHT_ASSIGN^

//        )

//        assignmentExpression)?

//    ;



assignOp

  	:	ASSIGN

  	|   PLUS_ASSIGN

    |   MINUS_ASSIGN

    |   STAR_ASSIGN

    |   DIV_ASSIGN

    |   AND_ASSIGN

    |   OR_ASSIGN

    |   XOR_ASSIGN

    |   MOD_ASSIGN

    |   SHIFT_LEFT_ASSIGN

    |   SHIFT_RIGHT_ASSIGN

    |   BIT_SHIFT_RIGHT_ASSIGN

    ;



assignStat

    :	assignOp

    	->  ^( ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR assignOp))

    ;



assignmentExpression

    :   conditionalExpression (
        -> conditionalExpression
        | assignOp assignmentExpression -> ^(ASSIGNMENT_STATEMENT ^(ASSIGN_OPERATOR assignOp conditionalExpression ^(VALUE assignmentExpression) ))
        )

    ;



conditionalExpression

    :   logicalOrExpression (QUESTION assignmentExpression COLON conditionalExpression)?

    ->	 logicalOrExpression ^(BRANCH_STATEMENT ^(QUESTION ^(BRANCH assignmentExpression) COLON ^(BRANCH conditionalExpression)))?

    ;



logicalOrExpression

    :   logicalAndExpression (logicalOrOp^ logicalAndExpression)*

    ;

logicalOrOp 
	:	LOGICAL_OR -> ^(LOGICAL_OPERATOR LOGICAL_OR);

logicalAndExpression

    :   inclusiveOrExpression (logicalAndOp^ inclusiveOrExpression)*

    ;

logicalAndOp 
	:	LOGICAL_AND -> ^(LOGICAL_OPERATOR LOGICAL_AND);
    

// [GORDANIN KOMENTAR]: RAZMISLITI O DRUGACIJEM GRADJENJU OVDE - OVO JE NA BRZINU DODATO - MALO VESTACKI



inclusiveOrExpression

    :   exclusiveOrExpression (bitwiseOrOp^ exclusiveOrExpression)*
    ;

bitwiseOrOp 
	:	OR -> ^(LOGICAL_OPERATOR OR);
	

exclusiveOrExpression

    :   andExpression (bitwiseXorOp^ andExpression)*

    ;

bitwiseXorOp 
	:	XOR -> ^(LOGICAL_OPERATOR XOR);


andExpression

    :   equalityExpression (bitwiseAndOp^ equalityExpression)*
    ;
    
bitwiseAndOp 
	:	AND -> ^(LOGICAL_OPERATOR AND);



equalityExpression

    :   instanceOfExpression 

        (    
	    equalityOp^
            instanceOfExpression

        )*

    ;

equalityOp 
	:   (   EQUAL -> ^(COMPARISON_OPERATOR EQUAL)
            |   NOT_EQUAL -> ^(COMPARISON_OPERATOR NOT_EQUAL)
            )
        ;

instanceOfExpression

    :   relationalExpression (INSTANCEOF^ type)?

    ;



relationalExpression

    :   shiftExpression 

        (   compareOp^

            shiftExpression

        )*

    ;

compareOp
	:	LESS_OR_EQUAL -> ^(COMPARISON_OPERATOR LESS_OR_EQUAL)
            |   GREATER_OR_EQUAL -> ^(COMPARISON_OPERATOR GREATER_OR_EQUAL)
            |   LESS_THAN -> ^(COMPARISON_OPERATOR LESS_THAN)
            |   GREATER_THAN -> ^(COMPARISON_OPERATOR GREATER_THAN)
	;

shiftExpression

    :   additiveExpression

        (   (   BIT_SHIFT_RIGHT^

            |   SHIFT_RIGHT^

            |   SHIFT_LEFT^

            )

            additiveExpression

        )*

    ;



additiveExpression

    :   multiplicativeExpression

        (   additiveOp^

            multiplicativeExpression

        )*

    ;

additiveOp
	:(   PLUS -> ^(OPERATOR PLUS)

            |   MINUS -> ^(OPERATOR MINUS)

            )
	;



multiplicativeExpression

    :   unaryExpression 

        (mulOp^

            unaryExpression

        )*

    ;

    

// MILOS, 20 jun 2012, removed UNARY_PLUS, UNARY_MINUS, PRE_INC and PRE_DEC

mulOp	:(   STAR -> ^(OPERATOR STAR)

            |   DIV -> ^(OPERATOR DIV)

            |   MOD -> ^(OPERATOR MOD)

            )
	;

unaryExpression

    :   additiveOp unaryExpression

    |   incDecOp postfixedExpression -> ^(ASSIGNMENT_STATEMENT incDecOp postfixedExpression)

    |   unaryExpressionNotPlusMinus

    ;

incDecOp 
	:	INC -> ^(OPERATOR INC)
	|	DEC -> ^(OPERATOR DEC);

// MILOS, 20 jun 2012, removed CAST_EXPR

unaryExpressionNotPlusMinus

    :   NOT unaryExpression                             ->  ^(NOT unaryExpression)

    |   LOGICAL_NOT unaryExpression                     ->  ^(LOGICAL_NOT unaryExpression)

    |   LPAREN type RPAREN unaryExpression              ->  ^(EDITABLE_TOKEN["CAST_EXPRESSION"] type unaryExpression)

    |   postfixedExpression                             

    ;

        

// MILOS, 20 jun 2012, removed POST_INC, POST_DEC and ARRAY_ELEMENT_ACCESS

postfixedExpression

        // At first resolve the primary expression ...

    :   (   primaryExpression                       ->  primaryExpression  

        )

        // ... and than the optional things that may follow a primary expression 0 or more times.

        (   outerDot=DOT                            

            (   (   genericTypeArgumentListSimplified?  // Note: generic type arguments are only valid for method calls, i.e. if there

                                                        //       is an argument list.

                    IDENT                           ->  $postfixedExpression DOT IDENT

                    					//^(DOT $postfixedExpression IDENT)

                ) 

                (   arguments                       ->  ^(FUNCTION_CALL ^(NAME $postfixedExpression) genericTypeArgumentListSimplified? arguments)

                )?

            |   THIS                                ->  $postfixedExpression // DOT THIS

            |   Super=SUPER arguments               ->  ^(CONSTRUCTOR_CALL[$Super, "CONSTRUCTOR_CALL"] $postfixedExpression arguments)

            |   (   SUPER innerDot=DOT IDENT        ->  ^(EDITABLE_TOKEN["."] ^(EDITABLE_TOKEN["."] $postfixedExpression SUPER) ^(NAME IDENT))

                )

                (   arguments                       ->  ^(FUNCTION_CALL $postfixedExpression arguments)

                )?

            |   innerNewExpression                  ->  ^(DOT $postfixedExpression innerNewExpression)

            )

        |   LBRACK expression RBRACK                //->  $postfixedExpression ^(NAME_IGNORE expression)

        				    ->  /*^(NAME*/ $postfixedExpression ^(SEPARATOR LBRACK) expression ^(SEPARATOR RBRACK) /*)*/

        )*

        // At the end there may follow a post increment/decrement.

        (   INC -> ^(ASSIGNMENT_STATEMENT  $postfixedExpression ^(OPERATOR INC))

        |   DEC -> ^(ASSIGNMENT_STATEMENT  $postfixedExpression ^(OPERATOR DEC) )

        )?

    ; 

    

// MILOS, 20 jun 2012, this & super constructor call integrated into one constructor call

primaryExpression

    :   parenthesizedExpression //-> ^(VALUE parenthesizedExpression)

    |   literal						->  /*^(VALUE*/ ^(CONST literal)

    |   newExpression //-> ^(VALUE newExpression)

    |   qualifiedIdentExpression 

    |   genericTypeArgumentListSimplified 

        (   SUPER

            (   arguments                               ->  ^(CONSTRUCTOR_CALL[$SUPER, "CONSTRUCTOR_CALL"] genericTypeArgumentListSimplified arguments)

            |   DOT IDENT arguments                     //->  ^(FUNCTION_CALL ^(DOT SUPER IDENT) genericTypeArgumentListSimplified arguments)

                                                        ->  ^(FUNCTION_CALL ^(NAME IDENT) genericTypeArgumentListSimplified arguments)

            )

        |   IDENT arguments                             ->  ^(FUNCTION_CALL ^(NAME IDENT) genericTypeArgumentListSimplified arguments)

        |   THIS arguments                              ->  ^(CONSTRUCTOR_CALL[$THIS, "CONSTRUCTOR_CALL"] genericTypeArgumentListSimplified arguments)

        )

    |   (   THIS                                        ->  ^(IGNORE THIS)

        )

        (   arguments                                   ->  ^(CONSTRUCTOR_CALL[$THIS, "CONSTRUCTOR_CALL"] arguments)

        )?

    |   SUPER arguments                                 ->  ^(CONSTRUCTOR_CALL[$SUPER, "CONSTRUCTOR_CALL"] arguments)

    |   (   SUPER DOT IDENT

        )

        (   arguments                                   //->  ^(FUNCTION_CALL ^(DOT SUPER IDENT) arguments)

                                                        -> ^(FUNCTION_CALL ^(NAME IDENT) arguments)

        |                                               ->  ^(DOT SUPER IDENT)

                                                        //^(FUNCTION_CALL ^(NAME IDENT)

        )

    |   (   primitiveType                               ->  primitiveType

        )

        (   arrayDeclarator                             ->  ^(arrayDeclarator $primaryExpression)   

        )* 

        DOT CLASS                                       ->  $primaryExpression

    |   VOID DOT CLASS                                  //->  ^(DOT VOID CLASS)

    ;

    

// MILOS, 20 jun 2012, added FUNCTION_CALL, NAME subtree

qualifiedIdentExpression

        // The qualified identifier itself is the starting point for this rule.

    :   (   qualifiedIdentifier                         ->  qualifiedIdentifier

        )

        // And now comes the stuff that may follow the qualified identifier.

        (   (   arrayDeclarator                         ->  ^(arrayDeclarator $qualifiedIdentExpression)

            )+ 

            (   DOT CLASS                               ->  ^(TYPE qualifiedIdentifier) //->  $qualifiedIdentExpression

            )

        |   arguments                                   ->  ^(FUNCTION_CALL qualifiedIdentifier arguments)

        |   DOT

            (   CLASS                                   ->  ^(TYPE qualifiedIdentifier) //->  qualifiedIdentifier

            |   genericTypeArgumentListSimplified 

                (   SUPER arguments                     ->  ^(CONSTRUCTOR_CALL["CONSTRUCTOR_CALL"] ^(NAME qualifiedIdentifier) genericTypeArgumentListSimplified arguments)

                |   SUPER DOT IDENT arguments           ->  ^(FUNCTION_CALL ^(EDITABLE_TOKEN["."] ^(EDITABLE_TOKEN["."] qualifiedIdentifier SUPER) IDENT) genericTypeArgumentListSimplified arguments)

                |   IDENT arguments                     ->  ^(FUNCTION_CALL ^(DOT ^(NAME qualifiedIdentifier IDENT)) genericTypeArgumentListSimplified arguments)

                )

            |   THIS                                    ->  qualifiedIdentifier //^(DOT qualifiedIdentifier THIS)

            |   SUPER arguments                         ->  ^(CONSTRUCTOR_CALL["CONSTRUCTOR_CALL"] qualifiedIdentifier arguments)

            |   innerNewExpression                      ->  ^(DOT qualifiedIdentifier innerNewExpression)

            )

        )?

    ;





// MILOS, 20 jun 2012, INSTANTIATES integration

newExpression

    :   NEW  

        (   primitiveType newArrayConstruction      // new static array of primitive type elements

            ->  ^(INSTANTIATES[$NEW, "INSTANTIATES"] primitiveType newArrayConstruction)

        |   genericTypeArgumentListSimplified? qualifiedTypeIdentSimplified

            (   newArrayConstruction                // new static array of object type reference elements

                ->  ^(INSTANTIATES [$NEW, "INSTANTIATES"] genericTypeArgumentListSimplified?  qualifiedTypeIdentSimplified  newArrayConstruction)

            |   arguments classBody              // new object type via constructor invocation

                ->  ^(IGNORE)

            |   arguments

                //->  ^(INSTANTIATES[$NEW, "INSTANTIATES"] genericTypeArgumentListSimplified? qualifiedTypeIdentSimplified arguments)

                 -> ^(INSTANTIATES [$NEW, "INSTANTIATES"] qualifiedTypeIdentSimplified) ^(FUNCTION_CALL ^(NAME qualifiedTypeIdentSimplified) arguments)

            )

        )

    ;

    

// MILOS, 20 jun 2012, INSTANTIATES integration

innerNewExpression // something like 'InnerType innerType = outer.new InnerType();'

//    :   NEW genericTypeArgumentListSimplified? IDENT arguments classBody?

//        ->  ^(INSTANTIATES[$NEW, "INSTANTIATES"] genericTypeArgumentListSimplified? ^(TYPE IDENT) arguments)

    :	NEW genericTypeArgumentListSimplified? IDENT

        ( arguments classBody

          -> ^(IGNORE)

        | arguments

          -> ^(INSTANTIATES[$NEW, "INSTANTIATES"] genericTypeArgumentListSimplified? ^(TYPE IDENT) arguments)

        )      

    ;



newArrayConstruction

    :   arrayDeclaratorList arrayInitializer

    |   LBRACK expression RBRACK (LBRACK expression RBRACK)* arrayDeclaratorList?

    ;



arguments

    :   LPAREN sepArgs? RPAREN

        ->  ^(ARGUMENT_LIST ^(SEPARATOR LPAREN) sepArgs? ^(SEPARATOR RPAREN))

    ;

   

sepArgs

    : expression (COMMA expression)*

    -> (^(ARGUMENT expression))*

    ;





literal 

    :   HEX_LITERAL

    |   OCTAL_LITERAL

    |   DECIMAL_LITERAL

    |   FLOATING_POINT_LITERAL

    |   CHARACTER_LITERAL

    |   STRING_LITERAL

    |   TRUE

    |   FALSE

    |   NULL

    ;



// LEXER



HEX_LITERAL : '0' ('x'|'X') HEX_DIGIT+ INTEGER_TYPE_SUFFIX? ;



DECIMAL_LITERAL : ('0' | '1'..'9' '0'..'9'*) INTEGER_TYPE_SUFFIX? ;



OCTAL_LITERAL : '0' ('0'..'7')+ INTEGER_TYPE_SUFFIX? ;



fragment

HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;



fragment

INTEGER_TYPE_SUFFIX : ('l'|'L') ;



FLOATING_POINT_LITERAL

    :   ('0'..'9')+ 

        (

            DOT ('0'..'9')* EXPONENT? FLOAT_TYPE_SUFFIX?

        |   EXPONENT FLOAT_TYPE_SUFFIX?

        |   FLOAT_TYPE_SUFFIX

        )

    |   DOT ('0'..'9')+ EXPONENT? FLOAT_TYPE_SUFFIX?

    ;



fragment

EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;



fragment

FLOAT_TYPE_SUFFIX : ('f'|'F'|'d'|'D') ;



CHARACTER_LITERAL

    :   '\'' ( ESCAPE_SEQUENCE | ~('\''|'\\') ) '\''

    ;



STRING_LITERAL

    :  '"' ( ESCAPE_SEQUENCE | ~('\\'|'"') )* '"'

    ;



fragment

ESCAPE_SEQUENCE

    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')

    |   UNICODE_ESCAPE

    |   OCTAL_ESCAPE

    ;



fragment

OCTAL_ESCAPE

    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')

    |   '\\' ('0'..'7') ('0'..'7')

    |   '\\' ('0'..'7')

    ;



fragment

UNICODE_ESCAPE

    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT

    ;



IDENT

    :   JAVA_ID_START (JAVA_ID_PART)*

    ;



fragment

JAVA_ID_START

    :  '\u0024'

    |  '\u0041'..'\u005a'

    |  '\u005f'

    |  '\u0061'..'\u007a'

    |  '\u00c0'..'\u00d6'

    |  '\u00d8'..'\u00f6'

    |  '\u00f8'..'\u00ff'

    |  '\u0100'..'\u1fff'

    |  '\u3040'..'\u318f'

    |  '\u3300'..'\u337f'

    |  '\u3400'..'\u3d2d'

    |  '\u4e00'..'\u9fff'

    |  '\uf900'..'\ufaff'

    ;



fragment

JAVA_ID_PART

    :  JAVA_ID_START

    |  '\u0030'..'\u0039'

    ;



WS  :  (' '|'\r'|'\t'|'\u000C'|'\n') 

    {   

        if (preserveWhitespacesAndComments) {

            skip();

        } else {

            $channel = HIDDEN;

        }

    }

    ;



COMMENT

    :   '/*' ( options {greedy=false;} : . )* '*/'

    {   

        if (preserveWhitespacesAndComments) {

            skip();

        } else {

            $channel = HIDDEN;

        }

    }

    ;



LINE_COMMENT

    : '//' ~('\n'|'\r')* '\r'? '\n'

    {   

        if (!preserveWhitespacesAndComments) {

            skip();

        } else {

            $channel = HIDDEN;

        }

    }

    ;

