import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    /*
     * 128. Longest Consecutive Sequence
     * Difficulty: Medium
     * Topics: Array, Hash Table, Union Find
     */
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int best = 0;
        for (int num : nums) {
            set.add(num);
        }

        for (int n : set) {
            if (!set.contains(n-1)) { // only check or one direction
                int next = n + 1;
                while (set.contains(next)) {
                    next++;
                }
                best = Math.max(best, next - n);
            }

        }
        return best;
    }
}
