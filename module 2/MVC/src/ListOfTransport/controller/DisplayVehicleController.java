package ListOfTransport.controller;

import ListOfTransport.service.ICarService;
import ListOfTransport.service.IMotorbikeService;
import ListOfTransport.service.ITruckService;
import ListOfTransport.service.impl.CarService;
import ListOfTransport.service.impl.MotorbikeService;
import ListOfTransport.service.impl.TruckService;

import java.util.Scanner;

public class DisplayVehicleController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService iCarService = new CarService<>();
    private static IMotorbikeService iMotorbikeService = new MotorbikeService<>();
    private static ITruckService iTruckService = new TruckService<>();

    public void menuDisplay(){
        do {
            System.out.println("HIỂN THỊ PHƯƠNG TIỆN:\n" +
                    "Chọn loại phương tiện muốn hiển thị\n" +
                    "1.hiển thị xe tải\n" +
                    "2.hiển thị ô tô\n" +
                    "3.hiển xe máy\n" +
                    "4.thoát\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :iTruckService.displayTruck();
                    break;
                case 2: iCarService.displayCar();
                    break;
                case 3: iMotorbikeService.displayMotorbike();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }
}
