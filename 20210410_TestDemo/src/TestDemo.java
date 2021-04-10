import java.util.Scanner;

public class TestDemo {
    //编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public static void main1(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 10 == 9) {
                count++;
            }
            if (i / 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    //判定一个数字是否是素数
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        //for (i = 2; i < n; i++) {
        //for (i = 2; i < n/2; i++) {//优化
        for (i = 2; i < Math.sqrt(n); i++) {// 进一步优化
            if (n % i == 0) {
                System.out.println("不是素数");
                break;
            }
        }
        //if (i == n) {
        //if (i >= n/2) {//优化
        if (i >= Math.sqrt(n)) {// 进一步优化
            System.out.println("是素数");
        }
    }

    //打印 1 - 100 之间所有的素数
    public static void main3(String[] args) {
        int j = 0;
        for(j = 1; j <= 100;j ++){
            int i = 1;
            for (i = 2; i < Math.sqrt(j); i++) {
                if (j % i == 0) {
                    break;
                }
            }
            if (i >= Math.sqrt(j)) {
                System.out.print(j + " ");
            }
        }

    }

    //100以内奇数和偶数的和
    public static void main4(String[] args) {
        int sumEve = 0;
        int sumOdd = 0;
        int i = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sumEve = sumEve + i;
                i++;
            } else if (i % 2 == 1) {
                sumOdd = sumOdd + i;
                i++;
            }
        }
        System.out.println(sumEve);
        System.out.println(sumOdd);
    }

    public static void main5(String[] args) {
        int i = 1;
        int sum = 0;
        int num = 5;
        int fac = 1;
        while (i <= num) {
            fac = fac * i;
            i += 1;
            sum += fac;
        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i % 15 != 0) {
                i++;
                continue;
            } else {
                System.out.print(i + " ");
                i++;
            }
        }
    }

    public static void main7(String[] args) {
        int i = 1;
        int sum = 0;
        int num = 5;
        for (i = 1; i <= num; i++) {
            int fac = 1;
            int j = 0;
            for (j = 1; j <= i; j++) {
                fac = fac * j;
            }
            sum += fac;
        }
        System.out.println(sum);
    }

    public static void main8(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();
        System.out.println("请输入工资：");
        double salary= sc.nextFloat();
        System.out.println("你的信息如下：");
        System.out.println("姓名:" + name + "\n" + "年龄" + age + "\n" + "工资" + salary + "\n");
    }

    public static void main9(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int num = 0;
        while (sc.hasNextDouble()) {
            double tmp = sc.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / num);
        sc.close();
     }

     //根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
    public static void main10(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age <= 18){
            System.out.println("少年！");
        }else if(age > 18 && age <= 28){
            System.out.println("青年！");
        }else if(age > 28 && age <= 55){
            System.out.println("中年！");
        }else if(age > 55){
            System.out.println("老年！");
        }
    }

    //输出 1000 - 2000 之间所有的闰年
    public static void main11(String[] args) {
        int year = 0;
        int count = 0;
        for(year = 1000;year <= 2000;year ++){
            if((year % 4 ==0 && year % 100 !=0) || year % 400 == 0){
                System.out.print(year + " ");
                count ++;
            }
        }
        System.out.print("\n");
        System.out.println(count);
    }

    //输出乘法口诀表
    public static void main12(String[] args) {
        for(int i = 1; i <= 9; i ++){
            for(int j = 1;j <= i;j ++){
                System.out.print(j + "*" + i + "=" + i*j + "  ");
            }
            System.out.println();
        }
    }

    //求两个正整数的最大公约数(辗转相除法)
    public static void main13(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a % b != 0){
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }

    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
    public static void main14(String[] args) {
        int i = 1;
        int flg = 1;
        double sum = 0.0;
        for(i = 1;i <= 100;i ++){
            sum += 1.0/i * flg;
            flg = -flg;
        }
        System.out.println(sum);
    }

    //求出0～999999之间的所有“水仙花数”并输出。
    public static void main15(String[] args) {
        for(int i = 1;i <= 999999;i ++){
            //1.求位数
            int count = 0;
            int tmp = i;
            while(tmp != 0){
                count ++;
                tmp /= 10;
            }
            //2.求tmp的每一位
            tmp = i;
            int sum = 0;
            while(tmp != 0){
               sum += Math.pow(tmp % 10,count);
               tmp /= 10;
            }
            if(sum == i){
                System.out.println("输出数字：" + i);
            }
        }
    }

    //编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误， 可以重新输
    //入，最多输入三次。三次均错，则提示退出程序
    public static void main16(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 3;
        while(count != 0){
            System.out.println("请输入密码：");
            String password = sc.nextLine();
            if(password.equals("123")){
                System.out.println("登录成功");
                break;
            }else{
                count --;
                System.out.println("你还有" + count + "次机会");
            }
        }
    }

    //输出一个整数的每一位.
    public static void main17(String[] args) {
        int n = 123;
        while(n != 0){
            System.out.println(n % 10);
            n /= 10;
        }
    }





}

































































































