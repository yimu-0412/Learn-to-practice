package exer3;

 // 子类 Circle 代表圆形，
public class Circle extends GeometricObject{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    //计算圆的表面积
    public double findArea(){
        return Math.PI * radius * radius ;
    }
}
