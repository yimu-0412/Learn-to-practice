import java.util.Arrays;

public class ArrCopy {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] ret = new int[arr.length];
        //第一种
        for(int i =0; i < arr.length;i ++){
            ret[i] = arr[i];
        }
        System.out.println(Arrays.toString(ret));
        //第二种
        int[] ret1 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret1));
        //第三种
        int[] ret2 = Arrays.copyOfRange(arr,2,5);
        System.out.println(Arrays.toString(ret2));
        //第四种：优先使用
        int[] ret3 = new int[arr.length];
        System.arraycopy(arr,0,ret3,4,4);
        System.out.println(Arrays.toString(ret3));
        //第五种:产生当前数组的一个副本
        int[] ret4 = arr.clone();
        System.out.println(Arrays.toString(ret4));

    }
}