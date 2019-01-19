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
	        int l1x=sc.nextInt();
	        int l1y=sc.nextInt();
	        int r1x=sc.nextInt();
	        int r1y=sc.nextInt();
	        int l2x=sc.nextInt();
	        int l2y=sc.nextInt();
	        int r2x=sc.nextInt();
	        int r2y=sc.nextInt();
	        
	       if(l1x>r2x || l2x>r1x)
	       {
	           System.out.println("0");
	           continue;
	       }
	       else if(r2y>l1y || l2y<r1y)
	       {
	           System.out.println("0");
	           continue;
	       }
	       System.out.println("1");
	    }
	 }
}
