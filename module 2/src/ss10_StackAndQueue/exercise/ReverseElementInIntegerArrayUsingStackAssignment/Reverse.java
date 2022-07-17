package ss10_StackAndQueue.exercise.ReverseElementInIntegerArrayUsingStackAssignment;

import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> array = new Stack<Integer>();

        System.out.println("nhập vào n là độ dài mảng");
        int length = scanner.nextInt();
        for (int i = 0 ; i< length;i++){
            System.out.printf("nhập vào phần tử thứ %d : ", i);
            array.push(scanner.nextInt());
        }
        System.out.print("mảng vừa tạo " + array + "\n");


        Stack<Integer> arrayReverse = new Stack<Integer>();
        while (!array.isEmpty()){
            arrayReverse.push(array.pop());

        }

        System.out.println("mảng sau khi đảo ngược" + arrayReverse);



    }
}
