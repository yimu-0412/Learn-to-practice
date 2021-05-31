package 初识集合;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();

        //将元素放入集合中
        collection.add(123);
        collection.add(456);
        System.out.println(collection);
        System.out.println("====================");

        //删除集合中的元素
        collection.remove(123);
        System.out.println(collection);
        System.out.println("====================");

        //返回一个装有所有集合中元素的数组
        collection.add(678);
        Object[] array =  collection.toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("====================");

        //返回集合中元素的个数
        int size = collection.size();
        System.out.println(size);
        System.out.println("====================");

        //删除集合中所有的元素
        collection.clear();
        System.out.println(collection.size());
        //判断集合中是否没有任何元素，俗称空合集
        System.out.println(collection.isEmpty());
        System.out.println("====================");

    }

}