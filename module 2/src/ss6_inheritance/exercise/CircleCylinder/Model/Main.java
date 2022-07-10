package ss6_inheritance.exercise.CircleCylinder.Model;

import ss6_inheritance.exercise.CircleCylinder.Controller.Circle;
import ss6_inheritance.exercise.CircleCylinder.Controller.Cylinder;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle(10,"red");
//        System.out.println(circle);

        Cylinder cylinder = new Cylinder("blue",5,10);
        System.out.println(cylinder);

    }
}
