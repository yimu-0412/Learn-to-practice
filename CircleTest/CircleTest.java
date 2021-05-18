/*
*
*利用面向对象的编程方法，设计类Circle计算圆的面积。
*
* 
 */
class Circle{
    //属性
    double radius;
    //求圆面积的方法
    //方式1：
    public double findArea1(){
        double area = Math.PI * radius * radius;
        return area;
    }
    //方式2：
    public void findArea2(){
        double area = Math.PI * radius * radius;
        System.out.println("面积为： " + area);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2.1;
        //方式1：
        double area = c1.findArea1();
        System.out.println("面积为： " + area);
        System.out.println("******************************");
        //方式2：
        c1.findArea2();
    }
}

