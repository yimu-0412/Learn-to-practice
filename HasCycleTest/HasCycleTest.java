class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
     }
 }
 class Linklist{
     public ListNode head;//标识整个链表的头
     //头插法
     public void addFirst(int data){
         ListNode node = new ListNode(data);
         node.next = this.head;
         head = node;
     }
     //判断链表是否有环
     public boolean hasCycle(){
         ListNode fast = head;
         ListNode slow = head;
         while((fast != null) && (fast.next != null)){
             fast = fast.next.next;
             slow = slow.next;
             if(fast == slow){
                 break;
             }
         }
         //无环
         if((fast == null) || (fast.next == null)){
             return false;
         }
         //有环
         return true;
     }
     //创建链表的环
     public void creatLoop(){
         ListNode cur = head;
         while(cur.next != null){
             cur = cur.next;
         }
         cur.next = head.next;
     }
 }

public class HasCycleTest {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addFirst(-4);
        list.addFirst(0);
        list.addFirst(2);
        list.addFirst(3);
        System.out.println(list.hasCycle());
        list.creatLoop();
        System.out.println(list.hasCycle());
    }
}