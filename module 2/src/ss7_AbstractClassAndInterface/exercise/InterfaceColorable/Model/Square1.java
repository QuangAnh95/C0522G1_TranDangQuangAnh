package ss7_AbstractClassAndInterface.exercise.InterfaceColorable.Model;

public class Square1 extends Shape1 implements Colorable {
    private double edge = 1.0;


    public Square1(){

    }
    public Square1(double edge){
        this.edge = edge;
    }
    public Square1(double edge, String color, boolean filled){
        super(color,filled);
        this.edge=edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
    public double getArea(){
        return getEdge()*getEdge();
    }

    @Override
    public String toString() {
        return "A Square with radius="
                + getEdge()+"\n"
                +"Area="
                +getArea();

    }

    @Override
    public void howToColor() {
        System.out.println(" Color all four sides.");
    }
}
