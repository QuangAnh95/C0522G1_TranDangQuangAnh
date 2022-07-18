package ListOfTransport.service.impl;

import ListOfTransport.model.Motorbike;
import ListOfTransport.model.Truck;
import ListOfTransport.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService<E> implements ITruckService {

    private static List<Truck> truckList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Truck infoTruck(){
        System.out.println("Nhập biển kiểm soát");
        int  licensePlates = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chử sở hữu");
        String owner = scanner.nextLine();
        System.out.println("nhập trọng tải xe");
        int tonnage = Integer.parseInt(scanner.nextLine());

        Truck truck = new Truck( licensePlates, manufacturer, yearOfManufacture, owner, tonnage);
        return truck;
    }
    @Override
    public void addTruck() {
       Truck truck = infoTruck();
        truckList.add(truck);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void removeTruck() {
        System.out.println("nhập biển kiểm soát cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Truck truck : truckList){
            if (truck.getLicensePlates() == idRemove){
                System.out.println("bạn có chắn chắn muốn xóa??\n" +
                        "1.có\n" +
                        "2.không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    truckList.remove(truck);
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
    public void displayTruck() {
        System.out.println("danh sách xe tải");
        for (Truck truck: truckList){
            System.out.println(truck);
        }


    }

    @Override
    public void findTruck() {
        System.out.println("nhập biển kiểm soát cần tìm");
        int idFind = Integer.parseInt(scanner.nextLine());
        for (Truck truck: truckList) {
            if (truck.getLicensePlates() == idFind) {
                System.out.println("xe tải cần tìm: \n");
                System.out.println(truck);

            }else {
                System.out.println("không tìm thấy ");
            }

        }

    }
}
