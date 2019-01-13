// A Binary Tree node
/* class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}  */
class GfG
{   /*You are required to complete this function*/
    int getLevelDiff(Node root)
    {
        // Your code here
        int odd=sum(root,0,1);
        int even=sum(root,1,1);
        return even-odd;
    }
    int sum(Node root,int r,int l)
    {
        if(root==null)  
            return 0;
        if(l%2==r)
        {
            return root.data+sum(root.left,r,l+1)+sum(root.right,r,l+1);
        }
        return sum(root.left,r,l+1)+sum(root.right,r,l+1);
    }
}
