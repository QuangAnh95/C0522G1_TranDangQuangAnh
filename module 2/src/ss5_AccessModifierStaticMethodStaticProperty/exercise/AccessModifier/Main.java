package ss5_AccessModifierStaticMethodStaticProperty.exercise.AccessModifier;

public class Main {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier(5);
        accessModifier.setRadius(10);
        accessModifier.setColor("blue");
        System.out.println(accessModifier.getArea() +"\n" +  accessModifier.getColor());
        System.out.println(accessModifier.getRadius());

    }
}
