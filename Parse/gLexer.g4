
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
fragment NONZERO_DIGIT
   : [1-9]
   ;
fragment OCTAL_DIGIT
   : [0-7]
   ;
fragment HEX_DIGIT
   : [0-9] | [A-F]
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

//===========================
//      INTEGERS
//===========================
DECIMAL_LITERAL
    : ('-')?(NONZERO_DIGIT)(DIGIT)+
    ;
OCTAL_LITERAL
    : '0'(OCTAL_DIGIT)+
    ;
HEX_LITERAL
    : '0x'(HEX_DIGIT)+
    ;

