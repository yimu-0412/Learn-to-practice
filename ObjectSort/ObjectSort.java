
package 对象排序;
import java.util.Arrays;

/*
*  实现 Comparable 接口, 并实现其中的 compareTo 方法
*/
class Student implements Comparable {
    private String name ;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    //  从小到大排序
    /*
    *   通过重写 compareTo 方法的方式, 定义比较规则.
    */ 
    @Override
    public int compareTo(Object o) {
        Student s =(Student) o;
        if(this.score < s.score){
            return -1;
        }else if(this.score == s.score){
            return 0;
        }else{
            return 1;
        }
    }
}



public class ObjectSort {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("huahua",78),
                new Student("huihui",98),
                new Student("hahaha",67)
        };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }
}