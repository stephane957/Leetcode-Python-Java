package java.TwoPointers;

public class RemoveElement {

    /*
     * 27. Remove Element
     * Difficulty: Easy
     * Topics: Array, Two Pointers
     */
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;  
    }
}
