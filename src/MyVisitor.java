public class MyVisitor extends JobOpeningBaseVisitor<Object>{


    @Override public Object visitJobOpening(JobOpeningParser.JobOpeningContext ctx) {
        System.out.println("Success");
        return visitChildren(ctx); }

    @Override public Object visitJobRef(JobOpeningParser.JobRefContext ctx) { return visitChildren(ctx); }

    @Override public Object visitTitle(JobOpeningParser.TitleContext ctx) { return visitChildren(ctx); }

    @Override public Object visitContractType(JobOpeningParser.ContractTypeContext ctx) { return visitChildren(ctx); }

    @Override public Object visitModes(JobOpeningParser.ModesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitAddress(JobOpeningParser.AddressContext ctx) { return visitChildren(ctx); }

    @Override public Object visitCompany(JobOpeningParser.CompanyContext ctx) { return visitChildren(ctx); }

    @Override public Object visitVacancies(JobOpeningParser.VacanciesContext ctx) { return visitChildren(ctx); }

    @Override public Object visitDescription(JobOpeningParser.DescriptionContext ctx) { return visitChildren(ctx); }

    @Override public Object visitRequirements(JobOpeningParser.RequirementsContext ctx) { return visitChildren(ctx); }

    @Override public Object visitRequirementSpec(JobOpeningParser.RequirementSpecContext ctx) { return visitChildren(ctx); }




}
