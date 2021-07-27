package mergeSort;

import java.util.Arrays;

/**
 * @author wangyimu
 * @create 2021-07-27-23:20
 */
public class MergeSort1 {
    /*
    * 非递归实现归并排序
    */
    public static void merge(int[] array,int gap){
        int[] arr = new int[array.length];
        int k =0;

        int s1 = 0;
        int e1 = s1 + gap -1;
        int s2 = e1 + 1;
        int e2 = s2 + gap - 1 >= array.length? array.length - 1:s2 + gap - 1;

        // 保证有两个归并段
        while(s2 < array.length){
            while(s1 <= e1 && s2 <= e2){
                if(array[s1] <= array[s2]){
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

            // 一组完了
            s1 = e2 + 1;
            e1 = s1 + gap -1;
            s2 = e1 + 1;
            e2 = s2 + gap - 1 >= array.length? array.length - 1:s2 + gap - 1;
        }

        // e2 > array.length
        while(s1 <= arr.length - 1){
            arr[k ++] = array[s1 ++];
        }

        for(int i = 0;i < arr.length; i ++){
            array[i] = arr [i];
        }

    }
    public static void mergeSort(int[] array){
        for(int i = 1;i < array.length; i *= 2){
            merge(array,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,7,3,26,86,5,5,4,43,7,8,9,5,4,3,5,6,7,5,4,32};
        mergeSort(arr);
        System.out.print("归并排序：");
        System.out.println(Arrays.toString(arr));
    }
}
