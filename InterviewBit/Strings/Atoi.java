public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int atoi(final String A) {
        String temp=A.trim(),B="";
        
        int neg=0,i=0;
        if(temp.charAt(0)=='-')
        {
            neg=1;i=1;
        }
        else if(temp.charAt(0)=='+')
        {
            i=1;
        }
        for(;i<temp.length();i++)
        {
            char ch=temp.charAt(i);
            if(ch>='0' && ch<='9')
            {
                B=B+ch;continue;
            }
            break;   
        }
        // System.out.println(B);
        if(B.length()==0)
            return 0;
        
        int max=Integer.MAX_VALUE;
        // System.out.println(max+1);
        if(B.length()>String.valueOf(max).length())
        {
            if(neg==1)
                return Integer.MIN_VALUE;
            return max;
        }
        else if(B.length()==String.valueOf(max).length())
        {
            if(B.compareTo(String.valueOf(max))>0)
            {
                if(neg==1)
                    return Integer.MIN_VALUE;
                return max;
            }
        }
        
        int x=Integer.parseInt(B);
        if(neg==1)
                return -1*x;
            return x;
        
        
    }
}
