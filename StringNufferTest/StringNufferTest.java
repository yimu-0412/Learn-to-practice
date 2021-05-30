/*
*  1.在String中使用"+"来进行字符串连接，但是这个操作在StringBuﬀer类中需要更改为append()方法：
*  2.语法格式：
*      public synchronized StringBuffer append(各种数据类型 b)
*  3.String和 StringBuffer的区别：
*      String的内容无法修改，而StringBuﬀer的内容可以修改。频繁修改字符串的情况考虑
*  使用StingBuﬀer。
*  4.注意：
*      String和StringBuﬀer类不能直接转换，
*      如果要想互相转换，可以采用如下原则：
*          String变为StringBuﬀer:利用StringBuﬀer的构造方法或append()方法
*          StringBuﬀer变为String:调用toString()方法
*  5.字符串反转
*       public synchronized StringBuffer reverse()
*  6.删除指定范围的数据:
*       public synchronized StringBuffer delete(int start, int end)
*  7.插入数据
*       public synchronized StringBuffer insert(int offset, 各种数据类型 b)
*
*/


public class StringNufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello").append(" world");
        fun(sb);
        System.out.println(sb);
        System.out.println("======================");

        //字符串反转
        StringBuffer sb1 = new StringBuffer("helloworld");
        System.out.println(sb1.reverse());
        System.out.println("======================");

        //删除指定范围的数据
        StringBuffer sb2 = new StringBuffer("helloworld");
        System.out.println(sb2.delete(5,10));
        System.out.println("======================");

        //插入数据
        StringBuffer sb3 = new StringBuffer("helloworld");
        System.out.println(sb3.insert(5, " & "));


    }
    public static void fun(StringBuffer temp){
        temp.append("\n").append("www.baidu.com");
    }
}