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
    public int isSameTree(TreeNode A, TreeNode B) {
        return identical(A,B);
    }
    public int identical(TreeNode A,TreeNode B)
    {
        if(A==null && B==null)
            return 1;
        else if(A==null || B==null)
            return 0;
        if(A.val!=B.val)
            return 0;
        else
            return identical(A.left,B.left) & identical(A.right,B.right);
    }
}
