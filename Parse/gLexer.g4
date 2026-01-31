
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
fragment HEXADECIMAL_DIGIT
   : [0-9A-Fa-f]
   ;


// \n \t \xHH \777 etc
fragment ESCAPE_SEQUENCE
   : '\\' ( '"' | '\'' | '?' | '\\' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' )
   | '\\' 'x' HEXADECIMAL_DIGIT+
   | '\\' [0-7] [0-7]? [0-7]?
   ;

// one character inside a string (either normal char or escape)
fragment S_CHAR
   : ~[\u0022\\\n\r]
   | ESCAPE_SEQUENCE
   ;

fragment S_CHAR_SEQUENCE
   : S_CHAR+
   ;

// see " then go into string mode
OPEN_STRING
   : '"' { sb = new StringBuilder(); } -> pushMode(STRING_MODE), skip
   ;

WS
   : [ \t\n\r]+ -> skip
   ;

ADD 
   : '+'
   ;

mode STRING_MODE;
STRING_LITERAL
   : '"' { setText(sb.toString()); } -> popMode
   ;
STRING_CHAR
   : S_CHAR { sb.append(getText()); } -> skip
   ;
