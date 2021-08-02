package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wangyimu
 * @create 2021-07-31-19:16
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // 添加元素，但重复元素不会被添加成功
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add(null);
        System.out.println(set); // [A, B, C, D]

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\n=======================");
        Object[] o = set.toArray();
        System.out.println(Arrays.toString(o));
    }
}
