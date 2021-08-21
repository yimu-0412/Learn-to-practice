import org.junit.Test;

/**
 * @author wangyimu
 * @Program Day_20210821
 * @create 2021-08-21-16:32
 */
public class RelationalOperator {
    @Test
    public void relationalOperator(){
        int i = 10;
        int j = 20;

        System.out.println(i == j); // false
        System.out.println(i != j); // true

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 == b1);//false
        System.out.println(b2 = b1);//true

    }
}
