import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		//code
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader buf = new BufferedReader(isr);
		int t = Integer.parseInt(buf.readLine());
		while(t>0)
		{
		    String s = buf.readLine();
		    String s2="";
		    char x=s.charAt(s.length()-1);
		    if(x=='0')
		        System.out.println(s);
		    else if(x<='5')
		    {
		        for(int i=0;i<s.length()-1;i++)
		            s2+=s.charAt(i);
		        s2+='0';
		    }
		    else
		    {
		        if(s.length()==1)
		            s2="10";
		        else
		            s2=increase(s);
		    }
		    System.out.println(s2);
		    t--;
		}
		
	}
	static String increase(String s)
	{
	    String s2="0";
	    int f=0;
	    int i;
	    for(i=s.length()-2;i>=0;i--)
	    {
	        
	        char x=s.charAt(i);
	        if(i==0 && s.charAt(i)=='9')
	        {
	            s2="10"+s2;
	            
	        }
	        else if(s.charAt(i)=='9')
	        {
	            s2="0"+s2;
	        }
	        else
	        {
	            s2=(++x)+s2;
	            i--;
	            break;
	        }
	    }
	    while(i>=0)
	        s2=s.charAt(i--)+s2;
	    return s2;
	}
}
