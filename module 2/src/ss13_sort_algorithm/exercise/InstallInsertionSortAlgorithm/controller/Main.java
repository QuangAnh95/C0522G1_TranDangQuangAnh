package ss13_sort_algorithm.exercise.InstallInsertionSortAlgorithm.controller;

import ss13_sort_algorithm.exercise.InstallInsertionSortAlgorithm.model.SortAlgorithm1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SortAlgorithm1 sort = new SortAlgorithm1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng");
        int size = scanner.nextInt();

        int [] arr= new int[size];
        for (int i = 0; i < arr.length ; i++){
            System.out.println("nhập phần tử thứ " + (i+1) + "vào mảng");
            arr[i] = scanner.nextInt();
        }
        System.out.println("mảng sau khi nhập:" + Arrays.toString(arr));

        sort.sortAlgorithm1(arr);
        System.out.println("mảng sau khi sắp xếp" + Arrays.toString(arr));

    }
}
