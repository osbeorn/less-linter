parser grammar LessParser;

options { tokenVocab=LessLexer; }

stylesheet
	: statement*
	;

statement
  	: importDeclaration
  	| nested
  	| ruleset
//  | mixinDeclaration -- TODO
//  | functionDeclaration
  	| variableDeclaration
  	;

//Params to mixins, includes, etc
params
  	: param (COMMA param)* Ellipsis?
  	;

param
  	: variableName paramOptionalValue?
  	;

variableName
  	: AT Identifier
  	;

paramOptionalValue
	: COLON expression+
  	;


//MIXINS - TODO

//FUNCTIONS
//functionDeclaration
//  : '@function' Identifier LPAREN params? RPAREN BlockStart functionBody? BlockEnd
//  ;
//
//functionBody
//  : functionStatement* functionReturn
//  ;
//
//functionReturn
//  : '@return' commandStatement ';'
//  ;
//
//functionStatement
//  : commandStatement ';' | statement
//  ;
//
//
commandStatement
  	: (expression+ | LPAREN commandStatement RPAREN) mathStatement?
  	;

mathCharacter
  	: TIMES | PLUS | DIV | MINUS | PERC
  	;

mathStatement
    : mathCharacter commandStatement
    | LPAREN (PLUS|MINUS)* mathStatement RPAREN
//  	| mathCharacter? commandStatement (mathCharacter commandStatement)*
//  	| LPAREN mathCharacter? commandStatement (mathCharacter commandStatement)* RPAREN
  	;

expression
  	: measurement
  	| identifier
  	| Color
  	| StringLiteral
  	| NULL
  	| url
  	| variableName
  	| functionCall
  	;

variableDeclaration
  	: variableName COLON values SEMI
  	;

//Imports
importDeclaration
	: IMPORT referenceUrl mediaTypes? SEMI
	;

referenceUrl
    : StringLiteral
    | UrlStart Url UrlEnd
    ;


mediaTypes
  	: (Identifier (COMMA Identifier)*)
  	;

//Nested (stylesheets, etc)
nested
 	: AT nest selectors BlockStart stylesheet BlockEnd
	;

nest
	: (Identifier | AND) Identifier* pseudo*
	;

//Rules
ruleset
 	: selectors block
	;

block
  	: BlockStart (property SEMI | statement)* property? BlockEnd
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
	: identifier
  	| HASH identifier
  	| DOT identifier
  	| AND
  	| TIMES
	;

pseudo
	: (COLON|COLONCOLON) Identifier
	| (COLON|COLONCOLON) functionCall
	;

attrib
	: LBRACK Identifier (attribRelate (StringLiteral | Identifier))? RBRACK
	;

attribRelate
	: EQ
	| TILD_EQ
	| PIPE_EQ
	;

identifier
  	: Identifier identifierPart*
  	| InterpolationStart identifierVariableName BlockEnd identifierPart*
  	;

identifierPart
  	: InterpolationStartAfter identifierVariableName BlockEnd
  	| IdentifierAfter
  	;
identifierVariableName
  	: DOLLAR (Identifier | IdentifierAfter)
 	;

property
	: element
	| identifier COLON values
	;

values
	: commandStatement (COMMA commandStatement)*
	;

url
  	: UrlStart Url UrlEnd
  	;

measurement
 	: Number Unit?
  	;

functionCall
	: Identifier LPAREN values? RPAREN
	;