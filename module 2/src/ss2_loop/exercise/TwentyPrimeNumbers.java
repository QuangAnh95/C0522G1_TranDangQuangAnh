package ss2_loop.exercise;

import java.util.Scanner;

public class TwentyPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố muốn in ra:");
        int number = scanner.nextInt();
        int count = 1;
        int prime = 3;
        if (number >= 1){
            System.out.println("số nguyên tố đầu tiên là 2 ");
        }
        for (int i = 2 ; i<=number ;){
            for (int j = 2; j <= Math.sqrt(prime);j++){
                if (prime % j == 0){
                    count = 0;
                    break;
                }
            }if (count != 0){
                System.out.println(prime);
                i++;
            }count= 1;
            prime++;

        }

    }
}
