/* Linked List
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
class GfG
{
    void deleteNode(Node del)
    {
        // Your code here
        del.data=del.next.data;
        del.next=del.next.next;
    }
}
