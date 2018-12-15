/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class GfG{
    int m,s;
    public int minLeafSum(Node root){
        //Your Code Here.
        m=Integer.MAX_VALUE;s=0;
        sum(root,0);
        return s;
    }
    
    void sum(Node root,int l)
    {
        if(l>m || root==null)
            return ;
        if(root.left==null && root.right==null && l<m)
        {
            s=root.data;
            m=l;
        }
        else if(root.left==null && root.right==null && l==m)
        {
            s+=root.data;
            // System.out.println(root.data);
        }
        sum(root.left,l+1);
        sum(root.right,l+1);
    }
}
