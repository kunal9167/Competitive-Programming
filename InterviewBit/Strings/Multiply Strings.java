public class Solution {
    public String multiply(String A, String B) {
        int a[] = new int[A.length()];
        int b[]= new int[B.length()];
        int res[] = new int[A.length()+B.length()];
        
        // int j=B.length()-1;
        for(int i=A.length()-1;i>=0;i--)
        {
            a[i]=A.charAt(i)-'0';
        }
        for(int i=B.length()-1;i>=0;i--)
        {
            b[i]=B.charAt(i)-'0';
        }
        for(int i=A.length()-1;i>=0;i--)
        {
            for(int j=B.length()-1;j>=0;j--)
            {
                res[i+j+1]+=a[i]*b[j];
            }
        }
        String ans="";
        for(int i=res.length-1;i>=0;i--)
        {
            ans=res[i]%10+ans;
            if(i>0)
                res[i-1]+=res[i]/10;
        }
        int i=0;
        while(ans.charAt(i)=='0' && i+1!=ans.length())
            i++;
        return ans.substring(i);
    }
}
