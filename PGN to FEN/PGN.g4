grammar PGN;

/* Tokens */

EVENT: 'Event';
SITE: 'Site';
DATE: 'Date';
ROUND: 'Round';
WHITE: 'White';
BLACK: 'Black';
RESULT: 'Result';
COLUMN_A: 'a';
COLUMN_B: 'b';
COLUMN_C: 'c';
COLUMN_D: 'd';
COLUMN_E: 'e';
COLUMN_F: 'f';
COLUMN_G: 'g';
COLUMN_H: 'h';
ROW_1: '1';
ROW_2: '2';
ROW_3: '3';
ROW_4: '4';
ROW_5: '5';
ROW_6: '6';
ROW_7: '7';
ROW_8: '8';
KING: 'K';
QUEEN: 'Q';
ROOK: 'R';
BISHOP: 'B';
KNIGHT: 'N';
WHITE_WIN: '1-0';
BLACK_WIN: '0-1';
TIE: '1/2-1/2';
CHECK: '+';
MATE: '#';
CASTLE_QUEEN: 'O-O-O';
CASTLE_KING: 'O-O';
TAKES: 'x';
MOVE_NUMBER: [1-9] [0-9]* '.';
QUOTED_DATE: '"' [0-9][0-9][0-9][0-9] '.' [0-9][0-9] '.' [0-9][0-9] '"';
QUOTED_RESULT: '"' (WHITE_WIN | BLACK_WIN | TIE) '"';
QUOTED_STRINGS: '"' .*? '"';
WS:(' ' | '\t' | '\n' | '\r') -> skip;

/* Grammar */

game_info: ('[' info ']')*;
info: info_event | info_site | info_date | info_round | info_white | info_black | info_result;
info_event: EVENT QUOTED_STRINGS;
info_site: SITE QUOTED_STRINGS;
info_date: DATE QUOTED_DATE;
info_round: ROUND QUOTED_STRINGS;
info_white: WHITE QUOTED_STRINGS;
info_black: BLACK QUOTED_STRINGS;
info_result: RESULT QUOTED_RESULT;
column: COLUMN_A | COLUMN_B | COLUMN_C | COLUMN_D | COLUMN_E | COLUMN_F | COLUMN_G | COLUMN_H;
row: ROW_1 | ROW_2 | ROW_3 | ROW_4 | ROW_5 | ROW_6 | ROW_7 | ROW_8;
square: column row;
disambiguation: square_disambiguation | column_disambiguation | row_disambiguation;
square_disambiguation: column_disambiguation row_disambiguation;
column_disambiguation: column;
row_disambiguation: row;
square_destination: square;
piece: QUEEN | ROOK | BISHOP | KNIGHT | KING;
promotion: '=' (QUEEN | ROOK | BISHOP | KNIGHT);
castle_kingside: CASTLE_KING;
castle_queenside: CASTLE_QUEEN;
castle: castle_kingside | castle_queenside;
result: WHITE_WIN | BLACK_WIN | TIE;
game: game_info move_text;
move_text: move_pair* last_moves result?;
move_pair: MOVE_NUMBER white_move black_move;
last_moves: MOVE_NUMBER white_move black_move?;
white_move: move check_state?;
black_move: move check_state?;
move: castle | pawn_move promotion? | piece disambiguation? TAKES? square_destination;
pawn_move: square_destination | column_disambiguation TAKES square_destination;
check_state: CHECK | MATE;