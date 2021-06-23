

/*
*  (1) 定义一个 ManKind 类，包括:
*     成员变量 int sex 和 int salary
*     方法 void manOrWoman ()()：根据 sex 的值显示“ man ””(sex==1) 或者 woman ”(sex==0)
*     方法 void employeed ()()：根据 salary 的值显示“ no job ””(salary==0) 或者“ job”(salary!=0) 。
*
* */
class ManKind {
    private int sex;// 性别
    private int salary; //薪资

    public ManKind() {
    }

    public ManKind(int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman (){
        if(sex == 1){
            System.out.println("man");
        }else if(sex == 0){
            System.out.println("woman");
        }
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no jom");
        }else if(salary != 0){
            System.out.println("job");
        }
    }
}

/*
*  (2).定义类 Kids 继承 ManKind ，并包括
*      成员变量 int yearsOld
*      方法 printAge 打印 yearsOld 的值。
*
* */


class Kids extends ManKind{
    private int yearsOld; // 年龄

    public Kids() {
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    // 获取年龄
    public void printAge(){
        System.out.println("I am " + yearsOld + " years old");
    }

}

/*
*
*   (3) 定义类 KidsTest ，在类 的 main 方法中实例化 Kids 的 对象 someKid ，
*       用该对象访问其父类的成员变量及方法。
*
* */

public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setYearsOld(18);
        someKid.printAge();

        someKid.setSex(1);
        someKid.manOrWoman();

        someKid.setSalary(3232);
        someKid.employeed();
    }
}