package ListOfTransport.model;

public class Motorbike extends Vehicle{
    private int wattage;

    public Motorbike(){

    }

    public Motorbike(int wattage) {
        this.wattage = wattage;
    }

    public Motorbike(int licensePlates, String manufacturer, int yearOfManufacture, String owner, int wattage) {
        super(licensePlates, manufacturer, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "xe máy :" + "\n" +
                "công suất : " + wattage + super.toString() ;

    }
}
