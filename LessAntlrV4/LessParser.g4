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
  	: (expression+ | '(' commandStatement ')') mathStatement?
  	;

mathCharacter
  	: TIMES | PLUS | DIV | MINUS | PERC
  	;

mathStatement
  	: mathCharacter commandStatement
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
  	: variableName COLON values ';'
  	;


//Imports
importDeclaration
	: '@import' referenceUrl mediaTypes? ';'
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
 	: '@' nest selectors BlockStart stylesheet BlockEnd
	;

nest
	: (Identifier | '&') Identifier* pseudo*
	;



//Rules
ruleset
 	: selectors block
	;

block
  	: BlockStart (property ';' | statement)* property? BlockEnd
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
  	| '#' identifier
  	| '.' identifier
  	| '&'
  	| '*'
	;

pseudo
	: (COLON|COLONCOLON) Identifier
	| (COLON|COLONCOLON) functionCall
	;

attrib
	: '[' Identifier (attribRelate (StringLiteral | Identifier))? ']'
	;

attribRelate
	: '='
	| '~='
	| '|='
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