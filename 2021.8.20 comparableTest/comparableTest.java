package comparableTest;

import java.util.Arrays;

/**
 * @author wangyimu
 * @Program Day_20210820
 * @create 2021-08-20-23:05
 */
public class comparableTest {
    public static void main(String[] args) {

        Goods[] arr = new Goods[5];
        arr[0] = new Goods("lenovoMouse",34);
        arr[1] = new Goods("dellMouse",43);
        arr[2] = new Goods("xiaomiMouse",12);
        arr[3] = new Goods("huaweiMouse",65);
        arr[4] = new Goods("microsoftMouse",43);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
