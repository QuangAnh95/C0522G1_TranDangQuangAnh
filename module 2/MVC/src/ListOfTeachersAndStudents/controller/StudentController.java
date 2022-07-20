package ListOfTeachersAndStudents.controller;

import ListOfTeachersAndStudents.controller.PersonFindController.StudentFindcontroller;
import ListOfTeachersAndStudents.service.IsStudentService;
import ListOfTeachersAndStudents.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IsStudentService isStudentService = new StudentService();
    private StudentFindcontroller studentFindcontroller = new StudentFindcontroller();


    public void menuStudent(){
        do {
            System.out.println("1.Thêm mới sinh viên\n" +
                    "2.Xóa học viên\n" +
                    "3.xem danh sách học viên\n" +
                    "4.tìm kiếm học viên \n" +
                    "5.sắp xếp danh sách theo tên" +
                    "6.Quay về menu chính.\n");
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
                case 4:studentFindcontroller.menuFindStudent();
                    break;
                case 5:isStudentService.sortStudent();
                    break;
                case 6:
                    return;

            }
        }while (true);
    }

}
