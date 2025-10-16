"""
141. LinkedList Cycle
Difficulty: Easy
Topics: LinkedList, HashTable, Two Pointers
"""
import ListNode

def hasCycle(head: ListNode) -> bool:
    # Fast and slow pointer
    if not head:
        return False
    if not head.next:
        return False

    fast = head
    slow = head

    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return True
    
    return False