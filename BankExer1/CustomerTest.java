
class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

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

    // 取钱操作: 中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示。
    public void withdraw (double amount) {
        if(balance < amount){
            System.out.println("余额不足，取款失败");
            return;
        }
        balance -= amount;
        System.out.println("成功取出: " + amount);
    }

    // 存钱操作
    public void deposit (double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入: " + amount);
        }
    }

}

class Customer {
    private String firstName;
    private String lastName;
    private Account account; //客户账户

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    // 方法以获取account属性
    public Account getAccount() {
        return account;
    }

    // 方对account属性赋值
    public void setAccount(Account account) {
        this.account = account;
    }
}


public class CustomerTest {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        cust.setAccount(account);
        cust.getAccount().deposit(100);
        cust.getAccount().withdraw(960);
        cust.getAccount().withdraw(2000);

        System.out.println("Customer [" + cust.getLastName() + "," + cust.getFirstName() + "] " +
                "has a account: Id is " + cust.getAccount().getId() + ",annualInterestRate is " +
                cust.getAccount().getAnnualInterestRate()*100 + "%,balance is " +
                cust.getAccount().getBalance());
    }

}

