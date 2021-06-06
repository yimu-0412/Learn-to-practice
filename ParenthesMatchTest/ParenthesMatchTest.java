/*
*   1.给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，
*     判断字符串是否有效。
*
*     有效字符串需满足：
*     左括号必须用相同类型的右括号闭合。
*     左括号必须以正确的顺序闭合。
*/


import java.util.Stack;

class ParenthesMatch {
    public boolean isValid(String s){
        if(s == null || s.length() == 0){
            return true;
        }
        // 1.定义一个栈，存放左括号
        Stack<Character> stack = new Stack<>();

        // 2.开始遍历当前的字符串s
        for(int i = 0;i < s.length();i ++){
            //获取当前的i小标是什么字符
            char ch = s.charAt(i);
            //判断当前的字符是哪一种左括号吗，因为题目要求是三中括号
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }else {
                //说明当前i下标的字符是一个右括号
                //判断栈空不空
                if (stack.empty()) {
                    System.out.println("右括号多");
                    return false;
                }
                //获取栈顶元素，但是先别出栈
                char tmp = stack.peek();
                if (tmp == '(' && ch == ')' || tmp == '[' && ch == ']' ||
                        tmp == '{' && ch == '}') {
                    stack.pop();
                }else{
                    System.out.println("括号不匹配");
                    return false;
                }
            }
        }
        //把栈遍历结束后，栈不是空的
        if(!stack.empty()){
            System.out.println("左括号多");
            return false;
        }
        return true;
    }
}
public class ParenthesMatchTest {
    public static void main(String[] args) {
        String str ="[()]}";
        ParenthesMatch flg = new ParenthesMatch();
        System.out.println(flg.isValid(str));

    }
}