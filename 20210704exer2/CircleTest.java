
//static关键字的应用
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(2.0);

        System.out.println("c1的id为：" + c1.getId());
        System.out.println("c2的id为：" + c2.getId());
        System.out.println("c3的id为：" + c3.getId());
        System.out.println("圆的个数为：" + Circle.getTotal());

        System.out.println("c3的面积为：" + c3.findarea());

    }
}

class Circle{
    private double radius;
    private int id;

    private static int total;
    private static int init = 1001;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    public static int getInit() {
        return init;
    }

    public Circle() {
        id = init ++;
        total ++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public double findarea(){
        return Math.PI * radius * radius;
    }
}