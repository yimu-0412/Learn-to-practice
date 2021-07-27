package mergeSort;

import java.util.Arrays;
import java.util.Random;

/**
 * @author wangyimu
 * @create 2021-07-27-21:50
 */
public class MergeSort {
    public static void mergeSortInternal(int[] array,int low,int high){

        if(low >= high){
            return;
        }
        int mid = (low + high ) / 2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid + 1,high);

        // 合并的过程
        // 面试代码题：合并两个有序的数组
        merge(array,low,mid,high);

    }
    // 合并
    public static void merge(int[] array,int low,int mid,int high){
        int s1 = low;
        int e1 = mid;
        int s2 = mid + 1;
        int e2 = high;

        int[] arr = new int[high - low + 1];
        int k = 0; // 代表arr数组的下标

        while(s1 <= e1 && s2 <= e2){
            if(array[s1] <= array[s2]){
             /*
                arr[k] = array[s1];
                k++;
                s1 ++;
             */
                arr[k ++] = array[s1 ++];
            }else{
                arr[k ++] = array[s2 ++];
            }
        }
        // 有两种情况
        while(s1 <= e1){
            // 说明第2个归并段没有了数据，把第一个归并段剩下的数据全部拷贝过来
            arr[k ++] = array[s1 ++];
        }
        while(s2 <= e2){
            // 说明第1个归并段没有了数据，把第一个归并段剩下的数据全部拷贝过来
            arr[k ++] = array[s2 ++];
        }
        // arr数组当中 存储的是 当前归并好的数据

        for(int i = 0;i < arr.length; i ++){
            array[i + low] = arr [i];
        }

    }

    /*
    * 时间复杂度：O(n * log n)
    * 空间复杂度：O( n )
    * 稳定性：稳定
    * */
    public static void mergeSort(int[] array){
        mergeSortInternal(array,0,array.length - 1);
    }

    public static void main(String[] args) {
        /*int[] array = new int[10000];
        Random random = new Random();

        for(int i = 0;i < array.length;i ++ ){
            array[i] = i;
            array[i] = random.nextInt(10_1000);
        }*/

       int[] arr = {1,4,7,3,26,86,5,5,4,43,7,8,9,5,4,3,5,6,7,5,4,32};
        mergeSort(arr);
        System.out.print("归并排序：");
        System.out.println(Arrays.toString(arr));

    }
}
