/*
*  创建程序 在其中定义两个类： Person 和 PersonTest 类 。 定义如下：
*  用setAge 设置人的合法年龄(0`130),用getAge()返回人的年龄。在PersonTest类
*  中实例化Person()类的对象b调用setAge()和getAge()方法, 体会Java的封装性。
*/

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 && age > 130){
            throw new RuntimeException("转入数据有误！");
        }else{
            this.age = age;
        }
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(12);
        System.out.println("年龄为" + b.getAge());
    }
}