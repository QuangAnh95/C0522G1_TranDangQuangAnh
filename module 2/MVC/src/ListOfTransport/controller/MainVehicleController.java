package ListOfTransport.controller;

import java.util.Scanner;

public class MainVehicleController {
    public static void menuController(){
        Scanner scanner = new Scanner(System.in);
        AddVehicleController addVehicleController = new AddVehicleController();
        DisplayVehicleController displayVehicleController = new DisplayVehicleController();
        FindVehicleController findVehicleController = new FindVehicleController();
        RemoveVehicleController removeVehicleController = new RemoveVehicleController();

        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG!!\n" +
                    "....Chọn chức năng....\n" +
                    "1.Thêm mới phương tiện\n" +
                    "2.Hiển thị phương tiện\n" +
                    "3.Xóa phương tiện\n" +
                    "4.Tìm kiếm phương tiện theo biển kiểm soát\n" +
                    "5.Thoát\n");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1: addVehicleController.menuAdd();
                    break;
                case 2: displayVehicleController.menuDisplay();
                    break;
                case 3: removeVehicleController.menuRemove();
                    break;
                case 4: findVehicleController.menuFind();
                    break;
                case 5:
                    System.exit(1);
            }

        }while (true);

    }
}
