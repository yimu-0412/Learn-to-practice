

class Node {
    private int val;
    private Node next;
    public Node (int val){
        this.val = val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public int getVal() {
        return val;
    }

}

class MyQueue {

    private Node first;
    private Node last;

    //入队
    public void offer(int val){
        //尾插法：判断是不是第一次插入
        Node node = new Node(val);
        if(this.first == null){
            this.first = node;
            this.last = node;
        } else{
            this.last.setNext(node);//last.next = node;
            this.last = node;
        }
    }

    //出队
    public int poll(){
        //判断是否为空
        if(isEmpty()){
            throw new UnsupportedOperationException("对列为空");
        }
        int ret = this.first.getVal();
        this.first = this.first.getNext();//this.first = this.first.next;
        return ret;
    }

    public boolean isEmpty(){
        return this.first == null;
    }

    //得到队头元素但是不删除
    public int peek(){
        //判断是否为空
        if(isEmpty()){
            throw new UnsupportedOperationException("对列为空");
        }
        return this.first.getVal();
    }

}

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(3);
        System.out.println(myQueue.peek());//1
        System.out.println(myQueue.poll());//1
        System.out.println(myQueue.peek());//3
        System.out.println(myQueue.isEmpty());
    }
}


