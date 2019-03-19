public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    Solution()
    {
        ans = new ArrayList<ArrayList<Integer>>();
    }
    public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
        ans.add(new ArrayList<Integer>());
        if(A.size()==0)
            return ans;
        Collections.sort(A);
        Solution(A,new ArrayList<Integer>(),0);
        return ans;
    }
    
    public void Solution(ArrayList<Integer> A, ArrayList<Integer> al, int index)
    {
        for(int i=index;i<A.size();i++)
        {
            ArrayList<Integer> al2 = (ArrayList)al.clone();
            al2.add(A.get(i));
            if(!ans.contains(al2))
                ans.add(al2);
            Solution(A,al2,i+1);
        }
    }
}
