// Generated from D:/Projekty/2.semestr/PRK/KohlikKalkulator/src/main/antlr4/cz/tul/kohlik/kohlik\Kohlik.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KohlikParser}.
 */
public interface KohlikListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KohlikParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(KohlikParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link KohlikParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(KohlikParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParexpr(KohlikParser.ParexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParexpr(KohlikParser.ParexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLeafexpr(KohlikParser.LeafexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leafexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLeafexpr(KohlikParser.LeafexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpexpr(KohlikParser.OpexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opexpr}
	 * labeled alternative in {@link KohlikParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpexpr(KohlikParser.OpexprContext ctx);
}