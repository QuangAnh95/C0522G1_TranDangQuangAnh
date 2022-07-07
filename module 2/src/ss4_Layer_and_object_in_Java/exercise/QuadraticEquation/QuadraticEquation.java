package ss4_Layer_and_object_in_Java.exercise.QuadraticEquation;

public class QuadraticEquation {
    double numberA ;
    double numberB ;
    double numberC ;
    QuadraticEquation(double numberA, double numberB, double numberC){
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getNumberA(){
        return this.numberA;
    }
    public double getNumberB(){
        return this.numberB;
    }
    public double getNumberC(){
        return this.numberC;
    }
    public String disPlay(){
        return "phương trình có dạng : " + getNumberA() + "X^2  +  "+ getNumberB() + "X  +  " + getNumberC() + "  = 0";
    }
    public double getDelta(){
        return getNumberB()*getNumberB() - 4*getNumberA()*getNumberC();
    }
    public double getRoot1(){
        return (-getNumberB() + Math.sqrt(getDelta()))/(2*getNumberA());
    }
    public double getRoot2(){
        return (-getNumberB() - Math.sqrt(getDelta()))/(2*getNumberA());
    }
    public String viewResult(){
        if (getDelta()< 0){
            return "phương trình vô nghiệm";
        }else if (getDelta() == 0){
            return "phương trình có nghiệm kép x1 = x2 = "+ getRoot1();
        }
        return "phương trình có 2 nghiệm :  x1 = "+ getRoot1() + "  x2 =  " +getRoot2();
    }
}
