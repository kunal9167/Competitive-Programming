/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    int f=-1;
    public int lca(TreeNode A, int B, int C) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        ArrayList<Integer> c = new ArrayList<Integer>();
        
        if(order(A,b,B)==0 || order(A,c,C)==0)
            return -1;
        
        for(int x:c)
        {
            if(b.contains(x))
                return x;
        }
        
        return -1;
    }
    int order(TreeNode A,ArrayList<Integer> path,int n)
    {
        if(A==null)
            return 0;
        
        if(A.val==n)
        {
            path.add(A.val);
            return 1;
        }
        int f=order(A.left,path,n) | order(A.right,path,n);
        if(f==1)
            path.add(A.val);
        
        return f;
    }   
}

