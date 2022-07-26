package FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class PromotionController {
    public void promotionMenu() {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("" +
                    "<<>> Promotion Management <<>>\n" +
                    "<<>>(Quản lý khuyến mãi)<<>>\n" +
                    "1. Display list customers use service (hiển thị danh sách khách hàng sử dụng dịch vụ)\n" +
                    "2. Display list customers get voucher (Hiển thị danh sách khách hàng nhận được voucher)\n" +
                    "3. Return main menu (trở lại menu chính)\n");

            while (true) {
                try {
                    System.out.println("Please make a choice\n" +
                            "(vui lòng đưa ra lựa chọn!)\n");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("you entered the wrong syntax, please enter the number\n" +
                            "Bạn nhập sai cú pháp,vui lòng nhập số");
                }

            }
            switch (choose) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Please enter a number from 1 to 3\n" +
                            "Vui lòng nhập số từ 1 đến 3 !\n");
            }

        } while (true);
    }
}

