package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wangyimu
 * @create 2021-07-31-18:47
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        // 设置 key 对应的 value
        map.put("及时雨", "宋江");
        map.put("国民女神", "高圆圆");
        map.put("阿强", "王宝强");
        map.put(null,null);// map的k和v值都可为空

        // 返回 key 对应的 value
        String val = map.get("国民女神"); // 高圆圆
        System.out.println(val);

        // 返回 key 对应的 value，key 不存在，返回默认值
        val = map.getOrDefault("沉鱼","西施");
        System.out.println(val);

        map.put("及时雨","宋公明");
        // key 值一定是唯一的，如果key值一样，那么val会更新
        val = map.get("及时雨"); // 及时雨
        System.out.println(val);

        // 返回所有 key 的不重复集合
        Set<String> stringSet = map.keySet();
        System.out.println(stringSet); // [国民女神, 阿强, 及时雨]

        // 返回所有的 key-value 映射关系  map不能使用迭代器打印
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for(Map.Entry<String,String> entry  : entrySet){
            System.out.println("key:" + entry.getKey() + " \tval:" + entry.getValue());
        }
        System.out.println();
        // 打印顺序，不一定是put的顺序
        System.out.println(map); // {国民女神=高圆圆, 阿强=王宝强, 及时雨=宋公明}

    }
}
