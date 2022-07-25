package ss16_binary_file_and_serialization.exercise.ProductManagement.controller;

import ss16_binary_file_and_serialization.exercise.ProductManagement.service.IProductService;
import ss16_binary_file_and_serialization.exercise.ProductManagement.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {


    private static IProductService iProductService = new ProductService<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuProduct(){


        int choose;
        do {
            System.out.print("<<<>>>Vui lòng chọn thao tác:\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Hiển thị danh sách sản phẩm\n" +
                    "3.Tìm kiếm thông tin sản phẩm thoe ID\n" +
                    "4.Thoát");
            while (true){
                try {
                    System.out.println("bạn muốn??");
                   choose = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("Bạn nhập sai cú pháp,vui lòng nhập số thứ tự trong bảng!!");
                }
            }
            switch (choose){
                case 1: iProductService.addProduct();
                    break;
                case 2: iProductService.displayProduct();
                    break;
                case 3: iProductService.findProduct();
                    break;
                case 4:
                    System.out.println("xin cảm ơn\n");
                    System.exit(1);
                default:
                    System.out.println("vui lòng nhập số từ 1 đến 4\n");
            }



        }while (true);
    }
}
