package ListOfTeachersAndStudents.service.impl;

import ListOfTeachersAndStudents.model.Student;
import ListOfTeachersAndStudents.model.Teacher;
import ListOfTeachersAndStudents.service.ITeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService<E> implements ITeacherService {
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        teacherList.add(new Teacher(8, "Cao Linh", "14/1/1987", "nữ","toán"));
        teacherList.add(new Teacher(3, "Trần Tín", "13/8/1980", "nam","văn"));
        teacherList.add(new Teacher(1, "Nguyễn Tâm", "20/8/1977", "nam","hóa"));
        teacherList.add(new Teacher(7, "Thanh Hà", "14/12/1987", "nữ","sử"));
        teacherList.add(new Teacher(6, "Cao Linh", "13/8/1983", "nữ","dịa"));


    }

    @Override
    public void addTeacher() {
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void displayAllTeacher() {
        for (Teacher teacher:teacherList){
            System.out.println(teacher);
        }

    }

    @Override
    public void removeTeacher() {
        System.out.println("mời bạn nhập id giáo viên cần xóa!");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList){
            if (teacher.getId() == idRemove){
                System.out.println("bạn có chắc chắn muốn xóa không??\n" +
                        "1.có\n" +
                        "2.không\n");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo ==1){
                    teacherList.remove(teacher);
                    System.out.println("xóa thánh công!");
                }
                isFlag = true;
                break;
            }


        }if (!isFlag){
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void findIdTeacher() {
        System.out.println("nhập ID cần tìm");
        int idFind = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Teacher teacher : teacherList){
            if (teacher.getId()== idFind){
                System.out.println(teacher+ "\n");
                isFlag = true;
                break;
            }

        }
        if (!isFlag){
            System.out.println("Không tìm thấy \n");
        }
    }

    @Override
    public void findNameTeacher() {
        System.out.println("nhập tên cần tìm");
        String name = scanner.nextLine();
        boolean isFlag = false;
        for (Teacher teacher : teacherList){
            if (teacher.getName().contains(name)){
                System.out.println(teacher + "\n");
                isFlag = true;
            }
        }
        if (!isFlag){
            System.out.println("không tìm thấy\n");
        }
    }

    @Override
    public void sortTeacher() {
        boolean isSwap = true;

        for (int i = 0;i<teacherList.size();i++){
            isSwap = false;
            for (int j = 0; j <teacherList.size()-1-i;j++){
                if ((teacherList.get(j).getName().compareTo(teacherList.get(j+1).getName()))>0){
                    Collections.swap(teacherList,j,j+1);
                }
                if ((teacherList.get(j).getName().compareTo(teacherList.get(j+1).getName()))==0){
                    if (teacherList.get(j).getId()>teacherList.get(j+1).getId()){
                        Collections.swap(teacherList,j,j+1);
                    }
                }
            }
        }
    }

    public static Teacher infoTeacher(){
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập name: ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập chuyên môn");
        String  specialize = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, gender,specialize);
        return teacher;
    }
}
