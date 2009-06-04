/**
 *
 * BSD licence
 * 
 * Copyright (c) 2009 by Yauhen Yakimovich
 * Copyright (c) 2007-2008 by HABELITZ Software Developments
 *
 * All rights reserved.
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
tree grammar Generator;

options {
	language = Java;
	tokenVocab = Java;
	output = template;
	ASTLabelType=CommonTree;
	backtrack = true; 
  memoize = true;	
}

@treeparser::header {
package org.javajavalang;

import org.javajavalang.JavaImprinting.*;
}

@treeparser::members {
    
    GenerationObserver observer;
    
    public void setObserver(GenerationObserver observer) {
      this.observer = observer;
    }
    
    /************************************************************
     *
     * ERROR REPORTING
     *
     ************************************************************/
     
    boolean mMessageCollectionEnabled = false;
    private boolean mHasErrors = false;
    List<String> mMessages;

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

// Starting point for parsing a Java file.
targetSource
scope {
  StringTemplate packageName;
  List importStatements;
  List typeStatements;
}
@init {
  $targetSource::packageName = new StringTemplate();  
  $targetSource::importStatements = new ArrayList();
  $targetSource::typeStatements = new ArrayList();
}
    :   ^(JAVA_SOURCE annotationList packageDeclaration? importDeclaration* typeDeclarations)
    -> targetSource( 
      packageName={$targetSource::packageName}, 
      importStms={$targetSource::importStatements}, 
      typeStms={$targetSource::typeStatements})
    ;

packageDeclaration
    :   ^(PACKAGE qualifiedIdentifier) 
      {$targetSource::packageName=$qualifiedIdentifier.st;}
    ;
    
importDeclaration
    :   ^(IMPORT STATIC? qualifiedIdentifier DOTSTAR?)
      {$targetSource::importStatements.add($qualifiedIdentifier.st);}
    ;

typeDeclarations
  : (tdecl+=typeDeclaration)* {$targetSource::typeStatements.addAll($tdecl);}
  ;  
  
typeDeclaration
scope{
List gtypList;
List extClause;
List implClause;

String identText;
}
@init {
  $typeDeclaration::gtypList = new ArrayList();
  $typeDeclaration::extClause = new ArrayList();
  $typeDeclaration::implClause = new ArrayList();  
}
    :   ^(CLASS modifierList IDENT {$typeDeclaration::identText = $IDENT.text;} (genericTypeParameterList)? (extendsClause)? (implementsClause)? classTopLevelScope)
          -> classDeclaration(modifiers={$modifierList.lst}, name={$IDENT.text}, genericTypeParameters={$typeDeclaration::gtypList}, extendsClause={$typeDeclaration::extClause}, implementsClause={$typeDeclaration::implClause}, classTopLevelScope={$classTopLevelScope.st})
    |   ^(INTERFACE modifierList IDENT {$typeDeclaration::identText = $IDENT.text;} (genericTypeParameterList)? (extendsClause)? interfaceTopLevelScope)
          -> interfaceDeclaration(modifiers={$modifierList.lst}, name={$IDENT.text}, genericTypeParameters={$typeDeclaration::gtypList}, extendsClause={$typeDeclaration::extClause}, interfaceTopLevelScope={$interfaceTopLevelScope.st})
    |   ^(ENUM modifierList IDENT {$typeDeclaration::identText = $IDENT.text;} implementsClause? enumTopLevelScope)
          -> enumDeclaration(modifiers={$modifierList.lst}, name={$IDENT.text}, implementsClause={$typeDeclaration::implClause}, enumTopLevelScope={$enumTopLevelScope.st})
    |   ^(AT modifierList IDENT {$typeDeclaration::identText = $IDENT.text;} annotationTopLevelScope)
          -> atDeclaration(modifiers={$modifierList.lst}, name={$IDENT.text}, annotationTopLevelScope={$annotationTopLevelScope.st})
    ;

extendsClause // actually 'type' for classes and 'type+' for interfaces, but this has 
              // been resolved by the parser grammar.
    :   ^(EXTENDS_CLAUSE (type {$typeDeclaration::extClause.add($type.st);})+)
    ;
    
implementsClause
    :   ^(IMPLEMENTS_CLAUSE (type {$typeDeclaration::implClause.add($type.st);})+)
    ;
        
genericTypeParameterList
    :   ^(GENERIC_TYPE_PARAM_LIST (genericTypeParameter {$typeDeclaration::gtypList.add($genericTypeParameter.st);})+)
    ;

genericTypeParameter
    :   ^(IDENT bound?)
    ;
        
bound
    :   ^(EXTENDS_BOUND_LIST type+)
    ;

enumTopLevelScope
    :   ^(ENUM_TOP_LEVEL_SCOPE enumConstant+ classTopLevelScope?)
    ;
    
enumConstant
    :   ^(IDENT annotationList arguments? classTopLevelScope?)
    ;
    
    
classTopLevelScope
scope{
List decls;
}
@init{
$classTopLevelScope::decls = new ArrayList();
}
    :   ^(CLASS_TOP_LEVEL_SCOPE (classScopeDeclarations {$classTopLevelScope::decls.add($classScopeDeclarations.st);})*)
          -> classTopLevelScope(declarations={$classTopLevelScope::decls})
    ;
    
classScopeDeclarations
scope{
  String methodname;
}
@init {
  $classScopeDeclarations::methodname = null;
}
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT {$classScopeDeclarations::methodname = $IDENT.text;} formalParameterList arrayDeclaratorList? throwsClause? block?)
          -> functionDeclaration(modifiers={$modifierList.lst}, type={$type.st}, ident={$IDENT.text}, parameters={$formalParameterList.lst}, block={$block.st})
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT {$classScopeDeclarations::methodname = $IDENT.text;} formalParameterList throwsClause? block?)
          -> methodDeclaration(modifiers={$modifierList.lst}, ident={$IDENT.text}, parameters={$formalParameterList.lst}, block={$block.st})
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
          -> varDeclaration(modifiers={$modifierList.lst}, type={$type.st}, declarators={$variableDeclaratorList.lst}) 
    |   ^(CONSTRUCTOR_DECL modifierList genericTypeParameterList? formalParameterList throwsClause? block)
    |   typeDeclaration
    ;
    
interfaceTopLevelScope
    :   ^(INTERFACE_TOP_LEVEL_SCOPE interfaceScopeDeclarations*)
    ;
    
interfaceScopeDeclarations
    :   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause?)
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause?)
                         // Interface constant declarations have been switched to variable
                         // declarations by 'java.g'; the parser has already checked that
                         // there's an obligatory initializer.
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;

variableDeclaratorList returns [List lst]
@init{
  $lst = new ArrayList(); 
}
    :   ^(VAR_DECLARATOR_LIST (variableDeclarator {$lst.add($variableDeclarator.st);})+)
    ;

variableDeclarator
    :   ^(VAR_DECLARATOR variableDeclaratorId variableInitializer?)
        -> variableDeclarator(id={$variableDeclaratorId.st}, initializer={$variableInitializer.st})
    ;
     
variableDeclaratorId
    :   ^(IDENT arrayDeclaratorList?) -> template(v={$IDENT.text}) "<v>"
    ;

variableInitializer
    :   arrayInitializer
    |   expression {$variableInitializer.st = $expression.st;}
    ;

arrayDeclarator
    :   LBRACK RBRACK
    ;

arrayDeclaratorList
    :   ^(ARRAY_DECLARATOR_LIST ARRAY_DECLARATOR*)  
    ;
    
arrayInitializer
    :   ^(ARRAY_INITIALIZER variableInitializer*)
    ;

throwsClause
    :   ^(THROWS_CLAUSE qualifiedIdentifier+)
    ;

modifierList returns [List lst]
@init{
  $lst = new ArrayList(); 
}
    :   ^(MODIFIER_LIST (modifier {$lst.add($modifier.st);})*)
    ;

modifier 
    :   PUBLIC -> template(v={$PUBLIC.text}) "<v>"
    |   PROTECTED //-> template(v={$PROTECTED.text}) "<v>"
    |   PRIVATE -> template(v={$PRIVATE.text}) "<v>"
    |   STATIC -> template(v={$STATIC.text}) "<v>"
    |   ABSTRACT -> template(v={$ABSTRACT.text}) "<v>"
    |   NATIVE //-> template(v={$NATIVE.text}) "<v>"
    |   SYNCHRONIZED //-> template(v={$SYNCHRONIZED.text}) "<v>"
    |   TRANSIENT //-> template(v={$TRANSIENT.text}) "<v>"
    |   VOLATILE //-> template(v={$VOLATILE.text}) "<v>"
    |   STRICTFP //-> template(v={$STRICTFP.text}) "<v>"
    |   localModifier
    ;

localModifierList
    :   ^(LOCAL_MODIFIER_LIST localModifier*)
    ;

localModifier
    :   FINAL
    |   annotation
    ;

type
    :   ^(TYPE (primitiveType | qualifiedTypeIdent) arrayDeclaratorList?)
      // TODO: work around observer, properly and abstract, well better then this??
      //{
      //  if (this.observer.IsRuleHandled("type")) {
      //    HashMap<String, Object> observer_args = new HashMap<String, Object>();
      //    observer_args.put("primitiveType",$primitiveType.st);
      //    observer_args.put("qualifiedTypeIdent",$qualifiedTypeIdent.st);
      //    observer_args.put("arrayDeclaratorList",$arrayDeclaratorList.st);
      //    String observer_res = this.observer.generate("type",observer_args);
      //    // Overwrite result only if specially handled
      //    if (observer_res != null) retval.st = new StringTemplate(observer_res);
      //  }
      //}
      {
        StringTemplate primitiveTypeST = null; 
        switch($primitiveType.tokenNum){
          default:
            primitiveTypeST = null;
        }
        
        StringTemplate qualifiedTypeIdentST = null;
        if ($qualifiedTypeIdent.lst!= null) {
          if ($qualifiedTypeIdent.lst.size()>0)
            qualifiedTypeIdentST = $qualifiedTypeIdent.lst.get(0); 
        }
        
        $type.st = new StringTemplate("<type>");
        if (primitiveTypeST != null) {
          $type.st.setAttribute("type", primitiveTypeST);
        } else if (qualifiedTypeIdentST != null) {
          $type.st.setAttribute("type", qualifiedTypeIdentST);
        }
        
      }
    ;

qualifiedTypeIdent returns [List<StringTemplate> lst]
@init{
  $lst = new ArrayList<StringTemplate>();
}
    :   ^(QUALIFIED_TYPE_IDENT (typeIdent {if ($typeIdent.st != null) $lst.add($typeIdent.st);})+) 
    ;

typeIdent 
    :   ^(IDENT genericTypeArgumentList?) -> template(v={$IDENT.text}) "<v>"
    ;

primitiveType returns [int tokenNum]
    :   BOOLEAN {$tokenNum = BOOLEAN;}
    |   CHAR {$tokenNum = CHAR;}
    |   BYTE {$tokenNum = BYTE;}
    |   SHORT {$tokenNum = SHORT;}
    |   INT {$tokenNum = INT;}
    |   LONG {$tokenNum = LONG;}
    |   FLOAT {$tokenNum = FLOAT;}
    |   DOUBLE {$tokenNum = DOUBLE;}
    ;

genericTypeArgumentList
    :   ^(GENERIC_TYPE_ARG_LIST genericTypeArgument+)
    ;
    
genericTypeArgument
    :   type
    |   ^(QUESTION genericWildcardBoundType?)
    ;

genericWildcardBoundType                                                          
    :   ^(EXTENDS type)
    |   ^(SUPER type)
    ;

formalParameterList returns[List<StringTemplate> lst]
@init {
  $lst = new ArrayList<StringTemplate>();
} 
    // TODO: handle formalParameterVarargDecl 
    :   ^(FORMAL_PARAM_LIST (formalParameterStandardDecl {if ($formalParameterStandardDecl.st!=null) $lst.add($formalParameterStandardDecl.st); })* formalParameterVarargDecl?)   
    ; 
    
formalParameterStandardDecl
    :   ^(FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId) -> template(type={$type.st}, id={$variableDeclaratorId.st}) "<id>"
    ;
    
formalParameterVarargDecl
    :   ^(FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId)
    ;
    
qualifiedIdentifier
    :   IDENT
    |   ^(DOT qualifiedIdentifier IDENT)
    ;
    
// ANNOTATIONS

annotationList
    :   ^(ANNOTATION_LIST annotation*)
    ;

annotation
    :   ^(AT qualifiedIdentifier annotationInit?)
    ;
    
annotationInit
    :   ^(ANNOTATION_INIT_BLOCK annotationInitializers)
    ;

annotationInitializers
    :   ^(ANNOTATION_INIT_KEY_LIST annotationInitializer+)
    |   ^(ANNOTATION_INIT_DEFAULT_KEY annotationElementValue)
    ;
    
annotationInitializer
    :   ^(IDENT annotationElementValue)
    ;
    
annotationElementValue
    :   ^(ANNOTATION_INIT_ARRAY_ELEMENT annotationElementValue*)
    |   annotation
    |   expression
    ;
    
annotationTopLevelScope
    :   ^(ANNOTATION_TOP_LEVEL_SCOPE annotationScopeDeclarations*)
    ;
    
annotationScopeDeclarations
    :   ^(ANNOTATION_METHOD_DECL modifierList type IDENT annotationDefaultValue?)
    |   ^(VAR_DECLARATION modifierList type variableDeclaratorList)
    |   typeDeclaration
    ;
    
annotationDefaultValue
    :   ^(DEFAULT annotationElementValue)
    ;

// STATEMENTS / BLOCKS

block
scope{
  List<StringTemplate> statements;
}
@init {
  $block::statements = new ArrayList<StringTemplate>();
}
    :   ^(BLOCK_SCOPE (blockStatement {if ($blockStatement.st!=null) $block::statements.add($blockStatement.st);})*) -> block(statements={$block::statements})
    ;
    
blockStatement
    :   localVariableDeclaration {$blockStatement.st = $localVariableDeclaration.st;}
    |   typeDeclaration {$blockStatement.st = $typeDeclaration.st;}
    |   statement {$blockStatement.st = $statement.st;}
    ;
    
localVariableDeclaration
    :   ^(VAR_DECLARATION localModifierList type variableDeclaratorList)
        -> localVariableDeclaration(modifiers={$localModifierList.st}, type={$type.st}, declarators={$variableDeclaratorList.lst})
    ;
    
        
statement
    :   block {$statement.st = $block.st;}
    |   ^(ASSERT a1=expression b1=expression?)
        -> assert(expressionA={$a1.st},expressionB={$b1.st})
    |   ^(IF parenthesizedExpression a2=statement b2=statement?)
        -> if(parenthesizedExpression={$parenthesizedExpression.st}, statement={$a2.st}, elsestatement={$b2.st})
    |   ^(FOR forInit forCondition forUpdater stmnt=statement)
        -> for(forInit={$forInit.st}, forCondition={$forCondition.st}, forUpdater={$forUpdater.st}, statement={$stmnt.st})
    |   ^(FOR_EACH localModifierList type IDENT expression stmnt=statement)
        -> foreach(modifiers={$localModifierList.st}, type={$type.st}, id={$IDENT.text}, expression={$expression.st}, statement={$stmnt.st}) 
    |   ^(WHILE parenthesizedExpression stmnt=statement)
        -> while(parenthesizedExpression={$parenthesizedExpression.st}, statement={$stmnt.st})
    |   ^(DO stmnt=statement parenthesizedExpression)
        -> do(statement={$stmnt.st}, parenthesizedExpression={$parenthesizedExpression.st})
    |   ^(TRY tryblock=block catches? restblock=block?)  // The second optional block is the optional finally block.
        -> try(tryblock={$tryblock.st},catches={$catches.st},restblock={$restblock.st}) 
    |   ^(SWITCH parenthesizedExpression switchBlockLabels)
    |   ^(SYNCHRONIZED parenthesizedExpression block)
        -> template(block={$block.st}) "/*synchronized*/ <block>"
    |   ^(RETURN expression?)
        -> return(expression={$expression.st})
    |   ^(THROW expression)
        -> throw(expression={$expression.st})
    |   ^(BREAK IDENT?)
        -> break(ident={$IDENT.text})
    |   ^(CONTINUE IDENT?)
        -> continue(ident={$IDENT.text})
    |   ^(LABELED_STATEMENT IDENT stmnt=statement)
        -> template(statement={$stmnt.st}) "/*labeled*/ <statement>"
    |   expression -> statement(expression={$expression.st})
    |   SEMI // Empty statement.
    ;
        
catches
    :   ^(CATCH_CLAUSE_LIST catchClause+)
    ;
    
catchClause
    :   ^(CATCH formalParameterStandardDecl block)
    ;

switchBlockLabels
    :   ^(SWITCH_BLOCK_LABEL_LIST switchCaseLabel* switchDefaultLabel? switchCaseLabel*)
    ;
        
switchCaseLabel
    :   ^(CASE expression blockStatement*)
    ;
    
switchDefaultLabel
    :   ^(DEFAULT blockStatement*)
    ;
    
forInit
    :   ^(FOR_INIT 
          (
             localVariableDeclaration 
          | (expressions+=expression)*
          )
        ?)
        -> forinit(localVariableDeclaration={$localVariableDeclaration.st}, expressions={$expressions})
    ;
    
forCondition
    :   ^(FOR_CONDITION (expression {$forCondition.st = $expression.st;})?)
    ;
    
forUpdater
    :   ^(FOR_UPDATE (expressions+=expression)*)
        -> forUpdater(expressions={$expressions})
    ;
    
// EXPRESSIONS

parenthesizedExpression
    :   ^(PARENTESIZED_EXPR expression)
        ->parenthesizedExpression(expression={$expression.st})
    ;
    
expression
    :   ^(EXPR expr {$expression.st = $expr.st;})
    ;

expr
    :   ^(ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"="},b={$b.st})
    |   ^(PLUS_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"+="},b={$b.st})
    |   ^(MINUS_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"-="},b={$b.st})
    |   ^(STAR_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"*="},b={$b.st})
    |   ^(DIV_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"/="},b={$b.st})
    |   ^(AND_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"&="},b={$b.st})
    |   ^(OR_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"|="},b={$b.st})
    |   ^(XOR_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"^="},b={$b.st})
    |   ^(MOD_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"\%="},b={$b.st})
    |   ^(BIT_SHIFT_RIGHT_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={">>>="},b={$b.st})
    |   ^(SHIFT_RIGHT_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={">>="},b={$b.st})
    |   ^(SHIFT_LEFT_ASSIGN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"<<="},b={$b.st})
    |   ^(QUESTION a=expr b=expr expr) 
    |   ^(LOGICAL_OR a=expr b=expr)  -> infix_binary_expr(a={$a.st},op={"||"},b={$b.st})
    |   ^(LOGICAL_AND a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"&&"},b={$b.st})
    |   ^(OR a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"|"},b={$b.st})
    |   ^(XOR a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"^"},b={$b.st})
    |   ^(AND a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"&"},b={$b.st})
    |   ^(EQUAL a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"=="},b={$b.st})
    |   ^(NOT_EQUAL a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"!="},b={$b.st})
    |   ^(INSTANCEOF expr type)
    |   ^(LESS_OR_EQUAL a=expr b=expr)  -> infix_binary_expr(a={$a.st},op={"<="},b={$b.st})
    |   ^(GREATER_OR_EQUAL a=expr b=expr) -> infix_binary_expr(a={$a.st},op={">="},b={$b.st})
    |   ^(BIT_SHIFT_RIGHT a=expr b=expr) -> infix_binary_expr(a={$a.st},op={">>>"},b={$b.st})
    |   ^(SHIFT_RIGHT a=expr b=expr) -> infix_binary_expr(a={$a.st},op={">>"},b={$b.st})
    |   ^(GREATER_THAN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={">"},b={$b.st})
    |   ^(SHIFT_LEFT a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"<<"},b={$b.st})
    |   ^(LESS_THAN a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"<"},b={$b.st})
    |   ^(PLUS a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"+"},b={$b.st})
    |   ^(MINUS a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"-"},b={$b.st})
    |   ^(STAR a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"*"},b={$b.st})
    |   ^(DIV a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"/"},b={$b.st})
    |   ^(MOD a=expr b=expr) -> infix_binary_expr(a={$a.st},op={"\%"},b={$b.st})
    |   ^(UNARY_PLUS a=expr) -> prefix_unary_expr(op={"+"},a={$a.st})
    |   ^(UNARY_MINUS a=expr) -> prefix_unary_expr(op={"-"},a={$a.st}) 
    |   ^(PRE_INC a=expr) -> prefix_unary_expr(op={"++"},a={$a.st})
    |   ^(PRE_DEC a=expr) -> prefix_unary_expr(op={"--"},a={$a.st})
    |   ^(POST_INC a=expr) -> postfix_unary_expr(op={"++"},a={$a.st})
    |   ^(POST_DEC a=expr) -> postfix_unary_expr(op={"--"},a={$a.st})
    |   ^(NOT a=expr) -> prefix_unary_expr(op={"!"},a={$a.st})
    |   ^(LOGICAL_NOT a=expr)
    |   ^(CAST_EXPR type expr)
    |   primaryExpression { $expr.st = $primaryExpression.st;}
    ;
    
primaryExpression
    :   ^(  DOT
            (   pexr=primaryExpression       
                (   IDENT                    -> template(exp={$pexr.st},id={$IDENT.text}) "<exp>-><id>"
                |   THIS                     -> template(exp={$pexr.st})                  "<exp>.this"
                |   SUPER                    -> template(exp={$pexr.st},id={$IDENT.text}) "<exp>.super"
                |   iexp=innerNewExpression  -> template(pexp={$pexr.st},iexp={$iexp.st}) "<pexp>-><iexp>"
                |   CLASS                    -> template(exp={$pexr.st},id={$IDENT.text}) "<exp>.class"
                )
            |   primitiveType CLASS
            |   VOID CLASS
            )
        )
    |   parenthesizedExpression {$primaryExpression.st = $parenthesizedExpression.st;}
    |   IDENT 
        {
          String _ident = $IDENT.text;
          JSource imprint = this.observer.getGrammarImprint();
          JClassDeclaration cls = imprint.getClassDeclaration($typeDeclaration::identText);
          JMethodDeclaration mtd = ($classScopeDeclarations::methodname!=null) ? cls.findDefinedMethod($classScopeDeclarations::methodname) : null;
        
          if (cls != null) {
            //check if ident was declared inside the current class as method or property            
            if (cls.hasVariable(_ident)){ 
              _ident = "\$this->" + _ident;              
            } else if (cls.hasMethod(_ident)) {
              _ident = "\$this->" + _ident;
            }
            //check if ident is a locally defined variable or bypassed method's parameter 
            else if ( mtd != null) {
              if (mtd.hasLocalVariable(_ident)) {
                _ident = "\$" + _ident;
              } else if(mtd.hasFormalParameter(_ident)) {
                _ident = "\$" + _ident;
              } else {
                // maybe a static call - do nothing
              }
            }
            
          }
          retval.st = new StringTemplate(templateLib,_ident);
        }                          
    |   ^(METHOD_CALL pexp=primaryExpression genericTypeArgumentList? arguments)
        -> methodcall(primaryExpression={$pexp.st}, genericTypeArgumentList={$genericTypeArgumentList.st}, arguments={$arguments.lst})
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS primaryExpression expression)
    |   literal {$primaryExpression.st = $literal.st;}
    |   newExpression
    |   THIS -> template() "$this->"
    |   arrayTypeDeclarator
    |   SUPER -> template() "parent::"
    ;
    
explicitConstructorCall
    :   ^(THIS_CONSTRUCTOR_CALL genericTypeArgumentList? arguments)
    |   ^(SUPER_CONSTRUCTOR_CALL primaryExpression? genericTypeArgumentList? arguments)
    ;

arrayTypeDeclarator
    :   ^(ARRAY_DECLARATOR (arrayTypeDeclarator | qualifiedIdentifier | primitiveType))
    ;

newExpression
    :   ^(  STATIC_ARRAY_CREATOR
            (   primitiveType newArrayConstruction
            |   genericTypeArgumentList? qualifiedTypeIdent newArrayConstruction
            )
        )
    |   ^(CLASS_CONSTRUCTOR_CALL genericTypeArgumentList? qualifiedTypeIdent arguments classTopLevelScope?)
    ;

innerNewExpression // something like 'InnerType innerType = outer.new InnerType();'
    :   ^(CLASS_CONSTRUCTOR_CALL genericTypeArgumentList? IDENT arguments classTopLevelScope?)
    ;
    
newArrayConstruction
    :   arrayDeclaratorList arrayInitializer
    |   expression+ arrayDeclaratorList?
    ;

arguments returns[List<StringTemplate> lst]
@init{
  $lst = new ArrayList<StringTemplate>();
}
    :   ^(ARGUMENT_LIST (expression {if ($expression.st!=null) $lst.add($expression.st);})*)
    ;

literal 
    :   HEX_LITERAL -> template(v={$HEX_LITERAL.text}) "<v>"
    |   OCTAL_LITERAL -> template(v={$OCTAL_LITERAL.text}) "<v>"
    |   DECIMAL_LITERAL -> template(v={$DECIMAL_LITERAL.text}) "<v>"
    |   FLOATING_POINT_LITERAL -> template(v={$FLOATING_POINT_LITERAL.text}) "<v>"
    |   CHARACTER_LITERAL -> template(v={$CHARACTER_LITERAL.text}) "<v>"
    |   STRING_LITERAL -> template(v={$STRING_LITERAL.text}) "<v>"
    |   TRUE -> template(v={$TRUE.text}) "<v>"
    |   FALSE -> template(v={$FALSE.text}) "<v>"
    |   NULL -> template(v={$NULL.text}) "<v>"
    ;
