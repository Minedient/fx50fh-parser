// Generated from fx50.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fx50Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, LET=9, 
		SHOW=10, NEXT=11, ASK=12, PAR=13, VAR=14, CONSTANT=15, NUM=16, ADD=17, 
		SUB=18, MUL=19, DIV=20, EXP=21, ROOT=22, BINCON=23, IF=24, THEN=25, ELSE=26, 
		IFEND=27;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_let = 2, RULE_show = 3, RULE_cal = 4, 
		RULE_ask = 5, RULE_ifexpr = 6, RULE_thenExpr = 7, RULE_elseExpr = 8, RULE_expr = 9, 
		RULE_logicExpr = 10, RULE_logicExprFunc = 11, RULE_noopmul = 12, RULE_value = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "let", "show", "cal", "ask", "ifexpr", "thenExpr", 
			"elseExpr", "expr", "logicExpr", "logicExprFunc", "noopmul", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'/='", "'>'", "'>='", "'<'", "'<='", "'->'", 
			"'/|'", "':'", "'?'", null, null, null, null, "'+'", "'-'", "'*'", "'/'", 
			"'^'", "'/-('", null, "'If'", "'Then'", "'Else'", "'IfEnd'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "LET", "SHOW", 
			"NEXT", "ASK", "PAR", "VAR", "CONSTANT", "NUM", "ADD", "SUB", "MUL", 
			"DIV", "EXP", "ROOT", "BINCON", "IF", "THEN", "ELSE", "IFEND"
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
	public String getGrammarFileName() { return "fx50.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fx50Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(fx50Parser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << ASK) | (1L << VAR) | (1L << CONSTANT) | (1L << NUM) | (1L << SUB) | (1L << ROOT) | (1L << IF))) != 0)) {
				{
				{
				setState(28);
				stmt();
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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

	public static class StmtContext extends ParserRuleContext {
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public CalContext cal() {
			return getRuleContext(CalContext.class,0);
		}
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				let();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				show();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				cal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				ask();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				ifexpr();
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

	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(fx50Parser.LET, 0); }
		public TerminalNode VAR() { return getToken(fx50Parser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public LogicExprFuncContext logicExprFunc() {
			return getRuleContext(LogicExprFuncContext.class,0);
		}
		public TerminalNode NEXT() { return getToken(fx50Parser.NEXT, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_let);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(43);
				expr(0);
				}
				break;
			case 2:
				{
				setState(44);
				logicExpr();
				}
				break;
			case 3:
				{
				setState(45);
				logicExprFunc();
				}
				break;
			}
			setState(48);
			match(LET);
			setState(49);
			match(VAR);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT) {
				{
				setState(50);
				match(NEXT);
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

	public static class ShowContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(fx50Parser.SHOW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public LogicExprFuncContext logicExprFunc() {
			return getRuleContext(LogicExprFuncContext.class,0);
		}
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(53);
				expr(0);
				}
				break;
			case 2:
				{
				setState(54);
				let();
				}
				break;
			case 3:
				{
				setState(55);
				ask();
				}
				break;
			case 4:
				{
				setState(56);
				logicExpr();
				}
				break;
			case 5:
				{
				setState(57);
				logicExprFunc();
				}
				break;
			}
			setState(60);
			match(SHOW);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CalContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(fx50Parser.NEXT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public LogicExprFuncContext logicExprFunc() {
			return getRuleContext(LogicExprFuncContext.class,0);
		}
		public CalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitCal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalContext cal() throws RecognitionException {
		CalContext _localctx = new CalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(62);
				expr(0);
				}
				break;
			case 2:
				{
				setState(63);
				logicExpr();
				}
				break;
			case 3:
				{
				setState(64);
				logicExprFunc();
				}
				break;
			}
			setState(67);
			match(NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AskContext extends ParserRuleContext {
		public TerminalNode ASK() { return getToken(fx50Parser.ASK, 0); }
		public TerminalNode LET() { return getToken(fx50Parser.LET, 0); }
		public TerminalNode VAR() { return getToken(fx50Parser.VAR, 0); }
		public TerminalNode NEXT() { return getToken(fx50Parser.NEXT, 0); }
		public AskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ask; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitAsk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AskContext ask() throws RecognitionException {
		AskContext _localctx = new AskContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ask);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(ASK);
			setState(70);
			match(LET);
			setState(71);
			match(VAR);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEXT) {
				{
				setState(72);
				match(NEXT);
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

	public static class IfexprContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(fx50Parser.IF, 0); }
		public List<TerminalNode> NEXT() { return getTokens(fx50Parser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(fx50Parser.NEXT, i);
		}
		public ThenExprContext thenExpr() {
			return getRuleContext(ThenExprContext.class,0);
		}
		public TerminalNode IFEND() { return getToken(fx50Parser.IFEND, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElseExprContext elseExpr() {
			return getRuleContext(ElseExprContext.class,0);
		}
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(IF);
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(76);
				logicExpr();
				}
				break;
			case 2:
				{
				setState(77);
				expr(0);
				}
				break;
			}
			setState(80);
			match(NEXT);
			setState(81);
			thenExpr();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(82);
				elseExpr();
				}
			}

			setState(85);
			match(IFEND);
			setState(86);
			match(NEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThenExprContext extends ParserRuleContext {
		public TerminalNode THEN() { return getToken(fx50Parser.THEN, 0); }
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public CalContext cal() {
			return getRuleContext(CalContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ThenExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitThenExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenExprContext thenExpr() throws RecognitionException {
		ThenExprContext _localctx = new ThenExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_thenExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(THEN);
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(89);
				ask();
				}
				break;
			case 2:
				{
				setState(90);
				cal();
				}
				break;
			case 3:
				{
				setState(91);
				show();
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

	public static class ElseExprContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(fx50Parser.ELSE, 0); }
		public AskContext ask() {
			return getRuleContext(AskContext.class,0);
		}
		public CalContext cal() {
			return getRuleContext(CalContext.class,0);
		}
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ElseExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitElseExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseExprContext elseExpr() throws RecognitionException {
		ElseExprContext _localctx = new ElseExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ELSE);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(95);
				ask();
				}
				break;
			case 2:
				{
				setState(96);
				cal();
				}
				break;
			case 3:
				{
				setState(97);
				show();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends ExprContext {
		public ExprContext par;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitParExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EXP() { return getToken(fx50Parser.EXP, 0); }
		public TerminalNode MUL() { return getToken(fx50Parser.MUL, 0); }
		public TerminalNode DIV() { return getToken(fx50Parser.DIV, 0); }
		public TerminalNode ADD() { return getToken(fx50Parser.ADD, 0); }
		public TerminalNode SUB() { return getToken(fx50Parser.SUB, 0); }
		public OpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegExprContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(fx50Parser.SUB, 0); }
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitNegExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RootContext extends ExprContext {
		public Token op;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ROOT() { return getToken(fx50Parser.ROOT, 0); }
		public RootContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoopExprContext extends ExprContext {
		public NoopmulContext noopmul() {
			return getRuleContext(NoopmulContext.class,0);
		}
		public NoopExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitNoopExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValExprContext extends ExprContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitValExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(101);
				match(T__0);
				setState(102);
				((ParExprContext)_localctx).par = expr(0);
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(103);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				((NegExprContext)_localctx).op = match(SUB);
				setState(107);
				expr(6);
				}
				break;
			case 3:
				{
				_localctx = new NoopExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				noopmul();
				}
				break;
			case 4:
				{
				_localctx = new RootContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				((RootContext)_localctx).op = match(ROOT);
				setState(110);
				expr(0);
				setState(112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(111);
					match(T__1);
					}
					break;
				}
				}
				break;
			case 5:
				{
				_localctx = new ValExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(118);
						((OpExprContext)_localctx).op = match(EXP);
						setState(119);
						((OpExprContext)_localctx).right = expr(8);
						}
						break;
					case 2:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(121);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						((OpExprContext)_localctx).right = expr(6);
						}
						break;
					case 3:
						{
						_localctx = new OpExprContext(new ExprContext(_parentctx, _parentState));
						((OpExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(124);
						((OpExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((OpExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						((OpExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class LogicExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((LogicExprContext)_localctx).left = expr(0);
			setState(132);
			((LogicExprContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				((LogicExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			((LogicExprContext)_localctx).right = expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicExprFuncContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public LogicExprFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExprFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitLogicExprFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprFuncContext logicExprFunc() throws RecognitionException {
		LogicExprFuncContext _localctx = new LogicExprFuncContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicExprFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			expr(0);
			setState(136);
			match(T__0);
			setState(137);
			logicExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NoopmulContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public NoopmulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noopmul; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitNoopmul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoopmulContext noopmul() throws RecognitionException {
		NoopmulContext _localctx = new NoopmulContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_noopmul);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			value();
			setState(142); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(140);
						value();
						}
						break;
					case 2:
						{
						setState(141);
						expr(0);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(144); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(fx50Parser.NUM, 0); }
		public TerminalNode VAR() { return getToken(fx50Parser.VAR, 0); }
		public TerminalNode CONSTANT() { return getToken(fx50Parser.CONSTANT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof fx50Visitor ) return ((fx50Visitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << CONSTANT) | (1L << NUM))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0097\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\5\4\61\n\4\3\4\3\4\3"+
		"\4\5\4\66\n\4\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\5\3\5\3\6\3\6\3\6\5\6D\n"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\5\bQ\n\b\3\b\3\b\3\b\5"+
		"\bV\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t_\n\t\3\n\3\n\3\n\3\n\5\ne\n\n"+
		"\3\13\3\13\3\13\3\13\5\13k\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13s\n"+
		"\13\3\13\5\13v\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0081\n\13\f\13\16\13\u0084\13\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\6\16\u0091\n\16\r\16\16\16\u0092\3\17\3\17\3\17\2\3\24\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\3\2\25\26\3\2\23\24\3\2\5\n\3\2"+
		"\20\22\2\u00a8\2!\3\2\2\2\4+\3\2\2\2\6\60\3\2\2\2\b<\3\2\2\2\nC\3\2\2"+
		"\2\fG\3\2\2\2\16M\3\2\2\2\20Z\3\2\2\2\22`\3\2\2\2\24u\3\2\2\2\26\u0085"+
		"\3\2\2\2\30\u0089\3\2\2\2\32\u008d\3\2\2\2\34\u0094\3\2\2\2\36 \5\4\3"+
		"\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2"+
		"$%\7\2\2\3%\3\3\2\2\2&,\5\6\4\2\',\5\b\5\2(,\5\n\6\2),\5\f\7\2*,\5\16"+
		"\b\2+&\3\2\2\2+\'\3\2\2\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-\61"+
		"\5\24\13\2.\61\5\26\f\2/\61\5\30\r\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2"+
		"\2\61\62\3\2\2\2\62\63\7\13\2\2\63\65\7\20\2\2\64\66\7\r\2\2\65\64\3\2"+
		"\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67=\5\24\13\28=\5\6\4\29=\5\f\7\2:=\5"+
		"\26\f\2;=\5\30\r\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2"+
		"=>\3\2\2\2>?\7\f\2\2?\t\3\2\2\2@D\5\24\13\2AD\5\26\f\2BD\5\30\r\2C@\3"+
		"\2\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2EF\7\r\2\2F\13\3\2\2\2GH\7\16\2\2"+
		"HI\7\13\2\2IK\7\20\2\2JL\7\r\2\2KJ\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MP\7\32"+
		"\2\2NQ\5\26\f\2OQ\5\24\13\2PN\3\2\2\2PO\3\2\2\2QR\3\2\2\2RS\7\r\2\2SU"+
		"\5\20\t\2TV\5\22\n\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\35\2\2XY\7\r\2"+
		"\2Y\17\3\2\2\2Z^\7\33\2\2[_\5\f\7\2\\_\5\n\6\2]_\5\b\5\2^[\3\2\2\2^\\"+
		"\3\2\2\2^]\3\2\2\2_\21\3\2\2\2`d\7\34\2\2ae\5\f\7\2be\5\n\6\2ce\5\b\5"+
		"\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2e\23\3\2\2\2fg\b\13\1\2gh\7\3\2\2hj\5"+
		"\24\13\2ik\7\4\2\2ji\3\2\2\2jk\3\2\2\2kv\3\2\2\2lm\7\24\2\2mv\5\24\13"+
		"\bnv\5\32\16\2op\7\30\2\2pr\5\24\13\2qs\7\4\2\2rq\3\2\2\2rs\3\2\2\2sv"+
		"\3\2\2\2tv\5\34\17\2uf\3\2\2\2ul\3\2\2\2un\3\2\2\2uo\3\2\2\2ut\3\2\2\2"+
		"v\u0082\3\2\2\2wx\f\t\2\2xy\7\27\2\2y\u0081\5\24\13\nz{\f\7\2\2{|\t\2"+
		"\2\2|\u0081\5\24\13\b}~\f\5\2\2~\177\t\3\2\2\177\u0081\5\24\13\6\u0080"+
		"w\3\2\2\2\u0080z\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\25\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\5\24\13\2\u0086\u0087\t\4\2\2\u0087\u0088\5\24\13\2\u0088\27\3"+
		"\2\2\2\u0089\u008a\5\24\13\2\u008a\u008b\7\3\2\2\u008b\u008c\5\26\f\2"+
		"\u008c\31\3\2\2\2\u008d\u0090\5\34\17\2\u008e\u0091\5\34\17\2\u008f\u0091"+
		"\5\24\13\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\33\3\2\2\2\u0094\u0095"+
		"\t\5\2\2\u0095\35\3\2\2\2\24!+\60\65<CKPU^djru\u0080\u0082\u0090\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}