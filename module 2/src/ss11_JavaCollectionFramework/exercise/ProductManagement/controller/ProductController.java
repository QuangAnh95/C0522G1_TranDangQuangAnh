package ss11_JavaCollectionFramework.exercise.ProductManagement.controller;

import ss11_JavaCollectionFramework.exercise.ProductManagement.service.IProductService;
import ss11_JavaCollectionFramework.exercise.ProductManagement.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static  Scanner scanner = new Scanner(System.in);
    private static  IProductService iProductService = new ProductService<>();
    private static ProductEditController productEdit = new ProductEditController();

    public static void menuProduct(){
        do {
            System.out.println("Xin mời bạn chọn thao tác: \n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm\n" +
                    "3.Xóa sản phẩm\n" +
                    "4.Hiển thị sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.sắp xếp giá sản phẩm tăng dần\n" +
                    "7.sắp xếp giá sản phẩm giảm dần\n" +
                    "8.thoát");

            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1: iProductService.addProduct();
                break;

                case 2: productEdit.menuEdit();
                break;

                case 3: iProductService.removeProduct();
                break;

                case 4: iProductService.displayAllProduct();
                break;

                case 5: iProductService.findProduct();
                break;

                case 6: iProductService.sortupProduct();
                break;

                case 7: iProductService.sortdownProduct();
                break;

                case 8: System.exit(1);

            }

        }while (true);
    }
}
