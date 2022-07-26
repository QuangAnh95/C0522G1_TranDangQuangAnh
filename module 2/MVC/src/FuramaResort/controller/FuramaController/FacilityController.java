package FuramaResort.controller.FuramaController;

import java.util.Scanner;

public class FacilityController {
    public void facilityMenu(){
        Scanner scanner = new Scanner(System.in);
        int chosse;
        do {
            System.out.println("" +
                    "<<>>  Facility Management <<>>\n" +
                    "<<>> (Quản lý cơ sở )<<>>\n" +
                    "1. Display list facility (Hiển thị danh sách cơ sở)\n" +
                    "2. Add new facility (Thêm nhân cơ sở)\n" +
                    "3. Display list facility maintenance (Hiển thị danh sách bảo trì cơ sở)\n" +
                    "4. Return main menu (Quay lại menu chính)");
            while (true) {
                try {
                    System.out.println("Please make a choice\n" +
                            "(vui lòng đưa ra lựa chọn!)\n");
                    chosse = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("you entered the wrong syntax, please enter the number\n" +
                            "Bạn nhập sai cú pháp,vui lòng nhập số");
                }
            }
            switch (chosse) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Please enter a number from 1 to 4\n" +
                            "Vui lòng nhập số từ 1 đến 4 !\n");
            }

        } while (true);
    }

}
