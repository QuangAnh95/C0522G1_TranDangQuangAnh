package ss14_exception_handling_and_debug.exersise.ExceptionTriangle.service;

import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.exception.IllegalTriangleException;
import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.model.Triangle;

public interface ITriangleService  {


    Triangle checkTrilangle(int edgeA, int edgeB, int edgeC) throws IllegalTriangleException;

}
