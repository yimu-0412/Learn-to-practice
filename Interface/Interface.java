package 接口;
/*
*  1.接口：使用关键字interface来修饰的，
*     (1).接口当中的方法，都是抽象方法 ,因此可以省略public public abstract
*     (2).接口当中可以定义成员变量。变量默认是public static final
*     (3).接口当中的方法都是没有具体实现的
*     (4).在jdk1.8开始，接口中的方法可以具体实现，但这个方法必须是default修饰的
*     (5).接口也是不能被实例化的  Ishape shape = new Ishape()
*     (6).接口的使用：implements
*     (7).一个类可以实现多个接口。通过关键字implements。但是注意，一定要重写每个接口里面的方法
*     (8).如果两个接口，方法名相同，此时在类当中，只要重写一个方法就好了，但是最终
*  调用的就是这一个方法，既然接口都不一样，就不要同样的方法了
*     (9).interface D extends A,B  一个接口可以扩展多个接口，也就是说，D接口具备了A和B接口的
*  功能。如果将来D接口被实现，那么实现D接口的类，就需要重写A、B、D接口的方法
*
*/
interface IShape{
   int a = 10;
   void draw();
   default void func(){
       System.out.println("fadsa");
   }
   default void func1(){
       System.out.println("fasda");
   }
}
class Cycle implements IShape{

    @Override
    public void draw() {
        System.out.println("●");
    }
}
class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("■");
    }
}
public class Interface {
    //多态
    public static void drawMap(IShape iShape){
        iShape.draw();
    }
    public static void funcMap(IShape iShape){
        iShape.func();
    }
    public static void func1Map(IShape iShape){
        iShape.func1();
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        Rect rect = new Rect();
        //向上转型
        drawMap(cycle);
        drawMap(rect);
        IShape iShape = new Cycle();
        iShape.func();
        IShape iShape1 = new Rect();
        iShape1.func();
    }
}