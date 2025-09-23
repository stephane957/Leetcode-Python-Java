package java.TwoPointers;

public class ValidPalindromeII {
    /*
     * 680. Valid Palindrome II
     * Difficulty: Easy
     * Topics: Two Pointers, String, Greedy
     */
    public static boolean validPalindrome(String s) {
        
        // With helper function
        int left = 0; int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return validPalindromeHelper(s, left + 1, right, true) || validPalindromeHelper(s, left, right - 1, true);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean validPalindromeHelper(String s, int left, int right, boolean deleted) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (deleted) {
                    return false;
                }
                return validPalindromeHelper(s, left + 1, right, true) || validPalindromeHelper(s, left, right - 1, true);
            }
            left++;
            right--;
        }
        return true;
    }

}