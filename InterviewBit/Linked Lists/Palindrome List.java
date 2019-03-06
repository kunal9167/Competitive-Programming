/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode rev=null,rev2=null,pointer;
        pointer = A;
        while(pointer!=null)
        {
            ListNode temp=new ListNode(pointer.val);
            if(rev==null)
            {
                rev=temp;
            }
            else
            {
                temp.next=rev;
                rev=temp;
            }
            pointer=pointer.next;
        }
        while(rev!=null && A!=null)
        {
            if(A.val!=rev.val)
                return 0;
            A=A.next;
            rev=rev.next;
        }
        return 1;
    }
}
