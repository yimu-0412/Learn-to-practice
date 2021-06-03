
/*
* 输入一个字符串，求出该字符串包含的字符集合
*/

import java.util.Scanner;

public class StringCollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){  //循环输入
            String str=sc.nextLine();
            StringBuffer stringBuffer=new StringBuffer();
            for (int i = 0; i <str.length() ; i++) {
                char ch=str.charAt(i);//取得索引位置的字符，索引从0开始
                String tmp=stringBuffer.toString();
                if (!tmp.contains(ch+"")){    //字符型转化为字符串类型
                    stringBuffer.append(ch);
                }
            }
            System.out.println(stringBuffer);
        }

    }
}