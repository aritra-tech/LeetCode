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
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null) return false;
        ListNode a1=head;
        ListNode a2=head;
        while(a2.next!=null && a2.next.next!=null){
            a1=a1.next;
            a2=a2.next.next;
            if(a1==a2) return true;
        }
        return false;
    }
}