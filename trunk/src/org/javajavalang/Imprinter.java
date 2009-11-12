// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 Imprinter.g 2009-11-12 01:27:21

package org.javajavalang;

import org.javajavalang.JavaImprinting.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
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
public class Imprinter extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "AND_ASSIGN", "ASSIGN", "AT", "BIT_SHIFT_RIGHT", "BIT_SHIFT_RIGHT_ASSIGN", "COLON", "COMMA", "DEC", "DIV", "DIV_ASSIGN", "DOT", "DOTSTAR", "ELLIPSIS", "EQUAL", "GREATER_OR_EQUAL", "GREATER_THAN", "INC", "LBRACK", "LCURLY", "LESS_OR_EQUAL", "LESS_THAN", "LOGICAL_AND", "LOGICAL_NOT", "LOGICAL_OR", "LPAREN", "MINUS", "MINUS_ASSIGN", "MOD", "MOD_ASSIGN", "NOT", "NOT_EQUAL", "OR", "OR_ASSIGN", "PLUS", "PLUS_ASSIGN", "QUESTION", "RBRACK", "RCURLY", "RPAREN", "SEMI", "SHIFT_LEFT", "SHIFT_LEFT_ASSIGN", "SHIFT_RIGHT", "SHIFT_RIGHT_ASSIGN", "STAR", "STAR_ASSIGN", "XOR", "XOR_ASSIGN", "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", "FALSE", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "IMPLEMENTS", "INSTANCEOF", "INTERFACE", "IMPORT", "INT", "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SHORT", "STATIC", "STRICTFP", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE", "ANNOTATION_INIT_ARRAY_ELEMENT", "ANNOTATION_INIT_BLOCK", "ANNOTATION_INIT_DEFAULT_KEY", "ANNOTATION_INIT_KEY_LIST", "ANNOTATION_LIST", "ANNOTATION_METHOD_DECL", "ANNOTATION_SCOPE", "ANNOTATION_TOP_LEVEL_SCOPE", "ARGUMENT_LIST", "ARRAY_DECLARATOR", "ARRAY_DECLARATOR_LIST", "ARRAY_ELEMENT_ACCESS", "ARRAY_INITIALIZER", "BLOCK_SCOPE", "CAST_EXPR", "CATCH_CLAUSE_LIST", "CLASS_CONSTRUCTOR_CALL", "CLASS_INSTANCE_INITIALIZER", "CLASS_STATIC_INITIALIZER", "CLASS_TOP_LEVEL_SCOPE", "CONSTRUCTOR_DECL", "ENUM_TOP_LEVEL_SCOPE", "EXPR", "EXTENDS_BOUND_LIST", "EXTENDS_CLAUSE", "FOR_CONDITION", "FOR_EACH", "FOR_INIT", "FOR_UPDATE", "FORMAL_PARAM_LIST", "FORMAL_PARAM_STD_DECL", "FORMAL_PARAM_VARARG_DECL", "FUNCTION_METHOD_DECL", "GENERIC_TYPE_ARG_LIST", "GENERIC_TYPE_PARAM_LIST", "INTERFACE_TOP_LEVEL_SCOPE", "IMPLEMENTS_CLAUSE", "LABELED_STATEMENT", "LOCAL_MODIFIER_LIST", "JAVA_SOURCE", "METHOD_CALL", "MODIFIER_LIST", "PARENTESIZED_EXPR", "POST_DEC", "POST_INC", "PRE_DEC", "PRE_INC", "QUALIFIED_TYPE_IDENT", "STATIC_ARRAY_CREATOR", "SUPER_CONSTRUCTOR_CALL", "SWITCH_BLOCK_LABEL_LIST", "THIS_CONSTRUCTOR_CALL", "THROWS_CLAUSE", "TYPE", "UNARY_MINUS", "UNARY_PLUS", "VAR_DECLARATION", "VAR_DECLARATOR", "VAR_DECLARATOR_LIST", "VOID_METHOD_DECL", "IDENT", "HEX_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "CHARACTER_LITERAL", "STRING_LITERAL", "COMMENT", "LINE_COMMENT", "HEX_DIGIT", "INTEGER_TYPE_SUFFIX", "EXPONENT", "FLOAT_TYPE_SUFFIX", "ESCAPE_SEQUENCE", "UNICODE_ESCAPE", "OCTAL_ESCAPE", "JAVA_ID_START", "JAVA_ID_PART", "WS"
    };
    public static final int PACKAGE=84;
    public static final int EXPONENT=175;
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
    public static final int COMMENT=171;
    public static final int ANNOTATION_INIT_KEY_LIST=107;
    public static final int JAVA_ID_START=180;
    public static final int FLOAT_TYPE_SUFFIX=176;
    public static final int PRE_DEC=149;
    public static final int RBRACK=41;
    public static final int IMPLEMENTS_CLAUSE=140;
    public static final int SWITCH_BLOCK_LABEL_LIST=154;
    public static final int LINE_COMMENT=172;
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
    public static final int OCTAL_ESCAPE=179;
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
    public static final int WS=182;
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
    public static final int INTEGER_TYPE_SUFFIX=174;
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
    public static final int ESCAPE_SEQUENCE=177;
    public static final int LABELED_STATEMENT=141;
    public static final int UNICODE_ESCAPE=178;
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
    public static final int JAVA_ID_PART=181;
    public static final int GREATER_THAN=20;
    public static final int VOLATILE=102;
    public static final int PARENTESIZED_EXPR=146;
    public static final int LESS_OR_EQUAL=24;
    public static final int ARRAY_DECLARATOR_LIST=114;
    public static final int CLASS_STATIC_INITIALIZER=122;
    public static final int DEFAULT=63;
    public static final int OCTAL_LITERAL=166;
    public static final int HEX_DIGIT=173;
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


        public Imprinter(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public Imprinter(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[291+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Imprinter.tokenNames; }
    public String getGrammarFileName() { return "Imprinter.g"; }


        
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


    public static class targetSource_return extends TreeRuleReturnScope {
        public JSource value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "targetSource"
    // Imprinter.g:115:1: targetSource returns [JSource value] : ^( JAVA_SOURCE annotationList (pkgdecl= packageDeclaration )? (impdecl= importDeclaration )* (typdecl= typeDeclaration )* ) ;
    public final Imprinter.targetSource_return targetSource() throws RecognitionException {
        Imprinter.targetSource_return retval = new Imprinter.targetSource_return();
        retval.start = input.LT(1);
        int targetSource_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree JAVA_SOURCE1=null;
        Imprinter.packageDeclaration_return pkgdecl = null;

        Imprinter.importDeclaration_return impdecl = null;

        Imprinter.typeDeclaration_return typdecl = null;

        Imprinter.annotationList_return annotationList2 = null;


        CommonTree JAVA_SOURCE1_tree=null;

         
          retval.value = new JSource();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
            // Imprinter.g:119:5: ( ^( JAVA_SOURCE annotationList (pkgdecl= packageDeclaration )? (impdecl= importDeclaration )* (typdecl= typeDeclaration )* ) )
            // Imprinter.g:119:9: ^( JAVA_SOURCE annotationList (pkgdecl= packageDeclaration )? (impdecl= importDeclaration )* (typdecl= typeDeclaration )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            JAVA_SOURCE1=(CommonTree)match(input,JAVA_SOURCE,FOLLOW_JAVA_SOURCE_in_targetSource109); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            JAVA_SOURCE1_tree = (CommonTree)adaptor.dupNode(JAVA_SOURCE1);

            root_1 = (CommonTree)adaptor.becomeRoot(JAVA_SOURCE1_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationList_in_targetSource111);
            annotationList2=annotationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, annotationList2.getTree());
            // Imprinter.g:120:11: (pkgdecl= packageDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Imprinter.g:120:12: pkgdecl= packageDeclaration
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_packageDeclaration_in_targetSource127);
                    pkgdecl=packageDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, pkgdecl.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value.setPackageName((pkgdecl!=null?pkgdecl.value:null));
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            // Imprinter.g:121:11: (impdecl= importDeclaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Imprinter.g:121:12: impdecl= importDeclaration
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_importDeclaration_in_targetSource147);
            	    impdecl=importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, impdecl.getTree());
            	    if ( state.backtracking==0 ) {
            	      if ((impdecl!=null?impdecl.value:null)!=null) retval.value.addImportDeclaration((impdecl!=null?impdecl.value:null));
            	    }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // Imprinter.g:122:11: (typdecl= typeDeclaration )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==AT||LA3_0==CLASS||LA3_0==ENUM||LA3_0==INTERFACE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Imprinter.g:122:12: typdecl= typeDeclaration
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeDeclaration_in_targetSource168);
            	    typdecl=typeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, typdecl.getTree());
            	    if ( state.backtracking==0 ) {
            	      if ((typdecl!=null?typdecl.value:null)!=null) retval.value.addTypeDeclaration((typdecl!=null?typdecl.value:null));
            	    }

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 1, targetSource_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "targetSource"

    public static class packageDeclaration_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "packageDeclaration"
    // Imprinter.g:126:1: packageDeclaration returns [String value] : ^( PACKAGE id= qualifiedIdentifier ) ;
    public final Imprinter.packageDeclaration_return packageDeclaration() throws RecognitionException {
        Imprinter.packageDeclaration_return retval = new Imprinter.packageDeclaration_return();
        retval.start = input.LT(1);
        int packageDeclaration_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PACKAGE3=null;
        Imprinter.qualifiedIdentifier_return id = null;


        CommonTree PACKAGE3_tree=null;

         retval.value = null;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
            // Imprinter.g:127:5: ( ^( PACKAGE id= qualifiedIdentifier ) )
            // Imprinter.g:127:9: ^( PACKAGE id= qualifiedIdentifier )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PACKAGE3=(CommonTree)match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDeclaration220); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PACKAGE3_tree = (CommonTree)adaptor.dupNode(PACKAGE3);

            root_1 = (CommonTree)adaptor.becomeRoot(PACKAGE3_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qualifiedIdentifier_in_packageDeclaration224);
            id=qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, id.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
              retval.value = (id!=null?id.value:null);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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
        public JImportDeclaration value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "importDeclaration"
    // Imprinter.g:130:1: importDeclaration returns [JImportDeclaration value] : ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) ;
    public final Imprinter.importDeclaration_return importDeclaration() throws RecognitionException {
        Imprinter.importDeclaration_return retval = new Imprinter.importDeclaration_return();
        retval.start = input.LT(1);
        int importDeclaration_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IMPORT4=null;
        CommonTree STATIC5=null;
        CommonTree DOTSTAR7=null;
        Imprinter.qualifiedIdentifier_return qualifiedIdentifier6 = null;


        CommonTree IMPORT4_tree=null;
        CommonTree STATIC5_tree=null;
        CommonTree DOTSTAR7_tree=null;

         retval.value = null;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
            // Imprinter.g:131:5: ( ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? ) )
            // Imprinter.g:131:9: ^( IMPORT ( STATIC )? qualifiedIdentifier ( DOTSTAR )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IMPORT4=(CommonTree)match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration268); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPORT4_tree = (CommonTree)adaptor.dupNode(IMPORT4);

            root_1 = (CommonTree)adaptor.becomeRoot(IMPORT4_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:131:18: ( STATIC )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==STATIC) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Imprinter.g:0:0: STATIC
                    {
                    _last = (CommonTree)input.LT(1);
                    STATIC5=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_importDeclaration270); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC5_tree = (CommonTree)adaptor.dupNode(STATIC5);

                    adaptor.addChild(root_1, STATIC5_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qualifiedIdentifier_in_importDeclaration273);
            qualifiedIdentifier6=qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qualifiedIdentifier6.getTree());
            // Imprinter.g:131:46: ( DOTSTAR )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==DOTSTAR) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Imprinter.g:0:0: DOTSTAR
                    {
                    _last = (CommonTree)input.LT(1);
                    DOTSTAR7=(CommonTree)match(input,DOTSTAR,FOLLOW_DOTSTAR_in_importDeclaration275); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOTSTAR7_tree = (CommonTree)adaptor.dupNode(DOTSTAR7);

                    adaptor.addChild(root_1, DOTSTAR7_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
              retval.value = new JImportDeclaration(STATIC5!=null, (qualifiedIdentifier6!=null?qualifiedIdentifier6.value:null), DOTSTAR7!=null);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
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

    public static class typeDeclaration_return extends TreeRuleReturnScope {
        public JTypeDeclaration value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeDeclaration"
    // Imprinter.g:135:1: typeDeclaration returns [JTypeDeclaration value] : ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) );
    public final Imprinter.typeDeclaration_return typeDeclaration() throws RecognitionException {
        Imprinter.typeDeclaration_return retval = new Imprinter.typeDeclaration_return();
        retval.start = input.LT(1);
        int typeDeclaration_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS8=null;
        CommonTree IDENT10=null;
        CommonTree INTERFACE15=null;
        CommonTree IDENT17=null;
        CommonTree ENUM21=null;
        CommonTree IDENT23=null;
        CommonTree AT26=null;
        CommonTree IDENT28=null;
        Imprinter.modifierList_return modifierList9 = null;

        Imprinter.genericTypeParameterList_return genericTypeParameterList11 = null;

        Imprinter.extendsClause_return extendsClause12 = null;

        Imprinter.implementsClause_return implementsClause13 = null;

        Imprinter.classTopLevelScope_return classTopLevelScope14 = null;

        Imprinter.modifierList_return modifierList16 = null;

        Imprinter.genericTypeParameterList_return genericTypeParameterList18 = null;

        Imprinter.extendsClause_return extendsClause19 = null;

        Imprinter.interfaceTopLevelScope_return interfaceTopLevelScope20 = null;

        Imprinter.modifierList_return modifierList22 = null;

        Imprinter.implementsClause_return implementsClause24 = null;

        Imprinter.enumTopLevelScope_return enumTopLevelScope25 = null;

        Imprinter.modifierList_return modifierList27 = null;

        Imprinter.annotationTopLevelScope_return annotationTopLevelScope29 = null;


        CommonTree CLASS8_tree=null;
        CommonTree IDENT10_tree=null;
        CommonTree INTERFACE15_tree=null;
        CommonTree IDENT17_tree=null;
        CommonTree ENUM21_tree=null;
        CommonTree IDENT23_tree=null;
        CommonTree AT26_tree=null;
        CommonTree IDENT28_tree=null;

         retval.value = null;
        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
            // Imprinter.g:136:5: ( ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope ) | ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope ) | ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope ) | ^( AT modifierList IDENT annotationTopLevelScope ) )
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
                    // Imprinter.g:136:9: ^( CLASS modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? ( implementsClause )? classTopLevelScope )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CLASS8=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_typeDeclaration316); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS8_tree = (CommonTree)adaptor.dupNode(CLASS8);

                    root_1 = (CommonTree)adaptor.becomeRoot(CLASS8_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration318);
                    modifierList9=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList9.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration320); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT10_tree = (CommonTree)adaptor.dupNode(IDENT10);

                    adaptor.addChild(root_1, IDENT10_tree);
                    }
                    // Imprinter.g:136:36: ( genericTypeParameterList )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeParameterList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration322);
                            genericTypeParameterList11=genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeParameterList11.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:136:62: ( extendsClause )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==EXTENDS_CLAUSE) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // Imprinter.g:0:0: extendsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration325);
                            extendsClause12=extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, extendsClause12.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:136:77: ( implementsClause )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==IMPLEMENTS_CLAUSE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // Imprinter.g:0:0: implementsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration328);
                            implementsClause13=implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, implementsClause13.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classTopLevelScope_in_typeDeclaration331);
                    classTopLevelScope14=classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, classTopLevelScope14.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {

                              JClassDeclaration cls = new JClassDeclaration();
                              cls.ident = (IDENT10!=null?IDENT10.getText():null);
                              cls.scopeDeclarations.addAll((classTopLevelScope14!=null?classTopLevelScope14.lst:null));
                              retval.value = cls;        
                            
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:143:9: ^( INTERFACE modifierList IDENT ( genericTypeParameterList )? ( extendsClause )? interfaceTopLevelScope )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INTERFACE15=(CommonTree)match(input,INTERFACE,FOLLOW_INTERFACE_in_typeDeclaration351); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INTERFACE15_tree = (CommonTree)adaptor.dupNode(INTERFACE15);

                    root_1 = (CommonTree)adaptor.becomeRoot(INTERFACE15_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration353);
                    modifierList16=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList16.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT17=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration355); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT17_tree = (CommonTree)adaptor.dupNode(IDENT17);

                    adaptor.addChild(root_1, IDENT17_tree);
                    }
                    // Imprinter.g:143:40: ( genericTypeParameterList )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeParameterList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeParameterList_in_typeDeclaration357);
                            genericTypeParameterList18=genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeParameterList18.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:143:66: ( extendsClause )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==EXTENDS_CLAUSE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // Imprinter.g:0:0: extendsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_extendsClause_in_typeDeclaration360);
                            extendsClause19=extendsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, extendsClause19.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_interfaceTopLevelScope_in_typeDeclaration363);
                    interfaceTopLevelScope20=interfaceTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, interfaceTopLevelScope20.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:144:9: ^( ENUM modifierList IDENT ( implementsClause )? enumTopLevelScope )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ENUM21=(CommonTree)match(input,ENUM,FOLLOW_ENUM_in_typeDeclaration375); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ENUM21_tree = (CommonTree)adaptor.dupNode(ENUM21);

                    root_1 = (CommonTree)adaptor.becomeRoot(ENUM21_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration377);
                    modifierList22=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList22.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT23=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT23_tree = (CommonTree)adaptor.dupNode(IDENT23);

                    adaptor.addChild(root_1, IDENT23_tree);
                    }
                    // Imprinter.g:144:35: ( implementsClause )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==IMPLEMENTS_CLAUSE) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // Imprinter.g:0:0: implementsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_implementsClause_in_typeDeclaration381);
                            implementsClause24=implementsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, implementsClause24.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_enumTopLevelScope_in_typeDeclaration384);
                    enumTopLevelScope25=enumTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, enumTopLevelScope25.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Imprinter.g:145:9: ^( AT modifierList IDENT annotationTopLevelScope )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AT26=(CommonTree)match(input,AT,FOLLOW_AT_in_typeDeclaration396); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AT26_tree = (CommonTree)adaptor.dupNode(AT26);

                    root_1 = (CommonTree)adaptor.becomeRoot(AT26_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_typeDeclaration398);
                    modifierList27=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList27.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT28=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeDeclaration400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT28_tree = (CommonTree)adaptor.dupNode(IDENT28);

                    adaptor.addChild(root_1, IDENT28_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_annotationTopLevelScope_in_typeDeclaration402);
                    annotationTopLevelScope29=annotationTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, annotationTopLevelScope29.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 4, typeDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeDeclaration"

    public static class extendsClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "extendsClause"
    // Imprinter.g:148:1: extendsClause : ^( EXTENDS_CLAUSE ( type )+ ) ;
    public final Imprinter.extendsClause_return extendsClause() throws RecognitionException {
        Imprinter.extendsClause_return retval = new Imprinter.extendsClause_return();
        retval.start = input.LT(1);
        int extendsClause_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS_CLAUSE30=null;
        Imprinter.type_return type31 = null;


        CommonTree EXTENDS_CLAUSE30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
            // Imprinter.g:150:5: ( ^( EXTENDS_CLAUSE ( type )+ ) )
            // Imprinter.g:150:9: ^( EXTENDS_CLAUSE ( type )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EXTENDS_CLAUSE30=(CommonTree)match(input,EXTENDS_CLAUSE,FOLLOW_EXTENDS_CLAUSE_in_extendsClause439); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS_CLAUSE30_tree = (CommonTree)adaptor.dupNode(EXTENDS_CLAUSE30);

            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS_CLAUSE30_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:150:26: ( type )+
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
            	    // Imprinter.g:0:0: type
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_type_in_extendsClause441);
            	    type31=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, type31.getTree());

            	    if ( state.backtracking==0 ) {
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


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 5, extendsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "extendsClause"

    public static class implementsClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "implementsClause"
    // Imprinter.g:153:1: implementsClause : ^( IMPLEMENTS_CLAUSE ( type )+ ) ;
    public final Imprinter.implementsClause_return implementsClause() throws RecognitionException {
        Imprinter.implementsClause_return retval = new Imprinter.implementsClause_return();
        retval.start = input.LT(1);
        int implementsClause_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IMPLEMENTS_CLAUSE32=null;
        Imprinter.type_return type33 = null;


        CommonTree IMPLEMENTS_CLAUSE32_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
            // Imprinter.g:154:5: ( ^( IMPLEMENTS_CLAUSE ( type )+ ) )
            // Imprinter.g:154:9: ^( IMPLEMENTS_CLAUSE ( type )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IMPLEMENTS_CLAUSE32=(CommonTree)match(input,IMPLEMENTS_CLAUSE,FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause470); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IMPLEMENTS_CLAUSE32_tree = (CommonTree)adaptor.dupNode(IMPLEMENTS_CLAUSE32);

            root_1 = (CommonTree)adaptor.becomeRoot(IMPLEMENTS_CLAUSE32_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:154:29: ( type )+
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
            	    // Imprinter.g:0:0: type
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_type_in_implementsClause472);
            	    type33=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, type33.getTree());

            	    if ( state.backtracking==0 ) {
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


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 6, implementsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "implementsClause"

    public static class genericTypeParameterList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericTypeParameterList"
    // Imprinter.g:157:1: genericTypeParameterList : ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) ;
    public final Imprinter.genericTypeParameterList_return genericTypeParameterList() throws RecognitionException {
        Imprinter.genericTypeParameterList_return retval = new Imprinter.genericTypeParameterList_return();
        retval.start = input.LT(1);
        int genericTypeParameterList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GENERIC_TYPE_PARAM_LIST34=null;
        Imprinter.genericTypeParameter_return genericTypeParameter35 = null;


        CommonTree GENERIC_TYPE_PARAM_LIST34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
            // Imprinter.g:158:5: ( ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ ) )
            // Imprinter.g:158:9: ^( GENERIC_TYPE_PARAM_LIST ( genericTypeParameter )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GENERIC_TYPE_PARAM_LIST34=(CommonTree)match(input,GENERIC_TYPE_PARAM_LIST,FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList502); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GENERIC_TYPE_PARAM_LIST34_tree = (CommonTree)adaptor.dupNode(GENERIC_TYPE_PARAM_LIST34);

            root_1 = (CommonTree)adaptor.becomeRoot(GENERIC_TYPE_PARAM_LIST34_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:158:35: ( genericTypeParameter )+
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
            	    // Imprinter.g:0:0: genericTypeParameter
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_genericTypeParameter_in_genericTypeParameterList504);
            	    genericTypeParameter35=genericTypeParameter();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, genericTypeParameter35.getTree());

            	    if ( state.backtracking==0 ) {
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


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 7, genericTypeParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeParameterList"

    public static class genericTypeParameter_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericTypeParameter"
    // Imprinter.g:161:1: genericTypeParameter : ^( IDENT ( bound )? ) ;
    public final Imprinter.genericTypeParameter_return genericTypeParameter() throws RecognitionException {
        Imprinter.genericTypeParameter_return retval = new Imprinter.genericTypeParameter_return();
        retval.start = input.LT(1);
        int genericTypeParameter_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT36=null;
        Imprinter.bound_return bound37 = null;


        CommonTree IDENT36_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
            // Imprinter.g:162:5: ( ^( IDENT ( bound )? ) )
            // Imprinter.g:162:9: ^( IDENT ( bound )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IDENT36=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_genericTypeParameter526); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT36_tree = (CommonTree)adaptor.dupNode(IDENT36);

            root_1 = (CommonTree)adaptor.becomeRoot(IDENT36_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:162:17: ( bound )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==EXTENDS_BOUND_LIST) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // Imprinter.g:0:0: bound
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_bound_in_genericTypeParameter528);
                        bound37=bound();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, bound37.getTree());

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 8, genericTypeParameter_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeParameter"

    public static class bound_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "bound"
    // Imprinter.g:165:1: bound : ^( EXTENDS_BOUND_LIST ( type )+ ) ;
    public final Imprinter.bound_return bound() throws RecognitionException {
        Imprinter.bound_return retval = new Imprinter.bound_return();
        retval.start = input.LT(1);
        int bound_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS_BOUND_LIST38=null;
        Imprinter.type_return type39 = null;


        CommonTree EXTENDS_BOUND_LIST38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
            // Imprinter.g:166:5: ( ^( EXTENDS_BOUND_LIST ( type )+ ) )
            // Imprinter.g:166:9: ^( EXTENDS_BOUND_LIST ( type )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EXTENDS_BOUND_LIST38=(CommonTree)match(input,EXTENDS_BOUND_LIST,FOLLOW_EXTENDS_BOUND_LIST_in_bound558); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXTENDS_BOUND_LIST38_tree = (CommonTree)adaptor.dupNode(EXTENDS_BOUND_LIST38);

            root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS_BOUND_LIST38_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:166:30: ( type )+
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
            	    // Imprinter.g:0:0: type
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_type_in_bound560);
            	    type39=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, type39.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
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


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 9, bound_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "bound"

    public static class enumTopLevelScope_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumTopLevelScope"
    // Imprinter.g:169:1: enumTopLevelScope : ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) ;
    public final Imprinter.enumTopLevelScope_return enumTopLevelScope() throws RecognitionException {
        Imprinter.enumTopLevelScope_return retval = new Imprinter.enumTopLevelScope_return();
        retval.start = input.LT(1);
        int enumTopLevelScope_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ENUM_TOP_LEVEL_SCOPE40=null;
        Imprinter.enumConstant_return enumConstant41 = null;

        Imprinter.classTopLevelScope_return classTopLevelScope42 = null;


        CommonTree ENUM_TOP_LEVEL_SCOPE40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
            // Imprinter.g:170:5: ( ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? ) )
            // Imprinter.g:170:9: ^( ENUM_TOP_LEVEL_SCOPE ( enumConstant )+ ( classTopLevelScope )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ENUM_TOP_LEVEL_SCOPE40=(CommonTree)match(input,ENUM_TOP_LEVEL_SCOPE,FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope582); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ENUM_TOP_LEVEL_SCOPE40_tree = (CommonTree)adaptor.dupNode(ENUM_TOP_LEVEL_SCOPE40);

            root_1 = (CommonTree)adaptor.becomeRoot(ENUM_TOP_LEVEL_SCOPE40_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:170:32: ( enumConstant )+
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
            	    // Imprinter.g:0:0: enumConstant
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_enumConstant_in_enumTopLevelScope584);
            	    enumConstant41=enumConstant();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, enumConstant41.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
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

            // Imprinter.g:170:46: ( classTopLevelScope )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Imprinter.g:0:0: classTopLevelScope
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classTopLevelScope_in_enumTopLevelScope587);
                    classTopLevelScope42=classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, classTopLevelScope42.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 10, enumTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumTopLevelScope"

    public static class enumConstant_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumConstant"
    // Imprinter.g:173:1: enumConstant : ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) ;
    public final Imprinter.enumConstant_return enumConstant() throws RecognitionException {
        Imprinter.enumConstant_return retval = new Imprinter.enumConstant_return();
        retval.start = input.LT(1);
        int enumConstant_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT43=null;
        Imprinter.annotationList_return annotationList44 = null;

        Imprinter.arguments_return arguments45 = null;

        Imprinter.classTopLevelScope_return classTopLevelScope46 = null;


        CommonTree IDENT43_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
            // Imprinter.g:174:5: ( ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? ) )
            // Imprinter.g:174:9: ^( IDENT annotationList ( arguments )? ( classTopLevelScope )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IDENT43=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_enumConstant613); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT43_tree = (CommonTree)adaptor.dupNode(IDENT43);

            root_1 = (CommonTree)adaptor.becomeRoot(IDENT43_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationList_in_enumConstant615);
            annotationList44=annotationList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, annotationList44.getTree());
            // Imprinter.g:174:32: ( arguments )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ARGUMENT_LIST) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Imprinter.g:0:0: arguments
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arguments_in_enumConstant617);
                    arguments45=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arguments45.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            // Imprinter.g:174:43: ( classTopLevelScope )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Imprinter.g:0:0: classTopLevelScope
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classTopLevelScope_in_enumConstant620);
                    classTopLevelScope46=classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, classTopLevelScope46.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 11, enumConstant_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "enumConstant"

    protected static class classTopLevelScope_scope {
        List<JDeclaration> innerList;
    }
    protected Stack classTopLevelScope_stack = new Stack();

    public static class classTopLevelScope_return extends TreeRuleReturnScope {
        public List<JDeclaration> lst;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classTopLevelScope"
    // Imprinter.g:178:1: classTopLevelScope returns [List<JDeclaration> lst] : ^( CLASS_TOP_LEVEL_SCOPE (decl= classScopeDeclarations )* ) ;
    public final Imprinter.classTopLevelScope_return classTopLevelScope() throws RecognitionException {
        classTopLevelScope_stack.push(new classTopLevelScope_scope());
        Imprinter.classTopLevelScope_return retval = new Imprinter.classTopLevelScope_return();
        retval.start = input.LT(1);
        int classTopLevelScope_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS_TOP_LEVEL_SCOPE47=null;
        Imprinter.classScopeDeclarations_return decl = null;


        CommonTree CLASS_TOP_LEVEL_SCOPE47_tree=null;


          ((classTopLevelScope_scope)classTopLevelScope_stack.peek()).innerList = new ArrayList<JDeclaration>();
          retval.lst = new ArrayList<JDeclaration>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
            // Imprinter.g:189:5: ( ^( CLASS_TOP_LEVEL_SCOPE (decl= classScopeDeclarations )* ) )
            // Imprinter.g:189:9: ^( CLASS_TOP_LEVEL_SCOPE (decl= classScopeDeclarations )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CLASS_TOP_LEVEL_SCOPE47=(CommonTree)match(input,CLASS_TOP_LEVEL_SCOPE,FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope666); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS_TOP_LEVEL_SCOPE47_tree = (CommonTree)adaptor.dupNode(CLASS_TOP_LEVEL_SCOPE47);

            root_1 = (CommonTree)adaptor.becomeRoot(CLASS_TOP_LEVEL_SCOPE47_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:189:33: (decl= classScopeDeclarations )*
                loop22:
                do {
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==AT||LA22_0==CLASS||LA22_0==ENUM||LA22_0==INTERFACE||(LA22_0>=CLASS_INSTANCE_INITIALIZER && LA22_0<=CLASS_STATIC_INITIALIZER)||LA22_0==CONSTRUCTOR_DECL||LA22_0==FUNCTION_METHOD_DECL||LA22_0==VAR_DECLARATION||LA22_0==VOID_METHOD_DECL) ) {
                        alt22=1;
                    }


                    switch (alt22) {
                	case 1 :
                	    // Imprinter.g:189:34: decl= classScopeDeclarations
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_classScopeDeclarations_in_classTopLevelScope671);
                	    decl=classScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, decl.getTree());
                	    if ( state.backtracking==0 ) {
                	      if ((decl!=null?decl.value:null) != null) retval.lst.add((decl!=null?decl.value:null));
                	    }

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop22;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
            if ( state.backtracking==0 ) {

                retval.lst.addAll(((classTopLevelScope_scope)classTopLevelScope_stack.peek()).innerList);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 12, classTopLevelScope_StartIndex); }
            classTopLevelScope_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classTopLevelScope"

    protected static class classScopeDeclarations_scope {
        JCodeBlock block;
    }
    protected Stack classScopeDeclarations_stack = new Stack();

    public static class classScopeDeclarations_return extends TreeRuleReturnScope {
        public JDeclaration value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classScopeDeclarations"
    // Imprinter.g:192:1: classScopeDeclarations returns [JDeclaration value] : ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration );
    public final Imprinter.classScopeDeclarations_return classScopeDeclarations() throws RecognitionException {
        classScopeDeclarations_stack.push(new classScopeDeclarations_scope());
        Imprinter.classScopeDeclarations_return retval = new Imprinter.classScopeDeclarations_return();
        retval.start = input.LT(1);
        int classScopeDeclarations_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS_INSTANCE_INITIALIZER48=null;
        CommonTree CLASS_STATIC_INITIALIZER50=null;
        CommonTree FUNCTION_METHOD_DECL52=null;
        CommonTree IDENT56=null;
        CommonTree VOID_METHOD_DECL61=null;
        CommonTree IDENT64=null;
        CommonTree VAR_DECLARATION68=null;
        CommonTree CONSTRUCTOR_DECL72=null;
        Imprinter.block_return block49 = null;

        Imprinter.block_return block51 = null;

        Imprinter.modifierList_return modifierList53 = null;

        Imprinter.genericTypeParameterList_return genericTypeParameterList54 = null;

        Imprinter.type_return type55 = null;

        Imprinter.formalParameterList_return formalParameterList57 = null;

        Imprinter.arrayDeclaratorList_return arrayDeclaratorList58 = null;

        Imprinter.throwsClause_return throwsClause59 = null;

        Imprinter.block_return block60 = null;

        Imprinter.modifierList_return modifierList62 = null;

        Imprinter.genericTypeParameterList_return genericTypeParameterList63 = null;

        Imprinter.formalParameterList_return formalParameterList65 = null;

        Imprinter.throwsClause_return throwsClause66 = null;

        Imprinter.block_return block67 = null;

        Imprinter.modifierList_return modifierList69 = null;

        Imprinter.type_return type70 = null;

        Imprinter.variableDeclaratorList_return variableDeclaratorList71 = null;

        Imprinter.modifierList_return modifierList73 = null;

        Imprinter.genericTypeParameterList_return genericTypeParameterList74 = null;

        Imprinter.formalParameterList_return formalParameterList75 = null;

        Imprinter.throwsClause_return throwsClause76 = null;

        Imprinter.block_return block77 = null;

        Imprinter.typeDeclaration_return typeDeclaration78 = null;


        CommonTree CLASS_INSTANCE_INITIALIZER48_tree=null;
        CommonTree CLASS_STATIC_INITIALIZER50_tree=null;
        CommonTree FUNCTION_METHOD_DECL52_tree=null;
        CommonTree IDENT56_tree=null;
        CommonTree VOID_METHOD_DECL61_tree=null;
        CommonTree IDENT64_tree=null;
        CommonTree VAR_DECLARATION68_tree=null;
        CommonTree CONSTRUCTOR_DECL72_tree=null;


          ((classScopeDeclarations_scope)classScopeDeclarations_stack.peek()).block = new JCodeBlock();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
            // Imprinter.g:199:5: ( ^( CLASS_INSTANCE_INITIALIZER block ) | ^( CLASS_STATIC_INITIALIZER block ) | ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block ) | typeDeclaration )
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
                    // Imprinter.g:199:9: ^( CLASS_INSTANCE_INITIALIZER block )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CLASS_INSTANCE_INITIALIZER48=(CommonTree)match(input,CLASS_INSTANCE_INITIALIZER,FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations716); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS_INSTANCE_INITIALIZER48_tree = (CommonTree)adaptor.dupNode(CLASS_INSTANCE_INITIALIZER48);

                    root_1 = (CommonTree)adaptor.becomeRoot(CLASS_INSTANCE_INITIALIZER48_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_classScopeDeclarations718);
                    block49=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, block49.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:200:9: ^( CLASS_STATIC_INITIALIZER block )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CLASS_STATIC_INITIALIZER50=(CommonTree)match(input,CLASS_STATIC_INITIALIZER,FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations730); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS_STATIC_INITIALIZER50_tree = (CommonTree)adaptor.dupNode(CLASS_STATIC_INITIALIZER50);

                    root_1 = (CommonTree)adaptor.becomeRoot(CLASS_STATIC_INITIALIZER50_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_classScopeDeclarations732);
                    block51=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, block51.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:201:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ( block )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FUNCTION_METHOD_DECL52=(CommonTree)match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations744); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FUNCTION_METHOD_DECL52_tree = (CommonTree)adaptor.dupNode(FUNCTION_METHOD_DECL52);

                    root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION_METHOD_DECL52_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations746);
                    modifierList53=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList53.getTree());
                    // Imprinter.g:201:45: ( genericTypeParameterList )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeParameterList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations748);
                            genericTypeParameterList54=genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeParameterList54.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_classScopeDeclarations751);
                    type55=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type55.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT56=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations753); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT56_tree = (CommonTree)adaptor.dupNode(IDENT56);

                    adaptor.addChild(root_1, IDENT56_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations755);
                    formalParameterList57=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, formalParameterList57.getTree());
                    // Imprinter.g:201:102: ( arrayDeclaratorList )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==ARRAY_DECLARATOR_LIST) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // Imprinter.g:0:0: arrayDeclaratorList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_arrayDeclaratorList_in_classScopeDeclarations757);
                            arrayDeclaratorList58=arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, arrayDeclaratorList58.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:201:123: ( throwsClause )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==THROWS_CLAUSE) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // Imprinter.g:0:0: throwsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations760);
                            throwsClause59=throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, throwsClause59.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:201:137: ( block )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==BLOCK_SCOPE) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // Imprinter.g:0:0: block
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_block_in_classScopeDeclarations763);
                            block60=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, block60.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       
                                JMethodDeclaration mtd = new JMethodDeclaration((IDENT56!=null?IDENT56.getText():null));
                                mtd.parameters.addAll((formalParameterList57!=null?formalParameterList57.lst:null));
                                mtd.block = ((classScopeDeclarations_scope)classScopeDeclarations_stack.peek()).block;          
                                retval.value = mtd;
                              
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Imprinter.g:208:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ( block )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VOID_METHOD_DECL61=(CommonTree)match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations786); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID_METHOD_DECL61_tree = (CommonTree)adaptor.dupNode(VOID_METHOD_DECL61);

                    root_1 = (CommonTree)adaptor.becomeRoot(VOID_METHOD_DECL61_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations788);
                    modifierList62=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList62.getTree());
                    // Imprinter.g:208:41: ( genericTypeParameterList )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeParameterList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations790);
                            genericTypeParameterList63=genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeParameterList63.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    IDENT64=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_classScopeDeclarations793); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT64_tree = (CommonTree)adaptor.dupNode(IDENT64);

                    adaptor.addChild(root_1, IDENT64_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations795);
                    formalParameterList65=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, formalParameterList65.getTree());
                    // Imprinter.g:208:93: ( throwsClause )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==THROWS_CLAUSE) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // Imprinter.g:0:0: throwsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations797);
                            throwsClause66=throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, throwsClause66.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:208:107: ( block )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==BLOCK_SCOPE) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // Imprinter.g:0:0: block
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_block_in_classScopeDeclarations800);
                            block67=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, block67.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       
                                JMethodDeclaration mtd = new JMethodDeclaration((IDENT64!=null?IDENT64.getText():null));
                                mtd.parameters.addAll((formalParameterList65!=null?formalParameterList65.lst:null));
                                mtd.block = ((classScopeDeclarations_scope)classScopeDeclarations_stack.peek()).block;          
                                retval.value = mtd;
                              
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // Imprinter.g:215:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR_DECLARATION68=(CommonTree)match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_classScopeDeclarations827); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR_DECLARATION68_tree = (CommonTree)adaptor.dupNode(VAR_DECLARATION68);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR_DECLARATION68_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations829);
                    modifierList69=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList69.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_classScopeDeclarations831);
                    type70=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type70.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variableDeclaratorList_in_classScopeDeclarations833);
                    variableDeclaratorList71=variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variableDeclaratorList71.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                       ((classTopLevelScope_scope)classTopLevelScope_stack.peek()).innerList.addAll((variableDeclaratorList71!=null?variableDeclaratorList71.lst:null)); 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // Imprinter.g:217:9: ^( CONSTRUCTOR_DECL modifierList ( genericTypeParameterList )? formalParameterList ( throwsClause )? block )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONSTRUCTOR_DECL72=(CommonTree)match(input,CONSTRUCTOR_DECL,FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations855); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONSTRUCTOR_DECL72_tree = (CommonTree)adaptor.dupNode(CONSTRUCTOR_DECL72);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONSTRUCTOR_DECL72_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_classScopeDeclarations857);
                    modifierList73=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList73.getTree());
                    // Imprinter.g:217:41: ( genericTypeParameterList )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeParameterList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeParameterList_in_classScopeDeclarations859);
                            genericTypeParameterList74=genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeParameterList74.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_formalParameterList_in_classScopeDeclarations862);
                    formalParameterList75=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, formalParameterList75.getTree());
                    // Imprinter.g:217:87: ( throwsClause )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==THROWS_CLAUSE) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // Imprinter.g:0:0: throwsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_throwsClause_in_classScopeDeclarations864);
                            throwsClause76=throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, throwsClause76.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_classScopeDeclarations867);
                    block77=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, block77.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // Imprinter.g:218:9: typeDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeDeclaration_in_classScopeDeclarations878);
                    typeDeclaration78=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, typeDeclaration78.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 13, classScopeDeclarations_StartIndex); }
            classScopeDeclarations_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "classScopeDeclarations"

    public static class interfaceTopLevelScope_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceTopLevelScope"
    // Imprinter.g:221:1: interfaceTopLevelScope : ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) ;
    public final Imprinter.interfaceTopLevelScope_return interfaceTopLevelScope() throws RecognitionException {
        Imprinter.interfaceTopLevelScope_return retval = new Imprinter.interfaceTopLevelScope_return();
        retval.start = input.LT(1);
        int interfaceTopLevelScope_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree INTERFACE_TOP_LEVEL_SCOPE79=null;
        Imprinter.interfaceScopeDeclarations_return interfaceScopeDeclarations80 = null;


        CommonTree INTERFACE_TOP_LEVEL_SCOPE79_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }
            // Imprinter.g:222:5: ( ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* ) )
            // Imprinter.g:222:9: ^( INTERFACE_TOP_LEVEL_SCOPE ( interfaceScopeDeclarations )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            INTERFACE_TOP_LEVEL_SCOPE79=(CommonTree)match(input,INTERFACE_TOP_LEVEL_SCOPE,FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope902); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INTERFACE_TOP_LEVEL_SCOPE79_tree = (CommonTree)adaptor.dupNode(INTERFACE_TOP_LEVEL_SCOPE79);

            root_1 = (CommonTree)adaptor.becomeRoot(INTERFACE_TOP_LEVEL_SCOPE79_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:222:37: ( interfaceScopeDeclarations )*
                loop33:
                do {
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==AT||LA33_0==CLASS||LA33_0==ENUM||LA33_0==INTERFACE||LA33_0==FUNCTION_METHOD_DECL||LA33_0==VAR_DECLARATION||LA33_0==VOID_METHOD_DECL) ) {
                        alt33=1;
                    }


                    switch (alt33) {
                	case 1 :
                	    // Imprinter.g:0:0: interfaceScopeDeclarations
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope904);
                	    interfaceScopeDeclarations80=interfaceScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, interfaceScopeDeclarations80.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop33;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 14, interfaceTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceTopLevelScope"

    public static class interfaceScopeDeclarations_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "interfaceScopeDeclarations"
    // Imprinter.g:225:1: interfaceScopeDeclarations : ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final Imprinter.interfaceScopeDeclarations_return interfaceScopeDeclarations() throws RecognitionException {
        Imprinter.interfaceScopeDeclarations_return retval = new Imprinter.interfaceScopeDeclarations_return();
        retval.start = input.LT(1);
        int interfaceScopeDeclarations_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FUNCTION_METHOD_DECL81=null;
        CommonTree IDENT85=null;
        CommonTree VOID_METHOD_DECL89=null;
        CommonTree IDENT92=null;
        CommonTree VAR_DECLARATION95=null;
        Imprinter.modifierList_return modifierList82 = null;

        Imprinter.genericTypeParameterList_return genericTypeParameterList83 = null;

        Imprinter.type_return type84 = null;

        Imprinter.formalParameterList_return formalParameterList86 = null;

        Imprinter.arrayDeclaratorList_return arrayDeclaratorList87 = null;

        Imprinter.throwsClause_return throwsClause88 = null;

        Imprinter.modifierList_return modifierList90 = null;

        Imprinter.genericTypeParameterList_return genericTypeParameterList91 = null;

        Imprinter.formalParameterList_return formalParameterList93 = null;

        Imprinter.throwsClause_return throwsClause94 = null;

        Imprinter.modifierList_return modifierList96 = null;

        Imprinter.type_return type97 = null;

        Imprinter.variableDeclaratorList_return variableDeclaratorList98 = null;

        Imprinter.typeDeclaration_return typeDeclaration99 = null;


        CommonTree FUNCTION_METHOD_DECL81_tree=null;
        CommonTree IDENT85_tree=null;
        CommonTree VOID_METHOD_DECL89_tree=null;
        CommonTree IDENT92_tree=null;
        CommonTree VAR_DECLARATION95_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }
            // Imprinter.g:226:5: ( ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? ) | ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
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
                    // Imprinter.g:226:9: ^( FUNCTION_METHOD_DECL modifierList ( genericTypeParameterList )? type IDENT formalParameterList ( arrayDeclaratorList )? ( throwsClause )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FUNCTION_METHOD_DECL81=(CommonTree)match(input,FUNCTION_METHOD_DECL,FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations930); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FUNCTION_METHOD_DECL81_tree = (CommonTree)adaptor.dupNode(FUNCTION_METHOD_DECL81);

                    root_1 = (CommonTree)adaptor.becomeRoot(FUNCTION_METHOD_DECL81_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations932);
                    modifierList82=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList82.getTree());
                    // Imprinter.g:226:45: ( genericTypeParameterList )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeParameterList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations934);
                            genericTypeParameterList83=genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeParameterList83.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations937);
                    type84=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type84.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT85=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations939); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT85_tree = (CommonTree)adaptor.dupNode(IDENT85);

                    adaptor.addChild(root_1, IDENT85_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations941);
                    formalParameterList86=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, formalParameterList86.getTree());
                    // Imprinter.g:226:102: ( arrayDeclaratorList )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==ARRAY_DECLARATOR_LIST) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // Imprinter.g:0:0: arrayDeclaratorList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations943);
                            arrayDeclaratorList87=arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, arrayDeclaratorList87.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:226:123: ( throwsClause )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==THROWS_CLAUSE) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // Imprinter.g:0:0: throwsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations946);
                            throwsClause88=throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, throwsClause88.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:227:9: ^( VOID_METHOD_DECL modifierList ( genericTypeParameterList )? IDENT formalParameterList ( throwsClause )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VOID_METHOD_DECL89=(CommonTree)match(input,VOID_METHOD_DECL,FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations959); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOID_METHOD_DECL89_tree = (CommonTree)adaptor.dupNode(VOID_METHOD_DECL89);

                    root_1 = (CommonTree)adaptor.becomeRoot(VOID_METHOD_DECL89_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations961);
                    modifierList90=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList90.getTree());
                    // Imprinter.g:227:41: ( genericTypeParameterList )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==GENERIC_TYPE_PARAM_LIST) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeParameterList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations963);
                            genericTypeParameterList91=genericTypeParameterList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeParameterList91.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    IDENT92=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_interfaceScopeDeclarations966); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT92_tree = (CommonTree)adaptor.dupNode(IDENT92);

                    adaptor.addChild(root_1, IDENT92_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_formalParameterList_in_interfaceScopeDeclarations968);
                    formalParameterList93=formalParameterList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, formalParameterList93.getTree());
                    // Imprinter.g:227:93: ( throwsClause )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==THROWS_CLAUSE) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // Imprinter.g:0:0: throwsClause
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_throwsClause_in_interfaceScopeDeclarations970);
                            throwsClause94=throwsClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, throwsClause94.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:231:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR_DECLARATION95=(CommonTree)match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations1061); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR_DECLARATION95_tree = (CommonTree)adaptor.dupNode(VAR_DECLARATION95);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR_DECLARATION95_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_interfaceScopeDeclarations1063);
                    modifierList96=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList96.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_interfaceScopeDeclarations1065);
                    type97=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type97.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations1067);
                    variableDeclaratorList98=variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variableDeclaratorList98.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Imprinter.g:232:9: typeDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeDeclaration_in_interfaceScopeDeclarations1078);
                    typeDeclaration99=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, typeDeclaration99.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 15, interfaceScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "interfaceScopeDeclarations"

    public static class variableDeclaratorList_return extends TreeRuleReturnScope {
        public List<JVariableDeclaration> lst;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaratorList"
    // Imprinter.g:235:1: variableDeclaratorList returns [List<JVariableDeclaration> lst] : ^( VAR_DECLARATOR_LIST (decl= variableDeclarator )+ ) ;
    public final Imprinter.variableDeclaratorList_return variableDeclaratorList() throws RecognitionException {
        Imprinter.variableDeclaratorList_return retval = new Imprinter.variableDeclaratorList_return();
        retval.start = input.LT(1);
        int variableDeclaratorList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VAR_DECLARATOR_LIST100=null;
        Imprinter.variableDeclarator_return decl = null;


        CommonTree VAR_DECLARATOR_LIST100_tree=null;


          retval.lst = new ArrayList();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }
            // Imprinter.g:239:5: ( ^( VAR_DECLARATOR_LIST (decl= variableDeclarator )+ ) )
            // Imprinter.g:239:9: ^( VAR_DECLARATOR_LIST (decl= variableDeclarator )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            VAR_DECLARATOR_LIST100=(CommonTree)match(input,VAR_DECLARATOR_LIST,FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList1106); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_DECLARATOR_LIST100_tree = (CommonTree)adaptor.dupNode(VAR_DECLARATOR_LIST100);

            root_1 = (CommonTree)adaptor.becomeRoot(VAR_DECLARATOR_LIST100_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:239:31: (decl= variableDeclarator )+
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
            	    // Imprinter.g:239:32: decl= variableDeclarator
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_variableDeclarator_in_variableDeclaratorList1111);
            	    decl=variableDeclarator();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, decl.getTree());
            	    if ( state.backtracking==0 ) {
            	      if ((decl!=null?decl.value:null)!=null) retval.lst.add((decl!=null?decl.value:null));
            	    }

            	    if ( state.backtracking==0 ) {
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


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 16, variableDeclaratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorList"

    public static class variableDeclarator_return extends TreeRuleReturnScope {
        public JVariableDeclaration value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarator"
    // Imprinter.g:242:1: variableDeclarator returns [JVariableDeclaration value] : ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) ;
    public final Imprinter.variableDeclarator_return variableDeclarator() throws RecognitionException {
        Imprinter.variableDeclarator_return retval = new Imprinter.variableDeclarator_return();
        retval.start = input.LT(1);
        int variableDeclarator_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VAR_DECLARATOR101=null;
        Imprinter.variableDeclaratorId_return variableDeclaratorId102 = null;

        Imprinter.variableInitializer_return variableInitializer103 = null;


        CommonTree VAR_DECLARATOR101_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }
            // Imprinter.g:243:5: ( ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? ) )
            // Imprinter.g:243:9: ^( VAR_DECLARATOR variableDeclaratorId ( variableInitializer )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            VAR_DECLARATOR101=(CommonTree)match(input,VAR_DECLARATOR,FOLLOW_VAR_DECLARATOR_in_variableDeclarator1139); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_DECLARATOR101_tree = (CommonTree)adaptor.dupNode(VAR_DECLARATOR101);

            root_1 = (CommonTree)adaptor.becomeRoot(VAR_DECLARATOR101_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variableDeclaratorId_in_variableDeclarator1141);
            variableDeclaratorId102=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, variableDeclaratorId102.getTree());
            // Imprinter.g:243:47: ( variableInitializer )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ARRAY_INITIALIZER||LA41_0==EXPR) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // Imprinter.g:0:0: variableInitializer
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variableInitializer_in_variableDeclarator1143);
                    variableInitializer103=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variableInitializer103.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
               retval.value = new JVariableDeclaration((variableDeclaratorId102!=null?variableDeclaratorId102.id:null)); 
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 17, variableDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclarator"

    public static class variableDeclaratorId_return extends TreeRuleReturnScope {
        public String id;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclaratorId"
    // Imprinter.g:247:1: variableDeclaratorId returns [String id] : ^( IDENT ( arrayDeclaratorList )? ) ;
    public final Imprinter.variableDeclaratorId_return variableDeclaratorId() throws RecognitionException {
        Imprinter.variableDeclaratorId_return retval = new Imprinter.variableDeclaratorId_return();
        retval.start = input.LT(1);
        int variableDeclaratorId_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT104=null;
        Imprinter.arrayDeclaratorList_return arrayDeclaratorList105 = null;


        CommonTree IDENT104_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }
            // Imprinter.g:248:5: ( ^( IDENT ( arrayDeclaratorList )? ) )
            // Imprinter.g:248:9: ^( IDENT ( arrayDeclaratorList )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IDENT104=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_variableDeclaratorId1182); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT104_tree = (CommonTree)adaptor.dupNode(IDENT104);

            root_1 = (CommonTree)adaptor.becomeRoot(IDENT104_tree, root_1);
            }

            if ( state.backtracking==0 ) {
              retval.id =(IDENT104!=null?IDENT104.getText():null);
            }

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:248:36: ( arrayDeclaratorList )?
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ARRAY_DECLARATOR_LIST) ) {
                    alt42=1;
                }
                switch (alt42) {
                    case 1 :
                        // Imprinter.g:0:0: arrayDeclaratorList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1186);
                        arrayDeclaratorList105=arrayDeclaratorList();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, arrayDeclaratorList105.getTree());

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 18, variableDeclaratorId_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableDeclaratorId"

    public static class variableInitializer_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitializer"
    // Imprinter.g:251:1: variableInitializer : ( arrayInitializer | expression );
    public final Imprinter.variableInitializer_return variableInitializer() throws RecognitionException {
        Imprinter.variableInitializer_return retval = new Imprinter.variableInitializer_return();
        retval.start = input.LT(1);
        int variableInitializer_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Imprinter.arrayInitializer_return arrayInitializer106 = null;

        Imprinter.expression_return expression107 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }
            // Imprinter.g:252:5: ( arrayInitializer | expression )
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
                    // Imprinter.g:252:9: arrayInitializer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer1207);
                    arrayInitializer106=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayInitializer106.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:253:9: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_variableInitializer1217);
                    expression107=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression107.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 19, variableInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayDeclarator_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayDeclarator"
    // Imprinter.g:256:1: arrayDeclarator : LBRACK RBRACK ;
    public final Imprinter.arrayDeclarator_return arrayDeclarator() throws RecognitionException {
        Imprinter.arrayDeclarator_return retval = new Imprinter.arrayDeclarator_return();
        retval.start = input.LT(1);
        int arrayDeclarator_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LBRACK108=null;
        CommonTree RBRACK109=null;

        CommonTree LBRACK108_tree=null;
        CommonTree RBRACK109_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return retval; }
            // Imprinter.g:257:5: ( LBRACK RBRACK )
            // Imprinter.g:257:9: LBRACK RBRACK
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            LBRACK108=(CommonTree)match(input,LBRACK,FOLLOW_LBRACK_in_arrayDeclarator1236); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACK108_tree = (CommonTree)adaptor.dupNode(LBRACK108);

            adaptor.addChild(root_0, LBRACK108_tree);
            }
            _last = (CommonTree)input.LT(1);
            RBRACK109=(CommonTree)match(input,RBRACK,FOLLOW_RBRACK_in_arrayDeclarator1238); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACK109_tree = (CommonTree)adaptor.dupNode(RBRACK109);

            adaptor.addChild(root_0, RBRACK109_tree);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 20, arrayDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclarator"

    public static class arrayDeclaratorList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayDeclaratorList"
    // Imprinter.g:260:1: arrayDeclaratorList : ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) ;
    public final Imprinter.arrayDeclaratorList_return arrayDeclaratorList() throws RecognitionException {
        Imprinter.arrayDeclaratorList_return retval = new Imprinter.arrayDeclaratorList_return();
        retval.start = input.LT(1);
        int arrayDeclaratorList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAY_DECLARATOR_LIST110=null;
        CommonTree ARRAY_DECLARATOR111=null;

        CommonTree ARRAY_DECLARATOR_LIST110_tree=null;
        CommonTree ARRAY_DECLARATOR111_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return retval; }
            // Imprinter.g:261:5: ( ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* ) )
            // Imprinter.g:261:9: ^( ARRAY_DECLARATOR_LIST ( ARRAY_DECLARATOR )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ARRAY_DECLARATOR_LIST110=(CommonTree)match(input,ARRAY_DECLARATOR_LIST,FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1258); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARRAY_DECLARATOR_LIST110_tree = (CommonTree)adaptor.dupNode(ARRAY_DECLARATOR_LIST110);

            root_1 = (CommonTree)adaptor.becomeRoot(ARRAY_DECLARATOR_LIST110_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:261:33: ( ARRAY_DECLARATOR )*
                loop44:
                do {
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==ARRAY_DECLARATOR) ) {
                        alt44=1;
                    }


                    switch (alt44) {
                	case 1 :
                	    // Imprinter.g:0:0: ARRAY_DECLARATOR
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    ARRAY_DECLARATOR111=(CommonTree)match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1260); if (state.failed) return retval;
                	    if ( state.backtracking==0 ) {
                	    ARRAY_DECLARATOR111_tree = (CommonTree)adaptor.dupNode(ARRAY_DECLARATOR111);

                	    adaptor.addChild(root_1, ARRAY_DECLARATOR111_tree);
                	    }

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop44;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 21, arrayDeclaratorList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayDeclaratorList"

    public static class arrayInitializer_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayInitializer"
    // Imprinter.g:264:1: arrayInitializer : ^( ARRAY_INITIALIZER ( variableInitializer )* ) ;
    public final Imprinter.arrayInitializer_return arrayInitializer() throws RecognitionException {
        Imprinter.arrayInitializer_return retval = new Imprinter.arrayInitializer_return();
        retval.start = input.LT(1);
        int arrayInitializer_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAY_INITIALIZER112=null;
        Imprinter.variableInitializer_return variableInitializer113 = null;


        CommonTree ARRAY_INITIALIZER112_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return retval; }
            // Imprinter.g:265:5: ( ^( ARRAY_INITIALIZER ( variableInitializer )* ) )
            // Imprinter.g:265:9: ^( ARRAY_INITIALIZER ( variableInitializer )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ARRAY_INITIALIZER112=(CommonTree)match(input,ARRAY_INITIALIZER,FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1288); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARRAY_INITIALIZER112_tree = (CommonTree)adaptor.dupNode(ARRAY_INITIALIZER112);

            root_1 = (CommonTree)adaptor.becomeRoot(ARRAY_INITIALIZER112_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:265:29: ( variableInitializer )*
                loop45:
                do {
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==ARRAY_INITIALIZER||LA45_0==EXPR) ) {
                        alt45=1;
                    }


                    switch (alt45) {
                	case 1 :
                	    // Imprinter.g:0:0: variableInitializer
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer1290);
                	    variableInitializer113=variableInitializer();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, variableInitializer113.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop45;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 22, arrayInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"

    public static class throwsClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "throwsClause"
    // Imprinter.g:268:1: throwsClause : ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) ;
    public final Imprinter.throwsClause_return throwsClause() throws RecognitionException {
        Imprinter.throwsClause_return retval = new Imprinter.throwsClause_return();
        retval.start = input.LT(1);
        int throwsClause_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THROWS_CLAUSE114=null;
        Imprinter.qualifiedIdentifier_return qualifiedIdentifier115 = null;


        CommonTree THROWS_CLAUSE114_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return retval; }
            // Imprinter.g:269:5: ( ^( THROWS_CLAUSE ( qualifiedIdentifier )+ ) )
            // Imprinter.g:269:9: ^( THROWS_CLAUSE ( qualifiedIdentifier )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            THROWS_CLAUSE114=(CommonTree)match(input,THROWS_CLAUSE,FOLLOW_THROWS_CLAUSE_in_throwsClause1312); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            THROWS_CLAUSE114_tree = (CommonTree)adaptor.dupNode(THROWS_CLAUSE114);

            root_1 = (CommonTree)adaptor.becomeRoot(THROWS_CLAUSE114_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:269:25: ( qualifiedIdentifier )+
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
            	    // Imprinter.g:0:0: qualifiedIdentifier
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_qualifiedIdentifier_in_throwsClause1314);
            	    qualifiedIdentifier115=qualifiedIdentifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, qualifiedIdentifier115.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
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


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 23, throwsClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "throwsClause"

    public static class modifierList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifierList"
    // Imprinter.g:272:1: modifierList : ^( MODIFIER_LIST ( modifier )* ) ;
    public final Imprinter.modifierList_return modifierList() throws RecognitionException {
        Imprinter.modifierList_return retval = new Imprinter.modifierList_return();
        retval.start = input.LT(1);
        int modifierList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree MODIFIER_LIST116=null;
        Imprinter.modifier_return modifier117 = null;


        CommonTree MODIFIER_LIST116_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return retval; }
            // Imprinter.g:273:5: ( ^( MODIFIER_LIST ( modifier )* ) )
            // Imprinter.g:273:9: ^( MODIFIER_LIST ( modifier )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            MODIFIER_LIST116=(CommonTree)match(input,MODIFIER_LIST,FOLLOW_MODIFIER_LIST_in_modifierList1336); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MODIFIER_LIST116_tree = (CommonTree)adaptor.dupNode(MODIFIER_LIST116);

            root_1 = (CommonTree)adaptor.becomeRoot(MODIFIER_LIST116_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:273:25: ( modifier )*
                loop47:
                do {
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==AT||LA47_0==ABSTRACT||LA47_0==FINAL||LA47_0==NATIVE||(LA47_0>=PRIVATE && LA47_0<=PUBLIC)||(LA47_0>=STATIC && LA47_0<=STRICTFP)||LA47_0==SYNCHRONIZED||LA47_0==TRANSIENT||LA47_0==VOLATILE) ) {
                        alt47=1;
                    }


                    switch (alt47) {
                	case 1 :
                	    // Imprinter.g:0:0: modifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_modifier_in_modifierList1338);
                	    modifier117=modifier();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, modifier117.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop47;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 24, modifierList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifierList"

    public static class modifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "modifier"
    // Imprinter.g:276:1: modifier : ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier );
    public final Imprinter.modifier_return modifier() throws RecognitionException {
        Imprinter.modifier_return retval = new Imprinter.modifier_return();
        retval.start = input.LT(1);
        int modifier_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PUBLIC118=null;
        CommonTree PROTECTED119=null;
        CommonTree PRIVATE120=null;
        CommonTree STATIC121=null;
        CommonTree ABSTRACT122=null;
        CommonTree NATIVE123=null;
        CommonTree SYNCHRONIZED124=null;
        CommonTree TRANSIENT125=null;
        CommonTree VOLATILE126=null;
        CommonTree STRICTFP127=null;
        Imprinter.localModifier_return localModifier128 = null;


        CommonTree PUBLIC118_tree=null;
        CommonTree PROTECTED119_tree=null;
        CommonTree PRIVATE120_tree=null;
        CommonTree STATIC121_tree=null;
        CommonTree ABSTRACT122_tree=null;
        CommonTree NATIVE123_tree=null;
        CommonTree SYNCHRONIZED124_tree=null;
        CommonTree TRANSIENT125_tree=null;
        CommonTree VOLATILE126_tree=null;
        CommonTree STRICTFP127_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return retval; }
            // Imprinter.g:277:5: ( PUBLIC | PROTECTED | PRIVATE | STATIC | ABSTRACT | NATIVE | SYNCHRONIZED | TRANSIENT | VOLATILE | STRICTFP | localModifier )
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
                    // Imprinter.g:277:9: PUBLIC
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PUBLIC118=(CommonTree)match(input,PUBLIC,FOLLOW_PUBLIC_in_modifier1359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PUBLIC118_tree = (CommonTree)adaptor.dupNode(PUBLIC118);

                    adaptor.addChild(root_0, PUBLIC118_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:278:9: PROTECTED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PROTECTED119=(CommonTree)match(input,PROTECTED,FOLLOW_PROTECTED_in_modifier1369); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PROTECTED119_tree = (CommonTree)adaptor.dupNode(PROTECTED119);

                    adaptor.addChild(root_0, PROTECTED119_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:279:9: PRIVATE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    PRIVATE120=(CommonTree)match(input,PRIVATE,FOLLOW_PRIVATE_in_modifier1379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRIVATE120_tree = (CommonTree)adaptor.dupNode(PRIVATE120);

                    adaptor.addChild(root_0, PRIVATE120_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Imprinter.g:280:9: STATIC
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    STATIC121=(CommonTree)match(input,STATIC,FOLLOW_STATIC_in_modifier1389); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC121_tree = (CommonTree)adaptor.dupNode(STATIC121);

                    adaptor.addChild(root_0, STATIC121_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // Imprinter.g:281:9: ABSTRACT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    ABSTRACT122=(CommonTree)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_modifier1399); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ABSTRACT122_tree = (CommonTree)adaptor.dupNode(ABSTRACT122);

                    adaptor.addChild(root_0, ABSTRACT122_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // Imprinter.g:282:9: NATIVE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    NATIVE123=(CommonTree)match(input,NATIVE,FOLLOW_NATIVE_in_modifier1409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NATIVE123_tree = (CommonTree)adaptor.dupNode(NATIVE123);

                    adaptor.addChild(root_0, NATIVE123_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // Imprinter.g:283:9: SYNCHRONIZED
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    SYNCHRONIZED124=(CommonTree)match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_modifier1419); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SYNCHRONIZED124_tree = (CommonTree)adaptor.dupNode(SYNCHRONIZED124);

                    adaptor.addChild(root_0, SYNCHRONIZED124_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // Imprinter.g:284:9: TRANSIENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    TRANSIENT125=(CommonTree)match(input,TRANSIENT,FOLLOW_TRANSIENT_in_modifier1429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRANSIENT125_tree = (CommonTree)adaptor.dupNode(TRANSIENT125);

                    adaptor.addChild(root_0, TRANSIENT125_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // Imprinter.g:285:9: VOLATILE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    VOLATILE126=(CommonTree)match(input,VOLATILE,FOLLOW_VOLATILE_in_modifier1439); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VOLATILE126_tree = (CommonTree)adaptor.dupNode(VOLATILE126);

                    adaptor.addChild(root_0, VOLATILE126_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // Imprinter.g:286:9: STRICTFP
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    STRICTFP127=(CommonTree)match(input,STRICTFP,FOLLOW_STRICTFP_in_modifier1449); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STRICTFP127_tree = (CommonTree)adaptor.dupNode(STRICTFP127);

                    adaptor.addChild(root_0, STRICTFP127_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // Imprinter.g:287:9: localModifier
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localModifier_in_modifier1459);
                    localModifier128=localModifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, localModifier128.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 25, modifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "modifier"

    public static class localModifierList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localModifierList"
    // Imprinter.g:290:1: localModifierList : ^( LOCAL_MODIFIER_LIST ( localModifier )* ) ;
    public final Imprinter.localModifierList_return localModifierList() throws RecognitionException {
        Imprinter.localModifierList_return retval = new Imprinter.localModifierList_return();
        retval.start = input.LT(1);
        int localModifierList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree LOCAL_MODIFIER_LIST129=null;
        Imprinter.localModifier_return localModifier130 = null;


        CommonTree LOCAL_MODIFIER_LIST129_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return retval; }
            // Imprinter.g:291:5: ( ^( LOCAL_MODIFIER_LIST ( localModifier )* ) )
            // Imprinter.g:291:9: ^( LOCAL_MODIFIER_LIST ( localModifier )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            LOCAL_MODIFIER_LIST129=(CommonTree)match(input,LOCAL_MODIFIER_LIST,FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1479); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LOCAL_MODIFIER_LIST129_tree = (CommonTree)adaptor.dupNode(LOCAL_MODIFIER_LIST129);

            root_1 = (CommonTree)adaptor.becomeRoot(LOCAL_MODIFIER_LIST129_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:291:31: ( localModifier )*
                loop49:
                do {
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==AT||LA49_0==FINAL) ) {
                        alt49=1;
                    }


                    switch (alt49) {
                	case 1 :
                	    // Imprinter.g:0:0: localModifier
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_localModifier_in_localModifierList1481);
                	    localModifier130=localModifier();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, localModifier130.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop49;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 26, localModifierList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localModifierList"

    public static class localModifier_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localModifier"
    // Imprinter.g:294:1: localModifier : ( FINAL | annotation );
    public final Imprinter.localModifier_return localModifier() throws RecognitionException {
        Imprinter.localModifier_return retval = new Imprinter.localModifier_return();
        retval.start = input.LT(1);
        int localModifier_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FINAL131=null;
        Imprinter.annotation_return annotation132 = null;


        CommonTree FINAL131_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return retval; }
            // Imprinter.g:295:5: ( FINAL | annotation )
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
                    // Imprinter.g:295:9: FINAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    FINAL131=(CommonTree)match(input,FINAL,FOLLOW_FINAL_in_localModifier1502); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FINAL131_tree = (CommonTree)adaptor.dupNode(FINAL131);

                    adaptor.addChild(root_0, FINAL131_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:296:9: annotation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_annotation_in_localModifier1512);
                    annotation132=annotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, annotation132.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 27, localModifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localModifier"

    public static class type_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // Imprinter.g:299:1: type : ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) ;
    public final Imprinter.type_return type() throws RecognitionException {
        Imprinter.type_return retval = new Imprinter.type_return();
        retval.start = input.LT(1);
        int type_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree TYPE133=null;
        Imprinter.primitiveType_return primitiveType134 = null;

        Imprinter.qualifiedTypeIdent_return qualifiedTypeIdent135 = null;

        Imprinter.arrayDeclaratorList_return arrayDeclaratorList136 = null;


        CommonTree TYPE133_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return retval; }
            // Imprinter.g:300:5: ( ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? ) )
            // Imprinter.g:300:9: ^( TYPE ( primitiveType | qualifiedTypeIdent ) ( arrayDeclaratorList )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            TYPE133=(CommonTree)match(input,TYPE,FOLLOW_TYPE_in_type1532); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TYPE133_tree = (CommonTree)adaptor.dupNode(TYPE133);

            root_1 = (CommonTree)adaptor.becomeRoot(TYPE133_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:300:16: ( primitiveType | qualifiedTypeIdent )
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
                    // Imprinter.g:300:17: primitiveType
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_type1535);
                    primitiveType134=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, primitiveType134.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:300:33: qualifiedTypeIdent
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_type1539);
                    qualifiedTypeIdent135=qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, qualifiedTypeIdent135.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            // Imprinter.g:300:53: ( arrayDeclaratorList )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ARRAY_DECLARATOR_LIST) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // Imprinter.g:0:0: arrayDeclaratorList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayDeclaratorList_in_type1542);
                    arrayDeclaratorList136=arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arrayDeclaratorList136.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 28, type_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class qualifiedTypeIdent_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedTypeIdent"
    // Imprinter.g:303:1: qualifiedTypeIdent : ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) ;
    public final Imprinter.qualifiedTypeIdent_return qualifiedTypeIdent() throws RecognitionException {
        Imprinter.qualifiedTypeIdent_return retval = new Imprinter.qualifiedTypeIdent_return();
        retval.start = input.LT(1);
        int qualifiedTypeIdent_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUALIFIED_TYPE_IDENT137=null;
        Imprinter.typeIdent_return typeIdent138 = null;


        CommonTree QUALIFIED_TYPE_IDENT137_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return retval; }
            // Imprinter.g:304:5: ( ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ ) )
            // Imprinter.g:304:9: ^( QUALIFIED_TYPE_IDENT ( typeIdent )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            QUALIFIED_TYPE_IDENT137=(CommonTree)match(input,QUALIFIED_TYPE_IDENT,FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1564); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            QUALIFIED_TYPE_IDENT137_tree = (CommonTree)adaptor.dupNode(QUALIFIED_TYPE_IDENT137);

            root_1 = (CommonTree)adaptor.becomeRoot(QUALIFIED_TYPE_IDENT137_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:304:32: ( typeIdent )+
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
            	    // Imprinter.g:0:0: typeIdent
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_typeIdent_in_qualifiedTypeIdent1566);
            	    typeIdent138=typeIdent();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, typeIdent138.getTree());

            	    if ( state.backtracking==0 ) {
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


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 29, qualifiedTypeIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedTypeIdent"

    public static class typeIdent_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeIdent"
    // Imprinter.g:307:1: typeIdent : ^( IDENT ( genericTypeArgumentList )? ) ;
    public final Imprinter.typeIdent_return typeIdent() throws RecognitionException {
        Imprinter.typeIdent_return retval = new Imprinter.typeIdent_return();
        retval.start = input.LT(1);
        int typeIdent_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT139=null;
        Imprinter.genericTypeArgumentList_return genericTypeArgumentList140 = null;


        CommonTree IDENT139_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return retval; }
            // Imprinter.g:308:5: ( ^( IDENT ( genericTypeArgumentList )? ) )
            // Imprinter.g:308:9: ^( IDENT ( genericTypeArgumentList )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IDENT139=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_typeIdent1589); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT139_tree = (CommonTree)adaptor.dupNode(IDENT139);

            root_1 = (CommonTree)adaptor.becomeRoot(IDENT139_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:308:17: ( genericTypeArgumentList )?
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==GENERIC_TYPE_ARG_LIST) ) {
                    alt54=1;
                }
                switch (alt54) {
                    case 1 :
                        // Imprinter.g:0:0: genericTypeArgumentList
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_genericTypeArgumentList_in_typeIdent1591);
                        genericTypeArgumentList140=genericTypeArgumentList();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, genericTypeArgumentList140.getTree());

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 30, typeIdent_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "typeIdent"

    public static class primitiveType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // Imprinter.g:311:1: primitiveType : ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE );
    public final Imprinter.primitiveType_return primitiveType() throws RecognitionException {
        Imprinter.primitiveType_return retval = new Imprinter.primitiveType_return();
        retval.start = input.LT(1);
        int primitiveType_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set141=null;

        CommonTree set141_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return retval; }
            // Imprinter.g:312:5: ( BOOLEAN | CHAR | BYTE | SHORT | INT | LONG | FLOAT | DOUBLE )
            // Imprinter.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set141=(CommonTree)input.LT(1);
            if ( input.LA(1)==BOOLEAN||input.LA(1)==BYTE||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||(input.LA(1)>=INT && input.LA(1)<=LONG)||input.LA(1)==SHORT ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set141_tree = (CommonTree)adaptor.dupNode(set141);

                adaptor.addChild(root_0, set141_tree);
                }
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
            } 

            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 31, primitiveType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class genericTypeArgumentList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericTypeArgumentList"
    // Imprinter.g:322:1: genericTypeArgumentList : ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) ;
    public final Imprinter.genericTypeArgumentList_return genericTypeArgumentList() throws RecognitionException {
        Imprinter.genericTypeArgumentList_return retval = new Imprinter.genericTypeArgumentList_return();
        retval.start = input.LT(1);
        int genericTypeArgumentList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree GENERIC_TYPE_ARG_LIST142=null;
        Imprinter.genericTypeArgument_return genericTypeArgument143 = null;


        CommonTree GENERIC_TYPE_ARG_LIST142_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return retval; }
            // Imprinter.g:323:5: ( ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ ) )
            // Imprinter.g:323:9: ^( GENERIC_TYPE_ARG_LIST ( genericTypeArgument )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            GENERIC_TYPE_ARG_LIST142=(CommonTree)match(input,GENERIC_TYPE_ARG_LIST,FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1702); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            GENERIC_TYPE_ARG_LIST142_tree = (CommonTree)adaptor.dupNode(GENERIC_TYPE_ARG_LIST142);

            root_1 = (CommonTree)adaptor.becomeRoot(GENERIC_TYPE_ARG_LIST142_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:323:33: ( genericTypeArgument )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==QUESTION||LA55_0==TYPE) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // Imprinter.g:0:0: genericTypeArgument
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_genericTypeArgument_in_genericTypeArgumentList1704);
            	    genericTypeArgument143=genericTypeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, genericTypeArgument143.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 32, genericTypeArgumentList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeArgumentList"

    public static class genericTypeArgument_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericTypeArgument"
    // Imprinter.g:326:1: genericTypeArgument : ( type | ^( QUESTION ( genericWildcardBoundType )? ) );
    public final Imprinter.genericTypeArgument_return genericTypeArgument() throws RecognitionException {
        Imprinter.genericTypeArgument_return retval = new Imprinter.genericTypeArgument_return();
        retval.start = input.LT(1);
        int genericTypeArgument_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree QUESTION145=null;
        Imprinter.type_return type144 = null;

        Imprinter.genericWildcardBoundType_return genericWildcardBoundType146 = null;


        CommonTree QUESTION145_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return retval; }
            // Imprinter.g:327:5: ( type | ^( QUESTION ( genericWildcardBoundType )? ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==TYPE) ) {
                alt57=1;
            }
            else if ( (LA57_0==QUESTION) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // Imprinter.g:327:9: type
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_genericTypeArgument1729);
                    type144=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, type144.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:328:9: ^( QUESTION ( genericWildcardBoundType )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    QUESTION145=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_genericTypeArgument1740); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUESTION145_tree = (CommonTree)adaptor.dupNode(QUESTION145);

                    root_1 = (CommonTree)adaptor.becomeRoot(QUESTION145_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // Imprinter.g:328:20: ( genericWildcardBoundType )?
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==EXTENDS||LA56_0==SUPER) ) {
                            alt56=1;
                        }
                        switch (alt56) {
                            case 1 :
                                // Imprinter.g:0:0: genericWildcardBoundType
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_genericWildcardBoundType_in_genericTypeArgument1742);
                                genericWildcardBoundType146=genericWildcardBoundType();

                                state._fsp--;
                                if (state.failed) return retval;
                                if ( state.backtracking==0 ) 
                                adaptor.addChild(root_1, genericWildcardBoundType146.getTree());

                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 33, genericTypeArgument_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericTypeArgument"

    public static class genericWildcardBoundType_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "genericWildcardBoundType"
    // Imprinter.g:331:1: genericWildcardBoundType : ( ^( EXTENDS type ) | ^( SUPER type ) );
    public final Imprinter.genericWildcardBoundType_return genericWildcardBoundType() throws RecognitionException {
        Imprinter.genericWildcardBoundType_return retval = new Imprinter.genericWildcardBoundType_return();
        retval.start = input.LT(1);
        int genericWildcardBoundType_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXTENDS147=null;
        CommonTree SUPER149=null;
        Imprinter.type_return type148 = null;

        Imprinter.type_return type150 = null;


        CommonTree EXTENDS147_tree=null;
        CommonTree SUPER149_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return retval; }
            // Imprinter.g:332:5: ( ^( EXTENDS type ) | ^( SUPER type ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==EXTENDS) ) {
                alt58=1;
            }
            else if ( (LA58_0==SUPER) ) {
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
                    // Imprinter.g:332:9: ^( EXTENDS type )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EXTENDS147=(CommonTree)match(input,EXTENDS,FOLLOW_EXTENDS_in_genericWildcardBoundType1882); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EXTENDS147_tree = (CommonTree)adaptor.dupNode(EXTENDS147);

                    root_1 = (CommonTree)adaptor.becomeRoot(EXTENDS147_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1884);
                    type148=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type148.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:333:9: ^( SUPER type )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUPER149=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_genericWildcardBoundType1896); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER149_tree = (CommonTree)adaptor.dupNode(SUPER149);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER149_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_genericWildcardBoundType1898);
                    type150=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type150.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 34, genericWildcardBoundType_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "genericWildcardBoundType"

    public static class formalParameterList_return extends TreeRuleReturnScope {
        public List<JVariableDeclaration> lst;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterList"
    // Imprinter.g:336:1: formalParameterList returns [List<JVariableDeclaration> lst] : ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) ;
    public final Imprinter.formalParameterList_return formalParameterList() throws RecognitionException {
        Imprinter.formalParameterList_return retval = new Imprinter.formalParameterList_return();
        retval.start = input.LT(1);
        int formalParameterList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FORMAL_PARAM_LIST151=null;
        Imprinter.formalParameterStandardDecl_return formalParameterStandardDecl152 = null;

        Imprinter.formalParameterVarargDecl_return formalParameterVarargDecl153 = null;


        CommonTree FORMAL_PARAM_LIST151_tree=null;


          retval.lst = new ArrayList<JVariableDeclaration>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return retval; }
            // Imprinter.g:340:5: ( ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? ) )
            // Imprinter.g:340:9: ^( FORMAL_PARAM_LIST ( formalParameterStandardDecl )* ( formalParameterVarargDecl )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FORMAL_PARAM_LIST151=(CommonTree)match(input,FORMAL_PARAM_LIST,FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1926); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FORMAL_PARAM_LIST151_tree = (CommonTree)adaptor.dupNode(FORMAL_PARAM_LIST151);

            root_1 = (CommonTree)adaptor.becomeRoot(FORMAL_PARAM_LIST151_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:340:29: ( formalParameterStandardDecl )*
                loop59:
                do {
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==FORMAL_PARAM_STD_DECL) ) {
                        alt59=1;
                    }


                    switch (alt59) {
                	case 1 :
                	    // Imprinter.g:340:30: formalParameterStandardDecl
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_formalParameterStandardDecl_in_formalParameterList1929);
                	    formalParameterStandardDecl152=formalParameterStandardDecl();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, formalParameterStandardDecl152.getTree());
                	    if ( state.backtracking==0 ) {
                	      if ((formalParameterStandardDecl152!=null?formalParameterStandardDecl152.value:null)!=null) retval.lst.add((formalParameterStandardDecl152!=null?formalParameterStandardDecl152.value:null));
                	    }

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop59;
                    }
                } while (true);

                // Imprinter.g:340:154: ( formalParameterVarargDecl )?
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==FORMAL_PARAM_VARARG_DECL) ) {
                    alt60=1;
                }
                switch (alt60) {
                    case 1 :
                        // Imprinter.g:0:0: formalParameterVarargDecl
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_formalParameterVarargDecl_in_formalParameterList1935);
                        formalParameterVarargDecl153=formalParameterVarargDecl();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, formalParameterVarargDecl153.getTree());

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 35, formalParameterList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterList"

    public static class formalParameterStandardDecl_return extends TreeRuleReturnScope {
        public JVariableDeclaration value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterStandardDecl"
    // Imprinter.g:343:1: formalParameterStandardDecl returns [JVariableDeclaration value] : ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) ;
    public final Imprinter.formalParameterStandardDecl_return formalParameterStandardDecl() throws RecognitionException {
        Imprinter.formalParameterStandardDecl_return retval = new Imprinter.formalParameterStandardDecl_return();
        retval.start = input.LT(1);
        int formalParameterStandardDecl_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FORMAL_PARAM_STD_DECL154=null;
        Imprinter.localModifierList_return localModifierList155 = null;

        Imprinter.type_return type156 = null;

        Imprinter.variableDeclaratorId_return variableDeclaratorId157 = null;


        CommonTree FORMAL_PARAM_STD_DECL154_tree=null;


          retval.value = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return retval; }
            // Imprinter.g:347:5: ( ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId ) )
            // Imprinter.g:347:9: ^( FORMAL_PARAM_STD_DECL localModifierList type variableDeclaratorId )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FORMAL_PARAM_STD_DECL154=(CommonTree)match(input,FORMAL_PARAM_STD_DECL,FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1970); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FORMAL_PARAM_STD_DECL154_tree = (CommonTree)adaptor.dupNode(FORMAL_PARAM_STD_DECL154);

            root_1 = (CommonTree)adaptor.becomeRoot(FORMAL_PARAM_STD_DECL154_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_localModifierList_in_formalParameterStandardDecl1972);
            localModifierList155=localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, localModifierList155.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_formalParameterStandardDecl1974);
            type156=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, type156.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1976);
            variableDeclaratorId157=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, variableDeclaratorId157.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
               retval.value = new JVariableDeclaration((variableDeclaratorId157!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId157.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId157.start))):null),true);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 36, formalParameterStandardDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterStandardDecl"

    public static class formalParameterVarargDecl_return extends TreeRuleReturnScope {
        public JVariableDeclaration value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formalParameterVarargDecl"
    // Imprinter.g:351:1: formalParameterVarargDecl returns [JVariableDeclaration value] : ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) ;
    public final Imprinter.formalParameterVarargDecl_return formalParameterVarargDecl() throws RecognitionException {
        Imprinter.formalParameterVarargDecl_return retval = new Imprinter.formalParameterVarargDecl_return();
        retval.start = input.LT(1);
        int formalParameterVarargDecl_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FORMAL_PARAM_VARARG_DECL158=null;
        Imprinter.localModifierList_return localModifierList159 = null;

        Imprinter.type_return type160 = null;

        Imprinter.variableDeclaratorId_return variableDeclaratorId161 = null;


        CommonTree FORMAL_PARAM_VARARG_DECL158_tree=null;


          retval.value = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return retval; }
            // Imprinter.g:355:5: ( ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId ) )
            // Imprinter.g:355:9: ^( FORMAL_PARAM_VARARG_DECL localModifierList type variableDeclaratorId )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FORMAL_PARAM_VARARG_DECL158=(CommonTree)match(input,FORMAL_PARAM_VARARG_DECL,FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl2019); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FORMAL_PARAM_VARARG_DECL158_tree = (CommonTree)adaptor.dupNode(FORMAL_PARAM_VARARG_DECL158);

            root_1 = (CommonTree)adaptor.becomeRoot(FORMAL_PARAM_VARARG_DECL158_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_localModifierList_in_formalParameterVarargDecl2021);
            localModifierList159=localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, localModifierList159.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_formalParameterVarargDecl2023);
            type160=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, type160.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl2025);
            variableDeclaratorId161=variableDeclaratorId();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, variableDeclaratorId161.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
               retval.value = new JVariableDeclaration((variableDeclaratorId161!=null?(input.getTokenStream().toString(
                input.getTreeAdaptor().getTokenStartIndex(variableDeclaratorId161.start),
                input.getTreeAdaptor().getTokenStopIndex(variableDeclaratorId161.start))):null),true);
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 37, formalParameterVarargDecl_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "formalParameterVarargDecl"

    public static class qualifiedIdentifier_return extends TreeRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "qualifiedIdentifier"
    // Imprinter.g:359:1: qualifiedIdentifier returns [String value] : ( IDENT | ^( DOT id= qualifiedIdentifier IDENT ) );
    public final Imprinter.qualifiedIdentifier_return qualifiedIdentifier() throws RecognitionException {
        Imprinter.qualifiedIdentifier_return retval = new Imprinter.qualifiedIdentifier_return();
        retval.start = input.LT(1);
        int qualifiedIdentifier_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT162=null;
        CommonTree DOT163=null;
        CommonTree IDENT164=null;
        Imprinter.qualifiedIdentifier_return id = null;


        CommonTree IDENT162_tree=null;
        CommonTree DOT163_tree=null;
        CommonTree IDENT164_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return retval; }
            // Imprinter.g:360:5: ( IDENT | ^( DOT id= qualifiedIdentifier IDENT ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENT) ) {
                alt61=1;
            }
            else if ( (LA61_0==DOT) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // Imprinter.g:360:9: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT162=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier2062); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT162_tree = (CommonTree)adaptor.dupNode(IDENT162);

                    adaptor.addChild(root_0, IDENT162_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = (IDENT162!=null?IDENT162.getText():null);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:361:9: ^( DOT id= qualifiedIdentifier IDENT )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DOT163=(CommonTree)match(input,DOT,FOLLOW_DOT_in_qualifiedIdentifier2075); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT163_tree = (CommonTree)adaptor.dupNode(DOT163);

                    root_1 = (CommonTree)adaptor.becomeRoot(DOT163_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier2079);
                    id=qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, id.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT164=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_qualifiedIdentifier2081); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT164_tree = (CommonTree)adaptor.dupNode(IDENT164);

                    adaptor.addChild(root_1, IDENT164_tree);
                    }

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }

                    if ( state.backtracking==0 ) {
                      retval.value =  (id!=null?id.value:null) + "." + (IDENT164!=null?IDENT164.getText():null); 
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 38, qualifiedIdentifier_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "qualifiedIdentifier"

    public static class annotationList_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationList"
    // Imprinter.g:366:1: annotationList : ^( ANNOTATION_LIST ( annotation )* ) ;
    public final Imprinter.annotationList_return annotationList() throws RecognitionException {
        Imprinter.annotationList_return retval = new Imprinter.annotationList_return();
        retval.start = input.LT(1);
        int annotationList_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATION_LIST165=null;
        Imprinter.annotation_return annotation166 = null;


        CommonTree ANNOTATION_LIST165_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return retval; }
            // Imprinter.g:367:5: ( ^( ANNOTATION_LIST ( annotation )* ) )
            // Imprinter.g:367:9: ^( ANNOTATION_LIST ( annotation )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ANNOTATION_LIST165=(CommonTree)match(input,ANNOTATION_LIST,FOLLOW_ANNOTATION_LIST_in_annotationList2110); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANNOTATION_LIST165_tree = (CommonTree)adaptor.dupNode(ANNOTATION_LIST165);

            root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATION_LIST165_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:367:27: ( annotation )*
                loop62:
                do {
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==AT) ) {
                        alt62=1;
                    }


                    switch (alt62) {
                	case 1 :
                	    // Imprinter.g:0:0: annotation
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_annotation_in_annotationList2112);
                	    annotation166=annotation();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, annotation166.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop62;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 39, annotationList_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationList"

    public static class annotation_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotation"
    // Imprinter.g:370:1: annotation : ^( AT qualifiedIdentifier ( annotationInit )? ) ;
    public final Imprinter.annotation_return annotation() throws RecognitionException {
        Imprinter.annotation_return retval = new Imprinter.annotation_return();
        retval.start = input.LT(1);
        int annotation_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree AT167=null;
        Imprinter.qualifiedIdentifier_return qualifiedIdentifier168 = null;

        Imprinter.annotationInit_return annotationInit169 = null;


        CommonTree AT167_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return retval; }
            // Imprinter.g:371:5: ( ^( AT qualifiedIdentifier ( annotationInit )? ) )
            // Imprinter.g:371:9: ^( AT qualifiedIdentifier ( annotationInit )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            AT167=(CommonTree)match(input,AT,FOLLOW_AT_in_annotation2134); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            AT167_tree = (CommonTree)adaptor.dupNode(AT167);

            root_1 = (CommonTree)adaptor.becomeRoot(AT167_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_qualifiedIdentifier_in_annotation2136);
            qualifiedIdentifier168=qualifiedIdentifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, qualifiedIdentifier168.getTree());
            // Imprinter.g:371:34: ( annotationInit )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ANNOTATION_INIT_BLOCK) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // Imprinter.g:0:0: annotationInit
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_annotationInit_in_annotation2138);
                    annotationInit169=annotationInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, annotationInit169.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 40, annotation_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotation"

    public static class annotationInit_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationInit"
    // Imprinter.g:374:1: annotationInit : ^( ANNOTATION_INIT_BLOCK annotationInitializers ) ;
    public final Imprinter.annotationInit_return annotationInit() throws RecognitionException {
        Imprinter.annotationInit_return retval = new Imprinter.annotationInit_return();
        retval.start = input.LT(1);
        int annotationInit_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATION_INIT_BLOCK170=null;
        Imprinter.annotationInitializers_return annotationInitializers171 = null;


        CommonTree ANNOTATION_INIT_BLOCK170_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return retval; }
            // Imprinter.g:375:5: ( ^( ANNOTATION_INIT_BLOCK annotationInitializers ) )
            // Imprinter.g:375:9: ^( ANNOTATION_INIT_BLOCK annotationInitializers )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ANNOTATION_INIT_BLOCK170=(CommonTree)match(input,ANNOTATION_INIT_BLOCK,FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2164); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANNOTATION_INIT_BLOCK170_tree = (CommonTree)adaptor.dupNode(ANNOTATION_INIT_BLOCK170);

            root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATION_INIT_BLOCK170_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationInitializers_in_annotationInit2166);
            annotationInitializers171=annotationInitializers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, annotationInitializers171.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 41, annotationInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInit"

    public static class annotationInitializers_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationInitializers"
    // Imprinter.g:378:1: annotationInitializers : ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) );
    public final Imprinter.annotationInitializers_return annotationInitializers() throws RecognitionException {
        Imprinter.annotationInitializers_return retval = new Imprinter.annotationInitializers_return();
        retval.start = input.LT(1);
        int annotationInitializers_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATION_INIT_KEY_LIST172=null;
        CommonTree ANNOTATION_INIT_DEFAULT_KEY174=null;
        Imprinter.annotationInitializer_return annotationInitializer173 = null;

        Imprinter.annotationElementValue_return annotationElementValue175 = null;


        CommonTree ANNOTATION_INIT_KEY_LIST172_tree=null;
        CommonTree ANNOTATION_INIT_DEFAULT_KEY174_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return retval; }
            // Imprinter.g:379:5: ( ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ ) | ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==ANNOTATION_INIT_KEY_LIST) ) {
                alt65=1;
            }
            else if ( (LA65_0==ANNOTATION_INIT_DEFAULT_KEY) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // Imprinter.g:379:9: ^( ANNOTATION_INIT_KEY_LIST ( annotationInitializer )+ )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ANNOTATION_INIT_KEY_LIST172=(CommonTree)match(input,ANNOTATION_INIT_KEY_LIST,FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2187); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANNOTATION_INIT_KEY_LIST172_tree = (CommonTree)adaptor.dupNode(ANNOTATION_INIT_KEY_LIST172);

                    root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATION_INIT_KEY_LIST172_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // Imprinter.g:379:36: ( annotationInitializer )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==IDENT) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // Imprinter.g:0:0: annotationInitializer
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_annotationInitializer_in_annotationInitializers2189);
                    	    annotationInitializer173=annotationInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_1, annotationInitializer173.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:380:9: ^( ANNOTATION_INIT_DEFAULT_KEY annotationElementValue )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ANNOTATION_INIT_DEFAULT_KEY174=(CommonTree)match(input,ANNOTATION_INIT_DEFAULT_KEY,FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2202); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANNOTATION_INIT_DEFAULT_KEY174_tree = (CommonTree)adaptor.dupNode(ANNOTATION_INIT_DEFAULT_KEY174);

                    root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATION_INIT_DEFAULT_KEY174_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_annotationElementValue_in_annotationInitializers2204);
                    annotationElementValue175=annotationElementValue();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, annotationElementValue175.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 42, annotationInitializers_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInitializers"

    public static class annotationInitializer_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationInitializer"
    // Imprinter.g:383:1: annotationInitializer : ^( IDENT annotationElementValue ) ;
    public final Imprinter.annotationInitializer_return annotationInitializer() throws RecognitionException {
        Imprinter.annotationInitializer_return retval = new Imprinter.annotationInitializer_return();
        retval.start = input.LT(1);
        int annotationInitializer_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree IDENT176=null;
        Imprinter.annotationElementValue_return annotationElementValue177 = null;


        CommonTree IDENT176_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return retval; }
            // Imprinter.g:384:5: ( ^( IDENT annotationElementValue ) )
            // Imprinter.g:384:9: ^( IDENT annotationElementValue )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            IDENT176=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_annotationInitializer2229); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT176_tree = (CommonTree)adaptor.dupNode(IDENT176);

            root_1 = (CommonTree)adaptor.becomeRoot(IDENT176_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationElementValue_in_annotationInitializer2231);
            annotationElementValue177=annotationElementValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, annotationElementValue177.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 43, annotationInitializer_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationInitializer"

    public static class annotationElementValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationElementValue"
    // Imprinter.g:387:1: annotationElementValue : ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression );
    public final Imprinter.annotationElementValue_return annotationElementValue() throws RecognitionException {
        Imprinter.annotationElementValue_return retval = new Imprinter.annotationElementValue_return();
        retval.start = input.LT(1);
        int annotationElementValue_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATION_INIT_ARRAY_ELEMENT178=null;
        Imprinter.annotationElementValue_return annotationElementValue179 = null;

        Imprinter.annotation_return annotation180 = null;

        Imprinter.expression_return expression181 = null;


        CommonTree ANNOTATION_INIT_ARRAY_ELEMENT178_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }
            // Imprinter.g:388:5: ( ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* ) | annotation | expression )
            int alt67=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_INIT_ARRAY_ELEMENT:
                {
                alt67=1;
                }
                break;
            case AT:
                {
                alt67=2;
                }
                break;
            case EXPR:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // Imprinter.g:388:9: ^( ANNOTATION_INIT_ARRAY_ELEMENT ( annotationElementValue )* )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ANNOTATION_INIT_ARRAY_ELEMENT178=(CommonTree)match(input,ANNOTATION_INIT_ARRAY_ELEMENT,FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2256); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANNOTATION_INIT_ARRAY_ELEMENT178_tree = (CommonTree)adaptor.dupNode(ANNOTATION_INIT_ARRAY_ELEMENT178);

                    root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATION_INIT_ARRAY_ELEMENT178_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // Imprinter.g:388:41: ( annotationElementValue )*
                        loop66:
                        do {
                            int alt66=2;
                            int LA66_0 = input.LA(1);

                            if ( (LA66_0==AT||LA66_0==ANNOTATION_INIT_ARRAY_ELEMENT||LA66_0==EXPR) ) {
                                alt66=1;
                            }


                            switch (alt66) {
                        	case 1 :
                        	    // Imprinter.g:0:0: annotationElementValue
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_annotationElementValue_in_annotationElementValue2258);
                        	    annotationElementValue179=annotationElementValue();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, annotationElementValue179.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop66;
                            }
                        } while (true);


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:389:9: annotation
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_annotation_in_annotationElementValue2270);
                    annotation180=annotation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, annotation180.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:390:9: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_annotationElementValue2280);
                    expression181=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression181.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 44, annotationElementValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationElementValue"

    public static class annotationTopLevelScope_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationTopLevelScope"
    // Imprinter.g:393:1: annotationTopLevelScope : ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) ;
    public final Imprinter.annotationTopLevelScope_return annotationTopLevelScope() throws RecognitionException {
        Imprinter.annotationTopLevelScope_return retval = new Imprinter.annotationTopLevelScope_return();
        retval.start = input.LT(1);
        int annotationTopLevelScope_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATION_TOP_LEVEL_SCOPE182=null;
        Imprinter.annotationScopeDeclarations_return annotationScopeDeclarations183 = null;


        CommonTree ANNOTATION_TOP_LEVEL_SCOPE182_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }
            // Imprinter.g:394:5: ( ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* ) )
            // Imprinter.g:394:9: ^( ANNOTATION_TOP_LEVEL_SCOPE ( annotationScopeDeclarations )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ANNOTATION_TOP_LEVEL_SCOPE182=(CommonTree)match(input,ANNOTATION_TOP_LEVEL_SCOPE,FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2304); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ANNOTATION_TOP_LEVEL_SCOPE182_tree = (CommonTree)adaptor.dupNode(ANNOTATION_TOP_LEVEL_SCOPE182);

            root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATION_TOP_LEVEL_SCOPE182_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:394:38: ( annotationScopeDeclarations )*
                loop68:
                do {
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==AT||LA68_0==CLASS||LA68_0==ENUM||LA68_0==INTERFACE||LA68_0==ANNOTATION_METHOD_DECL||LA68_0==VAR_DECLARATION) ) {
                        alt68=1;
                    }


                    switch (alt68) {
                	case 1 :
                	    // Imprinter.g:0:0: annotationScopeDeclarations
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2306);
                	    annotationScopeDeclarations183=annotationScopeDeclarations();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, annotationScopeDeclarations183.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop68;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 45, annotationTopLevelScope_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationTopLevelScope"

    public static class annotationScopeDeclarations_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationScopeDeclarations"
    // Imprinter.g:397:1: annotationScopeDeclarations : ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration );
    public final Imprinter.annotationScopeDeclarations_return annotationScopeDeclarations() throws RecognitionException {
        Imprinter.annotationScopeDeclarations_return retval = new Imprinter.annotationScopeDeclarations_return();
        retval.start = input.LT(1);
        int annotationScopeDeclarations_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ANNOTATION_METHOD_DECL184=null;
        CommonTree IDENT187=null;
        CommonTree VAR_DECLARATION189=null;
        Imprinter.modifierList_return modifierList185 = null;

        Imprinter.type_return type186 = null;

        Imprinter.annotationDefaultValue_return annotationDefaultValue188 = null;

        Imprinter.modifierList_return modifierList190 = null;

        Imprinter.type_return type191 = null;

        Imprinter.variableDeclaratorList_return variableDeclaratorList192 = null;

        Imprinter.typeDeclaration_return typeDeclaration193 = null;


        CommonTree ANNOTATION_METHOD_DECL184_tree=null;
        CommonTree IDENT187_tree=null;
        CommonTree VAR_DECLARATION189_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }
            // Imprinter.g:398:5: ( ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? ) | ^( VAR_DECLARATION modifierList type variableDeclaratorList ) | typeDeclaration )
            int alt70=3;
            switch ( input.LA(1) ) {
            case ANNOTATION_METHOD_DECL:
                {
                alt70=1;
                }
                break;
            case VAR_DECLARATION:
                {
                alt70=2;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // Imprinter.g:398:9: ^( ANNOTATION_METHOD_DECL modifierList type IDENT ( annotationDefaultValue )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ANNOTATION_METHOD_DECL184=(CommonTree)match(input,ANNOTATION_METHOD_DECL,FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2332); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ANNOTATION_METHOD_DECL184_tree = (CommonTree)adaptor.dupNode(ANNOTATION_METHOD_DECL184);

                    root_1 = (CommonTree)adaptor.becomeRoot(ANNOTATION_METHOD_DECL184_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2334);
                    modifierList185=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList185.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2336);
                    type186=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type186.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT187=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_annotationScopeDeclarations2338); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT187_tree = (CommonTree)adaptor.dupNode(IDENT187);

                    adaptor.addChild(root_1, IDENT187_tree);
                    }
                    // Imprinter.g:398:58: ( annotationDefaultValue )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==DEFAULT) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // Imprinter.g:0:0: annotationDefaultValue
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2340);
                            annotationDefaultValue188=annotationDefaultValue();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, annotationDefaultValue188.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:399:9: ^( VAR_DECLARATION modifierList type variableDeclaratorList )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    VAR_DECLARATION189=(CommonTree)match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2353); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    VAR_DECLARATION189_tree = (CommonTree)adaptor.dupNode(VAR_DECLARATION189);

                    root_1 = (CommonTree)adaptor.becomeRoot(VAR_DECLARATION189_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_modifierList_in_annotationScopeDeclarations2355);
                    modifierList190=modifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, modifierList190.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_annotationScopeDeclarations2357);
                    type191=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type191.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2359);
                    variableDeclaratorList192=variableDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, variableDeclaratorList192.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:400:9: typeDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeDeclaration_in_annotationScopeDeclarations2370);
                    typeDeclaration193=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, typeDeclaration193.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 46, annotationScopeDeclarations_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationScopeDeclarations"

    public static class annotationDefaultValue_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "annotationDefaultValue"
    // Imprinter.g:403:1: annotationDefaultValue : ^( DEFAULT annotationElementValue ) ;
    public final Imprinter.annotationDefaultValue_return annotationDefaultValue() throws RecognitionException {
        Imprinter.annotationDefaultValue_return retval = new Imprinter.annotationDefaultValue_return();
        retval.start = input.LT(1);
        int annotationDefaultValue_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT194=null;
        Imprinter.annotationElementValue_return annotationElementValue195 = null;


        CommonTree DEFAULT194_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return retval; }
            // Imprinter.g:404:5: ( ^( DEFAULT annotationElementValue ) )
            // Imprinter.g:404:9: ^( DEFAULT annotationElementValue )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DEFAULT194=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_annotationDefaultValue2394); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT194_tree = (CommonTree)adaptor.dupNode(DEFAULT194);

            root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT194_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_annotationElementValue_in_annotationDefaultValue2396);
            annotationElementValue195=annotationElementValue();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, annotationElementValue195.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 47, annotationDefaultValue_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "annotationDefaultValue"

    public static class block_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // Imprinter.g:409:1: block : ^( BLOCK_SCOPE (stm= blockStatement )* ) ;
    public final Imprinter.block_return block() throws RecognitionException {
        Imprinter.block_return retval = new Imprinter.block_return();
        retval.start = input.LT(1);
        int block_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK_SCOPE196=null;
        Imprinter.blockStatement_return stm = null;


        CommonTree BLOCK_SCOPE196_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 48) ) { return retval; }
            // Imprinter.g:410:5: ( ^( BLOCK_SCOPE (stm= blockStatement )* ) )
            // Imprinter.g:410:9: ^( BLOCK_SCOPE (stm= blockStatement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            BLOCK_SCOPE196=(CommonTree)match(input,BLOCK_SCOPE,FOLLOW_BLOCK_SCOPE_in_block2420); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BLOCK_SCOPE196_tree = (CommonTree)adaptor.dupNode(BLOCK_SCOPE196);

            root_1 = (CommonTree)adaptor.becomeRoot(BLOCK_SCOPE196_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:410:23: (stm= blockStatement )*
                loop71:
                do {
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==AT||LA71_0==SEMI||LA71_0==ASSERT||LA71_0==BREAK||(LA71_0>=CLASS && LA71_0<=CONTINUE)||LA71_0==DO||LA71_0==ENUM||(LA71_0>=FOR && LA71_0<=IF)||LA71_0==INTERFACE||LA71_0==RETURN||(LA71_0>=SWITCH && LA71_0<=SYNCHRONIZED)||LA71_0==THROW||LA71_0==TRY||LA71_0==WHILE||LA71_0==BLOCK_SCOPE||LA71_0==EXPR||LA71_0==FOR_EACH||LA71_0==LABELED_STATEMENT||LA71_0==VAR_DECLARATION) ) {
                        alt71=1;
                    }


                    switch (alt71) {
                	case 1 :
                	    // Imprinter.g:410:24: stm= blockStatement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_blockStatement_in_block2425);
                	    stm=blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, stm.getTree());
                	    if ( state.backtracking==0 ) {

                	                  if ((stm!=null?stm.value:null)!=null) {              
                	                    if ((stm!=null?stm.branching:null).equals("localvar")) {
                	                      ((classScopeDeclarations_scope)classScopeDeclarations_stack.peek()).block.addLocalVariables((List<JVariableDeclaration>)(stm!=null?stm.value:null));
                	                    }
                	                  }
                	                
                	    }

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop71;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 48, block_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class blockStatement_return extends TreeRuleReturnScope {
        public String branching;
        public Object value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blockStatement"
    // Imprinter.g:420:1: blockStatement returns [String branching, Object value] : ( localVariableDeclaration | typeDeclaration | statement );
    public final Imprinter.blockStatement_return blockStatement() throws RecognitionException {
        Imprinter.blockStatement_return retval = new Imprinter.blockStatement_return();
        retval.start = input.LT(1);
        int blockStatement_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Imprinter.localVariableDeclaration_return localVariableDeclaration197 = null;

        Imprinter.typeDeclaration_return typeDeclaration198 = null;

        Imprinter.statement_return statement199 = null;




          retval.branching = "default";
          retval.value = null;  

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 49) ) { return retval; }
            // Imprinter.g:425:5: ( localVariableDeclaration | typeDeclaration | statement )
            int alt72=3;
            switch ( input.LA(1) ) {
            case VAR_DECLARATION:
                {
                alt72=1;
                }
                break;
            case AT:
            case CLASS:
            case ENUM:
            case INTERFACE:
                {
                alt72=2;
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
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // Imprinter.g:425:9: localVariableDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localVariableDeclaration_in_blockStatement2472);
                    localVariableDeclaration197=localVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, localVariableDeclaration197.getTree());
                    if ( state.backtracking==0 ) {
                       retval.branching = "localvar"; retval.value = (localVariableDeclaration197!=null?localVariableDeclaration197.lst:null);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:427:9: typeDeclaration
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_typeDeclaration_in_blockStatement2492);
                    typeDeclaration198=typeDeclaration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, typeDeclaration198.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:428:9: statement
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_blockStatement2502);
                    statement199=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, statement199.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 49, blockStatement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "blockStatement"

    public static class localVariableDeclaration_return extends TreeRuleReturnScope {
        public List<JVariableDeclaration> lst;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "localVariableDeclaration"
    // Imprinter.g:431:1: localVariableDeclaration returns [List<JVariableDeclaration> lst] : ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) ;
    public final Imprinter.localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        Imprinter.localVariableDeclaration_return retval = new Imprinter.localVariableDeclaration_return();
        retval.start = input.LT(1);
        int localVariableDeclaration_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree VAR_DECLARATION200=null;
        Imprinter.localModifierList_return localModifierList201 = null;

        Imprinter.type_return type202 = null;

        Imprinter.variableDeclaratorList_return variableDeclaratorList203 = null;


        CommonTree VAR_DECLARATION200_tree=null;


          retval.lst = new ArrayList<JVariableDeclaration>();

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 50) ) { return retval; }
            // Imprinter.g:435:5: ( ^( VAR_DECLARATION localModifierList type variableDeclaratorList ) )
            // Imprinter.g:435:9: ^( VAR_DECLARATION localModifierList type variableDeclaratorList )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            VAR_DECLARATION200=(CommonTree)match(input,VAR_DECLARATION,FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2533); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            VAR_DECLARATION200_tree = (CommonTree)adaptor.dupNode(VAR_DECLARATION200);

            root_1 = (CommonTree)adaptor.becomeRoot(VAR_DECLARATION200_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_localModifierList_in_localVariableDeclaration2535);
            localModifierList201=localModifierList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, localModifierList201.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_type_in_localVariableDeclaration2537);
            type202=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, type202.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_variableDeclaratorList_in_localVariableDeclaration2539);
            variableDeclaratorList203=variableDeclaratorList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, variableDeclaratorList203.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }

            if ( state.backtracking==0 ) {
               if ((variableDeclaratorList203!=null?variableDeclaratorList203.lst:null)!=null) retval.lst.addAll((variableDeclaratorList203!=null?variableDeclaratorList203.lst:null)); 
            }

            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 50, localVariableDeclaration_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"

    public static class statement_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // Imprinter.g:440:1: statement : ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI );
    public final Imprinter.statement_return statement() throws RecognitionException {
        Imprinter.statement_return retval = new Imprinter.statement_return();
        retval.start = input.LT(1);
        int statement_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSERT205=null;
        CommonTree IF208=null;
        CommonTree FOR212=null;
        CommonTree FOR_EACH217=null;
        CommonTree IDENT220=null;
        CommonTree WHILE223=null;
        CommonTree DO226=null;
        CommonTree TRY229=null;
        CommonTree SWITCH233=null;
        CommonTree SYNCHRONIZED236=null;
        CommonTree RETURN239=null;
        CommonTree THROW241=null;
        CommonTree BREAK243=null;
        CommonTree IDENT244=null;
        CommonTree CONTINUE245=null;
        CommonTree IDENT246=null;
        CommonTree LABELED_STATEMENT247=null;
        CommonTree IDENT248=null;
        CommonTree SEMI251=null;
        Imprinter.block_return block204 = null;

        Imprinter.expression_return expression206 = null;

        Imprinter.expression_return expression207 = null;

        Imprinter.parenthesizedExpression_return parenthesizedExpression209 = null;

        Imprinter.statement_return statement210 = null;

        Imprinter.statement_return statement211 = null;

        Imprinter.forInit_return forInit213 = null;

        Imprinter.forCondition_return forCondition214 = null;

        Imprinter.forUpdater_return forUpdater215 = null;

        Imprinter.statement_return statement216 = null;

        Imprinter.localModifierList_return localModifierList218 = null;

        Imprinter.type_return type219 = null;

        Imprinter.expression_return expression221 = null;

        Imprinter.statement_return statement222 = null;

        Imprinter.parenthesizedExpression_return parenthesizedExpression224 = null;

        Imprinter.statement_return statement225 = null;

        Imprinter.statement_return statement227 = null;

        Imprinter.parenthesizedExpression_return parenthesizedExpression228 = null;

        Imprinter.block_return block230 = null;

        Imprinter.catches_return catches231 = null;

        Imprinter.block_return block232 = null;

        Imprinter.parenthesizedExpression_return parenthesizedExpression234 = null;

        Imprinter.switchBlockLabels_return switchBlockLabels235 = null;

        Imprinter.parenthesizedExpression_return parenthesizedExpression237 = null;

        Imprinter.block_return block238 = null;

        Imprinter.expression_return expression240 = null;

        Imprinter.expression_return expression242 = null;

        Imprinter.statement_return statement249 = null;

        Imprinter.expression_return expression250 = null;


        CommonTree ASSERT205_tree=null;
        CommonTree IF208_tree=null;
        CommonTree FOR212_tree=null;
        CommonTree FOR_EACH217_tree=null;
        CommonTree IDENT220_tree=null;
        CommonTree WHILE223_tree=null;
        CommonTree DO226_tree=null;
        CommonTree TRY229_tree=null;
        CommonTree SWITCH233_tree=null;
        CommonTree SYNCHRONIZED236_tree=null;
        CommonTree RETURN239_tree=null;
        CommonTree THROW241_tree=null;
        CommonTree BREAK243_tree=null;
        CommonTree IDENT244_tree=null;
        CommonTree CONTINUE245_tree=null;
        CommonTree IDENT246_tree=null;
        CommonTree LABELED_STATEMENT247_tree=null;
        CommonTree IDENT248_tree=null;
        CommonTree SEMI251_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 51) ) { return retval; }
            // Imprinter.g:441:5: ( block | ^( ASSERT expression ( expression )? ) | ^( IF parenthesizedExpression statement ( statement )? ) | ^( FOR forInit forCondition forUpdater statement ) | ^( FOR_EACH localModifierList type IDENT expression statement ) | ^( WHILE parenthesizedExpression statement ) | ^( DO statement parenthesizedExpression ) | ^( TRY block ( catches )? ( block )? ) | ^( SWITCH parenthesizedExpression switchBlockLabels ) | ^( SYNCHRONIZED parenthesizedExpression block ) | ^( RETURN ( expression )? ) | ^( THROW expression ) | ^( BREAK ( IDENT )? ) | ^( CONTINUE ( IDENT )? ) | ^( LABELED_STATEMENT IDENT statement ) | expression | SEMI )
            int alt80=17;
            switch ( input.LA(1) ) {
            case BLOCK_SCOPE:
                {
                alt80=1;
                }
                break;
            case ASSERT:
                {
                alt80=2;
                }
                break;
            case IF:
                {
                alt80=3;
                }
                break;
            case FOR:
                {
                alt80=4;
                }
                break;
            case FOR_EACH:
                {
                alt80=5;
                }
                break;
            case WHILE:
                {
                alt80=6;
                }
                break;
            case DO:
                {
                alt80=7;
                }
                break;
            case TRY:
                {
                alt80=8;
                }
                break;
            case SWITCH:
                {
                alt80=9;
                }
                break;
            case SYNCHRONIZED:
                {
                alt80=10;
                }
                break;
            case RETURN:
                {
                alt80=11;
                }
                break;
            case THROW:
                {
                alt80=12;
                }
                break;
            case BREAK:
                {
                alt80=13;
                }
                break;
            case CONTINUE:
                {
                alt80=14;
                }
                break;
            case LABELED_STATEMENT:
                {
                alt80=15;
                }
                break;
            case EXPR:
                {
                alt80=16;
                }
                break;
            case SEMI:
                {
                alt80=17;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // Imprinter.g:441:9: block
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_statement2582);
                    block204=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, block204.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:442:9: ^( ASSERT expression ( expression )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASSERT205=(CommonTree)match(input,ASSERT,FOLLOW_ASSERT_in_statement2593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSERT205_tree = (CommonTree)adaptor.dupNode(ASSERT205);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASSERT205_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_statement2595);
                    expression206=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression206.getTree());
                    // Imprinter.g:442:29: ( expression )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==EXPR) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // Imprinter.g:0:0: expression
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_expression_in_statement2597);
                            expression207=expression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, expression207.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:443:9: ^( IF parenthesizedExpression statement ( statement )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    IF208=(CommonTree)match(input,IF,FOLLOW_IF_in_statement2610); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IF208_tree = (CommonTree)adaptor.dupNode(IF208);

                    root_1 = (CommonTree)adaptor.becomeRoot(IF208_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2612);
                    parenthesizedExpression209=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, parenthesizedExpression209.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_statement2614);
                    statement210=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement210.getTree());
                    // Imprinter.g:443:48: ( statement )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==SEMI||LA74_0==ASSERT||LA74_0==BREAK||LA74_0==CONTINUE||LA74_0==DO||(LA74_0>=FOR && LA74_0<=IF)||LA74_0==RETURN||(LA74_0>=SWITCH && LA74_0<=SYNCHRONIZED)||LA74_0==THROW||LA74_0==TRY||LA74_0==WHILE||LA74_0==BLOCK_SCOPE||LA74_0==EXPR||LA74_0==FOR_EACH||LA74_0==LABELED_STATEMENT) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // Imprinter.g:0:0: statement
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_statement_in_statement2616);
                            statement211=statement();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, statement211.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Imprinter.g:444:9: ^( FOR forInit forCondition forUpdater statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FOR212=(CommonTree)match(input,FOR,FOLLOW_FOR_in_statement2629); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR212_tree = (CommonTree)adaptor.dupNode(FOR212);

                    root_1 = (CommonTree)adaptor.becomeRoot(FOR212_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forInit_in_statement2631);
                    forInit213=forInit();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forInit213.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forCondition_in_statement2633);
                    forCondition214=forCondition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forCondition214.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_forUpdater_in_statement2635);
                    forUpdater215=forUpdater();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, forUpdater215.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_statement2637);
                    statement216=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement216.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // Imprinter.g:445:9: ^( FOR_EACH localModifierList type IDENT expression statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    FOR_EACH217=(CommonTree)match(input,FOR_EACH,FOLLOW_FOR_EACH_in_statement2649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FOR_EACH217_tree = (CommonTree)adaptor.dupNode(FOR_EACH217);

                    root_1 = (CommonTree)adaptor.becomeRoot(FOR_EACH217_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_localModifierList_in_statement2651);
                    localModifierList218=localModifierList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, localModifierList218.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_statement2653);
                    type219=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type219.getTree());
                    _last = (CommonTree)input.LT(1);
                    IDENT220=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement2655); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT220_tree = (CommonTree)adaptor.dupNode(IDENT220);

                    adaptor.addChild(root_1, IDENT220_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_statement2657);
                    expression221=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression221.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_statement2659);
                    statement222=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement222.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // Imprinter.g:446:9: ^( WHILE parenthesizedExpression statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    WHILE223=(CommonTree)match(input,WHILE,FOLLOW_WHILE_in_statement2672); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    WHILE223_tree = (CommonTree)adaptor.dupNode(WHILE223);

                    root_1 = (CommonTree)adaptor.becomeRoot(WHILE223_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2674);
                    parenthesizedExpression224=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, parenthesizedExpression224.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_statement2676);
                    statement225=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement225.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // Imprinter.g:447:9: ^( DO statement parenthesizedExpression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DO226=(CommonTree)match(input,DO,FOLLOW_DO_in_statement2688); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DO226_tree = (CommonTree)adaptor.dupNode(DO226);

                    root_1 = (CommonTree)adaptor.becomeRoot(DO226_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_statement2690);
                    statement227=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement227.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2692);
                    parenthesizedExpression228=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, parenthesizedExpression228.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // Imprinter.g:448:9: ^( TRY block ( catches )? ( block )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    TRY229=(CommonTree)match(input,TRY,FOLLOW_TRY_in_statement2704); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRY229_tree = (CommonTree)adaptor.dupNode(TRY229);

                    root_1 = (CommonTree)adaptor.becomeRoot(TRY229_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_statement2706);
                    block230=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, block230.getTree());
                    // Imprinter.g:448:21: ( catches )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==CATCH_CLAUSE_LIST) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // Imprinter.g:0:0: catches
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_catches_in_statement2708);
                            catches231=catches();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, catches231.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:448:30: ( block )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==BLOCK_SCOPE) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // Imprinter.g:0:0: block
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_block_in_statement2711);
                            block232=block();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, block232.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // Imprinter.g:449:9: ^( SWITCH parenthesizedExpression switchBlockLabels )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SWITCH233=(CommonTree)match(input,SWITCH,FOLLOW_SWITCH_in_statement2726); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SWITCH233_tree = (CommonTree)adaptor.dupNode(SWITCH233);

                    root_1 = (CommonTree)adaptor.becomeRoot(SWITCH233_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2728);
                    parenthesizedExpression234=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, parenthesizedExpression234.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_switchBlockLabels_in_statement2730);
                    switchBlockLabels235=switchBlockLabels();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, switchBlockLabels235.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // Imprinter.g:450:9: ^( SYNCHRONIZED parenthesizedExpression block )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SYNCHRONIZED236=(CommonTree)match(input,SYNCHRONIZED,FOLLOW_SYNCHRONIZED_in_statement2742); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SYNCHRONIZED236_tree = (CommonTree)adaptor.dupNode(SYNCHRONIZED236);

                    root_1 = (CommonTree)adaptor.becomeRoot(SYNCHRONIZED236_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_parenthesizedExpression_in_statement2744);
                    parenthesizedExpression237=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, parenthesizedExpression237.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_statement2746);
                    block238=block();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, block238.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // Imprinter.g:451:9: ^( RETURN ( expression )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    RETURN239=(CommonTree)match(input,RETURN,FOLLOW_RETURN_in_statement2758); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    RETURN239_tree = (CommonTree)adaptor.dupNode(RETURN239);

                    root_1 = (CommonTree)adaptor.becomeRoot(RETURN239_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // Imprinter.g:451:18: ( expression )?
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==EXPR) ) {
                            alt77=1;
                        }
                        switch (alt77) {
                            case 1 :
                                // Imprinter.g:0:0: expression
                                {
                                _last = (CommonTree)input.LT(1);
                                pushFollow(FOLLOW_expression_in_statement2760);
                                expression240=expression();

                                state._fsp--;
                                if (state.failed) return retval;
                                if ( state.backtracking==0 ) 
                                adaptor.addChild(root_1, expression240.getTree());

                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // Imprinter.g:452:9: ^( THROW expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    THROW241=(CommonTree)match(input,THROW,FOLLOW_THROW_in_statement2773); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THROW241_tree = (CommonTree)adaptor.dupNode(THROW241);

                    root_1 = (CommonTree)adaptor.becomeRoot(THROW241_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_statement2775);
                    expression242=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression242.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // Imprinter.g:453:9: ^( BREAK ( IDENT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BREAK243=(CommonTree)match(input,BREAK,FOLLOW_BREAK_in_statement2787); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BREAK243_tree = (CommonTree)adaptor.dupNode(BREAK243);

                    root_1 = (CommonTree)adaptor.becomeRoot(BREAK243_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // Imprinter.g:453:17: ( IDENT )?
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==IDENT) ) {
                            alt78=1;
                        }
                        switch (alt78) {
                            case 1 :
                                // Imprinter.g:0:0: IDENT
                                {
                                _last = (CommonTree)input.LT(1);
                                IDENT244=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement2789); if (state.failed) return retval;
                                if ( state.backtracking==0 ) {
                                IDENT244_tree = (CommonTree)adaptor.dupNode(IDENT244);

                                adaptor.addChild(root_1, IDENT244_tree);
                                }

                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 14 :
                    // Imprinter.g:454:9: ^( CONTINUE ( IDENT )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CONTINUE245=(CommonTree)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement2802); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CONTINUE245_tree = (CommonTree)adaptor.dupNode(CONTINUE245);

                    root_1 = (CommonTree)adaptor.becomeRoot(CONTINUE245_tree, root_1);
                    }


                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return retval;
                        // Imprinter.g:454:20: ( IDENT )?
                        int alt79=2;
                        int LA79_0 = input.LA(1);

                        if ( (LA79_0==IDENT) ) {
                            alt79=1;
                        }
                        switch (alt79) {
                            case 1 :
                                // Imprinter.g:0:0: IDENT
                                {
                                _last = (CommonTree)input.LT(1);
                                IDENT246=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement2804); if (state.failed) return retval;
                                if ( state.backtracking==0 ) {
                                IDENT246_tree = (CommonTree)adaptor.dupNode(IDENT246);

                                adaptor.addChild(root_1, IDENT246_tree);
                                }

                                if ( state.backtracking==0 ) {
                                }
                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return retval;
                    }adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 15 :
                    // Imprinter.g:455:9: ^( LABELED_STATEMENT IDENT statement )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LABELED_STATEMENT247=(CommonTree)match(input,LABELED_STATEMENT,FOLLOW_LABELED_STATEMENT_in_statement2817); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LABELED_STATEMENT247_tree = (CommonTree)adaptor.dupNode(LABELED_STATEMENT247);

                    root_1 = (CommonTree)adaptor.becomeRoot(LABELED_STATEMENT247_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    IDENT248=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_statement2819); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT248_tree = (CommonTree)adaptor.dupNode(IDENT248);

                    adaptor.addChild(root_1, IDENT248_tree);
                    }
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_statement_in_statement2821);
                    statement249=statement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, statement249.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 16 :
                    // Imprinter.g:456:9: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_statement2832);
                    expression250=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, expression250.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 17 :
                    // Imprinter.g:457:9: SEMI
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    SEMI251=(CommonTree)match(input,SEMI,FOLLOW_SEMI_in_statement2842); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SEMI251_tree = (CommonTree)adaptor.dupNode(SEMI251);

                    adaptor.addChild(root_0, SEMI251_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 51, statement_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class catches_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catches"
    // Imprinter.g:460:1: catches : ^( CATCH_CLAUSE_LIST ( catchClause )+ ) ;
    public final Imprinter.catches_return catches() throws RecognitionException {
        Imprinter.catches_return retval = new Imprinter.catches_return();
        retval.start = input.LT(1);
        int catches_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CATCH_CLAUSE_LIST252=null;
        Imprinter.catchClause_return catchClause253 = null;


        CommonTree CATCH_CLAUSE_LIST252_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 52) ) { return retval; }
            // Imprinter.g:461:5: ( ^( CATCH_CLAUSE_LIST ( catchClause )+ ) )
            // Imprinter.g:461:9: ^( CATCH_CLAUSE_LIST ( catchClause )+ )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CATCH_CLAUSE_LIST252=(CommonTree)match(input,CATCH_CLAUSE_LIST,FOLLOW_CATCH_CLAUSE_LIST_in_catches2871); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH_CLAUSE_LIST252_tree = (CommonTree)adaptor.dupNode(CATCH_CLAUSE_LIST252);

            root_1 = (CommonTree)adaptor.becomeRoot(CATCH_CLAUSE_LIST252_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:461:29: ( catchClause )+
            int cnt81=0;
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==CATCH) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // Imprinter.g:0:0: catchClause
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_catchClause_in_catches2873);
            	    catchClause253=catchClause();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, catchClause253.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 52, catches_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catches"

    public static class catchClause_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "catchClause"
    // Imprinter.g:464:1: catchClause : ^( CATCH formalParameterStandardDecl block ) ;
    public final Imprinter.catchClause_return catchClause() throws RecognitionException {
        Imprinter.catchClause_return retval = new Imprinter.catchClause_return();
        retval.start = input.LT(1);
        int catchClause_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CATCH254=null;
        Imprinter.formalParameterStandardDecl_return formalParameterStandardDecl255 = null;

        Imprinter.block_return block256 = null;


        CommonTree CATCH254_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 53) ) { return retval; }
            // Imprinter.g:465:5: ( ^( CATCH formalParameterStandardDecl block ) )
            // Imprinter.g:465:9: ^( CATCH formalParameterStandardDecl block )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CATCH254=(CommonTree)match(input,CATCH,FOLLOW_CATCH_in_catchClause2899); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CATCH254_tree = (CommonTree)adaptor.dupNode(CATCH254);

            root_1 = (CommonTree)adaptor.becomeRoot(CATCH254_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_formalParameterStandardDecl_in_catchClause2901);
            formalParameterStandardDecl255=formalParameterStandardDecl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, formalParameterStandardDecl255.getTree());
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_block_in_catchClause2903);
            block256=block();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, block256.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 53, catchClause_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "catchClause"

    public static class switchBlockLabels_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchBlockLabels"
    // Imprinter.g:468:1: switchBlockLabels : ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) ;
    public final Imprinter.switchBlockLabels_return switchBlockLabels() throws RecognitionException {
        Imprinter.switchBlockLabels_return retval = new Imprinter.switchBlockLabels_return();
        retval.start = input.LT(1);
        int switchBlockLabels_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree SWITCH_BLOCK_LABEL_LIST257=null;
        Imprinter.switchCaseLabel_return switchCaseLabel258 = null;

        Imprinter.switchDefaultLabel_return switchDefaultLabel259 = null;

        Imprinter.switchCaseLabel_return switchCaseLabel260 = null;


        CommonTree SWITCH_BLOCK_LABEL_LIST257_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 54) ) { return retval; }
            // Imprinter.g:469:5: ( ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* ) )
            // Imprinter.g:469:9: ^( SWITCH_BLOCK_LABEL_LIST ( switchCaseLabel )* ( switchDefaultLabel )? ( switchCaseLabel )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            SWITCH_BLOCK_LABEL_LIST257=(CommonTree)match(input,SWITCH_BLOCK_LABEL_LIST,FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2924); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            SWITCH_BLOCK_LABEL_LIST257_tree = (CommonTree)adaptor.dupNode(SWITCH_BLOCK_LABEL_LIST257);

            root_1 = (CommonTree)adaptor.becomeRoot(SWITCH_BLOCK_LABEL_LIST257_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:469:35: ( switchCaseLabel )*
                loop82:
                do {
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==CASE) ) {
                        int LA82_2 = input.LA(2);

                        if ( (synpred125_Imprinter()) ) {
                            alt82=1;
                        }


                    }


                    switch (alt82) {
                	case 1 :
                	    // Imprinter.g:0:0: switchCaseLabel
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2926);
                	    switchCaseLabel258=switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, switchCaseLabel258.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop82;
                    }
                } while (true);

                // Imprinter.g:469:52: ( switchDefaultLabel )?
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==DEFAULT) ) {
                    alt83=1;
                }
                switch (alt83) {
                    case 1 :
                        // Imprinter.g:0:0: switchDefaultLabel
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_switchDefaultLabel_in_switchBlockLabels2929);
                        switchDefaultLabel259=switchDefaultLabel();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, switchDefaultLabel259.getTree());

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }

                // Imprinter.g:469:72: ( switchCaseLabel )*
                loop84:
                do {
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==CASE) ) {
                        alt84=1;
                    }


                    switch (alt84) {
                	case 1 :
                	    // Imprinter.g:0:0: switchCaseLabel
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_switchCaseLabel_in_switchBlockLabels2932);
                	    switchCaseLabel260=switchCaseLabel();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, switchCaseLabel260.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop84;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 54, switchBlockLabels_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchBlockLabels"

    public static class switchCaseLabel_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchCaseLabel"
    // Imprinter.g:472:1: switchCaseLabel : ^( CASE expression ( blockStatement )* ) ;
    public final Imprinter.switchCaseLabel_return switchCaseLabel() throws RecognitionException {
        Imprinter.switchCaseLabel_return retval = new Imprinter.switchCaseLabel_return();
        retval.start = input.LT(1);
        int switchCaseLabel_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CASE261=null;
        Imprinter.expression_return expression262 = null;

        Imprinter.blockStatement_return blockStatement263 = null;


        CommonTree CASE261_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 55) ) { return retval; }
            // Imprinter.g:473:5: ( ^( CASE expression ( blockStatement )* ) )
            // Imprinter.g:473:9: ^( CASE expression ( blockStatement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CASE261=(CommonTree)match(input,CASE,FOLLOW_CASE_in_switchCaseLabel2962); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CASE261_tree = (CommonTree)adaptor.dupNode(CASE261);

            root_1 = (CommonTree)adaptor.becomeRoot(CASE261_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_switchCaseLabel2964);
            expression262=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expression262.getTree());
            // Imprinter.g:473:27: ( blockStatement )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==AT||LA85_0==SEMI||LA85_0==ASSERT||LA85_0==BREAK||(LA85_0>=CLASS && LA85_0<=CONTINUE)||LA85_0==DO||LA85_0==ENUM||(LA85_0>=FOR && LA85_0<=IF)||LA85_0==INTERFACE||LA85_0==RETURN||(LA85_0>=SWITCH && LA85_0<=SYNCHRONIZED)||LA85_0==THROW||LA85_0==TRY||LA85_0==WHILE||LA85_0==BLOCK_SCOPE||LA85_0==EXPR||LA85_0==FOR_EACH||LA85_0==LABELED_STATEMENT||LA85_0==VAR_DECLARATION) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // Imprinter.g:0:0: blockStatement
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    pushFollow(FOLLOW_blockStatement_in_switchCaseLabel2966);
            	    blockStatement263=blockStatement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) 
            	    adaptor.addChild(root_1, blockStatement263.getTree());

            	    if ( state.backtracking==0 ) {
            	    }
            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 55, switchCaseLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchCaseLabel"

    public static class switchDefaultLabel_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "switchDefaultLabel"
    // Imprinter.g:476:1: switchDefaultLabel : ^( DEFAULT ( blockStatement )* ) ;
    public final Imprinter.switchDefaultLabel_return switchDefaultLabel() throws RecognitionException {
        Imprinter.switchDefaultLabel_return retval = new Imprinter.switchDefaultLabel_return();
        retval.start = input.LT(1);
        int switchDefaultLabel_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DEFAULT264=null;
        Imprinter.blockStatement_return blockStatement265 = null;


        CommonTree DEFAULT264_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 56) ) { return retval; }
            // Imprinter.g:477:5: ( ^( DEFAULT ( blockStatement )* ) )
            // Imprinter.g:477:9: ^( DEFAULT ( blockStatement )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            DEFAULT264=(CommonTree)match(input,DEFAULT,FOLLOW_DEFAULT_in_switchDefaultLabel2992); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEFAULT264_tree = (CommonTree)adaptor.dupNode(DEFAULT264);

            root_1 = (CommonTree)adaptor.becomeRoot(DEFAULT264_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:477:19: ( blockStatement )*
                loop86:
                do {
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==AT||LA86_0==SEMI||LA86_0==ASSERT||LA86_0==BREAK||(LA86_0>=CLASS && LA86_0<=CONTINUE)||LA86_0==DO||LA86_0==ENUM||(LA86_0>=FOR && LA86_0<=IF)||LA86_0==INTERFACE||LA86_0==RETURN||(LA86_0>=SWITCH && LA86_0<=SYNCHRONIZED)||LA86_0==THROW||LA86_0==TRY||LA86_0==WHILE||LA86_0==BLOCK_SCOPE||LA86_0==EXPR||LA86_0==FOR_EACH||LA86_0==LABELED_STATEMENT||LA86_0==VAR_DECLARATION) ) {
                        alt86=1;
                    }


                    switch (alt86) {
                	case 1 :
                	    // Imprinter.g:0:0: blockStatement
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_blockStatement_in_switchDefaultLabel2994);
                	    blockStatement265=blockStatement();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, blockStatement265.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop86;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 56, switchDefaultLabel_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "switchDefaultLabel"

    public static class forInit_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forInit"
    // Imprinter.g:480:1: forInit : ^( FOR_INIT (lvar= localVariableDeclaration | ( expression )* )? ) ;
    public final Imprinter.forInit_return forInit() throws RecognitionException {
        Imprinter.forInit_return retval = new Imprinter.forInit_return();
        retval.start = input.LT(1);
        int forInit_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FOR_INIT266=null;
        Imprinter.localVariableDeclaration_return lvar = null;

        Imprinter.expression_return expression267 = null;


        CommonTree FOR_INIT266_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 57) ) { return retval; }
            // Imprinter.g:481:5: ( ^( FOR_INIT (lvar= localVariableDeclaration | ( expression )* )? ) )
            // Imprinter.g:481:9: ^( FOR_INIT (lvar= localVariableDeclaration | ( expression )* )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FOR_INIT266=(CommonTree)match(input,FOR_INIT,FOLLOW_FOR_INIT_in_forInit3020); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR_INIT266_tree = (CommonTree)adaptor.dupNode(FOR_INIT266);

            root_1 = (CommonTree)adaptor.becomeRoot(FOR_INIT266_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:481:20: (lvar= localVariableDeclaration | ( expression )* )?
                int alt88=3;
                switch ( input.LA(1) ) {
                    case VAR_DECLARATION:
                        {
                        alt88=1;
                        }
                        break;
                    case EXPR:
                        {
                        alt88=2;
                        }
                        break;
                    case UP:
                        {
                        int LA88_3 = input.LA(2);

                        if ( (synpred132_Imprinter()) ) {
                            alt88=2;
                        }
                        }
                        break;
                }

                switch (alt88) {
                    case 1 :
                        // Imprinter.g:481:21: lvar= localVariableDeclaration
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_localVariableDeclaration_in_forInit3025);
                        lvar=localVariableDeclaration();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, lvar.getTree());
                        if ( state.backtracking==0 ) {
                          if ((lvar!=null?lvar.lst:null)!=null) ((classScopeDeclarations_scope)classScopeDeclarations_stack.peek()).block.addLocalVariables((lvar!=null?lvar.lst:null));
                        }

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;
                    case 2 :
                        // Imprinter.g:481:137: ( expression )*
                        {
                        // Imprinter.g:481:137: ( expression )*
                        loop87:
                        do {
                            int alt87=2;
                            int LA87_0 = input.LA(1);

                            if ( (LA87_0==EXPR) ) {
                                alt87=1;
                            }


                            switch (alt87) {
                        	case 1 :
                        	    // Imprinter.g:0:0: expression
                        	    {
                        	    _last = (CommonTree)input.LT(1);
                        	    pushFollow(FOLLOW_expression_in_forInit3031);
                        	    expression267=expression();

                        	    state._fsp--;
                        	    if (state.failed) return retval;
                        	    if ( state.backtracking==0 ) 
                        	    adaptor.addChild(root_1, expression267.getTree());

                        	    if ( state.backtracking==0 ) {
                        	    }
                        	    }
                        	    break;

                        	default :
                        	    break loop87;
                            }
                        } while (true);


                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 57, forInit_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forInit"

    public static class forCondition_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forCondition"
    // Imprinter.g:484:1: forCondition : ^( FOR_CONDITION ( expression )? ) ;
    public final Imprinter.forCondition_return forCondition() throws RecognitionException {
        Imprinter.forCondition_return retval = new Imprinter.forCondition_return();
        retval.start = input.LT(1);
        int forCondition_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FOR_CONDITION268=null;
        Imprinter.expression_return expression269 = null;


        CommonTree FOR_CONDITION268_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 58) ) { return retval; }
            // Imprinter.g:485:5: ( ^( FOR_CONDITION ( expression )? ) )
            // Imprinter.g:485:9: ^( FOR_CONDITION ( expression )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FOR_CONDITION268=(CommonTree)match(input,FOR_CONDITION,FOLLOW_FOR_CONDITION_in_forCondition3059); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR_CONDITION268_tree = (CommonTree)adaptor.dupNode(FOR_CONDITION268);

            root_1 = (CommonTree)adaptor.becomeRoot(FOR_CONDITION268_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:485:25: ( expression )?
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==EXPR) ) {
                    alt89=1;
                }
                switch (alt89) {
                    case 1 :
                        // Imprinter.g:0:0: expression
                        {
                        _last = (CommonTree)input.LT(1);
                        pushFollow(FOLLOW_expression_in_forCondition3061);
                        expression269=expression();

                        state._fsp--;
                        if (state.failed) return retval;
                        if ( state.backtracking==0 ) 
                        adaptor.addChild(root_1, expression269.getTree());

                        if ( state.backtracking==0 ) {
                        }
                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 58, forCondition_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forCondition"

    public static class forUpdater_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forUpdater"
    // Imprinter.g:488:1: forUpdater : ^( FOR_UPDATE ( expression )* ) ;
    public final Imprinter.forUpdater_return forUpdater() throws RecognitionException {
        Imprinter.forUpdater_return retval = new Imprinter.forUpdater_return();
        retval.start = input.LT(1);
        int forUpdater_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree FOR_UPDATE270=null;
        Imprinter.expression_return expression271 = null;


        CommonTree FOR_UPDATE270_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 59) ) { return retval; }
            // Imprinter.g:489:5: ( ^( FOR_UPDATE ( expression )* ) )
            // Imprinter.g:489:9: ^( FOR_UPDATE ( expression )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            FOR_UPDATE270=(CommonTree)match(input,FOR_UPDATE,FOLLOW_FOR_UPDATE_in_forUpdater3087); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FOR_UPDATE270_tree = (CommonTree)adaptor.dupNode(FOR_UPDATE270);

            root_1 = (CommonTree)adaptor.becomeRoot(FOR_UPDATE270_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:489:22: ( expression )*
                loop90:
                do {
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==EXPR) ) {
                        alt90=1;
                    }


                    switch (alt90) {
                	case 1 :
                	    // Imprinter.g:0:0: expression
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_expression_in_forUpdater3089);
                	    expression271=expression();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, expression271.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop90;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 59, forUpdater_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "forUpdater"

    public static class parenthesizedExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parenthesizedExpression"
    // Imprinter.g:494:1: parenthesizedExpression : ^( PARENTESIZED_EXPR expression ) ;
    public final Imprinter.parenthesizedExpression_return parenthesizedExpression() throws RecognitionException {
        Imprinter.parenthesizedExpression_return retval = new Imprinter.parenthesizedExpression_return();
        retval.start = input.LT(1);
        int parenthesizedExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree PARENTESIZED_EXPR272=null;
        Imprinter.expression_return expression273 = null;


        CommonTree PARENTESIZED_EXPR272_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 60) ) { return retval; }
            // Imprinter.g:495:5: ( ^( PARENTESIZED_EXPR expression ) )
            // Imprinter.g:495:9: ^( PARENTESIZED_EXPR expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            PARENTESIZED_EXPR272=(CommonTree)match(input,PARENTESIZED_EXPR,FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PARENTESIZED_EXPR272_tree = (CommonTree)adaptor.dupNode(PARENTESIZED_EXPR272);

            root_1 = (CommonTree)adaptor.becomeRoot(PARENTESIZED_EXPR272_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expression_in_parenthesizedExpression3119);
            expression273=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expression273.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 60, parenthesizedExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "parenthesizedExpression"

    public static class expression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // Imprinter.g:498:1: expression : ^( EXPR expr ) ;
    public final Imprinter.expression_return expression() throws RecognitionException {
        Imprinter.expression_return retval = new Imprinter.expression_return();
        retval.start = input.LT(1);
        int expression_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EXPR274=null;
        Imprinter.expr_return expr275 = null;


        CommonTree EXPR274_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 61) ) { return retval; }
            // Imprinter.g:499:5: ( ^( EXPR expr ) )
            // Imprinter.g:499:9: ^( EXPR expr )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            EXPR274=(CommonTree)match(input,EXPR,FOLLOW_EXPR_in_expression3144); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EXPR274_tree = (CommonTree)adaptor.dupNode(EXPR274);

            root_1 = (CommonTree)adaptor.becomeRoot(EXPR274_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_expr_in_expression3146);
            expr275=expr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, expr275.getTree());

            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 61, expression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expr_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expr"
    // Imprinter.g:502:1: expr : ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression );
    public final Imprinter.expr_return expr() throws RecognitionException {
        Imprinter.expr_return retval = new Imprinter.expr_return();
        retval.start = input.LT(1);
        int expr_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ASSIGN276=null;
        CommonTree PLUS_ASSIGN279=null;
        CommonTree MINUS_ASSIGN282=null;
        CommonTree STAR_ASSIGN285=null;
        CommonTree DIV_ASSIGN288=null;
        CommonTree AND_ASSIGN291=null;
        CommonTree OR_ASSIGN294=null;
        CommonTree XOR_ASSIGN297=null;
        CommonTree MOD_ASSIGN300=null;
        CommonTree BIT_SHIFT_RIGHT_ASSIGN303=null;
        CommonTree SHIFT_RIGHT_ASSIGN306=null;
        CommonTree SHIFT_LEFT_ASSIGN309=null;
        CommonTree QUESTION312=null;
        CommonTree LOGICAL_OR316=null;
        CommonTree LOGICAL_AND319=null;
        CommonTree OR322=null;
        CommonTree XOR325=null;
        CommonTree AND328=null;
        CommonTree EQUAL331=null;
        CommonTree NOT_EQUAL334=null;
        CommonTree INSTANCEOF337=null;
        CommonTree LESS_OR_EQUAL340=null;
        CommonTree GREATER_OR_EQUAL343=null;
        CommonTree BIT_SHIFT_RIGHT346=null;
        CommonTree SHIFT_RIGHT349=null;
        CommonTree GREATER_THAN352=null;
        CommonTree SHIFT_LEFT355=null;
        CommonTree LESS_THAN358=null;
        CommonTree PLUS361=null;
        CommonTree MINUS364=null;
        CommonTree STAR367=null;
        CommonTree DIV370=null;
        CommonTree MOD373=null;
        CommonTree UNARY_PLUS376=null;
        CommonTree UNARY_MINUS378=null;
        CommonTree PRE_INC380=null;
        CommonTree PRE_DEC382=null;
        CommonTree POST_INC384=null;
        CommonTree POST_DEC386=null;
        CommonTree NOT388=null;
        CommonTree LOGICAL_NOT390=null;
        CommonTree CAST_EXPR392=null;
        Imprinter.expr_return expr277 = null;

        Imprinter.expr_return expr278 = null;

        Imprinter.expr_return expr280 = null;

        Imprinter.expr_return expr281 = null;

        Imprinter.expr_return expr283 = null;

        Imprinter.expr_return expr284 = null;

        Imprinter.expr_return expr286 = null;

        Imprinter.expr_return expr287 = null;

        Imprinter.expr_return expr289 = null;

        Imprinter.expr_return expr290 = null;

        Imprinter.expr_return expr292 = null;

        Imprinter.expr_return expr293 = null;

        Imprinter.expr_return expr295 = null;

        Imprinter.expr_return expr296 = null;

        Imprinter.expr_return expr298 = null;

        Imprinter.expr_return expr299 = null;

        Imprinter.expr_return expr301 = null;

        Imprinter.expr_return expr302 = null;

        Imprinter.expr_return expr304 = null;

        Imprinter.expr_return expr305 = null;

        Imprinter.expr_return expr307 = null;

        Imprinter.expr_return expr308 = null;

        Imprinter.expr_return expr310 = null;

        Imprinter.expr_return expr311 = null;

        Imprinter.expr_return expr313 = null;

        Imprinter.expr_return expr314 = null;

        Imprinter.expr_return expr315 = null;

        Imprinter.expr_return expr317 = null;

        Imprinter.expr_return expr318 = null;

        Imprinter.expr_return expr320 = null;

        Imprinter.expr_return expr321 = null;

        Imprinter.expr_return expr323 = null;

        Imprinter.expr_return expr324 = null;

        Imprinter.expr_return expr326 = null;

        Imprinter.expr_return expr327 = null;

        Imprinter.expr_return expr329 = null;

        Imprinter.expr_return expr330 = null;

        Imprinter.expr_return expr332 = null;

        Imprinter.expr_return expr333 = null;

        Imprinter.expr_return expr335 = null;

        Imprinter.expr_return expr336 = null;

        Imprinter.expr_return expr338 = null;

        Imprinter.type_return type339 = null;

        Imprinter.expr_return expr341 = null;

        Imprinter.expr_return expr342 = null;

        Imprinter.expr_return expr344 = null;

        Imprinter.expr_return expr345 = null;

        Imprinter.expr_return expr347 = null;

        Imprinter.expr_return expr348 = null;

        Imprinter.expr_return expr350 = null;

        Imprinter.expr_return expr351 = null;

        Imprinter.expr_return expr353 = null;

        Imprinter.expr_return expr354 = null;

        Imprinter.expr_return expr356 = null;

        Imprinter.expr_return expr357 = null;

        Imprinter.expr_return expr359 = null;

        Imprinter.expr_return expr360 = null;

        Imprinter.expr_return expr362 = null;

        Imprinter.expr_return expr363 = null;

        Imprinter.expr_return expr365 = null;

        Imprinter.expr_return expr366 = null;

        Imprinter.expr_return expr368 = null;

        Imprinter.expr_return expr369 = null;

        Imprinter.expr_return expr371 = null;

        Imprinter.expr_return expr372 = null;

        Imprinter.expr_return expr374 = null;

        Imprinter.expr_return expr375 = null;

        Imprinter.expr_return expr377 = null;

        Imprinter.expr_return expr379 = null;

        Imprinter.expr_return expr381 = null;

        Imprinter.expr_return expr383 = null;

        Imprinter.expr_return expr385 = null;

        Imprinter.expr_return expr387 = null;

        Imprinter.expr_return expr389 = null;

        Imprinter.expr_return expr391 = null;

        Imprinter.type_return type393 = null;

        Imprinter.expr_return expr394 = null;

        Imprinter.primaryExpression_return primaryExpression395 = null;


        CommonTree ASSIGN276_tree=null;
        CommonTree PLUS_ASSIGN279_tree=null;
        CommonTree MINUS_ASSIGN282_tree=null;
        CommonTree STAR_ASSIGN285_tree=null;
        CommonTree DIV_ASSIGN288_tree=null;
        CommonTree AND_ASSIGN291_tree=null;
        CommonTree OR_ASSIGN294_tree=null;
        CommonTree XOR_ASSIGN297_tree=null;
        CommonTree MOD_ASSIGN300_tree=null;
        CommonTree BIT_SHIFT_RIGHT_ASSIGN303_tree=null;
        CommonTree SHIFT_RIGHT_ASSIGN306_tree=null;
        CommonTree SHIFT_LEFT_ASSIGN309_tree=null;
        CommonTree QUESTION312_tree=null;
        CommonTree LOGICAL_OR316_tree=null;
        CommonTree LOGICAL_AND319_tree=null;
        CommonTree OR322_tree=null;
        CommonTree XOR325_tree=null;
        CommonTree AND328_tree=null;
        CommonTree EQUAL331_tree=null;
        CommonTree NOT_EQUAL334_tree=null;
        CommonTree INSTANCEOF337_tree=null;
        CommonTree LESS_OR_EQUAL340_tree=null;
        CommonTree GREATER_OR_EQUAL343_tree=null;
        CommonTree BIT_SHIFT_RIGHT346_tree=null;
        CommonTree SHIFT_RIGHT349_tree=null;
        CommonTree GREATER_THAN352_tree=null;
        CommonTree SHIFT_LEFT355_tree=null;
        CommonTree LESS_THAN358_tree=null;
        CommonTree PLUS361_tree=null;
        CommonTree MINUS364_tree=null;
        CommonTree STAR367_tree=null;
        CommonTree DIV370_tree=null;
        CommonTree MOD373_tree=null;
        CommonTree UNARY_PLUS376_tree=null;
        CommonTree UNARY_MINUS378_tree=null;
        CommonTree PRE_INC380_tree=null;
        CommonTree PRE_DEC382_tree=null;
        CommonTree POST_INC384_tree=null;
        CommonTree POST_DEC386_tree=null;
        CommonTree NOT388_tree=null;
        CommonTree LOGICAL_NOT390_tree=null;
        CommonTree CAST_EXPR392_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 62) ) { return retval; }
            // Imprinter.g:503:5: ( ^( ASSIGN expr expr ) | ^( PLUS_ASSIGN expr expr ) | ^( MINUS_ASSIGN expr expr ) | ^( STAR_ASSIGN expr expr ) | ^( DIV_ASSIGN expr expr ) | ^( AND_ASSIGN expr expr ) | ^( OR_ASSIGN expr expr ) | ^( XOR_ASSIGN expr expr ) | ^( MOD_ASSIGN expr expr ) | ^( BIT_SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_RIGHT_ASSIGN expr expr ) | ^( SHIFT_LEFT_ASSIGN expr expr ) | ^( QUESTION expr expr expr ) | ^( LOGICAL_OR expr expr ) | ^( LOGICAL_AND expr expr ) | ^( OR expr expr ) | ^( XOR expr expr ) | ^( AND expr expr ) | ^( EQUAL expr expr ) | ^( NOT_EQUAL expr expr ) | ^( INSTANCEOF expr type ) | ^( LESS_OR_EQUAL expr expr ) | ^( GREATER_OR_EQUAL expr expr ) | ^( BIT_SHIFT_RIGHT expr expr ) | ^( SHIFT_RIGHT expr expr ) | ^( GREATER_THAN expr expr ) | ^( SHIFT_LEFT expr expr ) | ^( LESS_THAN expr expr ) | ^( PLUS expr expr ) | ^( MINUS expr expr ) | ^( STAR expr expr ) | ^( DIV expr expr ) | ^( MOD expr expr ) | ^( UNARY_PLUS expr ) | ^( UNARY_MINUS expr ) | ^( PRE_INC expr ) | ^( PRE_DEC expr ) | ^( POST_INC expr ) | ^( POST_DEC expr ) | ^( NOT expr ) | ^( LOGICAL_NOT expr ) | ^( CAST_EXPR type expr ) | primaryExpression )
            int alt91=43;
            switch ( input.LA(1) ) {
            case ASSIGN:
                {
                alt91=1;
                }
                break;
            case PLUS_ASSIGN:
                {
                alt91=2;
                }
                break;
            case MINUS_ASSIGN:
                {
                alt91=3;
                }
                break;
            case STAR_ASSIGN:
                {
                alt91=4;
                }
                break;
            case DIV_ASSIGN:
                {
                alt91=5;
                }
                break;
            case AND_ASSIGN:
                {
                alt91=6;
                }
                break;
            case OR_ASSIGN:
                {
                alt91=7;
                }
                break;
            case XOR_ASSIGN:
                {
                alt91=8;
                }
                break;
            case MOD_ASSIGN:
                {
                alt91=9;
                }
                break;
            case BIT_SHIFT_RIGHT_ASSIGN:
                {
                alt91=10;
                }
                break;
            case SHIFT_RIGHT_ASSIGN:
                {
                alt91=11;
                }
                break;
            case SHIFT_LEFT_ASSIGN:
                {
                alt91=12;
                }
                break;
            case QUESTION:
                {
                alt91=13;
                }
                break;
            case LOGICAL_OR:
                {
                alt91=14;
                }
                break;
            case LOGICAL_AND:
                {
                alt91=15;
                }
                break;
            case OR:
                {
                alt91=16;
                }
                break;
            case XOR:
                {
                alt91=17;
                }
                break;
            case AND:
                {
                alt91=18;
                }
                break;
            case EQUAL:
                {
                alt91=19;
                }
                break;
            case NOT_EQUAL:
                {
                alt91=20;
                }
                break;
            case INSTANCEOF:
                {
                alt91=21;
                }
                break;
            case LESS_OR_EQUAL:
                {
                alt91=22;
                }
                break;
            case GREATER_OR_EQUAL:
                {
                alt91=23;
                }
                break;
            case BIT_SHIFT_RIGHT:
                {
                alt91=24;
                }
                break;
            case SHIFT_RIGHT:
                {
                alt91=25;
                }
                break;
            case GREATER_THAN:
                {
                alt91=26;
                }
                break;
            case SHIFT_LEFT:
                {
                alt91=27;
                }
                break;
            case LESS_THAN:
                {
                alt91=28;
                }
                break;
            case PLUS:
                {
                alt91=29;
                }
                break;
            case MINUS:
                {
                alt91=30;
                }
                break;
            case STAR:
                {
                alt91=31;
                }
                break;
            case DIV:
                {
                alt91=32;
                }
                break;
            case MOD:
                {
                alt91=33;
                }
                break;
            case UNARY_PLUS:
                {
                alt91=34;
                }
                break;
            case UNARY_MINUS:
                {
                alt91=35;
                }
                break;
            case PRE_INC:
                {
                alt91=36;
                }
                break;
            case PRE_DEC:
                {
                alt91=37;
                }
                break;
            case POST_INC:
                {
                alt91=38;
                }
                break;
            case POST_DEC:
                {
                alt91=39;
                }
                break;
            case NOT:
                {
                alt91=40;
                }
                break;
            case LOGICAL_NOT:
                {
                alt91=41;
                }
                break;
            case CAST_EXPR:
                {
                alt91=42;
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
            case COMMENT:
            case LINE_COMMENT:
                {
                alt91=43;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // Imprinter.g:503:9: ^( ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ASSIGN276=(CommonTree)match(input,ASSIGN,FOLLOW_ASSIGN_in_expr3167); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ASSIGN276_tree = (CommonTree)adaptor.dupNode(ASSIGN276);

                    root_1 = (CommonTree)adaptor.becomeRoot(ASSIGN276_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3169);
                    expr277=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr277.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3171);
                    expr278=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr278.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:504:9: ^( PLUS_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS_ASSIGN279=(CommonTree)match(input,PLUS_ASSIGN,FOLLOW_PLUS_ASSIGN_in_expr3183); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS_ASSIGN279_tree = (CommonTree)adaptor.dupNode(PLUS_ASSIGN279);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS_ASSIGN279_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3185);
                    expr280=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr280.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3187);
                    expr281=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr281.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:505:9: ^( MINUS_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS_ASSIGN282=(CommonTree)match(input,MINUS_ASSIGN,FOLLOW_MINUS_ASSIGN_in_expr3199); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS_ASSIGN282_tree = (CommonTree)adaptor.dupNode(MINUS_ASSIGN282);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS_ASSIGN282_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3201);
                    expr283=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr283.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3203);
                    expr284=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr284.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Imprinter.g:506:9: ^( STAR_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STAR_ASSIGN285=(CommonTree)match(input,STAR_ASSIGN,FOLLOW_STAR_ASSIGN_in_expr3215); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR_ASSIGN285_tree = (CommonTree)adaptor.dupNode(STAR_ASSIGN285);

                    root_1 = (CommonTree)adaptor.becomeRoot(STAR_ASSIGN285_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3217);
                    expr286=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr286.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3219);
                    expr287=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr287.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // Imprinter.g:507:9: ^( DIV_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIV_ASSIGN288=(CommonTree)match(input,DIV_ASSIGN,FOLLOW_DIV_ASSIGN_in_expr3231); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIV_ASSIGN288_tree = (CommonTree)adaptor.dupNode(DIV_ASSIGN288);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIV_ASSIGN288_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3233);
                    expr289=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr289.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3235);
                    expr290=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr290.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // Imprinter.g:508:9: ^( AND_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AND_ASSIGN291=(CommonTree)match(input,AND_ASSIGN,FOLLOW_AND_ASSIGN_in_expr3247); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND_ASSIGN291_tree = (CommonTree)adaptor.dupNode(AND_ASSIGN291);

                    root_1 = (CommonTree)adaptor.becomeRoot(AND_ASSIGN291_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3249);
                    expr292=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr292.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3251);
                    expr293=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr293.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // Imprinter.g:509:9: ^( OR_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OR_ASSIGN294=(CommonTree)match(input,OR_ASSIGN,FOLLOW_OR_ASSIGN_in_expr3263); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR_ASSIGN294_tree = (CommonTree)adaptor.dupNode(OR_ASSIGN294);

                    root_1 = (CommonTree)adaptor.becomeRoot(OR_ASSIGN294_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3265);
                    expr295=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr295.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3267);
                    expr296=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr296.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // Imprinter.g:510:9: ^( XOR_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    XOR_ASSIGN297=(CommonTree)match(input,XOR_ASSIGN,FOLLOW_XOR_ASSIGN_in_expr3279); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR_ASSIGN297_tree = (CommonTree)adaptor.dupNode(XOR_ASSIGN297);

                    root_1 = (CommonTree)adaptor.becomeRoot(XOR_ASSIGN297_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3281);
                    expr298=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr298.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3283);
                    expr299=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr299.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // Imprinter.g:511:9: ^( MOD_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOD_ASSIGN300=(CommonTree)match(input,MOD_ASSIGN,FOLLOW_MOD_ASSIGN_in_expr3295); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MOD_ASSIGN300_tree = (CommonTree)adaptor.dupNode(MOD_ASSIGN300);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOD_ASSIGN300_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3297);
                    expr301=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr301.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3299);
                    expr302=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr302.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // Imprinter.g:512:9: ^( BIT_SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BIT_SHIFT_RIGHT_ASSIGN303=(CommonTree)match(input,BIT_SHIFT_RIGHT_ASSIGN,FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3311); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_SHIFT_RIGHT_ASSIGN303_tree = (CommonTree)adaptor.dupNode(BIT_SHIFT_RIGHT_ASSIGN303);

                    root_1 = (CommonTree)adaptor.becomeRoot(BIT_SHIFT_RIGHT_ASSIGN303_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3313);
                    expr304=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr304.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3315);
                    expr305=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr305.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // Imprinter.g:513:9: ^( SHIFT_RIGHT_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFT_RIGHT_ASSIGN306=(CommonTree)match(input,SHIFT_RIGHT_ASSIGN,FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3327); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHIFT_RIGHT_ASSIGN306_tree = (CommonTree)adaptor.dupNode(SHIFT_RIGHT_ASSIGN306);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFT_RIGHT_ASSIGN306_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3329);
                    expr307=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr307.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3331);
                    expr308=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr308.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // Imprinter.g:514:9: ^( SHIFT_LEFT_ASSIGN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFT_LEFT_ASSIGN309=(CommonTree)match(input,SHIFT_LEFT_ASSIGN,FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3343); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHIFT_LEFT_ASSIGN309_tree = (CommonTree)adaptor.dupNode(SHIFT_LEFT_ASSIGN309);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFT_LEFT_ASSIGN309_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3345);
                    expr310=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr310.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3347);
                    expr311=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr311.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 13 :
                    // Imprinter.g:515:9: ^( QUESTION expr expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    QUESTION312=(CommonTree)match(input,QUESTION,FOLLOW_QUESTION_in_expr3359); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    QUESTION312_tree = (CommonTree)adaptor.dupNode(QUESTION312);

                    root_1 = (CommonTree)adaptor.becomeRoot(QUESTION312_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3361);
                    expr313=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr313.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3363);
                    expr314=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr314.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3365);
                    expr315=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr315.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 14 :
                    // Imprinter.g:516:9: ^( LOGICAL_OR expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LOGICAL_OR316=(CommonTree)match(input,LOGICAL_OR,FOLLOW_LOGICAL_OR_in_expr3377); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOGICAL_OR316_tree = (CommonTree)adaptor.dupNode(LOGICAL_OR316);

                    root_1 = (CommonTree)adaptor.becomeRoot(LOGICAL_OR316_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3379);
                    expr317=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr317.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3381);
                    expr318=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr318.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 15 :
                    // Imprinter.g:517:9: ^( LOGICAL_AND expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LOGICAL_AND319=(CommonTree)match(input,LOGICAL_AND,FOLLOW_LOGICAL_AND_in_expr3393); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOGICAL_AND319_tree = (CommonTree)adaptor.dupNode(LOGICAL_AND319);

                    root_1 = (CommonTree)adaptor.becomeRoot(LOGICAL_AND319_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3395);
                    expr320=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr320.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3397);
                    expr321=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr321.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 16 :
                    // Imprinter.g:518:9: ^( OR expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    OR322=(CommonTree)match(input,OR,FOLLOW_OR_in_expr3409); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    OR322_tree = (CommonTree)adaptor.dupNode(OR322);

                    root_1 = (CommonTree)adaptor.becomeRoot(OR322_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3411);
                    expr323=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr323.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3413);
                    expr324=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr324.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 17 :
                    // Imprinter.g:519:9: ^( XOR expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    XOR325=(CommonTree)match(input,XOR,FOLLOW_XOR_in_expr3425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    XOR325_tree = (CommonTree)adaptor.dupNode(XOR325);

                    root_1 = (CommonTree)adaptor.becomeRoot(XOR325_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3427);
                    expr326=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr326.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3429);
                    expr327=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr327.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 18 :
                    // Imprinter.g:520:9: ^( AND expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    AND328=(CommonTree)match(input,AND,FOLLOW_AND_in_expr3441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    AND328_tree = (CommonTree)adaptor.dupNode(AND328);

                    root_1 = (CommonTree)adaptor.becomeRoot(AND328_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3443);
                    expr329=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr329.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3445);
                    expr330=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr330.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 19 :
                    // Imprinter.g:521:9: ^( EQUAL expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    EQUAL331=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_expr3457); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    EQUAL331_tree = (CommonTree)adaptor.dupNode(EQUAL331);

                    root_1 = (CommonTree)adaptor.becomeRoot(EQUAL331_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3459);
                    expr332=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr332.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3461);
                    expr333=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr333.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 20 :
                    // Imprinter.g:522:9: ^( NOT_EQUAL expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT_EQUAL334=(CommonTree)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_expr3473); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT_EQUAL334_tree = (CommonTree)adaptor.dupNode(NOT_EQUAL334);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT_EQUAL334_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3475);
                    expr335=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr335.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3477);
                    expr336=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr336.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 21 :
                    // Imprinter.g:523:9: ^( INSTANCEOF expr type )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    INSTANCEOF337=(CommonTree)match(input,INSTANCEOF,FOLLOW_INSTANCEOF_in_expr3489); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    INSTANCEOF337_tree = (CommonTree)adaptor.dupNode(INSTANCEOF337);

                    root_1 = (CommonTree)adaptor.becomeRoot(INSTANCEOF337_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3491);
                    expr338=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr338.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_expr3493);
                    type339=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type339.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 22 :
                    // Imprinter.g:524:9: ^( LESS_OR_EQUAL expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LESS_OR_EQUAL340=(CommonTree)match(input,LESS_OR_EQUAL,FOLLOW_LESS_OR_EQUAL_in_expr3505); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS_OR_EQUAL340_tree = (CommonTree)adaptor.dupNode(LESS_OR_EQUAL340);

                    root_1 = (CommonTree)adaptor.becomeRoot(LESS_OR_EQUAL340_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3507);
                    expr341=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr341.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3509);
                    expr342=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr342.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 23 :
                    // Imprinter.g:525:9: ^( GREATER_OR_EQUAL expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GREATER_OR_EQUAL343=(CommonTree)match(input,GREATER_OR_EQUAL,FOLLOW_GREATER_OR_EQUAL_in_expr3521); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER_OR_EQUAL343_tree = (CommonTree)adaptor.dupNode(GREATER_OR_EQUAL343);

                    root_1 = (CommonTree)adaptor.becomeRoot(GREATER_OR_EQUAL343_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3523);
                    expr344=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr344.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3525);
                    expr345=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr345.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 24 :
                    // Imprinter.g:526:9: ^( BIT_SHIFT_RIGHT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    BIT_SHIFT_RIGHT346=(CommonTree)match(input,BIT_SHIFT_RIGHT,FOLLOW_BIT_SHIFT_RIGHT_in_expr3537); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BIT_SHIFT_RIGHT346_tree = (CommonTree)adaptor.dupNode(BIT_SHIFT_RIGHT346);

                    root_1 = (CommonTree)adaptor.becomeRoot(BIT_SHIFT_RIGHT346_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3539);
                    expr347=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr347.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3541);
                    expr348=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr348.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 25 :
                    // Imprinter.g:527:9: ^( SHIFT_RIGHT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFT_RIGHT349=(CommonTree)match(input,SHIFT_RIGHT,FOLLOW_SHIFT_RIGHT_in_expr3553); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHIFT_RIGHT349_tree = (CommonTree)adaptor.dupNode(SHIFT_RIGHT349);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFT_RIGHT349_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3555);
                    expr350=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr350.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3557);
                    expr351=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr351.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 26 :
                    // Imprinter.g:528:9: ^( GREATER_THAN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    GREATER_THAN352=(CommonTree)match(input,GREATER_THAN,FOLLOW_GREATER_THAN_in_expr3569); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    GREATER_THAN352_tree = (CommonTree)adaptor.dupNode(GREATER_THAN352);

                    root_1 = (CommonTree)adaptor.becomeRoot(GREATER_THAN352_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3571);
                    expr353=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr353.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3573);
                    expr354=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr354.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 27 :
                    // Imprinter.g:529:9: ^( SHIFT_LEFT expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SHIFT_LEFT355=(CommonTree)match(input,SHIFT_LEFT,FOLLOW_SHIFT_LEFT_in_expr3585); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SHIFT_LEFT355_tree = (CommonTree)adaptor.dupNode(SHIFT_LEFT355);

                    root_1 = (CommonTree)adaptor.becomeRoot(SHIFT_LEFT355_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3587);
                    expr356=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr356.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3589);
                    expr357=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr357.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 28 :
                    // Imprinter.g:530:9: ^( LESS_THAN expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LESS_THAN358=(CommonTree)match(input,LESS_THAN,FOLLOW_LESS_THAN_in_expr3601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LESS_THAN358_tree = (CommonTree)adaptor.dupNode(LESS_THAN358);

                    root_1 = (CommonTree)adaptor.becomeRoot(LESS_THAN358_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3603);
                    expr359=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr359.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3605);
                    expr360=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr360.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 29 :
                    // Imprinter.g:531:9: ^( PLUS expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PLUS361=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_expr3617); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PLUS361_tree = (CommonTree)adaptor.dupNode(PLUS361);

                    root_1 = (CommonTree)adaptor.becomeRoot(PLUS361_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3619);
                    expr362=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr362.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3621);
                    expr363=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr363.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 30 :
                    // Imprinter.g:532:9: ^( MINUS expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MINUS364=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_expr3633); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MINUS364_tree = (CommonTree)adaptor.dupNode(MINUS364);

                    root_1 = (CommonTree)adaptor.becomeRoot(MINUS364_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3635);
                    expr365=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr365.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3637);
                    expr366=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr366.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 31 :
                    // Imprinter.g:533:9: ^( STAR expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STAR367=(CommonTree)match(input,STAR,FOLLOW_STAR_in_expr3649); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STAR367_tree = (CommonTree)adaptor.dupNode(STAR367);

                    root_1 = (CommonTree)adaptor.becomeRoot(STAR367_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3651);
                    expr368=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr368.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3653);
                    expr369=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr369.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 32 :
                    // Imprinter.g:534:9: ^( DIV expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DIV370=(CommonTree)match(input,DIV,FOLLOW_DIV_in_expr3665); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DIV370_tree = (CommonTree)adaptor.dupNode(DIV370);

                    root_1 = (CommonTree)adaptor.becomeRoot(DIV370_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3667);
                    expr371=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr371.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3669);
                    expr372=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr372.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 33 :
                    // Imprinter.g:535:9: ^( MOD expr expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    MOD373=(CommonTree)match(input,MOD,FOLLOW_MOD_in_expr3681); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    MOD373_tree = (CommonTree)adaptor.dupNode(MOD373);

                    root_1 = (CommonTree)adaptor.becomeRoot(MOD373_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3683);
                    expr374=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr374.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3685);
                    expr375=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr375.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 34 :
                    // Imprinter.g:536:9: ^( UNARY_PLUS expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNARY_PLUS376=(CommonTree)match(input,UNARY_PLUS,FOLLOW_UNARY_PLUS_in_expr3697); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNARY_PLUS376_tree = (CommonTree)adaptor.dupNode(UNARY_PLUS376);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY_PLUS376_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3699);
                    expr377=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr377.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 35 :
                    // Imprinter.g:537:9: ^( UNARY_MINUS expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    UNARY_MINUS378=(CommonTree)match(input,UNARY_MINUS,FOLLOW_UNARY_MINUS_in_expr3711); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    UNARY_MINUS378_tree = (CommonTree)adaptor.dupNode(UNARY_MINUS378);

                    root_1 = (CommonTree)adaptor.becomeRoot(UNARY_MINUS378_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3713);
                    expr379=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr379.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 36 :
                    // Imprinter.g:538:9: ^( PRE_INC expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PRE_INC380=(CommonTree)match(input,PRE_INC,FOLLOW_PRE_INC_in_expr3725); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRE_INC380_tree = (CommonTree)adaptor.dupNode(PRE_INC380);

                    root_1 = (CommonTree)adaptor.becomeRoot(PRE_INC380_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3727);
                    expr381=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr381.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 37 :
                    // Imprinter.g:539:9: ^( PRE_DEC expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    PRE_DEC382=(CommonTree)match(input,PRE_DEC,FOLLOW_PRE_DEC_in_expr3739); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PRE_DEC382_tree = (CommonTree)adaptor.dupNode(PRE_DEC382);

                    root_1 = (CommonTree)adaptor.becomeRoot(PRE_DEC382_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3741);
                    expr383=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr383.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 38 :
                    // Imprinter.g:540:9: ^( POST_INC expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    POST_INC384=(CommonTree)match(input,POST_INC,FOLLOW_POST_INC_in_expr3753); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    POST_INC384_tree = (CommonTree)adaptor.dupNode(POST_INC384);

                    root_1 = (CommonTree)adaptor.becomeRoot(POST_INC384_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3755);
                    expr385=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr385.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 39 :
                    // Imprinter.g:541:9: ^( POST_DEC expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    POST_DEC386=(CommonTree)match(input,POST_DEC,FOLLOW_POST_DEC_in_expr3767); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    POST_DEC386_tree = (CommonTree)adaptor.dupNode(POST_DEC386);

                    root_1 = (CommonTree)adaptor.becomeRoot(POST_DEC386_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3769);
                    expr387=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr387.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 40 :
                    // Imprinter.g:542:9: ^( NOT expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    NOT388=(CommonTree)match(input,NOT,FOLLOW_NOT_in_expr3781); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NOT388_tree = (CommonTree)adaptor.dupNode(NOT388);

                    root_1 = (CommonTree)adaptor.becomeRoot(NOT388_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3783);
                    expr389=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr389.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 41 :
                    // Imprinter.g:543:9: ^( LOGICAL_NOT expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    LOGICAL_NOT390=(CommonTree)match(input,LOGICAL_NOT,FOLLOW_LOGICAL_NOT_in_expr3795); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    LOGICAL_NOT390_tree = (CommonTree)adaptor.dupNode(LOGICAL_NOT390);

                    root_1 = (CommonTree)adaptor.becomeRoot(LOGICAL_NOT390_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3797);
                    expr391=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr391.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 42 :
                    // Imprinter.g:544:9: ^( CAST_EXPR type expr )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CAST_EXPR392=(CommonTree)match(input,CAST_EXPR,FOLLOW_CAST_EXPR_in_expr3809); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CAST_EXPR392_tree = (CommonTree)adaptor.dupNode(CAST_EXPR392);

                    root_1 = (CommonTree)adaptor.becomeRoot(CAST_EXPR392_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_type_in_expr3811);
                    type393=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, type393.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expr_in_expr3813);
                    expr394=expr();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expr394.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 43 :
                    // Imprinter.g:545:9: primaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_expr3824);
                    primaryExpression395=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, primaryExpression395.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 62, expr_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "expr"

    public static class primaryExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryExpression"
    // Imprinter.g:548:1: primaryExpression : ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | comment | newExpression | THIS | arrayTypeDeclarator | SUPER );
    public final Imprinter.primaryExpression_return primaryExpression() throws RecognitionException {
        Imprinter.primaryExpression_return retval = new Imprinter.primaryExpression_return();
        retval.start = input.LT(1);
        int primaryExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree DOT396=null;
        CommonTree IDENT398=null;
        CommonTree THIS399=null;
        CommonTree SUPER400=null;
        CommonTree CLASS402=null;
        CommonTree CLASS404=null;
        CommonTree VOID405=null;
        CommonTree CLASS406=null;
        CommonTree IDENT408=null;
        CommonTree METHOD_CALL409=null;
        CommonTree ARRAY_ELEMENT_ACCESS414=null;
        CommonTree THIS420=null;
        CommonTree SUPER422=null;
        Imprinter.primaryExpression_return primaryExpression397 = null;

        Imprinter.innerNewExpression_return innerNewExpression401 = null;

        Imprinter.primitiveType_return primitiveType403 = null;

        Imprinter.parenthesizedExpression_return parenthesizedExpression407 = null;

        Imprinter.primaryExpression_return primaryExpression410 = null;

        Imprinter.genericTypeArgumentList_return genericTypeArgumentList411 = null;

        Imprinter.arguments_return arguments412 = null;

        Imprinter.explicitConstructorCall_return explicitConstructorCall413 = null;

        Imprinter.primaryExpression_return primaryExpression415 = null;

        Imprinter.expression_return expression416 = null;

        Imprinter.literal_return literal417 = null;

        Imprinter.comment_return comment418 = null;

        Imprinter.newExpression_return newExpression419 = null;

        Imprinter.arrayTypeDeclarator_return arrayTypeDeclarator421 = null;


        CommonTree DOT396_tree=null;
        CommonTree IDENT398_tree=null;
        CommonTree THIS399_tree=null;
        CommonTree SUPER400_tree=null;
        CommonTree CLASS402_tree=null;
        CommonTree CLASS404_tree=null;
        CommonTree VOID405_tree=null;
        CommonTree CLASS406_tree=null;
        CommonTree IDENT408_tree=null;
        CommonTree METHOD_CALL409_tree=null;
        CommonTree ARRAY_ELEMENT_ACCESS414_tree=null;
        CommonTree THIS420_tree=null;
        CommonTree SUPER422_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 63) ) { return retval; }
            // Imprinter.g:549:5: ( ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) ) | parenthesizedExpression | IDENT | ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments ) | explicitConstructorCall | ^( ARRAY_ELEMENT_ACCESS primaryExpression expression ) | literal | comment | newExpression | THIS | arrayTypeDeclarator | SUPER )
            int alt95=12;
            switch ( input.LA(1) ) {
            case DOT:
                {
                alt95=1;
                }
                break;
            case PARENTESIZED_EXPR:
                {
                alt95=2;
                }
                break;
            case IDENT:
                {
                alt95=3;
                }
                break;
            case METHOD_CALL:
                {
                alt95=4;
                }
                break;
            case SUPER_CONSTRUCTOR_CALL:
            case THIS_CONSTRUCTOR_CALL:
                {
                alt95=5;
                }
                break;
            case ARRAY_ELEMENT_ACCESS:
                {
                alt95=6;
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
                alt95=7;
                }
                break;
            case COMMENT:
            case LINE_COMMENT:
                {
                alt95=8;
                }
                break;
            case CLASS_CONSTRUCTOR_CALL:
            case STATIC_ARRAY_CREATOR:
                {
                alt95=9;
                }
                break;
            case THIS:
                {
                alt95=10;
                }
                break;
            case ARRAY_DECLARATOR:
                {
                alt95=11;
                }
                break;
            case SUPER:
                {
                alt95=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // Imprinter.g:549:9: ^( DOT ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    DOT396=(CommonTree)match(input,DOT,FOLLOW_DOT_in_primaryExpression3850); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    DOT396_tree = (CommonTree)adaptor.dupNode(DOT396);

                    root_1 = (CommonTree)adaptor.becomeRoot(DOT396_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // Imprinter.g:550:13: ( primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS ) | primitiveType CLASS | VOID CLASS )
                    int alt93=3;
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
                    case COMMENT:
                    case LINE_COMMENT:
                        {
                        alt93=1;
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
                        alt93=2;
                        }
                        break;
                    case VOID:
                        {
                        alt93=3;
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
                            // Imprinter.g:550:17: primaryExpression ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_primaryExpression_in_primaryExpression3868);
                            primaryExpression397=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, primaryExpression397.getTree());
                            // Imprinter.g:551:17: ( IDENT | THIS | SUPER | innerNewExpression | CLASS )
                            int alt92=5;
                            switch ( input.LA(1) ) {
                            case IDENT:
                                {
                                alt92=1;
                                }
                                break;
                            case THIS:
                                {
                                alt92=2;
                                }
                                break;
                            case SUPER:
                                {
                                alt92=3;
                                }
                                break;
                            case CLASS_CONSTRUCTOR_CALL:
                                {
                                alt92=4;
                                }
                                break;
                            case CLASS:
                                {
                                alt92=5;
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
                                    // Imprinter.g:551:21: IDENT
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    IDENT398=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression3890); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    IDENT398_tree = (CommonTree)adaptor.dupNode(IDENT398);

                                    adaptor.addChild(root_1, IDENT398_tree);
                                    }

                                    if ( state.backtracking==0 ) {
                                    }
                                    }
                                    break;
                                case 2 :
                                    // Imprinter.g:552:21: THIS
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    THIS399=(CommonTree)match(input,THIS,FOLLOW_THIS_in_primaryExpression3912); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    THIS399_tree = (CommonTree)adaptor.dupNode(THIS399);

                                    adaptor.addChild(root_1, THIS399_tree);
                                    }

                                    if ( state.backtracking==0 ) {
                                    }
                                    }
                                    break;
                                case 3 :
                                    // Imprinter.g:553:21: SUPER
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    SUPER400=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_primaryExpression3934); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    SUPER400_tree = (CommonTree)adaptor.dupNode(SUPER400);

                                    adaptor.addChild(root_1, SUPER400_tree);
                                    }

                                    if ( state.backtracking==0 ) {
                                    }
                                    }
                                    break;
                                case 4 :
                                    // Imprinter.g:554:21: innerNewExpression
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    pushFollow(FOLLOW_innerNewExpression_in_primaryExpression3956);
                                    innerNewExpression401=innerNewExpression();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) 
                                    adaptor.addChild(root_1, innerNewExpression401.getTree());

                                    if ( state.backtracking==0 ) {
                                    }
                                    }
                                    break;
                                case 5 :
                                    // Imprinter.g:555:21: CLASS
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    CLASS402=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_primaryExpression3978); if (state.failed) return retval;
                                    if ( state.backtracking==0 ) {
                                    CLASS402_tree = (CommonTree)adaptor.dupNode(CLASS402);

                                    adaptor.addChild(root_1, CLASS402_tree);
                                    }

                                    if ( state.backtracking==0 ) {
                                    }
                                    }
                                    break;

                            }


                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;
                        case 2 :
                            // Imprinter.g:557:17: primitiveType CLASS
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_primitiveType_in_primaryExpression4014);
                            primitiveType403=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, primitiveType403.getTree());
                            _last = (CommonTree)input.LT(1);
                            CLASS404=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_primaryExpression4016); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLASS404_tree = (CommonTree)adaptor.dupNode(CLASS404);

                            adaptor.addChild(root_1, CLASS404_tree);
                            }

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;
                        case 3 :
                            // Imprinter.g:558:17: VOID CLASS
                            {
                            _last = (CommonTree)input.LT(1);
                            VOID405=(CommonTree)match(input,VOID,FOLLOW_VOID_in_primaryExpression4034); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            VOID405_tree = (CommonTree)adaptor.dupNode(VOID405);

                            adaptor.addChild(root_1, VOID405_tree);
                            }
                            _last = (CommonTree)input.LT(1);
                            CLASS406=(CommonTree)match(input,CLASS,FOLLOW_CLASS_in_primaryExpression4036); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            CLASS406_tree = (CommonTree)adaptor.dupNode(CLASS406);

                            adaptor.addChild(root_1, CLASS406_tree);
                            }

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:561:9: parenthesizedExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_parenthesizedExpression_in_primaryExpression4070);
                    parenthesizedExpression407=parenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, parenthesizedExpression407.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:562:9: IDENT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    IDENT408=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_primaryExpression4080); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENT408_tree = (CommonTree)adaptor.dupNode(IDENT408);

                    adaptor.addChild(root_0, IDENT408_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 4 :
                    // Imprinter.g:563:9: ^( METHOD_CALL primaryExpression ( genericTypeArgumentList )? arguments )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    METHOD_CALL409=(CommonTree)match(input,METHOD_CALL,FOLLOW_METHOD_CALL_in_primaryExpression4091); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    METHOD_CALL409_tree = (CommonTree)adaptor.dupNode(METHOD_CALL409);

                    root_1 = (CommonTree)adaptor.becomeRoot(METHOD_CALL409_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4093);
                    primaryExpression410=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, primaryExpression410.getTree());
                    // Imprinter.g:563:41: ( genericTypeArgumentList )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeArgumentList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeArgumentList_in_primaryExpression4095);
                            genericTypeArgumentList411=genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeArgumentList411.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arguments_in_primaryExpression4098);
                    arguments412=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arguments412.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 5 :
                    // Imprinter.g:564:9: explicitConstructorCall
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_explicitConstructorCall_in_primaryExpression4109);
                    explicitConstructorCall413=explicitConstructorCall();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, explicitConstructorCall413.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 6 :
                    // Imprinter.g:565:9: ^( ARRAY_ELEMENT_ACCESS primaryExpression expression )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    ARRAY_ELEMENT_ACCESS414=(CommonTree)match(input,ARRAY_ELEMENT_ACCESS,FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4120); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ARRAY_ELEMENT_ACCESS414_tree = (CommonTree)adaptor.dupNode(ARRAY_ELEMENT_ACCESS414);

                    root_1 = (CommonTree)adaptor.becomeRoot(ARRAY_ELEMENT_ACCESS414_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primaryExpression_in_primaryExpression4122);
                    primaryExpression415=primaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, primaryExpression415.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_expression_in_primaryExpression4124);
                    expression416=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, expression416.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 7 :
                    // Imprinter.g:566:9: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_literal_in_primaryExpression4135);
                    literal417=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, literal417.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 8 :
                    // Imprinter.g:567:9: comment
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_comment_in_primaryExpression4145);
                    comment418=comment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, comment418.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 9 :
                    // Imprinter.g:568:9: newExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_newExpression_in_primaryExpression4155);
                    newExpression419=newExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, newExpression419.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 10 :
                    // Imprinter.g:569:9: THIS
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    THIS420=(CommonTree)match(input,THIS,FOLLOW_THIS_in_primaryExpression4165); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS420_tree = (CommonTree)adaptor.dupNode(THIS420);

                    adaptor.addChild(root_0, THIS420_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 11 :
                    // Imprinter.g:570:9: arrayTypeDeclarator
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_primaryExpression4175);
                    arrayTypeDeclarator421=arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayTypeDeclarator421.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 12 :
                    // Imprinter.g:571:9: SUPER
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    SUPER422=(CommonTree)match(input,SUPER,FOLLOW_SUPER_in_primaryExpression4185); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER422_tree = (CommonTree)adaptor.dupNode(SUPER422);

                    adaptor.addChild(root_0, SUPER422_tree);
                    }

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 63, primaryExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primaryExpression"

    public static class explicitConstructorCall_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "explicitConstructorCall"
    // Imprinter.g:574:1: explicitConstructorCall : ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) );
    public final Imprinter.explicitConstructorCall_return explicitConstructorCall() throws RecognitionException {
        Imprinter.explicitConstructorCall_return retval = new Imprinter.explicitConstructorCall_return();
        retval.start = input.LT(1);
        int explicitConstructorCall_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree THIS_CONSTRUCTOR_CALL423=null;
        CommonTree SUPER_CONSTRUCTOR_CALL426=null;
        Imprinter.genericTypeArgumentList_return genericTypeArgumentList424 = null;

        Imprinter.arguments_return arguments425 = null;

        Imprinter.primaryExpression_return primaryExpression427 = null;

        Imprinter.genericTypeArgumentList_return genericTypeArgumentList428 = null;

        Imprinter.arguments_return arguments429 = null;


        CommonTree THIS_CONSTRUCTOR_CALL423_tree=null;
        CommonTree SUPER_CONSTRUCTOR_CALL426_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 64) ) { return retval; }
            // Imprinter.g:575:5: ( ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments ) | ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==THIS_CONSTRUCTOR_CALL) ) {
                alt99=1;
            }
            else if ( (LA99_0==SUPER_CONSTRUCTOR_CALL) ) {
                alt99=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // Imprinter.g:575:9: ^( THIS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? arguments )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    THIS_CONSTRUCTOR_CALL423=(CommonTree)match(input,THIS_CONSTRUCTOR_CALL,FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4209); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    THIS_CONSTRUCTOR_CALL423_tree = (CommonTree)adaptor.dupNode(THIS_CONSTRUCTOR_CALL423);

                    root_1 = (CommonTree)adaptor.becomeRoot(THIS_CONSTRUCTOR_CALL423_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // Imprinter.g:575:33: ( genericTypeArgumentList )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeArgumentList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4211);
                            genericTypeArgumentList424=genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeArgumentList424.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4214);
                    arguments425=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arguments425.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:576:9: ^( SUPER_CONSTRUCTOR_CALL ( primaryExpression )? ( genericTypeArgumentList )? arguments )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    SUPER_CONSTRUCTOR_CALL426=(CommonTree)match(input,SUPER_CONSTRUCTOR_CALL,FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4226); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    SUPER_CONSTRUCTOR_CALL426_tree = (CommonTree)adaptor.dupNode(SUPER_CONSTRUCTOR_CALL426);

                    root_1 = (CommonTree)adaptor.becomeRoot(SUPER_CONSTRUCTOR_CALL426_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // Imprinter.g:576:34: ( primaryExpression )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==DOT||LA97_0==FALSE||LA97_0==NULL||LA97_0==SUPER||LA97_0==THIS||LA97_0==TRUE||LA97_0==ARRAY_DECLARATOR||LA97_0==ARRAY_ELEMENT_ACCESS||LA97_0==CLASS_CONSTRUCTOR_CALL||LA97_0==METHOD_CALL||LA97_0==PARENTESIZED_EXPR||(LA97_0>=STATIC_ARRAY_CREATOR && LA97_0<=SUPER_CONSTRUCTOR_CALL)||LA97_0==THIS_CONSTRUCTOR_CALL||(LA97_0>=IDENT && LA97_0<=LINE_COMMENT)) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // Imprinter.g:0:0: primaryExpression
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_primaryExpression_in_explicitConstructorCall4228);
                            primaryExpression427=primaryExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, primaryExpression427.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    // Imprinter.g:576:53: ( genericTypeArgumentList )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeArgumentList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4231);
                            genericTypeArgumentList428=genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeArgumentList428.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arguments_in_explicitConstructorCall4234);
                    arguments429=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arguments429.getTree());

                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 64, explicitConstructorCall_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "explicitConstructorCall"

    public static class arrayTypeDeclarator_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayTypeDeclarator"
    // Imprinter.g:579:1: arrayTypeDeclarator : ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) ;
    public final Imprinter.arrayTypeDeclarator_return arrayTypeDeclarator() throws RecognitionException {
        Imprinter.arrayTypeDeclarator_return retval = new Imprinter.arrayTypeDeclarator_return();
        retval.start = input.LT(1);
        int arrayTypeDeclarator_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARRAY_DECLARATOR430=null;
        Imprinter.arrayTypeDeclarator_return arrayTypeDeclarator431 = null;

        Imprinter.qualifiedIdentifier_return qualifiedIdentifier432 = null;

        Imprinter.primitiveType_return primitiveType433 = null;


        CommonTree ARRAY_DECLARATOR430_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 65) ) { return retval; }
            // Imprinter.g:580:5: ( ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) ) )
            // Imprinter.g:580:9: ^( ARRAY_DECLARATOR ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType ) )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ARRAY_DECLARATOR430=(CommonTree)match(input,ARRAY_DECLARATOR,FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4255); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARRAY_DECLARATOR430_tree = (CommonTree)adaptor.dupNode(ARRAY_DECLARATOR430);

            root_1 = (CommonTree)adaptor.becomeRoot(ARRAY_DECLARATOR430_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:580:28: ( arrayTypeDeclarator | qualifiedIdentifier | primitiveType )
            int alt100=3;
            switch ( input.LA(1) ) {
            case ARRAY_DECLARATOR:
                {
                alt100=1;
                }
                break;
            case DOT:
            case IDENT:
                {
                alt100=2;
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
                alt100=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // Imprinter.g:580:29: arrayTypeDeclarator
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4258);
                    arrayTypeDeclarator431=arrayTypeDeclarator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arrayTypeDeclarator431.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:580:51: qualifiedIdentifier
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4262);
                    qualifiedIdentifier432=qualifiedIdentifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, qualifiedIdentifier432.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 3 :
                    // Imprinter.g:580:73: primitiveType
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_primitiveType_in_arrayTypeDeclarator4266);
                    primitiveType433=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, primitiveType433.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 65, arrayTypeDeclarator_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arrayTypeDeclarator"

    public static class newExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newExpression"
    // Imprinter.g:583:1: newExpression : ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) );
    public final Imprinter.newExpression_return newExpression() throws RecognitionException {
        Imprinter.newExpression_return retval = new Imprinter.newExpression_return();
        retval.start = input.LT(1);
        int newExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree STATIC_ARRAY_CREATOR434=null;
        CommonTree CLASS_CONSTRUCTOR_CALL440=null;
        Imprinter.primitiveType_return primitiveType435 = null;

        Imprinter.newArrayConstruction_return newArrayConstruction436 = null;

        Imprinter.genericTypeArgumentList_return genericTypeArgumentList437 = null;

        Imprinter.qualifiedTypeIdent_return qualifiedTypeIdent438 = null;

        Imprinter.newArrayConstruction_return newArrayConstruction439 = null;

        Imprinter.genericTypeArgumentList_return genericTypeArgumentList441 = null;

        Imprinter.qualifiedTypeIdent_return qualifiedTypeIdent442 = null;

        Imprinter.arguments_return arguments443 = null;

        Imprinter.classTopLevelScope_return classTopLevelScope444 = null;


        CommonTree STATIC_ARRAY_CREATOR434_tree=null;
        CommonTree CLASS_CONSTRUCTOR_CALL440_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 66) ) { return retval; }
            // Imprinter.g:584:5: ( ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) ) | ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==STATIC_ARRAY_CREATOR) ) {
                alt105=1;
            }
            else if ( (LA105_0==CLASS_CONSTRUCTOR_CALL) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // Imprinter.g:584:9: ^( STATIC_ARRAY_CREATOR ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction ) )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    STATIC_ARRAY_CREATOR434=(CommonTree)match(input,STATIC_ARRAY_CREATOR,FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4290); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    STATIC_ARRAY_CREATOR434_tree = (CommonTree)adaptor.dupNode(STATIC_ARRAY_CREATOR434);

                    root_1 = (CommonTree)adaptor.becomeRoot(STATIC_ARRAY_CREATOR434_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // Imprinter.g:585:13: ( primitiveType newArrayConstruction | ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction )
                    int alt102=2;
                    int LA102_0 = input.LA(1);

                    if ( (LA102_0==BOOLEAN||LA102_0==BYTE||LA102_0==CHAR||LA102_0==DOUBLE||LA102_0==FLOAT||(LA102_0>=INT && LA102_0<=LONG)||LA102_0==SHORT) ) {
                        alt102=1;
                    }
                    else if ( (LA102_0==GENERIC_TYPE_ARG_LIST||LA102_0==QUALIFIED_TYPE_IDENT) ) {
                        alt102=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 102, 0, input);

                        throw nvae;
                    }
                    switch (alt102) {
                        case 1 :
                            // Imprinter.g:585:17: primitiveType newArrayConstruction
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_primitiveType_in_newExpression4308);
                            primitiveType435=primitiveType();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, primitiveType435.getTree());
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4310);
                            newArrayConstruction436=newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, newArrayConstruction436.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;
                        case 2 :
                            // Imprinter.g:586:17: ( genericTypeArgumentList )? qualifiedTypeIdent newArrayConstruction
                            {
                            // Imprinter.g:586:17: ( genericTypeArgumentList )?
                            int alt101=2;
                            int LA101_0 = input.LA(1);

                            if ( (LA101_0==GENERIC_TYPE_ARG_LIST) ) {
                                alt101=1;
                            }
                            switch (alt101) {
                                case 1 :
                                    // Imprinter.g:0:0: genericTypeArgumentList
                                    {
                                    _last = (CommonTree)input.LT(1);
                                    pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4328);
                                    genericTypeArgumentList437=genericTypeArgumentList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) 
                                    adaptor.addChild(root_1, genericTypeArgumentList437.getTree());

                                    if ( state.backtracking==0 ) {
                                    }
                                    }
                                    break;

                            }

                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4331);
                            qualifiedTypeIdent438=qualifiedTypeIdent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, qualifiedTypeIdent438.getTree());
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_newArrayConstruction_in_newExpression4333);
                            newArrayConstruction439=newArrayConstruction();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, newArrayConstruction439.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:589:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? qualifiedTypeIdent arguments ( classTopLevelScope )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
                    CLASS_CONSTRUCTOR_CALL440=(CommonTree)match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4368); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CLASS_CONSTRUCTOR_CALL440_tree = (CommonTree)adaptor.dupNode(CLASS_CONSTRUCTOR_CALL440);

                    root_1 = (CommonTree)adaptor.becomeRoot(CLASS_CONSTRUCTOR_CALL440_tree, root_1);
                    }


                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    // Imprinter.g:589:34: ( genericTypeArgumentList )?
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==GENERIC_TYPE_ARG_LIST) ) {
                        alt103=1;
                    }
                    switch (alt103) {
                        case 1 :
                            // Imprinter.g:0:0: genericTypeArgumentList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_genericTypeArgumentList_in_newExpression4370);
                            genericTypeArgumentList441=genericTypeArgumentList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, genericTypeArgumentList441.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_qualifiedTypeIdent_in_newExpression4373);
                    qualifiedTypeIdent442=qualifiedTypeIdent();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, qualifiedTypeIdent442.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arguments_in_newExpression4375);
                    arguments443=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, arguments443.getTree());
                    // Imprinter.g:589:88: ( classTopLevelScope )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==CLASS_TOP_LEVEL_SCOPE) ) {
                        alt104=1;
                    }
                    switch (alt104) {
                        case 1 :
                            // Imprinter.g:0:0: classTopLevelScope
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_classTopLevelScope_in_newExpression4377);
                            classTopLevelScope444=classTopLevelScope();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_1, classTopLevelScope444.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 66, newExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newExpression"

    public static class innerNewExpression_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "innerNewExpression"
    // Imprinter.g:592:1: innerNewExpression : ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) ;
    public final Imprinter.innerNewExpression_return innerNewExpression() throws RecognitionException {
        Imprinter.innerNewExpression_return retval = new Imprinter.innerNewExpression_return();
        retval.start = input.LT(1);
        int innerNewExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree CLASS_CONSTRUCTOR_CALL445=null;
        CommonTree IDENT447=null;
        Imprinter.genericTypeArgumentList_return genericTypeArgumentList446 = null;

        Imprinter.arguments_return arguments448 = null;

        Imprinter.classTopLevelScope_return classTopLevelScope449 = null;


        CommonTree CLASS_CONSTRUCTOR_CALL445_tree=null;
        CommonTree IDENT447_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 67) ) { return retval; }
            // Imprinter.g:593:5: ( ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? ) )
            // Imprinter.g:593:9: ^( CLASS_CONSTRUCTOR_CALL ( genericTypeArgumentList )? IDENT arguments ( classTopLevelScope )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            CLASS_CONSTRUCTOR_CALL445=(CommonTree)match(input,CLASS_CONSTRUCTOR_CALL,FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4400); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            CLASS_CONSTRUCTOR_CALL445_tree = (CommonTree)adaptor.dupNode(CLASS_CONSTRUCTOR_CALL445);

            root_1 = (CommonTree)adaptor.becomeRoot(CLASS_CONSTRUCTOR_CALL445_tree, root_1);
            }


            match(input, Token.DOWN, null); if (state.failed) return retval;
            // Imprinter.g:593:34: ( genericTypeArgumentList )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==GENERIC_TYPE_ARG_LIST) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // Imprinter.g:0:0: genericTypeArgumentList
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_genericTypeArgumentList_in_innerNewExpression4402);
                    genericTypeArgumentList446=genericTypeArgumentList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, genericTypeArgumentList446.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }

            _last = (CommonTree)input.LT(1);
            IDENT447=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_innerNewExpression4405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENT447_tree = (CommonTree)adaptor.dupNode(IDENT447);

            adaptor.addChild(root_1, IDENT447_tree);
            }
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_arguments_in_innerNewExpression4407);
            arguments448=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) 
            adaptor.addChild(root_1, arguments448.getTree());
            // Imprinter.g:593:75: ( classTopLevelScope )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==CLASS_TOP_LEVEL_SCOPE) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // Imprinter.g:0:0: classTopLevelScope
                    {
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_classTopLevelScope_in_innerNewExpression4409);
                    classTopLevelScope449=classTopLevelScope();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_1, classTopLevelScope449.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 67, innerNewExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "innerNewExpression"

    public static class newArrayConstruction_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newArrayConstruction"
    // Imprinter.g:596:1: newArrayConstruction : ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? );
    public final Imprinter.newArrayConstruction_return newArrayConstruction() throws RecognitionException {
        Imprinter.newArrayConstruction_return retval = new Imprinter.newArrayConstruction_return();
        retval.start = input.LT(1);
        int newArrayConstruction_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        Imprinter.arrayDeclaratorList_return arrayDeclaratorList450 = null;

        Imprinter.arrayInitializer_return arrayInitializer451 = null;

        Imprinter.expression_return expression452 = null;

        Imprinter.arrayDeclaratorList_return arrayDeclaratorList453 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 68) ) { return retval; }
            // Imprinter.g:597:5: ( arrayDeclaratorList arrayInitializer | ( expression )+ ( arrayDeclaratorList )? )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==ARRAY_DECLARATOR_LIST) ) {
                alt110=1;
            }
            else if ( (LA110_0==EXPR) ) {
                alt110=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // Imprinter.g:597:9: arrayDeclaratorList arrayInitializer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4434);
                    arrayDeclaratorList450=arrayDeclaratorList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayDeclaratorList450.getTree());
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_arrayInitializer_in_newArrayConstruction4436);
                    arrayInitializer451=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) 
                    adaptor.addChild(root_0, arrayInitializer451.getTree());

                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;
                case 2 :
                    // Imprinter.g:598:9: ( expression )+ ( arrayDeclaratorList )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // Imprinter.g:598:9: ( expression )+
                    int cnt108=0;
                    loop108:
                    do {
                        int alt108=2;
                        int LA108_0 = input.LA(1);

                        if ( (LA108_0==EXPR) ) {
                            alt108=1;
                        }


                        switch (alt108) {
                    	case 1 :
                    	    // Imprinter.g:0:0: expression
                    	    {
                    	    _last = (CommonTree)input.LT(1);
                    	    pushFollow(FOLLOW_expression_in_newArrayConstruction4446);
                    	    expression452=expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) 
                    	    adaptor.addChild(root_0, expression452.getTree());

                    	    if ( state.backtracking==0 ) {
                    	    }
                    	    }
                    	    break;

                    	default :
                    	    if ( cnt108 >= 1 ) break loop108;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(108, input);
                                throw eee;
                        }
                        cnt108++;
                    } while (true);

                    // Imprinter.g:598:21: ( arrayDeclaratorList )?
                    int alt109=2;
                    int LA109_0 = input.LA(1);

                    if ( (LA109_0==ARRAY_DECLARATOR_LIST) ) {
                        alt109=1;
                    }
                    switch (alt109) {
                        case 1 :
                            // Imprinter.g:0:0: arrayDeclaratorList
                            {
                            _last = (CommonTree)input.LT(1);
                            pushFollow(FOLLOW_arrayDeclaratorList_in_newArrayConstruction4449);
                            arrayDeclaratorList453=arrayDeclaratorList();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) 
                            adaptor.addChild(root_0, arrayDeclaratorList453.getTree());

                            if ( state.backtracking==0 ) {
                            }
                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    }
                    }
                    break;

            }
            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 68, newArrayConstruction_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "newArrayConstruction"

    public static class arguments_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // Imprinter.g:601:1: arguments : ^( ARGUMENT_LIST ( expression )* ) ;
    public final Imprinter.arguments_return arguments() throws RecognitionException {
        Imprinter.arguments_return retval = new Imprinter.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree ARGUMENT_LIST454=null;
        Imprinter.expression_return expression455 = null;


        CommonTree ARGUMENT_LIST454_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 69) ) { return retval; }
            // Imprinter.g:602:5: ( ^( ARGUMENT_LIST ( expression )* ) )
            // Imprinter.g:602:9: ^( ARGUMENT_LIST ( expression )* )
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();_last = (CommonTree)input.LT(1);
            ARGUMENT_LIST454=(CommonTree)match(input,ARGUMENT_LIST,FOLLOW_ARGUMENT_LIST_in_arguments4470); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ARGUMENT_LIST454_tree = (CommonTree)adaptor.dupNode(ARGUMENT_LIST454);

            root_1 = (CommonTree)adaptor.becomeRoot(ARGUMENT_LIST454_tree, root_1);
            }


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // Imprinter.g:602:25: ( expression )*
                loop111:
                do {
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==EXPR) ) {
                        alt111=1;
                    }


                    switch (alt111) {
                	case 1 :
                	    // Imprinter.g:0:0: expression
                	    {
                	    _last = (CommonTree)input.LT(1);
                	    pushFollow(FOLLOW_expression_in_arguments4472);
                	    expression455=expression();

                	    state._fsp--;
                	    if (state.failed) return retval;
                	    if ( state.backtracking==0 ) 
                	    adaptor.addChild(root_1, expression455.getTree());

                	    if ( state.backtracking==0 ) {
                	    }
                	    }
                	    break;

                	default :
                	    break loop111;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return retval;
            }adaptor.addChild(root_0, root_1);_last = _save_last_1;
            }


            if ( state.backtracking==0 ) {
            }
            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 69, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class literal_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // Imprinter.g:605:1: literal : ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL );
    public final Imprinter.literal_return literal() throws RecognitionException {
        Imprinter.literal_return retval = new Imprinter.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set456=null;

        CommonTree set456_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 70) ) { return retval; }
            // Imprinter.g:606:5: ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL | FLOATING_POINT_LITERAL | CHARACTER_LITERAL | STRING_LITERAL | TRUE | FALSE | NULL )
            // Imprinter.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set456=(CommonTree)input.LT(1);
            if ( input.LA(1)==FALSE||input.LA(1)==NULL||input.LA(1)==TRUE||(input.LA(1)>=HEX_LITERAL && input.LA(1)<=STRING_LITERAL) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set456_tree = (CommonTree)adaptor.dupNode(set456);

                adaptor.addChild(root_0, set456_tree);
                }
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
            } 

            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 70, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class comment_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "comment"
    // Imprinter.g:617:1: comment : ( COMMENT | LINE_COMMENT );
    public final Imprinter.comment_return comment() throws RecognitionException {
        Imprinter.comment_return retval = new Imprinter.comment_return();
        retval.start = input.LT(1);
        int comment_StartIndex = input.index();
        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree set457=null;

        CommonTree set457_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 71) ) { return retval; }
            // Imprinter.g:618:5: ( COMMENT | LINE_COMMENT )
            // Imprinter.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            _last = (CommonTree)input.LT(1);
            set457=(CommonTree)input.LT(1);
            if ( (input.LA(1)>=COMMENT && input.LA(1)<=LINE_COMMENT) ) {
                input.consume();

                if ( state.backtracking==0 ) {
                set457_tree = (CommonTree)adaptor.dupNode(set457);

                adaptor.addChild(root_0, set457_tree);
                }
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            if ( state.backtracking==0 ) {
            } 

            }

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( state.backtracking>0 ) { memoize(input, 71, comment_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "comment"

    // $ANTLR start synpred125_Imprinter
    public final void synpred125_Imprinter_fragment() throws RecognitionException {   
        // Imprinter.g:469:35: ( switchCaseLabel )
        // Imprinter.g:469:35: switchCaseLabel
        {
        pushFollow(FOLLOW_switchCaseLabel_in_synpred125_Imprinter2926);
        switchCaseLabel();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred125_Imprinter

    // $ANTLR start synpred132_Imprinter
    public final void synpred132_Imprinter_fragment() throws RecognitionException {   
        // Imprinter.g:481:137: ( ( expression )* )
        // Imprinter.g:481:137: ( expression )*
        {
        // Imprinter.g:481:137: ( expression )*
        loop142:
        do {
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==EXPR) ) {
                alt142=1;
            }


            switch (alt142) {
        	case 1 :
        	    // Imprinter.g:0:0: expression
        	    {
        	    pushFollow(FOLLOW_expression_in_synpred132_Imprinter3031);
        	    expression();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop142;
            }
        } while (true);


        }
    }
    // $ANTLR end synpred132_Imprinter

    // Delegated rules

    public final boolean synpred132_Imprinter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_Imprinter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred125_Imprinter() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred125_Imprinter_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_JAVA_SOURCE_in_targetSource109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_targetSource111 = new BitSet(new long[]{0x2000000000000088L,0x0000000000106008L});
    public static final BitSet FOLLOW_packageDeclaration_in_targetSource127 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_importDeclaration_in_targetSource147 = new BitSet(new long[]{0x2000000000000088L,0x0000000000006008L});
    public static final BitSet FOLLOW_typeDeclaration_in_targetSource168 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L});
    public static final BitSet FOLLOW_PACKAGE_in_packageDeclaration220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_packageDeclaration224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IMPORT_in_importDeclaration268 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STATIC_in_importDeclaration270 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_importDeclaration273 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_DOTSTAR_in_importDeclaration275 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_typeDeclaration316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration320 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration322 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration325 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration328 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_typeDeclaration331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_in_typeDeclaration351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_typeDeclaration357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_extendsClause_in_typeDeclaration360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000C01L});
    public static final BitSet FOLLOW_interfaceTopLevelScope_in_typeDeclaration363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUM_in_typeDeclaration375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration379 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_implementsClause_in_typeDeclaration381 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_enumTopLevelScope_in_typeDeclaration384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AT_in_typeDeclaration396 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_typeDeclaration398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeDeclaration400 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_annotationTopLevelScope_in_typeDeclaration402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_CLAUSE_in_extendsClause439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_extendsClause441 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_IMPLEMENTS_CLAUSE_in_implementsClause470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_implementsClause472 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_GENERIC_TYPE_PARAM_LIST_in_genericTypeParameterList502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeParameter_in_genericTypeParameterList504 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_genericTypeParameter526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_in_genericTypeParameter528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_BOUND_LIST_in_bound558 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_bound560 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_ENUM_TOP_LEVEL_SCOPE_in_enumTopLevelScope582 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumConstant_in_enumTopLevelScope584 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000001000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumTopLevelScope587 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_enumConstant613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationList_in_enumConstant615 = new BitSet(new long[]{0x0000000000000008L,0x0801000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_arguments_in_enumConstant617 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_enumConstant620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_TOP_LEVEL_SCOPE_in_classTopLevelScope666 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_classScopeDeclarations_in_classTopLevelScope671 = new BitSet(new long[]{0x2000000000000088L,0x1600000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_CLASS_INSTANCE_INITIALIZER_in_classScopeDeclarations716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations718 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_STATIC_INITIALIZER_in_classScopeDeclarations730 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_classScopeDeclarations744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations746 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations748 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations755 = new BitSet(new long[]{0x0000000000000008L,0x0024000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_classScopeDeclarations757 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations760 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_classScopeDeclarations786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_classScopeDeclarations793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations795 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations797 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations800 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_classScopeDeclarations827 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations829 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_classScopeDeclarations831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_classScopeDeclarations833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTOR_DECL_in_classScopeDeclarations855 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_classScopeDeclarations857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000420L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_classScopeDeclarations859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_classScopeDeclarations862 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_classScopeDeclarations864 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_classScopeDeclarations867 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_classScopeDeclarations878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTERFACE_TOP_LEVEL_SCOPE_in_interfaceTopLevelScope902 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interfaceScopeDeclarations_in_interfaceTopLevelScope904 = new BitSet(new long[]{0x2000000000000088L,0x0000000000002008L,0x0000000900000100L});
    public static final BitSet FOLLOW_FUNCTION_METHOD_DECL_in_interfaceScopeDeclarations930 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations932 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations934 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations941 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_interfaceScopeDeclarations943 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations946 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_METHOD_DECL_in_interfaceScopeDeclarations959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000400L});
    public static final BitSet FOLLOW_genericTypeParameterList_in_interfaceScopeDeclarations963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_interfaceScopeDeclarations966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_formalParameterList_in_interfaceScopeDeclarations968 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_throwsClause_in_interfaceScopeDeclarations970 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_interfaceScopeDeclarations1061 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_interfaceScopeDeclarations1063 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_interfaceScopeDeclarations1065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_interfaceScopeDeclarations1067 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_interfaceScopeDeclarations1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_LIST_in_variableDeclaratorList1106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclarator_in_variableDeclaratorList1111 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_VAR_DECLARATOR_in_variableDeclarator1139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_variableDeclarator1141 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_variableInitializer_in_variableDeclarator1143 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_variableDeclaratorId1182 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_variableDeclaratorId1186 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACK_in_arrayDeclarator1236 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_RBRACK_in_arrayDeclarator1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_LIST_in_arrayDeclaratorList1258 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayDeclaratorList1260 = new BitSet(new long[]{0x0000000000000008L,0x0002000000000000L});
    public static final BitSet FOLLOW_ARRAY_INITIALIZER_in_arrayInitializer1288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer1290 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_THROWS_CLAUSE_in_throwsClause1312 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_throwsClause1314 = new BitSet(new long[]{0x0000000000008008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_MODIFIER_LIST_in_modifierList1336 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifier_in_modifierList1338 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_PUBLIC_in_modifier1359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROTECTED_in_modifier1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRIVATE_in_modifier1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STATIC_in_modifier1389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ABSTRACT_in_modifier1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NATIVE_in_modifier1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_modifier1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRANSIENT_in_modifier1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOLATILE_in_modifier1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRICTFP_in_modifier1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localModifier_in_modifier1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOCAL_MODIFIER_LIST_in_localModifierList1479 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifier_in_localModifierList1481 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_FINAL_in_localModifier1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_annotation_in_localModifier1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type1532 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_type1535 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_type1539 = new BitSet(new long[]{0x0000000000000008L,0x0004000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_type1542 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_TYPE_IDENT_in_qualifiedTypeIdent1564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typeIdent_in_qualifiedTypeIdent1566 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_typeIdent1589 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_typeIdent1591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERIC_TYPE_ARG_LIST_in_genericTypeArgumentList1702 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgument_in_genericTypeArgumentList1704 = new BitSet(new long[]{0x0000010000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_genericTypeArgument1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUESTION_in_genericTypeArgument1740 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericWildcardBoundType_in_genericTypeArgument1742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXTENDS_in_genericWildcardBoundType1882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1884 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_genericWildcardBoundType1896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_genericWildcardBoundType1898 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_LIST_in_formalParameterList1926 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_formalParameterList1929 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_formalParameterVarargDecl_in_formalParameterList1935 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_STD_DECL_in_formalParameterStandardDecl1970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterStandardDecl1972 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterStandardDecl1974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterStandardDecl1976 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAM_VARARG_DECL_in_formalParameterVarargDecl2019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_formalParameterVarargDecl2021 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_formalParameterVarargDecl2023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_variableDeclaratorId_in_formalParameterVarargDecl2025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_qualifiedIdentifier2075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_qualifiedIdentifier2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_qualifiedIdentifier2081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_LIST_in_annotationList2110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotation_in_annotationList2112 = new BitSet(new long[]{0x0020000000000088L,0x000000444CE20040L});
    public static final BitSet FOLLOW_AT_in_annotation2134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_annotation2136 = new BitSet(new long[]{0x0000000000000008L,0x0000020000000000L});
    public static final BitSet FOLLOW_annotationInit_in_annotation2138 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_BLOCK_in_annotationInit2164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializers_in_annotationInit2166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_KEY_LIST_in_annotationInitializers2187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationInitializer_in_annotationInitializers2189 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_DEFAULT_KEY_in_annotationInitializers2202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializers2204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IDENT_in_annotationInitializer2229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationInitializer2231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANNOTATION_INIT_ARRAY_ELEMENT_in_annotationElementValue2256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationElementValue2258 = new BitSet(new long[]{0x0020000000000088L,0x401001444CE20040L});
    public static final BitSet FOLLOW_annotation_in_annotationElementValue2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_annotationElementValue2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANNOTATION_TOP_LEVEL_SCOPE_in_annotationTopLevelScope2304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationScopeDeclarations_in_annotationTopLevelScope2306 = new BitSet(new long[]{0x2000000000000088L,0x0000200000002008L,0x0000000100000000L});
    public static final BitSet FOLLOW_ANNOTATION_METHOD_DECL_in_annotationScopeDeclarations2332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2334 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_annotationScopeDeclarations2338 = new BitSet(new long[]{0x8000000000000008L});
    public static final BitSet FOLLOW_annotationDefaultValue_in_annotationScopeDeclarations2340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_annotationScopeDeclarations2353 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_modifierList_in_annotationScopeDeclarations2355 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_annotationScopeDeclarations2357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_annotationScopeDeclarations2359 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_typeDeclaration_in_annotationScopeDeclarations2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_annotationDefaultValue2394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_annotationElementValue_in_annotationDefaultValue2396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_SCOPE_in_block2420 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_block2425 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_blockStatement2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeDeclaration_in_blockStatement2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_statement_in_blockStatement2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_DECLARATION_in_localVariableDeclaration2533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_localVariableDeclaration2535 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_localVariableDeclaration2537 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_variableDeclaratorList_in_localVariableDeclaration2539 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_statement2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ASSERT_in_statement2593 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2595 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2597 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_in_statement2610 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2612 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2614 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2616 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_in_statement2629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_forInit_in_statement2631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_forCondition_in_statement2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_forUpdater_in_statement2635 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_EACH_in_statement2649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localModifierList_in_statement2651 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_statement2653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_statement2655 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_statement2657 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2659 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHILE_in_statement2672 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2674 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DO_in_statement2688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_statement_in_statement2690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRY_in_statement2704 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_statement2706 = new BitSet(new long[]{0x0000000000000008L,0x00A0000000000000L});
    public static final BitSet FOLLOW_catches_in_statement2708 = new BitSet(new long[]{0x0000000000000008L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2711 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_in_statement2726 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_switchBlockLabels_in_statement2730 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNCHRONIZED_in_statement2742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_statement2744 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_statement2746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_in_statement2758 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2760 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THROW_in_statement2773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_statement2775 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BREAK_in_statement2787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2789 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTINUE_in_statement2802 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2804 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABELED_STATEMENT_in_statement2817 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_statement2819 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_statement_in_statement2821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_statement2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_statement2842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CATCH_CLAUSE_LIST_in_catches2871 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_catchClause_in_catches2873 = new BitSet(new long[]{0x0800000000000008L});
    public static final BitSet FOLLOW_CATCH_in_catchClause2899 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formalParameterStandardDecl_in_catchClause2901 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_block_in_catchClause2903 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SWITCH_BLOCK_LABEL_LIST_in_switchBlockLabels2924 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2926 = new BitSet(new long[]{0x8400000000000008L});
    public static final BitSet FOLLOW_switchDefaultLabel_in_switchBlockLabels2929 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_switchCaseLabel_in_switchBlockLabels2932 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_CASE_in_switchCaseLabel2962 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_switchCaseLabel2964 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_blockStatement_in_switchCaseLabel2966 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_DEFAULT_in_switchDefaultLabel2992 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_blockStatement_in_switchDefaultLabel2994 = new BitSet(new long[]{0x6140100000000088L,0x4030009161002609L,0x0000000100002004L});
    public static final BitSet FOLLOW_FOR_INIT_in_forInit3020 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_forInit3025 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_expression_in_forInit3031 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_FOR_CONDITION_in_forCondition3059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forCondition3061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FOR_UPDATE_in_forUpdater3087 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_forUpdater3089 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_PARENTESIZED_EXPR_in_parenthesizedExpression3117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parenthesizedExpression3119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPR_in_expression3144 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expression3146 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGN_in_expr3167 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3169 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3171 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_ASSIGN_in_expr3183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3185 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_ASSIGN_in_expr3199 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3201 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_ASSIGN_in_expr3215 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3217 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_ASSIGN_in_expr3231 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3233 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3235 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_ASSIGN_in_expr3247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3249 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3251 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_ASSIGN_in_expr3263 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3265 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3267 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_ASSIGN_in_expr3279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3281 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3283 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_ASSIGN_in_expr3295 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3297 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3299 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_ASSIGN_in_expr3311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3313 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3315 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_ASSIGN_in_expr3327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3329 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_ASSIGN_in_expr3343 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3345 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3347 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUESTION_in_expr3359 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3361 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3363 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3365 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_OR_in_expr3377 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3379 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3381 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_AND_in_expr3393 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3395 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_expr3409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3411 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3413 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_expr3425 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3427 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3429 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_expr3441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3443 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3445 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_expr3457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3459 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3461 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_expr3473 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3475 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCEOF_in_expr3489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3491 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_type_in_expr3493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_OR_EQUAL_in_expr3505 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3507 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_OR_EQUAL_in_expr3521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3523 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BIT_SHIFT_RIGHT_in_expr3537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3539 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3541 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_RIGHT_in_expr3553 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3555 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3557 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GREATER_THAN_in_expr3569 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3571 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3573 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SHIFT_LEFT_in_expr3585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3587 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3589 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LESS_THAN_in_expr3601 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3603 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3605 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PLUS_in_expr3617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3619 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr3633 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3635 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3637 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STAR_in_expr3649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3651 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3653 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr3665 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3667 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3669 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_expr3681 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3683 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3685 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_PLUS_in_expr3697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3699 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_MINUS_in_expr3711 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3713 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_INC_in_expr3725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRE_DEC_in_expr3739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_INC_in_expr3753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POST_DEC_in_expr3767 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3769 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_expr3781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_NOT_in_expr3795 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr3797 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CAST_EXPR_in_expr3809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_in_expr3811 = new BitSet(new long[]{0x001FE1FFDF1CE370L,0x014A000890081020L,0x00001FF0CB7D0000L});
    public static final BitSet FOLLOW_expr_in_expr3813 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primaryExpression_in_expr3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_primaryExpression3850 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression3868 = new BitSet(new long[]{0x2000000000000000L,0x0100000090000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression3890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression3912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression3934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_innerNewExpression_in_primaryExpression3956 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression3978 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_primaryExpression4014 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression4016 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VOID_in_primaryExpression4034 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_CLASS_in_primaryExpression4036 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_parenthesizedExpression_in_primaryExpression4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_primaryExpression4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_CALL_in_primaryExpression4091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4093 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_primaryExpression4095 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_primaryExpression4098 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_explicitConstructorCall_in_primaryExpression4109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARRAY_ELEMENT_ACCESS_in_primaryExpression4120 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_primaryExpression4122 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L});
    public static final BitSet FOLLOW_expression_in_primaryExpression4124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_literal_in_primaryExpression4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comment_in_primaryExpression4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newExpression_in_primaryExpression4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_in_primaryExpression4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_primaryExpression4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUPER_in_primaryExpression4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THIS_CONSTRUCTOR_CALL_in_explicitConstructorCall4209 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4211 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4214 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPER_CONSTRUCTOR_CALL_in_explicitConstructorCall4226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primaryExpression_in_explicitConstructorCall4228 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_explicitConstructorCall4231 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_explicitConstructorCall4234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ARRAY_DECLARATOR_in_arrayTypeDeclarator4255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_arrayTypeDeclarator_in_arrayTypeDeclarator4258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiedIdentifier_in_arrayTypeDeclarator4262 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primitiveType_in_arrayTypeDeclarator4266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STATIC_ARRAY_CREATOR_in_newExpression4290 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_primitiveType_in_newExpression4308 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4310 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4331 = new BitSet(new long[]{0x0000000000000000L,0x4014000000000000L});
    public static final BitSet FOLLOW_newArrayConstruction_in_newExpression4333 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_newExpression4368 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_newExpression4370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_qualifiedTypeIdent_in_newExpression4373 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_newExpression4375 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_newExpression4377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CLASS_CONSTRUCTOR_CALL_in_innerNewExpression4400 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_genericTypeArgumentList_in_innerNewExpression4402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_IDENT_in_innerNewExpression4405 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_arguments_in_innerNewExpression4407 = new BitSet(new long[]{0x0000000000000008L,0x0800000000000000L,0x0000000000001401L});
    public static final BitSet FOLLOW_classTopLevelScope_in_innerNewExpression4409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4434 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_arrayInitializer_in_newArrayConstruction4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_newArrayConstruction4446 = new BitSet(new long[]{0x0000000000000002L,0x4014000000000000L});
    public static final BitSet FOLLOW_arrayDeclaratorList_in_newArrayConstruction4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARGUMENT_LIST_in_arguments4470 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_arguments4472 = new BitSet(new long[]{0x0000000000000008L,0x4010000000000000L});
    public static final BitSet FOLLOW_set_in_literal0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comment0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchCaseLabel_in_synpred125_Imprinter2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_synpred132_Imprinter3031 = new BitSet(new long[]{0x0000000000000002L,0x4010000000000000L});

}