"""
42. Trapping Rain Water
Difficulty: Hard
Topics: Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
"""
def trap(height: list[int]) -> int:
    if not height:
        return 0
    n = len(height)
    left, left_max = 0, height[0]
    right = n-1
    right_max = height[n-1]
    water = 0

    while left < right:

        if left_max < right_max:
            left += 1
            left_max = max(left_max, height[left])
            water += left_max - height[left]

        else:
            right -= 1
            right_max = max(right_max, height[right])
            water += right_max - height[right]
            
    return water