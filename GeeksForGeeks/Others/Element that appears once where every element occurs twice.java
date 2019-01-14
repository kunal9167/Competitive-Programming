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
	        HashSet<Integer> hs = new HashSet<Integer>();
	        while(n-->0)
	        {
	            int x=sc.nextInt();
	            if(hs.contains(x))
	            {
	                hs.remove(x);
	            }
	            else
	            {
	                hs.add(x);
	            }
	        }
	        Iterator i = hs.iterator();
	        System.out.println(i.next());
	    }
	 }
}
