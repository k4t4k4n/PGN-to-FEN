# Generated from PGN.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,44,253,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,
        26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,
        32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,
        39,7,39,2,40,7,40,2,41,7,41,2,42,7,42,2,43,7,43,1,0,1,0,1,1,1,1,
        1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,
        1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,7,1,7,1,7,1,8,1,8,
        1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,1,9,1,10,1,10,1,11,1,11,
        1,12,1,12,1,13,1,13,1,14,1,14,1,15,1,15,1,16,1,16,1,17,1,17,1,18,
        1,18,1,19,1,19,1,20,1,20,1,21,1,21,1,22,1,22,1,23,1,23,1,24,1,24,
        1,25,1,25,1,26,1,26,1,27,1,27,1,28,1,28,1,29,1,29,1,30,1,30,1,31,
        1,31,1,31,1,31,1,32,1,32,1,32,1,32,1,33,1,33,1,33,1,33,1,33,1,33,
        1,33,1,33,1,34,1,34,1,35,1,35,1,36,1,36,1,36,1,36,1,36,1,36,1,37,
        1,37,1,37,1,37,1,38,1,38,1,39,1,39,5,39,213,8,39,10,39,12,39,216,
        9,39,1,39,1,39,1,40,1,40,1,40,1,40,1,40,1,40,1,40,1,40,1,40,1,40,
        1,40,1,40,1,40,1,41,1,41,1,41,1,41,3,41,237,8,41,1,41,1,41,1,42,
        1,42,5,42,243,8,42,10,42,12,42,246,9,42,1,42,1,42,1,43,1,43,1,43,
        1,43,1,244,0,44,1,1,3,2,5,3,7,4,9,5,11,6,13,7,15,8,17,9,19,10,21,
        11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,37,19,39,20,41,21,43,
        22,45,23,47,24,49,25,51,26,53,27,55,28,57,29,59,30,61,31,63,32,65,
        33,67,34,69,35,71,36,73,37,75,38,77,39,79,40,81,41,83,42,85,43,87,
        44,1,0,3,1,0,49,57,1,0,48,57,3,0,9,10,13,13,32,32,256,0,1,1,0,0,
        0,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,
        13,1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,
        23,1,0,0,0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,
        33,1,0,0,0,0,35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,
        43,1,0,0,0,0,45,1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,
        53,1,0,0,0,0,55,1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,
        63,1,0,0,0,0,65,1,0,0,0,0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,0,0,
        73,1,0,0,0,0,75,1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,0,0,81,1,0,0,0,0,
        83,1,0,0,0,0,85,1,0,0,0,0,87,1,0,0,0,1,89,1,0,0,0,3,91,1,0,0,0,5,
        93,1,0,0,0,7,95,1,0,0,0,9,101,1,0,0,0,11,106,1,0,0,0,13,111,1,0,
        0,0,15,117,1,0,0,0,17,123,1,0,0,0,19,129,1,0,0,0,21,136,1,0,0,0,
        23,138,1,0,0,0,25,140,1,0,0,0,27,142,1,0,0,0,29,144,1,0,0,0,31,146,
        1,0,0,0,33,148,1,0,0,0,35,150,1,0,0,0,37,152,1,0,0,0,39,154,1,0,
        0,0,41,156,1,0,0,0,43,158,1,0,0,0,45,160,1,0,0,0,47,162,1,0,0,0,
        49,164,1,0,0,0,51,166,1,0,0,0,53,168,1,0,0,0,55,170,1,0,0,0,57,172,
        1,0,0,0,59,174,1,0,0,0,61,176,1,0,0,0,63,178,1,0,0,0,65,182,1,0,
        0,0,67,186,1,0,0,0,69,194,1,0,0,0,71,196,1,0,0,0,73,198,1,0,0,0,
        75,204,1,0,0,0,77,208,1,0,0,0,79,210,1,0,0,0,81,219,1,0,0,0,83,232,
        1,0,0,0,85,240,1,0,0,0,87,249,1,0,0,0,89,90,5,91,0,0,90,2,1,0,0,
        0,91,92,5,93,0,0,92,4,1,0,0,0,93,94,5,61,0,0,94,6,1,0,0,0,95,96,
        5,69,0,0,96,97,5,118,0,0,97,98,5,101,0,0,98,99,5,110,0,0,99,100,
        5,116,0,0,100,8,1,0,0,0,101,102,5,83,0,0,102,103,5,105,0,0,103,104,
        5,116,0,0,104,105,5,101,0,0,105,10,1,0,0,0,106,107,5,68,0,0,107,
        108,5,97,0,0,108,109,5,116,0,0,109,110,5,101,0,0,110,12,1,0,0,0,
        111,112,5,82,0,0,112,113,5,111,0,0,113,114,5,117,0,0,114,115,5,110,
        0,0,115,116,5,100,0,0,116,14,1,0,0,0,117,118,5,87,0,0,118,119,5,
        104,0,0,119,120,5,105,0,0,120,121,5,116,0,0,121,122,5,101,0,0,122,
        16,1,0,0,0,123,124,5,66,0,0,124,125,5,108,0,0,125,126,5,97,0,0,126,
        127,5,99,0,0,127,128,5,107,0,0,128,18,1,0,0,0,129,130,5,82,0,0,130,
        131,5,101,0,0,131,132,5,115,0,0,132,133,5,117,0,0,133,134,5,108,
        0,0,134,135,5,116,0,0,135,20,1,0,0,0,136,137,5,97,0,0,137,22,1,0,
        0,0,138,139,5,98,0,0,139,24,1,0,0,0,140,141,5,99,0,0,141,26,1,0,
        0,0,142,143,5,100,0,0,143,28,1,0,0,0,144,145,5,101,0,0,145,30,1,
        0,0,0,146,147,5,102,0,0,147,32,1,0,0,0,148,149,5,103,0,0,149,34,
        1,0,0,0,150,151,5,104,0,0,151,36,1,0,0,0,152,153,5,49,0,0,153,38,
        1,0,0,0,154,155,5,50,0,0,155,40,1,0,0,0,156,157,5,51,0,0,157,42,
        1,0,0,0,158,159,5,52,0,0,159,44,1,0,0,0,160,161,5,53,0,0,161,46,
        1,0,0,0,162,163,5,54,0,0,163,48,1,0,0,0,164,165,5,55,0,0,165,50,
        1,0,0,0,166,167,5,56,0,0,167,52,1,0,0,0,168,169,5,75,0,0,169,54,
        1,0,0,0,170,171,5,81,0,0,171,56,1,0,0,0,172,173,5,82,0,0,173,58,
        1,0,0,0,174,175,5,66,0,0,175,60,1,0,0,0,176,177,5,78,0,0,177,62,
        1,0,0,0,178,179,5,49,0,0,179,180,5,45,0,0,180,181,5,48,0,0,181,64,
        1,0,0,0,182,183,5,48,0,0,183,184,5,45,0,0,184,185,5,49,0,0,185,66,
        1,0,0,0,186,187,5,49,0,0,187,188,5,47,0,0,188,189,5,50,0,0,189,190,
        5,45,0,0,190,191,5,49,0,0,191,192,5,47,0,0,192,193,5,50,0,0,193,
        68,1,0,0,0,194,195,5,43,0,0,195,70,1,0,0,0,196,197,5,35,0,0,197,
        72,1,0,0,0,198,199,5,79,0,0,199,200,5,45,0,0,200,201,5,79,0,0,201,
        202,5,45,0,0,202,203,5,79,0,0,203,74,1,0,0,0,204,205,5,79,0,0,205,
        206,5,45,0,0,206,207,5,79,0,0,207,76,1,0,0,0,208,209,5,120,0,0,209,
        78,1,0,0,0,210,214,7,0,0,0,211,213,7,1,0,0,212,211,1,0,0,0,213,216,
        1,0,0,0,214,212,1,0,0,0,214,215,1,0,0,0,215,217,1,0,0,0,216,214,
        1,0,0,0,217,218,5,46,0,0,218,80,1,0,0,0,219,220,5,34,0,0,220,221,
        7,1,0,0,221,222,7,1,0,0,222,223,7,1,0,0,223,224,7,1,0,0,224,225,
        5,46,0,0,225,226,7,1,0,0,226,227,7,1,0,0,227,228,5,46,0,0,228,229,
        7,1,0,0,229,230,7,1,0,0,230,231,5,34,0,0,231,82,1,0,0,0,232,236,
        5,34,0,0,233,237,3,63,31,0,234,237,3,65,32,0,235,237,3,67,33,0,236,
        233,1,0,0,0,236,234,1,0,0,0,236,235,1,0,0,0,237,238,1,0,0,0,238,
        239,5,34,0,0,239,84,1,0,0,0,240,244,5,34,0,0,241,243,9,0,0,0,242,
        241,1,0,0,0,243,246,1,0,0,0,244,245,1,0,0,0,244,242,1,0,0,0,245,
        247,1,0,0,0,246,244,1,0,0,0,247,248,5,34,0,0,248,86,1,0,0,0,249,
        250,7,2,0,0,250,251,1,0,0,0,251,252,6,43,0,0,252,88,1,0,0,0,4,0,
        214,236,244,1,6,0,0
    ]

class PGNLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    EVENT = 4
    SITE = 5
    DATE = 6
    ROUND = 7
    WHITE = 8
    BLACK = 9
    RESULT = 10
    COLUMN_A = 11
    COLUMN_B = 12
    COLUMN_C = 13
    COLUMN_D = 14
    COLUMN_E = 15
    COLUMN_F = 16
    COLUMN_G = 17
    COLUMN_H = 18
    ROW_1 = 19
    ROW_2 = 20
    ROW_3 = 21
    ROW_4 = 22
    ROW_5 = 23
    ROW_6 = 24
    ROW_7 = 25
    ROW_8 = 26
    KING = 27
    QUEEN = 28
    ROOK = 29
    BISHOP = 30
    KNIGHT = 31
    WHITE_WIN = 32
    BLACK_WIN = 33
    TIE = 34
    CHECK = 35
    MATE = 36
    CASTLE_QUEEN = 37
    CASTLE_KING = 38
    TAKES = 39
    MOVE_NUMBER = 40
    QUOTED_DATE = 41
    QUOTED_RESULT = 42
    QUOTED_STRINGS = 43
    WS = 44

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'['", "']'", "'='", "'Event'", "'Site'", "'Date'", "'Round'", 
            "'White'", "'Black'", "'Result'", "'a'", "'b'", "'c'", "'d'", 
            "'e'", "'f'", "'g'", "'h'", "'1'", "'2'", "'3'", "'4'", "'5'", 
            "'6'", "'7'", "'8'", "'K'", "'Q'", "'R'", "'B'", "'N'", "'1-0'", 
            "'0-1'", "'1/2-1/2'", "'+'", "'#'", "'O-O-O'", "'O-O'", "'x'" ]

    symbolicNames = [ "<INVALID>",
            "EVENT", "SITE", "DATE", "ROUND", "WHITE", "BLACK", "RESULT", 
            "COLUMN_A", "COLUMN_B", "COLUMN_C", "COLUMN_D", "COLUMN_E", 
            "COLUMN_F", "COLUMN_G", "COLUMN_H", "ROW_1", "ROW_2", "ROW_3", 
            "ROW_4", "ROW_5", "ROW_6", "ROW_7", "ROW_8", "KING", "QUEEN", 
            "ROOK", "BISHOP", "KNIGHT", "WHITE_WIN", "BLACK_WIN", "TIE", 
            "CHECK", "MATE", "CASTLE_QUEEN", "CASTLE_KING", "TAKES", "MOVE_NUMBER", 
            "QUOTED_DATE", "QUOTED_RESULT", "QUOTED_STRINGS", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "EVENT", "SITE", "DATE", "ROUND", 
                  "WHITE", "BLACK", "RESULT", "COLUMN_A", "COLUMN_B", "COLUMN_C", 
                  "COLUMN_D", "COLUMN_E", "COLUMN_F", "COLUMN_G", "COLUMN_H", 
                  "ROW_1", "ROW_2", "ROW_3", "ROW_4", "ROW_5", "ROW_6", 
                  "ROW_7", "ROW_8", "KING", "QUEEN", "ROOK", "BISHOP", "KNIGHT", 
                  "WHITE_WIN", "BLACK_WIN", "TIE", "CHECK", "MATE", "CASTLE_QUEEN", 
                  "CASTLE_KING", "TAKES", "MOVE_NUMBER", "QUOTED_DATE", 
                  "QUOTED_RESULT", "QUOTED_STRINGS", "WS" ]

    grammarFileName = "PGN.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


