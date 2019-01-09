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
	        int arr[]=new int[n];
	        int dep[]=new int[n];
	        
	        for(int i=0;i<n;i++)
	            arr[i]=sc.nextInt();
	        
	        for(int i=0;i<n;i++)
	            dep[i]=sc.nextInt();
	        
	        Arrays.sort(arr);
	        Arrays.sort(dep);
	       // System.out.println(arr[0]);
	        int c=0,max=0,time=arr[0],a=0,d=0;
	        while(d<n && a<n)
	        {
	           if(arr[a]<dep[d])
	           {
	               c++;
	               if(c>max)
	                   max=c;
	               a++;
	           }
	           else if(arr[a]==dep[a])
	                d++;
	           else
	           {
	               c--;
	               d++;
	           }
	        }
	        
	        System.out.println(max);
	    }
	 }
}