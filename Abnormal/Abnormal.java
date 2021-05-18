/*
 *数组中常见的异常：
 * 1.数组角标越界异常：ArrayIndexOutofBoundsExcetion
 * 2.空指针异常：NullPointerExcetion
 * */

public class Abnormal {
    public static void main1(String[] args) {
        //1.数组角标越界异常：ArrayIndexOutofBoundsExcetion
        int[] arr = new int[]{1,2,4,5,3};
        for(int i = 0;i <= arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
    public static void main(String[] args) {

        //2.空指针异常：NullPointerExcetion
        //2.1情况一：
        int[] arr1 = new int[]{1,2,3};
        arr1 = null;
        System.out.println(arr1[0]);
        //2.2情况二：
         int[][] arr2 = new int[4][];
        System.out.println(arr2[0][0]);
        //2.3情况三：
        String[] arr3 = new String[]{"AA","BB","CC"};
        arr3[0] = null;
        System.out.println(arr3[0].toString());
    }
}
