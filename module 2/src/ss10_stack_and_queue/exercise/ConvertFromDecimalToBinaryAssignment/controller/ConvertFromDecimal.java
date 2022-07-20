package ss10_stack_and_queue.exercise.ConvertFromDecimalToBinaryAssignment.controller;

import java.util.Scanner;
import java.util.Stack;

public class ConvertFromDecimal {
    public static void main(String[] args) {
        Stack<Integer> integersStack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số muốn chuyển đổi");
        int number = scanner.nextInt();


        while (number > 0){
            integersStack.push(number % 2);
            number /= 2;
        }

        while (!integersStack.isEmpty()){
            System.out.println(integersStack.pop());
        }
    }
}
