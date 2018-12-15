class GfG
{
    int f=0;
    public int getCount(Node node, int bud)
    {
        // your code here
        int i=1;
        int m=0;
        int c=0;
        while(true)
        {
            f=1;
            int n=countLeaf(node,1,i);
            if(f!=0)
                break;
            if(m+n*i<=bud)
            {
                m=m+n*i;
                c+=n;
            }
            else if((bud-m)/i<n)
            {
                c+=(bud-m)/i;
                break;
            }
            i++;
        }
        return c;
    }
    public int countLeaf(Node node,int l1,int l2)
    {
        if(node==null)
            return 0;
        if(l1==l2)
            f=0;
        if(node.left==null && node.right==null && l1==l2)
            return 1;
        return countLeaf(node.left,l1+1,l2)+countLeaf(node.right,l1+1,l2);
        
    }
}
