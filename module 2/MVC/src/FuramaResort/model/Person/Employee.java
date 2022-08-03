package FuramaResort.model.Person;

public class Employee extends Person{
    private String idEmployee;
    private String academicLevel;
    private String location;
    private double wage;


    public Employee(String idEmployee, String academicLevel, String location, double wage) {
        this.idEmployee = idEmployee;
        this.academicLevel = academicLevel;
        this.location = location;
        this.wage = wage;
    }

    public Employee(String name, String dayOfBirth, String gender, String citizenIdentification, String phoneNumnber,
                    String email, String address, String idEmployee, String academicLevel, String location, double wage) {
        super(name, dayOfBirth, gender, citizenIdentification, phoneNumnber, email, address);
        this.idEmployee = idEmployee;
        this.academicLevel = academicLevel;
        this.location = location;
        this.wage = wage;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String getInfoPerson() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,\n",this.getName(),this.getDayOfBirth(),this.getGender(),this.getCitizenIdentification(),this.getPhoneNumnber(),
                this.getEmail(),this.getAddress(),this.getIdEmployee(),this.getAcademicLevel(),this.getLocation(),this.getWage());
    }

    @Override
    public String toString() {
        return  super.toString() +
                "  idEmployee(mã nhân viên):  " + idEmployee +
                ", academicLevel(trình độ):  " + academicLevel + '\'' +
                ", location(vị trí):   " + location + '\'' +
                ", wage(lương):   " + wage ;
    }
}
