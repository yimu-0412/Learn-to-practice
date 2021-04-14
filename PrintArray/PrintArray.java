public class PrintArray {
    public static void PrintArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{100, 101, 103, 104, 105};
        int[] arr1 = new int[]{100, 101, 103, 104, 105};
        PrintArr(arr);
        System.out.println();
        for (int a : arr1) {
            System.out.print(a + " ");
        }
    }
}
