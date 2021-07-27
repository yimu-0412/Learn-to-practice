package quicksort;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author wangyimu
 * @create 2021-07-27-20:55
 */
public class QuickSort1 {
    // 挖坑法(若是以左边为基准，首先要从右边找)
    private static int partition(int[] array, int low, int high){
        int tmp = array[low];
        while(low < high){
            if(low < high && array[high] > tmp ){
                high --;
            }
            array[low] = array[high];
            if(low < high && array[low] < tmp){
                low ++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }
    public static void quickSort(int[] array){
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int end = array.length - 1;

        int pivot = partition(array,start,end);
        if(pivot > start + 1){
            stack.push(start);
            stack.push(pivot - 1);
        }
        if(pivot < end -1){
            stack.push(pivot + 1);
            stack.push(end);
        }

        while (! stack.isEmpty()){
            end = stack.pop();
            start = stack.pop();
            pivot = partition(array,start,end);

            // 左边有两个元素及以上
            if(pivot > start + 1){
                stack.push(start);
                stack.push(pivot - 1);
            }
            if(pivot < end -1){
                stack.push(pivot + 1);
                stack.push(end);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7,3,26,86,5,5,4,43,7,8,9,5,4,5,4,32};
        quickSort(arr);
        System.out.print("快速排序：");
        System.out.println(Arrays.toString(arr));
    }
}
