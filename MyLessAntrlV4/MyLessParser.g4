/**
 * Define a grammar called MyLessParser
 */

parser grammar MyLessParser;

options { tokenVocab=MyLessLexer; }

stylesheet
    : statement*
    ;
    
statement
    : importStatement
    | variableStatement
    | ruleStatement
    ;
    
importStatement
    : IMPORT STRING_LITERAL SEMI
    ;
    
variableStatement
    : variableName COLON expressionStatement (COMMA expressionStatement)* SEMI
    ;
    
variableName
    : AT IDENT
    ;
    
measurement
    : NUMBER UNIT?
    ;
    
expressionStatement
    : expressionStatement (PLUS|MINUS|TIMES|DIV) expressionStatement
    | LPAREN expressionStatement RPAREN
    | (PLUS|MINUS) expressionStatement
    | variableName
    | functionCall
    | measurement
    | url
    | IDENT
    | STRING_LITERAL
    ;
    
ruleStatement
    : selectors block
    ;
    
selectors
    : selector (COMMA selector)*
    ;

selector
    : element+ (selectorPrefix element)* attrib* pseudo?
    ;

selectorPrefix
    : (GT | PLUS | TIL)
    ;

element
    : IDENT//identifier
    | HASH IDENT//identifier
    | DOT IDENT//identifier
    | AND
    | TIMES
    ;
    
pseudo
    : (COLON|COLONCOLON) IDENT//Identifier
    | (COLON|COLONCOLON) functionCall
    ;

attrib
    : LBRACK IDENT/*Identifier*/ (attribRelate (STRING_LITERAL | IDENT))? RBRACK
    ;

attribRelate
    : EQ
    | TILD_EQ
    | PIPE_EQ
    ;

block
    : LCURLY (property SEMI | statement)* property? RCURLY
    ;

property
    : element
    | IDENT COLON whiteSpaceSeparatedValues
    ;

functionCall
    : IDENT LPAREN commaSeparatedValues? RPAREN
    ;

commaSeparatedValues
    : expressionStatement (COMMA expressionStatement)*
    ;

whiteSpaceSeparatedValues
    : expressionStatement (expressionStatement)*
    ;

url
    : URL_START URL URL_END
    ;

color
    : HASH IDENT
    ;