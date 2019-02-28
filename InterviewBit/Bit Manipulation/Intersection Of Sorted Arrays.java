public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
        int l1=A.size();
        int l2=B.size();
        int i=0,j=0;
        
        ArrayList<Integer> ans = new ArrayList<Integer>(); 
        while(i<l1 && j<l2)
        {
            int n1=A.get(i);
            int n2=B.get(j);
            if(n1==n2)
            {
                ans.add(n1);
                i++;j++;
            }
            else if(n1<n2)
            {
                i++;
            }
            else
                j++;
        }
        return ans;
    }
}

