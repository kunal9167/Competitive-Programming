
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
		    t--;
		    String s=sc.nextLine(),s2="";
		    char ch=s.charAt(s.length()-1);
		    if(ch=='0')
		    {
		        System.out.println(s);
		        continue;
		    }
		    else if(ch<='5')
		        s2=decrement(s);
		    else
		        s2=increment(s);
		    System.out.println(s2);
            
		}
	}
	static String decrement(String s)
	{
	    String s2="0";
	    s2=s.substring(0,s.length()-1)+s2;
	    return s2;
	}
	static String increment(String s)
	{
	    String s2="0";
	    int i=s.length()-2;
	    while(i>=0)
	    {
	        char ch=(char)(s.charAt(i)+1);
	        if(ch>'9')
	            s2="0"+s2;
	        else
	            break;
	       i--;
	    }
	    if(i==-1)
	        s2="1"+s2;
	    else
	    {
    	    s2=(char)(s.charAt(i)+1)+s2;
    	    i--;
    	    s2=s.substring(0,i+1)+s2;
	    }
	    return s2;
	}
}
