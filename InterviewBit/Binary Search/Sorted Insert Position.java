public class Solution {
    public int searchInsert(ArrayList<Integer> a, int b) {
        int lo=0;
        int hi=a.size()-1;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(a.get(mid)<b)
                lo=mid+1;
            else if(a.get(mid)>b)
                hi=mid-1;
            else
                return mid;
        }
        return lo;
    }
}
