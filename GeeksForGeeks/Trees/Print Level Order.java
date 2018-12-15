	/* 
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	
	public static void levelOrder(Node root) {
      int x= height(root);
      for(int i=1;i<=x;i++)
      {
          printh(root,i);
      }
    }
    public static void printh(Node root,int l)
    {
        if(root == null)
            return ;
        if(l==1)
        {
            System.out.print(root.data+" ");       
        }
        printh(root.left,l-1);
        printh(root.right, l-1);
    }
	public static int height(Node root)
    {
        if(root==null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);
        if(lh>rh)
            return lh+1;
        return rh+1;
    }
