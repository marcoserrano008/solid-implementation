public class Call {
    private String tittle;
    private String description;
    private String startDate;
    private String endDate;
    private String status; // Possible values: "Open", "In Progress", "Closed"
    private boolean isVisible;
    private RequirementsList applicantRequirements;

    public Call(String tittle, String description, String startDate, String endDate,
                 boolean isVisible, RequirementsList applicantRequirements) {
        this.tittle = tittle;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = "open";
        this.isVisible = isVisible;
        this.applicantRequirements = applicantRequirements;
    }

    public String getTittle() {
        return tittle;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public RequirementsList getApplicantRequirements() {
        return applicantRequirements;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
