"""
Valid Palindrome II
Difficulty: Easy
Topics: Two Pointers, String, Greedy
"""
def validPalindrome(s: str) -> bool:
    # With helper function
    def is_palindrome_range(left: int, right: int) -> bool:
        while left < right:
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True

    left, right = 0, len(s) - 1
    while left < right:
        if s[left] != s[right]:
            # If there's a mismatch, try skipping either character
            # Check if the remaining substring is a palindrome
            return is_palindrome_range(left + 1, right) or is_palindrome_range(left, right - 1)
        left += 1
        right -= 1
    return True

def valid_palindrome_no_helper(s: str) -> bool: # Faster
    left, right = 0, len(s)-1

    while left < right:
        if s[left] != s[right]:
            # If the character to skip is on the left
            # We check if this new substring is a plaindrome
            left_skip = s[left+1:right+1]

            # If the character to skip is on the right
            # We check if this new substring is a palindrome
            right_skip = s[left:right]

            # Palindrome check
            return left_skip == left_skip[::-1] or right_skip == right_skip[::-1]

        left += 1
        right -= 1

    return True