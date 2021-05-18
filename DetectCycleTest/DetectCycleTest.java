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
    //判断是否有环及寻找环的入口
    public ListNode detectCycle(){
        ListNode fast = head;
        ListNode slow = head;
        //判断是否有环
        while((fast != null) && (fast.next != null)){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if((fast == null) || (fast.next == null)){
            return null;
        }
        //返回环的入口
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
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
public class DetectCycleTest {
    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addFirst(-4);
        list.addFirst(0);
        list.addFirst(2);
        list.addFirst(3);
        ListNode ret = list.detectCycle();
        System.out.println(ret);
        list.creatLoop();
        ListNode ret1 = list.detectCycle();
        System.out.println(ret1.val);
    }
}