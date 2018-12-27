/* Tree node class
class Node {
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}*/
class GfG
{
    // Should print bottom view of tree with given root
    public void bottomView(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        TreeMap<Integer,Integer> tmap = new TreeMap<Integer,Integer>();
        int hd=0;
        
        root.hd=hd;
        q.add(root);
        while(q.size()!=0)
        {
            Node n=q.remove();
            hd=n.hd;
            tmap.put(n.hd,n.data);
            
            if(n.left!=null)
            {
                n.left.hd=hd-1;
                q.add(n.left);
            }
            if(n.right!=null)
            {
                n.right.hd=hd+1;
                q.add(n.right);
            }
        }
        
        for (Map.Entry m: tmap.entrySet()) 
          System.out.print(m.getValue()+" "); 
        
    }
}
