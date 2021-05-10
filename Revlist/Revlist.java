/*
* 关于链表反转俗我两种方法
*/
class ListNode{
    public int val;//值
    public ListNode next;//节点类型，存储下一个 节点的地址，也就是说是一个引用

    public ListNode(){

    }

    public ListNode(int val){
        this.val = val;
    }
}
 class MyLinkList {
    public ListNode head;//标识整个链表的头
    /*
     * 遍历链表
     */
    public void display(){
        ListNode cur = this.head;
        //不能输this.head.next != null 这样写最后一个节点不会被打印
       while(cur != null){
           System.out.print(cur.val +"  ");
           cur = cur.next;
       }
        System.out.println();
    }
    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = this.head;
        head = node;
    }
    //方法1：头插法
    public ListNode reverse(){
        if(this.head == null){
            return null;
        }
        if(this.head.next == null){
            //说明只有一个节点
            return head;
        }
        ListNode cur = this.head;
        ListNode curNext = cur.next;
        cur.next = null;
        cur = curNext;
        while(cur != null){
            curNext = cur.next;
            cur.next = this.head;
            head = cur;
            cur = curNext;
        }
        return head;
    }
    //方法二
    public ListNode reverse1(){
        ListNode prev = null;
        ListNode cur = this.head;
        while(cur != null){
            ListNode curNext = cur.next;
            if(curNext == null){
                head = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;

        }
        return head;
    }
}

public class Revlist {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        list.reverse();
        list.display();
        System.out.println("====================");
        list.reverse1();
        list.display();
    }
}