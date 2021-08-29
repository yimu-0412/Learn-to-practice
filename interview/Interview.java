import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author wangyimu
 * @Program Day_20210828
 * @create 2021-08-29-15:48
 */
public class Interview {
    public static List duplicateList(List list){
        HashSet set = new HashSet();
        set.addAll(list);
        return new ArrayList(set);
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        List list1 = duplicateList(list);
        for(Object integer: list1){
            System.out.println(integer);
        }
    }
}
