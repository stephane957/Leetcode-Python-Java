package java.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWRepeatChar {
    /*
     * 3. Longest Substring Without Repeating Characters
     * Difficulty: Medium
     * Topics: Hash Table, String, Sliding Window
     */
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        
        Map<Character, Integer> charIndex = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If character is already in current window, move left pointer
            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= left) {
                left = charIndex.get(currentChar) + 1;
            }
            
            // Update character's latest index
            charIndex.put(currentChar, right);
            
            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWRepeatChar solution = new LongestSubstringWRepeatChar();
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb")); // Output: 3
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));    // Output: 1
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));   // Output: 3 
    }
}
