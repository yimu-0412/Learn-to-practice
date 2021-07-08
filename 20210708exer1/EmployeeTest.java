package exer1;


/*
    请使用继承的思想，设计 CommonEmployee 类和 Manager 类，要求类
    中提供必要的方法进行属性访问。
*/
public class EmployeeTest {
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.setName("王总");
        manager.work();
        System.out.println("*******************************");
        Employee commomEployee= new Manager();
        commomEployee.setName("车间工人");
        commomEployee.work();
    }
}
