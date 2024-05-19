grammar PGN;

game: game_info* move_text result;

game_info: TAG_NAME STRING;

move_text: move_pair+;

move_pair: MOVE_NUMBER white_move black_move?;

white_move: move;

black_move: move;

move: piece disambiguation? takes? square
     | pawn_move
     | castle_kingside
     | castle_queenside
     | move check
     | move mate;

pawn_move: square
         | column takes square
         | pawn_move promotion;
         

piece: 'K' | 'Q' | 'R' | 'B' | 'N';

disambiguation: column | row | column row;

column: 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h';

row: '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8';

square: column row;

takes: 'x';

promotion: '=' piece;

check: '+';

mate: '#';

castle_kingside: 'O-O';

castle_queenside: 'O-O-O';

result: '1-0' | '0-1' | '1/2-1/2';

TAG_NAME: [A-Za-z0-9_]+;
STRING: '"' .*? '"';
MOVE_NUMBER: [1-9] [0-9]* '.';

WS: [ \t\n\r]+ -> skip;
