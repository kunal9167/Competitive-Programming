/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head==null)
            return true;
        // Node a=head,b=head.next,c=b.next;
        String s="";
        while(head!=null)
        {
            s=s+head.data;
            head=head.next;
        }
        StringBuffer sb = new StringBuffer(s);
        if(s.toString().equals(sb.reverse().toString()))
            return true;
        return false;
        
    }    
}