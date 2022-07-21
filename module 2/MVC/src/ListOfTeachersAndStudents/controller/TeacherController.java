package ListOfTeachersAndStudents.controller;

import ListOfTeachersAndStudents.controller.PersonFindController.TeacherFindController;
import ListOfTeachersAndStudents.service.ITeacherService;
import ListOfTeachersAndStudents.service.impl.StudentService;
import ListOfTeachersAndStudents.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private Scanner scanner = new Scanner(System.in);
    private ITeacherService iTeacherService = new TeacherService();
    private TeacherFindController teacherFindController = new TeacherFindController();

    public void menuTeacher() {
        do {
            System.out.println("1.thêm giảng viên\n" +
                    "2.xóa giảng viên\n" +
                    "3.Xem danh sách giảng viên\n" +
                    "4.tìm kiếm giảng viên\n" +
                    "5.sắp xếp danh sách giảng viên theo tên\n" +
                    "6.Quay về menu chính\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.addTeacher();
                    iTeacherService.displayAllTeacher();
                    break;
                case 2:
                    iTeacherService.removeTeacher();
                    iTeacherService.displayAllTeacher();
                    break;
                case 3:
                    iTeacherService.displayAllTeacher();
                    break;
                case 4:
                    teacherFindController.menuFindTeacher();
                    iTeacherService.displayAllTeacher();
                    break;
                case 5:
                    iTeacherService.sortTeacher();
                    iTeacherService.displayAllTeacher();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

}
