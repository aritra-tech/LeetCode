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
    public ListNode insertionSortList(ListNode head) {
        for(ListNode curr=head;curr!=null;curr=curr.next){
            for(ListNode temp=head;temp!=curr;temp=temp.next){
                if(temp.val>curr.val){
                    temp.val = temp.val ^ curr.val ^ (curr.val = temp.val);
                }
            }
        }
        return head;
    }
}