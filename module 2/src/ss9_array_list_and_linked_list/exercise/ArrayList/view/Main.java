package ss9_array_list_and_linked_list.exercise.ArrayList.view;

import ss9_array_list_and_linked_list.exercise.ArrayList.Controller.Student;

import ss9_array_list_and_linked_list.exercise.ArrayList.service.impl.MyList;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student(1,"Lý Hùng");
        Student student2 = new Student(2,"Nguyễn chánh");
        Student student3 = new Student(3,"Lâm Khang");
        Student student4 = new Student(4,"Lê Lợi");
        Student student5 = new Student(5,"Trần Lâm");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5);

        for (int i = 0; i < studentMyList.size(); i++) {
            System.out.println((i+1)+"."+studentMyList.elements[i]);
        }
        System.out.println(studentMyList.get(1));

    }

    }

