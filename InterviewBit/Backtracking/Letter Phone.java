public class Solution {
    ArrayList<String> ans;
    Solution(){
        ans = new ArrayList<String>();
    }
    public ArrayList<String> letterCombinations(String A) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("0"); 
        al.add("1"); 
        al.add("abc");
        al.add("def");
        al.add("ghi");
        al.add("jkl");
        al.add("mno");
        al.add("pqrs");
        al.add("tuv");
        al.add("wxyz");
        
        Solution(A,al,"",0);
        // System.out.println(al);
        return ans;
    }
    void Solution(String A, ArrayList<String> al,String s,int j)
    {
        if(s.length()==A.length())
            ans.add(s);
        if(j>=A.length())
            return ;
        String s2;
        int digit=A.charAt(j)-48;
        String curr= al.get(digit);
        for(int i=0;i<curr.length();i++)
        {
            s2=s+curr.charAt(i);
            Solution(A,al,s2,j+1);
        }
    }
}
