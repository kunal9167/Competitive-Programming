public class Solution {
	// DO NOT MODIFY THE LIST
	public int search(final List<Integer> a, int b) {
	    int pivot=find_pivot(a,0,a.size()-1);
	   // System.out.println(pivot+"=pivot");
	    if(pivot==-1)
	        return binary_search(a,0,a.size()-1,b);
	    if(a.get(pivot)==b)
	        return pivot;
	    int x=0;
	   // if(a.get(pivot)<b)
	         x=binary_search(a,pivot+1,a.size()-1,b);
	        if(x!=-1)
	            return x;
	        else
	            return binary_search(a,0,pivot-1,b);
	}
	int binary_search(List<Integer> a,int low,int high,int key)
	{
	    if(low>high)
	        return -1;
	    int mid=(low+high)/2;
	   // System.out.println(mid+"=mid");
	    if(a.get(mid)==key)
	        return mid;
	    if(a.get(mid)>key)
	        return binary_search(a,low,mid-1,key);
	    return binary_search(a,mid+1,high,key);
	}
	int find_pivot(List<Integer> a,int low,int high)
	{
	    if(low>high)
	        return -1;
	    if(high==low)
	        return low;
	    int mid=(low+high)/2;
	    if(mid<high && a.get(mid)>a.get(mid+1))
	        return mid;
	    else if(mid>low && a.get(mid)<a.get(mid-1))
            return mid;
        if(a.get(low)>=a.get(mid))
            return find_pivot(a,low,mid-1);
        return find_pivot(a,mid+1,high);
        
	        
	}
}

