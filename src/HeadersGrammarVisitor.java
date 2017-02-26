// Generated from C:/Users/petar/Documents/VU/AaC/Headers/src\HeadersGrammar.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HeadersGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HeadersGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HeadersGrammarParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(HeadersGrammarParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeadersGrammarParser#comm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComm(HeadersGrammarParser.CommContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeadersGrammarParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HeadersGrammarParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arglist}
	 * labeled alternative in {@link HeadersGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(HeadersGrammarParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noargs}
	 * labeled alternative in {@link HeadersGrammarParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoargs(HeadersGrammarParser.NoargsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeadersGrammarParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(HeadersGrammarParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidRet}
	 * labeled alternative in {@link HeadersGrammarParser#ret_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidRet(HeadersGrammarParser.VoidRetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularRet}
	 * labeled alternative in {@link HeadersGrammarParser#ret_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularRet(HeadersGrammarParser.RegularRetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HeadersGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HeadersGrammarParser.TypeContext ctx);
}