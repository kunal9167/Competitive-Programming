/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) {
        if(A==null || A.next==null)
            return A;
        ListNode slow=A;
        ListNode fast=A.next;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode midNext=slow.next;
        slow.next=null;
        ListNode left=sortList(A);
        ListNode right=sortList(midNext);
        ListNode sortedList = sortedMerge(left,right);
        return sortedList;
    }
    public ListNode sortedMerge(ListNode left,ListNode right)
    {
        ListNode ans=null,ptr=null;
        while(left!=null && right!=null)
        {
            int f=0;
            if(left.val<right.val)
                f=0;
            else
                f=1;
            
            if(f==0)
            {
                if(ans==null)
                {
                    ans=left;
                    ptr=ans;
                }
                else
                {
                    ptr.next=left;
                    ptr=ptr.next;
                }
                left=left.next;
            }
            else
            {
                if(ans==null)
                {
                    ans=right;
                    ptr=ans;
                }
                else
                {
                    ptr.next=right;
                    ptr=ptr.next;
                }
                right=right.next;
            }
        }
        while(left!=null)
        {
            if(ans==null)
            {
                ans=left;
                ptr=ans;
            }
            else
            {
                ptr.next=left;
                ptr=ptr.next;
            }
            left=left.next;
        }
        while(right!=null)
        {
            if(ans==null)
            {
                ans=right;
                ptr=ans;
            }
            else
            {
                ptr.next=right;
                ptr=ptr.next;
            }
            right=right.next;
        }
        return ans;
    }
}
