public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    Solution()
    {
        ans = new ArrayList<ArrayList<Integer>>();
    }
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        ans.add(new ArrayList<Integer>());
        if(A.size()==0)
            return ans;
        Collections.sort(A);
        answer(A,new ArrayList<Integer>(),0);
        return ans;    
    }
    
    public void answer(ArrayList<Integer> A, ArrayList<Integer> al, int index)
    {
        
        for(int i=index;i<A.size();i++)
        {
            ArrayList<Integer> al2 = (ArrayList)al.clone();
            al2.add(A.get(i));
            ans.add(al2);
            answer(A,al2,i+1);
        }
    }
}

