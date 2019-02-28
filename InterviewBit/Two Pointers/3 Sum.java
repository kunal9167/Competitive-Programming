public class Solution {
    public int threeSumClosest(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int dif=Integer.MAX_VALUE;
        // int s=A.get(0)+A.get(1)+A.get(2);
        int ans=0;
        for(int i=0;i<A.size();i++)
        {
            int l=i+1;
            int r=A.size()-1;
            while(l<r)
            {
                int s=A.get(i)+A.get(l)+A.get(r);
                if(s==B)
                    return s;
                else if(s<B)
                    l++;
                else
                    r--;
                int cdif=Math.abs(B-s);
                if(dif>cdif)
                {
                    dif=cdif;
                    ans=s;
                }
            }
        }
        return ans;
    }
}
