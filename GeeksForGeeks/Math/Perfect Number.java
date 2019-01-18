import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    long t=sc.nextLong();
	    while(t-->0)
	    {
	        long n=sc.nextLong();
	        long s=1;
	        for(long i=2;i<Math.sqrt(n);i++)
	        {
	            if(n%i==0)
	            {
	                if(n%i==i)
	                    s+=i;
	                else
	                    s+=(i+(n/i));
	            }
	        }
	        if(s==n)
	            System.out.println("1");
	        else
	            System.out.println("0");
	    }
	 }
}
