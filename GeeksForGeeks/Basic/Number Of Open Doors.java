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
		long i=1;
		int c=0;
		for(i=1;i*i<=n;i++)
		    c++;
		System.out.println(c);
	    }
	 }
}
