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
    int ans=0;
    public int t2Sum(TreeNode A, int B) {
        HashSet<Integer> hs = new HashSet<Integer>();
        ans(A,B,hs);
        return ans;
    }
    void ans(TreeNode A, int B, HashSet<Integer> hs)
    {
        if(A==null)
            return ;
        ans(A.left,B,hs);
        if(hs.contains(B-A.val))
        {
            ans=1;
            return ;
        }
        hs.add(A.val);
        ans(A.right,B,hs);
    }
}
