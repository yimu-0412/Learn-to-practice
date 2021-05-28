/*
*
* 翻转字符串
*    描述：给一个字符类型的数组chas和一个整数size，
*         请把大小为size的左半区整体右移到右半区，
*         右半区整体移动到左边。
*
*/
import java.util.*;

public class /*
*
* 翻转字符串
*    描述：给一个字符类型的数组chas和一个整数size，
*         请把大小为size的左半区整体右移到右半区，
*         右半区整体移动到左边。
*
*/
import java.util.*;

public class StringReverseSentence{
    private static String reverse(char[] chars ,int first, int last){
        while(first < last){
            char tmp = chars[first];
            chars[first] = chars[last];
            chars[last] = tmp;
            first++;
            last--;
        }
        return new String(chars);
    }
    public static String reversSentence(String str,int n) {

        String ret = null;
        if(str == null || str.length() == 0){
            return null;
        }

        if (n > str.length()){
            return str;
        }
        char [] chars = str.toCharArray();
        ret = reverse(chars,0,n-1);
        ret = reverse(chars,n,chars.length-1);
        ret = reverse(chars,0,chars.length-1);

        return ret;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String ret = reversSentence(str,n);
        System.out.println(ret);
    }
}{
    private static String reverse(char[] chars ,int first, int last){
        while(first < last){
            char tmp = chars[first];
            chars[first] = chars[last];
            chars[last] = tmp;
            first++;
            last--;
        }
        return new String(chars);
    }
    public static String reversSentence(String str,int n) {

        String ret = null;
        if(str == null || str.length() == 0){
            return null;
        }

        if (n > str.length()){
            return str;
        }
        char [] chars = str.toCharArray();
        ret = reverse(chars,0,n-1);
        ret = reverse(chars,n,chars.length-1);
        ret = reverse(chars,0,chars.length-1);

        return ret;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String ret = reversSentence(str,n);
        System.out.println(ret);
    }
}