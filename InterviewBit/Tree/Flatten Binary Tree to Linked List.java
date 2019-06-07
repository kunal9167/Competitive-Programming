/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode flatten(TreeNode a) {
        // System.out.println();
        ArrayList<TreeNode> al = new ArrayList<>();
        recur(a,al);
        for(int i=0;i<al.size()-1;i++)
        {
            al.get(i).right=al.get(i+1);
            al.get(i).left=null;
            // System.out.print(al.get(i)+" ");
        }
        return a;
    }
    
    void recur(TreeNode a,ArrayList<TreeNode> al)
    {
        if(a==null)
            return ;
        
        
        al.add(a);
        recur(a.left,al);
        recur(a.right,al);
    }
}

