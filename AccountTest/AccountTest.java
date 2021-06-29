
/*
   1 、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
        账号 id ，余额 balance ，年利率 annualInterestRate ；包含的方法：访问器方法 getter 和
        setter 方法），返回月利率的方法 getMonthlyInterest()getMonthlyInterest()，
        取款方法 withdraw()withdraw()，存款方法deposit() 。
*/



public class Account {
    private int id; // 账号
    private double balance; // 余额
    private double annualInterestRate; //年利率

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //获取年利率
    public double getMonthlyInterest(){
        return  annualInterestRate / 12;
    }

    // 取款方法
    public void withdraw (double amount){
        if(amount > balance){
            System.out.println("余额不足！");
            return;
        }
        balance -= amount;

    }

    // 存钱
    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
        }
    }
}


/*
*
*  写一个用户程序测试Account 类。在用户程序中，创建一个账号为 1122 、余额为 20000
*  年利率 4.5% 的 Account 对象。使用 withdraw 方法提款 3000 0 元，并打印余额。
*  再使用withdraw 方法提款 2500 元，使用 deposit 方法存款 3000 元，然后打印余额
*  和月利率。
*
*/


public class AccountTest {
    public static void main(String[] args) {
        Account acc = new Account(1122,20000,0.045);
        acc.withdraw(30000);
        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println();
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println("您的账户余额为：" + acc.getBalance());
        System.out.println("月利率为：" +  (acc.getMonthlyInterest() * 100) + "%");

    }
}