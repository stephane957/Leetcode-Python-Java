"""
20. Valid Parentheses
Difficulty: Easy
Topics: Stack, String
"""
def isValid(s: str) -> bool:
    stack = []
    mapping = {')': '(', '}': '{', ']': '['}

    for char in s:
        if char in mapping:
            if stack and stack[-1] == mapping[char]:
                stack.pop()
            else:
                return False
        else:
            stack.append(char)

    return not stack