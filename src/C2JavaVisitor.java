import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class C2JavaVisitor extends HeadersGrammarBaseVisitor {
    private final String _headersFileName;
    private final PrintWriter _out;

    private C2JavaVisitor(String headersFileName, OutputStream out){
        String baseName = new File(headersFileName).getName();
        _headersFileName = baseName.replaceAll("[.].*", "");
        _out = new PrintWriter(out);
    }

    public C2JavaVisitor(){
        this("CHeader", System.out);
    }

    public C2JavaVisitor(String headersFileName){
        this(headersFileName, System.out);
    }

    @Override
    public Object visitHeader(HeadersGrammarParser.HeaderContext ctx) {
        _out.println("public interface " + _headersFileName + "{");

        super.visitHeader(ctx);

        _out.println("}");
        _out.flush();

        return null;
    }

    public C2JavaVisitor(String _headersFileName, String outName)
            throws FileNotFoundException {
        this(_headersFileName, new FileOutputStream(new File(outName)));
    }

    @Override
    public Object visitComm(HeadersGrammarParser.CommContext ctx) {
        String commentText = ctx.getText();
        _out.println("  " + commentText);

        return null;
    }


    @Override
    public Object visitDeclaration(HeadersGrammarParser.DeclarationContext ctx) {

        StringBuffer javaDecl = new StringBuffer("  public ");

        /* by visiting type node in parse tree we convert the information
           present in type node to something more useful, i.e. our Type
           class
         */
        Type retType = (Type)visit(ctx.ret_type());

        javaDecl.append(retType.toString() + " ");
        javaDecl.append(ctx.IDENTIFIER().getText() + "(");

        // part up to argument list is now done.

        /* Visiting arguments rule will give us a list of
          (Type, identifier) pairs. Java still does not have
          appropriate tuple type, thus the ugly code and casts :(
         */
        List<Object[]> typeIdentifierPairs =
                (List<Object[]>) visit(ctx.arguments());

        if (typeIdentifierPairs.size() > 0) {
            javaDecl.append(typeIdentifierPairs.get(0)[0] + " " +
                            typeIdentifierPairs.get(0)[1]);


            typeIdentifierPairs.stream().skip(1) // skipping the one that we processed
                    .forEach(pair -> {
                        javaDecl.append(", " + ((Type) pair[0]).toString() + " ");
                        javaDecl.append(pair[1]);
                    });
        }

        javaDecl.append(");");

        _out.println(javaDecl.toString());

        return null;
    }

    @Override
    public Type visitVoidRet(HeadersGrammarParser.VoidRetContext ctx) {
        return new Type("void");
    }

    @Override
    public Object visitType(HeadersGrammarParser.TypeContext ctx) {
        String typeName = ctx.TYPE().getText();
        int starNr = ctx.getChildCount() - 1; // 1 child is type name

        return new Type(typeName, starNr);
    }

    @Override
    public Object visitArglist(HeadersGrammarParser.ArglistContext ctx) {
        return
        /* In ANLTR if you have repetition of some nonterminal, ctx.nonterm_name()
           will give you the list of all the children that represent that nonterminal

           In our case, we are interested in all of the argument nodes:
         */
        ctx.argument()
            .stream()
            .map((HeadersGrammarParser.ArgumentContext arg) -> {
                return new Object[]{new Type(arg.type().TYPE().getText(),
                                              arg.type().getChildCount()-1),
                                     arg.IDENTIFIER().getText()};
            })
            .collect(Collectors.toList());
    }

    @Override
    public Object visitNoargs(HeadersGrammarParser.NoargsContext ctx) {
        /* No args -> empty (Type, identifier) list */
        return new ArrayList<Object[]>();
    }

}
