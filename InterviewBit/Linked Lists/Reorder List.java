/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        ListNode slow=A,fast=A;
        if(A==null || A.next==null)
            return A;
            
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        
        int f1=0;
        if(fast!=null)
        {
            slow=slow.next;
            f1=1;
        }
        ListNode l1=A;
        ListNode l2;
        ListNode prev=null,curr=slow,next=curr.next;
        while(next!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=next.next;
        }
        curr.next=prev;
        l2=curr;
        int f=0;
        ListNode ans=null,ptr=null;
        while(l2!=null)
        {
            if(f==0)
            {
                if(ans==null)
                {
                    ans=l1;
                    ptr=ans;
                }
                else
                {
                    ptr.next=l1;
                    ptr=ptr.next;
                }
                l1=l1.next;
                f=1;
            }
            else
            {
                ptr.next=l2;
                ptr=ptr.next;
                l2=l2.next;
                f=0;
            }
        }
        if(f1==1)
        {
            ptr.next=l1;
            ptr=l1;
        }
        ptr.next=null;
        
        return ans;
    }
}
