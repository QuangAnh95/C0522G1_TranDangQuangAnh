package ss14_exception_handling_and_debug.exersise.ExceptionTriangle.cotroller;

import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.exception.IllegalTriangleException;
import ss14_exception_handling_and_debug.exersise.ExceptionTriangle.service.impl.TriangleService;

import java.util.Scanner;

public class MainController {
    public static void mainController() {
        TriangleService triangle = new TriangleService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Nhập cạnh thứ nhất: ");
                int edgeA = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập cạnh thứ 2: ");
                int edgeB = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập cạnh thứ 3: ");
                int edgeC = Integer.parseInt(sc.nextLine());

                System.out.println(triangle.checkTrilangle(edgeA,edgeB,edgeC));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Không được nhập chữ, mời nhập lại !");

            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
