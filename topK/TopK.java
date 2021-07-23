package topK;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author wangyimu
 * @create 2021-07-23-22:19
 * 用代码实现TopK问题
 */
public class TopK {

    // 求 数组中前K个最小的值
    public  void topk(int[] arr,int  k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - 01;
            }
        });

        for(int i =0; i < arr.length; i ++){
            if(maxHeap.size() < k){
                maxHeap.add(arr[i]);
            }else{
                int top = maxHeap.peek();
                if(top > arr[i]){
                    maxHeap.poll();
                    maxHeap.offer(arr[i]);
                }
            }
        }
    }

    // 求 数组中前K个最大的值
    public void topk1(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - 01;
            }
        });

        for(int i =0; i < arr.length; i ++){
            if(minHeap.size() < k){
                minHeap.add(arr[i]);
            }else{
                int top = minHeap.peek();
                if(top < arr[i]){
                    minHeap.poll();
                    minHeap.offer(arr[i]);
                }
            }
        }
    }

}
