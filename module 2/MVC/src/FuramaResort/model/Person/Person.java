package FuramaResort.model.Person;

public abstract class Person {
    private String name;
    private String  dayOfBirth;
    private String gender;
    private String citizenIdentification;
    private String phoneNumnber;
    private String email;
    private String address;

    public Person() {
    }

    public Person(String name, String dayOfBirth, String gender, String citizenIdentification, String phoneNumnber, String email, String address) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.citizenIdentification = citizenIdentification;
        this.phoneNumnber = phoneNumnber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCitizenIdentification() {
        return citizenIdentification;
    }

    public void setCitizenIdentification(String citizenIdentification) {
        this.citizenIdentification = citizenIdentification;
    }

    public String getPhoneNumnber() {
        return phoneNumnber;
    }

    public void setPhoneNumnber(String phoneNumnber) {
        this.phoneNumnber = phoneNumnber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract String getInfoPerson();

    @Override
    public String toString() {
        return
                "  Name(họ và tên):   " + name +
                ", DayOfBirth(ngày tháng năm sinh):   " + dayOfBirth +
                ", Gender(giới tính):   " + gender +
                ", CitizenIdentification(căn cước công dân):   " + citizenIdentification +
                ", PhoneNumnber(số điện thoại):  " + phoneNumnber +
                ", Email(địa chỉ email):   " + email +
                ", Address(địa chỉ):   " + address ;

    }
}
