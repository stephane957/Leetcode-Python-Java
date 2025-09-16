""" 
1. Two Sum
Difficulty: Easy
Topics: Array, Hash Table
"""
def twoSum(nums, target):
  numMap = {}
  for i, n in enumerate(nums): 
    complement = target - n
    if complement in numMap:
      return [numMap[complement], i]
    numMap[n] = i
# Without using a dictionary
def twoSum(nums, target):
    nums = sorted(enumerate(nums), key=lambda x: x[1])
    left, right = 0, len(nums) - 1
    while left < right:
        if nums[left][1] + nums[right][1] == target:
            return [nums[left][0], nums[right][0]]
        elif nums[left][1] + nums[right][1] < target:
            left += 1
        else:
            right -= 1