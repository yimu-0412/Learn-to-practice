package map;

import java.util.*;

/**
 * @author wangyimu
 * @Program 2022
 * @create 2022-01-14-19:10
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1,"曹操");
        map.put(2,"孙悟空");
        map.put(3,"猪八戒");

        map.put(4,"曹操");

        // System.out.println(map.remove(1));

        System.out.println(map.get(2));

        System.out.println(map.containsKey(1));

        System.out.println(map.containsValue("曹操"));

        System.out.println(map.size());

        // 遍历所有的key-value:方式二
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while(iterator.hasNext()){
            Object key = iterator.next();
            Object value = map.get(key);
            System.out.println(key +"--->" + value);
        }

        Collection colls = map.values();
        for(Object obj : colls){
            System.out.println(obj);
        }

        // 遍历所有的key-value:方式一
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while(iterator1.hasNext()){
            Object o = iterator1.next();
            // entrySet集合中的元素都是entry
            Map.Entry entry = (Map.Entry)o;
            System.out.println(entry.getKey()+"--->" + entry.getValue());
        }



    }
}
