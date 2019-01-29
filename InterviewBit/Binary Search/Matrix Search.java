public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> a, int b) {
        int n=a.size();
        int m=a.get(0).size();
        int high=n*m-1;
        int low=0;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            int r=mid/m;
            int c=mid-r*m;
            if(r<0 || c<0 || r>=n || c>=m)
                break;
            if(a.get(r).get(c)==b)
                return 1;
            else if(a.get(r).get(c)>b)
                high=mid-1;
            else
                low=mid+1;
        }
        return 0;
    }
}

