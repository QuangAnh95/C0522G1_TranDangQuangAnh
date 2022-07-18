package ListOfTransport.service.impl;

import ListOfTeachersAndStudents.model.Student;
import ListOfTransport.model.Car;
import ListOfTransport.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService<E> implements ICarService {
    private static List<Car> carList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Car infoCar(){
        System.out.println("Nhập biển kiểm soát");
        int  licensePlates = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chử sở hữu");
        String owner = scanner.nextLine();
        System.out.println("nhập ghế ngồi");
        int seat = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập kiểu xe");
        String type = scanner.nextLine();

        Car car = new Car( licensePlates, manufacturer,yearOfManufacture,owner, seat, type);
        return car;
    }

    @Override
    public void addCar() {
        Car car =infoCar();
        carList.add(car);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void removeCar() {
        System.out.println("nhập biển kiểm soát cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Car car :carList){
            if (car.getLicensePlates() == idRemove){
                System.out.println("bạn có chắn chắn muốn xóa??\n" +
                        "1.có\n" +
                        "2.không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    carList.remove(car);
                    System.out.println("xóa thành công");
                }
                isFlag = true;
                break;
            }
        }
        if (!isFlag){
            System.out.println("không tìm thấy");
        }


    }

    @Override
    public void displayCar() {
        System.out.println("danh sách xe ô tô");
        for (Car car: carList){
            System.out.println(car);
        }

    }

    @Override
    public void findCar() {
        System.out.println("nhập biển kiểm soát cần tìm");
        int idFind = Integer.parseInt(scanner.nextLine());
        for (Car car : carList) {
            if (car.getLicensePlates() == idFind) {
                System.out.println("xe ô tô cần tìm: \n");
                System.out.println(car);

            }else {
                System.out.println("không tìm thấy");
            }

        }

    }
}
