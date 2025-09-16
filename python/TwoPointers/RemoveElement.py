"""
27. Remove Element
Difficulty: Easy
Topics: Array, Two Pointers
"""
def removeElement(nums: list[int], val: int) -> int:
    left, right = 0, len(nums)

    for i in range(right):
        if nums[i] != val:
            nums[left] = nums[i]
            left += 1
        
    return left