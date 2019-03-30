public class Solution {
    public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        Solution(ans,A,new ArrayList<Integer>());
        return ans;
    }
    public void Solution(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> A, 
    ArrayList<Integer> al)
    {
        if(al.size()==A.size())
        {
            ans.add(al);
        }
        for(int i=0;i<A.size();i++)
        {
            ArrayList<Integer> al2 = (ArrayList)al.clone();
            if(!al.contains(A.get(i)))
            {
                al2.add(A.get(i));
                Solution(ans,A,al2);
            }
        }
    }
    
}

