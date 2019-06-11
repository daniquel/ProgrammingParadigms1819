// Generated from C:/Users/xTove/Documents/Repositories/ProgrammingParadigms1819/src/language/grammar\Language.g4 by ANTLR 4.7.2
package language.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LanguageParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LanguageParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LanguageParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(LanguageParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#programVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramVarDeclaration(LanguageParser.ProgramVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LanguageParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(LanguageParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclStat(LanguageParser.DeclStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(LanguageParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(LanguageParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(LanguageParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStat}
	 * labeled alternative in {@link LanguageParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStat(LanguageParser.BlockStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpr(LanguageParser.ParExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(LanguageParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(LanguageParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(LanguageParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(LanguageParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(LanguageParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(LanguageParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExpr(LanguageParser.NumExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExpr(LanguageParser.ConstExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(LanguageParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(LanguageParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(LanguageParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(LanguageParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidType}
	 * labeled alternative in {@link LanguageParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidType(LanguageParser.VoidTypeContext ctx);
}