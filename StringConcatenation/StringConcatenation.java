import java.util.Scanner;
/*
*
* 1.不借用任何字符串函数实现无冗余地接受两个字符串，
*   然后把他们无冗余的连接起来
*
*/

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String ret = "";
            String str = scan.nextLine();
            String[] s1 = str.split(" ");
            /*for (int i = 0; i < s.length; i++) {
                ret += s[i];
            }*/
            for(String s: s1){
                ret += s;
            }
            System.out.println(ret);
        }
    }
}