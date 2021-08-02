/**
 * @author wangyimu
 * @create 2021-08-01-21:11
 */
public class HashBucket {
     static class Node{
         public int key;
         public int val;
         public Node next;

         public Node(int key, int val) {
             this.key = key;
             this.val = val;
         }
     }

     private Node[] array;
     private int size; // 记录当前的数据个数

    public HashBucket() {
        this.array = new Node[10];
        this.size = 0;
    }

    public void put(int key, int val){
         // 1.确定下标
         int index = key % array.length;
         // 2.遍历这个下标的链表
         Node cur = array[index];
         while(cur != null){
             if(cur.key == key){
                 cur.val = val;
                 return; // 这里一定要结束
             }
             cur = cur.next;
         }
         // 3.cur == null 当前数组下标 链表为空
         Node node = new Node(key,val);
         // 头插法
         node.next = array[index]; // null
         array[index] = node; // node
         this.size ++;
         // 4.判断当前有没有超过负载因子
         if (loadFactor() >= 0.6){
             // 扩容
             resize();
         }


     }

    public double loadFactor(){
         return size * 1.0 / this.array.length;
    }

    public void resize(){
         // 自己创建新的二倍数组
        Node[] newArr = new Node[2 * this.array.length];
        // 遍历原来的哈希痛
        // 最外层循环 控制数组下标
        for (int i = 0; i < array.length; i ++){

            Node cur = array[i];
            Node curNext = null;
            while(cur != null){
                // 记录cur.next
                curNext = cur.next;
                // 确定下标
                int index = cur.key % newArr.length;
                // 头插法
                cur.next = newArr[index];
                newArr[index] = cur;
                cur = curNext;
            }

        }
        this.array = newArr;
    }

    public int get(int key){
         // 以什么方式存储的，那就以什么方式获取
        int index = key % array.length;;

        Node cur = array[index];
        while(cur != null){
            if(cur.key == key){
                return cur.val;
            }
            cur = cur.next;
        }
        return  -1;
    }

    public static void main(String[] args) {
        HashBucket hashBucket = new HashBucket();
        hashBucket.put(1,1);
        hashBucket.put(4,4);
        hashBucket.put(14,14);
        hashBucket.put(24,24);
        hashBucket.put(34,34);
        hashBucket.put(44,44);
        hashBucket.put(54,54);

        System.out.println();
    }


}













