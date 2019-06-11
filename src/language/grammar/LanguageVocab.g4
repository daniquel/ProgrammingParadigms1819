lexer grammar LanguageVocab;

EQ: 'gelijk aan';
GE: 'groter of gelijk aan';
GT: 'groter dan';
LE: 'kleiner of gelijk aan';
LT: 'kleiner dan';
NE: 'niet gelijk aan';

LCURLY: '{';
RCURLY: '}';
LPAR: '(';
RPAR: ')';
LSQ: '[';
RSQ: ']';

MINUS: 'min';
NOT: 'niet';
OR: 'of';
PLUS: 'plus';
AND: 'en';
ASSIGN: 'is';
TIMES: 'keer';


SEMI: ';';

BOOL: 'truefalsewaarde';
INT: 'getal';
VOID: 'niks';

WHILE: 'zolang dat';
IF: 'wanneer';
ELSE: 'anders';
TRUE: 'ja';
FALSE: 'nee';

FUNCTION: 'functie';
MAIN: 'voeruit';
JOIN: 'samenvoegen';
FORK: 'splitsen';
CLASS: 'klasse';
GLOBAL: 'globaal';


fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];

NUM: (DIGIT)+;
ID: LETTER (LETTER | NUM)*;
CHARACTER: '\'' (.)? '\'';

WS: [ \t\r\n]+ -> skip;