package ss5_AccessModifierStaticMethodStaticProperty.exercise.IndexClassInJava;

public class Main {
    public static void main(String[] args) {
        IndexClassInJava student1 = new IndexClassInJava();
        student1.setName("Nguyễn Văn A");
        student1.setClasses("C03");
        System.out.println("tên học sinh:  " + student1.getName() + "\n" + "học lớp : "+   student1.getClasses()  );

        IndexClassInJava student2 = new IndexClassInJava();
        student2.setName("Nguyễn Văn b");
        student2.setClasses("C04");
        System.out.println("tên học sinh:  " + student2.getName() + "\n" + "học lớp : "+   student2.getClasses()  );


    }
}
