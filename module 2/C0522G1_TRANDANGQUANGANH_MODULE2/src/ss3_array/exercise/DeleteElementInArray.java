package ss3_array.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[]{5,10,15,20,25,30,20,40,45,50};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số muốn xóa");
        int delnumber = scanner.nextInt();
        int index = 0;
        int count = 0;

        for (int i = 0; i < arr.length  ; i++){
            if (delnumber == arr[i]){
                count++;
                index = i;
                System.out.println("Số  " + delnumber + " xuất hiện ở vị trí  " + index);
            }
            if (count != 0){
                arr[index] = arr[index+1];

            }
        } System.out.print("mảng sau khi xóa " + Arrays.toString(arr));
    }
}
