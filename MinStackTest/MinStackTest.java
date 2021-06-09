/*
*  设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
*      push(x) —— 将元素 x 推入栈中
*      pop() —— 删除栈顶的元素
*      top() —— 获取栈顶元素
*      getMin() —— 检索栈中的最小元素
*/

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        //为空，或者新值小于等于原来的最小值时，入栈
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
    }

    public void pop() {
        int val = stack.pop();
        if(!minStack.empty()){
            int top = minStack.peek();
            if(top == val){
                minStack.pop();
            }
        }
    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}
public class MinStackTest {
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(-2);
        s.push(0);
        s.push(-3);
        System.out.println(s.getMin());//-3
        s.pop();
        System.out.println(s.top());//0
        System.out.println(s.getMin());//-2
    }
}