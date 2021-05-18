/*
* 3.编写程序，声明一个method方法，在方法中打印一个10*8 的*型矩形， 在main方法中调用该方法。
* 4.修改上一个程序，在method方法中，除打印一个10*8的*型矩形外，再 计算该矩形的面积，并将其
*   作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
* 5.修改上一个程序，在method方法提供m和n两个参数，方法中打印一个 m*n的*型矩形，并计算该矩
*   形的面积，将其作为方法返回值。在main方法中调用该方法，接收返回的面积值并打印。
*
*/

public class ExerTest3 {
    public int method(int m ,int n){
        for(int i = 0; i < m; i ++){
            for(int j = 0; j < n; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
    public static void main(String[] args) {
        ExerTest3 test = new ExerTest3();
        int area = test.method(10,8);
        System.out.println("面积为： " + area);
    }
}