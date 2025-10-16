"""
21. Merge Two Sorted Lists
Difficulty: Easy
Topics: LinkedList, Recursion
"""
import ListNode

def mergeTwoLists(List1: ListNode, list2: ListNode) -> ListNode:
    if not list1:
        return list2
    if not list2:
        return list1
    
    cur = dummy = ListNode()

    while list1 and list2:
        if list1.val <= list2.val:
            cur.next = list1
            list1 = list1.next
        else:
            cur.next =list2
            list2 = list2.next
        cur = cur.next
    
    # Process the rest of the remaining list (l1 or l2)
    if list1 or list2:
        cur.next = list1 if list1 else list2

    return dummy.next
