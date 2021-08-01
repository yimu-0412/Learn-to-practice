package topKFrequent;

import java.util.*;

/**
 * @author wangyimu
 * @create 2021-08-01-9:57
 * 前K个高频单词：
 * 		给一非空的单词列表，返回前 k 个出现次数最多的单词。
		返回的答案应该按单词出现频率由高到低排序。如果不同的单
		词有相同出现频率，按字母顺序排序。
 */
public class TopKFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> ret =new ArrayList<>();
        if(words == null){
            return null;
        }
        // 1.统计每个单词出现的次数，以map的形式进行存储
        HashMap<String,Integer> map = new HashMap<>();
        for(String str : words){
            if(map.get(str) == null){
                map.put(str,1);
            }else{
                int count = map.get(str);
                map.put(str,count + 1);
            }
        }

        // 2.建立一个小堆，堆中每个元素都是map的Entry
        PriorityQueue<Map.Entry<String,Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String,Integer>>() {
            // o1是插入的元素，o1 >o2 直接放到了数组的后面
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(o1.getValue().compareTo(o2.getValue()) == 0){
                    return o2.getKey().compareTo(o1.getKey());
                }
                return o1.getValue() - o2.getValue();
            }
        });
        // 3.遍历map里面的数据，先将前k个建成小堆，然后从第K+1个开始和堆顶元素比较
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if(minHeap.size() < k){
                minHeap.offer(entry);
            }else{
                Map.Entry<String,Integer> top = minHeap.peek();
                // 1.频率相同，判断key，字母小的入堆
                if(top != null){
                    if(top.getValue().compareTo(entry.getValue()) ==0 ){
                        if(top.getKey().compareTo(entry.getKey()) > 0){
                            minHeap.poll();
                            minHeap.offer(entry);
                        }
                        // 2.频率小的入堆
                    }else{
                        if(top.getValue() < entry.getValue()){
                            minHeap.poll();
                            minHeap.offer(entry);
                        }
                    }
                }

            }
        }
        for(int i = 0;i < k;i ++){
            Map.Entry<String,Integer> top = minHeap.poll();
            if(top != null){
                String key = top.getKey();
                ret.add(key);
            }
        }
        Collections.reverse(ret);
        return ret;
    }
}
