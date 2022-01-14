package stack;

import java.util.Stack;

/**
 * @author wangyimu
 * @Program 2022
 * @create 2022-01-14-22:56
 */
public class stackTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
