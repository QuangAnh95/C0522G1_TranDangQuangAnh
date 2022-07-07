package ss4_Layer_and_object_in_Java.exercise.StopWatch;

public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (long i = 0; i< 100000;i++){
            System.out.println(i);
        }

        stopWatch.end();
        System.out.println("thời gian thực hiện : "+stopWatch.getElapsedTime());


    }
}
