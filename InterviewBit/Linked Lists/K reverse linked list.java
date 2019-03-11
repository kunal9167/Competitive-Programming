/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode A, int B) {
        ListNode head=A,tail=A,next=A.next;
        int c=0;
        ListNode ans=null,curr=null;
        // if(B==1)
        //     return A;
        
        while(next!=null)
        {
            ListNode temp2=head;
            for(int i=1;i<B;i++)
            {
                temp2=temp2.next;
                if(temp2==null)
                    return ans;
            }
            
            for(int i=1;i<B && next!=null;i++)
            {
                ListNode temp=next;
                next=next.next;
                temp.next=head;
                head=temp;
            }
            // if(next==null)
            //     break;
            
            tail.next=next;
            if(curr==null)
                curr=tail;
            else
            {
                curr.next=head;
                curr=tail;
            }
            
            if(c==0)
            {
                ans=head;
                c++;
            }
            
            if(next!=null)
            {
                head=next;
                tail=next;
                next=next.next;
            }
            // return ans;
        }
        return ans;
        
    }
}

