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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, INVOKE=66, 
		ARRAY=67, ID=68, WHITE_SPACES=69, SPECIAL_SIGNS=70, INTEGER=71;
	public static final int
		RULE_command = 0, RULE_undo = 1, RULE_freespeech = 2, RULE_stopfreespeech = 3, 
		RULE_cancel = 4, RULE_creation = 5, RULE_creationVerb = 6, RULE_accessModifier = 7, 
		RULE_structure = 8, RULE_methodInvocation = 9, RULE_article = 10, RULE_methodNames = 11, 
		RULE_variableName = 12, RULE_dot = 13, RULE_arrayKeyword = 14, RULE_selection = 15, 
		RULE_selectionVerb = 16, RULE_navigation = 17, RULE_lineNavigation = 18, 
		RULE_navigationVerb = 19, RULE_number = 20, RULE_modification = 21, RULE_initialization = 22, 
		RULE_initializeKeyword = 23, RULE_addition = 24, RULE_argumentKeyword = 25, 
		RULE_constructorKeyword = 26, RULE_parametersKeyword = 27, RULE_variableType = 28, 
		RULE_simpleType = 29, RULE_assignment = 30, RULE_assignKeyword = 31, RULE_assignedValue = 32, 
		RULE_changeReturnType = 33, RULE_changeReturnTypeKeyword = 34, RULE_deletion = 35, 
		RULE_deleteKeyword = 36, RULE_implementation = 37, RULE_primitiveType = 38, 
		RULE_staticKeyword = 39, RULE_finalKeyword = 40, RULE_abstractKeyword = 41, 
		RULE_projectKeyword = 42, RULE_packageKeyword = 43, RULE_classKeyword = 44, 
		RULE_methodKeyword = 45, RULE_variableKeyword = 46, RULE_fieldKeyword = 47, 
		RULE_interfaceKeyword = 48, RULE_ifStatementKeyword = 49, RULE_elseStatementKeyword = 50, 
		RULE_whileLoopKeyword = 51, RULE_forLoopKeyword = 52, RULE_typeKeyword = 53, 
		RULE_objectKeyword = 54, RULE_charKeyword = 55, RULE_byteKeyword = 56, 
		RULE_shortKeyword = 57, RULE_integerKeyword = 58, RULE_longKeyword = 59, 
		RULE_booleanKeyword = 60, RULE_doubleKeyword = 61, RULE_floatKeyword = 62, 
		RULE_voidKeyword = 63, RULE_lineKeyword = 64, RULE_phrase = 65;
	public static final String[] ruleNames = {
		"command", "undo", "freespeech", "stopfreespeech", "cancel", "creation", 
		"creationVerb", "accessModifier", "structure", "methodInvocation", "article", 
		"methodNames", "variableName", "dot", "arrayKeyword", "selection", "selectionVerb", 
		"navigation", "lineNavigation", "navigationVerb", "number", "modification", 
		"initialization", "initializeKeyword", "addition", "argumentKeyword", 
		"constructorKeyword", "parametersKeyword", "variableType", "simpleType", 
		"assignment", "assignKeyword", "assignedValue", "changeReturnType", "changeReturnTypeKeyword", 
		"deletion", "deleteKeyword", "implementation", "primitiveType", "staticKeyword", 
		"finalKeyword", "abstractKeyword", "projectKeyword", "packageKeyword", 
		"classKeyword", "methodKeyword", "variableKeyword", "fieldKeyword", "interfaceKeyword", 
		"ifStatementKeyword", "elseStatementKeyword", "whileLoopKeyword", "forLoopKeyword", 
		"typeKeyword", "objectKeyword", "charKeyword", "byteKeyword", "shortKeyword", 
		"integerKeyword", "longKeyword", "booleanKeyword", "doubleKeyword", "floatKeyword", 
		"voidKeyword", "lineKeyword", "phrase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'undo last'", "'free speech mode'", "'stop free speech mode'", 
		"'cancel'", "'create '", "'make'", "'new'", "'public '", "'private '", 
		"'protected '", "'on'", "'an'", "'a'", "'the'", "'.'", "'dot'", "'select '", 
		"'go to '", "'initialize to'", "'add '", "'argument'", "'constructor'", 
		"'parameters '", "'parameter '", "'named '", "'assign'", "'assigned'", 
		"'to'", "'change return type to '", "'delete '", "'implements'", "'implement'", 
		"'static '", "'final '", "'abstract '", "'project'", "'projects'", "'package'", 
		"'class '", "'method'", "'methods'", "'variable'", "'var'", "'object'", 
		"'type'", "'field'", "'interface'", "'if'", "'else'", "'for while'", "'for loop'", 
		"'object '", "'objects '", "'char'", "'byte'", "'short'", "'int'", "'integer'", 
		"'long'", "'boolean'", "'bool'", "'double'", "'float'", "'void'", "'line'", 
		"'call'", "'array of'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "INVOKE", "ARRAY", "ID", "WHITE_SPACES", 
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
		public StopfreespeechContext stopfreespeech() {
			return getRuleContext(StopfreespeechContext.class,0);
		}
		public FreespeechContext freespeech() {
			return getRuleContext(FreespeechContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(132);
				creation();
				}
				break;
			case 2:
				{
				setState(133);
				selection();
				}
				break;
			case 3:
				{
				setState(134);
				navigation();
				}
				break;
			case 4:
				{
				setState(135);
				modification();
				}
				break;
			case 5:
				{
				setState(136);
				methodInvocation();
				}
				break;
			case 6:
				{
				setState(137);
				cancel();
				}
				break;
			case 7:
				{
				setState(138);
				stopfreespeech();
				}
				break;
			case 8:
				{
				setState(139);
				freespeech();
				}
				break;
			case 9:
				{
				setState(140);
				phrase();
				}
				break;
			}
			setState(143);
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

	public static class UndoContext extends ParserRuleContext {
		public UndoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterUndo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitUndo(this);
		}
	}

	public final UndoContext undo() throws RecognitionException {
		UndoContext _localctx = new UndoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_undo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
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

	public static class FreespeechContext extends ParserRuleContext {
		public FreespeechContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_freespeech; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFreespeech(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFreespeech(this);
		}
	}

	public final FreespeechContext freespeech() throws RecognitionException {
		FreespeechContext _localctx = new FreespeechContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_freespeech);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StopfreespeechContext extends ParserRuleContext {
		public StopfreespeechContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopfreespeech; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStopfreespeech(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStopfreespeech(this);
		}
	}

	public final StopfreespeechContext stopfreespeech() throws RecognitionException {
		StopfreespeechContext _localctx = new StopfreespeechContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stopfreespeech);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_cancel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 10, RULE_creation);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			creationVerb();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(154);
				article();
				}
			}

			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(161);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
					case T__8:
					case T__9:
						{
						setState(157);
						accessModifier();
						}
						break;
					case T__32:
						{
						setState(158);
						staticKeyword();
						}
						break;
					case T__33:
						{
						setState(159);
						finalKeyword();
						}
						break;
					case T__34:
						{
						setState(160);
						abstractKeyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(166);
			structure();
			setState(167);
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
		enterRule(_localctx, 12, RULE_creationVerb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		enterRule(_localctx, 14, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9))) != 0)) ) {
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
		public VariableTypeContext variableType() {
			return getRuleContext(VariableTypeContext.class,0);
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
		enterRule(_localctx, 16, RULE_structure);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				projectKeyword();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				packageKeyword();
				}
				break;
			case T__38:
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				typeKeyword();
				}
				break;
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case ARRAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY) {
					{
					setState(176);
					arrayKeyword();
					}
				}

				setState(179);
				variableType();
				}
				break;
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				methodKeyword();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 6);
				{
				setState(181);
				ifStatementKeyword();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 7);
				{
				setState(182);
				elseStatementKeyword();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 8);
				{
				setState(183);
				whileLoopKeyword();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
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
		enterRule(_localctx, 18, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(188);
					typeKeyword();
					}
					break;
				case 2:
					{
					setState(189);
					objectKeyword();
					}
					break;
				}
				setState(192);
				variableName();
				}
			}

			setState(195);
			match(INVOKE);
			setState(196);
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
		enterRule(_localctx, 20, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) ) {
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
		enterRule(_localctx, 22, RULE_methodNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				phrase();
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(201);
					dot();
					}
					break;
				}
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (INVOKE - 64)) | (1L << (ARRAY - 64)) | (1L << (ID - 64)) | (1L << (WHITE_SPACES - 64)) | (1L << (SPECIAL_SIGNS - 64)) | (1L << (INTEGER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 24, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 26, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
		public TerminalNode ARRAY() { return getToken(GrammarParser.ARRAY, 0); }
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
		enterRule(_localctx, 28, RULE_arrayKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ARRAY);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				{
				setState(214);
				selectionVerb();
				}
				break;
			case T__17:
				{
				setState(215);
				navigationVerb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__35:
			case T__36:
				{
				setState(218);
				projectKeyword();
				}
				break;
			case T__37:
				{
				setState(219);
				packageKeyword();
				}
				break;
			case T__38:
			case T__46:
				{
				setState(220);
				typeKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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
		enterRule(_localctx, 32, RULE_selectionVerb);
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
		enterRule(_localctx, 34, RULE_navigation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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
		enterRule(_localctx, 36, RULE_lineNavigation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			navigationVerb();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__64) {
				{
				setState(230);
				lineKeyword();
				}
			}

			setState(233);
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
		enterRule(_localctx, 38, RULE_navigationVerb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 40, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public UndoContext undo() {
			return getRuleContext(UndoContext.class,0);
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
		enterRule(_localctx, 42, RULE_modification);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				initialization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				changeReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				deletion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				implementation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				addition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				assignment();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				undo();
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
		enterRule(_localctx, 44, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			initializeKeyword();
			setState(249);
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
		enterRule(_localctx, 46, RULE_initializeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
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
		public ArgumentKeywordContext argumentKeyword() {
			return getRuleContext(ArgumentKeywordContext.class,0);
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
		enterRule(_localctx, 48, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(T__19);
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				{
				setState(254);
				constructorKeyword();
				}
				break;
			case T__22:
			case T__23:
				{
				{
				setState(255);
				parametersKeyword();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY) {
					{
					setState(256);
					arrayKeyword();
					}
				}

				setState(259);
				variableType();
				setState(260);
				variableName();
				}
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__20:
				{
				{
				setState(262);
				argumentKeyword();
				setState(263);
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

	public static class ArgumentKeywordContext extends ParserRuleContext {
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
		public ArgumentKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArgumentKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArgumentKeyword(this);
		}
	}

	public final ArgumentKeywordContext argumentKeyword() throws RecognitionException {
		ArgumentKeywordContext _localctx = new ArgumentKeywordContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argumentKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
				{
				setState(267);
				article();
				}
			}

			setState(270);
			match(T__20);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 52, RULE_constructorKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
		enterRule(_localctx, 54, RULE_parametersKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
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
		public ObjectKeywordContext objectKeyword() {
			return getRuleContext(ObjectKeywordContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
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
		enterRule(_localctx, 56, RULE_variableType);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				primitiveType();
				}
				break;
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				objectKeyword();
				setState(278);
				simpleType();
				setState(279);
				match(T__24);
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public AssignKeywordContext assignKeyword() {
			return getRuleContext(AssignKeywordContext.class,0);
		}
		public AssignedValueContext assignedValue() {
			return getRuleContext(AssignedValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			variableName();
			setState(286);
			assignKeyword();
			setState(287);
			assignedValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignKeywordContext extends ParserRuleContext {
		public AssignKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignKeyword(this);
		}
	}

	public final AssignKeywordContext assignKeyword() throws RecognitionException {
		AssignKeywordContext _localctx = new AssignKeywordContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assignKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			_la = _input.LA(1);
			if ( !(_la==T__25 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(290);
				match(T__27);
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

	public static class AssignedValueContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public AssignedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignedValue(this);
		}
	}

	public final AssignedValueContext assignedValue() throws RecognitionException {
		AssignedValueContext _localctx = new AssignedValueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_assignedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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

	public static class ChangeReturnTypeContext extends ParserRuleContext {
		public ChangeReturnTypeKeywordContext changeReturnTypeKeyword() {
			return getRuleContext(ChangeReturnTypeKeywordContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
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
		enterRule(_localctx, 66, RULE_changeReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			changeReturnTypeKeyword();
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(296);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(297);
				simpleType();
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
		enterRule(_localctx, 68, RULE_changeReturnTypeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ParametersKeywordContext parametersKeyword() {
			return getRuleContext(ParametersKeywordContext.class,0);
		}
		public ArgumentKeywordContext argumentKeyword() {
			return getRuleContext(ArgumentKeywordContext.class,0);
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
		enterRule(_localctx, 70, RULE_deletion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			deleteKeyword();
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
			case T__46:
				{
				setState(303);
				typeKeyword();
				}
				break;
			case T__37:
				{
				setState(304);
				packageKeyword();
				}
				break;
			case T__35:
			case T__36:
				{
				setState(305);
				projectKeyword();
				}
				break;
			case T__64:
				{
				setState(306);
				lineKeyword();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__20:
			case T__22:
			case T__23:
				{
				setState(309);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__23:
					{
					setState(307);
					parametersKeyword();
					}
					break;
				case T__11:
				case T__12:
				case T__13:
				case T__20:
					{
					setState(308);
					argumentKeyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(311);
				number();
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
		enterRule(_localctx, 72, RULE_deleteKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
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
		enterRule(_localctx, 74, RULE_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_la = _input.LA(1);
			if ( !(_la==T__30 || _la==T__31) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(318);
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
		enterRule(_localctx, 76, RULE_primitiveType);
		try {
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				charKeyword();
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				byteKeyword();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				shortKeyword();
				}
				break;
			case T__56:
			case T__57:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				integerKeyword();
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				longKeyword();
				}
				break;
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 6);
				{
				setState(325);
				booleanKeyword();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 7);
				{
				setState(326);
				doubleKeyword();
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 8);
				{
				setState(327);
				floatKeyword();
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 9);
				{
				setState(328);
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
		enterRule(_localctx, 78, RULE_staticKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 80, RULE_finalKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__33);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_abstractKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__34);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_projectKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
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
		enterRule(_localctx, 86, RULE_packageKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 88, RULE_classKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
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
		enterRule(_localctx, 90, RULE_methodKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
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
		enterRule(_localctx, 92, RULE_variableKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0)) ) {
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
		enterRule(_localctx, 94, RULE_fieldKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
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
		enterRule(_localctx, 96, RULE_interfaceKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__46);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 98, RULE_ifStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(T__47);
			setState(352);
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
		enterRule(_localctx, 100, RULE_elseStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__48);
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(355);
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
		enterRule(_localctx, 102, RULE_whileLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__49);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_forLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__50);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 106, RULE_typeKeyword);
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				classKeyword();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
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
		enterRule(_localctx, 108, RULE_objectKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__52) ) {
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
		enterRule(_localctx, 110, RULE_charKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
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
		enterRule(_localctx, 112, RULE_byteKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
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
		enterRule(_localctx, 114, RULE_shortKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(T__55);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 116, RULE_integerKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !(_la==T__56 || _la==T__57) ) {
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
		enterRule(_localctx, 118, RULE_longKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__58);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 120, RULE_booleanKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==T__59 || _la==T__60) ) {
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
		enterRule(_localctx, 122, RULE_doubleKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__61);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 124, RULE_floatKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__62);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_voidKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__63);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 128, RULE_lineKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__64);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_phrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(390);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(388);
						match(ID);
						}
						break;
					case 2:
						{
						setState(389);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(392); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2\u0090\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\u009e"+
		"\n\7\3\7\3\7\3\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00b4\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00bc\n\n\3\13\3\13\3\13\5\13\u00c1\n\13\3\13\5\13\u00c4\n\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\5\r\u00cd\n\r\6\r\u00cf\n\r\r\r\16\r\u00d0\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u00db\n\21\3\21\3\21\3\21"+
		"\5\21\u00e0\n\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u00ea\n"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u00f9\n\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0104"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u010c\n\32\3\33\5\33\u010f\n"+
		"\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\5\36\u011c"+
		"\n\36\3\37\3\37\3 \3 \3 \3 \3!\3!\5!\u0126\n!\3\"\3\"\3#\3#\3#\5#\u012d"+
		"\n#\3$\3$\3%\3%\3%\3%\3%\3%\3%\5%\u0138\n%\3%\3%\5%\u013c\n%\3&\3&\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u014c\n(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64"+
		"\3\64\5\64\u0167\n\64\3\65\3\65\3\66\3\66\3\67\3\67\5\67\u016f\n\67\3"+
		"8\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3"+
		"C\6C\u0189\nC\rC\16C\u018a\3C\4\u00a5\u018a\2D\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\2\20\3\2\7\t\3\2\n\f\3\2\r\16\3\2\16\20\3\2\21"+
		"\22\3\2\31\32\3\2\34\35\3\2!\"\3\2&\'\3\2*+\3\2,/\3\2\66\67\3\2;<\3\2"+
		">?\2\u0188\2\u008f\3\2\2\2\4\u0093\3\2\2\2\6\u0095\3\2\2\2\b\u0097\3\2"+
		"\2\2\n\u0099\3\2\2\2\f\u009b\3\2\2\2\16\u00ab\3\2\2\2\20\u00ad\3\2\2\2"+
		"\22\u00bb\3\2\2\2\24\u00c3\3\2\2\2\26\u00c8\3\2\2\2\30\u00ce\3\2\2\2\32"+
		"\u00d2\3\2\2\2\34\u00d4\3\2\2\2\36\u00d6\3\2\2\2 \u00da\3\2\2\2\"\u00e3"+
		"\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00ed\3\2\2\2*\u00ef\3\2\2\2,"+
		"\u00f8\3\2\2\2.\u00fa\3\2\2\2\60\u00fd\3\2\2\2\62\u00ff\3\2\2\2\64\u010e"+
		"\3\2\2\2\66\u0112\3\2\2\28\u0114\3\2\2\2:\u011b\3\2\2\2<\u011d\3\2\2\2"+
		">\u011f\3\2\2\2@\u0123\3\2\2\2B\u0127\3\2\2\2D\u0129\3\2\2\2F\u012e\3"+
		"\2\2\2H\u0130\3\2\2\2J\u013d\3\2\2\2L\u013f\3\2\2\2N\u014b\3\2\2\2P\u014d"+
		"\3\2\2\2R\u014f\3\2\2\2T\u0151\3\2\2\2V\u0153\3\2\2\2X\u0155\3\2\2\2Z"+
		"\u0157\3\2\2\2\\\u0159\3\2\2\2^\u015b\3\2\2\2`\u015d\3\2\2\2b\u015f\3"+
		"\2\2\2d\u0161\3\2\2\2f\u0164\3\2\2\2h\u0168\3\2\2\2j\u016a\3\2\2\2l\u016e"+
		"\3\2\2\2n\u0170\3\2\2\2p\u0172\3\2\2\2r\u0174\3\2\2\2t\u0176\3\2\2\2v"+
		"\u0178\3\2\2\2x\u017a\3\2\2\2z\u017c\3\2\2\2|\u017e\3\2\2\2~\u0180\3\2"+
		"\2\2\u0080\u0182\3\2\2\2\u0082\u0184\3\2\2\2\u0084\u0188\3\2\2\2\u0086"+
		"\u0090\5\f\7\2\u0087\u0090\5 \21\2\u0088\u0090\5$\23\2\u0089\u0090\5,"+
		"\27\2\u008a\u0090\5\24\13\2\u008b\u0090\5\n\6\2\u008c\u0090\5\b\5\2\u008d"+
		"\u0090\5\6\4\2\u008e\u0090\5\u0084C\2\u008f\u0086\3\2\2\2\u008f\u0087"+
		"\3\2\2\2\u008f\u0088\3\2\2\2\u008f\u0089\3\2\2\2\u008f\u008a\3\2\2\2\u008f"+
		"\u008b\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\2\2\3\u0092\3\3\2\2\2\u0093\u0094"+
		"\7\3\2\2\u0094\5\3\2\2\2\u0095\u0096\7\4\2\2\u0096\7\3\2\2\2\u0097\u0098"+
		"\7\5\2\2\u0098\t\3\2\2\2\u0099\u009a\7\6\2\2\u009a\13\3\2\2\2\u009b\u009d"+
		"\5\16\b\2\u009c\u009e\5\26\f\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2"+
		"\u009e\u00a5\3\2\2\2\u009f\u00a4\5\20\t\2\u00a0\u00a4\5P)\2\u00a1\u00a4"+
		"\5R*\2\u00a2\u00a4\5T+\2\u00a3\u009f\3\2\2\2\u00a3\u00a0\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\5\22\n\2\u00a9\u00aa\5\u0084C\2\u00aa\r\3\2\2\2\u00ab\u00ac\t\2"+
		"\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\t\3\2\2\u00ae\21\3\2\2\2\u00af\u00bc"+
		"\5V,\2\u00b0\u00bc\5X-\2\u00b1\u00bc\5l\67\2\u00b2\u00b4\5\36\20\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bc\5:"+
		"\36\2\u00b6\u00bc\5\\/\2\u00b7\u00bc\5d\63\2\u00b8\u00bc\5f\64\2\u00b9"+
		"\u00bc\5h\65\2\u00ba\u00bc\5j\66\2\u00bb\u00af\3\2\2\2\u00bb\u00b0\3\2"+
		"\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b6\3\2\2\2\u00bb"+
		"\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2"+
		"\2\2\u00bc\23\3\2\2\2\u00bd\u00c0\t\4\2\2\u00be\u00c1\5l\67\2\u00bf\u00c1"+
		"\5n8\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\5\32\16\2\u00c3\u00bd\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7D\2\2\u00c6\u00c7\5\30\r\2\u00c7"+
		"\25\3\2\2\2\u00c8\u00c9\t\5\2\2\u00c9\27\3\2\2\2\u00ca\u00cc\5\u0084C"+
		"\2\u00cb\u00cd\5\34\17\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\5\u0084C\2\u00d3"+
		"\33\3\2\2\2\u00d4\u00d5\t\6\2\2\u00d5\35\3\2\2\2\u00d6\u00d7\7E\2\2\u00d7"+
		"\37\3\2\2\2\u00d8\u00db\5\"\22\2\u00d9\u00db\5(\25\2\u00da\u00d8\3\2\2"+
		"\2\u00da\u00d9\3\2\2\2\u00db\u00df\3\2\2\2\u00dc\u00e0\5V,\2\u00dd\u00e0"+
		"\5X-\2\u00de\u00e0\5l\67\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\5\u0084C\2\u00e2!\3\2\2"+
		"\2\u00e3\u00e4\7\23\2\2\u00e4#\3\2\2\2\u00e5\u00e6\5&\24\2\u00e6%\3\2"+
		"\2\2\u00e7\u00e9\5(\25\2\u00e8\u00ea\5\u0082B\2\u00e9\u00e8\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\5*\26\2\u00ec\'\3\2\2\2"+
		"\u00ed\u00ee\7\24\2\2\u00ee)\3\2\2\2\u00ef\u00f0\7I\2\2\u00f0+\3\2\2\2"+
		"\u00f1\u00f9\5.\30\2\u00f2\u00f9\5D#\2\u00f3\u00f9\5H%\2\u00f4\u00f9\5"+
		"L\'\2\u00f5\u00f9\5\62\32\2\u00f6\u00f9\5> \2\u00f7\u00f9\5\4\3\2\u00f8"+
		"\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f4\3\2"+
		"\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"-\3\2\2\2\u00fa\u00fb\5\60\31\2\u00fb\u00fc\5\u0084C\2\u00fc/\3\2\2\2"+
		"\u00fd\u00fe\7\25\2\2\u00fe\61\3\2\2\2\u00ff\u010b\7\26\2\2\u0100\u010c"+
		"\5\66\34\2\u0101\u0103\58\35\2\u0102\u0104\5\36\20\2\u0103\u0102\3\2\2"+
		"\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\5:\36\2\u0106\u0107"+
		"\5\32\16\2\u0107\u010c\3\2\2\2\u0108\u0109\5\64\33\2\u0109\u010a\5\32"+
		"\16\2\u010a\u010c\3\2\2\2\u010b\u0100\3\2\2\2\u010b\u0101\3\2\2\2\u010b"+
		"\u0108\3\2\2\2\u010c\63\3\2\2\2\u010d\u010f\5\26\f\2\u010e\u010d\3\2\2"+
		"\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\27\2\2\u0111"+
		"\65\3\2\2\2\u0112\u0113\7\30\2\2\u0113\67\3\2\2\2\u0114\u0115\t\7\2\2"+
		"\u01159\3\2\2\2\u0116\u011c\5N(\2\u0117\u0118\5n8\2\u0118\u0119\5<\37"+
		"\2\u0119\u011a\7\33\2\2\u011a\u011c\3\2\2\2\u011b\u0116\3\2\2\2\u011b"+
		"\u0117\3\2\2\2\u011c;\3\2\2\2\u011d\u011e\5\u0084C\2\u011e=\3\2\2\2\u011f"+
		"\u0120\5\32\16\2\u0120\u0121\5@!\2\u0121\u0122\5B\"\2\u0122?\3\2\2\2\u0123"+
		"\u0125\t\b\2\2\u0124\u0126\7\36\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3"+
		"\2\2\2\u0126A\3\2\2\2\u0127\u0128\5\u0084C\2\u0128C\3\2\2\2\u0129\u012c"+
		"\5F$\2\u012a\u012d\5N(\2\u012b\u012d\5<\37\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012dE\3\2\2\2\u012e\u012f\7\37\2\2\u012fG\3\2\2\2\u0130"+
		"\u013b\5J&\2\u0131\u013c\5l\67\2\u0132\u013c\5X-\2\u0133\u013c\5V,\2\u0134"+
		"\u013c\5\u0082B\2\u0135\u0138\58\35\2\u0136\u0138\5\64\33\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\5*\26\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b\u0133\3\2"+
		"\2\2\u013b\u0134\3\2\2\2\u013b\u0137\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"I\3\2\2\2\u013d\u013e\7 \2\2\u013eK\3\2\2\2\u013f\u0140\t\t\2\2\u0140"+
		"\u0141\5\u0084C\2\u0141M\3\2\2\2\u0142\u014c\5p9\2\u0143\u014c\5r:\2\u0144"+
		"\u014c\5t;\2\u0145\u014c\5v<\2\u0146\u014c\5x=\2\u0147\u014c\5z>\2\u0148"+
		"\u014c\5|?\2\u0149\u014c\5~@\2\u014a\u014c\5\u0080A\2\u014b\u0142\3\2"+
		"\2\2\u014b\u0143\3\2\2\2\u014b\u0144\3\2\2\2\u014b\u0145\3\2\2\2\u014b"+
		"\u0146\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014cO\3\2\2\2\u014d\u014e\7#\2\2\u014eQ\3\2"+
		"\2\2\u014f\u0150\7$\2\2\u0150S\3\2\2\2\u0151\u0152\7%\2\2\u0152U\3\2\2"+
		"\2\u0153\u0154\t\n\2\2\u0154W\3\2\2\2\u0155\u0156\7(\2\2\u0156Y\3\2\2"+
		"\2\u0157\u0158\7)\2\2\u0158[\3\2\2\2\u0159\u015a\t\13\2\2\u015a]\3\2\2"+
		"\2\u015b\u015c\t\f\2\2\u015c_\3\2\2\2\u015d\u015e\7\60\2\2\u015ea\3\2"+
		"\2\2\u015f\u0160\7\61\2\2\u0160c\3\2\2\2\u0161\u0162\7\62\2\2\u0162\u0163"+
		"\5\u0084C\2\u0163e\3\2\2\2\u0164\u0166\7\63\2\2\u0165\u0167\5\u0084C\2"+
		"\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167g\3\2\2\2\u0168\u0169\7"+
		"\64\2\2\u0169i\3\2\2\2\u016a\u016b\7\65\2\2\u016bk\3\2\2\2\u016c\u016f"+
		"\5Z.\2\u016d\u016f\5b\62\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2\2\2\u016f"+
		"m\3\2\2\2\u0170\u0171\t\r\2\2\u0171o\3\2\2\2\u0172\u0173\78\2\2\u0173"+
		"q\3\2\2\2\u0174\u0175\79\2\2\u0175s\3\2\2\2\u0176\u0177\7:\2\2\u0177u"+
		"\3\2\2\2\u0178\u0179\t\16\2\2\u0179w\3\2\2\2\u017a\u017b\7=\2\2\u017b"+
		"y\3\2\2\2\u017c\u017d\t\17\2\2\u017d{\3\2\2\2\u017e\u017f\7@\2\2\u017f"+
		"}\3\2\2\2\u0180\u0181\7A\2\2\u0181\177\3\2\2\2\u0182\u0183\7B\2\2\u0183"+
		"\u0081\3\2\2\2\u0184\u0185\7C\2\2\u0185\u0083\3\2\2\2\u0186\u0189\7F\2"+
		"\2\u0187\u0189\13\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u0085\3\2"+
		"\2\2\35\u008f\u009d\u00a3\u00a5\u00b3\u00bb\u00c0\u00c3\u00cc\u00d0\u00da"+
		"\u00df\u00e9\u00f8\u0103\u010b\u010e\u011b\u0125\u012c\u0137\u013b\u014b"+
		"\u0166\u016e\u0188\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}