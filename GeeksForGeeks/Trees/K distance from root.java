/*class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class GfG
{
     // Recursive function to print right view of a binary tree.
     void printKdistance(Node root, int k)
     {
          print(root,k,0);
     }
     void print(Node root,int k,int l)
     {
        if(root==null)
            return ;
        if(k==l)
         System.out.print(root.data+" ");
        else if(l>k)
            return ;
        else
        {
            print(root.left,k,l+1);
            print(root.right,k,l+1);
        }
     }
}
