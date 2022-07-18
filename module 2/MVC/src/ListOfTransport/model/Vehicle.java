package ListOfTransport.model;

public abstract class Vehicle {
    private int licensePlates;
    private String manufacturer;
    private int yearOfManufacture;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(int licensePlates, String manufacturer, int yearOfManufacture, String owner) {
        this.licensePlates = licensePlates;
        this.manufacturer = manufacturer;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public int getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(int licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    @Override
    public String toString() {
        return
                "biển kiểm soát: " + licensePlates +
                ",hãng sản xuất: " + manufacturer + '\'' +
                ", năm sản xuất: " + yearOfManufacture +
                ", chủ sở hữu:  " + owner + '\'' +
                '}';
    }
}
