/*
*  栈的顺序表实现：
*     利用顺序表实现，即使用尾插 + 尾删的方式实现
*
*/

import java.util.Arrays;
class Stack {
    private int[] array = new int[10];
    private int size = 0;
    // 放入栈中数据
    public void push(int v){
        array[size ++] = v;
    }
    // 栈顶存储数据
    public int pop(){
        return array[ --size];
    }
    // 查看下一层数据
    public int peek(){
        return array[size - 1];
    }
    //判断栈中数据是否为空
    public boolean isEmpty(){
        return size ==0;
    }
    // 计算栈中数据个数
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return  "array=" + Arrays.toString(array) ;
    }
}
public class LinkStack{
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(13);
        stack.push(12);
        stack.push(15);
        stack.push(16);
        stack.push(17);
        System.out.println(stack);
        System.out.println("==========================");

        int size = stack.size();
        System.out.println(size);
        System.out.println("==========================");

        int ret = stack.pop();
        System.out.println(ret);
        System.out.println(stack.peek());
        System.out.println("==========================");

        int ret1 = stack.pop();
        System.out.println(ret1);
        System.out.println(stack.peek());
        System.out.println("==========================");

        System.out.println(stack.isEmpty());
    }
}