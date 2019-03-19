public class Solution {
    ArrayList<ArrayList<Integer>> ans;
    Solution()
    {
        ans = new ArrayList<ArrayList<Integer>>();
    }
    public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        Collections.sort(a);
        System.out.println(a);
        distinctAnswer(new ArrayList<Integer>(),a,b,0,0);
        return ans;
    }
    void distinctAnswer(ArrayList<Integer> al,ArrayList<Integer> A,int B,int index, int s)
    {
        if(s>B)
            return ;
        else if(s==B)
        {
            // if(!ans.contains(al))
            System.out.println(index);
            ans.add(al);
            return ;
        }
        for(int i=index;i<A.size();i++)
        {
            ArrayList<Integer> al2 = (ArrayList)al.clone();
            al2.add(A.get(i));
            distinctAnswer(al2,A,B,i+1,s+A.get(i));
        }
    }
}
