public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<A.size();i++)
        {
            int x=A.get(i);
            if(hm.containsKey(B-x))
            {
                al.add(hm.get(B-x)+1);
                al.add(i+1);
                return al;
            }
            else
            {
                if(!hm.containsKey(x))
                    hm.put(x,i);
            }
        }
        return al;
    }
}
