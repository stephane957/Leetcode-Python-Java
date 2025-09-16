"""
11. Container With Most Water
Difficulty: Medium
Topics: Array, Two Pointers, Greedy
"""
def maxArea(height: list[int]) -> int:
    n = len(height)
    max_area = 0
    left, right = 0, n-1  # two pointers
    
    while left < right: 
        # Area(rectangle) = height * width
        # Height
        r_height = min(height[left], height[right])
        # Width
        r_width = right - left
        # Max Area
        max_area = max(max_area, r_height * r_width)

        # We move the pointer with the lower value (1st left pointer < 1st right pointer in the example)
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1

    return max_area