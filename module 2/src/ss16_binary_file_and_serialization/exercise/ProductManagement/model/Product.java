package ss16_binary_file_and_serialization.exercise.ProductManagement.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int productCode;
    private String productIsName;
    private String manufacturer;
    private double price;
    private String color;

    public Product() {
    }

    public Product(int productCode, String productIsName, String manufacturer, double price, String color) {
        this.productCode = productCode;
        this.productIsName = productIsName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.color = color;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductIsName() {
        return productIsName;
    }

    public void setProductIsName(String productIsName) {
        this.productIsName = productIsName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  String getInfo(){
        return String.format("%S,%s,%s,%s,%s\n",this.getProductCode(),this.getProductIsName(),this.getManufacturer(),this.getPrice(),this.getColor());
    };

    @Override
    public String toString() {
        return
                "Mã sản phẩm:  " + productCode +
                " ,  Tên sản phẩm:   " + productIsName +
                " ,  Hãng sản xuất:  " + manufacturer +
                ",  Giá:   " + price +
                ",  Màu sắc:  " + color;
    }
}
