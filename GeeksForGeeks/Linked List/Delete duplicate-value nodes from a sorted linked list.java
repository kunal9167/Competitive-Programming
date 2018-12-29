/* Structure of Linked List
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/
class GfG
{
    Node removeDuplicates(Node head)
    {
	    if(head==null)
	        return head;
	    Node root = head;
	    
	    while(root.next!=null)
	    {
	        if(root.data==root.next.data)
	        {
	            root.next=root.next.next;
	            continue;
	        }
	        root=root.next;
	    }
	    return head;
    }
}

