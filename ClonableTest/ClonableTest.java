package enginterface;


class Money{
    public double money = 9.8;
}
class Student2 implements Cloneable {
    public String name;
    public int age;

    public Money m = new Money();



    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ClonableTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student2 student = new Student2("huahua",19);
        //浅拷贝
        Student2 student3 = (Student2) student.clone(); //向下转型
        System.out.println(student.m.money);
        System.out.println(student3.m.money);
        student.m.money = 99.9;
        System.out.println(student.m.money);
        System.out.println(student3.m.money);

        System.out.println(student3);

    }

}