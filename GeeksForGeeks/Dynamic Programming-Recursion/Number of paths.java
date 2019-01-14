import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int m=sc.nextInt();
	        int n=sc.nextInt();
	        System.out.println(total_path(m,n,0,0));
	    }
	 }
	 static int total_path(int m,int n,int x,int y)
	 {
	   //  System.out.println(m+" "+n+" "+x+" "+y);
	     if(m-1==x && y==n-1)
	        return 1;
	    else if(x+1<m && y+1<n)
	        return total_path(m,n,x+1,y)+total_path(m,n,x,y+1);
	    else if(x+1<m)
	        return total_path(m,n,x+1,y);
	    else if(y+1<n)
	        return total_path(m,n,x,y+1);
	    else
	        return 0;
	        
	 }
}
