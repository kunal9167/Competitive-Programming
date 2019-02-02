public class Solution {
    public int isPalindrome(String A) {
        int i=0,j=A.length()-1;
        int k=0;
        String A2=A.toLowerCase();
        while(i<j)
        {
            char ch1=A2.charAt(i);
            char ch2=A2.charAt(j);
            if(Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2))
            {
                if(ch1!=ch2)
                    return 0;
                    i++;
                    j--;
            }
            else if(!Character.isLetterOrDigit(ch1))
            {
                i++;
            }
            else
                j--;
        }
        return 1;
    }
}

