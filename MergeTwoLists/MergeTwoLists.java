/*
*
*5.将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
*
*/

class ListNode{
    int val;
    ListNode next;
    public ListNode (){
    }
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


    //遍历链表
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void display(ListNode data){
        ListNode cur = data;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
}

public class MergeTwoLists {
    public static ListNode mergeTwoLists(ListNode   headA, ListNode headB) {
        ListNode newHead = new ListNode();
        ListNode tmp = newHead;
        while(headA != null && headB != null){
            if(headA.val < headB.val){
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else{
                tmp.next = headB;
                headB = headB.next;
                tmp = tmp.next;
            }
        }
        if(headA != null){
            tmp.next = headA;
        }
        if(headB != null){
            tmp.next = headB;
        }
        return newHead.next;

    }
    public static void main(String[] args) {
        //链表A
        LinkList list1 = new LinkList();
        list1.addFirst(9);
        list1.addFirst(7);
        list1.addFirst(5);
        list1.addFirst(3);
        list1.addFirst(1);
        list1.display();
        //链表B
        LinkList list2 = new LinkList();
        list2.addFirst(8);
        list2.addFirst(6);
        list2.addFirst(4);
        list2.addFirst(2);
        list2.display();
        //链表A和B升序合并
        ListNode ret = mergeTwoLists(list1.head,list2.head);
        list1.display(ret);
    }
}