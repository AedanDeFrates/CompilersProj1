
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

//===========================
//         Fragments
//===========================

fragment ALPHA              : [A-Za-z] ;
fragment DIGIT              : [0-9] ;
fragment NONZERO_DIGIT      : [1-9] ;
fragment DECIMAL_CONSTANT   : NONZERO_DIGIT DIGIT* ;
fragment OCTAL_DIGIT        : [0-7] ;
fragment OCTAL_CONSTANT     : '0' OCTAL_DIGIT* ;
fragment HEX_DIGIT          : [0-9] | [A-F] ;

//===========================
//    Operators (Aedan)
//===========================
LT          : '<' ;
AND         : '&&' ;
OR          : '||' ;
MULT        : '*' ;
PLUS        : '+' ;
BITNOT      : '~' ;
EQUALS      : '=' ;
DOT         : '.' ;
ARROW       : '->' ;

//===========================
//  Keywords (Aedan/Joshua)
//===========================
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

//===========================
//       Punctuators
//===========================
LCURLY          : '{' ;
RCURLY          : '}' ;
LPARENTHESIS    : '(' ;
RPARENTHESIS    : ')' ;
LSQUARE         : '[' ;
RSQUARE         : ']' ;
COMMA           : ',' ;
AMPERSAND       : '&' ;
PIPE            : '|' ;
EXCLAMATION     : '!' ;
TILDE           : '~' ;
SEMICOLON       : ';' ;

//===========================
//        Integers
//===========================
DECIMAL_LITERAL    : ('-')?(NONZERO_DIGIT)(DIGIT)+ ;
OCTAL_LITERAL      : '0'(OCTAL_DIGIT)+ ;
HEX_LITERAL        : '0x'(HEX_DIGIT)+ ;

//===========================
//   Identifiers (Alex)
//===========================
IDENTIFIER     : [a-zA-Z_] [a-zA-Z_0-9]* ;

