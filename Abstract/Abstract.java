package 抽象类;
/*
* 1.抽象类(abstract class)：包含抽象方法的类我们称为
*   抽象方法(abstract method):如果一个方法,没有具体的实现，那么就可以用abstract来修饰，
* 2.注意：
*     （1）.抽象类不能直接实例化.  Shape shape = new Shape();
*     （2）.抽象类中，可以包含抽象方法，也可以包含抽象方法
*     （3）.当一个普通的类继承了一个抽象类，那么这个普通类一定要实现抽象类中的方法
*     （4）.当一个普通的类继承了一个抽象类，但是又不想实现这个抽象类中的抽象方法，那么这个普通类
*   可以变成抽象类
*     （5）.当一个普通的类继承了上述第(4)条的抽象类，那么重写的就是两个抽象类的抽象方法。
*     （6）.抽象方法就是为了重写的，不可以用 final 来修饰
*     （7）.抽象方法不能是 private 的
*     （8）.父类的普通方法，在类外也可以被调用，但是需要让父类引用 去 引用子类对象。或者子类中用
*    super访问父类（抽象类）的成员变量或者成员方法。
*  3.抽象类的作用：抽象类存在的最大意义就是为了被继承.
*/
abstract class Shape{
    //如果一个方法,没有具体的实现，那么就可以用abstract来修饰
    public abstract void draw();
    public static void func(){
        System.out.println("fas");
    }
}
abstract class Triangle extends Shape{
   public abstract void draw1();
}
class Rect extends Triangle{

    @Override
    public void draw() {
        //super.func();
        System.out.println("□");
    }

    @Override
    public void draw1() {
        System.out.println("△");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Rect shape = new Rect();
        shape.draw();
        shape.draw1();
        Shape.func();
    }
}
