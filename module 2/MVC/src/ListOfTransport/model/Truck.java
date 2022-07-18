package ListOfTransport.model;

public class Truck extends Vehicle{
    private int tonnage;

    public Truck(){

    }

    public Truck(int tonnage) {
        this.tonnage = tonnage;
    }

    public Truck(int licensePlates, String manufacturer, int yearOfManufacture, String owner, int tonnage) {
        super(licensePlates, manufacturer, yearOfManufacture, owner);
        this.tonnage = tonnage;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return "xe tải : " +
                "trọng tải" + tonnage + super.toString();
    }
}
