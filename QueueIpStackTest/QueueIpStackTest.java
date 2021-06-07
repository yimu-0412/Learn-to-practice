/*
*  题目:
*      请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通队列的
*      全部四种操作（push、top、pop 和 empty）。
*
*      实现 QueueIpStack 类：
*      void push(int x) 将元素 x 压入栈顶。
*      int pop() 移除并返回栈顶元素。
*      int top() 返回栈顶元素
*      boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
*
* */

import java.util.LinkedList;
import java.util.Queue;

class QueueIpStack {
    private Queue<Integer> qu1;
    private Queue<Integer> qu2;

    // 实现 QueueIpStack 类
    public QueueIpStack() {
        qu1 = new LinkedList<>();
        qu2 = new LinkedList<>();
    }

    // 将元素 x 压入栈顶。
    public void push(int x) {
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else{
            //两个队列都为空，指定放置在一个队列中
            qu1.offer(x);
        }
    }

    // 移除并返回栈顶元素。
    public int pop() {
        if(empty()) return -1;
        if(!qu1.isEmpty()){
            int size = qu1.size();
            for(int i = 0; i < size - 1; i ++){
                int x = qu1.poll();
                qu2.offer(x);
            }
            return qu1.poll();
        }else{
            int size = qu2.size();
            for(int i = 0; i < size - 1; i ++){
                int x = qu2.poll();
                qu1.offer(x);
            }
            return qu2.poll();
        }
    }

    // 返回栈顶元素
    public int top() {
        if(empty()) return -1;
        if(!qu1.isEmpty()){
            int size = qu1.size();
            int x = -1;
            for(int i = 0; i < size; i ++){
                x = qu1.poll();
                qu2.offer(x);
            }
            return x;
        }else{
            int size = qu2.size();
            int x = -1;
            for(int i = 0; i < size; i ++){
                x = qu2.poll();
                qu1.offer(x);
            }
            return x;
        }
    }
    // 判断栈是否为空
    public boolean empty() {
        if(qu1.isEmpty() && qu2.isEmpty()){
            return true;
        }
        return false;
    }
}
public class QueueIpStackTest {
    public static void main(String[] args) {
        QueueIpStack stack = new QueueIpStack();
        System.out.println(stack.empty());//true
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());//3
        System.out.println(stack.top());//2
    }
}