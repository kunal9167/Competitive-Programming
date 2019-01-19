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
	        for(int i=1;i<=n;i++)
	        {
	            int s=i*(i+1)/2;
	            if(s==n)
	            {
	                System.out.println("1");
	                break;
	            }
	            else if(s>n)
	            {
	                System.out.println("0");
	                break;
	            }
	        }
	    }
	 }
}
