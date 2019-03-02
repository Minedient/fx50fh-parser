// Generated from fx50.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fx50Parser}.
 */
public interface fx50Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fx50Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(fx50Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(fx50Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(fx50Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(fx50Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#let}.
	 * @param ctx the parse tree
	 */
	void enterLet(fx50Parser.LetContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#let}.
	 * @param ctx the parse tree
	 */
	void exitLet(fx50Parser.LetContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(fx50Parser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(fx50Parser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#cal}.
	 * @param ctx the parse tree
	 */
	void enterCal(fx50Parser.CalContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#cal}.
	 * @param ctx the parse tree
	 */
	void exitCal(fx50Parser.CalContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#ask}.
	 * @param ctx the parse tree
	 */
	void enterAsk(fx50Parser.AskContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#ask}.
	 * @param ctx the parse tree
	 */
	void exitAsk(fx50Parser.AskContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void enterIfexpr(fx50Parser.IfexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#ifexpr}.
	 * @param ctx the parse tree
	 */
	void exitIfexpr(fx50Parser.IfexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#thenExpr}.
	 * @param ctx the parse tree
	 */
	void enterThenExpr(fx50Parser.ThenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#thenExpr}.
	 * @param ctx the parse tree
	 */
	void exitThenExpr(fx50Parser.ThenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void enterElseExpr(fx50Parser.ElseExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#elseExpr}.
	 * @param ctx the parse tree
	 */
	void exitElseExpr(fx50Parser.ElseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(fx50Parser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(fx50Parser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpExpr(fx50Parser.OpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpExpr(fx50Parser.OpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(fx50Parser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(fx50Parser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code root}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRoot(fx50Parser.RootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code root}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRoot(fx50Parser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noopExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNoopExpr(fx50Parser.NoopExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noopExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNoopExpr(fx50Parser.NoopExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterValExpr(fx50Parser.ValExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valExpr}
	 * labeled alternative in {@link fx50Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitValExpr(fx50Parser.ValExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(fx50Parser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(fx50Parser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#logicExprFunc}.
	 * @param ctx the parse tree
	 */
	void enterLogicExprFunc(fx50Parser.LogicExprFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#logicExprFunc}.
	 * @param ctx the parse tree
	 */
	void exitLogicExprFunc(fx50Parser.LogicExprFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#noopmul}.
	 * @param ctx the parse tree
	 */
	void enterNoopmul(fx50Parser.NoopmulContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#noopmul}.
	 * @param ctx the parse tree
	 */
	void exitNoopmul(fx50Parser.NoopmulContext ctx);
	/**
	 * Enter a parse tree produced by {@link fx50Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(fx50Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link fx50Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(fx50Parser.ValueContext ctx);
}