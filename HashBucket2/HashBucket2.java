import java.util.Objects;

/**
 * @author wangyimu
 * @create 2021-08-02-22:43
 */
public class HashBucket2 <K,V>{
    static class Node <K,V> {
        public K key;
        public V val;
        public Node<K,V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            return key.equals(node.key) &&
                    Objects.equals(val, node.val) &&
                    Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, val, next);
        }
    }

    public Node<K,V>[] array = (Node<K,V>[]) new Node[10];
    public int size;

    public void put(K key,V val){
        // 1.通过hashcode方法定位数组的下标
        int hash = key.hashCode();
        int index = hash % this.array.length;
        Node<K,V> cur = array[index];
        while(cur != null){
            // equals 的作用是遍历当前数组下标的key值是否相同
            if(cur.key.equals(key)){
                cur.val = val;
            }
            cur = cur.next;
        }

        // 头插法
        Node<K,V> node = new Node<K,V>(key,val);
        node.next = array[index];
        array[index] = node;
        this.size ++ ;
    }

    public V get(K key){
        int hash = key.hashCode();
        int index = hash % this.array.length;
        Node<K,V> cur = array[index];
        while(cur != null){
            if(cur.key.equals(key)){
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }

    public static void main(String[] args) {
       Person p1 = new Person(01);
       Person p2 = new Person(02);
       HashBucket2<Person,String> hash = new HashBucket2<>();
       hash.put(p1,"liuhui");
       hash.put(p2,"yimu");
       System.out.println(hash);
       System.out.println(hash.get(p1));
       System.out.println(hash.get(p2));
    }
}
