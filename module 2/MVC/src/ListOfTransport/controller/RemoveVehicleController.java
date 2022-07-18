package ListOfTransport.controller;

import ListOfTransport.service.ICarService;
import ListOfTransport.service.IMotorbikeService;
import ListOfTransport.service.ITruckService;
import ListOfTransport.service.impl.CarService;
import ListOfTransport.service.impl.MotorbikeService;
import ListOfTransport.service.impl.TruckService;

import java.util.Scanner;

public class RemoveVehicleController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService iCarService = new CarService<>();
    private static IMotorbikeService iMotorbikeService = new MotorbikeService<>();
    private static ITruckService iTruckService = new TruckService<>();

    public void menuRemove(){
        do {
            System.out.println("XÓA PHƯƠNG TIỆN:\n" +
                    "Chọn loại phương tiện muốn xóa\n" +
                    "1.Xóa xe tải\n" +
                    "2.Xóa ô tô\n" +
                    "3.Xóa xe máy\n" +
                    "4.thoát\n");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :iTruckService.removeTruck();
                    break;
                case 2: iCarService.removeCar();
                    break;
                case 3: iMotorbikeService.removeMotorbike();
                    break;
                case 4:
                    return;
            }
        }while (true);
    }

}
