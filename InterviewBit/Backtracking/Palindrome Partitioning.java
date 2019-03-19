public class Solution {
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
        Deque<String> dq = new LinkedList<String>();
        Solution(a,ans,0,dq);
        return ans;
    }
    void Solution(String a,ArrayList<ArrayList<String>> ans,int start,Deque<String> dq)
    {
        if(start==a.length())
            ans.add(new ArrayList<String>(dq));
        for(int i=start;i<a.length();i++)
        {
            if(isPalindrome(a.substring(start,i+1)))
            {
                dq.addLast(a.substring(start,i+1));
                Solution(a,ans,i+1,dq);
                dq.removeLast();
            }
        }
    }
    boolean isPalindrome(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        if(s.equals(sb.reverse().toString()))
            return true;
        return false;
    }
}
