package ss4_Layer_and_object_in_Java.exercise.FanClass;

public class FanClass {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FanClass(){
        color = getColor();
        radius = getRadius();
        speed = getSpeed();
        on = isOn();
    }

    public FanClass(boolean on, String color, int speed, double radius) {
        this.on = isOn();
        this.color = getColor();
        this.speed = getSpeed();
        this.radius = getRadius();
    }

    public String toString() {
        if (isOn()) {
            System.out.println("Fan is on " + "\n" + "color " + getColor() + "\n" + "speed  " + getSpeed() + "\n" + "radius  " + "\n" + getRadius());
        } else {
            System.out.println("Fan is off " + "\n" + "color " + getColor() + "\n" + "\n" + "radius  " + "\n" + getRadius());
        }
        return null;
    }


}
