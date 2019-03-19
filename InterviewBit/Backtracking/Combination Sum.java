public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    Solution()
    {
        ans = new ArrayList<ArrayList<Integer>>();
    }
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        
        Collections.sort(A);
        Solution(new ArrayList<Integer>(),A,B,0,0);
        return ans;
    }
    public void Solution(ArrayList<Integer> al,ArrayList<Integer> A, int B,int index,int s)
    {
        
        if(s>B)
            return ;
        else if(s==B)
        {
            if(!ans.contains(al))
                ans.add(al);
        }
        for(int i=index;i<A.size();i++)
        {
            ArrayList<Integer> al2 = (ArrayList)al.clone();
            al2.add(A.get(i));
            Solution(al2,A,B,i,s+A.get(i));
        }
    }
}
