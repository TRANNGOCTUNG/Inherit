package exercise;

public class Cylinder extends Circle {
    private  double height;
    public Cylinder(){

    }
    public Cylinder (double height, double radius, String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(){
        return  height;
    }
    public void  setHeight(double height){
        this.height = height;
    }
    public double getVolum(){
        return getRadius() * 2 * height * Math.PI;
    }

    @Override
    public String toString(){
        return "Thế tích hình trụ ="
                + getVolum()
                + super.toString();
    }
}
