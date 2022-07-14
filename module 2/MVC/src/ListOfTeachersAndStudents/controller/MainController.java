package ListOfTeachersAndStudents.controller;

import java.util.Scanner;

public class MainController {
    public static void menuController(){
        Scanner scanner = new Scanner(System.in);
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();

        do {
            System.out.println("++++++Chào mừng++++++ \n" +
                    "--bạn muốn gì??--\n" +
                    "1.Quản lý học viên\n" +
                    "2.Quản lý giảng viên\n" +
                    "3.thoát");
            System.out.println("Vui lòng đưa ra lựa chọn");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:{
                    studentController.menuStudent();
                }
                case 2 :{
                    teacherController.menuTeacher();
                }
                case 3:{
                    System.exit(1);
                }


            }
        }while (true);
    }
}

