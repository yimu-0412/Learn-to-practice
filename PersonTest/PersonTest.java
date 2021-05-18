
/*
*  1.创建一个Person类，其定义如下：
*     要求：
*        （1）创建Person类对象，设置该对象的name和sex,调用study方法，
*             输出字符串“studying”,调用“studying”，调用showAge()方
*             法显示age值，调用 addAge()方法给对象的age属性值增加2岁。
*         (2)创建第二个对象，执行上述操作，体会同一个类的 不同对象之间的关系。
*/
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 25;
        p1.sex = 1;

        p1.study();//studying
        p1.showAge();//25
        int newAge1 = p1.addAge(2);
        System.out.println(p1.name + "的年龄为：" + newAge1);//27
        p1.showAge();//27

        System.out.println("*****************************");

        Person p2 = new Person();
        System.out.println(p2.name);//null
        System.out.println(p2.sex);//0
        p2.study();//studying
        p2.showAge();//0
        int newAge2 = p2.addAge(10);
        System.out.println(p1.name + "的年龄为：" + newAge2);//2
        p2.showAge();//10
    }
}
