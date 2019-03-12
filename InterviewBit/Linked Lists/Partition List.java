/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode A, int B) {
        ListNode curr=A,le=null,ptr1=null,ge=null,ptr2=null;
        while(curr!=null)
        {
            if(curr.val<B)
            {
                ListNode temp = new ListNode(curr.val);
                if(le==null)
                {
                    le=temp;
                    ptr1=le;
                }
                else
                {
                    ptr1.next=temp;
                    ptr1=temp;
                }
            }
            else
            {
                ListNode temp = new ListNode(curr.val);
                if(ge==null)
                {
                    ge=temp;
                    ptr2=ge;
                }
                else
                {
                    ptr2.next=temp;
                    ptr2=temp;
                }
            }
            curr=curr.next;
        }
        if(le==null)
            return ge;
        else if(ge==null)
            return le;
        else
        {
            ptr1.next=ge;
            return le;
        }
    }
}

