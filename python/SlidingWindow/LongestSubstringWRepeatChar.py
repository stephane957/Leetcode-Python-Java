"""
3. Longest Substring Without Repeating Characters
Difficulty: Medium
Topics: Hash Table, String, Sliding Window
"""
from collections import defaultdict

def lengthOfLongestSubstring(s: str) -> int:
    if len(s) == 0:
        return 0
    char_index = defaultdict(int) # Dictionary to store the last index of each character (char, position)
    left = 0
    max_length = 0

    for right in range(len(s)):
        current_char = s[right]

        # If character is already in current window, move left pointer
        if current_char in char_index and char_index[current_char] >= left:
            left = char_index[current_char] + 1

        # Update character's latest index
        char_index[current_char] = right
        # Update max length
        max_length = max(max_length, right - left + 1)

    return max_length
