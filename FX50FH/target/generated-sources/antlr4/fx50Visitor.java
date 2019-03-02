// Generated from fx50.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link fx50Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface fx50Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link fx50Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(fx50Parser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(fx50Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(fx50Parser.LetContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(fx50Parser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#cal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCal(fx50Parser.CalContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#ask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsk(fx50Parser.AskContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(fx50Parser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#thenExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenExpr(fx50Parser.ThenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#elseExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExpr(fx50Parser.ElseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(fx50Parser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(fx50Parser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExpr(fx50Parser.NegExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code root}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(fx50Parser.RootContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noopExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoopExpr(fx50Parser.NoopExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValExpr(fx50Parser.ValExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(fx50Parser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#logicExprFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExprFunc(fx50Parser.LogicExprFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#noopmul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoopmul(fx50Parser.NoopmulContext ctx);
	/**
	 * Visit a parse tree produced by {@link fx50Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(fx50Parser.ValueContext ctx);
}