package java.Stack;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stores indices of temperatures, maintains decreasing order

        for (int curDay = 0; curDay < n; curDay++) {
            int curTemp = temperatures[curDay];

            // While stack is not empty and current temp > temp at stack's top index
            while (!stack.isEmpty() && curTemp > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                answer[prevDay] = curDay - prevDay; // Calculate the number of days waited

            }
            stack.push(curDay);
        }

        return answer;

    }
}
