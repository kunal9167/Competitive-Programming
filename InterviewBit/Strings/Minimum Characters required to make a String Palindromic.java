public class Solution {
    public int solve(String A) {
        String s=A;
        int count=0;
        for(int i=0;i<A.length();i++)
        {
            s=A.substring(0,A.length()-i);
            // System.out.println(s);
            if(isPalindrome(s))
                return count;
            count++;
        }
        return count;
    }
    boolean isPalindrome(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}

