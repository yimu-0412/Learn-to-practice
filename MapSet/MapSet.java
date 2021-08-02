package set;

import java.util.*;

/**
 * @author wangyimu
 * @create 2021-07-31-20:03
 */
public class MapSet {
    /*
    *  打印100000以内重复的数据以及出现的次数
    */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i = 0;i < 10_0000;i ++){
            list.add(random.nextInt(1000));
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(Integer key: list){
            if(map.get(key) == null){
                map.put(key,1);
            }else{
                // 说明之前存储过
                int count = map.get(key);
                map.put(key,count + 1);
            }
        }
        for(Map.Entry<Integer,Integer>entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println("重复的数据:" + entry.getKey() + " 出现的次数:" + entry.getValue());
            }
        }
    }
    /*
    * 找到第一次出现重复的数字
    * */
    public static void main2(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i = 0;i < 10_0000;i ++){
            list.add(random.nextInt(1000));
        }

        HashSet<Integer> set = new HashSet<>();
        int size = 0;
        for(int i = 0; i < list.size();i ++){
            if(set.contains(list.get(i))){
                System.out.println(list.get(i));
                break;
            }else{
                set.add(list.get(i));
            }

        }
        System.out.println(list.size());
        System.out.println(set);
    }

    /*
    * 去重法
    */

    public static void main1(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for(int i = 0;i < 10_0000;i ++){
            list.add(random.nextInt(1000));
        }

        HashSet<Integer> set = new HashSet<>();
        int size = 0;
        for(int i = 0; i < list.size();i ++){
            if(set.contains(list.get(i))){
                set.add(list.get(i));
            }
        }
        System.out.println(list.size());
        System.out.println(set);
    }
}
