/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		
		while(t>0)
		{
		  //  int z=0;  
		    t--;
		    int n=Integer.parseInt(sc.next());
		    int arr[] = new int[n];
		    int arr2[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=Integer.parseInt(sc.next());
		      //  if(arr[i]==0)
		          //  z++;
		    }
		    int k=0;
		    for(int i=0;i<n-1;i++)
		    {
		        if(arr[i]!=0)
		        {
		            if(arr[i]==arr[i+1])
		            {
		                arr[i+1]=0;
		                arr[i]*=2;
		              //  z++;
		            }
		            arr2[k++]=arr[i];
		        }
		      //  else if(arr[i]!=0)
		      //      arr2[k++]=arr[i];
		    }
		    if(arr[n-1]!=0)
		        arr2[k++]=arr[n-1];
		    for(int i=0;i<n;i++)
		    {
		        if(i<k)
		        System.out.print(arr2[i]+" ");
		        else
		        System.out.print("0 ");
		    }
		    System.out.println();
		}
	}
}

