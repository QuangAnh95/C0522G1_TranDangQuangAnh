package FuramaResort.model.Facility;

public class House extends Facility{
    private String roomStandard;
    private int numberOfFloorsHouse;


    public House(String roomStandard, int numberOfFloorsHouse) {
        this.roomStandard = roomStandard;
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }

    public House(String serviceCode, String serviceName, double usableArea, double costRent, int maximumNumberOfPeople, String rentalType, String roomStandard, int numberOfFloorsHouse) {
        super(serviceCode, serviceName, usableArea, costRent, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }

    public House() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloorsHouse() {
        return numberOfFloorsHouse;
    }

    public void setNumberOfFloorsHouse(int numberOfFloorsHouse) {
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }


    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",this.getServiceCode(),this.getServiceName(),this.getUsableArea(),this.getCostRent(),this.getMaximumNumberOfPeople(),this.getRentalType(),this.getRoomStandard(),
                this.getNumberOfFloorsHouse());
    }

    @Override
    public String toString() {
        return super.toString()+
                "   roomStandard(tiêu chuẩn phòng):   " + roomStandard + '\'' +
                ",  numberOfFloorsHouse(số tầng):   " + numberOfFloorsHouse ;

    }
}
