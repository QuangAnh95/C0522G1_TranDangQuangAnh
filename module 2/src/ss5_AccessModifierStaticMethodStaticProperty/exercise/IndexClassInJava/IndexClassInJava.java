package ss5_AccessModifierStaticMethodStaticProperty.exercise.IndexClassInJava;

public class IndexClassInJava {
    private String name = "jonh";
    private String classes = "C02";

     public IndexClassInJava(){

    };
    public IndexClassInJava(String name , String classes){
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }

}
