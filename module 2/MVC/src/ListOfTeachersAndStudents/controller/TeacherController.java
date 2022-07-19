package ListOfTeachersAndStudents.controller;

import ListOfTeachersAndStudents.service.ITeacherService;
import ListOfTeachersAndStudents.service.impl.StudentService;
import ListOfTeachersAndStudents.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService =  new TeacherService() ;

    public void menuTeacher(){
        do {
            System.out.println("1.thêm giáo viên\n" +
                    "2.xóa giáo viên\n" +
                    "3.Xem danh sách giáo viên\n" +
                    "4.Quay về menu chính.\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    iTeacherService.addTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }

}
