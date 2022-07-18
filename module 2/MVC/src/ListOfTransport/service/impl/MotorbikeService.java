package ListOfTransport.service.impl;

import ListOfTransport.model.Car;
import ListOfTransport.model.Motorbike;
import ListOfTransport.service.IMotorbikeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeService<E>implements IMotorbikeService {

    private static List<Motorbike> motorbikeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Motorbike infoMotorbike(){
        System.out.println("Nhập biển kiểm soát");
        int  licensePlates = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();
        System.out.println("Nhập năm sản xuất");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chử sở hữu");
        String owner = scanner.nextLine();
        System.out.println("nhập công suất xe");
        int wattage = Integer.parseInt(scanner.nextLine());

        Motorbike motorbike = new Motorbike(licensePlates,manufacturer,yearOfManufacture, owner, wattage);
        return motorbike;
    }
    @Override
    public void addMotorbike() {
       Motorbike motorbike = infoMotorbike();
        motorbikeList.add(motorbike);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void removeMotorbike() {
        System.out.println("nhập biển kiểm soát cần xóa");
        int idRemove = Integer.parseInt(scanner.nextLine());
        boolean isFlag = false;
        for (Motorbike motorbike : motorbikeList){
            if (motorbike.getLicensePlates() == idRemove){
                System.out.println("bạn có chắn chắn muốn xóa??\n" +
                        "1.có\n" +
                        "2.không");
                int chooseYesNo = Integer.parseInt(scanner.nextLine());
                if (chooseYesNo == 1){
                    motorbikeList.remove(motorbike);
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
    public void displayMotorbike() {
        System.out.println("danh sách xe máy");
        for (Motorbike motorbike:motorbikeList){
            System.out.println(motorbike);
        }

    }

    @Override
    public void findMotorbike() {
        System.out.println("nhập biển kiểm soát cần tìm");
        int idFind = Integer.parseInt(scanner.nextLine());
        for (Motorbike motorbike: motorbikeList) {
            if (motorbike.getLicensePlates() == idFind) {
                System.out.println("xe máy cần tìm: \n");
                System.out.println(motorbike);

            }else {
                System.out.println("không tìm thấy");
            }

        }

    }
}
