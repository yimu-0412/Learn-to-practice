package reflection1;

/**
 * @author wangyimu
 * @create 2021-08-04-22:52
 */
public class Student {
    private String name = "yimu";
    public int age = 25;

    public Student() {
        System.out.println("Student()");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Studenr(String,name)");
    }

    private void eat(){
        System.out.println("i am eat");
    }
    public void sleep(){
        System.out.println("i am pig");
    }
    private void function(String str) {
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
