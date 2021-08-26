import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wangyimu
 * @Program List接口的三种遍历方式
 * @create 2021-08-26-23:20
 */
public class ForEachList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add("BB");

        // 方式一:Iterator迭代器方式
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " "); // 123 456 AA BB
        }
        System.out.println();
        System.out.println("*********************");

        // 方式二:增强for循环
        for(Object obj:list){
            System.out.print(obj + " "); // 123 456 AA BB
        }
        System.out.println();
        System.out.println("*********************");

        // 方式三:普通for循环
        for(int i = 0; i < list.size(); i ++){
            System.out.print(list.get(i) + " "); // 123 456 AA BB
        }

    }

}
