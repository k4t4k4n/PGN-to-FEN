# Generated from PGN.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .PGNParser import PGNParser
else:
    from PGNParser import PGNParser

# This class defines a complete listener for a parse tree produced by PGNParser.
class PGNListener(ParseTreeListener):

    # Enter a parse tree produced by PGNParser#game.
    def enterGame(self, ctx:PGNParser.GameContext):
        pass

    # Exit a parse tree produced by PGNParser#game.
    def exitGame(self, ctx:PGNParser.GameContext):
        pass


    # Enter a parse tree produced by PGNParser#game_info.
    def enterGame_info(self, ctx:PGNParser.Game_infoContext):
        pass

    # Exit a parse tree produced by PGNParser#game_info.
    def exitGame_info(self, ctx:PGNParser.Game_infoContext):
        pass


    # Enter a parse tree produced by PGNParser#move_text.
    def enterMove_text(self, ctx:PGNParser.Move_textContext):
        pass

    # Exit a parse tree produced by PGNParser#move_text.
    def exitMove_text(self, ctx:PGNParser.Move_textContext):
        pass


    # Enter a parse tree produced by PGNParser#move_pair.
    def enterMove_pair(self, ctx:PGNParser.Move_pairContext):
        pass

    # Exit a parse tree produced by PGNParser#move_pair.
    def exitMove_pair(self, ctx:PGNParser.Move_pairContext):
        pass


    # Enter a parse tree produced by PGNParser#white_move.
    def enterWhite_move(self, ctx:PGNParser.White_moveContext):
        pass

    # Exit a parse tree produced by PGNParser#white_move.
    def exitWhite_move(self, ctx:PGNParser.White_moveContext):
        pass


    # Enter a parse tree produced by PGNParser#black_move.
    def enterBlack_move(self, ctx:PGNParser.Black_moveContext):
        pass

    # Exit a parse tree produced by PGNParser#black_move.
    def exitBlack_move(self, ctx:PGNParser.Black_moveContext):
        pass


    # Enter a parse tree produced by PGNParser#move.
    def enterMove(self, ctx:PGNParser.MoveContext):
        pass

    # Exit a parse tree produced by PGNParser#move.
    def exitMove(self, ctx:PGNParser.MoveContext):
        pass


    # Enter a parse tree produced by PGNParser#pawn_move.
    def enterPawn_move(self, ctx:PGNParser.Pawn_moveContext):
        pass

    # Exit a parse tree produced by PGNParser#pawn_move.
    def exitPawn_move(self, ctx:PGNParser.Pawn_moveContext):
        pass


    # Enter a parse tree produced by PGNParser#piece.
    def enterPiece(self, ctx:PGNParser.PieceContext):
        pass

    # Exit a parse tree produced by PGNParser#piece.
    def exitPiece(self, ctx:PGNParser.PieceContext):
        pass


    # Enter a parse tree produced by PGNParser#disambiguation.
    def enterDisambiguation(self, ctx:PGNParser.DisambiguationContext):
        pass

    # Exit a parse tree produced by PGNParser#disambiguation.
    def exitDisambiguation(self, ctx:PGNParser.DisambiguationContext):
        pass


    # Enter a parse tree produced by PGNParser#column.
    def enterColumn(self, ctx:PGNParser.ColumnContext):
        pass

    # Exit a parse tree produced by PGNParser#column.
    def exitColumn(self, ctx:PGNParser.ColumnContext):
        pass


    # Enter a parse tree produced by PGNParser#row.
    def enterRow(self, ctx:PGNParser.RowContext):
        pass

    # Exit a parse tree produced by PGNParser#row.
    def exitRow(self, ctx:PGNParser.RowContext):
        pass


    # Enter a parse tree produced by PGNParser#square.
    def enterSquare(self, ctx:PGNParser.SquareContext):
        pass

    # Exit a parse tree produced by PGNParser#square.
    def exitSquare(self, ctx:PGNParser.SquareContext):
        pass


    # Enter a parse tree produced by PGNParser#takes.
    def enterTakes(self, ctx:PGNParser.TakesContext):
        pass

    # Exit a parse tree produced by PGNParser#takes.
    def exitTakes(self, ctx:PGNParser.TakesContext):
        pass


    # Enter a parse tree produced by PGNParser#promotion.
    def enterPromotion(self, ctx:PGNParser.PromotionContext):
        pass

    # Exit a parse tree produced by PGNParser#promotion.
    def exitPromotion(self, ctx:PGNParser.PromotionContext):
        pass


    # Enter a parse tree produced by PGNParser#check.
    def enterCheck(self, ctx:PGNParser.CheckContext):
        pass

    # Exit a parse tree produced by PGNParser#check.
    def exitCheck(self, ctx:PGNParser.CheckContext):
        pass


    # Enter a parse tree produced by PGNParser#mate.
    def enterMate(self, ctx:PGNParser.MateContext):
        pass

    # Exit a parse tree produced by PGNParser#mate.
    def exitMate(self, ctx:PGNParser.MateContext):
        pass


    # Enter a parse tree produced by PGNParser#castle_kingside.
    def enterCastle_kingside(self, ctx:PGNParser.Castle_kingsideContext):
        pass

    # Exit a parse tree produced by PGNParser#castle_kingside.
    def exitCastle_kingside(self, ctx:PGNParser.Castle_kingsideContext):
        pass


    # Enter a parse tree produced by PGNParser#castle_queenside.
    def enterCastle_queenside(self, ctx:PGNParser.Castle_queensideContext):
        pass

    # Exit a parse tree produced by PGNParser#castle_queenside.
    def exitCastle_queenside(self, ctx:PGNParser.Castle_queensideContext):
        pass


    # Enter a parse tree produced by PGNParser#result.
    def enterResult(self, ctx:PGNParser.ResultContext):
        pass

    # Exit a parse tree produced by PGNParser#result.
    def exitResult(self, ctx:PGNParser.ResultContext):
        pass



del PGNParser