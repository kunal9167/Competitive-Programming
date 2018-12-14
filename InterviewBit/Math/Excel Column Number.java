public class Solution {
    public int titleToNumber(String A) {
        int l=A.length();
        int s=0;
        for(int i=0;i<l;i++)
        {
            int ch=A.charAt(l-i-1)-64;
            s+=(int)Math.pow(26,i)*ch;
        }
        return s;
    }
}
