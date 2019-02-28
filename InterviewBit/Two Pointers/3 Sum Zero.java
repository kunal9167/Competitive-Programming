public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Collections.sort(A);
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>0)
                return ans;
            int l=i+1;
            int h=A.size()-1;
            while(l<h)
            {
                int s=A.get(i)+A.get(l)+A.get(h);
                if(s==0)
                {
                    ArrayList<Integer> al = new ArrayList<Integer>();
                    al.add(A.get(i));
                    al.add(A.get(l));
                    al.add(A.get(h));
                    if(!ans.contains(al))
                        ans.add(al);
                    l++;
                    h--;
                }
                else if(s>0)
                {
                    h--;
                }
                else
                    l++;
            }
        }
        return ans;
    }
}
