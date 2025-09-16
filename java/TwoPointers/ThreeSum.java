package java.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    /*
     * 15. 3Sum
     * Difficulty: Medium
     * Topics: Array, Two Pointers, Sorting
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        int N = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < N; i++) {
            // skip conditions:
            // array is sorted, once we encounter positive numbers, 
            // we stop because the rest of the array is only duplicates
            if (nums[i] > 0) {
                break;
            }

            // if the previous number (nums[i-1]) is the same as the current one (nums[i]), it is a duplicate, so we skip it
            if (i != 0 && nums[i-1] == nums[i]) {
                continue;
            }

            // for every i we use the two pointers to find all non-duplicate triplets
            int j = i+1; int k = N - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0)    j++;
                else if (sum > 0)   k--;
                else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (nums[j-1] == nums[j] && j < k) {
                        j++;
                    }
                }
            }
        }

        return res;
    }    
}
