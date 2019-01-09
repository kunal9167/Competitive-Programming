//User function Template for Java
/* A binary tree node has data, pointer to left child
   and a pointer to right child 
class Node
{
    int data;
    Node left;
    Node right;
} */
class GFG
{
    static void verticalOrder(Node root)
    {
        // add your code
        TreeMap<Integer,Vector<Integer>> hs = new TreeMap<Integer,Vector<Integer>>();
        Node n=root;
        int hd=0;
        order(hs,root,hd);


        for(Map.Entry<Integer,Vector<Integer>> entry: hs.entrySet())
        {
            Vector v = entry.getValue();
            for(int i=0;i<v.size();i++)
            {
                System.out.print(v.get(i)+" ");
            }
            // System.out.print(entry.getValue()+" ");
        }
    }
    static void order(TreeMap<Integer,Vector<Integer>> hs,Node root,int hd)
    {
        if(root==null)
            return ;
        Vector<Integer> v = hs.get(hd);
        if(v==null)
        {
            v=new Vector<Integer>();
            v.add(root.data);
        }
        else
        {
            v.add(root.data);
        }
        hs.put(hd,v);
        order(hs,root.left,hd-1);
        order(hs,root.right,hd+1);
    }
}
