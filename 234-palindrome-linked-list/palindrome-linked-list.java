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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        int isPal[] = new int[count];
        temp = head;
        int k = 0;
        while(temp!=null){
            isPal[k++] = temp.val;
            temp = temp.next;
        }
        int i = 0;
        int j = isPal.length-1;
        while(i<=j){
            if(isPal[i]!=isPal[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}