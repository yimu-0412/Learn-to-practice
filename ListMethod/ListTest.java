import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangyimu
 * @Program List接口的常用方法
 * @create 2021-08-26-22:00
 */

/*
    void add(int index, Object ele):在index位置插入ele元素
    boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
    Object get(int index):获取指定index位置的元素
    int indexOf(Object obj):返回obj在集合中首次出现的位置
    int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置
    Object remove(int index):移除指定index位置的元素，并返回此元素
    Object set(int index, Object ele):设置指定index位置的元素为ele
    List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的子集合

    总结：常用方法
        增：add(Object obj)
        删：remove(int index) / remove(Object obj)
        改：set(int index, Object ele)
        查：get(int index)
        插：add(int index, Object ele)
        长度：size()
        遍历：① Iterator迭代器方式
             ② 增强for循环
             ③ 普通的循环

     */
public class ListTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add("BB");
        System.out.println(list); // [123, 456, AA, BB]
        System.out.println("********************************");

        // 1.void add(int index, Object ele):在index位置插入ele元素
        list.add(1,"CC");
        System.out.println(list); // [123, CC, 456, AA, BB]
        System.out.println("********************************");

        // 2.//boolean addAll(int index, Collection eles):从index位置开始将eles中的所有元素添加进来
        List list1 = Arrays.asList(123,2,4);
        list.addAll(list1);
        System.out.println(list.size()); // 8
        System.out.println(list); // [123, CC, 456, AA, BB, 123, 2, 4]
        System.out.println("********************************");

        // 3.Object get(int index):获取指定index位置的元素
        System.out.println(list.get(3)); // AA
        System.out.println("********************************");

        // 4.int indexOf(Object obj):返回obj在集合中首次出现的位置
        int index = list.indexOf(123);
        System.out.println(index); // 0
        System.out.println("********************************");

        // 5.int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置。如果不存在，返回-1.
        System.out.println(list.lastIndexOf(123)); // 5
        System.out.println(list.lastIndexOf(23)); // -1
        System.out.println("********************************");

        // 6.Object remove(int index):移除指定index位置的元素，并返回此元素
        Object o = list.remove(0);
        System.out.println(o); // 123
        System.out.println(list); // [CC, 456, AA, BB, 123, 2, 4]
        System.out.println("********************************");

        // 7.Object set(int index, Object ele):设置指定index位置的元素为ele
        list.set(1,"DD");
        System.out.println(list); // [CC, DD, AA, BB, 123, 2, 4]
        System.out.println("********************************");

        // 8.List subList(int fromIndex, int toIndex):返回从fromIndex到toIndex位置的左闭右开区间的子集合
        List subList = list.subList(0,4);
        System.out.println(subList); // [CC, DD, AA, BB]

    }
}
