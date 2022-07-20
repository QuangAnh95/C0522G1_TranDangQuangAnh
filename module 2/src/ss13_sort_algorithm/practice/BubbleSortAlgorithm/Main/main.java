package ss13_sort_algorithm.practice.BubbleSortAlgorithm.Main;

import ss13_sort_algorithm.practice.BubbleSortAlgorithm.Cotroller.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        BubbleSort ass = new BubbleSort();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter " + list.length + " values:");
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        ass.bubbleSort(list);

        System.out.println("mảng sau sắp xếp " + Arrays.toString(list));



    }
}
