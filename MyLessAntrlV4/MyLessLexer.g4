/**
 * Define a grammar called MyLessLexer
 */
lexer grammar MyLessLexer;

NULL            : 'null';

IN              : 'in';

UNIT            : ('%'|'px'|'cm'|'mm'|'in'|'pt'|'pc'|'em'|'ex'|'deg'|'rad'|'grad'|'ms'|'s'|'hz'|'khz');

COMBINE_COMPARE : '&&' | '||';

ELLIPSIS        : '...';

//Separators
LPAREN          : '(';
RPAREN          : ')';
LCURLY          : '{';
RCURLY          : '}';
LBRACK          : '[';
RBRACK          : ']';
GT              : '>';
TIL             : '~';
LT              : '<';
COLON           : ':';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
DOLLAR          : '$';
AT              : '@';
AND             : '&';
HASH            : '#';
COLONCOLON      : '::';
PLUS            : '+';
TIMES           : '*';
DIV             : '/';
MINUS           : '-';
PERC            : '%';
QUOT            : '"';

INTERPOLATION_START
  : '@{' -> pushMode(INTERPOLATION_STARTED)
  ;

//URL_START
//    : 'url' LPAREN -> pushMode(URL_STARTED)
//    ;
  
//FORMAT_START
//    : 'format' LPAREN -> pushMode(FORMAT_STARTED)
//    ;

EQEQ            : '==';
NOTEQ           : '!=';
GTEQ            : '>=';
LTEQ            : '<=';
ANDW            : 'and';
NOTW            : 'not';

EQ              : '=';
PIPE_EQ         : '|=';
TILD_EQ         : '~=';

WHEN            : 'when';
IMPORT          : '@import';
IMPORTANT       : '!important';

//SRC             : 'src';

IDENT
    :   (('_' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' )
        ('_' | '-' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' | '0'..'9')*
    |   '-' ('_' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' )
        ('_' | '-' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' | '0'..'9')*)
    ;


fragment STRING
    :   '"' (~('"'|'\n'|'\r'))* '"'
    |   '\'' (~('\''|'\n'|'\r'))* '\''
    ;

// string literals
STRING_LITERAL
    :   STRING
    ;

NUMBER
    :   '-' (('0'..'9')* '.')? ('0'..'9')+
    |   (('0'..'9')* '.')? ('0'..'9')+
    ;

WS
  : (' '|'\t')+ -> channel(HIDDEN)
  ;

NL
  : ('\n'|'\r'|'\r\n')+ -> channel(HIDDEN)
  ;

SL_COMMENT
    :   '//'
        (~('\n'|'\r'))* ('\n'|'\r'('\n')?) -> skip
    ;

ML_COMMENT
    :   '/*' .*? '*/' -> skip
    ;
    
mode INTERPOLATION_STARTED;
INTERPOLATION_END : RCURLY -> popMode;
INTERPOLATION : IDENT;
    
//mode URL_STARTED;
//URL_END : RPAREN -> popMode;
//URL     : STRING | (~(')' | '\n' | '\r' | ';'))+;

//mode FORMAT_STARTED;
//FORMAT_END : RPAREN -> popMode;
//FORMAT : STRING | (~(')' | '\n' | '\r' | ';'))+;
