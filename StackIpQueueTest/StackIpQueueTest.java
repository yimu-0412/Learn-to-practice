
/*
*  题目：
*     请你仅使用两个栈实现先入先出队列。队列应当支持一般
*     队列支持的所有操作（push、pop、peek、empty）：
*     实现 MyQueue 类：
*     void push(int x) 将元素 x 推到队列的末尾
*     int pop() 从队列的开头移除并返回元素
*     int peek() 返回队列开头的元素
*     boolean empty() 如果队列为空，返回 true ；否则，返回 false
*
*/

import java.util.Stack;
class StackIpQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public StackIpQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    // 将元素 x 推到队列的末尾
    public void push(int x) {
        s1.push(x);
    }

   //从队列的开头移除并返回元素
    public int pop() {
        if(empty()) return -1;
        if(s2.empty()){
            while(!s1.empty()){
                int x = s1.pop();
                s2.push(x);
            }
        }
        return s2.pop();
    }

    // 返回队列开头的元素
    public int peek() {
        if(empty()) return -1;
        if(s2.empty()){
            while(!s1.empty()){
                int x = s1.pop();
                s2.push(x);
            }
        }
        return s2.peek();

    }

    // 判断队列是否为空
    public boolean empty() {
        if(s1.empty() && s2.empty()){
            return true;
        }
        return false;
    }
}
public class StackIpQueueTest {
    public static void main(String[] args) {
        StackIpQueue queue = new StackIpQueue();
        System.out.println(queue.empty());//true
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());//1
        System.out.println(queue.pop());//1
        System.out.println(queue.peek());//2
        System.out.println(queue.empty());//false
    }
}