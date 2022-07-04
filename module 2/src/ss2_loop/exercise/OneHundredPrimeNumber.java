package ss2_loop.exercise;

public class OneHundredPrimeNumber {
    public static void main(String[] args) {
        int count = 1;
        int prime = 2;
        System.out.println("một trăm số nguyên tố dầu tiên là:");
        for (int i = 2; i<=100;){
            for (int j = 2; j <=Math.sqrt(prime); j++){
                if (prime % j == 0){
                    count=0;
                    break;
                }
            }if (count != 0){
                System.out.println(prime);
                i++;
            }
            count=1;
            prime++;
        }
    }
}
