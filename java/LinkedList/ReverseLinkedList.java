package java.LinkedList;

class ReverseLinkedList {

    /**
     * 206. Reverse Linked List
     * Difficulty: Easy
     * Topics: Linked List, Recursion
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tmp;
        }

        return prev;
    }
}
