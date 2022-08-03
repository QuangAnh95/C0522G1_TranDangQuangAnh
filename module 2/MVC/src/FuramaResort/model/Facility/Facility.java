package FuramaResort.model.Facility;

public abstract class Facility {
    private String serviceName;
    private double usableArea;
    private double costRent;
    private int maximumNumberOfPeople;
    private String rentalType;
    private String serviceCode;

    public Facility() {
    }

    public Facility(String serviceCode,String serviceName, double usableArea, double costRent, int maximumNumberOfPeople, String rentalType) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.costRent = costRent;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.rentalType = rentalType;
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getCostRent() {
        return costRent;
    }

    public void setCostRent(double costRent) {
        this.costRent = costRent;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public abstract String getInfo();



    @Override
    public String toString() {
        return    "   ServiceCode:   "    + serviceCode+
                "    serviceName(tên dịch vụ):  " + serviceName  +
                ",   usableArea(diện tích sử dụng):   " + usableArea +
                ",   costRent(chi phí thuê):  " + costRent +
                ",   maximumNumberOfPeople(số người tối đa):   " + maximumNumberOfPeople +
                ",   rentalType(kiểu thuê):   " + rentalType ;

    }
}
