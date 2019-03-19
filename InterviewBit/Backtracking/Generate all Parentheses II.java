public class Solution {
    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> ans = new ArrayList<String>();
        char str[] = new char[2*A];
        Solution(ans,A,0,str,0,0);
        return ans;
    }
    
    public void Solution(ArrayList<String> ans,int A,int pos,char str[],int open,int close)
    {
        if(close==A)
        {
            ans.add(String.valueOf(str));
        }
        else
        { 
            if(open < A) { 
                str[pos] = '('; 
                Solution(ans,A, pos+1, str, open+1, close); 
            } 
            if(open > close) { 
                str[pos] = ')'; 
                Solution(ans,A, pos+1, str, open, close+1); 
            } 
            
        }
    }
}
