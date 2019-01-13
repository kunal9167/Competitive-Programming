/* A binary search tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */
// your task is to complete the below function
class GfG
{
    int minValue(Node node)
    {
        return min(node,node.data);
    }
    int min(Node node,int min)
    {
        if(node==null)
            return min;
        
        if(node.data<min)
            return Math.min(min(node.left,node.data),min(node.right,node.data));
        return Math.min(min(node.left,min),min(node.right,min));
    }
}

