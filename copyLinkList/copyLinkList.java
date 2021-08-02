import java.util.HashMap;
import java.util.Random;

/**
 * @author wangyimu
 * @create 2021-07-31-21:58
 * 复制带随机指针的链表
 */

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class copyLinkList {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        HashMap<Node,Node> map = new HashMap<>();
        Node cur = head;
        while(cur != null){
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }

        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }


}
