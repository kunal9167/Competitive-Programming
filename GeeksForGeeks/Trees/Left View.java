class GfG
{
    int max_level=0;
    void leftView(Node root)
    {
      // Your code here
      if(root==null)
        return ;
        // System.out.print(root.data+" ");
        answer(root,1);
    }
    void answer(Node node,int level)
    {
        if(node==null)
            return ;
        
        if(level>max_level)
        {
            max_level=level;
            System.out.print(node.data+" ");
        }
        answer(node.left,level+1);
        answer(node.right,level+1);
    }
}
