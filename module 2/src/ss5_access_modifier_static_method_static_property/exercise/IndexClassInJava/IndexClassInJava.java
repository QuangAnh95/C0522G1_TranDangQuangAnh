package ss5_access_modifier_static_method_static_property.exercise.IndexClassInJava;

public class IndexClassInJava {
    private String name = "jonh";
    private String classes = "C02";

     public IndexClassInJava(){

    };
    public IndexClassInJava(String name , String classes){
        this.name = name;
        this.classes = classes;
    }


    public void setName(String newName) {
        this.name = newName;
    }


    public void setClasses(String newClasses) {
        this.classes = newClasses;
    }

}
