package ListOfTransport.controller;

import ListOfTransport.model.Truck;
import ListOfTransport.service.ICarService;
import ListOfTransport.service.IMotorbikeService;
import ListOfTransport.service.ITruckService;
import ListOfTransport.service.impl.CarService;
import ListOfTransport.service.impl.MotorbikeService;
import ListOfTransport.service.impl.TruckService;

import java.util.Scanner;

public class FindVehicleController {
    private static Scanner scanner = new Scanner(System.in);
    private static ICarService iCarService = new CarService<>();
    private static IMotorbikeService iMotorbikeService = new MotorbikeService<>();
    private static ITruckService iTruckService = new TruckService<>();

    public void menuFind(){
       iCarService.findCar();
       iMotorbikeService.findMotorbike();
       iTruckService.findTruck();

    }
}
