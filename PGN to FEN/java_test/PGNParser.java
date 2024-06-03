// Generated from PGN.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PGNParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, EVENT=4, SITE=5, DATE=6, ROUND=7, WHITE=8, BLACK=9, 
		RESULT=10, COLUMN_A=11, COLUMN_B=12, COLUMN_C=13, COLUMN_D=14, COLUMN_E=15, 
		COLUMN_F=16, COLUMN_G=17, COLUMN_H=18, ROW_1=19, ROW_2=20, ROW_3=21, ROW_4=22, 
		ROW_5=23, ROW_6=24, ROW_7=25, ROW_8=26, KING=27, QUEEN=28, ROOK=29, BISHOP=30, 
		KNIGHT=31, WHITE_WIN=32, BLACK_WIN=33, TIE=34, CHECK=35, MATE=36, CASTLE_KING=37, 
		CASTLE_QUEEN=38, TAKES=39, MOVE_NUMBER=40, QUOTED_DATE=41, QUOTED_RESULT=42, 
		QUOTED_STRINGS=43, WS=44;
	public static final int
		RULE_game_info = 0, RULE_info = 1, RULE_info_event = 2, RULE_info_site = 3, 
		RULE_info_date = 4, RULE_info_round = 5, RULE_info_white = 6, RULE_info_black = 7, 
		RULE_info_result = 8, RULE_column = 9, RULE_row = 10, RULE_square = 11, 
		RULE_disambiguation = 12, RULE_square_destination = 13, RULE_piece = 14, 
		RULE_promotion = 15, RULE_castle = 16, RULE_result = 17, RULE_game = 18, 
		RULE_move_text = 19, RULE_move_pair = 20, RULE_last_moves = 21, RULE_white_move = 22, 
		RULE_black_move = 23, RULE_move = 24, RULE_pawn_move = 25, RULE_check_state = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"game_info", "info", "info_event", "info_site", "info_date", "info_round", 
			"info_white", "info_black", "info_result", "column", "row", "square", 
			"disambiguation", "square_destination", "piece", "promotion", "castle", 
			"result", "game", "move_text", "move_pair", "last_moves", "white_move", 
			"black_move", "move", "pawn_move", "check_state"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'='", "'Event'", "'Site'", "'Date'", "'Round'", 
			"'White'", "'Black'", "'Result'", "'a'", "'b'", "'c'", "'d'", "'e'", 
			"'f'", "'g'", "'h'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", 
			"'8'", "'K'", "'Q'", "'R'", "'B'", "'N'", "'1-0'", "'0-1'", "'1/2-1/2'", 
			"'+'", "'#'", "'O-O'", "'O-O-O'", "'x'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EVENT", "SITE", "DATE", "ROUND", "WHITE", "BLACK", 
			"RESULT", "COLUMN_A", "COLUMN_B", "COLUMN_C", "COLUMN_D", "COLUMN_E", 
			"COLUMN_F", "COLUMN_G", "COLUMN_H", "ROW_1", "ROW_2", "ROW_3", "ROW_4", 
			"ROW_5", "ROW_6", "ROW_7", "ROW_8", "KING", "QUEEN", "ROOK", "BISHOP", 
			"KNIGHT", "WHITE_WIN", "BLACK_WIN", "TIE", "CHECK", "MATE", "CASTLE_KING", 
			"CASTLE_QUEEN", "TAKES", "MOVE_NUMBER", "QUOTED_DATE", "QUOTED_RESULT", 
			"QUOTED_STRINGS", "WS"
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
	public String getGrammarFileName() { return "PGN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PGNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Game_infoContext extends ParserRuleContext {
		public List<InfoContext> info() {
			return getRuleContexts(InfoContext.class);
		}
		public InfoContext info(int i) {
			return getRuleContext(InfoContext.class,i);
		}
		public Game_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterGame_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitGame_info(this);
		}
	}

	public final Game_infoContext game_info() throws RecognitionException {
		Game_infoContext _localctx = new Game_infoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_game_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(54);
				match(T__0);
				setState(55);
				info();
				setState(56);
				match(T__1);
				}
				}
				setState(62);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InfoContext extends ParserRuleContext {
		public Info_eventContext info_event() {
			return getRuleContext(Info_eventContext.class,0);
		}
		public Info_siteContext info_site() {
			return getRuleContext(Info_siteContext.class,0);
		}
		public Info_dateContext info_date() {
			return getRuleContext(Info_dateContext.class,0);
		}
		public Info_roundContext info_round() {
			return getRuleContext(Info_roundContext.class,0);
		}
		public Info_whiteContext info_white() {
			return getRuleContext(Info_whiteContext.class,0);
		}
		public Info_blackContext info_black() {
			return getRuleContext(Info_blackContext.class,0);
		}
		public Info_resultContext info_result() {
			return getRuleContext(Info_resultContext.class,0);
		}
		public InfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo(this);
		}
	}

	public final InfoContext info() throws RecognitionException {
		InfoContext _localctx = new InfoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_info);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				info_event();
				}
				break;
			case SITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				info_site();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				info_date();
				}
				break;
			case ROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				info_round();
				}
				break;
			case WHITE:
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				info_white();
				}
				break;
			case BLACK:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				info_black();
				}
				break;
			case RESULT:
				enterOuterAlt(_localctx, 7);
				{
				setState(69);
				info_result();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Info_eventContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(PGNParser.EVENT, 0); }
		public TerminalNode QUOTED_STRINGS() { return getToken(PGNParser.QUOTED_STRINGS, 0); }
		public Info_eventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo_event(this);
		}
	}

	public final Info_eventContext info_event() throws RecognitionException {
		Info_eventContext _localctx = new Info_eventContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_info_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(EVENT);
			setState(73);
			match(QUOTED_STRINGS);
			}
		}
		catch (RecognitionException re) {
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
	public static class Info_siteContext extends ParserRuleContext {
		public TerminalNode SITE() { return getToken(PGNParser.SITE, 0); }
		public TerminalNode QUOTED_STRINGS() { return getToken(PGNParser.QUOTED_STRINGS, 0); }
		public Info_siteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_site; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo_site(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo_site(this);
		}
	}

	public final Info_siteContext info_site() throws RecognitionException {
		Info_siteContext _localctx = new Info_siteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_info_site);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(SITE);
			setState(76);
			match(QUOTED_STRINGS);
			}
		}
		catch (RecognitionException re) {
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
	public static class Info_dateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(PGNParser.DATE, 0); }
		public TerminalNode QUOTED_DATE() { return getToken(PGNParser.QUOTED_DATE, 0); }
		public Info_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo_date(this);
		}
	}

	public final Info_dateContext info_date() throws RecognitionException {
		Info_dateContext _localctx = new Info_dateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_info_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(DATE);
			setState(79);
			match(QUOTED_DATE);
			}
		}
		catch (RecognitionException re) {
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
	public static class Info_roundContext extends ParserRuleContext {
		public TerminalNode ROUND() { return getToken(PGNParser.ROUND, 0); }
		public TerminalNode QUOTED_STRINGS() { return getToken(PGNParser.QUOTED_STRINGS, 0); }
		public Info_roundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_round; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo_round(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo_round(this);
		}
	}

	public final Info_roundContext info_round() throws RecognitionException {
		Info_roundContext _localctx = new Info_roundContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_info_round);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(ROUND);
			setState(82);
			match(QUOTED_STRINGS);
			}
		}
		catch (RecognitionException re) {
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
	public static class Info_whiteContext extends ParserRuleContext {
		public TerminalNode WHITE() { return getToken(PGNParser.WHITE, 0); }
		public TerminalNode QUOTED_STRINGS() { return getToken(PGNParser.QUOTED_STRINGS, 0); }
		public Info_whiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_white; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo_white(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo_white(this);
		}
	}

	public final Info_whiteContext info_white() throws RecognitionException {
		Info_whiteContext _localctx = new Info_whiteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_info_white);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(WHITE);
			setState(85);
			match(QUOTED_STRINGS);
			}
		}
		catch (RecognitionException re) {
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
	public static class Info_blackContext extends ParserRuleContext {
		public TerminalNode BLACK() { return getToken(PGNParser.BLACK, 0); }
		public TerminalNode QUOTED_STRINGS() { return getToken(PGNParser.QUOTED_STRINGS, 0); }
		public Info_blackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_black; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo_black(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo_black(this);
		}
	}

	public final Info_blackContext info_black() throws RecognitionException {
		Info_blackContext _localctx = new Info_blackContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_info_black);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(BLACK);
			setState(88);
			match(QUOTED_STRINGS);
			}
		}
		catch (RecognitionException re) {
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
	public static class Info_resultContext extends ParserRuleContext {
		public TerminalNode RESULT() { return getToken(PGNParser.RESULT, 0); }
		public TerminalNode QUOTED_RESULT() { return getToken(PGNParser.QUOTED_RESULT, 0); }
		public Info_resultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterInfo_result(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitInfo_result(this);
		}
	}

	public final Info_resultContext info_result() throws RecognitionException {
		Info_resultContext _localctx = new Info_resultContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_info_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(RESULT);
			setState(91);
			match(QUOTED_RESULT);
			}
		}
		catch (RecognitionException re) {
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
	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode COLUMN_A() { return getToken(PGNParser.COLUMN_A, 0); }
		public TerminalNode COLUMN_B() { return getToken(PGNParser.COLUMN_B, 0); }
		public TerminalNode COLUMN_C() { return getToken(PGNParser.COLUMN_C, 0); }
		public TerminalNode COLUMN_D() { return getToken(PGNParser.COLUMN_D, 0); }
		public TerminalNode COLUMN_E() { return getToken(PGNParser.COLUMN_E, 0); }
		public TerminalNode COLUMN_F() { return getToken(PGNParser.COLUMN_F, 0); }
		public TerminalNode COLUMN_G() { return getToken(PGNParser.COLUMN_G, 0); }
		public TerminalNode COLUMN_H() { return getToken(PGNParser.COLUMN_H, 0); }
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 522240L) != 0)) ) {
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
	public static class RowContext extends ParserRuleContext {
		public TerminalNode ROW_1() { return getToken(PGNParser.ROW_1, 0); }
		public TerminalNode ROW_2() { return getToken(PGNParser.ROW_2, 0); }
		public TerminalNode ROW_3() { return getToken(PGNParser.ROW_3, 0); }
		public TerminalNode ROW_4() { return getToken(PGNParser.ROW_4, 0); }
		public TerminalNode ROW_5() { return getToken(PGNParser.ROW_5, 0); }
		public TerminalNode ROW_6() { return getToken(PGNParser.ROW_6, 0); }
		public TerminalNode ROW_7() { return getToken(PGNParser.ROW_7, 0); }
		public TerminalNode ROW_8() { return getToken(PGNParser.ROW_8, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 133693440L) != 0)) ) {
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
	public static class SquareContext extends ParserRuleContext {
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public SquareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterSquare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitSquare(this);
		}
	}

	public final SquareContext square() throws RecognitionException {
		SquareContext _localctx = new SquareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_square);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			column();
			setState(98);
			row();
			}
		}
		catch (RecognitionException re) {
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
	public static class DisambiguationContext extends ParserRuleContext {
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public DisambiguationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disambiguation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterDisambiguation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitDisambiguation(this);
		}
	}

	public final DisambiguationContext disambiguation() throws RecognitionException {
		DisambiguationContext _localctx = new DisambiguationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_disambiguation);
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				square();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				column();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				row();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Square_destinationContext extends ParserRuleContext {
		public SquareContext square() {
			return getRuleContext(SquareContext.class,0);
		}
		public Square_destinationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_square_destination; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterSquare_destination(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitSquare_destination(this);
		}
	}

	public final Square_destinationContext square_destination() throws RecognitionException {
		Square_destinationContext _localctx = new Square_destinationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_square_destination);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			square();
			}
		}
		catch (RecognitionException re) {
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
	public static class PieceContext extends ParserRuleContext {
		public TerminalNode QUEEN() { return getToken(PGNParser.QUEEN, 0); }
		public TerminalNode ROOK() { return getToken(PGNParser.ROOK, 0); }
		public TerminalNode BISHOP() { return getToken(PGNParser.BISHOP, 0); }
		public TerminalNode KNIGHT() { return getToken(PGNParser.KNIGHT, 0); }
		public TerminalNode KING() { return getToken(PGNParser.KING, 0); }
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitPiece(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4160749568L) != 0)) ) {
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
	public static class PromotionContext extends ParserRuleContext {
		public TerminalNode QUEEN() { return getToken(PGNParser.QUEEN, 0); }
		public TerminalNode ROOK() { return getToken(PGNParser.ROOK, 0); }
		public TerminalNode BISHOP() { return getToken(PGNParser.BISHOP, 0); }
		public TerminalNode KNIGHT() { return getToken(PGNParser.KNIGHT, 0); }
		public PromotionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promotion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterPromotion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitPromotion(this);
		}
	}

	public final PromotionContext promotion() throws RecognitionException {
		PromotionContext _localctx = new PromotionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_promotion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__2);
			setState(110);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
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
	public static class CastleContext extends ParserRuleContext {
		public TerminalNode CASTLE_KING() { return getToken(PGNParser.CASTLE_KING, 0); }
		public TerminalNode CASTLE_QUEEN() { return getToken(PGNParser.CASTLE_QUEEN, 0); }
		public CastleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterCastle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitCastle(this);
		}
	}

	public final CastleContext castle() throws RecognitionException {
		CastleContext _localctx = new CastleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_castle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==CASTLE_KING || _la==CASTLE_QUEEN) ) {
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
	public static class ResultContext extends ParserRuleContext {
		public TerminalNode WHITE_WIN() { return getToken(PGNParser.WHITE_WIN, 0); }
		public TerminalNode BLACK_WIN() { return getToken(PGNParser.BLACK_WIN, 0); }
		public TerminalNode TIE() { return getToken(PGNParser.TIE, 0); }
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
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
	public static class GameContext extends ParserRuleContext {
		public Game_infoContext game_info() {
			return getRuleContext(Game_infoContext.class,0);
		}
		public Move_textContext move_text() {
			return getRuleContext(Move_textContext.class,0);
		}
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitGame(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_game);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			game_info();
			setState(117);
			move_text();
			}
		}
		catch (RecognitionException re) {
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
	public static class Move_textContext extends ParserRuleContext {
		public Last_movesContext last_moves() {
			return getRuleContext(Last_movesContext.class,0);
		}
		public List<Move_pairContext> move_pair() {
			return getRuleContexts(Move_pairContext.class);
		}
		public Move_pairContext move_pair(int i) {
			return getRuleContext(Move_pairContext.class,i);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public Move_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterMove_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitMove_text(this);
		}
	}

	public final Move_textContext move_text() throws RecognitionException {
		Move_textContext _localctx = new Move_textContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_move_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					move_pair();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(125);
			last_moves();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
				{
				setState(126);
				result();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Move_pairContext extends ParserRuleContext {
		public TerminalNode MOVE_NUMBER() { return getToken(PGNParser.MOVE_NUMBER, 0); }
		public White_moveContext white_move() {
			return getRuleContext(White_moveContext.class,0);
		}
		public Black_moveContext black_move() {
			return getRuleContext(Black_moveContext.class,0);
		}
		public Move_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterMove_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitMove_pair(this);
		}
	}

	public final Move_pairContext move_pair() throws RecognitionException {
		Move_pairContext _localctx = new Move_pairContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_move_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(MOVE_NUMBER);
			setState(130);
			white_move();
			setState(131);
			black_move();
			}
		}
		catch (RecognitionException re) {
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
	public static class Last_movesContext extends ParserRuleContext {
		public TerminalNode MOVE_NUMBER() { return getToken(PGNParser.MOVE_NUMBER, 0); }
		public White_moveContext white_move() {
			return getRuleContext(White_moveContext.class,0);
		}
		public Black_moveContext black_move() {
			return getRuleContext(Black_moveContext.class,0);
		}
		public Last_movesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_last_moves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterLast_moves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitLast_moves(this);
		}
	}

	public final Last_movesContext last_moves() throws RecognitionException {
		Last_movesContext _localctx = new Last_movesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_last_moves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(MOVE_NUMBER);
			setState(134);
			white_move();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 416478132224L) != 0)) {
				{
				setState(135);
				black_move();
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

	@SuppressWarnings("CheckReturnValue")
	public static class White_moveContext extends ParserRuleContext {
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public Check_stateContext check_state() {
			return getRuleContext(Check_stateContext.class,0);
		}
		public White_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterWhite_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitWhite_move(this);
		}
	}

	public final White_moveContext white_move() throws RecognitionException {
		White_moveContext _localctx = new White_moveContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_white_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			move();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECK || _la==MATE) {
				{
				setState(139);
				check_state();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Black_moveContext extends ParserRuleContext {
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public Check_stateContext check_state() {
			return getRuleContext(Check_stateContext.class,0);
		}
		public Black_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_black_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterBlack_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitBlack_move(this);
		}
	}

	public final Black_moveContext black_move() throws RecognitionException {
		Black_moveContext _localctx = new Black_moveContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_black_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			move();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHECK || _la==MATE) {
				{
				setState(143);
				check_state();
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveContext extends ParserRuleContext {
		public CastleContext castle() {
			return getRuleContext(CastleContext.class,0);
		}
		public Pawn_moveContext pawn_move() {
			return getRuleContext(Pawn_moveContext.class,0);
		}
		public PromotionContext promotion() {
			return getRuleContext(PromotionContext.class,0);
		}
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public Square_destinationContext square_destination() {
			return getRuleContext(Square_destinationContext.class,0);
		}
		public DisambiguationContext disambiguation() {
			return getRuleContext(DisambiguationContext.class,0);
		}
		public TerminalNode TAKES() { return getToken(PGNParser.TAKES, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_move);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASTLE_KING:
			case CASTLE_QUEEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				castle();
				}
				break;
			case COLUMN_A:
			case COLUMN_B:
			case COLUMN_C:
			case COLUMN_D:
			case COLUMN_E:
			case COLUMN_F:
			case COLUMN_G:
			case COLUMN_H:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				pawn_move();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(148);
					promotion();
					}
				}

				}
				break;
			case KING:
			case QUEEN:
			case ROOK:
			case BISHOP:
			case KNIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				piece();
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(152);
					disambiguation();
					}
					break;
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TAKES) {
					{
					setState(155);
					match(TAKES);
					}
				}

				setState(158);
				square_destination();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Pawn_moveContext extends ParserRuleContext {
		public Square_destinationContext square_destination() {
			return getRuleContext(Square_destinationContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode TAKES() { return getToken(PGNParser.TAKES, 0); }
		public Pawn_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pawn_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterPawn_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitPawn_move(this);
		}
	}

	public final Pawn_moveContext pawn_move() throws RecognitionException {
		Pawn_moveContext _localctx = new Pawn_moveContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pawn_move);
		try {
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				square_destination();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				column();
				setState(164);
				match(TAKES);
				setState(165);
				square_destination();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Check_stateContext extends ParserRuleContext {
		public TerminalNode CHECK() { return getToken(PGNParser.CHECK, 0); }
		public TerminalNode MATE() { return getToken(PGNParser.MATE, 0); }
		public Check_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).enterCheck_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PGNListener ) ((PGNListener)listener).exitCheck_state(this);
		}
	}

	public final Check_stateContext check_state() throws RecognitionException {
		Check_stateContext _localctx = new Check_stateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_check_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==CHECK || _la==MATE) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001,\u00ac\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000;\b\u0000\n\u0000\f\u0000>\t\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0003\fh\b\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0005\u0013y\b\u0013"+
		"\n\u0013\f\u0013|\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0080\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u0089\b\u0015\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u008d\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0091\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0096\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u009a\b\u0018\u0001\u0018\u0003\u0018\u009d\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00a1\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00a8\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0000\u0000\u001b\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"024\u0000\u0007\u0001\u0000\u000b\u0012\u0001\u0000\u0013\u001a\u0001"+
		"\u0000\u001b\u001f\u0001\u0000\u001c\u001f\u0001\u0000%&\u0001\u0000 "+
		"\"\u0001\u0000#$\u00a4\u0000<\u0001\u0000\u0000\u0000\u0002F\u0001\u0000"+
		"\u0000\u0000\u0004H\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000"+
		"\bN\u0001\u0000\u0000\u0000\nQ\u0001\u0000\u0000\u0000\fT\u0001\u0000"+
		"\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000"+
		"\u0012]\u0001\u0000\u0000\u0000\u0014_\u0001\u0000\u0000\u0000\u0016a"+
		"\u0001\u0000\u0000\u0000\u0018g\u0001\u0000\u0000\u0000\u001ai\u0001\u0000"+
		"\u0000\u0000\u001ck\u0001\u0000\u0000\u0000\u001em\u0001\u0000\u0000\u0000"+
		" p\u0001\u0000\u0000\u0000\"r\u0001\u0000\u0000\u0000$t\u0001\u0000\u0000"+
		"\u0000&z\u0001\u0000\u0000\u0000(\u0081\u0001\u0000\u0000\u0000*\u0085"+
		"\u0001\u0000\u0000\u0000,\u008a\u0001\u0000\u0000\u0000.\u008e\u0001\u0000"+
		"\u0000\u00000\u00a0\u0001\u0000\u0000\u00002\u00a7\u0001\u0000\u0000\u0000"+
		"4\u00a9\u0001\u0000\u0000\u000067\u0005\u0001\u0000\u000078\u0003\u0002"+
		"\u0001\u000089\u0005\u0002\u0000\u00009;\u0001\u0000\u0000\u0000:6\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=\u0001\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?G\u0003\u0004\u0002\u0000@G\u0003\u0006\u0003\u0000AG\u0003"+
		"\b\u0004\u0000BG\u0003\n\u0005\u0000CG\u0003\f\u0006\u0000DG\u0003\u000e"+
		"\u0007\u0000EG\u0003\u0010\b\u0000F?\u0001\u0000\u0000\u0000F@\u0001\u0000"+
		"\u0000\u0000FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000"+
		"G\u0003\u0001\u0000\u0000\u0000HI\u0005\u0004\u0000\u0000IJ\u0005+\u0000"+
		"\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0005"+
		"+\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NO\u0005\u0006\u0000\u0000"+
		"OP\u0005)\u0000\u0000P\t\u0001\u0000\u0000\u0000QR\u0005\u0007\u0000\u0000"+
		"RS\u0005+\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0005\b\u0000\u0000"+
		"UV\u0005+\u0000\u0000V\r\u0001\u0000\u0000\u0000WX\u0005\t\u0000\u0000"+
		"XY\u0005+\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000Z[\u0005\n\u0000\u0000"+
		"[\\\u0005*\u0000\u0000\\\u0011\u0001\u0000\u0000\u0000]^\u0007\u0000\u0000"+
		"\u0000^\u0013\u0001\u0000\u0000\u0000_`\u0007\u0001\u0000\u0000`\u0015"+
		"\u0001\u0000\u0000\u0000ab\u0003\u0012\t\u0000bc\u0003\u0014\n\u0000c"+
		"\u0017\u0001\u0000\u0000\u0000dh\u0003\u0016\u000b\u0000eh\u0003\u0012"+
		"\t\u0000fh\u0003\u0014\n\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\u0019\u0001\u0000\u0000\u0000"+
		"ij\u0003\u0016\u000b\u0000j\u001b\u0001\u0000\u0000\u0000kl\u0007\u0002"+
		"\u0000\u0000l\u001d\u0001\u0000\u0000\u0000mn\u0005\u0003\u0000\u0000"+
		"no\u0007\u0003\u0000\u0000o\u001f\u0001\u0000\u0000\u0000pq\u0007\u0004"+
		"\u0000\u0000q!\u0001\u0000\u0000\u0000rs\u0007\u0005\u0000\u0000s#\u0001"+
		"\u0000\u0000\u0000tu\u0003\u0000\u0000\u0000uv\u0003&\u0013\u0000v%\u0001"+
		"\u0000\u0000\u0000wy\u0003(\u0014\u0000xw\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0003*\u0015"+
		"\u0000~\u0080\u0003\"\u0011\u0000\u007f~\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\'\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005(\u0000\u0000\u0082\u0083\u0003,\u0016\u0000\u0083\u0084\u0003."+
		"\u0017\u0000\u0084)\u0001\u0000\u0000\u0000\u0085\u0086\u0005(\u0000\u0000"+
		"\u0086\u0088\u0003,\u0016\u0000\u0087\u0089\u0003.\u0017\u0000\u0088\u0087"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089+\u0001"+
		"\u0000\u0000\u0000\u008a\u008c\u00030\u0018\u0000\u008b\u008d\u00034\u001a"+
		"\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d-\u0001\u0000\u0000\u0000\u008e\u0090\u00030\u0018\u0000\u008f"+
		"\u0091\u00034\u001a\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091/\u0001\u0000\u0000\u0000\u0092\u00a1\u0003"+
		" \u0010\u0000\u0093\u0095\u00032\u0019\u0000\u0094\u0096\u0003\u001e\u000f"+
		"\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000"+
		"\u0000\u0096\u00a1\u0001\u0000\u0000\u0000\u0097\u0099\u0003\u001c\u000e"+
		"\u0000\u0098\u009a\u0003\u0018\f\u0000\u0099\u0098\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u009d\u0005\'\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0003\u001a\r\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u0092"+
		"\u0001\u0000\u0000\u0000\u00a0\u0093\u0001\u0000\u0000\u0000\u00a0\u0097"+
		"\u0001\u0000\u0000\u0000\u00a11\u0001\u0000\u0000\u0000\u00a2\u00a8\u0003"+
		"\u001a\r\u0000\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u00a5\u0005\'\u0000"+
		"\u0000\u00a5\u00a6\u0003\u001a\r\u0000\u00a6\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a7\u00a2\u0001\u0000\u0000\u0000\u00a7\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a83\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0006\u0000\u0000\u00aa"+
		"5\u0001\u0000\u0000\u0000\r<Fgz\u007f\u0088\u008c\u0090\u0095\u0099\u009c"+
		"\u00a0\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}