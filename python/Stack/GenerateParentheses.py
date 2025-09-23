"""
22. Generate Parentheses
Difficulty: Medium
Topics: Backtracking, Stack, String, Dynamic Programming
"""
from typing import List

def generateParenthesis(n: int) -> List[str]:
    def backtrack(current, open_count, close_count):
        # Base case: we've used all n pairs and current is valid
        if len(current) == 2*n:
            res.append(current)
            return 
        # Recursive case: 
        if open_count < n: # Constraint check: can't use more than n opening parenthese
            # Choice 1: Add an opening parenthese if we haven't used all n
            backtrack(current+'(', open_count+1, close_count)
        
        if close_count < open_count: # Constraint check: can't close a parenthese that wasn't opened
            # Choice 2: Add closing parenthesis if it won't make the string invalid
            backtrack(current+')', open_count, close_count+1)

    res = []
    backtrack("(", 1, 0)

    return res
