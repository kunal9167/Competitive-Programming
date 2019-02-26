public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int res=0;
        for(int i=0;i<A.size();i++)
        {
            res=res^A.get(i);
        }
        return res;
    }
}
