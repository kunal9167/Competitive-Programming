/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode pointer1=A,pointer2=pointer1;
        ListNode ans=null,ansptr=null;
        
        while(pointer1!=null)
        {
            ListNode temp=pointer1.next;
            int f=0;
            while(temp!=null && temp.val==pointer1.val)
            {
                temp=temp.next;
                f=1;
            }
            if(f==0)
            {
                if(ans==null)
                {
                    ans=new ListNode(pointer1.val);
                    ansptr=ans;
                }
                else
                {
                    ansptr.next=new ListNode(pointer1.val);
                    ansptr=ansptr.next;
                }
            }
            pointer1=temp;
        }
        return ans;
    }
}

