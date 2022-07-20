package ss7_abstract_class_and_interface.exercise.InterfaceResizeable.controller;


import ss7_abstract_class_and_interface.exercise.InterfaceResizeable.Model.Circle;
import ss7_abstract_class_and_interface.exercise.InterfaceResizeable.Model.Rectangle;
import ss7_abstract_class_and_interface.exercise.InterfaceResizeable.Model.Shape;
import ss7_abstract_class_and_interface.exercise.InterfaceResizeable.Model.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5,"red",true);
        shapes[1] = new Rectangle(4,7,"blue",false);
        shapes[2] = new Square(7,"black",true);

        System.out.println("Trước khi tăng:");
        for (Shape shape : shapes){
            System.out.println(shape + "\n");
        }

        System.out.println("sau khi tăng");
        for (Shape shape : shapes){
            shape.resize(Math.floor(Math.random()*100)+1);
            System.out.println(shape+ "\n");


        }

    }
}



