import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    sc.nextLine();
	    while(t>0)
	    {
	        t--;
	        String s=sc.nextLine();
	        int ans=0;
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	            if(i==0)
	            {
	                ans=ch-48;
	                continue;
	            }
	            if(ch=='A')
	            {
	                i++;
	                ch=s.charAt(i);
	                ans=ans&(ch-48);
	            }
	            if(ch=='B')
	            {
	                i++;
	                ch=s.charAt(i);
	                ans=ans|(ch-48);
	            }
	            if(ch=='C')
	            {
	                i++;
	                ch=s.charAt(i);
	                ans=ans^(ch-48);
	            }
	        }
	        System.out.println(ans);
	    }
	 }
}
