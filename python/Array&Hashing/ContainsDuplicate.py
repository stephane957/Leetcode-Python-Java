""" 
217. Contains Duplicate
Difficulty: Easy
Topics: Array, Hash Table, Sorting
"""
def containsDuplicate(nums: list[int]) -> bool:
    uniques = set()
    for num in nums:
        if num in uniques:
            return True
        uniques.add(num)
    return False