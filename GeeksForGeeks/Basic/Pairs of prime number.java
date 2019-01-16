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
	        ArrayList<Integer> al = new ArrayList<Integer>();
	        al=prime_nos(al,n);
	        first:
	        for(int i=0;i<al.size();i++)
	        {
	            int a=al.get(i);
	            for(int j=0;j<al.size();j++)
	            {
	                int b=al.get(j);
	                if(a*b>n)
	                    break;
	                System.out.print(a+" "+b+" ");
	            }
	        }
	        System.out.println();
	    }
	 }
	 static ArrayList<Integer> prime_nos(ArrayList<Integer> al, int n)
	 {
	     boolean isPrime[]=new boolean[n+1];
	     for(int i=0;i<=n;i++)
	        isPrime[i]=true;
	     for(int p=2;p*p<=n;p+=1)
	     {
	         if(isPrime[p]==true)
	         {
	             for(int i=p*p;i<=n;i+=p)
	                 isPrime[i]=false;
	         }
	     }
	     for(int i=2;i<=n;i++)
	        if(isPrime[i])
                al.add(i);
	    return al;
	 }
}
