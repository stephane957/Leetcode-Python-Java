"""
739. Daily Temperatures
Difficulty: Medium
Topics: Stack, Array, Monotonic Stack
"""

def dailyTemperatures(temperatures: list[int]) -> list[int]:
    n = len(temperatures)
    answer = [0] * n
    stack = [] # Stores indices of temperatures, maintains decreasing order
    
    for current_day in range(n):
        current_temp = temperatures[current_day]

        # While stack is not empty and current temp > temp at stack's top index
        while stack and temperatures[stack[-1]] < current_temp:
            # Found a warmer day for the day at stack top!
            prev_day = stack.pop()
            answer[prev_day] = current_day - prev_day
            
        # Push current day to stack
        stack.append(current_day)
    
    return answer