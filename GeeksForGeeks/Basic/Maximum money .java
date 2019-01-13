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
	        int m=sc.nextInt();
	        int c=(n%2==1)?(int)Math.ceil(n/2.0)*m:n*m/2;
	        System.out.println(c);
	    }
	 }
}
