package ss7_abstract_class_and_interface.exercise.InterfaceColorable.Model;

public class Rectangle1 extends Shape1{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle1() {
    }

    public Rectangle1(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle1(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }


    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth() + "\n"
                + " and length="
                + getLength() + "\n"
                + "Area =" + getArea();

    }
}
