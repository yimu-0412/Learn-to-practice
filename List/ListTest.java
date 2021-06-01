import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("小白");

        //尾插 e
        list.add("huahua");
        list.add("huahua");
        list.add("huihui");
        list.add("fangfang");
        list.add("huahua");
        list.add("fangfang");
        System.out.println(list);
        System.out.println("======================");

        // 将 e 插入到 index 位置
        list.add(1,"haha");
        System.out.println(list);
        System.out.println("======================");

        //尾插 c 中的元素
        list.addAll(list1);
        System.out.println(list);
        System.out.println("======================");

        //删除 index 位置元素
        list.remove(0);
        System.out.println(list);
        System.out.println("======================");

        //删除遇到的第一个 o
        list.remove("huahua");
        System.out.println(list);
        System.out.println("======================");

        //获取下标 index 位置元素
        String str = list.get(1);
        System.out.println(str);
        System.out.println("======================");

        //将下标 index 位置元素设置为 element
        list.set(0,"heihei");
        System.out.println(list);
        System.out.println("======================");

        //判断 o 是否在线性表中
        boolean flg = list.contains("huahua");
        System.out.println(flg);
        System.out.println("======================");

        //返回第一个 o 所在下标
        int index = list.indexOf("huihui");
        System.out.println(index);
        System.out.println("======================");

        //返回最后一个 o 的下标
        int index1 = list.lastIndexOf("huahua");
        System.out.println(index1);
        System.out.println("======================");

        //截取部分 list
        List<String> list2 = list.subList(2,4);
        System.out.println(list2);
        System.out.println("======================");

        //清空
        list.clear();
    }
}