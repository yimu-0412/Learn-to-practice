public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,34,65,67,69,12};
        int ret1 = util.getMax(arr);
        System.out.println("最大值：" + ret1);
        System.out.println("=======================");
        int ret2 = util.getMin(arr);
        System.out.println("最小值： "+ ret2);
        System.out.println("=======================");
        int ret3 = util.getSum(arr);
        System.out.println("数组和：" + ret3);
        System.out.println("=======================");
        double ret4 = util.getAverage(arr);
        System.out.println("平均值为： " + ret4);
        System.out.println("=======================");
        int[] arr1 = util.copy(arr);
        util.print(arr1);
        System.out.println("=======================");
        util.reverse(arr);
        util.print(arr);
        System.out.println("=======================");
        util.sort(arr);
        util.print(arr);
        System.out.println("=======================");
        int ret5 = util.getIndex(arr,12);
        System.out.println(ret5);

    }
}
