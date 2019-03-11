/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        ListNode ans=A.next;
        if(A==null || A.next==null)
            return A;
        ListNode prev = A,curr=A.next,next=curr.next,tail=null;
        while(curr!=null)
        {
            curr.next=prev;
            prev.next=next;
            if(tail!=null)
                tail.next=curr;
            tail=prev;
            if(next==null || next.next==null)
                break;
            prev=next;
            curr=prev.next;
            next=next.next.next;
        }
        return ans;
    }
    
}

