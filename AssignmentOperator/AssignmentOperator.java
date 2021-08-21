import org.junit.Test;

/**
 * @author wangyimu
 * @Program Day_20210821
 * @create 2021-08-21-16:10
 */
public class AssignmentOperator {
    @Test
    public void assignmentOperator(){
        int i1,j1;

        // 连续赋值
        i1 = j1 = 10;

        // ******************
        int i3 = 10,j3 = 10;

        // += -=
        int num = 10;
        num += 2;// num = num + 2;
        System.out.println("num = " + num); // num = 12
        num -= 4; // num = num - 4;
        System.out.println("num = " + num); // num = 8


        // *= /=
        int num1 = 12;
        num1 *= 2; // num1 = num1 * 2;
        System.out.println("num1 = " + num1); // num1 = 24
        num1 /= 3; // num1 = num1 / 3;
        System.out.println("num1 = " + num1); // num1 = 8

        //  %=
        int num2 = 20;
        num2 %= 6; // num2 = num2 % 6;
        System.out.println("num2 = " + num2); // 2

        // 注意数据类型的转换
        short s1 = 2;
        s1 = (short) (s1 + 2);  // s1 = s1 + 2; 编译错误
        System.out.println(s1);
    }
}
