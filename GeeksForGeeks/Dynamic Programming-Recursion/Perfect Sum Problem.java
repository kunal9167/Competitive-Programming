import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	            a[i]=sc.nextInt();
	        int sum=sc.nextInt();
	        int dp[][]= new int[n][sum+1];
	        dp[0][0]=1;
	        if(a[0]<sum)
                dp[0][a[0]]=1;
	        for(int i=1;i<n;i++)
	        {
	            for(int j=0;j<sum+1;j++)
	            {
	                if(j==0)
	                    dp[i][j]=1;
	                
	                dp[i][j]=dp[i-1][j];
	                if(a[i]<=j)
	                    dp[i][j]+=dp[i-1][j-a[i]];
	                    
	            }
	        }
	        System.out.println(dp[n-1][sum]);
	    }
	 }
}
