package ss7_AbstractClassAndInterface.exercise.InterfaceColorable.Model;

public class Circle1 extends Shape1 {
    private double radius = 1.0;

    public Circle1() {
    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius, String color, boolean filled) {
        super(color, filled);

        this.radius = radius;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }


    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()+"\n"
                +"Area="
                +getArea();

    }
}
