import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int p=1;
	        int c=0;
	        for(int i=5;n/i>=1;i*=5)
	        {
	            c+=n/i;
	        }
	        System.out.println(c);
	    }
	 }
}
