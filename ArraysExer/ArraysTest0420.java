
/*
* java.util.Arrays;操作数据的工具类，里面定义了很多数组的方法
*/
import java.util.Arrays;

public class ArraysTest0420 {
    public static void main(String[] args) {
        //1.boolean equals(int[] a,int[] b):判断两个数组是否相等
        int[] arr1 = new int[]{1,3,45,6,6,6,7};
        int[] arr2 = new int[]{1,3,45,6,6,6,7};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
        //2.String toString(int[] a)
        System.out.println(Arrays.toString(arr1));
        //3.void fill(int[] a,int val)
        Arrays.fill(arr1, 20);
        System.out.println(Arrays.toString(arr1));
        //4.void sort(int[] a)
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        //5.int binarySearch(int[] a,int key)
        int ret = Arrays.binarySearch(arr2,45);
        System.out.println(ret);
    }
}