package ListOfTeachersAndStudents.service.impl;

import ListOfTeachersAndStudents.Exception.DuplicateIDException;
import ListOfTeachersAndStudents.model.Teacher;
import ListOfTeachersAndStudents.service.ITeacherService;
import ListOfTeachersAndStudents.utils.ReadTeacherFile;
import ListOfTeachersAndStudents.utils.WriteTeacherFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TeacherService<E> implements ITeacherService {
    public static final String PATH_TEACHER = "ListOfTeachersAndStudents/data/TeacherList.csv";
    private static List<Teacher> teacherList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        teacherList.add(new Teacher(8, "Cao Linh", "14/1/1987", "nữ","toán"));
        teacherList.add(new Teacher(3, "Trần Tín", "13/8/1980", "nam","văn"));
        teacherList.add(new Teacher(1, "Nguyễn Tâm", "20/8/1977", "nam","hóa"));
        teacherList.add(new Teacher(7, "Thanh Hà", "14/12/1987", "nữ","sử"));
        teacherList.add(new Teacher(6, "Cao Linh", "13/8/1983", "nữ","dịa"));


    }
    public void writeFile(){
        WriteTeacherFile.writeTeacherFile(PATH_TEACHER,teacherList);
    }
    public void readFile(){
        List<Teacher> list = ReadTeacherFile.readTeacherFile(PATH_TEACHER);
        teacherList.clear();
        teacherList.addAll(list);
    }

    @Override
    public void addTeacher() {
        readFile();
        Teacher teacher = infoTeacher();
        teacherList.add(teacher);
        System.out.println("thêm mới thành công");
        writeFile();

    }

    @Override
    public void displayAllTeacher() {
        readFile();
        for (Teacher teacher:teacherList){
            System.out.println(teacher);
        }

    }

    @Override
    public void removeTeacher() {
        readFile();
        int idRemove;
       while (true){
           try {
               System.out.println("mời bạn nhập id giáo viên cần xóa!");
               idRemove = Integer.parseInt(scanner.nextLine());
               break;
           }catch (NumberFormatException e){
               System.out.println("bạn nhập sai cú pháp,vui lòng nhập số");
           }
       }
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


        }
        writeFile();
        if (!isFlag){
            System.out.println("không tìm thấy");
        }

    }

    @Override
    public void findIdTeacher() {
        readFile();
        int idFind;
      while (true){
          try {
              System.out.println("nhập ID cần tìm");
              idFind = Integer.parseInt(scanner.nextLine());
              for (Teacher teacher: teacherList){
                  if (teacher.getId()==idFind){
                      throw new DuplicateIDException("Trùng id,vui lòng nhập lại");

                  }
              }
              break;
          }catch (NumberFormatException e){
              System.out.println("vui lòng nhập số!");
          }catch (DuplicateIDException e){
              System.out.println(e.getMessage());
          }
      }
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
        readFile();
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
        readFile();
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
        writeFile();
        displayAllTeacher();
    }

    public static Teacher infoTeacher(){
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
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("nhập chuyên môn");
        String  specialize = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, gender,specialize);
        return teacher;
    }
}
