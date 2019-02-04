public class Solution {
    public int compareVersion(String A, String B) {
        int i=0,j=0;
        while(i<A.length() || j<B.length())
        {
            long val1=0,val2=0;
            String s1="";
            String s2="";
            int f1=0;
            while(i<A.length() && A.charAt(i)!='.' )
            {
                char ch=A.charAt(i);
                if(ch!='0')
                    f1=1;
                if(f1==1)
                    s1=s1+ch;
                i++;
            }
            f1=0;
            while(j<B.length() && B.charAt(j)!='.' )
            {
                char ch=B.charAt(j);
                if(ch!='0')
                    f1=1;
                if(f1==1)
                    s2=s2+ch;
                j++;
            }
            if(s1.length()>s2.length())
                return 1;
            else if(s1.length()< s2.length())
                return -1;
            
            if(s1.compareTo(s2)>0)
                return 1;
            else if(s1.compareTo(s2)<0)
                return -1;
            else
            {
                i++;
                j++;
                val1=0;
                val2=0;
            }
        }
        return 0;
    }
}

