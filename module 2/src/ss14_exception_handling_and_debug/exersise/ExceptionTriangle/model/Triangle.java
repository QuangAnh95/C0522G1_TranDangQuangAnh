package ss14_exception_handling_and_debug.exersise.ExceptionTriangle.model;

public class Triangle {

    int edgeA;
    int edgeB;
    int edgeC;

    public Triangle(int edgeA, int edgeB, int edgeC) {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
    }

    public int getEdgeA() {
        return edgeA;
    }

    public void setEdgeA(int edgeA) {
        this.edgeA = edgeA;
    }

    public int getEdgeB() {
        return edgeB;
    }

    public void setEdgeB(int edgeB) {
        this.edgeB = edgeB;
    }

    public int getEdgeC() {
        return edgeC;
    }

    public void setEdgeC(int edgeC) {
        this.edgeC = edgeC;
    }

    @Override
    public String toString() {
        return "Tam giác có :" +
                "cạnh A  " + edgeA +
                ", cạnh B  " + edgeB +
                ",  cạnh C   " + edgeC ;
    }
}
