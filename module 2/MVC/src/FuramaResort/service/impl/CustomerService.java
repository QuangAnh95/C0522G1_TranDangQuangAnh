package FuramaResort.service.impl;

import FuramaResort.exception.DuplicateIDException;
import FuramaResort.model.Person.Customer;
import FuramaResort.model.Person.Employee;
import FuramaResort.service.ICustomerService;
import FuramaResort.utils.ReadCustomerFile;
import FuramaResort.utils.WriteCustomerFile;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService<E> implements ICustomerService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Customer> customerList = new ArrayList<>();
    public static final String PATH_CUSTOME = "FuramaResort/data/Customerlist.csv";

    public static Customer infoCustomer() {
        String name;
       while (true){
           try {
               System.out.println("Enter Customer's name:\n" +
                       "(mời nhập tên khách hàng)");
               name = scanner.nextLine();
               if (name.matches("^([A-Z][a-z]+[ ])+$")){
                   break;
               }
               else {
                   throw new DuplicateIDException("sai định dạng,viết hoa chữ cái đầu");
               }

           } catch (DuplicateIDException e) {
               System.out.println(e.getMessage());
           }
       }


        System.out.println("Enter customer's day of birth:\n" +
                "(mời nhập ngày sinh khách hàng)");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Enter customer's gender:\n" +
                "(mời nhập giới tính khách hàng)");
        String gender = scanner.nextLine();

        System.out.println("Enter customer's citizenIdentification:\n" +
                "(mời nhập CCCD khách hàng");
        String citizenIdentification = scanner.nextLine();

        System.out.println("Enter customer's phoneNumnber:\n" +
                "(mời nhập SĐT khách hàng)");
        String phoneNumnber = scanner.nextLine();

        System.out.println("Enter customer's email:\n" +
                "(mời nhập email khách hàng)");
        String email = scanner.nextLine();

        System.out.println("Enter customer's address:\n" +
                "(mời nhập địa chỉ khách hàng)");
        String address = scanner.nextLine();

        System.out.println("Enter customer's idcustomer:\n" +
                "(mời nhập ID khách hàng)");
        String idCustomer = scanner.nextLine();


        String guestType = getGuestType();

        Customer customer = new Customer(name, dayOfBirth, gender, citizenIdentification, phoneNumnber, email, address, idCustomer, guestType);
        return customer;
    }

    public void writefile(){
        WriteCustomerFile.writeCustomerFile(PATH_CUSTOME,customerList);
    }
    public void readfile(){
        List<Customer> list = ReadCustomerFile.readCustomerFile(PATH_CUSTOME);
        customerList.clear();
        customerList.addAll(list);
    }

    public static String getGuestType(){
        System.out.println("phân loại khách hàng" +
                "1. Diamond\n" +
                "2. Platinium\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member");
        int choose = Integer.parseInt(scanner.nextLine());
      while (true){
          switch (choose){
              case 1: return "Diamond";
              case 2:return  "Platinium";
              case 3:return  "Gold";
              case 4: return "Silver";
              case 5: return " Member";
              default:
                  System.out.println("Vui lòng nhập số từ 1->5");
          }
      }
    }


    @Override

    public void displayCustomer() {
        readfile();
        System.out.println("list of customer:\n" +
                "(danh sách khách hàng)");
//        for (Customer customer : customerList) {
        for (int i = 0; i < customerList.size(); i++){

            System.out.println(customerList.get(i));
        }
    }

    @Override
    public void addCustomer() {
        readfile();
       Customer customer = infoCustomer();
       customerList.add(customer);
        System.out.println("successfully added new: \n" +
                "(thêm mới thành công)");
        writefile();

    }

    @Override
    public void editCustomer() {
        readfile();
        do {
            System.out.println("mời bạn nhập id khách hàng muốn thao tác:");
            String idEdit = scanner.nextLine();
            System.out.println("bạn muốn sửa gì??\n" +
                    "1. tên kháng hàng\n" +
                    "2. ngày tháng năm sinh\n" +
                    "3. giới tính\n" +
                    "4.CCCD\n" +
                    "5.SĐT\n" +
                    "6.Email\n" +
                    "7.địa chỉ\n" +
                    "8.ID\n" +
                    "9.loại khách hàng\n" +
                    "10.Quay lại menu chính\n" );
            int choose = Integer.parseInt(scanner.nextLine());
            boolean isFlag = false;
            for (Customer customer: customerList) {
                if (customer.getIdCustomer().equals(idEdit)) {
                    isFlag = true;
                    switch (choose) {
                        case 1:
                            System.out.println("Nhập tên muốn thay đổi");
                            customer.setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("nhập ngày tháng năm sinh muốn thay đổi:");
                            customer.setDayOfBirth(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("nhập giới tính muốn thay đổi:");
                           customer.setGender(scanner.nextLine());
                            break;
                        case 4:
                            System.out.println("nhập CCCD muốn thay đổi:");
                          customer.setCitizenIdentification(scanner.nextLine());
                            break;
                        case 5:
                            System.out.println("nhập SDT muốn thay đổi:");
                           customer.setPhoneNumnber(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("nhập Email muốn thay đổi:");
                           customer.setEmail(scanner.nextLine());
                            break;
                        case 7:
                            System.out.println("nhập địa chỉ muốn thay đổi:");
                          customer.setAddress(scanner.nextLine());
                            break;
                        case 8:
                            String idCard;
                            while (true){
                                try {
                                    System.out.println("nhập ID muốn thay đổi:");
                                    idCard = scanner.nextLine();
                                    for (Customer customer1:customerList){
                                        if (customer1.getIdCustomer().equals(idCard)){
                                            throw new DuplicateIDException("Trùng ID khách hàng");
                                        }
                                    }
                                    break;
                                }catch (DuplicateIDException e){
                                    System.out.println(e.getMessage());
                                }
                            }
                            customer.setIdCustomer(idCard);

                            break;
                        case 9:
                            System.out.println("nhập phân loại khách hàng muốn thay đổi:");
                           customer.setGuestType(scanner.nextLine());
                            break;

                        case 10:
                            return;
                        default:
                            System.out.println("nhập sai cú pháp,vui lòng nhập số ở bảng");
                            writefile();
                    }

                }
            }
            if (!isFlag){
                System.out.println("không tìm thấy");
            }
        } while (true);

    }
}
