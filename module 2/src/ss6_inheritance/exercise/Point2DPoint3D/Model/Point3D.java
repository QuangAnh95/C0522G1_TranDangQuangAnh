package ss6_inheritance.exercise.Point2DPoint3D.Model;

import ss6_inheritance.exercise.Point2DPoint3D.Model.Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }
    public Point3D(float x, float y, float z){
        super(x,z);
        this.z = z;
    }
    public void setZ (float z){
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setXYZ(float x,float y,float z){
        this.getX();
        this.getY();
        this.z = z;
    }
    public float[] getXYZ(){
        float [] arr = new float[3];
        arr[0] = getX();
        arr[1]= getY();
        arr[2] = z;
        return arr;
    }

    public String toString(){
        return super.toString() + ", Z : "+ z;
    }

}