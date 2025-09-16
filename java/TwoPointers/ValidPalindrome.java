package java.TwoPointers;

public class ValidPalindrome {
    private static boolean isPalindromeHelper(char c) {
        return (c >= 'a' && c <= 'z') ||
        (c >= 'A' && c <= 'Z') ||
        (c >= '0' && c <= '9');
    }
    /*
     * 125. Valid Palindrome
     * Difficulty: Easy
     * Topics: Two Pointers, String
     */
    public static boolean isPalindrome(String s) {
        int left = 0; int right = s.length() - 1;

        while (left < right) {
            // whitespaces and other non alphanumeric characters are counted in the string 
            if (!isPalindromeHelper(s.charAt(left))) {
                left++;
            }
            else if (!isPalindromeHelper(s.charAt(right))) {
                right--;
            }
            else if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            else {
                left++;
                right--; 
            }
        }

        return true;

    }
}
