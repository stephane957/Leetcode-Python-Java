"""
15. 3Sum
Difficulty: Medium
Topics: Array, Two Pointers, Sorting
"""
def threeSum(nums: list[int]) -> list[int]:
    N = len(nums)
    res = []
    nums.sort()

    for i in range(N):
        # skip conditions:
        # array is sorted, once we encounter positive numbers, 
        # we stop because the rest of the array is only duplicates
        if nums[i] > 0: 
            break
        
        # if the previous number (nums[i-1]) is the same as the current one (nums[i]), it is a duplicate, so we skip it
        if i != 0 and nums[i] == nums[i-1]:
            continue
        
        # for every i we use the two pointers to find all non-duplicate triplets
        j = i+1
        k = N - 1
        while j < k:
            sum = nums[i] + nums[j] + nums[k]
            if sum < 0:
                j += 1
            elif sum > 0:
                k -= 1
            else:
                triplet = [nums[i], nums[j], nums[k]]
                res.append(triplet)
                j += 1
                k -= 1
                while nums[j] == nums[j-1] and j < k:
                    j += 1
    return res