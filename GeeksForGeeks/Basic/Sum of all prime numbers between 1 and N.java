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
	        boolean prime[] = new boolean[n+1];
	        for(int i=0;i<=n;i++)
	            prime[i]=true;
	        
	        for(int p=2;p*p<=n;p++)
	        {
	            if(prime[p]==true)
	            {
	                for(int i=p*p;i<=n;i+=p)
	                    prime[i]=false;
	            }
	        }
	        long s=0;
	        for(int i=2;i<=n;i++)
	            if(prime[i])
	            {
	                s+=i;
	               // System.out.print(i+" ");
	            }
	                
	        System.out.println(s);
	    }
	 }
}
