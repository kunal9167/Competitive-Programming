/*package whatever //do not write package name here */

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
		    String s=sc.nextLine();
		    String s2="";
		    int f=1;
		    for(int i=0;i<s.length();i++)
		    {
		        char ch=s.charAt(i);
		        if(ch=='.' && f==1)
		        s2=s2+"0.";
		        else if(ch=='.')
		        {
		            f=1;
		            s2=s2+ch;
		        }
		        else if(ch=='0' && f==1)
		            continue;
		        else
		        {
		            f=0;
		            s2=s2+ch;
		        }
		    }
		    System.out.println(s2);
		}
	}
}
