package at.ooe.fh.mc.codespeech.interpreter;
// Generated from Grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, INVOKE=56, ID=57, WHITE_SPACES=58, SPECIAL_SIGNS=59, 
		INTEGER=60;
	public static final int
		RULE_command = 0, RULE_cancel = 1, RULE_creation = 2, RULE_creationVerb = 3, 
		RULE_accessModifier = 4, RULE_structure = 5, RULE_methodInvocation = 6, 
		RULE_article = 7, RULE_methodNames = 8, RULE_variableName = 9, RULE_dot = 10, 
		RULE_arrayKeyword = 11, RULE_selection = 12, RULE_selectionVerb = 13, 
		RULE_navigation = 14, RULE_lineNavigation = 15, RULE_navigationVerb = 16, 
		RULE_number = 17, RULE_modification = 18, RULE_initialization = 19, RULE_initializeKeyword = 20, 
		RULE_addition = 21, RULE_constructorKeyword = 22, RULE_parametersKeyword = 23, 
		RULE_variableType = 24, RULE_changeReturnType = 25, RULE_changeReturnTypeKeyword = 26, 
		RULE_deletion = 27, RULE_deleteKeyword = 28, RULE_implementation = 29, 
		RULE_primitiveType = 30, RULE_staticKeyword = 31, RULE_finalKeyword = 32, 
		RULE_abstractKeyword = 33, RULE_projectKeyword = 34, RULE_packageKeyword = 35, 
		RULE_classKeyword = 36, RULE_methodKeyword = 37, RULE_variableKeyword = 38, 
		RULE_fieldKeyword = 39, RULE_interfaceKeyword = 40, RULE_ifStatementKeyword = 41, 
		RULE_elseStatementKeyword = 42, RULE_whileLoopKeyword = 43, RULE_forLoopKeyword = 44, 
		RULE_typeKeyword = 45, RULE_objectKeyword = 46, RULE_charKeyword = 47, 
		RULE_byteKeyword = 48, RULE_shortKeyword = 49, RULE_integerKeyword = 50, 
		RULE_longKeyword = 51, RULE_booleanKeyword = 52, RULE_doubleKeyword = 53, 
		RULE_floatKeyword = 54, RULE_voidKeyword = 55, RULE_lineKeyword = 56, 
		RULE_phrase = 57;
	public static final String[] ruleNames = {
		"command", "cancel", "creation", "creationVerb", "accessModifier", "structure", 
		"methodInvocation", "article", "methodNames", "variableName", "dot", "arrayKeyword", 
		"selection", "selectionVerb", "navigation", "lineNavigation", "navigationVerb", 
		"number", "modification", "initialization", "initializeKeyword", "addition", 
		"constructorKeyword", "parametersKeyword", "variableType", "changeReturnType", 
		"changeReturnTypeKeyword", "deletion", "deleteKeyword", "implementation", 
		"primitiveType", "staticKeyword", "finalKeyword", "abstractKeyword", "projectKeyword", 
		"packageKeyword", "classKeyword", "methodKeyword", "variableKeyword", 
		"fieldKeyword", "interfaceKeyword", "ifStatementKeyword", "elseStatementKeyword", 
		"whileLoopKeyword", "forLoopKeyword", "typeKeyword", "objectKeyword", 
		"charKeyword", "byteKeyword", "shortKeyword", "integerKeyword", "longKeyword", 
		"booleanKeyword", "doubleKeyword", "floatKeyword", "voidKeyword", "lineKeyword", 
		"phrase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'cancel'", "'create'", "'make'", "'new'", "'public'", "'private'", 
		"'protected'", "'on'", "'an'", "'a'", "'the'", "'.'", "'dot'", "'array of'", 
		"'select '", "'go to '", "'initialize to'", "'add'", "'constructor'", 
		"'parameters '", "'parameter '", "'change return type to '", "'delete '", 
		"'implements'", "'static'", "'final'", "' abstract'", "'project'", "'projects'", 
		"'package'", "'class'", "'method'", "'methods'", "'variable'", "'var'", 
		"'object'", "'type'", "'field'", "'interface'", "'if'", "'else'", "'for while'", 
		"'for loop'", "'char'", "'byte'", "'short'", "'int'", "'integer'", "'long'", 
		"'boolean'", "'bool'", "'double'", "'float'", "'void'", "'line'", "'invoke'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "INVOKE", "ID", "WHITE_SPACES", 
		"SPECIAL_SIGNS", "INTEGER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GrammarParser.EOF, 0); }
		public CreationContext creation() {
			return getRuleContext(CreationContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public NavigationContext navigation() {
			return getRuleContext(NavigationContext.class,0);
		}
		public ModificationContext modification() {
			return getRuleContext(ModificationContext.class,0);
		}
		public MethodInvocationContext methodInvocation() {
			return getRuleContext(MethodInvocationContext.class,0);
		}
		public CancelContext cancel() {
			return getRuleContext(CancelContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(116);
				creation();
				}
				break;
			case 2:
				{
				setState(117);
				selection();
				}
				break;
			case 3:
				{
				setState(118);
				navigation();
				}
				break;
			case 4:
				{
				setState(119);
				modification();
				}
				break;
			case 5:
				{
				setState(120);
				methodInvocation();
				}
				break;
			case 6:
				{
				setState(121);
				cancel();
				}
				break;
			}
			setState(124);
			match(EOF);
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

	public static class CancelContext extends ParserRuleContext {
		public CancelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cancel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCancel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCancel(this);
		}
	}

	public final CancelContext cancel() throws RecognitionException {
		CancelContext _localctx = new CancelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cancel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__0);
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

	public static class CreationContext extends ParserRuleContext {
		public CreationVerbContext creationVerb() {
			return getRuleContext(CreationVerbContext.class,0);
		}
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public List<AccessModifierContext> accessModifier() {
			return getRuleContexts(AccessModifierContext.class);
		}
		public AccessModifierContext accessModifier(int i) {
			return getRuleContext(AccessModifierContext.class,i);
		}
		public List<StaticKeywordContext> staticKeyword() {
			return getRuleContexts(StaticKeywordContext.class);
		}
		public StaticKeywordContext staticKeyword(int i) {
			return getRuleContext(StaticKeywordContext.class,i);
		}
		public List<FinalKeywordContext> finalKeyword() {
			return getRuleContexts(FinalKeywordContext.class);
		}
		public FinalKeywordContext finalKeyword(int i) {
			return getRuleContext(FinalKeywordContext.class,i);
		}
		public List<AbstractKeywordContext> abstractKeyword() {
			return getRuleContexts(AbstractKeywordContext.class);
		}
		public AbstractKeywordContext abstractKeyword(int i) {
			return getRuleContext(AbstractKeywordContext.class,i);
		}
		public CreationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCreation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCreation(this);
		}
	}

	public final CreationContext creation() throws RecognitionException {
		CreationContext _localctx = new CreationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_creation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			creationVerb();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
				{
				setState(129);
				article();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(136);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
					case T__5:
					case T__6:
						{
						setState(132);
						accessModifier();
						}
						break;
					case T__24:
						{
						setState(133);
						staticKeyword();
						}
						break;
					case T__25:
						{
						setState(134);
						finalKeyword();
						}
						break;
					case T__26:
						{
						setState(135);
						abstractKeyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(141);
			structure();
			setState(142);
			phrase();
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

	public static class CreationVerbContext extends ParserRuleContext {
		public CreationVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creationVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCreationVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCreationVerb(this);
		}
	}

	public final CreationVerbContext creationVerb() throws RecognitionException {
		CreationVerbContext _localctx = new CreationVerbContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_creationVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AccessModifierContext extends ParserRuleContext {
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAccessModifier(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StructureContext extends ParserRuleContext {
		public ProjectKeywordContext projectKeyword() {
			return getRuleContext(ProjectKeywordContext.class,0);
		}
		public PackageKeywordContext packageKeyword() {
			return getRuleContext(PackageKeywordContext.class,0);
		}
		public TypeKeywordContext typeKeyword() {
			return getRuleContext(TypeKeywordContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ArrayKeywordContext arrayKeyword() {
			return getRuleContext(ArrayKeywordContext.class,0);
		}
		public MethodKeywordContext methodKeyword() {
			return getRuleContext(MethodKeywordContext.class,0);
		}
		public IfStatementKeywordContext ifStatementKeyword() {
			return getRuleContext(IfStatementKeywordContext.class,0);
		}
		public ElseStatementKeywordContext elseStatementKeyword() {
			return getRuleContext(ElseStatementKeywordContext.class,0);
		}
		public WhileLoopKeywordContext whileLoopKeyword() {
			return getRuleContext(WhileLoopKeywordContext.class,0);
		}
		public ForLoopKeywordContext forLoopKeyword() {
			return getRuleContext(ForLoopKeywordContext.class,0);
		}
		public StructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStructure(this);
		}
	}

	public final StructureContext structure() throws RecognitionException {
		StructureContext _localctx = new StructureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structure);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				projectKeyword();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				packageKeyword();
				}
				break;
			case T__30:
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				typeKeyword();
				}
				break;
			case T__13:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(151);
					arrayKeyword();
					}
				}

				setState(154);
				primitiveType();
				}
				break;
			case T__31:
			case T__32:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				methodKeyword();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 6);
				{
				setState(156);
				ifStatementKeyword();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				elseStatementKeyword();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 8);
				{
				setState(158);
				whileLoopKeyword();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 9);
				{
				setState(159);
				forLoopKeyword();
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

	public static class MethodInvocationContext extends ParserRuleContext {
		public TerminalNode INVOKE() { return getToken(GrammarParser.INVOKE, 0); }
		public MethodNamesContext methodNames() {
			return getRuleContext(MethodNamesContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeKeywordContext typeKeyword() {
			return getRuleContext(TypeKeywordContext.class,0);
		}
		public ObjectKeywordContext objectKeyword() {
			return getRuleContext(ObjectKeywordContext.class,0);
		}
		public MethodInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMethodInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMethodInvocation(this);
		}
	}

	public final MethodInvocationContext methodInvocation() throws RecognitionException {
		MethodInvocationContext _localctx = new MethodInvocationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
				case T__38:
					{
					setState(163);
					typeKeyword();
					}
					break;
				case T__35:
					{
					setState(164);
					objectKeyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(167);
				variableName();
				}
			}

			setState(171);
			match(INVOKE);
			setState(172);
			methodNames();
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

	public static class ArticleContext extends ParserRuleContext {
		public ArticleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_article; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArticle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArticle(this);
		}
	}

	public final ArticleContext article() throws RecognitionException {
		ArticleContext _localctx = new ArticleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MethodNamesContext extends ParserRuleContext {
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public List<DotContext> dot() {
			return getRuleContexts(DotContext.class);
		}
		public DotContext dot(int i) {
			return getRuleContext(DotContext.class,i);
		}
		public MethodNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMethodNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMethodNames(this);
		}
	}

	public final MethodNamesContext methodNames() throws RecognitionException {
		MethodNamesContext _localctx = new MethodNamesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_methodNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				phrase();
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(177);
					dot();
					}
					break;
				}
				}
				}
				setState(182); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << INVOKE) | (1L << ID) | (1L << WHITE_SPACES) | (1L << SPECIAL_SIGNS) | (1L << INTEGER))) != 0) );
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

	public static class VariableNameContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			phrase();
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

	public static class DotContext extends ParserRuleContext {
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArrayKeywordContext extends ParserRuleContext {
		public ArrayKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArrayKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArrayKeyword(this);
		}
	}

	public final ArrayKeywordContext arrayKeyword() throws RecognitionException {
		ArrayKeywordContext _localctx = new ArrayKeywordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__13);
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

	public static class SelectionContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public SelectionVerbContext selectionVerb() {
			return getRuleContext(SelectionVerbContext.class,0);
		}
		public NavigationVerbContext navigationVerb() {
			return getRuleContext(NavigationVerbContext.class,0);
		}
		public ProjectKeywordContext projectKeyword() {
			return getRuleContext(ProjectKeywordContext.class,0);
		}
		public PackageKeywordContext packageKeyword() {
			return getRuleContext(PackageKeywordContext.class,0);
		}
		public TypeKeywordContext typeKeyword() {
			return getRuleContext(TypeKeywordContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSelection(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(190);
				selectionVerb();
				}
				break;
			case T__15:
				{
				setState(191);
				navigationVerb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
				{
				setState(194);
				projectKeyword();
				}
				break;
			case T__29:
				{
				setState(195);
				packageKeyword();
				}
				break;
			case T__30:
			case T__38:
				{
				setState(196);
				typeKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(199);
			phrase();
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

	public static class SelectionVerbContext extends ParserRuleContext {
		public SelectionVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSelectionVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSelectionVerb(this);
		}
	}

	public final SelectionVerbContext selectionVerb() throws RecognitionException {
		SelectionVerbContext _localctx = new SelectionVerbContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectionVerb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__14);
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

	public static class NavigationContext extends ParserRuleContext {
		public LineNavigationContext lineNavigation() {
			return getRuleContext(LineNavigationContext.class,0);
		}
		public NavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNavigation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNavigation(this);
		}
	}

	public final NavigationContext navigation() throws RecognitionException {
		NavigationContext _localctx = new NavigationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_navigation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			lineNavigation();
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

	public static class LineNavigationContext extends ParserRuleContext {
		public NavigationVerbContext navigationVerb() {
			return getRuleContext(NavigationVerbContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public LineKeywordContext lineKeyword() {
			return getRuleContext(LineKeywordContext.class,0);
		}
		public LineNavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNavigation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLineNavigation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLineNavigation(this);
		}
	}

	public final LineNavigationContext lineNavigation() throws RecognitionException {
		LineNavigationContext _localctx = new LineNavigationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_lineNavigation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			navigationVerb();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__54) {
				{
				setState(206);
				lineKeyword();
				}
			}

			setState(209);
			number();
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

	public static class NavigationVerbContext extends ParserRuleContext {
		public NavigationVerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationVerb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNavigationVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNavigationVerb(this);
		}
	}

	public final NavigationVerbContext navigationVerb() throws RecognitionException {
		NavigationVerbContext _localctx = new NavigationVerbContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_navigationVerb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__15);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GrammarParser.INTEGER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(INTEGER);
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

	public static class ModificationContext extends ParserRuleContext {
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public ChangeReturnTypeContext changeReturnType() {
			return getRuleContext(ChangeReturnTypeContext.class,0);
		}
		public DeletionContext deletion() {
			return getRuleContext(DeletionContext.class,0);
		}
		public ImplementationContext implementation() {
			return getRuleContext(ImplementationContext.class,0);
		}
		public AdditionContext addition() {
			return getRuleContext(AdditionContext.class,0);
		}
		public ModificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterModification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitModification(this);
		}
	}

	public final ModificationContext modification() throws RecognitionException {
		ModificationContext _localctx = new ModificationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_modification);
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				initialization();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				changeReturnType();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				deletion();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				implementation();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				addition();
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

	public static class InitializationContext extends ParserRuleContext {
		public InitializeKeywordContext initializeKeyword() {
			return getRuleContext(InitializeKeywordContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitialization(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			initializeKeyword();
			setState(223);
			phrase();
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

	public static class InitializeKeywordContext extends ParserRuleContext {
		public InitializeKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializeKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitializeKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitializeKeyword(this);
		}
	}

	public final InitializeKeywordContext initializeKeyword() throws RecognitionException {
		InitializeKeywordContext _localctx = new InitializeKeywordContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_initializeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__16);
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

	public static class AdditionContext extends ParserRuleContext {
		public ConstructorKeywordContext constructorKeyword() {
			return getRuleContext(ConstructorKeywordContext.class,0);
		}
		public ParametersKeywordContext parametersKeyword() {
			return getRuleContext(ParametersKeywordContext.class,0);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArrayKeywordContext arrayKeyword() {
			return getRuleContext(ArrayKeywordContext.class,0);
		}
		public AdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddition(this);
		}
	}

	public final AdditionContext addition() throws RecognitionException {
		AdditionContext _localctx = new AdditionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_addition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__17);
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				{
				setState(228);
				constructorKeyword();
				}
				break;
			case T__19:
			case T__20:
				{
				{
				setState(229);
				parametersKeyword();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(230);
					arrayKeyword();
					}
					break;
				}
				setState(233);
				variableType();
				setState(234);
				variableName();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConstructorKeywordContext extends ParserRuleContext {
		public ConstructorKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConstructorKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConstructorKeyword(this);
		}
	}

	public final ConstructorKeywordContext constructorKeyword() throws RecognitionException {
		ConstructorKeywordContext _localctx = new ConstructorKeywordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__18);
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

	public static class ParametersKeywordContext extends ParserRuleContext {
		public ParametersKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParametersKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParametersKeyword(this);
		}
	}

	public final ParametersKeywordContext parametersKeyword() throws RecognitionException {
		ParametersKeywordContext _localctx = new ParametersKeywordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parametersKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==T__19 || _la==T__20) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public VariableTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariableType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariableType(this);
		}
	}

	public final VariableTypeContext variableType() throws RecognitionException {
		VariableTypeContext _localctx = new VariableTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(242);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(243);
				phrase();
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

	public static class ChangeReturnTypeContext extends ParserRuleContext {
		public ChangeReturnTypeKeywordContext changeReturnTypeKeyword() {
			return getRuleContext(ChangeReturnTypeKeywordContext.class,0);
		}
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
		}
		public ChangeReturnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeReturnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChangeReturnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChangeReturnType(this);
		}
	}

	public final ChangeReturnTypeContext changeReturnType() throws RecognitionException {
		ChangeReturnTypeContext _localctx = new ChangeReturnTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_changeReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			changeReturnTypeKeyword();
			setState(247);
			variableType();
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

	public static class ChangeReturnTypeKeywordContext extends ParserRuleContext {
		public ChangeReturnTypeKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeReturnTypeKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChangeReturnTypeKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChangeReturnTypeKeyword(this);
		}
	}

	public final ChangeReturnTypeKeywordContext changeReturnTypeKeyword() throws RecognitionException {
		ChangeReturnTypeKeywordContext _localctx = new ChangeReturnTypeKeywordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_changeReturnTypeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__21);
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

	public static class DeletionContext extends ParserRuleContext {
		public DeleteKeywordContext deleteKeyword() {
			return getRuleContext(DeleteKeywordContext.class,0);
		}
		public TypeKeywordContext typeKeyword() {
			return getRuleContext(TypeKeywordContext.class,0);
		}
		public PackageKeywordContext packageKeyword() {
			return getRuleContext(PackageKeywordContext.class,0);
		}
		public ProjectKeywordContext projectKeyword() {
			return getRuleContext(ProjectKeywordContext.class,0);
		}
		public LineKeywordContext lineKeyword() {
			return getRuleContext(LineKeywordContext.class,0);
		}
		public DeletionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeletion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeletion(this);
		}
	}

	public final DeletionContext deletion() throws RecognitionException {
		DeletionContext _localctx = new DeletionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deletion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			deleteKeyword();
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__38:
				{
				setState(252);
				typeKeyword();
				}
				break;
			case T__29:
				{
				setState(253);
				packageKeyword();
				}
				break;
			case T__27:
			case T__28:
				{
				setState(254);
				projectKeyword();
				}
				break;
			case T__54:
				{
				setState(255);
				lineKeyword();
				}
				break;
			case EOF:
				break;
			default:
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

	public static class DeleteKeywordContext extends ParserRuleContext {
		public DeleteKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeleteKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeleteKeyword(this);
		}
	}

	public final DeleteKeywordContext deleteKeyword() throws RecognitionException {
		DeleteKeywordContext _localctx = new DeleteKeywordContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_deleteKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__22);
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

	public static class ImplementationContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ImplementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implementation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterImplementation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitImplementation(this);
		}
	}

	public final ImplementationContext implementation() throws RecognitionException {
		ImplementationContext _localctx = new ImplementationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_implementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__23);
			setState(261);
			phrase();
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
		public CharKeywordContext charKeyword() {
			return getRuleContext(CharKeywordContext.class,0);
		}
		public ByteKeywordContext byteKeyword() {
			return getRuleContext(ByteKeywordContext.class,0);
		}
		public ShortKeywordContext shortKeyword() {
			return getRuleContext(ShortKeywordContext.class,0);
		}
		public IntegerKeywordContext integerKeyword() {
			return getRuleContext(IntegerKeywordContext.class,0);
		}
		public LongKeywordContext longKeyword() {
			return getRuleContext(LongKeywordContext.class,0);
		}
		public BooleanKeywordContext booleanKeyword() {
			return getRuleContext(BooleanKeywordContext.class,0);
		}
		public DoubleKeywordContext doubleKeyword() {
			return getRuleContext(DoubleKeywordContext.class,0);
		}
		public FloatKeywordContext floatKeyword() {
			return getRuleContext(FloatKeywordContext.class,0);
		}
		public VoidKeywordContext voidKeyword() {
			return getRuleContext(VoidKeywordContext.class,0);
		}
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_primitiveType);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				charKeyword();
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				byteKeyword();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				shortKeyword();
				}
				break;
			case T__46:
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				integerKeyword();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				longKeyword();
				}
				break;
			case T__49:
			case T__50:
				enterOuterAlt(_localctx, 6);
				{
				setState(268);
				booleanKeyword();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 7);
				{
				setState(269);
				doubleKeyword();
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 8);
				{
				setState(270);
				floatKeyword();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 9);
				{
				setState(271);
				voidKeyword();
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

	public static class StaticKeywordContext extends ParserRuleContext {
		public StaticKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStaticKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStaticKeyword(this);
		}
	}

	public final StaticKeywordContext staticKeyword() throws RecognitionException {
		StaticKeywordContext _localctx = new StaticKeywordContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_staticKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__24);
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

	public static class FinalKeywordContext extends ParserRuleContext {
		public FinalKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFinalKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFinalKeyword(this);
		}
	}

	public final FinalKeywordContext finalKeyword() throws RecognitionException {
		FinalKeywordContext _localctx = new FinalKeywordContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_finalKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__25);
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

	public static class AbstractKeywordContext extends ParserRuleContext {
		public AbstractKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAbstractKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAbstractKeyword(this);
		}
	}

	public final AbstractKeywordContext abstractKeyword() throws RecognitionException {
		AbstractKeywordContext _localctx = new AbstractKeywordContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_abstractKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__26);
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

	public static class ProjectKeywordContext extends ParserRuleContext {
		public ProjectKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projectKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProjectKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProjectKeyword(this);
		}
	}

	public final ProjectKeywordContext projectKeyword() throws RecognitionException {
		ProjectKeywordContext _localctx = new ProjectKeywordContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_projectKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==T__27 || _la==T__28) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PackageKeywordContext extends ParserRuleContext {
		public PackageKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPackageKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPackageKeyword(this);
		}
	}

	public final PackageKeywordContext packageKeyword() throws RecognitionException {
		PackageKeywordContext _localctx = new PackageKeywordContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_packageKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__29);
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

	public static class ClassKeywordContext extends ParserRuleContext {
		public ClassKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterClassKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitClassKeyword(this);
		}
	}

	public final ClassKeywordContext classKeyword() throws RecognitionException {
		ClassKeywordContext _localctx = new ClassKeywordContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_classKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__30);
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

	public static class MethodKeywordContext extends ParserRuleContext {
		public MethodKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMethodKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMethodKeyword(this);
		}
	}

	public final MethodKeywordContext methodKeyword() throws RecognitionException {
		MethodKeywordContext _localctx = new MethodKeywordContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_methodKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==T__31 || _la==T__32) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class VariableKeywordContext extends ParserRuleContext {
		public VariableKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVariableKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVariableKeyword(this);
		}
	}

	public final VariableKeywordContext variableKeyword() throws RecognitionException {
		VariableKeywordContext _localctx = new VariableKeywordContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FieldKeywordContext extends ParserRuleContext {
		public FieldKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFieldKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFieldKeyword(this);
		}
	}

	public final FieldKeywordContext fieldKeyword() throws RecognitionException {
		FieldKeywordContext _localctx = new FieldKeywordContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_fieldKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__37);
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

	public static class InterfaceKeywordContext extends ParserRuleContext {
		public InterfaceKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInterfaceKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInterfaceKeyword(this);
		}
	}

	public final InterfaceKeywordContext interfaceKeyword() throws RecognitionException {
		InterfaceKeywordContext _localctx = new InterfaceKeywordContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interfaceKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__38);
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

	public static class IfStatementKeywordContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public IfStatementKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatementKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfStatementKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfStatementKeyword(this);
		}
	}

	public final IfStatementKeywordContext ifStatementKeyword() throws RecognitionException {
		IfStatementKeywordContext _localctx = new IfStatementKeywordContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__39);
			setState(295);
			phrase();
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

	public static class ElseStatementKeywordContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ElseStatementKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatementKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElseStatementKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElseStatementKeyword(this);
		}
	}

	public final ElseStatementKeywordContext elseStatementKeyword() throws RecognitionException {
		ElseStatementKeywordContext _localctx = new ElseStatementKeywordContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_elseStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(T__40);
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(298);
				phrase();
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

	public static class WhileLoopKeywordContext extends ParserRuleContext {
		public WhileLoopKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhileLoopKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhileLoopKeyword(this);
		}
	}

	public final WhileLoopKeywordContext whileLoopKeyword() throws RecognitionException {
		WhileLoopKeywordContext _localctx = new WhileLoopKeywordContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_whileLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__41);
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

	public static class ForLoopKeywordContext extends ParserRuleContext {
		public ForLoopKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForLoopKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForLoopKeyword(this);
		}
	}

	public final ForLoopKeywordContext forLoopKeyword() throws RecognitionException {
		ForLoopKeywordContext _localctx = new ForLoopKeywordContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__42);
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

	public static class TypeKeywordContext extends ParserRuleContext {
		public ClassKeywordContext classKeyword() {
			return getRuleContext(ClassKeywordContext.class,0);
		}
		public InterfaceKeywordContext interfaceKeyword() {
			return getRuleContext(InterfaceKeywordContext.class,0);
		}
		public TypeKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTypeKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTypeKeyword(this);
		}
	}

	public final TypeKeywordContext typeKeyword() throws RecognitionException {
		TypeKeywordContext _localctx = new TypeKeywordContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeKeyword);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				classKeyword();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				interfaceKeyword();
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

	public static class ObjectKeywordContext extends ParserRuleContext {
		public ObjectKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterObjectKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitObjectKeyword(this);
		}
	}

	public final ObjectKeywordContext objectKeyword() throws RecognitionException {
		ObjectKeywordContext _localctx = new ObjectKeywordContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_objectKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__35);
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

	public static class CharKeywordContext extends ParserRuleContext {
		public CharKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCharKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCharKeyword(this);
		}
	}

	public final CharKeywordContext charKeyword() throws RecognitionException {
		CharKeywordContext _localctx = new CharKeywordContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_charKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__43);
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

	public static class ByteKeywordContext extends ParserRuleContext {
		public ByteKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_byteKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterByteKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitByteKeyword(this);
		}
	}

	public final ByteKeywordContext byteKeyword() throws RecognitionException {
		ByteKeywordContext _localctx = new ByteKeywordContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_byteKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__44);
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

	public static class ShortKeywordContext extends ParserRuleContext {
		public ShortKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterShortKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitShortKeyword(this);
		}
	}

	public final ShortKeywordContext shortKeyword() throws RecognitionException {
		ShortKeywordContext _localctx = new ShortKeywordContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_shortKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(T__45);
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

	public static class IntegerKeywordContext extends ParserRuleContext {
		public IntegerKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntegerKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntegerKeyword(this);
		}
	}

	public final IntegerKeywordContext integerKeyword() throws RecognitionException {
		IntegerKeywordContext _localctx = new IntegerKeywordContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_integerKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LongKeywordContext extends ParserRuleContext {
		public LongKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_longKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLongKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLongKeyword(this);
		}
	}

	public final LongKeywordContext longKeyword() throws RecognitionException {
		LongKeywordContext _localctx = new LongKeywordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_longKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__48);
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

	public static class BooleanKeywordContext extends ParserRuleContext {
		public BooleanKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBooleanKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBooleanKeyword(this);
		}
	}

	public final BooleanKeywordContext booleanKeyword() throws RecognitionException {
		BooleanKeywordContext _localctx = new BooleanKeywordContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_booleanKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==T__49 || _la==T__50) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DoubleKeywordContext extends ParserRuleContext {
		public DoubleKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDoubleKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDoubleKeyword(this);
		}
	}

	public final DoubleKeywordContext doubleKeyword() throws RecognitionException {
		DoubleKeywordContext _localctx = new DoubleKeywordContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_doubleKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__51);
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

	public static class FloatKeywordContext extends ParserRuleContext {
		public FloatKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFloatKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFloatKeyword(this);
		}
	}

	public final FloatKeywordContext floatKeyword() throws RecognitionException {
		FloatKeywordContext _localctx = new FloatKeywordContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_floatKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(T__52);
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

	public static class VoidKeywordContext extends ParserRuleContext {
		public VoidKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterVoidKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitVoidKeyword(this);
		}
	}

	public final VoidKeywordContext voidKeyword() throws RecognitionException {
		VoidKeywordContext _localctx = new VoidKeywordContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_voidKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__53);
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

	public static class LineKeywordContext extends ParserRuleContext {
		public LineKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLineKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLineKeyword(this);
		}
	}

	public final LineKeywordContext lineKeyword() throws RecognitionException {
		LineKeywordContext _localctx = new LineKeywordContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_lineKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(T__54);
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

	public static class PhraseContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPhrase(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_phrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(333); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(331);
						match(ID);
						}
						break;
					case 2:
						{
						setState(332);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(335); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3>\u0154\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2}\n\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4\u0085\n\4\3\4\3\4\3"+
		"\4\3\4\7\4\u008b\n\4\f\4\16\4\u008e\13\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\5\7\u009b\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a3\n\7\3\b"+
		"\3\b\3\b\5\b\u00a8\n\b\3\b\3\b\5\b\u00ac\n\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\5\n\u00b5\n\n\6\n\u00b7\n\n\r\n\16\n\u00b8\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\5\16\u00c3\n\16\3\16\3\16\3\16\5\16\u00c8\n\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00d2\n\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u00df\n\24\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\5\27\u00ea\n\27\3\27\3\27\3\27\5\27\u00ef\n\27\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\5\32\u00f7\n\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0103\n\35\3\36\3\36\3\37\3\37\3\37\3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0113\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\5,\u012e\n,\3-\3-\3.\3."+
		"\3/\3/\5/\u0136\n/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\6;\u0150\n;\r;\16"+
		";\u0151\3;\4\u008c\u0151\2<\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt\2\r\3\2\4\6\3\2\7\t"+
		"\3\2\n\13\3\2\13\r\3\2\16\17\3\2\26\27\3\2\36\37\3\2\"#\3\2$\'\3\2\61"+
		"\62\3\2\64\65\2\u014b\2|\3\2\2\2\4\u0080\3\2\2\2\6\u0082\3\2\2\2\b\u0092"+
		"\3\2\2\2\n\u0094\3\2\2\2\f\u00a2\3\2\2\2\16\u00ab\3\2\2\2\20\u00b0\3\2"+
		"\2\2\22\u00b6\3\2\2\2\24\u00ba\3\2\2\2\26\u00bc\3\2\2\2\30\u00be\3\2\2"+
		"\2\32\u00c2\3\2\2\2\34\u00cb\3\2\2\2\36\u00cd\3\2\2\2 \u00cf\3\2\2\2\""+
		"\u00d5\3\2\2\2$\u00d7\3\2\2\2&\u00de\3\2\2\2(\u00e0\3\2\2\2*\u00e3\3\2"+
		"\2\2,\u00e5\3\2\2\2.\u00f0\3\2\2\2\60\u00f2\3\2\2\2\62\u00f6\3\2\2\2\64"+
		"\u00f8\3\2\2\2\66\u00fb\3\2\2\28\u00fd\3\2\2\2:\u0104\3\2\2\2<\u0106\3"+
		"\2\2\2>\u0112\3\2\2\2@\u0114\3\2\2\2B\u0116\3\2\2\2D\u0118\3\2\2\2F\u011a"+
		"\3\2\2\2H\u011c\3\2\2\2J\u011e\3\2\2\2L\u0120\3\2\2\2N\u0122\3\2\2\2P"+
		"\u0124\3\2\2\2R\u0126\3\2\2\2T\u0128\3\2\2\2V\u012b\3\2\2\2X\u012f\3\2"+
		"\2\2Z\u0131\3\2\2\2\\\u0135\3\2\2\2^\u0137\3\2\2\2`\u0139\3\2\2\2b\u013b"+
		"\3\2\2\2d\u013d\3\2\2\2f\u013f\3\2\2\2h\u0141\3\2\2\2j\u0143\3\2\2\2l"+
		"\u0145\3\2\2\2n\u0147\3\2\2\2p\u0149\3\2\2\2r\u014b\3\2\2\2t\u014f\3\2"+
		"\2\2v}\5\6\4\2w}\5\32\16\2x}\5\36\20\2y}\5&\24\2z}\5\16\b\2{}\5\4\3\2"+
		"|v\3\2\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2\2\2"+
		"~\177\7\2\2\3\177\3\3\2\2\2\u0080\u0081\7\3\2\2\u0081\5\3\2\2\2\u0082"+
		"\u0084\5\b\5\2\u0083\u0085\5\20\t\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\u008c\3\2\2\2\u0086\u008b\5\n\6\2\u0087\u008b\5@!\2\u0088"+
		"\u008b\5B\"\2\u0089\u008b\5D#\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\u0090\5\f\7\2\u0090\u0091\5t;\2\u0091\7\3\2\2\2\u0092\u0093\t\2\2\2\u0093"+
		"\t\3\2\2\2\u0094\u0095\t\3\2\2\u0095\13\3\2\2\2\u0096\u00a3\5F$\2\u0097"+
		"\u00a3\5H%\2\u0098\u00a3\5\\/\2\u0099\u009b\5\30\r\2\u009a\u0099\3\2\2"+
		"\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a3\5> \2\u009d\u00a3"+
		"\5L\'\2\u009e\u00a3\5T+\2\u009f\u00a3\5V,\2\u00a0\u00a3\5X-\2\u00a1\u00a3"+
		"\5Z.\2\u00a2\u0096\3\2\2\2\u00a2\u0097\3\2\2\2\u00a2\u0098\3\2\2\2\u00a2"+
		"\u009a\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\r\3\2\2\2\u00a4\u00a7"+
		"\t\4\2\2\u00a5\u00a8\5\\/\2\u00a6\u00a8\5^\60\2\u00a7\u00a5\3\2\2\2\u00a7"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\24\13\2\u00aa\u00ac\3"+
		"\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\7:\2\2\u00ae\u00af\5\22\n\2\u00af\17\3\2\2\2\u00b0\u00b1\t\5\2"+
		"\2\u00b1\21\3\2\2\2\u00b2\u00b4\5t;\2\u00b3\u00b5\5\26\f\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\23\3\2\2"+
		"\2\u00ba\u00bb\5t;\2\u00bb\25\3\2\2\2\u00bc\u00bd\t\6\2\2\u00bd\27\3\2"+
		"\2\2\u00be\u00bf\7\20\2\2\u00bf\31\3\2\2\2\u00c0\u00c3\5\34\17\2\u00c1"+
		"\u00c3\5\"\22\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c7\3"+
		"\2\2\2\u00c4\u00c8\5F$\2\u00c5\u00c8\5H%\2\u00c6\u00c8\5\\/\2\u00c7\u00c4"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00ca\5t;\2\u00ca\33\3\2\2\2\u00cb\u00cc\7\21\2\2\u00cc\35\3\2\2\2\u00cd"+
		"\u00ce\5 \21\2\u00ce\37\3\2\2\2\u00cf\u00d1\5\"\22\2\u00d0\u00d2\5r:\2"+
		"\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4"+
		"\5$\23\2\u00d4!\3\2\2\2\u00d5\u00d6\7\22\2\2\u00d6#\3\2\2\2\u00d7\u00d8"+
		"\7>\2\2\u00d8%\3\2\2\2\u00d9\u00df\5(\25\2\u00da\u00df\5\64\33\2\u00db"+
		"\u00df\58\35\2\u00dc\u00df\5<\37\2\u00dd\u00df\5,\27\2\u00de\u00d9\3\2"+
		"\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\'\3\2\2\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\5t;\2\u00e2"+
		")\3\2\2\2\u00e3\u00e4\7\23\2\2\u00e4+\3\2\2\2\u00e5\u00ee\7\24\2\2\u00e6"+
		"\u00ef\5.\30\2\u00e7\u00e9\5\60\31\2\u00e8\u00ea\5\30\r\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\5\62\32\2"+
		"\u00ec\u00ed\5\24\13\2\u00ed\u00ef\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e7"+
		"\3\2\2\2\u00ef-\3\2\2\2\u00f0\u00f1\7\25\2\2\u00f1/\3\2\2\2\u00f2\u00f3"+
		"\t\7\2\2\u00f3\61\3\2\2\2\u00f4\u00f7\5> \2\u00f5\u00f7\5t;\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\63\3\2\2\2\u00f8\u00f9\5\66\34\2\u00f9"+
		"\u00fa\5\62\32\2\u00fa\65\3\2\2\2\u00fb\u00fc\7\30\2\2\u00fc\67\3\2\2"+
		"\2\u00fd\u0102\5:\36\2\u00fe\u0103\5\\/\2\u00ff\u0103\5H%\2\u0100\u0103"+
		"\5F$\2\u0101\u0103\5r:\2\u0102\u00fe\3\2\2\2\u0102\u00ff\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u01039\3\2\2\2"+
		"\u0104\u0105\7\31\2\2\u0105;\3\2\2\2\u0106\u0107\7\32\2\2\u0107\u0108"+
		"\5t;\2\u0108=\3\2\2\2\u0109\u0113\5`\61\2\u010a\u0113\5b\62\2\u010b\u0113"+
		"\5d\63\2\u010c\u0113\5f\64\2\u010d\u0113\5h\65\2\u010e\u0113\5j\66\2\u010f"+
		"\u0113\5l\67\2\u0110\u0113\5n8\2\u0111\u0113\5p9\2\u0112\u0109\3\2\2\2"+
		"\u0112\u010a\3\2\2\2\u0112\u010b\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010d"+
		"\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0111\3\2\2\2\u0113?\3\2\2\2\u0114\u0115\7\33\2\2\u0115A\3\2\2\2\u0116"+
		"\u0117\7\34\2\2\u0117C\3\2\2\2\u0118\u0119\7\35\2\2\u0119E\3\2\2\2\u011a"+
		"\u011b\t\b\2\2\u011bG\3\2\2\2\u011c\u011d\7 \2\2\u011dI\3\2\2\2\u011e"+
		"\u011f\7!\2\2\u011fK\3\2\2\2\u0120\u0121\t\t\2\2\u0121M\3\2\2\2\u0122"+
		"\u0123\t\n\2\2\u0123O\3\2\2\2\u0124\u0125\7(\2\2\u0125Q\3\2\2\2\u0126"+
		"\u0127\7)\2\2\u0127S\3\2\2\2\u0128\u0129\7*\2\2\u0129\u012a\5t;\2\u012a"+
		"U\3\2\2\2\u012b\u012d\7+\2\2\u012c\u012e\5t;\2\u012d\u012c\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012eW\3\2\2\2\u012f\u0130\7,\2\2\u0130Y\3\2\2\2\u0131"+
		"\u0132\7-\2\2\u0132[\3\2\2\2\u0133\u0136\5J&\2\u0134\u0136\5R*\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136]\3\2\2\2\u0137\u0138\7&\2\2\u0138"+
		"_\3\2\2\2\u0139\u013a\7.\2\2\u013aa\3\2\2\2\u013b\u013c\7/\2\2\u013cc"+
		"\3\2\2\2\u013d\u013e\7\60\2\2\u013ee\3\2\2\2\u013f\u0140\t\13\2\2\u0140"+
		"g\3\2\2\2\u0141\u0142\7\63\2\2\u0142i\3\2\2\2\u0143\u0144\t\f\2\2\u0144"+
		"k\3\2\2\2\u0145\u0146\7\66\2\2\u0146m\3\2\2\2\u0147\u0148\7\67\2\2\u0148"+
		"o\3\2\2\2\u0149\u014a\78\2\2\u014aq\3\2\2\2\u014b\u014c\79\2\2\u014cs"+
		"\3\2\2\2\u014d\u0150\7;\2\2\u014e\u0150\13\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0151\u014f\3\2"+
		"\2\2\u0152u\3\2\2\2\31|\u0084\u008a\u008c\u009a\u00a2\u00a7\u00ab\u00b4"+
		"\u00b8\u00c2\u00c7\u00d1\u00de\u00e9\u00ee\u00f6\u0102\u0112\u012d\u0135"+
		"\u014f\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}