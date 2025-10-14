
"""
84. Largest Rectangle in Histogram
Difficulty: Hard
Topics: Array, Stack, Monotonic Stack
"""

def largestRectangleArea(heights: list[int]) -> int:
    stack = []  # Stores pairs: (index, height)
    max_area = 0
    
    # Iterate through all bars
    for i, h in enumerate(heights):
        start = i
        # While current bar is shorter than the bar at stack top
        while stack and stack[-1][1] > h:
            # Pop the taller bar and calculate area
            index, height = stack.pop()
            # Width extends from popped index to current index
            max_area = max(max_area, height * (i - index))
            # Current bar can extend backward to the popped bar's index
            start = index
        stack.append((start, h))
    
    # Process remaining bars in stack
    # These bars can extend to the end of the histogram
    for i, h in stack:
        max_area = max(max_area, h * (len(heights) - i))
    
    return max_area