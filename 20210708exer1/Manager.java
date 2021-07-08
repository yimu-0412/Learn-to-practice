package exer1;


/*
    对于Manager 类来说，他既是员工，还具有奖金 (bonus 的 属性。
*/
public class Manager extends Employee {
    private double bonus;

    public Manager() {
        super();
        this.bonus = bonus;
    }

    public Manager(String name, int id, double salayr, double bonus) {
        super(name, id, salayr);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println( "管理者" + getName() + "管理员工，提高公司运行效率" );
    }
}
