package comparatorTest;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author wangyimu
 * @Program Day_20210820
 * @create 2021-08-20-23:41
 */
public class ComparatorTest1 {
    public static void main(String[] args) {
        String[] arr = new String[]{"AA","CC","KK","MM","GG","JJ","DD"};
        Arrays.sort(arr, new Comparator() {

            // 按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    String s1 = (String) o1;
                    String s2 = (String) o2;
                    return s1.compareTo(s2);
                }
               //return 0;
                throw new RuntimeException("输入数据类型不一致!");
            }
        });
        System.out.println(Arrays.toString(arr));


    }
}
