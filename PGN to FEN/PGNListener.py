# Generated from PGN.g4 by ANTLR 4.13.1
from antlr4 import *
from Chessboard import ChessBoard
if "." in __name__:
    from .PGNParser import PGNParser
else:
    from PGNParser import PGNParser

# This class defines a complete listener for a parse tree produced by PGNParser.
class PGNListener(ParseTreeListener):

    def __init__(self):
        self.moves = []
        self.current_half_move_number = 0
        self.current_full_move_number = 1
        self.current_move_color = None
        self.board = ChessBoard()
        self.K_castle = True
        self.Q_castle = True
        self.k_castle = True
        self.q_castle = True
        self.en_passant = '-'

    # Enter a parse tree produced by PGNParser#game_info.
    def enterGame_info(self, ctx:PGNParser.Game_infoContext):
        pass

    # Exit a parse tree produced by PGNParser#game_info.
    def exitGame_info(self, ctx:PGNParser.Game_infoContext):
        pass


    # Enter a parse tree produced by PGNParser#info.
    def enterInfo(self, ctx:PGNParser.InfoContext):
        pass

    # Exit a parse tree produced by PGNParser#info.
    def exitInfo(self, ctx:PGNParser.InfoContext):
        pass


    # Enter a parse tree produced by PGNParser#info_event.
    def enterInfo_event(self, ctx:PGNParser.Info_eventContext):
        pass

    # Exit a parse tree produced by PGNParser#info_event.
    def exitInfo_event(self, ctx:PGNParser.Info_eventContext):
        pass


    # Enter a parse tree produced by PGNParser#info_site.
    def enterInfo_site(self, ctx:PGNParser.Info_siteContext):
        pass

    # Exit a parse tree produced by PGNParser#info_site.
    def exitInfo_site(self, ctx:PGNParser.Info_siteContext):
        pass


    # Enter a parse tree produced by PGNParser#info_date.
    def enterInfo_date(self, ctx:PGNParser.Info_dateContext):
        pass

    # Exit a parse tree produced by PGNParser#info_date.
    def exitInfo_date(self, ctx:PGNParser.Info_dateContext):
        pass


    # Enter a parse tree produced by PGNParser#info_round.
    def enterInfo_round(self, ctx:PGNParser.Info_roundContext):
        pass

    # Exit a parse tree produced by PGNParser#info_round.
    def exitInfo_round(self, ctx:PGNParser.Info_roundContext):
        pass


    # Enter a parse tree produced by PGNParser#info_white.
    def enterInfo_white(self, ctx:PGNParser.Info_whiteContext):
        pass

    # Exit a parse tree produced by PGNParser#info_white.
    def exitInfo_white(self, ctx:PGNParser.Info_whiteContext):
        pass


    # Enter a parse tree produced by PGNParser#info_black.
    def enterInfo_black(self, ctx:PGNParser.Info_blackContext):
        pass

    # Exit a parse tree produced by PGNParser#info_black.
    def exitInfo_black(self, ctx:PGNParser.Info_blackContext):
        pass


    # Enter a parse tree produced by PGNParser#info_result.
    def enterInfo_result(self, ctx:PGNParser.Info_resultContext):
        pass

    # Exit a parse tree produced by PGNParser#info_result.
    def exitInfo_result(self, ctx:PGNParser.Info_resultContext):
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


    # Enter a parse tree produced by PGNParser#disambiguation.
    def enterDisambiguation(self, ctx:PGNParser.DisambiguationContext):
        pass

    # Exit a parse tree produced by PGNParser#disambiguation.
    def exitDisambiguation(self, ctx:PGNParser.DisambiguationContext):
        pass


    # Enter a parse tree produced by PGNParser#square_disambiguation.
    def enterSquare_disambiguation(self, ctx:PGNParser.Square_disambiguationContext):
        pass

    # Exit a parse tree produced by PGNParser#square_disambiguation.
    def exitSquare_disambiguation(self, ctx:PGNParser.Square_disambiguationContext):
        pass


    # Enter a parse tree produced by PGNParser#column_disambiguation.
    def enterColumn_disambiguation(self, ctx:PGNParser.Column_disambiguationContext):
        pass

    # Exit a parse tree produced by PGNParser#column_disambiguation.
    def exitColumn_disambiguation(self, ctx:PGNParser.Column_disambiguationContext):
        pass


    # Enter a parse tree produced by PGNParser#row_disambiguation.
    def enterRow_disambiguation(self, ctx:PGNParser.Row_disambiguationContext):
        pass

    # Exit a parse tree produced by PGNParser#row_disambiguation.
    def exitRow_disambiguation(self, ctx:PGNParser.Row_disambiguationContext):
        pass


    # Enter a parse tree produced by PGNParser#square_destination.
    def enterSquare_destination(self, ctx:PGNParser.Square_destinationContext):
        pass

    # Exit a parse tree produced by PGNParser#square_destination.
    def exitSquare_destination(self, ctx:PGNParser.Square_destinationContext):
        pass


    # Enter a parse tree produced by PGNParser#piece.
    def enterPiece(self, ctx:PGNParser.PieceContext):
        pass

    # Exit a parse tree produced by PGNParser#piece.
    def exitPiece(self, ctx:PGNParser.PieceContext):
        pass


    # Enter a parse tree produced by PGNParser#promotion.
    def enterPromotion(self, ctx:PGNParser.PromotionContext):
        pass

    # Exit a parse tree produced by PGNParser#promotion.
    def exitPromotion(self, ctx:PGNParser.PromotionContext):
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


    # Enter a parse tree produced by PGNParser#castle.
    def enterCastle(self, ctx:PGNParser.CastleContext):
        pass

    # Exit a parse tree produced by PGNParser#castle.
    def exitCastle(self, ctx:PGNParser.CastleContext):
        pass


    # Enter a parse tree produced by PGNParser#result.
    def enterResult(self, ctx:PGNParser.ResultContext):
        pass

    # Exit a parse tree produced by PGNParser#result.
    def exitResult(self, ctx:PGNParser.ResultContext):
        pass


    # Enter a parse tree produced by PGNParser#game.
    def enterGame(self, ctx:PGNParser.GameContext):
        pass

    # Exit a parse tree produced by PGNParser#game.
    def exitGame(self, ctx:PGNParser.GameContext):
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


    # Enter a parse tree produced by PGNParser#last_moves.
    def enterLast_moves(self, ctx:PGNParser.Last_movesContext):
        pass

    # Exit a parse tree produced by PGNParser#last_moves.
    def exitLast_moves(self, ctx:PGNParser.Last_movesContext):
        pass


    # Enter a parse tree produced by PGNParser#white_move.
    def enterWhite_move(self, ctx:PGNParser.White_moveContext):
        self.current_half_move_number += 1
        self.current_move_color = "white"
        pass

    # Exit a parse tree produced by PGNParser#white_move.
    def exitWhite_move(self, ctx:PGNParser.White_moveContext):
        pass


    # Enter a parse tree produced by PGNParser#black_move.
    def enterBlack_move(self, ctx:PGNParser.Black_moveContext):
        self.current_full_move_number += 1
        self.current_half_move_number += 1
        self.current_move_color = "black"
        pass

    # Exit a parse tree produced by PGNParser#black_move.
    def exitBlack_move(self, ctx:PGNParser.Black_moveContext):
        pass


    # Enter a parse tree produced by PGNParser#move.
    def enterMove(self, ctx:PGNParser.MoveContext):
        pass

    # Exit a parse tree produced by PGNParser#move.
    def exitMove(self, ctx:PGNParser.MoveContext):

        self.en_passant = '-'

        move_data = {
            "piece": None,
            "start_square": None,
            "destination_square": None,
            "is_capture": False
        }

        if ctx.castle():
            self.handle_castle(ctx.castle())
        else:
            starting_column = ''
            starting_row = ''
            
            if ctx.TAKES():
                self.current_half_move_number = 0
                move_data["is_capture"] = True

            if ctx.pawn_move():
                self.current_half_move_number = 0
                move_data["piece"] = "P" if self.current_move_color == "white" else "p"
                move_data["destination_square"] = ctx.pawn_move().square_destination().getText()
                if ctx.pawn_move().TAKES():
                    move_data["is_capture"] = True
                if ctx.pawn_move().column_disambiguation():
                        starting_column=ctx.pawn_move().column_disambiguation().getText()

            elif ctx.piece():
                move_data["piece"] = ctx.piece().getText()
                if self.current_move_color == "black":
                    move_data["piece"] = move_data["piece"].lower()

                move_data["destination_square"] = ctx.square_destination().getText()

                if ctx.piece().getText() == "K":
                    if self.current_move_color == "white":
                        self.K_castle = False
                        self.Q_castle = False
                    elif self.current_move_color == "black":
                        self.k_castle = False
                        self.q_castle = False

            if ctx.disambiguation():
                if ctx.disambiguation().column_disambiguation():
                    starting_column=ctx.disambiguation().column_disambiguation().getText()
                if ctx.disambiguation().row_disambiguation():
                    starting_row=ctx.disambiguation().row_disambiguation().getText()

            move_data["start_square"]=self.find_start_square(move_data["piece"], 
                                                             move_data["destination_square"][0], 
                                                             move_data["destination_square"][1], 
                                                             move_data["is_capture"],
                                                             starting_column, 
                                                             starting_row)
            
            if move_data["start_square"] == 'a1':
                self.Q_castle = False
            elif move_data["start_square"] == 'h1':
                self.K_castle = False
            elif move_data["start_square"] == 'a8':
                self.q_castle = False
            elif move_data["start_square"] == 'h8':
                self.k_castle = False

            self.board.move_piece(move_data["start_square"], move_data["destination_square"])
            self.moves.append(move_data)
            if ctx.promotion():
                promotion_piece = ''
                if self.current_move_color == "white":
                    if ctx.promotion().KNIGHT:
                        promotion_piece = 'N'
                    elif ctx.promotion().BISHOP:
                        promotion_piece = 'B'
                    elif ctx.promotion().ROOK:
                        promotion_piece = 'R'
                    elif ctx.promotion().QUEEN:
                        promotion_piece = 'Q'

                elif self.current_move_color == "black":
                    if ctx.promotion().KNIGHT:
                        promotion_piece = 'n'
                    elif ctx.promotion().BISHOP:
                        promotion_piece = 'b'
                    elif ctx.promotion().ROOK:
                        promotion_piece = 'r'
                    elif ctx.promotion().QUEEN:
                        promotion_piece = 'q'
                
                self.board.promote_piece(move_data["destination_square"], promotion_piece)
                self.moves.append({'piece': promotion_piece, 'start_square': move_data["destination_square"], 'destination_square': move_data["destination_square"], 'is_capture': True})

        color = ''
        if self.current_move_color == 'white':
            color = 'b'
        else:
            color = 'w'

        castle_opportunity = ''

        if self.K_castle:
            castle_opportunity += 'K'
        if self.Q_castle:
            castle_opportunity += 'Q'
        if self.k_castle:
            castle_opportunity += 'k'
        if self.q_castle:
            castle_opportunity += 'q'
        if castle_opportunity == '':
            castle_opportunity = '-'

        
        data = ' ' + color + ' ' + castle_opportunity + ' ' + self.en_passant + ' ' + str(self.current_half_move_number) + ' ' + str(self.current_full_move_number)
        print(self.board.board_to_fen(data))
        pass

    def handle_castle(self, ctx):
        if ctx.castle_kingside() and self.current_move_color == "white" :
            self.white_castle_king()
            self.K_castle = False
            self.Q_castle = False
        elif ctx.castle_kingside() and self.current_move_color == "black" :
            self.black_castle_king()
            self.k_castle = False
            self.q_castle = False
        elif ctx.castle_queenside() and self.current_move_color == "white" :
            self.white_castle_queen()
            self.K_castle = False
            self.Q_castle = False
        elif ctx.castle_queenside() and self.current_move_color == "black" :
            self.black_castle_queen()
            self.k_castle = False
            self.q_castle = False

    ####################################################################################################################
    ####################################################################################################################
    ####################################################################################################################

    def find_start_square(self, piece, destination_column, destination_row, is_capture, starting_column, starting_row):
        if piece == 'P':
            if is_capture:
                starting_row = str(int(destination_row) - 1)
            else:
                if destination_row == '4' and self.board.get_piece_at(destination_column+'2') == 'P' and not self.board.get_piece_at(destination_column+'3'):
                    starting_column = destination_column
                    starting_row = str(int(destination_row) - 2)
                    if ord(destination_column) > ord('a'):
                        if self.board.get_piece_at(chr((ord(destination_column)-1))+destination_row) == 'p':
                            self.en_passant = destination_column + str(int(destination_row)-1)
                    if ord(destination_column) < ord('h'):
                        if self.board.get_piece_at(chr((ord(destination_column)+1))+destination_row) == 'p':
                            self.en_passant = destination_column + str(int(destination_row)-1)
                    
                else:
                    starting_column = destination_column
                    starting_row = str(int(destination_row) - 1)
                
        elif piece == 'p':
            if is_capture:
                starting_row = str(int(destination_row) + 1)
            else:
                if destination_row == '5' and self.board.get_piece_at(destination_column+'7') == 'p' and not self.board.get_piece_at(destination_column+'6'):
                    starting_column = destination_column
                    starting_row = str(int(destination_row) + 2)
                    if ord(destination_column) > ord('a'):
                        if self.board.get_piece_at(chr((ord(destination_column)-1))+destination_row) == 'P':
                            self.en_passant = destination_column + str(int(destination_row)+1)
                    if ord(destination_column) < ord('h'):
                        if self.board.get_piece_at(chr((ord(destination_column)+1))+destination_row) == 'P':
                            self.en_passant = destination_column + str(int(destination_row)+1)
                else:
                    starting_column = destination_column
                    starting_row = str(int(destination_row) + 1)

        elif piece.lower() in ['r', 'q']:
            directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
            for direction in directions:
                row, col = int(destination_row), ord(destination_column)
                while 1 <= row <= 8 and ord('a') <= col <= ord('h'):
                    row += direction[0]
                    col += direction[1]
                    square = chr(col) + str(row)
                    if square == destination_column + destination_row:
                        break
                    if self.board.get_piece_at(square) and not self.board.get_piece_at(square) == piece:
                        break
                    if self.board.get_piece_at(square) == piece:
                        if (not starting_column or starting_column == chr(col)) and (not starting_row or starting_row == str(row)):
                            starting_column = chr(col)
                            starting_row = str(row)

        if piece.lower() in ['b', 'q']:
            directions = [(1, 1), (1, -1), (-1, 1), (-1, -1)]
            for direction in directions:
                row, col = int(destination_row), ord(destination_column)
                while 1 <= row <= 8 and ord('a') <= col <= ord('h'):
                    row += direction[0]
                    col += direction[1]
                    square = chr(col) + str(row)
                    if square == destination_column + destination_row:
                        break
                    if self.board.get_piece_at(square) and not self.board.get_piece_at(square) == piece:
                        break
                    if self.board.get_piece_at(square) == piece:
                        if (not starting_column or starting_column == chr(col)) and (not starting_row or starting_row == str(row)):
                            starting_column = chr(col)
                            starting_row = str(row)
                    

        elif piece.lower() == 'n':
            knight_moves = [(2, 1), (2, -1), (-2, 1), (-2, -1), (1, 2), (1, -2), (-1, 2), (-1, -2)]
            for move in knight_moves:
                row, col = int(destination_row) + move[0], ord(destination_column) + move[1]
                if 1 <= row <= 8 and ord('a') <= col <= ord('h'):
                    square = chr(col) + str(row)
                    if self.board.get_piece_at(square) == piece:
                        if (not starting_column or starting_column == chr(col)) and (not starting_row or starting_row == str(row)):
                            starting_column = chr(col)
                            starting_row = str(row)

        elif piece.lower() == 'k':
            king_moves = [(1, 0), (-1, 0), (0, 1), (0, -1), (1, 1), (1, -1), (-1, 1), (-1, -1)]
            for move in king_moves:
                row, col = int(destination_row) + move[0], ord(destination_column) + move[1]
                if 1 <= row <= 8 and ord('a') <= col <= ord('h'):
                    square = chr(col) + str(row)
                    if self.board.get_piece_at(square) == piece:
                        if (not starting_column or starting_column == chr(col)) and (not starting_row or starting_row == str(row)):
                            starting_column = chr(col)
                            starting_row = str(row)

        return starting_column + starting_row

    ####################################################################################################################
    ####################################################################################################################
    ####################################################################################################################
    
    def get_moves(self):
        return self.moves

    # Enter a parse tree produced by PGNParser#pawn_move.
    def enterPawn_move(self, ctx:PGNParser.Pawn_moveContext):
        pass

    # Exit a parse tree produced by PGNParser#pawn_move.
    def exitPawn_move(self, ctx:PGNParser.Pawn_moveContext):
        pass


    # Enter a parse tree produced by PGNParser#check_state.
    def enterCheck_state(self, ctx:PGNParser.Check_stateContext):
        pass

    # Exit a parse tree produced by PGNParser#check_state.
    def exitCheck_state(self, ctx:PGNParser.Check_stateContext):
        pass

    def white_castle_king(self):
        move_data = {
            "piece": 'K',
            "start_square": 'e1',
            "destination_square": 'g1',
            "is_capture": False
        }
        self.moves.append(move_data)
        move_data = {
            "piece": 'R',
            "start_square": 'h1',
            "destination_square": 'f1',
            "is_capture": False
        }
        self.moves.append(move_data)
        self.board.move_piece('e1', 'g1')
        self.board.move_piece('h1', 'f1')
        pass

    def white_castle_queen(self):
        move_data = {
            "piece": 'K',
            "start_square": 'e1',
            "destination_square": 'c1',
            "is_capture": False
        }
        self.moves.append(move_data)
        move_data = {
            "piece": 'R',
            "start_square": 'a1',
            "destination_square": 'd1',
            "is_capture": False
        }
        self.moves.append(move_data)
        self.board.move_piece('e1', 'c1')
        self.board.move_piece('a1', 'd1')
        pass

    def black_castle_king(self):
        move_data = {
            "piece": 'k',
            "start_square": 'e8',
            "destination_square": 'g8',
            "is_capture": False
        }
        self.moves.append(move_data)
        move_data = {
            "piece": 'r',
            "start_square": 'h8',
            "destination_square": 'f8',
            "is_capture": False
        }
        self.moves.append(move_data)
        self.board.move_piece('e8', 'g8')
        self.board.move_piece('h8', 'f8')
        pass

    def black_castle_queen(self):
        move_data = {
            "piece": 'k',
            "start_square": 'e8',
            "destination_square": 'c8',
            "is_capture": False
        }
        self.moves.append(move_data)
        move_data = {
            "piece": 'r',
            "start_square": 'a8',
            "destination_square": 'd8',
            "is_capture": False
        }
        self.moves.append(move_data)
        self.board.move_piece('e8', 'c8')
        self.board.move_piece('a8', 'd8')
        pass


del PGNParser