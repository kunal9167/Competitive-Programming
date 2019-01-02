import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t>0)
	    {
	        t--;
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	        int a=n,b=n;
	        for(int i=0;i<Math.abs(m);i++)
	        {
	            a=n+i;
	            b=n-i;
	            if(a%m==0 && b%m==0)
	            {
	                if(Math.abs(a)>Math.abs(b))
	                    System.out.println(a);
	                else
	                    System.out.println(b);
	                break;
	            }
	            else if(a%m==0)
	            {
	                System.out.println(a);
	                break;
	            }
	            else if(b%m==0)
	            {
	                System.out.println(b);
	                break;
	            }
	        }
	    }
	 }
}
