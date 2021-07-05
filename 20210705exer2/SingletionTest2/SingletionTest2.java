package exer2;

/*
 * 单例模式的懒汉式实现
 */
public class SingletionTest2 {
    public static void main(String[] args) {
        System.out.println(SingletionTest2.getSingle().getId());

    }


    private int id;
    private int init = 1001;
    // 饿汉式

    //1.私有化类的构造器
    public SingletionTest2() {
        id = init ++;
    }

    //2.声明当前类对象，没有初始化
    //4.此对象也必须声明为static的
    public static SingletionTest2 single;

    //3.声明public、static的返回当前类对象的方法


    public int getId() {
        return id;
    }

    public static SingletionTest2 getSingle() {
        if(single == null){
            single = new SingletionTest2();
        }
        return single;
    }
}
