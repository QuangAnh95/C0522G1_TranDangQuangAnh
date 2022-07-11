package ss7_AbstractClassAndInterface.exercise.InterfaceResizeable.Model;

public class Rectangle extends Shape implements Resize {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
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

    @Override
    public void resize(double percent) {
        setLength(getLength() + (getLength() * percent/100));
        setWidth(getWidth() + (getWidth()*percent/100));
    }
}
