/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) {
            return null;
        }

        ListNode l1 = headA;
        ListNode l2 = headB;

        int len1 = 0;
        int len2 = 0;

        while (l1 != null) {
            len1++;
            l1 = l1.next;
        }

        l1 = headA;

        while (l2 != null) {
            len2++;
            l2 = l2.next;
        }

        l2 = headB;

        int len = len1 - len2;

        if(len < 0) {
            l1 = headB;
            l2 = headA;
            len = len2 - len1;
        }


        while (len != 0) {
            l1 = l1.next;
            len--;
        }

        while (l1 != l2) {
            l1 = l1.next;
            l2 = l2.next;
        }

        return l1;
    }
}