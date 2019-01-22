import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0)
	    {
	        int ax=sc.nextInt();
	        int ay=sc.nextInt();
	        int bx=sc.nextInt();
	        int by=sc.nextInt();
	        int cx=sc.nextInt();
	        int cy=sc.nextInt();
	        int dx=sc.nextInt();
	        int dy=sc.nextInt();
	        int d2=dist(ax,ay,bx,by);
	        int d3=dist(ax,ay,cx,cy);
	        int d4=dist(ax,ay,dx,dy);
	        
	        if(d2==d3 && d3==d4)
	            System.out.println("0");
	        else if(d2==d3 && 2*d2==d4 && d4==dist(bx,by,cx,cy))
	        {
	            int d=dist(bx,by,dx,dy);
	            if(d==dist(cx,cy,dx,dy) && d==d2)
	                System.out.println("1");
	        }
	        else if(d3==d4 && d2==2*d4 && d2==dist(dx,dy,cx,cy))
	        {
	            int d=dist(bx,by,dx,dy);
	            if(d==dist(cx,cy,bx,by) && d==d3)
	                System.out.println("1");
	        }
	        else if(d2==d4 && 2*d2==d3 && d3==dist(bx,by,dx,dy))
	        {
	            int d=dist(bx,by,cx,cy);
	            if(d==dist(cx,cy,dx,dy) && d==d2)
	                System.out.println("1");
	        }
	        else
	            System.out.println("0");
	    }
	 }
	 static int dist(int p1x,int p1y,int p2x,int p2y)
	 {
	     return (int)(Math.pow(p1x-p2x,2)+Math.pow(p1y-p2y,2));
	 }
}
