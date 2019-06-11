// Generated from C:/Users/xTove/Documents/Repositories/ProgrammingParadigms1819/src/language/grammar\Language.g4 by ANTLR 4.7.2
package language.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LanguageParser}.
 */
public interface LanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LanguageParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LanguageParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(LanguageParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(LanguageParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#programVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProgramVarDeclaration(LanguageParser.ProgramVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#programVarDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProgramVarDeclaration(LanguageParser.ProgramVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(LanguageParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(LanguageParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclStat(LanguageParser.DeclStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclStat(LanguageParser.DeclStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(LanguageParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(LanguageParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(LanguageParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(LanguageParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(LanguageParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(LanguageParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockStat(LanguageParser.BlockStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockStat(LanguageParser.BlockStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(LanguageParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(LanguageParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LanguageParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LanguageParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(LanguageParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(LanguageParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(LanguageParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(LanguageParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpr(LanguageParser.MinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpr(LanguageParser.MinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(LanguageParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(LanguageParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumExpr(LanguageParser.NumExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumExpr(LanguageParser.NumExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstExpr(LanguageParser.ConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstExpr(LanguageParser.ConstExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(LanguageParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(LanguageParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(LanguageParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(LanguageParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(LanguageParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(LanguageParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVoidType(LanguageParser.VoidTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVoidType(LanguageParser.VoidTypeContext ctx);
}