package ss14_exception_handling_and_debug.exersise.ExceptionTriangle.service.impl;

import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.exception.IllegalTriangleException;
import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.model.Triangle;
import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.service.ITriangleService;

import java.util.Scanner;

public class TriangleService implements ITriangleService {
    static Scanner sc = new Scanner(System.in);


    @Override
    public Triangle checkTrilangle(int edgeA, int edgeB, int edgeC) throws IllegalTriangleException {
        if (edgeA < 0 || edgeB < 0 || edgeC < 0) {
            throw new IllegalTriangleException("Không được nhập số âm");
        }
        if (!(edgeA > 0 && edgeB > 0 && edgeC > 0
                && edgeA + edgeB > edgeC
                && edgeA + edgeC > edgeB
                && edgeB + edgeC > edgeA)) {
            throw new IllegalTriangleException("Không là ba cạnh của tam giác");
        }

        return new Triangle(edgeA, edgeB, edgeC);
    }


}
