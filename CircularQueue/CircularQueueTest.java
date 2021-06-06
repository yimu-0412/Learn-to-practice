/*
* 要求：
*    设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）
*    原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
*
*    循环队列的一个好处是我们可以利用这个队列之前用过的空间。在一个普通队列里，一旦一个
*    队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。但是使用循环队列，我们能
*    使用这些空间去存储新的值。
*
*    你的实现应该支持如下操作：
*    MyCircularQueue(k): 构造器，设置队列长度为 k 。
*    Front: 从队首获取元素。如果队列为空，返回 -1 。
*    Rear: 获取队尾元素。如果队列为空，返回 -1 。
*    enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
*    deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
*    isEmpty(): 检查循环队列是否为空。
*    isFull(): 检查循环队列是否已满。
*/
class CircularQueue {
    private int[] elem;//数组
    private int front;//头元素的下标
    private int rear;//尾元素的下标

    public CircularQueue(int k) {
        //这里为什么是k+1，题目要求是放k个元素
        this.elem = new int[k + 1];
        this.front = 0;
        this.rear = 0;
    }

    //检查循环队列是否已满
    public boolean isFull() {
        if((this.rear + 1) % this.elem.length == this.front){
            return true;
        }
        return false;
    }

    //向循环队列插入一个元素。如果成功插入则返回真。
    public boolean enQueue(int value) {
        if(isFull()) return false;
        this.elem [this.rear] = value;
        this.rear = ( this.rear + 1) % this.elem.length;
        return true;
    }

    // 从循环队列中删除一个元素。如果成功删除则返回真。
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        this.front = (this.front + 1) % this.elem.length;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return this.elem[this.front];

    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        //当rear == 0时，下标是this.elem.length-1
        //当rear != 0时, 下标是this.rear-1
        int index = (this.rear == 0)? this.elem.length-1:this.rear -1;
        return this.elem[index];
    }

    public boolean isEmpty() {
        //当front和rear相遇时，就是空的队列
        if(this.front == this.rear){
            return true;
        }
        return false;
    }
}
public class CircularQueueTest {
    public static void main(String[] args) {
        CircularQueue  queue = new CircularQueue(3);
        System.out.println(queue.enQueue(1));//true
        System.out.println(queue.enQueue(2));//true
        System.out.println(queue.Rear());//2
        System.out.println(queue.isEmpty());//false
        System.out.println(queue.isFull());//false
        System.out.println(queue.Front());//1
        System.out.println(queue.deQueue());//true
        System.out.println(queue.Rear());//2
    }
}

