package ss11_java_collection_framework.exercise.ProductManagement.model;

public  class Product {
    private int id;
    private String name;
    private String color;
    private int price;
    private int dateOfManufacture;
    private int expiry;

    public Product() {
    }


    public Product(int id, String name, String color, int price, int dateOfManufacture, int expiry) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(int dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getExpiry() {
        return expiry;
    }

    public void setExpiry(int expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "sản phẩm{" +
                "mã =" + id +
                ", têm='" + name + '\'' +
                ", màu sắc ='" + color + '\'' +
                ", giá =" + price +
                ", ngày sản xuất=" + dateOfManufacture +
                ", hạn sử dụng=" + expiry +
                '}';
    }
}
