
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        ANTLRInputStream aStream;

        C2JavaVisitor c2Java;

        if (args.length == 0){
            aStream = new ANTLRInputStream(System.in);
            c2Java = new C2JavaVisitor();
        }
        else {
            String inFile = args[0];
            aStream = new ANTLRFileStream(inFile);
            if (args.length > 1){
                c2Java = new C2JavaVisitor(inFile, args[1]);
            }
            else {
                c2Java = new C2JavaVisitor(inFile);
            }
        }

        HeadersGrammarLexer lexer = new HeadersGrammarLexer(aStream);
        TokenStream stream = new CommonTokenStream(lexer);
        HeadersGrammarParser parser = new HeadersGrammarParser(stream);
        c2Java.visit(parser.header());

    }
}

