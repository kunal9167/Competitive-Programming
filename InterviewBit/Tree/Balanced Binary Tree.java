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
    public int isBalanced(TreeNode A) {
        return inorder(A);
    }

    int inorder(TreeNode node)
    {
        if(node==null)
            return 1;
        int left = recur(node.left,0);

        return 1;
    }
    int recur(TreeNode node,int level)
    {
        if(node == null)
            return level-1;
        System.out.println(node.val+" "+level);
        return Math.max(recur(node.left,level+1),recur(node.left,level+1));
    }
}
