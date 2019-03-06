/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode p=A;
        while(p.next!=null)
        {
            if(p.val==p.next.val)
            {
                p.next=p.next.next;
                continue;
            }
            p=p.next;
        }
        return A;
    }
}

