package java.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    /*
     * 18. 4Sum
     * Difficulty: Medium
     * Topics: Array, Hash Table, Two Pointers, Sorting
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int N = nums.length;

        for (int i = 0; i < N-3; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            for (int j = i+1; j < N-2; j++) {
                if (j > i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int left = j+1; int right = N-1;
                while (left < right) {
                    int total = nums[i] + nums[j] + nums[left] + nums[right];
                    if (total == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]){
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]){
                            right--;
                        }
                    } else if (total > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }

        }

        return res;
    }
}
