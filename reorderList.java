//     143. Reorder List     (Leetcode)



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode current = slow.next; 
        slow.next = null; 
      
        ListNode previous = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }

        current = head; 
        while (previous != null) {
            ListNode temp = previous.next;  
            previous.next = current.next;
            current.next = previous;
          
            current = previous.next;
            previous = temp;
    }
    }
}
