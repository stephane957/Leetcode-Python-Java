package java.LinkedList;
import java.util.HashMap;

public class LinkedListCycle {
    /**
     * 141. Linked List Cycle
     * Easy
     * Topics: Linked List, Two Pointers, hashTable
     */
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode current = head;
        int index = 0;
        while (current != null) {
            if (map.containsKey(current)) {
                return true;
            } 
            map.put(current, index);
            current = current.next;
            index++;
            
        }
        return false;
    }
}
