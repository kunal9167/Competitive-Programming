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
	        long m=sc.nextLong();
	        long i=1;
	        while(Math.pow(i,n)<m)
	            i++;
	        
	       // System.out.println((int)Math.pow(i,n)+" "+m);
	        if(((int)Math.pow(i,n))==m)
	            System.out.println(i);
	        else
	            System.out.println("-1");
	    }
	 }
}
