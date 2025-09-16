from collections import Counter

"""
242. Valid Anagram
Difficulty: Easy
Topics: String, Hash Table, Sorting
"""
def isAnagram(s: str, t: str) -> bool:
    if len(s) != len(t): return False
    return Counter(s) == Counter(t)
def isAnagram(s, t):
  if len(s) != len(t):
    return False