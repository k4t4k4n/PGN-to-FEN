// Generated from PGN.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PGNParser}.
 */
public interface PGNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PGNParser#game_info}.
	 * @param ctx the parse tree
	 */
	void enterGame_info(PGNParser.Game_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#game_info}.
	 * @param ctx the parse tree
	 */
	void exitGame_info(PGNParser.Game_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info}.
	 * @param ctx the parse tree
	 */
	void enterInfo(PGNParser.InfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info}.
	 * @param ctx the parse tree
	 */
	void exitInfo(PGNParser.InfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info_event}.
	 * @param ctx the parse tree
	 */
	void enterInfo_event(PGNParser.Info_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info_event}.
	 * @param ctx the parse tree
	 */
	void exitInfo_event(PGNParser.Info_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info_site}.
	 * @param ctx the parse tree
	 */
	void enterInfo_site(PGNParser.Info_siteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info_site}.
	 * @param ctx the parse tree
	 */
	void exitInfo_site(PGNParser.Info_siteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info_date}.
	 * @param ctx the parse tree
	 */
	void enterInfo_date(PGNParser.Info_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info_date}.
	 * @param ctx the parse tree
	 */
	void exitInfo_date(PGNParser.Info_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info_round}.
	 * @param ctx the parse tree
	 */
	void enterInfo_round(PGNParser.Info_roundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info_round}.
	 * @param ctx the parse tree
	 */
	void exitInfo_round(PGNParser.Info_roundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info_white}.
	 * @param ctx the parse tree
	 */
	void enterInfo_white(PGNParser.Info_whiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info_white}.
	 * @param ctx the parse tree
	 */
	void exitInfo_white(PGNParser.Info_whiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info_black}.
	 * @param ctx the parse tree
	 */
	void enterInfo_black(PGNParser.Info_blackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info_black}.
	 * @param ctx the parse tree
	 */
	void exitInfo_black(PGNParser.Info_blackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#info_result}.
	 * @param ctx the parse tree
	 */
	void enterInfo_result(PGNParser.Info_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#info_result}.
	 * @param ctx the parse tree
	 */
	void exitInfo_result(PGNParser.Info_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(PGNParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(PGNParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(PGNParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(PGNParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#square}.
	 * @param ctx the parse tree
	 */
	void enterSquare(PGNParser.SquareContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#square}.
	 * @param ctx the parse tree
	 */
	void exitSquare(PGNParser.SquareContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#disambiguation}.
	 * @param ctx the parse tree
	 */
	void enterDisambiguation(PGNParser.DisambiguationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#disambiguation}.
	 * @param ctx the parse tree
	 */
	void exitDisambiguation(PGNParser.DisambiguationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#square_destination}.
	 * @param ctx the parse tree
	 */
	void enterSquare_destination(PGNParser.Square_destinationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#square_destination}.
	 * @param ctx the parse tree
	 */
	void exitSquare_destination(PGNParser.Square_destinationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#piece}.
	 * @param ctx the parse tree
	 */
	void enterPiece(PGNParser.PieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#piece}.
	 * @param ctx the parse tree
	 */
	void exitPiece(PGNParser.PieceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#promotion}.
	 * @param ctx the parse tree
	 */
	void enterPromotion(PGNParser.PromotionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#promotion}.
	 * @param ctx the parse tree
	 */
	void exitPromotion(PGNParser.PromotionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#castle}.
	 * @param ctx the parse tree
	 */
	void enterCastle(PGNParser.CastleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#castle}.
	 * @param ctx the parse tree
	 */
	void exitCastle(PGNParser.CastleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(PGNParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(PGNParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(PGNParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(PGNParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#move_text}.
	 * @param ctx the parse tree
	 */
	void enterMove_text(PGNParser.Move_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#move_text}.
	 * @param ctx the parse tree
	 */
	void exitMove_text(PGNParser.Move_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#move_pair}.
	 * @param ctx the parse tree
	 */
	void enterMove_pair(PGNParser.Move_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#move_pair}.
	 * @param ctx the parse tree
	 */
	void exitMove_pair(PGNParser.Move_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#last_moves}.
	 * @param ctx the parse tree
	 */
	void enterLast_moves(PGNParser.Last_movesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#last_moves}.
	 * @param ctx the parse tree
	 */
	void exitLast_moves(PGNParser.Last_movesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#white_move}.
	 * @param ctx the parse tree
	 */
	void enterWhite_move(PGNParser.White_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#white_move}.
	 * @param ctx the parse tree
	 */
	void exitWhite_move(PGNParser.White_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#black_move}.
	 * @param ctx the parse tree
	 */
	void enterBlack_move(PGNParser.Black_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#black_move}.
	 * @param ctx the parse tree
	 */
	void exitBlack_move(PGNParser.Black_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(PGNParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(PGNParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#pawn_move}.
	 * @param ctx the parse tree
	 */
	void enterPawn_move(PGNParser.Pawn_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#pawn_move}.
	 * @param ctx the parse tree
	 */
	void exitPawn_move(PGNParser.Pawn_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#check_state}.
	 * @param ctx the parse tree
	 */
	void enterCheck_state(PGNParser.Check_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#check_state}.
	 * @param ctx the parse tree
	 */
	void exitCheck_state(PGNParser.Check_stateContext ctx);
}