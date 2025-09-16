"""
125. Valid Palindrome
Difficulty: Easy
Topics: Two Pointers, String
"""
def isPalindrome(s: str) -> bool:
    left, right = 0, len(s) - 1

    while left < right:
        # whitespaces and other non alphanumeric characters are counted in the string 
        if not s[left].isalnum():
            left += 1
        elif not s[right].isalnum():
            right -= 1
        elif s[left].lower() != s[right].lower():
            return False
        else: 
            left += 1
            right -= 1

    return True