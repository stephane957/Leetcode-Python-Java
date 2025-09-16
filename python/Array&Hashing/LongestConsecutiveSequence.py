"""
128. Longest Consecutive Sequence
Difficulty: Hard
Topics: Array, Hash Table, Union Find
"""
def longestConsecutive(nums: list[int]) -> int:
    nums = set(nums)
    longest = 0
    for num in nums:
        if num - 1 not in nums: 
            # num is the start of a sequence because num-1 does not exist
            next_num = num + 1 # next_num is the next number in a sequence
            while next_num in nums: # if the sequence has a next number
                next_num += 1
            longest = max(longest, next_num - num)
    return longest