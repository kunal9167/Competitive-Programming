/*Complete The Function Provided
Given Below is The Node Of Tree
class TreeNode
{
    int data;
    TreeNode left, right;
    public TreeNode(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/
class GfG{
    void rightView(TreeNode node) {
        //add code here.
        HashSet<Integer> hs = new HashSet<Integer>();
        view(node,0,hs);
    }
    
    void view(TreeNode node,int level,HashSet<Integer> hs)
    {
        if(node==null)
            return ;
        if(!hs.contains(level))
        {
            hs.add(level);
            System.out.print(node.data+" ");
        }
        view(node.right,level+1,hs);
        view(node.left,level+1,hs);
    }
}
