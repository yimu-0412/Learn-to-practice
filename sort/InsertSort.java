package sort;

import java.util.Arrays;

/**
 * @author wangyimu
 * @create 2021-07-24-8:08
 * 一个稳定的排序可以实现为不稳定的排序，但是一个不稳定的排序不可以实现为稳定的排序
 */
public class InsertSort {

    /*
    * 直接插入排序:稳定排序
    * 时间复杂度：
    *     最好：O(n) 有序时
    *     最坏：O(n^2)
    *     结论：当一组数据，数据量不大，且趋近于有序，此时用插入排序
    * 空间复杂度：O(1)
    */
    public static  void insertSort(int[] array){
        for(int i =1; i < array.length; i ++){
            int temp = array[i];
            int j = i -1;
            for(; j >= 0; j --){
                if(array[j]> temp){
                    array[j + 1] = array[j];
                }else{
                    break;
                }
            }
            array[j + 1] = temp;
        }
    }


    /* *
     *  希尔排序：对直接插入排序的优化
     *     1.分不同的组，进行预排序使数据逐渐有序(gap 大->小 )
     *     2.然后进行整体插入排序
     *  时间复杂度：
     *     最好：O(n) 有序时
     *     最坏：O(n^1.3)~O(n^1.5)
     *     结论：当一组数据，数据量不大，且趋近于有序，此时用插入排序
     *  空间复杂度：O(1)
     *  稳定性：不稳定的排序
     *      技巧：如果在比较的过程中，没有发生跳跃式的交换，那么就是稳定的
     *
     *  array：需要排序的数组
     *  gap：每组的间隔 ==》 组数
     * */
    public static void shell(int[] array,int gap){
        for(int i = gap;i < array.length;i ++){
            int temp = array[i];
            int j = i - gap;
            for(;j > 0;j ++){
                if(array[j] > temp){
                    array[j + gap] = array[j];
                }else{
                    break;
                }
            }
            array[j + gap] =  temp;
        }
    }

    public static void shellSort(int[] array){
        // 处理 gap
        int gap = array.length;
        while(gap >1){
            // 加1是为了保证最后一次是1
            gap = gap / 5 + 1; // gap /= 2;
            shell(array,gap);
        }
    }
    /*
    *   选择排序:每一次从无序区间选出最大（或最小）的一个元素，
    *           存放在无序区间的最后（或最前），直到全部待排序的数据元素排完
    *       时间复杂度：
    *           最好：O(n^2)
    *           最坏：O(n^2)
    *       空间复杂度：O(1)
    *       稳定性：不稳定的排序
    * */
    public static void selectSort(int[] array){
        for(int i = 0; i < array.length;i ++ ){
            for(int j = i + 1; j < array.length; j ++){
                if(array[j] < array[i] ){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void siftDown(int[] array, int root, int len) {
        int parent = root;
        int child = 2 * parent + 1;

        while(child < len ){
            // 判断是否有右孩子节点
            if(child + 1 < len && array[child] < array[child + 1] ){
                child ++;
            }
            // child 下标就是左右孩纸节点最大值的下标
            if(array[child] > array[parent]){
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            }else{
                break;
            }
        }
    }

    public static void creatHeap(int[] array){
        // 从小到大排序==》 大根堆
        for(int i = (array.length-1-1)/2; i >= 0; i --){
            siftDown(array,i,array.length);
        }

    }

    /*
     *  堆排序：
     *      时间复杂度：O(n * log(n))
     *      空间复杂度：O(1)
     *      稳定性：不稳定的排序
     * */
    public static void heapSort(int[] array){
        creatHeap(array);
        int end = array.length - 1;
        while(end > 0){
            int tmp = array[end];
            array[end] = array[0];
            array[0] = tmp;
            siftDown(array,0,end);
            end --;
        }

    }

    /*
     *  冒泡排序：
     *      时间复杂度：最好最坏都是O(n^2),但是如果优化了，有序的时候就是O（n）
     *      空间复杂度：O(1)
     *  稳定性：稳定的排序( 冒泡 直接插入)
     * */
    public static void bubbleSort(int[] array){
        for(int i =0;i < array.length -1; i ++){
            boolean flag = false;
            for(int j = 0;j < array.length - i -1; j ++){
                if(array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
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
     *  稳定性：不稳定的排序
     * */

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
    public static void quickSort(int[] array,int start, int end){
        if(start >= end){
            return;
        }

        int pivot = partition(array,start,end);

        quickSort(array,start,pivot - 1);
        quickSort(array,pivot + 1,end);

    }
    private static void quickSortInternal(int[] array ){
        quickSort(array,0,array.length - 1);
      }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,7,3,2,4,5,67,8};
        insertSort(arr);
        System.out.print("插入排序：");
        System.out.println(Arrays.toString(arr));
        System.out.println("***********************************");
        shellSort(arr);
        System.out.print("希尔排序：");
        System.out.println(Arrays.toString(arr));
        System.out.println("***********************************");
        selectSort(arr);
        System.out.print("选择排序：");
        System.out.println(Arrays.toString(arr));
        System.out.println("***********************************");
        heapSort(arr);
        System.out.print("堆排序：");
        System.out.println(Arrays.toString(arr));
        System.out.println("***********************************");
        bubbleSort(arr);
        System.out.print("冒泡排序：");
        System.out.println(Arrays.toString(arr));
        System.out.println("***********************************");
        partition(arr,1,arr.length - 1);
        System.out.print("快速排序：");
        System.out.println(Arrays.toString(arr));
    }
}
