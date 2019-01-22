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
	        long a=1;
	        long b=1;
	        long c=0;
	        int count=0;
	        long m=1000000007*2;
	        int n=sc.nextInt();
	        while(n>0)
	        {
	            c=(a%m+b%m)%m;
	            if(c%2==0)
	                n--;
	            a=b;
	            b=c;
	        }
	        System.out.println(c%1000000007);
	    }
	 }
}
