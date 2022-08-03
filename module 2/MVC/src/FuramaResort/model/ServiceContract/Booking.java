package FuramaResort.model.ServiceContract;

public class Booking extends ServiceContract {
    private String startDay;
    private String endDate;
    private String serviceName;
    private String typeOfService;

    public Booking() {
    }



    public Booking(String startDay, String endDate, String serviceName, String typeOfService) {
        this.startDay = startDay;
        this.endDate = endDate;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public Booking(String idBooking, String idCustomer, String startDay, String endDate, String serviceName, String typeOfService) {
        super(idBooking, idCustomer);
        this.startDay = startDay;
        this.endDate = endDate;
        this.serviceName = serviceName;
        this.typeOfService = typeOfService;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }


    @Override
    public String getInfoServiceContract() {
        return String.format("%s,%s,%s,%s,%s,%s\n",this.getIdBooking(),this.getStartDay(),this.getEndDate(),this.getIdCustomer(),this.getServiceName(),this.getTypeOfService());
    }

    @Override
    public String toString() {
        return "Booking{" + super.toString()+
                ", startDay(ngày bắt đầu):  " + startDay + '\'' +
                ", endDate(ngày kết thúc):  " + endDate + '\'' +
                ", serviceName(tên dịch vụ):   " + serviceName + '\'' +
                ", typeOfService(loại dịch vụ):   " + typeOfService + '\'' +
                '}';
    }
}
