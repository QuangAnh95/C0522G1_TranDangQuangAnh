package ss11_JavaCollectionFramework.exercise.ProductManagement.controller;

import ss11_JavaCollectionFramework.exercise.ProductManagement.service.IProductService;
import ss11_JavaCollectionFramework.exercise.ProductManagement.service.impl.ProductService;

import java.util.Scanner;

public class ProductEditController {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService iProductService = new ProductService<>();

    public void menuEdit() {
        do {
            System.out.println("Bạn muốn sửa gì??\n" +
                    "1.tên sản phẩm\n" +
                    "2.màu\n " +
                    "3.giá sản phẩm\n" +
                    "4.ngày sản xuất\n" +
                    "5.Hạn sử dụng\n" +
                    "6.thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iProductService.setName();
                    break;
                case 2:
                    iProductService.setColor();
                    break;
                case 3:
                    iProductService.setPrice();
                    break;
                case 4:
                    iProductService.setDateOfManufacture();
                    break;
                case 5:
                    iProductService.setExpiry();
                    break;
                case 6:
                    return;

            }

        } while (true);
    }
}