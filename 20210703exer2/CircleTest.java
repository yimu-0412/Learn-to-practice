
class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color, double weight) {
        super(color, weight);
        this.radius = radius;
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

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj instanceof Circle){
            Circle c = (Circle)obj;
            return this.radius == c.radius;
        }
        return false;
    }

    public String toString(){
        return "Circle [ radius = " + radius + " ]" ;
    }
}

/*
 * 写一个测试类，创建两个Circle对象，判断其颜色是否相等；
 * 利用equals方法判断其半径是否相等；利用toString()方法输出其半径。
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(1.0,"white",1.0);
        Circle c3 = new Circle(3.0,"white",1.0);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println("**************************");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

}
