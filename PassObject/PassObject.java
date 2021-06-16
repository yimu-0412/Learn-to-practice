/*
*  1、定义一个 Circle类包含一个double型的radius属性代表圆的半径 一个
*     findArea() 方法返回圆的面积 。
*/
class Circle {
    double radius;//半径

    //求圆的面积
    public double findArea(double radius){
        return Math.PI * radius * radius;
    }
}

/*
*  2、定义一个类 PassObject 在类中定义一个方法 printAreas() 该方法的定义
*     如下 public void printAreas(Circle c, int time)在printAreas
*     方法中打印输出 1 到 time 之间的每个整数半径值 以及对应的面积 。例如
*      times 为 5 则输出半径 1 2 3 4 5 以及对应的圆面积。
*  3、在 main 方法中调用 printAreas() 方法调用完毕后输出当前半径值 。
*     程序运行结果如图所示 。
*/

public class PassObject {
    public void printAreas(Circle c, int time){
        System.out.println("Radius\t\tArea");
        for(int i = 1;i <= time; i ++){
            //设置圆的半径
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea(i));
        }
    }
    public static void main(String[] args) {
        PassObject test = new PassObject();
        Circle area = new Circle();
        test.printAreas(area,5);
    }
}
//运行结果
/*

Radius		        Area
1.0			3.141592653589793
2.0			12.566370614359172
3.0			28.274333882308138
4.0			50.26548245743669
5.0			78.53981633974483

*/