import java.util.Arrays;

public class StringAndByte {
    public static void main(String[] args) {
        //将字符数组中的所有内容变成字符串
        byte[] bytes = {'a','b','c','d','f'};
        String str = new String(bytes);
        System.out.println(str);

        //将部分字符数组中的内容变为字符串
        String str1 = new String(bytes,2,3) ;
        System.out.println(str1);

        //将字符串变为字符数组返回
        byte[] bytes1 = str.getBytes();
        for (int i = 0; i < bytes1 .length; i++) {
            System.out.print(bytes1 [i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(bytes1));

    }
}