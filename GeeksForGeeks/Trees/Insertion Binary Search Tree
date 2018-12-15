 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        Node h=root;
        Node temp = new Node(data);
        if(h==null)
        {
            root=temp;
            return root;
        }
        while(true)
        {
            // System.out.println(h);
            if(h.data>data && h.left!=null)
                h=h.left;
            else if(h.data>data && h.left==null)
            {
                h.left=temp;
                return root;
            }
            if(h.data<data && h.right!=null)
                h=h.right;
            else if(h.data<data && h.right==null)
            {
                h.right=temp;
                return root;
            }
        }
}
