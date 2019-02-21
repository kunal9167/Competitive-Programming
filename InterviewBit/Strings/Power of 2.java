public class Solution {
    public int power(String A) {
        if(A.equals("1") || A.charAt(0)=='-')
            return 0;
        while(!A.equals("1"))
        {
            // System.out.println(A);
            if((A.charAt(A.length()-1)-'0')%2!=0)
                return 0;
            String s2="";
            int x=0,i=0;
            if((A.charAt(0)-'0')<2)
            {
                x=A.charAt(0)-'0';
                i++;
            }
            for(;i<A.length();i++)
            {
                int ch=(A.charAt(i)-'0');
                x=x*10+ch;
                // x=x%2;
                s2=s2+(x/2);
                x=x%2;
            }
            A=s2;
        }
        return 1;
    }
}
