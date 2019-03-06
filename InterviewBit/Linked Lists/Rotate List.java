/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        
        ListNode ptr1=A,ptr2=A;
        int n=B;
        while(n-->0)
        {
            ptr2=ptr2.next;
            if(ptr2==null)
                ptr2=A;
        }
            
        if(ptr2==null)
            return A;
        while(ptr2.next!=null)
        {
            ptr2=ptr2.next;
            ptr1=ptr1.next;
        }
        
        ptr2.next=A;
        A=ptr1.next;
        ptr1.next=null;

        return A;
    }
}

