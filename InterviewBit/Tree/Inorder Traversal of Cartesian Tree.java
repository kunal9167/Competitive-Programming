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
    public TreeNode buildTree(ArrayList<Integer> A) {
        return recur(A,0,A.size()-1);
    }

    TreeNode recur(ArrayList<Integer> A,int low, int high)
    {
        if(low>high)
            return null;

        int max=Integer.MIN_VALUE,max_index=-1;
        for(int i=low;i<=high;i++)
        {
            if(max<A.get(i))
            {
                max=A.get(i);
                max_index=i;
            }
        }
        TreeNode temp = new TreeNode(max);
        temp.left = recur(A,low,max_index-1);
        temp.right = recur(A,max_index+1,high);
        return temp;
    }
}
