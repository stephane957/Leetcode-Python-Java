import java.util.Arrays;

public class ProductExceptSelf {
    /*
     * 238. Product of Array Except Self
     * Difficulty: Medium
     * Topics: Array, Prefix Sum, Suffix Sum
     */
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        int cur = 1;

        for (int i = 0; i < n; i++) {
            res[i] *= cur;
            cur *= nums[i];
        }

        cur = 1;
        for (int j = n-1; j >= 0; j--) {
            res[j] *= cur;
            cur *= nums[j];
        }

        return res;     
    }
}
