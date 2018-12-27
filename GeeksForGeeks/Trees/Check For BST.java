class GfG
{
    int isBST(Node root)  
    {
        if(root==null)
            return 1;
        int max=root.data;
        int min=root.data;
        return check(root.right,Integer.MAX_VALUE,min,0) & check(root.left,max,Integer.MIN_VALUE,1);
        // Your code here
    }
    
    int check(Node root,int max,int min,int l)
    {
        if(root==null)
            return 1;
        if(l==0 && (root.data<min || root.data>max))
            return 0;
        if(l==1 && root.data>max || root.data<min)
            return 0;
        return check(root.left,root.data,min,1) & check(root.right,max,root.data,0);
    }

}
