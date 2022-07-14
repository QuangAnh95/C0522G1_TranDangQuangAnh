package ss6_inheritance.exercise.TriangleClassDesignAndImplementation.Controller;

import ss6_inheritance.exercise.TriangleClassDesignAndImplementation.Model.MovablePoint;
import ss6_inheritance.exercise.TriangleClassDesignAndImplementation.Model.Point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4,4);
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint(4,5,6,10);
        System.out.println(movablePoint.toString());
        System.out.println(movablePoint.move());
    }
}
