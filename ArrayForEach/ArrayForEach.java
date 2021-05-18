import java.util.Arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        int [][] arr1 = new int[][]{{1,2,3},{3,4},{6,54,3}};
        System.out.println(Arrays.deepToString(arr1));
        System.out.println();
        System.out.println("==========for each===========");
        for(int[] arr: arr1){
            for(int x :arr){
                System.out.print(x +" ");
            }
            System.out.println();
        }

    }
}
