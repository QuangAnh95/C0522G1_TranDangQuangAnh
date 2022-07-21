package ss14_exception_handling_and_debug.exersise.ExceptionTriangle.service.impl;

import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.exception.IllegalTriangleException;
import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.model.Triangle;
import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.service.ITriangleService;

import java.util.Scanner;

public class TriangleService implements ITriangleService {
    static Scanner sc = new Scanner(System.in);


    @Override
    public Triangle checkTrilangle(int a, int b, int c) throws IllegalTriangleException {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalTriangleException("Không được nhập số âm");
        }
        if (!(a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a)) {
            throw new IllegalTriangleException("Không là ba cạnh của tam giác");
        }

        return new Triangle(a, b, c);
    }


}
