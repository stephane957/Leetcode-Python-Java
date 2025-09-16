from collections import Counter
import heapq

"""
347. Top K Frequent Elements
Difficulty: Medium
Topics: Array, Hash Table, Divide and Conquer, Sorting, Heap (Priority Queue), Bucket Sort
"""
def topKFrequent(nums: list[int], k: int) -> list[int]:
    freq = Counter(nums)
    # Use Counter to count the frequency of each number into hashmap
    # Make priority queue
    pq = [(-freq, num) for num, freq in freq.items()]
    heapq.heapify(pq)

    # Priority queue on the freq.
    res = []
    for _ in range(k):
        freq, word = heapq.heappop(pq)
        res.append(word)

    return res