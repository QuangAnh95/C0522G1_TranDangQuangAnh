package ss2_loop.exercise;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        boolean isInvalidOption;

        System.out.println("1.In ra hình chữ nhật");
        System.out.println("2.In ra tam giác vuông");
        System.out.println("3.In ra tam giác cân");
        System.out.println("4.Thoát");


        do {
            System.out.println("vui lòng chọn số!!");
            option = scanner.nextInt();
            isInvalidOption = option < 1 || option > 4;
            if (isInvalidOption) {
                System.out.println("Vui lòng nhập lại!!");
            }
        }
            while (isInvalidOption);
            if (option == 1) {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 8; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (option == 2) {
                for (int i = 1; i <= 8; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else if (option == 3) {
                for (int i = 1; i <= 8; i++) {
                    for (int k = 8; k > i; k--) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i * 2 - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
            } else {
                System.out.println("Thoát chương trình");

            }




    }

}