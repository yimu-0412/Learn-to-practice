package exer3;

/*
    定义一个测试 类 GeometricTest 编写 equalsArea 方法测试两个对象的面积是否相等（注意方法的参
        数类型，利用动态绑定技术），编写 displayGeometricObject 方法显示对象的面积（注意方法的参
        数类型，利用动态绑定技术）。
*/
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle(2,"red",3);
        test.displayGeometricObject(c1);
        Circle c2 = new Circle(3,"red",3);
        test.displayGeometricObject(c2);
        System.out.println(test.equalsArea(c1, c2));
        System.out.println();

        MyRectangle rect1 = new MyRectangle(2.0,3.4,"weight",4.0);
        test.displayGeometricObject(rect1);
        MyRectangle rect2 = new MyRectangle(2.0,3.4,"weight",4.0);
        test.displayGeometricObject(rect2);
        System.out.println(test.equalsArea(rect1, rect2));


    }

    //
    public void displayGeometricObject(GeometricObject o){
        double area = o.findArea();
        System.out.println("面积为：" + area);
    }

    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
}
