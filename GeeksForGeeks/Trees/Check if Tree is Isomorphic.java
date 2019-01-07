/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
*/
class GfG
{
	public boolean isIsomorphic(Node root1,Node root2)
    {
         //add code here.
        if(root1==null && root2==null)
            return true;
        
        if(root1==null || root2==null)
            return false;
        
        if(root1.data!=root2.data)
            return false;
            
        return (isIsomorphic(root1.left,root2.left) && isIsomorphic(root1.right,root2.right)) || (isIsomorphic(root1.left,root2.right) && isIsomorphic(root1.right,root2.left));
	}
}
