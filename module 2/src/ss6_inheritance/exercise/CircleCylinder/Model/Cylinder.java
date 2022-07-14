package ss6_inheritance.exercise.CircleCylinder.Model;

import ss6_inheritance.exercise.CircleCylinder.Model.Circle;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return 2 * Math.PI * getRadius() * getRadius() * getHeight();
    }

    @Override
    public String toString() {
        return
                "height=" + getHeight() + "\n" +
                        "volume= " + getVolume() +
                        "\n" + super.toString();
    }
}

