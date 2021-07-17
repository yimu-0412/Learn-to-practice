package FamilyAccount;

public class FamilyAccount {
    public static void main(String[] args) {

        boolean isFlag = true;
        String details = "收支\t\t账户金额\t\t收支金额\t\t说  明";
        int balance = 10000;

        while(isFlag){
            System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记收入");
            System.out.println("                   4 退  出\n");
            System.out.print("                请选择(1-4): ");

            // 要求用户输入1-4选择
            char menu = Utility.readMenuSelection();
            switch (menu){
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------------");
                    break;
                case '2' :
                    System.out.print("本次收入金额：");
                    int addMoney =Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String addInstr = Utility.readString();

                    balance += addMoney;
                    details +=  "\n收入\t\t" + balance + "\t\t" +  addMoney + "\t\t\t" + addInstr;
                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '3' :
                    System.out.print("本次收入金额：");
                    int expendMoney =Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String expendInstr = Utility.readString();

                    balance -= expendMoney;
                    details +=  "\n收入\t\t" + balance + "\t\t" +  expendMoney + "\t\t\t" + expendInstr;
                    System.out.println("---------------------登记完成---------------------");
                    break;
                case '4' :
                    System.out.println("确认是否退出(Y/N):");
                    char selection = Utility.readConfirmSelection();
                    if(selection == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }
    }

}
