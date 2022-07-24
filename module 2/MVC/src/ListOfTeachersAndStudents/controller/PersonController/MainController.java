package ListOfTeachersAndStudents.controller.PersonController;

import java.util.Scanner;

public class MainController {
    public static void menuController(){
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        int choose;

        do {
            System.out.println("++++++Chào mừng++++++ \n" +
                    "--bạn muốn gì??--\n" +
                    "1.Quản lý học viên\n" +
                    "2.Quản lý giảng viên\n" +
                    "3.thoát\n");
            while (true) {
                try {
                    System.out.println("Mời bạn nhập lựa chọn: \n");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Bạn đã nhập sai cú pháp vui lòng nhập số!\n ");
                }
            }

            switch (choose) {
                case 1:
                    studentController.menuStudent();
                    break;
                case 2:
                    teacherController.menuTeacher();
                    break;
                case 3:
                    System.out.println("Cảm ớn quý khách!\n");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại!\n ");

            }
        } while (true);
    }


}

