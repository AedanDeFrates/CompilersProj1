
lexer grammar gLexer;

@header {
   package Parse.antlr_build;
}


@members {
   StringBuilder sb;
   private int stringToInt(String target) {
      // TODO: Implement me!
      return 0;
   }
}

//Fragments
fragment ALPHA : [A-Za-z] ;
fragment DIGIT : [0-9] ;
fragment NONZERO_DIGIT : [1-9] ;
fragment OCTAL_DIGIT : [0-7] ;
fragment HEX_DIGIT : [0-9] | [A-Fa-f] ;
fragment S_CHAR : ~('"' | [\] | [\n]) ;


//Comments (Aedan/Joshua)
START_LINE_COMMENT   : '//' -> pushMode(LINE_COMMENT_MODE);
START_BLOCK_COMMENT  : '/*' -> pushMode(BLOCK_COMMENT_MODE);


//WhiteSpace, NewLine (Joshua/Aedan)
WHITESPACE  : (' ' | '\t' | '\r') -> skip;
NEW_LINE    : '\n' ;

//Integers (Joshua)
DECIMAL_LITERAL : (NONZERO_DIGIT)(DIGIT)* | (DIGIT) ;
OCTAL_LITERAL   : '0'(OCTAL_DIGIT)+ ;
HEX_LITERAL     : '0x'(HEX_DIGIT)+ ;
STRING_LITERAL  : ('"')(S_CHAR)*('"') ;


//Operators (Aedan)
LT          : '<' ;
AND         : '&&' ;
OR          : '||' ;
MULT        : '*' ;
PLUS        : '+' ;
BITNOT      : '~' ;
EQUALS      : '=' ;
DOT         : '.' ;
ARROW       : '->' ;

//Keywords (Aedan/Joshua)
VAR         : 'var' ;
FUN         : 'fun' ;
WHILE       : 'while' ;
CONST       : 'const' ;
STRING      : 'string' ;
VOID        : 'void' ;
RETURN      : 'return' ;
IF          : 'if' ;
ELSE        : 'else' ;
BREAK       : 'break' ;
INT         : 'int' ;
TYPEDEF     : 'typedef' ;
STRUCT      : 'struct' ;
UNION       : 'union' ;

//Punctuators
LCURLY      : '{' ;
RCURLY      : '}' ;
LPARENTHESIS: '(' ;
RPARENTHESIS: ')' ;
LSQUARE     : '[' ;
RSQUARE     : ']' ;
COMMA       : ',' ;
AMPERSAND   : '&' ;
PIPE        : '|' ;
EXCLAMATION : '!' ;
SEMICOLON   : ';' ;

//Identifiers (Joshua/Aedan)
ID          : (ALPHA | '_')(DIGIT | ALPHA | '_')* ;

//Line Comment Mode
mode LINE_COMMENT_MODE;
    END_LINE_COMMENT    : [\n] -> popMode;
    OTHER_CHARACTER_LINE : . -> skip ;

//Block Comment Mode
mode BLOCK_COMMENT_MODE;
    END_BLOCK_COMMENT   : '*/' -> popMode;
    OTHER_CHARACTER_BLOCK : . -> skip ;

//String Read Mode
