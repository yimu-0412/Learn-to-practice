/*
*  2.删除第一个字符串中出现的第二个字符串中的字符
*/
import java.util.ArrayList;

public class StringExer {
    public static  void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0;i < str1.length(); i++){
            char ch = str1.charAt(i);
            if(!str2.contains(ch + "")){
               list.add(ch);
            }
        }
       for(int i = 0;i < list.size(); i++){
           System.out.print(list.get(i));
       }
    }
}