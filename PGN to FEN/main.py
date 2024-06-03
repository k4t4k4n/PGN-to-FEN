import sys
from antlr4 import *
from PGNLexer import PGNLexer
from PGNParser import PGNParser
from PGNListener import PGNListener
        

def parse_pgn(file_name):
    input_file = FileStream(file_name, encoding='utf-8')
    lexer = PGNLexer(input_file)
    token_stream = CommonTokenStream(lexer)
    parser = PGNParser(token_stream)
    listener = PGNListener()
    walker = ParseTreeWalker()

    tree = parser.game()
    walker.walk(listener, tree)

    return listener.get_moves()

if __name__ == '__main__':
    if len(sys.argv) != 2:
        print("Usage: python main.py <filename>")
        sys.exit(1)
    
    file_name = sys.argv[1]
    moves = parse_pgn(file_name)
    #for move in moves: print(move)