package FuramaResort.controller.FuramaController;

import FuramaResort.service.ICustomerService;
import FuramaResort.service.impl.CustomerService;

import java.util.Scanner;

public class CustomerController {
    public void customerMenu(){
        Scanner scanner = new Scanner(System.in);
        ICustomerService iCustomerService = new CustomerService<>();
        int choose;
        do {
            System.out.println("" +
                    "<<>> Customer Management<<>>\n" +
                    "<<>>(Quản lý khách hàng)<<>>\n" +
                    "1. Display list customers (hiển thị danh sách khách hàng)\n" +
                    "2. Add new customer (thêm khách hàng mới)\n" +
                    "3. Edit customer (chỉnh sửa khách hàng)\n" +
                    "4. Return main menu (trở lại menu chính)\n");

            while (true){
                try {
                    System.out.println("Please make a choice\n" +
                            "(vui lòng đưa ra lựa chọn!)\n");
                   choose = Integer.parseInt(scanner.nextLine());
                    break;
                }catch (NumberFormatException e){
                    System.out.println("you entered the wrong syntax, please enter the number\n" +
                            "Bạn nhập sai cú pháp,vui lòng nhập số");
                }

            }
            switch (choose){
                case 1: iCustomerService.displayCustomer();
                    break;
                case 2: iCustomerService.addCustomer();
                    break;
                case 3:iCustomerService.editCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please enter a number from 1 to 4\n" +
                            "Vui lòng nhập số từ 1 đến 4 !\n");
            }

        }while (true);
    }
}
