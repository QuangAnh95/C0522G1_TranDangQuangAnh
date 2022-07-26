package FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class DisplayMainMenu {
    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        BookingController bookingController = new BookingController();
        PromotionController promotionController = new PromotionController();

        int choose;
        do {
            System.out.println("<<>>RESORT FURAMA SYSTEM MANAGEMENT<<>>\n" +
                               "<<>>HỆ THỐNG QUẢN LÝ RESORT FURAMA<<>>\n" +
                                "1. Employee Management (Quản lý nhân viên)\n" +
                                "2. Customer Management (Quản lý khách hàng)\n" +
                                "3. Facility Management (Quản lý cơ sở)\n" +
                                "4. Booking Management (Quản lý đặt chỗ)\n" +
                                "5. Promotion Management (Quản lý khuyến mãi)\n" +
                                "6. Exit\n");
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
                case 1:employeeController.employeeMenu();
                    break;
                case 2:customerController.customerMenu();
                    break;
                case 3:facilityController.facilityMenu();
                    break;
                case 4:bookingController.bookingMenu();
                    break;
                case 5:promotionController.promotionMenu();
                    break;
                case 6:
                    System.exit(1);
                default:
                    System.out.println("Please enter a number from 1 to 6\n" +
                            "Vui lòng nhập số từ 1 đến 6!\n");
            }

        }while (true);
    }
}
