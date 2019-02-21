public class Solution {
    public int romanToInt(String A) {
        int l=A.length();
        int res=0;
        for(int i=0;i<l;i++)
        {
            int ch1=value(A.charAt(i));
            if(i+1<l)
            {
                int ch2=value(A.charAt(i+1));
                if(ch1>=ch2)
                    res=res+ch1;
                else
                {
                    res=res+ch2-ch1;
                    i++;
                }
            }
            else{
                res=res+ch1;
                i++;
            }
        }
        return res;
    }
    int value(char ch)
    {
        if(ch=='I')
            return 1;
        if(ch=='V')
            return 5;
        if(ch=='C')
            return 100;
        if(ch=='L')
            return 50;
        if(ch=='X')
            return 10;
        if(ch=='D')
            return 500;
        if(ch=='M')
            return 1000;
        return 0;
    }
}

