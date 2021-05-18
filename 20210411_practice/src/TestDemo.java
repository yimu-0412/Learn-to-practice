public class TestDemo {

    //斐波纳挈
    public static int Fib(int n){
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i = 3;i <= n;i ++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
    public static void main1(String[] args) {
        int ret = 0;
        ret = Fib(5 );
        System.out.println(ret);
    }

    //创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    //要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static int max2(int a, int b){
        return a > b? a : b;
    }
    public static int max3(int a, int b, int c){
        int max = max2(a , b);
        return max > c? max:c;
    }
    public static void main2(String[] args) {
      int ret = max3(10 , 50, 30);
      System.out.println(ret);
    }

    //交换两个数的大小
    /*public static void swap(int x , int y){
        int tmp =0;
        tmp = x;
        x = y;
        y = tmp;
    }
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        System.out.println("交换前" + a + " " + b);
        swap(a , b);
        System.out.println("交换前" + a + " " + b);
    }*/
    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main3(String[] args) {
        int[] arr  = {20 , 30};
        System.out.println("a = " + arr[0] + " b = " +arr[1]);
        swap(arr);
        System.out.println("a = " + arr[0] + " b = " +arr[1]);
    }

    //n的阶乘
    public static int Fac(int n){
       if(n == 1){
           return 1;
       }
        return n*Fac(n-1);
    }
    public static void main4(String[] args) {
        int ret = Fac(5);
        System.out.println(ret);


    }

    //打印一个数字的每一位
    /*public static void print(int n){
        if(n <= 9){
            System.out.println(n % 10);
            return;
        }
        print(n / 10);
        System.out.println(n % 10);
    }*/

    public static void print(int tmp){
        if(tmp >9){
            print(tmp / 10);
        }
        System.out.println(tmp % 10);
    }
    public static void main5(String[] args) {
        print(123456789);
    }

    //1到n的和
    public static int add(int n){
        if(n == 1){
            return 1;
        }
        return n + add(n - 1);
    }
    public static void main6(String[] args){
        int ret = 0;
        ret = add(10);
        System.out.println(ret);
    }

    //计算一个数的每个位数的数字之和
    public static int add1(int num){
        if(num < 10){
            return num;
        }
        return (num % 10) + add1(num / 10);
    }
    public static int add2(int num){
        if(num > 10){
            return add2(num / 10) + num % 10;
        }
        return num % 10;
    }

    public static void main7(String[] args) {
        int ret = 0;
        ret = add1(123);
        int ret1 = add2(123);
        System.out.println(ret);
        System.out.println(ret1);
    }

    //求斐波那契数列第n项
    public static int Fib1(int n){
        if(n == 1 || n == 2) {
            return 1;
        }
        return Fib1(n-1)+Fib1(n-2);
    }
    public static void main8(String[] args) {
        System.out.println(Fib1(40));
    }

    //汉诺塔
    /*
     *  1  A->C     1
     *  2  A->B A->C B->C   3
     *  3  A->C A->B C->B A->C B->A B->C A->C   7
     *  n 2^n  -1
     *  64 2^64  -1
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(1 == n){
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    /*
    *  n 盘子的个数
    *  pos1  起始位置
    *  pos2  转换位置
    *  pos3  目的位置
    */
    public static void move(char pos1,char pos2){
        System.out.print(pos1 + "->" + pos2 + " ");
    }

    public static void main9(String[] args) {
        hanoi(2,'A','B','C');
    }

    //青蛙跳台阶问题
    public static int  jumpFloor(int n){
        if(1 == n || 2 == n){
            return n;
        }
        return jumpFloor(n-1) + jumpFloor(n-2);
    }
    public static void main(String[] args) {
        System.out.println(jumpFloor(1));//1
        System.out.println(jumpFloor(2));//2
        System.out.println(jumpFloor(3));//3
        System.out.println(jumpFloor(4));//5
        System.out.println(jumpFloor(5));//8
    }
}
