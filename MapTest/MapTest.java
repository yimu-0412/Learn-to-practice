package Map接口说明;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //将指定的K-V放入Map
        map.put(12,"huihui");
        map.put(16,"huahua");
        map.put(14,"runrun");
        //按照某种对应的规则打印
        System.out.println(map);
        System.out.println("========================");

        //根据指定的K值查找对应的V值
        String name = map.get(14);
        System.out.println(name);
        String name1 = map.get(15);
        System.out.println(name1);//返回默认值null
        System.out.println("========================");

        //根据指定的 k 查找对应的 v，没有找到用默认值代替
        String str = map.getOrDefault(10,"xiaoyu");
        System.out.println(str);
        System.out.println("========================");

        //判断是否包含 key
        boolean flg1 = map.containsKey(15);
        System.out.println(flg1);
        boolean flg2 = map.containsKey(16);
        System.out.println(flg2);
        System.out.println("========================");

        //判断是否包含 value
        boolean flg3 = map.containsValue("huahua");
        System.out.println(flg3);
        boolean flg4 = map.containsValue("huih");
        System.out.println(flg4);
        System.out.println("========================");

        //将所有键值对返回
        Set<Map.Entry<Integer,String>> entrySet =  map.entrySet();
        for(Map.Entry<Integer,String> en : entrySet ){
            System.out.println(en.getKey() + "--->" + en.getValue());
        }
        System.out.println("========================");

        //判断是否为空
        System.out.println(map.isEmpty());
        System.out.println("========================");

        //返回键值对的数量
        System.out.println(map.size());
    }
}