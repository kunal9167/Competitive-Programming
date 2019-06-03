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
    int preIndex=0;
    public TreeNode buildTree(ArrayList<Integer> A, ArrayList<Integer> B) {
         if(A==null || B==null || A.size()==0 || B.size()==0)
            return null;

        TreeNode root = new TreeNode(A.get(preIndex));
        int index = B.indexOf(A.get(preIndex));
        preIndex++;

        root.left = buildTree(A,new ArrayList(B.subList(0,index)));
        root.right = buildTree(A,new ArrayList(B.subList(index+1,B.size())));
        return root;
    }
}
