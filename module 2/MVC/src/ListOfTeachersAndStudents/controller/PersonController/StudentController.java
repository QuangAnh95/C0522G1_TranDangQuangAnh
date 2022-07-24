package ListOfTeachersAndStudents.controller.PersonController;

import ListOfTeachersAndStudents.controller.PersonFindController.StudentFindcontroller;
import ListOfTeachersAndStudents.service.IsStudentService;
import ListOfTeachersAndStudents.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private  IsStudentService isStudentService = new StudentService();
    private StudentFindcontroller studentFindcontroller = new StudentFindcontroller();


    public void menuStudent() {
        int choose;
        do {
            System.out.println("1.Thêm mới sinh viên\n" +
                    "2.Xóa học viên\n" +
                    "3.xem danh sách học viên\n" +
                    "4.tìm kiếm học viên \n" +
                    "5.sắp xếp danh sách theo tên\n" +
                    "6.Quay về menu chính.\n");

            while (true){
                try {
                    System.out.println("mời bạn nhâp lựa chọn\n");
                    choose = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e){
                    System.out.println("bạn nhập sai cú phá,vui lòng nhập số\n");
                }
            }
            switch (choose) {
                case 1:
                    isStudentService.addStudent();
                    isStudentService.displayAllStudent();
                    break;
                case 2:
                    isStudentService.removeStudent();
                    isStudentService.displayAllStudent();
                    break;
                case 3:
                    isStudentService.displayAllStudent();
                    break;
                case 4:
                    studentFindcontroller.menuFindStudent();
                    isStudentService.displayAllStudent();
                    break;
                case 5:
                    isStudentService.sortStudent();
                    isStudentService.displayAllStudent();

                    break;
                case 6:
                    return;

            }
        } while (true);
    }

}
