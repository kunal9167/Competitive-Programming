public class Solution {
    // DO NOT MODIFY THE LIST
    public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
        ArrayList<Integer> range = new ArrayList<Integer>();
        int lo=0;
        int hi=a.size()-1;
        int f=0,mid=0;
        while(lo<=hi)
        {
            mid=(lo+hi)/2;
            if(a.get(mid)==b)
            {
                f=1;break;
            }
            else if(a.get(mid)<b)
            {
                lo=mid+1;
            }
            else
                hi=mid-1;
        }
        if(f==1)
        {
            range.add(lower(0,mid,a,b));
            range.add(higher(mid,a.size()-1,a,b));
        }
        else
        {
            range.add(-1);
            range.add(-1);
            
        }
        return range;
    }
    int lower(int lo,int hi,final List<Integer> a,int b)
    {
        while(lo<hi)
        {
            int mid=(lo+hi)/2;
            if(a.get(mid)<b)
                lo=mid+1;
            else
                hi=mid;
        }
        return lo;
    }
    int higher(int lo,int hi,final List<Integer> a,int b)
    {
        while(lo<hi)
        {
            // System.out.println(lo+" "+hi);
            int mid=(lo+hi)/2;
            if(a.get(mid)>b)
                hi=mid-1;
            else
            {
                if(a.get(mid+1)!=b)
                    return mid;
                lo=mid+1;
            }
        }
        return lo;
    }
}

