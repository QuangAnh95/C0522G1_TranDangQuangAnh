package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name : ");
        name = scanner.nextLine();
        System.out.println("hello " + name);


    }
}
