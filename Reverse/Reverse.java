import java.util.Arrays;

public class Reverse {
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length-1;
        while(left < right){
            if(array[left] < array[right]){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
                left ++;
                right --;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}



