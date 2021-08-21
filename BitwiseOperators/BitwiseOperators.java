import org.junit.Test;

/**
 * @author wangyimu
 * @Program Day_20210821
 * @create 2021-08-21-19:11
 */
public class BitwiseOperators {
    @Test
    public void bitwiseUperator(){
       /*
       << ：在一定范围内，每向左移1位，相当于 * 2
       >> :在一定范围内，每向右移1位，相当于 / 2
       */

        int i = 21;
        i = -21;
        System.out.println("i << 2 :" + (i << 2)); // -84
        System.out.println("i << 3 :" + (i << 3)); // -168

        System.out.println("i << 27 :" + (i << 27)); // 1476395008

        int m = 12;
        int n = 5;
        System.out.println("m & n :" + (m & n));
        System.out.println("m | n :" + (m | n));
        System.out.println("m ^ n :" + (m ^ n));
    }
}
