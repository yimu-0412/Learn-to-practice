
class Circle {
    private double radius; // 半径

    // 将 radius 属性初始化为 1
    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea (){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        this.length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume (){
        //return Math.PI * getRadius() * getRadius() * getLength();
        return findArea() * getLength();
    }
}

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();

        cy.setRadius(2.0);
        double area = cy.findArea();
        System.out.println("圆的面积：" + area);

        cy.setLength(5.0);
        double volume = cy.findVolume();
        System.out.println("圆柱的体积为：" + volume);

    }
}