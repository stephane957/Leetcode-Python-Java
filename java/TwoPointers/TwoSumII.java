package java.TwoPointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    /*
     * 167. Two Sum II - Input Array Is Sorted
     * Difficulty: Easy
     * Topics: Array, Two Pointers, Binary Search, Sorting, Hash Table
     */
    public static int[] twoSumII(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            int complement = target - n;
            if (numMap.containsKey(complement)) {
                int[] res = {numMap.get(complement)+1, i+1};
                return res;
            }
            numMap.put(n,i);
        }
        return new int[0];

    }
}
