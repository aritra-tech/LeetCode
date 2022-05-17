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
        ListNode f=head , s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(f!=null){
            s=s.next;
        }
        s = reverse(s);
        f = head;
        while(s!=null){
            if(f.val!=s.val){
                return false;
            }
            f=f.next;
            s=s.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode p = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = p;
            p=head;
            head=next;
        }
        return p;
    }
}