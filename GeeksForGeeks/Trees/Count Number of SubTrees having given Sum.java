/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/
// Return the count of the sub-trees having sum as X.
class GFG
{
    int c=0;
    int countSubtreesWithSumX(Node root, int x)
    {
	    //Add your code here.
	    count(root,x);
	    return c;
    }
    void count(Node root,int x)
    {
        if (root==null)
            return ;
        int s=sumsub(root);
        if(s==x)
            c++;
        count(root.left,x);
        count(root.right,x);
    }
    int sumsub(Node root)
    {
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return root.data;
        
        return sumsub(root.left)+sumsub(root.right)+root.data;
        
    }
}
