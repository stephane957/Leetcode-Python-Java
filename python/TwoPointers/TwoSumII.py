"""
167. Two Sum II - Input Array Is Sorted
Difficulty: Medium
Topics: Array, Two Pointers, Binary Search
"""
def twoSumII(numbers: list[int], target: int) -> list[int]:
    numMap = {}
    for i, n in enumerate(numbers): 
        complement = target - n
        if complement in numMap:
            return [numMap[complement]+1, i+1]
    numMap[n] = i