package FuramaResort.model.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceCode, String serviceName, double usableArea, double costRent, int maximumNumberOfPeople, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, costRent, maximumNumberOfPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa() {

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",this.getServiceCode(),this.getServiceName(), this.getUsableArea(), this.getCostRent(),this.getMaximumNumberOfPeople(),
                this.getRentalType(),this.getRoomStandard(),this.getPoolArea(),this.getNumberOfFloors());
    }

    @Override
    public String toString() {
        return super.toString()+
                "    roomStandard(tiêu chuẩn phòng):  " + roomStandard +
                ",   poolArea(diện tích hồ bơi):   " + poolArea +
                ",   numberOfFloors(số tầng):   " + numberOfFloors ;

    }
}
