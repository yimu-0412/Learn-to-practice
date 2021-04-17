public class BinarySearch {
    static int count = 0;
    public static int[] makeBigarray(){
        int[] arr = new int[10];
        for(int i = 0;i < 10;i ++){
            arr[i] = i + 1;
        /*    System.out.print(arr[i] + " ");*/
        }
        return arr;
    }
    public static int  binaryArray(int[] arr,int key){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            count++;
            int mid = (right + left) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                System.out.println("找到了，下标为：" + mid);
                return mid;
            }
        }
        System.out.println("不在数组中，找不到");
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = makeBigarray();
        int ret = binaryArray(arr,4);
        System.out.println("ret = "+ ret +";count =" + count);
    }
}
