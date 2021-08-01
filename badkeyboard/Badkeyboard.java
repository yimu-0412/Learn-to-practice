package badkeyboard;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author wangyimu
 * @create 2021-07-31-22:44
 *  旧键盘 ：
 *  输入在2行中分别给出应该输入的文字、以及实际被输入的文字。
 *  每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
 * 以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
 */
public class Badkeyboard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine(); // 预期的
        String str2 = scan.nextLine(); // 实际的
        HashSet<Character> setActual = new HashSet<>();
        for(char ch : str2.toUpperCase().toCharArray()){
            setActual.add(ch);
        }

        HashSet<Character> setBroken = new HashSet<>();
        for(char ch : str2.toUpperCase().toCharArray()){
            if(!setActual.contains(ch) && !setBroken.contains(ch)){
                setBroken.add(ch);
                System.out.println(ch);
            }
        }
    }
}
