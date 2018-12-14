public class Solution {
    public int isPalindrome(int A) {

        String s=String.valueOf(A);
        int l=s.length();
        int i;
        for(i=0;i<l/2;i++)
        {
            if(s.charAt(i)!=s.charAt(l-1-i))
                return 0;
        }
        return 1;
    }
}
