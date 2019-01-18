import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int test=scan.nextInt();
        while(test-->0){
            int n=scan.nextInt();
            jumpingNumbers(n);
        }
	}
	static void jumpingNumbers(int n){
	    System.out.print(0+" ");
	    LinkedList<Integer> queue=new LinkedList<Integer>();
	    for(int i=1;i<=9;i++)
	        queue.add(i);
    	while(!queue.isEmpty()){
	       int ele=queue.remove();
	       if(ele>n)
	            continue;
	       System.out.print(ele+" ");
	       int lastDigit=ele%10;
	       if(lastDigit>0)
	            queue.add(ele*10+(lastDigit-1));
	       if(lastDigit<9)
	           queue.add(ele*10+(lastDigit+1));
	   }
	   System.out.println();
	}
}
