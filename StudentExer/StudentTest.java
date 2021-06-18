/*
*   (1)定义 Student 类 有 4 个 属性:
*     String name;
*     int age;
*     String school;
*     String major;
*   (2)定义 Student类的3个构造器:
*      第一 个构造器 Student(String n, int a) 设置类的 name 和 age 属性；
*      第二 个构造器 Student(String n, int a, String s) 设置类的 name, age 和 school 属性；
*      第三 个构造器 Student(String n, int a, String s, String m) 设置类的 name, age ,school 和 major 属性；
*   (3) 在 main 方法中分别调用不同 的构造器创建 的对象，并输出其属性值。
*
*/

class Student {
    private String name ;
    private int age ;
    private String school;
    private String major;

    // 设置类的name和age属性；
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 设置类的name,age和school属性
    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    //  设置类的name,age和school以及major属性
    public Student(String name, int age, String school, String major) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }

    public String getMajor() {
        return major;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("灰灰",12);
        System.out.println("name: " + s1.getName() + " ;age: " + s1.getAge());
        System.out.println();
        Student s2= new Student("灰灰",12, "天工大");
        System.out.println("name: " + s2.getName() + " ;age: " + s2.getAge() + " ;school: " + s2.getSchool());
        System.out.println();
        Student s3 = new Student("花花",18, "天工大","机械设计");
        System.out.println("name: " + s1.getName() + " ;age: " + s1.getAge() + " ;school: "
                + s1.getSchool() + " ;major: " + s3.getMajor());
        System.out.println();
    }

}
