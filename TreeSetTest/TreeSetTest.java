
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author wangyimu
 * @Program Day_20210828
 * @create 2021-08-28-13:39
 */
public class TreeSetTest {
    // 1.向TreeSet中添加的数据,要求是相同类型的对象
    // 2.两种排序方式:自然排序(compare接口) 和 定制排序 (Comparator接口)
    // 3.自然排序中,比较两个对象相同的标准为: compareTo() 返回0,不再是equals().
    // 4.自定义排序中,比较两个对象相同的标准为: compare() 返回0,不再是equals().
    public static void main(String[] args) {

        Set treeSet = new TreeSet();
        treeSet.add(new Person("AA",22));
        treeSet.add(new Person("TT",24));
        treeSet.add(new Person("UU",75));
        treeSet.add(new Person("UU",78));
        treeSet.add(new Person("LL",26));
        treeSet.add(new Person("EE",23));
        treeSet.add(new Person("HH",24));
        /*treeSet.add(-23);
        treeSet.add(34);
        treeSet.add(45);
        treeSet.add(12);*/

        int size = treeSet.size();
        System.out.println(size);
        System.out.println(  );

        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
