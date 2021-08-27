import java.util.ArrayList;
import java.util.List;

/**
 * @author wangyimu
 * @Program Day_20210826
 * @create 2021-08-27-22:28
 */
public class ListExer1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        upList(list);
        System.out.println(list); // [1, 2]

        System.out.println("*********************************");

        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        upList1(list1);
        System.out.println(list1); // [1, 3]
    }

    // 删除的是2号索引位置的值
    public static void upList(List list){
        list.remove(2);
    }

    // 删除集合中 2 这个元素
    public static void upList1(List list){
        list.remove(new Integer(2));
    }

}
