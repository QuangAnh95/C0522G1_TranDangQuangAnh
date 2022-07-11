package ss7_AbstractClassAndInterface.exercise.InterfaceResizeable.Model;

public class Circle extends Shape implements Resize {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
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

    @Override
    public void resize(double percent) {
        setRadius(getRadius() + getRadius()*percent/100);
    }
}
