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
	        Arrays.fill(prime,true);
	        prime[0]=prime[1]=false;
	        
	        for(int p=2;p*p<=n;p++)
	        {
	            if(prime[p]==true)
	            {
	                for(int i=p*2;i<=n;i+=p)
    	                prime[i]=false;
	            }
	        }
	        int c=0;
	        for(int i=1;i*i<=n;i++)
	        {
	            if(prime[i])
	                c++;
	        }
	        System.out.println(c);
	    }
	 }
}
