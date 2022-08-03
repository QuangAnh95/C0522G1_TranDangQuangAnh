package FuramaResort.model.Person;

public class Customer extends Person{
    private String idCustomer;
    private String guestType;

    public Customer(String idCustomer, String guestType) {
        this.idCustomer = idCustomer;
        this.guestType = guestType;
    }

    public Customer(String name, String dayOfBirth, String gender, String citizenIdentification, String phoneNumnber, String email, String address, String idCustomer, String guestType) {
        super(name, dayOfBirth, gender, citizenIdentification, phoneNumnber, email, address);
        this.idCustomer = idCustomer;
        this.guestType = guestType;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getGuestType() {
        return guestType;
    }

    public void setGuestType(String guestType) {
        this.guestType = guestType;
    }


    @Override
    public String getInfoPerson() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s\n",this.getName(),this.getDayOfBirth(),this.getGender(),this.getCitizenIdentification(),this.getPhoneNumnber(),this.getEmail(),
                this.getAddress(),this.getIdCustomer(),this.getGuestType());
    }

    @Override
    public String toString() {
        return super.toString()+
                "  idCustomer(mã khách hàng):   " + idCustomer +
                ", guestType(phân loại khách hàng):   " + guestType;
    }
}
