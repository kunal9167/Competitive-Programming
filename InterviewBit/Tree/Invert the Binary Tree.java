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
    public TreeNode invertTree(TreeNode A) {
        invert(A);
        return A;
    }
    void invert(TreeNode A)
    {
        if(A==null)
            return ;
        TreeNode temp = A.left;
        A.left=A.right;
        A.right=temp;
        invert(A.left);
        invert(A.right);
    }
}
