from collections import defaultdict

"""
49. Group Anagrams
Difficulty: Medium
Topics: String, Hash Table
"""
def groupAnagrams(strs: list[str]) -> list[list[str]]:
    letter_count = defaultdict(list)
    for word in strs:
        key = "".join(sorted(word))
        letter_count[key].append(word)
    return list(letter_count.values())