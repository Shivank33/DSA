//  1171. Remove Zero Sum Consecutive Nodes from Linked List  (Leetcode)


class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
    ListNode temp = new ListNode(0, head);
    int prefix = 0;
    Map<Integer, ListNode> prefixToNode = new HashMap<>();
    prefixToNode.put(0, temp);

    for (; head != null; head = head.next) {
      prefix += head.val;
      prefixToNode.put(prefix, head);
    }

    prefix = 0;

    for (head = temp; head != null; head = head.next) {
      prefix += head.val;
      head.next = prefixToNode.get(prefix).next;
    }

    return temp.next;
    }
}
