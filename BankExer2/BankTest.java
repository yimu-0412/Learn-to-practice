
class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    // 存钱操作
    public void deposit(double amt){
        if( amt > 0){
            balance += amt;
            System.out.println("成功存入：" + amt);
        }else{
            System.out.println("操作失败");
        }
    }

    // 取钱操作：中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示
    public void withdraw(double amt){
        if(balance < amt){
            System.out.println("余额不足，提取失败");
            return;
        }
        balance -= amt;
        System.out.println("成功取出：" + amt);
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

class Bank {
    private Customer[] customers; // 存放多个客户的数组
    private int numberOfCustomer; // 客户个数

    public Bank() {
        customers = new Customer[10];
        numberOfCustomer = 0;
    }

    /*
       addCustomer 方法必须依照参数（姓，名）构造一个新的Customer对象，然后把
       它放到 customer 数组中。还必须把numberOfCustomer属性的值加+1
    */
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f,l);
        customers[numberOfCustomer] = cust;
        numberOfCustomer++;
    }

    // 获取客户的数量
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    //获取指定位置上的客户
    public Customer getCustomer(int index) {
        if(index >= 0 && index < numberOfCustomer){
            return  customers[index];
        }
        return null;
    }
}

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jame","Smith");
        bank.getCustomer(0).setAccount(new Account(1000));
        bank.getCustomer(0).getAccount().deposit(500);
        bank.getCustomer(0).getAccount().withdraw(200);

        double balance1 = bank.getCustomer(0).getAccount().getBalance();

        System.out.println("Customer [" +bank.getCustomer(0).getFirstName()+ "," +
                        bank.getCustomer(0).getLastName() + "] 的账户余额为：" +
                        balance1);
        System.out.println("******************************************");
        bank.addCustomer("常","万里");
        bank.getCustomer(1).setAccount(new Account(2000));
        double balance2 = bank.getCustomer(1).getAccount().getBalance();
        System.out.println("Customer [" +bank.getCustomer(1).getFirstName()+ "," +
                           bank.getCustomer(1).getLastName() + "] 的账户余额为：" +
                            balance2);
    }
}
