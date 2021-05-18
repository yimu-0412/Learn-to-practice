/*
MyLinkList 底层是一个双向列表，这里采用他的名字
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
public class MyLinkList {
    public ListNode head;//标识整个链表的头

    /*
    * 穷举法
    */
    public void createList(){
        ListNode listnode1 = new ListNode(1);
        ListNode listnode2 = new ListNode(2);
        ListNode listnode3 = new ListNode(3);
        ListNode listnode4 = new ListNode(4);
        ListNode listnode5 = new ListNode(5);
        listnode1.next = listnode2;
        listnode2.next = listnode3;
        listnode3.next = listnode4;
        listnode4.next = listnode5;
        head = listnode1;//head引用  引用了ListNode引用 引用的对象
    }
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
    //尾插法
    public void addLast(int data){
        ListNode cur = this.head;
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
            return;
        }
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        //1.判断index位置是否合法
        if(index < 0 || index > size()){
            System.out.println("index位置不合法");
        }
        //2.index位置位于第一位
        if(index == 0){
            addFirst(data);
            return;
        }
        //3.index 位置为最后一位
        if(index == size() ){
            addLast(data);
            return;
        }
        //4.cur指向的是一个index-1位置的节点
        ListNode cur = findIndexSubOne(index);
        ListNode node = new ListNode(data);
        node.next = cur.next;
        cur.next = node;
    }
    public ListNode findIndexSubOne(int index){
        ListNode cur = this.head;
        for(int i = 0;i < index - 1; i ++){
            cur = cur.next;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        for(int i = 0; i < size();i ++){
            if(cur.val == key){
                return true;
            }
            cur = cur.next;
        }
        return  false;
    }
    public ListNode searchPrev(int key){
        ListNode prev = this.head;
        while(prev.next != null){
            if(prev.next.val == key){
                return prev;
            }
            prev = prev.next;
        }
        return null;//代表没有找到前驱节点
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        //0.需要删除的节点是0节点
       if(this.head.val == key){
           this.head = this.head.next;
           return;
       }
       //1.寻找需要删除节点的前驱节点
        ListNode prev = searchPrev(key);
       if(prev == null){
           System.out.println("没有需要删除的节点");
           return;
       }
       //2.开始删除
       ListNode del = prev.next;
       prev.next = del.next;
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode prev = this.head;
        ListNode cur = this.head.next;
        while(cur != null){
            if(cur.val == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = cur;
                cur = cur.next;
               // prev = prev.next;
            }
        }
        if(this.head.val == key){
            this.head = this.head.next;
        }
    }
    //得到单链表的长度
    public int size(){
        ListNode cur = this.head;
        int count = 0;
        //不能输this.head.next != null 这样写最后一个节点不会被打印
        while(cur != null){
            count ++;
            cur = cur.next;
        }
        return count;
    }
    public void clear(){
        //this.head = null;
        ListNode cur = this.head;
        while(cur != null){
            ListNode curNext = cur.next;
            cur.next = null;
            cur = curNext;
        }
        this.head = null;
    }



}
