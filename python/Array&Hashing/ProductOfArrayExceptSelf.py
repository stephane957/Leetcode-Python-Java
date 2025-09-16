"""
238. Product of Array Except Self
Difficulty: Medium  
Topics: Array, Prefix Sum
"""
def productExceptSelf(nums: list[int]):
    n = len(nums)
    res = [1] * n

    prefix, suffix = [], []
    prefix[0], suffix[n-1] = 1,1

    for i in range(n):
        prefix = prefix[n-1] * nums[n-1]
    for i in range(n-2, 0, -1):
        suffix[i] = suffix[i+1] * nums[i+1]
    
    for i in range(n):
        res[i] = prefix[i] * suffix[i]
    
    return res
# Optimized Solution in-place
def productExceptSelf(nums: list[int]) -> list[int]:
    n = len(nums)
    prefix_product = 1
    postfix_product = 1
    result = [0]*n
    for i in range(n):
        result[i] = prefix_product
        prefix_product *= nums[i]
    for i in range(n-1,-1,-1):
        result[i] *= postfix_product
        postfix_product *= nums[i]
    return result 