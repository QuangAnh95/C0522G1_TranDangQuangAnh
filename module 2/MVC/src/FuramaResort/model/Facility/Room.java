package FuramaResort.model.Facility;

public class Room extends Facility{
    private String freeServiceIncluded;

    public Room() {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceCode, String serviceName, double usableArea, double costRent, int maximumNumberOfPeople, String rentalType, String freeServiceIncluded) {
        super(serviceCode, serviceName, usableArea, costRent, maximumNumberOfPeople, rentalType);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s\n", this.getServiceCode(),this.getServiceName(),this.getUsableArea(),this.getCostRent(),this.getMaximumNumberOfPeople(),this.getRentalType(),this.getFreeServiceIncluded());
    }

    @Override
    public String toString() {
        return super.toString()+
                "  freeServiceIncluded(dịch vụ miễn phí đi kèm):   " + freeServiceIncluded ;

    }
}
