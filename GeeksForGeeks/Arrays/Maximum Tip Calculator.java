import java.util.*;
import java.lang.*;
import java.io.*;

class Tip{
    int A;
    int B;
    Tip()
    {
        A=0;B=0;
    }
}
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        Tip obj[]=new Tip[n];

	        for(int i=0;i<n;i++)
	        {
	            obj[i]=new Tip();
	            obj[i].A=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	            obj[i].B=sc.nextInt();
	        
	       
	        Arrays.sort(obj, new Comparator<Tip>(){
	            @Override    
	            public int compare(Tip t1,Tip t2)
	            {
	                if(Math.abs(t1.A-t1.B)>Math.abs(t2.A-t2.B))
	                    return -1;
	                return 1;
	            }
	        });
	        int tt=totalTip(obj,n,x,y);
	       
	        System.out.println(tt);
	    }
	 }
	 static int totalTip(Tip obj[],int n,int x,int y)
	 {
	     
	     int tip=0;
	        for(int i=0;i<n;i++)
	        {
	            if(obj[i].A>obj[i].B && x>0)
	            {
	                tip+=obj[i].A;
	                x--;
	            }
	            else if(y>0)
	            {
	                tip+=obj[i].B;
	                y--;
	            }
	            else
	            {
	                tip+=obj[i].A;
	                x--;
	            }
	        }
	        return tip;
	 }
}