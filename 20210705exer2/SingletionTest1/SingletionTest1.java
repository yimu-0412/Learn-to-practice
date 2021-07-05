package exer2;

/*
 * 单例设计模式：
 * 1. 所谓类的单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例。
 *
 * 2. 如何实现？
 * 	 饿汉式  vs 懒汉式2.2
 *
 * 3. 区分饿汉式 和 懒汉式
 *   饿汉式：
 *   	坏处：对象加载时间过长。
 *   	好处：饿汉式是线程安全的
 *
 *   懒汉式：好处：延迟对象的创建。
 * 		  目前的写法坏处：线程不安全。--->到多线程内容时，再修改
 */
public class SingletionTest1 {
    public static void main(String[] args) {
        System.out.println(SingletionTest1.getSingle().getId());
    }

    private int id;
    private int init = 1001;
    // 饿汉式

    //1.私有化类的构造器
    public SingletionTest1() {
        id = init ++ ;
    }

    public int getId() {
        return id;
    }

    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static SingletionTest1 single = new SingletionTest1();

    //3.提供公共的静态的方法，返回类的对象
    public static SingletionTest1 getSingle() {
        return single;
    }
}
