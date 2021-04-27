package exer;

    class ListNode {
        public int val;//值
        public ListNode next;//存储下一个节点的地址  也就是说 这个是一个引用
        public ListNode() {

        }
        public ListNode(int val) {
            this.val = val;
        }
    }

    public class MyLinkedList {
        public ListNode head;//标识整个链表的头

        /**
         * 穷举法，最low的方式 先建造一个链表出来，让你来感受一下
         */
        public void createList() {
            ListNode listNode1 = new ListNode(12);//12
            ListNode listNode2 = new ListNode(45);
            ListNode listNode3 = new ListNode(6);
            ListNode listNode4 = new ListNode(8);
            ListNode listNode5 = new ListNode(5);
            listNode1.next = listNode2;
            listNode2.next = listNode3;
            listNode3.next = listNode4;
            listNode4.next = listNode5;
            this.head = listNode1;//head引用  引用了 listNode1引用  引用的对象
        }

        /**
         * 遍历链表：
         */
        public void display() {
            ListNode cur = this.head;
            //不能是this.head.next != null  这样写 最后一个节点是不能被打印的
            while (cur != null) {
                System.out.print(cur.val+" ");
                cur = cur.next;
            }
            System.out.println();
        }

        //得到单链表的长度
        public int size(){
            int count =0;
            ListNode cur = this.head;
            while (cur != null) {
                cur = cur.next;
                count++;
            }
            return count;
        }

        //头插法
        public void addFirst(int data) {
            ListNode node = new ListNode(data);
            node.next = this.head;
            head = node;

        }
        //尾插法
        public void addLast(int data) {
            ListNode node = new ListNode(data);
            ListNode cur = this.head;//当前指向的位置
            //第一次插入
            if(this.head == null){
                this.head = node;
                return;
            }
            //非第一次插入
            while(cur.next != null){
                cur = cur.next;
            }
            //修改为最后位置
            cur.next = node;

        }
        //任意位置插入,第一个数据节点为0号下标
        public void addIndex(int index,int data) {
            if(index < 0 || index > size()){
                System.out.println("不合法");
            }
            if(index == 0){
                addFirst(data);
                return;
            }
            if(index == size()){
                addLast(data);
                return;
            }
            /*
            * 让一个引用走index-1步
            */
            ListNode cur = FindIndex(index);
            ListNode node = new ListNode(data);
            node.next = cur.next;
            cur.next = node;
        }
        public ListNode FindIndex(int index){
            ListNode cur = this.head;
            for (int i = 0; i < index -1;i ++) {
                cur = cur.next;
            }
            return cur;
        }
        //查找是否包含关键字key是否在单链表当中
        public boolean contains(int key) {
            ListNode cur = this.head;
            for (int i = 0; i < size();i ++) {
                if(cur.val == key){
                    return true;
                }
                cur = cur.next;
            }
            return false;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key) {

        }
        //删除所有值为key的节点
        public void removeAllKey(int key){

        }
        public void clear() {
            ListNode cur = this.head;//当前需要置空的节点
            //挨个置空
            while(cur != null){
                ListNode curNext = cur.next;
                cur.next = null;
                cur = curNext;
            }
            //置空头位置
            this.head = null;
        }
    }




