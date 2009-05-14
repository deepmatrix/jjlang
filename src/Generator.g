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
}

@treeparser::members {
    
    GenerationObserver observer;
    
    public void SetObserver(GenerationObserver observer) {
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
}
@init {
  $typeDeclaration::gtypList = new ArrayList();
  $typeDeclaration::extClause = new ArrayList();
  $typeDeclaration::implClause = new ArrayList();  
}
    :   ^(CLASS modifierList IDENT (genericTypeParameterList)? (extendsClause)? (implementsClause)? classTopLevelScope)
          -> classDeclaration(modifiers={$modifierList.lst}, name={$IDENT.text}, genericTypeParameters={$typeDeclaration::gtypList}, extendsClause={$typeDeclaration::extClause}, implementsClause={$typeDeclaration::implClause}, classTopLevelScope={$classTopLevelScope.st})
    |   ^(INTERFACE modifierList IDENT (genericTypeParameterList)? (extendsClause)? interfaceTopLevelScope)
          -> interfaceDeclaration(modifiers={$modifierList.lst}, name={$IDENT.text}, genericTypeParameters={$typeDeclaration::gtypList}, extendsClause={$typeDeclaration::extClause}, interfaceTopLevelScope={$interfaceTopLevelScope.st})
    |   ^(ENUM modifierList IDENT implementsClause? enumTopLevelScope)
          -> enumDeclaration(modifiers={$modifierList.lst}, name={$IDENT.text}, implementsClause={$typeDeclaration::implClause}, enumTopLevelScope={$enumTopLevelScope.st})
    |   ^(AT modifierList IDENT annotationTopLevelScope)
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
    :   ^(CLASS_INSTANCE_INITIALIZER block)
    |   ^(CLASS_STATIC_INITIALIZER block)
    |   ^(FUNCTION_METHOD_DECL modifierList genericTypeParameterList? type IDENT formalParameterList arrayDeclaratorList? throwsClause? block?)
          -> functionDeclaration(modifiers={$modifierList.lst}, type={$type.st}, ident={$IDENT.text}, parameters={$formalParameterList.lst}, block={$block.st})
    |   ^(VOID_METHOD_DECL modifierList genericTypeParameterList? IDENT formalParameterList throwsClause? block?)
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
    |   expression
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
    :   ^(FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId) -> template(type={$type.st}, variableDeclaratorId={$variableDeclaratorId.st}) "$if(type)$ $type$ $variableDeclaratorId$$else$$variableDeclaratorId$$endif$"
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
    ;
    
        
statement
    :   block
    |   ^(ASSERT expression expression?)
    |   ^(IF parenthesizedExpression statement statement?)
    |   ^(FOR forInit forCondition forUpdater statement)
    |   ^(FOR_EACH localModifierList type IDENT expression statement) 
    |   ^(WHILE parenthesizedExpression statement)
    |   ^(DO statement parenthesizedExpression)
    |   ^(TRY block catches? block?)  // The second optional block is the optional finally block.
    |   ^(SWITCH parenthesizedExpression switchBlockLabels)
    |   ^(SYNCHRONIZED parenthesizedExpression block)
    |   ^(RETURN expression?)
    |   ^(THROW expression)
    |   ^(BREAK IDENT?)
    |   ^(CONTINUE IDENT?)
    |   ^(LABELED_STATEMENT IDENT statement)
    |   expression
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
    :   ^(FOR_INIT (localVariableDeclaration | expression*)?)
    ;
    
forCondition
    :   ^(FOR_CONDITION expression?)
    ;
    
forUpdater
    :   ^(FOR_UPDATE expression*)
    ;
    
// EXPRESSIONS

parenthesizedExpression
    :   ^(PARENTESIZED_EXPR expression)
    ;
    
expression
    :   ^(EXPR expr)
    ;

expr
    :   ^(ASSIGN expr expr)
    |   ^(PLUS_ASSIGN expr expr)
    |   ^(MINUS_ASSIGN expr expr)
    |   ^(STAR_ASSIGN expr expr)
    |   ^(DIV_ASSIGN expr expr)
    |   ^(AND_ASSIGN expr expr)
    |   ^(OR_ASSIGN expr expr)
    |   ^(XOR_ASSIGN expr expr)
    |   ^(MOD_ASSIGN expr expr)
    |   ^(BIT_SHIFT_RIGHT_ASSIGN expr expr)
    |   ^(SHIFT_RIGHT_ASSIGN expr expr)
    |   ^(SHIFT_LEFT_ASSIGN expr expr)
    |   ^(QUESTION expr expr expr)
    |   ^(LOGICAL_OR expr expr)
    |   ^(LOGICAL_AND expr expr)
    |   ^(OR expr expr)
    |   ^(XOR expr expr)
    |   ^(AND expr expr)
    |   ^(EQUAL expr expr)
    |   ^(NOT_EQUAL expr expr)
    |   ^(INSTANCEOF expr type)
    |   ^(LESS_OR_EQUAL expr expr)
    |   ^(GREATER_OR_EQUAL expr expr)
    |   ^(BIT_SHIFT_RIGHT expr expr)
    |   ^(SHIFT_RIGHT expr expr)
    |   ^(GREATER_THAN expr expr)
    |   ^(SHIFT_LEFT expr expr)
    |   ^(LESS_THAN expr expr)
    |   ^(PLUS expr expr)
    |   ^(MINUS expr expr)
    |   ^(STAR expr expr)
    |   ^(DIV expr expr)
    |   ^(MOD expr expr)
    |   ^(UNARY_PLUS expr)
    |   ^(UNARY_MINUS expr)
    |   ^(PRE_INC expr)
    |   ^(PRE_DEC expr)
    |   ^(POST_INC expr)
    |   ^(POST_DEC expr)
    |   ^(NOT expr)
    |   ^(LOGICAL_NOT expr)
    |   ^(CAST_EXPR type expr)
    |   primaryExpression
    ;
    
primaryExpression
    :   ^(  DOT
            (   primaryExpression
                (   IDENT
                |   THIS
                |   SUPER
                |   innerNewExpression
                |   CLASS
                )
            |   primitiveType CLASS
            |   VOID CLASS
            )
        )
    |   parenthesizedExpression
    |   IDENT
    |   ^(METHOD_CALL primaryExpression genericTypeArgumentList? arguments)
    |   explicitConstructorCall
    |   ^(ARRAY_ELEMENT_ACCESS primaryExpression expression)
    |   literal
    |   newExpression
    |   THIS
    |   arrayTypeDeclarator
    |   SUPER
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

arguments
    :   ^(ARGUMENT_LIST expression*)
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
