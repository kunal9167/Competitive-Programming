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
	        TreeSet<Integer> ts = new TreeSet<Integer>();
	        int n=sc.nextInt();
	        while(n-->0)
	        {
	            ts.add(sc.nextInt());
	        }
	        int k=sc.nextInt();
	        Iterator value = ts.iterator();
	        int c=0;
	        while(value.hasNext())
	        {
	            c++;
	            if(c==k)
	            {
	                System.out.println(value.next());
	                break;
	            }
	            value.next();
	        }
	    }
	 }
}
