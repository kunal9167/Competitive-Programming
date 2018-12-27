/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int row;
    int col;
    Node(int i,int j)
    {
        row=i;col=j;
    }
}
class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    int r=sc.nextInt();
		    int c=sc.nextInt();
		    int arr[][] = new int[r][c];
		    Queue<Node> q = new LinkedList<Node>();
		    int oranges=0;
		    int k=0;
		    for(int i=0;i<r;i++)
		    {
		        for(int j=0;j<c;j++)
		        {
		            
		            arr[i][j]=sc.nextInt();
		            if(arr[i][j]==2)
		            {
		               Node n = new Node(i,j); 
		               q.add(n);
		               k++;
		               oranges++;
		            }
		            else if(arr[i][j]==1)
		                oranges++;
		        }
		    }
		    int time=0;
		    Queue<Node> q2 = new LinkedList<Node>();
		    do{
		        time++;
		        q2 = new LinkedList<Node>();
    		    while(q.size()!=0)
    		    {
    		        Node n=q.remove();
    		        if(n.row>0 && arr[n.row-1][n.col]==1)
    		        {
    		            Node n2=new Node(n.row-1,n.col);
    		            arr[n.row-1][n.col]=2;
    		            q2.add(n2);k++;
    		        }
    		        if(n.row<r-1 && arr[n.row+1][n.col]==1)
    		        {
    		            Node n2=new Node(n.row+1,n.col);
    		            arr[n.row+1][n.col]=2;
    		            q2.add(n2);k++;
    		        }
    		        if(n.col>0 && arr[n.row][n.col-1]==1)
    		        {
    		            Node n2=new Node(n.row,n.col-1);
    		            arr[n.row][n.col-1]=2;
    		            q2.add(n2);k++;
    		        }
    		        if(n.col<c-1 && arr[n.row][n.col+1]==1)
    		        {
    		            Node n2=new Node(n.row,n.col+1);
    		            arr[n.row][n.col+1]=2;
    		            q2.add(n2);k++;
    		        }
    		    }
    		    q=q2;
		    }while(q2.size()!=0);
		    if(k!=oranges)
    		        System.out.println("-1");
		    else
		        System.out.println(time-1);
		    t--;
		}
		
	}
}