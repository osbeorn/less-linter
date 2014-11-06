/**
 * Define a grammar called MyLessParser
 */

parser grammar MyLessParser;

options {
    tokenVocab=MyLessLexer;
}

stylesheet
    : statement* EOF
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
    : variableName COLON commaValues SEMI
    ;
    
variableName
    : AT IDENT
    ;
    
measurement
    : NUMBER UNIT?
    ;

expression
    : variableName
    | functionCall
    | measurement
    | color
//    | url
//    | format
    | IDENT
    | STRING_LITERAL
    | NULL
    ;
    
expressionStatement
    : expressionStatement mathCharacter expressionStatement
    | LPAREN expressionStatement RPAREN
    | mathPrefixCharacter expressionStatement
    | expression
    ;
    
mathCharacter
    : PLUS
    | MINUS
    | TIMES
    | DIV
    ;
    
mathPrefixCharacter
    : PLUS
    | MINUS
    ;
    
ruleStatement
    : selectors block
    ;
    
selectors
    : selector (COMMA selector)*
    ;

selector
    : element* (selectorPrefix element)* attrib* pseudo* mixin?
    ;

mixin
    : LPAREN mixinParams? RPAREN
    ;

mixinParams
    : mixinParam (COMMA mixinParam)*
    ;

mixinParam
    : mixinParamName (COLON values)?
    ;

mixinParamName
    : IDENT
    | variableName
    ;

selectorPrefix
    : (GT | PLUS | TIL)
    ;

element
    : IDENT//identifier
    | HASH IDENT//identifier
    | DOT IDENT//identifier
    | AT IDENT
    | AND
    | TIMES
    | FONTFACE
    | measurement
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
//    : element
    : mixinCall
    | IDENT COLON propertyValues
    ;

propertyValues
    : values (COMMA values)* 
    ;

mixinCall
    : element (LPAREN callParams? RPAREN)?
    ;

functionCall
    : IDENT LPAREN callParams? RPAREN
    ;

callParams
    : callParam (COMMA callParam)*
    ;

callParam
    : values
    ;

// comma separated values
commaValues
    : expressionStatement (COMMA expressionStatement)*
    ;

// whitespace separated values
values
    : expressionStatement expressionStatement*
    ;

//url_format
//    : URL FORMAT (COMMA URL FORMAT)* SEMI
//    ;

//url
//    : URL_START URL URL_END
//    ;

//format
//    : FORMAT_START FORMAT FORMAT_END
//    ;

color
    : HASH (IDENT | NUMBER)
    ;