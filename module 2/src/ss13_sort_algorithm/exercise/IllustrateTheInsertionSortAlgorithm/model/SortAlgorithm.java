package ss13_sort_algorithm.exercise.IllustrateTheInsertionSortAlgorithm.model;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithm {

    public static void sortAlgorithm(int [] array) {
        int pos, x;
        for(int i = 1; i < array.length; i++){

//            System.out.print("mảng sau khi sắp xếp lần:  " + i + "\n" + Arrays.toString(array) + "\n");
            x = array[i];
//            System.out.println("phần từ lấy ra để gán lần thứ   " + i + "  là:  " + x +  "\n");
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1];

//                System.out.println("mảng sau khi hoán đổi" + Arrays.toString(array) +"\n");
                pos--;
            }
            array[pos] = x;

        }
    }


}
