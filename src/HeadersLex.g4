lexer grammar HeadersLex;

TYPE: 'int' | 'float' | 'double' | 'char';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
COMMENT: '/*' ~('*')* '*/' | '//' (~[\n\r])*;
PREPROCESSOR: '#' (~[\n\r])+ -> skip;

WS: ([ \n\r])+ -> skip;
