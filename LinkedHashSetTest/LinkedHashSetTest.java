import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author wangyimu
 * @Program Day_20210828
 * @create 2021-08-28-15:44
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        Set linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(new Person("花花",24));
        linkedHashSet.add(new Person("花花",24));
        linkedHashSet.add(4);
        linkedHashSet.add("AA");

        Iterator iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
