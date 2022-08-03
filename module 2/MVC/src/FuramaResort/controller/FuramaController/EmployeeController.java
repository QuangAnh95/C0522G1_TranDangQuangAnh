package FuramaResort.controller.FuramaController;

import FuramaResort.service.IEmployeeService;
import FuramaResort.service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeController {

    public void employeeMenu() {
        Scanner scanner = new Scanner(System.in);
        IEmployeeService employeeService = new EmployeeService<>();
        int chosse;
        do {
            System.out.println("" +
                    "<<>> Employee Management<<>>\n" +
                    "<<>> (Quản lý nhân viên)<<>>\n" +
                    "1. Display list employees (Hiển thị danh sách nhân viên)\n" +
                    "2. Add new employee (Thêm nhân viên mới)\n" +
                    "3. Edit employee (Chỉnh sửa nhân viên)\n" +
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
                case 1:employeeService.displayEmployss();
                    break;
                case 2: employeeService.addEmployss();
                    break;
                case 3: employeeService.editEmployss();
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
