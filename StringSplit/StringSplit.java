import java.util.Arrays;


public class StringSplit {
    public static void main(String[] args) {
        String name = "wang yi mu";

        //将字符串全部拆分，返回类型String[]
        System.out.println(Arrays.toString(name.split(" ")));
        String[] ret = name.split(" ");//按照空格拆分
        for(String s: ret){
            System.out.println(s + "  ");
        }
        System.out.println("================================");

        //将字符串部分拆分，该数组长度就是limit极限
        String str = "hello world hello bit";
        String[] ret1 = str.split(" ",2);
        for(String s : ret1){
            System.out.println(s);
        }
        System.out.println("================================");

        // 特殊字符作为分割符可能无法正确切分, 需要加上转义.
        // 拆分IP地址
        /*
        * 1. 字符"|","*","+"都得加上转义字符，前面加上"\".
        * 2. 而如果是""，那么就得写成"\\".
        * 3. 如果一个字符串中有多个分隔符，可以用"|"作为连字符.
        */
        String str1 = "192.168.1.2";
        String[] result = str1.split("\\.");
        for(String s : result){
            System.out.println(s);
        }
        System.out.println("================================");

        String str2 = "192\\168\\12";
        String[] ret2 = str2.split("\\\\");//按照”\“拆分
        for(String s : ret2){
            System.out.println(s);
        }
        System.out.println("================================");

        // 多次拆分
        String str3 = "abc\\ def * gtb";
        String[] result1 = str3.split("\\\\");
        for(int i = 0;i < result1.length;i ++){
            String[] temp = result1[i].split("\\*");
            for(int j = 0; j < temp.length;j ++){
                System.out.println(temp[j] + " ");
            }
        }