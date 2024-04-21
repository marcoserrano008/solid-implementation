import java.util.List;

public class RequirementPrinter implements  Printer{
    private RequirementsList requirements;

    public RequirementPrinter(RequirementsList requirements) {
        this.requirements = requirements;
    }

    public void printDetails() {
        List<String> requirements = this.requirements.getApplicantInfoRequirements();
        System.out.print("Requirements: ");
        for(String requirement : requirements) {
            System.out.print(requirement + ", ");
        }
    }
}
