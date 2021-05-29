/*
*  字符串截取
*/

public class SubString {
    public static void main(String[] args) {
        String str = "hello world";

        //从指定索引截取到结尾
        String sub1 = str.substring(6);
        System.out.println(sub1);//world

        //截取部分内容
        String sub2 = str.substring(0,5);
        //前闭后开区间,substring(0, 5) 表示包含 0 号下标的字符, 不包含 5 号下标
        System.out.println(sub2);//hello
    }

}