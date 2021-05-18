
public class TestDemo {
    public static double Avg(int[] array){
        int sum = 0;
        for(int i = 0;i < array.length;i ++){
            sum += array[i];
        }
        return (double) sum / array.length;
    }
    public static void main1(String[] args) {
        int[] array ={1,2,3,4,5,6};
        System.out.println(Avg(array));;
    }

    public static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
        public static void main2(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(Sum(array));
        }

    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main3(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    public static void main4(String[] args) {
        int[] array =new int[100];
        print(array);
    }

    public static void  transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
            System.out.print( arr[i] + " " );
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        transform(array);
    }
}