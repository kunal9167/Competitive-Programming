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
    int ans=-1;
    public int kthsmallest(TreeNode A, int B) {
        // int k=1;
        count k = new count();
        recur(A,B,k);
        return ans;
    }
    void recur(TreeNode A,int B,count k)
    {
        if(A==null)
            return ;
        recur(A.left,B,k);

        // System.out.println(A.val+ " "+k.k);

        if(k.k==B)
        {
            ans=A.val;
            k.k++;
            return ;
        }
        k.k++;
        recur(A.right,B,k);
    }
}
class count{
    int k;
    count()
    {
        k=1;
    }
}
