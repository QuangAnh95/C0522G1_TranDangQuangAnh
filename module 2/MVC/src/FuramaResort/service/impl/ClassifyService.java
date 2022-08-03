package FuramaResort.service.impl;

import java.util.Scanner;

public class ClassifyService {
    private static Scanner scanner = new Scanner(System.in);
    public static void CustomerClassification(){

    }

    public static void rentalType(){
       do {
           System.out.println("+++++PHÂN LOẠI KIỂU MUỐN THUÊ+++++\n" +
                   "1.  thuê theo năm\n" +
                   "2.  thuê theo tháng\n" +
                   "3.  thuê theo ngày\n" +
                   "4.  thuê theo giờ\n");
           int choose = Integer.parseInt(scanner.nextLine());
           switch (choose){
               case 1:

           }
       }while (true);

    }
}
