package ListOfTeachersAndStudents.model;

public class Student extends Person {
    private int point;
    private String classes;

    public Student(int id, String name, String dateOfBirth, int point, String classes){

    }

    public Student(int id, String name, String dateOfBirth, String gender, String classes, int point){
        super(id, name, dateOfBirth, gender);
        this.classes = classes;
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "  thông tin học viên:  " + super.toString()+
                "  điểm số:  " + point +
                "  lớp:  " + classes ;

    }

    @Override
    public String getinfo() {
            return String.format("%s,%s,%s,%s,%s,%s,\n", this.getId(),this.getName(),this.getDateOfBirth(),this.getGender(),this.getClasses(),this.getPoint());
    }
}


