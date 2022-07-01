import java.util.Scanner;

public class exe3_moneyConversion {
    public static void main(String[] args) {
        System.out.println("The current exchange rate of USD against VND is 23000 VND");
        double rate = 23000;
        double dolla;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Dolla : ");
        dolla = scanner.nextFloat();
        double vnd = dolla * rate ;
        System.out.printf( "VND : " + vnd );

    }
}
