// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g 2009-05-28 16:11:17

package org.javajavalang;

import org.javajavalang.JavaImprinting.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
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
public class Generator extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ASSIGN", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", "COLON", "COMMA", "DEC", "DIV", "DIV_ASSIGN", "DOT", "DOTSTAR", "ELLIPSIS", "EQUAL", "GREATER_OR_EQUAL", "GREATER_THAN", "INC", "LBRACK", "LCURLY", "LESS_OR_EQUAL", "LESS_THAN", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LPAREN", "MINUS", "MINUS_ASSIGN", "MOD", "MOD_ASSIGN", "NOT", "NOT_EQUAL", "OR", "OR_ASSIGN", "PLUS", "PLUS_ASSIGN", "QUESTION", "RBRACK", "RCURLY", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", "SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "STAR", "STAR_ASSIGN", "XOR", "XOR_ASSIGN", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INTERFACE", "IMPORT", "INT", "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE", "ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", "ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", "ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", "ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", "BLOCK_SCOPE", "CAST_EXPR", "CATCH_CLAUSE_LIST", "CLASS_CONSTRUCTOR_CALL", "CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", "CONSTRUCTOR_DECL", "ENUM_TOP_LEVEL_SCOPE", "EXPR", "EXTENDS_BOUND_LIST", "EXTENDS_CLAUSE", "FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", "FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", "FORMAL_PARAM_VARARG_DECL", "FUNCTION_METHOD_DECL", "GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", "INTERFACE_TOP_LEVEL_SCOPE", "IMPLEMENTS_CLAUSE", "LABELED_STATEMENT", "LOCAL_MODIFIER_LIST", "JAVA_SOURCE", "METHOD_CALL", "MODIFIER_LIST", "PARENTESIZED_EXPR", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "QUALIFIED_TYPE_IDENT", "STATIC_ARRAY_CREATOR", "SUPER_CONSTRUCTOR_CALL", "SWITCH_BLOCK_LABEL_LIST", "THIS_CONSTRUCTOR_CALL", "THROWS_CLAUSE", "TYPE", "UNARY_MINUS", "UNARY_PLUS", "VAR_DECLARATION", "VAR_DECLARATOR", "VAR_DECLARATOR_LIST", "VOID_METHOD_DECL", "IDENT", "HEX_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "HEX_DIGIT", "INTEGER_TYPE_SUFFIX", "EXPONENT", "FLOAT_TYPE_SUFFIX", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "OCTAL_ESCAPE", "JAVA_ID_START", "JAVA_ID_PART", "WS", "COMMENT", "LINE_COMMENT"
    };
    public static final int PACKAGE=84;
    public static final int EXPONENT=173;
    public static final int STAR=49;
    public static final int WHILE=103;
    public static final int MOD=32;
    public static final int MOD_ASSIGN=33;
    public static final int CASE=58;
    public static final int CHAR=60;
    public static final int NEW=82;
    public static final int DO=64;
    public static final int GENERIC_TYPE_PARAM_LIST=138;
    public static final int CLASS_INSTANCE_INITIALIZER=121;
    public static final int ARRAY_ELEMENT_ACCESS=115;
    public static final int FOR_CONDITION=129;
    public static final int NOT=34;
    public static final int VAR_DECLARATION=160;
    public static final int ANNOTATION_METHOD_DECL=109;
    public static final int EOF=-1;
    public static final int DIV_ASSIGN=14;
    public static final int BREAK=56;
    public static final int LOGICAL_AND=26;
    public static final int BIT_SHIFT_RIGHT_ASSIGN=9;
    public static final int UNARY_PLUS=159;
    public static final int TYPE=157;
    public static final int FINAL=70;
    public static final int INC=21;
    public static final int RPAREN=43;
    public static final int IMPORT=78;
    public static final int STRING_LITERAL=170;
    public static final int FOR_UPDATE=132;
    public static final int FLOATING_POINT_LITERAL=168;
    public static final int CAST_EXPR=118;
    public static final int NOT_EQUAL=35;
    public static final int VOID_METHOD_DECL=163;
    public static final int RETURN=88;
    public static final int THIS=95;
    public static final int DOUBLE=65;
    public static final int VOID=101;
    public static final int ENUM_TOP_LEVEL_SCOPE=125;
    public static final int SUPER=92;
    public static final int COMMENT=181;
    public static final int ANNOTATION_INIT_KEY_LIST=107;
    public static final int JAVA_ID_START=178;
    public static final int FLOAT_TYPE_SUFFIX=174;
    public static final int PRE_DEC=149;
    public static final int RBRACK=41;
    public static final int IMPLEMENTS_CLAUSE=140;
    public static final int SWITCH_BLOCK_LABEL_LIST=154;
    public static final int LINE_COMMENT=182;
    public static final int PRIVATE=85;
    public static final int STATIC=90;
    public static final int BLOCK_SCOPE=117;
    public static final int ANNOTATION_INIT_DEFAULT_KEY=106;
    public static final int SWITCH=93;
    public static final int NULL=83;
    public static final int VAR_DECLARATOR=161;
    public static final int MINUS_ASSIGN=31;
    public static final int ELSE=66;
    public static final int STRICTFP=91;
    public static final int CHARACTER_LITERAL=169;
    public static final int PRE_INC=150;
    public static final int ANNOTATION_LIST=108;
    public static final int ELLIPSIS=17;
    public static final int NATIVE=81;
    public static final int OCTAL_ESCAPE=177;
    public static final int UNARY_MINUS=158;
    public static final int THROWS=97;
    public static final int LCURLY=23;
    public static final int INT=79;
    public static final int FORMAL_PARAM_VARARG_DECL=135;
    public static final int METHOD_CALL=144;
    public static final int ASSERT=54;
    public static final int TRY=100;
    public static final int INTERFACE_TOP_LEVEL_SCOPE=139;
    public static final int SHIFT_LEFT=45;
    public static final int WS=180;
    public static final int SHIFT_RIGHT=47;
    public static final int FORMAL_PARAM_STD_DECL=134;
    public static final int LOCAL_MODIFIER_LIST=142;
    public static final int OR=36;
    public static final int LESS_THAN=25;
    public static final int SHIFT_RIGHT_ASSIGN=48;
    public static final int EXTENDS_BOUND_LIST=127;
    public static final int JAVA_SOURCE=143;
    public static final int CATCH=59;
    public static final int FALSE=69;
    public static final int INTEGER_TYPE_SUFFIX=172;
    public static final int DECIMAL_LITERAL=167;
    public static final int THROW=96;
    public static final int FOR_INIT=131;
    public static final int PROTECTED=86;
    public static final int DEC=12;
    public static final int CLASS=61;
    public static final int LBRACK=22;
    public static final int BIT_SHIFT_RIGHT=8;
    public static final int THROWS_CLAUSE=156;
    public static final int GREATER_OR_EQUAL=19;
    public static final int FOR=73;
    public static final int LOGICAL_NOT=27;
    public static final int THIS_CONSTRUCTOR_CALL=155;
    public static final int FLOAT=72;
    public static final int ABSTRACT=53;
    public static final int AND=4;
    public static final int POST_DEC=147;
    public static final int AND_ASSIGN=5;
    public static final int ANNOTATION_SCOPE=110;
    public static final int MODIFIER_LIST=145;
    public static final int STATIC_ARRAY_CREATOR=152;
    public static final int LPAREN=29;
    public static final int IF=74;
    public static final int AT=7;
    public static final int CONSTRUCTOR_DECL=124;
    public static final int ESCAPE_SEQUENCE=175;
    public static final int LABELED_STATEMENT=141;
    public static final int UNICODE_ESCAPE=176;
    public static final int BOOLEAN=55;
    public static final int SYNCHRONIZED=94;
    public static final int EXPR=126;
    public static final int CLASS_TOP_LEVEL_SCOPE=123;
    public static final int IMPLEMENTS=75;
    public static final int CONTINUE=62;
    public static final int COMMA=11;
    public static final int TRANSIENT=98;
    public static final int XOR_ASSIGN=52;
    public static final int EQUAL=18;
    public static final int LOGICAL_OR=28;
    public static final int ARGUMENT_LIST=112;
    public static final int QUALIFIED_TYPE_IDENT=151;
    public static final int IDENT=164;
    public static final int PLUS=38;
    public static final int ANNOTATION_INIT_BLOCK=105;
    public static final int HEX_LITERAL=165;
    public static final int DOT=15;
    public static final int SHIFT_LEFT_ASSIGN=46;
    public static final int FORMAL_PARAM_LIST=133;
    public static final int GENERIC_TYPE_ARG_LIST=137;
    public static final int DOTSTAR=16;
    public static final int ANNOTATION_TOP_LEVEL_SCOPE=111;
    public static final int BYTE=57;
    public static final int XOR=51;
    public static final int JAVA_ID_PART=179;
    public static final int GREATER_THAN=20;
    public static final int VOLATILE=102;
    public static final int PARENTESIZED_EXPR=146;
    public static final int LESS_OR_EQUAL=24;
    public static final int ARRAY_DECLARATOR_LIST=114;
    public static final int CLASS_STATIC_INITIALIZER=122;
    public static final int DEFAULT=63;
    public static final int OCTAL_LITERAL=166;
    public static final int HEX_DIGIT=171;
    public static final int SHORT=89;
    public static final int INSTANCEOF=76;
    public static final int MINUS=30;
    public static final int SEMI=44;
    public static final int TRUE=99;
    public static final int EXTENDS_CLAUSE=128;
    public static final int STAR_ASSIGN=50;
    public static final int VAR_DECLARATOR_LIST=162;
    public static final int COLON=10;
    public static final int ARRAY_DECLARATOR=113;
    public static final int OR_ASSIGN=37;
    public static final int ENUM=67;
    public static final int QUESTION=40;
    public static final int FINALLY=71;
    public static final int RCURLY=42;
    public static final int ASSIGN=6;
    public static final int PLUS_ASSIGN=39;
    public static final int ANNOTATION_INIT_ARRAY_ELEMENT=104;
    public static final int FUNCTION_METHOD_DECL=136;
    public static final int INTERFACE=77;
    public static final int DIV=13;
    public static final int POST_INC=148;
    public static final int LONG=80;
    public static final int CLASS_CONSTRUCTOR_CALL=120;
    public static final int PUBLIC=87;
    public static final int EXTENDS=68;
    public static final int FOR_EACH=130;
    public static final int ARRAY_INITIALIZER=116;
    public static final int CATCH_CLAUSE_LIST=119;
    public static final int SUPER_CONSTRUCTOR_CALL=153;

    // delegates
    // delegators


        public Generator(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Generator(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[289+1];
             
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("GeneratorTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return Generator.tokenNames; }
    public String getGrammarFileName() { return "C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g"; }


        
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


    protected static class targetSource_scope {
        StringTemplate packageName;
        List importStatements;
        List typeStatements;
    }
    protected Stack targetSource_stack = new Stack();

    public static class targetSource_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "targetSource"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:128:1: targetSource : ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* typeDeclarations ) -> targetSource(packageName=$targetSource::packageNameimportStms=$targetSource::importStatementstypeStms=$targetSource::typeStatements);
    public final Generator.targetSource_return targetSource() throws RecognitionException {
        targetSource_stack.push(new targetSource_scope());
        Generator.targetSource_return retval = new Generator.targetSource_return();
        retval.start = input.LT(1);
        int targetSource_StartIndex = input.index();

          ((targetSource_scope)targetSource_stack.peek()).packageName = new StringTemplate();  
          ((targetSource_scope)targetSource_stack.peek()).importStatements = new ArrayList();
          ((targetSource_scope)targetSource_stack.peek()).typeStatements = new ArrayList();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:139:5: ( ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* typeDeclarations ) -> targetSource(packageName=$targetSource::packageNameimportStms=$targetSource::importStatementstypeStms=$targetSource::typeStatements))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:139:9: ^( JAVA_SOURCE annotationList ( packageDeclaration )? ( importDeclaration )* typeDeclarations )
            {
            match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_targetSource103); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_targetSource105);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:139:38: ( packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: packageDeclaration
                    {
                    pushFollow(FOLLOW_packageDeclaration_in_targetSource107);
                    packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:139:58: ( importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_targetSource110);
            	    importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            pushFollow(FOLLOW_typeDeclarations_in_targetSource113);
            typeDeclarations();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 140:5: -> targetSource(packageName=$targetSource::packageNameimportStms=$targetSource::importStatementstypeStms=$targetSource::typeStatements)
              {
                  retval.st = templateLib.getInstanceOf("targetSource",
                new STAttrMap().put("packageName", ((targetSource_scope)targetSource_stack.peek()).packageName).put("importStms", ((targetSource_scope)targetSource_stack.peek()).importStatements).put("typeStms", ((targetSource_scope)targetSource_stack.peek()).typeStatements));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, targetSource_StartIndex); }
            targetSource_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "targetSource"

    public static class packageDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "packageDeclaration"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:146:1: packageDeclaration : ^( PACKAGE qualifiedIdentifier ) ;
    public final Generator.packageDeclaration_return packageDeclaration() throws RecognitionException {
        Generator.packageDeclaration_return retval = new Generator.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        Generator.qualifiedIdentifier_return qualifiedIdentifier1 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:147:5: ( ^( PACKAGE qualifiedIdentifier ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:147:9: ^( PACKAGE qualifiedIdentifier )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration179); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration181);
            qualifiedIdentifier1=qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((targetSource_scope)targetSource_stack.peek()).packageName =(qualifiedIdentifier1!=null?qualifiedIdentifier1.st:null);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 2, packageDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "packageDeclaration"

    public static class importDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "importDeclaration"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:151:1: importDeclaration : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final Generator.importDeclaration_return importDeclaration() throws RecognitionException {
        Generator.importDeclaration_return retval = new Generator.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        Generator.qualifiedIdentifier_return qualifiedIdentifier2 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:152:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:152:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration215); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:152:18: ( STATIC )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==STATIC) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: STATIC
                    {
                    match(input,STATIC,FOLLOW_STATIC_in_importDeclaration217); if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration220);
            qualifiedIdentifier2=qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:152:46: ( DOTSTAR )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==DOTSTAR) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: DOTSTAR
                    {
                    match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration222); if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              ((targetSource_scope)targetSource_stack.peek()).importStatements.add((qualifiedIdentifier2!=null?qualifiedIdentifier2.st:null));
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 3, importDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "importDeclaration"

    public static class typeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeDeclarations"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:156:1: typeDeclarations : (tdecl+= typeDeclaration )* ;
    public final Generator.typeDeclarations_return typeDeclarations() throws RecognitionException {
        Generator.typeDeclarations_return retval = new Generator.typeDeclarations_return();
        retval.start = input.LT(1);
        int typeDeclarations_StartIndex = input.index();
        List list_tdecl=null;
        Generator.typeDeclaration_return tdecl = null;
         tdecl = null;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:157:3: ( (tdecl+= typeDeclaration )* )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:157:5: (tdecl+= typeDeclaration )*
            {
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:157:5: (tdecl+= typeDeclaration )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==AT||LA5_0==CLASS||LA5_0==ENUM||LA5_0==INTERFACE) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:157:6: tdecl+= typeDeclaration
            	    {
            	    pushFollow(FOLLOW_typeDeclaration_in_typeDeclarations250);
            	    tdecl=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_tdecl==null) list_tdecl=new ArrayList();
            	    list_tdecl.add(tdecl.getTemplate());


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
              ((targetSource_scope)targetSource_stack.peek()).typeStatements.addAll(list_tdecl);
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, typeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclarations"

    protected static class typeDeclaration_scope {
        List gtypList;
        List extClause;
        List implClause;
        String identText;
    }
    protected Stack typeDeclaration_stack = new Stack();

    public static class typeDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeDeclaration"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:160:1: typeDeclaration : ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) -> classDeclaration(modifiers=$modifierList.lstname=$IDENT.textgenericTypeParameters=$typeDeclaration::gtypListextendsClause=$typeDeclaration::extClauseimplementsClause=$typeDeclaration::implClauseclassTopLevelScope=$classTopLevelScope.st) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) -> interfaceDeclaration(modifiers=$modifierList.lstname=$IDENT.textgenericTypeParameters=$typeDeclaration::gtypListextendsClause=$typeDeclaration::extClauseinterfaceTopLevelScope=$interfaceTopLevelScope.st) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) -> enumDeclaration(modifiers=$modifierList.lstname=$IDENT.textimplementsClause=$typeDeclaration::implClauseenumTopLevelScope=$enumTopLevelScope.st) | ^( AT modifierList IDENT annotationTopLevelScope ) -> atDeclaration(modifiers=$modifierList.lstname=$IDENT.textannotationTopLevelScope=$annotationTopLevelScope.st));
    public final Generator.typeDeclaration_return typeDeclaration() throws RecognitionException {
        typeDeclaration_stack.push(new typeDeclaration_scope());
        Generator.typeDeclaration_return retval = new Generator.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        CommonTree IDENT3=null;
        CommonTree IDENT6=null;
        CommonTree IDENT9=null;
        CommonTree IDENT12=null;
        Generator.modifierList_return modifierList4 = null;

        Generator.classTopLevelScope_return classTopLevelScope5 = null;

        Generator.modifierList_return modifierList7 = null;

        Generator.interfaceTopLevelScope_return interfaceTopLevelScope8 = null;

        Generator.modifierList_return modifierList10 = null;

        Generator.enumTopLevelScope_return enumTopLevelScope11 = null;

        Generator.modifierList_return modifierList13 = null;

        Generator.annotationTopLevelScope_return annotationTopLevelScope14 = null;



          ((typeDeclaration_scope)typeDeclaration_stack.peek()).gtypList = new ArrayList();
          ((typeDeclaration_scope)typeDeclaration_stack.peek()).extClause = new ArrayList();
          ((typeDeclaration_scope)typeDeclaration_stack.peek()).implClause = new ArrayList();  

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) -> classDeclaration(modifiers=$modifierList.lstname=$IDENT.textgenericTypeParameters=$typeDeclaration::gtypListextendsClause=$typeDeclaration::extClauseimplementsClause=$typeDeclaration::implClauseclassTopLevelScope=$classTopLevelScope.st) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) -> interfaceDeclaration(modifiers=$modifierList.lstname=$IDENT.textgenericTypeParameters=$typeDeclaration::gtypListextendsClause=$typeDeclaration::extClauseinterfaceTopLevelScope=$interfaceTopLevelScope.st) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) -> enumDeclaration(modifiers=$modifierList.lstname=$IDENT.textimplementsClause=$typeDeclaration::implClauseenumTopLevelScope=$enumTopLevelScope.st) | ^( AT modifierList IDENT annotationTopLevelScope ) -> atDeclaration(modifiers=$modifierList.lstname=$IDENT.textannotationTopLevelScope=$annotationTopLevelScope.st))
            int alt12=4;
            switch ( input.LA(1) ) {
            case CLASS:
                {
                alt12=1;
                }
                break;
            case INTERFACE:
                {
                alt12=2;
                }
                break;
            case ENUM:
                {
                alt12=3;
                }
                break;
            case AT:
                {
                alt12=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
                    {
                    match(input,CLASS,FOLLOW_CLASS_in_typeDeclaration284); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration286);
                    modifierList4=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    IDENT3=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration288); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((typeDeclaration_scope)typeDeclaration_stack.peek()).identText = (IDENT3!=null?IDENT3.getText():null);
                    }
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:81: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:82: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration293);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:109: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:110: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration298);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:126: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:173:127: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration303);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_classTopLevelScope_in_typeDeclaration307);
                    classTopLevelScope5=classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 174:11: -> classDeclaration(modifiers=$modifierList.lstname=$IDENT.textgenericTypeParameters=$typeDeclaration::gtypListextendsClause=$typeDeclaration::extClauseimplementsClause=$typeDeclaration::implClauseclassTopLevelScope=$classTopLevelScope.st)
                      {
                          retval.st = templateLib.getInstanceOf("classDeclaration",
                        new STAttrMap().put("modifiers", (modifierList4!=null?modifierList4.lst:null)).put("name", (IDENT3!=null?IDENT3.getText():null)).put("genericTypeParameters", ((typeDeclaration_scope)typeDeclaration_stack.peek()).gtypList).put("extendsClause", ((typeDeclaration_scope)typeDeclaration_stack.peek()).extClause).put("implementsClause", ((typeDeclaration_scope)typeDeclaration_stack.peek()).implClause).put("classTopLevelScope", (classTopLevelScope5!=null?classTopLevelScope5.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:175:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration363); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration365);
                    modifierList7=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    IDENT6=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration367); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((typeDeclaration_scope)typeDeclaration_stack.peek()).identText = (IDENT6!=null?IDENT6.getText():null);
                    }
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:175:85: ( genericTypeParameterList )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:175:86: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration372);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:175:113: ( extendsClause )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_CLAUSE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:175:114: extendsClause
                            {
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration377);
                            extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration381);
                    interfaceTopLevelScope8=interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 176:11: -> interfaceDeclaration(modifiers=$modifierList.lstname=$IDENT.textgenericTypeParameters=$typeDeclaration::gtypListextendsClause=$typeDeclaration::extClauseinterfaceTopLevelScope=$interfaceTopLevelScope.st)
                      {
                          retval.st = templateLib.getInstanceOf("interfaceDeclaration",
                        new STAttrMap().put("modifiers", (modifierList7!=null?modifierList7.lst:null)).put("name", (IDENT6!=null?IDENT6.getText():null)).put("genericTypeParameters", ((typeDeclaration_scope)typeDeclaration_stack.peek()).gtypList).put("extendsClause", ((typeDeclaration_scope)typeDeclaration_stack.peek()).extClause).put("interfaceTopLevelScope", (interfaceTopLevelScope8!=null?interfaceTopLevelScope8.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:177:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration432); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration434);
                    modifierList10=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration436); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((typeDeclaration_scope)typeDeclaration_stack.peek()).identText = (IDENT9!=null?IDENT9.getText():null);
                    }
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:177:80: ( implementsClause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==IMPLEMENTS_CLAUSE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: implementsClause
                            {
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration440);
                            implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration443);
                    enumTopLevelScope11=enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 178:11: -> enumDeclaration(modifiers=$modifierList.lstname=$IDENT.textimplementsClause=$typeDeclaration::implClauseenumTopLevelScope=$enumTopLevelScope.st)
                      {
                          retval.st = templateLib.getInstanceOf("enumDeclaration",
                        new STAttrMap().put("modifiers", (modifierList10!=null?modifierList10.lst:null)).put("name", (IDENT9!=null?IDENT9.getText():null)).put("implementsClause", ((typeDeclaration_scope)typeDeclaration_stack.peek()).implClause).put("enumTopLevelScope", (enumTopLevelScope11!=null?enumTopLevelScope11.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:179:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    match(input,AT,FOLLOW_AT_in_typeDeclaration489); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration491);
                    modifierList13=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    IDENT12=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration493); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      ((typeDeclaration_scope)typeDeclaration_stack.peek()).identText = (IDENT12!=null?IDENT12.getText():null);
                    }
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration497);
                    annotationTopLevelScope14=annotationTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 180:11: -> atDeclaration(modifiers=$modifierList.lstname=$IDENT.textannotationTopLevelScope=$annotationTopLevelScope.st)
                      {
                          retval.st = templateLib.getInstanceOf("atDeclaration",
                        new STAttrMap().put("modifiers", (modifierList13!=null?modifierList13.lst:null)).put("name", (IDENT12!=null?IDENT12.getText():null)).put("annotationTopLevelScope", (annotationTopLevelScope14!=null?annotationTopLevelScope14.st:null)));
                      }

                    }
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, typeDeclaration_StartIndex); }
            typeDeclaration_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class extendsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "extendsClause"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:183:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final Generator.extendsClause_return extendsClause() throws RecognitionException {
        Generator.extendsClause_return retval = new Generator.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        Generator.type_return type15 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:185:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:185:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause563); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:185:26: ( type )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TYPE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:185:27: type
            	    {
            	    pushFollow(FOLLOW_type_in_extendsClause566);
            	    type15=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((typeDeclaration_scope)typeDeclaration_stack.peek()).extClause.add((type15!=null?type15.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, extendsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "extendsClause"

    public static class implementsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "implementsClause"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:188:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final Generator.implementsClause_return implementsClause() throws RecognitionException {
        Generator.implementsClause_return retval = new Generator.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        Generator.type_return type16 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:189:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:189:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause595); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:189:29: ( type )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TYPE) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:189:30: type
            	    {
            	    pushFollow(FOLLOW_type_in_implementsClause598);
            	    type16=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((typeDeclaration_scope)typeDeclaration_stack.peek()).implClause.add((type16!=null?type16.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, implementsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "implementsClause"

    public static class genericTypeParameterList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeParameterList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:192:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final Generator.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        Generator.genericTypeParameterList_return retval = new Generator.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        Generator.genericTypeParameter_return genericTypeParameter17 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:193:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:193:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList631); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:193:35: ( genericTypeParameter )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==IDENT) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:193:36: genericTypeParameter
            	    {
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList634);
            	    genericTypeParameter17=genericTypeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      ((typeDeclaration_scope)typeDeclaration_stack.peek()).gtypList.add((genericTypeParameter17!=null?genericTypeParameter17.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, genericTypeParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeParameterList"

    public static class genericTypeParameter_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeParameter"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:196:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final Generator.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        Generator.genericTypeParameter_return retval = new Generator.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:197:5: ( ^( IDENT ( bound )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:197:9: ^( IDENT ( bound )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter659); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:197:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: bound
                        {
                        pushFollow(FOLLOW_bound_in_genericTypeParameter661);
                        bound();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, genericTypeParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeParameter"

    public static class bound_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "bound"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:200:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final Generator.bound_return bound() throws RecognitionException {
        Generator.bound_return retval = new Generator.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:201:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:201:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound691); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:201:30: ( type )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==TYPE) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: type
            	    {
            	    pushFollow(FOLLOW_type_in_bound693);
            	    type();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, bound_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bound"

    public static class enumTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumTopLevelScope"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:204:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final Generator.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        Generator.enumTopLevelScope_return retval = new Generator.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:205:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:205:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope715); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:205:32: ( enumConstant )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==IDENT) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: enumConstant
            	    {
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope717);
            	    enumConstant();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:205:46: ( classTopLevelScope )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope720);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, enumTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumTopLevelScope"

    public static class enumConstant_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "enumConstant"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:208:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final Generator.enumConstant_return enumConstant() throws RecognitionException {
        Generator.enumConstant_return retval = new Generator.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:209:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:209:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            match(input,IDENT,FOLLOW_IDENT_in_enumConstant746); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationList_in_enumConstant748);
            annotationList();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:209:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_enumConstant750);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:209:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant753);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, enumConstant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumConstant"

    protected static class classTopLevelScope_scope {
        List decls;
    }
    protected Stack classTopLevelScope_stack = new Stack();

    public static class classTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classTopLevelScope"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:213:1: classTopLevelScope : ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) -> classTopLevelScope(declarations=$classTopLevelScope::decls);
    public final Generator.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        classTopLevelScope_stack.push(new classTopLevelScope_scope());
        Generator.classTopLevelScope_return retval = new Generator.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        Generator.classScopeDeclarations_return classScopeDeclarations18 = null;



        ((classTopLevelScope_scope)classTopLevelScope_stack.peek()).decls = new ArrayList();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:220:5: ( ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* ) -> classTopLevelScope(declarations=$classTopLevelScope::decls))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:220:9: ^( CLASS_TOP_LEVEL_SCOPE ( classScopeDeclarations )* )
            {
            match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope791); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:220:33: ( classScopeDeclarations )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT||LA22_0==CLASS||LA22_0==ENUM||LA22_0==INTERFACE||(LA22_0>=CLASS_INSTANCE_INITIALIZER && LA22_0<=CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==FUNCTION_METHOD_DECL||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:220:34: classScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope794);
                	    classScopeDeclarations18=classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	      ((classTopLevelScope_scope)classTopLevelScope_stack.peek()).decls.add((classScopeDeclarations18!=null?classScopeDeclarations18.st:null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop22;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 221:11: -> classTopLevelScope(declarations=$classTopLevelScope::decls)
              {
                  retval.st = templateLib.getInstanceOf("classTopLevelScope",
                new STAttrMap().put("declarations", ((classTopLevelScope_scope)classTopLevelScope_stack.peek()).decls));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, classTopLevelScope_StartIndex); }
            classTopLevelScope_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classTopLevelScope"

    public static class classScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "classScopeDeclarations"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:224:1: classScopeDeclarations : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) -> functionDeclaration(modifiers=$modifierList.lsttype=$type.stident=$IDENT.textparameters=$formalParameterList.lstblock=$block.st) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) -> methodDeclaration(modifiers=$modifierList.lstident=$IDENT.textparameters=$formalParameterList.lstblock=$block.st) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) -> varDeclaration(modifiers=$modifierList.lsttype=$type.stdeclarators=$variableDeclaratorList.lst) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration );
    public final Generator.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        Generator.classScopeDeclarations_return retval = new Generator.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        CommonTree IDENT21=null;
        CommonTree IDENT25=null;
        Generator.modifierList_return modifierList19 = null;

        Generator.type_return type20 = null;

        Generator.formalParameterList_return formalParameterList22 = null;

        Generator.block_return block23 = null;

        Generator.modifierList_return modifierList24 = null;

        Generator.formalParameterList_return formalParameterList26 = null;

        Generator.block_return block27 = null;

        Generator.modifierList_return modifierList28 = null;

        Generator.type_return type29 = null;

        Generator.variableDeclaratorList_return variableDeclaratorList30 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:225:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) -> functionDeclaration(modifiers=$modifierList.lsttype=$type.stident=$IDENT.textparameters=$formalParameterList.lstblock=$block.st) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) -> methodDeclaration(modifiers=$modifierList.lstident=$IDENT.textparameters=$formalParameterList.lstblock=$block.st) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) -> varDeclaration(modifiers=$modifierList.lsttype=$type.stdeclarators=$variableDeclaratorList.lst) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration )
            int alt32=7;
            switch ( input.LA(1) ) {
            case CLASS_INSTANCE_INITIALIZER:
                {
                alt32=1;
                }
                break;
            case CLASS_STATIC_INITIALIZER:
                {
                alt32=2;
                }
                break;
            case FUNCTION_METHOD_DECL:
                {
                alt32=3;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt32=4;
                }
                break;
            case VAR_DECLARATION:
                {
                alt32=5;
                }
                break;
            case CONSTRUCTOR_DECL:
                {
                alt32=6;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt32=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:225:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations842); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations844);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:226:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations856); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_classScopeDeclarations858);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:227:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations870); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations872);
                    modifierList19=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:227:45: ( genericTypeParameterList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations874);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_classScopeDeclarations877);
                    type20=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    IDENT21=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations879); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations881);
                    formalParameterList22=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:227:102: ( arrayDeclaratorList )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ARRAY_DECLARATOR_LIST) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_classScopeDeclarations883);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:227:123: ( throwsClause )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==THROWS_CLAUSE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations886);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:227:137: ( block )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BLOCK_SCOPE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_classScopeDeclarations889);
                            block23=block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 228:11: -> functionDeclaration(modifiers=$modifierList.lsttype=$type.stident=$IDENT.textparameters=$formalParameterList.lstblock=$block.st)
                      {
                          retval.st = templateLib.getInstanceOf("functionDeclaration",
                        new STAttrMap().put("modifiers", (modifierList19!=null?modifierList19.lst:null)).put("type", (type20!=null?type20.st:null)).put("ident", (IDENT21!=null?IDENT21.getText():null)).put("parameters", (formalParameterList22!=null?formalParameterList22.lst:null)).put("block", (block23!=null?block23.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:229:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations941); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations943);
                    modifierList24=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:229:41: ( genericTypeParameterList )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations945);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    IDENT25=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations948); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations950);
                    formalParameterList26=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:229:93: ( throwsClause )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==THROWS_CLAUSE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations952);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:229:107: ( block )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==BLOCK_SCOPE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: block
                            {
                            pushFollow(FOLLOW_block_in_classScopeDeclarations955);
                            block27=block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 230:11: -> methodDeclaration(modifiers=$modifierList.lstident=$IDENT.textparameters=$formalParameterList.lstblock=$block.st)
                      {
                          retval.st = templateLib.getInstanceOf("methodDeclaration",
                        new STAttrMap().put("modifiers", (modifierList24!=null?modifierList24.lst:null)).put("ident", (IDENT25!=null?IDENT25.getText():null)).put("parameters", (formalParameterList26!=null?formalParameterList26.lst:null)).put("block", (block27!=null?block27.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:231:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations1011); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations1013);
                    modifierList28=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_classScopeDeclarations1015);
                    type29=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations1017);
                    variableDeclaratorList30=variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 232:11: -> varDeclaration(modifiers=$modifierList.lsttype=$type.stdeclarators=$variableDeclaratorList.lst)
                      {
                          retval.st = templateLib.getInstanceOf("varDeclaration",
                        new STAttrMap().put("modifiers", (modifierList28!=null?modifierList28.lst:null)).put("type", (type29!=null?type29.st:null)).put("declarators", (variableDeclaratorList30!=null?variableDeclaratorList30.lst:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:233:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations1059); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations1061);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:233:41: ( genericTypeParameterList )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations1063);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations1066);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:233:87: ( throwsClause )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==THROWS_CLAUSE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations1068);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_block_in_classScopeDeclarations1071);
                    block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:234:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations1082);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, classScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "classScopeDeclarations"

    public static class interfaceTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceTopLevelScope"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:237:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final Generator.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        Generator.interfaceTopLevelScope_return retval = new Generator.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:238:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:238:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope1106); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:238:37: ( interfaceScopeDeclarations )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==AT||LA33_0==CLASS||LA33_0==ENUM||LA33_0==INTERFACE||LA33_0==FUNCTION_METHOD_DECL||LA33_0==VAR_DECLARATION||LA33_0==VOID_METHOD_DECL) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: interfaceScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope1108);
                	    interfaceScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop33;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, interfaceTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceTopLevelScope"

    public static class interfaceScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "interfaceScopeDeclarations"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:241:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final Generator.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        Generator.interfaceScopeDeclarations_return retval = new Generator.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:242:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt39=4;
            switch ( input.LA(1) ) {
            case FUNCTION_METHOD_DECL:
                {
                alt39=1;
                }
                break;
            case VOID_METHOD_DECL:
                {
                alt39=2;
                }
                break;
            case VAR_DECLARATION:
                {
                alt39=3;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt39=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:242:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations1134); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations1136);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:242:45: ( genericTypeParameterList )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1138);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations1141);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations1143); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations1145);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:242:102: ( arrayDeclaratorList )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARRAY_DECLARATOR_LIST) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations1147);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:242:123: ( throwsClause )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THROWS_CLAUSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations1150);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:243:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations1163); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations1165);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:243:41: ( genericTypeParameterList )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeParameterList
                            {
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1167);
                            genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations1170); if (state.failed) return retval;
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations1172);
                    formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:243:93: ( throwsClause )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THROWS_CLAUSE) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: throwsClause
                            {
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations1174);
                            throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:247:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations1265); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations1267);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations1269);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations1271);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:248:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations1282);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, interfaceScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceScopeDeclarations"

    public static class variableDeclaratorList_return extends TreeRuleReturnScope {
        public List lst;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:251:1: variableDeclaratorList returns [List lst] : ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) ;
    public final Generator.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        Generator.variableDeclaratorList_return retval = new Generator.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        Generator.variableDeclarator_return variableDeclarator31 = null;



          retval.lst = new ArrayList(); 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:255:5: ( ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:255:9: ^( VAR_DECLARATOR_LIST ( variableDeclarator )+ )
            {
            match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList1310); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:255:31: ( variableDeclarator )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==VAR_DECLARATOR) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:255:32: variableDeclarator
            	    {
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList1313);
            	    variableDeclarator31=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      retval.lst.add((variableDeclarator31!=null?variableDeclarator31.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, variableDeclaratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorList"

    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclarator"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:258:1: variableDeclarator : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) -> variableDeclarator(id=$variableDeclaratorId.stinitializer=$variableInitializer.st);
    public final Generator.variableDeclarator_return variableDeclarator() throws RecognitionException {
        Generator.variableDeclarator_return retval = new Generator.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        Generator.variableDeclaratorId_return variableDeclaratorId32 = null;

        Generator.variableInitializer_return variableInitializer33 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:259:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) -> variableDeclarator(id=$variableDeclaratorId.stinitializer=$variableInitializer.st))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:259:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator1338); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1340);
            variableDeclaratorId32=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:259:47: ( variableInitializer )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAY_INITIALIZER||LA41_0==EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: variableInitializer
                    {
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1342);
                    variableInitializer33=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 260:9: -> variableDeclarator(id=$variableDeclaratorId.stinitializer=$variableInitializer.st)
              {
                  retval.st = templateLib.getInstanceOf("variableDeclarator",
                new STAttrMap().put("id", (variableDeclaratorId32!=null?variableDeclaratorId32.st:null)).put("initializer", (variableInitializer33!=null?variableInitializer33.st:null)));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, variableDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableDeclaratorId"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:263:1: variableDeclaratorId : ^( IDENT ( arrayDeclaratorList )? ) -> template(v=$IDENT.text) \"<v>\";
    public final Generator.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        Generator.variableDeclaratorId_return retval = new Generator.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        CommonTree IDENT34=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:264:5: ( ^( IDENT ( arrayDeclaratorList )? ) -> template(v=$IDENT.text) \"<v>\")
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:264:9: ^( IDENT ( arrayDeclaratorList )? )
            {
            IDENT34=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId1391); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:264:17: ( arrayDeclaratorList )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ARRAY_DECLARATOR_LIST) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: arrayDeclaratorList
                        {
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1393);
                        arrayDeclaratorList();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 264:39: -> template(v=$IDENT.text) \"<v>\"
              {
                  retval.st = new StringTemplate(templateLib, "<v>",
                new STAttrMap().put("v", (IDENT34!=null?IDENT34.getText():null)));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, variableDeclaratorId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    public static class variableInitializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "variableInitializer"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:267:1: variableInitializer : ( arrayInitializer | expression );
    public final Generator.variableInitializer_return variableInitializer() throws RecognitionException {
        Generator.variableInitializer_return retval = new Generator.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        Generator.expression_return expression35 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:268:5: ( arrayInitializer | expression )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ARRAY_INITIALIZER) ) {
                alt43=1;
            }
            else if ( (LA43_0==EXPR) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:268:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1425);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:269:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_variableInitializer1435);
                    expression35=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.st = (expression35!=null?expression35.st:null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, variableInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayDeclarator"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:272:1: arrayDeclarator : LBRACK RBRACK ;
    public final Generator.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        Generator.arrayDeclarator_return retval = new Generator.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:273:5: ( LBRACK RBRACK )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:273:9: LBRACK RBRACK
            {
            match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator1456); if (state.failed) return retval;
            match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator1458); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, arrayDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclarator"

    public static class arrayDeclaratorList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayDeclaratorList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:276:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final Generator.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        Generator.arrayDeclaratorList_return retval = new Generator.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:277:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:277:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1478); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:277:33: ( ARRAY_DECLARATOR )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARRAY_DECLARATOR) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: ARRAY_DECLARATOR
                	    {
                	    match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1480); if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, arrayDeclaratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaratorList"

    public static class arrayInitializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayInitializer"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:280:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final Generator.arrayInitializer_return arrayInitializer() throws RecognitionException {
        Generator.arrayInitializer_return retval = new Generator.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:281:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:281:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1508); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:281:29: ( variableInitializer )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARRAY_INITIALIZER||LA45_0==EXPR) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: variableInitializer
                	    {
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1510);
                	    variableInitializer();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, arrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"

    public static class throwsClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "throwsClause"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:284:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final Generator.throwsClause_return throwsClause() throws RecognitionException {
        Generator.throwsClause_return retval = new Generator.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:285:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:285:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1532); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:285:25: ( qualifiedIdentifier )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==DOT||LA46_0==IDENT) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: qualifiedIdentifier
            	    {
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1534);
            	    qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, throwsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "throwsClause"

    public static class modifierList_return extends TreeRuleReturnScope {
        public List lst;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifierList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:288:1: modifierList returns [List lst] : ^( MODIFIER_LIST ( modifier )* ) ;
    public final Generator.modifierList_return modifierList() throws RecognitionException {
        Generator.modifierList_return retval = new Generator.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        Generator.modifier_return modifier36 = null;



          retval.lst = new ArrayList(); 

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:292:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:292:9: ^( MODIFIER_LIST ( modifier )* )
            {
            match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1564); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:292:25: ( modifier )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==AT||LA47_0==ABSTRACT||LA47_0==FINAL||LA47_0==NATIVE||(LA47_0>=PRIVATE && LA47_0<=PUBLIC)||(LA47_0>=STATIC && LA47_0<=STRICTFP)||LA47_0==SYNCHRONIZED||LA47_0==TRANSIENT||LA47_0==VOLATILE) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:292:26: modifier
                	    {
                	    pushFollow(FOLLOW_modifier_in_modifierList1567);
                	    modifier36=modifier();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	      retval.lst.add((modifier36!=null?modifier36.st:null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop47;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, modifierList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifierList"

    public static class modifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "modifier"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:295:1: modifier : ( PUBLIC -> template(v=$PUBLIC.text) \"<v>\" | PROTECTED | PRIVATE -> template(v=$PRIVATE.text) \"<v>\" | STATIC -> template(v=$STATIC.text) \"<v>\" | ABSTRACT -> template(v=$ABSTRACT.text) \"<v>\" | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final Generator.modifier_return modifier() throws RecognitionException {
        Generator.modifier_return retval = new Generator.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree PUBLIC37=null;
        CommonTree PRIVATE38=null;
        CommonTree STATIC39=null;
        CommonTree ABSTRACT40=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:296:5: ( PUBLIC -> template(v=$PUBLIC.text) \"<v>\" | PROTECTED | PRIVATE -> template(v=$PRIVATE.text) \"<v>\" | STATIC -> template(v=$STATIC.text) \"<v>\" | ABSTRACT -> template(v=$ABSTRACT.text) \"<v>\" | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
            int alt48=11;
            switch ( input.LA(1) ) {
            case PUBLIC:
                {
                alt48=1;
                }
                break;
            case PROTECTED:
                {
                alt48=2;
                }
                break;
            case PRIVATE:
                {
                alt48=3;
                }
                break;
            case STATIC:
                {
                alt48=4;
                }
                break;
            case ABSTRACT:
                {
                alt48=5;
                }
                break;
            case NATIVE:
                {
                alt48=6;
                }
                break;
            case SYNCHRONIZED:
                {
                alt48=7;
                }
                break;
            case TRANSIENT:
                {
                alt48=8;
                }
                break;
            case VOLATILE:
                {
                alt48=9;
                }
                break;
            case STRICTFP:
                {
                alt48=10;
                }
                break;
            case AT:
            case FINAL:
                {
                alt48=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:296:9: PUBLIC
                    {
                    PUBLIC37=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1592); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 296:16: -> template(v=$PUBLIC.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (PUBLIC37!=null?PUBLIC37.getText():null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:297:9: PROTECTED
                    {
                    match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1613); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:298:9: PRIVATE
                    {
                    PRIVATE38=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1624); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 298:17: -> template(v=$PRIVATE.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (PRIVATE38!=null?PRIVATE38.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:299:9: STATIC
                    {
                    STATIC39=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_modifier1645); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 299:16: -> template(v=$STATIC.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (STATIC39!=null?STATIC39.getText():null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:300:9: ABSTRACT
                    {
                    ABSTRACT40=(CommonTree)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1666); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 300:18: -> template(v=$ABSTRACT.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (ABSTRACT40!=null?ABSTRACT40.getText():null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:301:9: NATIVE
                    {
                    match(input,NATIVE,FOLLOW_NATIVE_in_modifier1687); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:302:9: SYNCHRONIZED
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1698); if (state.failed) return retval;

                    }
                    break;
                case 8 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:303:9: TRANSIENT
                    {
                    match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1709); if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:304:9: VOLATILE
                    {
                    match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1720); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:305:9: STRICTFP
                    {
                    match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1731); if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:306:9: localModifier
                    {
                    pushFollow(FOLLOW_localModifier_in_modifier1742);
                    localModifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class localModifierList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localModifierList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:309:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final Generator.localModifierList_return localModifierList() throws RecognitionException {
        Generator.localModifierList_return retval = new Generator.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:310:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:310:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1762); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:310:31: ( localModifier )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AT||LA49_0==FINAL) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: localModifier
                	    {
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1764);
                	    localModifier();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop49;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, localModifierList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localModifierList"

    public static class localModifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localModifier"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:313:1: localModifier : ( FINAL | annotation );
    public final Generator.localModifier_return localModifier() throws RecognitionException {
        Generator.localModifier_return retval = new Generator.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:314:5: ( FINAL | annotation )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==FINAL) ) {
                alt50=1;
            }
            else if ( (LA50_0==AT) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:314:9: FINAL
                    {
                    match(input,FINAL,FOLLOW_FINAL_in_localModifier1785); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:315:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_localModifier1795);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, localModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localModifier"

    public static class type_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "type"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:318:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final Generator.type_return type() throws RecognitionException {
        Generator.type_return retval = new Generator.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        Generator.primitiveType_return primitiveType41 = null;

        Generator.qualifiedTypeIdent_return qualifiedTypeIdent42 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:319:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:319:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            match(input,TYPE,FOLLOW_TYPE_in_type1815); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:319:16: ( primitiveType | qualifiedTypeIdent )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==BOOLEAN||LA51_0==BYTE||LA51_0==CHAR||LA51_0==DOUBLE||LA51_0==FLOAT||(LA51_0>=INT && LA51_0<=LONG)||LA51_0==SHORT) ) {
                alt51=1;
            }
            else if ( (LA51_0==QUALIFIED_TYPE_IDENT) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:319:17: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_type1818);
                    primitiveType41=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:319:33: qualifiedTypeIdent
                    {
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1822);
                    qualifiedTypeIdent42=qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:319:53: ( arrayDeclaratorList )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ARRAY_DECLARATOR_LIST) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: arrayDeclaratorList
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1825);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                      StringTemplate primitiveTypeST = null; 
                      switch((primitiveType41!=null?primitiveType41.tokenNum:0)){
                        default:
                          primitiveTypeST = null;
                      }
                      
                      StringTemplate qualifiedTypeIdentST = null;
                      if ((qualifiedTypeIdent42!=null?qualifiedTypeIdent42.lst:null)!= null) {
                        if ((qualifiedTypeIdent42!=null?qualifiedTypeIdent42.lst:null).size()>0)
                          qualifiedTypeIdentST = (qualifiedTypeIdent42!=null?qualifiedTypeIdent42.lst:null).get(0); 
                      }
                      
                      retval.st = new StringTemplate("<type>");
                      if (primitiveTypeST != null) {
                        retval.st.setAttribute("type", primitiveTypeST);
                      } else if (qualifiedTypeIdentST != null) {
                        retval.st.setAttribute("type", qualifiedTypeIdentST);
                      }
                      
                    
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class qualifiedTypeIdent_return extends TreeRuleReturnScope {
        public List<StringTemplate> lst;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "qualifiedTypeIdent"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:355:1: qualifiedTypeIdent returns [List<StringTemplate> lst] : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final Generator.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        Generator.qualifiedTypeIdent_return retval = new Generator.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        Generator.typeIdent_return typeIdent43 = null;



          retval.lst = new ArrayList<StringTemplate>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:359:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:359:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1947); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:359:32: ( typeIdent )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==IDENT) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:359:33: typeIdent
            	    {
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1950);
            	    typeIdent43=typeIdent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	      if ((typeIdent43!=null?typeIdent43.st:null) != null) retval.lst.add((typeIdent43!=null?typeIdent43.st:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, qualifiedTypeIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedTypeIdent"

    public static class typeIdent_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "typeIdent"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:362:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) -> template(v=$IDENT.text) \"<v>\";
    public final Generator.typeIdent_return typeIdent() throws RecognitionException {
        Generator.typeIdent_return retval = new Generator.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        CommonTree IDENT44=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:363:5: ( ^( IDENT ( genericTypeArgumentList )? ) -> template(v=$IDENT.text) \"<v>\")
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:363:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            IDENT44=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeIdent1977); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:363:17: ( genericTypeArgumentList )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgumentList
                        {
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1979);
                        genericTypeArgumentList();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 363:43: -> template(v=$IDENT.text) \"<v>\"
              {
                  retval.st = new StringTemplate(templateLib, "<v>",
                new STAttrMap().put("v", (IDENT44!=null?IDENT44.getText():null)));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, typeIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeIdent"

    public static class primitiveType_return extends TreeRuleReturnScope {
        public int tokenNum;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primitiveType"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:366:1: primitiveType returns [int tokenNum] : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final Generator.primitiveType_return primitiveType() throws RecognitionException {
        Generator.primitiveType_return retval = new Generator.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:367:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            int alt55=8;
            switch ( input.LA(1) ) {
            case BOOLEAN:
                {
                alt55=1;
                }
                break;
            case CHAR:
                {
                alt55=2;
                }
                break;
            case BYTE:
                {
                alt55=3;
                }
                break;
            case SHORT:
                {
                alt55=4;
                }
                break;
            case INT:
                {
                alt55=5;
                }
                break;
            case LONG:
                {
                alt55=6;
                }
                break;
            case FLOAT:
                {
                alt55=7;
                }
                break;
            case DOUBLE:
                {
                alt55=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:367:9: BOOLEAN
                    {
                    match(input,BOOLEAN,FOLLOW_BOOLEAN_in_primitiveType2015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = BOOLEAN;
                    }

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:368:9: CHAR
                    {
                    match(input,CHAR,FOLLOW_CHAR_in_primitiveType2027); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = CHAR;
                    }

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:369:9: BYTE
                    {
                    match(input,BYTE,FOLLOW_BYTE_in_primitiveType2039); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = BYTE;
                    }

                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:370:9: SHORT
                    {
                    match(input,SHORT,FOLLOW_SHORT_in_primitiveType2051); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = SHORT;
                    }

                    }
                    break;
                case 5 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:371:9: INT
                    {
                    match(input,INT,FOLLOW_INT_in_primitiveType2063); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = INT;
                    }

                    }
                    break;
                case 6 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:372:9: LONG
                    {
                    match(input,LONG,FOLLOW_LONG_in_primitiveType2075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = LONG;
                    }

                    }
                    break;
                case 7 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:373:9: FLOAT
                    {
                    match(input,FLOAT,FOLLOW_FLOAT_in_primitiveType2087); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = FLOAT;
                    }

                    }
                    break;
                case 8 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:374:9: DOUBLE
                    {
                    match(input,DOUBLE,FOLLOW_DOUBLE_in_primitiveType2099); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.tokenNum = DOUBLE;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class genericTypeArgumentList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeArgumentList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:377:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final Generator.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        Generator.genericTypeArgumentList_return retval = new Generator.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:378:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:378:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList2121); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:378:33: ( genericTypeArgument )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==QUESTION||LA56_0==TYPE) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgument
            	    {
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList2123);
            	    genericTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, genericTypeArgumentList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeArgumentList"

    public static class genericTypeArgument_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericTypeArgument"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:381:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final Generator.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        Generator.genericTypeArgument_return retval = new Generator.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:382:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==TYPE) ) {
                alt58=1;
            }
            else if ( (LA58_0==QUESTION) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:382:9: type
                    {
                    pushFollow(FOLLOW_type_in_genericTypeArgument2148);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:383:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument2159); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:383:20: ( genericWildcardBoundType )?
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==EXTENDS||LA57_0==SUPER) ) {
                            alt57=1;
                        }
                        switch (alt57) {
                            case 1 :
                                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericWildcardBoundType
                                {
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument2161);
                                genericWildcardBoundType();

                                state._fsp--;
                                if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, genericTypeArgument_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeArgument"

    public static class genericWildcardBoundType_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "genericWildcardBoundType"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:386:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final Generator.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        Generator.genericWildcardBoundType_return retval = new Generator.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:387:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==EXTENDS) ) {
                alt59=1;
            }
            else if ( (LA59_0==SUPER) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:387:9: ^( EXTENDS type )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType2241); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType2243);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:388:9: ^( SUPER type )
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType2255); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType2257);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, genericWildcardBoundType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericWildcardBoundType"

    public static class formalParameterList_return extends TreeRuleReturnScope {
        public List<StringTemplate> lst;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:391:1: formalParameterList returns [List<StringTemplate> lst] : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final Generator.formalParameterList_return formalParameterList() throws RecognitionException {
        Generator.formalParameterList_return retval = new Generator.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        Generator.formalParameterStandardDecl_return formalParameterStandardDecl45 = null;



          retval.lst = new ArrayList<StringTemplate>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:396:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:396:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList2292); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:396:29: ( formalParameterStandardDecl )*
                loop60:
                do {
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==FORMAL_PARAM_STD_DECL) ) {
                        alt60=1;
                    }


                    switch (alt60) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:396:30: formalParameterStandardDecl
                	    {
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList2295);
                	    formalParameterStandardDecl45=formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	      if ((formalParameterStandardDecl45!=null?formalParameterStandardDecl45.st:null)!=null) retval.lst.add((formalParameterStandardDecl45!=null?formalParameterStandardDecl45.st:null)); 
                	    }

                	    }
                	    break;

                	default :
                	    break loop60;
                    }
                } while (true);

                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:396:149: ( formalParameterVarargDecl )?
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt61=1;
                }
                switch (alt61) {
                    case 1 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: formalParameterVarargDecl
                        {
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList2301);
                        formalParameterVarargDecl();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, formalParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class formalParameterStandardDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterStandardDecl"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:399:1: formalParameterStandardDecl : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) -> template(type=$type.stid=$variableDeclaratorId.st) \"<id>\";
    public final Generator.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        Generator.formalParameterStandardDecl_return retval = new Generator.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        Generator.type_return type46 = null;

        Generator.variableDeclaratorId_return variableDeclaratorId47 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:400:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) -> template(type=$type.stid=$variableDeclaratorId.st) \"<id>\")
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:400:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl2331); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl2333);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl2335);
            type46=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl2337);
            variableDeclaratorId47=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 400:78: -> template(type=$type.stid=$variableDeclaratorId.st) \"<id>\"
              {
                  retval.st = new StringTemplate(templateLib, "<id>",
                new STAttrMap().put("type", (type46!=null?type46.st:null)).put("id", (variableDeclaratorId47!=null?variableDeclaratorId47.st:null)));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, formalParameterStandardDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterStandardDecl"

    public static class formalParameterVarargDecl_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formalParameterVarargDecl"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:403:1: formalParameterVarargDecl : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final Generator.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        Generator.formalParameterVarargDecl_return retval = new Generator.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:404:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:404:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl2378); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl2380);
            localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl2382);
            type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl2384);
            variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, formalParameterVarargDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterVarargDecl"

    public static class qualifiedIdentifier_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "qualifiedIdentifier"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:407:1: qualifiedIdentifier : ( IDENT | ^( DOT qualifiedIdentifier IDENT ) );
    public final Generator.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        Generator.qualifiedIdentifier_return retval = new Generator.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:408:5: ( IDENT | ^( DOT qualifiedIdentifier IDENT ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==IDENT) ) {
                alt62=1;
            }
            else if ( (LA62_0==DOT) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:408:9: IDENT
                    {
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier2408); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:409:9: ^( DOT qualifiedIdentifier IDENT )
                    {
                    match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier2419); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier2421);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier2423); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, qualifiedIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedIdentifier"

    public static class annotationList_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationList"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:414:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final Generator.annotationList_return annotationList() throws RecognitionException {
        Generator.annotationList_return retval = new Generator.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:415:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:415:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList2450); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:415:27: ( annotation )*
                loop63:
                do {
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==AT) ) {
                        alt63=1;
                    }


                    switch (alt63) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: annotation
                	    {
                	    pushFollow(FOLLOW_annotation_in_annotationList2452);
                	    annotation();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop63;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, annotationList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationList"

    public static class annotation_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotation"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:418:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final Generator.annotation_return annotation() throws RecognitionException {
        Generator.annotation_return retval = new Generator.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:419:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:419:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            match(input,AT,FOLLOW_AT_in_annotation2474); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation2476);
            qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:419:34: ( annotationInit )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ANNOTATION_INIT_BLOCK) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: annotationInit
                    {
                    pushFollow(FOLLOW_annotationInit_in_annotation2478);
                    annotationInit();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, annotation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class annotationInit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationInit"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:422:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final Generator.annotationInit_return annotationInit() throws RecognitionException {
        Generator.annotationInit_return retval = new Generator.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:423:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:423:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2504); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit2506);
            annotationInitializers();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, annotationInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInit"

    public static class annotationInitializers_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationInitializers"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:426:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final Generator.annotationInitializers_return annotationInitializers() throws RecognitionException {
        Generator.annotationInitializers_return retval = new Generator.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:427:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==ANNOTATION_INIT_KEY_LIST) ) {
                alt66=1;
            }
            else if ( (LA66_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:427:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2527); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:427:36: ( annotationInitializer )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==IDENT) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: annotationInitializer
                    	    {
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers2529);
                    	    annotationInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:428:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2542); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers2544);
                    annotationElementValue();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, annotationInitializers_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInitializers"

    public static class annotationInitializer_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationInitializer"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:431:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final Generator.annotationInitializer_return annotationInitializer() throws RecognitionException {
        Generator.annotationInitializer_return retval = new Generator.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:432:5: ( ^( IDENT annotationElementValue ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:432:9: ^( IDENT annotationElementValue )
            {
            match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer2569); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer2571);
            annotationElementValue();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, annotationInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInitializer"

    public static class annotationElementValue_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationElementValue"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:435:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final Generator.annotationElementValue_return annotationElementValue() throws RecognitionException {
        Generator.annotationElementValue_return retval = new Generator.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:436:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
            int alt68=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_INIT_ARRAY_ELEMENT:
                {
                alt68=1;
                }
                break;
            case AT:
                {
                alt68=2;
                }
                break;
            case EXPR:
                {
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:436:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2596); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:436:41: ( annotationElementValue )*
                        loop67:
                        do {
                            int alt67=2;
                            int LA67_0 = input.LA(1);

                            if ( (LA67_0==AT||LA67_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA67_0==EXPR) ) {
                                alt67=1;
                            }


                            switch (alt67) {
                        	case 1 :
                        	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: annotationElementValue
                        	    {
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue2598);
                        	    annotationElementValue();

                        	    state._fsp--;
                        	    if (state.failed) return retval;

                        	    }
                        	    break;

                        	default :
                        	    break loop67;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:437:9: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationElementValue2610);
                    annotation();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:438:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_annotationElementValue2620);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, annotationElementValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationElementValue"

    public static class annotationTopLevelScope_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationTopLevelScope"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:441:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final Generator.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        Generator.annotationTopLevelScope_return retval = new Generator.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:442:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:442:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2644); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:442:38: ( annotationScopeDeclarations )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==AT||LA69_0==CLASS||LA69_0==ENUM||LA69_0==INTERFACE||LA69_0==ANNOTATION_METHOD_DECL||LA69_0==VAR_DECLARATION) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: annotationScopeDeclarations
                	    {
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2646);
                	    annotationScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, annotationTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationTopLevelScope"

    public static class annotationScopeDeclarations_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationScopeDeclarations"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:445:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final Generator.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        Generator.annotationScopeDeclarations_return retval = new Generator.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:446:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt71=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_METHOD_DECL:
                {
                alt71=1;
                }
                break;
            case VAR_DECLARATION:
                {
                alt71=2;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:446:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2672); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2674);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2676);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2678); if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:446:58: ( annotationDefaultValue )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==DEFAULT) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: annotationDefaultValue
                            {
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2680);
                            annotationDefaultValue();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:447:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2693); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2695);
                    modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2697);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2699);
                    variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:448:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2710);
                    typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, annotationScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationScopeDeclarations"

    public static class annotationDefaultValue_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "annotationDefaultValue"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:451:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final Generator.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        Generator.annotationDefaultValue_return retval = new Generator.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:452:5: ( ^( DEFAULT annotationElementValue ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:452:9: ^( DEFAULT annotationElementValue )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2734); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2736);
            annotationElementValue();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, annotationDefaultValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationDefaultValue"

    protected static class block_scope {
        List<StringTemplate> statements;
    }
    protected Stack block_stack = new Stack();

    public static class block_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "block"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:457:1: block : ^( BLOCK_SCOPE ( blockStatement )* ) -> block(statements=$block::statements);
    public final Generator.block_return block() throws RecognitionException {
        block_stack.push(new block_scope());
        Generator.block_return retval = new Generator.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        Generator.blockStatement_return blockStatement48 = null;



          ((block_scope)block_stack.peek()).statements = new ArrayList<StringTemplate>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:464:5: ( ^( BLOCK_SCOPE ( blockStatement )* ) -> block(statements=$block::statements))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:464:9: ^( BLOCK_SCOPE ( blockStatement )* )
            {
            match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2767); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:464:23: ( blockStatement )*
                loop72:
                do {
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==AT||LA72_0==SEMI||LA72_0==ASSERT||LA72_0==BREAK||(LA72_0>=CLASS && LA72_0<=CONTINUE)||LA72_0==DO||LA72_0==ENUM||(LA72_0>=FOR && LA72_0<=IF)||LA72_0==INTERFACE||LA72_0==RETURN||(LA72_0>=SWITCH && LA72_0<=SYNCHRONIZED)||LA72_0==THROW||LA72_0==TRY||LA72_0==WHILE||LA72_0==BLOCK_SCOPE||LA72_0==EXPR||LA72_0==FOR_EACH||LA72_0==LABELED_STATEMENT||LA72_0==VAR_DECLARATION) ) {
                        alt72=1;
                    }


                    switch (alt72) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:464:24: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_block2770);
                	    blockStatement48=blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	      if ((blockStatement48!=null?blockStatement48.st:null)!=null) ((block_scope)block_stack.peek()).statements.add((blockStatement48!=null?blockStatement48.st:null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop72;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 464:118: -> block(statements=$block::statements)
              {
                  retval.st = templateLib.getInstanceOf("block",
                new STAttrMap().put("statements", ((block_scope)block_stack.peek()).statements));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, block_StartIndex); }
            block_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "blockStatement"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:467:1: blockStatement : ( localVariableDeclaration | typeDeclaration | statement );
    public final Generator.blockStatement_return blockStatement() throws RecognitionException {
        Generator.blockStatement_return retval = new Generator.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        Generator.localVariableDeclaration_return localVariableDeclaration49 = null;

        Generator.typeDeclaration_return typeDeclaration50 = null;

        Generator.statement_return statement51 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:468:5: ( localVariableDeclaration | typeDeclaration | statement )
            int alt73=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt73=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt73=2;
                }
                break;
            case SEMI:
            case ASSERT:
            case BREAK:
            case CONTINUE:
            case DO:
            case FOR:
            case IF:
            case RETURN:
            case SWITCH:
            case SYNCHRONIZED:
            case THROW:
            case TRY:
            case WHILE:
            case BLOCK_SCOPE:
            case EXPR:
            case FOR_EACH:
            case LABELED_STATEMENT:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:468:9: localVariableDeclaration
                    {
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2807);
                    localVariableDeclaration49=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.st = (localVariableDeclaration49!=null?localVariableDeclaration49.st:null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:469:9: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2819);
                    typeDeclaration50=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.st = (typeDeclaration50!=null?typeDeclaration50.st:null);
                    }

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:470:9: statement
                    {
                    pushFollow(FOLLOW_statement_in_blockStatement2831);
                    statement51=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.st = (statement51!=null?statement51.st:null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, blockStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class localVariableDeclaration_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "localVariableDeclaration"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:473:1: localVariableDeclaration : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) -> localVariableDeclaration(modifiers=$localModifierList.sttype=$type.stdeclarators=$variableDeclaratorList.lst);
    public final Generator.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        Generator.localVariableDeclaration_return retval = new Generator.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        Generator.localModifierList_return localModifierList52 = null;

        Generator.type_return type53 = null;

        Generator.variableDeclaratorList_return variableDeclaratorList54 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:474:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) -> localVariableDeclaration(modifiers=$localModifierList.sttype=$type.stdeclarators=$variableDeclaratorList.lst))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:474:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2857); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2859);
            localModifierList52=localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_type_in_localVariableDeclaration2861);
            type53=type();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2863);
            variableDeclaratorList54=variableDeclaratorList();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 475:9: -> localVariableDeclaration(modifiers=$localModifierList.sttype=$type.stdeclarators=$variableDeclaratorList.lst)
              {
                  retval.st = templateLib.getInstanceOf("localVariableDeclaration",
                new STAttrMap().put("modifiers", (localModifierList52!=null?localModifierList52.st:null)).put("type", (type53!=null?type53.st:null)).put("declarators", (variableDeclaratorList54!=null?variableDeclaratorList54.lst:null)));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, localVariableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class statement_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "statement"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:479:1: statement : ( block | ^( ASSERT a1= expression (b1= expression )? ) -> assert(expressionA=$a1.stexpressionB=$b1.st) | ^( IF parenthesizedExpression a2= statement (b2= statement )? ) -> if(parenthesizedExpression=$parenthesizedExpression.ststatement=$a2.stelsestatement=$b2.st) | ^( FOR forInit forCondition forUpdater stmnt= statement ) -> for(forInit=$forInit.stforCondition=$forCondition.stforUpdater=$forUpdater.ststatement=$stmnt.st) | ^( FOR_EACH localModifierList type IDENT expression stmnt= statement ) -> foreach(modifiers=$localModifierList.sttype=$type.stid=$IDENT.textexpression=$expression.ststatement=$stmnt.st) | ^( WHILE parenthesizedExpression stmnt= statement ) -> while(parenthesizedExpression=$parenthesizedExpression.ststatement=$stmnt.st) | ^( DO stmnt= statement parenthesizedExpression ) -> do(statement=$stmnt.stparenthesizedExpression=$parenthesizedExpression.st) | ^( TRY tryblock= block ( catches )? (restblock= block )? ) -> try(tryblock=$tryblock.stcatches=$catches.strestblock=$restblock.st) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) -> template(block=$block.st) \"/*synchronized*/ <block>\" | ^( RETURN ( expression )? ) -> return(expression=$expression.st) | ^( THROW expression ) -> throw(expression=$expression.st) | ^( BREAK ( IDENT )? ) -> break(ident=$IDENT.text) | ^( CONTINUE ( IDENT )? ) -> continue(ident=$IDENT.text) | ^( LABELED_STATEMENT IDENT stmnt= statement ) -> template(statement=$stmnt.st) \"/*labeled*/ <statement>\" | expression -> statement(expression=$expression.st) | SEMI );
    public final Generator.statement_return statement() throws RecognitionException {
        Generator.statement_return retval = new Generator.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree IDENT62=null;
        CommonTree IDENT70=null;
        CommonTree IDENT71=null;
        Generator.expression_return a1 = null;

        Generator.expression_return b1 = null;

        Generator.statement_return a2 = null;

        Generator.statement_return b2 = null;

        Generator.statement_return stmnt = null;

        Generator.block_return tryblock = null;

        Generator.block_return restblock = null;

        Generator.block_return block55 = null;

        Generator.parenthesizedExpression_return parenthesizedExpression56 = null;

        Generator.forInit_return forInit57 = null;

        Generator.forCondition_return forCondition58 = null;

        Generator.forUpdater_return forUpdater59 = null;

        Generator.localModifierList_return localModifierList60 = null;

        Generator.type_return type61 = null;

        Generator.expression_return expression63 = null;

        Generator.parenthesizedExpression_return parenthesizedExpression64 = null;

        Generator.parenthesizedExpression_return parenthesizedExpression65 = null;

        Generator.catches_return catches66 = null;

        Generator.block_return block67 = null;

        Generator.expression_return expression68 = null;

        Generator.expression_return expression69 = null;

        Generator.expression_return expression72 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:480:5: ( block | ^( ASSERT a1= expression (b1= expression )? ) -> assert(expressionA=$a1.stexpressionB=$b1.st) | ^( IF parenthesizedExpression a2= statement (b2= statement )? ) -> if(parenthesizedExpression=$parenthesizedExpression.ststatement=$a2.stelsestatement=$b2.st) | ^( FOR forInit forCondition forUpdater stmnt= statement ) -> for(forInit=$forInit.stforCondition=$forCondition.stforUpdater=$forUpdater.ststatement=$stmnt.st) | ^( FOR_EACH localModifierList type IDENT expression stmnt= statement ) -> foreach(modifiers=$localModifierList.sttype=$type.stid=$IDENT.textexpression=$expression.ststatement=$stmnt.st) | ^( WHILE parenthesizedExpression stmnt= statement ) -> while(parenthesizedExpression=$parenthesizedExpression.ststatement=$stmnt.st) | ^( DO stmnt= statement parenthesizedExpression ) -> do(statement=$stmnt.stparenthesizedExpression=$parenthesizedExpression.st) | ^( TRY tryblock= block ( catches )? (restblock= block )? ) -> try(tryblock=$tryblock.stcatches=$catches.strestblock=$restblock.st) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) -> template(block=$block.st) \"/*synchronized*/ <block>\" | ^( RETURN ( expression )? ) -> return(expression=$expression.st) | ^( THROW expression ) -> throw(expression=$expression.st) | ^( BREAK ( IDENT )? ) -> break(ident=$IDENT.text) | ^( CONTINUE ( IDENT )? ) -> continue(ident=$IDENT.text) | ^( LABELED_STATEMENT IDENT stmnt= statement ) -> template(statement=$stmnt.st) \"/*labeled*/ <statement>\" | expression -> statement(expression=$expression.st) | SEMI )
            int alt81=17;
            switch ( input.LA(1) ) {
            case BLOCK_SCOPE:
                {
                alt81=1;
                }
                break;
            case ASSERT:
                {
                alt81=2;
                }
                break;
            case IF:
                {
                alt81=3;
                }
                break;
            case FOR:
                {
                alt81=4;
                }
                break;
            case FOR_EACH:
                {
                alt81=5;
                }
                break;
            case WHILE:
                {
                alt81=6;
                }
                break;
            case DO:
                {
                alt81=7;
                }
                break;
            case TRY:
                {
                alt81=8;
                }
                break;
            case SWITCH:
                {
                alt81=9;
                }
                break;
            case SYNCHRONIZED:
                {
                alt81=10;
                }
                break;
            case RETURN:
                {
                alt81=11;
                }
                break;
            case THROW:
                {
                alt81=12;
                }
                break;
            case BREAK:
                {
                alt81=13;
                }
                break;
            case CONTINUE:
                {
                alt81=14;
                }
                break;
            case LABELED_STATEMENT:
                {
                alt81=15;
                }
                break;
            case EXPR:
                {
                alt81=16;
                }
                break;
            case SEMI:
                {
                alt81=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:480:9: block
                    {
                    pushFollow(FOLLOW_block_in_statement2923);
                    block55=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.st = (block55!=null?block55.st:null);
                    }

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:481:9: ^( ASSERT a1= expression (b1= expression )? )
                    {
                    match(input,ASSERT,FOLLOW_ASSERT_in_statement2936); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement2940);
                    a1=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:481:34: (b1= expression )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==EXPR) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: b1= expression
                            {
                            pushFollow(FOLLOW_expression_in_statement2944);
                            b1=expression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 482:9: -> assert(expressionA=$a1.stexpressionB=$b1.st)
                      {
                          retval.st = templateLib.getInstanceOf("assert",
                        new STAttrMap().put("expressionA", (a1!=null?a1.st:null)).put("expressionB", (b1!=null?b1.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:483:9: ^( IF parenthesizedExpression a2= statement (b2= statement )? )
                    {
                    match(input,IF,FOLLOW_IF_in_statement2978); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2980);
                    parenthesizedExpression56=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement2984);
                    a2=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:483:53: (b2= statement )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==SEMI||LA75_0==ASSERT||LA75_0==BREAK||LA75_0==CONTINUE||LA75_0==DO||(LA75_0>=FOR && LA75_0<=IF)||LA75_0==RETURN||(LA75_0>=SWITCH && LA75_0<=SYNCHRONIZED)||LA75_0==THROW||LA75_0==TRY||LA75_0==WHILE||LA75_0==BLOCK_SCOPE||LA75_0==EXPR||LA75_0==FOR_EACH||LA75_0==LABELED_STATEMENT) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: b2= statement
                            {
                            pushFollow(FOLLOW_statement_in_statement2988);
                            b2=statement();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 484:9: -> if(parenthesizedExpression=$parenthesizedExpression.ststatement=$a2.stelsestatement=$b2.st)
                      {
                          retval.st = templateLib.getInstanceOf("if",
                        new STAttrMap().put("parenthesizedExpression", (parenthesizedExpression56!=null?parenthesizedExpression56.st:null)).put("statement", (a2!=null?a2.st:null)).put("elsestatement", (b2!=null?b2.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:485:9: ^( FOR forInit forCondition forUpdater stmnt= statement )
                    {
                    match(input,FOR,FOLLOW_FOR_in_statement3028); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_forInit_in_statement3030);
                    forInit57=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forCondition_in_statement3032);
                    forCondition58=forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_forUpdater_in_statement3034);
                    forUpdater59=forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement3038);
                    stmnt=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 486:9: -> for(forInit=$forInit.stforCondition=$forCondition.stforUpdater=$forUpdater.ststatement=$stmnt.st)
                      {
                          retval.st = templateLib.getInstanceOf("for",
                        new STAttrMap().put("forInit", (forInit57!=null?forInit57.st:null)).put("forCondition", (forCondition58!=null?forCondition58.st:null)).put("forUpdater", (forUpdater59!=null?forUpdater59.st:null)).put("statement", (stmnt!=null?stmnt.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:487:9: ^( FOR_EACH localModifierList type IDENT expression stmnt= statement )
                    {
                    match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement3082); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_localModifierList_in_statement3084);
                    localModifierList60=localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_statement3086);
                    type61=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    IDENT62=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement3088); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement3090);
                    expression63=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement3094);
                    stmnt=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 488:9: -> foreach(modifiers=$localModifierList.sttype=$type.stid=$IDENT.textexpression=$expression.ststatement=$stmnt.st)
                      {
                          retval.st = templateLib.getInstanceOf("foreach",
                        new STAttrMap().put("modifiers", (localModifierList60!=null?localModifierList60.st:null)).put("type", (type61!=null?type61.st:null)).put("id", (IDENT62!=null?IDENT62.getText():null)).put("expression", (expression63!=null?expression63.st:null)).put("statement", (stmnt!=null?stmnt.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:489:9: ^( WHILE parenthesizedExpression stmnt= statement )
                    {
                    match(input,WHILE,FOLLOW_WHILE_in_statement3144); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement3146);
                    parenthesizedExpression64=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement3150);
                    stmnt=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 490:9: -> while(parenthesizedExpression=$parenthesizedExpression.ststatement=$stmnt.st)
                      {
                          retval.st = templateLib.getInstanceOf("while",
                        new STAttrMap().put("parenthesizedExpression", (parenthesizedExpression64!=null?parenthesizedExpression64.st:null)).put("statement", (stmnt!=null?stmnt.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:491:9: ^( DO stmnt= statement parenthesizedExpression )
                    {
                    match(input,DO,FOLLOW_DO_in_statement3184); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement3188);
                    stmnt=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement3190);
                    parenthesizedExpression65=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 492:9: -> do(statement=$stmnt.stparenthesizedExpression=$parenthesizedExpression.st)
                      {
                          retval.st = templateLib.getInstanceOf("do",
                        new STAttrMap().put("statement", (stmnt!=null?stmnt.st:null)).put("parenthesizedExpression", (parenthesizedExpression65!=null?parenthesizedExpression65.st:null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:493:9: ^( TRY tryblock= block ( catches )? (restblock= block )? )
                    {
                    match(input,TRY,FOLLOW_TRY_in_statement3224); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement3228);
                    tryblock=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:493:30: ( catches )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==CATCH_CLAUSE_LIST) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: catches
                            {
                            pushFollow(FOLLOW_catches_in_statement3230);
                            catches66=catches();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:493:48: (restblock= block )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==BLOCK_SCOPE) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: restblock= block
                            {
                            pushFollow(FOLLOW_block_in_statement3235);
                            restblock=block();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 494:9: -> try(tryblock=$tryblock.stcatches=$catches.strestblock=$restblock.st)
                      {
                          retval.st = templateLib.getInstanceOf("try",
                        new STAttrMap().put("tryblock", (tryblock!=null?tryblock.st:null)).put("catches", (catches66!=null?catches66.st:null)).put("restblock", (restblock!=null?restblock.st:null)));
                      }

                    }
                    }
                    break;
                case 9 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:495:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    match(input,SWITCH,FOLLOW_SWITCH_in_statement3276); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement3278);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_switchBlockLabels_in_statement3280);
                    switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 10 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:496:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement3292); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement3294);
                    parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_block_in_statement3296);
                    block67=block();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 497:9: -> template(block=$block.st) \"/*synchronized*/ <block>\"
                      {
                          retval.st = new StringTemplate(templateLib, "/*synchronized*/ <block>",
                        new STAttrMap().put("block", (block67!=null?block67.st:null)));
                      }

                    }
                    }
                    break;
                case 11 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:498:9: ^( RETURN ( expression )? )
                    {
                    match(input,RETURN,FOLLOW_RETURN_in_statement3327); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:498:18: ( expression )?
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==EXPR) ) {
                            alt78=1;
                        }
                        switch (alt78) {
                            case 1 :
                                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: expression
                                {
                                pushFollow(FOLLOW_expression_in_statement3329);
                                expression68=expression();

                                state._fsp--;
                                if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 499:9: -> return(expression=$expression.st)
                      {
                          retval.st = templateLib.getInstanceOf("return",
                        new STAttrMap().put("expression", (expression68!=null?expression68.st:null)));
                      }

                    }
                    }
                    break;
                case 12 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:500:9: ^( THROW expression )
                    {
                    match(input,THROW,FOLLOW_THROW_in_statement3359); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_statement3361);
                    expression69=expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 501:9: -> throw(expression=$expression.st)
                      {
                          retval.st = templateLib.getInstanceOf("throw",
                        new STAttrMap().put("expression", (expression69!=null?expression69.st:null)));
                      }

                    }
                    }
                    break;
                case 13 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:502:9: ^( BREAK ( IDENT )? )
                    {
                    match(input,BREAK,FOLLOW_BREAK_in_statement3390); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:502:17: ( IDENT )?
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==IDENT) ) {
                            alt79=1;
                        }
                        switch (alt79) {
                            case 1 :
                                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: IDENT
                                {
                                IDENT70=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement3392); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 503:9: -> break(ident=$IDENT.text)
                      {
                          retval.st = templateLib.getInstanceOf("break",
                        new STAttrMap().put("ident", (IDENT70!=null?IDENT70.getText():null)));
                      }

                    }
                    }
                    break;
                case 14 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:504:9: ^( CONTINUE ( IDENT )? )
                    {
                    match(input,CONTINUE,FOLLOW_CONTINUE_in_statement3422); if (state.failed) return retval;

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:504:20: ( IDENT )?
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==IDENT) ) {
                            alt80=1;
                        }
                        switch (alt80) {
                            case 1 :
                                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: IDENT
                                {
                                IDENT71=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement3424); if (state.failed) return retval;

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 505:9: -> continue(ident=$IDENT.text)
                      {
                          retval.st = templateLib.getInstanceOf("continue",
                        new STAttrMap().put("ident", (IDENT71!=null?IDENT71.getText():null)));
                      }

                    }
                    }
                    break;
                case 15 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:506:9: ^( LABELED_STATEMENT IDENT stmnt= statement )
                    {
                    match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement3454); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,IDENT,FOLLOW_IDENT_in_statement3456); if (state.failed) return retval;
                    pushFollow(FOLLOW_statement_in_statement3460);
                    stmnt=statement();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 507:9: -> template(statement=$stmnt.st) \"/*labeled*/ <statement>\"
                      {
                          retval.st = new StringTemplate(templateLib, "/*labeled*/ <statement>",
                        new STAttrMap().put("statement", (stmnt!=null?stmnt.st:null)));
                      }

                    }
                    }
                    break;
                case 16 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:508:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_statement3490);
                    expression72=expression();

                    state._fsp--;
                    if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 508:20: -> statement(expression=$expression.st)
                      {
                          retval.st = templateLib.getInstanceOf("statement",
                        new STAttrMap().put("expression", (expression72!=null?expression72.st:null)));
                      }

                    }
                    }
                    break;
                case 17 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:509:9: SEMI
                    {
                    match(input,SEMI,FOLLOW_SEMI_in_statement3509); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class catches_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catches"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:512:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final Generator.catches_return catches() throws RecognitionException {
        Generator.catches_return retval = new Generator.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:513:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:513:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches3538); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:513:29: ( catchClause )+
            int cnt82=0;
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==CATCH) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: catchClause
            	    {
            	    pushFollow(FOLLOW_catchClause_in_catches3540);
            	    catchClause();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    if ( cnt82 >= 1 ) break loop82;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(82, input);
                        throw eee;
                }
                cnt82++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, catches_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catches"

    public static class catchClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "catchClause"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:516:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final Generator.catchClause_return catchClause() throws RecognitionException {
        Generator.catchClause_return retval = new Generator.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:517:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:517:9: ^( CATCH formalParameterStandardDecl block )
            {
            match(input,CATCH,FOLLOW_CATCH_in_catchClause3566); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause3568);
            formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_block_in_catchClause3570);
            block();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, catchClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchClause"

    public static class switchBlockLabels_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchBlockLabels"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:520:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final Generator.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        Generator.switchBlockLabels_return retval = new Generator.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:521:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:521:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels3591); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:521:35: ( switchCaseLabel )*
                loop83:
                do {
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==CASE) ) {
                        int LA83_2 = input.LA(2);

                        if ( (synpred125_Generator()) ) {
                            alt83=1;
                        }


                    }


                    switch (alt83) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels3593);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop83;
                    }
                } while (true);

                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:521:52: ( switchDefaultLabel )?
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==DEFAULT) ) {
                    alt84=1;
                }
                switch (alt84) {
                    case 1 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: switchDefaultLabel
                        {
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels3596);
                        switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:521:72: ( switchCaseLabel )*
                loop85:
                do {
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==CASE) ) {
                        alt85=1;
                    }


                    switch (alt85) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: switchCaseLabel
                	    {
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels3599);
                	    switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop85;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, switchBlockLabels_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchBlockLabels"

    public static class switchCaseLabel_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchCaseLabel"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:524:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final Generator.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        Generator.switchCaseLabel_return retval = new Generator.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:525:5: ( ^( CASE expression ( blockStatement )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:525:9: ^( CASE expression ( blockStatement )* )
            {
            match(input,CASE,FOLLOW_CASE_in_switchCaseLabel3629); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_switchCaseLabel3631);
            expression();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:525:27: ( blockStatement )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==AT||LA86_0==SEMI||LA86_0==ASSERT||LA86_0==BREAK||(LA86_0>=CLASS && LA86_0<=CONTINUE)||LA86_0==DO||LA86_0==ENUM||(LA86_0>=FOR && LA86_0<=IF)||LA86_0==INTERFACE||LA86_0==RETURN||(LA86_0>=SWITCH && LA86_0<=SYNCHRONIZED)||LA86_0==THROW||LA86_0==TRY||LA86_0==WHILE||LA86_0==BLOCK_SCOPE||LA86_0==EXPR||LA86_0==FOR_EACH||LA86_0==LABELED_STATEMENT||LA86_0==VAR_DECLARATION) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: blockStatement
            	    {
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel3633);
            	    blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, switchCaseLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchCaseLabel"

    public static class switchDefaultLabel_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "switchDefaultLabel"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:528:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final Generator.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        Generator.switchDefaultLabel_return retval = new Generator.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:529:5: ( ^( DEFAULT ( blockStatement )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:529:9: ^( DEFAULT ( blockStatement )* )
            {
            match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel3659); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:529:19: ( blockStatement )*
                loop87:
                do {
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==AT||LA87_0==SEMI||LA87_0==ASSERT||LA87_0==BREAK||(LA87_0>=CLASS && LA87_0<=CONTINUE)||LA87_0==DO||LA87_0==ENUM||(LA87_0>=FOR && LA87_0<=IF)||LA87_0==INTERFACE||LA87_0==RETURN||(LA87_0>=SWITCH && LA87_0<=SYNCHRONIZED)||LA87_0==THROW||LA87_0==TRY||LA87_0==WHILE||LA87_0==BLOCK_SCOPE||LA87_0==EXPR||LA87_0==FOR_EACH||LA87_0==LABELED_STATEMENT||LA87_0==VAR_DECLARATION) ) {
                        alt87=1;
                    }


                    switch (alt87) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: blockStatement
                	    {
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel3661);
                	    blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;

                	    }
                	    break;

                	default :
                	    break loop87;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, switchDefaultLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchDefaultLabel"

    public static class forInit_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forInit"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:532:1: forInit : ^( FOR_INIT ( localVariableDeclaration | (expressions+= expression )* )? ) -> forinit(localVariableDeclaration=$localVariableDeclaration.stexpressions=$expressions);
    public final Generator.forInit_return forInit() throws RecognitionException {
        Generator.forInit_return retval = new Generator.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        List list_expressions=null;
        Generator.localVariableDeclaration_return localVariableDeclaration73 = null;

        Generator.expression_return expressions = null;
         expressions = null;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:533:5: ( ^( FOR_INIT ( localVariableDeclaration | (expressions+= expression )* )? ) -> forinit(localVariableDeclaration=$localVariableDeclaration.stexpressions=$expressions))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:533:9: ^( FOR_INIT ( localVariableDeclaration | (expressions+= expression )* )? )
            {
            match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit3687); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:534:11: ( localVariableDeclaration | (expressions+= expression )* )?
                int alt89=3;
                switch ( input.LA(1) ) {
                    case VAR_DECLARATION:
                        {
                        alt89=1;
                        }
                        break;
                    case EXPR:
                        {
                        alt89=2;
                        }
                        break;
                    case UP:
                        {
                        int LA89_3 = input.LA(2);

                        if ( (synpred132_Generator()) ) {
                            alt89=2;
                        }
                        }
                        break;
                }

                switch (alt89) {
                    case 1 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:535:14: localVariableDeclaration
                        {
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit3715);
                        localVariableDeclaration73=localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;
                    case 2 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:536:13: (expressions+= expression )*
                        {
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:536:13: (expressions+= expression )*
                        loop88:
                        do {
                            int alt88=2;
                            int LA88_0 = input.LA(1);

                            if ( (LA88_0==EXPR) ) {
                                alt88=1;
                            }


                            switch (alt88) {
                        	case 1 :
                        	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:536:14: expressions+= expression
                        	    {
                        	    pushFollow(FOLLOW_expression_in_forInit3733);
                        	    expressions=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if (list_expressions==null) list_expressions=new ArrayList();
                        	    list_expressions.add(expressions.getTemplate());


                        	    }
                        	    break;

                        	default :
                        	    break loop88;
                            }
                        } while (true);


                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 539:9: -> forinit(localVariableDeclaration=$localVariableDeclaration.stexpressions=$expressions)
              {
                  retval.st = templateLib.getInstanceOf("forinit",
                new STAttrMap().put("localVariableDeclaration", (localVariableDeclaration73!=null?localVariableDeclaration73.st:null)).put("expressions", list_expressions));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forCondition_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forCondition"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:542:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final Generator.forCondition_return forCondition() throws RecognitionException {
        Generator.forCondition_return retval = new Generator.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        Generator.expression_return expression74 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:543:5: ( ^( FOR_CONDITION ( expression )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:543:9: ^( FOR_CONDITION ( expression )? )
            {
            match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition3804); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:543:25: ( expression )?
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==EXPR) ) {
                    alt90=1;
                }
                switch (alt90) {
                    case 1 :
                        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:543:26: expression
                        {
                        pushFollow(FOLLOW_expression_in_forCondition3807);
                        expression74=expression();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) {
                          retval.st = (expression74!=null?expression74.st:null);
                        }

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, forCondition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forCondition"

    public static class forUpdater_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "forUpdater"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:546:1: forUpdater : ^( FOR_UPDATE (expressions+= expression )* ) -> forUpdater(expressions=$expressions);
    public final Generator.forUpdater_return forUpdater() throws RecognitionException {
        Generator.forUpdater_return retval = new Generator.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        List list_expressions=null;
        Generator.expression_return expressions = null;
         expressions = null;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:547:5: ( ^( FOR_UPDATE (expressions+= expression )* ) -> forUpdater(expressions=$expressions))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:547:9: ^( FOR_UPDATE (expressions+= expression )* )
            {
            match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater3836); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:547:22: (expressions+= expression )*
                loop91:
                do {
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==EXPR) ) {
                        alt91=1;
                    }


                    switch (alt91) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:547:23: expressions+= expression
                	    {
                	    pushFollow(FOLLOW_expression_in_forUpdater3841);
                	    expressions=expression();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if (list_expressions==null) list_expressions=new ArrayList();
                	    list_expressions.add(expressions.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop91;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 548:9: -> forUpdater(expressions=$expressions)
              {
                  retval.st = templateLib.getInstanceOf("forUpdater",
                new STAttrMap().put("expressions", list_expressions));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, forUpdater_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forUpdater"

    public static class parenthesizedExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "parenthesizedExpression"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:553:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) -> parenthesizedExpression(expression=$expression.st);
    public final Generator.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        Generator.parenthesizedExpression_return retval = new Generator.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();
        Generator.expression_return expression75 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:554:5: ( ^( PARENTESIZED_EXPR expression ) -> parenthesizedExpression(expression=$expression.st))
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:554:9: ^( PARENTESIZED_EXPR expression )
            {
            match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3887); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expression_in_parenthesizedExpression3889);
            expression75=expression();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 555:9: -> parenthesizedExpression(expression=$expression.st)
              {
                  retval.st = templateLib.getInstanceOf("parenthesizedExpression",
                new STAttrMap().put("expression", (expression75!=null?expression75.st:null)));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, parenthesizedExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenthesizedExpression"

    public static class expression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expression"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:558:1: expression : ^( EXPR expr ) ;
    public final Generator.expression_return expression() throws RecognitionException {
        Generator.expression_return retval = new Generator.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        Generator.expr_return expr76 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:559:5: ( ^( EXPR expr ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:559:9: ^( EXPR expr )
            {
            match(input,EXPR,FOLLOW_EXPR_in_expression3930); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_expr_in_expression3932);
            expr76=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) {
              retval.st = (expr76!=null?expr76.st:null);
            }

            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "expr"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:562:1: expr : ( ^( ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"=\"b=$b.st) | ^( PLUS_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"+=\"b=$b.st) | ^( MINUS_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"-=\"b=$b.st) | ^( STAR_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"*=\"b=$b.st) | ^( DIV_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"/=\"b=$b.st) | ^( AND_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"&=\"b=$b.st) | ^( OR_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"|=\"b=$b.st) | ^( XOR_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"^=\"b=$b.st) | ^( MOD_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"\\%=\"b=$b.st) | ^( BIT_SHIFT_RIGHT_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>>=\"b=$b.st) | ^( SHIFT_RIGHT_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>=\"b=$b.st) | ^( SHIFT_LEFT_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<<=\"b=$b.st) | ^( QUESTION a= expr b= expr expr ) | ^( LOGICAL_OR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"||\"b=$b.st) | ^( LOGICAL_AND a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"&&\"b=$b.st) | ^( OR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"|\"b=$b.st) | ^( XOR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"^\"b=$b.st) | ^( AND a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"&\"b=$b.st) | ^( EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"==\"b=$b.st) | ^( NOT_EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"!=\"b=$b.st) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<=\"b=$b.st) | ^( GREATER_OR_EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">=\"b=$b.st) | ^( BIT_SHIFT_RIGHT a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>>\"b=$b.st) | ^( SHIFT_RIGHT a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>\"b=$b.st) | ^( GREATER_THAN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">\"b=$b.st) | ^( SHIFT_LEFT a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<<\"b=$b.st) | ^( LESS_THAN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<\"b=$b.st) | ^( PLUS a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"+\"b=$b.st) | ^( MINUS a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"-\"b=$b.st) | ^( STAR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"*\"b=$b.st) | ^( DIV a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"/\"b=$b.st) | ^( MOD a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"\\%\"b=$b.st) | ^( UNARY_PLUS a= expr ) -> prefix_unary_expr(op=\"+\"a=$a.st) | ^( UNARY_MINUS a= expr ) -> prefix_unary_expr(op=\"-\"a=$a.st) | ^( PRE_INC a= expr ) -> prefix_unary_expr(op=\"++\"a=$a.st) | ^( PRE_DEC a= expr ) -> prefix_unary_expr(op=\"--\"a=$a.st) | ^( POST_INC a= expr ) -> postfix_unary_expr(op=\"++\"a=$a.st) | ^( POST_DEC a= expr ) -> postfix_unary_expr(op=\"--\"a=$a.st) | ^( NOT a= expr ) -> prefix_unary_expr(op=\"!\"a=$a.st) | ^( LOGICAL_NOT a= expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
    public final Generator.expr_return expr() throws RecognitionException {
        Generator.expr_return retval = new Generator.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        Generator.expr_return a = null;

        Generator.expr_return b = null;

        Generator.primaryExpression_return primaryExpression77 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:563:5: ( ^( ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"=\"b=$b.st) | ^( PLUS_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"+=\"b=$b.st) | ^( MINUS_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"-=\"b=$b.st) | ^( STAR_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"*=\"b=$b.st) | ^( DIV_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"/=\"b=$b.st) | ^( AND_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"&=\"b=$b.st) | ^( OR_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"|=\"b=$b.st) | ^( XOR_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"^=\"b=$b.st) | ^( MOD_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"\\%=\"b=$b.st) | ^( BIT_SHIFT_RIGHT_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>>=\"b=$b.st) | ^( SHIFT_RIGHT_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>=\"b=$b.st) | ^( SHIFT_LEFT_ASSIGN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<<=\"b=$b.st) | ^( QUESTION a= expr b= expr expr ) | ^( LOGICAL_OR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"||\"b=$b.st) | ^( LOGICAL_AND a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"&&\"b=$b.st) | ^( OR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"|\"b=$b.st) | ^( XOR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"^\"b=$b.st) | ^( AND a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"&\"b=$b.st) | ^( EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"==\"b=$b.st) | ^( NOT_EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"!=\"b=$b.st) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<=\"b=$b.st) | ^( GREATER_OR_EQUAL a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">=\"b=$b.st) | ^( BIT_SHIFT_RIGHT a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>>\"b=$b.st) | ^( SHIFT_RIGHT a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">>\"b=$b.st) | ^( GREATER_THAN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\">\"b=$b.st) | ^( SHIFT_LEFT a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<<\"b=$b.st) | ^( LESS_THAN a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"<\"b=$b.st) | ^( PLUS a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"+\"b=$b.st) | ^( MINUS a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"-\"b=$b.st) | ^( STAR a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"*\"b=$b.st) | ^( DIV a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"/\"b=$b.st) | ^( MOD a= expr b= expr ) -> infix_binary_expr(a=$a.stop=\"\\%\"b=$b.st) | ^( UNARY_PLUS a= expr ) -> prefix_unary_expr(op=\"+\"a=$a.st) | ^( UNARY_MINUS a= expr ) -> prefix_unary_expr(op=\"-\"a=$a.st) | ^( PRE_INC a= expr ) -> prefix_unary_expr(op=\"++\"a=$a.st) | ^( PRE_DEC a= expr ) -> prefix_unary_expr(op=\"--\"a=$a.st) | ^( POST_INC a= expr ) -> postfix_unary_expr(op=\"++\"a=$a.st) | ^( POST_DEC a= expr ) -> postfix_unary_expr(op=\"--\"a=$a.st) | ^( NOT a= expr ) -> prefix_unary_expr(op=\"!\"a=$a.st) | ^( LOGICAL_NOT a= expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
            int alt92=43;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt92=1;
                }
                break;
            case PLUS_ASSIGN:
                {
                alt92=2;
                }
                break;
            case MINUS_ASSIGN:
                {
                alt92=3;
                }
                break;
            case STAR_ASSIGN:
                {
                alt92=4;
                }
                break;
            case DIV_ASSIGN:
                {
                alt92=5;
                }
                break;
            case AND_ASSIGN:
                {
                alt92=6;
                }
                break;
            case OR_ASSIGN:
                {
                alt92=7;
                }
                break;
            case XOR_ASSIGN:
                {
                alt92=8;
                }
                break;
            case MOD_ASSIGN:
                {
                alt92=9;
                }
                break;
            case BIT_SHIFT_RIGHT_ASSIGN:
                {
                alt92=10;
                }
                break;
            case SHIFT_RIGHT_ASSIGN:
                {
                alt92=11;
                }
                break;
            case SHIFT_LEFT_ASSIGN:
                {
                alt92=12;
                }
                break;
            case QUESTION:
                {
                alt92=13;
                }
                break;
            case LOGICAL_OR:
                {
                alt92=14;
                }
                break;
            case LOGICAL_AND:
                {
                alt92=15;
                }
                break;
            case OR:
                {
                alt92=16;
                }
                break;
            case XOR:
                {
                alt92=17;
                }
                break;
            case AND:
                {
                alt92=18;
                }
                break;
            case EQUAL:
                {
                alt92=19;
                }
                break;
            case NOT_EQUAL:
                {
                alt92=20;
                }
                break;
            case INSTANCEOF:
                {
                alt92=21;
                }
                break;
            case LESS_OR_EQUAL:
                {
                alt92=22;
                }
                break;
            case GREATER_OR_EQUAL:
                {
                alt92=23;
                }
                break;
            case BIT_SHIFT_RIGHT:
                {
                alt92=24;
                }
                break;
            case SHIFT_RIGHT:
                {
                alt92=25;
                }
                break;
            case GREATER_THAN:
                {
                alt92=26;
                }
                break;
            case SHIFT_LEFT:
                {
                alt92=27;
                }
                break;
            case LESS_THAN:
                {
                alt92=28;
                }
                break;
            case PLUS:
                {
                alt92=29;
                }
                break;
            case MINUS:
                {
                alt92=30;
                }
                break;
            case STAR:
                {
                alt92=31;
                }
                break;
            case DIV:
                {
                alt92=32;
                }
                break;
            case MOD:
                {
                alt92=33;
                }
                break;
            case UNARY_PLUS:
                {
                alt92=34;
                }
                break;
            case UNARY_MINUS:
                {
                alt92=35;
                }
                break;
            case PRE_INC:
                {
                alt92=36;
                }
                break;
            case PRE_DEC:
                {
                alt92=37;
                }
                break;
            case POST_INC:
                {
                alt92=38;
                }
                break;
            case POST_DEC:
                {
                alt92=39;
                }
                break;
            case NOT:
                {
                alt92=40;
                }
                break;
            case LOGICAL_NOT:
                {
                alt92=41;
                }
                break;
            case CAST_EXPR:
                {
                alt92=42;
                }
                break;
            case DOT:
            case FALSE:
            case NULL:
            case SUPER:
            case THIS:
            case TRUE:
            case ARRAY_DECLARATOR:
            case ARRAY_ELEMENT_ACCESS:
            case CLASS_CONSTRUCTOR_CALL:
            case METHOD_CALL:
            case PARENTESIZED_EXPR:
            case STATIC_ARRAY_CREATOR:
            case SUPER_CONSTRUCTOR_CALL:
            case THIS_CONSTRUCTOR_CALL:
            case IDENT:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
                {
                alt92=43;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:563:9: ^( ASSIGN a= expr b= expr )
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_expr3955); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3959);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3963);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 563:33: -> infix_binary_expr(a=$a.stop=\"=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:564:9: ^( PLUS_ASSIGN a= expr b= expr )
                    {
                    match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr3992); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr3996);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4000);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 564:38: -> infix_binary_expr(a=$a.stop=\"+=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "+=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:565:9: ^( MINUS_ASSIGN a= expr b= expr )
                    {
                    match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr4029); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4033);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4037);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 565:39: -> infix_binary_expr(a=$a.stop=\"-=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "-=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:566:9: ^( STAR_ASSIGN a= expr b= expr )
                    {
                    match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr4066); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4070);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4074);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 566:38: -> infix_binary_expr(a=$a.stop=\"*=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "*=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:567:9: ^( DIV_ASSIGN a= expr b= expr )
                    {
                    match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr4103); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4107);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4111);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 567:37: -> infix_binary_expr(a=$a.stop=\"/=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "/=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:568:9: ^( AND_ASSIGN a= expr b= expr )
                    {
                    match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_expr4140); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4144);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4148);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 568:37: -> infix_binary_expr(a=$a.stop=\"&=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "&=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:569:9: ^( OR_ASSIGN a= expr b= expr )
                    {
                    match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_expr4177); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4181);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4185);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 569:36: -> infix_binary_expr(a=$a.stop=\"|=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "|=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:570:9: ^( XOR_ASSIGN a= expr b= expr )
                    {
                    match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_expr4214); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4218);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4222);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 570:37: -> infix_binary_expr(a=$a.stop=\"^=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "^=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 9 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:571:9: ^( MOD_ASSIGN a= expr b= expr )
                    {
                    match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr4251); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4255);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4259);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 571:37: -> infix_binary_expr(a=$a.stop=\"\\%=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "%=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 10 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:572:9: ^( BIT_SHIFT_RIGHT_ASSIGN a= expr b= expr )
                    {
                    match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr4288); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4292);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4296);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 572:49: -> infix_binary_expr(a=$a.stop=\">>>=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", ">>>=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 11 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:573:9: ^( SHIFT_RIGHT_ASSIGN a= expr b= expr )
                    {
                    match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr4325); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4329);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4333);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 573:45: -> infix_binary_expr(a=$a.stop=\">>=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", ">>=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 12 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:574:9: ^( SHIFT_LEFT_ASSIGN a= expr b= expr )
                    {
                    match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_expr4362); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4366);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4370);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 574:44: -> infix_binary_expr(a=$a.stop=\"<<=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "<<=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 13 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:575:9: ^( QUESTION a= expr b= expr expr )
                    {
                    match(input,QUESTION,FOLLOW_QUESTION_in_expr4399); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4403);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4407);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4409);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 14 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:576:9: ^( LOGICAL_OR a= expr b= expr )
                    {
                    match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr4422); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4426);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4430);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 576:38: -> infix_binary_expr(a=$a.stop=\"||\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "||").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 15 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:577:9: ^( LOGICAL_AND a= expr b= expr )
                    {
                    match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr4460); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4464);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4468);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 577:38: -> infix_binary_expr(a=$a.stop=\"&&\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "&&").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 16 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:578:9: ^( OR a= expr b= expr )
                    {
                    match(input,OR,FOLLOW_OR_in_expr4497); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4501);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4505);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 578:29: -> infix_binary_expr(a=$a.stop=\"|\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "|").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 17 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:579:9: ^( XOR a= expr b= expr )
                    {
                    match(input,XOR,FOLLOW_XOR_in_expr4534); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4538);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4542);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 579:30: -> infix_binary_expr(a=$a.stop=\"^\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "^").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 18 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:580:9: ^( AND a= expr b= expr )
                    {
                    match(input,AND,FOLLOW_AND_in_expr4571); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4575);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4579);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 580:30: -> infix_binary_expr(a=$a.stop=\"&\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "&").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 19 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:581:9: ^( EQUAL a= expr b= expr )
                    {
                    match(input,EQUAL,FOLLOW_EQUAL_in_expr4608); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4612);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4616);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 581:32: -> infix_binary_expr(a=$a.stop=\"==\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "==").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 20 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:582:9: ^( NOT_EQUAL a= expr b= expr )
                    {
                    match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr4645); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4649);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4653);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 582:36: -> infix_binary_expr(a=$a.stop=\"!=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "!=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 21 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:583:9: ^( INSTANCEOF expr type )
                    {
                    match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr4682); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4684);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr4686);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 22 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:584:9: ^( LESS_OR_EQUAL a= expr b= expr )
                    {
                    match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr4698); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4702);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4706);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 584:41: -> infix_binary_expr(a=$a.stop=\"<=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "<=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 23 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:585:9: ^( GREATER_OR_EQUAL a= expr b= expr )
                    {
                    match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr4736); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4740);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4744);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 585:43: -> infix_binary_expr(a=$a.stop=\">=\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", ">=").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 24 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:586:9: ^( BIT_SHIFT_RIGHT a= expr b= expr )
                    {
                    match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr4773); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4777);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4781);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 586:42: -> infix_binary_expr(a=$a.stop=\">>>\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", ">>>").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 25 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:587:9: ^( SHIFT_RIGHT a= expr b= expr )
                    {
                    match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr4810); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4814);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4818);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 587:38: -> infix_binary_expr(a=$a.stop=\">>\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", ">>").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 26 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:588:9: ^( GREATER_THAN a= expr b= expr )
                    {
                    match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr4847); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4851);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4855);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 588:39: -> infix_binary_expr(a=$a.stop=\">\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", ">").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 27 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:589:9: ^( SHIFT_LEFT a= expr b= expr )
                    {
                    match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr4884); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4888);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4892);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 589:37: -> infix_binary_expr(a=$a.stop=\"<<\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "<<").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 28 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:590:9: ^( LESS_THAN a= expr b= expr )
                    {
                    match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr4921); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4925);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4929);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 590:36: -> infix_binary_expr(a=$a.stop=\"<\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "<").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 29 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:591:9: ^( PLUS a= expr b= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr4958); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4962);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4966);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 591:31: -> infix_binary_expr(a=$a.stop=\"+\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "+").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 30 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:592:9: ^( MINUS a= expr b= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr4995); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr4999);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5003);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 592:32: -> infix_binary_expr(a=$a.stop=\"-\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "-").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 31 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:593:9: ^( STAR a= expr b= expr )
                    {
                    match(input,STAR,FOLLOW_STAR_in_expr5032); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5036);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5040);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 593:31: -> infix_binary_expr(a=$a.stop=\"*\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "*").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 32 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:594:9: ^( DIV a= expr b= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr5069); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5073);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5077);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 594:30: -> infix_binary_expr(a=$a.stop=\"/\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "/").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 33 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:595:9: ^( MOD a= expr b= expr )
                    {
                    match(input,MOD,FOLLOW_MOD_in_expr5106); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5110);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5114);
                    b=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 595:30: -> infix_binary_expr(a=$a.stop=\"\\%\"b=$b.st)
                      {
                          retval.st = templateLib.getInstanceOf("infix_binary_expr",
                        new STAttrMap().put("a", (a!=null?a.st:null)).put("op", "%").put("b", (b!=null?b.st:null)));
                      }

                    }
                    }
                    break;
                case 34 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:596:9: ^( UNARY_PLUS a= expr )
                    {
                    match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr5143); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5147);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 596:30: -> prefix_unary_expr(op=\"+\"a=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("prefix_unary_expr",
                        new STAttrMap().put("op", "+").put("a", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;
                case 35 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:597:9: ^( UNARY_MINUS a= expr )
                    {
                    match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr5172); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5176);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 597:31: -> prefix_unary_expr(op=\"-\"a=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("prefix_unary_expr",
                        new STAttrMap().put("op", "-").put("a", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;
                case 36 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:598:9: ^( PRE_INC a= expr )
                    {
                    match(input,PRE_INC,FOLLOW_PRE_INC_in_expr5202); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5206);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 598:27: -> prefix_unary_expr(op=\"++\"a=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("prefix_unary_expr",
                        new STAttrMap().put("op", "++").put("a", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;
                case 37 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:599:9: ^( PRE_DEC a= expr )
                    {
                    match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr5231); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5235);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 599:27: -> prefix_unary_expr(op=\"--\"a=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("prefix_unary_expr",
                        new STAttrMap().put("op", "--").put("a", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;
                case 38 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:600:9: ^( POST_INC a= expr )
                    {
                    match(input,POST_INC,FOLLOW_POST_INC_in_expr5260); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5264);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 600:28: -> postfix_unary_expr(op=\"++\"a=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("postfix_unary_expr",
                        new STAttrMap().put("op", "++").put("a", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;
                case 39 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:601:9: ^( POST_DEC a= expr )
                    {
                    match(input,POST_DEC,FOLLOW_POST_DEC_in_expr5289); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5293);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 601:28: -> postfix_unary_expr(op=\"--\"a=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("postfix_unary_expr",
                        new STAttrMap().put("op", "--").put("a", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;
                case 40 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:602:9: ^( NOT a= expr )
                    {
                    match(input,NOT,FOLLOW_NOT_in_expr5318); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5322);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 602:23: -> prefix_unary_expr(op=\"!\"a=$a.st)
                      {
                          retval.st = templateLib.getInstanceOf("prefix_unary_expr",
                        new STAttrMap().put("op", "!").put("a", (a!=null?a.st:null)));
                      }

                    }
                    }
                    break;
                case 41 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:603:9: ^( LOGICAL_NOT a= expr )
                    {
                    match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr5347); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5351);
                    a=expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 42 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:604:9: ^( CAST_EXPR type expr )
                    {
                    match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr5363); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_type_in_expr5365);
                    type();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expr_in_expr5367);
                    expr();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 43 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:605:9: primaryExpression
                    {
                    pushFollow(FOLLOW_primaryExpression_in_expr5378);
                    primaryExpression77=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.st = (primaryExpression77!=null?primaryExpression77.st:null);
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class primaryExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "primaryExpression"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:608:1: primaryExpression : ( ^( DOT (pexr= primaryExpression ( IDENT -> template(exp=$pexr.stid=$IDENT.text) \"<exp>-><id>\" | THIS -> template(exp=$pexr.st) \"<exp>.this\" | SUPER -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.super\" | iexp= innerNewExpression -> template(pexp=$pexr.stiexp=$iexp.st) \"<pexp>-><iexp>\" | CLASS -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.class\") | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL pexp= primaryExpression ( genericTypeArgumentList )? arguments ) -> methodcall(primaryExpression=$pexp.stgenericTypeArgumentList=$genericTypeArgumentList.starguments=$arguments.lst) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS -> template() \"this\" | arrayTypeDeclarator | SUPER );
    public final Generator.primaryExpression_return primaryExpression() throws RecognitionException {
        Generator.primaryExpression_return retval = new Generator.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        CommonTree IDENT78=null;
        CommonTree IDENT80=null;
        Generator.primaryExpression_return pexr = null;

        Generator.innerNewExpression_return iexp = null;

        Generator.primaryExpression_return pexp = null;

        Generator.parenthesizedExpression_return parenthesizedExpression79 = null;

        Generator.genericTypeArgumentList_return genericTypeArgumentList81 = null;

        Generator.arguments_return arguments82 = null;

        Generator.literal_return literal83 = null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:609:5: ( ^( DOT (pexr= primaryExpression ( IDENT -> template(exp=$pexr.stid=$IDENT.text) \"<exp>-><id>\" | THIS -> template(exp=$pexr.st) \"<exp>.this\" | SUPER -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.super\" | iexp= innerNewExpression -> template(pexp=$pexr.stiexp=$iexp.st) \"<pexp>-><iexp>\" | CLASS -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.class\") | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL pexp= primaryExpression ( genericTypeArgumentList )? arguments ) -> methodcall(primaryExpression=$pexp.stgenericTypeArgumentList=$genericTypeArgumentList.starguments=$arguments.lst) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | newExpression | THIS -> template() \"this\" | arrayTypeDeclarator | SUPER )
            int alt96=11;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt96=1;
                }
                break;
            case PARENTESIZED_EXPR:
                {
                alt96=2;
                }
                break;
            case IDENT:
                {
                alt96=3;
                }
                break;
            case METHOD_CALL:
                {
                alt96=4;
                }
                break;
            case SUPER_CONSTRUCTOR_CALL:
            case THIS_CONSTRUCTOR_CALL:
                {
                alt96=5;
                }
                break;
            case ARRAY_ELEMENT_ACCESS:
                {
                alt96=6;
                }
                break;
            case FALSE:
            case NULL:
            case TRUE:
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
            case FLOATING_POINT_LITERAL:
            case CHARACTER_LITERAL:
            case STRING_LITERAL:
                {
                alt96=7;
                }
                break;
            case CLASS_CONSTRUCTOR_CALL:
            case STATIC_ARRAY_CREATOR:
                {
                alt96=8;
                }
                break;
            case THIS:
                {
                alt96=9;
                }
                break;
            case ARRAY_DECLARATOR:
                {
                alt96=10;
                }
                break;
            case SUPER:
                {
                alt96=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:609:9: ^( DOT (pexr= primaryExpression ( IDENT -> template(exp=$pexr.stid=$IDENT.text) \"<exp>-><id>\" | THIS -> template(exp=$pexr.st) \"<exp>.this\" | SUPER -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.super\" | iexp= innerNewExpression -> template(pexp=$pexr.stiexp=$iexp.st) \"<pexp>-><iexp>\" | CLASS -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.class\") | primitiveType CLASS | VOID CLASS ) )
                    {
                    match(input,DOT,FOLLOW_DOT_in_primaryExpression5406); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:610:13: (pexr= primaryExpression ( IDENT -> template(exp=$pexr.stid=$IDENT.text) \"<exp>-><id>\" | THIS -> template(exp=$pexr.st) \"<exp>.this\" | SUPER -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.super\" | iexp= innerNewExpression -> template(pexp=$pexr.stiexp=$iexp.st) \"<pexp>-><iexp>\" | CLASS -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.class\") | primitiveType CLASS | VOID CLASS )
                    int alt94=3;
                    switch ( input.LA(1) ) {
                    case DOT:
                    case FALSE:
                    case NULL:
                    case SUPER:
                    case THIS:
                    case TRUE:
                    case ARRAY_DECLARATOR:
                    case ARRAY_ELEMENT_ACCESS:
                    case CLASS_CONSTRUCTOR_CALL:
                    case METHOD_CALL:
                    case PARENTESIZED_EXPR:
                    case STATIC_ARRAY_CREATOR:
                    case SUPER_CONSTRUCTOR_CALL:
                    case THIS_CONSTRUCTOR_CALL:
                    case IDENT:
                    case HEX_LITERAL:
                    case OCTAL_LITERAL:
                    case DECIMAL_LITERAL:
                    case FLOATING_POINT_LITERAL:
                    case CHARACTER_LITERAL:
                    case STRING_LITERAL:
                        {
                        alt94=1;
                        }
                        break;
                    case BOOLEAN:
                    case BYTE:
                    case CHAR:
                    case DOUBLE:
                    case FLOAT:
                    case INT:
                    case LONG:
                    case SHORT:
                        {
                        alt94=2;
                        }
                        break;
                    case VOID:
                        {
                        alt94=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }

                    switch (alt94) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:610:17: pexr= primaryExpression ( IDENT -> template(exp=$pexr.stid=$IDENT.text) \"<exp>-><id>\" | THIS -> template(exp=$pexr.st) \"<exp>.this\" | SUPER -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.super\" | iexp= innerNewExpression -> template(pexp=$pexr.stiexp=$iexp.st) \"<pexp>-><iexp>\" | CLASS -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.class\")
                            {
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression5426);
                            pexr=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:611:17: ( IDENT -> template(exp=$pexr.stid=$IDENT.text) \"<exp>-><id>\" | THIS -> template(exp=$pexr.st) \"<exp>.this\" | SUPER -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.super\" | iexp= innerNewExpression -> template(pexp=$pexr.stiexp=$iexp.st) \"<pexp>-><iexp>\" | CLASS -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.class\")
                            int alt93=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt93=1;
                                }
                                break;
                            case THIS:
                                {
                                alt93=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt93=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt93=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt93=5;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 93, 0, input);

                                throw nvae;
                            }

                            switch (alt93) {
                                case 1 :
                                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:611:21: IDENT
                                    {
                                    IDENT78=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5455); if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 611:46: -> template(exp=$pexr.stid=$IDENT.text) \"<exp>-><id>\"
                                      {
                                          retval.st = new StringTemplate(templateLib, "<exp>-><id>",
                                        new STAttrMap().put("exp", (pexr!=null?pexr.st:null)).put("id", (IDENT78!=null?IDENT78.getText():null)));
                                      }

                                    }
                                    }
                                    break;
                                case 2 :
                                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:612:21: THIS
                                    {
                                    match(input,THIS,FOLLOW_THIS_in_primaryExpression5511); if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 612:46: -> template(exp=$pexr.st) \"<exp>.this\"
                                      {
                                          retval.st = new StringTemplate(templateLib, "<exp>.this",
                                        new STAttrMap().put("exp", (pexr!=null?pexr.st:null)));
                                      }

                                    }
                                    }
                                    break;
                                case 3 :
                                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:613:21: SUPER
                                    {
                                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression5581); if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 613:46: -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.super\"
                                      {
                                          retval.st = new StringTemplate(templateLib, "<exp>.super",
                                        new STAttrMap().put("exp", (pexr!=null?pexr.st:null)).put("id", (IDENT78!=null?IDENT78.getText():null)));
                                      }

                                    }
                                    }
                                    break;
                                case 4 :
                                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:614:21: iexp= innerNewExpression
                                    {
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression5639);
                                    iexp=innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 614:46: -> template(pexp=$pexr.stiexp=$iexp.st) \"<pexp>-><iexp>\"
                                      {
                                          retval.st = new StringTemplate(templateLib, "<pexp>-><iexp>",
                                        new STAttrMap().put("pexp", (pexr!=null?pexr.st:null)).put("iexp", (iexp!=null?iexp.st:null)));
                                      }

                                    }
                                    }
                                    break;
                                case 5 :
                                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:615:21: CLASS
                                    {
                                    match(input,CLASS,FOLLOW_CLASS_in_primaryExpression5677); if (state.failed) return retval;


                                    // TEMPLATE REWRITE
                                    if ( state.backtracking==0 ) {
                                      // 615:46: -> template(exp=$pexr.stid=$IDENT.text) \"<exp>.class\"
                                      {
                                          retval.st = new StringTemplate(templateLib, "<exp>.class",
                                        new STAttrMap().put("exp", (pexr!=null?pexr.st:null)).put("id", (IDENT78!=null?IDENT78.getText():null)));
                                      }

                                    }
                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:617:17: primitiveType CLASS
                            {
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression5747);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression5749); if (state.failed) return retval;

                            }
                            break;
                        case 3 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:618:17: VOID CLASS
                            {
                            match(input,VOID,FOLLOW_VOID_in_primaryExpression5767); if (state.failed) return retval;
                            match(input,CLASS,FOLLOW_CLASS_in_primaryExpression5769); if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:621:9: parenthesizedExpression
                    {
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression5803);
                    parenthesizedExpression79=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.st = (parenthesizedExpression79!=null?parenthesizedExpression79.st:null);
                    }

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:622:9: IDENT
                    {
                    IDENT80=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression5815); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                                String _ident = (IDENT80!=null?IDENT80.getText():null);
                                JSource imprint = this.observer.getGrammarImprint();
                                JClassDeclaration cls = imprint.getClassDeclaration(((typeDeclaration_scope)typeDeclaration_stack.peek()).identText);
                              
                                if (cls != null) {
                                  //check if ident was declared inside the current class             
                                  if (cls.hasVariable(_ident)){ 
                                    _ident = "$this->" + _ident;              
                                  } else if (cls.hasMethod(_ident)) {
                                    _ident = "$this->" + _ident;
                                  }
                                }
                                retval.st = new StringTemplate(templateLib,_ident);//new StringTemplate(_ident);
                              
                    }

                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:639:9: ^( METHOD_CALL pexp= primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression5846); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression5850);
                    pexp=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:639:46: ( genericTypeArgumentList )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression5852);
                            genericTypeArgumentList81=genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_primaryExpression5855);
                    arguments82=arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 640:9: -> methodcall(primaryExpression=$pexp.stgenericTypeArgumentList=$genericTypeArgumentList.starguments=$arguments.lst)
                      {
                          retval.st = templateLib.getInstanceOf("methodcall",
                        new STAttrMap().put("primaryExpression", (pexp!=null?pexp.st:null)).put("genericTypeArgumentList", (genericTypeArgumentList81!=null?genericTypeArgumentList81.st:null)).put("arguments", (arguments82!=null?arguments82.lst:null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:641:9: explicitConstructorCall
                    {
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression5893);
                    explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 6 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:642:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression5904); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression5906);
                    primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_expression_in_primaryExpression5908);
                    expression();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 7 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:643:9: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpression5919);
                    literal83=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                      retval.st = (literal83!=null?literal83.st:null);
                    }

                    }
                    break;
                case 8 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:644:9: newExpression
                    {
                    pushFollow(FOLLOW_newExpression_in_primaryExpression5931);
                    newExpression();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 9 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:645:9: THIS
                    {
                    match(input,THIS,FOLLOW_THIS_in_primaryExpression5941); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 645:14: -> template() \"this\"
                      {
                          retval.st = new StringTemplate(templateLib, "this");
                      }

                    }
                    }
                    break;
                case 10 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:646:9: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression5959);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 11 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:647:9: SUPER
                    {
                    match(input,SUPER,FOLLOW_SUPER_in_primaryExpression5969); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class explicitConstructorCall_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "explicitConstructorCall"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:650:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final Generator.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        Generator.explicitConstructorCall_return retval = new Generator.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:651:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==THIS_CONSTRUCTOR_CALL) ) {
                alt100=1;
            }
            else if ( (LA100_0==SUPER_CONSTRUCTOR_CALL) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:651:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall5993); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:651:33: ( genericTypeArgumentList )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall5995);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall5998);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:652:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall6010); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:652:34: ( primaryExpression )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==DOT||LA98_0==FALSE||LA98_0==NULL||LA98_0==SUPER||LA98_0==THIS||LA98_0==TRUE||LA98_0==ARRAY_DECLARATOR||LA98_0==ARRAY_ELEMENT_ACCESS||LA98_0==CLASS_CONSTRUCTOR_CALL||LA98_0==METHOD_CALL||LA98_0==PARENTESIZED_EXPR||(LA98_0>=STATIC_ARRAY_CREATOR && LA98_0<=SUPER_CONSTRUCTOR_CALL)||LA98_0==THIS_CONSTRUCTOR_CALL||(LA98_0>=IDENT && LA98_0<=STRING_LITERAL)) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: primaryExpression
                            {
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall6012);
                            primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:652:53: ( genericTypeArgumentList )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall6015);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall6018);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, explicitConstructorCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "explicitConstructorCall"

    public static class arrayTypeDeclarator_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arrayTypeDeclarator"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:655:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final Generator.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        Generator.arrayTypeDeclarator_return retval = new Generator.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:656:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:656:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator6039); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:656:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
            int alt101=3;
            switch ( input.LA(1) ) {
            case ARRAY_DECLARATOR:
                {
                alt101=1;
                }
                break;
            case DOT:
            case IDENT:
                {
                alt101=2;
                }
                break;
            case BOOLEAN:
            case BYTE:
            case CHAR:
            case DOUBLE:
            case FLOAT:
            case INT:
            case LONG:
            case SHORT:
                {
                alt101=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:656:29: arrayTypeDeclarator
                    {
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator6042);
                    arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:656:51: qualifiedIdentifier
                    {
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator6046);
                    qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:656:73: primitiveType
                    {
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator6050);
                    primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, arrayTypeDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayTypeDeclarator"

    public static class newExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "newExpression"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:659:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final Generator.newExpression_return newExpression() throws RecognitionException {
        Generator.newExpression_return retval = new Generator.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:660:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==STATIC_ARRAY_CREATOR) ) {
                alt106=1;
            }
            else if ( (LA106_0==CLASS_CONSTRUCTOR_CALL) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:660:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression6074); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:661:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==BOOLEAN||LA103_0==BYTE||LA103_0==CHAR||LA103_0==DOUBLE||LA103_0==FLOAT||(LA103_0>=INT && LA103_0<=LONG)||LA103_0==SHORT) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==GENERIC_TYPE_ARG_LIST||LA103_0==QUALIFIED_TYPE_IDENT) ) {
                        alt103=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:661:17: primitiveType newArrayConstruction
                            {
                            pushFollow(FOLLOW_primitiveType_in_newExpression6092);
                            primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression6094);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;
                        case 2 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:662:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:662:17: ( genericTypeArgumentList )?
                            int alt102=2;
                            int LA102_0 = input.LA(1);

                            if ( (LA102_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt102=1;
                            }
                            switch (alt102) {
                                case 1 :
                                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgumentList
                                    {
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression6112);
                                    genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;

                                    }
                                    break;

                            }

                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression6115);
                            qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression6117);
                            newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:665:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression6152); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:665:34: ( genericTypeArgumentList )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgumentList
                            {
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression6154);
                            genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression6157);
                    qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arguments_in_newExpression6159);
                    arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:665:88: ( classTopLevelScope )?
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt105=1;
                    }
                    switch (alt105) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: classTopLevelScope
                            {
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression6161);
                            classTopLevelScope();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, newExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class innerNewExpression_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "innerNewExpression"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:668:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final Generator.innerNewExpression_return innerNewExpression() throws RecognitionException {
        Generator.innerNewExpression_return retval = new Generator.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:669:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:669:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression6184); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:669:34: ( genericTypeArgumentList )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==GENERIC_TYPE_ARG_LIST) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: genericTypeArgumentList
                    {
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression6186);
                    genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression6189); if (state.failed) return retval;
            pushFollow(FOLLOW_arguments_in_innerNewExpression6191);
            arguments();

            state._fsp--;
            if (state.failed) return retval;
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:669:75: ( classTopLevelScope )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: classTopLevelScope
                    {
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression6193);
                    classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, innerNewExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "innerNewExpression"

    public static class newArrayConstruction_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "newArrayConstruction"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:672:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final Generator.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        Generator.newArrayConstruction_return retval = new Generator.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:673:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ARRAY_DECLARATOR_LIST) ) {
                alt111=1;
            }
            else if ( (LA111_0==EXPR) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:673:9: arrayDeclaratorList arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction6218);
                    arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction6220);
                    arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:674:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:674:9: ( expression )+
                    int cnt109=0;
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==EXPR) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction6230);
                    	    expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt109 >= 1 ) break loop109;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(109, input);
                                throw eee;
                        }
                        cnt109++;
                    } while (true);

                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:674:21: ( arrayDeclaratorList )?
                    int alt110=2;
                    int LA110_0 = input.LA(1);

                    if ( (LA110_0==ARRAY_DECLARATOR_LIST) ) {
                        alt110=1;
                    }
                    switch (alt110) {
                        case 1 :
                            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:0:0: arrayDeclaratorList
                            {
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction6233);
                            arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, newArrayConstruction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newArrayConstruction"

    public static class arguments_return extends TreeRuleReturnScope {
        public List<StringTemplate> lst;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "arguments"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:677:1: arguments returns [List<StringTemplate> lst] : ^( ARGUMENT_LIST ( expression )* ) ;
    public final Generator.arguments_return arguments() throws RecognitionException {
        Generator.arguments_return retval = new Generator.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        Generator.expression_return expression84 = null;



          retval.lst = new ArrayList<StringTemplate>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:681:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:681:9: ^( ARGUMENT_LIST ( expression )* )
            {
            match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments6261); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:681:25: ( expression )*
                loop112:
                do {
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==EXPR) ) {
                        alt112=1;
                    }


                    switch (alt112) {
                	case 1 :
                	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:681:26: expression
                	    {
                	    pushFollow(FOLLOW_expression_in_arguments6264);
                	    expression84=expression();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	      if ((expression84!=null?expression84.st:null)!=null) retval.lst.add((expression84!=null?expression84.st:null));
                	    }

                	    }
                	    break;

                	default :
                	    break loop112;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class literal_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:684:1: literal : ( HEX_LITERAL -> template(v=$HEX_LITERAL.text) \"<v>\" | OCTAL_LITERAL -> template(v=$OCTAL_LITERAL.text) \"<v>\" | DECIMAL_LITERAL -> template(v=$DECIMAL_LITERAL.text) \"<v>\" | FLOATING_POINT_LITERAL -> template(v=$FLOATING_POINT_LITERAL.text) \"<v>\" | CHARACTER_LITERAL -> template(v=$CHARACTER_LITERAL.text) \"<v>\" | STRING_LITERAL -> template(v=$STRING_LITERAL.text) \"<v>\" | TRUE -> template(v=$TRUE.text) \"<v>\" | FALSE -> template(v=$FALSE.text) \"<v>\" | NULL -> template(v=$NULL.text) \"<v>\");
    public final Generator.literal_return literal() throws RecognitionException {
        Generator.literal_return retval = new Generator.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        CommonTree HEX_LITERAL85=null;
        CommonTree OCTAL_LITERAL86=null;
        CommonTree DECIMAL_LITERAL87=null;
        CommonTree FLOATING_POINT_LITERAL88=null;
        CommonTree CHARACTER_LITERAL89=null;
        CommonTree STRING_LITERAL90=null;
        CommonTree TRUE91=null;
        CommonTree FALSE92=null;
        CommonTree NULL93=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:685:5: ( HEX_LITERAL -> template(v=$HEX_LITERAL.text) \"<v>\" | OCTAL_LITERAL -> template(v=$OCTAL_LITERAL.text) \"<v>\" | DECIMAL_LITERAL -> template(v=$DECIMAL_LITERAL.text) \"<v>\" | FLOATING_POINT_LITERAL -> template(v=$FLOATING_POINT_LITERAL.text) \"<v>\" | CHARACTER_LITERAL -> template(v=$CHARACTER_LITERAL.text) \"<v>\" | STRING_LITERAL -> template(v=$STRING_LITERAL.text) \"<v>\" | TRUE -> template(v=$TRUE.text) \"<v>\" | FALSE -> template(v=$FALSE.text) \"<v>\" | NULL -> template(v=$NULL.text) \"<v>\")
            int alt113=9;
            switch ( input.LA(1) ) {
            case HEX_LITERAL:
                {
                alt113=1;
                }
                break;
            case OCTAL_LITERAL:
                {
                alt113=2;
                }
                break;
            case DECIMAL_LITERAL:
                {
                alt113=3;
                }
                break;
            case FLOATING_POINT_LITERAL:
                {
                alt113=4;
                }
                break;
            case CHARACTER_LITERAL:
                {
                alt113=5;
                }
                break;
            case STRING_LITERAL:
                {
                alt113=6;
                }
                break;
            case TRUE:
                {
                alt113=7;
                }
                break;
            case FALSE:
                {
                alt113=8;
                }
                break;
            case NULL:
                {
                alt113=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:685:9: HEX_LITERAL
                    {
                    HEX_LITERAL85=(CommonTree)match(input,HEX_LITERAL,FOLLOW_HEX_LITERAL_in_literal6289); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 685:21: -> template(v=$HEX_LITERAL.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (HEX_LITERAL85!=null?HEX_LITERAL85.getText():null)));
                      }

                    }
                    }
                    break;
                case 2 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:686:9: OCTAL_LITERAL
                    {
                    OCTAL_LITERAL86=(CommonTree)match(input,OCTAL_LITERAL,FOLLOW_OCTAL_LITERAL_in_literal6310); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 686:23: -> template(v=$OCTAL_LITERAL.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (OCTAL_LITERAL86!=null?OCTAL_LITERAL86.getText():null)));
                      }

                    }
                    }
                    break;
                case 3 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:687:9: DECIMAL_LITERAL
                    {
                    DECIMAL_LITERAL87=(CommonTree)match(input,DECIMAL_LITERAL,FOLLOW_DECIMAL_LITERAL_in_literal6331); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 687:25: -> template(v=$DECIMAL_LITERAL.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (DECIMAL_LITERAL87!=null?DECIMAL_LITERAL87.getText():null)));
                      }

                    }
                    }
                    break;
                case 4 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:688:9: FLOATING_POINT_LITERAL
                    {
                    FLOATING_POINT_LITERAL88=(CommonTree)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_literal6352); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 688:32: -> template(v=$FLOATING_POINT_LITERAL.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (FLOATING_POINT_LITERAL88!=null?FLOATING_POINT_LITERAL88.getText():null)));
                      }

                    }
                    }
                    break;
                case 5 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:689:9: CHARACTER_LITERAL
                    {
                    CHARACTER_LITERAL89=(CommonTree)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_literal6373); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 689:27: -> template(v=$CHARACTER_LITERAL.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (CHARACTER_LITERAL89!=null?CHARACTER_LITERAL89.getText():null)));
                      }

                    }
                    }
                    break;
                case 6 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:690:9: STRING_LITERAL
                    {
                    STRING_LITERAL90=(CommonTree)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal6394); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 690:24: -> template(v=$STRING_LITERAL.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (STRING_LITERAL90!=null?STRING_LITERAL90.getText():null)));
                      }

                    }
                    }
                    break;
                case 7 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:691:9: TRUE
                    {
                    TRUE91=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_literal6415); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 691:14: -> template(v=$TRUE.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (TRUE91!=null?TRUE91.getText():null)));
                      }

                    }
                    }
                    break;
                case 8 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:692:9: FALSE
                    {
                    FALSE92=(CommonTree)match(input,FALSE,FOLLOW_FALSE_in_literal6436); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 692:15: -> template(v=$FALSE.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (FALSE92!=null?FALSE92.getText():null)));
                      }

                    }
                    }
                    break;
                case 9 :
                    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:693:9: NULL
                    {
                    NULL93=(CommonTree)match(input,NULL,FOLLOW_NULL_in_literal6457); if (state.failed) return retval;


                    // TEMPLATE REWRITE
                    if ( state.backtracking==0 ) {
                      // 693:14: -> template(v=$NULL.text) \"<v>\"
                      {
                          retval.st = new StringTemplate(templateLib, "<v>",
                        new STAttrMap().put("v", (NULL93!=null?NULL93.getText():null)));
                      }

                    }
                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    // $ANTLR start synpred125_Generator
    public final void synpred125_Generator_fragment() throws RecognitionException {   
        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:521:35: ( switchCaseLabel )
        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:521:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred125_Generator3593);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Generator

    // $ANTLR start synpred132_Generator
    public final void synpred132_Generator_fragment() throws RecognitionException {   
        List list_expressions=null;
        Generator.expression_return expressions = null;
         expressions = null;
        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:536:13: ( (expressions+= expression )* )
        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:536:13: (expressions+= expression )*
        {
        // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:536:13: (expressions+= expression )*
        loop144:
        do {
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==EXPR) ) {
                alt144=1;
            }


            switch (alt144) {
        	case 1 :
        	    // C:\\data\\home\\ewger\\development\\java\\jjlang\\src\\Generator.g:536:14: expressions+= expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred132_Generator3733);
        	    expressions=expression();

        	    state._fsp--;
        	    if (state.failed) return ;
        	    if (list_expressions==null) list_expressions=new ArrayList();
        	    list_expressions.add(expressions);


        	    }
        	    break;

        	default :
        	    break loop144;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred132_Generator

    // Delegated rules

    public final boolean synpred125_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred132_Generator() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_Generator_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_targetSource103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_targetSource105 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_targetSource107 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_targetSource110 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclarations_in_targetSource113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration179 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration181 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration217 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration220 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_typeDeclarations250 = new BitSet(new long[]{0x2000000000000082L,0x0000000000002008L});
    public static final BitSet FOLLOW_CLASS_in_typeDeclaration284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration288 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration293 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration298 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration303 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_typeDeclaration307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration436 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration440 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration443 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration491 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration493 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause563 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause566 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause595 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause598 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList631 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList634 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound691 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound693 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope717 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope720 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant746 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant748 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_arguments_in_enumConstant750 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant753 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope794 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations842 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations856 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations870 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations872 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations874 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations881 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_classScopeDeclarations883 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations886 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations941 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations950 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations952 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations955 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations1011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations1013 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations1017 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations1059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations1063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations1066 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations1068 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations1071 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope1106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope1108 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations1134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations1136 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1138 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations1141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations1143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations1145 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations1147 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations1150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations1163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations1165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations1172 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations1174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations1265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations1267 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations1269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations1271 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList1310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList1313 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator1338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1340 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId1391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1393 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator1456 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1478 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1480 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1510 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1534 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1567 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1762 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1764 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1815 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1818 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1822 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1947 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1950 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1977 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1979 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_in_primitiveType2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_in_primitiveType2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BYTE_in_primitiveType2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SHORT_in_primitiveType2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_primitiveType2063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_in_primitiveType2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_primitiveType2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_primitiveType2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList2121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList2123 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument2159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument2161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType2241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType2243 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType2255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType2257 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList2292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList2295 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList2301 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl2331 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl2333 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl2335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl2337 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl2378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl2380 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl2382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl2384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier2419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier2421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier2423 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList2450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList2452 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation2474 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation2476 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation2478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2504 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit2506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2527 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers2529 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers2544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer2569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer2571 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2596 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue2598 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2646 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000100000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2674 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2678 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2680 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2695 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2734 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2736 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2770 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2857 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2859 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2863 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2936 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2940 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2944 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2978 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2980 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2984 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2988 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement3028 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement3030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement3032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement3034 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement3038 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement3082 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement3084 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement3086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement3088 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement3090 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement3094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement3144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement3146 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement3150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement3184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement3188 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement3190 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement3224 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement3228 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L});
    public static final BitSet FOLLOW_catches_in_statement3230 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement3235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement3276 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement3278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement3280 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement3292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement3294 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement3296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement3327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3329 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement3359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement3361 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement3390 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement3392 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement3422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement3424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement3454 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement3456 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement3460 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches3538 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches3540 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause3566 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause3568 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause3570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels3591 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels3593 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels3596 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels3599 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel3629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel3631 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel3633 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel3659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel3661 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit3687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit3715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit3733 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition3804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition3807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater3836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater3841 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression3889 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression3930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression3932 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr3955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3959 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr3992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3996 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4000 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr4029 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4033 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4037 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr4066 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4070 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr4103 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4107 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_expr4140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4144 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4148 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_expr4177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4181 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_expr4214 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4218 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr4251 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4255 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4259 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr4288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4292 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr4325 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4329 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_expr4362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4366 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4370 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr4399 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4403 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4407 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr4422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4426 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr4460 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4464 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4468 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr4497 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4501 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4505 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr4534 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4538 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr4571 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4575 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr4608 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4612 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr4645 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4649 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr4682 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4684 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr4686 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr4698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4702 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr4736 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4740 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4744 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr4773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4777 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4781 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr4810 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4814 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4818 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr4847 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4851 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr4884 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4888 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4892 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr4921 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4925 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr4958 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4962 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr4966 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr4995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr4999 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr5003 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr5032 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5036 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr5040 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr5069 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5073 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr5077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr5106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5110 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr5114 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr5143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5147 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr5172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr5202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr5231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr5260 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5264 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr5289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr5318 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5322 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr5347 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr5351 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr5363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr5365 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x000007F0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr5367 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression5406 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression5426 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression5511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression5581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression5639 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression5677 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression5747 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression5749 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression5767 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression5769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression5803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression5815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression5846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression5850 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression5852 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression5855 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression5904 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression5906 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression5908 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression5919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression5941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression5959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression5969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall5993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall5995 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall5998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall6010 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall6012 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall6015 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall6018 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator6039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator6042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator6046 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator6050 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression6074 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression6092 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression6094 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression6112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression6115 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression6117 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression6152 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression6154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression6157 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression6159 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression6161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression6184 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression6186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression6189 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression6191 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression6193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction6218 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction6230 = new BitSet(new long[]{0x0000000000000002L,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments6261 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments6264 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_HEX_LITERAL_in_literal6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCTAL_LITERAL_in_literal6310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECIMAL_LITERAL_in_literal6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_literal6352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_literal6373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal6394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred125_Generator3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred132_Generator3733 = new BitSet(new long[]{0x0000000000000002L,0x4010000000000000L});

}