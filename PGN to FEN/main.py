import sys
from antlr4 import *
from PGNLexer import PGNLexer
from PGNParser import PGNParser
from antlr4.tree.Trees import Trees

def parse_pgn(file_path):
    input_stream = FileStream(file_path)
    lexer = PGNLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = PGNParser(stream)
    tree = parser.game()
    
    # Opcjonalnie, możesz wyświetlić drzewo parsowania
    print(Trees.toStringTree(tree, None, parser))
    
    return tree

def fen_to_board(fen):
    board = []
    for row in fen.split(' ')[0].split('/'):
        board_row = []
        for char in row:
            if char.isdigit():
                board_row.extend(['.'] * int(char))
            else:
                board_row.append(char)
        board.append(board_row)
    return board

def board_to_fen(board):
    fen_rows = []
    for row in board:
        empty_count = 0
        fen_row = ''
        for char in row:
            if char == '.':
                empty_count += 1
            else:
                if empty_count > 0:
                    fen_row += str(empty_count)
                    empty_count = 0
                fen_row += char
        if empty_count > 0:
            fen_row += str(empty_count)
        fen_rows.append(fen_row)
    return '/'.join(fen_rows) + ' w KQkq - 0 1'

def next_state(current_fen, move):
    # Implementacja logiki aktualizacji stanu planszy
    # Na przykład, zmiana pozycji figur, usuwanie zbitych figur itp.
    board = fen_to_board(current_fen)
    
    # Przetwarzanie ruchu (upraszczenie, szczegóły wymagają bardziej rozbudowanej logiki)
    if isinstance(move, list):
        piece = move[0]
        if len(move) == 3:
            start_pos = move[1]
            end_pos = move[2]
        elif len(move) == 4 and move[2] == 'x':
            start_pos = move[1]
            end_pos = move[3]
        else:
            start_pos = move[1]
            end_pos = move[2]
    else:
        piece = 'P'
        start_pos = move[0]
        end_pos = move[1]

    start_col = ord(start_pos[0]) - ord('a')
    start_row = 8 - int(start_pos[1])
    end_col = ord(end_pos[0]) - ord('a')
    end_row = 8 - int(end_pos[1])

    board[start_row][start_col] = '.'
    board[end_row][end_col] = piece

    return board_to_fen(board)

def main(pgn_file, output_dir):
    initial_fen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1"
    current_fen = initial_fen

    tree = parse_pgn(pgn_file)

    # Przykład przechodzenia drzewa parsowania
    # Możesz napisać dodatkowy kod, który przetworzy drzewo parsowania
    # i wygeneruje odpowiednie stany planszy w notacji FEN

    print("Parsowanie zakończone")

# Uruchomienie programu
if __name__ == "__main__":
    if len(sys.argv) > 1:
        pgn_file = sys.argv[1]
    else:
        pgn_file = "game.pgn"
    
    main(pgn_file)
