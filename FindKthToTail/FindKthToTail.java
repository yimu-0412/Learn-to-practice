class ListNode{
    int val;
    ListNode next;
    public ListNode (int x){
        val = x;
    }
}

class LinkList {
    ListNode head;//标识链表的头

    //头插法
    public void addFirst(int data){
        ListNode node= new ListNode(data);
        node.next = this.head;
        head = node;
    }

    //输出该链表中倒数第k个结点
    public ListNode findKthToTail(int k){
        if(k <= 0 || head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while((k - 1) != 0){
            //判断k值是否过大
            if(fast.next != null){
                fast = fast.next;
                k --;
            } else{
                System.out.println("k值过大");
                return null;
            }
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //遍历链表
    public void display(){
       ListNode cur = this.head;
       while(cur != null){
           System.out.print(cur.val + " ");
           cur = cur.next;
       }
       System.out.println();
    }
}
public class FindKthToTail {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.display();
        System.out.println(list.findKthToTail(6).val);
    }
}