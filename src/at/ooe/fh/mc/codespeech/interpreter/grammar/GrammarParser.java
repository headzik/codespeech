package at.ooe.fh.mc.codespeech.interpreter.grammar;
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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, INVOKE=82, ARRAY=83, ID=84, WHITE_SPACES=85, SPECIAL_SIGNS=86, 
		INTEGER=87;
	public static final int
		RULE_command = 0, RULE_undo = 1, RULE_freespeech = 2, RULE_stopfreespeech = 3, 
		RULE_cancel = 4, RULE_creation = 5, RULE_creationVerb = 6, RULE_accessModifier = 7, 
		RULE_structure = 8, RULE_methodInvocation = 9, RULE_article = 10, RULE_methodNames = 11, 
		RULE_variableName = 12, RULE_dot = 13, RULE_arrayKeyword = 14, RULE_selection = 15, 
		RULE_selectionVerb = 16, RULE_lineKeyword = 17, RULE_navigation = 18, 
		RULE_lineNavigation = 19, RULE_navigationVerb = 20, RULE_number = 21, 
		RULE_modification = 22, RULE_initialization = 23, RULE_initializeKeyword = 24, 
		RULE_addition = 25, RULE_additionKeyword = 26, RULE_argumentKeyword = 27, 
		RULE_constructorKeyword = 28, RULE_parametersKeyword = 29, RULE_variableType = 30, 
		RULE_simpleType = 31, RULE_assignment = 32, RULE_assignKeyword = 33, RULE_assignedValue = 34, 
		RULE_changeReturnType = 35, RULE_changeReturnTypeKeyword = 36, RULE_deletion = 37, 
		RULE_deleteKeyword = 38, RULE_implementation = 39, RULE_extension = 40, 
		RULE_primitiveType = 41, RULE_staticKeyword = 42, RULE_finalKeyword = 43, 
		RULE_abstractKeyword = 44, RULE_projectKeyword = 45, RULE_packageKeyword = 46, 
		RULE_classKeyword = 47, RULE_methodKeyword = 48, RULE_variableKeyword = 49, 
		RULE_fieldKeyword = 50, RULE_interfaceKeyword = 51, RULE_ifStatementKeyword = 52, 
		RULE_elseStatementKeyword = 53, RULE_whileLoopKeyword = 54, RULE_forLoopKeyword = 55, 
		RULE_typeKeyword = 56, RULE_objectKeyword = 57, RULE_charKeyword = 58, 
		RULE_byteKeyword = 59, RULE_shortKeyword = 60, RULE_integerKeyword = 61, 
		RULE_longKeyword = 62, RULE_booleanKeyword = 63, RULE_doubleKeyword = 64, 
		RULE_floatKeyword = 65, RULE_voidKeyword = 66, RULE_nameKeyword = 67, 
		RULE_phrase = 68;
	public static final String[] ruleNames = {
		"command", "undo", "freespeech", "stopfreespeech", "cancel", "creation", 
		"creationVerb", "accessModifier", "structure", "methodInvocation", "article", 
		"methodNames", "variableName", "dot", "arrayKeyword", "selection", "selectionVerb", 
		"lineKeyword", "navigation", "lineNavigation", "navigationVerb", "number", 
		"modification", "initialization", "initializeKeyword", "addition", "additionKeyword", 
		"argumentKeyword", "constructorKeyword", "parametersKeyword", "variableType", 
		"simpleType", "assignment", "assignKeyword", "assignedValue", "changeReturnType", 
		"changeReturnTypeKeyword", "deletion", "deleteKeyword", "implementation", 
		"extension", "primitiveType", "staticKeyword", "finalKeyword", "abstractKeyword", 
		"projectKeyword", "packageKeyword", "classKeyword", "methodKeyword", "variableKeyword", 
		"fieldKeyword", "interfaceKeyword", "ifStatementKeyword", "elseStatementKeyword", 
		"whileLoopKeyword", "forLoopKeyword", "typeKeyword", "objectKeyword", 
		"charKeyword", "byteKeyword", "shortKeyword", "integerKeyword", "longKeyword", 
		"booleanKeyword", "doubleKeyword", "floatKeyword", "voidKeyword", "nameKeyword", 
		"phrase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'undo last'", "'enter free speech'", "'exit free speech'", "'cancel'", 
		"'create '", "'make '", "'new '", "'public '", "'private '", "'protected '", 
		"'on'", "'an'", "'a '", "'an '", "'the '", "'.'", "'dot'", "'select '", 
		"'line '", "'line'", "'go to '", "'initialize to'", "'add '", "'argument'", 
		"'arguments'", "'constructor'", "'parameters '", "'parameter '", "'assign'", 
		"'assigned'", "'to'", "'change return type to '", "'delete '", "'implements'", 
		"'implement'", "'extends'", "'extend'", "'inherits from'", "'inherit from'", 
		"'static '", "'final '", "'abstract '", "'project'", "'projects'", "'package'", 
		"'class '", "'class'", "'method'", "'methods'", "'function'", "'functions'", 
		"'variable'", "'var'", "'object'", "'type'", "'field'", "'interface'", 
		"'if'", "'else'", "'while loop '", "'for loop '", "'object '", "'objects '", 
		"'char'", "'byte'", "'short'", "'int'", "'integer'", "'long'", "'boolean'", 
		"'bool'", "'double'", "'float'", "'floats'", "'void'", "'name it '", "'name '", 
		"'names '", "'named '", "'call it '", "'called '", "'call'", "'array of '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "INVOKE", 
		"ARRAY", "ID", "WHITE_SPACES", "SPECIAL_SIGNS", "INTEGER"
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(138);
				creation();
				}
				break;
			case 2:
				{
				setState(139);
				selection();
				}
				break;
			case 3:
				{
				setState(140);
				navigation();
				}
				break;
			case 4:
				{
				setState(141);
				modification();
				}
				break;
			case 5:
				{
				setState(142);
				methodInvocation();
				}
				break;
			case 6:
				{
				setState(143);
				cancel();
				}
				break;
			case 7:
				{
				setState(144);
				stopfreespeech();
				}
				break;
			case 8:
				{
				setState(145);
				freespeech();
				}
				break;
			case 9:
				{
				setState(146);
				phrase();
				}
				break;
			}
			setState(149);
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
			setState(151);
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
			setState(153);
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
			setState(155);
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
			setState(157);
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
		public StructureContext structure() {
			return getRuleContext(StructureContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<CreationVerbContext> creationVerb() {
			return getRuleContexts(CreationVerbContext.class);
		}
		public CreationVerbContext creationVerb(int i) {
			return getRuleContext(CreationVerbContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159);
					creationVerb();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(162); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(168);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__7:
					case T__8:
					case T__9:
						{
						setState(164);
						accessModifier();
						}
						break;
					case T__39:
						{
						setState(165);
						staticKeyword();
						}
						break;
					case T__40:
						{
						setState(166);
						finalKeyword();
						}
						break;
					case T__41:
						{
						setState(167);
						abstractKeyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(173);
			structure();
			setState(174);
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
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
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
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(T__6);
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				article();
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
			setState(182);
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
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				projectKeyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				packageKeyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				typeKeyword();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(187);
					arrayKeyword();
					}
					break;
				}
				setState(190);
				variableType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(191);
				methodKeyword();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(192);
				ifStatementKeyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				elseStatementKeyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(194);
				whileLoopKeyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(195);
				forLoopKeyword();
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
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__11) {
				{
				setState(198);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(199);
					typeKeyword();
					}
					break;
				case 2:
					{
					setState(200);
					objectKeyword();
					}
					break;
				}
				setState(203);
				variableName();
				}
			}

			setState(206);
			match(INVOKE);
			setState(207);
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
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
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
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				phrase();
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(212);
					dot();
					}
					break;
				}
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (INVOKE - 64)) | (1L << (ARRAY - 64)) | (1L << (ID - 64)) | (1L << (WHITE_SPACES - 64)) | (1L << (SPECIAL_SIGNS - 64)) | (1L << (INTEGER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
			setState(219);
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
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
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
			setState(223);
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
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				{
				setState(225);
				selectionVerb();
				}
				break;
			case T__20:
				{
				setState(226);
				navigationVerb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__42:
			case T__43:
				{
				setState(229);
				projectKeyword();
				}
				break;
			case T__44:
				{
				setState(230);
				packageKeyword();
				}
				break;
			case T__45:
			case T__46:
			case T__56:
				{
				setState(231);
				typeKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(234);
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
			setState(236);
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
		enterRule(_localctx, 34, RULE_lineKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==T__18 || _la==T__19) ) {
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
		enterRule(_localctx, 36, RULE_navigation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
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
		enterRule(_localctx, 38, RULE_lineNavigation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			navigationVerb();
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(243);
				lineKeyword();
				}
				break;
			}
			setState(246);
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
		enterRule(_localctx, 40, RULE_navigationVerb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
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
		enterRule(_localctx, 42, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
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
		public ExtensionContext extension() {
			return getRuleContext(ExtensionContext.class,0);
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
		enterRule(_localctx, 44, RULE_modification);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				initialization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				changeReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				deletion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(255);
				implementation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				extension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(257);
				addition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
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
		enterRule(_localctx, 46, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			initializeKeyword();
			setState(263);
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
		enterRule(_localctx, 48, RULE_initializeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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

	public static class AdditionContext extends ParserRuleContext {
		public ConstructorKeywordContext constructorKeyword() {
			return getRuleContext(ConstructorKeywordContext.class,0);
		}
		public AdditionKeywordContext additionKeyword() {
			return getRuleContext(AdditionKeywordContext.class,0);
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
		enterRule(_localctx, 50, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(267);
				additionKeyword();
				}
			}

			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(270);
				constructorKeyword();
				}
				break;
			case T__26:
			case T__27:
				{
				{
				setState(271);
				parametersKeyword();
				setState(273);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(272);
					arrayKeyword();
					}
					break;
				}
				setState(275);
				variableType();
				setState(276);
				variableName();
				}
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__23:
			case T__24:
				{
				{
				setState(278);
				argumentKeyword();
				setState(279);
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

	public static class AdditionKeywordContext extends ParserRuleContext {
		public AdditionKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdditionKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdditionKeyword(this);
		}
	}

	public final AdditionKeywordContext additionKeyword() throws RecognitionException {
		AdditionKeywordContext _localctx = new AdditionKeywordContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_additionKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
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
		enterRule(_localctx, 54, RULE_argumentKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				setState(285);
				article();
				}
			}

			setState(288);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
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
		enterRule(_localctx, 56, RULE_constructorKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
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
		enterRule(_localctx, 58, RULE_parametersKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==T__26 || _la==T__27) ) {
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
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public NameKeywordContext nameKeyword() {
			return getRuleContext(NameKeywordContext.class,0);
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
		enterRule(_localctx, 60, RULE_variableType);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				simpleType();
				setState(296);
				nameKeyword();
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
		enterRule(_localctx, 62, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
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
		enterRule(_localctx, 64, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			variableName();
			setState(303);
			assignKeyword();
			setState(304);
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
		enterRule(_localctx, 66, RULE_assignKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_la = _input.LA(1);
			if ( !(_la==T__28 || _la==T__29) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(307);
				match(T__30);
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
		enterRule(_localctx, 68, RULE_assignedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		enterRule(_localctx, 70, RULE_changeReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			changeReturnTypeKeyword();
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(313);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(314);
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
		enterRule(_localctx, 72, RULE_changeReturnTypeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__31);
			}
		}
		catch (RecognitionException re) {
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
		public List<TypeKeywordContext> typeKeyword() {
			return getRuleContexts(TypeKeywordContext.class);
		}
		public TypeKeywordContext typeKeyword(int i) {
			return getRuleContext(TypeKeywordContext.class,i);
		}
		public List<PackageKeywordContext> packageKeyword() {
			return getRuleContexts(PackageKeywordContext.class);
		}
		public PackageKeywordContext packageKeyword(int i) {
			return getRuleContext(PackageKeywordContext.class,i);
		}
		public List<ProjectKeywordContext> projectKeyword() {
			return getRuleContexts(ProjectKeywordContext.class);
		}
		public ProjectKeywordContext projectKeyword(int i) {
			return getRuleContext(ProjectKeywordContext.class,i);
		}
		public List<LineKeywordContext> lineKeyword() {
			return getRuleContexts(LineKeywordContext.class);
		}
		public LineKeywordContext lineKeyword(int i) {
			return getRuleContext(LineKeywordContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<ParametersKeywordContext> parametersKeyword() {
			return getRuleContexts(ParametersKeywordContext.class);
		}
		public ParametersKeywordContext parametersKeyword(int i) {
			return getRuleContext(ParametersKeywordContext.class,i);
		}
		public List<ArgumentKeywordContext> argumentKeyword() {
			return getRuleContexts(ArgumentKeywordContext.class);
		}
		public ArgumentKeywordContext argumentKeyword(int i) {
			return getRuleContext(ArgumentKeywordContext.class,i);
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
		enterRule(_localctx, 74, RULE_deletion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			deleteKeyword();
			setState(330); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(330);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__45:
				case T__46:
				case T__56:
					{
					setState(320);
					typeKeyword();
					}
					break;
				case T__44:
					{
					setState(321);
					packageKeyword();
					}
					break;
				case T__42:
				case T__43:
					{
					setState(322);
					projectKeyword();
					}
					break;
				case T__18:
				case T__19:
					{
					setState(323);
					lineKeyword();
					}
					break;
				case T__12:
				case T__13:
				case T__14:
				case T__23:
				case T__24:
				case T__26:
				case T__27:
					{
					setState(326);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__26:
					case T__27:
						{
						setState(324);
						parametersKeyword();
						}
						break;
					case T__12:
					case T__13:
					case T__14:
					case T__23:
					case T__24:
						{
						setState(325);
						argumentKeyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(328);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__56))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 76, RULE_deleteKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 78, RULE_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_la = _input.LA(1);
			if ( !(_la==T__33 || _la==T__34) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(337);
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

	public static class ExtensionContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExtension(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(340);
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
		enterRule(_localctx, 82, RULE_primitiveType);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				charKeyword();
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				byteKeyword();
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				shortKeyword();
				}
				break;
			case T__66:
			case T__67:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				integerKeyword();
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 5);
				{
				setState(346);
				longKeyword();
				}
				break;
			case T__69:
			case T__70:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				booleanKeyword();
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				doubleKeyword();
				}
				break;
			case T__72:
			case T__73:
				enterOuterAlt(_localctx, 8);
				{
				setState(349);
				floatKeyword();
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 9);
				{
				setState(350);
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
		enterRule(_localctx, 84, RULE_staticKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 86, RULE_finalKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(T__40);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 88, RULE_abstractKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
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
		enterRule(_localctx, 90, RULE_projectKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_la = _input.LA(1);
			if ( !(_la==T__42 || _la==T__43) ) {
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
		enterRule(_localctx, 92, RULE_packageKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 94, RULE_classKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
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
		enterRule(_localctx, 96, RULE_methodKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
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
		enterRule(_localctx, 98, RULE_variableKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
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
		enterRule(_localctx, 100, RULE_fieldKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
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
		enterRule(_localctx, 102, RULE_interfaceKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(T__56);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 104, RULE_ifStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__57);
			setState(374);
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
		enterRule(_localctx, 106, RULE_elseStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__58);
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(377);
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
		enterRule(_localctx, 108, RULE_whileLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(T__59);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 110, RULE_forLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__60);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 112, RULE_typeKeyword);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__45:
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				classKeyword();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
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
		enterRule(_localctx, 114, RULE_objectKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==T__61 || _la==T__62) ) {
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
		enterRule(_localctx, 116, RULE_charKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
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
		enterRule(_localctx, 118, RULE_byteKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
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
		enterRule(_localctx, 120, RULE_shortKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__65);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 122, RULE_integerKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !(_la==T__66 || _la==T__67) ) {
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
		enterRule(_localctx, 124, RULE_longKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(T__68);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 126, RULE_booleanKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if ( !(_la==T__69 || _la==T__70) ) {
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
		enterRule(_localctx, 128, RULE_doubleKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__71);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 130, RULE_floatKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_la = _input.LA(1);
			if ( !(_la==T__72 || _la==T__73) ) {
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
		enterRule(_localctx, 132, RULE_voidKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__74);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameKeywordContext extends ParserRuleContext {
		public NameKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNameKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNameKeyword(this);
		}
	}

	public final NameKeywordContext nameKeyword() throws RecognitionException {
		NameKeywordContext _localctx = new NameKeywordContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_nameKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & ((1L << (T__75 - 76)) | (1L << (T__76 - 76)) | (1L << (T__77 - 76)) | (1L << (T__78 - 76)) | (1L << (T__79 - 76)) | (1L << (T__80 - 76)))) != 0)) ) {
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
		enterRule(_localctx, 136, RULE_phrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(410);
						match(ID);
						}
						break;
					case 2:
						{
						setState(411);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(414); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u01a3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u0096\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\6\7\u00a3\n\7\r\7\16\7\u00a4\3\7\3\7\3\7\3\7\7\7\u00ab\n\7\f"+
		"\7\16\7\u00ae\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00b7\n\b\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\5\n\u00bf\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c7\n\n\3\13"+
		"\3\13\3\13\5\13\u00cc\n\13\3\13\5\13\u00cf\n\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\5\r\u00d8\n\r\6\r\u00da\n\r\r\r\16\r\u00db\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\3\21\5\21\u00eb\n\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u00f7\n\25\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u0107\n\30\3\31\3\31\3\31\3\32\3\32\3\33\5\33\u010f\n\33\3\33\3\33\3"+
		"\33\5\33\u0114\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u011c\n\33\3\34"+
		"\3\34\3\35\5\35\u0121\n\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \5"+
		" \u012d\n \3!\3!\3\"\3\"\3\"\3\"\3#\3#\5#\u0137\n#\3$\3$\3%\3%\3%\5%\u013e"+
		"\n%\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0149\n\'\3\'\3\'\6\'\u014d"+
		"\n\'\r\'\16\'\u014e\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\5+\u0162\n+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\67\3\67\5\67\u017d\n\67"+
		"\38\38\39\39\3:\3:\5:\u0185\n:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A"+
		"\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\6F\u019f\nF\rF\16F\u01a0\3F\4\u00ac"+
		"\u01a0\2G\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\2\25\3\2\n\f\3\2\r\16\3\2\17\21\3\2\22\23\3\2\25\26\3\2\32\33\3\2\35"+
		"\36\3\2\37 \3\2$%\3\2&)\3\2-.\3\2\60\61\3\2\62\65\3\2\669\3\2@A\3\2EF"+
		"\3\2HI\3\2KL\3\2NS\2\u01a0\2\u0095\3\2\2\2\4\u0099\3\2\2\2\6\u009b\3\2"+
		"\2\2\b\u009d\3\2\2\2\n\u009f\3\2\2\2\f\u00a2\3\2\2\2\16\u00b6\3\2\2\2"+
		"\20\u00b8\3\2\2\2\22\u00c6\3\2\2\2\24\u00ce\3\2\2\2\26\u00d3\3\2\2\2\30"+
		"\u00d9\3\2\2\2\32\u00dd\3\2\2\2\34\u00df\3\2\2\2\36\u00e1\3\2\2\2 \u00e5"+
		"\3\2\2\2\"\u00ee\3\2\2\2$\u00f0\3\2\2\2&\u00f2\3\2\2\2(\u00f4\3\2\2\2"+
		"*\u00fa\3\2\2\2,\u00fc\3\2\2\2.\u0106\3\2\2\2\60\u0108\3\2\2\2\62\u010b"+
		"\3\2\2\2\64\u010e\3\2\2\2\66\u011d\3\2\2\28\u0120\3\2\2\2:\u0124\3\2\2"+
		"\2<\u0126\3\2\2\2>\u012c\3\2\2\2@\u012e\3\2\2\2B\u0130\3\2\2\2D\u0134"+
		"\3\2\2\2F\u0138\3\2\2\2H\u013a\3\2\2\2J\u013f\3\2\2\2L\u0141\3\2\2\2N"+
		"\u0150\3\2\2\2P\u0152\3\2\2\2R\u0155\3\2\2\2T\u0161\3\2\2\2V\u0163\3\2"+
		"\2\2X\u0165\3\2\2\2Z\u0167\3\2\2\2\\\u0169\3\2\2\2^\u016b\3\2\2\2`\u016d"+
		"\3\2\2\2b\u016f\3\2\2\2d\u0171\3\2\2\2f\u0173\3\2\2\2h\u0175\3\2\2\2j"+
		"\u0177\3\2\2\2l\u017a\3\2\2\2n\u017e\3\2\2\2p\u0180\3\2\2\2r\u0184\3\2"+
		"\2\2t\u0186\3\2\2\2v\u0188\3\2\2\2x\u018a\3\2\2\2z\u018c\3\2\2\2|\u018e"+
		"\3\2\2\2~\u0190\3\2\2\2\u0080\u0192\3\2\2\2\u0082\u0194\3\2\2\2\u0084"+
		"\u0196\3\2\2\2\u0086\u0198\3\2\2\2\u0088\u019a\3\2\2\2\u008a\u019e\3\2"+
		"\2\2\u008c\u0096\5\f\7\2\u008d\u0096\5 \21\2\u008e\u0096\5&\24\2\u008f"+
		"\u0096\5.\30\2\u0090\u0096\5\24\13\2\u0091\u0096\5\n\6\2\u0092\u0096\5"+
		"\b\5\2\u0093\u0096\5\6\4\2\u0094\u0096\5\u008aF\2\u0095\u008c\3\2\2\2"+
		"\u0095\u008d\3\2\2\2\u0095\u008e\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0090"+
		"\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\2\2\3\u0098\3\3\2\2\2"+
		"\u0099\u009a\7\3\2\2\u009a\5\3\2\2\2\u009b\u009c\7\4\2\2\u009c\7\3\2\2"+
		"\2\u009d\u009e\7\5\2\2\u009e\t\3\2\2\2\u009f\u00a0\7\6\2\2\u00a0\13\3"+
		"\2\2\2\u00a1\u00a3\5\16\b\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6\u00ab\5\20"+
		"\t\2\u00a7\u00ab\5V,\2\u00a8\u00ab\5X-\2\u00a9\u00ab\5Z.\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\5\u008aF\2\u00b1"+
		"\r\3\2\2\2\u00b2\u00b7\7\7\2\2\u00b3\u00b7\7\b\2\2\u00b4\u00b7\7\t\2\2"+
		"\u00b5\u00b7\5\26\f\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\17\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9"+
		"\21\3\2\2\2\u00ba\u00c7\5\\/\2\u00bb\u00c7\5^\60\2\u00bc\u00c7\5r:\2\u00bd"+
		"\u00bf\5\36\20\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c7\5> \2\u00c1\u00c7\5b\62\2\u00c2\u00c7\5j\66\2\u00c3"+
		"\u00c7\5l\67\2\u00c4\u00c7\5n8\2\u00c5\u00c7\5p9\2\u00c6\u00ba\3\2\2\2"+
		"\u00c6\u00bb\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c1"+
		"\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\23\3\2\2\2\u00c8\u00cb\t\3\2\2\u00c9\u00cc\5r:\2"+
		"\u00ca\u00cc\5t;\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\5\32\16\2\u00ce\u00c8\3\2\2\2"+
		"\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7T\2\2\u00d1\u00d2"+
		"\5\30\r\2\u00d2\25\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4\27\3\2\2\2\u00d5"+
		"\u00d7\5\u008aF\2\u00d6\u00d8\5\34\17\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\31\3\2\2\2\u00dd\u00de\5\u008a"+
		"F\2\u00de\33\3\2\2\2\u00df\u00e0\t\5\2\2\u00e0\35\3\2\2\2\u00e1\u00e2"+
		"\7U\2\2\u00e2\37\3\2\2\2\u00e3\u00e6\5\"\22\2\u00e4\u00e6\5*\26\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00ea\3\2\2\2\u00e7\u00eb\5\\"+
		"/\2\u00e8\u00eb\5^\60\2\u00e9\u00eb\5r:\2\u00ea\u00e7\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\5\u008aF"+
		"\2\u00ed!\3\2\2\2\u00ee\u00ef\7\24\2\2\u00ef#\3\2\2\2\u00f0\u00f1\t\6"+
		"\2\2\u00f1%\3\2\2\2\u00f2\u00f3\5(\25\2\u00f3\'\3\2\2\2\u00f4\u00f6\5"+
		"*\26\2\u00f5\u00f7\5$\23\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\5\u008aF\2\u00f9)\3\2\2\2\u00fa\u00fb\7\27"+
		"\2\2\u00fb+\3\2\2\2\u00fc\u00fd\7Y\2\2\u00fd-\3\2\2\2\u00fe\u0107\5\60"+
		"\31\2\u00ff\u0107\5H%\2\u0100\u0107\5L\'\2\u0101\u0107\5P)\2\u0102\u0107"+
		"\5R*\2\u0103\u0107\5\64\33\2\u0104\u0107\5B\"\2\u0105\u0107\5\4\3\2\u0106"+
		"\u00fe\3\2\2\2\u0106\u00ff\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0101\3\2"+
		"\2\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107/\3\2\2\2\u0108\u0109\5\62\32\2\u0109\u010a\5\u008a"+
		"F\2\u010a\61\3\2\2\2\u010b\u010c\7\30\2\2\u010c\63\3\2\2\2\u010d\u010f"+
		"\5\66\34\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u011b\3\2\2\2"+
		"\u0110\u011c\5:\36\2\u0111\u0113\5<\37\2\u0112\u0114\5\36\20\2\u0113\u0112"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\5> \2\u0116"+
		"\u0117\5\32\16\2\u0117\u011c\3\2\2\2\u0118\u0119\58\35\2\u0119\u011a\5"+
		"\32\16\2\u011a\u011c\3\2\2\2\u011b\u0110\3\2\2\2\u011b\u0111\3\2\2\2\u011b"+
		"\u0118\3\2\2\2\u011c\65\3\2\2\2\u011d\u011e\7\31\2\2\u011e\67\3\2\2\2"+
		"\u011f\u0121\5\26\f\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122"+
		"\3\2\2\2\u0122\u0123\t\7\2\2\u01239\3\2\2\2\u0124\u0125\7\34\2\2\u0125"+
		";\3\2\2\2\u0126\u0127\t\b\2\2\u0127=\3\2\2\2\u0128\u012d\5T+\2\u0129\u012a"+
		"\5@!\2\u012a\u012b\5\u0088E\2\u012b\u012d\3\2\2\2\u012c\u0128\3\2\2\2"+
		"\u012c\u0129\3\2\2\2\u012d?\3\2\2\2\u012e\u012f\5\u008aF\2\u012fA\3\2"+
		"\2\2\u0130\u0131\5\32\16\2\u0131\u0132\5D#\2\u0132\u0133\5F$\2\u0133C"+
		"\3\2\2\2\u0134\u0136\t\t\2\2\u0135\u0137\7!\2\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137E\3\2\2\2\u0138\u0139\5\u008aF\2\u0139G\3\2\2\2\u013a"+
		"\u013d\5J&\2\u013b\u013e\5T+\2\u013c\u013e\5@!\2\u013d\u013b\3\2\2\2\u013d"+
		"\u013c\3\2\2\2\u013eI\3\2\2\2\u013f\u0140\7\"\2\2\u0140K\3\2\2\2\u0141"+
		"\u014c\5N(\2\u0142\u014d\5r:\2\u0143\u014d\5^\60\2\u0144\u014d\5\\/\2"+
		"\u0145\u014d\5$\23\2\u0146\u0149\5<\37\2\u0147\u0149\58\35\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\5,\27\2\u014b"+
		"\u014d\3\2\2\2\u014c\u0142\3\2\2\2\u014c\u0143\3\2\2\2\u014c\u0144\3\2"+
		"\2\2\u014c\u0145\3\2\2\2\u014c\u0148\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fM\3\2\2\2\u0150\u0151\7#\2\2\u0151"+
		"O\3\2\2\2\u0152\u0153\t\n\2\2\u0153\u0154\5\u008aF\2\u0154Q\3\2\2\2\u0155"+
		"\u0156\t\13\2\2\u0156\u0157\5\u008aF\2\u0157S\3\2\2\2\u0158\u0162\5v<"+
		"\2\u0159\u0162\5x=\2\u015a\u0162\5z>\2\u015b\u0162\5|?\2\u015c\u0162\5"+
		"~@\2\u015d\u0162\5\u0080A\2\u015e\u0162\5\u0082B\2\u015f\u0162\5\u0084"+
		"C\2\u0160\u0162\5\u0086D\2\u0161\u0158\3\2\2\2\u0161\u0159\3\2\2\2\u0161"+
		"\u015a\3\2\2\2\u0161\u015b\3\2\2\2\u0161\u015c\3\2\2\2\u0161\u015d\3\2"+
		"\2\2\u0161\u015e\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2\u0162"+
		"U\3\2\2\2\u0163\u0164\7*\2\2\u0164W\3\2\2\2\u0165\u0166\7+\2\2\u0166Y"+
		"\3\2\2\2\u0167\u0168\7,\2\2\u0168[\3\2\2\2\u0169\u016a\t\f\2\2\u016a]"+
		"\3\2\2\2\u016b\u016c\7/\2\2\u016c_\3\2\2\2\u016d\u016e\t\r\2\2\u016ea"+
		"\3\2\2\2\u016f\u0170\t\16\2\2\u0170c\3\2\2\2\u0171\u0172\t\17\2\2\u0172"+
		"e\3\2\2\2\u0173\u0174\7:\2\2\u0174g\3\2\2\2\u0175\u0176\7;\2\2\u0176i"+
		"\3\2\2\2\u0177\u0178\7<\2\2\u0178\u0179\5\u008aF\2\u0179k\3\2\2\2\u017a"+
		"\u017c\7=\2\2\u017b\u017d\5\u008aF\2\u017c\u017b\3\2\2\2\u017c\u017d\3"+
		"\2\2\2\u017dm\3\2\2\2\u017e\u017f\7>\2\2\u017fo\3\2\2\2\u0180\u0181\7"+
		"?\2\2\u0181q\3\2\2\2\u0182\u0185\5`\61\2\u0183\u0185\5h\65\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0183\3\2\2\2\u0185s\3\2\2\2\u0186\u0187\t\20\2\2\u0187"+
		"u\3\2\2\2\u0188\u0189\7B\2\2\u0189w\3\2\2\2\u018a\u018b\7C\2\2\u018by"+
		"\3\2\2\2\u018c\u018d\7D\2\2\u018d{\3\2\2\2\u018e\u018f\t\21\2\2\u018f"+
		"}\3\2\2\2\u0190\u0191\7G\2\2\u0191\177\3\2\2\2\u0192\u0193\t\22\2\2\u0193"+
		"\u0081\3\2\2\2\u0194\u0195\7J\2\2\u0195\u0083\3\2\2\2\u0196\u0197\t\23"+
		"\2\2\u0197\u0085\3\2\2\2\u0198\u0199\7M\2\2\u0199\u0087\3\2\2\2\u019a"+
		"\u019b\t\24\2\2\u019b\u0089\3\2\2\2\u019c\u019f\7V\2\2\u019d\u019f\13"+
		"\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1\u008b\3\2\2\2 \u0095\u00a4\u00aa"+
		"\u00ac\u00b6\u00be\u00c6\u00cb\u00ce\u00d7\u00db\u00e5\u00ea\u00f6\u0106"+
		"\u010e\u0113\u011b\u0120\u012c\u0136\u013d\u0148\u014c\u014e\u0161\u017c"+
		"\u0184\u019e\u01a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}