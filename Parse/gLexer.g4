
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
fragment ALPHA              : [A-Za-z] ;
fragment DIGIT              : [0-9] ;
fragment NONZERO_DIGIT      : [1-9] ;
fragment DECIMAL_CONSTANT   : (NONZERO_DIGIT)(DIGIT)* | (DIGIT) ;
fragment OCTAL_DIGIT        : [0-7] ;
fragment OCTAL_CONSTANT     : '0'(OCTAL_DIGIT)+ ;
fragment HEX_DIGIT          : [0-9] | [A-Fa-f] ;
fragment HEX_CONSTANT       : '0x'(HEX_DIGIT)+ ;

fragment ESCAPE_SEQUENCE    : '\\' ( '"' | '\''| '\\' | '?' | 'a' | 'b' | 'f' | 'n' | 'r' | 't' | 'v' ) ;
fragment ESCAPE_HEX         : '\\' 'x' (HEX_DIGIT)+ ;
fragment ESCAPE_OCTAL       : '\\' OCTAL_DIGIT | OCTAL_DIGIT? | OCTAL_DIGIT? ;

fragment S_CHAR             : ~('"' | '\\' | '\n' | '\r');

//Comments (Aedan/Joshua)
START_LINE_COMMENT   : '//' -> skip, pushMode(LINE_COMMENT_MODE);
START_BLOCK_COMMENT  : '/*' -> skip, pushMode(BLOCK_COMMENT_MODE);


//WhiteSpace, NewLine (Joshua/Aedan)
WHITESPACE  : (' ' | '\t' | '\r')+ -> skip;
NEWLINE     : '\n' -> skip;

//Integers (Joshua)
DECIMAL_LITERAL : DECIMAL_CONSTANT | OCTAL_CONSTANT | HEX_CONSTANT ;
START_STRING_LITERAL  : ('"') {sb = new StringBuilder();} -> skip, pushMode(STRING_READ_MODE);


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
    END_LINE_COMMENT        : '\n' -> skip, popMode;
    OTHER_CHARACTER_LINE    : . -> skip ;

//Block Comment Mode
mode BLOCK_COMMENT_MODE;
    END_BLOCK_COMMENT       : '*/' -> skip, popMode;
    OTHER_CHARACTER_BLOCK   : . -> skip ;

//String Read Mode
mode STRING_READ_MODE;
    STRING_LITERAL          : '"' {setText(sb.toString());} ->  popMode ;
    READ_S_CHAR             : S_CHAR {sb.append(getText().toString());} -> skip ;
    READ_ESCAPE : ESCAPE_SEQUENCE 
{
    String s = getText().substring(1);
    switch(s)
    {
        case "n" : {s = "\n"; break;}
        case "a" : {s = "" ; break;}
        case "b" : {s = "\b"; break;}
        case "f" : {s = "\f"; break;}
        case "r" : {s = "\r"; break;}
        case "t" : {s = "\t"; break;}
        case "v" : {s = ""; break;}
        case "?" : {s = "?"; break;}
        case "\"" : {s = "\""; break;}
        case "\'" : {s = "\'"; break;}
        case "\\" : {s = "\\"; break;}
    }
    sb.append(s);
                                       } -> skip;
    READ_HEX : ESCAPE_HEX {} -> skip;
    READ_OCT : ESCAPE_OCT {} -> skip;










