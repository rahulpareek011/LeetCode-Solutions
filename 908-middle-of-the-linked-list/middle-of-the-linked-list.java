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

 //hair 
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode f = head;
        ListNode df = head;
        while(df.next!=null && df.next.next!=null){
            f = f.next;
            df = df.next.next;

            if(df.next==null){
                return f;
            }
            else if(df.next.next==null){
                return f.next;
            }
        }
        if(head.next!=null){
            return head.next;
        }else{
            return head;
        }
    }

}