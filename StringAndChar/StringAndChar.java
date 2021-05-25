import java.util.Arrays;

public class StringAndChar {
    public static void main(String[] args) {
        //将字符数组中的所有内容变成字符串
        char[] chs = {'a','b','c','d','f'};
        String str = new String(chs);
        System.out.println(str);

        //将部分字符数组中的内容变为字符串
        String str1 = new String(chs,2,3) ;
        System.out.println(str1);

        //取得索引位置的字符，索引从0开始
        char ch = str.charAt(4);
        System.out.println(ch);

        //将字符串变为字符数组返回
        char[] chs1 = str.toCharArray();
        for (int i = 0; i < chs1.length; i++) {
            System.out.print(chs1[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(chs1));

    }
}