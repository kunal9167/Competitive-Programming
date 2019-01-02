/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    
		    String s=sc.next();
		    HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
		    int l=0;
		    int max=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(!hs.containsKey(s.charAt(i)))
		        {
		            hs.put(s.charAt(i),i);
		            l++;
		        }
		        else{
		            i=hs.get(s.charAt(i));
		          //  System.out.println(s.charAt(i)+" "+i+" "+l);
		            
		            if(l>max)
		                max=l;
		            l=0;
		            hs.clear();
		        }
		    }
		    if(max<l)
		        max=l;
		    System.out.println(max);
		    t--;
		}
	}
}
