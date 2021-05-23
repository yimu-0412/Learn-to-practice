import java.util.Comparator;
class Student1 {
    public String name;
    public int age;

    public Student1(String name, int age) {
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
}
// 比较器
class AgeComparator implements Comparator <Student1>{

    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.age - o2.age;
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        Student1 student1 = new Student1("bit",18);
        Student1 student2 = new Student1("huihui",18);

        AgeComparator ageComparator = new AgeComparator();
        int ret = ageComparator.compare(student1,student2);
        System.out.println(ret);
    }
}