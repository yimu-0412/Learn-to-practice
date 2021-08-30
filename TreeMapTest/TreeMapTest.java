package map;

import org.junit.Test;
import java.util.*;

/**
 * @author wangyimu
 * @Program Day_20210829
 * @create 2021-08-30-23:17
 */

//向TreeMap中添加key-value，要求key必须是由同一个类创建的对象
//因为要按照key进行排序：自然排序 、定制排序
public class TreeMapTest {
    // 自然排序
    @Test
    public void test(){
        Map map = new TreeMap();

        User u1 = new User("Jack",25);
        User u2 = new User("Tom",34);
        User u3 = new User("Jerry",23);
        User u4 = new User("Rose",24);
        User u5 = new User("Rose",27);

        map.put(u1,100);
        map.put(u2,98);
        map.put(u3,78);
        map.put(u4,89);
        map.put(u5,95);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            // entrySet()集合里的元素都是entry
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

    // 定制排序
    @Test
    public void test1(){
        Map map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }

                throw new RuntimeException("输入数据类型不一致！");
            }
        });

        User u1 = new User("Jack",25);
        User u2 = new User("Tom",34);
        User u3 = new User("Jerry",23);
        User u4 = new User("Rose",24);
        User u5 = new User("Rose",27);

        map.put(u1,100);
        map.put(u2,98);
        map.put(u3,78);
        map.put(u4,89);
        map.put(u5,95);

        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            // entrySet()集合里的元素都是entry
            Map.Entry entry = (Map.Entry)obj;
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
