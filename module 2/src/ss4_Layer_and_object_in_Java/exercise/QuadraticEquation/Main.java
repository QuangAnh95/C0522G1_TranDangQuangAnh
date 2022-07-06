package ss4_Layer_and_object_in_Java.exercise.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA;
        do {
            System.out.println("Nhập a");
            numberA = scanner.nextDouble();
            if (numberA == 0){
                System.out.println("vui lòng nhập lại a # 0 !");
            }
        }while (numberA == 0);

        System.out.println("nhập b");
        double numberB = scanner.nextDouble();
        System.out.println("nhập c");
        double numberC = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(numberA,numberB,numberC);
        System.out.println(quadraticEquation.disPlay());
        System.out.println(quadraticEquation.viewResult());
    }
}
