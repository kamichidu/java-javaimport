// Generated from jp\michikusa\chitose\javaimport\generate\parser\Java8.g4 by ANTLR 4.3
package jp.michikusa.chitose.javaimport.generate.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Java8Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ABSTRACT=2, ASSERT=3, BOOLEAN=4, BREAK=5, BYTE=6, CASE=7, CATCH=8, 
		CHAR=9, CLASS=10, CONST=11, CONTINUE=12, DEFAULT=13, DO=14, DOUBLE=15, 
		ELSE=16, ENUM=17, EXTENDS=18, FINAL=19, FINALLY=20, FLOAT=21, FOR=22, 
		IF=23, GOTO=24, IMPLEMENTS=25, IMPORT=26, INSTANCEOF=27, INT=28, INTERFACE=29, 
		LONG=30, NATIVE=31, NEW=32, PACKAGE=33, PRIVATE=34, PROTECTED=35, PUBLIC=36, 
		RETURN=37, SHORT=38, STATIC=39, STRICTFP=40, SUPER=41, SWITCH=42, SYNCHRONIZED=43, 
		THIS=44, THROW=45, THROWS=46, TRANSIENT=47, TRY=48, VOID=49, VOLATILE=50, 
		WHILE=51, IntegerLiteral=52, FloatingPointLiteral=53, BooleanLiteral=54, 
		CharacterLiteral=55, StringLiteral=56, NullLiteral=57, LPAREN=58, RPAREN=59, 
		LBRACE=60, RBRACE=61, LBRACK=62, RBRACK=63, SEMI=64, COMMA=65, DOT=66, 
		ASSIGN=67, GT=68, LT=69, BANG=70, TILDE=71, QUESTION=72, COLON=73, EQUAL=74, 
		LE=75, GE=76, NOTEQUAL=77, AND=78, OR=79, INC=80, DEC=81, ADD=82, SUB=83, 
		MUL=84, DIV=85, BITAND=86, BITOR=87, CARET=88, MOD=89, ARROW=90, COLONCOLON=91, 
		ADD_ASSIGN=92, SUB_ASSIGN=93, MUL_ASSIGN=94, DIV_ASSIGN=95, AND_ASSIGN=96, 
		OR_ASSIGN=97, XOR_ASSIGN=98, MOD_ASSIGN=99, LSHIFT_ASSIGN=100, RSHIFT_ASSIGN=101, 
		URSHIFT_ASSIGN=102, Identifier=103, AT=104, ELLIPSIS=105, WS=106, COMMENT=107, 
		LINE_COMMENT=108;
	public static final String[] tokenNames = {
		"<INVALID>", "'@interface'", "'abstract'", "'assert'", "'boolean'", "'break'", 
		"'byte'", "'case'", "'catch'", "'char'", "'class'", "'const'", "'continue'", 
		"'default'", "'do'", "'double'", "'else'", "'enum'", "'extends'", "'final'", 
		"'finally'", "'float'", "'for'", "'if'", "'goto'", "'implements'", "'import'", 
		"'instanceof'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
		"'package'", "'private'", "'protected'", "'public'", "'return'", "'short'", 
		"'static'", "'strictfp'", "'super'", "'switch'", "'synchronized'", "'this'", 
		"'throw'", "'throws'", "'transient'", "'try'", "'void'", "'volatile'", 
		"'while'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "'null'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", 
		"'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", 
		"'::'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", 
		"'<<='", "'>>='", "'>>>='", "Identifier", "'@'", "'...'", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_literal = 0, RULE_type = 1, RULE_primitiveType = 2, RULE_numericType = 3, 
		RULE_integralType = 4, RULE_floatingPointType = 5, RULE_referenceType = 6, 
		RULE_classOrInterfaceType = 7, RULE_classType = 8, RULE_classType_lf_classOrInterfaceType = 9, 
		RULE_classType_lfno_classOrInterfaceType = 10, RULE_interfaceType = 11, 
		RULE_interfaceType_lf_classOrInterfaceType = 12, RULE_interfaceType_lfno_classOrInterfaceType = 13, 
		RULE_typeVariable = 14, RULE_arrayType = 15, RULE_dims = 16, RULE_typeParameter = 17, 
		RULE_typeParameterModifier = 18, RULE_typeBound = 19, RULE_additionalBound = 20, 
		RULE_typeArguments = 21, RULE_typeArgumentList = 22, RULE_typeArgument = 23, 
		RULE_wildcard = 24, RULE_wildcardBounds = 25, RULE_packageName = 26, RULE_typeName = 27, 
		RULE_packageOrTypeName = 28, RULE_expressionName = 29, RULE_methodName = 30, 
		RULE_ambiguousName = 31, RULE_compilationUnit = 32, RULE_packageDeclaration = 33, 
		RULE_packageModifier = 34, RULE_importDeclaration = 35, RULE_singleTypeImportDeclaration = 36, 
		RULE_typeImportOnDemandDeclaration = 37, RULE_singleStaticImportDeclaration = 38, 
		RULE_staticImportOnDemandDeclaration = 39, RULE_typeDeclaration = 40, 
		RULE_classDeclaration = 41, RULE_normalClassDeclaration = 42, RULE_classModifier = 43, 
		RULE_typeParameters = 44, RULE_typeParameterList = 45, RULE_superclass = 46, 
		RULE_superinterfaces = 47, RULE_interfaceTypeList = 48, RULE_classBody = 49, 
		RULE_classBodyDeclaration = 50, RULE_classMemberDeclaration = 51, RULE_fieldDeclaration = 52, 
		RULE_fieldModifier = 53, RULE_variableDeclaratorList = 54, RULE_variableDeclarator = 55, 
		RULE_variableDeclaratorId = 56, RULE_variableInitializer = 57, RULE_unannType = 58, 
		RULE_unannPrimitiveType = 59, RULE_unannReferenceType = 60, RULE_unannClassOrInterfaceType = 61, 
		RULE_unannClassType = 62, RULE_unannClassType_lf_unannClassOrInterfaceType = 63, 
		RULE_unannClassType_lfno_unannClassOrInterfaceType = 64, RULE_unannInterfaceType = 65, 
		RULE_unannInterfaceType_lf_unannClassOrInterfaceType = 66, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType = 67, 
		RULE_unannTypeVariable = 68, RULE_unannArrayType = 69, RULE_methodDeclaration = 70, 
		RULE_methodModifier = 71, RULE_methodHeader = 72, RULE_result = 73, RULE_methodDeclarator = 74, 
		RULE_formalParameterList = 75, RULE_formalParameters = 76, RULE_formalParameter = 77, 
		RULE_variableModifier = 78, RULE_lastFormalParameter = 79, RULE_receiverParameter = 80, 
		RULE_throws_ = 81, RULE_exceptionTypeList = 82, RULE_exceptionType = 83, 
		RULE_methodBody = 84, RULE_instanceInitializer = 85, RULE_staticInitializer = 86, 
		RULE_constructorDeclaration = 87, RULE_constructorModifier = 88, RULE_constructorDeclarator = 89, 
		RULE_simpleTypeName = 90, RULE_constructorBody = 91, RULE_explicitConstructorInvocation = 92, 
		RULE_enumDeclaration = 93, RULE_enumBody = 94, RULE_enumConstantList = 95, 
		RULE_enumConstant = 96, RULE_enumConstantModifier = 97, RULE_enumBodyDeclarations = 98, 
		RULE_interfaceDeclaration = 99, RULE_normalInterfaceDeclaration = 100, 
		RULE_interfaceModifier = 101, RULE_extendsInterfaces = 102, RULE_interfaceBody = 103, 
		RULE_interfaceMemberDeclaration = 104, RULE_constantDeclaration = 105, 
		RULE_constantModifier = 106, RULE_interfaceMethodDeclaration = 107, RULE_interfaceMethodModifier = 108, 
		RULE_annotationTypeDeclaration = 109, RULE_annotationTypeBody = 110, RULE_annotationTypeMemberDeclaration = 111, 
		RULE_annotationTypeElementDeclaration = 112, RULE_annotationTypeElementModifier = 113, 
		RULE_defaultValue = 114, RULE_annotation = 115, RULE_normalAnnotation = 116, 
		RULE_elementValuePairList = 117, RULE_elementValuePair = 118, RULE_elementValue = 119, 
		RULE_elementValueArrayInitializer = 120, RULE_elementValueList = 121, 
		RULE_markerAnnotation = 122, RULE_singleElementAnnotation = 123, RULE_arrayInitializer = 124, 
		RULE_variableInitializerList = 125, RULE_block = 126, RULE_blockStatements = 127, 
		RULE_blockStatement = 128, RULE_localVariableDeclarationStatement = 129, 
		RULE_localVariableDeclaration = 130, RULE_statement = 131, RULE_statementNoShortIf = 132, 
		RULE_statementWithoutTrailingSubstatement = 133, RULE_emptyStatement = 134, 
		RULE_labeledStatement = 135, RULE_labeledStatementNoShortIf = 136, RULE_expressionStatement = 137, 
		RULE_statementExpression = 138, RULE_ifThenStatement = 139, RULE_ifThenElseStatement = 140, 
		RULE_ifThenElseStatementNoShortIf = 141, RULE_assertStatement = 142, RULE_switchStatement = 143, 
		RULE_switchBlock = 144, RULE_switchBlockStatementGroup = 145, RULE_switchLabels = 146, 
		RULE_switchLabel = 147, RULE_enumConstantName = 148, RULE_whileStatement = 149, 
		RULE_whileStatementNoShortIf = 150, RULE_doStatement = 151, RULE_forStatement = 152, 
		RULE_forStatementNoShortIf = 153, RULE_basicForStatement = 154, RULE_basicForStatementNoShortIf = 155, 
		RULE_forInit = 156, RULE_forUpdate = 157, RULE_statementExpressionList = 158, 
		RULE_enhancedForStatement = 159, RULE_enhancedForStatementNoShortIf = 160, 
		RULE_breakStatement = 161, RULE_continueStatement = 162, RULE_returnStatement = 163, 
		RULE_throwStatement = 164, RULE_synchronizedStatement = 165, RULE_tryStatement = 166, 
		RULE_catches = 167, RULE_catchClause = 168, RULE_catchFormalParameter = 169, 
		RULE_catchType = 170, RULE_finally_ = 171, RULE_tryWithResourcesStatement = 172, 
		RULE_resourceSpecification = 173, RULE_resourceList = 174, RULE_resource = 175, 
		RULE_primary = 176, RULE_primaryNoNewArray = 177, RULE_primaryNoNewArray_lf_arrayAccess = 178, 
		RULE_primaryNoNewArray_lfno_arrayAccess = 179, RULE_primaryNoNewArray_lf_primary = 180, 
		RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary = 181, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary = 182, 
		RULE_primaryNoNewArray_lfno_primary = 183, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary = 184, 
		RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary = 185, 
		RULE_classInstanceCreationExpression = 186, RULE_classInstanceCreationExpression_lf_primary = 187, 
		RULE_classInstanceCreationExpression_lfno_primary = 188, RULE_typeArgumentsOrDiamond = 189, 
		RULE_fieldAccess = 190, RULE_fieldAccess_lf_primary = 191, RULE_fieldAccess_lfno_primary = 192, 
		RULE_arrayAccess = 193, RULE_arrayAccess_lf_primary = 194, RULE_arrayAccess_lfno_primary = 195, 
		RULE_methodInvocation = 196, RULE_methodInvocation_lf_primary = 197, RULE_methodInvocation_lfno_primary = 198, 
		RULE_argumentList = 199, RULE_methodReference = 200, RULE_methodReference_lf_primary = 201, 
		RULE_methodReference_lfno_primary = 202, RULE_arrayCreationExpression = 203, 
		RULE_dimExprs = 204, RULE_dimExpr = 205, RULE_constantExpression = 206, 
		RULE_expression = 207, RULE_lambdaExpression = 208, RULE_lambdaParameters = 209, 
		RULE_inferredFormalParameterList = 210, RULE_lambdaBody = 211, RULE_assignmentExpression = 212, 
		RULE_assignment = 213, RULE_leftHandSide = 214, RULE_assignmentOperator = 215, 
		RULE_conditionalExpression = 216, RULE_conditionalOrExpression = 217, 
		RULE_conditionalAndExpression = 218, RULE_inclusiveOrExpression = 219, 
		RULE_exclusiveOrExpression = 220, RULE_andExpression = 221, RULE_equalityExpression = 222, 
		RULE_relationalExpression = 223, RULE_shiftExpression = 224, RULE_additiveExpression = 225, 
		RULE_multiplicativeExpression = 226, RULE_unaryExpression = 227, RULE_preIncrementExpression = 228, 
		RULE_preDecrementExpression = 229, RULE_unaryExpressionNotPlusMinus = 230, 
		RULE_postfixExpression = 231, RULE_postIncrementExpression = 232, RULE_postIncrementExpression_lf_postfixExpression = 233, 
		RULE_postDecrementExpression = 234, RULE_postDecrementExpression_lf_postfixExpression = 235, 
		RULE_castExpression = 236;
	public static final String[] ruleNames = {
		"literal", "type", "primitiveType", "numericType", "integralType", "floatingPointType", 
		"referenceType", "classOrInterfaceType", "classType", "classType_lf_classOrInterfaceType", 
		"classType_lfno_classOrInterfaceType", "interfaceType", "interfaceType_lf_classOrInterfaceType", 
		"interfaceType_lfno_classOrInterfaceType", "typeVariable", "arrayType", 
		"dims", "typeParameter", "typeParameterModifier", "typeBound", "additionalBound", 
		"typeArguments", "typeArgumentList", "typeArgument", "wildcard", "wildcardBounds", 
		"packageName", "typeName", "packageOrTypeName", "expressionName", "methodName", 
		"ambiguousName", "compilationUnit", "packageDeclaration", "packageModifier", 
		"importDeclaration", "singleTypeImportDeclaration", "typeImportOnDemandDeclaration", 
		"singleStaticImportDeclaration", "staticImportOnDemandDeclaration", "typeDeclaration", 
		"classDeclaration", "normalClassDeclaration", "classModifier", "typeParameters", 
		"typeParameterList", "superclass", "superinterfaces", "interfaceTypeList", 
		"classBody", "classBodyDeclaration", "classMemberDeclaration", "fieldDeclaration", 
		"fieldModifier", "variableDeclaratorList", "variableDeclarator", "variableDeclaratorId", 
		"variableInitializer", "unannType", "unannPrimitiveType", "unannReferenceType", 
		"unannClassOrInterfaceType", "unannClassType", "unannClassType_lf_unannClassOrInterfaceType", 
		"unannClassType_lfno_unannClassOrInterfaceType", "unannInterfaceType", 
		"unannInterfaceType_lf_unannClassOrInterfaceType", "unannInterfaceType_lfno_unannClassOrInterfaceType", 
		"unannTypeVariable", "unannArrayType", "methodDeclaration", "methodModifier", 
		"methodHeader", "result", "methodDeclarator", "formalParameterList", "formalParameters", 
		"formalParameter", "variableModifier", "lastFormalParameter", "receiverParameter", 
		"throws_", "exceptionTypeList", "exceptionType", "methodBody", "instanceInitializer", 
		"staticInitializer", "constructorDeclaration", "constructorModifier", 
		"constructorDeclarator", "simpleTypeName", "constructorBody", "explicitConstructorInvocation", 
		"enumDeclaration", "enumBody", "enumConstantList", "enumConstant", "enumConstantModifier", 
		"enumBodyDeclarations", "interfaceDeclaration", "normalInterfaceDeclaration", 
		"interfaceModifier", "extendsInterfaces", "interfaceBody", "interfaceMemberDeclaration", 
		"constantDeclaration", "constantModifier", "interfaceMethodDeclaration", 
		"interfaceMethodModifier", "annotationTypeDeclaration", "annotationTypeBody", 
		"annotationTypeMemberDeclaration", "annotationTypeElementDeclaration", 
		"annotationTypeElementModifier", "defaultValue", "annotation", "normalAnnotation", 
		"elementValuePairList", "elementValuePair", "elementValue", "elementValueArrayInitializer", 
		"elementValueList", "markerAnnotation", "singleElementAnnotation", "arrayInitializer", 
		"variableInitializerList", "block", "blockStatements", "blockStatement", 
		"localVariableDeclarationStatement", "localVariableDeclaration", "statement", 
		"statementNoShortIf", "statementWithoutTrailingSubstatement", "emptyStatement", 
		"labeledStatement", "labeledStatementNoShortIf", "expressionStatement", 
		"statementExpression", "ifThenStatement", "ifThenElseStatement", "ifThenElseStatementNoShortIf", 
		"assertStatement", "switchStatement", "switchBlock", "switchBlockStatementGroup", 
		"switchLabels", "switchLabel", "enumConstantName", "whileStatement", "whileStatementNoShortIf", 
		"doStatement", "forStatement", "forStatementNoShortIf", "basicForStatement", 
		"basicForStatementNoShortIf", "forInit", "forUpdate", "statementExpressionList", 
		"enhancedForStatement", "enhancedForStatementNoShortIf", "breakStatement", 
		"continueStatement", "returnStatement", "throwStatement", "synchronizedStatement", 
		"tryStatement", "catches", "catchClause", "catchFormalParameter", "catchType", 
		"finally_", "tryWithResourcesStatement", "resourceSpecification", "resourceList", 
		"resource", "primary", "primaryNoNewArray", "primaryNoNewArray_lf_arrayAccess", 
		"primaryNoNewArray_lfno_arrayAccess", "primaryNoNewArray_lf_primary", 
		"primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary", "primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary", 
		"primaryNoNewArray_lfno_primary", "primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary", 
		"primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary", "classInstanceCreationExpression", 
		"classInstanceCreationExpression_lf_primary", "classInstanceCreationExpression_lfno_primary", 
		"typeArgumentsOrDiamond", "fieldAccess", "fieldAccess_lf_primary", "fieldAccess_lfno_primary", 
		"arrayAccess", "arrayAccess_lf_primary", "arrayAccess_lfno_primary", "methodInvocation", 
		"methodInvocation_lf_primary", "methodInvocation_lfno_primary", "argumentList", 
		"methodReference", "methodReference_lf_primary", "methodReference_lfno_primary", 
		"arrayCreationExpression", "dimExprs", "dimExpr", "constantExpression", 
		"expression", "lambdaExpression", "lambdaParameters", "inferredFormalParameterList", 
		"lambdaBody", "assignmentExpression", "assignment", "leftHandSide", "assignmentOperator", 
		"conditionalExpression", "conditionalOrExpression", "conditionalAndExpression", 
		"inclusiveOrExpression", "exclusiveOrExpression", "andExpression", "equalityExpression", 
		"relationalExpression", "shiftExpression", "additiveExpression", "multiplicativeExpression", 
		"unaryExpression", "preIncrementExpression", "preDecrementExpression", 
		"unaryExpressionNotPlusMinus", "postfixExpression", "postIncrementExpression", 
		"postIncrementExpression_lf_postfixExpression", "postDecrementExpression", 
		"postDecrementExpression_lf_postfixExpression", "castExpression"
	};

	@Override
	public String getGrammarFileName() { return "Java8.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Java8Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(Java8Parser.StringLiteral, 0); }
		public TerminalNode NullLiteral() { return getToken(Java8Parser.NullLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(Java8Parser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(Java8Parser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(Java8Parser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(Java8Parser.CharacterLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(478);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476); primitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(477); referenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_primitiveType);
		int _la;
		try {
			setState(494);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(480); annotation();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486); numericType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(487); annotation();
					}
					}
					setState(492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(493); match(BOOLEAN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegralTypeContext integralType() {
			return getRuleContext(IntegralTypeContext.class,0);
		}
		public FloatingPointTypeContext floatingPointType() {
			return getRuleContext(FloatingPointTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_numericType);
		try {
			setState(498);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(496); integralType();
				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(497); floatingPointType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegralTypeContext extends ParserRuleContext {
		public IntegralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integralType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIntegralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIntegralType(this);
		}
	}

	public final IntegralTypeContext integralType() throws RecognitionException {
		IntegralTypeContext _localctx = new IntegralTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integralType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << CHAR) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatingPointTypeContext extends ParserRuleContext {
		public FloatingPointTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatingPointType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFloatingPointType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFloatingPointType(this);
		}
	}

	public final FloatingPointTypeContext floatingPointType() throws RecognitionException {
		FloatingPointTypeContext _localctx = new FloatingPointTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_floatingPointType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferenceTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReferenceType(this);
		}
	}

	public final ReferenceTypeContext referenceType() throws RecognitionException {
		ReferenceTypeContext _localctx = new ReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referenceType);
		try {
			setState(507);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504); classOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(505); typeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(506); arrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<InterfaceType_lf_classOrInterfaceTypeContext> interfaceType_lf_classOrInterfaceType() {
			return getRuleContexts(InterfaceType_lf_classOrInterfaceTypeContext.class);
		}
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType(int i) {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() {
			return getRuleContext(InterfaceType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public List<ClassType_lf_classOrInterfaceTypeContext> classType_lf_classOrInterfaceType() {
			return getRuleContexts(ClassType_lf_classOrInterfaceTypeContext.class);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType(int i) {
			return getRuleContext(InterfaceType_lf_classOrInterfaceTypeContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(509); classType_lfno_classOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(510); interfaceType_lfno_classOrInterfaceType();
				}
				break;
			}
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(515);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(513); classType_lf_classOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(514); interfaceType_lf_classOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classType);
		int _la;
		try {
			setState(542);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(520); annotation();
					}
					}
					setState(525);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(526); match(Identifier);
				setState(528);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(527); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(530); classOrInterfaceType();
				setState(531); match(DOT);
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(532); annotation();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(538); match(Identifier);
				setState(540);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(539); typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lf_classOrInterfaceType(this);
		}
	}

	public final ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() throws RecognitionException {
		ClassType_lf_classOrInterfaceTypeContext _localctx = new ClassType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_classType_lf_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); match(DOT);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(545); annotation();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551); match(Identifier);
			setState(553);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(552); typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ClassType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassType_lfno_classOrInterfaceType(this);
		}
	}

	public final ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() throws RecognitionException {
		ClassType_lfno_classOrInterfaceTypeContext _localctx = new ClassType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_classType_lfno_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(555); annotation();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561); match(Identifier);
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(562); typeArguments();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public InterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType(this);
		}
	}

	public final InterfaceTypeContext interfaceType() throws RecognitionException {
		InterfaceTypeContext _localctx = new InterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_interfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565); classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lf_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lf_classOrInterfaceTypeContext classType_lf_classOrInterfaceType() {
			return getRuleContext(ClassType_lf_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lf_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lf_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lf_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lf_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lf_classOrInterfaceTypeContext interfaceType_lf_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lf_classOrInterfaceTypeContext _localctx = new InterfaceType_lf_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_interfaceType_lf_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567); classType_lf_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceType_lfno_classOrInterfaceTypeContext extends ParserRuleContext {
		public ClassType_lfno_classOrInterfaceTypeContext classType_lfno_classOrInterfaceType() {
			return getRuleContext(ClassType_lfno_classOrInterfaceTypeContext.class,0);
		}
		public InterfaceType_lfno_classOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceType_lfno_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceType_lfno_classOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceType_lfno_classOrInterfaceType(this);
		}
	}

	public final InterfaceType_lfno_classOrInterfaceTypeContext interfaceType_lfno_classOrInterfaceType() throws RecognitionException {
		InterfaceType_lfno_classOrInterfaceTypeContext _localctx = new InterfaceType_lfno_classOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_interfaceType_lfno_classOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569); classType_lfno_classOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeVariable(this);
		}
	}

	public final TypeVariableContext typeVariable() throws RecognitionException {
		TypeVariableContext _localctx = new TypeVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_typeVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(571); annotation();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayType);
		try {
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579); primitiveType();
				setState(580); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(582); classOrInterfaceType();
				setState(583); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585); typeVariable();
				setState(586); dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimsContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public DimsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dims; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDims(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDims(this);
		}
	}

	public final DimsContext dims() throws RecognitionException {
		DimsContext _localctx = new DimsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dims);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(590); annotation();
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596); match(LBRACK);
			setState(597); match(RBRACK);
			setState(608);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(598); annotation();
						}
						}
						setState(603);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(604); match(LBRACK);
					setState(605); match(RBRACK);
					}
					} 
				}
				setState(610);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<TypeParameterModifierContext> typeParameterModifier() {
			return getRuleContexts(TypeParameterModifierContext.class);
		}
		public TypeParameterModifierContext typeParameterModifier(int i) {
			return getRuleContext(TypeParameterModifierContext.class,i);
		}
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(611); typeParameterModifier();
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617); match(Identifier);
			setState(619);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(618); typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public TypeParameterModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterModifier(this);
		}
	}

	public final TypeParameterModifierContext typeParameterModifier() throws RecognitionException {
		TypeParameterModifierContext _localctx = new TypeParameterModifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeParameterModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_typeBound);
		int _la;
		try {
			setState(633);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623); match(EXTENDS);
				setState(624); typeVariable();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625); match(EXTENDS);
				setState(626); classOrInterfaceType();
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(627); additionalBound();
					}
					}
					setState(632);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AdditionalBoundContext extends ParserRuleContext {
		public InterfaceTypeContext interfaceType() {
			return getRuleContext(InterfaceTypeContext.class,0);
		}
		public AdditionalBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditionalBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditionalBound(this);
		}
	}

	public final AdditionalBoundContext additionalBound() throws RecognitionException {
		AdditionalBoundContext _localctx = new AdditionalBoundContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_additionalBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); match(BITAND);
			setState(636); interfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public TypeArgumentListContext typeArgumentList() {
			return getRuleContext(TypeArgumentListContext.class,0);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_typeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638); match(LT);
			setState(639); typeArgumentList();
			setState(640); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentListContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentList(this);
		}
	}

	public final TypeArgumentListContext typeArgumentList() throws RecognitionException {
		TypeArgumentListContext _localctx = new TypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642); typeArgument();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(643); match(COMMA);
				setState(644); typeArgument();
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardContext wildcard() {
			return getRuleContext(WildcardContext.class,0);
		}
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeArgument);
		try {
			setState(652);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(650); referenceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651); wildcard();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardContext extends ParserRuleContext {
		public WildcardBoundsContext wildcardBounds() {
			return getRuleContext(WildcardBoundsContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public WildcardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcard(this);
		}
	}

	public final WildcardContext wildcard() throws RecognitionException {
		WildcardContext _localctx = new WildcardContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(654); annotation();
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660); match(QUESTION);
			setState(662);
			_la = _input.LA(1);
			if (_la==EXTENDS || _la==SUPER) {
				{
				setState(661); wildcardBounds();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardBoundsContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public WildcardBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWildcardBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWildcardBounds(this);
		}
	}

	public final WildcardBoundsContext wildcardBounds() throws RecognitionException {
		WildcardBoundsContext _localctx = new WildcardBoundsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_wildcardBounds);
		try {
			setState(668);
			switch (_input.LA(1)) {
			case EXTENDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(664); match(EXTENDS);
				setState(665); referenceType();
				}
				break;
			case SUPER:
				enterOuterAlt(_localctx, 2);
				{
				setState(666); match(SUPER);
				setState(667); referenceType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(673);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(674); match(DOT);
					setState(675); match(Identifier);
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeName);
		try {
			setState(686);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682); packageOrTypeName(0);
				setState(683); match(DOT);
				setState(684); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageOrTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public PackageOrTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageOrTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageOrTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageOrTypeName(this);
		}
	}

	public final PackageOrTypeNameContext packageOrTypeName() throws RecognitionException {
		return packageOrTypeName(0);
	}

	private PackageOrTypeNameContext packageOrTypeName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageOrTypeNameContext _localctx = new PackageOrTypeNameContext(_ctx, _parentState);
		PackageOrTypeNameContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_packageOrTypeName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(689); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(696);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageOrTypeNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageOrTypeName);
					setState(691);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(692); match(DOT);
					setState(693); match(Identifier);
					}
					} 
				}
				setState(698);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public ExpressionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionName(this);
		}
	}

	public final ExpressionNameContext expressionName() throws RecognitionException {
		ExpressionNameContext _localctx = new ExpressionNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionName);
		try {
			setState(704);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(699); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(700); ambiguousName(0);
				setState(701); match(DOT);
				setState(702); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodName(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmbiguousNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AmbiguousNameContext ambiguousName() {
			return getRuleContext(AmbiguousNameContext.class,0);
		}
		public AmbiguousNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ambiguousName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAmbiguousName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAmbiguousName(this);
		}
	}

	public final AmbiguousNameContext ambiguousName() throws RecognitionException {
		return ambiguousName(0);
	}

	private AmbiguousNameContext ambiguousName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AmbiguousNameContext _localctx = new AmbiguousNameContext(_ctx, _parentState);
		AmbiguousNameContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_ambiguousName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(709); match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(716);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AmbiguousNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_ambiguousName);
					setState(711);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(712); match(DOT);
					setState(713); match(Identifier);
					}
					} 
				}
				setState(718);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(Java8Parser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(719); packageDeclaration();
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(722); importDeclaration();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ABSTRACT) | (1L << CLASS) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI || _la==AT) {
				{
				{
				setState(728); typeDeclaration();
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(734); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public List<PackageModifierContext> packageModifier() {
			return getRuleContexts(PackageModifierContext.class);
		}
		public PackageModifierContext packageModifier(int i) {
			return getRuleContext(PackageModifierContext.class,i);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_packageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(736); packageModifier();
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742); match(PACKAGE);
			setState(743); match(Identifier);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(744); match(DOT);
				setState(745); match(Identifier);
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public PackageModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPackageModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPackageModifier(this);
		}
	}

	public final PackageModifierContext packageModifier() throws RecognitionException {
		PackageModifierContext _localctx = new PackageModifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_packageModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public SingleStaticImportDeclarationContext singleStaticImportDeclaration() {
			return getRuleContext(SingleStaticImportDeclarationContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() {
			return getRuleContext(StaticImportOnDemandDeclarationContext.class,0);
		}
		public SingleTypeImportDeclarationContext singleTypeImportDeclaration() {
			return getRuleContext(SingleTypeImportDeclarationContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() {
			return getRuleContext(TypeImportOnDemandDeclarationContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_importDeclaration);
		try {
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(755); singleTypeImportDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(756); typeImportOnDemandDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(757); singleStaticImportDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(758); staticImportOnDemandDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTypeImportDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleTypeImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTypeImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleTypeImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleTypeImportDeclaration(this);
		}
	}

	public final SingleTypeImportDeclarationContext singleTypeImportDeclaration() throws RecognitionException {
		SingleTypeImportDeclarationContext _localctx = new SingleTypeImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_singleTypeImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761); match(IMPORT);
			setState(762); typeName();
			setState(763); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeImportOnDemandDeclarationContext extends ParserRuleContext {
		public PackageOrTypeNameContext packageOrTypeName() {
			return getRuleContext(PackageOrTypeNameContext.class,0);
		}
		public TypeImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeImportOnDemandDeclaration(this);
		}
	}

	public final TypeImportOnDemandDeclarationContext typeImportOnDemandDeclaration() throws RecognitionException {
		TypeImportOnDemandDeclarationContext _localctx = new TypeImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765); match(IMPORT);
			setState(766); packageOrTypeName(0);
			setState(767); match(DOT);
			setState(768); match(MUL);
			setState(769); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleStaticImportDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SingleStaticImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStaticImportDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleStaticImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleStaticImportDeclaration(this);
		}
	}

	public final SingleStaticImportDeclarationContext singleStaticImportDeclaration() throws RecognitionException {
		SingleStaticImportDeclarationContext _localctx = new SingleStaticImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_singleStaticImportDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771); match(IMPORT);
			setState(772); match(STATIC);
			setState(773); typeName();
			setState(774); match(DOT);
			setState(775); match(Identifier);
			setState(776); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticImportOnDemandDeclarationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public StaticImportOnDemandDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticImportOnDemandDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticImportOnDemandDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticImportOnDemandDeclaration(this);
		}
	}

	public final StaticImportOnDemandDeclarationContext staticImportOnDemandDeclaration() throws RecognitionException {
		StaticImportOnDemandDeclarationContext _localctx = new StaticImportOnDemandDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_staticImportOnDemandDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778); match(IMPORT);
			setState(779); match(STATIC);
			setState(780); typeName();
			setState(781); match(DOT);
			setState(782); match(MUL);
			setState(783); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeDeclaration);
		int _la;
		try {
			setState(840);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(785); classModifier();
					}
					}
					setState(790);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(791); match(CLASS);
				setState(792); match(Identifier);
				setState(794);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(793); typeParameters();
					}
				}

				setState(797);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(796); superclass();
					}
				}

				setState(800);
				_la = _input.LA(1);
				if (_la==IMPLEMENTS) {
					{
					setState(799); superinterfaces();
					}
				}

				setState(802); classBody();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(803); classModifier();
					}
					}
					setState(808);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(809); match(ENUM);
				setState(810); match(Identifier);
				setState(812);
				_la = _input.LA(1);
				if (_la==IMPLEMENTS) {
					{
					setState(811); superinterfaces();
					}
				}

				setState(814); enumBody();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(815); interfaceModifier();
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821); match(INTERFACE);
				setState(822); match(Identifier);
				setState(824);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(823); typeParameters();
					}
				}

				setState(827);
				_la = _input.LA(1);
				if (_la==EXTENDS) {
					{
					setState(826); extendsInterfaces();
					}
				}

				setState(829); interfaceBody();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
					{
					{
					setState(830); interfaceModifier();
					}
					}
					setState(835);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(836); match(T__0);
				setState(837); match(Identifier);
				setState(838); annotationTypeBody();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(839); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public NormalClassDeclarationContext normalClassDeclaration() {
			return getRuleContext(NormalClassDeclarationContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_classDeclaration);
		try {
			setState(844);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842); normalClassDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(843); enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperclassContext superclass() {
			return getRuleContext(SuperclassContext.class,0);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public NormalClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalClassDeclaration(this);
		}
	}

	public final NormalClassDeclarationContext normalClassDeclaration() throws RecognitionException {
		NormalClassDeclarationContext _localctx = new NormalClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_normalClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(846); classModifier();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(852); match(CLASS);
			setState(853); match(Identifier);
			setState(855);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(854); typeParameters();
				}
			}

			setState(858);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(857); superclass();
				}
			}

			setState(861);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(860); superinterfaces();
				}
			}

			setState(863); classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ClassModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassModifier(this);
		}
	}

	public final ClassModifierContext classModifier() throws RecognitionException {
		ClassModifierContext _localctx = new ClassModifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_classModifier);
		try {
			setState(873);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(865); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(866); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(867); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(868); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(869); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(870); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(871); match(FINAL);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 8);
				{
				setState(872); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public TypeParameterListContext typeParameterList() {
			return getRuleContext(TypeParameterListContext.class,0);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeParameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875); match(LT);
			setState(876); typeParameterList();
			setState(877); match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterListContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeParameterList(this);
		}
	}

	public final TypeParameterListContext typeParameterList() throws RecognitionException {
		TypeParameterListContext _localctx = new TypeParameterListContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879); typeParameter();
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(880); match(COMMA);
				setState(881); typeParameter();
				}
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassContext extends ParserRuleContext {
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public SuperclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperclass(this);
		}
	}

	public final SuperclassContext superclass() throws RecognitionException {
		SuperclassContext _localctx = new SuperclassContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_superclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887); match(EXTENDS);
			setState(888); classType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperinterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public SuperinterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superinterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSuperinterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSuperinterfaces(this);
		}
	}

	public final SuperinterfacesContext superinterfaces() throws RecognitionException {
		SuperinterfacesContext _localctx = new SuperinterfacesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_superinterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(890); match(IMPLEMENTS);
			setState(891); interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceTypeListContext extends ParserRuleContext {
		public List<InterfaceTypeContext> interfaceType() {
			return getRuleContexts(InterfaceTypeContext.class);
		}
		public InterfaceTypeContext interfaceType(int i) {
			return getRuleContext(InterfaceTypeContext.class,i);
		}
		public InterfaceTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceTypeList(this);
		}
	}

	public final InterfaceTypeListContext interfaceTypeList() throws RecognitionException {
		InterfaceTypeListContext _localctx = new InterfaceTypeListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_interfaceTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893); interfaceType();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(894); match(COMMA);
				setState(895); interfaceType();
				}
				}
				setState(900);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(901); match(LBRACE);
			setState(905);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(902); classBodyDeclaration();
				}
				}
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(908); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public ClassMemberDeclarationContext classMemberDeclaration() {
			return getRuleContext(ClassMemberDeclarationContext.class,0);
		}
		public StaticInitializerContext staticInitializer() {
			return getRuleContext(StaticInitializerContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public InstanceInitializerContext instanceInitializer() {
			return getRuleContext(InstanceInitializerContext.class,0);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_classBodyDeclaration);
		try {
			setState(914);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(910); classMemberDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(911); instanceInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(912); staticInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(913); constructorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassMemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ClassMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassMemberDeclaration(this);
		}
	}

	public final ClassMemberDeclarationContext classMemberDeclaration() throws RecognitionException {
		ClassMemberDeclarationContext _localctx = new ClassMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_classMemberDeclaration);
		try {
			setState(921);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(916); fieldDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917); methodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(918); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(919); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(920); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << TRANSIENT) | (1L << VOLATILE))) != 0) || _la==AT) {
				{
				{
				setState(923); fieldModifier();
				}
				}
				setState(928);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(929); unannType();
			setState(930); variableDeclaratorList();
			setState(931); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_fieldModifier);
		try {
			setState(941);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(933); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(934); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(935); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(936); match(PRIVATE);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(937); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(938); match(FINAL);
				}
				break;
			case TRANSIENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(939); match(TRANSIENT);
				}
				break;
			case VOLATILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(940); match(VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorListContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorList(this);
		}
	}

	public final VariableDeclaratorListContext variableDeclaratorList() throws RecognitionException {
		VariableDeclaratorListContext _localctx = new VariableDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_variableDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943); variableDeclarator();
			setState(948);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(944); match(COMMA);
				setState(945); variableDeclarator();
				}
				}
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951); variableDeclaratorId();
			setState(954);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(952); match(ASSIGN);
				setState(953); variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956); match(Identifier);
			setState(958);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(957); dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_variableInitializer);
		try {
			setState(962);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(960); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(961); arrayInitializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeContext extends ParserRuleContext {
		public UnannReferenceTypeContext unannReferenceType() {
			return getRuleContext(UnannReferenceTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannType(this);
		}
	}

	public final UnannTypeContext unannType() throws RecognitionException {
		UnannTypeContext _localctx = new UnannTypeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_unannType);
		try {
			setState(966);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(964); unannPrimitiveType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965); unannReferenceType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannPrimitiveTypeContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public UnannPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannPrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannPrimitiveType(this);
		}
	}

	public final UnannPrimitiveTypeContext unannPrimitiveType() throws RecognitionException {
		UnannPrimitiveTypeContext _localctx = new UnannPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_unannPrimitiveType);
		try {
			setState(970);
			switch (_input.LA(1)) {
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(968); numericType();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 2);
				{
				setState(969); match(BOOLEAN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannReferenceTypeContext extends ParserRuleContext {
		public UnannArrayTypeContext unannArrayType() {
			return getRuleContext(UnannArrayTypeContext.class,0);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public UnannReferenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannReferenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannReferenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannReferenceType(this);
		}
	}

	public final UnannReferenceTypeContext unannReferenceType() throws RecognitionException {
		UnannReferenceTypeContext _localctx = new UnannReferenceTypeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_unannReferenceType);
		try {
			setState(975);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972); unannClassOrInterfaceType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973); unannTypeVariable();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(974); unannArrayType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType(int i) {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,i);
		}
		public List<UnannInterfaceType_lf_unannClassOrInterfaceTypeContext> unannInterfaceType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannInterfaceType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public List<UnannClassType_lf_unannClassOrInterfaceTypeContext> unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContexts(UnannClassType_lf_unannClassOrInterfaceTypeContext.class);
		}
		public UnannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassOrInterfaceType(this);
		}
	}

	public final UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() throws RecognitionException {
		UnannClassOrInterfaceTypeContext _localctx = new UnannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unannClassOrInterfaceType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(977); unannClassType_lfno_unannClassOrInterfaceType();
				}
				break;

			case 2:
				{
				setState(978); unannInterfaceType_lfno_unannClassOrInterfaceType();
				}
				break;
			}
			setState(985);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(983);
					switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
					case 1:
						{
						setState(981); unannClassType_lf_unannClassOrInterfaceType();
						}
						break;

					case 2:
						{
						setState(982); unannInterfaceType_lf_unannClassOrInterfaceType();
						}
						break;
					}
					} 
				}
				setState(987);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType(this);
		}
	}

	public final UnannClassTypeContext unannClassType() throws RecognitionException {
		UnannClassTypeContext _localctx = new UnannClassTypeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_unannClassType);
		int _la;
		try {
			setState(1004);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(988); match(Identifier);
				setState(990);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(989); typeArguments();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(992); unannClassOrInterfaceType();
				setState(993); match(DOT);
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(994); annotation();
					}
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1000); match(Identifier);
				setState(1002);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1001); typeArguments();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public UnannClassType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_unannClassType_lf_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006); match(DOT);
			setState(1010);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1007); annotation();
				}
				}
				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1013); match(Identifier);
			setState(1015);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1014); typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannClassType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannClassType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannClassType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannClassType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannClassType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unannClassType_lfno_unannClassOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017); match(Identifier);
			setState(1019);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1018); typeArguments();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public UnannInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType(this);
		}
	}

	public final UnannInterfaceTypeContext unannInterfaceType() throws RecognitionException {
		UnannInterfaceTypeContext _localctx = new UnannInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_unannInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021); unannClassType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lf_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lf_unannClassOrInterfaceTypeContext unannClassType_lf_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lf_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lf_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lf_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lf_unannClassOrInterfaceTypeContext unannInterfaceType_lf_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lf_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lf_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_unannInterfaceType_lf_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1023); unannClassType_lf_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext extends ParserRuleContext {
		public UnannClassType_lfno_unannClassOrInterfaceTypeContext unannClassType_lfno_unannClassOrInterfaceType() {
			return getRuleContext(UnannClassType_lfno_unannClassOrInterfaceTypeContext.class,0);
		}
		public UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannInterfaceType_lfno_unannClassOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannInterfaceType_lfno_unannClassOrInterfaceType(this);
		}
	}

	public final UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext unannInterfaceType_lfno_unannClassOrInterfaceType() throws RecognitionException {
		UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext _localctx = new UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unannInterfaceType_lfno_unannClassOrInterfaceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025); unannClassType_lfno_unannClassOrInterfaceType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannTypeVariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannTypeVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannTypeVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannTypeVariable(this);
		}
	}

	public final UnannTypeVariableContext unannTypeVariable() throws RecognitionException {
		UnannTypeVariableContext _localctx = new UnannTypeVariableContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unannTypeVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnannArrayTypeContext extends ParserRuleContext {
		public UnannClassOrInterfaceTypeContext unannClassOrInterfaceType() {
			return getRuleContext(UnannClassOrInterfaceTypeContext.class,0);
		}
		public UnannTypeVariableContext unannTypeVariable() {
			return getRuleContext(UnannTypeVariableContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public UnannArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unannArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnannArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnannArrayType(this);
		}
	}

	public final UnannArrayTypeContext unannArrayType() throws RecognitionException {
		UnannArrayTypeContext _localctx = new UnannArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unannArrayType);
		try {
			setState(1038);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1029); unannPrimitiveType();
				setState(1030); dims();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1032); unannClassOrInterfaceType();
				setState(1033); dims();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1035); unannTypeVariable();
				setState(1036); dims();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED))) != 0) || _la==AT) {
				{
				{
				setState(1040); methodModifier();
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1046); methodHeader();
			setState(1047); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_methodModifier);
		try {
			setState(1059);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1049); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1050); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1051); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1052); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1053); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1054); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1055); match(FINAL);
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 8);
				{
				setState(1056); match(SYNCHRONIZED);
				}
				break;
			case NATIVE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1057); match(NATIVE);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 10);
				{
				setState(1058); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodHeaderContext extends ParserRuleContext {
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public MethodDeclaratorContext methodDeclarator() {
			return getRuleContext(MethodDeclaratorContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public MethodHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodHeader(this);
		}
	}

	public final MethodHeaderContext methodHeader() throws RecognitionException {
		MethodHeaderContext _localctx = new MethodHeaderContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_methodHeader);
		int _la;
		try {
			setState(1078);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case VOID:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1061); result();
				setState(1062); methodDeclarator();
				setState(1064);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1063); throws_();
					}
				}

				}
				break;
			case LT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066); typeParameters();
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1067); annotation();
					}
					}
					setState(1072);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1073); result();
				setState(1074); methodDeclarator();
				setState(1076);
				_la = _input.LA(1);
				if (_la==THROWS) {
					{
					setState(1075); throws_();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_result);
		try {
			setState(1082);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1080); unannType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1081); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public MethodDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodDeclarator(this);
		}
	}

	public final MethodDeclaratorContext methodDeclarator() throws RecognitionException {
		MethodDeclaratorContext _localctx = new MethodDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_methodDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084); match(Identifier);
			setState(1085); match(LPAREN);
			setState(1087);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1086); formalParameterList();
				}
			}

			setState(1089); match(RPAREN);
			setState(1091);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1090); dims();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_formalParameterList);
		try {
			setState(1098);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1093); formalParameters();
				setState(1094); match(COMMA);
				setState(1095); lastFormalParameter();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1097); lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public ReceiverParameterContext receiverParameter() {
			return getRuleContext(ReceiverParameterContext.class,0);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_formalParameters);
		try {
			int _alt;
			setState(1116);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100); formalParameter();
				setState(1105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1101); match(COMMA);
						setState(1102); formalParameter();
						}
						} 
					}
					setState(1107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1108); receiverParameter();
				setState(1113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1109); match(COMMA);
						setState(1110); formalParameter();
						}
						} 
					}
					setState(1115);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1118); variableModifier();
				}
				}
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1124); unannType();
			setState(1125); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_variableModifier);
		try {
			setState(1129);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127); annotation();
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1128); match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public FormalParameterContext formalParameter() {
			return getRuleContext(FormalParameterContext.class,0);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_lastFormalParameter);
		int _la;
		try {
			setState(1148);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FINAL || _la==AT) {
					{
					{
					setState(1131); variableModifier();
					}
					}
					setState(1136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1137); unannType();
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(1138); annotation();
					}
					}
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1144); match(ELLIPSIS);
				setState(1145); variableDeclaratorId();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147); formalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ReceiverParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReceiverParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReceiverParameter(this);
		}
	}

	public final ReceiverParameterContext receiverParameter() throws RecognitionException {
		ReceiverParameterContext _localctx = new ReceiverParameterContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_receiverParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1150); annotation();
				}
				}
				setState(1155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1156); unannType();
			setState(1159);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1157); match(Identifier);
				setState(1158); match(DOT);
				}
			}

			setState(1161); match(THIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Throws_Context extends ParserRuleContext {
		public ExceptionTypeListContext exceptionTypeList() {
			return getRuleContext(ExceptionTypeListContext.class,0);
		}
		public Throws_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throws_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrows_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrows_(this);
		}
	}

	public final Throws_Context throws_() throws RecognitionException {
		Throws_Context _localctx = new Throws_Context(_ctx, getState());
		enterRule(_localctx, 162, RULE_throws_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163); match(THROWS);
			setState(1164); exceptionTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeListContext extends ParserRuleContext {
		public List<ExceptionTypeContext> exceptionType() {
			return getRuleContexts(ExceptionTypeContext.class);
		}
		public ExceptionTypeContext exceptionType(int i) {
			return getRuleContext(ExceptionTypeContext.class,i);
		}
		public ExceptionTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionTypeList(this);
		}
	}

	public final ExceptionTypeListContext exceptionTypeList() throws RecognitionException {
		ExceptionTypeListContext _localctx = new ExceptionTypeListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_exceptionTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166); exceptionType();
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1167); match(COMMA);
				setState(1168); exceptionType();
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExceptionTypeContext extends ParserRuleContext {
		public TypeVariableContext typeVariable() {
			return getRuleContext(TypeVariableContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public ExceptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExceptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExceptionType(this);
		}
	}

	public final ExceptionTypeContext exceptionType() throws RecognitionException {
		ExceptionTypeContext _localctx = new ExceptionTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_exceptionType);
		try {
			setState(1176);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174); classType();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1175); typeVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_methodBody);
		try {
			setState(1180);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1178); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1179); match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstanceInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InstanceInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instanceInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInstanceInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInstanceInitializer(this);
		}
	}

	public final InstanceInitializerContext instanceInitializer() throws RecognitionException {
		InstanceInitializerContext _localctx = new InstanceInitializerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_instanceInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticInitializerContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StaticInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStaticInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStaticInitializer(this);
		}
	}

	public final StaticInitializerContext staticInitializer() throws RecognitionException {
		StaticInitializerContext _localctx = new StaticInitializerContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_staticInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184); match(STATIC);
			setState(1185); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public Throws_Context throws_() {
			return getRuleContext(Throws_Context.class,0);
		}
		public ConstructorDeclaratorContext constructorDeclarator() {
			return getRuleContext(ConstructorDeclaratorContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0) || _la==AT) {
				{
				{
				setState(1187); constructorModifier();
				}
				}
				setState(1192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1193); constructorDeclarator();
			setState(1195);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(1194); throws_();
				}
			}

			setState(1197); constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_constructorModifier);
		try {
			setState(1203);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1200); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1201); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1202); match(PRIVATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclaratorContext extends ParserRuleContext {
		public SimpleTypeNameContext simpleTypeName() {
			return getRuleContext(SimpleTypeNameContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorDeclarator(this);
		}
	}

	public final ConstructorDeclaratorContext constructorDeclarator() throws RecognitionException {
		ConstructorDeclaratorContext _localctx = new ConstructorDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_constructorDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1205); typeParameters();
				}
			}

			setState(1208); simpleTypeName();
			setState(1209); match(LPAREN);
			setState(1211);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
				{
				setState(1210); formalParameterList();
				}
			}

			setState(1213); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTypeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public SimpleTypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTypeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSimpleTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSimpleTypeName(this);
		}
	}

	public final SimpleTypeNameContext simpleTypeName() throws RecognitionException {
		SimpleTypeNameContext _localctx = new SimpleTypeNameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_simpleTypeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1215); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public ExplicitConstructorInvocationContext explicitConstructorInvocation() {
			return getRuleContext(ExplicitConstructorInvocationContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217); match(LBRACE);
			setState(1219);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(1218); explicitConstructorInvocation();
				}
				break;
			}
			setState(1222);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1221); blockStatements();
				}
			}

			setState(1224); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitConstructorInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ExplicitConstructorInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitConstructorInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExplicitConstructorInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExplicitConstructorInvocation(this);
		}
	}

	public final ExplicitConstructorInvocationContext explicitConstructorInvocation() throws RecognitionException {
		ExplicitConstructorInvocationContext _localctx = new ExplicitConstructorInvocationContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_explicitConstructorInvocation);
		int _la;
		try {
			setState(1272);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1227);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1226); typeArguments();
					}
				}

				setState(1229); match(THIS);
				setState(1230); match(LPAREN);
				setState(1232);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(1231); argumentList();
					}
				}

				setState(1234); match(RPAREN);
				setState(1235); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1237);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1236); typeArguments();
					}
				}

				setState(1239); match(SUPER);
				setState(1240); match(LPAREN);
				setState(1242);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(1241); argumentList();
					}
				}

				setState(1244); match(RPAREN);
				setState(1245); match(SEMI);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1246); expressionName();
				setState(1247); match(DOT);
				setState(1249);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1248); typeArguments();
					}
				}

				setState(1251); match(SUPER);
				setState(1252); match(LPAREN);
				setState(1254);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(1253); argumentList();
					}
				}

				setState(1256); match(RPAREN);
				setState(1257); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1259); primary();
				setState(1260); match(DOT);
				setState(1262);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1261); typeArguments();
					}
				}

				setState(1264); match(SUPER);
				setState(1265); match(LPAREN);
				setState(1267);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(1266); argumentList();
					}
				}

				setState(1269); match(RPAREN);
				setState(1270); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public List<ClassModifierContext> classModifier() {
			return getRuleContexts(ClassModifierContext.class);
		}
		public ClassModifierContext classModifier(int i) {
			return getRuleContext(ClassModifierContext.class,i);
		}
		public SuperinterfacesContext superinterfaces() {
			return getRuleContext(SuperinterfacesContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1274); classModifier();
				}
				}
				setState(1279);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1280); match(ENUM);
			setState(1281); match(Identifier);
			setState(1283);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(1282); superinterfaces();
				}
			}

			setState(1285); enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumConstantListContext enumConstantList() {
			return getRuleContext(EnumConstantListContext.class,0);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1287); match(LBRACE);
			setState(1289);
			_la = _input.LA(1);
			if (_la==Identifier || _la==AT) {
				{
				setState(1288); enumConstantList();
				}
			}

			setState(1292);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1291); match(COMMA);
				}
			}

			setState(1295);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1294); enumBodyDeclarations();
				}
			}

			setState(1297); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantListContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantList(this);
		}
	}

	public final EnumConstantListContext enumConstantList() throws RecognitionException {
		EnumConstantListContext _localctx = new EnumConstantListContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_enumConstantList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1299); enumConstant();
			setState(1304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1300); match(COMMA);
					setState(1301); enumConstant();
					}
					} 
				}
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,129,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public List<EnumConstantModifierContext> enumConstantModifier() {
			return getRuleContexts(EnumConstantModifierContext.class);
		}
		public EnumConstantModifierContext enumConstantModifier(int i) {
			return getRuleContext(EnumConstantModifierContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(1307); enumConstantModifier();
				}
				}
				setState(1312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1313); match(Identifier);
			setState(1319);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(1314); match(LPAREN);
				setState(1316);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(1315); argumentList();
					}
				}

				setState(1318); match(RPAREN);
				}
			}

			setState(1322);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1321); classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public EnumConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantModifier(this);
		}
	}

	public final EnumConstantModifierContext enumConstantModifier() throws RecognitionException {
		EnumConstantModifierContext _localctx = new EnumConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_enumConstantModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1324); annotation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326); match(SEMI);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SYNCHRONIZED) | (1L << TRANSIENT) | (1L << VOID) | (1L << VOLATILE) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1327); classBodyDeclaration();
				}
				}
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public NormalInterfaceDeclarationContext normalInterfaceDeclaration() {
			return getRuleContext(NormalInterfaceDeclarationContext.class,0);
		}
		public AnnotationTypeDeclarationContext annotationTypeDeclaration() {
			return getRuleContext(AnnotationTypeDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_interfaceDeclaration);
		try {
			setState(1335);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1333); normalInterfaceDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334); annotationTypeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalInterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ExtendsInterfacesContext extendsInterfaces() {
			return getRuleContext(ExtendsInterfacesContext.class,0);
		}
		public NormalInterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalInterfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalInterfaceDeclaration(this);
		}
	}

	public final NormalInterfaceDeclarationContext normalInterfaceDeclaration() throws RecognitionException {
		NormalInterfaceDeclarationContext _localctx = new NormalInterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_normalInterfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1337); interfaceModifier();
				}
				}
				setState(1342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1343); match(INTERFACE);
			setState(1344); match(Identifier);
			setState(1346);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1345); typeParameters();
				}
			}

			setState(1349);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(1348); extendsInterfaces();
				}
			}

			setState(1351); interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceModifier(this);
		}
	}

	public final InterfaceModifierContext interfaceModifier() throws RecognitionException {
		InterfaceModifierContext _localctx = new InterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_interfaceModifier);
		try {
			setState(1360);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1354); match(PUBLIC);
				}
				break;
			case PROTECTED:
				enterOuterAlt(_localctx, 3);
				{
				setState(1355); match(PROTECTED);
				}
				break;
			case PRIVATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1356); match(PRIVATE);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1357); match(ABSTRACT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 6);
				{
				setState(1358); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 7);
				{
				setState(1359); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtendsInterfacesContext extends ParserRuleContext {
		public InterfaceTypeListContext interfaceTypeList() {
			return getRuleContext(InterfaceTypeListContext.class,0);
		}
		public ExtendsInterfacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendsInterfaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExtendsInterfaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExtendsInterfaces(this);
		}
	}

	public final ExtendsInterfacesContext extendsInterfaces() throws RecognitionException {
		ExtendsInterfacesContext _localctx = new ExtendsInterfacesContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_extendsInterfaces);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1362); match(EXTENDS);
			setState(1363); interfaceTypeList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration(int i) {
			return getRuleContext(InterfaceMemberDeclarationContext.class,i);
		}
		public List<InterfaceMemberDeclarationContext> interfaceMemberDeclaration() {
			return getRuleContexts(InterfaceMemberDeclarationContext.class);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365); match(LBRACE);
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DEFAULT) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << VOID))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (LT - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1366); interfaceMemberDeclaration();
				}
				}
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1372); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_interfaceMemberDeclaration);
		try {
			setState(1379);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374); constantDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1375); interfaceMethodDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1376); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1377); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1378); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public ConstantModifierContext constantModifier(int i) {
			return getRuleContext(ConstantModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<ConstantModifierContext> constantModifier() {
			return getRuleContexts(ConstantModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PUBLIC) | (1L << STATIC))) != 0) || _la==AT) {
				{
				{
				setState(1381); constantModifier();
				}
				}
				setState(1386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1387); unannType();
			setState(1388); variableDeclaratorList();
			setState(1389); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ConstantModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantModifier(this);
		}
	}

	public final ConstantModifierContext constantModifier() throws RecognitionException {
		ConstantModifierContext _localctx = new ConstantModifierContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_constantModifier);
		try {
			setState(1395);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1391); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392); match(PUBLIC);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(1393); match(STATIC);
				}
				break;
			case FINAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1394); match(FINAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<InterfaceMethodModifierContext> interfaceMethodModifier() {
			return getRuleContexts(InterfaceMethodModifierContext.class);
		}
		public MethodHeaderContext methodHeader() {
			return getRuleContext(MethodHeaderContext.class,0);
		}
		public InterfaceMethodModifierContext interfaceMethodModifier(int i) {
			return getRuleContext(InterfaceMethodModifierContext.class,i);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << DEFAULT) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==AT) {
				{
				{
				setState(1397); interfaceMethodModifier();
				}
				}
				setState(1402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1403); methodHeader();
			setState(1404); methodBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public InterfaceMethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInterfaceMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInterfaceMethodModifier(this);
		}
	}

	public final InterfaceMethodModifierContext interfaceMethodModifier() throws RecognitionException {
		InterfaceMethodModifierContext _localctx = new InterfaceMethodModifierContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_interfaceMethodModifier);
		try {
			setState(1412);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1407); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1408); match(ABSTRACT);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1409); match(DEFAULT);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 5);
				{
				setState(1410); match(STATIC);
				}
				break;
			case STRICTFP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1411); match(STRICTFP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public AnnotationTypeBodyContext annotationTypeBody() {
			return getRuleContext(AnnotationTypeBodyContext.class,0);
		}
		public List<InterfaceModifierContext> interfaceModifier() {
			return getRuleContexts(InterfaceModifierContext.class);
		}
		public InterfaceModifierContext interfaceModifier(int i) {
			return getRuleContext(InterfaceModifierContext.class,i);
		}
		public AnnotationTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeDeclaration(this);
		}
	}

	public final AnnotationTypeDeclarationContext annotationTypeDeclaration() throws RecognitionException {
		AnnotationTypeDeclarationContext _localctx = new AnnotationTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_annotationTypeDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1414); interfaceModifier();
					}
					} 
				}
				setState(1419);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			setState(1420); match(AT);
			setState(1421); match(INTERFACE);
			setState(1422); match(Identifier);
			setState(1423); annotationTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeBodyContext extends ParserRuleContext {
		public List<AnnotationTypeMemberDeclarationContext> annotationTypeMemberDeclaration() {
			return getRuleContexts(AnnotationTypeMemberDeclarationContext.class);
		}
		public AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration(int i) {
			return getRuleContext(AnnotationTypeMemberDeclarationContext.class,i);
		}
		public AnnotationTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeBody(this);
		}
	}

	public final AnnotationTypeBodyContext annotationTypeBody() throws RecognitionException {
		AnnotationTypeBodyContext _localctx = new AnnotationTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_annotationTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425); match(LBRACE);
			setState(1429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1426); annotationTypeMemberDeclaration();
				}
				}
				setState(1431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1432); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeMemberDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() {
			return getRuleContext(AnnotationTypeElementDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public AnnotationTypeMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeMemberDeclaration(this);
		}
	}

	public final AnnotationTypeMemberDeclarationContext annotationTypeMemberDeclaration() throws RecognitionException {
		AnnotationTypeMemberDeclarationContext _localctx = new AnnotationTypeMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_annotationTypeMemberDeclaration);
		try {
			setState(1439);
			switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434); annotationTypeElementDeclaration();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1435); constantDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1436); classDeclaration();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1437); interfaceDeclaration();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1438); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public DefaultValueContext defaultValue() {
			return getRuleContext(DefaultValueContext.class,0);
		}
		public AnnotationTypeElementModifierContext annotationTypeElementModifier(int i) {
			return getRuleContext(AnnotationTypeElementModifierContext.class,i);
		}
		public List<AnnotationTypeElementModifierContext> annotationTypeElementModifier() {
			return getRuleContexts(AnnotationTypeElementModifierContext.class);
		}
		public AnnotationTypeElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementDeclaration(this);
		}
	}

	public final AnnotationTypeElementDeclarationContext annotationTypeElementDeclaration() throws RecognitionException {
		AnnotationTypeElementDeclarationContext _localctx = new AnnotationTypeElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_annotationTypeElementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ABSTRACT || _la==PUBLIC || _la==AT) {
				{
				{
				setState(1441); annotationTypeElementModifier();
				}
				}
				setState(1446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1447); unannType();
			setState(1448); match(Identifier);
			setState(1449); match(LPAREN);
			setState(1450); match(RPAREN);
			setState(1452);
			_la = _input.LA(1);
			if (_la==LBRACK || _la==AT) {
				{
				setState(1451); dims();
				}
			}

			setState(1455);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1454); defaultValue();
				}
			}

			setState(1457); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationTypeElementModifierContext extends ParserRuleContext {
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public AnnotationTypeElementModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotationTypeElementModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotationTypeElementModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotationTypeElementModifier(this);
		}
	}

	public final AnnotationTypeElementModifierContext annotationTypeElementModifier() throws RecognitionException {
		AnnotationTypeElementModifierContext _localctx = new AnnotationTypeElementModifierContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_annotationTypeElementModifier);
		try {
			setState(1462);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1459); annotation();
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(1460); match(PUBLIC);
				}
				break;
			case ABSTRACT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1461); match(ABSTRACT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultValueContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public DefaultValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDefaultValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDefaultValue(this);
		}
	}

	public final DefaultValueContext defaultValue() throws RecognitionException {
		DefaultValueContext _localctx = new DefaultValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_defaultValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1464); match(DEFAULT);
			setState(1465); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NormalAnnotationContext normalAnnotation() {
			return getRuleContext(NormalAnnotationContext.class,0);
		}
		public MarkerAnnotationContext markerAnnotation() {
			return getRuleContext(MarkerAnnotationContext.class,0);
		}
		public SingleElementAnnotationContext singleElementAnnotation() {
			return getRuleContext(SingleElementAnnotationContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_annotation);
		try {
			setState(1470);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1467); normalAnnotation();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1468); markerAnnotation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1469); singleElementAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalAnnotationContext extends ParserRuleContext {
		public ElementValuePairListContext elementValuePairList() {
			return getRuleContext(ElementValuePairListContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public NormalAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterNormalAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitNormalAnnotation(this);
		}
	}

	public final NormalAnnotationContext normalAnnotation() throws RecognitionException {
		NormalAnnotationContext _localctx = new NormalAnnotationContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_normalAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1472); match(AT);
			setState(1473); typeName();
			setState(1474); match(LPAREN);
			setState(1476);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1475); elementValuePairList();
				}
			}

			setState(1478); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairListContext extends ParserRuleContext {
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePairList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePairList(this);
		}
	}

	public final ElementValuePairListContext elementValuePairList() throws RecognitionException {
		ElementValuePairListContext _localctx = new ElementValuePairListContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_elementValuePairList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480); elementValuePair();
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1481); match(COMMA);
				setState(1482); elementValuePair();
				}
				}
				setState(1487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValuePairContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValuePair(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488); match(Identifier);
			setState(1489); match(ASSIGN);
			setState(1490); elementValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
		}
		public AnnotationContext annotation() {
			return getRuleContext(AnnotationContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValue(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_elementValue);
		try {
			setState(1495);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1492); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1493); elementValueArrayInitializer();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1494); annotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueListContext elementValueList() {
			return getRuleContext(ElementValueListContext.class,0);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueArrayInitializer(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1497); match(LBRACE);
			setState(1499);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(1498); elementValueList();
				}
			}

			setState(1502);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1501); match(COMMA);
				}
			}

			setState(1504); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementValueListContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterElementValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitElementValueList(this);
		}
	}

	public final ElementValueListContext elementValueList() throws RecognitionException {
		ElementValueListContext _localctx = new ElementValueListContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_elementValueList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1506); elementValue();
			setState(1511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1507); match(COMMA);
					setState(1508); elementValue();
					}
					} 
				}
				setState(1513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,159,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarkerAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public MarkerAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markerAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMarkerAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMarkerAnnotation(this);
		}
	}

	public final MarkerAnnotationContext markerAnnotation() throws RecognitionException {
		MarkerAnnotationContext _localctx = new MarkerAnnotationContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_markerAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1514); match(AT);
			setState(1515); typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleElementAnnotationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public SingleElementAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleElementAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSingleElementAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSingleElementAnnotation(this);
		}
	}

	public final SingleElementAnnotationContext singleElementAnnotation() throws RecognitionException {
		SingleElementAnnotationContext _localctx = new SingleElementAnnotationContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_singleElementAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1517); match(AT);
			setState(1518); typeName();
			setState(1519); match(LPAREN);
			setState(1520); elementValue();
			setState(1521); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public VariableInitializerListContext variableInitializerList() {
			return getRuleContext(VariableInitializerListContext.class,0);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_arrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523); match(LBRACE);
			setState(1525);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(1524); variableInitializerList();
				}
			}

			setState(1528);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1527); match(COMMA);
				}
			}

			setState(1530); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerListContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public VariableInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterVariableInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitVariableInitializerList(this);
		}
	}

	public final VariableInitializerListContext variableInitializerList() throws RecognitionException {
		VariableInitializerListContext _localctx = new VariableInitializerListContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_variableInitializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1532); variableInitializer();
			setState(1537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1533); match(COMMA);
					setState(1534); variableInitializer();
					}
					} 
				}
				setState(1539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,162,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540); match(LBRACE);
			setState(1542);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				setState(1541); blockStatements();
				}
			}

			setState(1544); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementsContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatements(this);
		}
	}

	public final BlockStatementsContext blockStatements() throws RecognitionException {
		BlockStatementsContext _localctx = new BlockStatementsContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_blockStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1546); blockStatement();
			setState(1550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CLASS) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SHORT) | (1L << STATIC) | (1L << STRICTFP) | (1L << SUPER) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THIS) | (1L << THROW) | (1L << TRY) | (1L << VOID) | (1L << WHILE) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN) | (1L << LBRACE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SEMI - 64)) | (1L << (INC - 64)) | (1L << (DEC - 64)) | (1L << (Identifier - 64)) | (1L << (AT - 64)))) != 0)) {
				{
				{
				setState(1547); blockStatement();
				}
				}
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_blockStatement);
		try {
			setState(1556);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1553); localVariableDeclarationStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1554); classDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1555); statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1558); localVariableDeclaration();
			setState(1559); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorListContext variableDeclaratorList() {
			return getRuleContext(VariableDeclaratorListContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_localVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1561); variableModifier();
				}
				}
				setState(1566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1567); unannType();
			setState(1568); variableDeclaratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IfThenStatementContext ifThenStatement() {
			return getRuleContext(IfThenStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public IfThenElseStatementContext ifThenElseStatement() {
			return getRuleContext(IfThenElseStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_statement);
		try {
			setState(1576);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1570); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1571); labeledStatement();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1572); ifThenStatement();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1573); ifThenElseStatement();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1574); whileStatement();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1575); forStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementNoShortIfContext extends ParserRuleContext {
		public ForStatementNoShortIfContext forStatementNoShortIf() {
			return getRuleContext(ForStatementNoShortIfContext.class,0);
		}
		public WhileStatementNoShortIfContext whileStatementNoShortIf() {
			return getRuleContext(WhileStatementNoShortIfContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() {
			return getRuleContext(IfThenElseStatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext labeledStatementNoShortIf() {
			return getRuleContext(LabeledStatementNoShortIfContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() {
			return getRuleContext(StatementWithoutTrailingSubstatementContext.class,0);
		}
		public StatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementNoShortIf(this);
		}
	}

	public final StatementNoShortIfContext statementNoShortIf() throws RecognitionException {
		StatementNoShortIfContext _localctx = new StatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_statementNoShortIf);
		try {
			setState(1583);
			switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1578); statementWithoutTrailingSubstatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1579); labeledStatementNoShortIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1580); ifThenElseStatementNoShortIf();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1581); whileStatementNoShortIf();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1582); forStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWithoutTrailingSubstatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public TryStatementContext tryStatement() {
			return getRuleContext(TryStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SynchronizedStatementContext synchronizedStatement() {
			return getRuleContext(SynchronizedStatementContext.class,0);
		}
		public AssertStatementContext assertStatement() {
			return getRuleContext(AssertStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public StatementWithoutTrailingSubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithoutTrailingSubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementWithoutTrailingSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementWithoutTrailingSubstatement(this);
		}
	}

	public final StatementWithoutTrailingSubstatementContext statementWithoutTrailingSubstatement() throws RecognitionException {
		StatementWithoutTrailingSubstatementContext _localctx = new StatementWithoutTrailingSubstatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_statementWithoutTrailingSubstatement);
		try {
			setState(1597);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1585); block();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 2);
				{
				setState(1586); emptyStatement();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case INC:
			case DEC:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1587); expressionStatement();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1588); assertStatement();
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1589); switchStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 6);
				{
				setState(1590); doStatement();
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 7);
				{
				setState(1591); breakStatement();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1592); continueStatement();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 9);
				{
				setState(1593); returnStatement();
				}
				break;
			case SYNCHRONIZED:
				enterOuterAlt(_localctx, 10);
				{
				setState(1594); synchronizedStatement();
				}
				break;
			case THROW:
				enterOuterAlt(_localctx, 11);
				{
				setState(1595); throwStatement();
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 12);
				{
				setState(1596); tryStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_labeledStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1601); match(Identifier);
			setState(1602); match(COLON);
			setState(1603); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementNoShortIfContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public LabeledStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLabeledStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLabeledStatementNoShortIf(this);
		}
	}

	public final LabeledStatementNoShortIfContext labeledStatementNoShortIf() throws RecognitionException {
		LabeledStatementNoShortIfContext _localctx = new LabeledStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_labeledStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1605); match(Identifier);
			setState(1606); match(COLON);
			setState(1607); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpressionStatement(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609); statementExpression();
			setState(1610); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public PostDecrementExpressionContext postDecrementExpression() {
			return getRuleContext(PostDecrementExpressionContext.class,0);
		}
		public PostIncrementExpressionContext postIncrementExpression() {
			return getRuleContext(PostIncrementExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_statementExpression);
		try {
			setState(1619);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1612); assignment();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1613); preIncrementExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1614); preDecrementExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1615); postIncrementExpression();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1616); postDecrementExpression();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1617); methodInvocation();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1618); classInstanceCreationExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenStatement(this);
		}
	}

	public final IfThenStatementContext ifThenStatement() throws RecognitionException {
		IfThenStatementContext _localctx = new IfThenStatementContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ifThenStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621); match(IF);
			setState(1622); match(LPAREN);
			setState(1623); expression();
			setState(1624); match(RPAREN);
			setState(1625); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatement(this);
		}
	}

	public final IfThenElseStatementContext ifThenElseStatement() throws RecognitionException {
		IfThenElseStatementContext _localctx = new IfThenElseStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ifThenElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627); match(IF);
			setState(1628); match(LPAREN);
			setState(1629); expression();
			setState(1630); match(RPAREN);
			setState(1631); statementNoShortIf();
			setState(1632); match(ELSE);
			setState(1633); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfThenElseStatementNoShortIfContext extends ParserRuleContext {
		public List<StatementNoShortIfContext> statementNoShortIf() {
			return getRuleContexts(StatementNoShortIfContext.class);
		}
		public StatementNoShortIfContext statementNoShortIf(int i) {
			return getRuleContext(StatementNoShortIfContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfThenElseStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifThenElseStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterIfThenElseStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitIfThenElseStatementNoShortIf(this);
		}
	}

	public final IfThenElseStatementNoShortIfContext ifThenElseStatementNoShortIf() throws RecognitionException {
		IfThenElseStatementNoShortIfContext _localctx = new IfThenElseStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ifThenElseStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635); match(IF);
			setState(1636); match(LPAREN);
			setState(1637); expression();
			setState(1638); match(RPAREN);
			setState(1639); statementNoShortIf();
			setState(1640); match(ELSE);
			setState(1641); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssertStatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssertStatement(this);
		}
	}

	public final AssertStatementContext assertStatement() throws RecognitionException {
		AssertStatementContext _localctx = new AssertStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_assertStatement);
		try {
			setState(1653);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1643); match(ASSERT);
				setState(1644); expression();
				setState(1645); match(SEMI);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1647); match(ASSERT);
				setState(1648); expression();
				setState(1649); match(COLON);
				setState(1650); expression();
				setState(1651); match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655); match(SWITCH);
			setState(1656); match(LPAREN);
			setState(1657); expression();
			setState(1658); match(RPAREN);
			setState(1659); switchBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockContext extends ParserRuleContext {
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlock(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_switchBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1661); match(LBRACE);
			setState(1665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1662); switchBlockStatementGroup();
					}
					} 
				}
				setState(1667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			setState(1671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1668); switchLabel();
				}
				}
				setState(1673);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1674); match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public SwitchLabelsContext switchLabels() {
			return getRuleContext(SwitchLabelsContext.class,0);
		}
		public BlockStatementsContext blockStatements() {
			return getRuleContext(BlockStatementsContext.class,0);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_switchBlockStatementGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1676); switchLabels();
			setState(1677); blockStatements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelsContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabels(this);
		}
	}

	public final SwitchLabelsContext switchLabels() throws RecognitionException {
		SwitchLabelsContext _localctx = new SwitchLabelsContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_switchLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1679); switchLabel();
			setState(1683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE || _la==DEFAULT) {
				{
				{
				setState(1680); switchLabel();
				}
				}
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_switchLabel);
		try {
			setState(1696);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1686); match(CASE);
				setState(1687); constantExpression();
				setState(1688); match(COLON);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1690); match(CASE);
				setState(1691); enumConstantName();
				setState(1692); match(COLON);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1694); match(DEFAULT);
				setState(1695); match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700); match(WHILE);
			setState(1701); match(LPAREN);
			setState(1702); expression();
			setState(1703); match(RPAREN);
			setState(1704); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementNoShortIfContext extends ParserRuleContext {
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterWhileStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitWhileStatementNoShortIf(this);
		}
	}

	public final WhileStatementNoShortIfContext whileStatementNoShortIf() throws RecognitionException {
		WhileStatementNoShortIfContext _localctx = new WhileStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_whileStatementNoShortIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706); match(WHILE);
			setState(1707); match(LPAREN);
			setState(1708); expression();
			setState(1709); match(RPAREN);
			setState(1710); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712); match(DO);
			setState(1713); statement();
			setState(1714); match(WHILE);
			setState(1715); match(LPAREN);
			setState(1716); expression();
			setState(1717); match(RPAREN);
			setState(1718); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public BasicForStatementContext basicForStatement() {
			return getRuleContext(BasicForStatementContext.class,0);
		}
		public EnhancedForStatementContext enhancedForStatement() {
			return getRuleContext(EnhancedForStatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_forStatement);
		try {
			setState(1722);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1720); basicForStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1721); enhancedForStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementNoShortIfContext extends ParserRuleContext {
		public BasicForStatementNoShortIfContext basicForStatementNoShortIf() {
			return getRuleContext(BasicForStatementNoShortIfContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() {
			return getRuleContext(EnhancedForStatementNoShortIfContext.class,0);
		}
		public ForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForStatementNoShortIf(this);
		}
	}

	public final ForStatementNoShortIfContext forStatementNoShortIf() throws RecognitionException {
		ForStatementNoShortIfContext _localctx = new ForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_forStatementNoShortIf);
		try {
			setState(1726);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1724); basicForStatementNoShortIf();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1725); enhancedForStatementNoShortIf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatement(this);
		}
	}

	public final BasicForStatementContext basicForStatement() throws RecognitionException {
		BasicForStatementContext _localctx = new BasicForStatementContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_basicForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728); match(FOR);
			setState(1729); match(LPAREN);
			setState(1731);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INC - 80)) | (1L << (DEC - 80)) | (1L << (Identifier - 80)) | (1L << (AT - 80)))) != 0)) {
				{
				setState(1730); forInit();
				}
			}

			setState(1733); match(SEMI);
			setState(1735);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(1734); expression();
				}
			}

			setState(1737); match(SEMI);
			setState(1739);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INC - 80)) | (1L << (DEC - 80)) | (1L << (Identifier - 80)) | (1L << (AT - 80)))) != 0)) {
				{
				setState(1738); forUpdate();
				}
			}

			setState(1741); match(RPAREN);
			setState(1742); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicForStatementNoShortIfContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BasicForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBasicForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBasicForStatementNoShortIf(this);
		}
	}

	public final BasicForStatementNoShortIfContext basicForStatementNoShortIf() throws RecognitionException {
		BasicForStatementNoShortIfContext _localctx = new BasicForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_basicForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744); match(FOR);
			setState(1745); match(LPAREN);
			setState(1747);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INC - 80)) | (1L << (DEC - 80)) | (1L << (Identifier - 80)) | (1L << (AT - 80)))) != 0)) {
				{
				setState(1746); forInit();
				}
			}

			setState(1749); match(SEMI);
			setState(1751);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(1750); expression();
				}
			}

			setState(1753); match(SEMI);
			setState(1755);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (INC - 80)) | (1L << (DEC - 80)) | (1L << (Identifier - 80)) | (1L << (AT - 80)))) != 0)) {
				{
				setState(1754); forUpdate();
				}
			}

			setState(1757); match(RPAREN);
			setState(1758); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_forInit);
		try {
			setState(1762);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1760); statementExpressionList();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1761); localVariableDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public StatementExpressionListContext statementExpressionList() {
			return getRuleContext(StatementExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764); statementExpressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionListContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public StatementExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterStatementExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitStatementExpressionList(this);
		}
	}

	public final StatementExpressionListContext statementExpressionList() throws RecognitionException {
		StatementExpressionListContext _localctx = new StatementExpressionListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_statementExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766); statementExpression();
			setState(1771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1767); match(COMMA);
				setState(1768); statementExpression();
				}
				}
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatement(this);
		}
	}

	public final EnhancedForStatementContext enhancedForStatement() throws RecognitionException {
		EnhancedForStatementContext _localctx = new EnhancedForStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_enhancedForStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774); match(FOR);
			setState(1775); match(LPAREN);
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1776); variableModifier();
				}
				}
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1782); unannType();
			setState(1783); variableDeclaratorId();
			setState(1784); match(COLON);
			setState(1785); expression();
			setState(1786); match(RPAREN);
			setState(1787); statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForStatementNoShortIfContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public StatementNoShortIfContext statementNoShortIf() {
			return getRuleContext(StatementNoShortIfContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnhancedForStatementNoShortIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForStatementNoShortIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEnhancedForStatementNoShortIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEnhancedForStatementNoShortIf(this);
		}
	}

	public final EnhancedForStatementNoShortIfContext enhancedForStatementNoShortIf() throws RecognitionException {
		EnhancedForStatementNoShortIfContext _localctx = new EnhancedForStatementNoShortIfContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enhancedForStatementNoShortIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1789); match(FOR);
			setState(1790); match(LPAREN);
			setState(1794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1791); variableModifier();
				}
				}
				setState(1796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1797); unannType();
			setState(1798); variableDeclaratorId();
			setState(1799); match(COLON);
			setState(1800); expression();
			setState(1801); match(RPAREN);
			setState(1802); statementNoShortIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804); match(BREAK);
			setState(1806);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1805); match(Identifier);
				}
			}

			setState(1808); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810); match(CONTINUE);
			setState(1812);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(1811); match(Identifier);
				}
			}

			setState(1814); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1816); match(RETURN);
			setState(1818);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(1817); expression();
				}
			}

			setState(1820); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822); match(THROW);
			setState(1823); expression();
			setState(1824); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SynchronizedStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SynchronizedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synchronizedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterSynchronizedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitSynchronizedStatement(this);
		}
	}

	public final SynchronizedStatementContext synchronizedStatement() throws RecognitionException {
		SynchronizedStatementContext _localctx = new SynchronizedStatementContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_synchronizedStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1826); match(SYNCHRONIZED);
			setState(1827); match(LPAREN);
			setState(1828); expression();
			setState(1829); match(RPAREN);
			setState(1830); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext tryWithResourcesStatement() {
			return getRuleContext(TryWithResourcesStatementContext.class,0);
		}
		public TryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryStatement(this);
		}
	}

	public final TryStatementContext tryStatement() throws RecognitionException {
		TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tryStatement);
		int _la;
		try {
			setState(1844);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1832); match(TRY);
				setState(1833); block();
				setState(1834); catches();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1836); match(TRY);
				setState(1837); block();
				setState(1839);
				_la = _input.LA(1);
				if (_la==CATCH) {
					{
					setState(1838); catches();
					}
				}

				setState(1841); finally_();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1843); tryWithResourcesStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchesContext extends ParserRuleContext {
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatches(this);
		}
	}

	public final CatchesContext catches() throws RecognitionException {
		CatchesContext _localctx = new CatchesContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_catches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1846); catchClause();
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CATCH) {
				{
				{
				setState(1847); catchClause();
				}
				}
				setState(1852);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CatchFormalParameterContext catchFormalParameter() {
			return getRuleContext(CatchFormalParameterContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_catchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853); match(CATCH);
			setState(1854); match(LPAREN);
			setState(1855); catchFormalParameter();
			setState(1856); match(RPAREN);
			setState(1857); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchFormalParameterContext extends ParserRuleContext {
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public CatchFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchFormalParameter(this);
		}
	}

	public final CatchFormalParameterContext catchFormalParameter() throws RecognitionException {
		CatchFormalParameterContext _localctx = new CatchFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_catchFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1859); variableModifier();
				}
				}
				setState(1864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1865); catchType();
			setState(1866); variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public UnannClassTypeContext unannClassType() {
			return getRuleContext(UnannClassTypeContext.class,0);
		}
		public ClassTypeContext classType(int i) {
			return getRuleContext(ClassTypeContext.class,i);
		}
		public List<ClassTypeContext> classType() {
			return getRuleContexts(ClassTypeContext.class);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1868); unannClassType();
			setState(1873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1869); match(BITOR);
				setState(1870); classType();
				}
				}
				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Finally_Context extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Finally_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finally_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFinally_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFinally_(this);
		}
	}

	public final Finally_Context finally_() throws RecognitionException {
		Finally_Context _localctx = new Finally_Context(_ctx, getState());
		enterRule(_localctx, 342, RULE_finally_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876); match(FINALLY);
			setState(1877); block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryWithResourcesStatementContext extends ParserRuleContext {
		public CatchesContext catches() {
			return getRuleContext(CatchesContext.class,0);
		}
		public Finally_Context finally_() {
			return getRuleContext(Finally_Context.class,0);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TryWithResourcesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryWithResourcesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTryWithResourcesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTryWithResourcesStatement(this);
		}
	}

	public final TryWithResourcesStatementContext tryWithResourcesStatement() throws RecognitionException {
		TryWithResourcesStatementContext _localctx = new TryWithResourcesStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_tryWithResourcesStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879); match(TRY);
			setState(1880); resourceSpecification();
			setState(1881); block();
			setState(1883);
			_la = _input.LA(1);
			if (_la==CATCH) {
				{
				setState(1882); catches();
				}
			}

			setState(1886);
			_la = _input.LA(1);
			if (_la==FINALLY) {
				{
				setState(1885); finally_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourceListContext resourceList() {
			return getRuleContext(ResourceListContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888); match(LPAREN);
			setState(1889); resourceList();
			setState(1891);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1890); match(SEMI);
				}
			}

			setState(1893); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceListContext extends ParserRuleContext {
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResourceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResourceList(this);
		}
	}

	public final ResourceListContext resourceList() throws RecognitionException {
		ResourceListContext _localctx = new ResourceListContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_resourceList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1895); resource();
			setState(1900);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1896); match(SEMI);
					setState(1897); resource();
					}
					} 
				}
				setState(1902);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public UnannTypeContext unannType() {
			return getRuleContext(UnannTypeContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==AT) {
				{
				{
				setState(1903); variableModifier();
				}
				}
				setState(1908);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1909); unannType();
			setState(1910); variableDeclaratorId();
			setState(1911); match(ASSIGN);
			setState(1912); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primaryContext.class,i);
		}
		public PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primaryContext.class,0);
		}
		public ArrayCreationExpressionContext arrayCreationExpression() {
			return getRuleContext(ArrayCreationExpressionContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_primaryContext> primaryNoNewArray_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primaryContext.class);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1914); primaryNoNewArray_lfno_primary();
				}
				break;

			case 2:
				{
				setState(1915); arrayCreationExpression();
				}
				break;
			}
			setState(1921);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1918); primaryNoNewArray_lf_primary();
					}
					} 
				}
				setState(1923);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArrayContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray(this);
		}
	}

	public final PrimaryNoNewArrayContext primaryNoNewArray() throws RecognitionException {
		PrimaryNoNewArrayContext _localctx = new PrimaryNoNewArrayContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_primaryNoNewArray);
		int _la;
		try {
			setState(1953);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1924); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1925); typeName();
				setState(1930);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1926); match(LBRACK);
					setState(1927); match(RBRACK);
					}
					}
					setState(1932);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1933); match(DOT);
				setState(1934); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1936); match(VOID);
				setState(1937); match(DOT);
				setState(1938); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1939); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1940); typeName();
				setState(1941); match(DOT);
				setState(1942); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1944); match(LPAREN);
				setState(1945); expression();
				setState(1946); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1948); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1949); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1950); arrayAccess();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1951); methodInvocation();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1952); methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_arrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lf_arrayAccessContext _localctx = new PrimaryNoNewArray_lf_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_primaryNoNewArray_lf_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_arrayAccessContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public MethodReferenceContext methodReference() {
			return getRuleContext(MethodReferenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClassInstanceCreationExpressionContext classInstanceCreationExpression() {
			return getRuleContext(ClassInstanceCreationExpressionContext.class,0);
		}
		public PrimaryNoNewArray_lfno_arrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_arrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_arrayAccess(this);
		}
	}

	public final PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() throws RecognitionException {
		PrimaryNoNewArray_lfno_arrayAccessContext _localctx = new PrimaryNoNewArray_lfno_arrayAccessContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryNoNewArray_lfno_arrayAccess);
		int _la;
		try {
			setState(1985);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1957); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958); typeName();
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1959); match(LBRACK);
					setState(1960); match(RBRACK);
					}
					}
					setState(1965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1966); match(DOT);
				setState(1967); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1969); match(VOID);
				setState(1970); match(DOT);
				setState(1971); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1972); match(THIS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1973); typeName();
				setState(1974); match(DOT);
				setState(1975); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1977); match(LPAREN);
				setState(1978); expression();
				setState(1979); match(RPAREN);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1981); classInstanceCreationExpression();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1982); fieldAccess();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1983); methodInvocation();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1984); methodReference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public ArrayAccess_lf_primaryContext arrayAccess_lf_primary() {
			return getRuleContext(ArrayAccess_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primaryContext primaryNoNewArray_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_primaryNoNewArray_lf_primary);
		try {
			setState(1992);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1987); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1988); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1989); arrayAccess_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1990); methodInvocation_lf_primary();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1991); methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext extends ParserRuleContext {
		public ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lf_primaryContext.class,0);
		}
		public MethodReference_lf_primaryContext methodReference_lf_primary() {
			return getRuleContext(MethodReference_lf_primaryContext.class,0);
		}
		public MethodInvocation_lf_primaryContext methodInvocation_lf_primary() {
			return getRuleContext(MethodInvocation_lf_primaryContext.class,0);
		}
		public FieldAccess_lf_primaryContext fieldAccess_lf_primary() {
			return getRuleContext(FieldAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(this);
		}
	}

	public final PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() throws RecognitionException {
		PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext _localctx = new PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary);
		try {
			setState(2000);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996); classInstanceCreationExpression_lf_primary();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997); fieldAccess_lf_primary();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1998); methodInvocation_lf_primary();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1999); methodReference_lf_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() {
			return getRuleContext(ArrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primaryContext primaryNoNewArray_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_primaryNoNewArray_lfno_primary);
		int _la;
		try {
			setState(2042);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2002); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2003); typeName();
				setState(2008);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2004); match(LBRACK);
					setState(2005); match(RBRACK);
					}
					}
					setState(2010);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2011); match(DOT);
				setState(2012); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2014); unannPrimitiveType();
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2015); match(LBRACK);
					setState(2016); match(RBRACK);
					}
					}
					setState(2021);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2022); match(DOT);
				setState(2023); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2025); match(VOID);
				setState(2026); match(DOT);
				setState(2027); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2028); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2029); typeName();
				setState(2030); match(DOT);
				setState(2031); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2033); match(LPAREN);
				setState(2034); expression();
				setState(2035); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2037); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2038); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2039); arrayAccess_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2040); methodInvocation_lfno_primary();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2041); methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext extends ParserRuleContext {
		public FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() {
			return getRuleContext(FieldAccess_lfno_primaryContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() {
			return getRuleContext(ClassInstanceCreationExpression_lfno_primaryContext.class,0);
		}
		public MethodReference_lfno_primaryContext methodReference_lfno_primary() {
			return getRuleContext(MethodReference_lfno_primaryContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnannPrimitiveTypeContext unannPrimitiveType() {
			return getRuleContext(UnannPrimitiveTypeContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() {
			return getRuleContext(MethodInvocation_lfno_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(this);
		}
	}

	public final PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() throws RecognitionException {
		PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext _localctx = new PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary);
		int _la;
		try {
			setState(2085);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2046); literal();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2047); typeName();
				setState(2052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2048); match(LBRACK);
					setState(2049); match(RBRACK);
					}
					}
					setState(2054);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2055); match(DOT);
				setState(2056); match(CLASS);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2058); unannPrimitiveType();
				setState(2063);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(2059); match(LBRACK);
					setState(2060); match(RBRACK);
					}
					}
					setState(2065);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2066); match(DOT);
				setState(2067); match(CLASS);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2069); match(VOID);
				setState(2070); match(DOT);
				setState(2071); match(CLASS);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2072); match(THIS);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2073); typeName();
				setState(2074); match(DOT);
				setState(2075); match(THIS);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2077); match(LPAREN);
				setState(2078); expression();
				setState(2079); match(RPAREN);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2081); classInstanceCreationExpression_lfno_primary();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2082); fieldAccess_lfno_primary();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2083); methodInvocation_lfno_primary();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2084); methodReference_lfno_primary();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpressionContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression(this);
		}
	}

	public final ClassInstanceCreationExpressionContext classInstanceCreationExpression() throws RecognitionException {
		ClassInstanceCreationExpressionContext _localctx = new ClassInstanceCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_classInstanceCreationExpression);
		int _la;
		try {
			setState(2170);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2087); match(NEW);
				setState(2089);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2088); typeArguments();
					}
				}

				setState(2094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2091); annotation();
					}
					}
					setState(2096);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2097); match(Identifier);
				setState(2108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2098); match(DOT);
					setState(2102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2099); annotation();
						}
						}
						setState(2104);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2105); match(Identifier);
					}
					}
					setState(2110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2112);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2111); typeArgumentsOrDiamond();
					}
				}

				setState(2114); match(LPAREN);
				setState(2116);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2115); argumentList();
					}
				}

				setState(2118); match(RPAREN);
				setState(2120);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2119); classBody();
					}
				}

				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2122); expressionName();
				setState(2123); match(DOT);
				setState(2124); match(NEW);
				setState(2126);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2125); typeArguments();
					}
				}

				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2128); annotation();
					}
					}
					setState(2133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2134); match(Identifier);
				setState(2136);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2135); typeArgumentsOrDiamond();
					}
				}

				setState(2138); match(LPAREN);
				setState(2140);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2139); argumentList();
					}
				}

				setState(2142); match(RPAREN);
				setState(2144);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2143); classBody();
					}
				}

				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2146); primary();
				setState(2147); match(DOT);
				setState(2148); match(NEW);
				setState(2150);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2149); typeArguments();
					}
				}

				setState(2155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2152); annotation();
					}
					}
					setState(2157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2158); match(Identifier);
				setState(2160);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2159); typeArgumentsOrDiamond();
					}
				}

				setState(2162); match(LPAREN);
				setState(2164);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2163); argumentList();
					}
				}

				setState(2166); match(RPAREN);
				setState(2168);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(2167); classBody();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lf_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lf_primaryContext classInstanceCreationExpression_lf_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lf_primaryContext _localctx = new ClassInstanceCreationExpression_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_classInstanceCreationExpression_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2172); match(DOT);
			setState(2173); match(NEW);
			setState(2175);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2174); typeArguments();
				}
			}

			setState(2180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2177); annotation();
				}
				}
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2183); match(Identifier);
			setState(2185);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2184); typeArgumentsOrDiamond();
				}
			}

			setState(2187); match(LPAREN);
			setState(2189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(2188); argumentList();
				}
			}

			setState(2191); match(RPAREN);
			setState(2193);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(2192); classBody();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassInstanceCreationExpression_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public ClassInstanceCreationExpression_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classInstanceCreationExpression_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterClassInstanceCreationExpression_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitClassInstanceCreationExpression_lfno_primary(this);
		}
	}

	public final ClassInstanceCreationExpression_lfno_primaryContext classInstanceCreationExpression_lfno_primary() throws RecognitionException {
		ClassInstanceCreationExpression_lfno_primaryContext _localctx = new ClassInstanceCreationExpression_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_classInstanceCreationExpression_lfno_primary);
		int _la;
		try {
			setState(2254);
			switch (_input.LA(1)) {
			case NEW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2195); match(NEW);
				setState(2197);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2196); typeArguments();
					}
				}

				setState(2202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2199); annotation();
					}
					}
					setState(2204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2205); match(Identifier);
				setState(2216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(2206); match(DOT);
					setState(2210);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==AT) {
						{
						{
						setState(2207); annotation();
						}
						}
						setState(2212);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2213); match(Identifier);
					}
					}
					setState(2218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2220);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2219); typeArgumentsOrDiamond();
					}
				}

				setState(2222); match(LPAREN);
				setState(2224);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2223); argumentList();
					}
				}

				setState(2226); match(RPAREN);
				setState(2228);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2227); classBody();
					}
					break;
				}
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2230); expressionName();
				setState(2231); match(DOT);
				setState(2232); match(NEW);
				setState(2234);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2233); typeArguments();
					}
				}

				setState(2239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT) {
					{
					{
					setState(2236); annotation();
					}
					}
					setState(2241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2242); match(Identifier);
				setState(2244);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2243); typeArgumentsOrDiamond();
					}
				}

				setState(2246); match(LPAREN);
				setState(2248);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2247); argumentList();
					}
				}

				setState(2250); match(RPAREN);
				setState(2252);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2251); classBody();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_typeArgumentsOrDiamond);
		try {
			setState(2259);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2256); typeArguments();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2257); match(LT);
				setState(2258); match(GT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FieldAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess(this);
		}
	}

	public final FieldAccessContext fieldAccess() throws RecognitionException {
		FieldAccessContext _localctx = new FieldAccessContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_fieldAccess);
		try {
			setState(2274);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2261); primary();
				setState(2262); match(DOT);
				setState(2263); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2265); match(SUPER);
				setState(2266); match(DOT);
				setState(2267); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2268); typeName();
				setState(2269); match(DOT);
				setState(2270); match(SUPER);
				setState(2271); match(DOT);
				setState(2272); match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lf_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FieldAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lf_primary(this);
		}
	}

	public final FieldAccess_lf_primaryContext fieldAccess_lf_primary() throws RecognitionException {
		FieldAccess_lf_primaryContext _localctx = new FieldAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_fieldAccess_lf_primary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2276); match(DOT);
			setState(2277); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldAccess_lfno_primaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public FieldAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterFieldAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitFieldAccess_lfno_primary(this);
		}
	}

	public final FieldAccess_lfno_primaryContext fieldAccess_lfno_primary() throws RecognitionException {
		FieldAccess_lfno_primaryContext _localctx = new FieldAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_fieldAccess_lfno_primary);
		try {
			setState(2288);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2279); match(SUPER);
				setState(2280); match(DOT);
				setState(2281); match(Identifier);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(2282); typeName();
				setState(2283); match(DOT);
				setState(2284); match(SUPER);
				setState(2285); match(DOT);
				setState(2286); match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccessContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_arrayAccessContext primaryNoNewArray_lfno_arrayAccess() {
			return getRuleContext(PrimaryNoNewArray_lfno_arrayAccessContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryNoNewArray_lf_arrayAccessContext primaryNoNewArray_lf_arrayAccess(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_arrayAccessContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public List<PrimaryNoNewArray_lf_arrayAccessContext> primaryNoNewArray_lf_arrayAccess() {
			return getRuleContexts(PrimaryNoNewArray_lf_arrayAccessContext.class);
		}
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_arrayAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				{
				setState(2290); expressionName();
				setState(2291); match(LBRACK);
				setState(2292); expression();
				setState(2293); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2295); primaryNoNewArray_lfno_arrayAccess();
				setState(2296); match(LBRACK);
				setState(2297); expression();
				setState(2298); match(RBRACK);
				}
				break;
			}
			setState(2309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(2302); primaryNoNewArray_lf_arrayAccess();
				setState(2303); match(LBRACK);
				setState(2304); expression();
				setState(2305); match(RBRACK);
				}
				}
				setState(2311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lf_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary() {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext.class,0);
		}
		public PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class,i);
		}
		public List<PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext> primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary() {
			return getRuleContexts(PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArrayAccess_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lf_primary(this);
		}
	}

	public final ArrayAccess_lf_primaryContext arrayAccess_lf_primary() throws RecognitionException {
		ArrayAccess_lf_primaryContext _localctx = new ArrayAccess_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_arrayAccess_lf_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2312); primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary();
			setState(2313); match(LBRACK);
			setState(2314); expression();
			setState(2315); match(RBRACK);
			}
			setState(2324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2317); primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary();
					setState(2318); match(LBRACK);
					setState(2319); expression();
					setState(2320); match(RBRACK);
					}
					} 
				}
				setState(2326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,256,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayAccess_lfno_primaryContext extends ParserRuleContext {
		public PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary() {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext> primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary() {
			return getRuleContexts(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class);
		}
		public PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(int i) {
			return getRuleContext(PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArrayAccess_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayAccess_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayAccess_lfno_primary(this);
		}
	}

	public final ArrayAccess_lfno_primaryContext arrayAccess_lfno_primary() throws RecognitionException {
		ArrayAccess_lfno_primaryContext _localctx = new ArrayAccess_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_arrayAccess_lfno_primary);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2337);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				{
				setState(2327); expressionName();
				setState(2328); match(LBRACK);
				setState(2329); expression();
				setState(2330); match(RBRACK);
				}
				break;

			case 2:
				{
				setState(2332); primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary();
				setState(2333); match(LBRACK);
				setState(2334); expression();
				setState(2335); match(RBRACK);
				}
				break;
			}
			setState(2346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2339); primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary();
					setState(2340); match(LBRACK);
					setState(2341); expression();
					setState(2342); match(RBRACK);
					}
					} 
				}
				setState(2348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,258,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocationContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_methodInvocation);
		int _la;
		try {
			setState(2417);
			switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2349); methodName();
				setState(2350); match(LPAREN);
				setState(2352);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2351); argumentList();
					}
				}

				setState(2354); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2356); typeName();
				setState(2357); match(DOT);
				setState(2359);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2358); typeArguments();
					}
				}

				setState(2361); match(Identifier);
				setState(2362); match(LPAREN);
				setState(2364);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2363); argumentList();
					}
				}

				setState(2366); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2368); expressionName();
				setState(2369); match(DOT);
				setState(2371);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2370); typeArguments();
					}
				}

				setState(2373); match(Identifier);
				setState(2374); match(LPAREN);
				setState(2376);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2375); argumentList();
					}
				}

				setState(2378); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2380); primary();
				setState(2381); match(DOT);
				setState(2383);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2382); typeArguments();
					}
				}

				setState(2385); match(Identifier);
				setState(2386); match(LPAREN);
				setState(2388);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2387); argumentList();
					}
				}

				setState(2390); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2392); match(SUPER);
				setState(2393); match(DOT);
				setState(2395);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2394); typeArguments();
					}
				}

				setState(2397); match(Identifier);
				setState(2398); match(LPAREN);
				setState(2400);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2399); argumentList();
					}
				}

				setState(2402); match(RPAREN);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2403); typeName();
				setState(2404); match(DOT);
				setState(2405); match(SUPER);
				setState(2406); match(DOT);
				setState(2408);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2407); typeArguments();
					}
				}

				setState(2410); match(Identifier);
				setState(2411); match(LPAREN);
				setState(2413);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2412); argumentList();
					}
				}

				setState(2415); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lf_primary(this);
		}
	}

	public final MethodInvocation_lf_primaryContext methodInvocation_lf_primary() throws RecognitionException {
		MethodInvocation_lf_primaryContext _localctx = new MethodInvocation_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_methodInvocation_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2419); match(DOT);
			setState(2421);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2420); typeArguments();
				}
			}

			setState(2423); match(Identifier);
			setState(2424); match(LPAREN);
			setState(2426);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
				{
				setState(2425); argumentList();
				}
			}

			setState(2428); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodInvocation_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public MethodInvocation_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodInvocation_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodInvocation_lfno_primary(this);
		}
	}

	public final MethodInvocation_lfno_primaryContext methodInvocation_lfno_primary() throws RecognitionException {
		MethodInvocation_lfno_primaryContext _localctx = new MethodInvocation_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_methodInvocation_lfno_primary);
		int _la;
		try {
			setState(2486);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2430); methodName();
				setState(2431); match(LPAREN);
				setState(2433);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2432); argumentList();
					}
				}

				setState(2435); match(RPAREN);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2437); typeName();
				setState(2438); match(DOT);
				setState(2440);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2439); typeArguments();
					}
				}

				setState(2442); match(Identifier);
				setState(2443); match(LPAREN);
				setState(2445);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2444); argumentList();
					}
				}

				setState(2447); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2449); expressionName();
				setState(2450); match(DOT);
				setState(2452);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2451); typeArguments();
					}
				}

				setState(2454); match(Identifier);
				setState(2455); match(LPAREN);
				setState(2457);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2456); argumentList();
					}
				}

				setState(2459); match(RPAREN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2461); match(SUPER);
				setState(2462); match(DOT);
				setState(2464);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2463); typeArguments();
					}
				}

				setState(2466); match(Identifier);
				setState(2467); match(LPAREN);
				setState(2469);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2468); argumentList();
					}
				}

				setState(2471); match(RPAREN);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2472); typeName();
				setState(2473); match(DOT);
				setState(2474); match(SUPER);
				setState(2475); match(DOT);
				setState(2477);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2476); typeArguments();
					}
				}

				setState(2479); match(Identifier);
				setState(2480); match(LPAREN);
				setState(2482);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << SHORT) | (1L << SUPER) | (1L << THIS) | (1L << VOID) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral) | (1L << LPAREN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (BANG - 70)) | (1L << (TILDE - 70)) | (1L << (INC - 70)) | (1L << (DEC - 70)) | (1L << (ADD - 70)) | (1L << (SUB - 70)) | (1L << (Identifier - 70)) | (1L << (AT - 70)))) != 0)) {
					{
					setState(2481); argumentList();
					}
				}

				setState(2484); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArgumentList(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2488); expression();
			setState(2493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2489); match(COMMA);
				setState(2490); expression();
				}
				}
				setState(2495);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReferenceContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference(this);
		}
	}

	public final MethodReferenceContext methodReference() throws RecognitionException {
		MethodReferenceContext _localctx = new MethodReferenceContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_methodReference);
		int _la;
		try {
			setState(2543);
			switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2496); expressionName();
				setState(2497); match(COLONCOLON);
				setState(2499);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2498); typeArguments();
					}
				}

				setState(2501); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2503); referenceType();
				setState(2504); match(COLONCOLON);
				setState(2506);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2505); typeArguments();
					}
				}

				setState(2508); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2510); primary();
				setState(2511); match(COLONCOLON);
				setState(2513);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2512); typeArguments();
					}
				}

				setState(2515); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2517); match(SUPER);
				setState(2518); match(COLONCOLON);
				setState(2520);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2519); typeArguments();
					}
				}

				setState(2522); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2523); typeName();
				setState(2524); match(DOT);
				setState(2525); match(SUPER);
				setState(2526); match(COLONCOLON);
				setState(2528);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2527); typeArguments();
					}
				}

				setState(2530); match(Identifier);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2532); classType();
				setState(2533); match(COLONCOLON);
				setState(2535);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2534); typeArguments();
					}
				}

				setState(2537); match(NEW);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2539); arrayType();
				setState(2540); match(COLONCOLON);
				setState(2541); match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lf_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public MethodReference_lf_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lf_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lf_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lf_primary(this);
		}
	}

	public final MethodReference_lf_primaryContext methodReference_lf_primary() throws RecognitionException {
		MethodReference_lf_primaryContext _localctx = new MethodReference_lf_primaryContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_methodReference_lf_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2545); match(COLONCOLON);
			setState(2547);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(2546); typeArguments();
				}
			}

			setState(2549); match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodReference_lfno_primaryContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public ClassTypeContext classType() {
			return getRuleContext(ClassTypeContext.class,0);
		}
		public MethodReference_lfno_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodReference_lfno_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMethodReference_lfno_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMethodReference_lfno_primary(this);
		}
	}

	public final MethodReference_lfno_primaryContext methodReference_lfno_primary() throws RecognitionException {
		MethodReference_lfno_primaryContext _localctx = new MethodReference_lfno_primaryContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_methodReference_lfno_primary);
		int _la;
		try {
			setState(2591);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2551); expressionName();
				setState(2552); match(COLONCOLON);
				setState(2554);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2553); typeArguments();
					}
				}

				setState(2556); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2558); referenceType();
				setState(2559); match(COLONCOLON);
				setState(2561);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2560); typeArguments();
					}
				}

				setState(2563); match(Identifier);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2565); match(SUPER);
				setState(2566); match(COLONCOLON);
				setState(2568);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2567); typeArguments();
					}
				}

				setState(2570); match(Identifier);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2571); typeName();
				setState(2572); match(DOT);
				setState(2573); match(SUPER);
				setState(2574); match(COLONCOLON);
				setState(2576);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2575); typeArguments();
					}
				}

				setState(2578); match(Identifier);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2580); classType();
				setState(2581); match(COLONCOLON);
				setState(2583);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(2582); typeArguments();
					}
				}

				setState(2585); match(NEW);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2587); arrayType();
				setState(2588); match(COLONCOLON);
				setState(2589); match(NEW);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreationExpressionContext extends ParserRuleContext {
		public DimsContext dims() {
			return getRuleContext(DimsContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public DimExprsContext dimExprs() {
			return getRuleContext(DimExprsContext.class,0);
		}
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ArrayCreationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterArrayCreationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitArrayCreationExpression(this);
		}
	}

	public final ArrayCreationExpressionContext arrayCreationExpression() throws RecognitionException {
		ArrayCreationExpressionContext _localctx = new ArrayCreationExpressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_arrayCreationExpression);
		try {
			setState(2615);
			switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2593); match(NEW);
				setState(2594); primitiveType();
				setState(2595); dimExprs();
				setState(2597);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2596); dims();
					}
					break;
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2599); match(NEW);
				setState(2600); classOrInterfaceType();
				setState(2601); dimExprs();
				setState(2603);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2602); dims();
					}
					break;
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2605); match(NEW);
				setState(2606); primitiveType();
				setState(2607); dims();
				setState(2608); arrayInitializer();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2610); match(NEW);
				setState(2611); classOrInterfaceType();
				setState(2612); dims();
				setState(2613); arrayInitializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprsContext extends ParserRuleContext {
		public List<DimExprContext> dimExpr() {
			return getRuleContexts(DimExprContext.class);
		}
		public DimExprContext dimExpr(int i) {
			return getRuleContext(DimExprContext.class,i);
		}
		public DimExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExprs(this);
		}
	}

	public final DimExprsContext dimExprs() throws RecognitionException {
		DimExprsContext _localctx = new DimExprsContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_dimExprs);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2617); dimExpr();
			setState(2621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2618); dimExpr();
					}
					} 
				}
				setState(2623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,301,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimExprContext extends ParserRuleContext {
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DimExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterDimExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitDimExpr(this);
		}
	}

	public final DimExprContext dimExpr() throws RecognitionException {
		DimExprContext _localctx = new DimExprContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_dimExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(2624); annotation();
				}
				}
				setState(2629);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2630); match(LBRACK);
			setState(2631); expression();
			setState(2632); match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2634); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_expression);
		try {
			setState(2638);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2636); lambdaExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2637); assignmentExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaExpressionContext extends ParserRuleContext {
		public LambdaBodyContext lambdaBody() {
			return getRuleContext(LambdaBodyContext.class,0);
		}
		public LambdaParametersContext lambdaParameters() {
			return getRuleContext(LambdaParametersContext.class,0);
		}
		public LambdaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaExpression(this);
		}
	}

	public final LambdaExpressionContext lambdaExpression() throws RecognitionException {
		LambdaExpressionContext _localctx = new LambdaExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_lambdaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2640); lambdaParameters();
			setState(2641); match(ARROW);
			setState(2642); lambdaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaParametersContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(Java8Parser.Identifier, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public InferredFormalParameterListContext inferredFormalParameterList() {
			return getRuleContext(InferredFormalParameterListContext.class,0);
		}
		public LambdaParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaParameters(this);
		}
	}

	public final LambdaParametersContext lambdaParameters() throws RecognitionException {
		LambdaParametersContext _localctx = new LambdaParametersContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_lambdaParameters);
		int _la;
		try {
			setState(2654);
			switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2644); match(Identifier);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2645); match(LPAREN);
				setState(2647);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT))) != 0) || _la==Identifier || _la==AT) {
					{
					setState(2646); formalParameterList();
					}
				}

				setState(2649); match(RPAREN);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2650); match(LPAREN);
				setState(2651); inferredFormalParameterList();
				setState(2652); match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InferredFormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(Java8Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(Java8Parser.Identifier, i);
		}
		public InferredFormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inferredFormalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInferredFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInferredFormalParameterList(this);
		}
	}

	public final InferredFormalParameterListContext inferredFormalParameterList() throws RecognitionException {
		InferredFormalParameterListContext _localctx = new InferredFormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_inferredFormalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2656); match(Identifier);
			setState(2661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2657); match(COMMA);
				setState(2658); match(Identifier);
				}
				}
				setState(2663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LambdaBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LambdaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLambdaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLambdaBody(this);
		}
	}

	public final LambdaBodyContext lambdaBody() throws RecognitionException {
		LambdaBodyContext _localctx = new LambdaBodyContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_lambdaBody);
		try {
			setState(2666);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2664); expression();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2665); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentExpression(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_assignmentExpression);
		try {
			setState(2670);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2668); conditionalExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2669); assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LeftHandSideContext leftHandSide() {
			return getRuleContext(LeftHandSideContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2672); leftHandSide();
			setState(2673); assignmentOperator();
			setState(2674); expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeftHandSideContext extends ParserRuleContext {
		public FieldAccessContext fieldAccess() {
			return getRuleContext(FieldAccessContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public LeftHandSideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftHandSide; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterLeftHandSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitLeftHandSide(this);
		}
	}

	public final LeftHandSideContext leftHandSide() throws RecognitionException {
		LeftHandSideContext _localctx = new LeftHandSideContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_leftHandSide);
		try {
			setState(2679);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2676); expressionName();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2677); fieldAccess();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2678); arrayAccess();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2681);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (ASSIGN - 67)) | (1L << (ADD_ASSIGN - 67)) | (1L << (SUB_ASSIGN - 67)) | (1L << (MUL_ASSIGN - 67)) | (1L << (DIV_ASSIGN - 67)) | (1L << (AND_ASSIGN - 67)) | (1L << (OR_ASSIGN - 67)) | (1L << (XOR_ASSIGN - 67)) | (1L << (MOD_ASSIGN - 67)) | (1L << (LSHIFT_ASSIGN - 67)) | (1L << (RSHIFT_ASSIGN - 67)) | (1L << (URSHIFT_ASSIGN - 67)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalExpression(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_conditionalExpression);
		try {
			setState(2690);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2683); conditionalOrExpression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2684); conditionalOrExpression(0);
				setState(2685); match(QUESTION);
				setState(2686); expression();
				setState(2687); match(COLON);
				setState(2688); conditionalExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOrExpressionContext extends ParserRuleContext {
		public ConditionalOrExpressionContext conditionalOrExpression() {
			return getRuleContext(ConditionalOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalOrExpression(this);
		}
	}

	public final ConditionalOrExpressionContext conditionalOrExpression() throws RecognitionException {
		return conditionalOrExpression(0);
	}

	private ConditionalOrExpressionContext conditionalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalOrExpressionContext _localctx = new ConditionalOrExpressionContext(_ctx, _parentState);
		ConditionalOrExpressionContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_conditionalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2693); conditionalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2700);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalOrExpression);
					setState(2695);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2696); match(OR);
					setState(2697); conditionalAndExpression(0);
					}
					} 
				}
				setState(2702);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,311,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext conditionalAndExpression() {
			return getRuleContext(ConditionalAndExpressionContext.class,0);
		}
		public ConditionalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterConditionalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitConditionalAndExpression(this);
		}
	}

	public final ConditionalAndExpressionContext conditionalAndExpression() throws RecognitionException {
		return conditionalAndExpression(0);
	}

	private ConditionalAndExpressionContext conditionalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalAndExpressionContext _localctx = new ConditionalAndExpressionContext(_ctx, _parentState);
		ConditionalAndExpressionContext _prevctx = _localctx;
		int _startState = 436;
		enterRecursionRule(_localctx, 436, RULE_conditionalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2704); inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2711);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_conditionalAndExpression);
					setState(2706);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2707); match(AND);
					setState(2708); inclusiveOrExpression(0);
					}
					} 
				}
				setState(2713);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitInclusiveOrExpression(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2715); exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2722);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(2717);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2718); match(BITOR);
					setState(2719); exclusiveOrExpression(0);
					}
					} 
				}
				setState(2724);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitExclusiveOrExpression(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 440;
		enterRecursionRule(_localctx, 440, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2726); andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(2728);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2729); match(CARET);
					setState(2730); andExpression(0);
					}
					} 
				}
				setState(2735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAndExpression(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2737); equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(2739);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2740); match(BITAND);
					setState(2741); equalityExpression(0);
					}
					} 
				}
				setState(2746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,315,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitEqualityExpression(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 444;
		enterRecursionRule(_localctx, 444, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2748); relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2756);
					switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2750);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2751); match(EQUAL);
						setState(2752); relationalExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(2753);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2754); match(NOTEQUAL);
						setState(2755); relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(2760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitRelationalExpression(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2762); shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2779);
					switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2764);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2765); match(LT);
						setState(2766); shiftExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2767);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2768); match(GT);
						setState(2769); shiftExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2770);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2771); match(LE);
						setState(2772); shiftExpression(0);
						}
						break;

					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2773);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2774); match(GE);
						setState(2775); shiftExpression(0);
						}
						break;

					case 5:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(2776);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2777); match(INSTANCEOF);
						setState(2778); referenceType();
						}
						break;
					}
					} 
				}
				setState(2783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,319,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitShiftExpression(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 448;
		enterRecursionRule(_localctx, 448, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2785); additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2802);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2800);
					switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2787);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2788); match(LT);
						setState(2789); match(LT);
						setState(2790); additiveExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2791);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2792); match(GT);
						setState(2793); match(GT);
						setState(2794); additiveExpression(0);
						}
						break;

					case 3:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(2795);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2796); match(GT);
						setState(2797); match(GT);
						setState(2798); match(GT);
						setState(2799); additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(2804);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,321,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitAdditiveExpression(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 450;
		enterRecursionRule(_localctx, 450, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2806); multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(2816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2814);
					switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2808);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2809); match(ADD);
						setState(2810); multiplicativeExpression(0);
						}
						break;

					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(2811);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2812); match(SUB);
						setState(2813); multiplicativeExpression(0);
						}
						break;
					}
					} 
				}
				setState(2818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,323,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitMultiplicativeExpression(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 452;
		enterRecursionRule(_localctx, 452, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2820); unaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2833);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2831);
					switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2822);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2823); match(MUL);
						setState(2824); unaryExpression();
						}
						break;

					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2825);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2826); match(DIV);
						setState(2827); unaryExpression();
						}
						break;

					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(2828);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2829); match(MOD);
						setState(2830); unaryExpression();
						}
						break;
					}
					} 
				}
				setState(2835);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PreIncrementExpressionContext preIncrementExpression() {
			return getRuleContext(PreIncrementExpressionContext.class,0);
		}
		public PreDecrementExpressionContext preDecrementExpression() {
			return getRuleContext(PreDecrementExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpression(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_unaryExpression);
		try {
			setState(2843);
			switch (_input.LA(1)) {
			case INC:
				enterOuterAlt(_localctx, 1);
				{
				setState(2836); preIncrementExpression();
				}
				break;
			case DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(2837); preDecrementExpression();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 3);
				{
				setState(2838); match(ADD);
				setState(2839); unaryExpression();
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 4);
				{
				setState(2840); match(SUB);
				setState(2841); unaryExpression();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case NEW:
			case SHORT:
			case SUPER:
			case THIS:
			case VOID:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case Identifier:
			case AT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2842); unaryExpressionNotPlusMinus();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreIncrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreIncrementExpression(this);
		}
	}

	public final PreIncrementExpressionContext preIncrementExpression() throws RecognitionException {
		PreIncrementExpressionContext _localctx = new PreIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_preIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2845); match(INC);
			setState(2846); unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreDecrementExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPreDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPreDecrementExpression(this);
		}
	}

	public final PreDecrementExpressionContext preDecrementExpression() throws RecognitionException {
		PreDecrementExpressionContext _localctx = new PreDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_preDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2848); match(DEC);
			setState(2849); unaryExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpressionNotPlusMinusContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpressionNotPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterUnaryExpressionNotPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitUnaryExpressionNotPlusMinus(this);
		}
	}

	public final UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() throws RecognitionException {
		UnaryExpressionNotPlusMinusContext _localctx = new UnaryExpressionNotPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_unaryExpressionNotPlusMinus);
		try {
			setState(2857);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2851); postfixExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2852); match(TILDE);
				setState(2853); unaryExpression();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2854); match(BANG);
				setState(2855); unaryExpression();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2856); castExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public List<PostDecrementExpression_lf_postfixExpressionContext> postDecrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostDecrementExpression_lf_postfixExpressionContext.class);
		}
		public PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostIncrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression(int i) {
			return getRuleContext(PostDecrementExpression_lf_postfixExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<PostIncrementExpression_lf_postfixExpressionContext> postIncrementExpression_lf_postfixExpression() {
			return getRuleContexts(PostIncrementExpression_lf_postfixExpressionContext.class);
		}
		public ExpressionNameContext expressionName() {
			return getRuleContext(ExpressionNameContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostfixExpression(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_postfixExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2861);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2859); primary();
				}
				break;

			case 2:
				{
				setState(2860); expressionName();
				}
				break;
			}
			setState(2867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(2865);
					switch (_input.LA(1)) {
					case INC:
						{
						setState(2863); postIncrementExpression_lf_postfixExpression();
						}
						break;
					case DEC:
						{
						setState(2864); postDecrementExpression_lf_postfixExpression();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(2869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,330,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostIncrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression(this);
		}
	}

	public final PostIncrementExpressionContext postIncrementExpression() throws RecognitionException {
		PostIncrementExpressionContext _localctx = new PostIncrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_postIncrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2870); postfixExpression();
			setState(2871); match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostIncrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostIncrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postIncrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostIncrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostIncrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostIncrementExpression_lf_postfixExpressionContext postIncrementExpression_lf_postfixExpression() throws RecognitionException {
		PostIncrementExpression_lf_postfixExpressionContext _localctx = new PostIncrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_postIncrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2873); match(INC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostDecrementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression(this);
		}
	}

	public final PostDecrementExpressionContext postDecrementExpression() throws RecognitionException {
		PostDecrementExpressionContext _localctx = new PostDecrementExpressionContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_postDecrementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2875); postfixExpression();
			setState(2876); match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostDecrementExpression_lf_postfixExpressionContext extends ParserRuleContext {
		public PostDecrementExpression_lf_postfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postDecrementExpression_lf_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterPostDecrementExpression_lf_postfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitPostDecrementExpression_lf_postfixExpression(this);
		}
	}

	public final PostDecrementExpression_lf_postfixExpressionContext postDecrementExpression_lf_postfixExpression() throws RecognitionException {
		PostDecrementExpression_lf_postfixExpressionContext _localctx = new PostDecrementExpression_lf_postfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_postDecrementExpression_lf_postfixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2878); match(DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public ReferenceTypeContext referenceType() {
			return getRuleContext(ReferenceTypeContext.class,0);
		}
		public UnaryExpressionNotPlusMinusContext unaryExpressionNotPlusMinus() {
			return getRuleContext(UnaryExpressionNotPlusMinusContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public List<AdditionalBoundContext> additionalBound() {
			return getRuleContexts(AdditionalBoundContext.class);
		}
		public LambdaExpressionContext lambdaExpression() {
			return getRuleContext(LambdaExpressionContext.class,0);
		}
		public AdditionalBoundContext additionalBound(int i) {
			return getRuleContext(AdditionalBoundContext.class,i);
		}
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Java8Listener ) ((Java8Listener)listener).exitCastExpression(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_castExpression);
		int _la;
		try {
			setState(2907);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2880); match(LPAREN);
				setState(2881); primitiveType();
				setState(2882); match(RPAREN);
				setState(2883); unaryExpression();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2885); match(LPAREN);
				setState(2886); referenceType();
				setState(2890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2887); additionalBound();
					}
					}
					setState(2892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2893); match(RPAREN);
				setState(2894); unaryExpressionNotPlusMinus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2896); match(LPAREN);
				setState(2897); referenceType();
				setState(2901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BITAND) {
					{
					{
					setState(2898); additionalBound();
					}
					}
					setState(2903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2904); match(RPAREN);
				setState(2905); lambdaExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 26: return packageName_sempred((PackageNameContext)_localctx, predIndex);

		case 28: return packageOrTypeName_sempred((PackageOrTypeNameContext)_localctx, predIndex);

		case 31: return ambiguousName_sempred((AmbiguousNameContext)_localctx, predIndex);

		case 217: return conditionalOrExpression_sempred((ConditionalOrExpressionContext)_localctx, predIndex);

		case 218: return conditionalAndExpression_sempred((ConditionalAndExpressionContext)_localctx, predIndex);

		case 219: return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);

		case 220: return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);

		case 221: return andExpression_sempred((AndExpressionContext)_localctx, predIndex);

		case 222: return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);

		case 223: return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);

		case 224: return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);

		case 225: return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);

		case 226: return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 2);

		case 17: return precpred(_ctx, 1);

		case 15: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18: return precpred(_ctx, 2);

		case 19: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageOrTypeName_sempred(PackageOrTypeNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10: return precpred(_ctx, 5);

		case 11: return precpred(_ctx, 4);

		case 12: return precpred(_ctx, 3);

		case 13: return precpred(_ctx, 2);

		case 14: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalAndExpression_sempred(ConditionalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 3);

		case 21: return precpred(_ctx, 2);

		case 22: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean ambiguousName_sempred(AmbiguousNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean conditionalOrExpression_sempred(ConditionalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return precpred(_ctx, 2);

		case 9: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3n\u0b60\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\3\2\3\2\3\3\3\3\5\3\u01e1\n\3\3\4\7\4"+
		"\u01e4\n\4\f\4\16\4\u01e7\13\4\3\4\3\4\7\4\u01eb\n\4\f\4\16\4\u01ee\13"+
		"\4\3\4\5\4\u01f1\n\4\3\5\3\5\5\5\u01f5\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\5\b\u01fe\n\b\3\t\3\t\5\t\u0202\n\t\3\t\3\t\7\t\u0206\n\t\f\t\16\t\u0209"+
		"\13\t\3\n\7\n\u020c\n\n\f\n\16\n\u020f\13\n\3\n\3\n\5\n\u0213\n\n\3\n"+
		"\3\n\3\n\7\n\u0218\n\n\f\n\16\n\u021b\13\n\3\n\3\n\5\n\u021f\n\n\5\n\u0221"+
		"\n\n\3\13\3\13\7\13\u0225\n\13\f\13\16\13\u0228\13\13\3\13\3\13\5\13\u022c"+
		"\n\13\3\f\7\f\u022f\n\f\f\f\16\f\u0232\13\f\3\f\3\f\5\f\u0236\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\7\20\u023f\n\20\f\20\16\20\u0242\13\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u024f\n\21"+
		"\3\22\7\22\u0252\n\22\f\22\16\22\u0255\13\22\3\22\3\22\3\22\7\22\u025a"+
		"\n\22\f\22\16\22\u025d\13\22\3\22\3\22\7\22\u0261\n\22\f\22\16\22\u0264"+
		"\13\22\3\23\7\23\u0267\n\23\f\23\16\23\u026a\13\23\3\23\3\23\5\23\u026e"+
		"\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\7\25\u0277\n\25\f\25\16\25\u027a"+
		"\13\25\5\25\u027c\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\7\30\u0288\n\30\f\30\16\30\u028b\13\30\3\31\3\31\5\31\u028f\n\31\3"+
		"\32\7\32\u0292\n\32\f\32\16\32\u0295\13\32\3\32\3\32\5\32\u0299\n\32\3"+
		"\33\3\33\3\33\3\33\5\33\u029f\n\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u02a7\n\34\f\34\16\34\u02aa\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u02b1"+
		"\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02b9\n\36\f\36\16\36\u02bc\13"+
		"\36\3\37\3\37\3\37\3\37\3\37\5\37\u02c3\n\37\3 \3 \3!\3!\3!\3!\3!\3!\7"+
		"!\u02cd\n!\f!\16!\u02d0\13!\3\"\5\"\u02d3\n\"\3\"\7\"\u02d6\n\"\f\"\16"+
		"\"\u02d9\13\"\3\"\7\"\u02dc\n\"\f\"\16\"\u02df\13\"\3\"\3\"\3#\7#\u02e4"+
		"\n#\f#\16#\u02e7\13#\3#\3#\3#\3#\7#\u02ed\n#\f#\16#\u02f0\13#\3#\3#\3"+
		"$\3$\3%\3%\3%\3%\5%\u02fa\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\7*\u0315\n*\f*\16*\u0318\13*"+
		"\3*\3*\3*\5*\u031d\n*\3*\5*\u0320\n*\3*\5*\u0323\n*\3*\3*\7*\u0327\n*"+
		"\f*\16*\u032a\13*\3*\3*\3*\5*\u032f\n*\3*\3*\7*\u0333\n*\f*\16*\u0336"+
		"\13*\3*\3*\3*\5*\u033b\n*\3*\5*\u033e\n*\3*\3*\7*\u0342\n*\f*\16*\u0345"+
		"\13*\3*\3*\3*\3*\5*\u034b\n*\3+\3+\5+\u034f\n+\3,\7,\u0352\n,\f,\16,\u0355"+
		"\13,\3,\3,\3,\5,\u035a\n,\3,\5,\u035d\n,\3,\5,\u0360\n,\3,\3,\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\5-\u036c\n-\3.\3.\3.\3.\3/\3/\3/\7/\u0375\n/\f/\16/\u0378"+
		"\13/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\7\62\u0383\n\62\f\62"+
		"\16\62\u0386\13\62\3\63\3\63\7\63\u038a\n\63\f\63\16\63\u038d\13\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\5\64\u0395\n\64\3\65\3\65\3\65\3\65\3\65"+
		"\5\65\u039c\n\65\3\66\7\66\u039f\n\66\f\66\16\66\u03a2\13\66\3\66\3\66"+
		"\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03b0\n\67\38"+
		"\38\38\78\u03b5\n8\f8\168\u03b8\138\39\39\39\59\u03bd\n9\3:\3:\5:\u03c1"+
		"\n:\3;\3;\5;\u03c5\n;\3<\3<\5<\u03c9\n<\3=\3=\5=\u03cd\n=\3>\3>\3>\5>"+
		"\u03d2\n>\3?\3?\5?\u03d6\n?\3?\3?\7?\u03da\n?\f?\16?\u03dd\13?\3@\3@\5"+
		"@\u03e1\n@\3@\3@\3@\7@\u03e6\n@\f@\16@\u03e9\13@\3@\3@\5@\u03ed\n@\5@"+
		"\u03ef\n@\3A\3A\7A\u03f3\nA\fA\16A\u03f6\13A\3A\3A\5A\u03fa\nA\3B\3B\5"+
		"B\u03fe\nB\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0411"+
		"\nG\3H\7H\u0414\nH\fH\16H\u0417\13H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\5I\u0426\nI\3J\3J\3J\5J\u042b\nJ\3J\3J\7J\u042f\nJ\fJ\16J\u0432\13"+
		"J\3J\3J\3J\5J\u0437\nJ\5J\u0439\nJ\3K\3K\5K\u043d\nK\3L\3L\3L\5L\u0442"+
		"\nL\3L\3L\5L\u0446\nL\3M\3M\3M\3M\3M\5M\u044d\nM\3N\3N\3N\7N\u0452\nN"+
		"\fN\16N\u0455\13N\3N\3N\3N\7N\u045a\nN\fN\16N\u045d\13N\5N\u045f\nN\3"+
		"O\7O\u0462\nO\fO\16O\u0465\13O\3O\3O\3O\3P\3P\5P\u046c\nP\3Q\7Q\u046f"+
		"\nQ\fQ\16Q\u0472\13Q\3Q\3Q\7Q\u0476\nQ\fQ\16Q\u0479\13Q\3Q\3Q\3Q\3Q\5"+
		"Q\u047f\nQ\3R\7R\u0482\nR\fR\16R\u0485\13R\3R\3R\3R\5R\u048a\nR\3R\3R"+
		"\3S\3S\3S\3T\3T\3T\7T\u0494\nT\fT\16T\u0497\13T\3U\3U\5U\u049b\nU\3V\3"+
		"V\5V\u049f\nV\3W\3W\3X\3X\3X\3Y\7Y\u04a7\nY\fY\16Y\u04aa\13Y\3Y\3Y\5Y"+
		"\u04ae\nY\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u04b6\nZ\3[\5[\u04b9\n[\3[\3[\3[\5[\u04be"+
		"\n[\3[\3[\3\\\3\\\3]\3]\5]\u04c6\n]\3]\5]\u04c9\n]\3]\3]\3^\5^\u04ce\n"+
		"^\3^\3^\3^\5^\u04d3\n^\3^\3^\3^\5^\u04d8\n^\3^\3^\3^\5^\u04dd\n^\3^\3"+
		"^\3^\3^\3^\5^\u04e4\n^\3^\3^\3^\5^\u04e9\n^\3^\3^\3^\3^\3^\3^\5^\u04f1"+
		"\n^\3^\3^\3^\5^\u04f6\n^\3^\3^\3^\5^\u04fb\n^\3_\7_\u04fe\n_\f_\16_\u0501"+
		"\13_\3_\3_\3_\5_\u0506\n_\3_\3_\3`\3`\5`\u050c\n`\3`\5`\u050f\n`\3`\5"+
		"`\u0512\n`\3`\3`\3a\3a\3a\7a\u0519\na\fa\16a\u051c\13a\3b\7b\u051f\nb"+
		"\fb\16b\u0522\13b\3b\3b\3b\5b\u0527\nb\3b\5b\u052a\nb\3b\5b\u052d\nb\3"+
		"c\3c\3d\3d\7d\u0533\nd\fd\16d\u0536\13d\3e\3e\5e\u053a\ne\3f\7f\u053d"+
		"\nf\ff\16f\u0540\13f\3f\3f\3f\5f\u0545\nf\3f\5f\u0548\nf\3f\3f\3g\3g\3"+
		"g\3g\3g\3g\3g\5g\u0553\ng\3h\3h\3h\3i\3i\7i\u055a\ni\fi\16i\u055d\13i"+
		"\3i\3i\3j\3j\3j\3j\3j\5j\u0566\nj\3k\7k\u0569\nk\fk\16k\u056c\13k\3k\3"+
		"k\3k\3k\3l\3l\3l\3l\5l\u0576\nl\3m\7m\u0579\nm\fm\16m\u057c\13m\3m\3m"+
		"\3m\3n\3n\3n\3n\3n\3n\5n\u0587\nn\3o\7o\u058a\no\fo\16o\u058d\13o\3o\3"+
		"o\3o\3o\3o\3p\3p\7p\u0596\np\fp\16p\u0599\13p\3p\3p\3q\3q\3q\3q\3q\5q"+
		"\u05a2\nq\3r\7r\u05a5\nr\fr\16r\u05a8\13r\3r\3r\3r\3r\3r\5r\u05af\nr\3"+
		"r\5r\u05b2\nr\3r\3r\3s\3s\3s\5s\u05b9\ns\3t\3t\3t\3u\3u\3u\5u\u05c1\n"+
		"u\3v\3v\3v\3v\5v\u05c7\nv\3v\3v\3w\3w\3w\7w\u05ce\nw\fw\16w\u05d1\13w"+
		"\3x\3x\3x\3x\3y\3y\3y\5y\u05da\ny\3z\3z\5z\u05de\nz\3z\5z\u05e1\nz\3z"+
		"\3z\3{\3{\3{\7{\u05e8\n{\f{\16{\u05eb\13{\3|\3|\3|\3}\3}\3}\3}\3}\3}\3"+
		"~\3~\5~\u05f8\n~\3~\5~\u05fb\n~\3~\3~\3\177\3\177\3\177\7\177\u0602\n"+
		"\177\f\177\16\177\u0605\13\177\3\u0080\3\u0080\5\u0080\u0609\n\u0080\3"+
		"\u0080\3\u0080\3\u0081\3\u0081\7\u0081\u060f\n\u0081\f\u0081\16\u0081"+
		"\u0612\13\u0081\3\u0082\3\u0082\3\u0082\5\u0082\u0617\n\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0084\7\u0084\u061d\n\u0084\f\u0084\16\u0084\u0620"+
		"\13\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\5\u0085\u062b\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u0632\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u0640\n\u0087"+
		"\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008b\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\5\u008c\u0656\n\u008c\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090"+
		"\3\u0090\5\u0090\u0678\n\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\7\u0092\u0682\n\u0092\f\u0092\16\u0092\u0685"+
		"\13\u0092\3\u0092\7\u0092\u0688\n\u0092\f\u0092\16\u0092\u068b\13\u0092"+
		"\3\u0092\3\u0092\3\u0093\3\u0093\3\u0093\3\u0094\3\u0094\7\u0094\u0694"+
		"\n\u0094\f\u0094\16\u0094\u0697\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u06a3\n\u0095"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u009a\3\u009a\5\u009a\u06bd\n\u009a"+
		"\3\u009b\3\u009b\5\u009b\u06c1\n\u009b\3\u009c\3\u009c\3\u009c\5\u009c"+
		"\u06c6\n\u009c\3\u009c\3\u009c\5\u009c\u06ca\n\u009c\3\u009c\3\u009c\5"+
		"\u009c\u06ce\n\u009c\3\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\5"+
		"\u009d\u06d6\n\u009d\3\u009d\3\u009d\5\u009d\u06da\n\u009d\3\u009d\3\u009d"+
		"\5\u009d\u06de\n\u009d\3\u009d\3\u009d\3\u009d\3\u009e\3\u009e\5\u009e"+
		"\u06e5\n\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u06ec\n"+
		"\u00a0\f\u00a0\16\u00a0\u06ef\13\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1"+
		"\u06f4\n\u00a1\f\u00a1\16\u00a1\u06f7\13\u00a1\3\u00a1\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\7\u00a2\u0703"+
		"\n\u00a2\f\u00a2\16\u00a2\u0706\13\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\5\u00a3\u0711\n\u00a3\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\5\u00a4\u0717\n\u00a4\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\5\u00a5\u071d\n\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\3\u00a8\3\u00a8\3\u00a8\5\u00a8\u0732\n\u00a8\3\u00a8"+
		"\3\u00a8\3\u00a8\5\u00a8\u0737\n\u00a8\3\u00a9\3\u00a9\7\u00a9\u073b\n"+
		"\u00a9\f\u00a9\16\u00a9\u073e\13\u00a9\3\u00aa\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00aa\3\u00aa\3\u00ab\7\u00ab\u0747\n\u00ab\f\u00ab\16\u00ab\u074a"+
		"\13\u00ab\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\7\u00ac\u0752"+
		"\n\u00ac\f\u00ac\16\u00ac\u0755\13\u00ac\3\u00ad\3\u00ad\3\u00ad\3\u00ae"+
		"\3\u00ae\3\u00ae\3\u00ae\5\u00ae\u075e\n\u00ae\3\u00ae\5\u00ae\u0761\n"+
		"\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u0766\n\u00af\3\u00af\3\u00af\3"+
		"\u00b0\3\u00b0\3\u00b0\7\u00b0\u076d\n\u00b0\f\u00b0\16\u00b0\u0770\13"+
		"\u00b0\3\u00b1\7\u00b1\u0773\n\u00b1\f\u00b1\16\u00b1\u0776\13\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\5\u00b2\u077f\n"+
		"\u00b2\3\u00b2\7\u00b2\u0782\n\u00b2\f\u00b2\16\u00b2\u0785\13\u00b2\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\7\u00b3\u078b\n\u00b3\f\u00b3\16\u00b3"+
		"\u078e\13\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u07a4\n\u00b3\3\u00b4\3\u00b4"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\7\u00b5\u07ac\n\u00b5\f\u00b5\16\u00b5"+
		"\u07af\13\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u07c4\n\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\5\u00b6\u07cb\n\u00b6\3\u00b7\3\u00b7\3\u00b8\3\u00b8"+
		"\3\u00b8\3\u00b8\5\u00b8\u07d3\n\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\7\u00b9\u07d9\n\u00b9\f\u00b9\16\u00b9\u07dc\13\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9\u07e4\n\u00b9\f\u00b9\16\u00b9"+
		"\u07e7\13\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07fd\n\u00b9\3\u00ba\3\u00ba"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u0805\n\u00bb\f\u00bb\16\u00bb"+
		"\u0808\13\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb"+
		"\u0810\n\u00bb\f\u00bb\16\u00bb\u0813\13\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0828"+
		"\n\u00bb\3\u00bc\3\u00bc\5\u00bc\u082c\n\u00bc\3\u00bc\7\u00bc\u082f\n"+
		"\u00bc\f\u00bc\16\u00bc\u0832\13\u00bc\3\u00bc\3\u00bc\3\u00bc\7\u00bc"+
		"\u0837\n\u00bc\f\u00bc\16\u00bc\u083a\13\u00bc\3\u00bc\7\u00bc\u083d\n"+
		"\u00bc\f\u00bc\16\u00bc\u0840\13\u00bc\3\u00bc\5\u00bc\u0843\n\u00bc\3"+
		"\u00bc\3\u00bc\5\u00bc\u0847\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u084b\n\u00bc"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0851\n\u00bc\3\u00bc\7\u00bc"+
		"\u0854\n\u00bc\f\u00bc\16\u00bc\u0857\13\u00bc\3\u00bc\3\u00bc\5\u00bc"+
		"\u085b\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u085f\n\u00bc\3\u00bc\3\u00bc\5"+
		"\u00bc\u0863\n\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\5\u00bc\u0869\n\u00bc"+
		"\3\u00bc\7\u00bc\u086c\n\u00bc\f\u00bc\16\u00bc\u086f\13\u00bc\3\u00bc"+
		"\3\u00bc\5\u00bc\u0873\n\u00bc\3\u00bc\3\u00bc\5\u00bc\u0877\n\u00bc\3"+
		"\u00bc\3\u00bc\5\u00bc\u087b\n\u00bc\5\u00bc\u087d\n\u00bc\3\u00bd\3\u00bd"+
		"\3\u00bd\5\u00bd\u0882\n\u00bd\3\u00bd\7\u00bd\u0885\n\u00bd\f\u00bd\16"+
		"\u00bd\u0888\13\u00bd\3\u00bd\3\u00bd\5\u00bd\u088c\n\u00bd\3\u00bd\3"+
		"\u00bd\5\u00bd\u0890\n\u00bd\3\u00bd\3\u00bd\5\u00bd\u0894\n\u00bd\3\u00be"+
		"\3\u00be\5\u00be\u0898\n\u00be\3\u00be\7\u00be\u089b\n\u00be\f\u00be\16"+
		"\u00be\u089e\13\u00be\3\u00be\3\u00be\3\u00be\7\u00be\u08a3\n\u00be\f"+
		"\u00be\16\u00be\u08a6\13\u00be\3\u00be\7\u00be\u08a9\n\u00be\f\u00be\16"+
		"\u00be\u08ac\13\u00be\3\u00be\5\u00be\u08af\n\u00be\3\u00be\3\u00be\5"+
		"\u00be\u08b3\n\u00be\3\u00be\3\u00be\5\u00be\u08b7\n\u00be\3\u00be\3\u00be"+
		"\3\u00be\3\u00be\5\u00be\u08bd\n\u00be\3\u00be\7\u00be\u08c0\n\u00be\f"+
		"\u00be\16\u00be\u08c3\13\u00be\3\u00be\3\u00be\5\u00be\u08c7\n\u00be\3"+
		"\u00be\3\u00be\5\u00be\u08cb\n\u00be\3\u00be\3\u00be\5\u00be\u08cf\n\u00be"+
		"\5\u00be\u08d1\n\u00be\3\u00bf\3\u00bf\3\u00bf\5\u00bf\u08d6\n\u00bf\3"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u08e5\n\u00c0\3\u00c1\3\u00c1"+
		"\3\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\5\u00c2\u08f3\n\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u08ff\n\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u0906\n\u00c3\f\u00c3\16\u00c3"+
		"\u0909\13\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c4\7\u00c4\u0915\n\u00c4\f\u00c4\16\u00c4\u0918"+
		"\13\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\5\u00c5\u0924\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\7\u00c5\u092b\n\u00c5\f\u00c5\16\u00c5\u092e\13\u00c5\3\u00c6"+
		"\3\u00c6\3\u00c6\5\u00c6\u0933\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\5\u00c6\u093a\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u093f\n"+
		"\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0946\n\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c6\5\u00c6\u094b\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3"+
		"\u00c6\3\u00c6\5\u00c6\u0952\n\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0957"+
		"\n\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u095e\n\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0963\n\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u096b\n\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\5\u00c6\u0970\n\u00c6\3\u00c6\3\u00c6\5\u00c6\u0974\n\u00c6\3\u00c7\3"+
		"\u00c7\5\u00c7\u0978\n\u00c7\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u097d\n\u00c7"+
		"\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u0984\n\u00c8\3\u00c8"+
		"\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u098b\n\u00c8\3\u00c8\3\u00c8"+
		"\3\u00c8\5\u00c8\u0990\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8"+
		"\5\u00c8\u0997\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u099c\n\u00c8\3"+
		"\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u09a3\n\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u09a8\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u09b0\n\u00c8\3\u00c8\3\u00c8\3\u00c8\5\u00c8\u09b5"+
		"\n\u00c8\3\u00c8\3\u00c8\5\u00c8\u09b9\n\u00c8\3\u00c9\3\u00c9\3\u00c9"+
		"\7\u00c9\u09be\n\u00c9\f\u00c9\16\u00c9\u09c1\13\u00c9\3\u00ca\3\u00ca"+
		"\3\u00ca\5\u00ca\u09c6\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u09cd\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u09d4\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09db\n"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09e3\n"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09ea\n\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u09f2\n\u00ca\3"+
		"\u00cb\3\u00cb\5\u00cb\u09f6\n\u00cb\3\u00cb\3\u00cb\3\u00cc\3\u00cc\3"+
		"\u00cc\5\u00cc\u09fd\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5"+
		"\u00cc\u0a04\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a0b"+
		"\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a13"+
		"\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a1a\n\u00cc"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\5\u00cc\u0a22\n\u00cc"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a28\n\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\5\u00cd\u0a2e\n\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\5\u00cd\u0a3a\n\u00cd"+
		"\3\u00ce\3\u00ce\7\u00ce\u0a3e\n\u00ce\f\u00ce\16\u00ce\u0a41\13\u00ce"+
		"\3\u00cf\7\u00cf\u0a44\n\u00cf\f\u00cf\16\u00cf\u0a47\13\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00d0\3\u00d0\3\u00d1\3\u00d1\5\u00d1\u0a51"+
		"\n\u00d1\3\u00d2\3\u00d2\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d3\5\u00d3"+
		"\u0a5a\n\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\3\u00d3\5\u00d3\u0a61\n"+
		"\u00d3\3\u00d4\3\u00d4\3\u00d4\7\u00d4\u0a66\n\u00d4\f\u00d4\16\u00d4"+
		"\u0a69\13\u00d4\3\u00d5\3\u00d5\5\u00d5\u0a6d\n\u00d5\3\u00d6\3\u00d6"+
		"\5\u00d6\u0a71\n\u00d6\3\u00d7\3\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8"+
		"\3\u00d8\5\u00d8\u0a7a\n\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00da\3\u00da\5\u00da\u0a85\n\u00da\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db\u0a8d\n\u00db\f\u00db\16\u00db"+
		"\u0a90\13\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\7\u00dc"+
		"\u0a98\n\u00dc\f\u00dc\16\u00dc\u0a9b\13\u00dc\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u0aa3\n\u00dd\f\u00dd\16\u00dd\u0aa6"+
		"\13\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\7\u00de\u0aae"+
		"\n\u00de\f\u00de\16\u00de\u0ab1\13\u00de\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\7\u00df\u0ab9\n\u00df\f\u00df\16\u00df\u0abc\13\u00df"+
		"\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0"+
		"\7\u00e0\u0ac7\n\u00e0\f\u00e0\16\u00e0\u0aca\13\u00e0\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\3\u00e1\7\u00e1\u0ade"+
		"\n\u00e1\f\u00e1\16\u00e1\u0ae1\13\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2\3\u00e2"+
		"\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u0af3\n\u00e2\f\u00e2\16\u00e2\u0af6"+
		"\13\u00e2\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\3\u00e3\7\u00e3\u0b01\n\u00e3\f\u00e3\16\u00e3\u0b04\13\u00e3\3\u00e4"+
		"\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4\3\u00e4"+
		"\3\u00e4\3\u00e4\7\u00e4\u0b12\n\u00e4\f\u00e4\16\u00e4\u0b15\13\u00e4"+
		"\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u0b1e"+
		"\n\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0b2c\n\u00e8\3\u00e9\3\u00e9"+
		"\5\u00e9\u0b30\n\u00e9\3\u00e9\3\u00e9\7\u00e9\u0b34\n\u00e9\f\u00e9\16"+
		"\u00e9\u0b37\13\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee"+
		"\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b4b\n\u00ee\f\u00ee\16\u00ee\u0b4e"+
		"\13\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\7\u00ee\u0b56"+
		"\n\u00ee\f\u00ee\16\u00ee\u0b59\13\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee"+
		"\u0b5e\n\u00ee\3\u00ee\2\17\66:@\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0"+
		"\u01c2\u01c4\u01c6\u00ef\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172\u0174"+
		"\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a\u018c"+
		"\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4"+
		"\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc"+
		"\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4"+
		"\u01d6\u01d8\u01da\2\6\3\2\66;\7\2\b\b\13\13\36\36  ((\4\2\21\21\27\27"+
		"\4\2EE^h\u0c5d\2\u01dc\3\2\2\2\4\u01e0\3\2\2\2\6\u01f0\3\2\2\2\b\u01f4"+
		"\3\2\2\2\n\u01f6\3\2\2\2\f\u01f8\3\2\2\2\16\u01fd\3\2\2\2\20\u0201\3\2"+
		"\2\2\22\u0220\3\2\2\2\24\u0222\3\2\2\2\26\u0230\3\2\2\2\30\u0237\3\2\2"+
		"\2\32\u0239\3\2\2\2\34\u023b\3\2\2\2\36\u0240\3\2\2\2 \u024e\3\2\2\2\""+
		"\u0253\3\2\2\2$\u0268\3\2\2\2&\u026f\3\2\2\2(\u027b\3\2\2\2*\u027d\3\2"+
		"\2\2,\u0280\3\2\2\2.\u0284\3\2\2\2\60\u028e\3\2\2\2\62\u0293\3\2\2\2\64"+
		"\u029e\3\2\2\2\66\u02a0\3\2\2\28\u02b0\3\2\2\2:\u02b2\3\2\2\2<\u02c2\3"+
		"\2\2\2>\u02c4\3\2\2\2@\u02c6\3\2\2\2B\u02d2\3\2\2\2D\u02e5\3\2\2\2F\u02f3"+
		"\3\2\2\2H\u02f9\3\2\2\2J\u02fb\3\2\2\2L\u02ff\3\2\2\2N\u0305\3\2\2\2P"+
		"\u030c\3\2\2\2R\u034a\3\2\2\2T\u034e\3\2\2\2V\u0353\3\2\2\2X\u036b\3\2"+
		"\2\2Z\u036d\3\2\2\2\\\u0371\3\2\2\2^\u0379\3\2\2\2`\u037c\3\2\2\2b\u037f"+
		"\3\2\2\2d\u0387\3\2\2\2f\u0394\3\2\2\2h\u039b\3\2\2\2j\u03a0\3\2\2\2l"+
		"\u03af\3\2\2\2n\u03b1\3\2\2\2p\u03b9\3\2\2\2r\u03be\3\2\2\2t\u03c4\3\2"+
		"\2\2v\u03c8\3\2\2\2x\u03cc\3\2\2\2z\u03d1\3\2\2\2|\u03d5\3\2\2\2~\u03ee"+
		"\3\2\2\2\u0080\u03f0\3\2\2\2\u0082\u03fb\3\2\2\2\u0084\u03ff\3\2\2\2\u0086"+
		"\u0401\3\2\2\2\u0088\u0403\3\2\2\2\u008a\u0405\3\2\2\2\u008c\u0410\3\2"+
		"\2\2\u008e\u0415\3\2\2\2\u0090\u0425\3\2\2\2\u0092\u0438\3\2\2\2\u0094"+
		"\u043c\3\2\2\2\u0096\u043e\3\2\2\2\u0098\u044c\3\2\2\2\u009a\u045e\3\2"+
		"\2\2\u009c\u0463\3\2\2\2\u009e\u046b\3\2\2\2\u00a0\u047e\3\2\2\2\u00a2"+
		"\u0483\3\2\2\2\u00a4\u048d\3\2\2\2\u00a6\u0490\3\2\2\2\u00a8\u049a\3\2"+
		"\2\2\u00aa\u049e\3\2\2\2\u00ac\u04a0\3\2\2\2\u00ae\u04a2\3\2\2\2\u00b0"+
		"\u04a8\3\2\2\2\u00b2\u04b5\3\2\2\2\u00b4\u04b8\3\2\2\2\u00b6\u04c1\3\2"+
		"\2\2\u00b8\u04c3\3\2\2\2\u00ba\u04fa\3\2\2\2\u00bc\u04ff\3\2\2\2\u00be"+
		"\u0509\3\2\2\2\u00c0\u0515\3\2\2\2\u00c2\u0520\3\2\2\2\u00c4\u052e\3\2"+
		"\2\2\u00c6\u0530\3\2\2\2\u00c8\u0539\3\2\2\2\u00ca\u053e\3\2\2\2\u00cc"+
		"\u0552\3\2\2\2\u00ce\u0554\3\2\2\2\u00d0\u0557\3\2\2\2\u00d2\u0565\3\2"+
		"\2\2\u00d4\u056a\3\2\2\2\u00d6\u0575\3\2\2\2\u00d8\u057a\3\2\2\2\u00da"+
		"\u0586\3\2\2\2\u00dc\u058b\3\2\2\2\u00de\u0593\3\2\2\2\u00e0\u05a1\3\2"+
		"\2\2\u00e2\u05a6\3\2\2\2\u00e4\u05b8\3\2\2\2\u00e6\u05ba\3\2\2\2\u00e8"+
		"\u05c0\3\2\2\2\u00ea\u05c2\3\2\2\2\u00ec\u05ca\3\2\2\2\u00ee\u05d2\3\2"+
		"\2\2\u00f0\u05d9\3\2\2\2\u00f2\u05db\3\2\2\2\u00f4\u05e4\3\2\2\2\u00f6"+
		"\u05ec\3\2\2\2\u00f8\u05ef\3\2\2\2\u00fa\u05f5\3\2\2\2\u00fc\u05fe\3\2"+
		"\2\2\u00fe\u0606\3\2\2\2\u0100\u060c\3\2\2\2\u0102\u0616\3\2\2\2\u0104"+
		"\u0618\3\2\2\2\u0106\u061e\3\2\2\2\u0108\u062a\3\2\2\2\u010a\u0631\3\2"+
		"\2\2\u010c\u063f\3\2\2\2\u010e\u0641\3\2\2\2\u0110\u0643\3\2\2\2\u0112"+
		"\u0647\3\2\2\2\u0114\u064b\3\2\2\2\u0116\u0655\3\2\2\2\u0118\u0657\3\2"+
		"\2\2\u011a\u065d\3\2\2\2\u011c\u0665\3\2\2\2\u011e\u0677\3\2\2\2\u0120"+
		"\u0679\3\2\2\2\u0122\u067f\3\2\2\2\u0124\u068e\3\2\2\2\u0126\u0691\3\2"+
		"\2\2\u0128\u06a2\3\2\2\2\u012a\u06a4\3\2\2\2\u012c\u06a6\3\2\2\2\u012e"+
		"\u06ac\3\2\2\2\u0130\u06b2\3\2\2\2\u0132\u06bc\3\2\2\2\u0134\u06c0\3\2"+
		"\2\2\u0136\u06c2\3\2\2\2\u0138\u06d2\3\2\2\2\u013a\u06e4\3\2\2\2\u013c"+
		"\u06e6\3\2\2\2\u013e\u06e8\3\2\2\2\u0140\u06f0\3\2\2\2\u0142\u06ff\3\2"+
		"\2\2\u0144\u070e\3\2\2\2\u0146\u0714\3\2\2\2\u0148\u071a\3\2\2\2\u014a"+
		"\u0720\3\2\2\2\u014c\u0724\3\2\2\2\u014e\u0736\3\2\2\2\u0150\u0738\3\2"+
		"\2\2\u0152\u073f\3\2\2\2\u0154\u0748\3\2\2\2\u0156\u074e\3\2\2\2\u0158"+
		"\u0756\3\2\2\2\u015a\u0759\3\2\2\2\u015c\u0762\3\2\2\2\u015e\u0769\3\2"+
		"\2\2\u0160\u0774\3\2\2\2\u0162\u077e\3\2\2\2\u0164\u07a3\3\2\2\2\u0166"+
		"\u07a5\3\2\2\2\u0168\u07c3\3\2\2\2\u016a\u07ca\3\2\2\2\u016c\u07cc\3\2"+
		"\2\2\u016e\u07d2\3\2\2\2\u0170\u07fc\3\2\2\2\u0172\u07fe\3\2\2\2\u0174"+
		"\u0827\3\2\2\2\u0176\u087c\3\2\2\2\u0178\u087e\3\2\2\2\u017a\u08d0\3\2"+
		"\2\2\u017c\u08d5\3\2\2\2\u017e\u08e4\3\2\2\2\u0180\u08e6\3\2\2\2\u0182"+
		"\u08f2\3\2\2\2\u0184\u08fe\3\2\2\2\u0186\u090a\3\2\2\2\u0188\u0923\3\2"+
		"\2\2\u018a\u0973\3\2\2\2\u018c\u0975\3\2\2\2\u018e\u09b8\3\2\2\2\u0190"+
		"\u09ba\3\2\2\2\u0192\u09f1\3\2\2\2\u0194\u09f3\3\2\2\2\u0196\u0a21\3\2"+
		"\2\2\u0198\u0a39\3\2\2\2\u019a\u0a3b\3\2\2\2\u019c\u0a45\3\2\2\2\u019e"+
		"\u0a4c\3\2\2\2\u01a0\u0a50\3\2\2\2\u01a2\u0a52\3\2\2\2\u01a4\u0a60\3\2"+
		"\2\2\u01a6\u0a62\3\2\2\2\u01a8\u0a6c\3\2\2\2\u01aa\u0a70\3\2\2\2\u01ac"+
		"\u0a72\3\2\2\2\u01ae\u0a79\3\2\2\2\u01b0\u0a7b\3\2\2\2\u01b2\u0a84\3\2"+
		"\2\2\u01b4\u0a86\3\2\2\2\u01b6\u0a91\3\2\2\2\u01b8\u0a9c\3\2\2\2\u01ba"+
		"\u0aa7\3\2\2\2\u01bc\u0ab2\3\2\2\2\u01be\u0abd\3\2\2\2\u01c0\u0acb\3\2"+
		"\2\2\u01c2\u0ae2\3\2\2\2\u01c4\u0af7\3\2\2\2\u01c6\u0b05\3\2\2\2\u01c8"+
		"\u0b1d\3\2\2\2\u01ca\u0b1f\3\2\2\2\u01cc\u0b22\3\2\2\2\u01ce\u0b2b\3\2"+
		"\2\2\u01d0\u0b2f\3\2\2\2\u01d2\u0b38\3\2\2\2\u01d4\u0b3b\3\2\2\2\u01d6"+
		"\u0b3d\3\2\2\2\u01d8\u0b40\3\2\2\2\u01da\u0b5d\3\2\2\2\u01dc\u01dd\t\2"+
		"\2\2\u01dd\3\3\2\2\2\u01de\u01e1\5\6\4\2\u01df\u01e1\5\16\b\2\u01e0\u01de"+
		"\3\2\2\2\u01e0\u01df\3\2\2\2\u01e1\5\3\2\2\2\u01e2\u01e4\5\u00e8u\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01f1\5\b\5\2\u01e9"+
		"\u01eb\5\u00e8u\2\u01ea\u01e9\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea"+
		"\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef"+
		"\u01f1\7\6\2\2\u01f0\u01e5\3\2\2\2\u01f0\u01ec\3\2\2\2\u01f1\7\3\2\2\2"+
		"\u01f2\u01f5\5\n\6\2\u01f3\u01f5\5\f\7\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f5\t\3\2\2\2\u01f6\u01f7\t\3\2\2\u01f7\13\3\2\2\2\u01f8\u01f9"+
		"\t\4\2\2\u01f9\r\3\2\2\2\u01fa\u01fe\5\20\t\2\u01fb\u01fe\5\36\20\2\u01fc"+
		"\u01fe\5 \21\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fc\3\2"+
		"\2\2\u01fe\17\3\2\2\2\u01ff\u0202\5\26\f\2\u0200\u0202\5\34\17\2\u0201"+
		"\u01ff\3\2\2\2\u0201\u0200\3\2\2\2\u0202\u0207\3\2\2\2\u0203\u0206\5\24"+
		"\13\2\u0204\u0206\5\32\16\2\u0205\u0203\3\2\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\21\3\2\2"+
		"\2\u0209\u0207\3\2\2\2\u020a\u020c\5\u00e8u\2\u020b\u020a\3\2\2\2\u020c"+
		"\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2"+
		"\2\2\u020f\u020d\3\2\2\2\u0210\u0212\7i\2\2\u0211\u0213\5,\27\2\u0212"+
		"\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0221\3\2\2\2\u0214\u0215\5\20"+
		"\t\2\u0215\u0219\7D\2\2\u0216\u0218\5\u00e8u\2\u0217\u0216\3\2\2\2\u0218"+
		"\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021c\u021e\7i\2\2\u021d\u021f\5,\27\2\u021e"+
		"\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u020d\3\2"+
		"\2\2\u0220\u0214\3\2\2\2\u0221\23\3\2\2\2\u0222\u0226\7D\2\2\u0223\u0225"+
		"\5\u00e8u\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2"+
		"\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022b"+
		"\7i\2\2\u022a\u022c\5,\27\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\25\3\2\2\2\u022d\u022f\5\u00e8u\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2"+
		"\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232"+
		"\u0230\3\2\2\2\u0233\u0235\7i\2\2\u0234\u0236\5,\27\2\u0235\u0234\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\27\3\2\2\2\u0237\u0238\5\22\n\2\u0238\31"+
		"\3\2\2\2\u0239\u023a\5\24\13\2\u023a\33\3\2\2\2\u023b\u023c\5\26\f\2\u023c"+
		"\35\3\2\2\2\u023d\u023f\5\u00e8u\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2"+
		"\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0240\3\2\2\2\u0243\u0244\7i\2\2\u0244\37\3\2\2\2\u0245\u0246\5\6\4\2"+
		"\u0246\u0247\5\"\22\2\u0247\u024f\3\2\2\2\u0248\u0249\5\20\t\2\u0249\u024a"+
		"\5\"\22\2\u024a\u024f\3\2\2\2\u024b\u024c\5\36\20\2\u024c\u024d\5\"\22"+
		"\2\u024d\u024f\3\2\2\2\u024e\u0245\3\2\2\2\u024e\u0248\3\2\2\2\u024e\u024b"+
		"\3\2\2\2\u024f!\3\2\2\2\u0250\u0252\5\u00e8u\2\u0251\u0250\3\2\2\2\u0252"+
		"\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0256\u0257\7@\2\2\u0257\u0262\7A\2\2\u0258\u025a"+
		"\5\u00e8u\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2"+
		"\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f"+
		"\7@\2\2\u025f\u0261\7A\2\2\u0260\u025b\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263#\3\2\2\2\u0264\u0262\3\2\2\2"+
		"\u0265\u0267\5&\24\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266"+
		"\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2\2\2\u026b"+
		"\u026d\7i\2\2\u026c\u026e\5(\25\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2"+
		"\2\2\u026e%\3\2\2\2\u026f\u0270\5\u00e8u\2\u0270\'\3\2\2\2\u0271\u0272"+
		"\7\24\2\2\u0272\u027c\5\36\20\2\u0273\u0274\7\24\2\2\u0274\u0278\5\20"+
		"\t\2\u0275\u0277\5*\26\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2"+
		"\2\2\u027b\u0271\3\2\2\2\u027b\u0273\3\2\2\2\u027c)\3\2\2\2\u027d\u027e"+
		"\7X\2\2\u027e\u027f\5\30\r\2\u027f+\3\2\2\2\u0280\u0281\7G\2\2\u0281\u0282"+
		"\5.\30\2\u0282\u0283\7F\2\2\u0283-\3\2\2\2\u0284\u0289\5\60\31\2\u0285"+
		"\u0286\7C\2\2\u0286\u0288\5\60\31\2\u0287\u0285\3\2\2\2\u0288\u028b\3"+
		"\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a/\3\2\2\2\u028b\u0289"+
		"\3\2\2\2\u028c\u028f\5\16\b\2\u028d\u028f\5\62\32\2\u028e\u028c\3\2\2"+
		"\2\u028e\u028d\3\2\2\2\u028f\61\3\2\2\2\u0290\u0292\5\u00e8u\2\u0291\u0290"+
		"\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294"+
		"\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296\u0298\7J\2\2\u0297\u0299\5\64"+
		"\33\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\63\3\2\2\2\u029a\u029b"+
		"\7\24\2\2\u029b\u029f\5\16\b\2\u029c\u029d\7+\2\2\u029d\u029f\5\16\b\2"+
		"\u029e\u029a\3\2\2\2\u029e\u029c\3\2\2\2\u029f\65\3\2\2\2\u02a0\u02a1"+
		"\b\34\1\2\u02a1\u02a2\7i\2\2\u02a2\u02a8\3\2\2\2\u02a3\u02a4\f\3\2\2\u02a4"+
		"\u02a5\7D\2\2\u02a5\u02a7\7i\2\2\u02a6\u02a3\3\2\2\2\u02a7\u02aa\3\2\2"+
		"\2\u02a8\u02a6\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\67\3\2\2\2\u02aa\u02a8"+
		"\3\2\2\2\u02ab\u02b1\7i\2\2\u02ac\u02ad\5:\36\2\u02ad\u02ae\7D\2\2\u02ae"+
		"\u02af\7i\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ab\3\2\2\2\u02b0\u02ac\3\2"+
		"\2\2\u02b19\3\2\2\2\u02b2\u02b3\b\36\1\2\u02b3\u02b4\7i\2\2\u02b4\u02ba"+
		"\3\2\2\2\u02b5\u02b6\f\3\2\2\u02b6\u02b7\7D\2\2\u02b7\u02b9\7i\2\2\u02b8"+
		"\u02b5\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb;\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02c3\7i\2\2\u02be\u02bf"+
		"\5@!\2\u02bf\u02c0\7D\2\2\u02c0\u02c1\7i\2\2\u02c1\u02c3\3\2\2\2\u02c2"+
		"\u02bd\3\2\2\2\u02c2\u02be\3\2\2\2\u02c3=\3\2\2\2\u02c4\u02c5\7i\2\2\u02c5"+
		"?\3\2\2\2\u02c6\u02c7\b!\1\2\u02c7\u02c8\7i\2\2\u02c8\u02ce\3\2\2\2\u02c9"+
		"\u02ca\f\3\2\2\u02ca\u02cb\7D\2\2\u02cb\u02cd\7i\2\2\u02cc\u02c9\3\2\2"+
		"\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cfA"+
		"\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1\u02d3\5D#\2\u02d2\u02d1\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d7\3\2\2\2\u02d4\u02d6\5H%\2\u02d5\u02d4\3\2\2"+
		"\2\u02d6\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02dd"+
		"\3\2\2\2\u02d9\u02d7\3\2\2\2\u02da\u02dc\5R*\2\u02db\u02da\3\2\2\2\u02dc"+
		"\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0\3\2"+
		"\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\7\2\2\3\u02e1C\3\2\2\2\u02e2\u02e4"+
		"\5F$\2\u02e3\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02e9\7#"+
		"\2\2\u02e9\u02ee\7i\2\2\u02ea\u02eb\7D\2\2\u02eb\u02ed\7i\2\2\u02ec\u02ea"+
		"\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef"+
		"\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\7B\2\2\u02f2E\3\2\2\2\u02f3"+
		"\u02f4\5\u00e8u\2\u02f4G\3\2\2\2\u02f5\u02fa\5J&\2\u02f6\u02fa\5L\'\2"+
		"\u02f7\u02fa\5N(\2\u02f8\u02fa\5P)\2\u02f9\u02f5\3\2\2\2\u02f9\u02f6\3"+
		"\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02f8\3\2\2\2\u02faI\3\2\2\2\u02fb\u02fc"+
		"\7\34\2\2\u02fc\u02fd\58\35\2\u02fd\u02fe\7B\2\2\u02feK\3\2\2\2\u02ff"+
		"\u0300\7\34\2\2\u0300\u0301\5:\36\2\u0301\u0302\7D\2\2\u0302\u0303\7V"+
		"\2\2\u0303\u0304\7B\2\2\u0304M\3\2\2\2\u0305\u0306\7\34\2\2\u0306\u0307"+
		"\7)\2\2\u0307\u0308\58\35\2\u0308\u0309\7D\2\2\u0309\u030a\7i\2\2\u030a"+
		"\u030b\7B\2\2\u030bO\3\2\2\2\u030c\u030d\7\34\2\2\u030d\u030e\7)\2\2\u030e"+
		"\u030f\58\35\2\u030f\u0310\7D\2\2\u0310\u0311\7V\2\2\u0311\u0312\7B\2"+
		"\2\u0312Q\3\2\2\2\u0313\u0315\5X-\2\u0314\u0313\3\2\2\2\u0315\u0318\3"+
		"\2\2\2\u0316\u0314\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0319\3\2\2\2\u0318"+
		"\u0316\3\2\2\2\u0319\u031a\7\f\2\2\u031a\u031c\7i\2\2\u031b\u031d\5Z."+
		"\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u0320"+
		"\5^\60\2\u031f\u031e\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0322\3\2\2\2\u0321"+
		"\u0323\5`\61\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2"+
		"\2\2\u0324\u034b\5d\63\2\u0325\u0327\5X-\2\u0326\u0325\3\2\2\2\u0327\u032a"+
		"\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\3\2\2\2\u032a"+
		"\u0328\3\2\2\2\u032b\u032c\7\23\2\2\u032c\u032e\7i\2\2\u032d\u032f\5`"+
		"\61\2\u032e\u032d\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u034b\5\u00be`\2\u0331\u0333\5\u00ccg\2\u0332\u0331\3\2\2\2\u0333\u0336"+
		"\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336"+
		"\u0334\3\2\2\2\u0337\u0338\7\37\2\2\u0338\u033a\7i\2\2\u0339\u033b\5Z"+
		".\2\u033a\u0339\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033d\3\2\2\2\u033c"+
		"\u033e\5\u00ceh\2\u033d\u033c\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u033f"+
		"\3\2\2\2\u033f\u034b\5\u00d0i\2\u0340\u0342\5\u00ccg\2\u0341\u0340\3\2"+
		"\2\2\u0342\u0345\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344"+
		"\u0346\3\2\2\2\u0345\u0343\3\2\2\2\u0346\u0347\7\3\2\2\u0347\u0348\7i"+
		"\2\2\u0348\u034b\5\u00dep\2\u0349\u034b\7B\2\2\u034a\u0316\3\2\2\2\u034a"+
		"\u0328\3\2\2\2\u034a\u0334\3\2\2\2\u034a\u0343\3\2\2\2\u034a\u0349\3\2"+
		"\2\2\u034bS\3\2\2\2\u034c\u034f\5V,\2\u034d\u034f\5\u00bc_\2\u034e\u034c"+
		"\3\2\2\2\u034e\u034d\3\2\2\2\u034fU\3\2\2\2\u0350\u0352\5X-\2\u0351\u0350"+
		"\3\2\2\2\u0352\u0355\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"\u0356\3\2\2\2\u0355\u0353\3\2\2\2\u0356\u0357\7\f\2\2\u0357\u0359\7i"+
		"\2\2\u0358\u035a\5Z.\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c"+
		"\3\2\2\2\u035b\u035d\5^\60\2\u035c\u035b\3\2\2\2\u035c\u035d\3\2\2\2\u035d"+
		"\u035f\3\2\2\2\u035e\u0360\5`\61\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2"+
		"\2\2\u0360\u0361\3\2\2\2\u0361\u0362\5d\63\2\u0362W\3\2\2\2\u0363\u036c"+
		"\5\u00e8u\2\u0364\u036c\7&\2\2\u0365\u036c\7%\2\2\u0366\u036c\7$\2\2\u0367"+
		"\u036c\7\4\2\2\u0368\u036c\7)\2\2\u0369\u036c\7\25\2\2\u036a\u036c\7*"+
		"\2\2\u036b\u0363\3\2\2\2\u036b\u0364\3\2\2\2\u036b\u0365\3\2\2\2\u036b"+
		"\u0366\3\2\2\2\u036b\u0367\3\2\2\2\u036b\u0368\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036b\u036a\3\2\2\2\u036cY\3\2\2\2\u036d\u036e\7G\2\2\u036e\u036f"+
		"\5\\/\2\u036f\u0370\7F\2\2\u0370[\3\2\2\2\u0371\u0376\5$\23\2\u0372\u0373"+
		"\7C\2\2\u0373\u0375\5$\23\2\u0374\u0372\3\2\2\2\u0375\u0378\3\2\2\2\u0376"+
		"\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377]\3\2\2\2\u0378\u0376\3\2\2\2"+
		"\u0379\u037a\7\24\2\2\u037a\u037b\5\22\n\2\u037b_\3\2\2\2\u037c\u037d"+
		"\7\33\2\2\u037d\u037e\5b\62\2\u037ea\3\2\2\2\u037f\u0384\5\30\r\2\u0380"+
		"\u0381\7C\2\2\u0381\u0383\5\30\r\2\u0382\u0380\3\2\2\2\u0383\u0386\3\2"+
		"\2\2\u0384\u0382\3\2\2\2\u0384\u0385\3\2\2\2\u0385c\3\2\2\2\u0386\u0384"+
		"\3\2\2\2\u0387\u038b\7>\2\2\u0388\u038a\5f\64\2\u0389\u0388\3\2\2\2\u038a"+
		"\u038d\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038e\3\2"+
		"\2\2\u038d\u038b\3\2\2\2\u038e\u038f\7?\2\2\u038fe\3\2\2\2\u0390\u0395"+
		"\5h\65\2\u0391\u0395\5\u00acW\2\u0392\u0395\5\u00aeX\2\u0393\u0395\5\u00b0"+
		"Y\2\u0394\u0390\3\2\2\2\u0394\u0391\3\2\2\2\u0394\u0392\3\2\2\2\u0394"+
		"\u0393\3\2\2\2\u0395g\3\2\2\2\u0396\u039c\5j\66\2\u0397\u039c\5\u008e"+
		"H\2\u0398\u039c\5T+\2\u0399\u039c\5\u00c8e\2\u039a\u039c\7B\2\2\u039b"+
		"\u0396\3\2\2\2\u039b\u0397\3\2\2\2\u039b\u0398\3\2\2\2\u039b\u0399\3\2"+
		"\2\2\u039b\u039a\3\2\2\2\u039ci\3\2\2\2\u039d\u039f\5l\67\2\u039e\u039d"+
		"\3\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1"+
		"\u03a3\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a4\5v<\2\u03a4\u03a5\5n8\2"+
		"\u03a5\u03a6\7B\2\2\u03a6k\3\2\2\2\u03a7\u03b0\5\u00e8u\2\u03a8\u03b0"+
		"\7&\2\2\u03a9\u03b0\7%\2\2\u03aa\u03b0\7$\2\2\u03ab\u03b0\7)\2\2\u03ac"+
		"\u03b0\7\25\2\2\u03ad\u03b0\7\61\2\2\u03ae\u03b0\7\64\2\2\u03af\u03a7"+
		"\3\2\2\2\u03af\u03a8\3\2\2\2\u03af\u03a9\3\2\2\2\u03af\u03aa\3\2\2\2\u03af"+
		"\u03ab\3\2\2\2\u03af\u03ac\3\2\2\2\u03af\u03ad\3\2\2\2\u03af\u03ae\3\2"+
		"\2\2\u03b0m\3\2\2\2\u03b1\u03b6\5p9\2\u03b2\u03b3\7C\2\2\u03b3\u03b5\5"+
		"p9\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2\2\2\u03b6"+
		"\u03b7\3\2\2\2\u03b7o\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9\u03bc\5r:\2\u03ba"+
		"\u03bb\7E\2\2\u03bb\u03bd\5t;\2\u03bc\u03ba\3\2\2\2\u03bc\u03bd\3\2\2"+
		"\2\u03bdq\3\2\2\2\u03be\u03c0\7i\2\2\u03bf\u03c1\5\"\22\2\u03c0\u03bf"+
		"\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1s\3\2\2\2\u03c2\u03c5\5\u01a0\u00d1"+
		"\2\u03c3\u03c5\5\u00fa~\2\u03c4\u03c2\3\2\2\2\u03c4\u03c3\3\2\2\2\u03c5"+
		"u\3\2\2\2\u03c6\u03c9\5x=\2\u03c7\u03c9\5z>\2\u03c8\u03c6\3\2\2\2\u03c8"+
		"\u03c7\3\2\2\2\u03c9w\3\2\2\2\u03ca\u03cd\5\b\5\2\u03cb\u03cd\7\6\2\2"+
		"\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cdy\3\2\2\2\u03ce\u03d2\5"+
		"|?\2\u03cf\u03d2\5\u008aF\2\u03d0\u03d2\5\u008cG\2\u03d1\u03ce\3\2\2\2"+
		"\u03d1\u03cf\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2{\3\2\2\2\u03d3\u03d6\5"+
		"\u0082B\2\u03d4\u03d6\5\u0088E\2\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2\2"+
		"\2\u03d6\u03db\3\2\2\2\u03d7\u03da\5\u0080A\2\u03d8\u03da\5\u0086D\2\u03d9"+
		"\u03d7\3\2\2\2\u03d9\u03d8\3\2\2\2\u03da\u03dd\3\2\2\2\u03db\u03d9\3\2"+
		"\2\2\u03db\u03dc\3\2\2\2\u03dc}\3\2\2\2\u03dd\u03db\3\2\2\2\u03de\u03e0"+
		"\7i\2\2\u03df\u03e1\5,\27\2\u03e0\u03df\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1"+
		"\u03ef\3\2\2\2\u03e2\u03e3\5|?\2\u03e3\u03e7\7D\2\2\u03e4\u03e6\5\u00e8"+
		"u\2\u03e5\u03e4\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7\u03e5\3\2\2\2\u03e7"+
		"\u03e8\3\2\2\2\u03e8\u03ea\3\2\2\2\u03e9\u03e7\3\2\2\2\u03ea\u03ec\7i"+
		"\2\2\u03eb\u03ed\5,\27\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"\u03ef\3\2\2\2\u03ee\u03de\3\2\2\2\u03ee\u03e2\3\2\2\2\u03ef\177\3\2\2"+
		"\2\u03f0\u03f4\7D\2\2\u03f1\u03f3\5\u00e8u\2\u03f2\u03f1\3\2\2\2\u03f3"+
		"\u03f6\3\2\2\2\u03f4\u03f2\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5\u03f7\3\2"+
		"\2\2\u03f6\u03f4\3\2\2\2\u03f7\u03f9\7i\2\2\u03f8\u03fa\5,\27\2\u03f9"+
		"\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u0081\3\2\2\2\u03fb\u03fd\7i"+
		"\2\2\u03fc\u03fe\5,\27\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u0083\3\2\2\2\u03ff\u0400\5~@\2\u0400\u0085\3\2\2\2\u0401\u0402\5\u0080"+
		"A\2\u0402\u0087\3\2\2\2\u0403\u0404\5\u0082B\2\u0404\u0089\3\2\2\2\u0405"+
		"\u0406\7i\2\2\u0406\u008b\3\2\2\2\u0407\u0408\5x=\2\u0408\u0409\5\"\22"+
		"\2\u0409\u0411\3\2\2\2\u040a\u040b\5|?\2\u040b\u040c\5\"\22\2\u040c\u0411"+
		"\3\2\2\2\u040d\u040e\5\u008aF\2\u040e\u040f\5\"\22\2\u040f\u0411\3\2\2"+
		"\2\u0410\u0407\3\2\2\2\u0410\u040a\3\2\2\2\u0410\u040d\3\2\2\2\u0411\u008d"+
		"\3\2\2\2\u0412\u0414\5\u0090I\2\u0413\u0412\3\2\2\2\u0414\u0417\3\2\2"+
		"\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\3\2\2\2\u0417\u0415"+
		"\3\2\2\2\u0418\u0419\5\u0092J\2\u0419\u041a\5\u00aaV\2\u041a\u008f\3\2"+
		"\2\2\u041b\u0426\5\u00e8u\2\u041c\u0426\7&\2\2\u041d\u0426\7%\2\2\u041e"+
		"\u0426\7$\2\2\u041f\u0426\7\4\2\2\u0420\u0426\7)\2\2\u0421\u0426\7\25"+
		"\2\2\u0422\u0426\7-\2\2\u0423\u0426\7!\2\2\u0424\u0426\7*\2\2\u0425\u041b"+
		"\3\2\2\2\u0425\u041c\3\2\2\2\u0425\u041d\3\2\2\2\u0425\u041e\3\2\2\2\u0425"+
		"\u041f\3\2\2\2\u0425\u0420\3\2\2\2\u0425\u0421\3\2\2\2\u0425\u0422\3\2"+
		"\2\2\u0425\u0423\3\2\2\2\u0425\u0424\3\2\2\2\u0426\u0091\3\2\2\2\u0427"+
		"\u0428\5\u0094K\2\u0428\u042a\5\u0096L\2\u0429\u042b\5\u00a4S\2\u042a"+
		"\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u0439\3\2\2\2\u042c\u0430\5Z"+
		".\2\u042d\u042f\5\u00e8u\2\u042e\u042d\3\2\2\2\u042f\u0432\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0433\3\2\2\2\u0432\u0430\3\2"+
		"\2\2\u0433\u0434\5\u0094K\2\u0434\u0436\5\u0096L\2\u0435\u0437\5\u00a4"+
		"S\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438"+
		"\u0427\3\2\2\2\u0438\u042c\3\2\2\2\u0439\u0093\3\2\2\2\u043a\u043d\5v"+
		"<\2\u043b\u043d\7\63\2\2\u043c\u043a\3\2\2\2\u043c\u043b\3\2\2\2\u043d"+
		"\u0095\3\2\2\2\u043e\u043f\7i\2\2\u043f\u0441\7<\2\2\u0440\u0442\5\u0098"+
		"M\2\u0441\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2\2\2\u0443"+
		"\u0445\7=\2\2\u0444\u0446\5\"\22\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2"+
		"\2\2\u0446\u0097\3\2\2\2\u0447\u0448\5\u009aN\2\u0448\u0449\7C\2\2\u0449"+
		"\u044a\5\u00a0Q\2\u044a\u044d\3\2\2\2\u044b\u044d\5\u00a0Q\2\u044c\u0447"+
		"\3\2\2\2\u044c\u044b\3\2\2\2\u044d\u0099\3\2\2\2\u044e\u0453\5\u009cO"+
		"\2\u044f\u0450\7C\2\2\u0450\u0452\5\u009cO\2\u0451\u044f\3\2\2\2\u0452"+
		"\u0455\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u045f\3\2"+
		"\2\2\u0455\u0453\3\2\2\2\u0456\u045b\5\u00a2R\2\u0457\u0458\7C\2\2\u0458"+
		"\u045a\5\u009cO\2\u0459\u0457\3\2\2\2\u045a\u045d\3\2\2\2\u045b\u0459"+
		"\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045e"+
		"\u044e\3\2\2\2\u045e\u0456\3\2\2\2\u045f\u009b\3\2\2\2\u0460\u0462\5\u009e"+
		"P\2\u0461\u0460\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463"+
		"\u0464\3\2\2\2\u0464\u0466\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0467\5v"+
		"<\2\u0467\u0468\5r:\2\u0468\u009d\3\2\2\2\u0469\u046c\5\u00e8u\2\u046a"+
		"\u046c\7\25\2\2\u046b\u0469\3\2\2\2\u046b\u046a\3\2\2\2\u046c\u009f\3"+
		"\2\2\2\u046d\u046f\5\u009eP\2\u046e\u046d\3\2\2\2\u046f\u0472\3\2\2\2"+
		"\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0470"+
		"\3\2\2\2\u0473\u0477\5v<\2\u0474\u0476\5\u00e8u\2\u0475\u0474\3\2\2\2"+
		"\u0476\u0479\3\2\2\2\u0477\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047a"+
		"\3\2\2\2\u0479\u0477\3\2\2\2\u047a\u047b\7k\2\2\u047b\u047c\5r:\2\u047c"+
		"\u047f\3\2\2\2\u047d\u047f\5\u009cO\2\u047e\u0470\3\2\2\2\u047e\u047d"+
		"\3\2\2\2\u047f\u00a1\3\2\2\2\u0480\u0482\5\u00e8u\2\u0481\u0480\3\2\2"+
		"\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0486"+
		"\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0489\5v<\2\u0487\u0488\7i\2\2\u0488"+
		"\u048a\7D\2\2\u0489\u0487\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048c\7.\2\2\u048c\u00a3\3\2\2\2\u048d\u048e\7\60\2\2\u048e"+
		"\u048f\5\u00a6T\2\u048f\u00a5\3\2\2\2\u0490\u0495\5\u00a8U\2\u0491\u0492"+
		"\7C\2\2\u0492\u0494\5\u00a8U\2\u0493\u0491\3\2\2\2\u0494\u0497\3\2\2\2"+
		"\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u00a7\3\2\2\2\u0497\u0495"+
		"\3\2\2\2\u0498\u049b\5\22\n\2\u0499\u049b\5\36\20\2\u049a\u0498\3\2\2"+
		"\2\u049a\u0499\3\2\2\2\u049b\u00a9\3\2\2\2\u049c\u049f\5\u00fe\u0080\2"+
		"\u049d\u049f\7B\2\2\u049e\u049c\3\2\2\2\u049e\u049d\3\2\2\2\u049f\u00ab"+
		"\3\2\2\2\u04a0\u04a1\5\u00fe\u0080\2\u04a1\u00ad\3\2\2\2\u04a2\u04a3\7"+
		")\2\2\u04a3\u04a4\5\u00fe\u0080\2\u04a4\u00af\3\2\2\2\u04a5\u04a7\5\u00b2"+
		"Z\2\u04a6\u04a5\3\2\2\2\u04a7\u04aa\3\2\2\2\u04a8\u04a6\3\2\2\2\u04a8"+
		"\u04a9\3\2\2\2\u04a9\u04ab\3\2\2\2\u04aa\u04a8\3\2\2\2\u04ab\u04ad\5\u00b4"+
		"[\2\u04ac\u04ae\5\u00a4S\2\u04ad\u04ac\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae"+
		"\u04af\3\2\2\2\u04af\u04b0\5\u00b8]\2\u04b0\u00b1\3\2\2\2\u04b1\u04b6"+
		"\5\u00e8u\2\u04b2\u04b6\7&\2\2\u04b3\u04b6\7%\2\2\u04b4\u04b6\7$\2\2\u04b5"+
		"\u04b1\3\2\2\2\u04b5\u04b2\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b4\3\2"+
		"\2\2\u04b6\u00b3\3\2\2\2\u04b7\u04b9\5Z.\2\u04b8\u04b7\3\2\2\2\u04b8\u04b9"+
		"\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bb\5\u00b6\\\2\u04bb\u04bd\7<\2"+
		"\2\u04bc\u04be\5\u0098M\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c0\7=\2\2\u04c0\u00b5\3\2\2\2\u04c1\u04c2\7i\2"+
		"\2\u04c2\u00b7\3\2\2\2\u04c3\u04c5\7>\2\2\u04c4\u04c6\5\u00ba^\2\u04c5"+
		"\u04c4\3\2\2\2\u04c5\u04c6\3\2\2\2\u04c6\u04c8\3\2\2\2\u04c7\u04c9\5\u0100"+
		"\u0081\2\u04c8\u04c7\3\2\2\2\u04c8\u04c9\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca"+
		"\u04cb\7?\2\2\u04cb\u00b9\3\2\2\2\u04cc\u04ce\5,\27\2\u04cd\u04cc\3\2"+
		"\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\7.\2\2\u04d0"+
		"\u04d2\7<\2\2\u04d1\u04d3\5\u0190\u00c9\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3"+
		"\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04d5\7=\2\2\u04d5\u04fb\7B\2\2\u04d6"+
		"\u04d8\5,\27\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3\2"+
		"\2\2\u04d9\u04da\7+\2\2\u04da\u04dc\7<\2\2\u04db\u04dd\5\u0190\u00c9\2"+
		"\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df"+
		"\7=\2\2\u04df\u04fb\7B\2\2\u04e0\u04e1\5<\37\2\u04e1\u04e3\7D\2\2\u04e2"+
		"\u04e4\5,\27\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2"+
		"\2\2\u04e5\u04e6\7+\2\2\u04e6\u04e8\7<\2\2\u04e7\u04e9\5\u0190\u00c9\2"+
		"\u04e8\u04e7\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb"+
		"\7=\2\2\u04eb\u04ec\7B\2\2\u04ec\u04fb\3\2\2\2\u04ed\u04ee\5\u0162\u00b2"+
		"\2\u04ee\u04f0\7D\2\2\u04ef\u04f1\5,\27\2\u04f0\u04ef\3\2\2\2\u04f0\u04f1"+
		"\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f3\7+\2\2\u04f3\u04f5\7<\2\2\u04f4"+
		"\u04f6\5\u0190\u00c9\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7"+
		"\3\2\2\2\u04f7\u04f8\7=\2\2\u04f8\u04f9\7B\2\2\u04f9\u04fb\3\2\2\2\u04fa"+
		"\u04cd\3\2\2\2\u04fa\u04d7\3\2\2\2\u04fa\u04e0\3\2\2\2\u04fa\u04ed\3\2"+
		"\2\2\u04fb\u00bb\3\2\2\2\u04fc\u04fe\5X-\2\u04fd\u04fc\3\2\2\2\u04fe\u0501"+
		"\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501"+
		"\u04ff\3\2\2\2\u0502\u0503\7\23\2\2\u0503\u0505\7i\2\2\u0504\u0506\5`"+
		"\61\2\u0505\u0504\3\2\2\2\u0505\u0506\3\2\2\2\u0506\u0507\3\2\2\2\u0507"+
		"\u0508\5\u00be`\2\u0508\u00bd\3\2\2\2\u0509\u050b\7>\2\2\u050a\u050c\5"+
		"\u00c0a\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2"+
		"\u050d\u050f\7C\2\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0511"+
		"\3\2\2\2\u0510\u0512\5\u00c6d\2\u0511\u0510\3\2\2\2\u0511\u0512\3\2\2"+
		"\2\u0512\u0513\3\2\2\2\u0513\u0514\7?\2\2\u0514\u00bf\3\2\2\2\u0515\u051a"+
		"\5\u00c2b\2\u0516\u0517\7C\2\2\u0517\u0519\5\u00c2b\2\u0518\u0516\3\2"+
		"\2\2\u0519\u051c\3\2\2\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b"+
		"\u00c1\3\2\2\2\u051c\u051a\3\2\2\2\u051d\u051f\5\u00c4c\2\u051e\u051d"+
		"\3\2\2\2\u051f\u0522\3\2\2\2\u0520\u051e\3\2\2\2\u0520\u0521\3\2\2\2\u0521"+
		"\u0523\3\2\2\2\u0522\u0520\3\2\2\2\u0523\u0529\7i\2\2\u0524\u0526\7<\2"+
		"\2\u0525\u0527\5\u0190\u00c9\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2"+
		"\u0527\u0528\3\2\2\2\u0528\u052a\7=\2\2\u0529\u0524\3\2\2\2\u0529\u052a"+
		"\3\2\2\2\u052a\u052c\3\2\2\2\u052b\u052d\5d\63\2\u052c\u052b\3\2\2\2\u052c"+
		"\u052d\3\2\2\2\u052d\u00c3\3\2\2\2\u052e\u052f\5\u00e8u\2\u052f\u00c5"+
		"\3\2\2\2\u0530\u0534\7B\2\2\u0531\u0533\5f\64\2\u0532\u0531\3\2\2\2\u0533"+
		"\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u00c7\3\2"+
		"\2\2\u0536\u0534\3\2\2\2\u0537\u053a\5\u00caf\2\u0538\u053a\5\u00dco\2"+
		"\u0539\u0537\3\2\2\2\u0539\u0538\3\2\2\2\u053a\u00c9\3\2\2\2\u053b\u053d"+
		"\5\u00ccg\2\u053c\u053b\3\2\2\2\u053d\u0540\3\2\2\2\u053e\u053c\3\2\2"+
		"\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u053e\3\2\2\2\u0541\u0542"+
		"\7\37\2\2\u0542\u0544\7i\2\2\u0543\u0545\5Z.\2\u0544\u0543\3\2\2\2\u0544"+
		"\u0545\3\2\2\2\u0545\u0547\3\2\2\2\u0546\u0548\5\u00ceh\2\u0547\u0546"+
		"\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\5\u00d0i"+
		"\2\u054a\u00cb\3\2\2\2\u054b\u0553\5\u00e8u\2\u054c\u0553\7&\2\2\u054d"+
		"\u0553\7%\2\2\u054e\u0553\7$\2\2\u054f\u0553\7\4\2\2\u0550\u0553\7)\2"+
		"\2\u0551\u0553\7*\2\2\u0552\u054b\3\2\2\2\u0552\u054c\3\2\2\2\u0552\u054d"+
		"\3\2\2\2\u0552\u054e\3\2\2\2\u0552\u054f\3\2\2\2\u0552\u0550\3\2\2\2\u0552"+
		"\u0551\3\2\2\2\u0553\u00cd\3\2\2\2\u0554\u0555\7\24\2\2\u0555\u0556\5"+
		"b\62\2\u0556\u00cf\3\2\2\2\u0557\u055b\7>\2\2\u0558\u055a\5\u00d2j\2\u0559"+
		"\u0558\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055c\3\2"+
		"\2\2\u055c\u055e\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u055f\7?\2\2\u055f"+
		"\u00d1\3\2\2\2\u0560\u0566\5\u00d4k\2\u0561\u0566\5\u00d8m\2\u0562\u0566"+
		"\5T+\2\u0563\u0566\5\u00c8e\2\u0564\u0566\7B\2\2\u0565\u0560\3\2\2\2\u0565"+
		"\u0561\3\2\2\2\u0565\u0562\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0564\3\2"+
		"\2\2\u0566\u00d3\3\2\2\2\u0567\u0569\5\u00d6l\2\u0568\u0567\3\2\2\2\u0569"+
		"\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2"+
		"\2\2\u056c\u056a\3\2\2\2\u056d\u056e\5v<\2\u056e\u056f\5n8\2\u056f\u0570"+
		"\7B\2\2\u0570\u00d5\3\2\2\2\u0571\u0576\5\u00e8u\2\u0572\u0576\7&\2\2"+
		"\u0573\u0576\7)\2\2\u0574\u0576\7\25\2\2\u0575\u0571\3\2\2\2\u0575\u0572"+
		"\3\2\2\2\u0575\u0573\3\2\2\2\u0575\u0574\3\2\2\2\u0576\u00d7\3\2\2\2\u0577"+
		"\u0579\5\u00dan\2\u0578\u0577\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u0578"+
		"\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057d\3\2\2\2\u057c\u057a\3\2\2\2\u057d"+
		"\u057e\5\u0092J\2\u057e\u057f\5\u00aaV\2\u057f\u00d9\3\2\2\2\u0580\u0587"+
		"\5\u00e8u\2\u0581\u0587\7&\2\2\u0582\u0587\7\4\2\2\u0583\u0587\7\17\2"+
		"\2\u0584\u0587\7)\2\2\u0585\u0587\7*\2\2\u0586\u0580\3\2\2\2\u0586\u0581"+
		"\3\2\2\2\u0586\u0582\3\2\2\2\u0586\u0583\3\2\2\2\u0586\u0584\3\2\2\2\u0586"+
		"\u0585\3\2\2\2\u0587\u00db\3\2\2\2\u0588\u058a\5\u00ccg\2\u0589\u0588"+
		"\3\2\2\2\u058a\u058d\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058c\3\2\2\2\u058c"+
		"\u058e\3\2\2\2\u058d\u058b\3\2\2\2\u058e\u058f\7j\2\2\u058f\u0590\7\37"+
		"\2\2\u0590\u0591\7i\2\2\u0591\u0592\5\u00dep\2\u0592\u00dd\3\2\2\2\u0593"+
		"\u0597\7>\2\2\u0594\u0596\5\u00e0q\2\u0595\u0594\3\2\2\2\u0596\u0599\3"+
		"\2\2\2\u0597\u0595\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u059a\3\2\2\2\u0599"+
		"\u0597\3\2\2\2\u059a\u059b\7?\2\2\u059b\u00df\3\2\2\2\u059c\u05a2\5\u00e2"+
		"r\2\u059d\u05a2\5\u00d4k\2\u059e\u05a2\5T+\2\u059f\u05a2\5\u00c8e\2\u05a0"+
		"\u05a2\7B\2\2\u05a1\u059c\3\2\2\2\u05a1\u059d\3\2\2\2\u05a1\u059e\3\2"+
		"\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2\u00e1\3\2\2\2\u05a3"+
		"\u05a5\5\u00e4s\2\u05a4\u05a3\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6\u05a4"+
		"\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a9"+
		"\u05aa\5v<\2\u05aa\u05ab\7i\2\2\u05ab\u05ac\7<\2\2\u05ac\u05ae\7=\2\2"+
		"\u05ad\u05af\5\"\22\2\u05ae\u05ad\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b1"+
		"\3\2\2\2\u05b0\u05b2\5\u00e6t\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2"+
		"\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\7B\2\2\u05b4\u00e3\3\2\2\2\u05b5\u05b9"+
		"\5\u00e8u\2\u05b6\u05b9\7&\2\2\u05b7\u05b9\7\4\2\2\u05b8\u05b5\3\2\2\2"+
		"\u05b8\u05b6\3\2\2\2\u05b8\u05b7\3\2\2\2\u05b9\u00e5\3\2\2\2\u05ba\u05bb"+
		"\7\17\2\2\u05bb\u05bc\5\u00f0y\2\u05bc\u00e7\3\2\2\2\u05bd\u05c1\5\u00ea"+
		"v\2\u05be\u05c1\5\u00f6|\2\u05bf\u05c1\5\u00f8}\2\u05c0\u05bd\3\2\2\2"+
		"\u05c0\u05be\3\2\2\2\u05c0\u05bf\3\2\2\2\u05c1\u00e9\3\2\2\2\u05c2\u05c3"+
		"\7j\2\2\u05c3\u05c4\58\35\2\u05c4\u05c6\7<\2\2\u05c5\u05c7\5\u00ecw\2"+
		"\u05c6\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9"+
		"\7=\2\2\u05c9\u00eb\3\2\2\2\u05ca\u05cf\5\u00eex\2\u05cb\u05cc\7C\2\2"+
		"\u05cc\u05ce\5\u00eex\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\3\2\2\2\u05cf"+
		"\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u00ed\3\2\2\2\u05d1\u05cf\3\2"+
		"\2\2\u05d2\u05d3\7i\2\2\u05d3\u05d4\7E\2\2\u05d4\u05d5\5\u00f0y\2\u05d5"+
		"\u00ef\3\2\2\2\u05d6\u05da\5\u01b2\u00da\2\u05d7\u05da\5\u00f2z\2\u05d8"+
		"\u05da\5\u00e8u\2\u05d9\u05d6\3\2\2\2\u05d9\u05d7\3\2\2\2\u05d9\u05d8"+
		"\3\2\2\2\u05da\u00f1\3\2\2\2\u05db\u05dd\7>\2\2\u05dc\u05de\5\u00f4{\2"+
		"\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0\3\2\2\2\u05df\u05e1"+
		"\7C\2\2\u05e0\u05df\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\3\2\2\2\u05e2"+
		"\u05e3\7?\2\2\u05e3\u00f3\3\2\2\2\u05e4\u05e9\5\u00f0y\2\u05e5\u05e6\7"+
		"C\2\2\u05e6\u05e8\5\u00f0y\2\u05e7\u05e5\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9"+
		"\u05e7\3\2\2\2\u05e9\u05ea\3\2\2\2\u05ea\u00f5\3\2\2\2\u05eb\u05e9\3\2"+
		"\2\2\u05ec\u05ed\7j\2\2\u05ed\u05ee\58\35\2\u05ee\u00f7\3\2\2\2\u05ef"+
		"\u05f0\7j\2\2\u05f0\u05f1\58\35\2\u05f1\u05f2\7<\2\2\u05f2\u05f3\5\u00f0"+
		"y\2\u05f3\u05f4\7=\2\2\u05f4\u00f9\3\2\2\2\u05f5\u05f7\7>\2\2\u05f6\u05f8"+
		"\5\u00fc\177\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05fa\3\2"+
		"\2\2\u05f9\u05fb\7C\2\2\u05fa\u05f9\3\2\2\2\u05fa\u05fb\3\2\2\2\u05fb"+
		"\u05fc\3\2\2\2\u05fc\u05fd\7?\2\2\u05fd\u00fb\3\2\2\2\u05fe\u0603\5t;"+
		"\2\u05ff\u0600\7C\2\2\u0600\u0602\5t;\2\u0601\u05ff\3\2\2\2\u0602\u0605"+
		"\3\2\2\2\u0603\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u00fd\3\2\2\2\u0605"+
		"\u0603\3\2\2\2\u0606\u0608\7>\2\2\u0607\u0609\5\u0100\u0081\2\u0608\u0607"+
		"\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u060b\7?\2\2\u060b"+
		"\u00ff\3\2\2\2\u060c\u0610\5\u0102\u0082\2\u060d\u060f\5\u0102\u0082\2"+
		"\u060e\u060d\3\2\2\2\u060f\u0612\3\2\2\2\u0610\u060e\3\2\2\2\u0610\u0611"+
		"\3\2\2\2\u0611\u0101\3\2\2\2\u0612\u0610\3\2\2\2\u0613\u0617\5\u0104\u0083"+
		"\2\u0614\u0617\5T+\2\u0615\u0617\5\u0108\u0085\2\u0616\u0613\3\2\2\2\u0616"+
		"\u0614\3\2\2\2\u0616\u0615\3\2\2\2\u0617\u0103\3\2\2\2\u0618\u0619\5\u0106"+
		"\u0084\2\u0619\u061a\7B\2\2\u061a\u0105\3\2\2\2\u061b\u061d\5\u009eP\2"+
		"\u061c\u061b\3\2\2\2\u061d\u0620\3\2\2\2\u061e\u061c\3\2\2\2\u061e\u061f"+
		"\3\2\2\2\u061f\u0621\3\2\2\2\u0620\u061e\3\2\2\2\u0621\u0622\5v<\2\u0622"+
		"\u0623\5n8\2\u0623\u0107\3\2\2\2\u0624\u062b\5\u010c\u0087\2\u0625\u062b"+
		"\5\u0110\u0089\2\u0626\u062b\5\u0118\u008d\2\u0627\u062b\5\u011a\u008e"+
		"\2\u0628\u062b\5\u012c\u0097\2\u0629\u062b\5\u0132\u009a\2\u062a\u0624"+
		"\3\2\2\2\u062a\u0625\3\2\2\2\u062a\u0626\3\2\2\2\u062a\u0627\3\2\2\2\u062a"+
		"\u0628\3\2\2\2\u062a\u0629\3\2\2\2\u062b\u0109\3\2\2\2\u062c\u0632\5\u010c"+
		"\u0087\2\u062d\u0632\5\u0112\u008a\2\u062e\u0632\5\u011c\u008f\2\u062f"+
		"\u0632\5\u012e\u0098\2\u0630\u0632\5\u0134\u009b\2\u0631\u062c\3\2\2\2"+
		"\u0631\u062d\3\2\2\2\u0631\u062e\3\2\2\2\u0631\u062f\3\2\2\2\u0631\u0630"+
		"\3\2\2\2\u0632\u010b\3\2\2\2\u0633\u0640\5\u00fe\u0080\2\u0634\u0640\5"+
		"\u010e\u0088\2\u0635\u0640\5\u0114\u008b\2\u0636\u0640\5\u011e\u0090\2"+
		"\u0637\u0640\5\u0120\u0091\2\u0638\u0640\5\u0130\u0099\2\u0639\u0640\5"+
		"\u0144\u00a3\2\u063a\u0640\5\u0146\u00a4\2\u063b\u0640\5\u0148\u00a5\2"+
		"\u063c\u0640\5\u014c\u00a7\2\u063d\u0640\5\u014a\u00a6\2\u063e\u0640\5"+
		"\u014e\u00a8\2\u063f\u0633\3\2\2\2\u063f\u0634\3\2\2\2\u063f\u0635\3\2"+
		"\2\2\u063f\u0636\3\2\2\2\u063f\u0637\3\2\2\2\u063f\u0638\3\2\2\2\u063f"+
		"\u0639\3\2\2\2\u063f\u063a\3\2\2\2\u063f\u063b\3\2\2\2\u063f\u063c\3\2"+
		"\2\2\u063f\u063d\3\2\2\2\u063f\u063e\3\2\2\2\u0640\u010d\3\2\2\2\u0641"+
		"\u0642\7B\2\2\u0642\u010f\3\2\2\2\u0643\u0644\7i\2\2\u0644\u0645\7K\2"+
		"\2\u0645\u0646\5\u0108\u0085\2\u0646\u0111\3\2\2\2\u0647\u0648\7i\2\2"+
		"\u0648\u0649\7K\2\2\u0649\u064a\5\u010a\u0086\2\u064a\u0113\3\2\2\2\u064b"+
		"\u064c\5\u0116\u008c\2\u064c\u064d\7B\2\2\u064d\u0115\3\2\2\2\u064e\u0656"+
		"\5\u01ac\u00d7\2\u064f\u0656\5\u01ca\u00e6\2\u0650\u0656\5\u01cc\u00e7"+
		"\2\u0651\u0656\5\u01d2\u00ea\2\u0652\u0656\5\u01d6\u00ec\2\u0653\u0656"+
		"\5\u018a\u00c6\2\u0654\u0656\5\u0176\u00bc\2\u0655\u064e\3\2\2\2\u0655"+
		"\u064f\3\2\2\2\u0655\u0650\3\2\2\2\u0655\u0651\3\2\2\2\u0655\u0652\3\2"+
		"\2\2\u0655\u0653\3\2\2\2\u0655\u0654\3\2\2\2\u0656\u0117\3\2\2\2\u0657"+
		"\u0658\7\31\2\2\u0658\u0659\7<\2\2\u0659\u065a\5\u01a0\u00d1\2\u065a\u065b"+
		"\7=\2\2\u065b\u065c\5\u0108\u0085\2\u065c\u0119\3\2\2\2\u065d\u065e\7"+
		"\31\2\2\u065e\u065f\7<\2\2\u065f\u0660\5\u01a0\u00d1\2\u0660\u0661\7="+
		"\2\2\u0661\u0662\5\u010a\u0086\2\u0662\u0663\7\22\2\2\u0663\u0664\5\u0108"+
		"\u0085\2\u0664\u011b\3\2\2\2\u0665\u0666\7\31\2\2\u0666\u0667\7<\2\2\u0667"+
		"\u0668\5\u01a0\u00d1\2\u0668\u0669\7=\2\2\u0669\u066a\5\u010a\u0086\2"+
		"\u066a\u066b\7\22\2\2\u066b\u066c\5\u010a\u0086\2\u066c\u011d\3\2\2\2"+
		"\u066d\u066e\7\5\2\2\u066e\u066f\5\u01a0\u00d1\2\u066f\u0670\7B\2\2\u0670"+
		"\u0678\3\2\2\2\u0671\u0672\7\5\2\2\u0672\u0673\5\u01a0\u00d1\2\u0673\u0674"+
		"\7K\2\2\u0674\u0675\5\u01a0\u00d1\2\u0675\u0676\7B\2\2\u0676\u0678\3\2"+
		"\2\2\u0677\u066d\3\2\2\2\u0677\u0671\3\2\2\2\u0678\u011f\3\2\2\2\u0679"+
		"\u067a\7,\2\2\u067a\u067b\7<\2\2\u067b\u067c\5\u01a0\u00d1\2\u067c\u067d"+
		"\7=\2\2\u067d\u067e\5\u0122\u0092\2\u067e\u0121\3\2\2\2\u067f\u0683\7"+
		">\2\2\u0680\u0682\5\u0124\u0093\2\u0681\u0680\3\2\2\2\u0682\u0685\3\2"+
		"\2\2\u0683\u0681\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u0689\3\2\2\2\u0685"+
		"\u0683\3\2\2\2\u0686\u0688\5\u0128\u0095\2\u0687\u0686\3\2\2\2\u0688\u068b"+
		"\3\2\2\2\u0689\u0687\3\2\2\2\u0689\u068a\3\2\2\2\u068a\u068c\3\2\2\2\u068b"+
		"\u0689\3\2\2\2\u068c\u068d\7?\2\2\u068d\u0123\3\2\2\2\u068e\u068f\5\u0126"+
		"\u0094\2\u068f\u0690\5\u0100\u0081\2\u0690\u0125\3\2\2\2\u0691\u0695\5"+
		"\u0128\u0095\2\u0692\u0694\5\u0128\u0095\2\u0693\u0692\3\2\2\2\u0694\u0697"+
		"\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0127\3\2\2\2\u0697"+
		"\u0695\3\2\2\2\u0698\u0699\7\t\2\2\u0699\u069a\5\u019e\u00d0\2\u069a\u069b"+
		"\7K\2\2\u069b\u06a3\3\2\2\2\u069c\u069d\7\t\2\2\u069d\u069e\5\u012a\u0096"+
		"\2\u069e\u069f\7K\2\2\u069f\u06a3\3\2\2\2\u06a0\u06a1\7\17\2\2\u06a1\u06a3"+
		"\7K\2\2\u06a2\u0698\3\2\2\2\u06a2\u069c\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a3"+
		"\u0129\3\2\2\2\u06a4\u06a5\7i\2\2\u06a5\u012b\3\2\2\2\u06a6\u06a7\7\65"+
		"\2\2\u06a7\u06a8\7<\2\2\u06a8\u06a9\5\u01a0\u00d1\2\u06a9\u06aa\7=\2\2"+
		"\u06aa\u06ab\5\u0108\u0085\2\u06ab\u012d\3\2\2\2\u06ac\u06ad\7\65\2\2"+
		"\u06ad\u06ae\7<\2\2\u06ae\u06af\5\u01a0\u00d1\2\u06af\u06b0\7=\2\2\u06b0"+
		"\u06b1\5\u010a\u0086\2\u06b1\u012f\3\2\2\2\u06b2\u06b3\7\20\2\2\u06b3"+
		"\u06b4\5\u0108\u0085\2\u06b4\u06b5\7\65\2\2\u06b5\u06b6\7<\2\2\u06b6\u06b7"+
		"\5\u01a0\u00d1\2\u06b7\u06b8\7=\2\2\u06b8\u06b9\7B\2\2\u06b9\u0131\3\2"+
		"\2\2\u06ba\u06bd\5\u0136\u009c\2\u06bb\u06bd\5\u0140\u00a1\2\u06bc\u06ba"+
		"\3\2\2\2\u06bc\u06bb\3\2\2\2\u06bd\u0133\3\2\2\2\u06be\u06c1\5\u0138\u009d"+
		"\2\u06bf\u06c1\5\u0142\u00a2\2\u06c0\u06be\3\2\2\2\u06c0\u06bf\3\2\2\2"+
		"\u06c1\u0135\3\2\2\2\u06c2\u06c3\7\30\2\2\u06c3\u06c5\7<\2\2\u06c4\u06c6"+
		"\5\u013a\u009e\2\u06c5\u06c4\3\2\2\2\u06c5\u06c6\3\2\2\2\u06c6\u06c7\3"+
		"\2\2\2\u06c7\u06c9\7B\2\2\u06c8\u06ca\5\u01a0\u00d1\2\u06c9\u06c8\3\2"+
		"\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06cd\7B\2\2\u06cc"+
		"\u06ce\5\u013c\u009f\2\u06cd\u06cc\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06cf"+
		"\3\2\2\2\u06cf\u06d0\7=\2\2\u06d0\u06d1\5\u0108\u0085\2\u06d1\u0137\3"+
		"\2\2\2\u06d2\u06d3\7\30\2\2\u06d3\u06d5\7<\2\2\u06d4\u06d6\5\u013a\u009e"+
		"\2\u06d5\u06d4\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d9"+
		"\7B\2\2\u06d8\u06da\5\u01a0\u00d1\2\u06d9\u06d8\3\2\2\2\u06d9\u06da\3"+
		"\2\2\2\u06da\u06db\3\2\2\2\u06db\u06dd\7B\2\2\u06dc\u06de\5\u013c\u009f"+
		"\2\u06dd\u06dc\3\2\2\2\u06dd\u06de\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e0"+
		"\7=\2\2\u06e0\u06e1\5\u010a\u0086\2\u06e1\u0139\3\2\2\2\u06e2\u06e5\5"+
		"\u013e\u00a0\2\u06e3\u06e5\5\u0106\u0084\2\u06e4\u06e2\3\2\2\2\u06e4\u06e3"+
		"\3\2\2\2\u06e5\u013b\3\2\2\2\u06e6\u06e7\5\u013e\u00a0\2\u06e7\u013d\3"+
		"\2\2\2\u06e8\u06ed\5\u0116\u008c\2\u06e9\u06ea\7C\2\2\u06ea\u06ec\5\u0116"+
		"\u008c\2\u06eb\u06e9\3\2\2\2\u06ec\u06ef\3\2\2\2\u06ed\u06eb\3\2\2\2\u06ed"+
		"\u06ee\3\2\2\2\u06ee\u013f\3\2\2\2\u06ef\u06ed\3\2\2\2\u06f0\u06f1\7\30"+
		"\2\2\u06f1\u06f5\7<\2\2\u06f2\u06f4\5\u009eP\2\u06f3\u06f2\3\2\2\2\u06f4"+
		"\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8\3\2"+
		"\2\2\u06f7\u06f5\3\2\2\2\u06f8\u06f9\5v<\2\u06f9\u06fa\5r:\2\u06fa\u06fb"+
		"\7K\2\2\u06fb\u06fc\5\u01a0\u00d1\2\u06fc\u06fd\7=\2\2\u06fd\u06fe\5\u0108"+
		"\u0085\2\u06fe\u0141\3\2\2\2\u06ff\u0700\7\30\2\2\u0700\u0704\7<\2\2\u0701"+
		"\u0703\5\u009eP\2\u0702\u0701\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702"+
		"\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0707\3\2\2\2\u0706\u0704\3\2\2\2\u0707"+
		"\u0708\5v<\2\u0708\u0709\5r:\2\u0709\u070a\7K\2\2\u070a\u070b\5\u01a0"+
		"\u00d1\2\u070b\u070c\7=\2\2\u070c\u070d\5\u010a\u0086\2\u070d\u0143\3"+
		"\2\2\2\u070e\u0710\7\7\2\2\u070f\u0711\7i\2\2\u0710\u070f\3\2\2\2\u0710"+
		"\u0711\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u0713\7B\2\2\u0713\u0145\3\2"+
		"\2\2\u0714\u0716\7\16\2\2\u0715\u0717\7i\2\2\u0716\u0715\3\2\2\2\u0716"+
		"\u0717\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0719\7B\2\2\u0719\u0147\3\2"+
		"\2\2\u071a\u071c\7\'\2\2\u071b\u071d\5\u01a0\u00d1\2\u071c\u071b\3\2\2"+
		"\2\u071c\u071d\3\2\2\2\u071d\u071e\3\2\2\2\u071e\u071f\7B\2\2\u071f\u0149"+
		"\3\2\2\2\u0720\u0721\7/\2\2\u0721\u0722\5\u01a0\u00d1\2\u0722\u0723\7"+
		"B\2\2\u0723\u014b\3\2\2\2\u0724\u0725\7-\2\2\u0725\u0726\7<\2\2\u0726"+
		"\u0727\5\u01a0\u00d1\2\u0727\u0728\7=\2\2\u0728\u0729\5\u00fe\u0080\2"+
		"\u0729\u014d\3\2\2\2\u072a\u072b\7\62\2\2\u072b\u072c\5\u00fe\u0080\2"+
		"\u072c\u072d\5\u0150\u00a9\2\u072d\u0737\3\2\2\2\u072e\u072f\7\62\2\2"+
		"\u072f\u0731\5\u00fe\u0080\2\u0730\u0732\5\u0150\u00a9\2\u0731\u0730\3"+
		"\2\2\2\u0731\u0732\3\2\2\2\u0732\u0733\3\2\2\2\u0733\u0734\5\u0158\u00ad"+
		"\2\u0734\u0737\3\2\2\2\u0735\u0737\5\u015a\u00ae\2\u0736\u072a\3\2\2\2"+
		"\u0736\u072e\3\2\2\2\u0736\u0735\3\2\2\2\u0737\u014f\3\2\2\2\u0738\u073c"+
		"\5\u0152\u00aa\2\u0739\u073b\5\u0152\u00aa\2\u073a\u0739\3\2\2\2\u073b"+
		"\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0151\3\2"+
		"\2\2\u073e\u073c\3\2\2\2\u073f\u0740\7\n\2\2\u0740\u0741\7<\2\2\u0741"+
		"\u0742\5\u0154\u00ab\2\u0742\u0743\7=\2\2\u0743\u0744\5\u00fe\u0080\2"+
		"\u0744\u0153\3\2\2\2\u0745\u0747\5\u009eP\2\u0746\u0745\3\2\2\2\u0747"+
		"\u074a\3\2\2\2\u0748\u0746\3\2\2\2\u0748\u0749\3\2\2\2\u0749\u074b\3\2"+
		"\2\2\u074a\u0748\3\2\2\2\u074b\u074c\5\u0156\u00ac\2\u074c\u074d\5r:\2"+
		"\u074d\u0155\3\2\2\2\u074e\u0753\5~@\2\u074f\u0750\7Y\2\2\u0750\u0752"+
		"\5\22\n\2\u0751\u074f\3\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2"+
		"\u0753\u0754\3\2\2\2\u0754\u0157\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u0757"+
		"\7\26\2\2\u0757\u0758\5\u00fe\u0080\2\u0758\u0159\3\2\2\2\u0759\u075a"+
		"\7\62\2\2\u075a\u075b\5\u015c\u00af\2\u075b\u075d\5\u00fe\u0080\2\u075c"+
		"\u075e\5\u0150\u00a9\2\u075d\u075c\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u0760"+
		"\3\2\2\2\u075f\u0761\5\u0158\u00ad\2\u0760\u075f\3\2\2\2\u0760\u0761\3"+
		"\2\2\2\u0761\u015b\3\2\2\2\u0762\u0763\7<\2\2\u0763\u0765\5\u015e\u00b0"+
		"\2\u0764\u0766\7B\2\2\u0765\u0764\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767"+
		"\3\2\2\2\u0767\u0768\7=\2\2\u0768\u015d\3\2\2\2\u0769\u076e\5\u0160\u00b1"+
		"\2\u076a\u076b\7B\2\2\u076b\u076d\5\u0160\u00b1\2\u076c\u076a\3\2\2\2"+
		"\u076d\u0770\3\2\2\2\u076e\u076c\3\2\2\2\u076e\u076f\3\2\2\2\u076f\u015f"+
		"\3\2\2\2\u0770\u076e\3\2\2\2\u0771\u0773\5\u009eP\2\u0772\u0771\3\2\2"+
		"\2\u0773\u0776\3\2\2\2\u0774\u0772\3\2\2\2\u0774\u0775\3\2\2\2\u0775\u0777"+
		"\3\2\2\2\u0776\u0774\3\2\2\2\u0777\u0778\5v<\2\u0778\u0779\5r:\2\u0779"+
		"\u077a\7E\2\2\u077a\u077b\5\u01a0\u00d1\2\u077b\u0161\3\2\2\2\u077c\u077f"+
		"\5\u0170\u00b9\2\u077d\u077f\5\u0198\u00cd\2\u077e\u077c\3\2\2\2\u077e"+
		"\u077d\3\2\2\2\u077f\u0783\3\2\2\2\u0780\u0782\5\u016a\u00b6\2\u0781\u0780"+
		"\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2\2\2\u0784"+
		"\u0163\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u07a4\5\2\2\2\u0787\u078c\58"+
		"\35\2\u0788\u0789\7@\2\2\u0789\u078b\7A\2\2\u078a\u0788\3\2\2\2\u078b"+
		"\u078e\3\2\2\2\u078c\u078a\3\2\2\2\u078c\u078d\3\2\2\2\u078d\u078f\3\2"+
		"\2\2\u078e\u078c\3\2\2\2\u078f\u0790\7D\2\2\u0790\u0791\7\f\2\2\u0791"+
		"\u07a4\3\2\2\2\u0792\u0793\7\63\2\2\u0793\u0794\7D\2\2\u0794\u07a4\7\f"+
		"\2\2\u0795\u07a4\7.\2\2\u0796\u0797\58\35\2\u0797\u0798\7D\2\2\u0798\u0799"+
		"\7.\2\2\u0799\u07a4\3\2\2\2\u079a\u079b\7<\2\2\u079b\u079c\5\u01a0\u00d1"+
		"\2\u079c\u079d\7=\2\2\u079d\u07a4\3\2\2\2\u079e\u07a4\5\u0176\u00bc\2"+
		"\u079f\u07a4\5\u017e\u00c0\2\u07a0\u07a4\5\u0184\u00c3\2\u07a1\u07a4\5"+
		"\u018a\u00c6\2\u07a2\u07a4\5\u0192\u00ca\2\u07a3\u0786\3\2\2\2\u07a3\u0787"+
		"\3\2\2\2\u07a3\u0792\3\2\2\2\u07a3\u0795\3\2\2\2\u07a3\u0796\3\2\2\2\u07a3"+
		"\u079a\3\2\2\2\u07a3\u079e\3\2\2\2\u07a3\u079f\3\2\2\2\u07a3\u07a0\3\2"+
		"\2\2\u07a3\u07a1\3\2\2\2\u07a3\u07a2\3\2\2\2\u07a4\u0165\3\2\2\2\u07a5"+
		"\u07a6\3\2\2\2\u07a6\u0167\3\2\2\2\u07a7\u07c4\5\2\2\2\u07a8\u07ad\58"+
		"\35\2\u07a9\u07aa\7@\2\2\u07aa\u07ac\7A\2\2\u07ab\u07a9\3\2\2\2\u07ac"+
		"\u07af\3\2\2\2\u07ad\u07ab\3\2\2\2\u07ad\u07ae\3\2\2\2\u07ae\u07b0\3\2"+
		"\2\2\u07af\u07ad\3\2\2\2\u07b0\u07b1\7D\2\2\u07b1\u07b2\7\f\2\2\u07b2"+
		"\u07c4\3\2\2\2\u07b3\u07b4\7\63\2\2\u07b4\u07b5\7D\2\2\u07b5\u07c4\7\f"+
		"\2\2\u07b6\u07c4\7.\2\2\u07b7\u07b8\58\35\2\u07b8\u07b9\7D\2\2\u07b9\u07ba"+
		"\7.\2\2\u07ba\u07c4\3\2\2\2\u07bb\u07bc\7<\2\2\u07bc\u07bd\5\u01a0\u00d1"+
		"\2\u07bd\u07be\7=\2\2\u07be\u07c4\3\2\2\2\u07bf\u07c4\5\u0176\u00bc\2"+
		"\u07c0\u07c4\5\u017e\u00c0\2\u07c1\u07c4\5\u018a\u00c6\2\u07c2\u07c4\5"+
		"\u0192\u00ca\2\u07c3\u07a7\3\2\2\2\u07c3\u07a8\3\2\2\2\u07c3\u07b3\3\2"+
		"\2\2\u07c3\u07b6\3\2\2\2\u07c3\u07b7\3\2\2\2\u07c3\u07bb\3\2\2\2\u07c3"+
		"\u07bf\3\2\2\2\u07c3\u07c0\3\2\2\2\u07c3\u07c1\3\2\2\2\u07c3\u07c2\3\2"+
		"\2\2\u07c4\u0169\3\2\2\2\u07c5\u07cb\5\u0178\u00bd\2\u07c6\u07cb\5\u0180"+
		"\u00c1\2\u07c7\u07cb\5\u0186\u00c4\2\u07c8\u07cb\5\u018c\u00c7\2\u07c9"+
		"\u07cb\5\u0194\u00cb\2\u07ca\u07c5\3\2\2\2\u07ca\u07c6\3\2\2\2\u07ca\u07c7"+
		"\3\2\2\2\u07ca\u07c8\3\2\2\2\u07ca\u07c9\3\2\2\2\u07cb\u016b\3\2\2\2\u07cc"+
		"\u07cd\3\2\2\2\u07cd\u016d\3\2\2\2\u07ce\u07d3\5\u0178\u00bd\2\u07cf\u07d3"+
		"\5\u0180\u00c1\2\u07d0\u07d3\5\u018c\u00c7\2\u07d1\u07d3\5\u0194\u00cb"+
		"\2\u07d2\u07ce\3\2\2\2\u07d2\u07cf\3\2\2\2\u07d2\u07d0\3\2\2\2\u07d2\u07d1"+
		"\3\2\2\2\u07d3\u016f\3\2\2\2\u07d4\u07fd\5\2\2\2\u07d5\u07da\58\35\2\u07d6"+
		"\u07d7\7@\2\2\u07d7\u07d9\7A\2\2\u07d8\u07d6\3\2\2\2\u07d9\u07dc\3\2\2"+
		"\2\u07da\u07d8\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dd\3\2\2\2\u07dc\u07da"+
		"\3\2\2\2\u07dd\u07de\7D\2\2\u07de\u07df\7\f\2\2\u07df\u07fd\3\2\2\2\u07e0"+
		"\u07e5\5x=\2\u07e1\u07e2\7@\2\2\u07e2\u07e4\7A\2\2\u07e3\u07e1\3\2\2\2"+
		"\u07e4\u07e7\3\2\2\2\u07e5\u07e3\3\2\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e8"+
		"\3\2\2\2\u07e7\u07e5\3\2\2\2\u07e8\u07e9\7D\2\2\u07e9\u07ea\7\f\2\2\u07ea"+
		"\u07fd\3\2\2\2\u07eb\u07ec\7\63\2\2\u07ec\u07ed\7D\2\2\u07ed\u07fd\7\f"+
		"\2\2\u07ee\u07fd\7.\2\2\u07ef\u07f0\58\35\2\u07f0\u07f1\7D\2\2\u07f1\u07f2"+
		"\7.\2\2\u07f2\u07fd\3\2\2\2\u07f3\u07f4\7<\2\2\u07f4\u07f5\5\u01a0\u00d1"+
		"\2\u07f5\u07f6\7=\2\2\u07f6\u07fd\3\2\2\2\u07f7\u07fd\5\u017a\u00be\2"+
		"\u07f8\u07fd\5\u0182\u00c2\2\u07f9\u07fd\5\u0188\u00c5\2\u07fa\u07fd\5"+
		"\u018e\u00c8\2\u07fb\u07fd\5\u0196\u00cc\2\u07fc\u07d4\3\2\2\2\u07fc\u07d5"+
		"\3\2\2\2\u07fc\u07e0\3\2\2\2\u07fc\u07eb\3\2\2\2\u07fc\u07ee\3\2\2\2\u07fc"+
		"\u07ef\3\2\2\2\u07fc\u07f3\3\2\2\2\u07fc\u07f7\3\2\2\2\u07fc\u07f8\3\2"+
		"\2\2\u07fc\u07f9\3\2\2\2\u07fc\u07fa\3\2\2\2\u07fc\u07fb\3\2\2\2\u07fd"+
		"\u0171\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0173\3\2\2\2\u0800\u0828\5\2"+
		"\2\2\u0801\u0806\58\35\2\u0802\u0803\7@\2\2\u0803\u0805\7A\2\2\u0804\u0802"+
		"\3\2\2\2\u0805\u0808\3\2\2\2\u0806\u0804\3\2\2\2\u0806\u0807\3\2\2\2\u0807"+
		"\u0809\3\2\2\2\u0808\u0806\3\2\2\2\u0809\u080a\7D\2\2\u080a\u080b\7\f"+
		"\2\2\u080b\u0828\3\2\2\2\u080c\u0811\5x=\2\u080d\u080e\7@\2\2\u080e\u0810"+
		"\7A\2\2\u080f\u080d\3\2\2\2\u0810\u0813\3\2\2\2\u0811\u080f\3\2\2\2\u0811"+
		"\u0812\3\2\2\2\u0812\u0814\3\2\2\2\u0813\u0811\3\2\2\2\u0814\u0815\7D"+
		"\2\2\u0815\u0816\7\f\2\2\u0816\u0828\3\2\2\2\u0817\u0818\7\63\2\2\u0818"+
		"\u0819\7D\2\2\u0819\u0828\7\f\2\2\u081a\u0828\7.\2\2\u081b\u081c\58\35"+
		"\2\u081c\u081d\7D\2\2\u081d\u081e\7.\2\2\u081e\u0828\3\2\2\2\u081f\u0820"+
		"\7<\2\2\u0820\u0821\5\u01a0\u00d1\2\u0821\u0822\7=\2\2\u0822\u0828\3\2"+
		"\2\2\u0823\u0828\5\u017a\u00be\2\u0824\u0828\5\u0182\u00c2\2\u0825\u0828"+
		"\5\u018e\u00c8\2\u0826\u0828\5\u0196\u00cc\2\u0827\u0800\3\2\2\2\u0827"+
		"\u0801\3\2\2\2\u0827\u080c\3\2\2\2\u0827\u0817\3\2\2\2\u0827\u081a\3\2"+
		"\2\2\u0827\u081b\3\2\2\2\u0827\u081f\3\2\2\2\u0827\u0823\3\2\2\2\u0827"+
		"\u0824\3\2\2\2\u0827\u0825\3\2\2\2\u0827\u0826\3\2\2\2\u0828\u0175\3\2"+
		"\2\2\u0829\u082b\7\"\2\2\u082a\u082c\5,\27\2\u082b\u082a\3\2\2\2\u082b"+
		"\u082c\3\2\2\2\u082c\u0830\3\2\2\2\u082d\u082f\5\u00e8u\2\u082e\u082d"+
		"\3\2\2\2\u082f\u0832\3\2\2\2\u0830\u082e\3\2\2\2\u0830\u0831\3\2\2\2\u0831"+
		"\u0833\3\2\2\2\u0832\u0830\3\2\2\2\u0833\u083e\7i\2\2\u0834\u0838\7D\2"+
		"\2\u0835\u0837\5\u00e8u\2\u0836\u0835\3\2\2\2\u0837\u083a\3\2\2\2\u0838"+
		"\u0836\3\2\2\2\u0838\u0839\3\2\2\2\u0839\u083b\3\2\2\2\u083a\u0838\3\2"+
		"\2\2\u083b\u083d\7i\2\2\u083c\u0834\3\2\2\2\u083d\u0840\3\2\2\2\u083e"+
		"\u083c\3\2\2\2\u083e\u083f\3\2\2\2\u083f\u0842\3\2\2\2\u0840\u083e\3\2"+
		"\2\2\u0841\u0843\5\u017c\u00bf\2\u0842\u0841\3\2\2\2\u0842\u0843\3\2\2"+
		"\2\u0843\u0844\3\2\2\2\u0844\u0846\7<\2\2\u0845\u0847\5\u0190\u00c9\2"+
		"\u0846\u0845\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u0848\3\2\2\2\u0848\u084a"+
		"\7=\2\2\u0849\u084b\5d\63\2\u084a\u0849\3\2\2\2\u084a\u084b\3\2\2\2\u084b"+
		"\u087d\3\2\2\2\u084c\u084d\5<\37\2\u084d\u084e\7D\2\2\u084e\u0850\7\""+
		"\2\2\u084f\u0851\5,\27\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851"+
		"\u0855\3\2\2\2\u0852\u0854\5\u00e8u\2\u0853\u0852\3\2\2\2\u0854\u0857"+
		"\3\2\2\2\u0855\u0853\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2\2\2\u0857"+
		"\u0855\3\2\2\2\u0858\u085a\7i\2\2\u0859\u085b\5\u017c\u00bf\2\u085a\u0859"+
		"\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085e\7<\2\2\u085d"+
		"\u085f\5\u0190\u00c9\2\u085e\u085d\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0860"+
		"\3\2\2\2\u0860\u0862\7=\2\2\u0861\u0863\5d\63\2\u0862\u0861\3\2\2\2\u0862"+
		"\u0863\3\2\2\2\u0863\u087d\3\2\2\2\u0864\u0865\5\u0162\u00b2\2\u0865\u0866"+
		"\7D\2\2\u0866\u0868\7\"\2\2\u0867\u0869\5,\27\2\u0868\u0867\3\2\2\2\u0868"+
		"\u0869\3\2\2\2\u0869\u086d\3\2\2\2\u086a\u086c\5\u00e8u\2\u086b\u086a"+
		"\3\2\2\2\u086c\u086f\3\2\2\2\u086d\u086b\3\2\2\2\u086d\u086e\3\2\2\2\u086e"+
		"\u0870\3\2\2\2\u086f\u086d\3\2\2\2\u0870\u0872\7i\2\2\u0871\u0873\5\u017c"+
		"\u00bf\2\u0872\u0871\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u0876\7<\2\2\u0875\u0877\5\u0190\u00c9\2\u0876\u0875\3\2\2\2\u0876\u0877"+
		"\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u087a\7=\2\2\u0879\u087b\5d\63\2\u087a"+
		"\u0879\3\2\2\2\u087a\u087b\3\2\2\2\u087b\u087d\3\2\2\2\u087c\u0829\3\2"+
		"\2\2\u087c\u084c\3\2\2\2\u087c\u0864\3\2\2\2\u087d\u0177\3\2\2\2\u087e"+
		"\u087f\7D\2\2\u087f\u0881\7\"\2\2\u0880\u0882\5,\27\2\u0881\u0880\3\2"+
		"\2\2\u0881\u0882\3\2\2\2\u0882\u0886\3\2\2\2\u0883\u0885\5\u00e8u\2\u0884"+
		"\u0883\3\2\2\2\u0885\u0888\3\2\2\2\u0886\u0884\3\2\2\2\u0886\u0887\3\2"+
		"\2\2\u0887\u0889\3\2\2\2\u0888\u0886\3\2\2\2\u0889\u088b\7i\2\2\u088a"+
		"\u088c\5\u017c\u00bf\2\u088b\u088a\3\2\2\2\u088b\u088c\3\2\2\2\u088c\u088d"+
		"\3\2\2\2\u088d\u088f\7<\2\2\u088e\u0890\5\u0190\u00c9\2\u088f\u088e\3"+
		"\2\2\2\u088f\u0890\3\2\2\2\u0890\u0891\3\2\2\2\u0891\u0893\7=\2\2\u0892"+
		"\u0894\5d\63\2\u0893\u0892\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0179\3\2"+
		"\2\2\u0895\u0897\7\"\2\2\u0896\u0898\5,\27\2\u0897\u0896\3\2\2\2\u0897"+
		"\u0898\3\2\2\2\u0898\u089c\3\2\2\2\u0899\u089b\5\u00e8u\2\u089a\u0899"+
		"\3\2\2\2\u089b\u089e\3\2\2\2\u089c\u089a\3\2\2\2\u089c\u089d\3\2\2\2\u089d"+
		"\u089f\3\2\2\2\u089e\u089c\3\2\2\2\u089f\u08aa\7i\2\2\u08a0\u08a4\7D\2"+
		"\2\u08a1\u08a3\5\u00e8u\2\u08a2\u08a1\3\2\2\2\u08a3\u08a6\3\2\2\2\u08a4"+
		"\u08a2\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u08a7\3\2\2\2\u08a6\u08a4\3\2"+
		"\2\2\u08a7\u08a9\7i\2\2\u08a8\u08a0\3\2\2\2\u08a9\u08ac\3\2\2\2\u08aa"+
		"\u08a8\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ae\3\2\2\2\u08ac\u08aa\3\2"+
		"\2\2\u08ad\u08af\5\u017c\u00bf\2\u08ae\u08ad\3\2\2\2\u08ae\u08af\3\2\2"+
		"\2\u08af\u08b0\3\2\2\2\u08b0\u08b2\7<\2\2\u08b1\u08b3\5\u0190\u00c9\2"+
		"\u08b2\u08b1\3\2\2\2\u08b2\u08b3\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u08b6"+
		"\7=\2\2\u08b5\u08b7\5d\63\2\u08b6\u08b5\3\2\2\2\u08b6\u08b7\3\2\2\2\u08b7"+
		"\u08d1\3\2\2\2\u08b8\u08b9\5<\37\2\u08b9\u08ba\7D\2\2\u08ba\u08bc\7\""+
		"\2\2\u08bb\u08bd\5,\27\2\u08bc\u08bb\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd"+
		"\u08c1\3\2\2\2\u08be\u08c0\5\u00e8u\2\u08bf\u08be\3\2\2\2\u08c0\u08c3"+
		"\3\2\2\2\u08c1\u08bf\3\2\2\2\u08c1\u08c2\3\2\2\2\u08c2\u08c4\3\2\2\2\u08c3"+
		"\u08c1\3\2\2\2\u08c4\u08c6\7i\2\2\u08c5\u08c7\5\u017c\u00bf\2\u08c6\u08c5"+
		"\3\2\2\2\u08c6\u08c7\3\2\2\2\u08c7\u08c8\3\2\2\2\u08c8\u08ca\7<\2\2\u08c9"+
		"\u08cb\5\u0190\u00c9\2\u08ca\u08c9\3\2\2\2\u08ca\u08cb\3\2\2\2\u08cb\u08cc"+
		"\3\2\2\2\u08cc\u08ce\7=\2\2\u08cd\u08cf\5d\63\2\u08ce\u08cd\3\2\2\2\u08ce"+
		"\u08cf\3\2\2\2\u08cf\u08d1\3\2\2\2\u08d0\u0895\3\2\2\2\u08d0\u08b8\3\2"+
		"\2\2\u08d1\u017b\3\2\2\2\u08d2\u08d6\5,\27\2\u08d3\u08d4\7G\2\2\u08d4"+
		"\u08d6\7F\2\2\u08d5\u08d2\3\2\2\2\u08d5\u08d3\3\2\2\2\u08d6\u017d\3\2"+
		"\2\2\u08d7\u08d8\5\u0162\u00b2\2\u08d8\u08d9\7D\2\2\u08d9\u08da\7i\2\2"+
		"\u08da\u08e5\3\2\2\2\u08db\u08dc\7+\2\2\u08dc\u08dd\7D\2\2\u08dd\u08e5"+
		"\7i\2\2\u08de\u08df\58\35\2\u08df\u08e0\7D\2\2\u08e0\u08e1\7+\2\2\u08e1"+
		"\u08e2\7D\2\2\u08e2\u08e3\7i\2\2\u08e3\u08e5\3\2\2\2\u08e4\u08d7\3\2\2"+
		"\2\u08e4\u08db\3\2\2\2\u08e4\u08de\3\2\2\2\u08e5\u017f\3\2\2\2\u08e6\u08e7"+
		"\7D\2\2\u08e7\u08e8\7i\2\2\u08e8\u0181\3\2\2\2\u08e9\u08ea\7+\2\2\u08ea"+
		"\u08eb\7D\2\2\u08eb\u08f3\7i\2\2\u08ec\u08ed\58\35\2\u08ed\u08ee\7D\2"+
		"\2\u08ee\u08ef\7+\2\2\u08ef\u08f0\7D\2\2\u08f0\u08f1\7i\2\2\u08f1\u08f3"+
		"\3\2\2\2\u08f2\u08e9\3\2\2\2\u08f2\u08ec\3\2\2\2\u08f3\u0183\3\2\2\2\u08f4"+
		"\u08f5\5<\37\2\u08f5\u08f6\7@\2\2\u08f6\u08f7\5\u01a0\u00d1\2\u08f7\u08f8"+
		"\7A\2\2\u08f8\u08ff\3\2\2\2\u08f9\u08fa\5\u0168\u00b5\2\u08fa\u08fb\7"+
		"@\2\2\u08fb\u08fc\5\u01a0\u00d1\2\u08fc\u08fd\7A\2\2\u08fd\u08ff\3\2\2"+
		"\2\u08fe\u08f4\3\2\2\2\u08fe\u08f9\3\2\2\2\u08ff\u0907\3\2\2\2\u0900\u0901"+
		"\5\u0166\u00b4\2\u0901\u0902\7@\2\2\u0902\u0903\5\u01a0\u00d1\2\u0903"+
		"\u0904\7A\2\2\u0904\u0906\3\2\2\2\u0905\u0900\3\2\2\2\u0906\u0909\3\2"+
		"\2\2\u0907\u0905\3\2\2\2\u0907\u0908\3\2\2\2\u0908\u0185\3\2\2\2\u0909"+
		"\u0907\3\2\2\2\u090a\u090b\5\u016e\u00b8\2\u090b\u090c\7@\2\2\u090c\u090d"+
		"\5\u01a0\u00d1\2\u090d\u090e\7A\2\2\u090e\u0916\3\2\2\2\u090f\u0910\5"+
		"\u016c\u00b7\2\u0910\u0911\7@\2\2\u0911\u0912\5\u01a0\u00d1\2\u0912\u0913"+
		"\7A\2\2\u0913\u0915\3\2\2\2\u0914\u090f\3\2\2\2\u0915\u0918\3\2\2\2\u0916"+
		"\u0914\3\2\2\2\u0916\u0917\3\2\2\2\u0917\u0187\3\2\2\2\u0918\u0916\3\2"+
		"\2\2\u0919\u091a\5<\37\2\u091a\u091b\7@\2\2\u091b\u091c\5\u01a0\u00d1"+
		"\2\u091c\u091d\7A\2\2\u091d\u0924\3\2\2\2\u091e\u091f\5\u0174\u00bb\2"+
		"\u091f\u0920\7@\2\2\u0920\u0921\5\u01a0\u00d1\2\u0921\u0922\7A\2\2\u0922"+
		"\u0924\3\2\2\2\u0923\u0919\3\2\2\2\u0923\u091e\3\2\2\2\u0924\u092c\3\2"+
		"\2\2\u0925\u0926\5\u0172\u00ba\2\u0926\u0927\7@\2\2\u0927\u0928\5\u01a0"+
		"\u00d1\2\u0928\u0929\7A\2\2\u0929\u092b\3\2\2\2\u092a\u0925\3\2\2\2\u092b"+
		"\u092e\3\2\2\2\u092c\u092a\3\2\2\2\u092c\u092d\3\2\2\2\u092d\u0189\3\2"+
		"\2\2\u092e\u092c\3\2\2\2\u092f\u0930\5> \2\u0930\u0932\7<\2\2\u0931\u0933"+
		"\5\u0190\u00c9\2\u0932\u0931\3\2\2\2\u0932\u0933\3\2\2\2\u0933\u0934\3"+
		"\2\2\2\u0934\u0935\7=\2\2\u0935\u0974\3\2\2\2\u0936\u0937\58\35\2\u0937"+
		"\u0939\7D\2\2\u0938\u093a\5,\27\2\u0939\u0938\3\2\2\2\u0939\u093a\3\2"+
		"\2\2\u093a\u093b\3\2\2\2\u093b\u093c\7i\2\2\u093c\u093e\7<\2\2\u093d\u093f"+
		"\5\u0190\u00c9\2\u093e\u093d\3\2\2\2\u093e\u093f\3\2\2\2\u093f\u0940\3"+
		"\2\2\2\u0940\u0941\7=\2\2\u0941\u0974\3\2\2\2\u0942\u0943\5<\37\2\u0943"+
		"\u0945\7D\2\2\u0944\u0946\5,\27\2\u0945\u0944\3\2\2\2\u0945\u0946\3\2"+
		"\2\2\u0946\u0947\3\2\2\2\u0947\u0948\7i\2\2\u0948\u094a\7<\2\2\u0949\u094b"+
		"\5\u0190\u00c9\2\u094a\u0949\3\2\2\2\u094a\u094b\3\2\2\2\u094b\u094c\3"+
		"\2\2\2\u094c\u094d\7=\2\2\u094d\u0974\3\2\2\2\u094e\u094f\5\u0162\u00b2"+
		"\2\u094f\u0951\7D\2\2\u0950\u0952\5,\27\2\u0951\u0950\3\2\2\2\u0951\u0952"+
		"\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0954\7i\2\2\u0954\u0956\7<\2\2\u0955"+
		"\u0957\5\u0190\u00c9\2\u0956\u0955\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958"+
		"\3\2\2\2\u0958\u0959\7=\2\2\u0959\u0974\3\2\2\2\u095a\u095b\7+\2\2\u095b"+
		"\u095d\7D\2\2";
	private static final String _serializedATNSegment1 =
		"\u095c\u095e\5,\27\2\u095d\u095c\3\2\2\2\u095d\u095e\3\2\2\2\u095e\u095f"+
		"\3\2\2\2\u095f\u0960\7i\2\2\u0960\u0962\7<\2\2\u0961\u0963\5\u0190\u00c9"+
		"\2\u0962\u0961\3\2\2\2\u0962\u0963\3\2\2\2\u0963\u0964\3\2\2\2\u0964\u0974"+
		"\7=\2\2\u0965\u0966\58\35\2\u0966\u0967\7D\2\2\u0967\u0968\7+\2\2\u0968"+
		"\u096a\7D\2\2\u0969\u096b\5,\27\2\u096a\u0969\3\2\2\2\u096a\u096b\3\2"+
		"\2\2\u096b\u096c\3\2\2\2\u096c\u096d\7i\2\2\u096d\u096f\7<\2\2\u096e\u0970"+
		"\5\u0190\u00c9\2\u096f\u096e\3\2\2\2\u096f\u0970\3\2\2\2\u0970\u0971\3"+
		"\2\2\2\u0971\u0972\7=\2\2\u0972\u0974\3\2\2\2\u0973\u092f\3\2\2\2\u0973"+
		"\u0936\3\2\2\2\u0973\u0942\3\2\2\2\u0973\u094e\3\2\2\2\u0973\u095a\3\2"+
		"\2\2\u0973\u0965\3\2\2\2\u0974\u018b\3\2\2\2\u0975\u0977\7D\2\2\u0976"+
		"\u0978\5,\27\2\u0977\u0976\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\3\2"+
		"\2\2\u0979\u097a\7i\2\2\u097a\u097c\7<\2\2\u097b\u097d\5\u0190\u00c9\2"+
		"\u097c\u097b\3\2\2\2\u097c\u097d\3\2\2\2\u097d\u097e\3\2\2\2\u097e\u097f"+
		"\7=\2\2\u097f\u018d\3\2\2\2\u0980\u0981\5> \2\u0981\u0983\7<\2\2\u0982"+
		"\u0984\5\u0190\u00c9\2\u0983\u0982\3\2\2\2\u0983\u0984\3\2\2\2\u0984\u0985"+
		"\3\2\2\2\u0985\u0986\7=\2\2\u0986\u09b9\3\2\2\2\u0987\u0988\58\35\2\u0988"+
		"\u098a\7D\2\2\u0989\u098b\5,\27\2\u098a\u0989\3\2\2\2\u098a\u098b\3\2"+
		"\2\2\u098b\u098c\3\2\2\2\u098c\u098d\7i\2\2\u098d\u098f\7<\2\2\u098e\u0990"+
		"\5\u0190\u00c9\2\u098f\u098e\3\2\2\2\u098f\u0990\3\2\2\2\u0990\u0991\3"+
		"\2\2\2\u0991\u0992\7=\2\2\u0992\u09b9\3\2\2\2\u0993\u0994\5<\37\2\u0994"+
		"\u0996\7D\2\2\u0995\u0997\5,\27\2\u0996\u0995\3\2\2\2\u0996\u0997\3\2"+
		"\2\2\u0997\u0998\3\2\2\2\u0998\u0999\7i\2\2\u0999\u099b\7<\2\2\u099a\u099c"+
		"\5\u0190\u00c9\2\u099b\u099a\3\2\2\2\u099b\u099c\3\2\2\2\u099c\u099d\3"+
		"\2\2\2\u099d\u099e\7=\2\2\u099e\u09b9\3\2\2\2\u099f\u09a0\7+\2\2\u09a0"+
		"\u09a2\7D\2\2\u09a1\u09a3\5,\27\2\u09a2\u09a1\3\2\2\2\u09a2\u09a3\3\2"+
		"\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5\7i\2\2\u09a5\u09a7\7<\2\2\u09a6\u09a8"+
		"\5\u0190\u00c9\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09a9\3"+
		"\2\2\2\u09a9\u09b9\7=\2\2\u09aa\u09ab\58\35\2\u09ab\u09ac\7D\2\2\u09ac"+
		"\u09ad\7+\2\2\u09ad\u09af\7D\2\2\u09ae\u09b0\5,\27\2\u09af\u09ae\3\2\2"+
		"\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\7i\2\2\u09b2\u09b4"+
		"\7<\2\2\u09b3\u09b5\5\u0190\u00c9\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3"+
		"\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b7\7=\2\2\u09b7\u09b9\3\2\2\2\u09b8"+
		"\u0980\3\2\2\2\u09b8\u0987\3\2\2\2\u09b8\u0993\3\2\2\2\u09b8\u099f\3\2"+
		"\2\2\u09b8\u09aa\3\2\2\2\u09b9\u018f\3\2\2\2\u09ba\u09bf\5\u01a0\u00d1"+
		"\2\u09bb\u09bc\7C\2\2\u09bc\u09be\5\u01a0\u00d1\2\u09bd\u09bb\3\2\2\2"+
		"\u09be\u09c1\3\2\2\2\u09bf\u09bd\3\2\2\2\u09bf\u09c0\3\2\2\2\u09c0\u0191"+
		"\3\2\2\2\u09c1\u09bf\3\2\2\2\u09c2\u09c3\5<\37\2\u09c3\u09c5\7]\2\2\u09c4"+
		"\u09c6\5,\27\2\u09c5\u09c4\3\2\2\2\u09c5\u09c6\3\2\2\2\u09c6\u09c7\3\2"+
		"\2\2\u09c7\u09c8\7i\2\2\u09c8\u09f2\3\2\2\2\u09c9\u09ca\5\16\b\2\u09ca"+
		"\u09cc\7]\2\2\u09cb\u09cd\5,\27\2\u09cc\u09cb\3\2\2\2\u09cc\u09cd\3\2"+
		"\2\2\u09cd\u09ce\3\2\2\2\u09ce\u09cf\7i\2\2\u09cf\u09f2\3\2\2\2\u09d0"+
		"\u09d1\5\u0162\u00b2\2\u09d1\u09d3\7]\2\2\u09d2\u09d4\5,\27\2\u09d3\u09d2"+
		"\3\2\2\2\u09d3\u09d4\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\7i\2\2\u09d6"+
		"\u09f2\3\2\2\2\u09d7\u09d8\7+\2\2\u09d8\u09da\7]\2\2\u09d9\u09db\5,\27"+
		"\2\u09da\u09d9\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\3\2\2\2\u09dc\u09f2"+
		"\7i\2\2\u09dd\u09de\58\35\2\u09de\u09df\7D\2\2\u09df\u09e0\7+\2\2\u09e0"+
		"\u09e2\7]\2\2\u09e1\u09e3\5,\27\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3\3\2"+
		"\2\2\u09e3\u09e4\3\2\2\2\u09e4\u09e5\7i\2\2\u09e5\u09f2\3\2\2\2\u09e6"+
		"\u09e7\5\22\n\2\u09e7\u09e9\7]\2\2\u09e8\u09ea\5,\27\2\u09e9\u09e8\3\2"+
		"\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09eb\3\2\2\2\u09eb\u09ec\7\"\2\2\u09ec"+
		"\u09f2\3\2\2\2\u09ed\u09ee\5 \21\2\u09ee\u09ef\7]\2\2\u09ef\u09f0\7\""+
		"\2\2\u09f0\u09f2\3\2\2\2\u09f1\u09c2\3\2\2\2\u09f1\u09c9\3\2\2\2\u09f1"+
		"\u09d0\3\2\2\2\u09f1\u09d7\3\2\2\2\u09f1\u09dd\3\2\2\2\u09f1\u09e6\3\2"+
		"\2\2\u09f1\u09ed\3\2\2\2\u09f2\u0193\3\2\2\2\u09f3\u09f5\7]\2\2\u09f4"+
		"\u09f6\5,\27\2\u09f5\u09f4\3\2\2\2\u09f5\u09f6\3\2\2\2\u09f6\u09f7\3\2"+
		"\2\2\u09f7\u09f8\7i\2\2\u09f8\u0195\3\2\2\2\u09f9\u09fa\5<\37\2\u09fa"+
		"\u09fc\7]\2\2\u09fb\u09fd\5,\27\2\u09fc\u09fb\3\2\2\2\u09fc\u09fd\3\2"+
		"\2\2\u09fd\u09fe\3\2\2\2\u09fe\u09ff\7i\2\2\u09ff\u0a22\3\2\2\2\u0a00"+
		"\u0a01\5\16\b\2\u0a01\u0a03\7]\2\2\u0a02\u0a04\5,\27\2\u0a03\u0a02\3\2"+
		"\2\2\u0a03\u0a04\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a06\7i\2\2\u0a06"+
		"\u0a22\3\2\2\2\u0a07\u0a08\7+\2\2\u0a08\u0a0a\7]\2\2\u0a09\u0a0b\5,\27"+
		"\2\u0a0a\u0a09\3\2\2\2\u0a0a\u0a0b\3\2\2\2\u0a0b\u0a0c\3\2\2\2\u0a0c\u0a22"+
		"\7i\2\2\u0a0d\u0a0e\58\35\2\u0a0e\u0a0f\7D\2\2\u0a0f\u0a10\7+\2\2\u0a10"+
		"\u0a12\7]\2\2\u0a11\u0a13\5,\27\2\u0a12\u0a11\3\2\2\2\u0a12\u0a13\3\2"+
		"\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a15\7i\2\2\u0a15\u0a22\3\2\2\2\u0a16"+
		"\u0a17\5\22\n\2\u0a17\u0a19\7]\2\2\u0a18\u0a1a\5,\27\2\u0a19\u0a18\3\2"+
		"\2\2\u0a19\u0a1a\3\2\2\2\u0a1a\u0a1b\3\2\2\2\u0a1b\u0a1c\7\"\2\2\u0a1c"+
		"\u0a22\3\2\2\2\u0a1d\u0a1e\5 \21\2\u0a1e\u0a1f\7]\2\2\u0a1f\u0a20\7\""+
		"\2\2\u0a20\u0a22\3\2\2\2\u0a21\u09f9\3\2\2\2\u0a21\u0a00\3\2\2\2\u0a21"+
		"\u0a07\3\2\2\2\u0a21\u0a0d\3\2\2\2\u0a21\u0a16\3\2\2\2\u0a21\u0a1d\3\2"+
		"\2\2\u0a22\u0197\3\2\2\2\u0a23\u0a24\7\"\2\2\u0a24\u0a25\5\6\4\2\u0a25"+
		"\u0a27\5\u019a\u00ce\2\u0a26\u0a28\5\"\22\2\u0a27\u0a26\3\2\2\2\u0a27"+
		"\u0a28\3\2\2\2\u0a28\u0a3a\3\2\2\2\u0a29\u0a2a\7\"\2\2\u0a2a\u0a2b\5\20"+
		"\t\2\u0a2b\u0a2d\5\u019a\u00ce\2\u0a2c\u0a2e\5\"\22\2\u0a2d\u0a2c\3\2"+
		"\2\2\u0a2d\u0a2e\3\2\2\2\u0a2e\u0a3a\3\2\2\2\u0a2f\u0a30\7\"\2\2\u0a30"+
		"\u0a31\5\6\4\2\u0a31\u0a32\5\"\22\2\u0a32\u0a33\5\u00fa~\2\u0a33\u0a3a"+
		"\3\2\2\2\u0a34\u0a35\7\"\2\2\u0a35\u0a36\5\20\t\2\u0a36\u0a37\5\"\22\2"+
		"\u0a37\u0a38\5\u00fa~\2\u0a38\u0a3a\3\2\2\2\u0a39\u0a23\3\2\2\2\u0a39"+
		"\u0a29\3\2\2\2\u0a39\u0a2f\3\2\2\2\u0a39\u0a34\3\2\2\2\u0a3a\u0199\3\2"+
		"\2\2\u0a3b\u0a3f\5\u019c\u00cf\2\u0a3c\u0a3e\5\u019c\u00cf\2\u0a3d\u0a3c"+
		"\3\2\2\2\u0a3e\u0a41\3\2\2\2\u0a3f\u0a3d\3\2\2\2\u0a3f\u0a40\3\2\2\2\u0a40"+
		"\u019b\3\2\2\2\u0a41\u0a3f\3\2\2\2\u0a42\u0a44\5\u00e8u\2\u0a43\u0a42"+
		"\3\2\2\2\u0a44\u0a47\3\2\2\2\u0a45\u0a43\3\2\2\2\u0a45\u0a46\3\2\2\2\u0a46"+
		"\u0a48\3\2\2\2\u0a47\u0a45\3\2\2\2\u0a48\u0a49\7@\2\2\u0a49\u0a4a\5\u01a0"+
		"\u00d1\2\u0a4a\u0a4b\7A\2\2\u0a4b\u019d\3\2\2\2\u0a4c\u0a4d\5\u01a0\u00d1"+
		"\2\u0a4d\u019f\3\2\2\2\u0a4e\u0a51\5\u01a2\u00d2\2\u0a4f\u0a51\5\u01aa"+
		"\u00d6\2\u0a50\u0a4e\3\2\2\2\u0a50\u0a4f\3\2\2\2\u0a51\u01a1\3\2\2\2\u0a52"+
		"\u0a53\5\u01a4\u00d3\2\u0a53\u0a54\7\\\2\2\u0a54\u0a55\5\u01a8\u00d5\2"+
		"\u0a55\u01a3\3\2\2\2\u0a56\u0a61\7i\2\2\u0a57\u0a59\7<\2\2\u0a58\u0a5a"+
		"\5\u0098M\2\u0a59\u0a58\3\2\2\2\u0a59\u0a5a\3\2\2\2\u0a5a\u0a5b\3\2\2"+
		"\2\u0a5b\u0a61\7=\2\2\u0a5c\u0a5d\7<\2\2\u0a5d\u0a5e\5\u01a6\u00d4\2\u0a5e"+
		"\u0a5f\7=\2\2\u0a5f\u0a61\3\2\2\2\u0a60\u0a56\3\2\2\2\u0a60\u0a57\3\2"+
		"\2\2\u0a60\u0a5c\3\2\2\2\u0a61\u01a5\3\2\2\2\u0a62\u0a67\7i\2\2\u0a63"+
		"\u0a64\7C\2\2\u0a64\u0a66\7i\2\2\u0a65\u0a63\3\2\2\2\u0a66\u0a69\3\2\2"+
		"\2\u0a67\u0a65\3\2\2\2\u0a67\u0a68\3\2\2\2\u0a68\u01a7\3\2\2\2\u0a69\u0a67"+
		"\3\2\2\2\u0a6a\u0a6d\5\u01a0\u00d1\2\u0a6b\u0a6d\5\u00fe\u0080\2\u0a6c"+
		"\u0a6a\3\2\2\2\u0a6c\u0a6b\3\2\2\2\u0a6d\u01a9\3\2\2\2\u0a6e\u0a71\5\u01b2"+
		"\u00da\2\u0a6f\u0a71\5\u01ac\u00d7\2\u0a70\u0a6e\3\2\2\2\u0a70\u0a6f\3"+
		"\2\2\2\u0a71\u01ab\3\2\2\2\u0a72\u0a73\5\u01ae\u00d8\2\u0a73\u0a74\5\u01b0"+
		"\u00d9\2\u0a74\u0a75\5\u01a0\u00d1\2\u0a75\u01ad\3\2\2\2\u0a76\u0a7a\5"+
		"<\37\2\u0a77\u0a7a\5\u017e\u00c0\2\u0a78\u0a7a\5\u0184\u00c3\2\u0a79\u0a76"+
		"\3\2\2\2\u0a79\u0a77\3\2\2\2\u0a79\u0a78\3\2\2\2\u0a7a\u01af\3\2\2\2\u0a7b"+
		"\u0a7c\t\5\2\2\u0a7c\u01b1\3\2\2\2\u0a7d\u0a85\5\u01b4\u00db\2\u0a7e\u0a7f"+
		"\5\u01b4\u00db\2\u0a7f\u0a80\7J\2\2\u0a80\u0a81\5\u01a0\u00d1\2\u0a81"+
		"\u0a82\7K\2\2\u0a82\u0a83\5\u01b2\u00da\2\u0a83\u0a85\3\2\2\2\u0a84\u0a7d"+
		"\3\2\2\2\u0a84\u0a7e\3\2\2\2\u0a85\u01b3\3\2\2\2\u0a86\u0a87\b\u00db\1"+
		"\2\u0a87\u0a88\5\u01b6\u00dc\2\u0a88\u0a8e\3\2\2\2\u0a89\u0a8a\f\3\2\2"+
		"\u0a8a\u0a8b\7Q\2\2\u0a8b\u0a8d\5\u01b6\u00dc\2\u0a8c\u0a89\3\2\2\2\u0a8d"+
		"\u0a90\3\2\2\2\u0a8e\u0a8c\3\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u01b5\3\2"+
		"\2\2\u0a90\u0a8e\3\2\2\2\u0a91\u0a92\b\u00dc\1\2\u0a92\u0a93\5\u01b8\u00dd"+
		"\2\u0a93\u0a99\3\2\2\2\u0a94\u0a95\f\3\2\2\u0a95\u0a96\7P\2\2\u0a96\u0a98"+
		"\5\u01b8\u00dd\2\u0a97\u0a94\3\2\2\2\u0a98\u0a9b\3\2\2\2\u0a99\u0a97\3"+
		"\2\2\2\u0a99\u0a9a\3\2\2\2\u0a9a\u01b7\3\2\2\2\u0a9b\u0a99\3\2\2\2\u0a9c"+
		"\u0a9d\b\u00dd\1\2\u0a9d\u0a9e\5\u01ba\u00de\2\u0a9e\u0aa4\3\2\2\2\u0a9f"+
		"\u0aa0\f\3\2\2\u0aa0\u0aa1\7Y\2\2\u0aa1\u0aa3\5\u01ba\u00de\2\u0aa2\u0a9f"+
		"\3\2\2\2\u0aa3\u0aa6\3\2\2\2\u0aa4\u0aa2\3\2\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5"+
		"\u01b9\3\2\2\2\u0aa6\u0aa4\3\2\2\2\u0aa7\u0aa8\b\u00de\1\2\u0aa8\u0aa9"+
		"\5\u01bc\u00df\2\u0aa9\u0aaf\3\2\2\2\u0aaa\u0aab\f\3\2\2\u0aab\u0aac\7"+
		"Z\2\2\u0aac\u0aae\5\u01bc\u00df\2\u0aad\u0aaa\3\2\2\2\u0aae\u0ab1\3\2"+
		"\2\2\u0aaf\u0aad\3\2\2\2\u0aaf\u0ab0\3\2\2\2\u0ab0\u01bb\3\2\2\2\u0ab1"+
		"\u0aaf\3\2\2\2\u0ab2\u0ab3\b\u00df\1\2\u0ab3\u0ab4\5\u01be\u00e0\2\u0ab4"+
		"\u0aba\3\2\2\2\u0ab5\u0ab6\f\3\2\2\u0ab6\u0ab7\7X\2\2\u0ab7\u0ab9\5\u01be"+
		"\u00e0\2\u0ab8\u0ab5\3\2\2\2\u0ab9\u0abc\3\2\2\2\u0aba\u0ab8\3\2\2\2\u0aba"+
		"\u0abb\3\2\2\2\u0abb\u01bd\3\2\2\2\u0abc\u0aba\3\2\2\2\u0abd\u0abe\b\u00e0"+
		"\1\2\u0abe\u0abf\5\u01c0\u00e1\2\u0abf\u0ac8\3\2\2\2\u0ac0\u0ac1\f\4\2"+
		"\2\u0ac1\u0ac2\7L\2\2\u0ac2\u0ac7\5\u01c0\u00e1\2\u0ac3\u0ac4\f\3\2\2"+
		"\u0ac4\u0ac5\7O\2\2\u0ac5\u0ac7\5\u01c0\u00e1\2\u0ac6\u0ac0\3\2\2\2\u0ac6"+
		"\u0ac3\3\2\2\2\u0ac7\u0aca\3\2\2\2\u0ac8\u0ac6\3\2\2\2\u0ac8\u0ac9\3\2"+
		"\2\2\u0ac9\u01bf\3\2\2\2\u0aca\u0ac8\3\2\2\2\u0acb\u0acc\b\u00e1\1\2\u0acc"+
		"\u0acd\5\u01c2\u00e2\2\u0acd\u0adf\3\2\2\2\u0ace\u0acf\f\7\2\2\u0acf\u0ad0"+
		"\7G\2\2\u0ad0\u0ade\5\u01c2\u00e2\2\u0ad1\u0ad2\f\6\2\2\u0ad2\u0ad3\7"+
		"F\2\2\u0ad3\u0ade\5\u01c2\u00e2\2\u0ad4\u0ad5\f\5\2\2\u0ad5\u0ad6\7M\2"+
		"\2\u0ad6\u0ade\5\u01c2\u00e2\2\u0ad7\u0ad8\f\4\2\2\u0ad8\u0ad9\7N\2\2"+
		"\u0ad9\u0ade\5\u01c2\u00e2\2\u0ada\u0adb\f\3\2\2\u0adb\u0adc\7\35\2\2"+
		"\u0adc\u0ade\5\16\b\2\u0add\u0ace\3\2\2\2\u0add\u0ad1\3\2\2\2\u0add\u0ad4"+
		"\3\2\2\2\u0add\u0ad7\3\2\2\2\u0add\u0ada\3\2\2\2\u0ade\u0ae1\3\2\2\2\u0adf"+
		"\u0add\3\2\2\2\u0adf\u0ae0\3\2\2\2\u0ae0\u01c1\3\2\2\2\u0ae1\u0adf\3\2"+
		"\2\2\u0ae2\u0ae3\b\u00e2\1\2\u0ae3\u0ae4\5\u01c4\u00e3\2\u0ae4\u0af4\3"+
		"\2\2\2\u0ae5\u0ae6\f\5\2\2\u0ae6\u0ae7\7G\2\2\u0ae7\u0ae8\7G\2\2\u0ae8"+
		"\u0af3\5\u01c4\u00e3\2\u0ae9\u0aea\f\4\2\2\u0aea\u0aeb\7F\2\2\u0aeb\u0aec"+
		"\7F\2\2\u0aec\u0af3\5\u01c4\u00e3\2\u0aed\u0aee\f\3\2\2\u0aee\u0aef\7"+
		"F\2\2\u0aef\u0af0\7F\2\2\u0af0\u0af1\7F\2\2\u0af1\u0af3\5\u01c4\u00e3"+
		"\2\u0af2\u0ae5\3\2\2\2\u0af2\u0ae9\3\2\2\2\u0af2\u0aed\3\2\2\2\u0af3\u0af6"+
		"\3\2\2\2\u0af4\u0af2\3\2\2\2\u0af4\u0af5\3\2\2\2\u0af5\u01c3\3\2\2\2\u0af6"+
		"\u0af4\3\2\2\2\u0af7\u0af8\b\u00e3\1\2\u0af8\u0af9\5\u01c6\u00e4\2\u0af9"+
		"\u0b02\3\2\2\2\u0afa\u0afb\f\4\2\2\u0afb\u0afc\7T\2\2\u0afc\u0b01\5\u01c6"+
		"\u00e4\2\u0afd\u0afe\f\3\2\2\u0afe\u0aff\7U\2\2\u0aff\u0b01\5\u01c6\u00e4"+
		"\2\u0b00\u0afa\3\2\2\2\u0b00\u0afd\3\2\2\2\u0b01\u0b04\3\2\2\2\u0b02\u0b00"+
		"\3\2\2\2\u0b02\u0b03\3\2\2\2\u0b03\u01c5\3\2\2\2\u0b04\u0b02\3\2\2\2\u0b05"+
		"\u0b06\b\u00e4\1\2\u0b06\u0b07\5\u01c8\u00e5\2\u0b07\u0b13\3\2\2\2\u0b08"+
		"\u0b09\f\5\2\2\u0b09\u0b0a\7V\2\2\u0b0a\u0b12\5\u01c8\u00e5\2\u0b0b\u0b0c"+
		"\f\4\2\2\u0b0c\u0b0d\7W\2\2\u0b0d\u0b12\5\u01c8\u00e5\2\u0b0e\u0b0f\f"+
		"\3\2\2\u0b0f\u0b10\7[\2\2\u0b10\u0b12\5\u01c8\u00e5\2\u0b11\u0b08\3\2"+
		"\2\2\u0b11\u0b0b\3\2\2\2\u0b11\u0b0e\3\2\2\2\u0b12\u0b15\3\2\2\2\u0b13"+
		"\u0b11\3\2\2\2\u0b13\u0b14\3\2\2\2\u0b14\u01c7\3\2\2\2\u0b15\u0b13\3\2"+
		"\2\2\u0b16\u0b1e\5\u01ca\u00e6\2\u0b17\u0b1e\5\u01cc\u00e7\2\u0b18\u0b19"+
		"\7T\2\2\u0b19\u0b1e\5\u01c8\u00e5\2\u0b1a\u0b1b\7U\2\2\u0b1b\u0b1e\5\u01c8"+
		"\u00e5\2\u0b1c\u0b1e\5\u01ce\u00e8\2\u0b1d\u0b16\3\2\2\2\u0b1d\u0b17\3"+
		"\2\2\2\u0b1d\u0b18\3\2\2\2\u0b1d\u0b1a\3\2\2\2\u0b1d\u0b1c\3\2\2\2\u0b1e"+
		"\u01c9\3\2\2\2\u0b1f\u0b20\7R\2\2\u0b20\u0b21\5\u01c8\u00e5\2\u0b21\u01cb"+
		"\3\2\2\2\u0b22\u0b23\7S\2\2\u0b23\u0b24\5\u01c8\u00e5\2\u0b24\u01cd\3"+
		"\2\2\2\u0b25\u0b2c\5\u01d0\u00e9\2\u0b26\u0b27\7I\2\2\u0b27\u0b2c\5\u01c8"+
		"\u00e5\2\u0b28\u0b29\7H\2\2\u0b29\u0b2c\5\u01c8\u00e5\2\u0b2a\u0b2c\5"+
		"\u01da\u00ee\2\u0b2b\u0b25\3\2\2\2\u0b2b\u0b26\3\2\2\2\u0b2b\u0b28\3\2"+
		"\2\2\u0b2b\u0b2a\3\2\2\2\u0b2c\u01cf\3\2\2\2\u0b2d\u0b30\5\u0162\u00b2"+
		"\2\u0b2e\u0b30\5<\37\2\u0b2f\u0b2d\3\2\2\2\u0b2f\u0b2e\3\2\2\2\u0b30\u0b35"+
		"\3\2\2\2\u0b31\u0b34\5\u01d4\u00eb\2\u0b32\u0b34\5\u01d8\u00ed\2\u0b33"+
		"\u0b31\3\2\2\2\u0b33\u0b32\3\2\2\2\u0b34\u0b37\3\2\2\2\u0b35\u0b33\3\2"+
		"\2\2\u0b35\u0b36\3\2\2\2\u0b36\u01d1\3\2\2\2\u0b37\u0b35\3\2\2\2\u0b38"+
		"\u0b39\5\u01d0\u00e9\2\u0b39\u0b3a\7R\2\2\u0b3a\u01d3\3\2\2\2\u0b3b\u0b3c"+
		"\7R\2\2\u0b3c\u01d5\3\2\2\2\u0b3d\u0b3e\5\u01d0\u00e9\2\u0b3e\u0b3f\7"+
		"S\2\2\u0b3f\u01d7\3\2\2\2\u0b40\u0b41\7S\2\2\u0b41\u01d9\3\2\2\2\u0b42"+
		"\u0b43\7<\2\2\u0b43\u0b44\5\6\4\2\u0b44\u0b45\7=\2\2\u0b45\u0b46\5\u01c8"+
		"\u00e5\2\u0b46\u0b5e\3\2\2\2\u0b47\u0b48\7<\2\2\u0b48\u0b4c\5\16\b\2\u0b49"+
		"\u0b4b\5*\26\2\u0b4a\u0b49\3\2\2\2\u0b4b\u0b4e\3\2\2\2\u0b4c\u0b4a\3\2"+
		"\2\2\u0b4c\u0b4d\3\2\2\2\u0b4d\u0b4f\3\2\2\2\u0b4e\u0b4c\3\2\2\2\u0b4f"+
		"\u0b50\7=\2\2\u0b50\u0b51\5\u01ce\u00e8\2\u0b51\u0b5e\3\2\2\2\u0b52\u0b53"+
		"\7<\2\2\u0b53\u0b57\5\16\b\2\u0b54\u0b56\5*\26\2\u0b55\u0b54\3\2\2\2\u0b56"+
		"\u0b59\3\2\2\2\u0b57\u0b55\3\2\2\2\u0b57\u0b58\3\2\2\2\u0b58\u0b5a\3\2"+
		"\2\2\u0b59\u0b57\3\2\2\2\u0b5a\u0b5b\7=\2\2\u0b5b\u0b5c\5\u01a2\u00d2"+
		"\2\u0b5c\u0b5e\3\2\2\2\u0b5d\u0b42\3\2\2\2\u0b5d\u0b47\3\2\2\2\u0b5d\u0b52"+
		"\3\2\2\2\u0b5e\u01db\3\2\2\2\u0150\u01e0\u01e5\u01ec\u01f0\u01f4\u01fd"+
		"\u0201\u0205\u0207\u020d\u0212\u0219\u021e\u0220\u0226\u022b\u0230\u0235"+
		"\u0240\u024e\u0253\u025b\u0262\u0268\u026d\u0278\u027b\u0289\u028e\u0293"+
		"\u0298\u029e\u02a8\u02b0\u02ba\u02c2\u02ce\u02d2\u02d7\u02dd\u02e5\u02ee"+
		"\u02f9\u0316\u031c\u031f\u0322\u0328\u032e\u0334\u033a\u033d\u0343\u034a"+
		"\u034e\u0353\u0359\u035c\u035f\u036b\u0376\u0384\u038b\u0394\u039b\u03a0"+
		"\u03af\u03b6\u03bc\u03c0\u03c4\u03c8\u03cc\u03d1\u03d5\u03d9\u03db\u03e0"+
		"\u03e7\u03ec\u03ee\u03f4\u03f9\u03fd\u0410\u0415\u0425\u042a\u0430\u0436"+
		"\u0438\u043c\u0441\u0445\u044c\u0453\u045b\u045e\u0463\u046b\u0470\u0477"+
		"\u047e\u0483\u0489\u0495\u049a\u049e\u04a8\u04ad\u04b5\u04b8\u04bd\u04c5"+
		"\u04c8\u04cd\u04d2\u04d7\u04dc\u04e3\u04e8\u04f0\u04f5\u04fa\u04ff\u0505"+
		"\u050b\u050e\u0511\u051a\u0520\u0526\u0529\u052c\u0534\u0539\u053e\u0544"+
		"\u0547\u0552\u055b\u0565\u056a\u0575\u057a\u0586\u058b\u0597\u05a1\u05a6"+
		"\u05ae\u05b1\u05b8\u05c0\u05c6\u05cf\u05d9\u05dd\u05e0\u05e9\u05f7\u05fa"+
		"\u0603\u0608\u0610\u0616\u061e\u062a\u0631\u063f\u0655\u0677\u0683\u0689"+
		"\u0695\u06a2\u06bc\u06c0\u06c5\u06c9\u06cd\u06d5\u06d9\u06dd\u06e4\u06ed"+
		"\u06f5\u0704\u0710\u0716\u071c\u0731\u0736\u073c\u0748\u0753\u075d\u0760"+
		"\u0765\u076e\u0774\u077e\u0783\u078c\u07a3\u07ad\u07c3\u07ca\u07d2\u07da"+
		"\u07e5\u07fc\u0806\u0811\u0827\u082b\u0830\u0838\u083e\u0842\u0846\u084a"+
		"\u0850\u0855\u085a\u085e\u0862\u0868\u086d\u0872\u0876\u087a\u087c\u0881"+
		"\u0886\u088b\u088f\u0893\u0897\u089c\u08a4\u08aa\u08ae\u08b2\u08b6\u08bc"+
		"\u08c1\u08c6\u08ca\u08ce\u08d0\u08d5\u08e4\u08f2\u08fe\u0907\u0916\u0923"+
		"\u092c\u0932\u0939\u093e\u0945\u094a\u0951\u0956\u095d\u0962\u096a\u096f"+
		"\u0973\u0977\u097c\u0983\u098a\u098f\u0996\u099b\u09a2\u09a7\u09af\u09b4"+
		"\u09b8\u09bf\u09c5\u09cc\u09d3\u09da\u09e2\u09e9\u09f1\u09f5\u09fc\u0a03"+
		"\u0a0a\u0a12\u0a19\u0a21\u0a27\u0a2d\u0a39\u0a3f\u0a45\u0a50\u0a59\u0a60"+
		"\u0a67\u0a6c\u0a70\u0a79\u0a84\u0a8e\u0a99\u0aa4\u0aaf\u0aba\u0ac6\u0ac8"+
		"\u0add\u0adf\u0af2\u0af4\u0b00\u0b02\u0b11\u0b13\u0b1d\u0b2b\u0b2f\u0b33"+
		"\u0b35\u0b4c\u0b57\u0b5d";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}