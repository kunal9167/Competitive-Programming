import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(calc(n,r));
        }
	 }
	 static int calc(int n,int r)
	 {
	     int c[][]=new int[n+1][r+1];
	     for(int i=1;i<=n;i++)
	     {
	         for(int j=0;j<=r;j++)
	         {
	             if(j==0 || j==i)
	                c[i][j]=1;
	            else
	                c[i][j]=(((c[i-1][j-1]%1000000007)+(c[i-1][j]%1000000007))%1000000007);
	         }
	     }
	     return c[n][r];
	 }
}
