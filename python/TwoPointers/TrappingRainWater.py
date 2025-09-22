"""
42. Trapping Rain Water
Difficulty: Hard
Topics: Array, Two Pointers, Dynamic Programming, Stack, Monotonic Stack
"""
def trap(height: list[int]) -> int:
        if not height:
            return 0

        left, right = 0, len(height)-1
        left_max, right_max = height[left], height[right]
        total_water = 0

        while left < right:
            # The water level is constrained by the smaller of the two maximums.
            if left_max <= right_max:
                # We shift the left pointer
                left += 1
            # Update left_max before calculating water to ensure it's the max to the left of the current bar.
                left_max = max(left_max, height[left])
                total_water += left_max - height[left]
            else:
                # We shift the right pointer
                right -= 1
            # Update right_max before calculating water to ensure it's the max to the right of the current bar.
                right_max = max(right_max, height[right])
                total_water += right_max - height[right]

        return total_water