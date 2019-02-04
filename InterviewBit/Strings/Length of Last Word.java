public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
        int c=0;
        String s=A.trim();
        if(s.length()==0)
            return 0;
            
        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
            if(ch==' ')
            {
                if(i+1<A.length() && A.charAt(i+1)!=' ')
                    c=0;
                continue;
            }
            c++;
        }
        return c;
    }
}

