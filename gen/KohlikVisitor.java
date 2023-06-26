// Generated from D:/Projekty/2.semestr/PRK/KohlikKalkulator/src/main/antlr4/cz/tul/kohlik/kohlik\Kohlik.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KohlikParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KohlikVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KohlikParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(KohlikParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParexpr(KohlikParser.ParexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeafexpr(KohlikParser.LeafexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexpr(KohlikParser.OpexprContext ctx);
}