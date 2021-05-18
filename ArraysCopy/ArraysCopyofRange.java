
import java.util.Arrays;

public class ArraysCopyofRange{
	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOfRange(arr, 2, 4); 
        System.out.println("newArr2: " + Arrays.toString(newArr));

        arr[0] = 10;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newArr));
    }
}





