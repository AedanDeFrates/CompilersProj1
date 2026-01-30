
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

fragment ALPHA 
   : [A-Za-z]
   ;
fragment DIGIT
   : [0-9]
   ;

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
