/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(fast!=null && fast.next!=null && fast.next.next==slow) return slow;
        while(fast!=null && fast.next!=null){
            if(fast.next==slow){
                slow = head;
                fast = fast.next;
                while(fast.next!=slow){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }
}