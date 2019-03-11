/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode ans=null,ptr=null;
        int carry=0;
        while(A!=null && B!=null)
        {
            int s=A.val+B.val+carry;
            carry=s/10;
            s=s%10;
            if(ans==null)
            {
                ans=new ListNode(s);
                ptr=ans;
            }
            else
            {
                ListNode temp=new ListNode(s);
                ptr.next=temp;
                ptr=temp;
            }
            A=A.next;
            B=B.next;
        }
        while(A!=null)
        {
            int s=A.val+carry;
            carry=s/10;
            s=s%10;
            ListNode temp = new ListNode(s);
            ptr.next=temp;
            ptr=temp;
            A=A.next;
        }
        while(B!=null)
        {
            int s=B.val+carry;
            carry=s/10;
            s=s%10;
            ListNode temp = new ListNode(s);
            ptr.next=temp;
            ptr=temp;
            B=B.next;
        }
        if(carry!=0)
        {
            ListNode temp = new ListNode(carry);
            ptr.next=temp;
            ptr=temp;
        }
        return ans;
    }
}

