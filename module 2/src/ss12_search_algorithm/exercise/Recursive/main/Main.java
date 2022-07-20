package ss12_search_algorithm.exercise.Recursive.main;

import ss12_search_algorithm.exercise.Recursive.controller.Recursive;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Recursive recursive = new Recursive();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("array[%d] = ", i);
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: ");
        System.out.println(Arrays.toString(array));

        System.out.print("Nhập số cần tìm kiếm: ");
        int number = scanner.nextInt();

        System.out.println(recursive.Recursive(array, 0, array.length - 1, number));

    }
}
