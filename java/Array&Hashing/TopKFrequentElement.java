import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;

public class TopKFrequentElement {
    /*
     * 347. Top K Frequent Elements
     * Difficulty: Medium
     * Topics: Array, Hash Table, Heap
     */
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int n:nums){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            maxHeap.offer(entry);
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = Objects.requireNonNull(maxHeap.poll()).getKey();
        }

        return res;
    }
}
