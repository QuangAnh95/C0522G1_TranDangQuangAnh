package FuramaResort.model.ServiceContract;

public class Contract extends ServiceContract {
    private String syncNumber;
    private double depositInAdvance;
    private double totalPaymentAmount;

    public Contract(String syncNumber, double depositInAdvance, double totalPaymentAmount) {
        this.syncNumber = syncNumber;
        this.depositInAdvance = depositInAdvance;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public Contract(String idBooking, String idCustomer, String syncNumber, double depositInAdvance, double totalPaymentAmount) {
        super(idBooking, idCustomer);
        this.syncNumber = syncNumber;
        this.depositInAdvance = depositInAdvance;
        this.totalPaymentAmount = totalPaymentAmount;
    }

    public String getSyncNumber() {
        return syncNumber;
    }

    public void setSyncNumber(String syncNumber) {
        this.syncNumber = syncNumber;
    }

    public double getDepositInAdvance() {
        return depositInAdvance;
    }

    public void setDepositInAdvance(double depositInAdvance) {
        this.depositInAdvance = depositInAdvance;
    }

    public double getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    public void setTotalPaymentAmount(double totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
    }

    @Override
    public String getInfoServiceContract() {
        return String.format("%s,%s,%s,%s,%s\n",this.getSyncNumber(),this.getIdBooking(),this.getIdCustomer(),this.getDepositInAdvance(),this.getTotalPaymentAmount());
    }

    @Override
    public String toString() {
        return "Contract{" +
                "  syncNumber(số hợp đồng):   " + syncNumber +
                super.toString()+
                ",  depositInAdvance(số tiền cọc trước):   " + depositInAdvance +
                ", totalPaymentAmount(tổng tiền thanh toán):  " + totalPaymentAmount +
                '}';
    }
}
