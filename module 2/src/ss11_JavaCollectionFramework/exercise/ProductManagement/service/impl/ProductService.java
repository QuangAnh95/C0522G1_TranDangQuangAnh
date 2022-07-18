package ss11_JavaCollectionFramework.exercise.ProductManagement.service.impl;

import ss11_JavaCollectionFramework.exercise.ProductManagement.model.Product;
import ss11_JavaCollectionFramework.exercise.ProductManagement.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService<E> implements IProductService {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Product infoProduct(){
        System.out.println("Nhập mã sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập màu sắc");
        String color = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập ngày sản xuất");
        int dateOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hạn sử dụng");
        int expiry = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name,  color,  price, dateOfManufacture,expiry);
        return product;




    }

    @Override
    public void addProduct() {
        Product product = infoProduct();
        productList.add(product);
        System.out.println("Thêm sản phẩm thành công");


    }


    @Override
    public void removeProduct() {
        System.out.println("nhập id cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product:productList){
            if (product.getId() == idRemove){
                System.out.println("bạn có chắn chắn muốn xóa??\n" +
                        "1.có\n" +
                        "2.không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    productList.remove(product);
                    System.out.println("xóa thành công");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void displayAllProduct() {
        for (Product product: productList){
            System.out.println(product + "\n");
        }

    }

    @Override
    public void findProduct() {
        System.out.println("nhập id cần tìm");
        int idFind = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product : productList) {
            if (product.getId() == idFind) {
                System.out.println("sản phẩm cần tìm: \n");
                System.out.println(product);

            }else {
                System.out.println("không tìm thấy sản phẩm");
            }

        }
    }







    @Override
    public void sortupProduct() {
        AscendingService ascendingService = new AscendingService();
        productList.sort(ascendingService);

    }

    @Override
    public void sortdownProduct() {
        DecreaseService decreaseService = new DecreaseService();
        productList.sort(decreaseService);

    }

    @Override
    public void setName() {
        System.out.println("Nhập id cần sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product: productList){
            if (product.getId() == idEdit){
                System.out.println("nhập tên sản phẩm");
                product.setName(scanner.nextLine());
            }
            System.out.println("sản phẩm sau khi sửa tên:\n");
            System.out.println(product+"\n");
            isFlag = true;
            break;

        }
        if (!isFlag){
            System.out.println("không tìm thấy");
        }
    }

    @Override
    public void setColor() {
        System.out.println("Nhập id cần sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product: productList){
            if (product.getId() == idEdit){
                System.out.println("nhập màu cần sửa :");
                product.setColor(scanner.nextLine());

            }
            System.out.println("sản phẩm sau khi sửa giá: \n");
            System.out.println(product+"\n");
            isFlag = true;
            break;

        }
        if (!isFlag){
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void setExpiry() {
        System.out.println("Nhập id cần sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product: productList){
            if (product.getId() == idEdit){
                System.out.println("nhập hạn sử dụng muốn sửa:");
                product.setExpiry(Integer.parseInt(scanner.nextLine()));

            }
            System.out.println("sản phẩm sau khi sửa ngày:\n");
            System.out.println(product + "\n");
            isFlag = true;
            break;

        }
        if (!isFlag){
            System.out.println("không tìm thấy");
        }


    }

    @Override
    public void setDateOfManufacture() {
        System.out.println("Nhập id cần sửa");
        int idEdit = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Product product: productList){
            if (product.getId() == idEdit){
                System.out.println("Nhập ngày sản xuất muốn sửa:");
                product.setDateOfManufacture(Integer.parseInt(scanner.nextLine()));

            }
            System.out.println("sản phẩm sau khi sửa ngày:\n");
            System.out.println(product+"\n");
            isFlag = true;
            break;

        }
        if (!isFlag){
            System.out.println("không tìm thấy");
        }


    }

    @Override
    public void setPrice() {
            System.out.println("Nhập id cần sửa");
            int idEdit = Integer.parseInt(scanner.nextLine());
            boolean isFlag = false;
            for (Product product: productList){
                if (product.getId() == idEdit){
                    System.out.println("nhập giá muốn sửa");
                    product.setPrice(Integer.parseInt(scanner.nextLine()));

                }
                System.out.println("sản phẩm sau khi sửa giá:\n");
                System.out.println(product+"\n");
                isFlag = true;
                break;

            }
            if (!isFlag){
                System.out.println("không tìm thấy");
            }



        }
}
