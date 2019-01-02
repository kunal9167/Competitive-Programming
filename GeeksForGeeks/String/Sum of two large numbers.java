import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc= new Scanner(System.in);
	    int t=sc.nextInt();
	    sc.nextLine();
	    while(t>0)
	    {
	        t--;
	        String s1=sc.next();
	        String s2=sc.next();
	        String s3="";
	        int c=0;
	        if(s1.length()<s2.length())
	        {
	            System.out.println(s1);
	            continue;
	        }
	        
	        for(int i=0;i<s2.length();i++)
	        {
	            int a=Integer.parseInt(s2.charAt(s2.length()-i-1)+"");
	            int b=Integer.parseInt(s1.charAt(s1.length()-i-1)+"");
	            a=a+b+c;
	            if(a>=10)
	            {
	                s3=(a%10)+s3;
	                c=1;
	            }
	            else
	            {
	                c=0;
	                s3=a+s3;
	            }
	        }
	        for(int i=s1.length()-s2.length()-1;i>=0;i--)
	        {
	            int a=Integer.parseInt(s1.charAt(i)+"");
	            a=a+c;
	            if(a>=10)
	            {
	                s3=(a%10)+s3;
	                c=1;
	            }
	            else
	            {
	                c=0;
	                s3=a+s3;
	            }
	        }
	        if(c==1)
	            s3="1"+s3;
	        if(s3.length()!=s1.length())
	           System.out.println(s1);
	        else
	           System.out.println(s3);
	    }
	   
	 }
}
