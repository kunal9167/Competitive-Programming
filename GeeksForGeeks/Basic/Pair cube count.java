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
	        int a=1;
	        int b=0;
	        int c=0;
	        for(int i=1;i<=n;i++)
	        {
	            for(int j=0;j<=n;j++)
	            {
	               // if(i==j)
	               //     continue;
	                int s=i*i*i+j*j*j;
	                if(s==n)
	                    c++;
	            }
	        }
	        System.out.println(c);
	    }
	 }
}
