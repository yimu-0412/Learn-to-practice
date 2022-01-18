package comp;

import java.util.Objects;

/**
 * @author wangyimu
 * @Program 2022
 * @create 2022-01-14-14:56
 */
public class User implements Comparable{
    private String name;
    private int age;

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        User user = (User)o;

        if(this.age != user.age) return false;
        return name != null? name.equals(user.name):user.name == null;
    }



    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User user = (User)o;
            int comp = this.name.compareTo(user.name);
            if(comp != 0){
                return comp;
            }else{
                return Integer.compare(this.age,user.age);
            }
        }else{
            throw new RuntimeException("输入类型不匹配！");
        }
    }
}
