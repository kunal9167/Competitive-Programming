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
	        long n=sc.nextLong();
	        long m=1;
	        while(n%2==0)
	        {
	            n=n/2;
	            m=2;
	        }
	        for(long i=3;i<=Math.sqrt(n);i+=2)
	        {
	            while(n%i==0)
	            {
	                n=n/i;
	                m=n;
	            }
	        }
	        if (n > 2) 
                System.out.println(n);
            else
                System.out.println(m);
	    }
	 }
}
