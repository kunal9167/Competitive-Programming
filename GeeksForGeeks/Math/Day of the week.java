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
	        int d=sc.nextInt();
	        int m=sc.nextInt();
	        int y=sc.nextInt();
	        int s=d;
	        while(--m>0)
	        {
	           // 1 3 5 7 8 10 12
	            if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
	                s+=31;
	            else if(m==2 && leap(y))
	                s+=29;
	            else if(m==2)
	                s+=28;
	            else 
	                s+=30;
	        }
	        while(--y>=1990)
	        {
	            if(leap(y))
	                s+=366;
	            else
	                s+=365;
	        }
	        s=s%7;
	        String day="";
	        switch(s)
	        {
	            case 1:
	               day="Monday";
	               break;
	            case 2:
	               day="Tuesday";
	               break;
	            case 3:
	               day="Wednesday";
	               break;
	            case 4:
	                day="Thursday";
	                break;
	            case 5:
	                day="Friday";
	                break;
	            case 6:
	                day="Saturday";
	                break;
	            default:
	                day="Sunday";
	        }
	        System.out.println(day);
	    }
	 }
	 static boolean leap(int year)
	 {
	     if(year%400==0)
	        return true;
	     else if(year%100==0)
	        return false;
	     if(year%4==0)
	        return true;
	     else
	        return false;
	 }
}
