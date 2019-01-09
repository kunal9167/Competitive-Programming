/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
//Back-end complete function Template for Java
class GfG
{
    int d=Integer.MIN_VALUE;
    int maxDiff(Node root)
    {
        if(root==null)
            return 0;
        diff(root.left,root.data);
        diff(root.right,root.data);
        return d;
    }
    void diff(Node root,int max)
    {
        if(root==null)
            return ;
        if(max-root.data>d)
            d=max-root.data;
        if(root.data>max)
        {
            max=root.data;
        }
        diff(root.left,max);
        diff(root.right,max);
    }
}
