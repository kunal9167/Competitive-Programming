class GfG
{
    int isBST(Node root)  
    {
        if(root==null)
            return 1;
        return check(root.right,Integer.MAX_VALUE,root.data) & check(root.left,root.data,Integer.MIN_VALUE);
        // Your code here
    }
    
    int check(Node root,int max,int min)
    {
        if(root==null)
            return 1;
        if(root.data<min || root.data>max)
            return 0;
        return check(root.left,root.data,min) & check(root.right,max,root.data);
    }
}
