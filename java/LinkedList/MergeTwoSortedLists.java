package java.LinkedList;

public class MergeTwoSortedLists {
    /**
     * 21. Merge Two Sorted Lists
     * Difficulty: Easy
     * Topics: LinkedList, Recursion
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode falseHead = new ListNode(-1);
        ListNode result = falseHead;
        
        while (list1 != null && list2 != null) {
            
            if(list1.val > list2.val) {
                result.next  = list2;
                list2 = list2.next;
            } else {
                result.next = list1;
                list1 = list1.next;
            }
            
            result = result.next;
            
        }
        
        if (list1 == null) {
            result.next = list2;
        } else {
            result.next = list1;
        }
        
        return falseHead.next;
        
    }
}
