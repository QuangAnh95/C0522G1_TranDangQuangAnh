package ss4_Layer_and_object_in_Java.exercise.FanClass;

public class Main {
    public static void main(String[] args) {
        FanClass fan1= new FanClass();
        fan1.setSpeed(fan1.getFast());
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println(fan1);
        FanClass fan2=new FanClass();
        fan2.setSpeed(fan2.getMedium());
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan2);
    }
}
