public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int s=0,m=Integer.MIN_VALUE;
        for(int i=0;i<A.size();i++)
        {

            // if(s<0 && A.get(i)>s)
            //     s=A.get(i);
            if(s<0)
                s=0;
            s+=A.get(i);
            if(s>m)
                m=s;
        }
        return m;
    }
}
