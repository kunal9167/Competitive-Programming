/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    ListNode sorted=null;
    public ListNode insertionSortList(ListNode A) {
        ListNode curr=A;
        while(curr!=null)
        {
            ListNode t=curr.next;
            sortedInsert(curr);
            curr=t;
            ListNode loop=sorted;
        }
        return sorted;
    }
    void sortedInsert(ListNode curr)
    {
        
        if(sorted==null || sorted.val>curr.val)
        {
            curr.next=sorted;
            sorted=curr;
        }
        else
        {
            ListNode loop=sorted;
            while(loop.next!=null)
            {
                if(loop.next.val>curr.val)
                {
                    curr.next=loop.next;
                    loop.next=curr;
                    return ;
                }
                loop=loop.next;
            }
            // if(curr.val>loop.val)
            loop.next=curr;
            curr.next=null;
        }
    }
}
