package ss13_sort_algorithm.exercise.IllustrateTheInsertionSortAlgorithm.controller;

import ss13_sort_algorithm.exercise.IllustrateTheInsertionSortAlgorithm.model.SortAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SortAlgorithm sort = new SortAlgorithm();
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số phần tử của mảng");
        int size = scanner.nextInt();

        int [] arr= new int[size];
        for (int i = 0; i < arr.length ; i++){
            System.out.println("nhập phần tử thứ " + (i+1) + "vào mảng");
            arr[i] = scanner.nextInt();
        }
        System.out.println("mảng sau khi nhập:" + Arrays.toString(arr));

        sort.sortAlgorithm(arr);
        System.out.println("mảng sau khi sắp xếp" + Arrays.toString(arr));

    }
}
