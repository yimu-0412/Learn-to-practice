import java.util.Objects;

/**
 * @author wangyimu
 * @Program Day_20210828
 * @create 2021-08-28-9:53
 */
public class  Person implements Comparable{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    // 按照姓名从小到大排列,年龄从小到大排列
    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person p = (Person)o;
            int compare =  - this.name.compareTo(p.name);
            if(compare != 0){
                return compare;
            }else{
                return Integer.compare(this.age,p.age);
            }
        }else{
            throw new RuntimeException("输入类型不匹配!");
        }
    }
}
