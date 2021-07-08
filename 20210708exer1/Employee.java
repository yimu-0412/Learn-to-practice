package exer1;

/*
    编写一个Employee 类，声明为抽象类，
        包含
        如下三个 属性： name id salary 。
        提供必要的构造器和抽象方法：work() 。
*/
public abstract class Employee {
    private String name;
    private int id;
    private double salayr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalayr() {
        return salayr;
    }

    public void setSalayr(double salayr) {
        this.salayr = salayr;
    }

    public Employee() {
    }

    public Employee(String name, int id, double salayr) {
        this.name = name;
        this.id = id;
        this.salayr = salayr;
    }

    public abstract void work();
}
