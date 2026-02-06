"\xBE" "\xBEE"

"\"hello\""
"Z\"\0\x4\?"

//solution allows X for hex escape
//solution only allows 2 hex digits
//solution does not have \" escape sequence
//Lexer inserting nothing for some invisble escape sequences, bell character, vertical tab
//$ diff -y --suppress-common-lines report.txt solution_report.txt


0X13 0x13
