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
    | mediaStatement
    ;
    
mediaStatement
    : MEDIA mediaQueryList block
    ;    
    
mediaQueryList
    : mediaQuery (COMMA mediaQuery)* 
    ;
    
mediaQuery
    : (ONLY | NOTW)? IDENT (ANDW mediaQueryExpression)*
    | mediaQueryExpression (ANDW mediaQueryExpression)* 
    ;
    
mediaQueryExpression
    : IDENT
    | LPAREN IDENT COLON expressionStatement RPAREN
    ;
    
importStatement
    : IMPORT keyword? STRING_LITERAL SEMI
    ;
    
keyword
    : LPAREN IDENT RPAREN
    ;
    
variableStatement
    : variableName COLON commaValues SEMI
    ;
    
variableName
    : AT IDENT
    | MEDIA
    ;
    
measurement
    : NUMBER UNIT?
    ;

expression
    : variableName
    | functionCall
    | measurement
    | color
    | element
//    | url
//    | format
    | IDENT
    | STRING_LITERAL
    | NULL
    ;
    
expressionStatement
    : expressionStatement mathCharacter expressionStatement
    | expressionStatement boolCharacter expressionStatement
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

boolCharacter
    : GT
    | LT
    | GTEQ
    | LTEQ
    | EQ
    | NOTEQ
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
    : element* (selectorPrefix element)* attrib* pseudo*
    | element* (selectorPrefix element)* mixin? mixinGuards?
    ;

mixin
    : LPAREN mixinParams? RPAREN
    ;

mixinGuards
    : WHEN mixinGuardsList
    ;

mixinGuardsList
    : mixinGuard (ANDW mixinGuard)*
    | mixinGuard (COMMA mixinGuard)*
    ;
    
mixinGuard
    : NOTW? LPAREN expressionStatement RPAREN
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
    : IDENT
    | HASH IDENT
    | DOT IDENT
    | AT IDENT
    | AND
    | TIMES
    | measurement
    ;
    
pseudo
    : (COLON|COLONCOLON) (IDENT|NOTW)
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
    : LCURLY (property SEMI | statement)* RCURLY
    ;

property
    : mixinCall IMPORTANT?
    | propertyIdent COLON propertyValues IMPORTANT?
    ;

propertyStatement
    : propertyIdent COLON propertyValues IMPORTANT?
    ;

propertyIdent
    : IDENT
    | IDENT? varInterpolation IDENT?
    ;

varInterpolation
    : INTERPOLATION_START INTERPOLATION INTERPOLATION_END
    ;

propertyValues
    : values (COMMA values)* 
    ;

mixinCall
    : element (LPAREN callParams? RPAREN)?
    ;

functionCall
    : (IDENT|NOTW) LPAREN callParams? RPAREN
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
    : HASH (IDENT | NUMBER)+
    ;