package ListOfTeachersAndStudents.controller.PersonFindController;

import ListOfTeachersAndStudents.service.IsStudentService;
import ListOfTeachersAndStudents.service.impl.StudentService;

import java.util.Scanner;

public class StudentFindcontroller {
    Scanner scanner = new Scanner(System.in);
    IsStudentService isStudentService = new StudentService<>();

    public void menuFindStudent(){
       do {
           System.out.println("....Bạn muốn tìm sinh viên theo ??....\n" +
                   "1.ID\n" +
                   "2.Họ tên\n" +
                   "3.Thoát");

           int choose = Integer.parseInt(scanner.nextLine());

           switch (choose){
               case 1:isStudentService.findIdStudent();
                   break;
               case 2:isStudentService.searchName();
                   break;
               case 3:
                   return;
           }

       }while (true);
    }
}
