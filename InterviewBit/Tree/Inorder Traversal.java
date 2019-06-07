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
public ArrayList<Integer> inorderTraversal(TreeNode A) {
    ArrayList<Integer> al = new ArrayList<Integer>();
    recur(al,A);
    return al;
}
void recur(ArrayList<Integer> al,TreeNode A)
{
    if(A == null)
        return ;
    recur(al,A.left);
    al.add(A.val);
    recur(al,A.right);
}
}


