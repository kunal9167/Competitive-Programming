/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode ptr1=A,ptr2=A;
        // B+=1;
        while(ptr2!=null && B!=0)
        {
            ptr2=ptr2.next;
            B--;
        }
        if(B!=0)
        {
            A=A.next;
            return A;
        }
        while(ptr2!=null && ptr2.next!=null)
        {
            ptr2=ptr2.next;
            ptr1=ptr1.next;
        }
        if(ptr1==A)
        A=A.next;
        else    
        ptr1.next=ptr1.next.next;
        return A;
    }
}

