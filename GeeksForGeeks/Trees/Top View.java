/*Complete the function below
Node is as follows
class TreeNode
{
    int key;
    TreeNode left, right;
    public TreeNode(int key)
    {
        this.key = key;
        left = right = null;
    }
}*/
class Node{
    TreeNode n;
    int hd;
    Node(TreeNode tree, int h)
    {
        n=tree;
        hd=h;
    }
}
class GfG
{
    public void printTopView(TreeNode root)
    {
        //add code here.
        if(root==null)
            return ;
        HashSet<Integer> hs = new HashSet<Integer>();
        Queue<Node> q = new LinkedList<Node>();
        Node n = new Node(root,0);
        q.add(n);
        while(q.size()!=0)
        {
            n=q.remove();
            if(!hs.contains(n.hd))
            {
                hs.add(n.hd);
                System.out.print(n.n.key+" ");
            }
            if(n.n.left!=null)
            {
                q.add(new Node(n.n.left,n.hd-1));
            }
            if(n.n.right!=null)
            {
                q.add(new Node(n.n.right,n.hd+1));
            }
        };
    }
}
