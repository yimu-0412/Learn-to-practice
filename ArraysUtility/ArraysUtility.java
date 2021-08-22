
import org.junit.Test;
import java.util.Arrays;

/**
 * @author wangyimu
 * @Program Day_20210821
 * @create 2021-08-22-8:36
 */
public class ArraysUtility {
    @Test
    public void isEquals(){
        // 1.boolean equals(int[] a,int[] b):判断两个数组是否相等.(比较内容)
        int[] arr1 = new int[]{1,2,4,6};
        int[] arr2 = new int[]{1,2,3,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
    }
    @Test
    public void arrarToString(){
        //2.String toString(int[] a):输出数组信息。
        int[] arr1 = new int[]{1,2,4,6};
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void arrayFill(){
        // 3.void fill(int[] a,int val):将指定值填充到数组之中。
        // 将原有数值全部替换为插入数值
        int[] arr1 = new int[]{1,2,4,6};
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
    }

    @Test
    public void arraySort(){
        //4.void sort(int[] a):对数组进行排序。
        int[] arr2 = new int[]{1,2,5,4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    @Test
    public void binarySearch(){
        //5.int binarySearch(int[] a,int key) 返回元素的索引值
        int[] arr3 = new int[]{-98,-34,2,34,54,66,79,105,210,333};
        int index = Arrays.binarySearch(arr3,3);
        if(index > 0){
            System.out.println(index);
        }else{
            System.out.println("未找到");
        }
    }

}

