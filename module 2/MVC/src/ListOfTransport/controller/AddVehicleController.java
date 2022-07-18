package ListOfTransport.controller;

import ListOfTransport.service.ICarService;
import ListOfTransport.service.IMotorbikeService;
import ListOfTransport.service.ITruckService;
import ListOfTransport.service.impl.CarService;
import ListOfTransport.service.impl.MotorbikeService;
import ListOfTransport.service.impl.TruckService;

import java.util.Scanner;

public class AddVehicleController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService iCarService = new CarService<>();
    private static IMotorbikeService iMotorbikeService = new MotorbikeService<>();
    private static ITruckService iTruckService = new TruckService<>();

    public void menuAdd(){
        do {
            System.out.println("THÊM MỚI PHƯƠNG TIỆN:\n" +
                    "Chọn loại phương tiện muốn thêm mới\n" +
                    "1.thêm mới xe tải\n" +
                    "2.thêm mới ô tô\n" +
                    "3.thêm mới xe máy\n" +
                    "4.thoát\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :iTruckService.addTruck();
                break;
                case 2: iCarService.addCar();
                break;
                case 3: iMotorbikeService.addMotorbike();
                break;
                case 4:
                    return;
            }
        }while (true);
    }
}
