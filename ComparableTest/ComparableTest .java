import java.util.Arrays;

class Student implements Comparable<Student> {
    public String name;
    public int age;

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

    //按照姓名排序
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    //从小到大排序
   /* @Override
    public int compareTo(Student o) {
        if(this.age > o.age){
            return 1;
        }else if(this.age == o.age){
            return 0;
        } else{
            return -1;
        }
    }*/
    //从大到小排序
  /*  @Override
    public int compareTo(Student o) {
        if(this.age < o.age){
            return 1;
        }else if(this.age == o.age){
            return 0;
        } else{
            return -1;
        }
    }*/
}
public class ComparableTest {
    /*
    * 如果是自己定义的类型要进行比较，一定要实现接口
    *   1.Comparable -》 comparableTo
    *
    */
    public static void main(String[] args) {
        Student[] student = new Student[3];
        student[0] = new Student("bit",13);
        student[1] = new Student("huihui",18);
        student[2] = new Student("huahua",16);

        int ret = student[0].compareTo(student[1]);
        System.out.println(ret);

        Arrays.sort(student);
        System.out.println(Arrays.toString(student));

    }
}