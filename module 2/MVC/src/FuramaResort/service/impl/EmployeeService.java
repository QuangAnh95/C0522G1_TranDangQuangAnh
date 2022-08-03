package FuramaResort.service.impl;

import FuramaResort.exception.DuplicateIDException;
import FuramaResort.model.Person.Employee;
import FuramaResort.service.IEmployeeService;
import FuramaResort.utils.ReadEmployeeFile;
import FuramaResort.utils.WriteEmployeeFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService<E> implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();
    private static final String PATH_EMPLOYEE="FuramaResort/data/Employeelist.csv";

    public static Employee infoEmployee() {
        System.out.println("Enter employee's name:\n" +
                "(mời nhập tên nhân viên)");
        String name = scanner.nextLine();

        System.out.println("Enter employee's day of birth:\n" +
                "(mời nhập ngày sinh nhân viên)");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Enter employee's gender:\n" +
                "(mời nhập giới tính nhân viên)");
        String gender = scanner.nextLine();

        System.out.println("Enter employee's citizenIdentification:\n" +
                "(mời nhập CCCD nhân viên");
        String citizenIdentification = scanner.nextLine();

        System.out.println("Enter employee's phoneNumnber:\n" +
                "(mời nhập SĐT nhân viên)");
        String phoneNumnber = scanner.nextLine();

        System.out.println("Enter employee's email:\n" +
                "(mời nhập email nhân viên)");
        String email = scanner.nextLine();

        System.out.println("Enter employee's address:\n" +
                "(mời nhập địa chỉ nhân viên)");
        String address = scanner.nextLine();

        System.out.println("Enter employee's idEmployee:\n" +
                "(mời nhập ID nhân viên)");
        String idEmployee = scanner.nextLine();

        System.out.println("Enter employee's academicLevel:\n" +
                "(mời nhập trinh độ nhân viên)");
        String academicLevel = scanner.nextLine();

        System.out.println("Enter employee's location:\n" +
                "(mời bạn nhập vị trí nhân viên)");
        String location = scanner.nextLine();
        double wage;

       while (true){
           try {
               System.out.println("Enter employee's wage:\n" +
                       "(mời bạn nhập lương nhân viên)");
               wage = Double.parseDouble(scanner.nextLine());
               break;
           }catch (NumberFormatException e){
               System.out.println("Bạn nhập sai cú pháp,vui lòng nhập số");
           }
       }


        Employee employee = new Employee(name, dayOfBirth, gender, citizenIdentification, phoneNumnber,
                email, address, idEmployee, academicLevel, location, wage);
        return employee;
    }

    public void writefile(){
        WriteEmployeeFile.writeEmployeeFile(PATH_EMPLOYEE,employeeList);
    }
    public void readfile(){
        List<Employee> list = ReadEmployeeFile.readEmployeeFile(PATH_EMPLOYEE);
        employeeList.clear();
        employeeList.addAll(list);
    }


    @Override
    public void addEmployss() {
        readfile();
        Employee employee = infoEmployee();
        employeeList.add(employee);
        System.out.println("successfully added new: \n" +
                "(thêm mới thành công)");
        writefile();

    }

    @Override
    public void displayEmployss() {
        readfile();
        System.out.println("list of employee:\n" +
                "(danh sách nhân viên)");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void editEmployss() {
        readfile();
        do {
            System.out.println("mời bạn nhập id nhân viên muốn thao tác:");
            String idEdit = scanner.nextLine();
            System.out.println("bạn muốn sửa gì??\n" +
                    "1. tên nhân viên\n" +
                    "2. ngày tháng năm sinh\n" +
                    "3. giới tính\n" +
                    "4.CCCD\n" +
                    "5.SĐT\n" +
                    "6.Email\n" +
                    "7.địa chỉ\n" +
                    "8.ID\n" +
                    "9.Trình độ\n" +
                    "10.vị trí\n" +
                    "11.mức lương\n" +
                    "12. quay lại menu\n");
            int choose = Integer.parseInt(scanner.nextLine());
            boolean isFlag = false;
            for (Employee employee : employeeList) {
                if (employee.getIdEmployee().equals(idEdit)) {
                    isFlag = true;
                    switch (choose) {
                        case 1:
                            System.out.println("Nhập tên muốn thay đổi");
                            employee.setName(scanner.nextLine());
                            break;
                        case 2:
                            System.out.println("nhập ngày tháng năm sinh muốn thay đổi:");
                            employee.setDayOfBirth(scanner.nextLine());
                            break;
                        case 3:
                            System.out.println("nhập giới tính muốn thay đổi:");
                            employee.setGender(scanner.nextLine());
                            break;
                        case 4:
                            System.out.println("nhập CCCD muốn thay đổi:");
                            employee.setCitizenIdentification(scanner.nextLine());
                            break;
                        case 5:
                            System.out.println("nhập SDT muốn thay đổi:");
                            employee.setPhoneNumnber(scanner.nextLine());
                            break;
                        case 6:
                            System.out.println("nhập Email muốn thay đổi:");
                            employee.setEmail(scanner.nextLine());
                            break;
                        case 7:
                            System.out.println("nhập địa chỉ muốn thay đổi:");
                            employee.setAddress(scanner.nextLine());
                            break;
                        case 8:
                            String idCard;
                          while (true){
                              try {
                                  System.out.println("nhập ID muốn thay đổi:");
                                  idCard = scanner.nextLine();
                                  for (Employee employee1: employeeList){
                                      if (employee1.getIdEmployee().equals(idCard)){
                                          throw new DuplicateIDException("Trùng ID nhân viên");
                                      }
                                  }
                                  break;
                              }catch (DuplicateIDException e){
                                  System.out.println(e.getMessage());
                              }
                          }
                          employee.setIdEmployee(idCard);

                            break;
                        case 9:
                            System.out.println("nhập trình độ muốn thay đổi:");
                            employee.setAcademicLevel(scanner.nextLine());
                            break;
                        case 10:
                            System.out.println("nhập vị trí muốn thay đổi:");
                            employee.setLocation(scanner.nextLine());
                            break;
                        case 11:
                           while (true){
                               try {
                                   System.out.println("nhập mức lương muốn thay đổi:");
                                   employee.setWage(Double.parseDouble(scanner.nextLine()));
                                   break;
                               }catch (NumberFormatException e){
                                   System.out.println("nhập sai cú pháp,vui lòng nhập số");
                               }
                           }
                        case 12:
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
