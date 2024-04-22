// Generated from C:/Users/mike_/OneDrive/Documentos/RestaurantesManagement/Lprog24/JobOpening.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JobOpeningParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JobOpeningVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#jobOpening}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobOpening(JobOpeningParser.JobOpeningContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#jobRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobRef(JobOpeningParser.JobRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(JobOpeningParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#contractType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContractType(JobOpeningParser.ContractTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#modes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModes(JobOpeningParser.ModesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(JobOpeningParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#company}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompany(JobOpeningParser.CompanyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#vacancies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacancies(JobOpeningParser.VacanciesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(JobOpeningParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#requirements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirements(JobOpeningParser.RequirementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobOpeningParser#requirementSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequirementSpec(JobOpeningParser.RequirementSpecContext ctx);
}