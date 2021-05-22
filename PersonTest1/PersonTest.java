/*
*  1.创建程序,在其中定义两个类：Person和PersonTest类。
*    定义如下： 用setAge()设置人的合法年龄(0~130)，
*             用getAge()返回人的年龄。 在PersonTest
*             类中实例化Person类的对象b，调用setAge()
*             和getAge()方法，体会Java的封装性。
*/
 class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age >130){
            return;
        }
        this.age = age;
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(112);
        System.out.println(b.getAge());
    }
}
