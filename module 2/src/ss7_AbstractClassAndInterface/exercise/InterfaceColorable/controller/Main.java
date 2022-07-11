package ss7_AbstractClassAndInterface.exercise.InterfaceColorable.controller;

import ss7_AbstractClassAndInterface.exercise.InterfaceColorable.Model.Circle1;
import ss7_AbstractClassAndInterface.exercise.InterfaceColorable.Model.Rectangle1;
import ss7_AbstractClassAndInterface.exercise.InterfaceColorable.Model.Shape1;
import ss7_AbstractClassAndInterface.exercise.InterfaceColorable.Model.Square1;


public class Main {
    public static void main(String[] args) {
        Shape1[] shapes = new Shape1[3];
        shapes[0] = new Circle1(5,"red",true);
        shapes[1] = new Rectangle1(4,7,"blue",false);
        shapes[2] = new Square1(7,"black",true);


        for (Shape1 shape1 : shapes){
            System.out.println(shape1 + "\n");
            if (shape1 instanceof Square1){
                ((Square1)shape1).howToColor();
            }
        }
    }
}
