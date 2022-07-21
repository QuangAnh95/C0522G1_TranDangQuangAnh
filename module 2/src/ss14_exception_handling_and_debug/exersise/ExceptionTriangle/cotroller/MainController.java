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
                System.out.print("Nhập cạnh a: ");
                int a = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập cạnh b: ");
                int b = Integer.parseInt(sc.nextLine());

                System.out.print("Nhập cạnh c: ");
                int c = Integer.parseInt(sc.nextLine());

                System.out.println(triangle.checkTrilangle(a, b, c));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Không được nhập chữ, mời nhập lại !");

            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
