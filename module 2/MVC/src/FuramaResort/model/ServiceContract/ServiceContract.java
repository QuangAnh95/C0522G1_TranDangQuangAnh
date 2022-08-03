package FuramaResort.model.ServiceContract;

public abstract class ServiceContract {

    private String idBooking;
    private String idCustomer;

    public ServiceContract() {
    }

    public ServiceContract(String idBooking, String idCustomer) {
        this.idBooking = idBooking;
        this.idCustomer = idCustomer;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public abstract String getInfoServiceContract();

    @Override
    public String toString() {
        return
                "  idBooking(mã booking):   " + idBooking +
                ", idCustomer(mã khách hàng):   " + idCustomer ;

    }
}
