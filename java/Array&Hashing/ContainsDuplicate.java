import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate {
    /*
     * 217. Contains Duplicate
     * Difficulty: Easy
     * Topics: Array, Hash Table, Sorting
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            }
            numSet.add(num);
        }
        return false;
    }    
}

