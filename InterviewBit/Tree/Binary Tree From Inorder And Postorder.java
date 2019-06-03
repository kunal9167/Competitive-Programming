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
    public TreeNode buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
        Index i = new Index();
        i.index=inorder.size()-1;
        return recur(inorder,postorder,i,0,inorder.size()-1);
    }

    TreeNode recur(ArrayList<Integer> inorder, ArrayList<Integer> postorder, Index index,int left,int right)
    {
        if(left>right)
            return null;

        // int i = Index.index;
        // int a=postorder.get(i);

        TreeNode temp = new TreeNode(postorder.get(index.index));
        // System.out.println(temp.val);
        index.index--;

        if(left==right)
            return temp;

        int in_index=inorder.indexOf(temp.val);



        // Index.index--;
        temp.right = recur(inorder,postorder,index,in_index+1,right);
        temp.left = recur(inorder,postorder,index,left,in_index-1);
        return temp;
    }
}
class Index
{
    static int index;
    Index()
    {
        index=0;
    }
}
