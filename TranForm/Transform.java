import java.util.Arrays;

public class Transform {
    static int count = 0;
    public static  void transform(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            // 该循环结束，left就指向一个奇数
            while(left < right && arr[left] % 2 == 0){
                left ++;
            }
            //该循环结束，left就指向一个偶数
            while(left < right && arr[right] % 2 == 1){
                right --;
            }
            //交换两个元素的位置
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            // 交换次数
            count ++;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        transform(array);
        System.out.println(Arrays.toString(array));
        System.out.println("count = " + count);
    }
}