package heapqueue;

/**
 * @author wangyimu
 * @create 2021-07-25-21:48
 */
public class HeapQueueTest {
    public static void main(String[] args) {
        HeapQueue heap = new HeapQueue();
        int[] array = { 27,15,19,18,28,34,65,49,25,37 };
        heap.createHeap(array);
        //heap.shiftdown(array);
        System.out.println();
        heap.pop();
        System.out.println();
    }

}
