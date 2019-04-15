public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int diffPossible(final List<Integer> A, int B) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            int diff=B+A.get(i);
            int diff2=A.get(i)-B;
            if(hs.get(diff)==null && hs.get(diff2)==null)
            {
                hs.put(A.get(i),i);
            }
            else
                return 1;
        }
        return 0;
    }
}

