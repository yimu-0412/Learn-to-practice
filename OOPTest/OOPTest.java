import javafx.scene.control.RadioMenuItem;

/*
* 一、java面向对象学习的三体主线：
* 1.java类及类的成员：属性、方法、构造器；代码块、内部类
*
* 2.面向对象的三大特征：封装性、继承性、多态性、(抽象性)
*
* 3.其他关键字：this、super、static、final、abstract、interface、package、import
*
* 二、面向对象的两个要素：
* 类（Class）：类是对一类事物的描述，是抽象的、概念上的定义
* 对象（Object）：对象是实际存在的该类事物的每个个体，因而也称为实例(instance)。
* 》面向对象程序设计的重点是类的设计
* 》类的设计，其实就是类的成员的设计
* 1.类的设计，其实就是类的成员的设计
*   属性 = 成员变量 = field = 域、字段 = 实例变量
*   方法 = 成员方法 = 函数 = method
*   创建类的对象 = 类的实例化 = 实例化类
* 2.类和对象的使用（面向对象落地的实现）
*   a.创建类，设计类的成员
*   b.创建类的对象
*   c.通过“对象.属性”或“对象.方法”调用对象的结构
* 3.如果创建了类的多个对象,则每个对象独立的拥有一套类的属性。（非static）
*   意味着：如果我们修改了一个对象的属性a，则不影响另一个对象属性a的值。
* 4.对象的内存解析
*
*
*
*
*/
class Person{
    //属性
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以交流，使用的是" + language);
    }

}
public class OOPTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构：属性、方法
        //调用属性：“对象.属性”
        p1.name = "Tom";
        p1.age = 12;
        p1.isMale = true;
        System.out.println(p1.name);
        //调用方法：“对象.方法”
        p1.eat();
        p1.sleep();
        p1.talk("chinese");

        //********************************************
        Person p2 = new Person();
        System.out.println(p2.name);//null
        //********************************************
        Person p3 = p1;
        System.out.println(p3.name);//Tom
        p3.age = 10;
        System.out.println(p3.age);//10


    }
}
