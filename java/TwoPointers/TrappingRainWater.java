package java.TwoPointers;

public class TrappingRainWater {
    /*
     * 42. Trapping Rain Water
     * Difficulty: Hard
     * Topics: Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
     */
    public static int trap(int[] height) {
        if (height == null) {
            return 0;
        }
        int n = height.length;
        int left = 0; int leftMax = height[0];
        int right = n-1; int rightMax = height[n-1];
        int water = 0;

        while (left < right) {
            
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
            }
        }

        return water;
        
    }    
}
