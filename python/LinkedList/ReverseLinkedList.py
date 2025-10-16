"""
206. Reverse Linked List
Difficulty: Easy
Topics: LinkedList, Recursion
"""
import ListNode

def reverseList(head: ListNode) -> ListNode:
    if not head:
        return head
    prev = None
    cur = head

    while cur:
        tmp = cur.next
        cur.next = prev
        prev = cur
        cur = tmp

    return prev