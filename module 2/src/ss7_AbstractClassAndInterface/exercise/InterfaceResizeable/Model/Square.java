package ss7_AbstractClassAndInterface.exercise.InterfaceResizeable.Model;

public class Square extends Shape implements Resize {
    private double edge = 1.0;


    public Square(){

    }
    public Square(double edge){
        this.edge = edge;
    }
    public Square(double edge, String color, boolean filled){
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
    public void resize(double percent) {
        setEdge(getEdge() + (getEdge()* percent/100));
    }
}
