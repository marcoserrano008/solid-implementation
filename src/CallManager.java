public class CallManager {
    private Call call;

    public CallManager(Call call) {
        this.call = call;
    }

    public void closeCall() {
        call.setStatus("Closed");
    };

    public void openCall() {
        call.setStatus("Open");
    };

    public void updateCall(String tittle, String description, String startDate,
                            String endDate, boolean isVisible) {
        call.setTittle(tittle);
        call.setDescription(description);
        call.setStartDate(startDate);
        call.setEndDate(endDate);
        call.setVisible(isVisible);
    }
}
