package ListOfTransport.controller;

public class VehicleDisplayController {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IMotorBikeService motorbike = new MotorbikeService();
    private static final ICarService car = new CarService();
    private static final ITruckService truck = new TruckService();


    public void menuDisplayVehicle() {
        do {
            System.out.println("Hiển thị phương tiện: \n" +
                    "1. Hiển thị xe tải. \n" +
                    "2. Hiển thị ôtô. \n" +
                    "3. Hiển thị xe máy. \n" +
                    "4. Quay về menu chính.");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    truck.displayAll();
                    break;
                case 2:
                    car.displayAll();
                    break;
                case 3:
                    motorbike.displayAll();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
