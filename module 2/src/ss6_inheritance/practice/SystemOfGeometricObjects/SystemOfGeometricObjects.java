package ss6_inheritance.practice.SystemOfGeometricObjects;

public class SystemOfGeometricObjects {
    private String color = "green";
    private boolean filled = true;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public SystemOfGeometricObjects() {

    }

    public SystemOfGeometricObjects(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of"+"\n"
         +getColor() + "\n"
        + "and" + "\n"
        + (isFilled()? "filled":"not filled");
    }
}
