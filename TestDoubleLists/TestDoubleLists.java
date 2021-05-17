/*
* 无头双向链表实现
*/
class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode (){
    }
    public ListNode (int val){
        this.val = val;
    }
}
class DoubleLinkedList {
    public ListNode head;
    public ListNode last;

    //头插法
    public void addFirst(int    data){
        ListNode node = new ListNode(data);
        if(head == null){
            this.head = node;
            this.last = node;
        }else{
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    // 尾插法
    public void addLast(int    data){
        ListNode node = new ListNode(data);
        if(head == null){
            this.head = node;
            this.last = node;
        }else{
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    // 任意位置插入,第一个数据节点为0号下标
    public ListNode searchIndex(int index){
        ListNode cur = this.head;
        while(index != 0){
            cur = cur.next;
            index --;
        }
        return cur;
    }
    public void addIndex(int index, int data){
        if(index < 0 || index > size()){
            System.out.println("index不合法");
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == size()){
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
    // 查找是否包含关键字key是否在单链表当中
    public boolean contains(int   key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    // 删除第一次出现关键字为key的节点
    public void remove(int key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                //key所指的节点就是要删除的节点
                if(cur == head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //中间位置
                        cur.next.prev = cur.prev;
                    } else {
                        //删除尾巴节点
                        last = cur.prev;
                    }
                }
                return;
            }else{
                cur = cur.next;
            }
        }
    }
    // 删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while(cur != null){
            if(cur.val == key){
                //key所指的节点就是要删除的节点
                if(cur == head){
                    this.head = this.head.next;
                    if(this.head != null){
                        this.head.prev = null;
                    }else{
                        last = null;//防止链表的节点不能被回收
                    }
                }else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //中间位置
                        cur.next.prev = cur.prev;
                    } else {
                        //删除尾巴节点
                        last = cur.prev;
                    }
                }
                cur = cur.next;
            }else{
                cur = cur.next;
            }
        }
    }
    // 得到单链表的长度
    public int size(){
            ListNode cur = this.head;
            int count = 0;

            while(cur != null){
                count ++;
                cur = cur.next;
            }
            return count;

    }
    public void display(){
        ListNode cur = this.head;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){
        ListNode cur = this.head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.prev = null;
            cur.next = null;
            cur = curNext;
        }
        last = null;
        head = null;
    }
}
public class TestDoubleLists {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.display();
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.display();
        System.out.println(list.size());
        list.addIndex(0,1);
        list.addIndex(8,1);
        list.addIndex(3,10);
        list.display();
        System.out.println(list.size());
        list.addIndex(11,12);
        list.removeAllKey(2);
        list.display();
        list.clear();
        System.out.println("======");

    }
}











