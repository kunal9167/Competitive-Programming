import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	       int n=sc.nextInt();
	       System.out.print(n+" ");
	       
	       print(n-5,n,0);
	       System.out.println();
	    }
	 }
	 static void print(int x,int n,int f)
	 {
	    System.out.print(x+" ");
	    if(x>=n)
	        return ;
	    if(x>0 && f==0)
	    {
	        print(x-5,n,0);
	    }
	    else if(x>=0 || f==1)
	    {
	        print(x+5,n,1);   
	    }
	    else if(x<0)
	    {
	        print(x+5,n,1);
	    }
	    else
	        return ;
	 }
}
