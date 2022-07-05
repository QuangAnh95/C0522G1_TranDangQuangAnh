package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfTwoDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;

        int sum;
        int sum1 = 0; // tổng đường chéo theo chiều thuận
        int sum2;// tổng đường chéo theo chiều nghịch

        System.out.println("Nhập số hàng");
        row = scanner.nextInt();

        int[][] arr = new int[row][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.printf("Nhập vào [%d][%d]:", i, j);
                arr[i][j] = scanner.nextInt();

            }
        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < row; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        for (int i = 0 ; i< row; i++){
//            for (int j = 0 ; j < col;j++ ){
//                if (arr[i] == arr[j]){
//                    sum1 += arr[i][j];
//                }
//            }
//        }
        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        for (int i = 0; i <arr.length;i++){
            sum1 += arr[i][i];
        }
        System.out.println(sum1);
    }
}