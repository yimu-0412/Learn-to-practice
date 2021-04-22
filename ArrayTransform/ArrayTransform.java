

import java.util.Arrays;

public class ArrayTransform {
    public static void transform(int[] array1,int[] array2){
        //将arr1和arr2的数组进行交换
        for(int i = 0;i < array1.length;i ++){
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,9};
        System.out.println("交换前：");
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println("arr2:" +Arrays.toString(arr2));

        transform(arr1,arr2);
        System.out.println("交换后：");
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println("arr2:" +Arrays.toString(arr2));
    }

}