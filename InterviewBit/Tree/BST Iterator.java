/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {

    ArrayList<TreeNode> al;
    int i;
    public Solution(TreeNode root) {
        al = new ArrayList<TreeNode>();
        inorder(root);
        i=0;
    }

    void inorder(TreeNode root)
    {
        if(root==null)
            return ;
        inorder(root.left);
        al.add(root);
        inorder(root.right);
    }
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(i<al.size())
            return true;
        return false;
    }

    /** @return the next smallest number */
    public int next() {
        return al.get(i++).val;
    }
}

/**
 * Your Solution will be called like this:
 * Solution i = new Solution(root);
 * while (i.hasNext()) System.out.print(i.next());
 */
