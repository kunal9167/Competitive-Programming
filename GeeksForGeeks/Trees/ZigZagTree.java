/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/

class GFG
{
    void zigZagTraversal(Node root) { 
      

    if (root == null) { 
    return; 
    } 

    Stack<Node> curr = new Stack<>(); 
    Stack<Node> next = new Stack<>(); 

    curr.push(root); 
    boolean leftToRight = true; 
  
    while (!curr.isEmpty()) { 
  
    Node node = curr.pop(); 
      
    System.out.print(node.data + " "); 
  

    if (leftToRight) { 
        if (node.left != null) { 
        next.push(node.left); 
        } 
          
        if (node.right != null) { 
        next.push(node.right); 
        } 
    } 
    else { 
        if (node.right != null) { 
        next.push(node.right); 
        } 
          
        if (node.left != null) { 
        next.push(node.left); 
        } 
    } 
  
    if (curr.isEmpty()) { 
        leftToRight = !leftToRight; 
        Stack<Node> temp = curr; 
        curr = next; 
        next = temp; 
    } 
    } 

} 
}
