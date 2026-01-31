
package Parse;
import Parse.antlr_build.*;
import org.antlr.v4.runtime.*;

public class LexerDriver {

    public static void main(String[] args) throws Exception {

        // read input file from command line
        CharStream input = CharStreams.fromFileName(args[0]);
        gLexer lexer = new gLexer(input);

        // print each token until EOF
        Token token;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            System.out.printf(
                "%-15s %-10s line=%d col=%d%n",
                gLexer.VOCABULARY.getSymbolicName(token.getType()),
                token.getText(),
                token.getLine(),
                token.getCharPositionInLine()
            );
        }
      System.out.println("EOF");
    }
}
