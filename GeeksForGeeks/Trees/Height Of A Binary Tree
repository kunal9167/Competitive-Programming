/*
    class Node 
    	int data;
    	Node left;
    	Node right;
*/
public static int height(Node root) {
      // Write your code here.
      return h(root,0)-1;
}

public static int h(Node root,int x)
{
    if(root==null)
            return x;
    return Math.max(h(root.left,x+1),h(root.right,x+1));
}
