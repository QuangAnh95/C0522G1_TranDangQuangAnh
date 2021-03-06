package ListOfTeachersAndStudents.model;

public class Teacher extends Person {
    private String specialize;

    public Teacher(){

    }

    public Teacher(int id, String name, String dateOfBirth, String gender, String specialize){
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "  Thông tin giảng viên:  " +super.toString() +
                "   chuyên môn:  " + specialize ;
    }

    @Override
    public String getinfo() {
        return String.format("%s,%s,%s,%s,%s,\n",this.getId(),this.getName(),this.getDateOfBirth(),this.getGender(),this.getSpecialize());
    }
}
