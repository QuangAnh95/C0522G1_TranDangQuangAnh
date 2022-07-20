package ListOfTeachersAndStudents.controller.PersonFindController;

import ListOfTeachersAndStudents.service.ITeacherService;
import ListOfTeachersAndStudents.service.IsStudentService;
import ListOfTeachersAndStudents.service.impl.StudentService;
import ListOfTeachersAndStudents.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherFindController {
    Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService<>();

    public void menuFindTeacher(){
        do {
            System.out.println("....Bạn muốn tìm giảng viên theo ??....\n" +
                    "1.ID\n" +
                    "2.Họ tên\n" +
                    "3.Thoát");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:iTeacherService.findIdTeacher();
                    break;
                case 2:iTeacherService.findNameTeacher();
                    break;
                case 3:
                    return;
            }

        }while (true);
    }
}
