package heapsort;

/**
 * @author wangyimu
 * @create 2021-07-26-19:29
 */
public class HeapSortTest {
    public static void main(String[] args) {
        HeapSort heap =new HeapSort();
        int[] arr = { 27,15,19,18,28,34,65,49,25,37 };
        heap.createHeap(arr);
        heap.heapSort();

    }

}
