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
	    while(t-->0)
	    {
	        String s=sc.nextLine();
	        s=s.trim();
	        Scanner sc2=new Scanner(s);
	        int hard,soft;
	        hard=soft=0;
	        while(sc2.hasNext())
	        {
	            String word=sc2.next();
	           // System.out.println(word);
	            if(word=="")
	                continue;
	            int con,vow,c,v,f;
	            con=vow=c=f=0;
	            for(int i=0;i<word.length();i++)
	            {
	                char ch=word.charAt(i);
	                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U')
	                {
	                    con++;
	                    if(f==1)
	                    {
	                        c++;
	                        if(c==4)
	                        {
	                            hard++;f=-1;
	                            break;
	                        }
	                    }
	                    else
	                    {
	                        c=1;f=1;
	                    }
	                }
	                else
	                {
	                    f=0;
	                    vow++;
	                }
	            }
	            
	            if(con>vow && f!=-1)
                    hard++;
	            else if(f!=-1)
                    soft++;
	        }
	        System.out.println(5*hard+3*soft);
	    }
	 }
}