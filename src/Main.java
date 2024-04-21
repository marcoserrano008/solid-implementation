public class Main {
    public static void main(String[] args) {
        RequirementsList requirementsListCall1 = new RequirementsList();
        RequirementsListManager call1RequirementsManager = new RequirementsListManager(requirementsListCall1);
        call1RequirementsManager.addRequirement("Resume");
        call1RequirementsManager.addRequirement("Cover Letter");
        Call call1 = new Call("Software Engineer Recruitment", "Looking for experienced java developers",
                "2023-01-01", "2023-02-01", true, requirementsListCall1);
        Printer call1Printer = new CallPrinter(call1);
        call1Printer.printDetails();

        CallManager call1Manager = new CallManager(call1);
        call1Manager.updateCall("Software Engineer Recruitment", "Looking for experienced Java and Python developers",
                                "2023-01-01", "2023-03-01", true);
        call1Manager.closeCall();
        call1Printer.printDetails();
    }
}