import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int dp[][];
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    int n = sc.nextInt();
		    int p[] = new int[n];
		    dp=new int[n][n];
		    for(int i=0;i<n;i++)
		        p[i]=sc.nextInt();
		    System.out.println(matrixChainMul(p,n));
		}
	}
	static int matrixChainMul(int p[],int n)
	{
	    int dp[][]=new int[n][n];
	    for(int l=2;l<n;l++)
	    {
	        for(int i=1;i<n-l+1;i++)
	        {
	            int j=i+l-1;
	            dp[i][j]=Integer.MAX_VALUE;
	            for(int k=i;k<j;k++)
	            {
	                if(dp[i][j]>(dp[i][k]+dp[k+1][j]+p[i-1]*p[k]*p[j]))
	                {
	                    dp[i][j]=(dp[i][k]+dp[k+1][j]+p[i-1]*p[k]*p[j]);
	                }
	            }
	        }
	    }
	    return dp[1][n-1];
	}
}
