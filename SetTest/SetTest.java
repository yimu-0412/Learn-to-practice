import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wangyimu
 * @Program Day_20210826
 * @create 2021-08-27-23:20
 */
public class SetTest {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add("AA");
        hashSet.add("BB");
        hashSet.add("EE");
        hashSet.add(5);

        // 添加失败
        hashSet.add(5);

        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
