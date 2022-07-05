package ss3_array.exercise;

import java.util.Scanner;

public class SumTheNumbersInAColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        int colsum;
        int sum = 0;
        System.out.println("nhập vào số hàng");
        row = scanner.nextInt();
        System.out.println("nhập vào số cột");
        col = scanner.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < row;i++){
            for (int j = 0; j < col;j++){
                System.out.printf("Nhập vào [%d][%d]:",i,j);
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i<row;i++){
            for (int j = 0;j < col;j++){
                System.out.print(arr[i][j] + "\t");
            }System.out.println();
        }
        do {
            System.out.println("nhập vào cột cần tính tổng");
            colsum = scanner.nextInt();
            if (colsum< 0 || colsum > col){
                System.out.println("vui lòng nhập lại số cột >0 và < số cột hiện có");
            }
        } while (colsum< 0 || colsum > col);
        for (int i = 0; i < arr.length;i++){
            sum += arr[i][colsum];
        }
        System.out.println("tổng của hàng " + colsum + "là " + sum);
    }
}
