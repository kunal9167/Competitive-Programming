/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head=null,ptr=null;
        
        while(A!=null && B!=null)
        {
            ListNode temp;
            if(A.val<B.val)
            {
                temp=A;
                A=A.next;
            }
            else
            {
                temp=B;
                B=B.next;
            }
            if(head==null)
            {
                head=temp;
                ptr=temp;
            }
            else
            {
                ptr.next=temp;   
                ptr=ptr.next;
            }
        }
        while(A!=null)
        {
            ptr.next=A;
            ptr=ptr.next;
            A=A.next;
        }
        while(B!=null)
        {
            ptr.next=B;
            ptr=ptr.next;
            B=B.next;
        }
        return head;
    }
}

