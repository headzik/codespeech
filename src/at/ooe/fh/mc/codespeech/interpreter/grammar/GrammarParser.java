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
		T__73=74, T__74=75, T__75=76, T__76=77, INVOKE=78, ARRAY=79, ID=80, WHITE_SPACES=81, 
		SPECIAL_SIGNS=82, INTEGER=83;
	public static final int
		RULE_command = 0, RULE_creation = 1, RULE_creationVerb = 2, RULE_structure = 3, 
		RULE_selection = 4, RULE_selectionVerb = 5, RULE_navigation = 6, RULE_lineNavigation = 7, 
		RULE_navigationVerb = 8, RULE_lineKeyword = 9, RULE_modification = 10, 
		RULE_initialization = 11, RULE_initializeKeyword = 12, RULE_changeReturnType = 13, 
		RULE_changeReturnTypeKeyword = 14, RULE_deletion = 15, RULE_deleteKeyword = 16, 
		RULE_implementation = 17, RULE_extension = 18, RULE_addition = 19, RULE_additionKeyword = 20, 
		RULE_argumentKeyword = 21, RULE_constructorKeyword = 22, RULE_parametersKeyword = 23, 
		RULE_assignment = 24, RULE_assignKeyword = 25, RULE_assignedValue = 26, 
		RULE_undo = 27, RULE_returnStatement = 28, RULE_methodInvocation = 29, 
		RULE_methodNames = 30, RULE_objectKeyword = 31, RULE_cancel = 32, RULE_freespeech = 33, 
		RULE_stopfreespeech = 34, RULE_projectKeyword = 35, RULE_packageKeyword = 36, 
		RULE_typeKeyword = 37, RULE_classKeyword = 38, RULE_interfaceKeyword = 39, 
		RULE_primitiveType = 40, RULE_variableType = 41, RULE_methodKeyword = 42, 
		RULE_ifStatementKeyword = 43, RULE_elseStatementKeyword = 44, RULE_whileLoopKeyword = 45, 
		RULE_forLoopKeyword = 46, RULE_charKeyword = 47, RULE_byteKeyword = 48, 
		RULE_shortKeyword = 49, RULE_integerKeyword = 50, RULE_longKeyword = 51, 
		RULE_booleanKeyword = 52, RULE_doubleKeyword = 53, RULE_floatKeyword = 54, 
		RULE_voidKeyword = 55, RULE_variableName = 56, RULE_simpleType = 57, RULE_accessModifier = 58, 
		RULE_staticKeyword = 59, RULE_finalKeyword = 60, RULE_abstractKeyword = 61, 
		RULE_nameKeyword = 62, RULE_article = 63, RULE_dot = 64, RULE_arrayKeyword = 65, 
		RULE_phrase = 66, RULE_number = 67;
	public static final String[] ruleNames = {
		"command", "creation", "creationVerb", "structure", "selection", "selectionVerb", 
		"navigation", "lineNavigation", "navigationVerb", "lineKeyword", "modification", 
		"initialization", "initializeKeyword", "changeReturnType", "changeReturnTypeKeyword", 
		"deletion", "deleteKeyword", "implementation", "extension", "addition", 
		"additionKeyword", "argumentKeyword", "constructorKeyword", "parametersKeyword", 
		"assignment", "assignKeyword", "assignedValue", "undo", "returnStatement", 
		"methodInvocation", "methodNames", "objectKeyword", "cancel", "freespeech", 
		"stopfreespeech", "projectKeyword", "packageKeyword", "typeKeyword", "classKeyword", 
		"interfaceKeyword", "primitiveType", "variableType", "methodKeyword", 
		"ifStatementKeyword", "elseStatementKeyword", "whileLoopKeyword", "forLoopKeyword", 
		"charKeyword", "byteKeyword", "shortKeyword", "integerKeyword", "longKeyword", 
		"booleanKeyword", "doubleKeyword", "floatKeyword", "voidKeyword", "variableName", 
		"simpleType", "accessModifier", "staticKeyword", "finalKeyword", "abstractKeyword", 
		"nameKeyword", "article", "dot", "arrayKeyword", "phrase", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'create '", "'make '", "'new '", "'select '", "'go to '", "'line '", 
		"'line'", "'initialize to'", "'change return type to '", "'delete '", 
		"'implements'", "'implement'", "'extends'", "'extend'", "'inherits from'", 
		"'inherit from'", "'add '", "'argument'", "'arguments'", "'constructor'", 
		"'parameters '", "'parameter '", "'assign'", "'assigned'", "'to'", "'undo last'", 
		"'return '", "'on'", "'an'", "'object '", "'objects '", "'cancel'", "'enter free speech'", 
		"'exit free speech'", "'project'", "'projects'", "'package'", "'class '", 
		"'class'", "'interface'", "'method'", "'methods'", "'function'", "'functions'", 
		"'if'", "'else'", "'while loop '", "'for loop '", "'char'", "'byte'", 
		"'short'", "'int'", "'integer'", "'long'", "'boolean'", "'bool'", "'double'", 
		"'float'", "'floats'", "'void'", "'public '", "'private '", "'protected '", 
		"'static '", "'final '", "'abstract '", "'name it '", "'name '", "'names '", 
		"'named '", "'call it '", "'called '", "'a '", "'an '", "'the '", "'.'", 
		"'dot'", "'call'", "'array of '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
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
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(136);
				creation();
				}
				break;
			case 2:
				{
				setState(137);
				selection();
				}
				break;
			case 3:
				{
				setState(138);
				navigation();
				}
				break;
			case 4:
				{
				setState(139);
				modification();
				}
				break;
			case 5:
				{
				setState(140);
				methodInvocation();
				}
				break;
			case 6:
				{
				setState(141);
				cancel();
				}
				break;
			case 7:
				{
				setState(142);
				stopfreespeech();
				}
				break;
			case 8:
				{
				setState(143);
				freespeech();
				}
				break;
			case 9:
				{
				setState(144);
				phrase();
				}
				break;
			}
			setState(147);
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
		enterRule(_localctx, 2, RULE_creation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(149);
					creationVerb();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(158);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__60:
					case T__61:
					case T__62:
						{
						setState(154);
						accessModifier();
						}
						break;
					case T__63:
						{
						setState(155);
						staticKeyword();
						}
						break;
					case T__64:
						{
						setState(156);
						finalKeyword();
						}
						break;
					case T__65:
						{
						setState(157);
						abstractKeyword();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(163);
			structure();
			setState(164);
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
		enterRule(_localctx, 4, RULE_creationVerb);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(T__2);
				}
				break;
			case T__72:
			case T__73:
			case T__74:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
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
		enterRule(_localctx, 6, RULE_structure);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				projectKeyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				packageKeyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				typeKeyword();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(175);
					arrayKeyword();
					}
					break;
				}
				setState(178);
				variableType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				methodKeyword();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				ifStatementKeyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(181);
				elseStatementKeyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(182);
				whileLoopKeyword();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(183);
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
		enterRule(_localctx, 8, RULE_selection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(186);
				selectionVerb();
				}
				break;
			case T__4:
				{
				setState(187);
				navigationVerb();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
			case T__35:
				{
				setState(190);
				projectKeyword();
				}
				break;
			case T__36:
				{
				setState(191);
				packageKeyword();
				}
				break;
			case T__37:
			case T__38:
			case T__39:
				{
				setState(192);
				typeKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
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
		enterRule(_localctx, 10, RULE_selectionVerb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		enterRule(_localctx, 12, RULE_navigation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 14, RULE_lineNavigation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			navigationVerb();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(202);
				lineKeyword();
				}
				break;
			}
			setState(205);
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
		enterRule(_localctx, 16, RULE_navigationVerb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 18, RULE_lineKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		enterRule(_localctx, 20, RULE_modification);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				initialization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				changeReturnType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				deletion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				implementation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				extension();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				addition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(217);
				assignment();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(218);
				undo();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(219);
				returnStatement();
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
		enterRule(_localctx, 22, RULE_initialization);
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
		enterRule(_localctx, 24, RULE_initializeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 26, RULE_changeReturnType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			changeReturnTypeKeyword();
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(228);
				primitiveType();
				}
				break;
			case 2:
				{
				setState(229);
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
		enterRule(_localctx, 28, RULE_changeReturnTypeKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 30, RULE_deletion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			deleteKeyword();
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(245);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__37:
				case T__38:
				case T__39:
					{
					setState(235);
					typeKeyword();
					}
					break;
				case T__36:
					{
					setState(236);
					packageKeyword();
					}
					break;
				case T__34:
				case T__35:
					{
					setState(237);
					projectKeyword();
					}
					break;
				case T__5:
				case T__6:
					{
					setState(238);
					lineKeyword();
					}
					break;
				case T__17:
				case T__18:
				case T__20:
				case T__21:
				case T__72:
				case T__73:
				case T__74:
					{
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(239);
						parametersKeyword();
						}
						break;
					case 2:
						{
						setState(240);
						argumentKeyword();
						}
						break;
					}
					setState(243);
					number();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 32, RULE_deleteKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 34, RULE_implementation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(252);
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
		enterRule(_localctx, 36, RULE_extension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(255);
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
		enterRule(_localctx, 38, RULE_addition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(257);
				additionKeyword();
				}
			}

			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(260);
				constructorKeyword();
				}
				break;
			case 2:
				{
				{
				setState(261);
				parametersKeyword();
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(262);
					arrayKeyword();
					}
					break;
				}
				setState(265);
				variableType();
				setState(266);
				variableName();
				}
				}
				break;
			case 3:
				{
				{
				setState(268);
				argumentKeyword();
				setState(269);
				variableName();
				}
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
		enterRule(_localctx, 40, RULE_additionKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 42, RULE_argumentKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)))) != 0)) {
				{
				setState(275);
				article();
				}
			}

			setState(278);
			_la = _input.LA(1);
			if ( !(_la==T__17 || _la==T__18) ) {
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
		enterRule(_localctx, 44, RULE_constructorKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
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
		public ArticleContext article() {
			return getRuleContext(ArticleContext.class,0);
		}
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
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)))) != 0)) {
				{
				setState(282);
				article();
				}
			}

			setState(285);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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
		enterRule(_localctx, 48, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			variableName();
			setState(288);
			assignKeyword();
			setState(289);
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
		enterRule(_localctx, 50, RULE_assignKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(292);
				match(T__24);
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
		enterRule(_localctx, 52, RULE_assignedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
		enterRule(_localctx, 54, RULE_undo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__26);
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
		enterRule(_localctx, 58, RULE_methodInvocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27 || _la==T__28) {
				{
				setState(302);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__28) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(305);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(303);
					typeKeyword();
					}
					break;
				case 2:
					{
					setState(304);
					objectKeyword();
					}
					break;
				}
				setState(307);
				variableName();
				}
			}

			setState(310);
			match(INVOKE);
			setState(311);
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
		enterRule(_localctx, 60, RULE_methodNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(313);
				phrase();
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(314);
					dot();
					}
					break;
				}
				}
				}
				setState(319); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (INVOKE - 64)) | (1L << (ARRAY - 64)) | (1L << (ID - 64)) | (1L << (WHITE_SPACES - 64)) | (1L << (SPECIAL_SIGNS - 64)) | (1L << (INTEGER - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_objectKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
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
		enterRule(_localctx, 64, RULE_cancel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
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
		enterRule(_localctx, 66, RULE_freespeech);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
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
		enterRule(_localctx, 68, RULE_stopfreespeech);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		enterRule(_localctx, 70, RULE_projectKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(_la==T__34 || _la==T__35) ) {
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
		enterRule(_localctx, 72, RULE_packageKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__36);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 74, RULE_typeKeyword);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				classKeyword();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
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
		enterRule(_localctx, 76, RULE_classKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__38) ) {
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
		enterRule(_localctx, 78, RULE_interfaceKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
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
		enterRule(_localctx, 80, RULE_primitiveType);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__48:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				charKeyword();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				byteKeyword();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				shortKeyword();
				}
				break;
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				integerKeyword();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				longKeyword();
				}
				break;
			case T__54:
			case T__55:
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				booleanKeyword();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				doubleKeyword();
				}
				break;
			case T__57:
			case T__58:
				enterOuterAlt(_localctx, 8);
				{
				setState(348);
				floatKeyword();
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 9);
				{
				setState(349);
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
		enterRule(_localctx, 82, RULE_variableType);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				simpleType();
				setState(354);
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
		enterRule(_localctx, 84, RULE_methodKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
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
		enterRule(_localctx, 86, RULE_ifStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__44);
			setState(361);
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
		enterRule(_localctx, 88, RULE_elseStatementKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(T__45);
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(364);
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
		enterRule(_localctx, 90, RULE_whileLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
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
		enterRule(_localctx, 92, RULE_forLoopKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(T__47);
			}
		}
		catch (RecognitionException re) {
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
			setState(371);
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
			setState(373);
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
			setState(375);
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
			setState(377);
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
			setState(379);
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
			setState(381);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__55) ) {
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
			setState(383);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==T__57 || _la==T__58) ) {
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
		enterRule(_localctx, 110, RULE_voidKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 112, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
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
		enterRule(_localctx, 114, RULE_simpleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
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
		enterRule(_localctx, 116, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__60) | (1L << T__61) | (1L << T__62))) != 0)) ) {
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
		enterRule(_localctx, 118, RULE_staticKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
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
		enterRule(_localctx, 120, RULE_finalKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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
		enterRule(_localctx, 122, RULE_abstractKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
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
		enterRule(_localctx, 124, RULE_nameKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T__66 - 67)) | (1L << (T__67 - 67)) | (1L << (T__68 - 67)) | (1L << (T__69 - 67)) | (1L << (T__70 - 67)) | (1L << (T__71 - 67)))) != 0)) ) {
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
		enterRule(_localctx, 126, RULE_article);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)))) != 0)) ) {
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
		enterRule(_localctx, 128, RULE_dot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__76) ) {
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
		enterRule(_localctx, 130, RULE_arrayKeyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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
		enterRule(_localctx, 132, RULE_phrase);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(411); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(409);
						match(ID);
						}
						break;
					case 2:
						{
						setState(410);
						matchWildcard();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(413); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 134, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3U\u01a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2\u0094\n\2\3\2\3\2\3\3\6\3\u0099\n\3\r\3\16\3\u009a"+
		"\3\3\3\3\3\3\3\3\7\3\u00a1\n\3\f\3\16\3\u00a4\13\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\5\4\u00ad\n\4\3\5\3\5\3\5\3\5\5\5\u00b3\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u00bb\n\5\3\6\3\6\5\6\u00bf\n\6\3\6\3\6\3\6\5\6\u00c4\n\6\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u00ce\n\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00df\n\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\5\17\u00e9\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00f4\n\21\3\21\3\21\6\21\u00f8\n\21\r\21\16\21\u00f9"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\5\25\u0105\n\25\3\25\3\25"+
		"\3\25\5\25\u010a\n\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0112\n\25\3"+
		"\26\3\26\3\27\5\27\u0117\n\27\3\27\3\27\3\30\3\30\3\31\5\31\u011e\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u0128\n\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\5\37\u0134\n\37\3\37\5\37\u0137\n"+
		"\37\3\37\3\37\3\37\3 \3 \5 \u013e\n \6 \u0140\n \r \16 \u0141\3!\3!\3"+
		"\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u0152\n\'\3(\3(\3)\3)\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u0161\n*\3+\3+\3+\3+\5+\u0167\n+\3,\3,\3-\3"+
		"-\3-\3.\3.\5.\u0170\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\6D\u019e\nD\rD\16D\u019f"+
		"\3E\3E\3E\4\u00a2\u019f\2F\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\2\24\3\2\b\t\3\2\r\16\3\2\17\22\3\2\24\25\3\2\27\30\3\2\31"+
		"\32\3\2\36\37\3\2 !\3\2%&\3\2()\3\2+.\3\2\66\67\3\29:\3\2<=\3\2?A\3\2"+
		"EJ\3\2KM\3\2NO\2\u01a4\2\u0093\3\2\2\2\4\u0098\3\2\2\2\6\u00ac\3\2\2\2"+
		"\b\u00ba\3\2\2\2\n\u00be\3\2\2\2\f\u00c7\3\2\2\2\16\u00c9\3\2\2\2\20\u00cb"+
		"\3\2\2\2\22\u00d1\3\2\2\2\24\u00d3\3\2\2\2\26\u00de\3\2\2\2\30\u00e0\3"+
		"\2\2\2\32\u00e3\3\2\2\2\34\u00e5\3\2\2\2\36\u00ea\3\2\2\2 \u00ec\3\2\2"+
		"\2\"\u00fb\3\2\2\2$\u00fd\3\2\2\2&\u0100\3\2\2\2(\u0104\3\2\2\2*\u0113"+
		"\3\2\2\2,\u0116\3\2\2\2.\u011a\3\2\2\2\60\u011d\3\2\2\2\62\u0121\3\2\2"+
		"\2\64\u0125\3\2\2\2\66\u0129\3\2\2\28\u012b\3\2\2\2:\u012d\3\2\2\2<\u0136"+
		"\3\2\2\2>\u013f\3\2\2\2@\u0143\3\2\2\2B\u0145\3\2\2\2D\u0147\3\2\2\2F"+
		"\u0149\3\2\2\2H\u014b\3\2\2\2J\u014d\3\2\2\2L\u0151\3\2\2\2N\u0153\3\2"+
		"\2\2P\u0155\3\2\2\2R\u0160\3\2\2\2T\u0166\3\2\2\2V\u0168\3\2\2\2X\u016a"+
		"\3\2\2\2Z\u016d\3\2\2\2\\\u0171\3\2\2\2^\u0173\3\2\2\2`\u0175\3\2\2\2"+
		"b\u0177\3\2\2\2d\u0179\3\2\2\2f\u017b\3\2\2\2h\u017d\3\2\2\2j\u017f\3"+
		"\2\2\2l\u0181\3\2\2\2n\u0183\3\2\2\2p\u0185\3\2\2\2r\u0187\3\2\2\2t\u0189"+
		"\3\2\2\2v\u018b\3\2\2\2x\u018d\3\2\2\2z\u018f\3\2\2\2|\u0191\3\2\2\2~"+
		"\u0193\3\2\2\2\u0080\u0195\3\2\2\2\u0082\u0197\3\2\2\2\u0084\u0199\3\2"+
		"\2\2\u0086\u019d\3\2\2\2\u0088\u01a1\3\2\2\2\u008a\u0094\5\4\3\2\u008b"+
		"\u0094\5\n\6\2\u008c\u0094\5\16\b\2\u008d\u0094\5\26\f\2\u008e\u0094\5"+
		"<\37\2\u008f\u0094\5B\"\2\u0090\u0094\5F$\2\u0091\u0094\5D#\2\u0092\u0094"+
		"\5\u0086D\2\u0093\u008a\3\2\2\2\u0093\u008b\3\2\2\2\u0093\u008c\3\2\2"+
		"\2\u0093\u008d\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0090"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0096\7\2\2\3\u0096\3\3\2\2\2\u0097\u0099\5\6\4\2\u0098\u0097\3\2\2\2"+
		"\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a2"+
		"\3\2\2\2\u009c\u00a1\5v<\2\u009d\u00a1\5x=\2\u009e\u00a1\5z>\2\u009f\u00a1"+
		"\5|?\2\u00a0\u009c\3\2\2\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5\b\5\2\u00a6"+
		"\u00a7\5\u0086D\2\u00a7\5\3\2\2\2\u00a8\u00ad\7\3\2\2\u00a9\u00ad\7\4"+
		"\2\2\u00aa\u00ad\7\5\2\2\u00ab\u00ad\5\u0080A\2\u00ac\u00a8\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\7\3\2\2\2"+
		"\u00ae\u00bb\5H%\2\u00af\u00bb\5J&\2\u00b0\u00bb\5L\'\2\u00b1\u00b3\5"+
		"\u0084C\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00bb\5T+\2\u00b5\u00bb\5V,\2\u00b6\u00bb\5X-\2\u00b7\u00bb\5Z"+
		".\2\u00b8\u00bb\5\\/\2\u00b9\u00bb\5^\60\2\u00ba\u00ae\3\2\2\2\u00ba\u00af"+
		"\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\t\3\2\2\2\u00bc\u00bf\5\f\7\2\u00bd\u00bf\5\22\n\2\u00be\u00bc"+
		"\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c4\5H%\2\u00c1"+
		"\u00c4\5J&\2\u00c2\u00c4\5L\'\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2"+
		"\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\5\u0086D\2\u00c6"+
		"\13\3\2\2\2\u00c7\u00c8\7\6\2\2\u00c8\r\3\2\2\2\u00c9\u00ca\5\20\t\2\u00ca"+
		"\17\3\2\2\2\u00cb\u00cd\5\22\n\2\u00cc\u00ce\5\24\13\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5\u0086D\2\u00d0"+
		"\21\3\2\2\2\u00d1\u00d2\7\7\2\2\u00d2\23\3\2\2\2\u00d3\u00d4\t\2\2\2\u00d4"+
		"\25\3\2\2\2\u00d5\u00df\5\30\r\2\u00d6\u00df\5\34\17\2\u00d7\u00df\5 "+
		"\21\2\u00d8\u00df\5$\23\2\u00d9\u00df\5&\24\2\u00da\u00df\5(\25\2\u00db"+
		"\u00df\5\62\32\2\u00dc\u00df\58\35\2\u00dd\u00df\5:\36\2\u00de\u00d5\3"+
		"\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00d7\3\2\2\2\u00de\u00d8\3\2\2\2\u00de"+
		"\u00d9\3\2\2\2\u00de\u00da\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df\27\3\2\2\2\u00e0\u00e1\5\32\16\2\u00e1"+
		"\u00e2\5\u0086D\2\u00e2\31\3\2\2\2\u00e3\u00e4\7\n\2\2\u00e4\33\3\2\2"+
		"\2\u00e5\u00e8\5\36\20\2\u00e6\u00e9\5R*\2\u00e7\u00e9\5t;\2\u00e8\u00e6"+
		"\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\35\3\2\2\2\u00ea\u00eb\7\13\2\2\u00eb"+
		"\37\3\2\2\2\u00ec\u00f7\5\"\22\2\u00ed\u00f8\5L\'\2\u00ee\u00f8\5J&\2"+
		"\u00ef\u00f8\5H%\2\u00f0\u00f8\5\24\13\2\u00f1\u00f4\5\60\31\2\u00f2\u00f4"+
		"\5,\27\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\5\u0088E\2\u00f6\u00f8\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00ee"+
		"\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f0\3\2\2\2\u00f7\u00f3\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa!\3\2\2\2"+
		"\u00fb\u00fc\7\f\2\2\u00fc#\3\2\2\2\u00fd\u00fe\t\3\2\2\u00fe\u00ff\5"+
		"\u0086D\2\u00ff%\3\2\2\2\u0100\u0101\t\4\2\2\u0101\u0102\5\u0086D\2\u0102"+
		"\'\3\2\2\2\u0103\u0105\5*\26\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2"+
		"\u0105\u0111\3\2\2\2\u0106\u0112\5.\30\2\u0107\u0109\5\60\31\2\u0108\u010a"+
		"\5\u0084C\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2"+
		"\2\u010b\u010c\5T+\2\u010c\u010d\5r:\2\u010d\u0112\3\2\2\2\u010e\u010f"+
		"\5,\27\2\u010f\u0110\5r:\2\u0110\u0112\3\2\2\2\u0111\u0106\3\2\2\2\u0111"+
		"\u0107\3\2\2\2\u0111\u010e\3\2\2\2\u0112)\3\2\2\2\u0113\u0114\7\23\2\2"+
		"\u0114+\3\2\2\2\u0115\u0117\5\u0080A\2\u0116\u0115\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\t\5\2\2\u0119-\3\2\2\2\u011a"+
		"\u011b\7\26\2\2\u011b/\3\2\2\2\u011c\u011e\5\u0080A\2\u011d\u011c\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\t\6\2\2\u0120"+
		"\61\3\2\2\2\u0121\u0122\5r:\2\u0122\u0123\5\64\33\2\u0123\u0124\5\66\34"+
		"\2\u0124\63\3\2\2\2\u0125\u0127\t\7\2\2\u0126\u0128\7\33\2\2\u0127\u0126"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\65\3\2\2\2\u0129\u012a\5\u0086D\2\u012a"+
		"\67\3\2\2\2\u012b\u012c\7\34\2\2\u012c9\3\2\2\2\u012d\u012e\7\35\2\2\u012e"+
		"\u012f\5\u0086D\2\u012f;\3\2\2\2\u0130\u0133\t\b\2\2\u0131\u0134\5L\'"+
		"\2\u0132\u0134\5@!\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0133\u0134"+
		"\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\5r:\2\u0136\u0130\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7P\2\2\u0139\u013a\5> "+
		"\2\u013a=\3\2\2\2\u013b\u013d\5\u0086D\2\u013c\u013e\5\u0082B\2\u013d"+
		"\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u013b\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"?\3\2\2\2\u0143\u0144\t\t\2\2\u0144A\3\2\2\2\u0145\u0146\7\"\2\2\u0146"+
		"C\3\2\2\2\u0147\u0148\7#\2\2\u0148E\3\2\2\2\u0149\u014a\7$\2\2\u014aG"+
		"\3\2\2\2\u014b\u014c\t\n\2\2\u014cI\3\2\2\2\u014d\u014e\7\'\2\2\u014e"+
		"K\3\2\2\2\u014f\u0152\5N(\2\u0150\u0152\5P)\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0150\3\2\2\2\u0152M\3\2\2\2\u0153\u0154\t\13\2\2\u0154O\3\2\2\2\u0155"+
		"\u0156\7*\2\2\u0156Q\3\2\2\2\u0157\u0161\5`\61\2\u0158\u0161\5b\62\2\u0159"+
		"\u0161\5d\63\2\u015a\u0161\5f\64\2\u015b\u0161\5h\65\2\u015c\u0161\5j"+
		"\66\2\u015d\u0161\5l\67\2\u015e\u0161\5n8\2\u015f\u0161\5p9\2\u0160\u0157"+
		"\3\2\2\2\u0160\u0158\3\2\2\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160"+
		"\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u015f\3\2\2\2\u0161S\3\2\2\2\u0162\u0167\5R*\2\u0163\u0164"+
		"\5t;\2\u0164\u0165\5~@\2\u0165\u0167\3\2\2\2\u0166\u0162\3\2\2\2\u0166"+
		"\u0163\3\2\2\2\u0167U\3\2\2\2\u0168\u0169\t\f\2\2\u0169W\3\2\2\2\u016a"+
		"\u016b\7/\2\2\u016b\u016c\5\u0086D\2\u016cY\3\2\2\2\u016d\u016f\7\60\2"+
		"\2\u016e\u0170\5\u0086D\2\u016f\u016e\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"[\3\2\2\2\u0171\u0172\7\61\2\2\u0172]\3\2\2\2\u0173\u0174\7\62\2\2\u0174"+
		"_\3\2\2\2\u0175\u0176\7\63\2\2\u0176a\3\2\2\2\u0177\u0178\7\64\2\2\u0178"+
		"c\3\2\2\2\u0179\u017a\7\65\2\2\u017ae\3\2\2\2\u017b\u017c\t\r\2\2\u017c"+
		"g\3\2\2\2\u017d\u017e\78\2\2\u017ei\3\2\2\2\u017f\u0180\t\16\2\2\u0180"+
		"k\3\2\2\2\u0181\u0182\7;\2\2\u0182m\3\2\2\2\u0183\u0184\t\17\2\2\u0184"+
		"o\3\2\2\2\u0185\u0186\7>\2\2\u0186q\3\2\2\2\u0187\u0188\5\u0086D\2\u0188"+
		"s\3\2\2\2\u0189\u018a\5\u0086D\2\u018au\3\2\2\2\u018b\u018c\t\20\2\2\u018c"+
		"w\3\2\2\2\u018d\u018e\7B\2\2\u018ey\3\2\2\2\u018f\u0190\7C\2\2\u0190{"+
		"\3\2\2\2\u0191\u0192\7D\2\2\u0192}\3\2\2\2\u0193\u0194\t\21\2\2\u0194"+
		"\177\3\2\2\2\u0195\u0196\t\22\2\2\u0196\u0081\3\2\2\2\u0197\u0198\t\23"+
		"\2\2\u0198\u0083\3\2\2\2\u0199\u019a\7Q\2\2\u019a\u0085\3\2\2\2\u019b"+
		"\u019e\7R\2\2\u019c\u019e\13\2\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2"+
		"\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u0087\3\2\2\2\u01a1\u01a2\7U\2\2\u01a2\u0089\3\2\2\2!\u0093\u009a\u00a0"+
		"\u00a2\u00ac\u00b2\u00ba\u00be\u00c3\u00cd\u00de\u00e8\u00f3\u00f7\u00f9"+
		"\u0104\u0109\u0111\u0116\u011d\u0127\u0133\u0136\u013d\u0141\u0151\u0160"+
		"\u0166\u016f\u019d\u019f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}