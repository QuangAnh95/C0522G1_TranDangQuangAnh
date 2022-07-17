package ss10_StackAndQueue.exercise.CheckingPalindromeStringsUsingQueue.model;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stringStack = new Stack<>();
        Queue<Character> stringQueue = new LinkedList<>();

        System.out.println("nhập mảng muốn kiểm tra");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i ++){
            stringStack.push(string.charAt(i));
            stringQueue.add(string.charAt(i));

        }
        Boolean isBoolean = false;
        while (stringStack.isEmpty() && stringQueue.isEmpty()){
            if (stringStack.pop()!= stringQueue.poll()){
                isBoolean = true;
                break;

            }
        }
        if (isBoolean ){
            System.out.println("đây không phải là chuỗi palindrome");
        }else {
            System.out.println("đây là một chuỗi palindrome");
        }

    }
}
