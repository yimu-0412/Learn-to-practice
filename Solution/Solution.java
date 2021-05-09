
/*
* 给你一个链表的头节点 head 和一个整数 val ，请你
* 删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 
*/

Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)return null;
        ListNode prev = head;
        ListNode cur = head.next;
        while(cur != null){
            if(cur.val == val){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
            }
        }
        //这个if语句，放置在前面必须是循环
        if(head.val == val){
            head = head.next;
        }
        return head;
    }
}