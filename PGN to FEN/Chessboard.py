class ChessBoard:
    def __init__(self):
        self.board = self.create_initial_board()

    def create_initial_board(self):
        board = {}
        # Place pawns
        for col in 'abcdefgh':
            board[col + '2'] = 'P'
            board[col + '7'] = 'p'
        # Place rooks
        board['a1'] = board['h1'] = 'R'
        board['a8'] = board['h8'] = 'r'
        # Place knights
        board['b1'] = board['g1'] = 'N'
        board['b8'] = board['g8'] = 'n'
        # Place bishops
        board['c1'] = board['f1'] = 'B'
        board['c8'] = board['f8'] = 'b'
        # Place queens
        board['d1'] = 'Q'
        board['d8'] = 'q'
        # Place kings
        board['e1'] = 'K'
        board['e8'] = 'k'
        return board

    def move_piece(self, start_square, destination_square):
        piece = self.board.pop(start_square, None)
        if piece:
            self.board[destination_square] = piece

    def promote_piece(self, destination_square, promotion_piece):
        self.board[destination_square] = promotion_piece

    def get_piece_at(self, square):
        return self.board.get(square, None)

    def board_to_fen(self, data):
        fen_rows = []
        for row in range(8, 0, -1):
            fen_row = ''
            empty_count = 0
            for col in 'abcdefgh':
                square = col + str(row)
                piece = self.board.get(square, None)
                if piece:
                    if empty_count > 0:
                        fen_row += str(empty_count)
                        empty_count = 0
                    fen_row += piece
                else:
                    empty_count += 1
            if empty_count > 0:
                fen_row += str(empty_count)
            fen_rows.append(fen_row)
        fen = '/'.join(fen_rows) + data
        return fen

    @staticmethod
    def fen_to_board(fen):
        board = {}
        rows = fen.split(' ')[0].split('/')
        for r, row in enumerate(rows):
            col = 0
            for char in row:
                if char.isdigit():
                    col += int(char)
                else:
                    board['abcdefgh'[col] + str(8 - r)] = char
                    col += 1
        return board