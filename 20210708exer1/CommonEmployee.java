package exer1;

public class CommonEmployee extends Employee{
    public CommonEmployee() {
        super();
    }

    public CommonEmployee(String name, int id, double salayr) {
        super(name, id, salayr);
    }

    @Override
    public void work() {
        System.out.println("努力工作！");

    }
}
