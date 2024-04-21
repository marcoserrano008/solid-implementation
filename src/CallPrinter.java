public class CallPrinter implements Printer {

    private Call call;

    public CallPrinter(Call call) {
        this.call = call;
    }

    public void printDetails() {
        System.out.println("Title: " + call.getTittle());
        System.out.println("Description: " + call.getDescription());
        System.out.println("Start Date: " + call.getStartDate());
        System.out.println("End Date: " + call.getEndDate());
        System.out.println("Status: " + call.getStatus());
        System.out.println("Is Visible: " + call.isVisible());
        RequirementsList requirements = call.getApplicantRequirements();
        Printer requirementsPrinter = new RequirementPrinter(requirements);
        requirementsPrinter.printDetails();
        System.out.println("");
    }


}
