package ListOfTeachersAndStudents.controller;

import ListOfTeachersAndStudents.service.IsStudentService;
import ListOfTeachersAndStudents.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IsStudentService isStudentService = new StudentService();

    public void menuStudent(){
        do {
            System.out.println("1.Thêm mới học sinh\n" +
                    "2.Xóa học sinh\n" +
                    "3.xem danh sách học sinh\n" +
                    "4.Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    isStudentService.addStudent();
                    break;
                case 2 :
                    isStudentService.removeStudent();
                    break;
                case 3:
                    isStudentService.displayAllStudent();
                    break;
                case 4:
                    return;

            }
        }while (true);
    }

}
