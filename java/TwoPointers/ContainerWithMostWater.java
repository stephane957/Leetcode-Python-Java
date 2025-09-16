package java.TwoPointers;

public class ContainerWithMostWater {
    /*
     * 11. Container With Most Water
     * Difficulty: Medium
     * Topics: Array, Two Pointers, Greedy
     */
    public static int maxArea(int[] height) {
        int N = height.length;
        int maxArea = 0;
        int left = 0; int right = N-1;

        while (left < right) {
            int vertical = Math.min(height[left], height[right]);
            int horizontal = right - left;
            maxArea = Math.max(maxArea, vertical * horizontal);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
