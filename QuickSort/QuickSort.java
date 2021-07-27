package quicksort;

import java.util.Arrays;

/**
 * @author wangyimu
 * @create 2021-07-27-20:49
 * 递归方法快速排序
 */
public class QuickSort {
    /*
     *  快排的优化：针对有序数组的排序，降低最坏的时间复杂度（O(n^2)）
     *     1.随机选取基准法: 就是随机选取当前下标和low下标交换
     *     2.三数取中：low下标是low 、high、mid这三个数据的中间值就好
     *           array[mid] <= array[low <= array[high]
     *
     * */
    public static void swap(int[] array,int i ,int j){
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void selectPivotMedianOfThree(int[] array,int start,int end,int mid){
        // array[mid] <= array[low <= array[high]
        if(array[start] < array[mid]){
            swap(array,start,mid);
        }
        if(array[start] >  array[end] ){
            swap(array,start,end);
        }
    }


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

    /*  Hoare 法
            注意：（先走左边，相遇的地方会是比tmp大的数据，
            如果交换，就会出现最大的数据在左边，出现错误）
     */
    public static  void insertSort(int[] array,int start, int end){
        for(int i = start + 1; i <= end; i ++){
            int temp = array[i];
            int j = i -1;
            for(; j >= start; j --){
                if(array[j]> temp){
                    array[j + 1] = array[j];
                }else{
                    break;
                }
            }
            array[j + 1] = temp;
        }
    }

    /*
     *  快速排序：
     *      时间复杂度：
     *          最好： O(n * log(n)) // 均匀的分割下
     *          最坏： O(n^2) // 数据有序的情况下
     *      空间复杂度：
     *           最好： O(n * log(n))
     *           最坏： O(n)
     *      稳定性：不稳定的排序
     * */
    public static void quickSort(int[] array,int start, int end){
        if(start >= end){
            return;
        }
        // 判断两个下标之间的数据个数
        if (end - start + 1 <= 50){
            insertSort(array,start,end);
            return;// 这里一定要return
        }
        int mid = ( start + end )/ 2;
        selectPivotMedianOfThree(array,start,end,mid);

        int pivot = partition(array,start,end);

        quickSort(array,start,pivot - 1);
        quickSort(array,pivot + 1,end);

    }
    private static void quickSortInternal(int[] array ){
        quickSort(array,0,array.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7,3,26,86,5,5,4,43,7,8,9,5,4,3,5,6,7,5,4,32};
        quickSortInternal(arr);
        System.out.print("快速排序：");
        System.out.println(Arrays.toString(arr));
    }
}
