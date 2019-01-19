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
	        double h=sc.nextDouble();
	        double m=sc.nextDouble();
	        double mangle=360/60*m;
	        if(m==60)
	            m=0;
	        double hangle=30.0/60.0*m+360/12*h;
	        double a1=Math.abs(hangle-mangle);
	        if(a1<(360-a1))
	            System.out.println((int)a1);
	        else
	            System.out.println((int)(360-a1));
	    }
	 }
}
