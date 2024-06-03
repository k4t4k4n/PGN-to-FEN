import sys
from antlr4 import *
from PGNLexer import PGNLexer
from PGNParser import PGNParser
from PGNListener import PGNListener
        

def parse_pgn():
    input_file = FileStream('test.pgn', encoding='utf-8')
    lexer = PGNLexer(input_file)
    token_stream = CommonTokenStream(lexer)
    parser = PGNParser(token_stream)
    listener = PGNListener()
    walker = ParseTreeWalker()

    tree = parser.game()
    walker.walk(listener, tree)

    return listener.get_moves()

if __name__ == '__main__':
    moves = parse_pgn()
    for move in moves:
        print(move)