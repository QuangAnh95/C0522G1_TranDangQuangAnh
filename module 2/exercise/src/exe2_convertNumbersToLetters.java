import java.util.Scanner;

public class exe2_convertNumbersToLetters {
    public static void main(String[] args) {
        String show;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int number = scanner.nextInt();
        if (number < 999){
            if (number<9){
                switch (number){
                    case 1 :
                        show = "one";
                        break;
                    case 2 :
                        show = "tow";
                        break;
                    case 3:
                        show = "three";
                        break;
                    case 4:
                        show = "four";
                        break;
                    case 5:
                        show = "five";
                        break;
                    case 6:
                        show = "six";
                        break;
                    case 7:
                        show = "seven";
                        break;
                    case 8:
                        show = "eight";
                        break;
                    case 9:
                        show = "nine";
                        break;
                    case 0:
                        show = "zero";
                        break;
                }
            }
    } else {
            System.out.println("Enter number again : ");
        }  System.out.println("Number : " + show);
    }
}
