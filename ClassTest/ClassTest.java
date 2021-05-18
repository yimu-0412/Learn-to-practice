import java.util.jar.JarOutputStream;

class Person{
    public String name ;
    int age ;
    String sex;

    public void eat(){
        System.out.println("eat()!!!!");
    }
    @Override//注解
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class ClassTest {
    public static void main(String[] args) {
        Person p = new Person();

        p.eat();
        p.name = "liuhui";
        p.age = 25;
        p.sex = "男";
        System.out.println("name: " + p.name);
        System.out.println(p.age);
        System.out.println(p.sex);
        System.out.println();
        System.out.println("==========================");
        Person p1 = new Person();
        System.out.println(p1);
        System.out.println("==========================");

        new Person();
        System.out.println(new Person());
    }
}
