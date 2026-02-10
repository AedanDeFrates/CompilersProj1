# ***CompilersProj1 - Lexer***
2/6/2026

### Group Members

- Aedan DeFrates
- Alex Hawk
- Lorenzo Jackson
- Joshua Walther

## Lexer Theory
### What is a Lexer?
The lexer is the first part of a compiler frontend. It takes in a text file, and converts the strings into equivalent tokens that the compiler can work with. These tokens can then be used by the parser to validate a languages grammar. These tokens are defined using REGEX expressions, which are transformed into Nondeterministic and Deterministic Finite Automata that validate if a string matches one of the tokens.

### What is ANTLR?
ANTLR is a lexer and parser generator that simplifies the process of writing a lexer. In our ANTLR file `gLexer.g4`, we can write rules that define our tokens using REGEX as well as some actions needed to process them correctly. Then, ANTLR will generate the respective Java code. ANTLR provides a mode feature that allows us to change what rules we are using based on certain contexts. A rule can allow us to enter a mode, and that mode can define a rule for when to exit it or transition to another mode. We can write a rule to skip characters we do not want tokenized

## How to run our project
To run our lexer, use the provided shell scripts and test files.
`./run.sh <test_file>`
`./test.sh`
or
`./run_solution.sh <test_file>`
to run the solution.
## Code Implementation

### Basic Tokens
For the basic tokens, they are defined with a simple one or two character REGEX like `ADD: '+';`. We matched the token names to those in the solution.

####  Operators
- LT: `<`
- AND: `&&`
- OR: `||`
- STAR: `*`
- ADD: `+`
- TILDE: `~`
- ASSIGN: `=`
- DOT: `.`
- ARROW: `->`
#### Keywords
- VAR: `var`
- FUN: `fun`
- WHILE: `while`
- CONST: `const`
- STRING: `string`
- VOID: `void`
- RETURN: `return`
- IF: `if`
- ELSE: `else`
- BREAK: `break`
- INT: `int`
- TYPEDEF: `typedef`
- STRUCT: `struct`
- UNION: `union`

#### Punctuators
- LCURLY: `{`
- RCURLY `}`
- LPAREN: `(`
- RPAREN `)`
- LSQUARE: `[`
- RSQUARE `]`
- COMMA: `,`
- BITWISEAND: `&`
- BITWISEOR: `|`
- NOT: `!`
- SEMICOLON:  `;`

We made sure that tokens like AND come before BITWISEAND in the file order, so that the double characters do not get read as two of their single character versions.

### Identifiers and Numbers

#### Identifiers
For identifiers we first defined fragments ALPHA and DIGIT which match a single letter and single decimal digit. Identifiers must start with a letter or underscore, follow by any number of numbers, letters, or underscores .

    ID : (ALPHA | '_')(DIGIT | ALPHA | '_')* ;

#### Decimal Literals
Decimal literals represent any number value, and include any Decimal, Octal, or Hex Constants. We created ANTLR fragments for these constants and as well as decimal(0-9), hex(0-9A-F), and octal digits(0-7)

For Constants, Decimals cannot have leading zeros, Octals must start with a zero, and hex must start with 0x or 0X. In the C documentation, Hex constants must have a lowercase x but the solution allows for x or X so we supported both.

- DECIMAL_CONST: `NONZERO_DIGIT)(DIGIT)* | (DIGIT)`
- OCTAL_CONST: `'0'(OCTAL_DIGIT)+`
- HEX_CONST: `'0'('x'|'X')(HEX_DIGIT)+`
- DECIMAL_LITERAL: `DECIMAL_CONST| OCTAL_CONST| HEX_CONST`

### Whitespaces and Comments
The lexer does not need to tokenize whitespace characters like blanks, tabs, return carriages and new lines. For these characters, we can tell ANTLR to skip over these like this:
`WHITESPACE : (' ' | '\t' | '\r')+ -> skip;`

#### Line and Block Comments
Like mentioned previously, ANTLR provides a mode feature that allows us to change what rules are valid in different contexts. We can use this feature to implement comments.

We don't want to tokenize comments since they are just for humans to see, so we want to skip them. This includes the text inside the comments which might normally be tokenized. To prevent this we created a Line Comment mode and Block Comment Mode, each with a rule that skips any character inside the comments:
`OTHER_CHARACTER_LINE : . -> skip ;`

We define rules for the start of a Line and Block Comment to enter their respective modes:

`START_LINE_COMMENT : '//' -> skip, pushMode(LINE_COMMENT_MODE);`
`START_BLOCK_COMMENT : '/*' -> skip, pushMode(BLOCK_COMMENT_MODE);`

We also need a rule to exit the mode. For line comments, the end is a `\n`, while for block comments the end is `*/`. This rule is placed first in the mode so that it is checked first before the rule that skips every character.

`END_LINE_COMMENT : '\n' -> skip, popMode;`  
`END_BLOCK_COMMENT : '*/' -> skip, popMode;`

### String Literals
For strings we also used an ANTLR mode. Even though a string token could easily be implemented using `"(.)+"` to support the vast majority of strings, this does not allow us to support escape sequences, and therefore we need to use a mode so that we can detect escape sequences and edit the string that will become the tokens value.

To modify the string being lexed before it becomes a token, we instantiate a StringBuilder object and extract the scanned string. Then with each character detected we can add it to the string. We define valid string characters using the S-Char fragment:
`S_CHAR: ~('"' | '\\' | '\n' | '\r')`

At the end of the string we take the built string and set the tokens value to it.

#### Escape Sequences
For escape sequences, we defined rules for simple escapes as well hex and octal characters, which take the string and convert it to the correct output before appending it to the string.

For simple escape sequences we defined and Escape_Sequence framgment, and a rule to detect them. We then remove the `\` from string and pass the escape character through a switch statement that appends the corresponding string. We support these simple escape sequences: `\n,` `\a`, `\b`, `\f`, `\r`, `\t`, `\v`, `\?`, `\\`, `\'`, `\"`.


Octal Escapes can have a max of three digits. We take the octal numbers string and convert them to an integer using the `Integer.parseInt()` method in java and convert that to the respective character.

For Hex escapes we limit it to a maximum of two digits like in the solution, although the C documentation accepts any number of digits, even if a ASCII character only takes two. For Hex we also convert the string value to an int and to the respective character like for the octals.

## Group Strategy and Issues Encountered
