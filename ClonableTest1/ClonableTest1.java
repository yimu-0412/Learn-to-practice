class Money1 implements Cloneable{
    public double money = 9.8;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Student implements Cloneable {
    public String name;
    public int age;

    public Money1 m = new Money1();



    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student s = (Student) super.clone();
        s.m = (Money1) this.m.clone();
        return s;
    }
}
public class ClonableTest1 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student student = new Student("huahua",19);
        //深拷贝
        Student student1 = (Student) student.clone(); //向下转型
        System.out.println(student.m.money);
        System.out.println(student1.m.money);
        student.m.money = 99.9;
        System.out.println(student.m.money);
        System.out.println(student1.m.money);

        System.out.println(student1);
    }
}