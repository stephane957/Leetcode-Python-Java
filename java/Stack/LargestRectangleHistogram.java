package java.Stack;
import java.util.Stack;


public class LargestRectangleHistogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i <= n; i++) {
            // For i == n, we use a height of 0 to force remaining calculations
            int currentHeight = (i == n) ? 0 : heights[i];
            
            // While current bar is shorter than the bar at stack top
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                // Pop the bar from stack and calculate area with that bar as height
                int height = heights[stack.pop()];
                
                // Width extends from the previous smaller bar to current bar
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        
        return maxArea;
    }
}
