package ss5_AccessModifierStaticMethodStaticProperty.exercise.AccessModifier;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    AccessModifier(){

    };

    AccessModifier(double radius ){
        this.radius = radius;

    };

    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }


}
