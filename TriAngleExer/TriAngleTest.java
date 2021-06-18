/*
*  编写两个类TriAngle和TriAngleTest,其中TriAngle类中声明私有的底边长base和
*  高height 同时声明公共方法访问私有变量。此外提供类必要的构造器。另一 个类中使
*  用这些公共方法 计算三角形的面积 。
*/


class TriAngle {
    private double base; // 底边长
    private double height; // 高

    public TriAngle() {

    }

    public TriAngle(double b, double h){
        base = b;
        height = h;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(double b, double h) {
        return (b * h) / 2.0;
    }
}


public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t = new TriAngle();
        System.out.println("base :" + t.getBase() + " ;height：" + t.getHeight());
        System.out.println();
        t.setBase(1);
        t.setHeight(1.5);
        System.out.println("base :" + t.getBase() + " ;height：" + t.getHeight());
        System.out.println("area: " + t.area(t.getBase(), t.getHeight()));
        System.out.println();
        TriAngle t1 = new TriAngle(1.0,1.3);
        System.out.println("base :" + t1.getBase() + " ;height：" + t1.getHeight());
        System.out.println();
        System.out.println("area: " + t1.area(2.0, 1));
    }
}