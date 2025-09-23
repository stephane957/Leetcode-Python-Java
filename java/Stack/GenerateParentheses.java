package java.Stack;

import java.util.List;
import java.util.ArrayList;

public class GenerateParentheses {
    /*
     * 22. Generate Parentheses
     * Difficulty: Medium
     * Topics: Backtracking, Stack, String, Dynamic Programming
     */

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private static void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }
        if (open < max)
            backtrack(ans, cur + "(", open + 1, close, max);
        if (close < open)
            backtrack(ans, cur + ")", open, close + 1, max);
    }

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();
        System.out.println(solution.generateParenthesis(3)); // Output: ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println(solution.generateParenthesis(1)); // Output: ["()"]
    }
}
