lexer grammar LessLexer;

NULL 			: 'null';

IN 				: 'in';

Unit			: ('%'|'px'|'cm'|'mm'|'in'|'pt'|'pc'|'em'|'ex'|'deg'|'rad'|'grad'|'ms'|'s'|'hz'|'khz');

COMBINE_COMPARE : '&&' | '||';

Ellipsis 		: '...';

InterpolationStart
  : HASH BlockStart -> pushMode(IDENTIFY)
  ;

//Separators
LPAREN          : '(';
RPAREN          : ')';
BlockStart      : '{';
BlockEnd        : '}';
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


UrlStart
  : 'url' LPAREN -> pushMode(URL_STARTED)
  ;


EQEQ            : '==';
NOTEQ           : '!=';


EQ              : '=';
PIPE_EQ         : '|=';
TILD_EQ         : '~=';


WHEN			: 'when';
IMPORT          : '@import';
FONTFACE		: '@font-face';


Identifier
	:	(('_' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' )
		('_' | '-' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' | '0'..'9')*
	|	'-' ('_' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' )
		('_' | '-' | 'a'..'z'| 'A'..'Z' | '\u0100'..'\ufffe' | '0'..'9')*) -> pushMode(IDENTIFY)
	;


fragment STRING
  	:	'"' (~('"'|'\n'|'\r'))* '"'
  	|	'\'' (~('\''|'\n'|'\r'))* '\''
  	;

// string literals
StringLiteral
	:	STRING
	;


Number
	:	'-' (('0'..'9')* '.')? ('0'..'9')+
	|	(('0'..'9')* '.')? ('0'..'9')+
	;

Color
	:	'#' ('0'..'9'|'a'..'f'|'A'..'F')+
	;


// Whitespace -- ignored
WS
  : ' '+ -> channel(HIDDEN)
  ;

NL
  : ('\t'|'\n'|'\r'|'\r\n')+ -> channel(HIDDEN)
  ;

// Single-line comments -ignored
SL_COMMENT
	:	'//'
		(~('\n'|'\r'))* ('\n'|'\r'('\n')?) -> skip
	;


// multiple-line comments - ignored
COMMENT
	:	'/*' .*? '*/' -> skip
	;

mode URL_STARTED;
UrlEnd			: RPAREN -> popMode;
Url             :	STRING | (~(')' | '\n' | '\r' | ';'))+;

mode IDENTIFY;
SPACE_ID        : WS -> popMode, type(WS), channel(HIDDEN);
NEW_LINE_ID     : NL -> popMode, type(NL), channel(HIDDEN);
DOLLAR_ID       : DOLLAR -> type(DOLLAR);

InterpolationStartAfter  : InterpolationStart;
InterpolationEnd_ID    : BlockEnd -> type(BlockEnd);

IdentifierAfter	: Identifier;
Ellipsis_ID     : Ellipsis -> popMode, type(Ellipsis);
DOT_ID          : DOT -> popMode, type(DOT);

LPAREN_ID       : LPAREN -> popMode, type(LPAREN);
RPAREN_ID       : RPAREN -> popMode, type(RPAREN);

COLON_ID        : COLON -> popMode, type(COLON);
COMMA_ID        : COMMA -> popMode, type(COMMA);
SEMI_ID         : SEMI -> popMode, type(SEMI);