

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {

    public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode curr = A;
        for (int i = 2; i <= B-1; i++) {
            curr = curr.next;
        }

        ListNode seqHead;
        ListNode seqTail;
        ListNode prevNext;
        if (B == 1) {
            seqHead = A;
            seqTail = A;
            prevNext = A.next;
        } else {
            seqHead = curr.next;
            seqTail = seqHead;
            prevNext = seqHead.next;
        }
        curr.next = null;


        for (int i = B+1; i <= C; i++) {
            ListNode temp = prevNext;
            prevNext = temp.next;

            temp.next = seqHead;
            seqHead = temp;
        }


        if (B == 1) {
            seqTail.next = prevNext;
            return seqHead;
        } else {
            curr.next = seqHead;
            seqTail.next = prevNext;
            return A;
        }
    }
}
