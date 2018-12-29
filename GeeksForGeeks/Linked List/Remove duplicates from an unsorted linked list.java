/* The structure of linked list is the following
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/
class GfG
{
    Node removeDuplicates(Node head)
    {
         // Your code here
        if(head==null)
            return head;
        HashSet<Integer> hs = new HashSet<Integer>();
        Node root = head;
        hs.add(root.data);
        while(root.next!=null)
        {
            if(hs.contains(root.next.data))
            {
                root.next=root.next.next;
                continue;
            }
            hs.add(root.next.data);
            root=root.next;
        }
        return head;
    }
}

