package ListOfTransport.model;

public class Car extends Vehicle{
    private int seat;
    private String type;


    public Car(int seat, String type) {
        this.seat = seat;
        this.type = type;
    }

    public Car(int licensePlates, String manufacturer, int yearOfManufacture, String owner, int seat, String type) {
        super(licensePlates, manufacturer, yearOfManufacture, owner);
        this.seat = seat;
        this.type = type;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "xe ô tô" + "\n"+
                "chỗ ngồi" + seat +
                ", kiểu xe'" + type + super.toString();
    }
}
