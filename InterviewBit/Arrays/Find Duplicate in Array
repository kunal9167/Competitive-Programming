// Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear 
//time using less than O(n) space and traversing the stream sequentially O(1) times.

public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> a) {
        HashMap<Integer, String> h = new HashMap<>();
        int i=0;
        for(;i<a.size();i++)
        {
            if(h.get(a.get(i))==null)
                h.put(a.get(i),"hmap");
            else
            {
                return a.get(i);
            }
        }
        return -1;
    }
}

