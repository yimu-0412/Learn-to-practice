/*
* 数组排序(冒泡排序):给定一个数组, 让数组升序 (降序) 排序.
*/
import java.util.Arrays;
public class BubbleSort {
    public static void  bubbleSort(int[] array){
        boolean flg = false;
        for (int i = 0;i < array.length-1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    flg = true;
                }
            }
            if (flg == false) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,99,4,44,5,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}