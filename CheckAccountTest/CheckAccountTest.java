/*
   1 、写一个名为 Account 的类模拟账户。该类的属性和方法如下图所示。该类包括的属性：
        账号 id ，余额 balance ，年利率 annualInterestRate ；包含的方法：访问器方法 getter 和
        setter 方法），返回月利率的方法 getMonthlyInterest()getMonthlyInterest()，
        取款方法 withdraw()withdraw()，存款方法deposit() 。
*/



class Account {
    private int id; // 账号
    protected double balance; // 余额
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
      1、创建 Account 类的一个子类 Che ckAccount 代表可透支的账户，该账户中定义一个属性
         overdraft 代表可透支限额。在 CheckAccount 类中重写 withdraw 方法，其算法如下：
*/

class CheckAccount extends Account {

    private double overdraft; //透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    // 取款方法
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            super.withdraw(amount);
        } else if (overdraft >= amount - getBalance()) {
            overdraft -= (amount - getBalance());
            //或者
            super.withdraw(getBalance());
        } else {
            System.out.println("超过可透支限额");
        }
    }
}

/*
    要求：
        写一个用户程序测试 CheckAccount 类。在用户程序中，创建一个账号为 1122 、余
        额为 20000 、年利 率 4.5%4.5%，可透支限额为 5000 元的 CheckAccount 对象。
        使用withdraw 方法提款 5000 元，并打印账户余额和可透支额。
        再使用withdraw 方法提款 18000 元，并打印账户余额和可透支额。
        再使用withdraw 方法提款 3000 元，并打印账户余额和可透支额。
*/


public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount acct = new CheckAccount(1122,20000,0.045,5000);
        acct.withdraw(5000);
        System.out.println("您的账户余额为：" + acct.getBalance());
        System.out.println("您的透支余额为：" + acct.getOverdraft());
        System.out.println();
        acct.withdraw(18000);
        System.out.println("您的账户余额为：" + acct.getBalance());
        System.out.println("您的透支余额为：" + acct.getOverdraft());
        System.out.println();
        acct.withdraw(3000);
        System.out.println("您的账户余额为：" + acct.getBalance());
        System.out.println("您的透支余额为：" + acct.getOverdraft());

    }
}
