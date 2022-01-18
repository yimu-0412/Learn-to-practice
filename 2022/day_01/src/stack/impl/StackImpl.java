package stack.impl;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author wangyimu
 * @Program 2022
 * @create 2022-01-14-23:03
 */
public class StackImpl {
    private int[] elem;
    private int top; // 栈顶元素的下标

    public StackImpl() {
        this.elem = new int[10];
    }

    // 入栈操作
    // elem ：代表入栈的元素
    public void push(int item){
        // 1.判断当前栈是否已满
        if(isFull()){
            this.elem = Arrays.copyOf(this.elem,2 * this.elem.length);
        }
        // 2. 入栈
        this.elem[top ++] = item;
    }

    // 判断当前栈是否已满
    public boolean isFull(){
        if(this.elem.length == this.top){
            return true;
        }
        return false;
    }

    // 出栈操作
    public int pop(){
        // 1. 判断栈是否为空
        if(isEmpty()){
            throw new UnsupportedOperationException("栈为空");
        }
        return this.elem[-- top];
    }

    // 得到栈顶元素
    public int peek(){
        return this.elem[top -1];
    }

    public boolean isEmpty() {
        if(this.top == 0){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "StackImpl{" +
                "elem=" + Arrays.toString(elem) + "}";
    }

    public static void main(String[] args) {
        StackImpl s = new StackImpl();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println(s.peek()); // 4
        System.out.println(s.pop()); // 4
        System.out.println(s.peek()); // 3
        System.out.println(s.isEmpty()); // false
        System.out.println(s.isFull()); // false

        System.out.println(s);
    }
}
