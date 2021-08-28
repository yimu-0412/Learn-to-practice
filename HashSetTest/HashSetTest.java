import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wangyimu
 * @Program Day_20210828
 * @create 2021-08-28-9:39
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(new Person("花花",24));
        hashSet.add(new Person("花花",24));
        hashSet.add(4);
        hashSet.add("AA");

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }


    }

}
