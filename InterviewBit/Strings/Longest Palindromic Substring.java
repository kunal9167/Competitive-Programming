public class Solution {
    public String longestPalindrome(String A) {
        int n=A.length();
        boolean table[][]=new boolean[n][n];
        
        int maxlength=1;
        for(int i=0;i<n;i++)
            table[i][i]=true;
        
        int start=0;
        for(int i=0;i<n-1;i++)
        {
            if(A.charAt(i)==A.charAt(i+1))
            {
                start=i;
                maxlength=2;
                table[i][i+1]=true;
            }
        }
        
        for(int k=3;k<=n;k++)
        {
            for(int i=0;i<n-k+1;i++)
            {
                int j=i+k-1;
                if(table[i+1][j-1] && A.charAt(i)==A.charAt(j))
                {
                    table[i][j]=true;
                    if(k>maxlength)
                    {
                        start=i;
                        maxlength=k;
                    }
                }
            }
        }
        return A.substring(start,start+maxlength);
    }
}

