package ListOfTeachersAndStudents.service.impl;

import ListOfTeachersAndStudents.model.Student;
import ListOfTeachersAndStudents.service.IsStudentService;
import ListOfTeachersAndStudents.utils.ReadStudentFile;
import ListOfTeachersAndStudents.utils.ReadTeacherFile;
import ListOfTeachersAndStudents.utils.WriteStudentFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentService<E> implements IsStudentService {
    private static List<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static final String PATH_STUDENT = "ListOfTeachersAndStudents/data/Studenlist.csv";
    public static final  String CLASS_REGEX = "[0-9]{2}[/][0-9]{2}[/][0-9]{4}";

    static {
        studentList.add(new Student(4,"Nguyễn khoa", "1/6/1997", "nam", "C09", 7));
        studentList.add(new Student(1,"N1guyễn Châu", "4/7/1997", "nữ", "C10", 8));
        studentList.add(new Student(7,"Trần Khánh", "1/9/1997", "nam", "C06", 7));
        studentList.add(new Student(3,"Lê Hoa", "5/8/1997", "nữ", "C06", 6));
        studentList.add(new Student(2,"Phạm Huy", "20/12/1997", "nam", "C12", 10));
        studentList.add(new Student(8,"KIên Trần", "1/6/1997", "nam", "C07", 2));
        studentList.add(new Student(5,"KIên Trần", "1/6/1997", "nam", "C07", 2));

    }
    public void writefile(){
        WriteStudentFile.writeStudentFile(PATH_STUDENT,studentList);
    }
    public void readFile(){
        List<Student> list = ReadStudentFile.readStudentFile(PATH_STUDENT);
        studentList.clear();
        studentList.addAll(list);
    }


    public static Student infoStudent() {
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        String dateOfBirth;
        do {
            String CLASS_REGEX = "[0-9]{2}[/][0-9]{2}[/][0-9]{4}";
            System.out.print("Nhập ngày sinh: ");
            dateOfBirth = scanner.nextLine();
            if (dateOfBirth.matches(CLASS_REGEX)) {
                break;
            } else {
                System.out.println("bạn phải nhập theo dạng: dd/mm/yyyy \n");
            }

        } while (true);

        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.print("Nhập lớp ");
        String classes = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        int point = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id, name, dateOfBirth, gender, classes, point);
        return student;


    }




    @Override
    public void addStudent() {
        readFile();
        Student student = infoStudent();
        studentList.add(student);
        System.out.println("thêm mới thành công!\n");
        writefile();


    }

    @Override
    public void displayAllStudent() {
        readFile();
        for (Student student : studentList) {
            System.out.println(student);
        }

    }

    @Override
    public void removeStudent() {
        readFile();
        int idRemove;

        while (true){
            try {
                System.out.println("nhập id cần xóa");
                idRemove = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException e){
                System.out.println("Bạn nhập sai cú pháp,vui lòng nhập lại số");
            }
        }
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idRemove) {
                System.out.println("bạn có chắn chắn muốn xóa??\n" +
                        "1.có\n" +
                        "2.không\n");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1) {
                    studentList.remove(student);
                    System.out.println("xóa thành công\n");
                    writefile();
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag) {
            System.out.println("không tìm thấy\n");
        }

    }

    @Override
    public void searchName() {
        readFile();
        System.out.println("nhập tên cần tìm");
        String name = scanner.nextLine();
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                System.out.println(student + "\n");
                isFlag = true;
            }
        }
        if (!isFlag) {
            System.out.println("không tìm thấy\n");
        }
    }

    @Override
    public void findIdStudent() {
        readFile();
        int idFind;
       while (true){
           try {
               System.out.println("nhập ID cần tìm");
               idFind = Integer.parseInt(scanner.nextLine());
              break;
           }catch (NumberFormatException e){
               System.out.println("bạn nhập sai cú pháp,vui lòng nhập lại số");
           }
       }
        boolean isFlag = false;
        for (Student student : studentList) {
            if (student.getId() == idFind) {
                System.out.println(student + "\n");
                isFlag = true;
                break;
            }

        }
        if (!isFlag) {
            System.out.println("Không tìm thấy \n");
        }
    }

    @Override
    public void sortStudent() {
        readFile();
        boolean isSwap = true;
        for (int i = 0; i < studentList.size() - 1 && isSwap; i++) {
            isSwap = false;
            for (int j = 0; j < studentList.size() - 1 - i; j++) {
                if ((studentList.get(j).getName().compareTo(studentList.get(j + 1).getName())) > 0) {
                    Collections.swap(studentList, j, j + 1);
                    isSwap = true;
                }
                if ((studentList.get(j).getName().compareTo(studentList.get(j + 1).getName())) == 0) {
                    if (studentList.get(j).getId() > studentList.get(j + 1).getId()) {
                        Collections.swap(studentList, j, j + 1);
                        isSwap = true;
                    }
                }

            }
        }
        writefile();
        displayAllStudent();
    }



}
