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
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        int arr1[]=new int[n1];
	        int arr2[]=new int[n2];
	        
	        for(int i=0;i<n1;i++)
	            arr1[i]=sc.nextInt();
	        
	        for(int i=0;i<n2;i++)
	            arr2[i]=sc.nextInt();
	        
	        int n=sc.nextInt();
	        
	        TreeSet<Integer> ts = new TreeSet<Integer>();
	        
	        for(int i=0;i<n1;i++)
	            for(int j=0;j<n2;j++)
	                ts.add(arr1[i]+arr2[j]);
	       
	        Iterator i = ts.iterator();
	       
	        if(ts.size()<n)
	            System.out.println("-1");
	        else
	        {
	            while(--n>0)
	                i.next();
	            System.out.println(i.next());
	        }
	    }
	 }
}
