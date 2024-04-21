import java.util.ArrayList;
import java.util.List;

public class RequirementsListManager {
    private RequirementsList requirements;

    public RequirementsListManager(RequirementsList requirements) {
        this.requirements = requirements;
    }

    public void addRequirement(String requirement) {
        requirements.getApplicantInfoRequirements().add(requirement);
    }

    public void removeRequirement(String requirement) {
        requirements.getApplicantInfoRequirements().remove(requirement);
    }

}
