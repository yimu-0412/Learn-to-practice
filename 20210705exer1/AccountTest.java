
/*
 *  1.编写一个类实现银行账户的概念，包含的属性有“帐号”、“密码”、“存款余额”、“利率”、“最小余额”，
 *      定义封装这些属性的方法。账号要自动生成。
 *      编写主类，使用银行账户类，输入、输出3个储户的上述信息
 *      考虑：哪些属性可以设计成static属性。
 */
class Account {
    private int id; // 账号
    private String pwd = "000000"; // 密码
    private double balance; // 余额

    private static double interestRate; // 利率
    private static double minMoney; // 最小余额
    private static int init = 100001;

    public Account() {
        id = init ++;
    }

    public Account(String pwd, double balance) {
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    public static void setMinMoney(double minMoney) {
        Account.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}


public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("123456",1000);
        Account account2 = new Account("124y86",1080);
        Account account3 = new Account("1fh644",1600);

        System.out.println(account1.toString());
        System.out.println(account2.toString());
        System.out.println(account3.toString());
    }
}