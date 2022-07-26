package FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class BookingController {
    public void bookingMenu(){
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("" +
                    "<<>> Booking Management <<>>\n" +
                    "<<>>(Quản lý đặt chỗ)<<>>\n" +
                    "1. Add new booking (Thêm đặt chỗ mới)\n" +
                    "2. Display list booking (Hiển thị danh sách đặt chỗ)\n" +
                    "3. Create new constracts (Tạo hợp đồng mới)\n" +
                    "4. Display list contracts (Hiển thị danh sách hợp đồng)\n" +
                    "5. Edit contracts (Chỉnh sửa hợp đòng)\n" +
                    "6. Return main menu \n");

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
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Please enter a number from 1 to 6\n" +
                            "Vui lòng nhập số từ 1 đến 6 !\n");
            }

        }while (true);
    }
}
