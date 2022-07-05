package ss3_array.exercise;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        int maxnum;
        System.out.println("nhập vào số hàng");
        row = scanner.nextInt();
        System.out.println("nhập vào số cột");
        col = scanner.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhập vào [%d][%d]:", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }

        maxnum = arr[0][0];
        for (int i = 0; i< arr.length;i++){
            for (int j = 0; j< arr[i].length; j++){
                if (arr[i][j]> maxnum){
                    maxnum = arr[i][j];
                }
            }
        }
        System.out.println("số lớn nhất mảng là :" + maxnum);
    }
}