import java.util.ArrayList;
import java.util.Collections;

/*
*  1.有若干个学生（放在一个List表中），每个学生都有一个姓名（String）,班级（String）
*    和成绩（double），某次考试结束后，每个学生都有一个成绩，遍历list集合，并把学生的
*    对象的属性打印出来
* */
class Student implements Comparable<Student>{
    private String name;
    private String eclass;
    private double grade;

    public Student(String name, String eclass, double grade) {
        this.name = name;
        this.eclass = eclass;
        this.grade = grade;
    }

    public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEclass() {
         return eclass;
     }

     public void setEclass(String eclass) {
         this.eclass = eclass;
     }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student[" +
                "姓名 = " + name + '\'' +
                ", 班级 = " + eclass + '\'' +
                ", 成绩 = " + grade +
                ']' ;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.grade - o.grade);
    }
}

 public class ListExer{
     public static void main(String[] args) {
         ArrayList<Student> list = new ArrayList<>();
         list.add(new Student("花花","6",89));
         list.add(new Student("哈哈","6",90));
         list.add(new Student("灰灰","6",70));
         list.add(new Student("芳芳","4",100));

         //自定义排序需要写compareTo方法
         Collections.sort(list);
         System.out.println(list);
     }
 }