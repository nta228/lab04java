package lab04;

public class Cricle {
    private double radius;
    private String color;

    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public Circle(double r,String c){
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
