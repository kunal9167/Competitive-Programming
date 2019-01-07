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
	        int n=sc.nextInt();
	        sc.nextLine();
	        Queue<Character> q = new LinkedList<Character>();
	        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	        for(int i=0;i<n;i++)
	        {
	            
	            char ch=sc.next().charAt(0);
	            if(hm.get(ch)==null)
	            {
	                hm.put(ch,0);
	                q.add(ch);
	            }
	            else if(hm.get(ch)==0)
	            {
	                hm.put(ch,1);
	                if(q.peek()==ch)
	                {
	                    while(hm.get(q.peek())!=null && hm.get(q.peek())==1)
	                        q.remove();
	                }
	            }
                if(q.size()!=0)
                    System.out.print(q.peek()+" ");
                else
                    System.out.print("-1 ");
	        }
	        System.out.println();
	    }
	 }
}
