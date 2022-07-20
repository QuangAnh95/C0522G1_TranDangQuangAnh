package ss8_clean_code_and_refactoring.exercise.Refactoring.controller;

import ss8_clean_code_and_refactoring.exercise.Refactoring.Model.TennisGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first player score");
        int firstPoint = scanner.nextInt();

        System.out.println("enter second player score");
        int secondPoint= scanner.nextInt();

        String showResults = TennisGame.getScore(firstPoint,secondPoint);
        System.out.println(showResults);
    }
}
