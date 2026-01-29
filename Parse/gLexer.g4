
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

//===========================
//      OPERATORS
//===========================
ADD 
   : '+'
   ;

//===========================
//      PUNCTUATORS
//===========================
LCURLY
    : '{'
    ;
RCURLY
    : '}'
    ;
LPARENTHESIS
    : '('
    ;
RPARENTHESIS
    : ')'
    ;
LSQUARE
    : '['
    ;
RSQUARE
    : ']'
    ;
COMMA
    : ','
    ;
AMPERSAND
    : '&'
    ;
PIPE
    : '|'
    ;
EXCLAMATION
    : '!'
    ;
TILDE
    : '~'
    ;
SEMICOLON
    : ';'
    ;

