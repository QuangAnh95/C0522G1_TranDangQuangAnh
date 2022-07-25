package ss16_binary_file_and_serialization.exercise.ProductManagement.service.impl;

import ss16_binary_file_and_serialization.exercise.ProductManagement.exception.DuplicateIDException;
import ss16_binary_file_and_serialization.exercise.ProductManagement.model.Product;
import ss16_binary_file_and_serialization.exercise.ProductManagement.service.IProductService;
import ss16_binary_file_and_serialization.exercise.ProductManagement.utils.ReadToFile;
import ss16_binary_file_and_serialization.exercise.ProductManagement.utils.WriterToFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService<E> implements IProductService {
    private static final Scanner scanner = new Scanner(System.in);
    private static  List<Product> productList = new ArrayList<>();
    private static final String PATH = "ss16_binary_file_and_serialization/exercise/ProductManagement/data/savedata.csv";

    public void writerfile(){
        WriterToFile.writerToFile(PATH,productList);
    }
    public void readfile(){
        List<Product> list = ReadToFile.readToFile(PATH);
        productList.clear();
        productList.addAll(list);
    }

    public static Product infoProduct() {
        int productCode;
        while (true) {
            try {
                System.out.println("Nhập mã sản phẩm");
                productCode = Integer.parseInt(scanner.nextLine());
                for (Product product : productList) {
                    if (productCode == product.getProductCode()) {
                        throw new DuplicateIDException("Mã sản phẩm đã tồn tại,vui lòng nhập lại");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai cú pháp, vui lòng nhập số");
            }catch (DuplicateIDException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập tên sản phẩm");
        String productIsName = scanner.nextLine();

        System.out.println("Nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        double price;
        while (true) {
            try {
                System.out.println("Nhập giá sản phẩm");
                price = Double.parseDouble(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai cú pháp,vui lòng nhập số");
            }
        }
        System.out.println("Nhập màu sản phẩm");
        String color = scanner.nextLine();

        Product product = new Product(productCode, productIsName, manufacturer, price, color);
        return product;




    }

    @Override
    public void addProduct() {

        Product product = infoProduct();
        productList.add(product);
        System.out.println("Thêm mới sản phẩm thành công");
        writerfile();
    }

    @Override
    public void displayProduct() {
       readfile();
        System.out.println("Danh sách sản phẩm");
        for (Product product : productList){
            System.out.println(product);
        }

    }

    @Override
    public void findProduct() {
        readfile();
        int idFind;
        while (true){
            try {
                System.out.println("Nhập mã sản phẩm cần tìm");
                idFind = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Nhập sai cú pháp,vui lòng nhập số");
            }
        }
        boolean isflag = false;
        for (Product product: productList){
            if (product.getProductCode()==idFind){
                System.out.println(product);
                isflag = true;
                break;
            }
        }
        if (!isflag){
            System.out.println("Không tìm thấy sản phẩm,vui lòng nhập lại");
        }


    }
}


