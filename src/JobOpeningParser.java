// Generated from C:/Users/mike_/OneDrive/Documentos/RestaurantesManagement/Lprog24/JobOpening.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JobOpeningParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ID=18, STRING=19, INTEIRO=20, WS=21;
	public static final int
		RULE_jobOpening = 0, RULE_jobRef = 1, RULE_title = 2, RULE_contractType = 3, 
		RULE_modes = 4, RULE_address = 5, RULE_company = 6, RULE_vacancies = 7, 
		RULE_description = 8, RULE_requirements = 9, RULE_requirementSpec = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"jobOpening", "jobRef", "title", "contractType", "modes", "address", 
			"company", "vacancies", "description", "requirements", "requirementSpec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'JobRef:'", "'Title:'", "'ContractType:'", "'full-time'", "'part-time'", 
			"'contract'", "'temporary'", "'Mode:'", "'remote'", "'hybrid'", "'onsite'", 
			"'Address:'", "'Company:'", "'Vacancies:'", "'Description:'", "'Requirements:'", 
			"'ReqSpec:'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "STRING", "INTEIRO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "JobOpening.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JobOpeningParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JobOpeningContext extends ParserRuleContext {
		public JobRefContext jobRef() {
			return getRuleContext(JobRefContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public ContractTypeContext contractType() {
			return getRuleContext(ContractTypeContext.class,0);
		}
		public ModesContext modes() {
			return getRuleContext(ModesContext.class,0);
		}
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public CompanyContext company() {
			return getRuleContext(CompanyContext.class,0);
		}
		public VacanciesContext vacancies() {
			return getRuleContext(VacanciesContext.class,0);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public RequirementsContext requirements() {
			return getRuleContext(RequirementsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JobOpeningParser.EOF, 0); }
		public JobOpeningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobOpening; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterJobOpening(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitJobOpening(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitJobOpening(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobOpeningContext jobOpening() throws RecognitionException {
		JobOpeningContext _localctx = new JobOpeningContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_jobOpening);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			jobRef();
			setState(23);
			title();
			setState(24);
			contractType();
			setState(25);
			modes();
			setState(26);
			address();
			setState(27);
			company();
			setState(28);
			vacancies();
			setState(29);
			description();
			setState(30);
			requirements();
			setState(31);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JobRefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JobOpeningParser.ID, 0); }
		public JobRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterJobRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitJobRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitJobRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobRefContext jobRef() throws RecognitionException {
		JobRefContext _localctx = new JobRefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jobRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JobOpeningParser.STRING, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__1);
			setState(37);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContractTypeContext extends ParserRuleContext {
		public ContractTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contractType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterContractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitContractType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitContractType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContractTypeContext contractType() throws RecognitionException {
		ContractTypeContext _localctx = new ContractTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_contractType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__2);
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModesContext extends ParserRuleContext {
		public ModesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterModes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitModes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitModes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModesContext modes() throws RecognitionException {
		ModesContext _localctx = new ModesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__7);
			setState(43);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddressContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JobOpeningParser.STRING, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_address);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__11);
			setState(46);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompanyContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JobOpeningParser.STRING, 0); }
		public CompanyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_company; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterCompany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitCompany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitCompany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompanyContext company() throws RecognitionException {
		CompanyContext _localctx = new CompanyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_company);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__12);
			setState(49);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VacanciesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JobOpeningParser.ID, 0); }
		public VacanciesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacancies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterVacancies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitVacancies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitVacancies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VacanciesContext vacancies() throws RecognitionException {
		VacanciesContext _localctx = new VacanciesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_vacancies);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__13);
			setState(52);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JobOpeningParser.STRING, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__14);
			setState(55);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementsContext extends ParserRuleContext {
		public List<RequirementSpecContext> requirementSpec() {
			return getRuleContexts(RequirementSpecContext.class);
		}
		public RequirementSpecContext requirementSpec(int i) {
			return getRuleContext(RequirementSpecContext.class,i);
		}
		public RequirementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterRequirements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitRequirements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitRequirements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementsContext requirements() throws RecognitionException {
		RequirementsContext _localctx = new RequirementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_requirements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__15);
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				requirementSpec();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__16 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequirementSpecContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(JobOpeningParser.STRING, 0); }
		public RequirementSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).enterRequirementSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JobOpeningListener ) ((JobOpeningListener)listener).exitRequirementSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JobOpeningVisitor ) return ((JobOpeningVisitor<? extends T>)visitor).visitRequirementSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequirementSpecContext requirementSpec() throws RecognitionException {
		RequirementSpecContext _localctx = new RequirementSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_requirementSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__16);
			setState(64);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
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
		"\u0004\u0001\u0015C\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\t<\b\t\u000b\t\f\t=\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0002\u0001\u0000\u0004\u0007\u0001\u0000\t\u000b"+
		"8\u0000\u0016\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004"+
		"$\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b*\u0001\u0000"+
		"\u0000\u0000\n-\u0001\u0000\u0000\u0000\f0\u0001\u0000\u0000\u0000\u000e"+
		"3\u0001\u0000\u0000\u0000\u00106\u0001\u0000\u0000\u0000\u00129\u0001"+
		"\u0000\u0000\u0000\u0014?\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002"+
		"\u0001\u0000\u0017\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0003\u0006"+
		"\u0003\u0000\u0019\u001a\u0003\b\u0004\u0000\u001a\u001b\u0003\n\u0005"+
		"\u0000\u001b\u001c\u0003\f\u0006\u0000\u001c\u001d\u0003\u000e\u0007\u0000"+
		"\u001d\u001e\u0003\u0010\b\u0000\u001e\u001f\u0003\u0012\t\u0000\u001f"+
		" \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!\"\u0005\u0001"+
		"\u0000\u0000\"#\u0005\u0012\u0000\u0000#\u0003\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0002\u0000\u0000%&\u0005\u0013\u0000\u0000&\u0005\u0001\u0000"+
		"\u0000\u0000\'(\u0005\u0003\u0000\u0000()\u0007\u0000\u0000\u0000)\u0007"+
		"\u0001\u0000\u0000\u0000*+\u0005\b\u0000\u0000+,\u0007\u0001\u0000\u0000"+
		",\t\u0001\u0000\u0000\u0000-.\u0005\f\u0000\u0000./\u0005\u0013\u0000"+
		"\u0000/\u000b\u0001\u0000\u0000\u000001\u0005\r\u0000\u000012\u0005\u0013"+
		"\u0000\u00002\r\u0001\u0000\u0000\u000034\u0005\u000e\u0000\u000045\u0005"+
		"\u0012\u0000\u00005\u000f\u0001\u0000\u0000\u000067\u0005\u000f\u0000"+
		"\u000078\u0005\u0013\u0000\u00008\u0011\u0001\u0000\u0000\u00009;\u0005"+
		"\u0010\u0000\u0000:<\u0003\u0014\n\u0000;:\u0001\u0000\u0000\u0000<=\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000"+
		">\u0013\u0001\u0000\u0000\u0000?@\u0005\u0011\u0000\u0000@A\u0005\u0013"+
		"\u0000\u0000A\u0015\u0001\u0000\u0000\u0000\u0001=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}